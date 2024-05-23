package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class mz0 implements w71, l91, q81, zza, m81 {

    /* renamed from: A */
    private final WeakReference f24950A;

    /* renamed from: B */
    private final WeakReference f24951B;

    /* renamed from: C */
    private boolean f24952C;

    /* renamed from: D */
    private final AtomicBoolean f24953D = new AtomicBoolean();

    /* renamed from: E */
    private final C4665jy f24954E;

    /* renamed from: p */
    private final Context f24955p;

    /* renamed from: q */
    private final Executor f24956q;

    /* renamed from: r */
    private final Executor f24957r;

    /* renamed from: s */
    private final ScheduledExecutorService f24958s;

    /* renamed from: t */
    private final tq2 f24959t;

    /* renamed from: u */
    private final iq2 f24960u;

    /* renamed from: v */
    private final kx2 f24961v;

    /* renamed from: w */
    private final lr2 f24962w;

    /* renamed from: x */
    private final C4830od f24963x;

    /* renamed from: y */
    private final C4592hy f24964y;

    /* renamed from: z */
    private final vw2 f24965z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mz0(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, tq2 tq2Var, iq2 iq2Var, kx2 kx2Var, lr2 lr2Var, View view, zq0 zq0Var, C4830od c4830od, C4592hy c4592hy, C4665jy c4665jy, vw2 vw2Var, byte[] bArr) {
        this.f24955p = context;
        this.f24956q = executor;
        this.f24957r = executor2;
        this.f24958s = scheduledExecutorService;
        this.f24959t = tq2Var;
        this.f24960u = iq2Var;
        this.f24961v = kx2Var;
        this.f24962w = lr2Var;
        this.f24963x = c4830od;
        this.f24950A = new WeakReference(view);
        this.f24951B = new WeakReference(zq0Var);
        this.f24964y = c4592hy;
        this.f24954E = c4665jy;
        this.f24965z = vw2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final void m24775V() {
        String str;
        int i11;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21014I2)).booleanValue()) {
            str = this.f24963x.m25160c().zzh(this.f24955p, (View) this.f24950A.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21297l0)).booleanValue() && this.f24959t.f28473b.f27823b.f24019g) || !((Boolean) AbstractC5186xy.f30679h.m24091e()).booleanValue()) {
            lr2 lr2Var = this.f24962w;
            kx2 kx2Var = this.f24961v;
            tq2 tq2Var = this.f24959t;
            iq2 iq2Var = this.f24960u;
            lr2Var.m24359a(kx2Var.m24081d(tq2Var, iq2Var, false, str, null, iq2Var.f22319d));
            return;
        }
        if (((Boolean) AbstractC5186xy.f30678g.m24091e()).booleanValue() && ((i11 = this.f24960u.f22315b) == 1 || i11 == 2 || i11 == 5)) {
        }
        kc3.m23886r((ac3) kc3.m23883o(ac3.m20071D(kc3.m23877i(null)), ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21082P0)).longValue(), TimeUnit.MILLISECONDS, this.f24958s), new lz0(this, str), this.f24956q);
    }

    /* renamed from: Y */
    private final void m24776Y(final int i11, final int i12) {
        View view;
        if (i11 > 0 && ((view = (View) this.f24950A.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.f24958s.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.fz0
                @Override // java.lang.Runnable
                public final void run() {
                    mz0.this.m24785t(i11, i12);
                }
            }, i12, TimeUnit.MILLISECONDS);
        } else {
            m24775V();
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: G */
    public final void mo20101G(cg0 cg0Var, String str, String str2) {
        lr2 lr2Var = this.f24962w;
        kx2 kx2Var = this.f24961v;
        iq2 iq2Var = this.f24960u;
        lr2Var.m24359a(kx2Var.m24082e(iq2Var, iq2Var.f22329i, cg0Var));
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: Q */
    public final void mo20102Q() {
        lr2 lr2Var = this.f24962w;
        kx2 kx2Var = this.f24961v;
        tq2 tq2Var = this.f24959t;
        iq2 iq2Var = this.f24960u;
        lr2Var.m24359a(kx2Var.m24080c(tq2Var, iq2Var, iq2Var.f22331j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void m24783o() {
        this.f24956q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jz0
            @Override // java.lang.Runnable
            public final void run() {
                mz0.this.m24775V();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21297l0)).booleanValue() || !this.f24959t.f28473b.f27823b.f24019g) && ((Boolean) AbstractC5186xy.f30675d.m24091e()).booleanValue()) {
            kc3.m23886r(kc3.m23874f(ac3.m20071D(this.f24964y.m23078a()), Throwable.class, new y43() { // from class: com.google.android.gms.internal.ads.gz0
                @Override // com.google.android.gms.internal.ads.y43
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, kl0.f23368f), new kz0(this), this.f24956q);
            return;
        }
        lr2 lr2Var = this.f24962w;
        kx2 kx2Var = this.f24961v;
        tq2 tq2Var = this.f24959t;
        iq2 iq2Var = this.f24960u;
        List m24080c = kx2Var.m24080c(tq2Var, iq2Var, iq2Var.f22317c);
        int i11 = 1;
        if (true == zzt.zzo().m22947v(this.f24955p)) {
            i11 = 2;
        }
        lr2Var.m24361c(m24080c, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void m24784r(int i11, int i12) {
        m24776Y(i11 - 1, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void m24785t(final int i11, final int i12) {
        this.f24956q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hz0
            @Override // java.lang.Runnable
            public final void run() {
                mz0.this.m24784r(i11, i12);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.m81
    /* renamed from: z */
    public final void mo22412z(zze zzeVar) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21328o1)).booleanValue()) {
            this.f24962w.m24359a(this.f24961v.m24080c(this.f24959t, this.f24960u, kx2.m24077f(2, zzeVar.zza, this.f24960u.f22343p)));
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        if (!this.f24953D.compareAndSet(false, true)) {
            return;
        }
        int intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21054M2)).intValue();
        if (intValue > 0) {
            m24776Y(intValue, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21064N2)).intValue());
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21044L2)).booleanValue()) {
            this.f24957r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iz0
                @Override // java.lang.Runnable
                public final void run() {
                    mz0.this.m24783o();
                }
            });
        } else {
            m24775V();
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final synchronized void zzn() {
        try {
            if (this.f24952C) {
                ArrayList arrayList = new ArrayList(this.f24960u.f22319d);
                arrayList.addAll(this.f24960u.f22325g);
                this.f24962w.m24359a(this.f24961v.m24081d(this.f24959t, this.f24960u, true, null, null, arrayList));
            } else {
                lr2 lr2Var = this.f24962w;
                kx2 kx2Var = this.f24961v;
                tq2 tq2Var = this.f24959t;
                iq2 iq2Var = this.f24960u;
                lr2Var.m24359a(kx2Var.m24080c(tq2Var, iq2Var, iq2Var.f22339n));
                lr2 lr2Var2 = this.f24962w;
                kx2 kx2Var2 = this.f24961v;
                tq2 tq2Var2 = this.f24959t;
                iq2 iq2Var2 = this.f24960u;
                lr2Var2.m24359a(kx2Var2.m24080c(tq2Var2, iq2Var2, iq2Var2.f22325g));
            }
            this.f24952C = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzr() {
        lr2 lr2Var = this.f24962w;
        kx2 kx2Var = this.f24961v;
        tq2 tq2Var = this.f24959t;
        iq2 iq2Var = this.f24960u;
        lr2Var.m24359a(kx2Var.m24080c(tq2Var, iq2Var, iq2Var.f22327h));
    }
}
