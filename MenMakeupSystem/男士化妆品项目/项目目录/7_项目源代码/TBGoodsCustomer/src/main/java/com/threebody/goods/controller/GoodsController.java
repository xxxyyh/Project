package com.threebody.goods.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.threebody.goods.entity.JsonResult;
import com.threebody.goods.myfeigninterface.MyFeignInterface;

@RestController
@CrossOrigin
public class GoodsController {

	@Resource
	private MyFeignInterface myFeignInterface;

	@GetMapping("/selectgoods")
	public JsonResult<Map<String, Object>> testgetuser1(Integer goodsid, String goodsname, Integer pageSize,
			Integer pageNum, String sort, String order) {
		if(goodsid == null) {
			goodsid = -1;
		}
		return new JsonResult<Map<String, Object>>(
				myFeignInterface.getGoodsFromProvider(goodsid, goodsname, pageSize, pageNum, sort, order));
	}

	@PutMapping("updategoodsbyexampleselectiv")
	public JsonResult<String> testgetuser2(@RequestBody Goods goods) {
		return new JsonResult<>(myFeignInterface.getGoodsFromProvider2(goods));
	}

	@PostMapping("/insertgoodsselective")
	public JsonResult<Integer> testgetuser3(@RequestBody Goods goods) {
		return new JsonResult<>(myFeignInterface.getGoodsFromProvider3(goods));

	}

	@DeleteMapping("/deletegoods")
	public JsonResult<String> testgetuser4(@RequestBody List<Goods> goodsList) {
		return new JsonResult<>(myFeignInterface.getGoodsFromProvider4(goodsList));
	}

	@GetMapping("selectGoodsByExample")
	public JsonResult<Map<String, Object>> testgetuser5(int adminid, String goodsName, String goodsBrand, int pageSize,
			int pageNum) {
		return new JsonResult<Map<String, Object>>(
				myFeignInterface.getGoodsFromProvider5(adminid, goodsName, goodsBrand, pageSize, pageNum));
	}

	@GetMapping("/selectgoodsphoto")
	public JsonResult<Map<String, Object>> testgetuser6(@RequestParam("goodsid") Integer goodsid) {
		return new JsonResult<Map<String, Object>>(myFeignInterface.getGoodsFromProvider6(goodsid));
	}

	@GetMapping("/selectgoodsserie")
	public JsonResult<Map<String, Object>> testgetuser7(@RequestParam("gsid") Integer gsid,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageHelper.startPage(pageNum, pageSize);
		return new JsonResult<Map<String, Object>>(myFeignInterface.getGoodsFromProvider7(gsid, pageSize, pageNum));
	}

	@GetMapping("/selectgoodsfunction")
	public JsonResult<Map<String, Object>> testgetuser8(@RequestParam("gfid") Integer gfid,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageHelper.startPage(pageNum, pageSize);
		return new JsonResult<Map<String, Object>>(myFeignInterface.getGoodsFromProvider8(gfid, pageSize, pageNum));
	}

	@GetMapping("/selectgoodstype")
	public JsonResult<Map<String, Object>> testgetuser9(@RequestParam("gtypeid") Integer gtypeid,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum) {
		PageHelper.startPage(pageNum, pageSize);
		return new JsonResult<Map<String, Object>>(myFeignInterface.getGoodsFromProvider9(gtypeid, pageSize, pageNum));
	}

	@GetMapping("/selectallother")
	public JsonResult<List> testgetuser11() {
		return new JsonResult<List>(myFeignInterface.getGoodsFromProvider11());
	}

	/**
	 * 批量添加商品图片
	 * 
	 * @param goodsid
	 * @param photoPaths
	 * @return
	 */
	@PostMapping("/insertGoodsPhoto")
	public JsonResult<Boolean> insertGoodsPhotoList(@RequestParam("goodsid") Integer goodsid,
			@RequestParam("photoPaths") String photoPaths) {
		return new JsonResult<>(myFeignInterface.insertGoodsPhotoList(goodsid, photoPaths));
	}

}
