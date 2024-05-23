package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.r5 */
/* loaded from: classes2.dex */
final class C4934r5 {

    /* renamed from: f */
    private static final byte[] f27086f = {0, 0, 1};

    /* renamed from: a */
    private boolean f27087a;

    /* renamed from: b */
    private int f27088b;

    /* renamed from: c */
    public int f27089c;

    /* renamed from: d */
    public int f27090d;

    /* renamed from: e */
    public byte[] f27091e = new byte[128];

    public C4934r5(int i11) {
    }

    /* renamed from: a */
    public final void m25980a(byte[] bArr, int i11, int i12) {
        if (!this.f27087a) {
            return;
        }
        int i13 = i12 - i11;
        byte[] bArr2 = this.f27091e;
        int length = bArr2.length;
        int i14 = this.f27089c + i13;
        if (length < i14) {
            this.f27091e = Arrays.copyOf(bArr2, i14 + i14);
        }
        System.arraycopy(bArr, i11, this.f27091e, this.f27089c, i13);
        this.f27089c += i13;
    }

    /* renamed from: b */
    public final void m25981b() {
        this.f27087a = false;
        this.f27089c = 0;
        this.f27088b = 0;
    }

    /* renamed from: c */
    public final boolean m25982c(int i11, int i12) {
        int i13 = this.f27088b;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i11 == 179 || i11 == 181) {
                            this.f27089c -= i12;
                            this.f27087a = false;
                            return true;
                        }
                    } else if ((i11 & 240) != 32) {
                        lr1.m24356e("H263Reader", "Unexpected start code value");
                        m25981b();
                    } else {
                        this.f27090d = this.f27089c;
                        this.f27088b = 4;
                    }
                } else if (i11 > 31) {
                    lr1.m24356e("H263Reader", "Unexpected start code value");
                    m25981b();
                } else {
                    this.f27088b = 3;
                }
            } else if (i11 != 181) {
                lr1.m24356e("H263Reader", "Unexpected start code value");
                m25981b();
            } else {
                this.f27088b = 2;
            }
        } else if (i11 == 176) {
            this.f27088b = 1;
            this.f27087a = true;
        }
        m25980a(f27086f, 0, 3);
        return false;
    }
}
