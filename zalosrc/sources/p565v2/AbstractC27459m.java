package p565v2;

import androidx.lifecycle.C1755a0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.LiveData;
import p411p0.InterfaceC24593a;
import p595w2.InterfaceC28696c;

/* renamed from: v2.m */
/* loaded from: classes2.dex */
public abstract class AbstractC27459m {

    /* renamed from: v2.m$a */
    /* loaded from: classes2.dex */
    class a implements InterfaceC1764d0 {

        /* renamed from: p */
        Object f129191p = null;

        /* renamed from: q */
        final /* synthetic */ InterfaceC28696c f129192q;

        /* renamed from: r */
        final /* synthetic */ Object f129193r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC24593a f129194s;

        /* renamed from: t */
        final /* synthetic */ C1755a0 f129195t;

        /* renamed from: v2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC33007a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ Object f129196p;

            RunnableC33007a(Object obj) {
                this.f129196p = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f129193r) {
                    try {
                        Object apply = a.this.f129194s.apply(this.f129196p);
                        a aVar = a.this;
                        Object obj = aVar.f129191p;
                        if (obj == null && apply != null) {
                            aVar.f129191p = apply;
                            aVar.f129195t.mo9221n(apply);
                        } else if (obj != null && !obj.equals(apply)) {
                            a aVar2 = a.this;
                            aVar2.f129191p = apply;
                            aVar2.f129195t.mo9221n(apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        a(InterfaceC28696c interfaceC28696c, Object obj, InterfaceC24593a interfaceC24593a, C1755a0 c1755a0) {
            this.f129192q = interfaceC28696c;
            this.f129193r = obj;
            this.f129194s = interfaceC24593a;
            this.f129195t = c1755a0;
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public void mo8524qp(Object obj) {
            this.f129192q.mo143752d(new RunnableC33007a(obj));
        }
    }

    /* renamed from: a */
    public static LiveData m140505a(LiveData liveData, InterfaceC24593a interfaceC24593a, InterfaceC28696c interfaceC28696c) {
        Object obj = new Object();
        C1755a0 c1755a0 = new C1755a0();
        c1755a0.m9256r(liveData, new a(interfaceC28696c, obj, interfaceC24593a, c1755a0));
        return c1755a0;
    }
}
