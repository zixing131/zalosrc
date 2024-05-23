package androidx.fragment.app;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.InterfaceC1801w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes2.dex */
public class C1740n implements InterfaceC1801w {

    /* renamed from: p */
    private C1805y f7210p = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9197a(AbstractC1785o.a aVar) {
        this.f7210p.m9400i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m9198b() {
        if (this.f7210p == null) {
            this.f7210p = new C1805y(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m9199c() {
        return this.f7210p != null;
    }

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        m9198b();
        return this.f7210p;
    }
}
