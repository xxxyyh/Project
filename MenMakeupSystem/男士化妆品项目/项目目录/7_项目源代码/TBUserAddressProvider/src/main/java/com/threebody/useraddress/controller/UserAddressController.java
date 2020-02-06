package com.threebody.useraddress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.threebody.useraddress.entity.UserAddress;
import com.threebody.useraddress.entity.UserAddressExample;
import com.threebody.useraddress.service.UserAddressService;

@RestController
public class UserAddressController {

	@Value(value = "${server.port}")
	private String port;

	@Autowired
	private UserAddressService userAddressService;

	/**
	 * 添加收货地址信息
	 * 
	 * @param userAddress
	 * @return
	 */
	@PostMapping("/insertUserAddress")
	public Boolean insertUserAddress(@RequestBody UserAddress userAddress) {
		if (userAddress != null) {
			userAddressService.insertUserAddress(userAddress);
			return true;
		}
		return false;
	}

	/**
	 * 查询用户的所有收货地址
	 * 
	 * @param useraddressid
	 * @return
	 */
	@GetMapping("/selectAddressByUserids")
	public UserAddress selectAddressByUserids(@RequestParam("useraddressid") Integer useraddressid) {
		UserAddress userad = userAddressService.selectAddressByUserid(useraddressid);
		return userad;
	}

	/**
	 * 批量删除UserAddress信息
	 * 
	 * @param useraddressid
	 * @return
	 */
	@DeleteMapping("/deleteAddress")
	public Boolean deleteAddress(@RequestParam("useraddressid") List<Integer> useraddressid) {
		return userAddressService.deleteAddress(useraddressid);
	}

	/**
	 * 选择性修改用户收货地址信
	 * 
	 * @param userAddress
	 * @return
	 */
	@PutMapping("/updateAddressByExampleSelective")
	public Boolean updateAddressByExampleSelective(@RequestBody UserAddress userAddress) {
		if (userAddress != null) {
			userAddressService.updateAddressByExampleSelective(userAddress);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 查询用户的所有收货地址
	 * 
	 * @param userid
	 * @return
	 */
	@GetMapping("/selectAddressByUserid")
	public List<UserAddress> selectAddressByUserid(@RequestParam("userid") Integer userid) {
		UserAddressExample ue = new UserAddressExample();
		ue.createCriteria().andUseridEqualTo(userid);
		return userAddressService.selectadminaddress(ue);
	}
}
