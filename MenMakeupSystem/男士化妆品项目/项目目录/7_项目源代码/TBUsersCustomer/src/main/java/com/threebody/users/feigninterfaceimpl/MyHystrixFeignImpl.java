package com.threebody.users.feigninterfaceimpl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageInfo;
import com.threebody.users.entity.GoodsEvaluation;
import com.threebody.users.entity.Users;
import com.threebody.users.myfeigninterface.MyFeignInterface;
@Component
public class MyHystrixFeignImpl implements MyFeignInterface {

	@Override
	public List<Users> selectUsersAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUsersByExampleSelective(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertUsersSelective(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUsers(List<Users> userList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object usersLogin(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Users> selectUsersByExample(int pageSize, int pageNum, String sort, String order,
			String useraccount, String usertel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean selectUsers(Users users) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertGoodsEvaluation(GoodsEvaluation goodsEvaluation) {
		// TODO Auto-generated method stub
		return null;
	}

}
