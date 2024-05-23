package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b31 extends s11 {

    /* renamed from: i */
    private final c20 f17515i;

    /* renamed from: j */
    private final Runnable f17516j;

    /* renamed from: k */
    private final Executor f17517k;

    public b31(u31 u31Var, c20 c20Var, Runnable runnable, Executor executor) {
        super(u31Var);
        this.f17515i = c20Var;
        this.f17516j = runnable;
        this.f17517k = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m20374o(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.v31
    /* renamed from: b */
    public final void mo20375b() {
        this.f17517k.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.a31

            /* renamed from: q */
            public final /* synthetic */ Runnable f16903q;

            public /* synthetic */ a31(Runnable runnable) {
                r2 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b31.this.m20383p(r2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: h */
    public final int mo20376h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: i */
    public final View mo20377i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: j */
    public final com.google.android.gms.ads.internal.client.zzdk mo20378j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: k */
    public final jq2 mo20379k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: l */
    public final jq2 mo20380l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: m */
    public final void mo20381m() {
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: n */
    public final void mo20382n(ViewGroup viewGroup, zzq zzqVar) {
    }

    /* renamed from: p */
    public final /* synthetic */ void m20383p(Runnable runnable) {
        try {
            if (!this.f17515i.zzb(BinderC4273d.m19913I3(runnable))) {
                m20374o(((z21) runnable).f31328p);
            }
        } catch (RemoteException unused) {
            m20374o(((z21) runnable).f31328p);
        }
    }
}
