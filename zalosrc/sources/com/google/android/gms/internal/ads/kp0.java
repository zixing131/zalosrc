package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;
import p669y4.InterfaceC30288e;

/* loaded from: classes2.dex */
public abstract class kp0 implements InterfaceC30288e {

    /* renamed from: p */
    protected final Context f23421p;

    /* renamed from: q */
    protected final String f23422q;

    /* renamed from: r */
    protected final WeakReference f23423r;

    public kp0(fn0 fn0Var) {
        Context context = fn0Var.getContext();
        this.f23421p = context;
        this.f23422q = zzt.zzp().zzc(context, fn0Var.zzp().f32030p);
        this.f23423r = new WeakReference(fn0Var);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m23992h(kp0 kp0Var, String str, Map map) {
        fn0 fn0Var = (fn0) kp0Var.f23423r.get();
        if (fn0Var != null) {
            fn0Var.mo23552V("onPrecacheEvent", map);
        }
    }

    /* renamed from: i */
    public abstract void mo23993i();

    /* renamed from: j */
    public final void m23994j(String str, String str2, String str3, String str4) {
        rk0.f27282b.post(new jp0(this, str, str2, str3, str4));
    }

    /* renamed from: k */
    public final void m23995k(String str, String str2, int i11) {
        rk0.f27282b.post(new gp0(this, str, str2, i11));
    }

    /* renamed from: l */
    public final void m23996l(String str, String str2, long j11) {
        rk0.f27282b.post(new hp0(this, str, str2, j11));
    }

    /* renamed from: m */
    public final void m23997m(String str, String str2, int i11, int i12, long j11, long j12, boolean z11, int i13, int i14) {
        rk0.f27282b.post(new fp0(this, str, str2, i11, i12, j11, j12, z11, i13, i14));
    }

    /* renamed from: n */
    public final void m23998n(String str, String str2, long j11, long j12, boolean z11, long j13, long j14, long j15, int i11, int i12) {
        rk0.f27282b.post(new ep0(this, str, str2, j11, j12, j13, j14, j15, z11, i11, i12));
    }

    /* renamed from: o */
    public void mo23999o(int i11) {
    }

    /* renamed from: p */
    public void mo24000p(int i11) {
    }

    /* renamed from: q */
    public void mo24001q(int i11) {
    }

    /* renamed from: r */
    public void mo24002r(int i11) {
    }

    @Override // p669y4.InterfaceC30288e
    public void release() {
    }

    /* renamed from: s */
    public abstract boolean mo24003s(String str);

    /* renamed from: t */
    public boolean mo24004t(String str, String[] strArr) {
        return mo24003s(str);
    }

    /* renamed from: u */
    public boolean mo24005u(String str, String[] strArr, bp0 bp0Var) {
        return mo24003s(str);
    }
}
