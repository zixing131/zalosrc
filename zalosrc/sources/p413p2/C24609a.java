package p413p2;

import android.app.Activity;
import androidx.core.util.InterfaceC1479a;
import androidx.window.layout.InterfaceC2092a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: p2.a */
/* loaded from: classes2.dex */
public final class C24609a implements InterfaceC2092a0 {

    /* renamed from: b */
    private final InterfaceC2092a0 f118403b;

    /* renamed from: c */
    private final ReentrantLock f118404c;

    /* renamed from: d */
    private final Map f118405d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.a$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f118406t;

        /* renamed from: u */
        final /* synthetic */ Flow f118407u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC1479a f118408v;

        /* renamed from: p2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32921a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ InterfaceC1479a f118409p;

            public C32921a(InterfaceC1479a interfaceC1479a) {
                this.f118409p = interfaceC1479a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public Object mo12109b(Object obj, Continuation continuation) {
                this.f118409p.accept(obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow flow, InterfaceC1479a interfaceC1479a, Continuation continuation) {
            super(2, continuation);
            this.f118407u = flow;
            this.f118408v = interfaceC1479a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f118407u, this.f118408v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f118406t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Flow flow = this.f118407u;
                C32921a c32921a = new C32921a(this.f118408v);
                this.f118406t = 1;
                if (flow.mo97893a(c32921a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24609a(InterfaceC2092a0 interfaceC2092a0) {
        AbstractC19074t.m100208f(interfaceC2092a0, "tracker");
        this.f118403b = interfaceC2092a0;
        this.f118404c = new ReentrantLock();
        this.f118405d = new LinkedHashMap();
    }

    /* renamed from: b */
    private final void m128102b(Executor executor, InterfaceC1479a interfaceC1479a, Flow flow) {
        Job m112540d;
        ReentrantLock reentrantLock = this.f118404c;
        reentrantLock.lock();
        try {
            if (this.f118405d.get(interfaceC1479a) == null) {
                CoroutineScope m112637a = CoroutineScopeKt.m112637a(ExecutorsKt.m112727a(executor));
                Map map = this.f118405d;
                m112540d = BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(flow, interfaceC1479a, null), 3, null);
                map.put(interfaceC1479a, m112540d);
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: d */
    private final void m128103d(InterfaceC1479a interfaceC1479a) {
        ReentrantLock reentrantLock = this.f118404c;
        reentrantLock.lock();
        try {
            Job job = (Job) this.f118405d.get(interfaceC1479a);
            if (job != null) {
                Job.DefaultImpls.m112740a(job, null, 1, null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.InterfaceC2092a0
    /* renamed from: a */
    public Flow mo11324a(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        return this.f118403b.mo11324a(activity);
    }

    /* renamed from: c */
    public final void m128104c(Activity activity, Executor executor, InterfaceC1479a interfaceC1479a) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(executor, "executor");
        AbstractC19074t.m100208f(interfaceC1479a, "consumer");
        m128102b(executor, interfaceC1479a, this.f118403b.mo11324a(activity));
    }

    /* renamed from: e */
    public final void m128105e(InterfaceC1479a interfaceC1479a) {
        AbstractC19074t.m100208f(interfaceC1479a, "consumer");
        m128103d(interfaceC1479a);
    }
}
