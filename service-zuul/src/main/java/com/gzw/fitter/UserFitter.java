package com.gzw.fitter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class UserFitter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run()  {
        RequestContext requestContext =   RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        //获取请求头信息
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            System.out.println("token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}
        }
        return null;
    }
}
