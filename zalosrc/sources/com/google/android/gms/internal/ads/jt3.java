package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jt3 extends OutputStream {

    /* renamed from: u */
    private static final byte[] f22993u = new byte[0];

    /* renamed from: r */
    private int f22996r;

    /* renamed from: t */
    private int f22998t;

    /* renamed from: p */
    private final int f22994p = 128;

    /* renamed from: q */
    private final ArrayList f22995q = new ArrayList();

    /* renamed from: s */
    private byte[] f22997s = new byte[128];

    public jt3(int i11) {
    }

    /* renamed from: d */
    private final void m23749d(int i11) {
        this.f22995q.add(new it3(this.f22997s));
        int length = this.f22996r + this.f22997s.length;
        this.f22996r = length;
        this.f22997s = new byte[Math.max(this.f22994p, Math.max(i11, length >>> 1))];
        this.f22998t = 0;
    }

    /* renamed from: a */
    public final synchronized int m23750a() {
        return this.f22996r + this.f22998t;
    }

    /* renamed from: b */
    public final synchronized mt3 m23751b() {
        try {
            int i11 = this.f22998t;
            byte[] bArr = this.f22997s;
            if (i11 < bArr.length) {
                if (i11 > 0) {
                    this.f22995q.add(new it3(Arrays.copyOf(bArr, i11)));
                }
            } else {
                this.f22995q.add(new it3(this.f22997s));
                this.f22997s = f22993u;
            }
            this.f22996r += this.f22998t;
            this.f22998t = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return mt3.m24725H(this.f22995q);
    }

    /* renamed from: c */
    public final synchronized void m23752c() {
        this.f22995q.clear();
        this.f22996r = 0;
        this.f22998t = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(m23750a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i11) {
        try {
            if (this.f22998t == this.f22997s.length) {
                m23749d(1);
            }
            byte[] bArr = this.f22997s;
            int i12 = this.f22998t;
            this.f22998t = i12 + 1;
            bArr[i12] = (byte) i11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.f22997s;
        int length = bArr2.length;
        int i13 = this.f22998t;
        int i14 = length - i13;
        if (i12 <= i14) {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.f22998t += i12;
            return;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i14);
        int i15 = i12 - i14;
        m23749d(i15);
        System.arraycopy(bArr, i11 + i14, this.f22997s, 0, i15);
        this.f22998t = i15;
    }
}
