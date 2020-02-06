package com.threebody.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.threebody.users.entity.Admins;
import com.threebody.users.entity.AdminsExample;
import com.threebody.users.entity.GoodsEvaluation;
import com.threebody.users.entity.Users;
import com.threebody.users.entity.UsersExample;
import com.threebody.users.mapper.AdminsMapper;
import com.threebody.users.mapper.GoodsEvaluationMapper;
import com.threebody.users.mapper.LoginMapper;
import com.threebody.users.mapper.UsersMapper;

@Service
@CacheConfig(cacheNames="usersService")
public class UsersService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private AdminsMapper adminsMapper;
	@Autowired
	private LoginMapper loginMapper;
	@Autowired
	private GoodsEvaluationMapper goodsEvaluationMapper;
	
	/**
	 * 查询获取所有用户信息
	 * @return
	 */
	public List<Users> selectUsersAll(){
		return usersMapper.selectByExample(null);
	}
	
	/**
	 * 用户登录(通过用户账号和密码)
	 * @param users
	 * @return
	 */
	@Cacheable(key="#p0")
	public Users usersLogin(String useraccount,String userpassword) {
		return loginMapper.userLogin(useraccount, userpassword);
	}
	
	/**
	 * 管理员登录(包含：商家和系统管理员)
	 * @param users
	 * @return
	 */
//	@Cacheable(key="#p0")
	public Admins adminsLogin(String useraccount,String userpassword) {
		AdminsExample ae = new AdminsExample();
		ae.createCriteria()
			.andAdminaccountEqualTo(useraccount)
			.andAdminpasswordEqualTo(userpassword);
		List<Admins> adminsList = adminsMapper.selectByExample(ae);
		if(adminsList.size()>0) {
			return adminsList.get(0);
		}else {
			return null;
		}
	}
	
	/**
	 * 通过多条件查询用户信息
	 * @param users
	 * @return
	 */
	public List<Users> selectUsersByExample(UsersExample ue) {
		return usersMapper.selectByExample(ue);
	}
	
	/**
	 * 选择性修改用户信息（包含修改密码）
	 * @param users
	 * @return
	 */
	@CachePut(key="#p0.useraccount")
	public Users updateUsersByExampleSelective(Users users) {
		if(usersMapper.updateByPrimaryKeySelective(users)>0) {
			return usersMapper.selectByPrimaryKey(users.getUserid());
		}
		return null;
	}
	
	/**
	 * 修改管理员的登录时间
	 * @param users
	 * @return
	 */
//	@CachePut(key="#p0.adminaccount")
	public Admins updateAdminsByExampleSelective(Admins admins) {
		if(adminsMapper.updateByPrimaryKeySelective(admins)>0) {
			return adminsMapper.selectByPrimaryKey(admins.getAdminid());
		}
		return null;
	}
	
	/**
	 * 添加用户信息（可用于用户的注册）
	 * @param users
	 * @return
	 */
	public boolean insertUsersSelective(Users users) {
		return usersMapper.insertSelective(users)>0;
	}
	
	/**
	 * 批量删除用户信息
	 * @param userList
	 * @return
	 */
	public boolean deleteUsers(List<Users> userList) {
		List<Integer> userIdList = new ArrayList<Integer>();
        for(Users user : userList) {
            userIdList.add(user.getUserid());
        }
        UsersExample ue = new UsersExample();
        ue.createCriteria().andUseridIn(userIdList);
        return usersMapper.deleteByExample(ue)==userIdList.size();
	}
	
	/**
	 * 用户添加商品评价信息
	 * @param goodsEvaluation
	 * @return
	 */
	public boolean insertGoodsEvaluationSelective(GoodsEvaluation goodsEvaluation) {
		return goodsEvaluationMapper.insertSelective(goodsEvaluation)>0;
	}
}
