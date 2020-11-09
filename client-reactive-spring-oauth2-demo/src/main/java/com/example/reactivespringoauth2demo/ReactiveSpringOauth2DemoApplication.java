package com.example.reactivespringoauth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@SpringBootApplication
public class ReactiveSpringOauth2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringOauth2DemoApplication.class, args);
	}

	@GetMapping("/")
	String hello(@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
				 @AuthenticationPrincipal OAuth2User oauth2User) {
		System.out.println("userName" + oauth2User.getName());
		for(Map.Entry<String, Object> entry: oauth2User.getAttributes().entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		System.out.println("clientName"+ authorizedClient.getClientRegistration().getClientName());
		return "Hello";
	}

}
