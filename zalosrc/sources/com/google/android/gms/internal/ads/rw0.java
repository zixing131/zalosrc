package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

/* loaded from: classes2.dex */
final class rw0 implements zzg {

    /* renamed from: a */
    private final gu0 f27391a;

    /* renamed from: b */
    private h71 f27392b;

    /* renamed from: c */
    private zzae f27393c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rw0(gu0 gu0Var, qw0 qw0Var) {
        this.f27391a = gu0Var;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zza(h71 h71Var) {
        this.f27392b = h71Var;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zzb(zzae zzaeVar) {
        this.f27393c = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzh zzc() {
        r04.m25936c(this.f27392b, h71.class);
        r04.m25936c(this.f27393c, zzae.class);
        return new tw0(this.f27391a, this.f27393c, new c51(), new rt1(), this.f27392b, null, null, null);
    }
}
