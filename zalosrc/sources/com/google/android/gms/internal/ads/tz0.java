package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class tz0 {

    /* renamed from: a */
    private final String f28658a;

    /* renamed from: b */
    private final d90 f28659b;

    /* renamed from: c */
    private final Executor f28660c;

    /* renamed from: d */
    private yz0 f28661d;

    /* renamed from: e */
    private final c40 f28662e = new qz0(this);

    /* renamed from: f */
    private final c40 f28663f = new sz0(this);

    public tz0(String str, d90 d90Var, Executor executor) {
        this.f28658a = str;
        this.f28659b = d90Var;
        this.f28660c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ boolean m26801g(tz0 tz0Var, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(tz0Var.f28658a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public final void m26802c(yz0 yz0Var) {
        this.f28659b.m21286b("/updateActiveView", this.f28662e);
        this.f28659b.m21286b("/untrackActiveViewUnit", this.f28663f);
        this.f28661d = yz0Var;
    }

    /* renamed from: d */
    public final void m26803d(zq0 zq0Var) {
        zq0Var.mo26687S("/updateActiveView", this.f28662e);
        zq0Var.mo26687S("/untrackActiveViewUnit", this.f28663f);
    }

    /* renamed from: e */
    public final void m26804e() {
        this.f28659b.m21287c("/updateActiveView", this.f28662e);
        this.f28659b.m21287c("/untrackActiveViewUnit", this.f28663f);
    }

    /* renamed from: f */
    public final void m26805f(zq0 zq0Var) {
        zq0Var.mo26686R("/updateActiveView", this.f28662e);
        zq0Var.mo26686R("/untrackActiveViewUnit", this.f28663f);
    }
}
