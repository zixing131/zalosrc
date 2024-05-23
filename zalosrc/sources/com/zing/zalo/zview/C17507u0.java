package com.zing.zalo.zview;

import android.R;
import android.os.Bundle;
import fn0.AbstractC19074t;
import p542ub.InterfaceC27218a;
import zl0.AbstractC32227d;

/* renamed from: com.zing.zalo.zview.u0 */
/* loaded from: classes7.dex */
public final class C17507u0 {

    /* renamed from: a */
    private Class f89203a;

    /* renamed from: b */
    private ZaloView f89204b;

    /* renamed from: c */
    private final C17487o0 f89205c;

    /* renamed from: d */
    private final boolean f89206d;

    /* renamed from: e */
    private Integer f89207e;

    /* renamed from: f */
    private int f89208f;

    /* renamed from: g */
    private int f89209g;

    /* renamed from: h */
    private String f89210h;

    /* renamed from: i */
    private Bundle f89211i;

    public C17507u0(C17487o0 c17487o0, ZaloView zaloView, boolean z11) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(zaloView, "zaloView");
        this.f89209g = 1;
        this.f89205c = c17487o0;
        this.f89206d = z11;
        this.f89204b = zaloView;
        m93135c();
    }

    /* renamed from: b */
    private final int m93134b() {
        Integer num = this.f89207e;
        AbstractC19074t.m100205c(num);
        return num.intValue();
    }

    /* renamed from: c */
    private final void m93135c() {
        ZaloView zaloView = this.f89205c.f89118l;
        if (zaloView != null) {
            AbstractC19074t.m100205c(zaloView);
            if (zaloView.f88747N != null) {
                ZaloView zaloView2 = this.f89205c.f89118l;
                AbstractC19074t.m100205c(zaloView2);
                this.f89207e = Integer.valueOf(zaloView2.f88747N.getId());
                return;
            }
            AbstractC32227d.m155419c("ZaloViewManager", "Cannot show ZaloView, return. mParentZaloView.mInnerView is null");
            return;
        }
        this.f89207e = Integer.valueOf(R.id.content);
        InterfaceC27218a interfaceC27218a = this.f89205c.f89116j;
        if (interfaceC27218a != null && interfaceC27218a.mo35585v() != null) {
            this.f89207e = Integer.valueOf(this.f89205c.f89116j.mo35585v().getId());
        }
    }

    /* renamed from: a */
    public final ZaloView m93136a() {
        if (this.f89207e == null) {
            return null;
        }
        if (this.f89204b != null) {
            return this.f89205c.mo93055b2(m93134b(), this.f89204b, this.f89211i, this.f89208f, this.f89210h, this.f89209g, this.f89206d);
        }
        return this.f89205c.mo57057c2(m93134b(), this.f89203a, this.f89211i, this.f89208f, this.f89210h, this.f89209g, this.f89206d);
    }

    /* renamed from: d */
    public final C17507u0 m93137d(int i11) {
        this.f89209g = i11;
        return this;
    }

    /* renamed from: e */
    public final C17507u0 m93138e(int i11) {
        this.f89207e = Integer.valueOf(i11);
        return this;
    }

    /* renamed from: f */
    public final C17507u0 m93139f(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "data");
        this.f89211i = bundle;
        return this;
    }

    /* renamed from: g */
    public final C17507u0 m93140g(int i11) {
        this.f89208f = i11;
        return this;
    }

    /* renamed from: h */
    public final C17507u0 m93141h(String str) {
        AbstractC19074t.m100208f(str, "tag");
        this.f89210h = str;
        return this;
    }

    public C17507u0(C17487o0 c17487o0, Class cls, boolean z11) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(cls, "zClass");
        this.f89209g = 1;
        this.f89205c = c17487o0;
        this.f89206d = z11;
        this.f89203a = cls;
        m93135c();
    }
}
