package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.qn */
/* loaded from: classes2.dex */
public final class C4915qn {

    /* renamed from: b */
    private int f26886b;

    /* renamed from: c */
    private int f26887c;

    /* renamed from: d */
    private int f26888d = 0;

    /* renamed from: e */
    private C4728ln[] f26889e = new C4728ln[100];

    /* renamed from: a */
    private final C4728ln[] f26885a = new C4728ln[1];

    public C4915qn(boolean z11, int i11) {
    }

    /* renamed from: a */
    public final synchronized int m25810a() {
        return this.f26887c * 65536;
    }

    /* renamed from: b */
    public final synchronized C4728ln m25811b() {
        C4728ln c4728ln;
        try {
            this.f26887c++;
            int i11 = this.f26888d;
            if (i11 > 0) {
                C4728ln[] c4728lnArr = this.f26889e;
                int i12 = i11 - 1;
                this.f26888d = i12;
                c4728ln = c4728lnArr[i12];
                c4728lnArr[i12] = null;
            } else {
                c4728ln = new C4728ln(new byte[65536], 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c4728ln;
    }

    /* renamed from: c */
    public final synchronized void m25812c(C4728ln c4728ln) {
        C4728ln[] c4728lnArr = this.f26885a;
        c4728lnArr[0] = c4728ln;
        m25813d(c4728lnArr);
    }

    /* renamed from: d */
    public final synchronized void m25813d(C4728ln[] c4728lnArr) {
        try {
            int length = this.f26888d + c4728lnArr.length;
            C4728ln[] c4728lnArr2 = this.f26889e;
            int length2 = c4728lnArr2.length;
            if (length >= length2) {
                this.f26889e = (C4728ln[]) Arrays.copyOf(c4728lnArr2, Math.max(length2 + length2, length));
            }
            for (C4728ln c4728ln : c4728lnArr) {
                byte[] bArr = c4728ln.f23990a;
                C4728ln[] c4728lnArr3 = this.f26889e;
                int i11 = this.f26888d;
                this.f26888d = i11 + 1;
                c4728lnArr3[i11] = c4728ln;
            }
            this.f26887c -= c4728lnArr.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public final synchronized void m25814e() {
        m25815f(0);
    }

    /* renamed from: f */
    public final synchronized void m25815f(int i11) {
        int i12 = this.f26886b;
        this.f26886b = i11;
        if (i11 < i12) {
            m25816g();
        }
    }

    /* renamed from: g */
    public final synchronized void m25816g() {
        int max = Math.max(0, AbstractC4916qo.m25828d(this.f26886b, 65536) - this.f26887c);
        int i11 = this.f26888d;
        if (max >= i11) {
            return;
        }
        Arrays.fill(this.f26889e, max, i11, (Object) null);
        this.f26888d = max;
    }
}
