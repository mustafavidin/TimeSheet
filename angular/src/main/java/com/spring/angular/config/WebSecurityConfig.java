//package com.spring.angular.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import javax.sql.DataSource;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Autowired
//    private DataSource dataSource;
//
//
//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder authBuilder) throws Exception {
//        authBuilder.jdbcAuthentication().dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder()).usersByUsernameQuery("select Email,Password,Enabled from ntt_dat_users where Email=?").authoritiesByUsernameQuery("select Email,RoleID from ntt_dat_users where Email=?");
//    }
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin().permitAll().loginPage("/Login").usernameParameter("username").passwordParameter("Password").permitAll().and().logout().permitAll();
//    }
//}