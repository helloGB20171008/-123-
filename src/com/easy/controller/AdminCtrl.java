package com.easy.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.easy.model.Adimin;
import com.easy.model.Brand;
import com.easy.model.Car;
import com.easy.model.CarType;
import com.easy.model.GearBox;
import com.easy.model.Levels;
import com.easy.model.OutPut;
import com.easy.model.Structure;
import com.easy.service.AdminService;
import com.easy.service.BrandService;
import com.easy.service.CarService;
import com.easy.service.CarTypeSevice;
import com.easy.service.GearBoxService;
import com.easy.service.LevelsService;
import com.easy.service.OutPutSevice;
import com.easy.service.StructureService;

@Controller
@SessionAttributes({"adiminname","carlist","brandlist","carTypelist","gearboxlist","levelslist","outputlist","strlist","brandlist"})
@RequestMapping("admin")
public class AdminCtrl {//管理员控制器
	@Autowired
	private AdminService adminService;
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
    private StructureService  structureService;
@Autowired
private CarService carService;
	@RequestMapping("login")
	public String login(Adimin adimin1,Map< String , Object> map){
		List<Adimin> list=adminService.selectAll();
		List<Car> carlist=carService.selectAll();
		List<Brand> brandslist=brandService.selectAll();
		List<CarType> carTypelist=carTypeSevice.selectAll();
		List<GearBox> gearboxlist=gearBoxService.selectAll();
		List<Levels> levelslist=levelsService.selectAll();
		List<OutPut> outputlist= outPutSevice.selectAll();
		List<Structure> strlist= structureService.selectAll();
		map.put("carTypelist",carTypelist);
		map.put("gearboxlist",gearboxlist);
		map.put("levelslist",levelslist);
		map.put("outputlist",outputlist);
		map.put("strlist",strlist);
		map.put("brandlist", brandslist);
		map.put("carlist", carlist);
		
		for (Adimin adimin : list) {
			if (adimin.getAdminUser().equals(adimin1.getAdminUser())&&adimin.getAdminPw().equals(adimin1.getAdminPw())) {
					if (adimin.getAdminType() == 1) {
						map.put("adiminname",adimin1.getAdminUser());
						return "AdminCheckOk";
					}else if (adimin.getAdminType() == 2) {
						map.put("adiminname", adimin1.getAdminUser());
						return "lowAdminCheckOk";
					}	
			}
		}
		return "Admin";
	}
@RequestMapping("noadd")
public String noadd(){
	return "addAdmin";
}
@RequestMapping("AddAdmin")
public String  add(Adimin adimin){
	int a = adminService.add(adimin);
	return "Admin";
}

	
}
