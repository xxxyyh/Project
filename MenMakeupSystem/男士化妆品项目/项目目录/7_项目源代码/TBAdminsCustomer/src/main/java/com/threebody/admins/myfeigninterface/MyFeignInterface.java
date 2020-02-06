package com.threebody.admins.myfeigninterface;


import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.threebody.admins.entity.Admins;
import com.threebody.admins.entity.Delivery;
import com.threebody.admins.entity.Goods;
import com.threebody.admins.entity.UserCollection;
import com.threebody.admins.feigninterfaceimpl.MyHystrixFeignImpl;
//填入的是你要链接的服务提供者的id,fallback是断路器的回调方法
@FeignClient(value="EUREKA-CLIENT-PROVIDER-ADMINS",fallback =MyHystrixFeignImpl.class)
public interface MyFeignInterface {

	/**
	 * 管理员登录(通过用户账号和密码)
	 * @param Admins
	 * @return
	 */
	@PostMapping("/adminsLogin")
	public boolean adminsLogin(@RequestBody Admins admins) ;
	
	
	
	/**
	 * 用户头像上传
	 * @param users
	 * @return
	 */
	@PostMapping("/adminIconUpload")
	public String adminIconUpload(@RequestBody MultipartFile adminicon);
	
	
	/**
	 *	查询获取所有店家信息
	 * @param null
	 * @return List<Admins>
	 */
	@PostMapping("/selectAdminsAll")
	public List<Admins> selectAdminsAll();
	
	/**
	 * 	选择性修改店家信息（包含修改密码）
	 * @param admins
	 * @return boolean
	 */
	@PutMapping("/updateAdminsByExampleSelective")
	public boolean updateAdminsByExampleSelective(@RequestBody Admins admins);
	
	/**
	 *	 添加店家信息（可用于店家的注册）
	 * @param admins
	 * @return boolean
	 */
	@PostMapping("/insertAdminsSelective")
	public boolean insertAdminsSelective(@RequestBody Admins admins );
	/**
	 * 	批量删除Admins信息
	 * @param admins
	 * @return boolean
	 */
	@DeleteMapping("/deleteAdmins")
	public boolean deleteAdmins(@RequestParam List<Admins> admins);
	
	
	/**
	 *	 通过多条件查询店家信息（可用于店家或者系统管理员登录）
	 * @param admins
	 * @return  List<Admins>
	 */
	@GetMapping("/selectAdminsByExample")
	public List<Admins> selectAdminsByExample(@RequestBody Admins admins);
	 
	/**
	 * 	通过商品的编号查看商品的评价
	 * @param good
	 * @return List<Map<String,Object>>
	 */
	@GetMapping("/selectGoodsEvaluationByGoodsId")
	public List<Map<String,Object>> selectGoodsEvaluationByGoodsId(@RequestBody Goods goods);
	
	/**
	 * 	 店家确认发货，添加发货快递信息
	 * @param delivery
	 * @return boolean
	 */
	@PostMapping("/insertDelivery")
	public  boolean insertDelivery(@RequestBody Delivery delivery);
	
	
	/**
	 * 查询商品，包括商家信息，图片集
	 * @param goodsId
	 * @return
	 */
	@GetMapping("/selectGoodsWithPhotoandAdmin")
	public Map<String,Object> selectGoodsWithPhotoandAdmin(@RequestParam("goodsId") Integer goodsId);
	
	
	
	 //以下三个是用户收藏表的增删查改
		@PostMapping("/selectCollection")
	    public boolean selectCollection(@RequestBody UserCollection userCollection);
	    
		@PostMapping("/deleteCollection")
	    public boolean deleteCollection(@RequestBody UserCollection userCollection);
	    
		@PostMapping("/insertCollection")
	    public boolean insertCollcetion(@RequestBody UserCollection userCollection);
		
		@PostMapping("/deleteCollections")
		public boolean deleteCollections(@RequestBody List<UserCollection> userCollection);
		
		
		/**
		 * 查询店家的商品销售数量
		 * @return
		 */
		@GetMapping("/selectSalesAmount")
		public List<Map<String,Object>> selectSalesAmount( ) ;
	
}
