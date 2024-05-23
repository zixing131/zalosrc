package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.C4155e;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5296b;
import com.google.android.gms.internal.measurement.C5332d1;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p229i5.AbstractC20300u;
import p230i6.AbstractBinderC20313e;
import p230i6.AbstractC20325q;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* loaded from: classes.dex */
public final class BinderC6040k5 extends AbstractBinderC20313e {

    /* renamed from: p */
    private final C6055l9 f34135p;

    /* renamed from: q */
    private Boolean f34136q;

    /* renamed from: r */
    private String f34137r;

    public BinderC6040k5(C6055l9 c6055l9, String str) {
        AbstractC4205o.m19722k(c6055l9);
        this.f34135p = c6055l9;
        this.f34137r = null;
    }

    /* renamed from: N */
    private final void m31019N(zzaw zzawVar, zzq zzqVar) {
        this.f34135p.m31080d();
        this.f34135p.m31088i(zzawVar, zzqVar);
    }

    /* renamed from: Z4 */
    private final void m31020Z4(zzq zzqVar, boolean z11) {
        AbstractC4205o.m19722k(zzqVar);
        AbstractC4205o.m19718g(zzqVar.f34702p);
        m31021a5(zzqVar.f34702p, false);
        this.f34135p.m31087h0().m31327M(zzqVar.f34703q, zzqVar.f34692F);
    }

