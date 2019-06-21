package com.cog.java.apps.response;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
 * Author: Bijoy Baral
 *
 * Date: 21 Jun 2019 1:16:53 pm
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response extends BaseResponseData {

	private boolean status;

	private BaseResponseData baseResponseData;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public BaseResponseData getBaseResponseData() {
		return baseResponseData;
	}

	public void setBaseResponseData(BaseResponseData baseResponseData) {
		this.baseResponseData = baseResponseData;
	}
}
