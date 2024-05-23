package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class dh3 {

    /* renamed from: a */
    public static final String f19246a;

    /* renamed from: b */
    public static final uq3 f19247b;

    /* renamed from: c */
    public static final uq3 f19248c;

    static {
        new ch3();
        f19246a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f19247b = uq3.m27044G();
        f19248c = uq3.m27044G();
        try {
            df3.m21379m(new fh3());
            if (zg3.m28501b()) {
                return;
            }
            df3.m21378l(new ch3(), true);
        } catch (GeneralSecurityException e11) {
            throw new ExceptionInInitializerError(e11);
        }
    }
}
