package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class ve3 implements Comparable {

    /* renamed from: p */
    private final byte[] f29286p;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ve3 ve3Var = (ve3) obj;
        int length = this.f29286p.length;
        int length2 = ve3Var.f29286p.length;
        if (length != length2) {
            return length - length2;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f29286p;
            if (i11 >= bArr.length) {
                return 0;
            }
            byte b11 = bArr[i11];
            byte b12 = ve3Var.f29286p[i11];
            if (b11 != b12) {
                return b11 - b12;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ve3)) {
            return false;
        }
        return Arrays.equals(this.f29286p, ((ve3) obj).f29286p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29286p);
    }

    public final String toString() {
        return fs3.m22159a(this.f29286p);
    }
}
