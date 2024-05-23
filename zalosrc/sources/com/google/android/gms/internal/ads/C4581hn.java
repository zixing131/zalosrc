package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.hn */
/* loaded from: classes2.dex */
public final class C4581hn {

    /* renamed from: a */
    private int f21844a;

    /* renamed from: b */
    private final AbstractC5248zm[] f21845b;

    public C4581hn(AbstractC5248zm[] abstractC5248zmArr, byte... bArr) {
        this.f21845b = abstractC5248zmArr;
    }

    /* renamed from: a */
    public final AbstractC5248zm m22977a(int i11) {
        return this.f21845b[i11];
    }

    /* renamed from: b */
    public final AbstractC5248zm[] m22978b() {
        return (AbstractC5248zm[]) this.f21845b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4581hn.class == obj.getClass()) {
            return Arrays.equals(this.f21845b, ((C4581hn) obj).f21845b);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f21844a;
        if (i11 == 0) {
            int hashCode = Arrays.hashCode(this.f21845b) + 527;
            this.f21844a = hashCode;
            return hashCode;
        }
        return i11;
    }
}
