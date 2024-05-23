package p083cq;

import aq.C2288h;
import bg0.C2797c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p083cq.C17561h;
import p185gc.AbstractC19381e;
import p458qr.AbstractC25468a;
import p716zh.C32078q7;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: cq.h */
/* loaded from: classes4.dex */
public final class C17561h extends AbstractC19381e {

    /* renamed from: a */
    private final C2288h f89454a;

    /* renamed from: b */
    private final C2797c f89455b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cq.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f89456t;

        /* renamed from: u */
        private /* synthetic */ Object f89457u;

        a(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m93512t(C17561h c17561h, ProducerScope producerScope) {
            List<C32078q7> m131187O0;
            try {
                HashMap mo12064h = c17561h.f89454a.mo12064h();
                C2288h c2288h = c17561h.f89454a;
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                m131187O0 = AbstractC25332a0.m131187O0(c2288h.mo12065i(str));
                if (mo12064h.size() > 0) {
                    for (C32078q7 c32078q7 : m131187O0) {
                        String valueOf = String.valueOf(c32078q7.m154749L());
                        c32078q7.f147742H = mo12064h.containsKey(c32078q7.m154738A() + "_" + valueOf + "_" + c32078q7.m154761r());
                    }
                }
                producerScope.mo112912p(new AbstractC25468a.c(m131187O0));
            } catch (Exception e11) {
                producerScope.mo112912p(new AbstractC25468a.a(e11));
            }
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f89457u = obj;
            return aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f89456t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                final ProducerScope producerScope = (ProducerScope) this.f89457u;
                C2797c c2797c = C17561h.this.f89455b;
                final C17561h c17561h = C17561h.this;
                c2797c.mo13474a(new Runnable() { // from class: cq.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C17561h.a.m93512t(C17561h.this, producerScope);
                    }
                });
                this.f89456t = 1;
                if (ProduceKt.m113185b(producerScope, null, this, 1, null) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((a) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C17561h(C2288h c2288h, C2797c c2797c) {
        AbstractC19074t.m100208f(c2288h, "repository");
        AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
        this.f89454a = c2288h;
        this.f89455b = c2797c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19381e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Flow mo93498b() {
        return FlowKt.m113287e(new a(null));
    }
}
