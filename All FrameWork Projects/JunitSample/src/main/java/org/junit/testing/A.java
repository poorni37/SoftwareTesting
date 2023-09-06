package org.junit.testing;

import org.base.BaseClass;
import org.junit.Test;

public class A extends BaseClass {

	@Test
	public void tc21() {
		System.out.println("Tc21");
		launchUrl("https://www.myntra.com/");
	}

	@Test
	public void tc29() {
		System.out.println("Tc29");
	}

	@Test
	public void tc23() {
		System.out.println("Tc23");

	}

}
