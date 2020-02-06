package com.threebody.useraddress.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.threebody.useraddress.entity.JsonResult;
import com.threebody.useraddress.entity.UserAddress;
import com.threebody.useraddress.myfeigninterface.MyFeignInterface;

@RestController
@CrossOrigin
public class UserAddressController {

	@Resource
	private MyFeignInterface myFeignInterface;

	@PostMapping("/insertUserAddress")
	public JsonResult<Boolean> testgetuser1(@RequestBody UserAddress userAddress) {
		return new JsonResult<>(myFeignInterface.getUaFromProvider(userAddress));
	}

	@GetMapping("/selectAddressByUserids")
	public JsonResult<UserAddress> testgetuser(@RequestParam("useraddressid") Integer useraddressid) {
		return new JsonResult<>(myFeignInterface.getUaFromProvider2(useraddressid));
	}

	@DeleteMapping("/deleteAddress")
	public JsonResult<Boolean> testgetuser3(@RequestParam("useraddressid[]") List<Integer> useraddressid) {
		return new JsonResult<>(myFeignInterface.getUaFromProvider3(useraddressid));
	}

	@PutMapping("/updateAddressByExampleSelective")
	public JsonResult<Boolean> testgetuser4(@RequestBody UserAddress userAddress) {
		return new JsonResult<>(myFeignInterface.getUaFromProvider4(userAddress));
	}

	@GetMapping("/selectAddressByUserid")
	public JsonResult<UserAddress> testgetuser5(@RequestParam("userid") Integer userid) {
		return new JsonResult<>(myFeignInterface.getUaFromProvider5(userid));
	}

}
