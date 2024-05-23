package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class ci0 {

    /* renamed from: a */
    private final InterfaceC20285f f18433a;

    /* renamed from: b */
    private final zzg f18434b;

    /* renamed from: c */
    private final dj0 f18435c;

    public ci0(InterfaceC20285f interfaceC20285f, zzg zzgVar, dj0 dj0Var) {
        this.f18433a = interfaceC20285f;
        this.f18434b = zzgVar;
        this.f18435c = dj0Var;
    }

    /* renamed from: a */
    public final void m20900a() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21327o0)).booleanValue()) {
            return;
        }
        this.f18435c.m21424y();
    }

    /* renamed from: b */
    public final void m20901b(int i11, long j11) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21317n0)).booleanValue()) {
            return;
        }
        if (j11 - this.f18434b.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21327o0)).booleanValue()) {
            this.f18434b.zzK(-1);
            this.f18434b.zzL(j11);
        } else {
            this.f18434b.zzK(i11);
            this.f18434b.zzL(j11);
        }
        m20900a();
    }
}
