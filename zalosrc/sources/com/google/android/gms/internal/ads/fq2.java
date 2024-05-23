package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class fq2 extends eg0 {

    /* renamed from: p */
    private final up2 f20247p;

    /* renamed from: q */
    private final kp2 f20248q;

    /* renamed from: r */
    private final uq2 f20249r;

    /* renamed from: s */
    private np1 f20250s;

    /* renamed from: t */
    private boolean f20251t = false;

    public fq2(up2 up2Var, kp2 kp2Var, uq2 uq2Var) {
        this.f20247p = up2Var;
        this.f20248q = kp2Var;
        this.f20249r = uq2Var;
    }

    /* renamed from: W4 */
    private final synchronized boolean m22141W4() {
        np1 np1Var = this.f20250s;
        if (np1Var != null) {
            if (!np1Var.m24972k()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: F */
    public final synchronized void mo22011F(InterfaceC4271b interfaceC4271b) {
        AbstractC4205o.m19717f("destroy must be called on the main UI thread.");
        Context context = null;
        this.f20248q.m24009k(null);
        if (this.f20250s != null) {
            if (interfaceC4271b != null) {
                context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
            }
            this.f20250s.m27146d().m27181B0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: H2 */
    public final void mo22012H2(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        AbstractC4205o.m19717f("setAdMetadataListener can only be called from the UI thread.");
        if (zzbwVar == null) {
            this.f20248q.m24009k(null);
        } else {
            this.f20248q.m24009k(new eq2(this, zzbwVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: H4 */
    public final void mo22013H4(ig0 ig0Var) {
        AbstractC4205o.m19717f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f20248q.m24013t(ig0Var);
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: e4 */
    public final synchronized void mo22014e4(InterfaceC4271b interfaceC4271b) {
        Context context;
        AbstractC4205o.m19717f("resume must be called on the main UI thread.");
        if (this.f20250s != null) {
            if (interfaceC4271b == null) {
                context = null;
            } else {
                context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
            }
            this.f20250s.m27146d().m27183D0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: f3 */
    public final synchronized void mo22015f3(boolean z11) {
        AbstractC4205o.m19717f("setImmersiveMode must be called on the main UI thread.");
        this.f20251t = z11;
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: h1 */
    public final synchronized void mo22016h1(String str) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.: setCustomData");
        this.f20249r.f29030b = str;
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: h2 */
    public final synchronized void mo22017h2(zzcbz zzcbzVar) {
        AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
        String str = zzcbzVar.f32013q;
        String str2 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21431y4);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e11) {
                zzt.zzo().m22945t(e11, "NonagonUtil.isPatternMatched");
            }
        }
        if (m22141W4()) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20936A4)).booleanValue()) {
                return;
            }
        }
        mp2 mp2Var = new mp2(null);
        this.f20250s = null;
        this.f20247p.m27037i(1);
        this.f20247p.mo21338a(zzcbzVar.f32012p, zzcbzVar.f32013q, mp2Var, new dq2(this));
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: l */
    public final synchronized void mo22018l(String str) {
        AbstractC4205o.m19717f("setUserId must be called on the main UI thread.");
        this.f20249r.f29029a = str;
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: r */
    public final synchronized void mo22019r(InterfaceC4271b interfaceC4271b) {
        try {
            AbstractC4205o.m19717f("showAd must be called on the main UI thread.");
            if (this.f20250s != null) {
                Activity activity = null;
                if (interfaceC4271b != null) {
                    Object m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
                    if (m19914Q instanceof Activity) {
                        activity = (Activity) m19914Q;
                    }
                }
                this.f20250s.m24975n(this.f20251t, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.fg0
    /* renamed from: t4 */
    public final void mo22020t4(dg0 dg0Var) {
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f20248q.m24006Y(dg0Var);
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final Bundle zzb() {
        AbstractC4205o.m19717f("getAdMetadata can only be called from the UI thread.");
        np1 np1Var = this.f20250s;
        if (np1Var != null) {
            return np1Var.m24969h();
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final synchronized zzdh zzc() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21097Q5)).booleanValue()) {
            return null;
        }
        np1 np1Var = this.f20250s;
        if (np1Var == null) {
            return null;
        }
        return np1Var.m27145c();
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final synchronized String zzd() {
        np1 np1Var = this.f20250s;
        if (np1Var != null && np1Var.m27145c() != null) {
            return np1Var.m27145c().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final void zze() {
        mo22011F(null);
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final synchronized void zzi(InterfaceC4271b interfaceC4271b) {
        Context context;
        AbstractC4205o.m19717f("pause must be called on the main UI thread.");
        if (this.f20250s != null) {
            if (interfaceC4271b == null) {
                context = null;
            } else {
                context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
            }
            this.f20250s.m27146d().m27182C0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final void zzj() {
        mo22014e4(null);
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final synchronized void zzq() {
        mo22019r(null);
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final boolean zzs() {
        AbstractC4205o.m19717f("isLoaded must be called on the main UI thread.");
        return m22141W4();
    }

    @Override // com.google.android.gms.internal.ads.fg0
    public final boolean zzt() {
        np1 np1Var = this.f20250s;
        if (np1Var != null && np1Var.m24974m()) {
            return true;
        }
        return false;
    }
}
