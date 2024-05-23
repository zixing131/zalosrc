package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.List;

/* loaded from: classes2.dex */
public final class ao1 extends a10 {

    /* renamed from: p */
    private final String f17203p;

    /* renamed from: q */
    private final qj1 f17204q;

    /* renamed from: r */
    private final vj1 f17205r;

    public ao1(String str, qj1 qj1Var, vj1 vj1Var) {
        this.f17203p = str;
        this.f17204q = qj1Var;
        this.f17205r = vj1Var;
    }

    @Override // com.google.android.gms.internal.ads.b10
    /* renamed from: A0 */
    public final void mo20197A0(Bundle bundle) {
        this.f17204q.m25741U(bundle);
    }

    @Override // com.google.android.gms.internal.ads.b10
    /* renamed from: p */
    public final void mo20198p(Bundle bundle) {
        this.f17204q.m25746l(bundle);
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final Bundle zzb() {
        return this.f17205r.m27243L();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final com.google.android.gms.ads.internal.client.zzdk zzc() {
        return this.f17205r.m27249R();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final b00 zzd() {
        return this.f17205r.m27251T();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final k00 zze() {
        return this.f17205r.m27254W();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final InterfaceC4271b zzf() {
        return this.f17205r.m27260b0();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final InterfaceC4271b zzg() {
        return BinderC4273d.m19913I3(this.f17204q);
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final String zzh() {
        return this.f17205r.m27264d0();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final String zzi() {
        return this.f17205r.m27266e0();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final String zzj() {
        return this.f17205r.m27268f0();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final String zzk() {
        return this.f17205r.m27272h0();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final String zzl() {
        return this.f17203p;
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final List zzm() {
        return this.f17205r.m27265e();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final void zzn() {
        this.f17204q.mo23795a();
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final boolean zzq(Bundle bundle) {
        return this.f17204q.m25757x(bundle);
    }
}
