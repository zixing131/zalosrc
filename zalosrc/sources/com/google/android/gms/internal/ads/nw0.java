package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class nw0 implements rp1 {

    /* renamed from: a */
    private final gu0 f25359a;

    /* renamed from: b */
    private bo2 f25360b;

    /* renamed from: c */
    private bn2 f25361c;

    /* renamed from: d */
    private nd1 f25362d;

    /* renamed from: e */
    private h71 f25363e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ nw0(gu0 gu0Var, mw0 mw0Var) {
        this.f25359a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.rp1
    /* renamed from: a */
    public final /* synthetic */ rp1 mo25027a(h71 h71Var) {
        this.f25363e = h71Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.rp1
    /* renamed from: b */
    public final /* synthetic */ rp1 mo25028b(nd1 nd1Var) {
        this.f25362d = nd1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d71
    /* renamed from: l */
    public final /* synthetic */ d71 mo20242l(bn2 bn2Var) {
        this.f25361c = bn2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d71
    /* renamed from: m */
    public final /* synthetic */ d71 mo20243m(bo2 bo2Var) {
        this.f25360b = bo2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d71
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final sp1 zzh() {
        r04.m25936c(this.f25362d, nd1.class);
        r04.m25936c(this.f25363e, h71.class);
        return new pw0(this.f25359a, new c51(), new gs2(), new o61(), new rt1(), this.f25362d, this.f25363e, null, this.f25360b, this.f25361c, null);
    }
}
