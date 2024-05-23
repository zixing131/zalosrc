package com.zing.zalo.plugin;

import android.app.Activity;

/* loaded from: classes4.dex */
public interface IVoipZalo {
    void answerPreCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str);

    void broadCastState(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, int i16, String str);

    void calleeRequestNewServer(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str);

    void callerAnswerNewServer(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str);

    void cancelCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14);

    void finishCallZRTP(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr);

    void getProfile(IVoipServiceRequestCallback iVoipServiceRequestCallback, String str);

    void groupAddUser(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, String str, int i12, int i13, int i14, String str2, String str3);

    void groupAnswerCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2);

    void groupCancelCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2);

    void groupEndCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, String str);

    void groupInitCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, String str, int i12, int i13, String str2, String str3, int i14);

    void groupJoin(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, String str);

    void groupPing(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, int i15, int i16, String str);

    void groupRequestCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str, int i13, int i14, String str2);

    void groupSendLogCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str, int i13, int i14, int i15, long j11, String str2, int i16);

    void groupSentRingRing(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, String str);

    void incomingPreCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str);

    boolean isSupportSendPhotoInCall();

    void mSendVoiceFeedbackRating(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, byte b11, int i12, int i13, byte b12, byte b13, int[] iArr, short s7, byte[] bArr);

    String mUidToPhoneName(String str, String str2);

    void notifyIncomingCall();

    void pingCall11(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);

    void requestPreCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12);

    void sendCoreDataToPartner(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str);

    void sendDeviceError(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14);

    void sendHijackNativeCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, long j11, int i13);

    void sendMessageLiveAnim(IVoipServiceRequestCallback iVoipServiceRequestCallback, long j11, String str, int i11, String str2, int i12, int i13);

    void sendSticker(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str);

    void setStateInCall(boolean z11, String str);

    void showMsgVoiceCall(int i11, String str, boolean z11);

    void startLog(String str);

    void submitReceivedZinstantACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12);

    void submitZinstantInteraction(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str);

    void switchToVideoCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14);

    void trackingStateCallActivity(boolean z11, Activity activity, long j11);

    void uploadCallGroupLog(int i11, long j11, int i12, long j12, int i13, String str);

    void uploadCallLog(int i11, int i12, int i13, long j11, long j12, String str);

    void uploadSpectrumLog(String str, int i11, int i12, int i13, long j11, long j12, String str2);

    void voiceAnswerACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);

    void voiceCallRinging(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, String str);

    void voiceCommandACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);

    void voiceEndCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2, String str3, int i14);

    void voiceHoldCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);

    void voiceInAppACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14);

    void voiceInteractCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, int i14);

    void voiceMuteCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);

    void voiceRequestAnswer(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, String str, String str2, String str3, String str4, String str5);

    void voiceRequestCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, String str, int i13, String str2, int i14, int i15, int i16, String str3, String str4);

    void voiceRequestCallZRTPWithExtendData(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, byte[] bArr, int i14, byte[] bArr2, int i15, byte[] bArr3, int i16, byte[] bArr4, int i17, byte[] bArr5, int i18, byte[] bArr6, int i19, byte[] bArr7, boolean z11, int i21);

    void voiceRequestChangeZRTP(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, int i14, byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3);

    void voiceRequestChangeZRTPACK(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13, byte[] bArr, int i14, byte[] bArr2, int i15, byte[] bArr3);

    void voiceResumeCall(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);

    void voipIncomingAck(IVoipServiceRequestCallback iVoipServiceRequestCallback, int i11, int i12, int i13);
}
