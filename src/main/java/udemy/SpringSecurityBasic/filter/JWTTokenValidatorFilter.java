package udemy.SpringSecurityBasic.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class JWTTokenValidatorFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
