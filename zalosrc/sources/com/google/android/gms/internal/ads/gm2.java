package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class gm2 extends zzbr implements zzo, InterfaceC4437dr {

    /* renamed from: p */
    private final vs0 f20736p;

    /* renamed from: q */
    private final Context f20737q;

    /* renamed from: s */
    private final String f20739s;

    /* renamed from: t */
    private final am2 f20740t;

    /* renamed from: u */
    private final yl2 f20741u;

    /* renamed from: v */
    private final zzcgv f20742v;

    /* renamed from: x */
    private k01 f20744x;

    /* renamed from: y */
    protected k11 f20745y;

    /* renamed from: r */
    private AtomicBoolean f20738r = new AtomicBoolean();

    /* renamed from: w */
    private long f20743w = -1;

    public gm2(vs0 vs0Var, Context context, String str, am2 am2Var, yl2 yl2Var, zzcgv zzcgvVar) {
        this.f20736p = vs0Var;
        this.f20737q = context;
        this.f20739s = str;
        this.f20740t = am2Var;
        this.f20741u = yl2Var;
        this.f20742v = zzcgvVar;
        yl2Var.m28230o(this);
    }

    /* renamed from: Q */
    private final synchronized void m22474Q(int i11) {
        try {
            if (this.f20738r.compareAndSet(false, true)) {
                this.f20741u.zzj();
                k01 k01Var = this.f20744x;
                if (k01Var != null) {
                    zzt.zzb().m24018e(k01Var);
                }
                if (this.f20745y != null) {
                    long j11 = -1;
                    if (this.f20743w != -1) {
                        j11 = zzt.zzB().mo105914b() - this.f20743w;
                    }
                    this.f20745y.m23799k(j11, i11);
                }
                zzx();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        AbstractC4205o.m19717f("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(zzq zzqVar) {
        AbstractC4205o.m19717f("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(InterfaceC4770mr interfaceC4770mr) {
        this.f20741u.m28232t(interfaceC4770mr);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.f20740t.m22967k(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z11) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(xd0 xd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z11) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(InterfaceC4407cy interfaceC4407cy) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(ae0 ae0Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(ig0 ig0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(InterfaceC4271b interfaceC4271b) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.f20740t.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4437dr
    public final void zza() {
        m22474Q(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[Catch: all -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0050, B:16:0x0055, B:20:0x0067, B:24:0x006f, B:27:0x0040), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(zzl zzlVar) {
        boolean z11;
        try {
            if (((Boolean) AbstractC5149wy.f30256d.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                    z11 = true;
                    if (this.f20742v.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue() || !z11) {
                        AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
                    }
                    zzt.zzp();
                    if (zzs.zzD(this.f20737q) && zzlVar.zzs == null) {
                        yk0.zzg("Failed to load the ad because app ID is missing.");
                        this.f20741u.mo20715a(cs2.m20999d(4, null, null));
                        return false;
                    }
                    if (!zzY()) {
                        return false;
                    }
                    this.f20738r = new AtomicBoolean();
                    return this.f20740t.mo21338a(zzlVar, this.f20739s, new em2(this), new fm2(this));
                }
            }
            z11 = false;
            if (this.f20742v.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue()) {
            }
            AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
            zzt.zzp();
            if (zzs.zzD(this.f20737q)) {
                yk0.zzg("Failed to load the ad because app ID is missing.");
                this.f20741u.mo20715a(cs2.m20999d(4, null, null));
                return false;
            }
            if (!zzY()) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        if (this.f20745y == null) {
            return;
        }
        this.f20743w = zzt.zzB().mo105914b();
        int m23796h = this.f20745y.m23796h();
        if (m23796h <= 0) {
            return;
        }
        k01 k01Var = new k01(this.f20736p.mo22593c(), zzt.zzB());
        this.f20744x = k01Var;
        k01Var.m23789c(m23796h, new Runnable() { // from class: com.google.android.gms.internal.ads.dm2
            public /* synthetic */ dm2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                gm2.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        k11 k11Var = this.f20745y;
        if (k11Var != null) {
            k11Var.m23799k(zzt.zzB().mo105914b() - this.f20743w, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i11) {
        int i12 = i11 - 1;
        if (i11 != 0) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            return;
                        }
                        m22474Q(6);
                        return;
                    }
                    m22474Q(3);
                    return;
                }
                m22474Q(4);
                return;
            }
            m22474Q(2);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    public final /* synthetic */ void zzm() {
        m22474Q(5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final InterfaceC4271b zzn() {
        return null;
    }

    public final void zzo() {
        this.f20736p.mo22592b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cm2
            public /* synthetic */ cm2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                gm2.this.zzm();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.f20739s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
        k11 k11Var = this.f20745y;
        if (k11Var != null) {
            k11Var.mo23795a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzlVar, zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        AbstractC4205o.m19717f("pause must be called on the main UI thread.");
    }
}
