package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.InterfaceC4187i;
import p290k6.InterfaceC21481c;
import p504s5.AbstractC26133a;
import p504s5.AbstractC26135c;

/* renamed from: com.google.android.gms.signin.internal.c */
/* loaded from: classes2.dex */
public final class C6212c extends AbstractC26133a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C6212c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: W4 */
    public final void m31520W4(int i11) {
        Parcel m134497E = m134497E();
        m134497E.writeInt(i11);
        m134500Q(7, m134497E);
    }

    /* renamed from: X4 */
    public final void m31521X4(InterfaceC4187i interfaceC4187i, int i11, boolean z11) {
        Parcel m134497E = m134497E();
        AbstractC26135c.m134505e(m134497E, interfaceC4187i);
        m134497E.writeInt(i11);
        AbstractC26135c.m134503c(m134497E, z11);
        m134500Q(9, m134497E);
    }

    /* renamed from: Y4 */
    public final void m31522Y4(zai zaiVar, InterfaceC21481c interfaceC21481c) {
        Parcel m134497E = m134497E();
        AbstractC26135c.m134504d(m134497E, zaiVar);
        AbstractC26135c.m134505e(m134497E, interfaceC21481c);
        m134500Q(12, m134497E);
    }
}
