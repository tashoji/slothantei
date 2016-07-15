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
		model.addAttribute("id", id);
		model.addAttribute("machines", machine);
		System.out.println(id);
		System.out.println(machine);
		//htmlの指定
		return "machine";
	}
	
	@RequestMapping("/controller/detail")
	public String detail(@RequestParam(required=false)String macn1,Integer macid1, String zones,String riset,String finish,String setdif1,String setdif2, Integer ceiling,Integer hantei1,Integer hantei2,Integer hantei3,Integer set1,Integer set2,Integer set3,Integer set4,Integer set5,Integer set6,Model model){
		List<Map<String, Object>>detail = jdbcn.queryForList("select * from MACHINE_TABLE where ID =?",macid1);
		model.addAttribute("detail", detail);
		model.addAttribute("ceiling", ceiling);
		model.addAttribute("macn1", macn1);
		model.addAttribute("macid", macid1);
		model.addAttribute("zones", zones);
		model.addAttribute("riset", riset);
		model.addAttribute("finish", finish);
		model.addAttribute("setdif1", setdif1);
		model.addAttribute("setdif2", setdif2);
		model.addAttribute("set1", set1);
		model.addAttribute("set2", set2);
		model.addAttribute("set3", set3);
		model.addAttribute("set4", set4);
		model.addAttribute("set5", set5);
		model.addAttribute("set6", set6);
		System.out.println("detail:"+detail);
		System.out.println(hantei1);
		
		return "detail";
	}
	
	@RequestMapping("/controller/hantei")
	public String hantei(@RequestParam(required=false)String macn1,Integer macid1, String zones,String riset,String finish,String setdif1,String setdif2,Integer hantei1,Integer hantei2,Integer hantei3,Integer set1,Integer set2,Integer set3,Integer set4,Integer set5,Integer set6,Model model){
		//List<Map<String, Object>>detail = jdbcn.queryForList("select * from MACHINE_TABLE");
		System.out.println("hantei1:"+hantei1);
		System.out.println(hantei2);	
		System.out.println(hantei3);
		model.addAttribute("hantei1", hantei1);
		model.addAttribute("hantei2", hantei2);
		model.addAttribute("hantei3", hantei3);
		System.out.println(set1);

//設定判別とその説明下
		//hantei1(回転ゲーム数)÷hantei2（子役数）= kakusa1(子役確率)
		//例500÷5=100
		//（set1(設定1の子役確率)＋set2(設定2の子役確率)）÷２ = kakuritu1(設定1と2の中間の確率)
		//例(150+140)÷2=145 
		//kakusa1がkakuritu1より大きければ設定1
		//（set2(設定2の子役確率)＋set3(設定3の子役確率)）÷２ = kakuritu2
		//kakusa1がkakuritu1より小さく、kakuritu2より大きければ設定2
		
//		int kakusa1;
//		int kakusa2;
//		int kakuritu1;
//		int kakuritu2;
//		int kakuritu3;
//		int kakuritu4;
//		int kakuritu5;
//		
//		kakusa1 = hantei1 /hantei2;
//		kakusa2 = hantei1 /hantei3;
//		kakuritu1 = (set1 + set2) / 2;
//		kakuritu2 = (set2 + set3) / 2;
//		kakuritu3 = (set3 + set4) / 2;
//		kakuritu4 = (set4 + set5) / 2;
//		kakuritu5 = (set5 + set6) / 2;
//			
//		if (kakusa1 <= kakuritu1) {
//			System.out.println(setdif1 +"確率は設定1の近似値またはそれ以上です");
//		} else if (kakusa1 <= kakuritu2) {
//			System.out.println(setdif1 +"確率は設定2の近似値です");
//		} else if (kakusa1 <= kakuritu3) {
//			System.out.println(setdif1 +"確率は設定3の近似値です");
//		} else if (kakusa1 <= kakuritu4) {
//			System.out.println(setdif1 +"確率は設定4の近似値です");
//		} else if (kakusa1 <= kakuritu5) {
//			System.out.println(setdif1 +"確率は設定5の近似値です");
//		}else{
//			System.out.println(setdif1 +"確率は設定6の近似値またはそれ以上です");
//			}

//設定判別とその説明上
//hantei1,hantei2

		return "redirect:/controller/detail";
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
