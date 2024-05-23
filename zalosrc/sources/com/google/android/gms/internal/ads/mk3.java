package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class mk3 {

    /* renamed from: a */
    public static final uq3 f24639a;

    /* renamed from: b */
    public static final uq3 f24640b;

    /* renamed from: c */
    public static final uq3 f24641c;

    static {
        new lk3();
        uq3 m27044G = uq3.m27044G();
        f24639a = m27044G;
        f24640b = m27044G;
        f24641c = m27044G;
        try {
            m24620a();
        } catch (GeneralSecurityException e11) {
            throw new ExceptionInInitializerError(e11);
        }
    }

    /* renamed from: a */
    public static void m24620a() {
        df3.m21379m(new rk3());
        df3.m21378l(new lk3(), true);
        if (zg3.m28501b()) {
            return;
        }
        df3.m21378l(new ck3(), true);
        ik3.m23286a();
    }
}
