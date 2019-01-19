/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcMarketDataStaticField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcMarketDataStaticField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarketDataStaticField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcMarketDataStaticField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setOpenPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_OpenPrice_set(swigCPtr, this, value);
	}

	public double getOpenPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_OpenPrice_get(swigCPtr, this);
	}

	public void setHighestPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_HighestPrice_set(swigCPtr, this, value);
	}

	public double getHighestPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_HighestPrice_get(swigCPtr, this);
	}

	public void setLowestPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_LowestPrice_set(swigCPtr, this, value);
	}

	public double getLowestPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_LowestPrice_get(swigCPtr, this);
	}

	public void setClosePrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_ClosePrice_set(swigCPtr, this, value);
	}

	public double getClosePrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_ClosePrice_get(swigCPtr, this);
	}

	public void setUpperLimitPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_set(swigCPtr, this, value);
	}

	public double getUpperLimitPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_UpperLimitPrice_get(swigCPtr, this);
	}

	public void setLowerLimitPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_set(swigCPtr, this, value);
	}

	public double getLowerLimitPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_LowerLimitPrice_get(swigCPtr, this);
	}

	public void setSettlementPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_SettlementPrice_set(swigCPtr, this, value);
	}

	public double getSettlementPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_SettlementPrice_get(swigCPtr, this);
	}

	public void setCurrDelta(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_CurrDelta_set(swigCPtr, this, value);
	}

	public double getCurrDelta() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataStaticField_CurrDelta_get(swigCPtr, this);
	}

	public CThostFtdcMarketDataStaticField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcMarketDataStaticField(), true);
	}

}