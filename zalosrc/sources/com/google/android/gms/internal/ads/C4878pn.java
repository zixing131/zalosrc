package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.pn */
/* loaded from: classes2.dex */
public final class C4878pn {

    /* renamed from: a */
    public final Uri f26256a;

    /* renamed from: b */
    public final long f26257b;

    /* renamed from: c */
    public final long f26258c;

    /* renamed from: d */
    public final long f26259d;

    public C4878pn(Uri uri, byte[] bArr, long j11, long j12, long j13, String str, int i11) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        if (j12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4361bo.m20611c(z12);
        if (j13 <= 0) {
            j13 = j13 == -1 ? -1L : j13;
            AbstractC4361bo.m20611c(z13);
            this.f26256a = uri;
            this.f26257b = j11;
            this.f26258c = j12;
            this.f26259d = j13;
        }
        z13 = true;
        AbstractC4361bo.m20611c(z13);
        this.f26256a = uri;
        this.f26257b = j11;
        this.f26258c = j12;
        this.f26259d = j13;
    }

    public final String toString() {
        return "DataSpec[" + String.valueOf(this.f26256a) + ", " + Arrays.toString((byte[]) null) + ", " + this.f26257b + ", " + this.f26258c + ", " + this.f26259d + ", null, 0]";
    }
}
