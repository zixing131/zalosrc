package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class na2 implements ta1, l91, z71, q81, zza, w71, ja1, InterfaceC5019tg, m81, pf1 {

    /* renamed from: x */
    private final rv2 f25119x;

    /* renamed from: p */
    private final AtomicReference f25111p = new AtomicReference();

    /* renamed from: q */
    private final AtomicReference f25112q = new AtomicReference();

    /* renamed from: r */
    private final AtomicReference f25113r = new AtomicReference();

    /* renamed from: s */
    private final AtomicReference f25114s = new AtomicReference();

    /* renamed from: t */
    private final AtomicReference f25115t = new AtomicReference();

    /* renamed from: u */
    private final AtomicBoolean f25116u = new AtomicBoolean(true);

    /* renamed from: v */
    private final AtomicBoolean f25117v = new AtomicBoolean(false);

    /* renamed from: w */
    private final AtomicBoolean f25118w = new AtomicBoolean(false);

    /* renamed from: y */
    final BlockingQueue f25120y = new ArrayBlockingQueue(((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20949B7)).intValue());

    public na2(rv2 rv2Var) {
        this.f25119x = rv2Var;
    }

    /* renamed from: a0 */
    private final void m24867a0() {
        if (this.f25117v.get() && this.f25118w.get()) {
            Iterator it = this.f25120y.iterator();
            while (it.hasNext()) {
                in2.m23309a(this.f25112q, new hn2() { // from class: com.google.android.gms.internal.ads.da2

                    /* renamed from: a */
                    public final /* synthetic */ Pair f19165a;

                    public /* synthetic */ da2(Pair pair) {
                        r1 = pair;
                    }

                    @Override // com.google.android.gms.internal.ads.hn2
                    public final void zza(Object obj) {
                        Pair pair = r1;
                        ((zzbz) obj).zzc((String) pair.first, (String) pair.second);
                    }
                });
            }
            this.f25120y.clear();
            this.f25116u.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: G */
    public final void mo20101G(cg0 cg0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: Q */
    public final void mo20102Q() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019tg
    /* renamed from: V */
    public final synchronized void mo20714V(String str, String str2) {
        if (this.f25116u.get()) {
            if (!this.f25120y.offer(new Pair(str, str2))) {
                yk0.zze("The queue for app events is full, dropping the new event.");
                rv2 rv2Var = this.f25119x;
                if (rv2Var != null) {
                    qv2 m25905b = qv2.m25905b("dae_action");
                    m25905b.m25907a("dae_name", str);
                    m25905b.m25907a("dae_data", str2);
                    rv2Var.mo22194a(m25905b);
                    return;
                }
            }
            return;
        }
        in2.m23309a(this.f25112q, new hn2() { // from class: com.google.android.gms.internal.ads.z92

            /* renamed from: a */
            public final /* synthetic */ String f31420a;

            /* renamed from: b */
            public final /* synthetic */ String f31421b;

            public /* synthetic */ z92(String str3, String str22) {
                r1 = str3;
                r2 = str22;
            }

            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzbz) obj).zzc(r1, r2);
            }
        });
    }

    /* renamed from: Y */
    public final void m24868Y(zzbz zzbzVar) {
        this.f25112q.set(zzbzVar);
        this.f25117v.set(true);
        m24867a0();
    }

    /* renamed from: Z */
    public final void m24869Z(zzcg zzcgVar) {
        this.f25115t.set(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        in2.m23309a(this.f25111p, new hn2() { // from class: com.google.android.gms.internal.ads.ga2
            public /* synthetic */ ga2() {
            }

            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzbf) obj).zzf(zze.this);
            }
        });
        in2.m23309a(this.f25111p, new hn2() { // from class: com.google.android.gms.internal.ads.ia2
            public /* synthetic */ ia2() {
            }

            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzbf) obj).zze(zze.this.zza);
            }
        });
        in2.m23309a(this.f25114s, new hn2() { // from class: com.google.android.gms.internal.ads.ja2
            public /* synthetic */ ja2() {
            }

            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzbi) obj).zzb(zze.this);
            }
        });
        this.f25116u.set(false);
        this.f25120y.clear();
    }

    @Override // com.google.android.gms.internal.ads.ja1
    /* renamed from: c */
    public final void mo22410c(zzs zzsVar) {
        in2.m23309a(this.f25113r, new hn2() { // from class: com.google.android.gms.internal.ads.ba2
            public /* synthetic */ ba2() {
            }

            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzde) obj).zze(zzs.this);
            }
        });
    }

    /* renamed from: g */
    public final synchronized zzbf m24870g() {
        return (zzbf) this.f25111p.get();
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
        this.f25116u.set(true);
        this.f25118w.set(false);
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
    }

    /* renamed from: n */
    public final synchronized zzbz m24871n() {
        return (zzbz) this.f25112q.get();
    }

    /* renamed from: o */
    public final void m24872o(zzbf zzbfVar) {
        this.f25111p.set(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21415w8)).booleanValue()) {
            in2.m23309a(this.f25111p, ea2.f19572a);
        }
    }

    /* renamed from: r */
    public final void m24873r(zzbi zzbiVar) {
        this.f25114s.set(zzbiVar);
    }

    /* renamed from: t */
    public final void m24874t(zzde zzdeVar) {
        this.f25113r.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.m81
    /* renamed from: z */
    public final void mo22412z(zze zzeVar) {
        in2.m23309a(this.f25115t, new hn2() { // from class: com.google.android.gms.internal.ads.aa2
            public /* synthetic */ aa2() {
            }

            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzcg) obj).zzd(zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzj() {
        in2.m23309a(this.f25111p, ma2.f24450a);
        in2.m23309a(this.f25115t, v92.f29234a);
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        in2.m23309a(this.f25111p, u92.f28794a);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzm() {
        in2.m23309a(this.f25111p, ca2.f18165a);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final synchronized void zzn() {
        in2.m23309a(this.f25111p, ka2.f23199a);
        in2.m23309a(this.f25114s, la2.f23805a);
        this.f25118w.set(true);
        m24867a0();
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzo() {
        in2.m23309a(this.f25111p, w92.f29847a);
        in2.m23309a(this.f25115t, x92.f30391a);
        in2.m23309a(this.f25115t, y92.f30840a);
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void zzq() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21415w8)).booleanValue()) {
            in2.m23309a(this.f25111p, ea2.f19572a);
        }
        in2.m23309a(this.f25115t, fa2.f20078a);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzr() {
    }
}
