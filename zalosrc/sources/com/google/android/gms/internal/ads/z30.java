package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class z30 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        if (map.keySet().contains("start")) {
            zq0Var.zzP().zzk();
        } else if (map.keySet().contains("stop")) {
            zq0Var.zzP().zzl();
        } else if (map.keySet().contains("cancel")) {
            zq0Var.zzP().zzj();
        }
    }
}
