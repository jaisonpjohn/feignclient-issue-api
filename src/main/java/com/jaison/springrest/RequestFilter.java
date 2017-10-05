package com.jaison.springrest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
@Order(Ordered.LOWEST_PRECEDENCE)
public class RequestFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(
      final HttpServletRequest request, final HttpServletResponse response,
      final FilterChain filterChain) throws ServletException, IOException {
    System.out.println("Request Received. URL is: "+request.getRequestURI());
    filterChain.doFilter(request, response);
  }
}
