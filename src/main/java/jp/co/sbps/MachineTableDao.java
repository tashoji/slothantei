package jp.co.sbps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
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

//MachineNameテーブルにアクセスするためのクラス
@Component
public class MachineTableDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	private JdbcTemplate jdbcn;
	
	public List<Map<String, Object>> selectAll() {
		return jdbcn.queryForList("select * from MACHINE_TABLE");
	}

	public void deleteMachine(String namemachine) {
		jdbcn.update("delete from MACHINE_TABLE where MACHINE_NAME=?",namemachine);
	}
	
	public void editMachine(Integer macid2,String set_dif1, String namemachine,Integer ceiling,String zones,String riset,String finish,String setdif1,String setdif2,Integer set1,Integer set2,Integer set3,Integer set4,Integer set5,Integer set6,Model model){
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
		jdbcn.update("update MACHINE_TABLE set(ID,machine_name,ceiling,zones,riset,finish,set_dif1,set_dif2,setting_1,setting_2,setting_3,setting_4,setting_5,setting_6) = (:macid2,:namemachine,:ceiling,:zones,:riset,:finish,:setdif1,:setdif2,:set1,:set2,:set3,:set4,:set5,:set6) where ID="+ macid2,map1);
	}
}
