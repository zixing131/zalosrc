package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.C4148b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class xw2 implements Runnable {

    /* renamed from: y */
    public static Boolean f30652y;

    /* renamed from: p */
    private final Context f30653p;

    /* renamed from: q */
    private final zzcgv f30654q;

    /* renamed from: s */
    private String f30656s;

    /* renamed from: t */
    private int f30657t;

    /* renamed from: u */
    private final tq1 f30658u;

    /* renamed from: w */
    private final m02 f30660w;

    /* renamed from: x */
    private final yf0 f30661x;

    /* renamed from: r */
    private final dx2 f30655r = gx2.m22624G();

    /* renamed from: v */
    private boolean f30659v = false;

    public xw2(Context context, zzcgv zzcgvVar, tq1 tq1Var, m02 m02Var, yf0 yf0Var, byte[] bArr) {
        this.f30653p = context;
        this.f30654q = zzcgvVar;
        this.f30658u = tq1Var;
        this.f30660w = m02Var;
        this.f30661x = yf0Var;
    }

    /* renamed from: a */
    public static synchronized boolean m28052a() {
        boolean booleanValue;
        boolean z11;
        synchronized (xw2.class) {
            try {
                if (f30652y == null) {
                    if (!((Boolean) AbstractC4963ry.f27407b.m24091e()).booleanValue()) {
                        f30652y = Boolean.FALSE;
                    } else {
                        if (Math.random() < ((Double) AbstractC4963ry.f27406a.m24091e()).doubleValue()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        f30652y = Boolean.valueOf(z11);
                    }
                }
                booleanValue = f30652y.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return booleanValue;
    }

    /* renamed from: c */
    private final synchronized void m28053c() {
        if (this.f30659v) {
            return;
        }
        this.f30659v = true;
        if (!m28052a()) {
            return;
        }
        zzt.zzp();
        this.f30656s = zzs.zzo(this.f30653p);
        this.f30657t = C4148b.m19567h().m19569b(this.f30653p);
        long intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21424x7)).intValue();
        kl0.f23366d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    private final synchronized void m28054d() {
        try {
            new l02(this.f30653p, this.f30654q.f32030p, this.f30661x, Binder.getCallingUid(), null).zza(new j02((String) zzay.zzc().m21823b(AbstractC4554gx.f21414w7), 60000, new HashMap(), ((gx2) this.f30655r.m25898n()).mo27346a(), "application/x-protobuf"));
            this.f30655r.m21563s();
        } catch (Exception e11) {
            if ((e11 instanceof zzebh) && ((zzebh) e11).m28810a() == 3) {
                this.f30655r.m21563s();
            } else {
                zzt.zzo().m22944s(e11, "CuiMonitor.sendCuiPing");
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m28055b(ow2 ow2Var) {
        try {
            if (!this.f30659v) {
                m28053c();
            }
            if (!m28052a()) {
                return;
            }
            if (ow2Var == null) {
                return;
            }
            if (this.f30655r.m21561q() >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21434y7)).intValue()) {
                return;
            }
            dx2 dx2Var = this.f30655r;
            ex2 m22198F = fx2.m22198F();
            zw2 m20310F = ax2.m20310F();
            m20310F.m28655G(ow2Var.m25345h());
            m20310F.m28652C(ow2Var.m25344g());
            m20310F.m28662v(ow2Var.m25339b());
            m20310F.m28657I(3);
            m20310F.m28651B(this.f30654q.f32030p);
            m20310F.m28658q(this.f30656s);
            m20310F.m28666z(Build.VERSION.RELEASE);
            m20310F.m28653D(Build.VERSION.SDK_INT);
            m20310F.m28656H(ow2Var.m25347j());
            m20310F.m28665y(ow2Var.m25338a());
            m20310F.m28660s(this.f30657t);
            m20310F.m28654E(ow2Var.m25346i());
            m20310F.m28659r(ow2Var.m25340c());
            m20310F.m28661u(ow2Var.m25341d());
            m20310F.m28663w(ow2Var.m25342e());
            m20310F.m28664x(this.f30658u.m26651c(ow2Var.m25342e()));
            m20310F.m28650A(ow2Var.m25343f());
            m22198F.m21828q(m20310F);
            dx2Var.m21562r(m22198F);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (!m28052a()) {
            return;
        }
        if (this.f30655r.m21561q() == 0) {
            return;
        }
        m28054d();
    }
}
