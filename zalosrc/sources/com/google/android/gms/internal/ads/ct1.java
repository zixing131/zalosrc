package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ct1 {

    /* renamed from: a */
    private final Map f18539a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ dt1 f18540b;

    public ct1(dt1 dt1Var) {
        this.f18540b = dt1Var;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ ct1 m21006a(ct1 ct1Var) {
        Map map;
        Map map2 = ct1Var.f18539a;
        map = ct1Var.f18540b.f19417c;
        map2.putAll(map);
        return ct1Var;
    }

    /* renamed from: b */
    public final ct1 m21007b(String str, String str2) {
        this.f18539a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final ct1 m21008c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f18539a.put(str, str2);
        }
        return this;
    }

    /* renamed from: d */
    public final ct1 m21009d(iq2 iq2Var) {
        this.f18539a.put("aai", iq2Var.f22352x);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21223d6)).booleanValue()) {
            m21008c("rid", iq2Var.f22344p0);
        }
        return this;
    }

    /* renamed from: e */
    public final ct1 m21010e(lq2 lq2Var) {
        this.f18539a.put("gqi", lq2Var.f24014b);
        return this;
    }

    /* renamed from: f */
    public final String m21011f() {
        it1 it1Var;
        it1Var = this.f18540b.f19415a;
        return it1Var.m24032b(this.f18539a);
    }

    /* renamed from: g */
    public final void m21012g() {
        Executor executor;
        executor = this.f18540b.f19416b;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bt1
            public /* synthetic */ bt1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ct1.this.m21014i();
            }
        });
    }

    /* renamed from: h */
    public final void m21013h() {
        Executor executor;
        executor = this.f18540b.f19416b;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.at1
            public /* synthetic */ at1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ct1.this.m21015j();
            }
        });
    }

    /* renamed from: i */
    public final /* synthetic */ void m21014i() {
        it1 it1Var;
        it1Var = this.f18540b.f19415a;
        it1Var.m24035e(this.f18539a);
    }

    /* renamed from: j */
    public final /* synthetic */ void m21015j() {
        it1 it1Var;
        it1Var = this.f18540b.f19415a;
        it1Var.m24034d(this.f18539a);
    }
}
