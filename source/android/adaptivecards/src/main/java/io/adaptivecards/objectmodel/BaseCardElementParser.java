/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BaseCardElementParser {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected BaseCardElementParser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseCardElementParser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BaseCardElementParser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AdaptiveCardObjectModelJNI.BaseCardElementParser_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AdaptiveCardObjectModelJNI.BaseCardElementParser_change_ownership(this, swigCPtr, true);
  }

  public BaseCardElement Deserialize(ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration, AdaptiveCardParseWarningVector warnings, JsonValue value) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseCardElementParser_Deserialize(swigCPtr, this, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration, AdaptiveCardParseWarningVector.getCPtr(warnings), warnings, JsonValue.getCPtr(value), value);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

  public BaseCardElementParser() {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElementParser(), true);
    AdaptiveCardObjectModelJNI.BaseCardElementParser_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
