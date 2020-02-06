package com.threebody.admins.controller;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.threebody.admins.config.UploadUtils;
import com.threebody.admins.entity.Admins;
import com.threebody.admins.entity.AdminsExample;
import com.threebody.admins.entity.Delivery;
import com.threebody.admins.entity.Goods;
import com.threebody.admins.entity.UserCollection;
import com.threebody.admins.service.AdminsService;

@RestController
public class AdminsController {
	@Autowired
	private AdminsService adminsService;
	
	
	
	/**
	 * 管理员登录(通过用户账号和密码)
	 * @param users
	 * @return
	 */
	@PostMapping("/adminsLogin")
	public boolean adminsLogin(@RequestBody Admins admins,HttpSession session) {
		List<Admins> adminList = adminsService.adminLogin(admins);
		if(adminList.size() > 0) {
			session.setAttribute("adminaccount", adminList.get(0).getAdminaccount());
			session.setAttribute("adminpetname", adminList.get(0).getAdminpetname());
			session.setAttribute("adminidentify", adminList.get(0).getAdminidentify());
			//更新登录时间
			Admins editaAdmin = new Admins();
			editaAdmin.setAdminid(adminList.get(0).getAdminid());
			editaAdmin.setAdminaccount(adminList.get(0).getAdminaccount());
			editaAdmin.setAdminlogintime(new Date());
			adminsService.updateAdminsByExampleSelective(editaAdmin);
		}
		return adminList.size() > 0;
	}


	
	
	/**
	 *	查询获取所有店家信息
	 * @param null
	 * @return List<Admins>
	 */
	@PostMapping("/selectAdminsAll")
	public List<Admins> selectAdminsAll(){
		List<Admins> ads=new ArrayList<Admins>();
		ads= adminsService.selectAdminsAll();
		return adminsService.selectAdminsAll();
	}
	
	/**
	 * 	选择性修改店家信息（包含修改密码）
	 * @param admins
	 * @return boolean
	 */
	@PutMapping("/updateAdminsByExampleSelective")
	public boolean updateAdminsByExampleSelective(@RequestBody Admins admins){
		return adminsService.updateAdminsByExampleSelective(admins);
	}
	
	/**
	 *	 添加店家信息（可用于店家的注册）
	 * @param admins
	 * @return boolean
	 */
	@PostMapping("/insertAdminsSelective")
	public boolean insertAdminsSelective(@RequestBody Admins admins ){
		
		return adminsService.insertAdminsSelective(admins);
	}
	
	
	/**
	 * 用户头像上传
	 * @param users
	 * @return
	 */
	@PostMapping("/adminIconUpload")
	public String adminIconUpload(@RequestBody MultipartFile adminicon) {
//		MsgTo msg = new MsgTo();//设置消息
        if (adminicon.isEmpty()) {
            return "上传失败，文件为空！";
        }
        //使用UUID给上传图片一个唯一的名称
        String filename = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println("UUID文件名："+filename);
        //获取文件的扩展名
      	String ext = FilenameUtils.getExtension(adminicon.getOriginalFilename());
      	//上传图片的完整名称（包含扩展名）
      	String iconname = filename+"."+ext;
      	System.out.println("完整文件名："+iconname);
      	//存入mysql的图片路径
      	String userIconPath = "images/adminicons/"+iconname;
        // 存放上传图片的文件夹
        File fileDir = UploadUtils.getImgDirFile("images/adminicons");
        // 输出文件夹绝对路径  -- 这里的绝对路径是相当于当前项目的路径而不是“容器”路径
        System.out.println(fileDir.getAbsolutePath());

        try {
            // 构建真实的文件路径
            File newFile = new File(fileDir.getAbsolutePath() + File.separator + iconname);
            System.out.println(newFile.getAbsolutePath());

            // 上传图片到 -》 “绝对路径”
            adminicon.transferTo(newFile);

//            msg.setMsg("上传成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userIconPath;
	}
	
	
	
	/**
	 * 	批量删除Admins信息
	 * @param admins
	 * @return boolean
	 */
	@DeleteMapping("/deleteAdmins")
	public boolean deleteAdmins(@RequestBody List<Admins> admins){
		return adminsService.deleteAdmins(admins);
	}
	
	
	/**
	 *	 通过多条件查询店家信息（可用于店家或者系统管理员登录）
	 * @param admins
	 * @return  List<Admins>
	 */
	@PostMapping("/selectAdminsByExample")
	public List<Admins> selectAdminsByExample(@RequestBody Admins admins){
		AdminsExample adminsxample=new AdminsExample();
		adminsxample.createCriteria();
		return adminsService.selectAdminsByExample(adminsxample);
	}
	
	
	/**  
	 * 	通过商品的编号查看商品的评价
	 * @param good
	 * @return List<Map<String,Object>>
	 */
	@PostMapping("/selectGoodsEvaluationByGoodsId")
	public List<Map<String,Object>> selectGoodsEvaluationByGoodsId(@RequestBody Goods goods ){
		return adminsService.selectGoodsEvaluationByGoodsId(goods.getGoodsid());
	}
	
	/**
	 * 	 店家确认发货，添加发货快递信息
	 * @param delivery
	 * @return boolean
	 */
	@PostMapping("/insertDelivery")
	public  boolean insertDelivery(@RequestBody Delivery delivery){
		return adminsService.insertDelivery(delivery);
	}
	
	/**
	 * 查询商品详情  包括商品的商家，商品的图片集
	 * @param goodsId
	 * @return Map<String,Object>
	 */
	@GetMapping("/selectGoodsWithPhotoandAdmin")
	public  Map<String,Object> selectGoodsWithPhotoandAdmin(@RequestParam("goodsId") Integer goodsId) {
		 Map<String,Object> good= adminsService.selectGoodsWithAdmin(goodsId);
		 List<Map<String,Object>> photos=adminsService.selectGoodsPhotos(goodsId);
		 List<String> photosList=new ArrayList<String>();
		 for(Map<String,Object> p : photos) {
			 photosList.add( (String) p.get("gphotocode"));
		 }
		 good.put("gphotocode",  photosList);
		 return good;
	}
	
	
	
	
	 //以下三个是用户收藏表的增删查改
	@PostMapping("/selectCollection")
    public boolean selectCollection(@RequestBody UserCollection userCollection){
    	return adminsService.selectCollection(userCollection)!=null?true:false;
    }
    
	@PostMapping("/deleteCollection")
    public boolean deleteCollection(@RequestBody UserCollection userCollection) {
    	return adminsService.deleteCollection(userCollection)>0?true:false;
    }
    
	@PostMapping("/insertCollection")
    public boolean insertCollcetion(@RequestBody UserCollection userCollection) {
    	return adminsService.insertCollcetion(userCollection)>0?true:false;
    }
	
	@PostMapping("/deleteCollections")
	 public boolean deleteCollections(@RequestBody List<UserCollection>  userCollections) {
		adminsService.deleteCollections(userCollections);
   	return true;
   }
	/**
	 * 查询店家的商品销售数量
	 * @return
	 */
	@GetMapping("/selectSalesAmount")
	public List<Map<String,Object>> selectSalesAmount( ) {
    	return adminsService.selectSalesAmount();
    } 
	
	
	
}
