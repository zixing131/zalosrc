package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class tx2 {
    /* renamed from: a */
    public static tx2 m26792a(ux2 ux2Var, vx2 vx2Var) {
        if (rx2.m26203b()) {
            return new xx2(ux2Var, vx2Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo26793b(View view, zx2 zx2Var, String str);

    /* renamed from: c */
    public abstract void mo26794c();

    /* renamed from: d */
    public abstract void mo26795d(View view);

    /* renamed from: e */
    public abstract void mo26796e();
}
