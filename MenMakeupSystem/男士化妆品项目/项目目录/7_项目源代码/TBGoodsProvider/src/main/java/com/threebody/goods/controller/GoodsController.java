package com.threebody.goods.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.goods.entity.Goods;
import com.threebody.goods.entity.GoodsFunction;
import com.threebody.goods.entity.GoodsSerie;
import com.threebody.goods.entity.GoodsType;
import com.threebody.goods.mapper.GoodsMapper;
import com.threebody.goods.service.GoodsService;

@RestController
public class GoodsController {

	@Value(value = "${server.port}")
	private String port;
	@Autowired
	private GoodsService goodsService;

	/**
	 * 查询获取到的所有商品信息，并且分页
	 * 
	 * @param goodsid
	 * @param goodsname
	 * @param pageSize
	 * @param pageNum
	 * @param sort
	 * @param order
	 * @return
	 */
	@GetMapping("/selectgoods")
	public PageInfo<Map<String, Object>> selectGoodsAll(@RequestParam("goodsid") Integer goodsid,
			@RequestParam("goodsname") String goodsname, @RequestParam("pageSize") Integer pageSize,
			@RequestParam("pageNum") Integer pageNum, @RequestParam("sort") String sort,
			@RequestParam("order") String order) {
		PageHelper.startPage(pageNum, pageSize, sort + " " + order);
		return new PageInfo<Map<String, Object>>(goodsService.selectGoods(goodsid, goodsname));
	}

	/**
	 * 选择性修改商品
	 * 
	 * @param goods
	 * @return
	 */
	@PutMapping("/updategoodsbyexampleselectiv")
	public String updateGoodsByExampleSelectiv(@RequestBody Goods goods) {
		return goodsService.updateGoodsByExampleSelectiv(goods);
	}

	/**
	 * 添加商品信息
	 * 
	 * @param goods
	 * @return
	 */
	@PostMapping("/insertgoodsselective")
	public Integer insertGoodsSelective(@RequestBody Goods goods) {
		return goodsService.insertGoodsSelective(goods);
	}

	/**
	 * 批量修改商品信息
	 * 
	 * @param goodsList
	 * @return
	 */
	@DeleteMapping("/deletegoods")
	public String deleteGoods(@RequestBody List<Goods> goodsList) {
		return goodsService.deleteGoods(goodsList);
	}

	/**
	 * 通过goodsname以及goodsbrand查询商品信息，并且分页
	 * 
	 * @param pageSize
	 * @param pageNum
	 * @param adminid
	 * @param goodsname
	 * @param goodsbrand
	 * @return
	 */
	@GetMapping("selectGoodsByExample")
	public PageInfo<Map<String, Object>> selectgoodsinfo(@RequestParam("pageSize") int pageSize,
			@RequestParam("pageNum") int pageNum, @RequestParam("adminid") Integer adminid,
			@RequestParam("goodsname") String goodsname, @RequestParam("goodsbrand") String goodsbrand) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Map<String, Object>>(goodsService.selectgoodsinfo(adminid, goodsname, goodsbrand));
	}

	/**
	 * 通过goodsid查找相应的商品
	 * 
	 * @param goodsid
	 * @return
	 */
	@GetMapping("/selectgoodsphoto")
	public List<Map<String, Object>> selectGoodsPhoto(@RequestParam("goodsid") Integer goodsid) {
		List<Map<String, Object>> goodsphoto = goodsService.selectgoodsphoto(goodsid);
		return goodsphoto;
	}

	/**
	 * 通过传入的gsid查找相应的商品。并且分页
	 * 
	 * @param pageSize
	 * @param pageNum
	 * @param gsid
	 * @return
	 */
	@GetMapping("/selectgoodsserie")
	public PageInfo<Map<String, Object>> selectGoodsSerie(@RequestParam("pageSize") int pageSize,
			@RequestParam("pageNum") int pageNum, @RequestParam("gsid") Integer gsid) {
		PageHelper.startPage(pageNum, pageSize);
		List<Map<String, Object>> goodsserie = goodsService.selectgoodsserie(gsid);
		for (Map<String, Object> g : goodsserie) {
			List<Map<String, Object>> gpse = goodsService.selectgoodsphoto((Integer) g.get("goodsid"));
			g.put("gphotocode", gpse.get(0).get("gphotoCode"));
		}
		return new PageInfo<Map<String, Object>>(goodsserie);
	}

	/**
	 * 通过传入的gfid查找相应的商品，并且分页
	 * 
	 * @param pageSize
	 * @param pageNum
	 * @param gfid
	 * @return
	 */
	@GetMapping("/selectgoodsfunction")
	public PageInfo<Map<String, Object>> selectGoodsFunction(@RequestParam("pageSize") int pageSize,
			@RequestParam("pageNum") int pageNum, @RequestParam("gfid") Integer gfid) {
		PageHelper.startPage(pageNum, pageSize);
		List<Map<String, Object>> goodsfunction = goodsService.selectgoodsfunction(gfid);
		for (Map<String, Object> g : goodsfunction) {
			List<Map<String, Object>> gpss = goodsService.selectgoodsphoto((Integer) g.get("goodsid"));
			g.put("gphotoCode", gpss.get(0).get("gphotoCode"));
		}
		return new PageInfo<Map<String, Object>>(goodsfunction);
	}

	/**
	 * 通过gtypeid查找相应的商品。并且分页
	 * 
	 * @param pageSize
	 * @param pageNum
	 * @param gtypeid
	 * @return
	 */
	@GetMapping("/selectgoodstype")
	public PageInfo<Map<String, Object>> selectgoodstype(@RequestParam("pageSize") int pageSize,
			@RequestParam("pageNum") int pageNum, @RequestParam("gtypeid") Integer gtypeid) {
		PageHelper.startPage(pageNum, pageSize);
		List<Map<String, Object>> goodslist = goodsService.selectgoodstype(gtypeid);
		for (Map<String, Object> g : goodslist) {
			List<Map<String, Object>> gps = goodsService.selectgoodsphoto((Integer) g.get("goodsid"));
			g.put("gphotoCode", gps.get(0).get("gphotoCode"));
		}
		return new PageInfo<Map<String, Object>>(goodslist);
	}

	/**
	 * 将gtypeid,gfid,gsid对应显现出来
	 * 
	 * @return
	 */
	@GetMapping("/selectallother")
	public List<List> selectAllgfunction() {
		List<GoodsFunction> gallfunction = goodsService.selectallgfunction();
		List<GoodsSerie> gallserie = goodsService.selectallgserie();
		List<GoodsType> galltype = goodsService.selectallgtype();
		List<List> selectotherall = new ArrayList<>();
		selectotherall.add(galltype);
		selectotherall.add(gallserie);
		selectotherall.add(gallfunction);
		return selectotherall;
	}

	/**
	 * 批量添加商品图片
	 * 
	 * @param goodsid
	 * @param photoPaths
	 * @return
	 */
	@PostMapping("/insertGoodsPhoto")
	public boolean insertGoodsPhotoList(@RequestParam("goodsid") Integer goodsid,
			@RequestParam("photoPaths") String photoPaths) {
		return goodsService.insertGoodsPhotoList(goodsid, photoPaths);
	}
}
