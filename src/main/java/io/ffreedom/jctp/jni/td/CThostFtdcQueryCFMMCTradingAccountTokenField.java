/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcQueryCFMMCTradingAccountTokenField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQueryCFMMCTradingAccountTokenField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQueryCFMMCTradingAccountTokenField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQueryCFMMCTradingAccountTokenField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryCFMMCTradingAccountTokenField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryCFMMCTradingAccountTokenField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestorID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryCFMMCTradingAccountTokenField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcQueryCFMMCTradingAccountTokenField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQueryCFMMCTradingAccountTokenField(), true);
	}

}