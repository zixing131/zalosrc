package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ss3 {

    /* renamed from: a */
    private final byte[] f27839a;

    private ss3(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f27839a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i12);
    }

    /* renamed from: a */
    public static ss3 m26397a(byte[] bArr) {
        if (bArr != null) {
            return new ss3(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: b */
    public final byte[] m26398b() {
        byte[] bArr = this.f27839a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ss3)) {
            return false;
        }
        return Arrays.equals(((ss3) obj).f27839a, this.f27839a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27839a);
    }

    public final String toString() {
        return "Bytes(" + fs3.m22159a(this.f27839a) + ")";
    }
}
