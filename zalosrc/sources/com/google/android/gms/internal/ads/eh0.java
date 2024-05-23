package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes2.dex */
public final class eh0 implements RewardItem {

    /* renamed from: a */
    private final rg0 f19629a;

    public eh0(rg0 rg0Var) {
        this.f19629a = rg0Var;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        rg0 rg0Var = this.f19629a;
        if (rg0Var != null) {
            try {
                return rg0Var.zze();
            } catch (RemoteException e11) {
                yk0.zzk("Could not forward getAmount to RewardItem", e11);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        rg0 rg0Var = this.f19629a;
        if (rg0Var != null) {
            try {
                return rg0Var.zzf();
            } catch (RemoteException e11) {
                yk0.zzk("Could not forward getType to RewardItem", e11);
            }
        }
        return null;
    }
}
