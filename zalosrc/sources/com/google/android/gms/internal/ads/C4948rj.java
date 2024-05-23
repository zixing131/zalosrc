package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.rj */
/* loaded from: classes2.dex */
public final class C4948rj {

    /* renamed from: a */
    public final int f27243a = 1;

    /* renamed from: b */
    public final byte[] f27244b;

    public C4948rj(int i11, byte[] bArr) {
        this.f27244b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4948rj.class == obj.getClass() && Arrays.equals(this.f27244b, ((C4948rj) obj).f27244b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27244b) + 31;
    }
}
