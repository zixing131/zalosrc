package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzff;
import java.util.HashMap;
import java.util.Map;
import p229i5.AbstractC20286g;

/* loaded from: classes2.dex */
public final class wr0 extends zzdj {

    /* renamed from: A */
    private boolean f30070A;

    /* renamed from: B */
    private boolean f30071B;

    /* renamed from: C */
    private t10 f30072C;

    /* renamed from: p */
    private final fn0 f30073p;

    /* renamed from: r */
    private final boolean f30075r;

    /* renamed from: s */
    private final boolean f30076s;

    /* renamed from: t */
    private int f30077t;

    /* renamed from: u */
    private zzdn f30078u;

    /* renamed from: v */
    private boolean f30079v;

    /* renamed from: x */
    private float f30081x;

    /* renamed from: y */
    private float f30082y;

    /* renamed from: z */
    private float f30083z;

    /* renamed from: q */
    private final Object f30074q = new Object();

    /* renamed from: w */
    private boolean f30080w = true;

    public wr0(fn0 fn0Var, float f11, boolean z11, boolean z12) {
        this.f30073p = fn0Var;
        this.f30081x = f11;
        this.f30075r = z11;
        this.f30076s = z12;
    }

    /* renamed from: Z4 */
    private final void m27695Z4(int i11, int i12, boolean z11, boolean z12) {
        kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vr0

            /* renamed from: q */
            public final /* synthetic */ int f29455q;

            /* renamed from: r */
            public final /* synthetic */ int f29456r;

            /* renamed from: s */
            public final /* synthetic */ boolean f29457s;

            /* renamed from: t */
            public final /* synthetic */ boolean f29458t;

            public /* synthetic */ vr0(int i112, int i122, boolean z112, boolean z122) {
                r2 = i112;
                r3 = i122;
                r4 = z112;
                r5 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wr0.this.m27699Q(r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: a5 */
    private final void m27696a5(String str, Map map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ur0

            /* renamed from: q */
            public final /* synthetic */ Map f29033q;

            public /* synthetic */ ur0(Map hashMap2) {
                r2 = hashMap2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wr0.this.m27697I3(r2);
            }
        });
    }

    /* renamed from: I3 */
    public final /* synthetic */ void m27697I3(Map map) {
        this.f30073p.mo23552V("pubVideoCmd", map);
    }

    /* renamed from: N */
    public final void m27698N(float f11, float f12, int i11, boolean z11, float f13) {
        boolean z12;
        boolean z13;
        int i12;
        synchronized (this.f30074q) {
            try {
                z12 = true;
                if (f12 == this.f30081x && f13 == this.f30083z) {
                    z12 = false;
                }
                this.f30081x = f12;
                this.f30082y = f11;
                z13 = this.f30080w;
                this.f30080w = z11;
                i12 = this.f30077t;
                this.f30077t = i11;
                float f14 = this.f30083z;
                this.f30083z = f13;
                if (Math.abs(f13 - f14) > 1.0E-4f) {
                    this.f30073p.mo23737i().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            try {
                t10 t10Var = this.f30072C;
                if (t10Var != null) {
                    t10Var.zze();
                }
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
        m27695Z4(i12, i11, z13, z11);
    }

    /* renamed from: Q */
    public final /* synthetic */ void m27699Q(int i11, int i12, boolean z11, boolean z12) {
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        zzdn zzdnVar;
        zzdn zzdnVar2;
        zzdn zzdnVar3;
        synchronized (this.f30074q) {
            try {
                boolean z17 = this.f30079v;
                boolean z18 = false;
                if (!z17 && i12 == 1) {
                    i13 = 1;
                    z13 = true;
                } else {
                    i13 = i12;
                    z13 = false;
                }
                if (i11 != i12 && i13 == 1) {
                    i13 = 1;
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i11 != i12 && i13 == 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i11 != i12 && i13 == 3) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z17 || z13) {
                    z18 = true;
                }
                this.f30079v = z18;
                if (z13) {
                    try {
                        zzdn zzdnVar4 = this.f30078u;
                        if (zzdnVar4 != null) {
                            zzdnVar4.zzi();
                        }
                    } catch (RemoteException e11) {
                        yk0.zzl("#007 Could not call remote method.", e11);
                    }
                }
                if (z14 && (zzdnVar3 = this.f30078u) != null) {
                    zzdnVar3.zzh();
                }
                if (z15 && (zzdnVar2 = this.f30078u) != null) {
                    zzdnVar2.zzg();
                }
                if (z16) {
                    zzdn zzdnVar5 = this.f30078u;
                    if (zzdnVar5 != null) {
                        zzdnVar5.zze();
                    }
                    this.f30073p.mo22096k();
                }
                if (z11 != z12 && (zzdnVar = this.f30078u) != null) {
                    zzdnVar.zzf(z12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W4 */
    public final void m27700W4(zzff zzffVar) {
        String str;
        String str2;
        String str3;
        boolean z11 = zzffVar.zza;
        boolean z12 = zzffVar.zzb;
        boolean z13 = zzffVar.zzc;
        synchronized (this.f30074q) {
            this.f30070A = z12;
            this.f30071B = z13;
        }
        if (true != z11) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z12) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z13) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        m27696a5("initialState", AbstractC20286g.m105919d("muteStart", str4, "customControlsRequested", str5, "clickToExpandRequested", str3));
    }

    /* renamed from: X4 */
    public final void m27701X4(float f11) {
        synchronized (this.f30074q) {
            this.f30082y = f11;
        }
    }

    /* renamed from: Y4 */
    public final void m27702Y4(t10 t10Var) {
        synchronized (this.f30074q) {
            this.f30072C = t10Var;
        }
    }

    /* renamed from: a */
    public final void m27703a() {
        boolean z11;
        int i11;
        synchronized (this.f30074q) {
            z11 = this.f30080w;
            i11 = this.f30077t;
            this.f30077t = 3;
        }
        m27695Z4(i11, 3, z11, z11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        float f11;
        synchronized (this.f30074q) {
            f11 = this.f30083z;
        }
        return f11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        float f11;
        synchronized (this.f30074q) {
            f11 = this.f30082y;
        }
        return f11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        float f11;
        synchronized (this.f30074q) {
            f11 = this.f30081x;
        }
        return f11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        int i11;
        synchronized (this.f30074q) {
            i11 = this.f30077t;
        }
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() {
        zzdn zzdnVar;
        synchronized (this.f30074q) {
            zzdnVar = this.f30078u;
        }
        return zzdnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z11) {
        String str;
        if (true != z11) {
            str = "unmute";
        } else {
            str = "mute";
        }
        m27696a5(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        m27696a5("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        m27696a5("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdnVar) {
        synchronized (this.f30074q) {
            this.f30078u = zzdnVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        m27696a5("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        boolean z11;
        boolean zzp = zzp();
        synchronized (this.f30074q) {
            z11 = false;
            if (!zzp) {
                try {
                    if (this.f30071B && this.f30076s) {
                        z11 = true;
                    }
                } finally {
                }
            }
        }
        return z11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        boolean z11;
        synchronized (this.f30074q) {
            try {
                z11 = false;
                if (this.f30075r && this.f30070A) {
                    z11 = true;
                }
            } finally {
            }
        }
        return z11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        boolean z11;
        synchronized (this.f30074q) {
            z11 = this.f30080w;
        }
        return z11;
    }
}
