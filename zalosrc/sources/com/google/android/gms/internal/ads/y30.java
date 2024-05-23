package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class y30 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zq0Var.zzbn();
        } else if ("resume".equals(str)) {
            zq0Var.zzbo();
        }
    }
}
