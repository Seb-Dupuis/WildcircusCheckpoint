// package fr.portfolio.portfolio.security;

// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.factory.PasswordEncoderFactories;
// import org.springframework.security.crypto.password.PasswordEncoder;

// @EnableWebSecurity
// public class MySecurityConfig extends WebSecurityConfigurerAdapter {

//         @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//             .antMatchers("/img/**").permitAll()
//             .antMatchers("/webfonts/**").permitAll()
//             .antMatchers("/**.css").permitAll()
//             .antMatchers("/").permitAll() 
//             .antMatchers("/Pdf/**").permitAll() 
//             .antMatchers("/**.pdf").permitAll()
//             .antMatchers("/admin/**").hasRole("ADMIN")
//             .and()
//             // ...
//             .formLogin();
     
//     }

//         @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//         PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//         auth.inMemoryAuthentication()
//         .withUser("user")
//             .password(encoder.encode("password"))
//             .roles("ADMIN");

//     }
// }