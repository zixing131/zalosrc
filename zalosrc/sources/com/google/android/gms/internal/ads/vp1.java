package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vp1 implements j04 {

    /* renamed from: a */
    private final w04 f29443a;

    public vp1(w04 w04Var) {
        this.f29443a = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC5180xs enumC5180xs;
        if (((m71) this.f29443a).m24483a().f19409o.f26311a == 3) {
            enumC5180xs = EnumC5180xs.REWARDED_INTERSTITIAL;
        } else {
            enumC5180xs = EnumC5180xs.REWARD_BASED_VIDEO_AD;
        }
        r04.m25935b(enumC5180xs);
        return enumC5180xs;
    }
}
