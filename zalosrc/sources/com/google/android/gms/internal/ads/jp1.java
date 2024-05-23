package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class jp1 implements s40 {

    /* renamed from: p */
    private final e91 f22919p;

    /* renamed from: q */
    private final zzcce f22920q;

    /* renamed from: r */
    private final String f22921r;

    /* renamed from: s */
    private final String f22922s;

    public jp1(e91 e91Var, iq2 iq2Var) {
        this.f22919p = e91Var;
        this.f22920q = iq2Var.f22337m;
        this.f22921r = iq2Var.f22333k;
        this.f22922s = iq2Var.f22335l;
    }

    @Override // com.google.android.gms.internal.ads.s40
    /* renamed from: n */
    public final void mo23710n(zzcce zzcceVar) {
        String str;
        int i11;
        zzcce zzcceVar2 = this.f22920q;
        if (zzcceVar2 != null) {
            zzcceVar = zzcceVar2;
        }
        if (zzcceVar != null) {
            str = zzcceVar.f32014p;
            i11 = zzcceVar.f32015q;
        } else {
            str = "";
            i11 = 1;
        }
        this.f22919p.m21647B0(new zf0(str, i11), this.f22921r, this.f22922s);
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final void zzb() {
        this.f22919p.zze();
    }

    @Override // com.google.android.gms.internal.ads.s40
    public final void zzc() {
        this.f22919p.zzf();
    }
}
