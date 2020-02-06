package com.threebody.useraddress.myfeigninterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.threebody.useraddress.entity.UserAddress;
import com.threebody.useraddress.feigninterfaceimpl.MyHystrixFeignImpl;

//填入的是你要链接的服务提供者的id,fallback是断路器的回调方法
@FeignClient(value = "eureka-client-provider-useraddress", fallback = MyHystrixFeignImpl.class)
public interface MyFeignInterface {

	@PostMapping("/insertUserAddress")
	Boolean getUaFromProvider(@RequestBody UserAddress userAddress);

	@GetMapping("/selectAddressByUserids")
	List<UserAddress> getUaFromProvider2(@RequestParam("useraddressid") Integer useraddressid);

	@DeleteMapping("/deleteAddress")
	Boolean getUaFromProvider3(@RequestParam("useraddressid") List<Integer> useraddressid);

	@PutMapping("/updateAddressByExampleSelective")
	Boolean getUaFromProvider4(@RequestBody UserAddress userAddress);

	@GetMapping("/selectAddressByUserid")
	List<UserAddress> getUaFromProvider5(@RequestParam("userid") Integer userid);

}
