package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class dz0 implements r81 {

    /* renamed from: p */
    private final yr2 f19451p;

    public dz0(yr2 yr2Var) {
        this.f19451p = yr2Var;
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: r */
    public final void mo20722r(Context context) {
        try {
            this.f19451p.m28325v();
        } catch (zzfek e11) {
            yk0.zzk("Cannot invoke onPause for the mediation adapter.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: t */
    public final void mo20723t(Context context) {
        try {
            this.f19451p.m28313j();
        } catch (zzfek e11) {
            yk0.zzk("Cannot invoke onDestroy for the mediation adapter.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: z */
    public final void mo20724z(Context context) {
        try {
            this.f19451p.m28326w();
            if (context != null) {
                this.f19451p.m28324u(context);
            }
        } catch (zzfek e11) {
            yk0.zzk("Cannot invoke onResume for the mediation adapter.", e11);
        }
    }
}
