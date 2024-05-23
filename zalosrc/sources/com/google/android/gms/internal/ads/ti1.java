package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class ti1 implements c40 {

    /* renamed from: a */
    private final WeakReference f28376a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ti1(ui1 ui1Var, si1 si1Var) {
        this.f28376a = new WeakReference(ui1Var);
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        ui1 ui1Var = (ui1) this.f28376a.get();
        if (ui1Var == null) {
            return;
        }
        ui1.m26978g(ui1Var).zza();
    }
}
