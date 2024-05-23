package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

/* loaded from: classes2.dex */
public final class nr3 implements wd3 {

    /* renamed from: a */
    private final ECPrivateKey f25309a;

    /* renamed from: b */
    private final qr3 f25310b;

    /* renamed from: c */
    private final String f25311c;

    /* renamed from: d */
    private final byte[] f25312d;

    /* renamed from: e */
    private final mr3 f25313e;

    public nr3(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i11, mr3 mr3Var) {
        this.f25309a = eCPrivateKey;
        this.f25310b = new qr3(eCPrivateKey);
        this.f25312d = bArr;
        this.f25311c = str;
        this.f25313e = mr3Var;
    }
}
