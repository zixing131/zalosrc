package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class pi1 implements c40 {

    /* renamed from: a */
    private final WeakReference f26227a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ pi1(ui1 ui1Var, oi1 oi1Var) {
        this.f26227a = new WeakReference(ui1Var);
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        t71 t71Var;
        nf1 nf1Var;
        ui1 ui1Var = (ui1) this.f26227a.get();
        if (ui1Var != null && "_ac".equals((String) map.get("eventName"))) {
            t71Var = ui1Var.f28929h;
            t71Var.onAdClicked();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21415w8)).booleanValue()) {
                nf1Var = ui1Var.f28930i;
                nf1Var.zzq();
            }
        }
    }
}
