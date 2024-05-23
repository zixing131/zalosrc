package com.vng.zing.vn.zrtc;

import android.content.Context;
import org.webrtc.videofilter.ZVideoFilter;
import org.webrtc.videofilter.ZVideoFilterManager;
import p097db.EnumC17857p;

/* loaded from: classes3.dex */
public class CallCallback {
    private Context mContext;

    public CallCallback(Context context) {
        this.mContext = context;
    }

    public String getDevPerf(String str) {
        return "";
    }

    public int getNetworkType() {
        return EnumC17857p.UNKNOWN.ordinal();
    }

    public String getPlatformStat() {
        return "";
    }

    public boolean isEnableVideoFilter() {
        if (ZVideoFilterManager.filterType() == ZVideoFilter.FilterType.NATIVE.getValue()) {
            return true;
        }
        return false;
    }

    public void onCallAudioState(int i11) {
    }

    public void onCallAutoHangup() {
    }

    public void onCallChangeZRTP(int i11, String str, String str2, String str3) {
    }

    public void onCallErr(int i11) {
    }

    public void onCallLog(String str) {
    }

    public void onCallQualityChanged(int i11) {
    }

    public void onCallRequest(int i11, int i12, int i13, int i14, String str) {
    }

    public void onCallSendDataToPartner(int i11, int i12, int i13, String str) {
    }

    public void onCallState(int i11) {
    }

    public void onCallStats(String str) {
    }

    public void onCallUpdateP2PStatus(int i11, int i12) {
    }

    public void onCallVideoState(int i11) {
    }

    public void onEnableLowDataModeComplete(boolean z11, boolean z12) {
    }

    public void onIncomingCall() {
    }

    public void onInitZrtpRequestFailed(int i11) {
    }

    public void onInitZrtpWithServer(String str, String str2) {
    }

    public void onLocalVideoSizeChanged(int i11, int i12) {
    }

    public void onMakeCall() {
    }

    public void onNativeException(String str) {
    }

    public void onPartnerJoinCall(int i11) {
    }

    public void onPartnerLeaveCall(int i11, int i12) {
    }

    public void onPartnerVideoSizeChanged(int i11, int i12, int i13) {
    }

    public void onPreConnectSuccessful(int i11, int i12, int i13, String str) {
    }

    public void onCallAudioState(int i11, int i12) {
    }

    public void onCallVideoState(int i11, int i12) {
    }
}
