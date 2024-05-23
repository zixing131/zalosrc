package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class kp2 extends rz2 implements l91, z71, w71, m81, ja1, rn2, pf1 {

    /* renamed from: p */
    private final ks2 f23424p;

    /* renamed from: q */
    private final AtomicReference f23425q = new AtomicReference();

    /* renamed from: r */
    private final AtomicReference f23426r = new AtomicReference();

    /* renamed from: s */
    private final AtomicReference f23427s = new AtomicReference();

    /* renamed from: t */
    private final AtomicReference f23428t = new AtomicReference();

    /* renamed from: u */
    private final AtomicReference f23429u = new AtomicReference();

    /* renamed from: v */
    private final AtomicReference f23430v = new AtomicReference();

    /* renamed from: w */
    private final AtomicReference f23431w = new AtomicReference();

    public kp2(ks2 ks2Var) {
        this.f23424p = ks2Var;
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: G */
    public final void mo20101G(final cg0 cg0Var, final String str, final String str2) {
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.gp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                cg0 cg0Var2 = cg0.this;
                ((xg0) obj).mo24575R1(new lh0(cg0Var2.zzc(), cg0Var2.zzb()));
            }
        });
        in2.m23309a(this.f23429u, new hn2() { // from class: com.google.android.gms.internal.ads.hp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                cg0 cg0Var2 = cg0.this;
                ((ch0) obj).m20891E(new lh0(cg0Var2.zzc(), cg0Var2.zzb()), str, str2);
            }
        });
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.ip2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).mo22436v4(cg0.this);
            }
        });
        in2.m23309a(this.f23430v, new hn2() { // from class: com.google.android.gms.internal.ads.jp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((dg0) obj).m21384E(cg0.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: Q */
    public final void mo20102Q() {
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.uo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).zzk();
            }
        });
    }

    /* renamed from: Y */
    public final void m24006Y(dg0 dg0Var) {
        this.f23430v.set(dg0Var);
    }

    /* renamed from: Z */
    public final void m24007Z(ch0 ch0Var) {
        this.f23429u.set(ch0Var);
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(final zze zzeVar) {
        final int i11 = zzeVar.zza;
        in2.m23309a(this.f23426r, new hn2() { // from class: com.google.android.gms.internal.ads.po2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((bh0) obj).zzf(zze.this);
            }
        });
        in2.m23309a(this.f23426r, new hn2() { // from class: com.google.android.gms.internal.ads.qo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((bh0) obj).zze(i11);
            }
        });
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.ro2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).mo22435b(i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ja1
    /* renamed from: c */
    public final void mo22410c(final zzs zzsVar) {
        in2.m23309a(this.f23431w, new hn2() { // from class: com.google.android.gms.internal.ads.oo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzde) obj).zze(zzs.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.rn2
    /* renamed from: g */
    public final void mo24008g(rn2 rn2Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.rz2
    /* renamed from: j */
    public final void mo21779j() {
        in2.m23309a(this.f23425q, new hn2() { // from class: com.google.android.gms.internal.ads.ep2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((rz2) obj).mo21779j();
            }
        });
    }

    /* renamed from: k */
    public final void m24009k(rz2 rz2Var) {
        this.f23425q.set(rz2Var);
    }

    /* renamed from: n */
    public final void m24010n(zzde zzdeVar) {
        this.f23431w.set(zzdeVar);
    }

    /* renamed from: o */
    public final void m24011o(xg0 xg0Var) {
        this.f23427s.set(xg0Var);
    }

    /* renamed from: r */
    public final void m24012r(bh0 bh0Var) {
        this.f23426r.set(bh0Var);
    }

    /* renamed from: t */
    public final void m24013t(ig0 ig0Var) {
        this.f23428t.set(ig0Var);
    }

    @Override // com.google.android.gms.internal.ads.m81
    /* renamed from: z */
    public final void mo22412z(final zze zzeVar) {
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.so2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((xg0) obj).mo24576b2(zze.this);
            }
        });
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.to2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((xg0) obj).mo24577f(zze.this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzj() {
        this.f23424p.m24024a();
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.vo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((xg0) obj).zzg();
            }
        });
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.xo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzm() {
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.fp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        in2.m23309a(this.f23426r, new hn2() { // from class: com.google.android.gms.internal.ads.cp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((bh0) obj).zzg();
            }
        });
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.dp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzo() {
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.yo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((xg0) obj).zzj();
            }
        });
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.ap2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).zzj();
            }
        });
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.bp2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((xg0) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void zzq() {
        in2.m23309a(this.f23427s, new hn2() { // from class: com.google.android.gms.internal.ads.no2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((xg0) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzr() {
        in2.m23309a(this.f23428t, new hn2() { // from class: com.google.android.gms.internal.ads.zo2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((ig0) obj).zzl();
            }
        });
    }
}
