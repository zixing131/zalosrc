package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q */
/* loaded from: classes2.dex */
public final class C4891q {

    /* renamed from: a */
    public final int f26588a;

    /* renamed from: b */
    public final byte[] f26589b;

    /* renamed from: c */
    public final int f26590c;

    /* renamed from: d */
    public final int f26591d;

    public C4891q(int i11, byte[] bArr, int i12, int i13) {
        this.f26588a = i11;
        this.f26589b = bArr;
        this.f26590c = i12;
        this.f26591d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4891q.class == obj.getClass()) {
            C4891q c4891q = (C4891q) obj;
            if (this.f26588a == c4891q.f26588a && this.f26590c == c4891q.f26590c && this.f26591d == c4891q.f26591d && Arrays.equals(this.f26589b, c4891q.f26589b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f26588a * 31) + Arrays.hashCode(this.f26589b)) * 31) + this.f26590c) * 31) + this.f26591d;
    }
}
