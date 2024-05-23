package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d6 */
/* loaded from: classes2.dex */
final class C4416d6 {

    /* renamed from: a */
    private final int f19108a;

    /* renamed from: b */
    private boolean f19109b;

    /* renamed from: c */
    private boolean f19110c;

    /* renamed from: d */
    public byte[] f19111d;

    /* renamed from: e */
    public int f19112e;

    public C4416d6(int i11, int i12) {
        this.f19108a = i11;
        byte[] bArr = new byte[131];
        this.f19111d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void m21266a(byte[] bArr, int i11, int i12) {
        if (!this.f19109b) {
            return;
        }
        int i13 = i12 - i11;
        byte[] bArr2 = this.f19111d;
        int length = bArr2.length;
        int i14 = this.f19112e + i13;
        if (length < i14) {
            this.f19111d = Arrays.copyOf(bArr2, i14 + i14);
        }
        System.arraycopy(bArr, i11, this.f19111d, this.f19112e, i13);
        this.f19112e += i13;
    }

    /* renamed from: b */
    public final void m21267b() {
        this.f19109b = false;
        this.f19110c = false;
    }

    /* renamed from: c */
    public final void m21268c(int i11) {
        boolean z11 = true;
        v71.m27175f(!this.f19109b);
        if (i11 != this.f19108a) {
            z11 = false;
        }
        this.f19109b = z11;
        if (z11) {
            this.f19112e = 3;
            this.f19110c = false;
        }
    }

    /* renamed from: d */
    public final boolean m21269d(int i11) {
        if (!this.f19109b) {
            return false;
        }
        this.f19112e -= i11;
        this.f19109b = false;
        this.f19110c = true;
        return true;
    }

    /* renamed from: e */
    public final boolean m21270e() {
        return this.f19110c;
    }
}
