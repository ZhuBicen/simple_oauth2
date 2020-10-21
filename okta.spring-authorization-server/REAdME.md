Instructed from: https://developer.okta.com/blog/2019/03/12/oauth2-spring-security-guide

A section of code can't understand, need more investigate
```
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
                .antMatchers("/login", "/oauth/authorize")
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll();
    }
```