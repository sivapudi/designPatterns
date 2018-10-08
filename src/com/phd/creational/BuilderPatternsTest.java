package com.phd.creational;

import com.phd.util.User;

public class BuilderPatternsTest {
	public static void main(String[] args) {
		User user = new User.UserBuilder("Phd", "Siva").build();
		System.out.println(user);
	}
}
