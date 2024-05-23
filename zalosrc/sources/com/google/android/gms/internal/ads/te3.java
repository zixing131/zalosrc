package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class te3 {

    /* renamed from: a */
    private final Object f28295a;

    /* renamed from: b */
    private final byte[] f28296b;

    /* renamed from: c */
    private final int f28297c;

    /* renamed from: d */
    private final qe3 f28298d;

    /* renamed from: e */
    private final int f28299e;

    /* renamed from: f */
    private final int f28300f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public te3(Object obj, byte[] bArr, int i11, int i12, int i13, qe3 qe3Var) {
        this.f28295a = obj;
        this.f28296b = Arrays.copyOf(bArr, bArr.length);
        this.f28299e = i11;
        this.f28300f = i12;
        this.f28297c = i13;
        this.f28298d = qe3Var;
    }

    /* renamed from: a */
    public final int m26601a() {
        return this.f28297c;
    }

    /* renamed from: b */
    public final qe3 m26602b() {
        return this.f28298d;
    }

    /* renamed from: c */
    public final Object m26603c() {
        return this.f28295a;
    }

    /* renamed from: d */
    public final byte[] m26604d() {
        byte[] bArr = this.f28296b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* renamed from: e */
    public final int m26605e() {
        return this.f28299e;
    }

    /* renamed from: f */
    public final int m26606f() {
        return this.f28300f;
    }
}
