package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1760c;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC1795t {

    /* renamed from: p */
    private final Object f7245p;

    /* renamed from: q */
    private final C1760c.a f7246q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f7245p = obj;
        this.f7246q = C1760c.f7298c.m9266c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        this.f7246q.m9269a(interfaceC1801w, aVar, this.f7245p);
    }
}
