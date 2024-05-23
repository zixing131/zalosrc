package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.p5 */
/* loaded from: classes2.dex */
final class C4859p5 {

    /* renamed from: e */
    private static final byte[] f26067e = {0, 0, 1};

    /* renamed from: a */
    private boolean f26068a;

    /* renamed from: b */
    public int f26069b;

    /* renamed from: c */
    public int f26070c;

    /* renamed from: d */
    public byte[] f26071d = new byte[128];

    public C4859p5(int i11) {
    }

    /* renamed from: a */
    public final void m25400a(byte[] bArr, int i11, int i12) {
        if (!this.f26068a) {
            return;
        }
        int i13 = i12 - i11;
        byte[] bArr2 = this.f26071d;
        int length = bArr2.length;
        int i14 = this.f26069b + i13;
        if (length < i14) {
            this.f26071d = Arrays.copyOf(bArr2, i14 + i14);
        }
        System.arraycopy(bArr, i11, this.f26071d, this.f26069b, i13);
        this.f26069b += i13;
    }

    /* renamed from: b */
    public final void m25401b() {
        this.f26068a = false;
        this.f26069b = 0;
        this.f26070c = 0;
    }

    /* renamed from: c */
    public final boolean m25402c(int i11, int i12) {
        if (this.f26068a) {
            int i13 = this.f26069b - i12;
            this.f26069b = i13;
            if (this.f26070c == 0 && i11 == 181) {
                this.f26070c = i13;
            } else {
                this.f26068a = false;
                return true;
            }
        } else if (i11 == 179) {
            this.f26068a = true;
        }
        m25400a(f26067e, 0, 3);
        return false;
    }
}
