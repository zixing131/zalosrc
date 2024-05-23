package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class v11 extends s11 {

    /* renamed from: i */
    private final Context f29114i;

    /* renamed from: j */
    private final View f29115j;

    /* renamed from: k */
    private final zq0 f29116k;

    /* renamed from: l */
    private final jq2 f29117l;

    /* renamed from: m */
    private final t31 f29118m;

    /* renamed from: n */
    private final hk1 f29119n;

    /* renamed from: o */
    private final rf1 f29120o;

    /* renamed from: p */
    private final d04 f29121p;

    /* renamed from: q */
    private final Executor f29122q;

    /* renamed from: r */
    private zzq f29123r;

    public v11(u31 u31Var, Context context, jq2 jq2Var, View view, zq0 zq0Var, t31 t31Var, hk1 hk1Var, rf1 rf1Var, d04 d04Var, Executor executor) {
        super(u31Var);
        this.f29114i = context;
        this.f29115j = view;
        this.f29116k = zq0Var;
        this.f29117l = jq2Var;
        this.f29118m = t31Var;
        this.f29119n = hk1Var;
        this.f29120o = rf1Var;
        this.f29121p = d04Var;
        this.f29122q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m27121o(v11 v11Var) {
        hk1 hk1Var = v11Var.f29119n;
        if (hk1Var.m22952e() == null) {
            return;
        }
        try {
            hk1Var.m22952e().mo26560N0((zzbs) v11Var.f29121p.zzb(), BinderC4273d.m19913I3(v11Var.f29114i));
        } catch (RemoteException e11) {
            yk0.zzh("RemoteException when notifyAdLoad is called", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.v31
    /* renamed from: b */
    public final void mo20375b() {
        this.f29122q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.u11
            public /* synthetic */ u11() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                v11.m27121o(v11.this);
            }
        });
        super.mo20375b();
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: h */
    public final int mo20376h() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21028J6)).booleanValue() && this.f29153b.f22330i0) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21038K6)).booleanValue()) {
                return 0;
            }
        }
        return this.f29152a.f28473b.f27823b.f24015c;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: i */
    public final View mo20377i() {
        return this.f29115j;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: j */
    public final com.google.android.gms.ads.internal.client.zzdk mo20378j() {
        try {
            return this.f29118m.zza();
        } catch (zzfek unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: k */
    public final jq2 mo20379k() {
        zzq zzqVar = this.f29123r;
        if (zzqVar != null) {
            return hr2.m23007c(zzqVar);
        }
        iq2 iq2Var = this.f29153b;
        if (iq2Var.f22320d0) {
            for (String str : iq2Var.f22313a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new jq2(this.f29115j.getWidth(), this.f29115j.getHeight(), false);
        }
        return hr2.m23006b(this.f29153b.f22347s, this.f29117l);
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: l */
    public final jq2 mo20380l() {
        return this.f29117l;
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: m */
    public final void mo20381m() {
        this.f29120o.zza();
    }

    @Override // com.google.android.gms.internal.ads.s11
    /* renamed from: n */
    public final void mo20382n(ViewGroup viewGroup, zzq zzqVar) {
        zq0 zq0Var;
        if (viewGroup != null && (zq0Var = this.f29116k) != null) {
            zq0Var.mo26684O(ps0.m25533c(zzqVar));
            viewGroup.setMinimumHeight(zzqVar.zzc);
            viewGroup.setMinimumWidth(zzqVar.zzf);
            this.f29123r = zzqVar;
        }
    }
}
