package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class mh3 {

    /* renamed from: a */
    public static final uq3 f24531a;

    /* renamed from: b */
    public static final uq3 f24532b;

    /* renamed from: c */
    public static final uq3 f24533c;

    static {
        new lh3();
        new jh3();
        f24531a = uq3.m27044G();
        f24532b = uq3.m27044G();
        f24533c = uq3.m27044G();
        try {
            df3.m21379m(new oh3());
            df3.m21379m(new rh3());
            gf3.m22433a();
            if (zg3.m28501b()) {
                return;
            }
            df3.m21377k(new jh3(), new lh3(), true);
            df3.m21377k(new ii3(), new ki3(), true);
        } catch (GeneralSecurityException e11) {
            throw new ExceptionInInitializerError(e11);
        }
    }
}
