package p165fp;

import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import bo.C3028q3;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p138ep.C18535e;
import p165fp.C19095a;
import p165fp.C19098d;
import p185gc.AbstractC19384h;
import p398oo.C24371m0;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: fp.c */
/* loaded from: classes4.dex */
public final class C19097c extends AbstractC19384h {

    /* renamed from: a */
    private final C18535e f95048a;

    /* renamed from: b */
    private final C24371m0 f95049b;

    /* renamed from: c */
    private final C19095a f95050c;

    /* renamed from: fp.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95051a;

        /* renamed from: b */
        private final String f95052b;

        /* renamed from: c */
        private final String f95053c;

        /* renamed from: d */
        private final C19098d.a f95054d;

        public a(String str, String str2, String str3, C19098d.a aVar) {
            AbstractC19074t.m100208f(str, "zVidId");
            AbstractC19074t.m100208f(str2, "originalUrl");
            AbstractC19074t.m100208f(str3, "feedId");
            this.f95051a = str;
            this.f95052b = str2;
            this.f95053c = str3;
            this.f95054d = aVar;
        }

        /* renamed from: a */
        public final String m100309a() {
            return this.f95053c;
        }

        /* renamed from: b */
        public final String m100310b() {
            return this.f95052b;
        }

        /* renamed from: c */
        public final C19098d.a m100311c() {
            return this.f95054d;
        }

        /* renamed from: d */
        public final String m100312d() {
            return this.f95051a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95051a, aVar.f95051a) && AbstractC19074t.m100204b(this.f95052b, aVar.f95052b) && AbstractC19074t.m100204b(this.f95053c, aVar.f95053c) && AbstractC19074t.m100204b(this.f95054d, aVar.f95054d);
        }

        public int hashCode() {
            int hashCode = ((((this.f95051a.hashCode() * 31) + this.f95052b.hashCode()) * 31) + this.f95053c.hashCode()) * 31;
            C19098d.a aVar = this.f95054d;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Param(zVidId=" + this.f95051a + ", originalUrl=" + this.f95052b + ", feedId=" + this.f95053c + ", referenceKeeper=" + this.f95054d + ")";
        }
    }

    /* renamed from: fp.c$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C3028q3 f95055a;

        public b(C3028q3 c3028q3) {
            AbstractC19074t.m100208f(c3028q3, "zShortVideoStreaming");
            this.f95055a = c3028q3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f95055a, ((b) obj).f95055a);
        }

        public int hashCode() {
            return this.f95055a.hashCode();
        }

        public String toString() {
            return "Result(zShortVideoStreaming=" + this.f95055a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fp.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95056t;

        /* renamed from: u */
        private /* synthetic */ Object f95057u;

        /* renamed from: w */
        final /* synthetic */ a f95059w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f95059w = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f95059w, continuation);
            cVar.f95057u = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            C3020p0 m127478n;
            C3023p3 c3023p3;
            AbstractC25468a.c cVar;
            C3020p0 c3020p0;
            C3025q0 c3025q0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95056t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f95057u;
                    AbstractC24862s.m129228b(obj);
                    C3028q3 c3028q3 = (C3028q3) obj;
                    m127478n = C19097c.this.m100307e().m127478n(this.f95059w.m100309a());
                    if (m127478n == null && (c3025q0 = m127478n.f12023C) != null) {
                        c3023p3 = c3025q0.f12100I;
                    } else {
                        c3023p3 = null;
                    }
                    if (c3023p3 != null) {
                        c3023p3.m14560q(c3028q3.m14577a());
                        C19097c.this.m100305c().m101508a(new C19095a.a(m127478n, c3023p3));
                        C19095a m100305c = C19097c.this.m100305c();
                        C19098d.a m100311c = this.f95059w.m100311c();
                        if (m100311c != null) {
                            c3020p0 = m100311c.m100318a();
                        } else {
                            c3020p0 = null;
                        }
                        m100305c.m101508a(new C19095a.a(c3020p0, c3023p3));
                    }
                    cVar = new AbstractC25468a.c(new b(c3028q3));
                    this.f95057u = null;
                    this.f95056t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f95057u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f95057u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f95057u = flowCollector2;
                this.f95056t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            C18535e m100306d = C19097c.this.m100306d();
            String m100312d = this.f95059w.m100312d();
            String m100310b = this.f95059w.m100310b();
            this.f95057u = flowCollector;
            this.f95056t = 2;
            obj = m100306d.mo97923b(m100312d, m100310b, this);
            if (obj == m142578e) {
                return m142578e;
            }
            C3028q3 c3028q32 = (C3028q3) obj;
            m127478n = C19097c.this.m100307e().m127478n(this.f95059w.m100309a());
            if (m127478n == null) {
            }
            c3023p3 = null;
            if (c3023p3 != null) {
            }
            cVar = new AbstractC25468a.c(new b(c3028q32));
            this.f95057u = null;
            this.f95056t = 3;
            if (flowCollector.mo12109b(cVar, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C19097c(C18535e c18535e, C24371m0 c24371m0, C19095a c19095a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18535e.Companion.m97930a() : c18535e, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : c24371m0, (i11 & 4) != 0 ? new C19095a(null, null, 3, null) : c19095a);
    }

    /* renamed from: c */
    public final C19095a m100305c() {
        return this.f95050c;
    }

    /* renamed from: d */
    public final C18535e m100306d() {
        return this.f95048a;
    }

    /* renamed from: e */
    public final C24371m0 m100307e() {
        return this.f95049b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Flow mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        return FlowKt.m113265A(new c(aVar, null));
    }

    public C19097c(C18535e c18535e, C24371m0 c24371m0, C19095a c19095a) {
        AbstractC19074t.m100208f(c18535e, "repo");
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        AbstractC19074t.m100208f(c19095a, "attachZShortVideoInfoToFeedItemUseCase");
        this.f95048a = c18535e;
        this.f95049b = c24371m0;
        this.f95050c = c19095a;
    }
}
