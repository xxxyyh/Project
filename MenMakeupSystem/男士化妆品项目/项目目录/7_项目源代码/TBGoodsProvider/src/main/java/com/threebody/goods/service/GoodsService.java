package com.threebody.goods.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.threebody.goods.entity.Goods;
import com.threebody.goods.entity.GoodsExample;
import com.threebody.goods.entity.GoodsFunction;
import com.threebody.goods.entity.GoodsPhoto;
import com.threebody.goods.entity.GoodsPhotoExample;
import com.threebody.goods.entity.GoodsSerie;
import com.threebody.goods.entity.GoodsType;
import com.threebody.goods.mapper.GoodsFunctionMapper;
import com.threebody.goods.mapper.GoodsMapper;
import com.threebody.goods.mapper.GoodsPhotoMapper;
import com.threebody.goods.mapper.GoodsSerieMapper;
import com.threebody.goods.mapper.GoodsTypeMapper;

@Service
@CacheConfig(cacheNames = "goodsService")
public class GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private GoodsFunctionMapper goodsFunctionMapper;
	@Autowired
	private GoodsSerieMapper goodsSerieMapper;
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	@Autowired
	private GoodsPhotoMapper goodsPhotoMapper;

	/**
	 * 模糊查询，通过goodsid和goodsname查找信息
	 * 
	 * @param goodsid
	 * @param goodsname
	 * @return
	 */
	public List<Map<String, Object>> selectGoods(Integer goodsid, String goodsname) {
		if (goodsid < 0) {
			goodsid = null;
		}
		List<Map<String, Object>> goodsList = goodsMapper.selectgoods(goodsid, goodsname);
		GoodsPhotoExample gp = new GoodsPhotoExample();
		for (int i = 0; i < goodsList.size(); i++) {
			Map<String, Object> goinfo = new HashMap<String, Object>();
			goinfo = goodsList.get(i);
			gp.createCriteria().andGoodsidEqualTo((Integer)goodsList.get(i).get("goodsid"));
			List<GoodsPhoto> goodsPhotoList = goodsPhotoMapper.selectByExample(gp);
			if(goodsPhotoList.size()>0) {
				goinfo.put("gphotocode",goodsPhotoList.get(0).getGphotocode()); 
			}else {
				goinfo.put("gphotocode", "");
			}
			goodsList.set(i, goinfo);
		}
		return goodsList;
	}

	/**
	 * 查询所有商品信息
	 * 
	 * @return
	 */
	public List<Goods> selectGoodsExample() {
		return goodsMapper.selectByExample(null);
	}

	/**
	 * 选择性修改商品信息
	 * 
	 * @param goods
	 * @return
	 */
	public String updateGoodsByExampleSelectiv(Goods goods) {
		// 图片路径拼接的字符串
		String photoPaths = "";
		GoodsPhotoExample gpe = new GoodsPhotoExample();
		gpe.createCriteria().andGoodsidEqualTo(goods.getGoodsid());
		List<GoodsPhoto> goodsPhotoList = goodsPhotoMapper.selectByExample(gpe);
		for (GoodsPhoto gp : goodsPhotoList) {
			photoPaths = photoPaths + "," + gp.getGphotocode();
		}
		if (goodsMapper.updateByPrimaryKeySelective(goods) > 0) {
			GoodsPhotoExample gpe2 = new GoodsPhotoExample();
			gpe2.createCriteria().andGoodsidEqualTo(goods.getGoodsid());
			goodsPhotoMapper.deleteByExample(gpe2);
			return photoPaths;
		} else {
			return "修改失败";
		}
	}

	/**
	 * 添加商品信息，并通过入库时间查询刚插入的商品的goodsid
	 * 
	 * @param goods
	 * @return
	 */
	public Integer insertGoodsSelective(Goods goods) {
		Date grt = new Date();
		goods.setGoodsregistertime(grt);
		if (goodsMapper.insertSelective(goods) > 0) {
			GoodsExample ge = new GoodsExample();
			ge.createCriteria().andGoodsregistertimeEqualTo(grt);
			List<Goods> goodsList = goodsMapper.selectByExample(ge);
			if (goodsList.size() > 0) {
				return goodsList.get(0).getGoodsid();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * 批量删除商品的信息，返回删除商品的图片路径拼接的字符串
	 * 
	 * @param goodsList
	 * @return
	 */
	public String deleteGoods(List<Goods> goodsList) {
		List<Integer> goodsIdList = new ArrayList<Integer>();
		for (Goods g : goodsList) {
			goodsIdList.add(g.getGoodsid());
		}
		// 图片路径拼接的字符串
		String photoPaths = "";
		GoodsPhotoExample gpe = new GoodsPhotoExample();
		gpe.createCriteria().andGoodsidIn(goodsIdList);
		List<GoodsPhoto> goodsPhotoList = goodsPhotoMapper.selectByExample(gpe);
		for (GoodsPhoto gp : goodsPhotoList) {
			photoPaths = photoPaths + "," + gp.getGphotocode();
		}
		GoodsExample ge = new GoodsExample();
		ge.createCriteria().andGoodsidIn(goodsIdList);
		if (goodsMapper.deleteByExample(ge) == goodsIdList.size()) {
			return photoPaths;
		} else {
			return "删除失败";
		}
	}

	/**
	 * 通过goodsid查询商品的图片
	 * 
	 * @param goodsid
	 * @return
	 */
	public List<Map<String, Object>> selectgoodsphoto(int goodsid) {
		return goodsMapper.selectgoodsphoto(goodsid);
	}

	/**
	 * 根据gsid查找对应的商品
	 * 
	 * @param gsid
	 * @return
	 */
	public List<Map<String, Object>> selectgoodsserie(int gsid) {
		return goodsMapper.selectgoodsserie(gsid);
	}

	/**
	 * 根据gfid查找对应的商品
	 * 
	 * @param gfid
	 * @return
	 */
	public List<Map<String, Object>> selectgoodsfunction(int gfid) {
		return goodsMapper.selectgoodsfunction(gfid);
	}

	/**
	 * 根据gtypeid查找商品
	 * 
	 * @param gtypeid
	 * @return
	 */
	public List<Map<String, Object>> selectgoodstype(int gtypeid) {
		return goodsMapper.selectgoodstype(gtypeid);
	}

	/**
	 * 根据goodsid查找多张图片
	 * 
	 * @param goodsid
	 * @return
	 */
	public List<Map<String, Object>> selectPhoto(int goodsid) {
		return goodsMapper.selectPhoto(goodsid);
	}

	/**
	 * 查找功能表的全部内容
	 * 
	 * @return
	 */
	public List<GoodsFunction> selectallgfunction() {
		return goodsFunctionMapper.selectByExample(null);
	}

	/**
	 * 查找系列表中的所有内容
	 * 
	 * @return
	 */
	public List<GoodsSerie> selectallgserie() {
		return goodsSerieMapper.selectByExample(null);
	}

	/**
	 * 查找功能表中的所有内容
	 * 
	 * @return
	 */
	public List<GoodsType> selectallgtype() {
		return goodsTypeMapper.selectByExample(null);
	}

	/**
	 * 通过adminid,goodsname,goodsbrand查询商品信息
	 * 
	 * @param adminid
	 * @param goodsname
	 * @param goodsbrand
	 * @return
	 */
	public List<Map<String, Object>> selectgoodsinfo(int adminid, String goodsname, String goodsbrand) {
		System.out.println("adminid====>" + adminid);
		System.out.println("goodsname====>" + goodsname);
		System.out.println("goodsbrand====>" + goodsbrand);
		List<Map<String, Object>> goodsinfoList = goodsMapper.selectallgoodsinfo(adminid, goodsname, goodsbrand);
		GoodsPhotoExample gp = new GoodsPhotoExample();
		for (int i = 0; i < goodsinfoList.size(); i++) {
			Map<String, Object> goinfo = new HashMap<String, Object>();
			goinfo = goodsinfoList.get(i);
			gp.createCriteria().andGoodsidEqualTo((Integer) goinfo.get("goodsid"));
			GoodsPhoto goodsPhoto = goodsPhotoMapper.selectByExample(gp).get(0);
			goinfo.put("gphotocode", goodsPhoto.getGphotocode());
			goodsinfoList.set(i, goinfo);
		}
		return goodsinfoList;
	}

	/**
	 * 查找全部图片
	 * 
	 * @return
	 */
	public List<GoodsPhoto> selectPhotoExample() {
		return goodsPhotoMapper.selectByExample(null);
	}

	/**
	 * 添加商品图片
	 * 
	 * @param goodsid
	 * @param photoPaths
	 * @return
	 */
	public boolean insertGoodsPhotoList(Integer goodsid, String photoPaths) {
		GoodsPhoto gp = new GoodsPhoto();
		gp.setGoodsid(goodsid);
		int row = 0;
		// 字符串分析器，分解photoPaths中包含的多个图片路径
		StringTokenizer fenxi = new StringTokenizer(photoPaths, ",");
		while (fenxi.hasMoreTokens()) {
			gp.setGphotocode(fenxi.nextToken());
			goodsPhotoMapper.insertSelective(gp);
			row++;
		}
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}

}
