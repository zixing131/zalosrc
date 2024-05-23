package com.android.internal.telephony;

import android.os.Bundle;
import android.telephony.NeighboringCellInfo;
import java.util.List;

/* loaded from: classes2.dex */
public interface ITelephony {
    void answerRingingCall();

    void call(String str);

    void cancelMissedCallsNotification();

    void dial(String str);

    int disableApnType(String str);

    boolean disableDataConnectivity();

    void disableLocationUpdates();

    int enableApnType(String str);

    boolean enableDataConnectivity();

    void enableLocationUpdates();

    boolean endCall();

    int getActivePhoneType();

    int getCallState();

    int getCdmaEriIconIndex();

    int getCdmaEriIconMode();

    String getCdmaEriText();

    Bundle getCellLocation();

    int getDataActivity();

    int getDataState();

    List<NeighboringCellInfo> getNeighboringCellInfo();

    int getVoiceMessageCount();

    boolean handlePinMmi(String str);

    boolean isDataConnectivityPossible();

    boolean isIdle();

    boolean isOffhook();

    boolean isRadioOn();

    boolean isRinging();

    boolean isSimPinEnabled();

    boolean setRadio(boolean z11);

    boolean showCallScreen();

    boolean showCallScreenWithDialpad(boolean z11);

    void silenceRinger();

    boolean supplyPin(String str);

    void toggleRadioOnOff();

    void updateServiceLocation();
}
