/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcQryExchangeOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcQryExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQryExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttraderapiJNI.CThostFtdcQryExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttraderapiJNI.CThostFtdcQryExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeOrderField() {
    this(thosttraderapiJNI.new_CThostFtdcQryExchangeOrderField(), true);
  }

}
