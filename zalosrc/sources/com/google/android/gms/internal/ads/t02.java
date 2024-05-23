package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class t02 implements ve1 {

    /* renamed from: r */
    private final String f28076r;

    /* renamed from: s */
    private final rv2 f28077s;

    /* renamed from: p */
    private boolean f28074p = false;

    /* renamed from: q */
    private boolean f28075q = false;

    /* renamed from: t */
    private final zzg f28078t = zzt.zzo().m22936h();

    public t02(String str, rv2 rv2Var) {
        this.f28076r = str;
        this.f28077s = rv2Var;
    }

    /* renamed from: a */
    private final qv2 m26463a(String str) {
        String str2;
        if (this.f28078t.zzP()) {
            str2 = "";
        } else {
            str2 = this.f28076r;
        }
        qv2 m25905b = qv2.m25905b(str);
        m25905b.m25907a("tms", Long.toString(zzt.zzB().mo105914b(), 10));
        m25905b.m25907a("tid", str2);
        return m25905b;
    }

    @Override // com.google.android.gms.internal.ads.ve1
    /* renamed from: c */
    public final void mo26464c(String str, String str2) {
        rv2 rv2Var = this.f28077s;
        qv2 m26463a = m26463a("adapter_init_finished");
        m26463a.m25907a("ancn", str);
        m26463a.m25907a("rqe", str2);
        rv2Var.mo22194a(m26463a);
    }

    @Override // com.google.android.gms.internal.ads.ve1
    /* renamed from: o */
    public final void mo26465o(String str) {
        rv2 rv2Var = this.f28077s;
        qv2 m26463a = m26463a("adapter_init_finished");
        m26463a.m25907a("ancn", str);
        rv2Var.mo22194a(m26463a);
    }

    @Override // com.google.android.gms.internal.ads.ve1
    /* renamed from: t */
    public final void mo26466t(String str) {
        rv2 rv2Var = this.f28077s;
        qv2 m26463a = m26463a("adapter_init_started");
        m26463a.m25907a("ancn", str);
        rv2Var.mo22194a(m26463a);
    }

    @Override // com.google.android.gms.internal.ads.ve1
    public final void zza(String str) {
        rv2 rv2Var = this.f28077s;
        qv2 m26463a = m26463a("aaia");
        m26463a.m25907a("aair", "MalformedJson");
        rv2Var.mo22194a(m26463a);
    }

    @Override // com.google.android.gms.internal.ads.ve1
    public final synchronized void zze() {
        if (!this.f28075q) {
            this.f28077s.mo22194a(m26463a("init_finished"));
            this.f28075q = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ve1
    public final synchronized void zzf() {
        if (!this.f28074p) {
            this.f28077s.mo22194a(m26463a("init_started"));
            this.f28074p = true;
        }
    }
}
