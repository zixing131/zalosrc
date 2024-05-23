package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p227i3.C20217u;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class yz0 implements InterfaceC4880pp, r81, zzo, q81 {

    /* renamed from: p */
    private final tz0 f31275p;

    /* renamed from: q */
    private final uz0 f31276q;

    /* renamed from: s */
    private final g90 f31278s;

    /* renamed from: t */
    private final Executor f31279t;

    /* renamed from: u */
    private final InterfaceC20285f f31280u;

    /* renamed from: r */
    private final Set f31277r = new HashSet();

    /* renamed from: v */
    private final AtomicBoolean f31281v = new AtomicBoolean(false);

    /* renamed from: w */
    private final xz0 f31282w = new xz0();

    /* renamed from: x */
    private boolean f31283x = false;

    /* renamed from: y */
    private WeakReference f31284y = new WeakReference(this);

    public yz0(d90 d90Var, uz0 uz0Var, Executor executor, tz0 tz0Var, InterfaceC20285f interfaceC20285f) {
        this.f31275p = tz0Var;
        o80 o80Var = r80.f27138b;
        this.f31278s = d90Var.m21285a("google.afma.activeView.handleUpdate", o80Var, o80Var);
        this.f31276q = uz0Var;
        this.f31279t = executor;
        this.f31280u = interfaceC20285f;
    }

    /* renamed from: k */
    private final void m28402k() {
        Iterator it = this.f31277r.iterator();
        while (it.hasNext()) {
            this.f31275p.m26805f((zq0) it.next());
        }
        this.f31275p.m26804e();
    }

    /* renamed from: a */
    public final synchronized void m28403a() {
        try {
            if (this.f31284y.get() != null) {
                if (!this.f31283x && this.f31281v.get()) {
                    try {
                        this.f31282w.f30692d = this.f31280u.mo105914b();
                        JSONObject zzb = this.f31276q.zzb(this.f31282w);
                        Iterator it = this.f31277r.iterator();
                        while (it.hasNext()) {
                            this.f31279t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wz0

                                /* renamed from: q */
                                public final /* synthetic */ JSONObject f30279q;

                                public /* synthetic */ wz0(JSONObject zzb2) {
                                    r2 = zzb2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    zq0.this.mo23550C0("AFMA_updateActiveView", r2);
                                }
                            });
                        }
                        nl0.m24945b(this.f31278s.zzb(zzb2), "ActiveViewListener.callActiveViewJs");
                        return;
                    } catch (Exception e11) {
                        zze.zzb("Failed to call ActiveViewJS", e11);
                        return;
                    }
                }
                return;
            }
            m28406j();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized void m28404c(zq0 zq0Var) {
        this.f31277r.add(zq0Var);
        this.f31275p.m26803d(zq0Var);
    }

    /* renamed from: g */
    public final void m28405g(Object obj) {
        this.f31284y = new WeakReference(obj);
    }

    /* renamed from: j */
    public final synchronized void m28406j() {
        m28402k();
        this.f31283x = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final synchronized void mo21778m0(C4842op c4842op) {
        xz0 xz0Var = this.f31282w;
        xz0Var.f30689a = c4842op.f25735j;
        xz0Var.f30694f = c4842op;
        m28403a();
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: r */
    public final synchronized void mo20722r(Context context) {
        this.f31282w.f30690b = true;
        m28403a();
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: t */
    public final synchronized void mo20723t(Context context) {
        this.f31282w.f30693e = C20217u.f99970o;
        m28403a();
        m28402k();
        this.f31283x = true;
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: z */
    public final synchronized void mo20724z(Context context) {
        this.f31282w.f30690b = false;
        m28403a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        this.f31282w.f30690b = false;
        m28403a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        this.f31282w.f30690b = true;
        m28403a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i11) {
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final synchronized void zzl() {
        if (this.f31281v.compareAndSet(false, true)) {
            this.f31275p.m26802c(this);
            m28403a();
        }
    }
}
