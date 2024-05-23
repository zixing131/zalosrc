package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class nr0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.ads.zq0] */
    /* renamed from: a */
    public static final zq0 m24980a(Context context, ps0 ps0Var, String str, boolean z11, boolean z12, C4830od c4830od, C4592hy c4592hy, zzcgv zzcgvVar, C5110vx c5110vx, zzl zzlVar, zza zzaVar, C4808ns c4808ns, iq2 iq2Var, lq2 lq2Var) {
        AbstractC4554gx.m22622c(context);
        try {
            jr0 jr0Var = new a63(context, ps0Var, str, z11, z12, c4830od, c4592hy, zzcgvVar, null, zzlVar, zzaVar, c4808ns, iq2Var, lq2Var) { // from class: com.google.android.gms.internal.ads.jr0

                /* renamed from: A */
                public final /* synthetic */ iq2 f22955A;

                /* renamed from: B */
                public final /* synthetic */ lq2 f22956B;

                /* renamed from: p */
                public final /* synthetic */ Context f22957p;

                /* renamed from: q */
                public final /* synthetic */ ps0 f22958q;

                /* renamed from: r */
                public final /* synthetic */ String f22959r;

                /* renamed from: s */
                public final /* synthetic */ boolean f22960s;

                /* renamed from: t */
                public final /* synthetic */ boolean f22961t;

                /* renamed from: u */
                public final /* synthetic */ C4830od f22962u;

                /* renamed from: v */
                public final /* synthetic */ C4592hy f22963v;

                /* renamed from: w */
                public final /* synthetic */ zzcgv f22964w;

                /* renamed from: x */
                public final /* synthetic */ zzl f22965x;

                /* renamed from: y */
                public final /* synthetic */ zza f22966y;

                /* renamed from: z */
                public final /* synthetic */ C4808ns f22967z;

                public /* synthetic */ jr0(Context context2, ps0 ps0Var2, String str2, boolean z112, boolean z122, C4830od c4830od2, C4592hy c4592hy2, zzcgv zzcgvVar2, C5110vx c5110vx2, zzl zzlVar2, zza zzaVar2, C4808ns c4808ns2, iq2 iq2Var2, lq2 lq2Var2) {
                    this.f22957p = context2;
                    this.f22958q = ps0Var2;
                    this.f22959r = str2;
                    this.f22960s = z112;
                    this.f22961t = z122;
                    this.f22962u = c4830od2;
                    this.f22963v = c4592hy2;
                    this.f22964w = zzcgvVar2;
                    this.f22965x = zzlVar2;
                    this.f22966y = zzaVar2;
                    this.f22967z = c4808ns2;
                    this.f22955A = iq2Var2;
                    this.f22956B = lq2Var2;
                }

                @Override // com.google.android.gms.internal.ads.a63
                public final Object zza() {
                    Context context2 = this.f22957p;
                    ps0 ps0Var2 = this.f22958q;
                    String str2 = this.f22959r;
                    boolean z13 = this.f22960s;
                    boolean z14 = this.f22961t;
                    C4830od c4830od2 = this.f22962u;
                    C4592hy c4592hy2 = this.f22963v;
                    zzcgv zzcgvVar2 = this.f22964w;
                    zzl zzlVar2 = this.f22965x;
                    zza zzaVar2 = this.f22966y;
                    C4808ns c4808ns2 = this.f22967z;
                    iq2 iq2Var2 = this.f22955A;
                    lq2 lq2Var2 = this.f22956B;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i11 = tr0.f28475p0;
                        zzcne zzcneVar = new zzcne(new tr0(new os0(context2), ps0Var2, str2, z13, z14, c4830od2, c4592hy2, zzcgvVar2, null, zzlVar2, zzaVar2, c4808ns2, iq2Var2, lq2Var2));
                        zzcneVar.setWebViewClient(zzt.zzq().zzd(zzcneVar, c4808ns2, z14));
                        zzcneVar.setWebChromeClient(new yq0(zzcneVar));
                        return zzcneVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return jr0Var.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            throw new zzcna("Webview initialization failed.", th2);
        }
    }
}
