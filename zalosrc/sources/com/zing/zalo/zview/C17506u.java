package com.zing.zalo.zview;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.InterfaceC1801w;

/* renamed from: com.zing.zalo.zview.u */
/* loaded from: classes.dex */
public class C17506u implements InterfaceC1801w {

    /* renamed from: p */
    private C1805y f89202p = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m93131a(AbstractC1785o.a aVar) {
        this.f89202p.m9400i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m93132b() {
        if (this.f89202p == null) {
            this.f89202p = new C1805y(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m93133c() {
        return this.f89202p != null;
    }

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        m93132b();
        return this.f89202p;
    }
}
