package pl;

import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p487rl.C25820a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: pl.j */
/* loaded from: classes3.dex */
public final class C24819j implements InterfaceC24818i {

    /* renamed from: a */
    private final CoroutineDispatcher f119154a;

    /* renamed from: b */
    private final ConcurrentHashMap f119155b;

    /* renamed from: c */
    private final Map f119156c;

    /* renamed from: pl.j$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119157t;

        /* renamed from: v */
        final /* synthetic */ C25820a f119159v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C25820a c25820a, Continuation continuation) {
            super(2, continuation);
            this.f119159v = c25820a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f119159v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119157t == 0) {
                AbstractC24862s.m129228b(obj);
                C24819j.this.f119155b.putIfAbsent(AbstractC29094b.m145341c(this.f119159v.m133135b()), this.f119159v);
                C24819j.this.m129060g().m129042e(this.f119159v);
                C24819j.this.f119156c.remove(CoreUtility.f89233i);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24819j(CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f119154a = coroutineDispatcher;
        this.f119155b = new ConcurrentHashMap();
        this.f119156c = Collections.synchronizedMap(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final C24816g m129060g() {
        return C24816g.Companion.m129043a();
    }

    @Override // pl.InterfaceC24818i
    /* renamed from: a */
    public void mo129054a() {
        this.f119156c.remove(CoreUtility.f89233i);
        this.f119155b.clear();
    }

    @Override // pl.InterfaceC24818i
    /* renamed from: b */
    public Object mo129055b(C25820a c25820a, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119154a, new a(c25820a, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24818i
    /* renamed from: c */
    public Object mo129056c(Continuation continuation) {
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            Map map = this.f119156c;
            AbstractC19074t.m100207e(map, "latestCloudKeys");
            Object obj = map.get(str);
            if (obj == null) {
                C25820a m129041c = m129060g().m129041c();
                map.put(str, m129041c);
                return m129041c;
            }
            return obj;
        }
        return null;
    }

    public /* synthetic */ C24819j(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}
