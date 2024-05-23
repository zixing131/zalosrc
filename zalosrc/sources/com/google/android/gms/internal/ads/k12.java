package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* loaded from: classes2.dex */
public final class k12 implements l91, z71 {

    /* renamed from: r */
    private static final Object f23064r = new Object();

    /* renamed from: s */
    private static int f23065s;

    /* renamed from: p */
    private final zzg f23066p;

    /* renamed from: q */
    private final u12 f23067q;

    public k12(u12 u12Var, zzg zzgVar) {
        this.f23067q = u12Var;
        this.f23066p = zzgVar;
    }

    /* renamed from: b */
    private final void m23800b(boolean z11) {
        int i11;
        int intValue;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue() && !this.f23066p.zzP()) {
            Object obj = f23064r;
            synchronized (obj) {
                i11 = f23065s;
                intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21322n5)).intValue();
            }
            if (i11 >= intValue) {
                return;
            }
            this.f23067q.m26820e(z11);
            synchronized (obj) {
                f23065s++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        m23800b(false);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        m23800b(true);
    }
}
