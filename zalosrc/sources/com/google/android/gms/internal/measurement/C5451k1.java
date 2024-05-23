package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.k1 */
/* loaded from: classes2.dex */
public final class C5451k1 extends AbstractC5518o0 implements InterfaceC5485m1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5451k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5485m1
    /* renamed from: T */
    public final void mo29330T(String str, String str2, Bundle bundle, long j11) {
        Parcel m29469E = m29469E();
        m29469E.writeString(str);
        m29469E.writeString(str2);
        AbstractC5552q0.m29545d(m29469E, bundle);
        m29469E.writeLong(j11);
        m29471Q(1, m29469E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5485m1
    public final int zzd() {
        Parcel m29470N = m29470N(2, m29469E());
        int readInt = m29470N.readInt();
        m29470N.recycle();
        return readInt;
    }
}
