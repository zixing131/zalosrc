package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.C4808ns;
import com.google.android.gms.internal.ads.j81;
import com.google.android.gms.internal.ads.ls0;
import com.google.android.gms.internal.ads.m23;
import com.google.android.gms.internal.ads.nd0;
import com.google.android.gms.internal.ads.nr0;
import com.google.android.gms.internal.ads.ns0;
import com.google.android.gms.internal.ads.pf1;
import com.google.android.gms.internal.ads.ps0;
import com.google.android.gms.internal.ads.qc0;
import com.google.android.gms.internal.ads.v22;
import com.google.android.gms.internal.ads.x20;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.z20;
import com.google.android.gms.internal.ads.zq0;
import com.google.android.gms.internal.ads.zzcgv;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Collections;

/* loaded from: classes2.dex */
public class zzl extends nd0 implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zq0 zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        boolean z11;
        com.google.android.gms.ads.internal.zzj zzjVar;
        int i11;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z12 = true;
        boolean z13 = false;
        if (adOverlayInfoParcel != null && (zzjVar2 = adOverlayInfoParcel.zzo) != null && zzjVar2.zzb) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((this.zzk && !z11) || zze) {
            z12 = false;
        } else {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z13 = true;
            }
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21169Y0)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z12) {
                if (z13) {
                    i11 = 5894;
                } else {
                    i11 = 5380;
                }
            } else {
                i11 = 256;
            }
            decorView.setSystemUiVisibility(i11);
            return;
        }
        if (z12) {
            window.addFlags(1024);
            window.clearFlags(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
            if (z13) {
                window.getDecorView().setSystemUiVisibility(4098);
                return;
            }
            return;
        }
        window.addFlags(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        window.clearFlags(1024);
    }

    private static final void zzH(InterfaceC4271b interfaceC4271b, View view) {
        if (interfaceC4271b != null && view != null) {
            com.google.android.gms.ads.internal.zzt.zzA().mo27817c(interfaceC4271b, view);
        }
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzB(boolean z11) throws zzf {
        ns0 ns0Var;
        boolean z12;
        ps0 ps0Var;
        String str;
        com.google.android.gms.ads.internal.zza zzaVar;
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window != null) {
            zq0 zq0Var = this.zzc.zzd;
            com.google.android.gms.ads.internal.zzb zzbVar = null;
            if (zq0Var != null) {
                ns0Var = zq0Var.zzP();
            } else {
                ns0Var = null;
            }
            boolean z13 = false;
            if (ns0Var != null && ns0Var.mo23370h()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.zzm = false;
            if (z12) {
                int i11 = this.zzc.zzj;
                if (i11 == 6) {
                    if (this.zzb.getResources().getConfiguration().orientation == 1) {
                        z13 = true;
                    }
                    this.zzm = z13;
                } else if (i11 == 7) {
                    if (this.zzb.getResources().getConfiguration().orientation == 2) {
                        z13 = true;
                    }
                    this.zzm = z13;
                }
            }
            yk0.zze("Delay onShow to next orientation change: " + z13);
            zzy(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            yk0.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzk) {
                this.zzl.setBackgroundColor(-16777216);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if (z11) {
                try {
                    com.google.android.gms.ads.internal.zzt.zzz();
                    Activity activity = this.zzb;
                    zq0 zq0Var2 = this.zzc.zzd;
                    if (zq0Var2 != null) {
                        ps0Var = zq0Var2.mo22517p();
                    } else {
                        ps0Var = null;
                    }
                    zq0 zq0Var3 = this.zzc.zzd;
                    if (zq0Var3 != null) {
                        str = zq0Var3.mo26685P();
                    } else {
                        str = null;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    zzcgv zzcgvVar = adOverlayInfoParcel.zzm;
                    zq0 zq0Var4 = adOverlayInfoParcel.zzd;
                    if (zq0Var4 != null) {
                        zzaVar = zq0Var4.zzm();
                    } else {
                        zzaVar = null;
                    }
                    zq0 m24980a = nr0.m24980a(activity, ps0Var, str, true, z12, null, null, zzcgvVar, null, null, zzaVar, C4808ns.m24989a(), null, null);
                    this.zzd = m24980a;
                    ns0 zzP = m24980a.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    x20 x20Var = adOverlayInfoParcel2.zzp;
                    z20 z20Var = adOverlayInfoParcel2.zze;
                    zzz zzzVar = adOverlayInfoParcel2.zzi;
                    zq0 zq0Var5 = adOverlayInfoParcel2.zzd;
                    if (zq0Var5 != null) {
                        zzbVar = zq0Var5.zzP().zzd();
                    }
                    zzP.mo23372i0(null, x20Var, null, z20Var, zzzVar, true, null, zzbVar, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        public /* synthetic */ zzd() {
                        }

                        @Override // com.google.android.gms.internal.ads.ls0
                        public final void zza(boolean z14) {
                            zq0 zq0Var6 = zzl.this.zzd;
                            if (zq0Var6 != null) {
                                zq0Var6.zzZ();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str2 = adOverlayInfoParcel3.zzl;
                    if (str2 != null) {
                        this.zzd.loadUrl(str2);
                    } else {
                        String str3 = adOverlayInfoParcel3.zzh;
                        if (str3 != null) {
                            this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", "UTF-8", null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zq0 zq0Var6 = this.zzc.zzd;
                    if (zq0Var6 != null) {
                        zq0Var6.mo26691X(this);
                    }
                } catch (Exception e11) {
                    yk0.zzh("Error obtaining webview.", e11);
                    throw new zzf("Could not obtain webview for the overlay.", e11);
                }
            } else {
                zq0 zq0Var7 = this.zzc.zzd;
                this.zzd = zq0Var7;
                zq0Var7.mo26695e0(this.zzb);
            }
            this.zzd.mo26667A(this);
            zq0 zq0Var8 = this.zzc.zzd;
            if (zq0Var8 != null) {
                zzH(zq0Var8.mo26706t0(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.mo23737i());
                }
                if (this.zzk) {
                    this.zzd.mo26690W();
                }
                this.zzl.addView(this.zzd.mo23737i(), -1, -1);
            }
            if (!z11 && !this.zzm) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            if (adOverlayInfoParcel4.zzk != 5) {
                zzu(z12);
                if (this.zzd.mo26696f()) {
                    zzw(z12, true);
                    return;
                }
                return;
            }
            v22.m27131W4(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzC() {
        synchronized (this.zzo) {
            try {
                this.zzq = true;
                Runnable runnable = this.zzp;
                if (runnable != null) {
                    m23 m23Var = com.google.android.gms.ads.internal.util.zzs.zza;
                    m23Var.removeCallbacks(runnable);
                    m23Var.post(this.zzp);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (this.zzb.isFinishing() && !this.zzs) {
            this.zzs = true;
            zq0 zq0Var = this.zzd;
            if (zq0Var != null) {
                zq0Var.mo26693d0(this.zzn - 1);
                synchronized (this.zzo) {
                    try {
                        if (!this.zzq && this.zzd.mo26671D()) {
                            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21145V3)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                                zzoVar.zzbC();
                            }
                            zze zzeVar = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                                public /* synthetic */ zze() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzl.this.zzc();
                                }
                            };
                            this.zzp = zzeVar;
                            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(zzeVar, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21102R0)).longValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean mo26669B = this.zzd.mo26669B();
        if (!mo26669B) {
            this.zzd.mo23552V("onbackblocked", Collections.emptyMap());
        }
        return mo26669B;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbJ() {
        this.zzn = 2;
        this.zzb.finish();
    }

    public final void zzc() {
        zq0 zq0Var;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zq0 zq0Var2 = this.zzd;
        if (zq0Var2 != null) {
            this.zzl.removeView(zq0Var2.mo23737i());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.mo26695e0(zzhVar.zzd);
                this.zzd.mo26705r0(false);
                ViewGroup viewGroup = this.zze.zzc;
                View mo23737i = this.zzd.mo23737i();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(mo23737i, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.mo26695e0(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zq0Var = adOverlayInfoParcel2.zzd) != null) {
            zzH(zq0Var.mo26706t0(), this.zzc.zzd.mo23737i());
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzg(int i11, int i12, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzj(InterfaceC4271b interfaceC4271b) {
        zzG((Configuration) BinderC4273d.m19914Q(interfaceC4271b));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[Catch: zzf -> 0x0031, TryCatch #0 {zzf -> 0x0031, blocks: (B:8:0x0017, B:10:0x0025, B:12:0x002e, B:13:0x0034, B:15:0x003c, B:16:0x004a, B:18:0x0051, B:21:0x005e, B:23:0x0062, B:25:0x0067, B:27:0x0075, B:29:0x0079, B:31:0x007f, B:32:0x0082, B:34:0x0088, B:35:0x008b, B:37:0x0091, B:39:0x0095, B:40:0x0098, B:42:0x009e, B:43:0x00a1, B:50:0x00d0, B:53:0x00d4, B:54:0x00db, B:55:0x00dc, B:57:0x00e0, B:59:0x00ed, B:61:0x0058, B:63:0x005c, B:64:0x0071, B:65:0x00f1, B:66:0x00f8), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed A[Catch: zzf -> 0x0031, TryCatch #0 {zzf -> 0x0031, blocks: (B:8:0x0017, B:10:0x0025, B:12:0x002e, B:13:0x0034, B:15:0x003c, B:16:0x004a, B:18:0x0051, B:21:0x005e, B:23:0x0062, B:25:0x0067, B:27:0x0075, B:29:0x0079, B:31:0x007f, B:32:0x0082, B:34:0x0088, B:35:0x008b, B:37:0x0091, B:39:0x0095, B:40:0x0098, B:42:0x009e, B:43:0x00a1, B:50:0x00d0, B:53:0x00d4, B:54:0x00db, B:55:0x00dc, B:57:0x00e0, B:59:0x00ed, B:61:0x0058, B:63:0x005c, B:64:0x0071, B:65:0x00f1, B:66:0x00f8), top: B:7:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.od0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzk(Bundle bundle) {
        boolean z11;
        int i11;
        this.zzb.requestWindowFeature(1);
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzj = z11;
        try {
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = zza2;
            if (zza2 != null) {
                if (zza2.zzm.f32032r > 7500000) {
                    this.zzn = 4;
                }
                if (this.zzb.getIntent() != null) {
                    this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
                if (zzjVar != null) {
                    boolean z12 = zzjVar.zza;
                    this.zzk = z12;
                    if (z12) {
                        if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                            new zzk(this, null).zzb();
                        }
                    }
                    if (bundle == null) {
                        if (this.zzu) {
                            j81 j81Var = this.zzc.zzx;
                            if (j81Var != null) {
                                j81Var.zze();
                            }
                            zzo zzoVar = this.zzc.zzc;
                            if (zzoVar != null) {
                                zzoVar.zzb();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                        if (adOverlayInfoParcel2.zzk != 1) {
                            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                            if (zzaVar != null) {
                                zzaVar.onAdClicked();
                            }
                            pf1 pf1Var = this.zzc.zzy;
                            if (pf1Var != null) {
                                pf1Var.zzq();
                            }
                        }
                    }
                    Activity activity = this.zzb;
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    zzg zzgVar = new zzg(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.f32030p, adOverlayInfoParcel3.zzw);
                    this.zzl = zzgVar;
                    zzgVar.setId(1000);
                    com.google.android.gms.ads.internal.zzt.zzq().zzj(this.zzb);
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                    i11 = adOverlayInfoParcel4.zzk;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    zzB(false);
                                    return;
                                }
                                throw new zzf("Could not determine ad overlay type.");
                            }
                            zzB(true);
                            return;
                        }
                        this.zze = new zzh(adOverlayInfoParcel4.zzd);
                        zzB(false);
                        return;
                    }
                    zzB(false);
                    return;
                }
                if (adOverlayInfoParcel.zzk == 5) {
                    this.zzk = true;
                    if (adOverlayInfoParcel.zzk != 5) {
                        new zzk(this, null).zzb();
                    }
                    if (bundle == null) {
                    }
                    Activity activity2 = this.zzb;
                    AdOverlayInfoParcel adOverlayInfoParcel32 = this.zzc;
                    zzg zzgVar2 = new zzg(activity2, adOverlayInfoParcel32.zzn, adOverlayInfoParcel32.zzm.f32030p, adOverlayInfoParcel32.zzw);
                    this.zzl = zzgVar2;
                    zzgVar2.setId(1000);
                    com.google.android.gms.ads.internal.zzt.zzq().zzj(this.zzb);
                    AdOverlayInfoParcel adOverlayInfoParcel42 = this.zzc;
                    i11 = adOverlayInfoParcel42.zzk;
                    if (i11 != 1) {
                    }
                } else {
                    this.zzk = false;
                    if (bundle == null) {
                    }
                    Activity activity22 = this.zzb;
                    AdOverlayInfoParcel adOverlayInfoParcel322 = this.zzc;
                    zzg zzgVar22 = new zzg(activity22, adOverlayInfoParcel322.zzn, adOverlayInfoParcel322.zzm.f32030p, adOverlayInfoParcel322.zzw);
                    this.zzl = zzgVar22;
                    zzgVar22.setId(1000);
                    com.google.android.gms.ads.internal.zzt.zzq().zzj(this.zzb);
                    AdOverlayInfoParcel adOverlayInfoParcel422 = this.zzc;
                    i11 = adOverlayInfoParcel422.zzk;
                    if (i11 != 1) {
                    }
                }
            } else {
                throw new zzf("Could not get info for ad overlay.");
            }
        } catch (zzf e11) {
            yk0.zzj(e11.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzl() {
        zq0 zq0Var = this.zzd;
        if (zq0Var != null) {
            try {
                this.zzl.removeView(zq0Var.mo23737i());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21163X3)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbK();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21163X3)).booleanValue()) {
            zq0 zq0Var = this.zzd;
            if (zq0Var != null && !zq0Var.mo26709v()) {
                this.zzd.onResume();
            } else {
                yk0.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzr() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21163X3)).booleanValue()) {
            zq0 zq0Var = this.zzd;
            if (zq0Var != null && !zq0Var.mo26709v()) {
                this.zzd.onResume();
            } else {
                yk0.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzs() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21163X3)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zze();
        }
    }

    public final void zzu(boolean z11) {
        boolean z12;
        int i11;
        int i12;
        int intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21181Z3)).intValue();
        int i13 = 0;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21132U0)).booleanValue() || z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        if (true != z12) {
            i11 = 0;
        } else {
            i11 = intValue;
        }
        zzqVar.zza = i11;
        if (true != z12) {
            i13 = intValue;
        }
        zzqVar.zzb = i13;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z12) {
            i12 = 9;
        } else {
            i12 = 11;
        }
        layoutParams.addRule(i12);
        zzw(z11, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z15 = true;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21112S0)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21122T0)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z11 && z12 && z13 && !z14) {
            new qc0(this.zzd, "useCustomClose").m25683c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z14 && (!z12 || z13)) {
                z15 = false;
            }
            zzrVar.zzb(z15);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i11) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21202b5)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21212c5)).intValue()) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21222d5)).intValue()) {
                    if (i12 <= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21232e5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i11);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzo().m22944s(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z11) {
        if (z11) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }
}
