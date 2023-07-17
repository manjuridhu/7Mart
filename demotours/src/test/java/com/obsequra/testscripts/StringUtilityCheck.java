package com.obsequra.testscripts;

import org.testng.annotations.Test;
import com.obsequra.utilties.StringUtility;
@Test
public class StringUtilityCheck {
public void StringUtilityCheck() {
		StringUtility su=new StringUtility();
		int l=su.StringLength();
		System.out.println(l);
		char ch=su.charactor();
		System.out.println(ch);
		String s1=su.concatString();
		System.out.println(s1);
		boolean b1=su.stringEquals();
		System.out.println(b1);
		boolean b2=su.stringEqualIgnore();
		System.out.println(b2);
		String s2=su.returnUpperCase();
		System.out.println(s2);
		String s3=su.returnLowerCase();
		System.out.println(s3);
		String s4=su.replaceLetter();
		System.out.println(s4);
	}

}
