package com.jwt.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder
@Getter
@Setter

public class JwtResponse {

	private String jwtToken;
	private String username;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JwtResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
