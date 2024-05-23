package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wi4 {

    /* renamed from: a */
    private final String[] f29937a;

    /* renamed from: b */
    private final int[] f29938b;

    /* renamed from: c */
    private final dh4[] f29939c;

    /* renamed from: d */
    private final int[] f29940d;

    /* renamed from: e */
    private final int[][][] f29941e;

    /* renamed from: f */
    private final dh4 f29942f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wi4(String[] strArr, int[] iArr, dh4[] dh4VarArr, int[] iArr2, int[][][] iArr3, dh4 dh4Var) {
        this.f29937a = strArr;
        this.f29938b = iArr;
        this.f29939c = dh4VarArr;
        this.f29941e = iArr3;
        this.f29940d = iArr2;
        this.f29942f = dh4Var;
    }

    /* renamed from: a */
    public final int m27622a(int i11, int i12, boolean z11) {
        int i13 = this.f29939c[i11].m21393b(i12).f22986a;
        int[] iArr = new int[1];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 <= 0; i16++) {
            if ((this.f29941e[i11][i12][i16] & 7) == 4) {
                iArr[i15] = i16;
                i15++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i15);
        String str = null;
        boolean z12 = false;
        int i17 = 0;
        int i18 = 16;
        while (i14 < copyOf.length) {
            String str2 = this.f29939c[i11].m21393b(i12).m23747b(copyOf[i14]).f23099l;
            int i19 = i17 + 1;
            if (i17 != 0) {
                z12 |= !g92.m22362t(str, str2);
            } else {
                str = str2;
            }
            i18 = Math.min(i18, this.f29941e[i11][i12][i14] & 24);
            i14++;
            i17 = i19;
        }
        if (z12) {
            return Math.min(i18, this.f29940d[i11]);
        }
        return i18;
    }

    /* renamed from: b */
    public final int m27623b(int i11, int i12, int i13) {
        return this.f29941e[i11][i12][i13];
    }

    /* renamed from: c */
    public final int m27624c(int i11) {
        return this.f29938b[i11];
    }

    /* renamed from: d */
    public final dh4 m27625d(int i11) {
        return this.f29939c[i11];
    }

    /* renamed from: e */
    public final dh4 m27626e() {
        return this.f29942f;
    }
}
