package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mn */
/* loaded from: classes2.dex */
public final class C4766mn implements InterfaceC4840on {

    /* renamed from: a */
    private final byte[] f24669a;

    /* renamed from: b */
    private Uri f24670b;

    /* renamed from: c */
    private int f24671c;

    /* renamed from: d */
    private int f24672d;

    public C4766mn(byte[] bArr) {
        boolean z11;
        bArr.getClass();
        if (bArr.length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        this.f24669a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: a */
    public final int mo20617a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f24672d;
        if (i13 == 0) {
            return -1;
        }
        int min = Math.min(i12, i13);
        System.arraycopy(this.f24669a, this.f24671c, bArr, i11, min);
        this.f24671c += min;
        this.f24672d -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: b */
    public final long mo20618b(C4878pn c4878pn) {
        this.f24670b = c4878pn.f26256a;
        long j11 = c4878pn.f26258c;
        int i11 = (int) j11;
        this.f24671c = i11;
        long j12 = c4878pn.f26259d;
        long j13 = -1;
        if (j12 == -1) {
            j12 = this.f24669a.length - j11;
        } else {
            j13 = j12;
        }
        int i12 = (int) j12;
        this.f24672d = i12;
        if (i12 > 0 && i11 + i12 <= this.f24669a.length) {
            return i12;
        }
        throw new IOException("Unsatisfiable range: [" + i11 + ", " + j13 + "], length: " + this.f24669a.length);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final Uri zzc() {
        return this.f24670b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final void zzd() {
        this.f24670b = null;
    }
}
