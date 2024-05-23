package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class h80 {

    /* renamed from: b */
    private final Context f21573b;

    /* renamed from: c */
    private final String f21574c;

    /* renamed from: d */
    private final zzcgv f21575d;

    /* renamed from: e */
    private final xw2 f21576e;

    /* renamed from: f */
    private final zzbb f21577f;

    /* renamed from: g */
    private final zzbb f21578g;

    /* renamed from: h */
    private g80 f21579h;

    /* renamed from: a */
    private final Object f21572a = new Object();

    /* renamed from: i */
    private int f21580i = 1;

    public h80(Context context, zzcgv zzcgvVar, String str, zzbb zzbbVar, zzbb zzbbVar2, xw2 xw2Var) {
        this.f21574c = str;
        this.f21573b = context.getApplicationContext();
        this.f21575d = zzcgvVar;
        this.f21576e = xw2Var;
        this.f21577f = zzbbVar;
        this.f21578g = zzbbVar2;
    }

    /* renamed from: b */
    public final b80 m22725b(C4830od c4830od) {
        synchronized (this.f21572a) {
            try {
                synchronized (this.f21572a) {
                    try {
                        g80 g80Var = this.f21579h;
                        if (g80Var != null && this.f21580i == 0) {
                            g80Var.m27653e(new tl0() { // from class: com.google.android.gms.internal.ads.m70
                                public /* synthetic */ m70() {
                                }

                                @Override // com.google.android.gms.internal.ads.tl0
                                public final void zza(Object obj) {
                                    h80.this.m22729k((b70) obj);
                                }
                            }, n70.f25071a);
                        }
                    } finally {
                    }
                }
                g80 g80Var2 = this.f21579h;
                if (g80Var2 != null && g80Var2.m27650a() != -1) {
                    int i11 = this.f21580i;
                    if (i11 == 0) {
                        return this.f21579h.m22293f();
                    }
                    if (i11 == 1) {
                        this.f21580i = 2;
                        m22726d(null);
                        return this.f21579h.m22293f();
                    }
                    return this.f21579h.m22293f();
                }
                this.f21580i = 2;
                g80 m22726d = m22726d(null);
                this.f21579h = m22726d;
                return m22726d.m22293f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final g80 m22726d(C4830od c4830od) {
        kw2 m23764a = jw2.m23764a(this.f21573b, 6);
        m23764a.zzf();
        g80 g80Var = new g80(this.f21578g);
        kl0.f23367e.execute(new Runnable(null, g80Var) { // from class: com.google.android.gms.internal.ads.o70

            /* renamed from: q */
            public final /* synthetic */ g80 f25463q;

            public /* synthetic */ o70(C4830od c4830od2, g80 g80Var2) {
                this.f25463q = g80Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                h80.this.m22728j(null, this.f25463q);
            }
        });
        g80Var2.m27653e(new w70(this, g80Var2, m23764a), new x70(this, g80Var2, m23764a));
        return g80Var2;
    }

    /* renamed from: i */
    public final /* synthetic */ void m22727i(g80 g80Var, b70 b70Var) {
        synchronized (this.f21572a) {
            try {
                if (g80Var.m27650a() != -1 && g80Var.m27650a() != 1) {
                    g80Var.m27651c();
                    kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.r70
                        public /* synthetic */ r70() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            b70.this.zzc();
                        }
                    });
                    zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
                }
            } finally {
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void m22728j(C4830od c4830od, g80 g80Var) {
        try {
            j70 j70Var = new j70(this.f21573b, this.f21575d, null, null);
            j70Var.mo20421D0(new q70(this, g80Var, j70Var));
            j70Var.mo23138l0("/jsLoaded", new s70(this, g80Var, j70Var));
            zzca zzcaVar = new zzca();
            t70 t70Var = new t70(this, null, j70Var, zzcaVar);
            zzcaVar.zzb(t70Var);
            j70Var.mo23138l0("/requestReload", t70Var);
            if (this.f21574c.endsWith(".js")) {
                j70Var.zzh(this.f21574c);
            } else if (this.f21574c.startsWith("<html>")) {
                j70Var.mo20423j(this.f21574c);
            } else {
                j70Var.mo20422Z(this.f21574c);
            }
            zzs.zza.postDelayed(new v70(this, g80Var, j70Var), 60000L);
        } catch (Throwable th2) {
            yk0.zzh("Error creating webview.", th2);
            zzt.zzo().m22945t(th2, "SdkJavascriptFactory.loadJavascriptEngine");
            g80Var.m27651c();
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void m22729k(b70 b70Var) {
        if (b70Var.zzi()) {
            this.f21580i = 1;
        }
    }
}
