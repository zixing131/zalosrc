package com.android.internal.telephony.msim;

/* loaded from: classes2.dex */
public interface ITelephonyMSim {
    void answerRingingCall(int i11);

    void call(String str, String str2, int i11);

    void cancelMissedCallsNotification(int i11);

    void dial(String str, int i11);

    int disableApnType(String str);

    boolean disableDataConnectivity();

    int enableApnType(String str);

    boolean enableDataConnectivity();

    boolean endCall(int i11);

    int getActivePhoneType(int i11);

    int getCallState(int i11);

    int getCdmaEriIconIndex(int i11);

    int getCdmaEriIconMode(int i11);

    String getCdmaEriText(int i11);

    int getDataActivity();

    int getDataState();

    int getVoiceMessageCount(int i11);

    boolean handlePinMmi(String str, int i11);

    boolean isDataConnectivityPossible();

    boolean isIdle(int i11);

    boolean isOffhook(int i11);

    boolean isRadioOn(int i11);

    boolean isRinging(int i11);

    boolean isSimPinEnabled(int i11);

    boolean setRadio(boolean z11, int i11);

    boolean showCallScreen();

    boolean showCallScreenWithDialpad(boolean z11);

    void silenceRinger();

    boolean supplyPin(String str, int i11);

    void toggleRadioOnOff(int i11);

    void updateServiceLocation(int i11);
}
