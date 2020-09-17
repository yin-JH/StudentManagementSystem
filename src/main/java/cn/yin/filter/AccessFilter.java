package cn.yin.filter;

import javax.servlet.*;
import java.io.IOException;

public class AccessFilter implements Filter {

    private static final String[] TOURIST_CANNOT_ACCESS = {};
    private static final String[] STUDENT_CANNOT_ACCESS = {};
    private static final String[] TEACHER_CANNOT_ACCESS = {};
    private static final String[] EMP_CANNOT_ACCESS = {};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("======访问权限过滤器======");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
