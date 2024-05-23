package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class hv1 {

    /* renamed from: f */
    private final Context f21916f;

    /* renamed from: g */
    private final WeakReference f21917g;

    /* renamed from: h */
    private final wq1 f21918h;

    /* renamed from: i */
    private final Executor f21919i;

    /* renamed from: j */
    private final Executor f21920j;

    /* renamed from: k */
    private final ScheduledExecutorService f21921k;

    /* renamed from: l */
    private final mt1 f21922l;

    /* renamed from: m */
    private final zzcgv f21923m;

    /* renamed from: o */
    private final te1 f21925o;

    /* renamed from: p */
    private final xw2 f21926p;

    /* renamed from: a */
    private boolean f21911a = false;

    /* renamed from: b */
    private boolean f21912b = false;

    /* renamed from: c */
    private boolean f21913c = false;

    /* renamed from: e */
    private final pl0 f21915e = new pl0();

    /* renamed from: n */
    private final Map f21924n = new ConcurrentHashMap();

    /* renamed from: q */
    private boolean f21927q = true;

    /* renamed from: d */
    private final long f21914d = zzt.zzB().mo105914b();

    public hv1(Executor executor, Context context, WeakReference weakReference, Executor executor2, wq1 wq1Var, ScheduledExecutorService scheduledExecutorService, mt1 mt1Var, zzcgv zzcgvVar, te1 te1Var, xw2 xw2Var) {
        this.f21918h = wq1Var;
        this.f21916f = context;
        this.f21917g = weakReference;
        this.f21919i = executor2;
        this.f21921k = scheduledExecutorService;
        this.f21920j = executor;
        this.f21922l = mt1Var;
        this.f21923m = zzcgvVar;
        this.f21925o = te1Var;
        this.f21926p = xw2Var;
        m23042v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.yu1.<init>(com.google.android.gms.internal.ads.hv1, java.lang.Object, com.google.android.gms.internal.ads.pl0, java.lang.String, long, com.google.android.gms.internal.ads.kw2):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: j */
    public static /* bridge */ /* synthetic */ void m23039j(com.google.android.gms.internal.ads.hv1 r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hv1.m23039j(com.google.android.gms.internal.ads.hv1, java.lang.String):void");
    }

    /* renamed from: u */
    private final synchronized tc3 m23041u() {
        String m20555c = zzt.zzo().m22936h().zzh().m20555c();
        if (!TextUtils.isEmpty(m20555c)) {
            return kc3.m23877i(m20555c);
        }
        pl0 pl0Var = new pl0();
        zzt.zzo().m22936h().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.dv1

            /* renamed from: q */
            public final /* synthetic */ pl0 f19422q;

            public /* synthetic */ dv1(pl0 pl0Var2) {
                r2 = pl0Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hv1.this.m23048o(r2);
            }
        });
        return pl0Var2;
    }

    /* renamed from: v */
    public final void m23042v(String str, boolean z11, String str2, int i11) {
        this.f21924n.put(str, new zzbrq(str, z11, i11, str2));
    }

    /* renamed from: f */
    public final /* synthetic */ Object m23043f(kw2 kw2Var) {
        this.f21915e.zzd(Boolean.TRUE);
        xw2 xw2Var = this.f21926p;
        kw2Var.mo23067q(true);
        xw2Var.m28055b(kw2Var.zzj());
        return null;
    }

    /* renamed from: g */
    public final List m23044g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f21924n.keySet()) {
            zzbrq zzbrqVar = (zzbrq) this.f21924n.get(str);
            arrayList.add(new zzbrq(str, zzbrqVar.f31916q, zzbrqVar.f31917r, zzbrqVar.f31918s));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m23045l() {
        this.f21927q = false;
    }

    /* renamed from: m */
    public final /* synthetic */ void m23046m() {
        synchronized (this) {
            try {
                if (this.f21913c) {
                    return;
                }
                m23042v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzB().mo105914b() - this.f21914d));
                this.f21922l.m24710b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f21925o.mo26464c("com.google.android.gms.ads.MobileAds", "timeout");
                this.f21915e.zze(new Exception());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void m23047n(yr2 yr2Var, f60 f60Var, List list, String str) {
        try {
            try {
                Context context = (Context) this.f21917g.get();
                if (context == null) {
                    context = this.f21916f;
                }
                yr2Var.m28315l(context, f60Var, list);
            } catch (zzfek unused) {
                f60Var.mo21271c("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void m23048o(pl0 pl0Var) {
        this.f21919i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wu1

            /* renamed from: q */
            public final /* synthetic */ pl0 f30116q;

            public /* synthetic */ wu1(pl0 pl0Var2) {
                r2 = pl0Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                pl0 pl0Var2 = r2;
                String m20555c = zzt.zzo().m22936h().zzh().m20555c();
                if (!TextUtils.isEmpty(m20555c)) {
                    pl0Var2.zzd(m20555c);
                } else {
                    pl0Var2.zze(new Exception());
                }
            }
        });
    }

    /* renamed from: p */
    public final /* synthetic */ void m23049p() {
        this.f21922l.m24713e();
        this.f21925o.zze();
        this.f21912b = true;
    }

    /* renamed from: q */
    public final /* synthetic */ void m23050q(Object obj, pl0 pl0Var, String str, long j11, kw2 kw2Var) {
        synchronized (obj) {
            try {
                if (!pl0Var.isDone()) {
                    m23042v(str, false, "Timeout.", (int) (zzt.zzB().mo105914b() - j11));
                    this.f21922l.m24710b(str, "timeout");
                    this.f21925o.mo26464c(str, "timeout");
                    xw2 xw2Var = this.f21926p;
                    kw2Var.mo23067q(false);
                    xw2Var.m28055b(kw2Var.zzj());
                    pl0Var.zzd(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public final void m23051r() {
        if (!((Boolean) AbstractC4445dz.f19446a.m24091e()).booleanValue()) {
            if (this.f21923m.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20933A1)).intValue() && this.f21927q) {
                if (this.f21911a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f21911a) {
                            return;
                        }
                        this.f21922l.m24714f();
                        this.f21925o.zzf();
                        this.f21915e.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.xu1
                            public /* synthetic */ xu1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                hv1.this.m23049p();
                            }
                        }, this.f21919i);
                        this.f21911a = true;
                        tc3 m23041u = m23041u();
                        this.f21921k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.av1
                            public /* synthetic */ av1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                hv1.this.m23046m();
                            }
                        }, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f20953C1)).longValue(), TimeUnit.SECONDS);
                        kc3.m23886r(m23041u, new fv1(this), this.f21919i);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (!this.f21911a) {
            m23042v("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f21915e.zzd(Boolean.FALSE);
            this.f21911a = true;
            this.f21912b = true;
        }
    }

    /* renamed from: s */
    public final void m23052s(i60 i60Var) {
        this.f21915e.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.bv1

            /* renamed from: q */
            public final /* synthetic */ i60 f17992q;

            public /* synthetic */ bv1(i60 i60Var2) {
                r2 = i60Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                hv1 hv1Var = hv1.this;
                try {
                    r2.zzb(hv1Var.m23044g());
                } catch (RemoteException e11) {
                    yk0.zzh("", e11);
                }
            }
        }, this.f21920j);
    }

    /* renamed from: t */
    public final boolean m23053t() {
        return this.f21912b;
    }
}
