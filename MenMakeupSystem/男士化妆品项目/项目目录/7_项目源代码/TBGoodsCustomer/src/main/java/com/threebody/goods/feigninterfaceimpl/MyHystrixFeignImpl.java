package com.threebody.goods.feigninterfaceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageInfo;
import com.threebody.goods.entity.Goods;
import com.threebody.goods.myfeigninterface.MyFeignInterface;
@Component
public class MyHystrixFeignImpl implements MyFeignInterface {

	

	@Override
	public String getGoodsFromProvider2(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getGoodsFromProvider3(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGoodsFromProvider4(List<Goods> goods) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> getGoodsFromProvider5(Integer adminid, String goodsname, String goodsbrand,
			int pageSize, int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getGoodsFromProvider6(Integer goodsid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> getGoodsFromProvider7(Integer gsid, int pageSize, int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> getGoodsFromProvider8(Integer gfid, int pageSize, int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> getGoodsFromProvider9(Integer gtypeid, int pageSize, int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List> getGoodsFromProvider11() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertGoodsPhotoList(Integer goodsid, String photoPaths) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PageInfo<Map<String, Object>> getGoodsFromProvider(Integer goodsid, String goodsname, Integer pageSize,
			Integer pageNum, String sort, String order) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
