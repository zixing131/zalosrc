package androidx.activity;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f3581a;

    /* renamed from: b */
    final ArrayDeque f3582b = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC1795t, InterfaceC1007a {

        /* renamed from: p */
        private final AbstractC1785o f3583p;

        /* renamed from: q */
        private final AbstractC1011e f3584q;

        /* renamed from: r */
        private InterfaceC1007a f3585r;

        LifecycleOnBackPressedCancellable(AbstractC1785o abstractC1785o, AbstractC1011e abstractC1011e) {
            this.f3583p = abstractC1785o;
            this.f3584q = abstractC1011e;
            abstractC1785o.mo9335a(this);
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            if (aVar == AbstractC1785o.a.ON_START) {
                this.f3585r = OnBackPressedDispatcher.this.m4657b(this.f3584q);
                return;
            }
            if (aVar == AbstractC1785o.a.ON_STOP) {
                InterfaceC1007a interfaceC1007a = this.f3585r;
                if (interfaceC1007a != null) {
                    interfaceC1007a.cancel();
                    return;
                }
                return;
            }
            if (aVar == AbstractC1785o.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.InterfaceC1007a
        public void cancel() {
            this.f3583p.mo9338d(this);
            this.f3584q.m4665e(this);
            InterfaceC1007a interfaceC1007a = this.f3585r;
            if (interfaceC1007a != null) {
                interfaceC1007a.cancel();
                this.f3585r = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes2.dex */
    public class C1006a implements InterfaceC1007a {

        /* renamed from: p */
        private final AbstractC1011e f3587p;

        C1006a(AbstractC1011e abstractC1011e) {
            this.f3587p = abstractC1011e;
        }

        @Override // androidx.activity.InterfaceC1007a
        public void cancel() {
            OnBackPressedDispatcher.this.f3582b.remove(this.f3587p);
            this.f3587p.m4665e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f3581a = runnable;
    }

    /* renamed from: a */
    public void m4656a(InterfaceC1801w interfaceC1801w, AbstractC1011e abstractC1011e) {
        AbstractC1785o lifecycle = interfaceC1801w.getLifecycle();
        if (lifecycle.mo9336b() == AbstractC1785o.b.DESTROYED) {
            return;
        }
        abstractC1011e.m4661a(new LifecycleOnBackPressedCancellable(lifecycle, abstractC1011e));
    }

    /* renamed from: b */
    InterfaceC1007a m4657b(AbstractC1011e abstractC1011e) {
        this.f3582b.add(abstractC1011e);
        C1006a c1006a = new C1006a(abstractC1011e);
        abstractC1011e.m4661a(c1006a);
        return c1006a;
    }

    /* renamed from: c */
    public void m4658c() {
        Iterator descendingIterator = this.f3582b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC1011e abstractC1011e = (AbstractC1011e) descendingIterator.next();
            if (abstractC1011e.m4663c()) {
                abstractC1011e.mo4662b();
                return;
            }
        }
        Runnable runnable = this.f3581a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
