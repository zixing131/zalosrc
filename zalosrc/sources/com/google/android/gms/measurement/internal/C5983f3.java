package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC5518o0;
import com.google.android.gms.internal.measurement.AbstractC5552q0;
import java.util.ArrayList;
import java.util.List;
import p230i6.InterfaceC20314f;

/* renamed from: com.google.android.gms.measurement.internal.f3 */
/* loaded from: classes2.dex */
public final class C5983f3 extends AbstractC5518o0 implements InterfaceC20314f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5983f3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: D2 */
    public final void mo30893D2(zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(6, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: H1 */
    public final void mo30894H1(zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(20, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: I2 */
    public final void mo30895I2(Bundle bundle, zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, bundle);
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(19, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: K2 */
    public final List mo30896K2(String str, String str2, String str3, boolean z11) {
        Parcel m29469E = m29469E();
        m29469E.writeString(null);
        m29469E.writeString(str2);
        m29469E.writeString(str3);
        int i11 = AbstractC5552q0.f32739b;
        m29469E.writeInt(z11 ? 1 : 0);
        Parcel m29470N = m29470N(15, m29469E);
        ArrayList createTypedArrayList = m29470N.createTypedArrayList(zzli.CREATOR);
        m29470N.recycle();
        return createTypedArrayList;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: M3 */
    public final List mo30897M3(String str, String str2, zzq zzqVar) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        Parcel m29470N = m29470N(16, m29469E);
        ArrayList createTypedArrayList = m29470N.createTypedArrayList(zzac.CREATOR);
        m29470N.recycle();
        return createTypedArrayList;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: N1 */
    public final List mo30898N1(String str, String str2, boolean z11, zzq zzqVar) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        int i11 = AbstractC5552q0.f32739b;
        m29469E.writeInt(z11 ? 1 : 0);
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        Parcel m29470N = m29470N(14, m29469E);
        ArrayList createTypedArrayList = m29470N.createTypedArrayList(zzli.CREATOR);
        m29470N.recycle();
        return createTypedArrayList;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: U2 */
    public final byte[] mo30899U2(zzaw zzawVar, String str) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzawVar);
        m29469E.writeString(str);
        Parcel m29470N = m29470N(9, m29469E);
        byte[] createByteArray = m29470N.createByteArray();
        m29470N.recycle();
        return createByteArray;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: X1 */
    public final void mo30900X1(zzli zzliVar, zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzliVar);
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(2, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: Y1 */
    public final void mo30901Y1(zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(18, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: a3 */
    public final String mo30902a3(zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        Parcel m29470N = m29470N(11, m29469E);
        String readString = m29470N.readString();
        m29470N.recycle();
        return readString;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: b1 */
    public final void mo30903b1(zzaw zzawVar, zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzawVar);
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(1, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: f1 */
    public final void mo30904f1(zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(4, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: g3 */
    public final List mo30905g3(String str, String str2, String str3) {
        Parcel m29469E = m29469E();
        m29469E.writeString(null);
        m29469E.writeString(str2);
        m29469E.writeString(str3);
        Parcel m29470N = m29470N(17, m29469E);
        ArrayList createTypedArrayList = m29470N.createTypedArrayList(zzac.CREATOR);
        m29470N.recycle();
        return createTypedArrayList;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: l1 */
    public final void mo30906l1(long j11, String str, String str2, String str3) {
        Parcel m29469E = m29469E();
        m29469E.writeLong(j11);
        m29469E.writeString(str);
        m29469E.writeString(str2);
        m29469E.writeString(str3);
        m29471Q(10, m29469E);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: z4 */
    public final void mo30907z4(zzac zzacVar, zzq zzqVar) {
        Parcel m29469E = m29469E();
        AbstractC5552q0.m29545d(m29469E, zzacVar);
        AbstractC5552q0.m29545d(m29469E, zzqVar);
        m29471Q(12, m29469E);
    }
}
