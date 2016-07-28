package jp.co.sbps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jp.co.sbps.entity.MachineTable;
import jp.co.sbps.form.MachineForm;

@Controller
public class ControllerSlot {

	@Autowired
	private MachineTableDao macDao;
	
	@RequestMapping("/controller/title")
	public String title(Model model) {
		return "title";
	}

	@RequestMapping("/controller/selectMachine")
	public String selectMachine(Model model) {
		List<MachineTable> selectMachine = macDao.selectAll();
		model.addAttribute("selectMachine", selectMachine);
		return "selectMachine";
	}
	
	@RequestMapping("/controller/machine")
	public String machine(@RequestParam(required = false) MachineForm machineForm, Model model) {
		List<MachineTable> machine = macDao.selectAll();
		model.addAttribute("machineform", machineForm);
		model.addAttribute("machines", machine);
		return "machine";
	}
	
	@RequestMapping("/controller/nums")
	public String nums(@RequestParam(required = false) MachineForm machineForm, Model model) {
		model.addAttribute("machineform", machineForm);
		return "title";
	}

	@RequestMapping(value = "/controller/detail")
	public String detail(@RequestParam(required = false)Integer macid1, Model model) {
		MachineTable detail = macDao.selectID(macid1);
		model.addAttribute("detail", detail);
		model.addAttribute("macid1", macid1);

		return "detail";
	}

	@RequestMapping("/controller/hantei")
	public String hantei(@RequestParam(required = false) String macn1, Integer macid1, MachineForm machineform, String setdif1, String setdif2, Integer hantei1, Integer hantei2,
			Integer hantei3, Integer set1, Integer set2, Integer set3, Integer set4, Integer set5, Integer set6,
			Integer set21, Integer set22, Integer set23, Integer set24, Integer set25, Integer set26, Model model) {
		MachineTable detail =  macDao.selectID(macid1);

		// 設定判別とその説明下
		// hantei1(回転ゲーム数)÷hantei2（子役数）= kakusa1(子役確率)
		// 例500÷5=100
		// （set1(設定1の子役確率)＋set2(設定2の子役確率)）÷２ = kakuritu1(設定1と2の中間の確率)
		// 例(150+140)÷2=145
		// kakusa1がkakuritu1より大きければ設定1
		// （set2(設定2の子役確率)＋set3(設定3の子役確率)）÷２ = kakuritu2
		// kakusa1がkakuritu1より小さく、kakuritu2より大きければ設定2
		//mainMachine.Judge();
		
		int kakusa1;
		int kakusa2;
		int kakuritu1;
		int kakuritu2;
		int kakuritu3;
		int kakuritu4;
		int kakuritu5;
		int kakuritu21;
		int kakuritu22;
		int kakuritu23;
		int kakuritu24;
		int kakuritu25;
		String forecast;
		String forecast2;

		kakusa1 = hantei1 / hantei2;
		kakusa2 = hantei1 / hantei3;
		kakuritu1 = (set1 + set2) / 2;
		kakuritu2 = (set2 + set3) / 2;
		kakuritu3 = (set3 + set4) / 2;
		kakuritu4 = (set4 + set5) / 2;
		kakuritu5 = (set5 + set6) / 2;
		kakuritu21 = (set21 + set22) / 2;
		kakuritu22 = (set22 + set23) / 2;
		kakuritu23 = (set23 + set24) / 2;
		kakuritu24 = (set24 + set25) / 2;
		kakuritu25 = (set25 + set26) / 2;

		if (kakusa1 >= kakuritu1) {
			forecast = "1: " + setdif1 + "確率は「設定1」の近似値またはそれ以下です。";
		} else if (kakusa1 >= kakuritu2) {
			forecast = "1: " + setdif1 + "確率は「設定2」の近似値です。";
		} else if (kakusa1 >= kakuritu3) {
			forecast = "1: " + setdif1 + "確率は「設定3」の近似値です。";
		} else if (kakusa1 >= kakuritu4) {
			forecast = "1: " + setdif1 + "確率は「設定4」の近似値です。";
		} else if (kakusa1 >= kakuritu5) {
			forecast = "1: " + setdif1 + "確率は「設定5」の近似値です。";
		} else {
			forecast = "1: " + setdif1 + "確率は「設定6」の近似値またはそれ以上です。";
		}

		if (kakusa2 >= kakuritu21) {
			forecast2 = "2: " + setdif2 + "確率は「設定1」の近似値またはそれ以下です。";
		} else if (kakusa2 >= kakuritu22) {
			forecast2 = "2: " + setdif2 + "確率は「設定2」の近似値です。";
		} else if (kakusa2 >= kakuritu23) {
			forecast2 = "2: " + setdif2 + "確率は「設定3」の近似値です。";
		} else if (kakusa2 >= kakuritu24) {
			forecast2 = "2: " + setdif2 + "確率は「設定4」の近似値です。";
		} else if (kakusa2 >= kakuritu25) {
			forecast2 = "2: " + setdif2 + "確率は「設定5」の近似値です。";
		} else {
			forecast2 = "2: " + setdif2 + "確率は「設定6」の近似値またはそれ以上です。";
		}
		model.addAttribute("hantei1", hantei1);
		model.addAttribute("hantei2", hantei2);
		model.addAttribute("hantei3", hantei3);
		model.addAttribute("detail", detail);
		model.addAttribute("macn1", macn1);
		model.addAttribute("macid", macid1);
		model.addAttribute("setdif1", setdif1);
		model.addAttribute("setdif2", setdif2);
		model.addAttribute("set1", set1);
		model.addAttribute("set2", set2);
		model.addAttribute("set3", set3);
		model.addAttribute("set4", set4);
		model.addAttribute("set5", set5);
		model.addAttribute("set6", set6);
		model.addAttribute("set21", set21);
		model.addAttribute("set22", set22);
		model.addAttribute("set23", set23);
		model.addAttribute("set24", set24);
		model.addAttribute("set25", set25);
		model.addAttribute("set26", set26);
		model.addAttribute("forecast", forecast);
		model.addAttribute("forecast2", forecast2);
		return "detail";
	}

	@RequestMapping("/controller/count")
	public String count() {
		return "count";
	}

	@RequestMapping("/controller/addMachine")
	public String addMachine() {
		return "addMachine";
	}

	@RequestMapping("/controller/editMachine")
	public String editMachine(@RequestParam(required = false) Integer macid , Model model) {
		MachineTable detail = macDao.editID(macid);
		model.addAttribute("detail", detail);
		model.addAttribute("macid", macid);
		return "editMachine";
	}
	
	@RequestMapping("/controller/error")
	public String error() {
		return "error";
	}

	@RequestMapping("/controller/finNewMachine")
	public String finNewMachine(@ModelAttribute MachineForm machineform,Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map = machineform.edMachine();		
		model.addAttribute("map1", map);
		macDao.insert(map);	
		return "finNewMachine";
		}

	@RequestMapping("/controller/finEditMachine")
	public String finEditMachine(@ModelAttribute MachineForm machineform, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		map = machineform.edMachine();
		model.addAttribute("map1", map);	
		macDao.update(map);
		return "finEditMachine";
	}

	@RequestMapping("/controller/finDeleteMachine")
	public String finDeleteMachine(@RequestParam(required = false) String namemachine, Model model) {
		List<MachineTable> finDeleteMachine = macDao.selectAll();
		model.addAttribute("namemachine", finDeleteMachine);
		macDao.deleteMachine(namemachine);
		return "finDeleteMachine";
	}
	
}
