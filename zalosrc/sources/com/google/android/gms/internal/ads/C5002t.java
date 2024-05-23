package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t */
/* loaded from: classes2.dex */
public final class C5002t {

    /* renamed from: a */
    private final byte[] f28069a;

    /* renamed from: b */
    private final int f28070b;

    /* renamed from: c */
    private int f28071c;

    /* renamed from: d */
    private int f28072d;

    public C5002t(byte[] bArr) {
        this.f28069a = bArr;
        this.f28070b = bArr.length;
    }

    /* renamed from: a */
    public final int m26459a() {
        return (this.f28071c * 8) + this.f28072d;
    }

    /* renamed from: b */
    public final int m26460b(int i11) {
        int i12 = this.f28071c;
        int min = Math.min(i11, 8 - this.f28072d);
        int i13 = i12 + 1;
        int i14 = ((this.f28069a[i12] & 255) >> this.f28072d) & (255 >> (8 - min));
        while (min < i11) {
            i14 |= (this.f28069a[i13] & 255) << min;
            min += 8;
            i13++;
        }
        m26461c(i11);
        return ((-1) >>> (32 - i11)) & i14;
    }

    /* renamed from: c */
    public final void m26461c(int i11) {
        int i12;
        int i13 = i11 / 8;
        int i14 = this.f28071c + i13;
        this.f28071c = i14;
        int i15 = this.f28072d + (i11 - (i13 * 8));
        this.f28072d = i15;
        if (i15 > 7) {
            i14++;
            this.f28071c = i14;
            i15 -= 8;
            this.f28072d = i15;
        }
        boolean z11 = false;
        if (i14 >= 0 && (i14 < (i12 = this.f28070b) || (i14 == i12 && i15 == 0))) {
            z11 = true;
        }
        v71.m27175f(z11);
    }

    /* renamed from: d */
    public final boolean m26462d() {
        byte b11 = this.f28069a[this.f28071c];
        int i11 = this.f28072d;
        m26461c(1);
        if (1 == (((b11 & 255) >> i11) & 1)) {
            return true;
        }
        return false;
    }
}
