package jp.co.sbps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void add_正数同士の和が返却されることを確認する() {
		//setup
		Calc calc = new Calc();
		//calc.init();
		
		
		int actual = calc.add(5, 7);
		assertThat(actual,is(13));
	}

}
