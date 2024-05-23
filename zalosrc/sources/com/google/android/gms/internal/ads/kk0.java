package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class kk0 {

    /* renamed from: a */
    private BigInteger f23352a = BigInteger.ONE;

    /* renamed from: b */
    private String f23353b = "0";

    /* renamed from: a */
    public final synchronized String m23954a() {
        String bigInteger;
        bigInteger = this.f23352a.toString();
        this.f23352a = this.f23352a.add(BigInteger.ONE);
        this.f23353b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String m23955b() {
        return this.f23353b;
    }
}
