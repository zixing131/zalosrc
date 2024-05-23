package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import p227i3.C20217u;
import p667y2.C30271h;

/* loaded from: classes2.dex */
public final class s01 {

    /* renamed from: a */
    private final rv2 f27430a;

    /* renamed from: b */
    private final dt1 f27431b;

    /* renamed from: c */
    private final tq2 f27432c;

    public s01(dt1 dt1Var, tq2 tq2Var, rv2 rv2Var) {
        this.f27430a = rv2Var;
        this.f27431b = dt1Var;
        this.f27432c = tq2Var;
    }

    /* renamed from: b */
    private static String m26219b(int i11) {
        int i12 = i11 - 1;
        return i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? C20217u.f99970o : "ac" : "cb" : "cc" : "bb" : C30271h.f140642d;
    }

    /* renamed from: a */
    public final void m26220a(long j11, int i11) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            rv2 rv2Var = this.f27430a;
            qv2 m25905b = qv2.m25905b("ad_closed");
            m25905b.m25911g(this.f27432c.f28473b.f27823b);
            m25905b.m25907a("show_time", String.valueOf(j11));
            m25905b.m25907a("ad_format", "app_open_ad");
            m25905b.m25907a("acr", m26219b(i11));
            rv2Var.mo22194a(m25905b);
            return;
        }
        ct1 m21542a = this.f27431b.m21542a();
        m21542a.m21010e(this.f27432c.f28473b.f27823b);
        m21542a.m21007b("action", "ad_closed");
        m21542a.m21007b("show_time", String.valueOf(j11));
        m21542a.m21007b("ad_format", "app_open_ad");
        m21542a.m21007b("acr", m26219b(i11));
        m21542a.m21012g();
    }
}
