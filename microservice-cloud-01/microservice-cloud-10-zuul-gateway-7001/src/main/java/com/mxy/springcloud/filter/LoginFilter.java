package com.mxy.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author ：mmzs
 * @date ：Created in 2020/1/20 11:11
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class LoginFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");

        if(token == null){
            logger.warn("此系统需要先登录！！！");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(200);
            try {
                context.getResponse().getWriter().write("token is empty...");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("ok!");
        return null;
    }
}
