package com.threebody.users.mapper;

import org.apache.ibatis.annotations.Param;

import com.threebody.users.entity.Users;

public interface LoginMapper {
	
	Users userLogin(@Param("useraccount") String useraccount,@Param("userpassword") String userpassword);

}
