package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public final class yf3 extends zi3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public yf3() {
        super(um3.class, new wf3(pd3.class));
    }

    /* renamed from: k */
    public static void m28199k(boolean z11) {
        if (m28201m()) {
            df3.m21378l(new yf3(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* bridge */ /* synthetic */ xi3 m28200l(int i11, int i12) {
        wm3 m27937G = xm3.m27937G();
        m27937G.m27658q(i11);
        return new xi3((xm3) m27937G.m25898n(), i12);
    }

    /* renamed from: m */
    private static boolean m28201m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new xf3(this, xm3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return um3.m27007I(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        um3 um3Var = (um3) zv3Var;
        os3.m25256b(um3Var.m27010F(), 0);
        os3.m25255a(um3Var.m27011J().mo22168p());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
