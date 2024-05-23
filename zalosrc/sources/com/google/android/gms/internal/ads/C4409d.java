package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: com.google.android.gms.internal.ads.d */
/* loaded from: classes2.dex */
public final class C4409d {

    /* renamed from: a */
    public int f19041a;

    /* renamed from: b */
    public String f19042b;

    /* renamed from: c */
    public int f19043c;

    /* renamed from: d */
    public int f19044d;

    /* renamed from: e */
    public int f19045e;

    /* renamed from: f */
    public int f19046f;

    /* renamed from: g */
    public int f19047g;

    /* renamed from: a */
    public final boolean m21245a(int i11) {
        boolean m21596m;
        int i12;
        int i13;
        int i14;
        int i15;
        String[] strArr;
        int[] iArr;
        int m21595l;
        int[] iArr2;
        int[] iArr3;
        int i16;
        int[] iArr4;
        int[] iArr5;
        int i17;
        int[] iArr6;
        m21596m = AbstractC4446e.m21596m(i11);
        if (!m21596m || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return false;
        }
        this.f19041a = i12;
        strArr = AbstractC4446e.f19464a;
        this.f19042b = strArr[3 - i13];
        iArr = AbstractC4446e.f19465b;
        int i18 = iArr[i15];
        this.f19044d = i18;
        int i19 = 2;
        if (i12 == 2) {
            i18 /= 2;
            this.f19044d = i18;
        } else if (i12 == 0) {
            i18 /= 4;
            this.f19044d = i18;
        }
        int i21 = (i11 >>> 9) & 1;
        m21595l = AbstractC4446e.m21595l(i12, i13);
        this.f19047g = m21595l;
        if (i13 == 3) {
            if (i12 == 3) {
                iArr6 = AbstractC4446e.f19466c;
                i17 = iArr6[i14 - 1];
            } else {
                iArr5 = AbstractC4446e.f19467d;
                i17 = iArr5[i14 - 1];
            }
            this.f19046f = i17;
            this.f19043c = (((i17 * 12) / i18) + i21) * 4;
        } else {
            int i22 = ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444;
            if (i12 != 3) {
                iArr2 = AbstractC4446e.f19470g;
                int i23 = iArr2[i14 - 1];
                this.f19046f = i23;
                if (i13 == 1) {
                    i22 = 72;
                }
                this.f19043c = ((i22 * i23) / i18) + i21;
            } else {
                if (i13 == 2) {
                    iArr4 = AbstractC4446e.f19468e;
                    i16 = iArr4[i14 - 1];
                } else {
                    iArr3 = AbstractC4446e.f19469f;
                    i16 = iArr3[i14 - 1];
                }
                this.f19046f = i16;
                this.f19043c = ((i16 * ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444) / i18) + i21;
            }
        }
        if (((i11 >> 6) & 3) == 3) {
            i19 = 1;
        }
        this.f19045e = i19;
        return true;
    }
}
