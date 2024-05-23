package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class q62 {

    /* renamed from: a */
    private final rr2 f26658a;

    /* renamed from: b */
    private final tq1 f26659b;

    /* renamed from: c */
    private final dt1 f26660c;

    /* renamed from: d */
    private final rv2 f26661d;

    public q62(rr2 rr2Var, tq1 tq1Var, dt1 dt1Var, rv2 rv2Var) {
        this.f26658a = rr2Var;
        this.f26659b = tq1Var;
        this.f26660c = dt1Var;
        this.f26661d = rv2Var;
    }

    /* renamed from: a */
    public final void m25667a(lq2 lq2Var, iq2 iq2Var, int i11, zzehg zzehgVar, long j11) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            qv2 m25905b = qv2.m25905b("adapter_status");
            m25905b.m25911g(lq2Var);
            m25905b.m25910f(iq2Var);
            m25905b.m25907a("adapter_l", String.valueOf(j11));
            m25905b.m25907a("sc", Integer.toString(i11));
            if (zzehgVar != null) {
                m25905b.m25907a("arec", Integer.toString(zzehgVar.m28811b().zza));
                String m26156a = this.f26658a.m26156a(zzehgVar.getMessage());
                if (m26156a != null) {
                    m25905b.m25907a("areec", m26156a);
                }
            }
            sq1 m26650b = this.f26659b.m26650b(iq2Var.f22349u);
            if (m26650b != null) {
                m25905b.m25907a("ancn", m26650b.f27818a);
                zzbxq zzbxqVar = m26650b.f27819b;
                if (zzbxqVar != null) {
                    m25905b.m25907a("adapter_v", zzbxqVar.toString());
                }
                zzbxq zzbxqVar2 = m26650b.f27820c;
                if (zzbxqVar2 != null) {
                    m25905b.m25907a("adapter_sv", zzbxqVar2.toString());
                }
            }
            this.f26661d.mo22194a(m25905b);
            return;
        }
        ct1 m21542a = this.f26660c.m21542a();
        m21542a.m21010e(lq2Var);
        m21542a.m21009d(iq2Var);
        m21542a.m21007b("action", "adapter_status");
        m21542a.m21007b("adapter_l", String.valueOf(j11));
        m21542a.m21007b("sc", Integer.toString(i11));
        if (zzehgVar != null) {
            m21542a.m21007b("arec", Integer.toString(zzehgVar.m28811b().zza));
            String m26156a2 = this.f26658a.m26156a(zzehgVar.getMessage());
            if (m26156a2 != null) {
                m21542a.m21007b("areec", m26156a2);
            }
        }
        sq1 m26650b2 = this.f26659b.m26650b(iq2Var.f22349u);
        if (m26650b2 != null) {
            m21542a.m21007b("ancn", m26650b2.f27818a);
            zzbxq zzbxqVar3 = m26650b2.f27819b;
            if (zzbxqVar3 != null) {
                m21542a.m21007b("adapter_v", zzbxqVar3.toString());
            }
            zzbxq zzbxqVar4 = m26650b2.f27820c;
            if (zzbxqVar4 != null) {
                m21542a.m21007b("adapter_sv", zzbxqVar4.toString());
            }
        }
        m21542a.m21012g();
    }
}
