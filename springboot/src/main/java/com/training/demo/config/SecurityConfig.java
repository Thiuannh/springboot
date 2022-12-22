package com.training.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.training.demo.filter.JwtRequestFilter;
import com.training.demo.service.ipl.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	
	@Autowired
	private AuthenticationSuccessHandler authenticationSuccessHandler;
	
	@Autowired
	private AuthenticationFailureHandler authenticationFailureHandler;
	
	@Autowired
	UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	
	
//	@Bean
//	public InMemoryUserDetailsManager createInMemory() {
//		UserDetails uDetails1 = User.withUsername("admin").password("admin")
//				.authorities(new SimpleGrantedAuthority("ADMIN")).build();
//		UserDetails userDetails2 = User.withUsername("user").password("user")
//				.authorities(new SimpleGrantedAuthority("USER")).build();
//		
//		
//		
//		
//		return new InMemoryUserDetailsManager(uDetails1, userDetails2);
//	}
//	
	@Bean
    public PasswordEncoder passwordEncoder() {
        // Password encoder, để Spring Security sử dụng mã hóa mật khẩu người dùng
        return new BCryptPasswordEncoder();
    }
	
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.userDetailsService(userDetailsServiceImpl) // Cung cáp userservice cho spring security
            .passwordEncoder(passwordEncoder()); // cung cấp password encoder
    }
	
	
	@Bean
	SecurityFilterChain defaulSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.authorizeRequests()
//		.antMatchers("/api/v1/users").hasAuthority("ADMIN")
//		.antMatchers("/user").permitAll()
//		.anyRequest().authenticated();
//		
//		httpSecurity.csrf().disable();
//		
////		httpSecurity.formLogin().successHandler(authenticationSuccessHandler).failureHandler(authenticationFailureHandler);
//		
////		HttpSecurity.formLogin().successHandler(authenticationSuccessHandler).failureHandler(authenticationFailureHandler);
//		return httpSecurity.httpBasic().and().build();
////		return httpSecurity.build();
		
		
		
		httpSecurity.csrf().disable()
		.authorizeHttpRequests().antMatchers("/authenticate").permitAll()
		.antMatchers("/api/v1/**").hasAuthority("ADMIN")
		.anyRequest().authenticated()
		.and()
		.exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
		.and()
//		.logout().permitAll()
//		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		//disable frame option when accessing h2 database
		httpSecurity.headers().frameOptions().disable();
		
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
		return httpSecurity.build();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}

	




}
