package be0;

import be0.C2781f;
import be0.C2782g;
import be0.C2783h;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import mh.AbstractC23295a;
import mh.C23298d;
import p185gc.AbstractC19378b;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: be0.i */
/* loaded from: classes4.dex */
public class C2784i extends AbstractC19378b {

    /* renamed from: a */
    private final C23298d f11070a;

    /* renamed from: b */
    private final CoroutineDispatcher f11071b;

    /* renamed from: be0.i$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f11072a;

        /* renamed from: b */
        private final C17945a0 f11073b;

        public a(String str, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(str, "conversationId");
            this.f11072a = str;
            this.f11073b = c17945a0;
        }

        /* renamed from: a */
        public final String m13411a() {
            return this.f11072a;
        }

        /* renamed from: b */
        public final C17945a0 m13412b() {
            return this.f11073b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f11072a, aVar.f11072a) && AbstractC19074t.m100204b(this.f11073b, aVar.f11073b);
        }

        public int hashCode() {
            int hashCode = this.f11072a.hashCode() * 31;
            C17945a0 c17945a0 = this.f11073b;
            return hashCode + (c17945a0 == null ? 0 : c17945a0.hashCode());
        }

        public String toString() {
            return "Params(conversationId=" + this.f11072a + ", message=" + this.f11073b + ")";
        }
    }

    /* renamed from: be0.i$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C17945a0 f11074a;

        public b(C17945a0 c17945a0) {
            this.f11074a = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m13413a() {
            return this.f11074a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f11074a, ((b) obj).f11074a);
        }

        public int hashCode() {
            C17945a0 c17945a0 = this.f11074a;
            if (c17945a0 == null) {
                return 0;
            }
            return c17945a0.hashCode();
        }

        public String toString() {
            return "Result(preloadMessage=" + this.f11074a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: be0.i$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f11075t;

        /* renamed from: u */
        final /* synthetic */ a f11076u;

        /* renamed from: v */
        final /* synthetic */ C2784i f11077v;

        /* renamed from: w */
        final /* synthetic */ AbstractC19378b.a f11078w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, C2784i c2784i, AbstractC19378b.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f11076u = aVar;
            this.f11077v = c2784i;
            this.f11078w = aVar2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f11076u, this.f11077v, this.f11078w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00b7 A[Catch: Exception -> 0x0019, TRY_LEAVE, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0014, B:9:0x00b3, B:11:0x00b7, B:18:0x0024, B:19:0x0099, B:21:0x00a1, B:24:0x0028, B:25:0x007e, B:27:0x0084, B:30:0x002c, B:31:0x004c, B:33:0x0052, B:35:0x005e, B:37:0x0066, B:41:0x0033), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0014, B:9:0x00b3, B:11:0x00b7, B:18:0x0024, B:19:0x0099, B:21:0x00a1, B:24:0x0028, B:25:0x007e, B:27:0x0084, B:30:0x002c, B:31:0x004c, B:33:0x0052, B:35:0x005e, B:37:0x0066, B:41:0x0033), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0014, B:9:0x00b3, B:11:0x00b7, B:18:0x0024, B:19:0x0099, B:21:0x00a1, B:24:0x0028, B:25:0x007e, B:27:0x0084, B:30:0x002c, B:31:0x004c, B:33:0x0052, B:35:0x005e, B:37:0x0066, B:41:0x0033), top: B:2:0x000a }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C17945a0 m13412b;
            AbstractC19378b.a aVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f11075t;
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                AbstractC19378b.a aVar2 = this.f11078w;
                if (aVar2 != null) {
                    aVar2.mo1004b();
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                                aVar = this.f11078w;
                                if (aVar != null) {
                                    aVar.onSuccess(new b(this.f11076u.m13412b()));
                                }
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        m13412b = this.f11076u.m13412b();
                        if (m13412b != null) {
                            C2783h m120629W0 = AbstractC23306f.m120629W0();
                            C2783h.a aVar3 = new C2783h.a(m13412b);
                            this.f11075t = 4;
                            if (m120629W0.m101507a(aVar3, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        aVar = this.f11078w;
                        if (aVar != null) {
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                    if (AbstractC23295a.m120436c()) {
                        C23298d c23298d = this.f11077v.f11070a;
                        String m13411a = this.f11076u.m13411a();
                        this.f11075t = 3;
                        if (c23298d.m120473f(m13411a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    m13412b = this.f11076u.m13412b();
                    if (m13412b != null) {
                    }
                    aVar = this.f11078w;
                    if (aVar != null) {
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C2781f m120710s0 = AbstractC23306f.m120710s0();
                C2781f.a aVar4 = new C2781f.a(this.f11076u.m13411a(), null, 2, null);
                this.f11075t = 1;
                if (m120710s0.m101507a(aVar4, this) == m142578e) {
                    return m142578e;
                }
            }
            if (AbstractC23295a.m120434a() && AbstractC25495a.m132079d(this.f11076u.m13411a()) && this.f11076u.m13412b() != null) {
                C2782g m120590J0 = AbstractC23306f.m120590J0();
                C2782g.a aVar5 = new C2782g.a(this.f11076u.m13412b());
                this.f11075t = 2;
                if (m120590J0.m101507a(aVar5, this) == m142578e) {
                    return m142578e;
                }
            }
            if (AbstractC23295a.m120436c()) {
            }
            m13412b = this.f11076u.m13412b();
            if (m13412b != null) {
            }
            aVar = this.f11078w;
            if (aVar != null) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C2784i(C23298d c23298d, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        AbstractC19074t.m100208f(coroutineDispatcher, "dispatcherScope");
        this.f11070a = c23298d;
        this.f11071b = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19378b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo1884d(a aVar, AbstractC19378b.a aVar2) {
        AbstractC19074t.m100208f(aVar, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(this.f11071b), null, null, new c(aVar, this, aVar2, null), 3, null);
    }
}
