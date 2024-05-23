package p165fp;

import bo.C3020p0;
import bo.C3023p3;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p138ep.C18535e;
import p165fp.C19095a;
import p185gc.AbstractC19384h;
import p398oo.C24371m0;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: fp.d */
/* loaded from: classes4.dex */
public final class C19098d extends AbstractC19384h {

    /* renamed from: a */
    private final C18535e f95060a;

    /* renamed from: b */
    private final C24371m0 f95061b;

    /* renamed from: c */
    private final C19095a f95062c;

    /* renamed from: fp.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private C3020p0 f95063a;

        public a(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            this.f95063a = c3020p0;
        }

        /* renamed from: a */
        public final C3020p0 m100318a() {
            return this.f95063a;
        }

        /* renamed from: b */
        public final void m100319b(C3020p0 c3020p0) {
            AbstractC19074t.m100208f(c3020p0, "<set-?>");
            this.f95063a = c3020p0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f95063a, ((a) obj).f95063a);
        }

        public int hashCode() {
            return this.f95063a.hashCode();
        }

        public String toString() {
            return "FeedReferenceKeeper(feedItem=" + this.f95063a + ")";
        }
    }

    /* renamed from: fp.d$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f95064a;

        /* renamed from: b */
        private final String f95065b;

        /* renamed from: c */
        private final a f95066c;

        public b(String str, String str2, a aVar) {
            AbstractC19074t.m100208f(str, "zVidId");
            AbstractC19074t.m100208f(str2, "feedId");
            this.f95064a = str;
            this.f95065b = str2;
            this.f95066c = aVar;
        }

        /* renamed from: a */
        public final String m100320a() {
            return this.f95065b;
        }

        /* renamed from: b */
        public final a m100321b() {
            return this.f95066c;
        }

        /* renamed from: c */
        public final String m100322c() {
            return this.f95064a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f95064a, bVar.f95064a) && AbstractC19074t.m100204b(this.f95065b, bVar.f95065b) && AbstractC19074t.m100204b(this.f95066c, bVar.f95066c);
        }

        public int hashCode() {
            int hashCode = ((this.f95064a.hashCode() * 31) + this.f95065b.hashCode()) * 31;
            a aVar = this.f95066c;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Param(zVidId=" + this.f95064a + ", feedId=" + this.f95065b + ", referenceKeeper=" + this.f95066c + ")";
        }
    }

    /* renamed from: fp.d$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final C3023p3 f95067a;

        public c(C3023p3 c3023p3) {
            AbstractC19074t.m100208f(c3023p3, "zShortVideoInfo");
            this.f95067a = c3023p3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f95067a, ((c) obj).f95067a);
        }

        public int hashCode() {
            return this.f95067a.hashCode();
        }

        public String toString() {
            return "Result(zShortVideoInfo=" + this.f95067a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fp.d$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95068t;

        /* renamed from: u */
        private /* synthetic */ Object f95069u;

        /* renamed from: w */
        final /* synthetic */ b f95071w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f95071w = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f95071w, continuation);
            dVar.f95069u = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            a m100321b;
            C3020p0 c3020p0;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95068t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f95069u;
                    AbstractC24862s.m129228b(obj);
                    C3023p3 c3023p3 = (C3023p3) obj;
                    C19098d.this.m100314c().m101508a(new C19095a.a(C19098d.this.m100316e().m127478n(this.f95071w.m100320a()), c3023p3));
                    C19095a m100314c = C19098d.this.m100314c();
                    m100321b = this.f95071w.m100321b();
                    if (m100321b == null) {
                        c3020p0 = m100321b.m100318a();
                    } else {
                        c3020p0 = null;
                    }
                    m100314c.m101508a(new C19095a.a(c3020p0, c3023p3));
                    cVar = new AbstractC25468a.c(new c(c3023p3));
                    this.f95069u = null;
                    this.f95068t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f95069u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f95069u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f95069u = flowCollector2;
                this.f95068t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C18535e m100315d = C19098d.this.m100315d();
            String m100322c = this.f95071w.m100322c();
            this.f95069u = flowCollector;
            this.f95068t = 2;
            obj = m100315d.mo97922a(m100322c, this);
            if (obj == m142578e) {
                return m142578e;
            }
            C3023p3 c3023p32 = (C3023p3) obj;
            C19098d.this.m100314c().m101508a(new C19095a.a(C19098d.this.m100316e().m127478n(this.f95071w.m100320a()), c3023p32));
            C19095a m100314c2 = C19098d.this.m100314c();
            m100321b = this.f95071w.m100321b();
            if (m100321b == null) {
            }
            m100314c2.m101508a(new C19095a.a(c3020p0, c3023p32));
            cVar = new AbstractC25468a.c(new c(c3023p32));
            this.f95069u = null;
            this.f95068t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((d) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C19098d(C18535e c18535e, C24371m0 c24371m0, C19095a c19095a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18535e.Companion.m97930a() : c18535e, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : c24371m0, (i11 & 4) != 0 ? new C19095a(null, null, 3, null) : c19095a);
    }

    /* renamed from: c */
    public final C19095a m100314c() {
        return this.f95062c;
    }

    /* renamed from: d */
    public final C18535e m100315d() {
        return this.f95060a;
    }

    /* renamed from: e */
    public final C24371m0 m100316e() {
        return this.f95061b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        return FlowKt.m113265A(new d(bVar, null));
    }

    public C19098d(C18535e c18535e, C24371m0 c24371m0, C19095a c19095a) {
        AbstractC19074t.m100208f(c18535e, "repo");
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        AbstractC19074t.m100208f(c19095a, "attachZShortVideoInfoToFeedItemUseCase");
        this.f95060a = c18535e;
        this.f95061b = c24371m0;
        this.f95062c = c19095a;
    }
}
