package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class qu0 implements t01 {

    /* renamed from: a */
    private final gu0 f26962a;

    /* renamed from: b */
    private bo2 f26963b;

    /* renamed from: c */
    private bn2 f26964c;

    /* renamed from: d */
    private nd1 f26965d;

    /* renamed from: e */
    private h71 f26966e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ qu0(gu0 gu0Var, pu0 pu0Var) {
        this.f26962a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.t01
    /* renamed from: a */
    public final /* synthetic */ t01 mo25885a(h71 h71Var) {
        this.f26966e = h71Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.t01
    /* renamed from: b */
    public final /* synthetic */ t01 mo25886b(nd1 nd1Var) {
        this.f26965d = nd1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d71
    /* renamed from: l */
    public final /* synthetic */ d71 mo20242l(bn2 bn2Var) {
        this.f26964c = bn2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d71
    /* renamed from: m */
    public final /* synthetic */ d71 mo20243m(bo2 bo2Var) {
        this.f26963b = bo2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d71
    public final /* bridge */ /* synthetic */ Object zzh() {
        r04.m25936c(this.f26965d, nd1.class);
        r04.m25936c(this.f26966e, h71.class);
        return new su0(this.f26962a, new c51(), new gs2(), new o61(), new rt1(), this.f26965d, this.f26966e, null, this.f26963b, this.f26964c, null);
    }
}
