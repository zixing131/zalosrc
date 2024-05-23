package com.vng.zing.vn.zrtc;

import android.content.Context;
import p097db.EnumC17857p;

/* loaded from: classes3.dex */
public class GroupCallback {
    public static final String THIS_FILE = "GroupCallback";
    private Context mContext;

    public GroupCallback(Context context) {
        this.mContext = context;
    }

    public int getCPUUsage() {
        return 0;
    }

    public int getNetworkType() {
        return EnumC17857p.UNKNOWN.ordinal();
    }

    public void onCallAudioState(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCallAudioState: state: ");
        sb2.append(i12);
    }

    public void onCallAutoHangup() {
    }

    public void onCallConfirmed() {
    }

    public void onCallEnd() {
    }

    public void onCallErr(int i11) {
    }

    public void onCallInit() {
    }

    public void onCallJoinMeetingFailed(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCallJoinMeetingFailed: ");
        sb2.append(i11);
    }

    public void onCallJoinMeetingSuccess(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCallJoinMeetingSuccess: rtp: ");
        sb2.append(str);
        sb2.append(" rtcp = ");
        sb2.append(str2);
    }

    public void onCallLog(String str) {
    }

    public void onCallQualityChanged(int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCallQualityChanged: quality: ");
        sb2.append(i12);
    }

    public void onCallStats(String str) {
    }

    public void onCallVideoState(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCallVideoState: state: ");
        sb2.append(i12);
    }

    public void onMeetingEnded(boolean z11) {
    }

    public void onPartnerJoinCall(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPartnerJoinCall: userId: ");
        sb2.append(i11);
    }

    public void onPartnerLeaveCall(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPartnerLeaveCall: userId: ");
        sb2.append(i11);
    }

    public void onPartnerSpeakingStateChanged(String str) {
    }
}
