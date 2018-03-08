/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.apache.camel.component.msmq.native_support;

public class MsmqMessage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MsmqMessage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MsmqMessage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        msmq_native_supportJNI.delete_MsmqMessage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MsmqMessage() {
    this(msmq_native_supportJNI.new_MsmqMessage(), true);
  }

  public void setAppSpecifc(long app) {
    msmq_native_supportJNI.MsmqMessage_setAppSpecifc(swigCPtr, this, app);
  }

  public long getAppSpecific() {
    return msmq_native_supportJNI.MsmqMessage_getAppSpecific(swigCPtr, this);
  }

  public long getArrivedTime() {
    return msmq_native_supportJNI.MsmqMessage_getArrivedTime(swigCPtr, this);
  }

  public void setMsgBody(SWIGTYPE_p_signed_char body) {
    msmq_native_supportJNI.MsmqMessage_setMsgBody(swigCPtr, this, SWIGTYPE_p_signed_char.getCPtr(body));
  }

  public void setMsgBodyWithByteBuffer(java.nio.ByteBuffer buffer) {
    msmq_native_supportJNI.MsmqMessage_setMsgBodyWithByteBuffer(swigCPtr, this, buffer);
  }

  public long getBodyType() {
    return msmq_native_supportJNI.MsmqMessage_getBodyType(swigCPtr, this);
  }

  public void setBodySize(long size) {
    msmq_native_supportJNI.MsmqMessage_setBodySize(swigCPtr, this, size);
  }

  public long getBodySize() {
    return msmq_native_supportJNI.MsmqMessage_getBodySize(swigCPtr, this);
  }

  public void setCorrelationId(byte[] corrid) {
    msmq_native_supportJNI.MsmqMessage_setCorrelationId(swigCPtr, this, corrid);
  }

  public void getCorrelationId(byte[] corrid) {
    msmq_native_supportJNI.MsmqMessage_getCorrelationId(swigCPtr, this, corrid);
  }

  public void setDelivery(long delivery) {
    msmq_native_supportJNI.MsmqMessage_setDelivery(swigCPtr, this, delivery);
  }

  public long getDelivery() {
    return msmq_native_supportJNI.MsmqMessage_getDelivery(swigCPtr, this);
  }

  public void getMsgId(byte[] corrid) {
    msmq_native_supportJNI.MsmqMessage_getMsgId(swigCPtr, this, corrid);
  }

  public void setPriority(long priority) {
    msmq_native_supportJNI.MsmqMessage_setPriority(swigCPtr, this, priority);
  }

  public long getPriority() {
    return msmq_native_supportJNI.MsmqMessage_getPriority(swigCPtr, this);
  }

  public long getSentTime() {
    return msmq_native_supportJNI.MsmqMessage_getSentTime(swigCPtr, this);
  }

  public void setTimeToBeReceived(long time) {
    msmq_native_supportJNI.MsmqMessage_setTimeToBeReceived(swigCPtr, this, time);
  }

  public long getTimeToBeReceived() {
    return msmq_native_supportJNI.MsmqMessage_getTimeToBeReceived(swigCPtr, this);
  }

  public final static class PropertyName {
    public final static PropertyName APPSPECIFIC = new PropertyName("APPSPECIFIC");
    public final static PropertyName ARRIVEDTIME = new PropertyName("ARRIVEDTIME");
    public final static PropertyName BODY = new PropertyName("BODY");
    public final static PropertyName BODY_TYPE = new PropertyName("BODY_TYPE");
    public final static PropertyName BODY_SIZE = new PropertyName("BODY_SIZE");
    public final static PropertyName CORRELATIONID = new PropertyName("CORRELATIONID");
    public final static PropertyName DELIVERY = new PropertyName("DELIVERY");
    public final static PropertyName MSGID = new PropertyName("MSGID");
    public final static PropertyName PRIORITY = new PropertyName("PRIORITY");
    public final static PropertyName SENTTIME = new PropertyName("SENTTIME");
    public final static PropertyName TIME_TO_BE_RECEIVED = new PropertyName("TIME_TO_BE_RECEIVED");
    public final static PropertyName NUMPROPS = new PropertyName("NUMPROPS");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PropertyName swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PropertyName.class + " with value " + swigValue);
    }

    private PropertyName(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PropertyName(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PropertyName(String swigName, PropertyName swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PropertyName[] swigValues = { APPSPECIFIC, ARRIVEDTIME, BODY, BODY_TYPE, BODY_SIZE, CORRELATIONID, DELIVERY, MSGID, PRIORITY, SENTTIME, TIME_TO_BE_RECEIVED, NUMPROPS };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
