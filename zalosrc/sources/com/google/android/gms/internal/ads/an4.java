package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class an4 {

    /* renamed from: a */
    private final x02 f17201a = new x02(10);

    /* renamed from: a */
    public final zzbq m20194a(km4 km4Var, InterfaceC5041u1 interfaceC5041u1) {
        zzbq zzbqVar = null;
        int i11 = 0;
        while (true) {
            try {
                ((yl4) km4Var).mo23963f(this.f17201a.m27777h(), 0, 10, false);
                this.f17201a.m27775f(0);
                if (this.f17201a.m27790u() != 4801587) {
                    break;
                }
                this.f17201a.m27776g(3);
                int m27787r = this.f17201a.m27787r();
                int i12 = m27787r + 10;
                if (zzbqVar == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(this.f17201a.m27777h(), 0, bArr, 0, 10);
                    ((yl4) km4Var).mo23963f(bArr, 10, m27787r, false);
                    zzbqVar = AbstractC5115w1.m27444a(bArr, i12, interfaceC5041u1, new C4522g1());
                } else {
                    ((yl4) km4Var).m28247k(m27787r, false);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        km4Var.zzj();
        ((yl4) km4Var).m28247k(i11, false);
        return zzbqVar;
    }
}
