package com.mdh.core.member.service;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MemberVO {

	private String memId;
	private String memUserId;
	private String memEmail;
	private String memPassword;
	private String memUserName;
	private String memNickname;
	private String memLevel;
	private String memPoint;
	private String memHomepage;
	private String memPhone;
	private String memBirthday;
	private String memSex;
	private String memZipcode;
	private String memAddress1;
	private String memAddress2;
	private String memAddress3;
	private String memAddress4;
	private String memReceiveEmail;
	private String memUseNote;
	private String memReceiveSms;
	private String memOpenProfile;
	private String memDenied;
	private String memEmailCert;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:SS")
	private Date memRegisterDatetime;
	private String memRegisterIp;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:SS")
	private Date memLastLoginDatetime;
	private String memLastloginIp;
	private String memIsAdmin;
	private String memProfileContent;
	private String memAdminMemo;
	private String memFollowing;
	private String memFollowed;
	private String memIcon;
	private String memPhoto;

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemUserId() {
		return memUserId;
	}

	public void setMemUserId(String memUserId) {
		this.memUserId = memUserId;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getMemPassword() {
		return memPassword;
	}

	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}

	public String getMemUserName() {
		return memUserName;
	}

	public void setMemUserName(String memUserName) {
		this.memUserName = memUserName;
	}

	public String getMemNickname() {
		return memNickname;
	}

	public void setMemNickname(String memNickname) {
		this.memNickname = memNickname;
	}

	public String getMemLevel() {
		return memLevel;
	}

	public void setMemLevel(String memLevel) {
		this.memLevel = memLevel;
	}

	public String getMemPoint() {
		return memPoint;
	}

	public void setMemPoint(String memPoint) {
		this.memPoint = memPoint;
	}

	public String getMemHomepage() {
		return memHomepage;
	}

	public void setMemHomepage(String memHomepage) {
		this.memHomepage = memHomepage;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemBirthday() {
		return memBirthday;
	}

	public void setMemBirthday(String memBirthday) {
		this.memBirthday = memBirthday;
	}

	public String getMemSex() {
		return memSex;
	}

	public void setMemSex(String memSex) {
		this.memSex = memSex;
	}

	public String getMemZipcode() {
		return memZipcode;
	}

	public void setMemZipcode(String memZipcode) {
		this.memZipcode = memZipcode;
	}

	public String getMemAddress1() {
		return memAddress1;
	}

	public void setMemAddress1(String memAddress1) {
		this.memAddress1 = memAddress1;
	}

	public String getMemAddress2() {
		return memAddress2;
	}

	public void setMemAddress2(String memAddress2) {
		this.memAddress2 = memAddress2;
	}

	public String getMemAddress3() {
		return memAddress3;
	}

	public void setMemAddress3(String memAddress3) {
		this.memAddress3 = memAddress3;
	}

	public String getMemAddress4() {
		return memAddress4;
	}

	public void setMemAddress4(String memAddress4) {
		this.memAddress4 = memAddress4;
	}

	public String getMemReceiveEmail() {
		return memReceiveEmail;
	}

	public void setMemReceiveEmail(String memReceiveEmail) {
		this.memReceiveEmail = memReceiveEmail;
	}

	public String getMemUseNote() {
		return memUseNote;
	}

	public void setMemUseNote(String memUseNote) {
		this.memUseNote = memUseNote;
	}

	public String getMemReceiveSms() {
		return memReceiveSms;
	}

	public void setMemReceiveSms(String memReceiveSms) {
		this.memReceiveSms = memReceiveSms;
	}

	public String getMemOpenProfile() {
		return memOpenProfile;
	}

	public void setMemOpenProfile(String memOpenProfile) {
		this.memOpenProfile = memOpenProfile;
	}

	public String getMemDenied() {
		return memDenied;
	}

	public void setMemDenied(String memDenied) {
		this.memDenied = memDenied;
	}

	public String getMemEmailCert() {
		return memEmailCert;
	}

	public void setMemEmailCert(String memEmailCert) {
		this.memEmailCert = memEmailCert;
	}

	public Date getMemRegisterDatetime() {
		return memRegisterDatetime;
	}

	public void setMemRegisterDatetime(Date memRegisterDatetime) {
		this.memRegisterDatetime = memRegisterDatetime;
	}

	public String getMemRegisterIp() {
		return memRegisterIp;
	}

	public void setMemRegisterIp(String memRegisterIp) {
		this.memRegisterIp = memRegisterIp;
	}

	public Date getMemLastLoginDatetime() {
		return memLastLoginDatetime;
	}

	public void setMemLastLoginDatetime(Date memLastLoginDatetime) {
		this.memLastLoginDatetime = memLastLoginDatetime;
	}

	public String getMemLastloginIp() {
		return memLastloginIp;
	}

	public void setMemLastloginIp(String memLastloginIp) {
		this.memLastloginIp = memLastloginIp;
	}

	public String getMemIsAdmin() {
		return memIsAdmin;
	}

	public void setMemIsAdmin(String memIsAdmin) {
		this.memIsAdmin = memIsAdmin;
	}

	public String getMemProfileContent() {
		return memProfileContent;
	}

	public void setMemProfileContent(String memProfileContent) {
		this.memProfileContent = memProfileContent;
	}

	public String getMemAdminMemo() {
		return memAdminMemo;
	}

	public void setMemAdminMemo(String memAdminMemo) {
		this.memAdminMemo = memAdminMemo;
	}

	public String getMemFollowing() {
		return memFollowing;
	}

	public void setMemFollowing(String memFollowing) {
		this.memFollowing = memFollowing;
	}

	public String getMemFollowed() {
		return memFollowed;
	}

	public void setMemFollowed(String memFollowed) {
		this.memFollowed = memFollowed;
	}

	public String getMemIcon() {
		return memIcon;
	}

	public void setMemIcon(String memIcon) {
		this.memIcon = memIcon;
	}

	public String getMemPhoto() {
		return memPhoto;
	}

	public void setMemPhoto(String memPhoto) {
		this.memPhoto = memPhoto;
	}
}
