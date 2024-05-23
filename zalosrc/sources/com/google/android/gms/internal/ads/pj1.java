package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class pj1 implements InterfaceC4880pp {

    /* renamed from: p */
    final /* synthetic */ String f26232p;

    /* renamed from: q */
    final /* synthetic */ qj1 f26233q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pj1(qj1 qj1Var, String str) {
        this.f26233q = qj1Var;
        this.f26232p = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        Map map;
        sl1 sl1Var;
        sl1 sl1Var2;
        sl1 sl1Var3;
        sl1 sl1Var4;
        Map map2;
        sl1 sl1Var5;
        sl1 sl1Var6;
        sl1 sl1Var7;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21418x1)).booleanValue()) {
            synchronized (this) {
                try {
                    if (c4842op.f25735j) {
                        qj1 qj1Var = this.f26233q;
                        sl1Var4 = qj1Var.f26816t;
                        if (sl1Var4 != null) {
                            map2 = qj1Var.f26802D;
                            map2.put(this.f26232p, Boolean.TRUE);
                            qj1 qj1Var2 = this.f26233q;
                            sl1Var5 = qj1Var2.f26816t;
                            View zzf = sl1Var5.zzf();
                            sl1Var6 = this.f26233q.f26816t;
                            Map zzl = sl1Var6.zzl();
                            sl1Var7 = this.f26233q.f26816t;
                            qj1Var2.m25737Q(zzf, zzl, sl1Var7.zzm(), true);
                        } else {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (c4842op.f25735j) {
            map = this.f26233q.f26802D;
            map.put(this.f26232p, Boolean.TRUE);
            qj1 qj1Var3 = this.f26233q;
            sl1Var = qj1Var3.f26816t;
            View zzf2 = sl1Var.zzf();
            sl1Var2 = this.f26233q.f26816t;
            Map zzl2 = sl1Var2.zzl();
            sl1Var3 = this.f26233q.f26816t;
            qj1Var3.m25737Q(zzf2, zzl2, sl1Var3.zzm(), true);
        }
    }
}
