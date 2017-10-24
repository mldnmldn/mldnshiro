package cn.mldn.mldnshiro.service;

import cn.mldn.mldnshiro.vo.Member;

public interface IMemberService {
	/**
	 * 根据用户编号获取一个用户的信息，用户是否存在、锁定状态、密码验证都要交给Realm完成
	 * @param mid 用户的ID
	 * @return 如果用户信息存在则以VO的形式返回，如果不存在返回null
	 */
	public Member get(String mid) ;
}
