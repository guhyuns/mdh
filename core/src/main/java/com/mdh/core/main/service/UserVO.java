package com.mdh.core.main.service;

/**
 * Created by Administrator on 2017-05-03.
 */
public class UserVO {

	private String userId;
	private String userPw;
	private String emailAddr;
	private String zipAddr;
	private String zipAddrDtl;
	private String regDt;
	private String mdfyDt;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getZipAddr() {
		return zipAddr;
	}

	public void setZipAddr(String zipAddr) {
		this.zipAddr = zipAddr;
	}

	public String getZipAddrDtl() {
		return zipAddrDtl;
	}

	public void setZipAddrDtl(String zipAddrDtl) {
		this.zipAddrDtl = zipAddrDtl;
	}

	public String getRegDt() {
		return regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	public String getMdfyDt() {
		return mdfyDt;
	}

	public void setMdfyDt(String mdfyDt) {
		this.mdfyDt = mdfyDt;
	}

}
