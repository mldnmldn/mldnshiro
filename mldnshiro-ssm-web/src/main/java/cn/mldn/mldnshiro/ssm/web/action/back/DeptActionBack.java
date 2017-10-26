package cn.mldn.mldnshiro.ssm.web.action.back;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.mldnshiro.ssm.service.back.IDeptServiceBack;
import cn.mldn.mldnshiro.ssm.vo.Dept;

@Controller
@RequestMapping("/pages/back/dept/*")
public class DeptActionBack {
	@Resource
	private IDeptServiceBack deptService ;
//	@RequiresAuthentication	// 已经认证过
//	@RequiresRoles("dept")
//	@RequiresPermissions("dept:add")
	@RequestMapping("dept_add")
	@ResponseBody
	public Object add(Dept vo) {
		
		return this.deptService.add(vo) ;
	}
//	@RequiresRoles("dept")
//	@RequiresPermissions("dept:list")
	@RequestMapping("dept_list")
	@ResponseBody
	public Object list() {
		SecurityUtils.getSubject().getSession().setAttribute("name", "我的名字。");
		System.err.println(SecurityUtils.getSubject().getPrincipal());
		return this.deptService.list() ;
	}
//	@RequiresRoles("dept")
//	@RequiresPermissions("dept:remove")
	@RequestMapping("dept_remove")
	@ResponseBody
	public Object remove(Long deptno) { 
		return this.deptService.remove(deptno);
	}
}
