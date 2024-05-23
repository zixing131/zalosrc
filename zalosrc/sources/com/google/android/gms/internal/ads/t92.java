package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class t92 extends zzbr implements oa1 {

    /* renamed from: p */
    private final Context f28261p;

    /* renamed from: q */
    private final mm2 f28262q;

    /* renamed from: r */
    private final String f28263r;

    /* renamed from: s */
    private final na2 f28264s;

    /* renamed from: t */
    private zzq f28265t;

    /* renamed from: u */
    private final br2 f28266u;

    /* renamed from: v */
    private final zzcgv f28267v;

    /* renamed from: w */
    private s11 f28268w;

    public t92(Context context, zzq zzqVar, String str, mm2 mm2Var, na2 na2Var, zzcgv zzcgvVar) {
        this.f28261p = context;
        this.f28262q = mm2Var;
        this.f28265t = zzqVar;
        this.f28263r = str;
        this.f28264s = na2Var;
        this.f28266u = mm2Var.m24642h();
        this.f28267v = zzcgvVar;
        mm2Var.m24646o(this);
    }

    /* renamed from: I3 */
    private final synchronized void m26590I3(zzq zzqVar) {
        this.f28266u.m20680I(zzqVar);
        this.f28266u.m20685N(this.f28265t.zzn);
    }

    /* renamed from: W4 */
    private final synchronized boolean m26593W4(zzl zzlVar) {
        try {
            if (m26594X4()) {
                AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
            }
            zzt.zzp();
            if (zzs.zzD(this.f28261p) && zzlVar.zzs == null) {
                yk0.zzg("Failed to load the ad because app ID is missing.");
                na2 na2Var = this.f28264s;
                if (na2Var != null) {
                    na2Var.mo20715a(cs2.m20999d(4, null, null));
                }
                return false;
            }
            wr2.m27704a(this.f28261p, zzlVar.zzf);
            return this.f28262q.mo21338a(zzlVar, this.f28263r, null, new s92(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: X4 */
    private final boolean m26594X4() {
        boolean z11;
        if (((Boolean) AbstractC5149wy.f30258f.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                z11 = true;
                if (this.f28267v.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue() || !z11) {
                    return true;
                }
                return false;
            }
        }
        z11 = false;
        if (this.f28267v.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue()) {
        }
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
        AbstractC4205o.m19717f("recordManualImpression must be called on the main UI thread.");
        s11 s11Var = this.f28268w;
        if (s11Var != null) {
            s11Var.mo20381m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzB() {
        s11 s11Var;
        try {
            if (((Boolean) AbstractC5149wy.f30260h.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21020I8)).booleanValue()) {
                    if (this.f28267v.f32032r < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21080O8)).intValue()) {
                    }
                    s11Var = this.f28268w;
                    if (s11Var == null) {
                        s11Var.m27146d().m27183D0(null);
                        return;
                    }
                    return;
                }
            }
            AbstractC4205o.m19717f("resume must be called on the main UI thread.");
            s11Var = this.f28268w;
            if (s11Var == null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbcVar) {
        if (m26594X4()) {
            AbstractC4205o.m19717f("setAdListener must be called on the main UI thread.");
        }
        this.f28262q.m24645n(zzbcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbfVar) {
        if (m26594X4()) {
            AbstractC4205o.m19717f("setAdListener must be called on the main UI thread.");
        }
        this.f28264s.m24872o(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        AbstractC4205o.m19717f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(zzq zzqVar) {
        AbstractC4205o.m19717f("setAdSize must be called on the main UI thread.");
        this.f28266u.m20680I(zzqVar);
        this.f28265t = zzqVar;
        s11 s11Var = this.f28268w;
        if (s11Var != null) {
            s11Var.mo20382n(this.f28262q.m24641c(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
        if (m26594X4()) {
            AbstractC4205o.m19717f("setAppEventListener must be called on the main UI thread.");
        }
        this.f28264s.m24868Y(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(InterfaceC4770mr interfaceC4770mr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
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
        try {
            if (m26594X4()) {
                AbstractC4205o.m19717f("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f28266u.m20687P(z11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(InterfaceC4407cy interfaceC4407cy) {
        AbstractC4205o.m19717f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f28262q.m24647p(interfaceC4407cy);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzdeVar) {
        if (m26594X4()) {
            AbstractC4205o.m19717f("setPaidEventListener must be called on the main UI thread.");
        }
        this.f28264s.m24874t(zzdeVar);
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
        try {
            if (m26594X4()) {
                AbstractC4205o.m19717f("setVideoOptions must be called on the main UI thread.");
            }
            this.f28266u.m20694f(zzffVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(InterfaceC4271b interfaceC4271b) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.f28262q.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.oa1
    public final synchronized void zza() {
        try {
            if (this.f28262q.m24648q()) {
                zzq m20700x = this.f28266u.m20700x();
                s11 s11Var = this.f28268w;
                if (s11Var != null && s11Var.mo20380l() != null && this.f28266u.m20697o()) {
                    m20700x = hr2.m23005a(this.f28261p, Collections.singletonList(this.f28268w.mo20380l()));
                }
                m26590I3(m20700x);
                try {
                    m26593W4(this.f28266u.m20699v());
                    return;
                } catch (RemoteException unused) {
                    yk0.zzj("Failed to refresh the banner ad.");
                    return;
                }
            }
            this.f28262q.m24644m();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzaa(zzl zzlVar) {
        m26590I3(this.f28265t);
        return m26593W4(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(zzcd zzcdVar) {
        AbstractC4205o.m19717f("setCorrelationIdProvider must be called on the main UI thread");
        this.f28266u.m20698q(zzcdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        AbstractC4205o.m19717f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized zzq zzg() {
        AbstractC4205o.m19717f("getAdSize must be called on the main UI thread.");
        s11 s11Var = this.f28268w;
        if (s11Var != null) {
            return hr2.m23005a(this.f28261p, Collections.singletonList(s11Var.mo20379k()));
        }
        return this.f28266u.m20700x();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return this.f28264s.m24870g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return this.f28264s.m24871n();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized zzdh zzk() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21097Q5)).booleanValue()) {
            return null;
        }
        s11 s11Var = this.f28268w;
        if (s11Var == null) {
            return null;
        }
        return s11Var.m27145c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        AbstractC4205o.m19717f("getVideoController must be called from the main thread.");
        s11 s11Var = this.f28268w;
        if (s11Var != null) {
            return s11Var.mo20378j();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final InterfaceC4271b zzn() {
        if (m26594X4()) {
            AbstractC4205o.m19717f("getAdFrame must be called on the main UI thread.");
        }
        return BinderC4273d.m19913I3(this.f28262q.m24641c());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.f28263r;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        s11 s11Var = this.f28268w;
        if (s11Var != null && s11Var.m27145c() != null) {
            return s11Var.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        s11 s11Var = this.f28268w;
        if (s11Var != null && s11Var.m27145c() != null) {
            return s11Var.m27145c().zzg();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzx() {
        s11 s11Var;
        try {
            if (((Boolean) AbstractC5149wy.f30257e.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21030J8)).booleanValue()) {
                    if (this.f28267v.f32032r < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21080O8)).intValue()) {
                    }
                    s11Var = this.f28268w;
                    if (s11Var == null) {
                        s11Var.mo23795a();
                        return;
                    }
                    return;
                }
            }
            AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
            s11Var = this.f28268w;
            if (s11Var == null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzlVar, zzbi zzbiVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzz() {
        s11 s11Var;
        try {
            if (((Boolean) AbstractC5149wy.f30259g.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21040K8)).booleanValue()) {
                    if (this.f28267v.f32032r < ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21080O8)).intValue()) {
                    }
                    s11Var = this.f28268w;
                    if (s11Var == null) {
                        s11Var.m27146d().m27182C0(null);
                        return;
                    }
                    return;
                }
            }
            AbstractC4205o.m19717f("pause must be called on the main UI thread.");
            s11Var = this.f28268w;
            if (s11Var == null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
