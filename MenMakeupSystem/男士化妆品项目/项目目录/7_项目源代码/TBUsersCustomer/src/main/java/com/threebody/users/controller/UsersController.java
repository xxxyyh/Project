package com.threebody.users.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.users.config.UploadUtils;
import com.threebody.users.entity.GoodsEvaluation;
import com.threebody.users.entity.JsonResult;
import com.threebody.users.entity.Users;
import com.threebody.users.myfeigninterface.MyFeignInterface;

@RestController
@CrossOrigin
public class UsersController {
	@Autowired
	private MyFeignInterface myFeignInterface;
	
	/**
	 * 查询获取所有用户信息，返回分页信息
	 * @return
	 */
	@GetMapping("/selectUsersAll")
	public JsonResult<Users> selectUsersAll(){
		System.out.println("userlist size:"+myFeignInterface.selectUsersAll());
		return new JsonResult<Users>(myFeignInterface.selectUsersAll());
	}
	
	/**
	 * 选择性修改用户信息（包含修改密码）
	 * @param users
	 * @return
	 */
	@PutMapping("/updateUsers")
	public JsonResult<Boolean> updateUsersByExampleSelective(@RequestBody Users users) {
		return new JsonResult<>(myFeignInterface.updateUsersByExampleSelective(users));
	}
	
	/**
	 * 添加用户信息（可用于用户的注册）
	 * @param users
	 * @return
	 */
	@PostMapping("/insertUsers")
	public JsonResult<Boolean> insertUsersSelective(@RequestBody Users users){
		return new JsonResult<>(myFeignInterface.insertUsersSelective(users));
	}
	
	/**
	 * 批量删除用户Users信息
	 * @param useridList
	 * @return
	 */
	@DeleteMapping("/deleteUsers")
	public JsonResult<Boolean> deleteUsers(@RequestBody List<Users> userList) {
		return new JsonResult<>(myFeignInterface.deleteUsers(userList));
	}
	
	/**
	 * 用户登录(通过用户账号和密码)
	 * @param users
	 * @return
	 */
	@PostMapping("/usersLogin")
	public JsonResult<Object> usersLogin(@RequestBody Users user) {
		System.out.println("useraccount--->"+user.getUseraccount());
		Object result = myFeignInterface.usersLogin(user);
		System.out.println(result);
		return new JsonResult<>(result);
	}
	
	/**
	 * 通过多条件模糊查询用户信息
	 * @param users
	 * @return
	 */
//	@GetMapping("/selectUsersByExample")
//	public JsonResult<Users> selectUsersByExample(int pageSize,int pageNum,String sort,
//			String order,String useraccount,String usertel){
//		System.out.println("pageNum===>"+pageNum);
//		System.out.println("pageSize===>"+pageSize);
//		System.out.println("sort===>"+sort);
//		System.out.println("order===>"+order);
//		PageHelper.startPage(pageNum,pageSize,sort+" "+order);
//		return new JsonResult<Users>(new PageInfo<Users>(myFeignInterface.selectUsersByExample(useraccount,usertel)));
//	}
	@GetMapping("/selectUsersByExample")
	public JsonResult<Users> selectUsersByExample(int pageSize,int pageNum,String sort,
			String order,String useraccount,String usertel){
		System.out.println("pageNum===>"+pageNum);
		System.out.println("pageSize===>"+pageSize);
		System.out.println("sort===>"+sort);
		System.out.println("order===>"+order);
		return new JsonResult<Users>(myFeignInterface.selectUsersByExample(pageSize,pageNum,sort,order,useraccount,usertel));
	}
	
	/**
	 * 通过多条件查询用户信息
	 * @param users
	 * @return
	 */
	@PostMapping("/selectUsers")
	public JsonResult<Boolean> selectUsers(@RequestBody Users users){
		System.out.println("useraccount--->"+users.getUseraccount());
		return new JsonResult<>(myFeignInterface.selectUsers(users));
	}
	
	/**
	 * 用户添加商品评价信息
	 * @param goodsEvaluation
	 * @return
	 */
	@PostMapping("insertGoodsEvaluation")
	public JsonResult<Boolean> insertGoodsEvaluation(@RequestBody GoodsEvaluation goodsEvaluation) {
		return new JsonResult<>(myFeignInterface.insertGoodsEvaluation(goodsEvaluation));
	}
	
	/**
	 * 用户头像上传
	 * @param users
	 * @return
	 */
	@PostMapping("/userIconUpload")
	public JsonResult<String> userIconUpload(@RequestBody MultipartFile usericon) {
		
        if (usericon.isEmpty()) {
            return new JsonResult<>("上传失败，文件为空！");
        }

        //使用UUID给上传图片一个唯一的名称
        String filename = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println("UUID文件名："+filename);
        //获取文件的扩展名
      	String ext = FilenameUtils.getExtension(usericon.getOriginalFilename());
      	//上传图片的完整名称（包含扩展名）
      	String iconname = filename+"."+ext;
      	System.out.println("完整文件名："+iconname);
      	//存入mysql的图片路径
      	String userIconPath = "images/usericons/"+iconname;
        // 存放上传图片的文件夹
        File fileDir = UploadUtils.getImgDirFile("images/usericons");
        // 输出文件夹绝对路径  -- 这里的绝对路径是相当于当前项目的路径而不是“容器”路径
        System.out.println(fileDir.getAbsolutePath());

        try {
            // 构建真实的文件路径
            File newFile = new File(fileDir.getAbsolutePath() + File.separator + iconname);
            System.out.println(newFile.getAbsolutePath());

            // 上传图片到 -》 “绝对路径”
            usericon.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonResult<>(userIconPath);
	}

}
