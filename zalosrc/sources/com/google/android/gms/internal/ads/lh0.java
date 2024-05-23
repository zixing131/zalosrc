package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
public final class lh0 extends qg0 {

    /* renamed from: p */
    private final String f23918p;

    /* renamed from: q */
    private final int f23919q;

    public lh0(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int zze() {
        return this.f23919q;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final String zzf() {
        return this.f23918p;
    }

    public lh0(String str, int i11) {
        this.f23918p = str;
        this.f23919q = i11;
    }
}
