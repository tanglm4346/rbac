package com.tlm.security.rbac.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tlm.security.rbac.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class RbacAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        User user = (User) authentication.getPrincipal();
        user.setPassword(null);
        response.getWriter().write(objectMapper.writeValueAsString(user));
    }
}
