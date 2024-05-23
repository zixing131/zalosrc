package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class cb3 implements qj2 {

    /* renamed from: a */
    private final qj2 f18172a;

    /* renamed from: b */
    private long f18173b;

    /* renamed from: c */
    private Uri f18174c;

    /* renamed from: d */
    private Map f18175d;

    public cb3(qj2 qj2Var) {
        qj2Var.getClass();
        this.f18172a = qj2Var;
        this.f18174c = Uri.EMPTY;
        this.f18175d = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        int mo19942a = this.f18172a.mo19942a(bArr, i11, i12);
        if (mo19942a != -1) {
            this.f18173b += mo19942a;
        }
        return mo19942a;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        this.f18174c = wo2Var.f30043a;
        this.f18175d = Collections.emptyMap();
        long mo19943d = this.f18172a.mo19943d(wo2Var);
        Uri zzc = zzc();
        zzc.getClass();
        this.f18174c = zzc;
        this.f18175d = zze();
        return mo19943d;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: g */
    public final void mo20854g(dc3 dc3Var) {
        dc3Var.getClass();
        this.f18172a.mo20854g(dc3Var);
    }

    /* renamed from: k */
    public final long m20855k() {
        return this.f18173b;
    }

    /* renamed from: l */
    public final Uri m20856l() {
        return this.f18174c;
    }

    /* renamed from: m */
    public final Map m20857m() {
        return this.f18175d;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f18172a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f18172a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.qj2, com.google.android.gms.internal.ads.n63
    public final Map zze() {
        return this.f18172a.zze();
    }
}
