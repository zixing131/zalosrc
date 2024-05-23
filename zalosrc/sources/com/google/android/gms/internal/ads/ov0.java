package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ov0 implements eu1 {

    /* renamed from: a */
    private final gu0 f25959a;

    /* renamed from: b */
    private final uv0 f25960b;

    /* renamed from: c */
    private Long f25961c;

    /* renamed from: d */
    private String f25962d;

    public /* synthetic */ ov0(gu0 gu0Var, uv0 uv0Var, nv0 nv0Var) {
        this.f25959a = gu0Var;
        this.f25960b = uv0Var;
    }

    @Override // com.google.android.gms.internal.ads.eu1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ eu1 mo21811a(long j11) {
        this.f25961c = Long.valueOf(j11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.eu1
    public final /* synthetic */ eu1 zza(String str) {
        str.getClass();
        this.f25962d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.eu1
    public final fu1 zzc() {
        r04.m25936c(this.f25961c, Long.class);
        r04.m25936c(this.f25962d, String.class);
        return new qv0(this.f25959a, this.f25960b, this.f25961c, this.f25962d, null);
    }
}
