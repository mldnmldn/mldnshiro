package cn.mldn.test.pwd;

import org.junit.Test;

import cn.mldn.util.enctype.PasswordUtil;

public class TestPassword {
	@Test
	public void test() {
		System.out.println(PasswordUtil.encoder("java"));
	}
}
