package jp.co.sbps.entity;
import jp.co.sbps.entity.MachineTable;
import java.io.Serializable;

/**
 * 機種詳細テーブル モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class MachineTable implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 機種ID. */
	private Integer id;

	/** 機種名. */
	private String machineName;

	/** 天井. */
	private Integer ceiling;

	/** ゾーン. */
	private String zones;

	/** リセット. */
	private String riset;

	/** ヤメ時. */
	private String finish;

	/** 設定差項目1. */
	private String setDif1;

	/** 設定差項目2. */
	private String setDif2;

	/** 設定1. */
	private Integer setting1;

	/** 設定2. */
	private Integer setting2;

	/** 設定3. */
	private Integer setting3;

	/** 設定4. */
	private Integer setting4;

	/** 設定5. */
	private Integer setting5;

	/** 設定6. */
	private Integer setting6;

	/** 設定21. */
	private Integer setting21;

	/** 設定22. */
	private Integer setting22;

	/** 設定23. */
	private Integer setting23;

	/** 設定24. */
	private Integer setting24;

	/** 設定25. */
	private Integer setting25;

	/** 設定26. */
	private Integer setting26;

	/** 機械割1. */
	private Integer split1;

	/** 機械割2. */
	private Integer split2;

	/** 機械割3. */
	private Integer split3;

	/** 機械割4. */
	private Integer split4;

	/** 機械割5. */
	private Integer split5;

	/** 機械割6. */
	private Integer split6;

	/** 機械割21. */
	private Integer split21;

	/** 機械割22. */
	private Integer split22;

	/** 機械割23. */
	private Integer split23;

	/** 機械割24. */
	private Integer split24;

	/** 機械割25. */
	private Integer split25;

	/** 機械割26. */
	private Integer split26;

	/**
	 * コンストラクタ.
	 */
	public MachineTable() {
	}

	/**
	 * 機種ID を設定します.
	 * 
	 * @param id
	 *            機種ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 機種ID を取得します.
	 * 
	 * @return 機種ID
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * 機種名 を設定します.
	 * 
	 * @param machineName
	 *            機種名
	 */
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	/**
	 * 機種名 を取得します.
	 * 
	 * @return 機種名
	 */
	public String getMachineName() {
		return this.machineName;
	}

	/**
	 * 天井 を設定します.
	 * 
	 * @param ceiling
	 *            天井
	 */
	public void setCeiling(Integer ceiling) {
		this.ceiling = ceiling;
	}

	/**
	 * 天井 を取得します.
	 * 
	 * @return 天井
	 */
	public Integer getCeiling() {
		return this.ceiling;
	}

	/**
	 * ゾーン を設定します.
	 * 
	 * @param zones
	 *            ゾーン
	 */
	public void setZones(String zones) {
		this.zones = zones;
	}

	/**
	 * ゾーン を取得します.
	 * 
	 * @return ゾーン
	 */
	public String getZones() {
		return this.zones;
	}

	/**
	 * リセット を設定します.
	 * 
	 * @param riset
	 *            リセット
	 */
	public void setRiset(String riset) {
		this.riset = riset;
	}

	/**
	 * リセット を取得します.
	 * 
	 * @return リセット
	 */
	public String getRiset() {
		return this.riset;
	}

	/**
	 * ヤメ時 を設定します.
	 * 
	 * @param finish
	 *            ヤメ時
	 */
	public void setFinish(String finish) {
		this.finish = finish;
	}

	/**
	 * ヤメ時 を取得します.
	 * 
	 * @return ヤメ時
	 */
	public String getFinish() {
		return this.finish;
	}

	/**
	 * 設定差項目1 を設定します.
	 * 
	 * @param setDif1
	 *            設定差項目1
	 */
	public void setSetDif1(String setDif1) {
		this.setDif1 = setDif1;
	}

	/**
	 * 設定差項目1 を取得します.
	 * 
	 * @return 設定差項目1
	 */
	public String getSetDif1() {
		return this.setDif1;
	}

	/**
	 * 設定差項目2 を設定します.
	 * 
	 * @param setDif2
	 *            設定差項目2
	 */
	public void setSetDif2(String setDif2) {
		this.setDif2 = setDif2;
	}

	/**
	 * 設定差項目2 を取得します.
	 * 
	 * @return 設定差項目2
	 */
	public String getSetDif2() {
		return this.setDif2;
	}

	/**
	 * 設定1 を設定します.
	 * 
	 * @param setting1
	 *            設定1
	 */
	public void setSetting_1(Integer setting1) {
		this.setting1 = setting1;
	}

	/**
	 * 設定1 を取得します.
	 * 
	 * @return 設定1
	 */
	public Integer getSetting_1() {
		return this.setting1;
	}

	/**
	 * 設定2 を設定します.
	 * 
	 * @param setting2
	 *            設定2
	 */
	public void setSetting_2(Integer setting2) {
		this.setting2 = setting2;
	}

	/**
	 * 設定2 を取得します.
	 * 
	 * @return 設定2
	 */
	public Integer getSetting_2() {
		return this.setting2;
	}

	/**
	 * 設定3 を設定します.
	 * 
	 * @param setting3
	 *            設定3
	 */
	public void setSetting_3(Integer setting3) {
		this.setting3 = setting3;
	}

	/**
	 * 設定3 を取得します.
	 * 
	 * @return 設定3
	 */
	public Integer getSetting_3() {
		return this.setting3;
	}

	/**
	 * 設定4 を設定します.
	 * 
	 * @param setting4
	 *            設定4
	 */
	public void setSetting_4(Integer setting4) {
		this.setting4 = setting4;
	}

	/**
	 * 設定4 を取得します.
	 * 
	 * @return 設定4
	 */
	public Integer getSetting_4() {
		return this.setting4;
	}

	/**
	 * 設定5 を設定します.
	 * 
	 * @param setting5
	 *            設定5
	 */
	public void setSetting_5(Integer setting5) {
		this.setting5 = setting5;
	}

	/**
	 * 設定5 を取得します.
	 * 
	 * @return 設定5
	 */
	public Integer getSetting_5() {
		return this.setting5;
	}

	/**
	 * 設定6 を設定します.
	 * 
	 * @param setting6
	 *            設定6
	 */
	public void setSetting_6(Integer setting6) {
		this.setting6 = setting6;
	}

	/**
	 * 設定6 を取得します.
	 * 
	 * @return 設定6
	 */
	public Integer getSetting_6() {
		return this.setting6;
	}

	/**
	 * 設定21 を設定します.
	 * 
	 * @param setting21
	 *            設定21
	 */
	public void setSetting2_1(Integer setting21) {
		this.setting21 = setting21;
	}

	/**
	 * 設定21 を取得します.
	 * 
	 * @return 設定21
	 */
	public Integer getSetting2_1() {
		return this.setting21;
	}

	/**
	 * 設定22 を設定します.
	 * 
	 * @param setting22
	 *            設定22
	 */
	public void setSetting2_2(Integer setting22) {
		this.setting22 = setting22;
	}

	/**
	 * 設定22 を取得します.
	 * 
	 * @return 設定22
	 */
	public Integer getSetting2_2() {
		return this.setting22;
	}

	/**
	 * 設定23 を設定します.
	 * 
	 * @param setting23
	 *            設定23
	 */
	public void setSetting2_3(Integer setting23) {
		this.setting23 = setting23;
	}

	/**
	 * 設定23 を取得します.
	 * 
	 * @return 設定23
	 */
	public Integer getSetting2_3() {
		return this.setting23;
	}

	/**
	 * 設定24 を設定します.
	 * 
	 * @param setting24
	 *            設定24
	 */
	public void setSetting2_4(Integer setting24) {
		this.setting24 = setting24;
	}

	/**
	 * 設定24 を取得します.
	 * 
	 * @return 設定24
	 */
	public Integer getSetting2_4() {
		return this.setting24;
	}

	/**
	 * 設定25 を設定します.
	 * 
	 * @param setting25
	 *            設定25
	 */
	public void setSetting2_5(Integer setting25) {
		this.setting25 = setting25;
	}

	/**
	 * 設定25 を取得します.
	 * 
	 * @return 設定25
	 */
	public Integer getSetting2_5() {
		return this.setting25;
	}

	/**
	 * 設定26 を設定します.
	 * 
	 * @param setting26
	 *            設定26
	 */
	public void setSetting2_6(Integer setting26) {
		this.setting26 = setting26;
	}

	/**
	 * 設定26 を取得します.
	 * 
	 * @return 設定26
	 */
	public Integer getSetting2_6() {
		return this.setting26;
	}

	/**
	 * 機械割1 を設定します.
	 * 
	 * @param split1
	 *            機械割1
	 */
	public void setSplit1(Integer split1) {
		this.split1 = split1;
	}

	/**
	 * 機械割1 を取得します.
	 * 
	 * @return 機械割1
	 */
	public Integer getSplit1() {
		return this.split1;
	}

	/**
	 * 機械割2 を設定します.
	 * 
	 * @param split2
	 *            機械割2
	 */
	public void setSplit2(Integer split2) {
		this.split2 = split2;
	}

	/**
	 * 機械割2 を取得します.
	 * 
	 * @return 機械割2
	 */
	public Integer getSplit2() {
		return this.split2;
	}

	/**
	 * 機械割3 を設定します.
	 * 
	 * @param split3
	 *            機械割3
	 */
	public void setSplit3(Integer split3) {
		this.split3 = split3;
	}

	/**
	 * 機械割3 を取得します.
	 * 
	 * @return 機械割3
	 */
	public Integer getSplit3() {
		return this.split3;
	}

	/**
	 * 機械割4 を設定します.
	 * 
	 * @param split4
	 *            機械割4
	 */
	public void setSplit4(Integer split4) {
		this.split4 = split4;
	}

	/**
	 * 機械割4 を取得します.
	 * 
	 * @return 機械割4
	 */
	public Integer getSplit4() {
		return this.split4;
	}

	/**
	 * 機械割5 を設定します.
	 * 
	 * @param split5
	 *            機械割5
	 */
	public void setSplit5(Integer split5) {
		this.split5 = split5;
	}

	/**
	 * 機械割5 を取得します.
	 * 
	 * @return 機械割5
	 */
	public Integer getSplit5() {
		return this.split5;
	}

	/**
	 * 機械割6 を設定します.
	 * 
	 * @param split6
	 *            機械割6
	 */
	public void setSplit6(Integer split6) {
		this.split6 = split6;
	}

	/**
	 * 機械割6 を取得します.
	 * 
	 * @return 機械割6
	 */
	public Integer getSplit6() {
		return this.split6;
	}

	/**
	 * 機械割21 を設定します.
	 * 
	 * @param split21
	 *            機械割21
	 */
	public void setSplit21(Integer split21) {
		this.split21 = split21;
	}

	/**
	 * 機械割21 を取得します.
	 * 
	 * @return 機械割21
	 */
	public Integer getSplit21() {
		return this.split21;
	}

	/**
	 * 機械割22 を設定します.
	 * 
	 * @param split22
	 *            機械割22
	 */
	public void setSplit22(Integer split22) {
		this.split22 = split22;
	}

	/**
	 * 機械割22 を取得します.
	 * 
	 * @return 機械割22
	 */
	public Integer getSplit22() {
		return this.split22;
	}

	/**
	 * 機械割23 を設定します.
	 * 
	 * @param split23
	 *            機械割23
	 */
	public void setSplit23(Integer split23) {
		this.split23 = split23;
	}

	/**
	 * 機械割23 を取得します.
	 * 
	 * @return 機械割23
	 */
	public Integer getSplit23() {
		return this.split23;
	}

	/**
	 * 機械割24 を設定します.
	 * 
	 * @param split24
	 *            機械割24
	 */
	public void setSplit24(Integer split24) {
		this.split24 = split24;
	}

	/**
	 * 機械割24 を取得します.
	 * 
	 * @return 機械割24
	 */
	public Integer getSplit24() {
		return this.split24;
	}

	/**
	 * 機械割25 を設定します.
	 * 
	 * @param split25
	 *            機械割25
	 */
	public void setSplit25(Integer split25) {
		this.split25 = split25;
	}

	/**
	 * 機械割25 を取得します.
	 * 
	 * @return 機械割25
	 */
	public Integer getSplit25() {
		return this.split25;
	}

	/**
	 * 機械割26 を設定します.
	 * 
	 * @param split26
	 *            機械割26
	 */
	public void setSplit26(Integer split26) {
		this.split26 = split26;
	}

	/**
	 * 機械割26 を取得します.
	 * 
	 * @return 機械割26
	 */
	public Integer getSplit26() {
		return this.split26;
	}


}
