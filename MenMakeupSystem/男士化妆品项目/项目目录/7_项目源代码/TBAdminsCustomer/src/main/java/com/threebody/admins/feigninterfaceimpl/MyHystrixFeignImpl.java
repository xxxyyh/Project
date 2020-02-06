package com.threebody.admins.feigninterfaceimpl;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.threebody.admins.entity.Admins;
import com.threebody.admins.entity.Delivery;
import com.threebody.admins.entity.Goods;
import com.threebody.admins.entity.UserCollection;
import com.threebody.admins.myfeigninterface.MyFeignInterface;
@Component
public class MyHystrixFeignImpl implements MyFeignInterface {

	@Override
	public List<Admins> selectAdminsAll() {
		// TODO Auto-generated method stub
		System.out.println("断了");
		return null;
	}

	@Override
	public boolean updateAdminsByExampleSelective(Admins admins) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertAdminsSelective(Admins admins) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmins(List<Admins> admins) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Admins> selectAdminsByExample(Admins admins) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectGoodsEvaluationByGoodsId(Goods good) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adminsLogin(Admins admins) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String adminIconUpload(MultipartFile adminicon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> selectGoodsWithPhotoandAdmin(Integer goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selectCollection(UserCollection userCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCollection(UserCollection userCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertCollcetion(UserCollection userCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCollections(List<UserCollection> userCollection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map<String, Object>> selectSalesAmount() {
		// TODO Auto-generated method stub
		return null;
	}

}
