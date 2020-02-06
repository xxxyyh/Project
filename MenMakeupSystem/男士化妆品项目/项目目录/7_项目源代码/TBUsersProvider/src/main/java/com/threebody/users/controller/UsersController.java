package com.threebody.users.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.users.entity.Admins;
import com.threebody.users.entity.GoodsEvaluation;
import com.threebody.users.entity.Users;
import com.threebody.users.entity.UsersExample;
import com.threebody.users.service.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	/**
	 * 查询获取所有用户信息
	 * @return
	 */
	@GetMapping("/selectUsersAll")
	public List<Users> selectUsersAll(){
		return usersService.selectUsersAll();
	}
	
	/**
	 * 用户登录(通过用户账号和密码)
	 * @param users
	 * @return
	 */
	@PostMapping("/usersLogin")
	public Object usersLogin(@RequestBody Users user,HttpSession httpSession) {
		System.out.println(user);
		String account = user.getUseraccount();
		String password = user.getUserpassword();
		Admins loginAdmin = usersService.adminsLogin(account,password);
		if(loginAdmin != null) {
			//修改最近登录时间
			loginAdmin.setAdminlogintime(new Date());
			usersService.updateAdminsByExampleSelective(loginAdmin);
			return loginAdmin;
		}else {
			Users loginUser = usersService.usersLogin(user.getUseraccount(),user.getUserpassword());
			if(loginUser.getUserid() != null) {
				//修改最近登录时间
				loginUser.setUserlogintime(new Date());
				usersService.updateUsersByExampleSelective(loginUser);
				return loginUser;
			}else {
				return null;
			}
		}
	}
	
	
	/**
	 * 通过多条件模糊查询用户信息
	 * @param users
	 * @return
	 */
	@GetMapping("/selectUsersByExample")
	public PageInfo<Users> selectUsersByExample(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order") String order,
			@RequestParam("useraccount") String useraccount,@RequestParam("usertel") String usertel) {
		PageHelper.startPage(pageNum,pageSize,sort+" "+order);
		UsersExample ue = new UsersExample();
		if(useraccount != null && usertel != null) {
			ue.createCriteria()
			.andUseraccountLike("%"+useraccount+"%")
			.andUsertelLike("%"+usertel+"%");
		}else if(useraccount != null) {
			ue.createCriteria()
			.andUseraccountLike("%"+useraccount+"%");
		}else if(usertel != null) {
			ue.createCriteria()
			.andUsertelLike("%"+usertel+"%");
		}else {
			ue = null;
		}
		return  new PageInfo<Users>(usersService.selectUsersByExample(ue));
	}
	
	/**
	 * 通过多条件查询用户信息(校验注册的新用户信息是否已经存在)
	 * @param users
	 * @return
	 */
	@PostMapping("/selectUsers")
	public Boolean selectUsers(@RequestBody Users users) {
		UsersExample ue = new UsersExample();
		if(users.getUseraccount() != null) {
			ue.createCriteria()
			.andUseraccountEqualTo(users.getUseraccount());
		}else if(users.getUserpetname() != null) {
			ue.createCriteria()
			.andUserpetnameEqualTo(users.getUserpetname());
		}else if(users.getUsertel() != null) {
			ue.createCriteria()
			.andUsertelEqualTo(users.getUsertel());
		}else {
			return true;
		}
		return (usersService.selectUsersByExample(ue)).size()>0;
	}
	
	/**
	 * 选择性修改用户信息（包含修改密码）
	 * @param users
	 * @return
	 */
	@PutMapping("/updateUsers")
	public Boolean updateUsersByExampleSelective(@RequestBody Users users) {
		System.out.println(users);
		return usersService.updateUsersByExampleSelective(users) != null;
	}
	
	/**
	 * 添加用户信息（可用于用户的注册）
	 * @param users
	 * @return
	 */
	@PostMapping("/insertUsers")
	public Boolean insertUsersSelective(@RequestBody Users users) {
		
		return usersService.insertUsersSelective(users);
	}
	
	/**
	 * 批量删除用户信息
	 * @param userList
	 * @return
	 */
	@DeleteMapping("/deleteUsers")
	public boolean deleteUsers(@RequestBody List<Users> userList) {
        return usersService.deleteUsers(userList);
	}
	
	/**
	 * 用户添加商品评价信息
	 * @param goodsEvaluation
	 * @return
	 */
	@PostMapping("/insertGoodsEvaluation")
	public boolean insertGoodsEvaluationSelective(@RequestBody GoodsEvaluation goodsEvaluation) {
		return usersService.insertGoodsEvaluationSelective(goodsEvaluation);
	}
	
}
