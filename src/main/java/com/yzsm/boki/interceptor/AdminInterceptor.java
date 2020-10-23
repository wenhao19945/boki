package com.yzsm.boki.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.yzsm.boki.entity.User;


/**
 * 拦截器
 * @author Administrator
 * 
 */
public class AdminInterceptor implements HandlerInterceptor{
	
	@SuppressWarnings("unused")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
        //System.out.println("执行了Interceptor的preHandle方法");
        try {
            //统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)
            //UserInfo user = (UserInfo)request.getSession().getAttribute("user");
            User user = new User();
            user.setName("user");
			if(user != null){ 
				return true;
			}
            response.sendRedirect(request.getContextPath()+"/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;//如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
                    //如果设置为true时，请求将会继续执行后面的操作
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		//System.out.println("执行了Interceptor的postHandle方法");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		//System.out.println("执行了Interceptor的afterCompletion方法");
	}
	
}
