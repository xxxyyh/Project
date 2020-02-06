package com.threebody.useraddress.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.threebody.useraddress.entity.UserAddress;
import com.threebody.useraddress.entity.UserAddressExample;
import com.threebody.useraddress.mapper.UserAddressMapper;

@Service
@CacheConfig(cacheNames = "userAddressService")
public class UserAddressService {

	@Autowired
	private UserAddressMapper userAddressMapper;

	/**
	 * 添加收货地址信息
	 * 
	 * @param userAddress
	 */
	// 添加收货地址信息
	public void insertUserAddress(UserAddress userAddress) {
		userAddressMapper.insertSelective(userAddress);
	}

	/**
	 * 查询用户的所有收货地址
	 * 
	 * @param useraddressid
	 * @return
	 */
	public UserAddress selectAddressByUserid(Integer useraddressid) {
		return userAddressMapper.selectByPrimaryKey(useraddressid);
	}

	/**
	 * 删除UserAddress信息
	 * 
	 * @param useraddressid
	 * @return
	 */
	public boolean deleteAddress(List<Integer> useraddressid) {
		int count = 0;
		for (Integer id : useraddressid) {
			count += userAddressMapper.deleteByPrimaryKey(id) > 0 ? 1 : 0;
		}
		return count == useraddressid.size() ? true : false;
	}

	/**
	 * 选择性修改用户收货地址信息
	 * 
	 * @param userAddress
	 */
	public void updateAddressByExampleSelective(UserAddress userAddress) {
		userAddressMapper.updateByPrimaryKeySelective(userAddress);
	}

	/**
	 * 
	 * @param userExample
	 * @return
	 */
	public List<UserAddress> selectadminaddress(UserAddressExample userExample) {
		return userAddressMapper.selectByExample(userExample);
	}

}
