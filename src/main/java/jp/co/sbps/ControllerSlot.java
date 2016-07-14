package jp.co.sbps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerSlot {
	@Autowired
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	private JdbcTemplate jdbcn;
	
	@Autowired
	private MachineTableDao macDao;

	//URLの名前
	@RequestMapping("/controller/title")
	public String title(String namemachine,Model model){
		return "title";
	}
	
	@RequestMapping("/controller/machine")
	public String machine(@RequestParam(required=false) Integer id, String name,Model model){
		List<Map<String, Object>>machine = macDao.selectAll();
		model.addAttribute("machines", machine);
		//htmlの指定
		return "machine";
	}
	
	@RequestMapping("controller/detail")
	public String detail(@RequestParam(required=false)String macn1,Integer macid1, String zones,String riset,String finish,String setdif1,String setdif2, Integer ceiling,Model model){
		//List<Map<String, Object>>detail = jdbcn.queryForList("select * from MACHINE_TABLE");
		model.addAttribute("ceiling", ceiling);
		model.addAttribute("macn1", macn1);
		model.addAttribute("macid", macid1);
		model.addAttribute("zones", zones);
		model.addAttribute("riset", riset);
		model.addAttribute("finish", finish);
		model.addAttribute("setdif1", setdif1);
		model.addAttribute("setdif2", setdif2);
		return "detail";
	}
	
	@RequestMapping("/controller/hantei")
	public String hantei(@RequestParam(required=false)Integer hantei1,Integer hantei2,Integer hantei3,Model model){
		model.addAttribute("hantei1",hantei1);
		model.addAttribute("hantei2",hantei2);
		model.addAttribute("hantei3",hantei3);
		System.out.println(hantei1);
		
//		double total2;
//		double big2;
//		double reg2;
//		int i;
//		int j;
//		int k;
//
//		// 確率計算
//		big2 = hantei2 / hantei1;
//		reg2 = hantei3 / hantei1;
//		total2 = big2 + reg2;
//
//		if (reg2 <= 1.0 / 470.0) {
//			System.out.println("REG確率はゴミです");
//			i =1;
//		} else if (reg2 <= 1.0 / 400.0) {
//			System.out.println("REG確率は設定1の近似値です");
//			i =1;
//		} else if (reg2 <= 1.0 / 350.0) {
//			System.out.println("REG確率は設定2の近似値です");
//			i =2;
//		} else if (reg2 <= 1.0 / 300.0) {
//			System.out.println("REG確率は設定3の近似値です");
//			i =3;
//		} else if (reg2 <= 1.0 / 285.0) {
//			System.out.println("REG確率は設定4の近似値です");
//			i =4;
//		} else if (reg2 <= 1.0 / 250.0) {
//			System.out.println("REG確率は設定5の近似値です");
//			i =5;
//		} else if (reg2 <= 1.0 / 225.0) {
//			System.out.println("REG確率は設定6の近似値です");
//			i =6;
//		} else {
//			System.out.println("REG確率は神です");
//			i =6;
//		}
//
//		if (total2 <= 1.0 / 190.0) {
//			System.out.println("合算確率はゴミです");
//			j =1;
//		} else if (total2 <= 1.0 / 165.0) {
//			System.out.println("合算確率は設定1の近似値です");
//			j =1;
//		} else if (total2 <= 1.0 / 155.0) {
//			System.out.println("合算確率は設定2の近似値です");
//			j =2;
//		} else if (total2 <= 1.0 / 143.0) {
//			System.out.println("合算確率は設定3の近似値です");
//			j =3;
//		} else if (total2 <= 1.0 / 135.0) {
//			System.out.println("合算確率は設定4の近似値です");
//			j =4;
//		} else if (total2 <= 1.0 / 126.0) {
//			System.out.println("合算確率は設定5の近似値です");
//			j =5;
//		} else if (total2 <= 1.0 / 115.0) {
//			System.out.println("合算確率は設定6の近似値です");
//			j =6;
//		} else {
//			System.out.println("合算確率は神です");
//			j =6;
//		}
//		System.out.println(hantei1);
//		System.out.println(hantei3);
//		System.out.println(i);
//		System.out.println(j);
//		k = (i + j) / 2; 
//		
//		System.out.println("予想設定は" + k + "です");
//		
		return "detail";
	}
	
	@RequestMapping("/controller/detail2")
	public String detail2(){
		return "detail2";
	}
	
	@RequestMapping("/controller/addMachine")
	public String addMachine(){	
	return "addMachine";
	}

	@RequestMapping("/controller/editMachine")
	public String editMachine(@RequestParam(required=false)Integer macid2, String name,Integer setting1,Model model){
		List<Map<String, Object>>editMachine = macDao.selectAll();
		model.addAttribute("editMachine", editMachine);
		model.addAttribute("setting1", setting1);
		model.addAttribute("macid2", macid2);
		return "editMachine";
	}
	
	@RequestMapping("/controller/finNewMachine")
	public String finNewMachine(@RequestParam(required=false)String set_dif1, String title,Integer ceiling,String zones,String riset,String finish,String setdif1,String setdif2,Integer set1,Integer set2,Integer set3,Integer set4,Integer set5,Integer set6,Model model){
		Map<String,Object> map1 = new HashMap<String,Object>();
//		map1.put("id", id);		
		map1.put("title", title);
		map1.put("ceiling", ceiling);
		map1.put("zones", zones);
		map1.put("riset", riset);
		map1.put("finish", finish);		
		map1.put("setdif1", setdif1);
		map1.put("setdif2", setdif2);
		map1.put("set1", set1);
		map1.put("set2", set2);
		map1.put("set3", set3);
		map1.put("set4", set4);
		map1.put("set5", set5);
		map1.put("set6", set6);
		
//		model.addAttribute("id",id);		
		model.addAttribute("map1",map1);


		int I = jdbc.update("insert into MACHINE_TABLE (machine_name,ceiling,zones,riset,finish,set_dif1,set_dif2,setting_1,setting_2,setting_3,setting_4,setting_5,setting_6) values(:title,:ceiling,:zones,:riset,:finish,:setdif1,:setdif2,:set1,:set2,:set3,:set4,:set5,:set6)",map1);
		//int I = jdbc.update("insert into MACHINE_TABLE (machine_name) values(:title)",map1);
		model.addAttribute(I);
		//htmlの指定
		return "finNewMachine";
	}
	
	@RequestMapping("/controller/finEditMachine")
	public String finEditMachine(@RequestParam(required=false)Integer macid2,String set_dif1, String namemachine,Integer ceiling,String zones,String riset,String finish,String setdif1,String setdif2,Integer set1,Integer set2,Integer set3,Integer set4,Integer set5,Integer set6,Model model){
		Map<String,Object> map1 = new HashMap<String,Object>();
		map1.put("macid2", macid2);		
		map1.put("namemachine", namemachine);
		map1.put("ceiling", ceiling);
		map1.put("zones", zones);
		map1.put("riset", riset);
		map1.put("finish", finish);		
		map1.put("setdif1", setdif1);
		map1.put("setdif2", setdif2);
		map1.put("set1", set1);
		map1.put("set2", set2);
		map1.put("set3", set3);
		map1.put("set4", set4);
		map1.put("set5", set5);
		map1.put("set6", set6);
			
		model.addAttribute("map1",map1);

		int J = jdbc.update("update MACHINE_TABLE set(ID,machine_name,ceiling,zones,riset,finish,set_dif1,set_dif2,setting_1,setting_2,setting_3,setting_4,setting_5,setting_6) = (:macid2,:namemachine,:ceiling,:zones,:riset,:finish,:setdif1,:setdif2,:set1,:set2,:set3,:set4,:set5,:set6) where ID="+ macid2,map1);
		model.addAttribute(J);
		//macDao.editMachine(macid2,set_dif1,namemachine,ceiling,zones,riset,finish,setdif1,setdif2,set1,set2,set3,set4,set5,set6,model);
		return "finEditMachine";
	}
	
	@RequestMapping("/controller/finDeleteMachine")
	public String finDeleteMachine(@RequestParam(required=false) Integer ID, String namemachine,Model model){
		List<Map<String, Object>>finDeleteMachine = macDao.selectAll();
		model.addAttribute("namemachine", finDeleteMachine);
		//ボタンもformで囲わなければならない、削除と編集二つの機能を囲いたいときどうすれば？それか単純に二つをわける
		macDao.deleteMachine(namemachine);
		//jdbcn.update("delete from MACHINE_TABLE where ID=?",namemachine);
		return "finDeleteMachine";
	}
}
