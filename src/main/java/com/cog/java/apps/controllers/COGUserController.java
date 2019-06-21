package com.cog.java.apps.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.java.apps.response.Response;
import com.cog.java.apps.response.UserResponseData;
import com.cog.java.apps.user.input.COGUserInputData;

/*
 * Author: Bijoy Baral
 *
 * Date: 21 Jun 2019 1:14:57 pm
 *
 */
@RestController
@RequestMapping("/cog/v1")
public class COGUserController {

	@PostMapping("/create/user")
	public Response createUser(@RequestBody COGUserInputData homeUserInputData) {
		Response response = new Response();
		if (null == homeUserInputData) {
			response.setStatus(false);
			return response;
		}
		final UserResponseData userResponseData = new UserResponseData();
		userResponseData.setReferenceNumber("Home_User_0000001");
		userResponseData.setUserId("bijoy.baral");
		response.setStatus(true);
		response.setBaseResponseData(userResponseData);
		return response;
	}
}
