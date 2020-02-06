package com.threebody.admins.controller;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.admins.entity.Admins;
import com.threebody.admins.entity.Delivery;
import com.threebody.admins.entity.Goods;
import com.threebody.admins.entity.JsonResult;
import com.threebody.admins.entity.UserCollection;
import com.threebody.admins.myfeigninterface.MyFeignInterface;

@RestController
@CrossOrigin 
public class MyController {
	@Resource
	private MyFeignInterface myFeignInterface;
	/**
	 * 
	 * @param adminsS
	 * @return  JsonResult<Admins>(message)
	 */
	
	@PostMapping("/adminsLogin")
	public JsonResult<Admins> adminsLogin(@RequestBody Admins admins) {
	
		String message;
		boolean trueOrFalse=myFeignInterface.adminsLogin(admins);
		if(trueOrFalse) {
			message="success";
		}else{
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	

	/**
	 *	查询获取所有店家信息
	 * @param null
	 * @return JsonResult<Admins>(List<Admins>);
	 */
	@PostMapping("/selectAdminsAll")
	public JsonResult<Admins> selectAdminsAll(int pageSize, int pageNum,String sort,String order){
		   
		/**
		 * int pageSize 	每页数量
		 * int pageNum	当前页
		 * String sort   	排序的字段
		 * String order 	排序的方式
		 */
		
		PageHelper.startPage(pageNum, pageSize, sort + " " + order); 
		return new JsonResult<Admins>(new PageInfo<Admins>(myFeignInterface.selectAdminsAll()));
	}
	
	
	/**
	 * 用户头像上传
	 * @param users
	 * @return
	 */
	@PostMapping("/adminIconUpload")
	public JsonResult<Admins> adminIconUpload(@RequestBody MultipartFile adminicon) {
		return new JsonResult<Admins>(myFeignInterface.adminIconUpload(adminicon));
	}
	
	
	/**
	 * 	选择性修改店家信息（包含修改密码）
	 * @param admins
	 * @return JsonResult<Admins>(message)
	 */
	@PutMapping("/updateAdminsByExampleSelective")
	public JsonResult<Admins> updateAdminsByExampleSelective(@RequestBody Admins admins) {
		String message;
		boolean trueOrFalse =myFeignInterface.updateAdminsByExampleSelective(admins);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	
	

	/**
	 *	 添加店家信息（可用于店家的注册）
	 * @param admins
	 * @return JsonResult<Admins>(message);
	 */
	@PostMapping("/insertAdminsSelective")
	public  JsonResult<Admins> insertAdminsSelective(@RequestBody Admins admins ) {
		String message;
		boolean trueOrFalse =myFeignInterface.insertAdminsSelective(admins);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	
	
	/**
	 * 	批量删除Admins信息
	 * @param admins
	 * @return JsonResult<Admins>(message);
	 */
	@DeleteMapping("/deleteAdmins")
	public JsonResult<Admins> deleteAdmins(@RequestBody List<Admins> admins){
		String message;
		boolean trueOrFalse =myFeignInterface.deleteAdmins(admins);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	
	
	
	
	/**
	 *	 通过多条件查询店家信息（可用于店家或者系统管理员登录）
	 * @param admins
	 * @return  JsonResult<Admins>(List<Admins>)
	 */
	@PostMapping("/selectAdminsByExample")
	public JsonResult<Admins> selectAdminsByExample(@RequestBody Admins admins){
		return new JsonResult<Admins>(myFeignInterface.selectAdminsByExample(admins));
		
	}
	
	/**
	 * 	通过商品的编号查看商品的评价
	 * @param good
	 * @return List<Map<String,Object>>
	 */
	@PostMapping("/selectGoodsEvaluationByGoodsId")
	public JsonResult<Map<String,Object>> selectGoodsEvaluationByGoodsId(@RequestBody Goods goods){
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectGoodsEvaluationByGoodsId(goods));
	}
	
	/**
	 * 	 店家确认发货，添加发货快递信息
	 * @param delivery
	 * @return JsonResult<Admins>(message);
	 */
	@PostMapping("/insertDelivery")
	public  JsonResult<Admins> insertDelivery(@RequestBody Delivery delivery) {
		String message;
		boolean trueOrFalse =myFeignInterface.insertDelivery(delivery);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	
	
	/**
	 * 查询商品，包括商家信息，图片集
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/selectGoodsWithPhotoandAdmin")
	public JsonResult<Map<String,Object>> selectGoodsWithPhotoandAdmin(@RequestParam("goodsId") Integer goodsId){
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectGoodsWithPhotoandAdmin(goodsId));
	}
	
	
	
	 //以下三个是用户收藏表的增删查改
	@PostMapping("/selectCollection")
    public JsonResult<Admins> selectCollection(@RequestBody UserCollection userCollection) {
		String message;
		boolean trueOrFalse =myFeignInterface.selectCollection(userCollection);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
    
	@PostMapping("/deleteCollection")
    public JsonResult<Admins> deleteCollection(@RequestBody UserCollection userCollection) {
		String message;
		boolean trueOrFalse =myFeignInterface.deleteCollection(userCollection);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
		
	}
    
	@PostMapping("/insertCollection")
    public JsonResult<Admins> insertCollection(@RequestBody UserCollection userCollection) {
		
		String message;
		boolean trueOrFalse =myFeignInterface.insertCollcetion(userCollection);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	
	
	
	
	@PostMapping("/deleteCollections")
    public JsonResult<Admins> deleteCollections(@RequestBody List<UserCollection> userCollection) {
		String message;
		boolean trueOrFalse =myFeignInterface.deleteCollections(userCollection);
		if(trueOrFalse) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<Admins>(message);
	}
	
	
	/**
	 * 查询店家的商品销售数量
	 * @return
	 */
	@GetMapping("/selectSalesAmount")
	public JsonResult<Map<String,Object>> selectSalesAmount( ) {
    	return new JsonResult<Map<String,Object>>( myFeignInterface.selectSalesAmount());
    } 
	
}
