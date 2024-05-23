package p052c8;

import androidx.appcompat.widget.AbstractC1158c0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p636x8.AbstractC29471a;
import p636x8.InterfaceC29472b;
import p636x8.InterfaceC29473c;
import p636x8.InterfaceC29474d;

/* renamed from: c8.t */
/* loaded from: classes.dex */
class C3357t implements InterfaceC29474d, InterfaceC29473c {

    /* renamed from: a */
    private final Map f14217a = new HashMap();

    /* renamed from: b */
    private Queue f14218b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f14219c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3357t(Executor executor) {
        this.f14219c = executor;
    }

    /* renamed from: e */
    private synchronized Set m16918e(AbstractC29471a abstractC29471a) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m16919f(Map.Entry entry, AbstractC29471a abstractC29471a) {
        ((InterfaceC29472b) entry.getKey()).mo941a(abstractC29471a);
    }

    @Override // p636x8.InterfaceC29474d
    /* renamed from: a */
    public synchronized void mo16920a(Class cls, Executor executor, InterfaceC29472b interfaceC29472b) {
        try {
            AbstractC3336a0.m16812b(cls);
            AbstractC3336a0.m16812b(interfaceC29472b);
            AbstractC3336a0.m16812b(executor);
            if (!this.f14217a.containsKey(cls)) {
                this.f14217a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f14217a.get(cls)).put(interfaceC29472b, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p636x8.InterfaceC29474d
    /* renamed from: b */
    public void mo16921b(Class cls, InterfaceC29472b interfaceC29472b) {
        mo16920a(cls, this.f14219c, interfaceC29472b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m16922d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f14218b;
                if (queue != null) {
                    this.f14218b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC1158c0.m5500a(it.next());
                m16923g(null);
            }
        }
    }

    /* renamed from: g */
    public void m16923g(final AbstractC29471a abstractC29471a) {
        AbstractC3336a0.m16812b(abstractC29471a);
        synchronized (this) {
            try {
                Queue queue = this.f14218b;
                if (queue != null) {
                    queue.add(abstractC29471a);
                    return;
                }
                for (final Map.Entry entry : m16918e(abstractC29471a)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC29471a) { // from class: c8.s

                        /* renamed from: p */
                        public final /* synthetic */ Map.Entry f14216p;

                        @Override // java.lang.Runnable
                        public final void run() {
                            C3357t.m16919f(this.f14216p, null);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
