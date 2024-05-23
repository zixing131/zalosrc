package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

/* loaded from: classes2.dex */
final class t30 implements c40 {
    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        if (zq0Var.mo26707u() != null) {
            zq0Var.mo26707u().zza();
        }
        zzl zzN = zq0Var.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        zzl zzO = zq0Var.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            yk0.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
