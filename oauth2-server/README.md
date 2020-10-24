http://localhost:8080/oauth/authorize?client_id=eagleeye&client_secret=thisissecret&response_type=code

Problem:

Cannot forward to /login page, when need authentication

https://www.cnblogs.com/hellxz/p/oauth2_oauthcode_pattern.html

`/user` does not work
```json
{
    "timestamp": "2020-10-24T15:13:25.085+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "Current user principal is not of type [org.springframework.security.oauth2.provider.OAuth2Authentication]: org.springframework.security.authentication.UsernamePasswordAuthenticationToken@bbd796f7: Principal: org.springframework.security.core.userdetails.User@36ebcb: Username: user; Password: [PROTECTED]; Enabled: true; AccountNonExpired: true; credentialsNonExpired: true; AccountNonLocked: true; Granted Authorities: ROLE_USER; Credentials: [PROTECTED]; Authenticated: true; Details: org.springframework.security.web.authentication.WebAuthenticationDetails@fffc7f0c: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId: 63E2B5C5BF23D81B5D5607A954A3B6FA; Granted Authorities: ROLE_USER",
    "path": "/user"
}
```