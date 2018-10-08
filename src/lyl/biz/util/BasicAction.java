package lyl.biz.util;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 所有action的基类,存放业务action公共的内容
 * @author lyl_baiyi
 *
 */
public class BasicAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	protected Map<String,Object> requestMap;
	protected Map<String,Object> sessionMap;
	protected Map<String,Object> applicationMap;
	
	
	@Override
	public void setApplication(Map<String, Object> applicationMap) {
		this.applicationMap = applicationMap;
		
	}

	@Override
	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap=sessionMap;
		
	}

	@Override
	public void setRequest(Map<String, Object> requestMap) {
		this.requestMap=requestMap;
		
	}
	

}
