package com.easy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.easy.model.Brand;
import com.easy.model.Car;
import com.easy.model.CarType;
import com.easy.model.GearBox;
import com.easy.model.Levels;
import com.easy.model.OutPut;
import com.easy.model.Structure;
import com.easy.service.BrandService;
import com.easy.service.CarService;
import com.easy.service.CarTypeSevice;
import com.easy.service.GearBoxService;
import com.easy.service.LevelsService;
import com.easy.service.OutPutSevice;
import com.easy.service.StructureService;

@Controller
@RequestMapping("car")
@SessionAttributes({ "brandlist", "carTypelist", "gearboxlist", "levelslist",
		"outputlist", "strlist" })
public class CarCtrl {// 管理车辆信息的控制器
	@Autowired
	private CarService carService;
	@Autowired
	private BrandService brandService;
	@Autowired
	private CarTypeSevice carTypeSevice;
	@Autowired
	private LevelsService levelsService;
	@Autowired
	private GearBoxService gearBoxService;
	@Autowired
	private OutPutSevice outPutSevice;
	@Autowired
	private StructureService structureService;

	@RequestMapping("nulladd")
	public String nulladd() {

		return "add";
	}

	@RequestMapping("add")
	public String add(Car car, Map<String, Object> map) {
		int a = carService.add(car);
		return selectAll(car, map);
	}

	@RequestMapping("selectById")
	public String selectByid(int carId, Map<String, Object> map) {
		Car car2 = carService.selectById(carId);
		map.put("car", car2);
		System.out.println(car2);
		return "update";
	}

	@RequestMapping("update")
	public String update(Car car, Map<String, Object> map) {
		int a = carService.update(car);
		System.out.println(123456789);
		return selectAll(car, map);
	}

	@RequestMapping("SelectAll")
	public String selectAll(Car car, Map<String, Object> map) {
		List<Car> carlist = carService.selectFuza(car);
		map.put("carlist", carlist);
		return "CheckCar";
	}

	@RequestMapping("delete")
	public String delete(Car car, Map<String, Object> map) {
		int a = carService.delete(car.getCarId());
		return selectAll(car, map);
	}

	@RequestMapping("SelectBrand")
	public String selectBrand(Car car, Map<String, Object> map) {
		List<Brand> brandlist = brandService.selectAll();
		List<CarType> carTypelist = carTypeSevice.selectAll();
		List<GearBox> gearboxlist = gearBoxService.selectAll();
		List<Levels> levelslist = levelsService.selectAll();
		List<OutPut> outputlist = outPutSevice.selectAll();
		List<Structure> strlist = structureService.selectAll();
		map.put("brandlist", brandlist);
		map.put("carTypelist", carTypelist);
		map.put("gearboxlist", gearboxlist);
		map.put("levelslist", levelslist);
		map.put("outputlist", outputlist);
		map.put("strlist", strlist);
		return selectAll(car, map);
	}

	@RequestMapping("SelectComplex")
	public String SelectComplex(Car car, Map<String, Object> map) {
		List<Car> carlist = carService.selectFuza(car);
		map.put("SelectComplexcarlist", carlist);
		return "CheckCar";
	}

}
