/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcExecOrderActionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcExecOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExecOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExecOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InvestorID_get(swigCPtr, this);
	}

	public void setExecOrderActionRef(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_set(swigCPtr, this, value);
	}

	public int getExecOrderActionRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderActionRef_get(swigCPtr, this);
	}

	public void setExecOrderRef(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderRef_set(swigCPtr, this, value);
	}

	public String getExecOrderRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderRef_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_RequestID_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_SessionID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setExecOrderSysID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderSysID_set(swigCPtr, this, value);
	}

	public String getExecOrderSysID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderSysID_get(swigCPtr, this);
	}

	public void setActionFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionFlag_set(swigCPtr, this, value);
	}

	public char getActionFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionFlag_get(swigCPtr, this);
	}

	public void setActionDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionDate_set(swigCPtr, this, value);
	}

	public String getActionDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionDate_get(swigCPtr, this);
	}

	public void setActionTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionTime_set(swigCPtr, this, value);
	}

	public String getActionTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionTime_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InstallID_get(swigCPtr, this);
	}

	public void setExecOrderLocalID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_set(swigCPtr, this, value);
	}

	public String getExecOrderLocalID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ExecOrderLocalID_get(swigCPtr, this);
	}

	public void setActionLocalID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionLocalID_set(swigCPtr, this, value);
	}

	public String getActionLocalID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionLocalID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ClientID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOrderActionStatus(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
	}

	public char getOrderActionStatus() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_OrderActionStatus_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_UserID_get(swigCPtr, this);
	}

	public void setActionType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionType_set(swigCPtr, this, value);
	}

	public char getActionType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_ActionType_get(swigCPtr, this);
	}

	public void setStatusMsg(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_StatusMsg_set(swigCPtr, this, value);
	}

	public String getStatusMsg() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_StatusMsg_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InstrumentID_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_BranchID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_InvestUnitID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExecOrderActionField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcExecOrderActionField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExecOrderActionField(), true);
	}

}