package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbc;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.m23;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class gn0 {

    /* renamed from: a */
    private final Context f20750a;

    /* renamed from: b */
    private final String f20751b;

    /* renamed from: c */
    private final zzcgv f20752c;

    /* renamed from: d */
    private final C4999sx f20753d;

    /* renamed from: e */
    private final C5110vx f20754e;

    /* renamed from: f */
    private final zzbf f20755f;

    /* renamed from: g */
    private final long[] f20756g;

    /* renamed from: h */
    private final String[] f20757h;

    /* renamed from: i */
    private boolean f20758i;

    /* renamed from: j */
    private boolean f20759j;

    /* renamed from: k */
    private boolean f20760k;

    /* renamed from: l */
    private boolean f20761l;

    /* renamed from: m */
    private boolean f20762m;

    /* renamed from: n */
    private zzcie f20763n;

    /* renamed from: o */
    private boolean f20764o;

    /* renamed from: p */
    private boolean f20765p;

    /* renamed from: q */
    private long f20766q;

    public gn0(Context context, zzcgv zzcgvVar, String str, C5110vx c5110vx, C4999sx c4999sx) {
        zzbd zzbdVar = new zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f20755f = zzbdVar.zzb();
        this.f20758i = false;
        this.f20759j = false;
        this.f20760k = false;
        this.f20761l = false;
        this.f20766q = -1L;
        this.f20750a = context;
        this.f20752c = zzcgvVar;
        this.f20751b = str;
        this.f20754e = c5110vx;
        this.f20753d = c4999sx;
        String str2 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21426y);
        if (str2 == null) {
            this.f20757h = new String[0];
            this.f20756g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f20757h = new String[length];
        this.f20756g = new long[length];
        for (int i11 = 0; i11 < split.length; i11++) {
            try {
                this.f20756g[i11] = Long.parseLong(split[i11]);
            } catch (NumberFormatException e11) {
                yk0.zzk("Unable to parse frame hash target time number.", e11);
                this.f20756g[i11] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void m22478a(zzcie zzcieVar) {
        AbstractC4813nx.m25029a(this.f20754e, this.f20753d, "vpc2");
        this.f20758i = true;
        this.f20754e.m27426d("vpn", zzcieVar.mo28739q());
        this.f20763n = zzcieVar;
    }

    /* renamed from: b */
    public final void m22479b() {
        if (this.f20758i && !this.f20759j) {
            AbstractC4813nx.m25029a(this.f20754e, this.f20753d, "vfr2");
            this.f20759j = true;
        }
    }

    /* renamed from: c */
    public final void m22480c() {
        this.f20762m = true;
        if (this.f20759j && !this.f20760k) {
            AbstractC4813nx.m25029a(this.f20754e, this.f20753d, "vfp2");
            this.f20760k = true;
        }
    }

    /* renamed from: d */
    public final void m22481d() {
        if (((Boolean) AbstractC4815nz.f25377a.m24091e()).booleanValue() && !this.f20764o) {
            Bundle bundle = new Bundle();
            bundle.putString(ZinstantMetaConstant.IMPRESSION_META_TYPE, "native-player-metrics");
            bundle.putString("request", this.f20751b);
            bundle.putString("player", this.f20763n.mo28739q());
            for (zzbc zzbcVar : this.f20755f.zza()) {
                bundle.putString("fps_c_".concat(String.valueOf(zzbcVar.zza)), Integer.toString(zzbcVar.zze));
                bundle.putString("fps_p_".concat(String.valueOf(zzbcVar.zza)), Double.toString(zzbcVar.zzd));
            }
            int i11 = 0;
            while (true) {
                long[] jArr = this.f20756g;
                if (i11 < jArr.length) {
                    String str = this.f20757h[i11];
                    if (str != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i11]).toString()), str);
                    }
                    i11++;
                } else {
                    zzt.zzp();
                    Context context = this.f20750a;
                    String str2 = this.f20752c.f32030p;
                    zzt.zzp();
                    bundle.putString("device", zzs.zzq());
                    bundle.putString("eids", TextUtils.join(",", AbstractC4554gx.m22620a()));
                    zzaw.zzb();
                    rk0.m26114x(context, str2, "gmob-apps", bundle, true, new qk0() { // from class: com.google.android.gms.ads.internal.util.zzk
                        public final /* synthetic */ Context zza;
                        public final /* synthetic */ String zzb;

                        public /* synthetic */ zzk(Context context2, String str22) {
                            r1 = context2;
                            r2 = str22;
                        }

                        @Override // com.google.android.gms.internal.ads.qk0
                        public final boolean zza(String str3) {
                            Context context2 = r1;
                            String str4 = r2;
                            m23 m23Var = zzs.zza;
                            com.google.android.gms.ads.internal.zzt.zzp();
                            zzs.zzH(context2, str4, str3);
                            return true;
                        }
                    });
                    this.f20764o = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void m22482e() {
        this.f20762m = false;
    }

    /* renamed from: f */
    public final void m22483f(zzcie zzcieVar) {
        long j11;
        if (this.f20760k && !this.f20761l) {
            if (zze.zzc() && !this.f20761l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            AbstractC4813nx.m25029a(this.f20754e, this.f20753d, "vff2");
            this.f20761l = true;
        }
        long mo105915c = zzt.zzB().mo105915c();
        if (this.f20762m && this.f20765p && this.f20766q != -1) {
            this.f20755f.zzb(TimeUnit.SECONDS.toNanos(1L) / (mo105915c - this.f20766q));
        }
        this.f20765p = this.f20762m;
        this.f20766q = mo105915c;
        long longValue = ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21436z)).longValue();
        long mo28731h = zzcieVar.mo28731h();
        int i11 = 0;
        while (true) {
            String[] strArr = this.f20757h;
            if (i11 < strArr.length) {
                if (strArr[i11] == null && longValue > Math.abs(mo28731h - this.f20756g[i11])) {
                    String[] strArr2 = this.f20757h;
                    int i12 = 8;
                    Bitmap bitmap = zzcieVar.getBitmap(8, 8);
                    long j12 = 63;
                    long j13 = 0;
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = 0;
                        while (i14 < i12) {
                            int pixel = bitmap.getPixel(i14, i13);
                            if (Color.blue(pixel) + Color.red(pixel) + Color.green(pixel) > 128) {
                                j11 = 1;
                            } else {
                                j11 = 0;
                            }
                            j13 |= j11 << ((int) j12);
                            i14++;
                            j12--;
                            i12 = 8;
                        }
                        i13++;
                        i12 = 8;
                    }
                    strArr2[i11] = String.format("%016X", Long.valueOf(j13));
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
