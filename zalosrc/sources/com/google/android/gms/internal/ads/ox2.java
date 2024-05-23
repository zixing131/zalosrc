package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ox2 {

    /* renamed from: a */
    private final Context f25987a;

    /* renamed from: b */
    private final Executor f25988b;

    /* renamed from: c */
    private final cl0 f25989c;

    /* renamed from: d */
    private final xw2 f25990d;

    public ox2(Context context, Executor executor, cl0 cl0Var, xw2 xw2Var) {
        this.f25987a = context;
        this.f25988b = executor;
        this.f25989c = cl0Var;
        this.f25990d = xw2Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void m25353a(String str) {
        this.f25989c.zza(str);
    }

    /* renamed from: b */
    public final /* synthetic */ void m25354b(String str, vw2 vw2Var) {
        kw2 m23764a = jw2.m23764a(this.f25987a, 14);
        m23764a.zzf();
        m23764a.mo23067q(this.f25989c.zza(str));
        if (vw2Var == null) {
            this.f25990d.m28055b(m23764a.zzj());
        } else {
            vw2Var.m27360a(m23764a);
            vw2Var.m27366g();
        }
    }

    /* renamed from: c */
    public final void m25355c(String str, vw2 vw2Var) {
        if (xw2.m28052a() && ((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue()) {
            this.f25988b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nx2

                /* renamed from: q */
                public final /* synthetic */ String f25369q;

                /* renamed from: r */
                public final /* synthetic */ vw2 f25370r;

                public /* synthetic */ nx2(String str2, vw2 vw2Var2) {
                    r2 = str2;
                    r3 = vw2Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ox2.this.m25354b(r2, r3);
                }
            });
        } else {
            this.f25988b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mx2

                /* renamed from: q */
                public final /* synthetic */ String f24902q;

                public /* synthetic */ mx2(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ox2.this.m25353a(r2);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m25356d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m25355c((String) it.next(), null);
        }
    }
}
