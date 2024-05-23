package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class xc2 implements rh2 {

    /* renamed from: a */
    private final com.google.android.gms.ads.internal.client.zzw f30421a;

    /* renamed from: b */
    private final zzcgv f30422b;

    /* renamed from: c */
    private final boolean f30423c;

    public xc2(com.google.android.gms.ads.internal.client.zzw zzwVar, zzcgv zzcgvVar, boolean z11) {
        this.f30421a = zzwVar;
        this.f30422b = zzcgvVar;
        this.f30423c = z11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f30422b.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21351q4)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21361r4)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f30423c);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.f30421a;
        if (zzwVar != null) {
            int i11 = zzwVar.zza;
            if (i11 == 1) {
                bundle.putString("avo", "p");
            } else if (i11 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
