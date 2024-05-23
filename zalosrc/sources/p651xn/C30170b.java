package p651xn;

import com.zing.zalo.feed.formpostfeed.data.C8453a;
import com.zing.zalo.feed.formpostfeed.data.C8454b;
import com.zing.zalo.feed.formpostfeed.data.C8455c;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: xn.b */
/* loaded from: classes4.dex */
public final class C30170b {

    /* renamed from: a */
    private final C8454b f140179a;

    /* renamed from: b */
    private final C8455c f140180b;

    /* renamed from: c */
    private final CoroutineDispatcher f140181c;

    /* renamed from: xn.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f140182t;

        /* renamed from: u */
        Object f140183u;

        /* renamed from: v */
        int f140184v;

        /* renamed from: w */
        private /* synthetic */ Object f140185w;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f140185w = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C8453a c8453a;
            C19059j0 c19059j0;
            C8453a c8453a2;
            Throwable th2;
            Object m45000a;
            C30170b c30170b;
            Object m129218b;
            C8453a c8453a3;
            Throwable m129221e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f140184v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        c30170b = (C30170b) this.f140183u;
                        c19059j0 = (C19059j0) this.f140182t;
                        c8453a2 = (C8453a) this.f140185w;
                        try {
                            AbstractC24862s.m129228b(obj);
                            C8453a c8453a4 = (C8453a) obj;
                            c30170b.f140179a.m44999b(c8453a4);
                            c19059j0.f94941p = c8453a4;
                            m129218b = C24861r.m129218b(C24848g0.f119245a);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C24861r.a aVar = C24861r.f119264q;
                            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                            m129221e = C24861r.m129221e(m129218b);
                            if (m129221e != null) {
                            }
                            c8453a = c8453a2;
                            c8453a3 = (C8453a) c19059j0.f94941p;
                            if (c8453a3 == null) {
                            }
                        }
                        m129221e = C24861r.m129221e(m129218b);
                        if (m129221e != null) {
                            AbstractC20110a.f98889a.mo104552e(m129221e);
                        }
                        c8453a = c8453a2;
                        c8453a3 = (C8453a) c19059j0.f94941p;
                        if (c8453a3 == null) {
                            return c8453a3;
                        }
                        return c8453a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f140185w;
                C30170b c30170b2 = C30170b.this;
                this.f140185w = coroutineScope;
                this.f140184v = 1;
                obj = c30170b2.m148806d(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            c8453a = (C8453a) obj;
            c19059j0 = new C19059j0();
            if (c8453a.m44995c()) {
                C30170b c30170b3 = C30170b.this;
                try {
                    C24861r.a aVar2 = C24861r.f119264q;
                    C8455c c8455c = c30170b3.f140180b;
                    this.f140185w = c8453a;
                    this.f140182t = c19059j0;
                    this.f140183u = c30170b3;
                    this.f140184v = 2;
                    m45000a = c8455c.m45000a(this);
                } catch (Throwable th4) {
                    c8453a2 = c8453a;
                    th2 = th4;
                    C24861r.a aVar3 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                    m129221e = C24861r.m129221e(m129218b);
                    if (m129221e != null) {
                    }
                    c8453a = c8453a2;
                    c8453a3 = (C8453a) c19059j0.f94941p;
                    if (c8453a3 == null) {
                    }
                }
                if (m45000a == m142578e) {
                    return m142578e;
                }
                c30170b = c30170b3;
                c8453a2 = c8453a;
                obj = m45000a;
                C8453a c8453a42 = (C8453a) obj;
                c30170b.f140179a.m44999b(c8453a42);
                c19059j0.f94941p = c8453a42;
                m129218b = C24861r.m129218b(C24848g0.f119245a);
                m129221e = C24861r.m129221e(m129218b);
                if (m129221e != null) {
                }
                c8453a = c8453a2;
            }
            c8453a3 = (C8453a) c19059j0.f94941p;
            if (c8453a3 == null) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xn.b$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f140187t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f140187t == 0) {
                AbstractC24862s.m129228b(obj);
                return C30170b.this.f140179a.m44998a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C30170b(C8454b c8454b, C8455c c8455c, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(c8454b, "localSource");
        AbstractC19074t.m100208f(c8455c, "remoteSource");
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f140179a = c8454b;
        this.f140180b = c8455c;
        this.f140181c = coroutineDispatcher;
    }

    /* renamed from: c */
    public final Object m148805c(Continuation continuation) {
        return BuildersKt.m112534g(this.f140181c, new a(null), continuation);
    }

    /* renamed from: d */
    public final Object m148806d(Continuation continuation) {
        return BuildersKt.m112534g(this.f140181c, new b(null), continuation);
    }

    public /* synthetic */ C30170b(C8454b c8454b, C8455c c8455c, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C8454b() : c8454b, (i11 & 2) != 0 ? new C8455c() : c8455c, (i11 & 4) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}
