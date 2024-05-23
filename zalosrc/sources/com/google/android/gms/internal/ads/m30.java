package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class m30 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        JSONObject zzb;
        zq0 zq0Var = (zq0) obj;
        InterfaceC5187xz zzM = zq0Var.zzM();
        if (zzM != null && (zzb = zzM.zzb()) != null) {
            zq0Var.mo23555n("nativeClickMetaReady", zzb);
        } else {
            zq0Var.mo23555n("nativeClickMetaReady", new JSONObject());
        }
    }
}
