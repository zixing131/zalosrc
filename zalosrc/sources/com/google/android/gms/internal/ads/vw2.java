package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class vw2 implements Runnable {

    /* renamed from: q */
    private final xw2 f29589q;

    /* renamed from: r */
    private String f29590r;

    /* renamed from: s */
    private String f29591s;

    /* renamed from: t */
    private sq2 f29592t;

    /* renamed from: u */
    private zze f29593u;

    /* renamed from: v */
    private Future f29594v;

    /* renamed from: p */
    private final List f29588p = new ArrayList();

    /* renamed from: w */
    private int f29595w = 2;

    public vw2(xw2 xw2Var) {
        this.f29589q = xw2Var;
    }

    /* renamed from: a */
    public final synchronized vw2 m27360a(kw2 kw2Var) {
        try {
            if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
                List list = this.f29588p;
                kw2Var.zzg();
                list.add(kw2Var);
                Future future = this.f29594v;
                if (future != null) {
                    future.cancel(false);
                }
                this.f29594v = kl0.f23366d.schedule(this, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21444z7)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* renamed from: b */
    public final synchronized vw2 m27361b(String str) {
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() && uw2.m27079e(str)) {
            this.f29590r = str;
        }
        return this;
    }

    /* renamed from: c */
    public final synchronized vw2 m27362c(zze zzeVar) {
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            this.f29593u = zzeVar;
        }
        return this;
    }

    /* renamed from: d */
    public final synchronized vw2 m27363d(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f29595w = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.f29595w = 6;
                                }
                            }
                            this.f29595w = 5;
                        }
                        this.f29595w = 8;
                    }
                    this.f29595w = 4;
                }
                this.f29595w = 3;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized vw2 m27364e(String str) {
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            this.f29591s = str;
        }
        return this;
    }

    /* renamed from: f */
    public final synchronized vw2 m27365f(sq2 sq2Var) {
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            this.f29592t = sq2Var;
        }
        return this;
    }

    /* renamed from: g */
    public final synchronized void m27366g() {
        try {
            if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
                return;
            }
            Future future = this.f29594v;
            if (future != null) {
                future.cancel(false);
            }
            for (kw2 kw2Var : this.f29588p) {
                int i11 = this.f29595w;
                if (i11 != 2) {
                    kw2Var.mo23065n(i11);
                }
                if (!TextUtils.isEmpty(this.f29590r)) {
                    kw2Var.mo23066o(this.f29590r);
                }
                if (!TextUtils.isEmpty(this.f29591s) && !kw2Var.zzi()) {
                    kw2Var.mo23068t(this.f29591s);
                }
                sq2 sq2Var = this.f29592t;
                if (sq2Var != null) {
                    kw2Var.mo23064b(sq2Var);
                } else {
                    zze zzeVar = this.f29593u;
                    if (zzeVar != null) {
                        kw2Var.mo23063a(zzeVar);
                    }
                }
                this.f29589q.m28055b(kw2Var.zzj());
            }
            this.f29588p.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: h */
    public final synchronized vw2 m27367h(int i11) {
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            this.f29595w = i11;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        m27366g();
    }
}
