package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* renamed from: com.google.android.gms.internal.measurement.e1 */
/* loaded from: classes2.dex */
public final class C5349e1 extends AbstractC5518o0 implements InterfaceC5383g1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5349e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void beginAdUnitExposure(String str, long j11) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeLong(j11);
        m29471Q(23, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29471Q(9, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void endAdUnitExposure(String str, long j11) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeLong(j11);
        m29471Q(24, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void generateEventId(InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(22, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getCachedAppInstanceId(InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(19, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getConditionalUserProperties(String str, String str2, InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(10, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getCurrentScreenClass(InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(17, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getCurrentScreenName(InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(16, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getGmpAppId(InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(21, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getMaxUserProperties(String str, InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(6, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void getUserProperties(String str, String str2, boolean z11, InterfaceC5434j1 interfaceC5434j1) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        int i11 = AbstractC5552q0.f32739b;
        m29469E.writeInt(z11 ? 1 : 0);
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29471Q(5, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void initialize(InterfaceC4271b interfaceC4271b, zzcl zzclVar, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        AbstractC5552q0.m29545d(m29469E, zzclVar);
        m29469E.writeLong(j11);
        m29471Q(1, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29469E.writeInt(z11 ? 1 : 0);
        m29469E.writeInt(z12 ? 1 : 0);
        m29469E.writeLong(j11);
        m29471Q(2, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void logHealthData(int i11, String str, InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) {
        Parcel m29469E = m29469E();
        m29469E.writeInt(5);
        m29469E.writeString(str);
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b2);
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b3);
        m29471Q(33, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivityCreated(InterfaceC4271b interfaceC4271b, Bundle bundle, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29469E.writeLong(j11);
        m29471Q(27, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivityDestroyed(InterfaceC4271b interfaceC4271b, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeLong(j11);
        m29471Q(28, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivityPaused(InterfaceC4271b interfaceC4271b, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeLong(j11);
        m29471Q(29, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivityResumed(InterfaceC4271b interfaceC4271b, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeLong(j11);
        m29471Q(30, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivitySaveInstanceState(InterfaceC4271b interfaceC4271b, InterfaceC5434j1 interfaceC5434j1, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29469E.writeLong(j11);
        m29471Q(31, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivityStarted(InterfaceC4271b interfaceC4271b, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeLong(j11);
        m29471Q(25, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void onActivityStopped(InterfaceC4271b interfaceC4271b, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeLong(j11);
        m29471Q(26, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void performAction(Bundle bundle, InterfaceC5434j1 interfaceC5434j1, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, bundle);
        AbstractC5552q0.m29546e(m29469E, interfaceC5434j1);
        m29469E.writeLong(j11);
        m29471Q(32, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void registerOnMeasurementEventListener(InterfaceC5485m1 interfaceC5485m1) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC5485m1);
        m29471Q(35, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void setConditionalUserProperty(Bundle bundle, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29469E.writeLong(j11);
        m29471Q(8, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void setConsent(Bundle bundle, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29469E.writeLong(j11);
        m29471Q(44, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void setCurrentScreen(InterfaceC4271b interfaceC4271b, String str, String str2, long j11) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeString(str);
        m29469E.writeString(str2);
        m29469E.writeLong(j11);
        m29471Q(15, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void setDataCollectionEnabled(boolean z11) {
        Parcel m29469E = m29469E();
        int i11 = AbstractC5552q0.f32739b;
        m29469E.writeInt(z11 ? 1 : 0);
        m29471Q(39, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public final void setUserProperty(String str, String str2, InterfaceC4271b interfaceC4271b, boolean z11, long j11) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        AbstractC5552q0.m29546e(m29469E, interfaceC4271b);
        m29469E.writeInt(z11 ? 1 : 0);
        m29469E.writeLong(j11);
        m29471Q(4, m29469E);
    }
}
