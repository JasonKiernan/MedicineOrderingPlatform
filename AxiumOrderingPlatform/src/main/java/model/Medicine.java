package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@Entity
@DynamicUpdate
public class Medicine {
	
	
	public Medicine() {
		super();
	}
	
	@Id
	@Column(name="id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="cat")
	private String cat;

	@Column(name="ananum")
	private String ananum;
	@Column(name="barcode")
	private String barcode;
	@Column(name="gmsno")
	private String gmsno;
	@Column(name="tradename")
	private String tradename;
	@Column(name="ps")
	private String ps;
	@Column(name="psno")
	private String psno;
	@Column(name="psunits")
	private String psunits;
	@Column(name="manu")
	private String manu;
	@Column(name="agent")
	private String agent;
	@Column(name="icpingredientCostPrice")
	private String icpingredientCostPrice;
	@Column(name="manufacturerRetailPrice")
	private String  manufacturerRetailPrice;
	@Column(name="vat")
	private String vat;
	@Column(name="up")
	private String up;
	@Column(name="coschange")
	private String coschange;
	@Column(name="pc")
	private String pc;
	@Column(name="pa")
	private String pa;
	@Column(name="euroicpingredientCostPrice")
	private String euroicpingredientCostPrice;
	public String getCat() {
		return cat;
	}
	public Medicine(Integer id, String cat, String ananum, String barcode, String gmsno, String tradename, String ps, String psno,
			String psunits, String manu, String agent, String icpingredientCostPrice, String manufacturerRetailPrice,
			String vat, String up, String coschange, String pc, String pa, String euroicpingredientCostPrice,
			String genname, String date, String warnings, String ingred1, String ingred2, String atc1, String atc2,
			String dentist, String counsel, String strength, String forms, String i_01, String i_02, String i_03,
			String i_04, String i_05, String i_06, String i_07, String i_08, String i_09, String i_10, String a_01,
			String a_02, String a_03, String a_04, String a_05, String a_06, String a_07, String a_08, String a_09,
			String a_10, String barcode_1, String barcode_2, String barcode_3, String barcode_4, String barcode_5,
			String barcode_6, String gms1, String epos_cat, String epos_dept) {
		super();
		this.cat = cat;
		this.ananum = ananum;
		this.barcode = barcode;
		this.gmsno = gmsno;
		this.tradename = tradename;
		this.ps = ps;
		this.psno = psno;
		this.psunits = psunits;
		this.manu = manu;
		this.agent = agent;
		this.icpingredientCostPrice = icpingredientCostPrice;
		this.manufacturerRetailPrice = manufacturerRetailPrice;
		this.vat = vat;
		this.up = up;
		this.coschange = coschange;
		this.pc = pc;
		this.pa = pa;
		this.euroicpingredientCostPrice = euroicpingredientCostPrice;
		this.genname = genname;
		this.date = date;
		this.warnings = warnings;
		this.ingred1 = ingred1;
		this.ingred2 = ingred2;
		this.atc1 = atc1;
		this.atc2 = atc2;
		this.dentist = dentist;
		this.counsel = counsel;
		this.strength = strength;
		this.forms = forms;
		this.i_01 = i_01;
		this.i_02 = i_02;
		this.i_03 = i_03;
		this.i_04 = i_04;
		this.i_05 = i_05;
		this.i_06 = i_06;
		this.i_07 = i_07;
		this.i_08 = i_08;
		this.i_09 = i_09;
		this.i_10 = i_10;
		this.a_01 = a_01;
		this.a_02 = a_02;
		this.a_03 = a_03;
		this.a_04 = a_04;
		this.a_05 = a_05;
		this.a_06 = a_06;
		this.a_07 = a_07;
		this.a_08 = a_08;
		this.a_09 = a_09;
		this.a_10 = a_10;
		this.barcode_1 = barcode_1;
		this.barcode_2 = barcode_2;
		this.barcode_3 = barcode_3;
		this.barcode_4 = barcode_4;
		this.barcode_5 = barcode_5;
		this.barcode_6 = barcode_6;
		this.gms1 = gms1;
		this.epos_cat = epos_cat;
		this.epos_dept = epos_dept;
	}
	@Override
	public String toString() {
		return "Medicine [cat=" + cat + ", ananum=" + ananum + ", barcode=" + barcode + ", gmsno=" + gmsno
				+ ", tradename=" + tradename + ", ps=" + ps + ", psno=" + psno + ", psunits=" + psunits + ", manu="
				+ manu + ", agent=" + agent + ", icpingredientCostPrice=" + icpingredientCostPrice
				+ ", manufacturerRetailPrice=" + manufacturerRetailPrice + ", vat=" + vat + ", up=" + up
				+ ", coschange=" + coschange + ", pc=" + pc + ", pa=" + pa + ", euroicpingredientCostPrice="
				+ euroicpingredientCostPrice + ", genname=" + genname + ", date=" + date + ", warnings=" + warnings
				+ ", ingred1=" + ingred1 + ", ingred2=" + ingred2 + ", atc1=" + atc1 + ", atc2=" + atc2 + ", dentist="
				+ dentist + ", counsel=" + counsel + ", strength=" + strength + ", forms=" + forms + ", i_01=" + i_01
				+ ", i_02=" + i_02 + ", i_03=" + i_03 + ", i_04=" + i_04 + ", i_05=" + i_05 + ", i_06=" + i_06
				+ ", i_07=" + i_07 + ", i_08=" + i_08 + ", i_09=" + i_09 + ", i_10=" + i_10 + ", a_01=" + a_01
				+ ", a_02=" + a_02 + ", a_03=" + a_03 + ", a_04=" + a_04 + ", a_05=" + a_05 + ", a_06=" + a_06
				+ ", a_07=" + a_07 + ", a_08=" + a_08 + ", a_09=" + a_09 + ", a_10=" + a_10 + ", barcode_1=" + barcode_1
				+ ", barcode_2=" + barcode_2 + ", barcode_3=" + barcode_3 + ", barcode_4=" + barcode_4 + ", barcode_5="
				+ barcode_5 + ", barcode_6=" + barcode_6 + ", gms1=" + gms1 + ", epos_cat=" + epos_cat + ", epos_dept="
				+ epos_dept + "]";
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getAnanum() {
		return ananum;
	}
	public void setAnanum(String ananum) {
		this.ananum = ananum;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getGmsno() {
		return gmsno;
	}
	public void setGmsno(String gmsno) {
		this.gmsno = gmsno;
	}
	public String getTradename() {
		return tradename;
	}
	public void setTradename(String tradename) {
		this.tradename = tradename;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getPsno() {
		return psno;
	}
	public void setPsno(String psno) {
		this.psno = psno;
	}
	public String getPsunits() {
		return psunits;
	}
	public void setPsunits(String psunits) {
		this.psunits = psunits;
	}
	public String getManu() {
		return manu;
	}
	public void setManu(String manu) {
		this.manu = manu;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getIcpingredientCostPrice() {
		return icpingredientCostPrice;
	}
	public void setIcpingredientCostPrice(String icpingredientCostPrice) {
		this.icpingredientCostPrice = icpingredientCostPrice;
	}
	public String getManufacturerRetailPrice() {
		return manufacturerRetailPrice;
	}
	public void setManufacturerRetailPrice(String manufacturerRetailPrice) {
		this.manufacturerRetailPrice = manufacturerRetailPrice;
	}
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public String getUp() {
		return up;
	}
	public void setUp(String up) {
		this.up = up;
	}
	public String getCoschange() {
		return coschange;
	}
	public void setCoschange(String coschange) {
		this.coschange = coschange;
	}
	public String getPc() {
		return pc;
	}
	public void setPc(String pc) {
		this.pc = pc;
	}
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	public String getEuroicpingredientCostPrice() {
		return euroicpingredientCostPrice;
	}
	public void setEuroicpingredientCostPrice(String euroicpingredientCostPrice) {
		this.euroicpingredientCostPrice = euroicpingredientCostPrice;
	}
	public String getGenname() {
		return genname;
	}
	public void setGenname(String genname) {
		this.genname = genname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWarnings() {
		return warnings;
	}
	public void setWarnings(String warnings) {
		this.warnings = warnings;
	}
	public String getIngred1() {
		return ingred1;
	}
	public void setIngred1(String ingred1) {
		this.ingred1 = ingred1;
	}
	public String getIngred2() {
		return ingred2;
	}
	public void setIngred2(String ingred2) {
		this.ingred2 = ingred2;
	}
	public String getAtc1() {
		return atc1;
	}
	public void setAtc1(String atc1) {
		this.atc1 = atc1;
	}
	public String getAtc2() {
		return atc2;
	}
	public void setAtc2(String atc2) {
		this.atc2 = atc2;
	}
	public String getDentist() {
		return dentist;
	}
	public void setDentist(String dentist) {
		this.dentist = dentist;
	}
	public String getCounsel() {
		return counsel;
	}
	public void setCounsel(String counsel) {
		this.counsel = counsel;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getForms() {
		return forms;
	}
	public void setForms(String forms) {
		this.forms = forms;
	}
	public String getI_01() {
		return i_01;
	}
	public void setI_01(String i_01) {
		this.i_01 = i_01;
	}
	public String getI_02() {
		return i_02;
	}
	public void setI_02(String i_02) {
		this.i_02 = i_02;
	}
	public String getI_03() {
		return i_03;
	}
	public void setI_03(String i_03) {
		this.i_03 = i_03;
	}
	public String getI_04() {
		return i_04;
	}
	public void setI_04(String i_04) {
		this.i_04 = i_04;
	}
	public String getI_05() {
		return i_05;
	}
	public void setI_05(String i_05) {
		this.i_05 = i_05;
	}
	public String getI_06() {
		return i_06;
	}
	public void setI_06(String i_06) {
		this.i_06 = i_06;
	}
	public String getI_07() {
		return i_07;
	}
	public void setI_07(String i_07) {
		this.i_07 = i_07;
	}
	public String getI_08() {
		return i_08;
	}
	public void setI_08(String i_08) {
		this.i_08 = i_08;
	}
	public String getI_09() {
		return i_09;
	}
	public void setI_09(String i_09) {
		this.i_09 = i_09;
	}
	public String getI_10() {
		return i_10;
	}
	public void setI_10(String i_10) {
		this.i_10 = i_10;
	}
	public String getA_01() {
		return a_01;
	}
	public void setA_01(String a_01) {
		this.a_01 = a_01;
	}
	public String getA_02() {
		return a_02;
	}
	public void setA_02(String a_02) {
		this.a_02 = a_02;
	}
	public String getA_03() {
		return a_03;
	}
	public void setA_03(String a_03) {
		this.a_03 = a_03;
	}
	public String getA_04() {
		return a_04;
	}
	public void setA_04(String a_04) {
		this.a_04 = a_04;
	}
	public String getA_05() {
		return a_05;
	}
	public void setA_05(String a_05) {
		this.a_05 = a_05;
	}
	public String getA_06() {
		return a_06;
	}
	public void setA_06(String a_06) {
		this.a_06 = a_06;
	}
	public String getA_07() {
		return a_07;
	}
	public void setA_07(String a_07) {
		this.a_07 = a_07;
	}
	public String getA_08() {
		return a_08;
	}
	public void setA_08(String a_08) {
		this.a_08 = a_08;
	}
	public String getA_09() {
		return a_09;
	}
	public void setA_09(String a_09) {
		this.a_09 = a_09;
	}
	public String getA_10() {
		return a_10;
	}
	public void setA_10(String a_10) {
		this.a_10 = a_10;
	}
	public String getBarcode_1() {
		return barcode_1;
	}
	public void setBarcode_1(String barcode_1) {
		this.barcode_1 = barcode_1;
	}
	public String getBarcode_2() {
		return barcode_2;
	}
	public void setBarcode_2(String barcode_2) {
		this.barcode_2 = barcode_2;
	}
	public String getBarcode_3() {
		return barcode_3;
	}
	public void setBarcode_3(String barcode_3) {
		this.barcode_3 = barcode_3;
	}
	public String getBarcode_4() {
		return barcode_4;
	}
	public void setBarcode_4(String barcode_4) {
		this.barcode_4 = barcode_4;
	}
	public String getBarcode_5() {
		return barcode_5;
	}
	public void setBarcode_5(String barcode_5) {
		this.barcode_5 = barcode_5;
	}
	public String getBarcode_6() {
		return barcode_6;
	}
	public void setBarcode_6(String barcode_6) {
		this.barcode_6 = barcode_6;
	}
	public String getGms1() {
		return gms1;
	}
	public void setGms1(String gms1) {
		this.gms1 = gms1;
	}
	public String getEpos_cat() {
		return epos_cat;
	}
	public void setEpos_cat(String epos_cat) {
		this.epos_cat = epos_cat;
	}
	public String getEpos_dept() {
		return epos_dept;
	}
	public void setEpos_dept(String epos_dept) {
		this.epos_dept = epos_dept;
	}
	@Column(name="genname")
	private String genname;
	@Column(name="date_")
	private String date;
	@Column(name="warnings_")
	private String warnings;
	@Column(name="ingred1")
	private String ingred1;
	@Column(name="ingred2")
	private String ingred2;
	@Column(name="atc1")
	private String atc1;
	@Column(name="atc2")
	private String atc2;
	@Column(name="dentist")
	private String dentist;
	@Column(name="counsel")
	private String counsel;
	@Column(name="strength")
	private String strength;
	@Column(name="forms")
	private String forms;
	@Column(name="i_01")
	private String i_01;
	@Column(name="i_02")
	private String i_02;
	@Column(name="i_03")
	private String i_03;
	@Column(name="i_04")
	private String i_04;
	@Column(name="i_05")
	private String i_05;
	@Column(name="i_06")
	private String i_06;
	@Column(name="i_07")
	private String i_07;
	@Column(name="i_08")
	private String i_08;
	@Column(name="i_09")
	private String i_09;
	@Column(name="i_10")
	private String i_10;
	@Column(name="a_01")
	private String a_01;
	@Column(name="a_02")
	private String a_02;
	@Column(name="a_03")
	private String a_03;
	@Column(name="a_04")
	private String a_04;
	@Column(name="a_05")
	private String a_05;
	@Column(name="a_06")
	private String a_06;
	@Column(name="a_07")
	private String a_07;
	@Column(name="a_08")
	private String a_08;
	@Column(name="a_09")
	private String a_09;
	@Column(name="a_10")
	private String a_10;
	@Column(name="barcode_1")
	private String barcode_1;
	@Column(name="barcode_2")
	private String barcode_2;
	@Column(name="barcode_3")
	private String barcode_3;
	@Column(name="barcode_4")
	private String barcode_4;
	@Column(name="barcode_5")
	private String barcode_5;
	@Column(name="barcode_6")
	private String barcode_6;
	@Column(name="gms1")
	private String gms1;
	@Column(name="epos_cat")
	private String epos_cat;
	@Column(name="epos_dept")
	private String epos_dept;


}

