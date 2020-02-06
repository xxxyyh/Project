package com.threebody.goods.myfeigninterface;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.threebody.goods.entity.Goods;
import com.threebody.goods.feigninterfaceimpl.MyHystrixFeignImpl;

//填入的是你要链接的服务提供者的id,fallback是断路器的回调方法
@FeignClient(value = "eureka-client-provider-goods", fallback = MyHystrixFeignImpl.class)
public interface MyFeignInterface {

	@GetMapping("/selectgoods")
	PageInfo<Map<String, Object>> getGoodsFromProvider(@RequestParam("goodsid") Integer goodsid,
			@RequestParam("goodsname") String goodsname, @RequestParam("pageSize") Integer pageSize,
			@RequestParam("pageNum") Integer pageNum, @RequestParam("sort") String sort,
			@RequestParam("order") String order);

	@PutMapping("/updategoodsbyexampleselectiv")
	String getGoodsFromProvider2(@RequestBody Goods goods);

	@PostMapping("/insertgoodsselective")
	Integer getGoodsFromProvider3(@RequestBody Goods goods);

	@DeleteMapping("/deletegoods")
	String getGoodsFromProvider4(@RequestBody List<Goods> goods);

	@GetMapping("selectGoodsByExample")
	PageInfo<Map<String, Object>> getGoodsFromProvider5(@RequestParam("adminid") Integer adminid,
			@RequestParam("goodsname") String goodsname, @RequestParam("goodsbrand") String goodsbrand,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum);

	@GetMapping("/selectgoodsphoto")
	List<Map<String, Object>> getGoodsFromProvider6(@RequestParam("goodsid") Integer goodsid);

	@GetMapping("/selectgoodsserie")
	PageInfo<Map<String, Object>> getGoodsFromProvider7(@RequestParam("gsid") Integer gsid,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum);

	@GetMapping("/selectgoodsfunction")
	PageInfo<Map<String, Object>> getGoodsFromProvider8(@RequestParam("gfid") Integer gfid,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum);

	@GetMapping("/selectgoodstype")
	PageInfo<Map<String, Object>> getGoodsFromProvider9(@RequestParam("gtypeid") Integer gtypeid,
			@RequestParam("pageSize") int pageSize, @RequestParam("pageNum") int pageNum);

	@GetMapping("/selectallother")
	List<List> getGoodsFromProvider11();

	@PostMapping("/insertGoodsPhoto")
	Boolean insertGoodsPhotoList(@RequestParam("goodsid") Integer goodsid,
			@RequestParam("photoPaths") String photoPaths);
}
