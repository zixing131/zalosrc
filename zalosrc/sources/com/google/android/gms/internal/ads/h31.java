package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public final class h31 implements l91, q81 {

    /* renamed from: p */
    private final Context f21517p;

    /* renamed from: q */
    private final zq0 f21518q;

    /* renamed from: r */
    private final iq2 f21519r;

    /* renamed from: s */
    private final zzcgv f21520s;

    /* renamed from: t */
    private InterfaceC4271b f21521t;

    /* renamed from: u */
    private boolean f21522u;

    public h31(Context context, zq0 zq0Var, iq2 iq2Var, zzcgv zzcgvVar) {
        this.f21517p = context;
        this.f21518q = zq0Var;
        this.f21519r = iq2Var;
        this.f21520s = zzcgvVar;
    }

    /* renamed from: a */
    private final synchronized void m22691a() {
        a32 a32Var;
        b32 b32Var;
        try {
            if (!this.f21519r.f22307U) {
                return;
            }
            if (this.f21518q == null) {
                return;
            }
            if (!zzt.zzA().mo27818d(this.f21517p)) {
                return;
            }
            zzcgv zzcgvVar = this.f21520s;
            String str = zzcgvVar.f32031q + "." + zzcgvVar.f32032r;
            String m22515a = this.f21519r.f22309W.m22515a();
            if (this.f21519r.f22309W.m22516b() == 1) {
                a32Var = a32.VIDEO;
                b32Var = b32.DEFINED_BY_JAVASCRIPT;
            } else {
                a32Var = a32.HTML_DISPLAY;
                if (this.f21519r.f22323f == 1) {
                    b32Var = b32.ONE_PIXEL;
                } else {
                    b32Var = b32.BEGIN_TO_RENDER;
                }
            }
            InterfaceC4271b mo27815a = zzt.zzA().mo27815a(str, this.f21518q.mo26701m(), "", "javascript", m22515a, b32Var, a32Var, this.f21519r.f22340n0);
            this.f21521t = mo27815a;
            Object obj = this.f21518q;
            if (mo27815a != null) {
                zzt.zzA().mo27817c(this.f21521t, (View) obj);
                this.f21518q.mo26698g0(this.f21521t);
                zzt.zzA().zzd(this.f21521t);
                this.f21522u = true;
                this.f21518q.mo23552V("onSdkLoaded", new C30239a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final synchronized void zzl() {
        zq0 zq0Var;
        try {
            if (!this.f21522u) {
                m22691a();
            }
            if (this.f21519r.f22307U && this.f21521t != null && (zq0Var = this.f21518q) != null) {
                zq0Var.mo23552V("onSdkImpression", new C30239a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final synchronized void zzn() {
        if (this.f21522u) {
            return;
        }
        m22691a();
    }
}
