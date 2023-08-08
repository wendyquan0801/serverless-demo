/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.tencent;

public class ITRTCMediaPusherCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ITRTCMediaPusherCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITRTCMediaPusherCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        trtcenginewarperJNI.delete_ITRTCMediaPusherCallback(swigCPtr);
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
    trtcenginewarperJNI.ITRTCMediaPusherCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    trtcenginewarperJNI.ITRTCMediaPusherCallback_change_ownership(this, swigCPtr, true);
  }

  public void OnPushError(MediaPushError error_code, String error_message) {
    trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushError(swigCPtr, this, error_code.swigValue(), error_message);
  }

  public void OnPushBegin(String file_url) {
    if (getClass() == ITRTCMediaPusherCallback.class) trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushBegin(swigCPtr, this, file_url); else trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushBeginSwigExplicitITRTCMediaPusherCallback(swigCPtr, this, file_url);
  }

  public void OnPushEnd(String file_url) {
    if (getClass() == ITRTCMediaPusherCallback.class) trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushEnd(swigCPtr, this, file_url); else trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushEndSwigExplicitITRTCMediaPusherCallback(swigCPtr, this, file_url);
  }

  public void OnPushProgress(String file_url, int position, int duration) {
    if (getClass() == ITRTCMediaPusherCallback.class) trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushProgress(swigCPtr, this, file_url, position, duration); else trtcenginewarperJNI.ITRTCMediaPusherCallback_OnPushProgressSwigExplicitITRTCMediaPusherCallback(swigCPtr, this, file_url, position, duration);
  }

  public ITRTCMediaPusherCallback() {
    this(trtcenginewarperJNI.new_ITRTCMediaPusherCallback(), true);
    trtcenginewarperJNI.ITRTCMediaPusherCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}