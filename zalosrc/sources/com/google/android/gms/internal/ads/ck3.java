package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class ck3 extends zi3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ck3() {
        super(fl3.class, new ak3(oe3.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m20916m(ml3 ml3Var) {
        if (ml3Var.m24627F() >= 10) {
            if (ml3Var.m24627F() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m20917n(int i11) {
        if (i11 == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new bk3(this, jl3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return fl3.m22077I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        fl3 fl3Var = (fl3) zv3Var;
        os3.m25256b(fl3Var.m22081F(), 0);
        m20917n(fl3Var.m22083K().mo22168p());
        m20916m(fl3Var.m22082J());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
