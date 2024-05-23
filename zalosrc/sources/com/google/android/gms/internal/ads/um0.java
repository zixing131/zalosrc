package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public final class um0 {

    /* renamed from: a */
    private final Context f28983a;

    /* renamed from: b */
    private final fn0 f28984b;

    /* renamed from: c */
    private final ViewGroup f28985c;

    /* renamed from: d */
    private zzcim f28986d;

    public um0(Context context, ViewGroup viewGroup, zq0 zq0Var) {
        this.f28983a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f28985c = viewGroup;
        this.f28984b = zq0Var;
        this.f28986d = null;
    }

    /* renamed from: a */
    public final zzcim m26994a() {
        return this.f28986d;
    }

    /* renamed from: b */
    public final void m26995b(int i11, int i12, int i13, int i14) {
        AbstractC4205o.m19717f("The underlay may only be modified from the UI thread.");
        zzcim zzcimVar = this.f28986d;
        if (zzcimVar != null) {
            zzcimVar.m28767h(i11, i12, i13, i14);
        }
    }

    /* renamed from: c */
    public final void m26996c(int i11, int i12, int i13, int i14, int i15, boolean z11, en0 en0Var, Integer num) {
        if (this.f28986d != null) {
            return;
        }
        AbstractC4813nx.m25029a(this.f28984b.zzo().m26788a(), this.f28984b.zzn(), "vpr2");
        Context context = this.f28983a;
        fn0 fn0Var = this.f28984b;
        zzcim zzcimVar = new zzcim(context, fn0Var, i15, z11, fn0Var.zzo().m26788a(), en0Var, num);
        this.f28986d = zzcimVar;
        this.f28985c.addView(zzcimVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f28986d.m28767h(i11, i12, i13, i14);
        this.f28984b.zzB(false);
    }

    /* renamed from: d */
    public final void m26997d() {
        AbstractC4205o.m19717f("onDestroy must be called from the UI thread.");
        zzcim zzcimVar = this.f28986d;
        if (zzcimVar != null) {
            zzcimVar.m28773s();
            this.f28985c.removeView(this.f28986d);
            this.f28986d = null;
        }
    }

    /* renamed from: e */
    public final void m26998e() {
        AbstractC4205o.m19717f("onPause must be called from the UI thread.");
        zzcim zzcimVar = this.f28986d;
        if (zzcimVar != null) {
            zzcimVar.m28779z();
        }
    }

    /* renamed from: f */
    public final void m26999f(int i11) {
        zzcim zzcimVar = this.f28986d;
        if (zzcimVar != null) {
            zzcimVar.m28764e(i11);
        }
    }
}
