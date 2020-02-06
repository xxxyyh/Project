package com.threebody.admins.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.threebody.admins.entity.Admins;
import com.threebody.admins.entity.AdminsExample;
import com.threebody.admins.entity.Delivery;
import com.threebody.admins.entity.GoodsEvaluation;
import com.threebody.admins.entity.GoodsEvaluationExample;
import com.threebody.admins.entity.UserCollection;
import com.threebody.admins.mapper.AdminsMapper;
import com.threebody.admins.mapper.DeliveryMapper;
import com.threebody.admins.mapper.GoodsEvaluationInfoMapper;
import com.threebody.admins.mapper.GoodsEvaluationMapper;

@Service
@CacheConfig(cacheNames="adminsService")
public class AdminsService {

	@Autowired
	private AdminsMapper adminsMapper;
	
	@Autowired
	private DeliveryMapper deliveryMapper;

	
	@Autowired
	private GoodsEvaluationInfoMapper goodsEvaluationInfoMapper;
	
	
	/**
	 * 管理员登录(通过用户账号和密码)
	 * @param Admins
	 * @return
	 */
	/* @Cacheable(key="#p0.adminaccount") */
	public List<Admins> adminLogin(Admins admins) {
		AdminsExample ae = new AdminsExample();
		ae.createCriteria()
		.andAdminaccountEqualTo(admins.getAdminaccount())
		.andAdminpasswordEqualTo(admins.getAdminpassword());
		List<Admins> adminList = adminsMapper.selectByExample(ae);
		return adminList;
	}
	
	 //查询获取所有店家信息（多表）
	  public List<Admins> selectAdminsAll(){
	  return adminsMapper.selectByExample(null); 
	  }
	 
	
	//选择性修改店家信息（包含修改密码）
	public  boolean updateAdminsByExampleSelective(Admins  admins  ) {
		return adminsMapper.updateByPrimaryKeySelective(admins)>0?true:false;
	}
	
	//添加店家信息（可用于店家的注册）
	public boolean insertAdminsSelective(Admins admins) {
		return adminsMapper.insertSelective(admins)>0?true:false;
	}
	
	//批量删除Admins信息
	public boolean deleteAdmins(List<Admins> admins) {
		List<Integer> ins=new ArrayList<Integer>();
		for(Admins a: admins) {
			ins.add(a.getAdminid());
		}
		AdminsExample adminsExample =new AdminsExample();
		adminsExample.createCriteria().andAdminidIn(ins);	
		return adminsMapper.deleteByExample(adminsExample)==ins.size();
	}
	
	//通过多条件查询店家信息（可用于店家或者系统管理员登录）
	public List<Admins> selectAdminsByExample(AdminsExample adminsxample){
		return adminsMapper.selectByExample(adminsxample);
	}
	
	
	//通过商品的编号查看商品的评价
	public List<Map<String,Object>> selectGoodsEvaluationByGoodsId(Integer goodsid){
		return goodsEvaluationInfoMapper.selectGoodsEvaluationInfo(goodsid);
	}
	
	
	//店家确认发货，添加发货快递信息
	public boolean insertDelivery(Delivery delivery) {
		return deliveryMapper.insert(delivery)>0?true:false;
	}
	
	
	//查询商品以及商家信息
	public  Map<String,Object> selectGoodsWithAdmin(Integer goodsId){
		return adminsMapper.selectGoodsWithAdmin(goodsId);
	}
	
	
	//查询商品图片(多张)
	public List<Map<String,Object>> selectGoodsPhotos(Integer goodsId){
		return adminsMapper.selectGoodsPhotos(goodsId);
	}
	
	
	
	 //以下是用户收藏表的增删查改
	
	
	
	//查询收藏商品
    public  UserCollection selectCollection(UserCollection userCollection){
    	return adminsMapper.selectCollection(userCollection);
    }
    
    //删除单个商品
    public int deleteCollection(UserCollection userCollection) {
    	return adminsMapper.deleteCollection(userCollection);
    }
    
    
    //删除多个商品
    public int deleteCollections(List<UserCollection> userCollections) {
    	UserCollection uc=new UserCollection();
    	for(UserCollection u: userCollections) {
    		uc.setGoodsid(u.getGoodsid());
    		uc.setUserid(u.getUserid());
    		adminsMapper.deleteCollection(uc);
    	}
    	return 1;
    }
    
    //添加收藏商品
    public int insertCollcetion(UserCollection userCollection) {
    	return adminsMapper.insertCollcetion(userCollection);
    }
	
	
  //查询店家的商品销售数量
    public List<Map<String,Object>> selectSalesAmount( ) {
    	return adminsMapper.selectSalesAmount();
    }
	
	
	
	
	
	
	
	
}
