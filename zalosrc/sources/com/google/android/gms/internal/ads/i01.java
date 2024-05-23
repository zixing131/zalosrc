package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class i01 implements InterfaceC4880pp {

    /* renamed from: p */
    private zq0 f21989p;

    /* renamed from: q */
    private final Executor f21990q;

    /* renamed from: r */
    private final uz0 f21991r;

    /* renamed from: s */
    private final InterfaceC20285f f21992s;

    /* renamed from: t */
    private boolean f21993t = false;

    /* renamed from: u */
    private boolean f21994u = false;

    /* renamed from: v */
    private final xz0 f21995v = new xz0();

    public i01(Executor executor, uz0 uz0Var, InterfaceC20285f interfaceC20285f) {
        this.f21990q = executor;
        this.f21991r = uz0Var;
        this.f21992s = interfaceC20285f;
    }

    /* renamed from: l */
    private final void m23096l() {
        try {
            final JSONObject zzb = this.f21991r.zzb(this.f21995v);
            if (this.f21989p != null) {
                this.f21990q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.h01
                    @Override // java.lang.Runnable
                    public final void run() {
                        i01.this.m23099g(zzb);
                    }
                });
            }
        } catch (JSONException e11) {
            zze.zzb("Failed to call video active view js", e11);
        }
    }

    /* renamed from: a */
    public final void m23097a() {
        this.f21993t = false;
    }

    /* renamed from: c */
    public final void m23098c() {
        this.f21993t = true;
        m23096l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m23099g(JSONObject jSONObject) {
        this.f21989p.mo23550C0("AFMA_updateActiveView", jSONObject);
    }

    /* renamed from: j */
    public final void m23100j(boolean z11) {
        this.f21994u = z11;
    }

    /* renamed from: k */
    public final void m23101k(zq0 zq0Var) {
        this.f21989p = zq0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        boolean z11;
        xz0 xz0Var = this.f21995v;
        if (this.f21994u) {
            z11 = false;
        } else {
            z11 = c4842op.f25735j;
        }
        xz0Var.f30689a = z11;
        xz0Var.f30692d = this.f21992s.mo105914b();
        this.f21995v.f30694f = c4842op;
        if (this.f21993t) {
            m23096l();
        }
    }
}
