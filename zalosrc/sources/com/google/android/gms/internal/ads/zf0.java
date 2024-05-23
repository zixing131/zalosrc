package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC4199m;

/* loaded from: classes2.dex */
public final class zf0 extends bg0 {

    /* renamed from: p */
    private final String f31490p;

    /* renamed from: q */
    private final int f31491q;

    public zf0(String str, int i11) {
        this.f31490p = str;
        this.f31491q = i11;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zf0)) {
            zf0 zf0Var = (zf0) obj;
            if (AbstractC4199m.m19701a(this.f31490p, zf0Var.f31490p) && AbstractC4199m.m19701a(Integer.valueOf(this.f31491q), Integer.valueOf(zf0Var.f31491q))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.cg0
    public final int zzb() {
        return this.f31491q;
    }

    @Override // com.google.android.gms.internal.ads.cg0
    public final String zzc() {
        return this.f31490p;
    }
}
