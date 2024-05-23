package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p504s5.AbstractC26133a;
import p504s5.AbstractC26135c;

/* renamed from: com.google.android.gms.common.internal.h0 */
/* loaded from: classes2.dex */
public final class C4185h0 extends AbstractC26133a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4185h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: W4 */
    public final InterfaceC4271b m19695W4(InterfaceC4271b interfaceC4271b, zax zaxVar) {
        Parcel m134497E = m134497E();
        AbstractC26135c.m134505e(m134497E, interfaceC4271b);
        AbstractC26135c.m134504d(m134497E, zaxVar);
        Parcel m134499N = m134499N(2, m134497E);
        InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(m134499N.readStrongBinder());
        m134499N.recycle();
        return m19911N;
    }
}
