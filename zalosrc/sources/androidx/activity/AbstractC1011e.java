package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.e */
/* loaded from: classes2.dex */
public abstract class AbstractC1011e {

    /* renamed from: a */
    private boolean f3592a;

    /* renamed from: b */
    private CopyOnWriteArrayList f3593b = new CopyOnWriteArrayList();

    public AbstractC1011e(boolean z11) {
        this.f3592a = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4661a(InterfaceC1007a interfaceC1007a) {
        this.f3593b.add(interfaceC1007a);
    }

    /* renamed from: b */
    public abstract void mo4662b();

    /* renamed from: c */
    public final boolean m4663c() {
        return this.f3592a;
    }

    /* renamed from: d */
    public final void m4664d() {
        Iterator it = this.f3593b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1007a) it.next()).cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4665e(InterfaceC1007a interfaceC1007a) {
        this.f3593b.remove(interfaceC1007a);
    }

    /* renamed from: f */
    public final void m4666f(boolean z11) {
        this.f3592a = z11;
    }
}
