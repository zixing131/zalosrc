package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.InterfaceC1479a;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import pm0.C24848g0;

/* renamed from: androidx.window.layout.p */
/* loaded from: classes2.dex */
public final class C2118p implements InterfaceC2127y {

    /* renamed from: a */
    private final WindowLayoutComponent f8982a;

    /* renamed from: b */
    private final ReentrantLock f8983b;

    /* renamed from: c */
    private final Map f8984c;

    /* renamed from: d */
    private final Map f8985d;

    /* renamed from: androidx.window.layout.p$a */
    /* loaded from: classes2.dex */
    private static final class a implements Consumer {

        /* renamed from: a */
        private final Activity f8986a;

        /* renamed from: b */
        private final ReentrantLock f8987b;

        /* renamed from: c */
        private C2102f0 f8988c;

        /* renamed from: d */
        private final Set f8989d;

        public a(Activity activity) {
            AbstractC19074t.m100208f(activity, "activity");
            this.f8986a = activity;
            this.f8987b = new ReentrantLock();
            this.f8989d = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            AbstractC19074t.m100208f(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f8987b;
            reentrantLock.lock();
            try {
                this.f8988c = C2119q.f8990a.m11370b(this.f8986a, windowLayoutInfo);
                Iterator it = this.f8989d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1479a) it.next()).accept(this.f8988c);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        /* renamed from: b */
        public final void m11365b(InterfaceC1479a interfaceC1479a) {
            AbstractC19074t.m100208f(interfaceC1479a, "listener");
            ReentrantLock reentrantLock = this.f8987b;
            reentrantLock.lock();
            try {
                C2102f0 c2102f0 = this.f8988c;
                if (c2102f0 != null) {
                    interfaceC1479a.accept(c2102f0);
                }
                this.f8989d.add(interfaceC1479a);
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: c */
        public final boolean m11366c() {
            return this.f8989d.isEmpty();
        }

        /* renamed from: d */
        public final void m11367d(InterfaceC1479a interfaceC1479a) {
            AbstractC19074t.m100208f(interfaceC1479a, "listener");
            ReentrantLock reentrantLock = this.f8987b;
            reentrantLock.lock();
            try {
                this.f8989d.remove(interfaceC1479a);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public C2118p(WindowLayoutComponent windowLayoutComponent) {
        AbstractC19074t.m100208f(windowLayoutComponent, "component");
        this.f8982a = windowLayoutComponent;
        this.f8983b = new ReentrantLock();
        this.f8984c = new LinkedHashMap();
        this.f8985d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.InterfaceC2127y
    /* renamed from: a */
    public void mo11362a(Activity activity, Executor executor, InterfaceC1479a interfaceC1479a) {
        C24848g0 c24848g0;
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(executor, "executor");
        AbstractC19074t.m100208f(interfaceC1479a, "callback");
        ReentrantLock reentrantLock = this.f8983b;
        reentrantLock.lock();
        try {
            a aVar = (a) this.f8984c.get(activity);
            if (aVar == null) {
                c24848g0 = null;
            } else {
                aVar.m11365b(interfaceC1479a);
                this.f8985d.put(interfaceC1479a, activity);
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                a aVar2 = new a(activity);
                this.f8984c.put(activity, aVar2);
                this.f8985d.put(interfaceC1479a, activity);
                aVar2.m11365b(interfaceC1479a);
                this.f8982a.addWindowLayoutInfoListener(activity, AbstractC2117o.m11361a(aVar2));
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.window.layout.InterfaceC2127y
    /* renamed from: b */
    public void mo11363b(InterfaceC1479a interfaceC1479a) {
        AbstractC19074t.m100208f(interfaceC1479a, "callback");
        ReentrantLock reentrantLock = this.f8983b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f8985d.get(interfaceC1479a);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            a aVar = (a) this.f8984c.get(activity);
            if (aVar == null) {
                reentrantLock.unlock();
                return;
            }
            aVar.m11367d(interfaceC1479a);
            if (aVar.m11366c()) {
                this.f8982a.removeWindowLayoutInfoListener(AbstractC2117o.m11361a(aVar));
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