    /* renamed from: a5 */
    private final void m31021a5(String str, boolean z11) {
        boolean z12;
        if (!TextUtils.isEmpty(str)) {
            if (z11) {
                try {
                    if (this.f34136q == null) {
                        if ("com.google.android.gms".equals(this.f34137r) || AbstractC20300u.m105963a(this.f34135p.mo31032b(), Binder.getCallingUid()) || C4155e.m19594a(this.f34135p.mo31032b()).m19599c(Binder.getCallingUid())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f34136q = Boolean.valueOf(z12);
                    }
                    if (this.f34136q.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e11) {
                    this.f34135p.mo31033c().m31197q().m31109b("Measurement Service called with invalid calling package. appId", C6082o3.m31193z(str));
                    throw e11;
                }
            }
            if (this.f34137r == null && AbstractC4150d.m19588l(this.f34135p.mo31032b(), Binder.getCallingUid(), str)) {
                this.f34137r = str;
            }
            if (str.equals(this.f34137r)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f34135p.mo31033c().m31197q().m31108a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: D2 */
    public final void mo30893D2(zzq zzqVar) {
        m31020Z4(zzqVar, false);
        m31025Y4(new RunnableC5939b5(this, zzqVar));
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: H1 */
    public final void mo30894H1(zzq zzqVar) {
        AbstractC4205o.m19718g(zzqVar.f34702p);
        AbstractC4205o.m19722k(zzqVar.f34697K);
        RunnableC5951c5 runnableC5951c5 = new RunnableC5951c5(this, zzqVar);
        AbstractC4205o.m19722k(runnableC5951c5);
        if (this.f34135p.mo31037v().m31291C()) {
            runnableC5951c5.run();
        } else {
            this.f34135p.mo31037v().m31290A(runnableC5951c5);
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: I2 */
    public final void mo30895I2(Bundle bundle, zzq zzqVar) {
        m31020Z4(zzqVar, false);
        String str = zzqVar.f34702p;
        AbstractC4205o.m19722k(str);
        m31025Y4(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4

            /* renamed from: q */
            public final /* synthetic */ String f34484q;

            /* renamed from: r */
            public final /* synthetic */ Bundle f34485r;

            public /* synthetic */ RunnableC6138t4(String str2, Bundle bundle2) {
                r2 = str2;
                r3 = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC6040k5.this.m31024X4(r2, r3);
            }
        });
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: K2 */
    public final List mo30896K2(String str, String str2, String str3, boolean z11) {
        m31021a5(str, true);
        try {
            List<C6099p9> list = (List) this.f34135p.mo31037v().m31293r(new CallableC6182x4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6099p9 c6099p9 : list) {
                if (!z11 && C6121r9.m31300Y(c6099p9.f34340c)) {
                }
                arrayList.add(new zzli(c6099p9));
            }
            return arrayList;
        } catch (InterruptedException e11) {
            e = e11;
            this.f34135p.mo31033c().m31197q().m31110c("Failed to get user properties as. appId", C6082o3.m31193z(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e12) {
            e = e12;
            this.f34135p.mo31033c().m31197q().m31110c("Failed to get user properties as. appId", C6082o3.m31193z(str), e);
            return Collections.emptyList();
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: M3 */
    public final List mo30897M3(String str, String str2, zzq zzqVar) {
        m31020Z4(zzqVar, false);
        String str3 = zzqVar.f34702p;
        AbstractC4205o.m19722k(str3);
        try {
            return (List) this.f34135p.mo31037v().m31293r(new CallableC6193y4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e11) {
            this.f34135p.mo31033c().m31197q().m31109b("Failed to get conditional user properties", e11);
            return Collections.emptyList();
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: N1 */
    public final List mo30898N1(String str, String str2, boolean z11, zzq zzqVar) {
        m31020Z4(zzqVar, false);
        String str3 = zzqVar.f34702p;
        AbstractC4205o.m19722k(str3);
        try {
            List<C6099p9> list = (List) this.f34135p.mo31037v().m31293r(new CallableC6171w4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6099p9 c6099p9 : list) {
                if (!z11 && C6121r9.m31300Y(c6099p9.f34340c)) {
                }
                arrayList.add(new zzli(c6099p9));
            }
            return arrayList;
        } catch (InterruptedException e11) {
            e = e11;
            this.f34135p.mo31033c().m31197q().m31110c("Failed to query user properties. appId", C6082o3.m31193z(zzqVar.f34702p), e);
            return Collections.emptyList();
        } catch (ExecutionException e12) {
            e = e12;
            this.f34135p.mo31033c().m31197q().m31110c("Failed to query user properties. appId", C6082o3.m31193z(zzqVar.f34702p), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: Q */
    public final zzaw m31022Q(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.f34676p) && (zzauVar = zzawVar.f34677q) != null && zzauVar.zza() != 0) {
            String m31513Q = zzawVar.f34677q.m31513Q("_cis");
            if ("referrer broadcast".equals(m31513Q) || "referrer API".equals(m31513Q)) {
                this.f34135p.mo31033c().m31200t().m31109b("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.f34677q, zzawVar.f34678r, zzawVar.f34679s);
            }
        }
        return zzawVar;
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: U2 */
    public final byte[] mo30899U2(zzaw zzawVar, String str) {
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(zzawVar);
        m31021a5(str, true);
        this.f34135p.mo31033c().m31196p().m31109b("Log and bundle. event", this.f34135p.m31075X().m30964d(zzawVar.f34676p));
        long mo105915c = this.f34135p.mo31031a().mo105915c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f34135p.mo31037v().m31294s(new CallableC5985f5(this, zzawVar, str)).get();
            if (bArr == null) {
                this.f34135p.mo31033c().m31197q().m31109b("Log and bundle returned null. appId", C6082o3.m31193z(str));
                bArr = new byte[0];
            }
            this.f34135p.mo31033c().m31196p().m31111d("Log and bundle processed. event, size, time_ms", this.f34135p.m31075X().m30964d(zzawVar.f34676p), Integer.valueOf(bArr.length), Long.valueOf((this.f34135p.mo31031a().mo105915c() / 1000000) - mo105915c));
            return bArr;
        } catch (InterruptedException e11) {
            e = e11;
            this.f34135p.mo31033c().m31197q().m31111d("Failed to log and bundle. appId, event, error", C6082o3.m31193z(str), this.f34135p.m31075X().m30964d(zzawVar.f34676p), e);
            return null;
        } catch (ExecutionException e12) {
            e = e12;
            this.f34135p.mo31033c().m31197q().m31111d("Failed to log and bundle. appId, event, error", C6082o3.m31193z(str), this.f34135p.m31075X().m30964d(zzawVar.f34676p), e);
            return null;
        }
    }

    /* renamed from: W4 */
    public final void m31023W4(zzaw zzawVar, zzq zzqVar) {
        C5332d1 c5332d1;
        if (!this.f34135p.m31078a0().m31121C(zzqVar.f34702p)) {
            m31019N(zzawVar, zzqVar);
            return;
        }
        this.f34135p.mo31033c().m31201u().m31109b("EES config found for", zzqVar.f34702p);
        C6061m4 m31078a0 = this.f34135p.m31078a0();
        String str = zzqVar.f34702p;
        if (TextUtils.isEmpty(str)) {
            c5332d1 = null;
        } else {
            c5332d1 = (C5332d1) m31078a0.f34211j.m149139d(str);
        }
        if (c5332d1 != null) {
            try {
                Map m31173I = this.f34135p.m31085g0().m31173I(zzawVar.f34677q.m31509F(), true);
                String m106024a = AbstractC20325q.m106024a(zzawVar.f34676p);
                if (m106024a == null) {
                    m106024a = zzawVar.f34676p;
                }
                if (c5332d1.m29040e(new C5296b(m106024a, zzawVar.f34679s, m31173I))) {
                    if (c5332d1.m29042g()) {
                        this.f34135p.mo31033c().m31201u().m31109b("EES edited event", zzawVar.f34676p);
                        m31019N(this.f34135p.m31085g0().m31167A(c5332d1.m29036a().m28955b()), zzqVar);
                    } else {
                        m31019N(zzawVar, zzqVar);
                    }
                    if (c5332d1.m29041f()) {
                        for (C5296b c5296b : c5332d1.m29036a().m28956c()) {
                            this.f34135p.mo31033c().m31201u().m31109b("EES logging created event", c5296b.m28901d());
                            m31019N(this.f34135p.m31085g0().m31167A(c5296b), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f34135p.mo31033c().m31197q().m31110c("EES error. appId, eventName", zzqVar.f34703q, zzawVar.f34676p);
            }
            this.f34135p.mo31033c().m31201u().m31109b("EES was not applied to event", zzawVar.f34676p);
            m31019N(zzawVar, zzqVar);
            return;
        }
        this.f34135p.mo31033c().m31201u().m31109b("EES not loaded for", zzqVar.f34702p);
        m31019N(zzawVar, zzqVar);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: X1 */
    public final void mo30900X1(zzli zzliVar, zzq zzqVar) {
        AbstractC4205o.m19722k(zzliVar);
        m31020Z4(zzqVar, false);
        m31025Y4(new RunnableC5996g5(this, zzliVar, zzqVar));
    }

    /* renamed from: X4 */
    public final /* synthetic */ void m31024X4(String str, Bundle bundle) {
        C6034k m31074W = this.f34135p.m31074W();
        m31074W.mo31036g();
        m31074W.m31504h();
        byte[] m29188f = m31074W.f34628b.m31085g0().m31168B(new C6089p(m31074W.f34158a, "", str, "dep", 0L, 0L, bundle)).m29188f();
        m31074W.f34158a.mo31033c().m31201u().m31110c("Saving default event parameters, appId, data size", m31074W.f34158a.m31372D().m30964d(str), Integer.valueOf(m29188f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m29188f);
        try {
            if (m31074W.m30988P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m31074W.f34158a.mo31033c().m31197q().m31109b("Failed to insert default event parameters (got -1). appId", C6082o3.m31193z(str));
            }
        } catch (SQLiteException e11) {
            m31074W.f34158a.mo31033c().m31197q().m31110c("Error storing default event parameters. appId", C6082o3.m31193z(str), e11);
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: Y1 */
    public final void mo30901Y1(zzq zzqVar) {
        AbstractC4205o.m19718g(zzqVar.f34702p);
        m31021a5(zzqVar.f34702p, false);
        m31025Y4(new RunnableC5927a5(this, zzqVar));
    }

    /* renamed from: Y4 */
    final void m31025Y4(Runnable runnable) {
        AbstractC4205o.m19722k(runnable);
        if (this.f34135p.mo31037v().m31291C()) {
            runnable.run();
        } else {
            this.f34135p.mo31037v().m31296z(runnable);
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: Z3 */
    public final void mo31026Z3(zzaw zzawVar, String str, String str2) {
        AbstractC4205o.m19722k(zzawVar);
        AbstractC4205o.m19718g(str);
        m31021a5(str, true);
        m31025Y4(new RunnableC5974e5(this, zzawVar, str));
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: a3 */
    public final String mo30902a3(zzq zzqVar) {
        m31020Z4(zzqVar, false);
        return this.f34135p.m31091j0(zzqVar);
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: b1 */
    public final void mo30903b1(zzaw zzawVar, zzq zzqVar) {
        AbstractC4205o.m19722k(zzawVar);
        m31020Z4(zzqVar, false);
        m31025Y4(new RunnableC5963d5(this, zzawVar, zzqVar));
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: f1 */
    public final void mo30904f1(zzq zzqVar) {
        m31020Z4(zzqVar, false);
        m31025Y4(new RunnableC6018i5(this, zzqVar));
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: g3 */
    public final List mo30905g3(String str, String str2, String str3) {
        m31021a5(str, true);
        try {
            return (List) this.f34135p.mo31037v().m31293r(new CallableC6204z4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e11) {
            this.f34135p.mo31033c().m31197q().m31109b("Failed to get conditional user properties as", e11);
            return Collections.emptyList();
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: i0 */
    public final void mo31027i0(zzac zzacVar) {
        AbstractC4205o.m19722k(zzacVar);
        AbstractC4205o.m19722k(zzacVar.f34666r);
        AbstractC4205o.m19718g(zzacVar.f34664p);
        m31021a5(zzacVar.f34664p, true);
        m31025Y4(new RunnableC6160v4(this, new zzac(zzacVar)));
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: k0 */
    public final List mo31028k0(zzq zzqVar, boolean z11) {
        m31020Z4(zzqVar, false);
        String str = zzqVar.f34702p;
        AbstractC4205o.m19722k(str);
        try {
            List<C6099p9> list = (List) this.f34135p.mo31037v().m31293r(new CallableC6007h5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6099p9 c6099p9 : list) {
                if (!z11 && C6121r9.m31300Y(c6099p9.f34340c)) {
                }
                arrayList.add(new zzli(c6099p9));
            }
            return arrayList;
        } catch (InterruptedException e11) {
            e = e11;
            this.f34135p.mo31033c().m31197q().m31110c("Failed to get user properties. appId", C6082o3.m31193z(zzqVar.f34702p), e);
            return null;
        } catch (ExecutionException e12) {
            e = e12;
            this.f34135p.mo31033c().m31197q().m31110c("Failed to get user properties. appId", C6082o3.m31193z(zzqVar.f34702p), e);
            return null;
        }
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: l1 */
    public final void mo30906l1(long j11, String str, String str2, String str3) {
        m31025Y4(new RunnableC6029j5(this, str2, str3, str, j11));
    }

    @Override // p230i6.InterfaceC20314f
    /* renamed from: z4 */
    public final void mo30907z4(zzac zzacVar, zzq zzqVar) {
        AbstractC4205o.m19722k(zzacVar);
        AbstractC4205o.m19722k(zzacVar.f34666r);
        m31020Z4(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.f34664p = zzqVar.f34702p;
        m31025Y4(new RunnableC6149u4(this, zzacVar2, zzqVar));
    }
}
