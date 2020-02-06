package com.threebody.users.myfeigninterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.threebody.users.entity.GoodsEvaluation;
import com.threebody.users.entity.Users;
import com.threebody.users.feigninterfaceimpl.MyHystrixFeignImpl;
//填入的是你要链接的服务提供者的id,fallback是断路器的回调方法
@FeignClient(value="eureka-client-provider-users",fallback =MyHystrixFeignImpl.class)
public interface MyFeignInterface {

	/**
	 * 查询获取所有用户信息
	 * @return
	 */
	@GetMapping("/selectUsersAll")
	public List<Users> selectUsersAll();
	
	/**
	 * 选择性修改用户信息（包含修改密码）
	 * @param users
	 * @return
	 */
	@PutMapping("/updateUsers")
	public Boolean updateUsersByExampleSelective(@RequestBody Users users);
	
	/**
	 * 添加用户信息（可用于用户的注册）
	 * @param users
	 * @return
	 */
	@PostMapping("/insertUsers")
	public Boolean insertUsersSelective(@RequestBody Users users);
	
	/**
	 * 批量删除用户Users信息
	 * @param useridList
	 * @return
	 */
	@DeleteMapping("/deleteUsers")
	public Boolean deleteUsers(@RequestBody List<Users> userList);
	
	/**
	 * 用户登录(通过用户账号和密码)
	 * @param users
	 * @return
	 */
	@PostMapping("/usersLogin")
	public Object usersLogin(@RequestBody Users user);
	
	/**
	 * 通过多条件模糊查询用户信息
	 * @param users
	 * @return
	 */
	@GetMapping("/selectUsersByExample")
	public PageInfo<Users> selectUsersByExample(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order") String order,
			@RequestParam("useraccount") String useraccount,@RequestParam("usertel") String usertel);
	
	/**
	 * 通过多条件查询用户信息(校验注册的新用户信息是否已经存在)
	 * @param users
	 * @return
	 */
	@PostMapping("/selectUsers")
	public Boolean selectUsers(@RequestBody Users users);
	
	/**
	 * 用户添加商品评价信息
	 * @param goodsEvaluation
	 * @return
	 */
	@PostMapping("insertGoodsEvaluation")
	public Boolean insertGoodsEvaluation(@RequestBody GoodsEvaluation goodsEvaluation);
	
}
