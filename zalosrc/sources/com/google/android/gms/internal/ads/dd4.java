package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class dd4 {

    /* renamed from: a */
    private int f19182a = 0;

    /* renamed from: b */
    private int f19183b = -1;

    /* renamed from: c */
    private int f19184c = 0;

    /* renamed from: d */
    private int[] f19185d = new int[16];

    /* renamed from: e */
    private int f19186e;

    public dd4() {
        this.f19186e = r0.length - 1;
    }

    /* renamed from: a */
    public final int m21348a() {
        int i11 = this.f19184c;
        if (i11 != 0) {
            int[] iArr = this.f19185d;
            int i12 = this.f19182a;
            int i13 = iArr[i12];
            this.f19182a = (i12 + 1) & this.f19186e;
            this.f19184c = i11 - 1;
            return i13;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void m21349b(int i11) {
        int i12 = this.f19184c;
        int[] iArr = this.f19185d;
        int length = iArr.length;
        if (i12 == length) {
            int i13 = length + length;
            if (i13 >= 0) {
                int[] iArr2 = new int[i13];
                int i14 = this.f19182a;
                int i15 = length - i14;
                System.arraycopy(iArr, i14, iArr2, 0, i15);
                System.arraycopy(this.f19185d, 0, iArr2, i15, i14);
                this.f19182a = 0;
                this.f19183b = this.f19184c - 1;
                this.f19185d = iArr2;
                this.f19186e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i16 = (this.f19183b + 1) & this.f19186e;
        this.f19183b = i16;
        iArr[i16] = i11;
        this.f19184c++;
    }

    /* renamed from: c */
    public final void m21350c() {
        this.f19182a = 0;
        this.f19183b = -1;
        this.f19184c = 0;
    }

    /* renamed from: d */
    public final boolean m21351d() {
        return this.f19184c == 0;
    }
}
