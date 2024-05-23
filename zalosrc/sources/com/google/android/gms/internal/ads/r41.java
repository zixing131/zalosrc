package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r41 {

    /* renamed from: d */
    public static final r41 f27076d = new r41(null, new me0[0], 0, -9223372036854775807L, 0);

    /* renamed from: e */
    private static final me0 f27077e = new me0(0).m24553b(0);

    /* renamed from: f */
    public static final g94 f27078f = C4299a.f16855a;

    /* renamed from: c */
    private final me0[] f27081c;

    /* renamed from: b */
    public final long f27080b = 0;

    /* renamed from: a */
    public final int f27079a = 0;

    private r41(Object obj, me0[] me0VarArr, long j11, long j12, int i11) {
        this.f27081c = me0VarArr;
    }

    /* renamed from: a */
    public final me0 m25957a(int i11) {
        if (i11 < 0) {
            return f27077e;
        }
        return this.f27081c[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r41.class == obj.getClass()) {
            r41 r41Var = (r41) obj;
            if (g92.m22362t(null, null) && Arrays.equals(this.f27081c, r41Var.f27081c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f27081c);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
