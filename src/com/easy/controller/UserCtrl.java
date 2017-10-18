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
import com.easy.model.User;
import com.easy.service.BrandService;
import com.easy.service.CarService;
import com.easy.service.CarTypeSevice;
import com.easy.service.GearBoxService;
import com.easy.service.LevelsService;
import com.easy.service.OutPutSevice;
import com.easy.service.StructureService;
import com.easy.service.UserService;

@Controller
@SessionAttributes({"name","userTe","carlist","brandlist","carTypelist","gearboxlist","levelslist","outputlist","strlist","brandlist"})
@RequestMapping("user")
public class UserCtrl {
	@Autowired
	private UserService userService;
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
	public String login(User user1,Map<String , Object> map){//框架的进出口只能是一个（属性，类）
		User user=userService.selectById(user1.getUserTe());
		List<Car> carlist=carService.selectAll();
		map.put("carlist", carlist);
		if (user !=null &&user1.getUserPw().equals(user.getUserPw())) {
		map.put("name", user.getUserName());
		map.put("userTe", user.getUserTe());
		return SelectAll(map);	
		}
		return "User";
	}
	@RequestMapping("Selectall")
	public String SelectAll(Map< String , Object> map){
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
		List<Car> carlist=carService.selectAll();
		System.out.println(carlist);
		map.put("carlist1",carlist);
		return "index";
	}
	
	@RequestMapping("nologin")
	public String nologin(){
		
		return "User";
	}
	@RequestMapping("noadduser")
	public String noadd(){
		
		return "addUser";
	}
	@RequestMapping("Adduser")
	public String add(User user){
		int a = userService.add(user);
		return "User";
	}
	
}
