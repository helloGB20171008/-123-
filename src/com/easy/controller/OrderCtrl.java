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
import com.easy.model.Order;
import com.easy.model.OutPut;
import com.easy.model.Structure;
import com.easy.service.BrandService;
import com.easy.service.CarService;
import com.easy.service.CarTypeSevice;
import com.easy.service.GearBoxService;
import com.easy.service.LevelsService;
import com.easy.service.OrderService;
import com.easy.service.OutPutSevice;
import com.easy.service.StructureService;

@Controller
@SessionAttributes({"car","carTypelist","gearboxlist","levelslist","outputlist","strlist","brandlist","orderlist","carlist"})
@RequestMapping("order")
public class OrderCtrl {
	@Autowired
	private OrderService orderService;
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
    private StructureService  structureService;
	@RequestMapping("nulladd")
	   public String nulladd(int carId,Map< String , Object> map){
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
		Car car =carService.selectById(carId);
		map.put("car",car);
		System.out.println(car);   
			return "OrderAdd";
	}
	@RequestMapping("orderAdd")
	public String add(Order order,Map< String , Object> map){
		int a=Integer.parseInt(order.getGetCarTime());
		System.out.println(order.getGetCarTime());
		System.out.println(1111);
		int a1=Integer.parseInt(order.getReturnCarTime());
		System.out.println(order.getReturnCarTime());
		order.setOrderPrice(order.getOrderPrice()*(a1-a));
		order.setOrderState(2);//1��ʾ�ɹ�  2������  3 ȡ��
		System.out.println("**************************************************");
		System.out.println(order);
		orderService.add(order);
		map.put("getDate",a1-a);
	    return "OrderSubmit";
	}
	@RequestMapping("orderSelectforAdmin")
	public String selectAllforAdmin(Map< String , Object> map){
		List<Order> orderforAdminlist =orderService.selectAll();
		map.put("orderforAdminlist", orderforAdminlist);
		return "AdminorderIndex";
	}
	@RequestMapping("turnorderSelectById")
	public String noupdate(int orderId,Map< String , Object> map){
		Order order =orderService.selectbyorderId(orderId);
		map.put("order", order);
		return "orderUpdate";		
	}
	
	@RequestMapping("orderupdate")
	public String update(int userId,Order order,Map< String , Object> map){
		order.setOrderState(2);//���Ǹ�ֵ�������ݿ�״̬��0
		int a = orderService.update(order);
		System.out.println(a+"123456789");
		return selectAll(userId,map);		
	}

	@RequestMapping("orderSelectAll")
	public String selectAll(int userId,Map< String , Object> map){
		List<Order> orderlist=orderService.selectbyId(userId);
		List<Car> carlist =carService.selectAll();
		map.put("orderlist",orderlist);
		map.put("carlist",carlist);
		return "orderIndex";
	}
	
	@RequestMapping("orderCancel")
	public String cancel(int orderId,Map<String, Object> map){
		Order order1 =orderService.selectbyorderId(orderId);
		order1.setOrderState(3);
		/*�쳣1������ֱ��ͨ��selectbyorderId(orderId)�鵽Ҫ�޸ĵĶ���Ȼ��ͨ��Set������״̬�����޸ģ���Ϊ�÷�������controller����еģ�û�о������ݿ⣬����������ʾ��State��0��
		 * ��Ҫ�ڵײ�Mapper.xml�ļ��ﶨ��һ���޸�״̬�ķ�����ͨ������ʹ��ͨ�����ݿ��޸ġ�
		 * 
		 * 
		
		 * �쳣2���������ݿ����ѯ������ֱ��ת�������ͣ�����ʧ��
		 *       ԭ�򣺴������в鵽�����ڸ�ʽ�����ݿ����ڸ�ʽ����"-"��,��Ҫȥ����
		 * 
		 * 
		 * ��ʱ�����ӺͲ�ѯ�ϲ�ͬ����Ҫע�⣺
		 * �ӽ�����������ڽ������ݿ�ʱ����controller�����ڽ��д���û�о������ݿ����棬�����ַ��������ڡ�-����
		 * �����ݿ��в��ҵ������������ݿ�����ڸ�ʽ��yyyy-mm-dd������ʱ�ڽ��ַ���String��ת����Int��ǰ��Ҫ��String�����replace����Ҫ�޸�/ȥ����a�ַ���,"�ĳ�b/"" "��ȥ����-���� 
		 * 
		 * 
		 * 
		 * */
		System.out.println(order1.getGetCarTime().replace("-", ""));
		int a=Integer.parseInt(order1.getGetCarTime().replace("-", ""));
		int a1=Integer.parseInt(order1.getReturnCarTime().replace("-", ""));
		order1.setOrderPrice(order1.getOrderPrice()*(a1-a));
    	map.put("getDate1",a1-a);
    	map.put("order1", order1);
		return "orderCancelIndex";
	}
	
	@RequestMapping("orderCancel1")
	public String cancel1(int userId,int orderId,Map<String, Object> map){
		int a=orderService.updateState(orderId);		
		/*
		 * ��ʱ�����ӺͲ�ѯ�ϲ�ͬ����Ҫע�⣺
		 * �ӽ�����������ڽ������ݿ�ʱ����controller�����ڽ��д���û�о������ݿ����棬�����ַ��������ڡ�-����
		 * �����ݿ��в��ҵ������������ݿ�����ڸ�ʽ��yyyy-mm-dd������ʱ�ڽ��ַ���String��ת����Int��ǰ��Ҫ��String�����replace����Ҫ�޸�/ȥ����a�ַ���,"�ĳ�b/"" "��ȥ����-���� 
		 * 
		 * */
		return selectAll(userId,map);
	}
	
	
//	@RequestMapping("orderDelete")
//	public String delete(int orderId,Map< String , Object> map){
//		int a=orderService.delete(orderId);
//		return "";
//	}
	@RequestMapping("turntoorderIndex")
	public String turntoorderIndex(int orderId,int userId,Map< String , Object> map){
		int a=orderService.updateState(orderId);
		return selectAll(userId,map);
	}
	
	@RequestMapping("turntoUserIndex")
	public String turntoUserIndex(Map<String, Object> map){
		List<Car> carlist=carService.selectAll();
		System.out.println(carlist);
		map.put("carlist1",carlist);
		return "index";
	}
	
	@RequestMapping("turntoAdminIndex")
	public String turntoAdminIndex(){
		
		return "AdminCheckOk";
	}
	

	@RequestMapping("check")
	public String check(long orderId,Map<String, Object> map){
		int a=orderService.updateStateToSucess(orderId);
		return selectAllforAdmin(map);
	}
	
}
