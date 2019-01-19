/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcExchangeExecOrderActionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcExchangeExecOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExchangeExecOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeExecOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setExecOrderSysID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
	}

	public String getExecOrderSysID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
	}

	public void setActionFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
	}

	public char getActionFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionFlag_get(swigCPtr, this);
	}

	public void setActionDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionDate_set(swigCPtr, this, value);
	}

	public String getActionDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionDate_get(swigCPtr, this);
	}

	public void setActionTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionTime_set(swigCPtr, this, value);
	}

	public String getActionTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionTime_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_InstallID_get(swigCPtr, this);
	}

	public void setExecOrderLocalID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ExecOrderLocalID_set(swigCPtr, this, value);
	}

	public String getExecOrderLocalID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ExecOrderLocalID_get(swigCPtr, this);
	}

	public void setActionLocalID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionLocalID_set(swigCPtr, this, value);
	}

	public String getActionLocalID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionLocalID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ClientID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOrderActionStatus(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
	}

	public char getOrderActionStatus() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_OrderActionStatus_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_UserID_get(swigCPtr, this);
	}

	public void setActionType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionType_set(swigCPtr, this, value);
	}

	public char getActionType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_ActionType_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_BranchID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderActionField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcExchangeExecOrderActionField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeExecOrderActionField(), true);
	}

}