package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class im4 implements InterfaceC4928r {

    /* renamed from: a */
    private final byte[] f22231a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: a */
    public final /* synthetic */ int mo23297a(td4 td4Var, int i11, boolean z11) {
        return AbstractC4853p.m25365a(this, td4Var, i11, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: b */
    public final int mo23298b(td4 td4Var, int i11, boolean z11, int i12) {
        int mo19942a = td4Var.mo19942a(this.f22231a, 0, Math.min(4096, i11));
        if (mo19942a == -1) {
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }
        return mo19942a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: c */
    public final void mo23299c(x02 x02Var, int i11, int i12) {
        x02Var.m27776g(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: d */
    public final void mo23300d(C4671k3 c4671k3) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: e */
    public final /* synthetic */ void mo23301e(x02 x02Var, int i11) {
        AbstractC4853p.m25366b(this, x02Var, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: f */
    public final void mo23302f(long j11, int i11, int i12, int i13, C4891q c4891q) {
    }
}
