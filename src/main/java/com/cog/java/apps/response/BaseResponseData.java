package com.cog.java.apps.response;

import com.cog.java.apps.error.COGError;
import com.fasterxml.jackson.annotation.JsonInclude;

/*
 * Author: Bijoy Baral
 *
 * Date: 21 Jun 2019 1:17:43 pm
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponseData {

	private COGError homeError;

	public COGError getHomeError() {
		return homeError;
	}

	public void setHomeError(COGError homeError) {
		this.homeError = homeError;
	}
}
