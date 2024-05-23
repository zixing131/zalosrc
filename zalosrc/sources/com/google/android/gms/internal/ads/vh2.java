package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class vh2 {

    /* renamed from: a */
    private final Context f29315a;

    /* renamed from: b */
    private final Set f29316b;

    /* renamed from: c */
    private final Executor f29317c;

    /* renamed from: d */
    private final vw2 f29318d;

    /* renamed from: e */
    private final dt1 f29319e;

    public vh2(Context context, Executor executor, Set set, vw2 vw2Var, dt1 dt1Var) {
        this.f29315a = context;
        this.f29317c = executor;
        this.f29316b = set;
        this.f29318d = vw2Var;
        this.f29319e = dt1Var;
    }

    /* renamed from: a */
    public final tc3 m27224a(Object obj) {
        kw2 m23764a = jw2.m23764a(this.f29315a, 8);
        m23764a.zzf();
        ArrayList arrayList = new ArrayList(this.f29316b.size());
        for (sh2 sh2Var : this.f29316b) {
            tc3 zzb = sh2Var.zzb();
            zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.th2

                /* renamed from: q */
                public final /* synthetic */ sh2 f28338q;

                public /* synthetic */ th2(sh2 sh2Var2) {
                    r2 = sh2Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    vh2.this.m27225b(r2);
                }
            }, kl0.f23368f);
            arrayList.add(zzb);
        }
        tc3 m23601a = kc3.m23871c(arrayList).m23601a(new Callable() { // from class: com.google.android.gms.internal.ads.uh2

            /* renamed from: a */
            public final /* synthetic */ List f28916a;

            /* renamed from: b */
            public final /* synthetic */ Object f28917b;

            public /* synthetic */ uh2(List arrayList2, Object obj2) {
                r1 = arrayList2;
                r2 = obj2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = r1;
                Object obj2 = r2;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rh2 rh2Var = (rh2) ((tc3) it.next()).get();
                    if (rh2Var != null) {
                        rh2Var.mo20086a(obj2);
                    }
                }
                return obj2;
            }
        }, this.f29317c);
        if (xw2.m28052a()) {
            uw2.m27075a(m23601a, this.f29318d, m23764a);
        }
        return m23601a;
    }

    /* renamed from: b */
    public final /* synthetic */ void m27225b(sh2 sh2Var) {
        long mo105914b = zzt.zzB().mo105914b() - zzt.zzB().mo105914b();
        if (((Boolean) AbstractC4371bz.f18054a.m24091e()).booleanValue()) {
            zze.zza("Signal runtime (ms) : " + z53.m28437c(sh2Var.getClass().getCanonicalName()) + " = " + mo105914b);
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21073O1)).booleanValue()) {
            return;
        }
        ct1 m21542a = this.f29319e.m21542a();
        m21542a.m21007b("action", "lat_ms");
        m21542a.m21007b("lat_grp", "sig_lat_grp");
        m21542a.m21007b("lat_id", String.valueOf(sh2Var.zza()));
        m21542a.m21007b("clat_ms", String.valueOf(mo105914b));
        m21542a.m21013h();
    }
}
