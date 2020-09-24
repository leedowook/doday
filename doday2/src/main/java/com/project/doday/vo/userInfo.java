package com.project.doday.vo;

import lombok.*;

@Data @Setter @Getter 
public class userInfo {
	@NonNull
	private String id;
	private String num;
	private String password;
	private int auth;
	private int age;
	private String name;
	private int phone;
}
