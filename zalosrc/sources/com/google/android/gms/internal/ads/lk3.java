package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class lk3 extends zi3 {
    public lk3() {
        super(mo3.class, new jk3(oe3.class));
    }

    /* renamed from: l */
    public static final void m24323l(mo3 mo3Var) {
        os3.m25256b(mo3Var.m24661F(), 0);
        if (mo3Var.m24663L().mo22168p() >= 16) {
            m24325n(mo3Var.m24662K());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static /* bridge */ /* synthetic */ xi3 m24324m(int i11, int i12, int i13, int i14) {
        oo3 m25494G = po3.m25494G();
        ro3 m26377G = so3.m26377G();
        m26377G.m26151r(i13);
        m26377G.m26150q(i12);
        m25494G.m25241r((so3) m26377G.m25898n());
        m25494G.m25240q(i11);
        return new xi3((po3) m25494G.m25898n(), i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m24325n(so3 so3Var) {
        if (so3Var.m26382F() >= 10) {
            int m26383K = so3Var.m26383K() - 2;
            if (m26383K != 1) {
                if (m26383K != 2) {
                    if (m26383K != 3) {
                        if (m26383K != 4) {
                            if (m26383K == 5) {
                                if (so3Var.m26382F() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (so3Var.m26382F() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    if (so3Var.m26382F() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                if (so3Var.m26382F() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (so3Var.m26382F() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: a */
    public final yi3 mo20513a() {
        return new kk3(this, po3.class);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: b */
    public final /* synthetic */ zv3 mo20514b(mt3 mt3Var) {
        return mo3.m24657J(mt3Var, gu3.m22615a());
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: c */
    public final String mo20515c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20516d(zv3 zv3Var) {
        m24323l((mo3) zv3Var);
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: e */
    public final int mo24326e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zi3
    /* renamed from: f */
    public final int mo20517f() {
        return 3;
    }
}
