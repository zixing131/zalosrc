package p107dq;

import am.AbstractC0924m0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import on0.AbstractC24334o;
import on0.AbstractC24341v;
import p173fz.C19172a;
import p185gc.AbstractC19379c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: dq.h */
/* loaded from: classes4.dex */
public final class C18052h extends AbstractC19379c {

    /* renamed from: a */
    private final CoroutineDispatcher f91349a;

    /* renamed from: dq.h$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f91350t;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:            if (r0 != false) goto L8;     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            boolean m127128x;
            AbstractC28298d.m142578e();
            if (this.f91350t == 0) {
                AbstractC24862s.m129228b(obj);
                String m3442T = AbstractC0924m0.m3442T();
                if (m3442T != null) {
                    m127128x = AbstractC24341v.m127128x(m3442T);
                }
                m3442T = AbstractC24334o.m127098f("\n                    {\n                        \"enable_layout_multi_photo\":" + C19172a.m100600k("social@feed_multi_photo@enable_layout_multi_photo", 0) + ",\n                        \"default_picked_layout_id\":" + C19172a.m100600k("social@feed_multi_photo@default_picked_layout_id", 1) + ",\n                        \"layout_list\":[\n                            {\n                                \"layout_id\":1,\n                                \"theme_id\":1\n                            },\n                            {\n                                \"layout_id\":2,\n                                \"theme_id\":1\n                            },\n                            {\n                                \"layout_id\":3,\n                                \"theme_id\":1\n                            }\n                        ]\n                    }\n                ");
                AbstractC19074t.m100205c(m3442T);
                return m3442T;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C18052h(CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(coroutineDispatcher, "dispatcher");
        this.f91349a = coroutineDispatcher;
    }

    @Override // p185gc.AbstractC19379c
    /* renamed from: b */
    protected Object mo90291b(Continuation continuation) {
        return BuildersKt.m112534g(this.f91349a, new a(null), continuation);
    }

    public /* synthetic */ C18052h(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}
