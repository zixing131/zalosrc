package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class pf3 extends zi3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public pf3() {
        super(vl3.class, new nf3(gs3.class));
    }

    /* renamed from: l */
    public static final void m25438l(vl3 vl3Var) {
        os3.m25256b(vl3Var.m27300F(), 0);
        os3.m25255a(vl3Var.m27302L().mo22168p());
        m25439m(vl3Var.m27301K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m25439m(bm3 bm3Var) {
        if (bm3Var.m20604F() >= 12 && bm3Var.m20604F() <= 16) {
        } else {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new of3(this, yl3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return vl3.m27296J(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        m25438l((vl3) zv3Var);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
