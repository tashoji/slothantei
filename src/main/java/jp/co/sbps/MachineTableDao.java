package jp.co.sbps;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import jp.co.sbps.entity.MachineTable;

//MachineNameテーブルにアクセスするためのクラス
@Component
public class MachineTableDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	private JdbcTemplate jdbcn;
	
	public List<MachineTable> selectAll() {
		return jdbcn.query("select * from MACHINE_TABLE" ,
				new BeanPropertyRowMapper<>(MachineTable.class));
	}
	
	public MachineTable selectID(Integer macid1) {
		return jdbcn.queryForObject("select * from MACHINE_TABLE where ID =?",
				new BeanPropertyRowMapper<>(MachineTable.class), macid1);
	}
	
	public MachineTable editID(Integer macid) {
		return jdbcn.queryForObject("select * from MACHINE_TABLE where ID =?",new BeanPropertyRowMapper<>(MachineTable.class), macid);
	}

	public void deleteMachine(String namemachine) {
		jdbcn.update("delete from MACHINE_TABLE where MACHINE_NAME=?", namemachine);
	}
	
	/**
	 * 更新をおこなう
	 * 
	 * @param entityMap 更新情報
	 * @return 更新件数
	 */
	public int update(Map<String, Object> entityMap){
		return jdbc.update(	
				"update MACHINE_TABLE set machine_name = :macn2,ceiling = :ceiling ,zones = :zones, riset = :riset , finish = :finish , set_dif1 = :setdif1 , set_dif2 = :setdif2 , setting_1 = :set1 , setting_2 = :set2 , setting_3 = :set3 , setting_4 = :set4 , setting_5 = :set5 , setting_6 = :set6 , setting2_1 = :set21, setting2_2 = :set22 , setting2_3 = :set23 , setting2_4 = :set24 ,setting2_5 = :set25 , setting2_6 = :set26 , split1 = :split1 , split2 = :split2 , split3 = :split3 , split4 = :split4 ,split5 = :split5 ,split6 = :split6 , split21 = :split21 , split22 = :split22 , split23 = :split23 , split24 = :split24 , split25 = :split25 , split26 = :split26 where id=:id" ,entityMap);
		}
	
	public int insert(Map<String, Object> newMap){
		return jdbc.update(	
				"insert into MACHINE_TABLE (machine_name,ceiling,zones,riset,finish,set_dif1,set_dif2,setting_1,setting_2,setting_3,setting_4,setting_5,setting_6,setting2_1,setting2_2,setting2_3,setting2_4,setting2_5,setting2_6,split1,split2,split3,split4,split5,split6,split21,split22,split23,split24,split25,split26) values(:title,:ceiling,:zones,:riset,:finish,:setdif1,:setdif2,:set1,:set2,:set3,:set4,:set5,:set6,:set21,:set22,:set23,:set24,:set25,:set26,:split1,:split2,:split3,:split4,:split5,:split6,:split21,:split22,:split23,:split24,:split25,:split26)",newMap);
		}
}
