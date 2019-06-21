package com.cog.java.apps.response;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
 * Author: Bijoy Baral
 *
 * Date: 21 Jun 2019 1:40:13 pm
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseData extends BaseResponseData {

	private String referenceNumber;

	private String userId;

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
