package com.csyaonie.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zyf
 * @date 2020/3/2
 * @description
 */
public class ShiroFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);

    }
}
