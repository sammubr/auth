package br.com.sammubr.auth.controller;

import br.com.sammubr.auth.entity.UserEntity;
import br.com.sammubr.auth.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping(value = "/register")
//    @PreAuthorize("permitAll()")
    public UserEntity register(@RequestParam String username, @RequestParam String password, @RequestParam String organization) {
        return this.loginService.register(username, password, organization);
    }
//
//    @GetMapping(value = "/user")
//    public String getUser(Principal principal) {
//        return principal.getName();
//    }
//
//    @GetMapping(value = "/organization")
//    public OrganizationEntity getOrganization(ServletRequest servletRequest) {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        String authToken = httpServletRequest.getHeader(Token.HEADER_NAME);
//        return this.loginService.getOrganization(authToken);
//    }
//
//    @PostMapping(value = "/organization/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public OrganizationEntity updateOrganization(ServletRequest servletRequest, @PathVariable String id, @Valid @RequestBody OrganizationEntity organization) {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        String authToken = httpServletRequest.getHeader(Token.HEADER_NAME);
//        return this.loginService.updateOrganization(authToken, id, organization);
//    }

}
