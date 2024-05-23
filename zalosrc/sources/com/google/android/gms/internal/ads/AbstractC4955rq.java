package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.rq */
/* loaded from: classes2.dex */
public abstract class AbstractC4955rq {

    /* renamed from: b */
    private static MessageDigest f27342b;

    /* renamed from: a */
    protected final Object f27343a = new Object();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest m26152a() {
        synchronized (this.f27343a) {
            MessageDigest messageDigest = f27342b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i11 = 0; i11 < 2; i11++) {
                try {
                    f27342b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f27342b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte[] mo20225b(String str);
}
