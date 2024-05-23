package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class gf3 {

    /* renamed from: a */
    public static final String f20573a;

    /* renamed from: b */
    public static final String f20574b;

    /* renamed from: c */
    public static final uq3 f20575c;

    /* renamed from: d */
    public static final uq3 f20576d;

    /* renamed from: e */
    public static final uq3 f20577e;

    static {
        new mf3();
        f20573a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new vf3();
        f20574b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new yf3();
        new sf3();
        new eg3();
        new ig3();
        new bg3();
        new lg3();
        uq3 m27044G = uq3.m27044G();
        f20575c = m27044G;
        f20576d = m27044G;
        f20577e = m27044G;
        try {
            m22433a();
        } catch (GeneralSecurityException e11) {
            throw new ExceptionInInitializerError(e11);
        }
    }

    /* renamed from: a */
    public static void m22433a() {
        df3.m21379m(new jf3());
        mk3.m24620a();
        df3.m21378l(new mf3(), true);
        df3.m21378l(new vf3(), true);
        if (zg3.m28501b()) {
            return;
        }
        df3.m21378l(new sf3(), true);
        yf3.m28199k(true);
        df3.m21378l(new bg3(), true);
        df3.m21378l(new eg3(), true);
        df3.m21378l(new ig3(), true);
        df3.m21378l(new lg3(), true);
    }
}
