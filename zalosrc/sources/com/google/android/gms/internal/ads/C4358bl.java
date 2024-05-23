package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bl */
/* loaded from: classes2.dex */
final class C4358bl {

    /* renamed from: a */
    public final int f17851a;

    /* renamed from: b */
    public final long[] f17852b;

    /* renamed from: c */
    public final int[] f17853c;

    /* renamed from: d */
    public final int f17854d;

    /* renamed from: e */
    public final long[] f17855e;

    /* renamed from: f */
    public final int[] f17856f;

    public C4358bl(long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2) {
        boolean z11;
        boolean z12;
        int length = jArr2.length;
        if (iArr.length == length) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        int length2 = jArr.length;
        if (length2 == length) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4361bo.m20611c(z12);
        AbstractC4361bo.m20611c(iArr2.length == length);
        this.f17852b = jArr;
        this.f17853c = iArr;
        this.f17854d = i11;
        this.f17855e = jArr2;
        this.f17856f = iArr2;
        this.f17851a = length2;
    }

    /* renamed from: a */
    public final int m20566a(long j11) {
        for (int m25827c = AbstractC4916qo.m25827c(this.f17855e, j11, true, false); m25827c >= 0; m25827c--) {
            if ((this.f17856f[m25827c] & 1) != 0) {
                return m25827c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int m20567b(long j11) {
        for (int m25826b = AbstractC4916qo.m25826b(this.f17855e, j11, true, false); m25826b < this.f17855e.length; m25826b++) {
            if ((this.f17856f[m25826b] & 1) != 0) {
                return m25826b;
            }
        }
        return -1;
    }
}
