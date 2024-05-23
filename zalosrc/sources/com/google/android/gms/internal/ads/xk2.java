package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzaw;
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
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class xk2 extends zzbr implements zzad, InterfaceC4437dr, w91 {

    /* renamed from: p */
    private final vs0 f30506p;

    /* renamed from: q */
    private final Context f30507q;

    /* renamed from: r */
    private final ViewGroup f30508r;

    /* renamed from: t */
    private final String f30510t;

    /* renamed from: u */
    private final rk2 f30511u;

    /* renamed from: v */
    private final yl2 f30512v;

    /* renamed from: w */
    private final zzcgv f30513w;

    /* renamed from: y */
    private k01 f30515y;

    /* renamed from: z */
    protected a11 f30516z;

    /* renamed from: s */
    private AtomicBoolean f30509s = new AtomicBoolean();

    /* renamed from: x */
    private long f30514x = -1;

    public xk2(vs0 vs0Var, Context context, String str, rk2 rk2Var, yl2 yl2Var, zzcgv zzcgvVar) {
        this.f30508r = new FrameLayout(context);
        this.f30506p = vs0Var;
        this.f30507q = context;
        this.f30510t = str;
        this.f30511u = rk2Var;
        this.f30512v = yl2Var;
        yl2Var.m28229n(this);
        this.f30513w = zzcgvVar;
    }

    /* renamed from: I3 */
    public static /* bridge */ /* synthetic */ zzr m27918I3(xk2 xk2Var, a11 a11Var) {
        int i11;
        boolean m19952o = a11Var.m19952o();
        int intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21181Z3)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        int i12 = 0;
        if (true != m19952o) {
            i11 = 0;
        } else {
            i11 = intValue;
        }
        zzqVar.zza = i11;
        if (true != m19952o) {
            i12 = intValue;
        }
        zzqVar.zzb = i12;
        zzqVar.zzc = intValue;
        return new zzr(xk2Var.f30507q, zzqVar, xk2Var);
    }

    /* renamed from: Y4 */
    private final synchronized void m27923Y4(int i11) {
        try {
            if (this.f30509s.compareAndSet(false, true)) {
                a11 a11Var = this.f30516z;
                if (a11Var != null && a11Var.m19954q() != null) {
                    this.f30512v.m28227Q(a11Var.m19954q());
                }
                this.f30512v.zzj();
                this.f30508r.removeAllViews();
                k01 k01Var = this.f30515y;
                if (k01Var != null) {
                    zzt.zzb().m24018e(k01Var);
                }
                if (this.f30516z != null) {
                    long j11 = -1;
                    if (this.f30514x != -1) {
                        j11 = zzt.zzB().mo105914b() - this.f30514x;
                    }
                    this.f30516z.m19953p(j11, i11);
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
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        AbstractC4205o.m19717f("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(InterfaceC4770mr interfaceC4770mr) {
        this.f30512v.m28232t(interfaceC4770mr);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.f30511u.m22967k(zzwVar);
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
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.f30511u.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4437dr
    public final void zza() {
        m27923Y4(3);
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
                    if (this.f30513w.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue() || !z11) {
                        AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
                    }
                    zzt.zzp();
                    if (zzs.zzD(this.f30507q) && zzlVar.zzs == null) {
                        yk0.zzg("Failed to load the ad because app ID is missing.");
                        this.f30512v.mo20715a(cs2.m20999d(4, null, null));
                        return false;
                    }
                    if (!zzY()) {
                        return false;
                    }
                    this.f30509s = new AtomicBoolean();
                    return this.f30511u.mo21338a(zzlVar, this.f30510t, new vk2(this), new wk2(this));
                }
            }
            z11 = false;
            if (this.f30513w.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue()) {
            }
            AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
            zzt.zzp();
            if (zzs.zzD(this.f30507q)) {
                yk0.zzg("Failed to load the ad because app ID is missing.");
                this.f30512v.mo20715a(cs2.m20999d(4, null, null));
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

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbJ() {
        m27923Y4(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        AbstractC4205o.m19717f("getAdSize must be called on the main UI thread.");
        a11 a11Var = this.f30516z;
        if (a11Var != null) {
            return hr2.m23005a(this.f30507q, Collections.singletonList(a11Var.m19947j()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void zzh() {
        if (this.f30516z == null) {
            return;
        }
        this.f30514x = zzt.zzB().mo105914b();
        int m19945h = this.f30516z.m19945h();
        if (m19945h <= 0) {
            return;
        }
        k01 k01Var = new k01(this.f30506p.mo22593c(), zzt.zzB());
        this.f30515y = k01Var;
        k01Var.m23789c(m19945h, new Runnable() { // from class: com.google.android.gms.internal.ads.uk2
            public /* synthetic */ uk2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                xk2.this.zzp();
            }
        });
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

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final InterfaceC4271b zzn() {
        AbstractC4205o.m19717f("getAdFrame must be called on the main UI thread.");
        return BinderC4273d.m19913I3(this.f30508r);
    }

    public final /* synthetic */ void zzo() {
        m27923Y4(5);
    }

    public final void zzp() {
        zzaw.zzb();
        if (rk0.m26112v()) {
            m27923Y4(5);
        } else {
            this.f30506p.mo22592b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tk2
                public /* synthetic */ tk2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    xk2.this.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.f30510t;
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
        a11 a11Var = this.f30516z;
        if (a11Var != null) {
            a11Var.mo23795a();
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
