package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p538u5.AbstractC27034a;

/* renamed from: com.google.android.gms.common.internal.w1 */
/* loaded from: classes2.dex */
public final class C4231w1 extends AbstractC27034a implements InterfaceC4237y1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4231w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4237y1
    public final int zzc() {
        Parcel m139176E = m139176E(2, m139177N());
        int readInt = m139176E.readInt();
        m139176E.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4237y1
    public final InterfaceC4271b zzd() {
        Parcel m139176E = m139176E(1, m139177N());
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m139176E.readStrongBinder());
        m139176E.recycle();
        return m19911N;
    }
}
