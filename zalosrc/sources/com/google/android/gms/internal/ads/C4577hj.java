package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.hj */
/* loaded from: classes2.dex */
public final class C4577hj {

    /* renamed from: g */
    private static final byte[] f21778g = new byte[4096];

    /* renamed from: a */
    private final InterfaceC4840on f21779a;

    /* renamed from: b */
    private final long f21780b;

    /* renamed from: c */
    private long f21781c;

    /* renamed from: d */
    private byte[] f21782d = new byte[65536];

    /* renamed from: e */
    private int f21783e;

    /* renamed from: f */
    private int f21784f;

    public C4577hj(InterfaceC4840on interfaceC4840on, long j11, long j12) {
        this.f21779a = interfaceC4840on;
        this.f21781c = j11;
        this.f21780b = j12;
    }

    /* renamed from: j */
    private final int m22909j(byte[] bArr, int i11, int i12, int i13, boolean z11) {
        if (!Thread.interrupted()) {
            int mo20617a = this.f21779a.mo20617a(bArr, i11 + i13, i12 - i13);
            if (mo20617a == -1) {
                if (i13 == 0 && z11) {
                    return -1;
                }
                throw new EOFException();
            }
            return i13 + mo20617a;
        }
        throw new InterruptedException();
    }

    /* renamed from: k */
    private final int m22910k(byte[] bArr, int i11, int i12) {
        int i13 = this.f21784f;
        if (i13 == 0) {
            return 0;
        }
        int min = Math.min(i13, i12);
        System.arraycopy(this.f21782d, 0, bArr, i11, min);
        m22913n(min);
        return min;
    }

    /* renamed from: l */
    private final int m22911l(int i11) {
        int min = Math.min(this.f21784f, i11);
        m22913n(min);
        return min;
    }

    /* renamed from: m */
    private final void m22912m(int i11) {
        if (i11 != -1) {
            this.f21781c += i11;
        }
    }

    /* renamed from: n */
    private final void m22913n(int i11) {
        byte[] bArr;
        int i12 = this.f21784f - i11;
        this.f21784f = i12;
        this.f21783e = 0;
        byte[] bArr2 = this.f21782d;
        if (i12 < bArr2.length - 524288) {
            bArr = new byte[65536 + i12];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i11, bArr, 0, i12);
        this.f21782d = bArr;
    }

    /* renamed from: a */
    public final int m22914a(byte[] bArr, int i11, int i12) {
        int m22910k = m22910k(bArr, i11, i12);
        if (m22910k == 0) {
            m22910k = m22909j(bArr, i11, i12, 0, true);
        }
        m22912m(m22910k);
        return m22910k;
    }

    /* renamed from: b */
    public final int m22915b(int i11) {
        int m22911l = m22911l(i11);
        if (m22911l == 0) {
            m22911l = m22909j(f21778g, 0, Math.min(i11, 4096), 0, true);
        }
        m22912m(m22911l);
        return m22911l;
    }

    /* renamed from: c */
    public final long m22916c() {
        return this.f21780b;
    }

    /* renamed from: d */
    public final long m22917d() {
        return this.f21781c;
    }

    /* renamed from: e */
    public final void m22918e() {
        this.f21783e = 0;
    }

    /* renamed from: f */
    public final boolean m22919f(int i11, boolean z11) {
        int i12 = this.f21783e + i11;
        int length = this.f21782d.length;
        if (i12 > length) {
            this.f21782d = Arrays.copyOf(this.f21782d, AbstractC4916qo.m25829e(length + length, 65536 + i12, i12 + 524288));
        }
        int min = Math.min(this.f21784f - this.f21783e, i11);
        while (min < i11) {
            min = m22909j(this.f21782d, this.f21783e, i11, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i13 = this.f21783e + i11;
        this.f21783e = i13;
        this.f21784f = Math.max(this.f21784f, i13);
        return true;
    }

    /* renamed from: g */
    public final boolean m22920g(byte[] bArr, int i11, int i12, boolean z11) {
        if (!m22919f(i12, false)) {
            return false;
        }
        System.arraycopy(this.f21782d, this.f21783e - i12, bArr, i11, i12);
        return true;
    }

    /* renamed from: h */
    public final boolean m22921h(byte[] bArr, int i11, int i12, boolean z11) {
        int m22910k = m22910k(bArr, i11, i12);
        while (m22910k < i12 && m22910k != -1) {
            m22910k = m22909j(bArr, i11, i12, m22910k, z11);
        }
        m22912m(m22910k);
        if (m22910k != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m22922i(int i11, boolean z11) {
        int m22911l = m22911l(i11);
        while (m22911l < i11 && m22911l != -1) {
            m22911l = m22909j(f21778g, -m22911l, Math.min(i11, m22911l + 4096), m22911l, false);
        }
        m22912m(m22911l);
        if (m22911l != -1) {
            return true;
        }
        return false;
    }
}
