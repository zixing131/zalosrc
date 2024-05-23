package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
final class po0 implements InterfaceC4840on {

    /* renamed from: a */
    private final InterfaceC4840on f26265a;

    /* renamed from: b */
    private final long f26266b;

    /* renamed from: c */
    private final InterfaceC4840on f26267c;

    /* renamed from: d */
    private long f26268d;

    /* renamed from: e */
    private Uri f26269e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public po0(InterfaceC4840on interfaceC4840on, int i11, InterfaceC4840on interfaceC4840on2) {
        this.f26265a = interfaceC4840on;
        this.f26266b = i11;
        this.f26267c = interfaceC4840on2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: a */
    public final int mo20617a(byte[] bArr, int i11, int i12) {
        int i13;
        long j11 = this.f26268d;
        long j12 = this.f26266b;
        if (j11 < j12) {
            int mo20617a = this.f26265a.mo20617a(bArr, i11, (int) Math.min(i12, j12 - j11));
            long j13 = this.f26268d + mo20617a;
            this.f26268d = j13;
            i13 = mo20617a;
            j11 = j13;
        } else {
            i13 = 0;
        }
        if (j11 >= this.f26266b) {
            int mo20617a2 = this.f26267c.mo20617a(bArr, i11 + i13, i12 - i13);
            this.f26268d += mo20617a2;
            return i13 + mo20617a2;
        }
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    /* renamed from: b */
    public final long mo20618b(C4878pn c4878pn) {
        long j11;
        C4878pn c4878pn2;
        long j12;
        long j13;
        this.f26269e = c4878pn.f26256a;
        long j14 = c4878pn.f26258c;
        long j15 = this.f26266b;
        C4878pn c4878pn3 = null;
        if (j14 >= j15) {
            c4878pn2 = null;
        } else {
            long j16 = c4878pn.f26259d;
            if (j16 != -1) {
                j11 = Math.min(j16, j15 - j14);
            } else {
                j11 = j15 - j14;
            }
            c4878pn2 = new C4878pn(c4878pn.f26256a, null, j14, j14, j11, null, 0);
        }
        long j17 = c4878pn.f26259d;
        if (j17 == -1 || c4878pn.f26258c + j17 > this.f26266b) {
            long max = Math.max(this.f26266b, c4878pn.f26258c);
            long j18 = c4878pn.f26259d;
            if (j18 != -1) {
                j12 = Math.min(j18, (c4878pn.f26258c + j18) - this.f26266b);
            } else {
                j12 = -1;
            }
            c4878pn3 = new C4878pn(c4878pn.f26256a, null, max, max, j12, null, 0);
        }
        long j19 = 0;
        if (c4878pn2 != null) {
            j13 = this.f26265a.mo20618b(c4878pn2);
        } else {
            j13 = 0;
        }
        if (c4878pn3 != null) {
            j19 = this.f26267c.mo20618b(c4878pn3);
        }
        this.f26268d = c4878pn.f26258c;
        if (j19 == -1) {
            return -1L;
        }
        return j13 + j19;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final Uri zzc() {
        return this.f26269e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4840on
    public final void zzd() {
        this.f26265a.zzd();
        this.f26267c.zzd();
    }
}
