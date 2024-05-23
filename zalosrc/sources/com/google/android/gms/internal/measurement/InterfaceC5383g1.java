package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes.dex */
public interface InterfaceC5383g1 extends IInterface {
    void beginAdUnitExposure(String str, long j11);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j11);

    void endAdUnitExposure(String str, long j11);

    void generateEventId(InterfaceC5434j1 interfaceC5434j1);

    void getAppInstanceId(InterfaceC5434j1 interfaceC5434j1);

    void getCachedAppInstanceId(InterfaceC5434j1 interfaceC5434j1);

    void getConditionalUserProperties(String str, String str2, InterfaceC5434j1 interfaceC5434j1);

    void getCurrentScreenClass(InterfaceC5434j1 interfaceC5434j1);

    void getCurrentScreenName(InterfaceC5434j1 interfaceC5434j1);

    void getGmpAppId(InterfaceC5434j1 interfaceC5434j1);

    void getMaxUserProperties(String str, InterfaceC5434j1 interfaceC5434j1);

    void getSessionId(InterfaceC5434j1 interfaceC5434j1);

    void getTestFlag(InterfaceC5434j1 interfaceC5434j1, int i11);

    void getUserProperties(String str, String str2, boolean z11, InterfaceC5434j1 interfaceC5434j1);

    void initForTests(Map map);

    void initialize(InterfaceC4271b interfaceC4271b, zzcl zzclVar, long j11);

    void isDataCollectionEnabled(InterfaceC5434j1 interfaceC5434j1);

    void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC5434j1 interfaceC5434j1, long j11);

    void logHealthData(int i11, String str, InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3);

    void onActivityCreated(InterfaceC4271b interfaceC4271b, Bundle bundle, long j11);

    void onActivityDestroyed(InterfaceC4271b interfaceC4271b, long j11);

    void onActivityPaused(InterfaceC4271b interfaceC4271b, long j11);

    void onActivityResumed(InterfaceC4271b interfaceC4271b, long j11);

    void onActivitySaveInstanceState(InterfaceC4271b interfaceC4271b, InterfaceC5434j1 interfaceC5434j1, long j11);

    void onActivityStarted(InterfaceC4271b interfaceC4271b, long j11);

    void onActivityStopped(InterfaceC4271b interfaceC4271b, long j11);

    void performAction(Bundle bundle, InterfaceC5434j1 interfaceC5434j1, long j11);

    void registerOnMeasurementEventListener(InterfaceC5485m1 interfaceC5485m1);

    void resetAnalyticsData(long j11);

    void setConditionalUserProperty(Bundle bundle, long j11);

    void setConsent(Bundle bundle, long j11);

    void setConsentThirdParty(Bundle bundle, long j11);

    void setCurrentScreen(InterfaceC4271b interfaceC4271b, String str, String str2, long j11);

    void setDataCollectionEnabled(boolean z11);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC5485m1 interfaceC5485m1);

    void setInstanceIdProvider(InterfaceC5519o1 interfaceC5519o1);

    void setMeasurementEnabled(boolean z11, long j11);

    void setMinimumSessionDuration(long j11);

    void setSessionTimeoutDuration(long j11);

    void setUserId(String str, long j11);

    void setUserProperty(String str, String str2, InterfaceC4271b interfaceC4271b, boolean z11, long j11);

    void unregisterOnMeasurementEventListener(InterfaceC5485m1 interfaceC5485m1);
}
