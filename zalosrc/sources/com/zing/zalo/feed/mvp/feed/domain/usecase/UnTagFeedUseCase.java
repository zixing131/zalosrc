package com.zing.zalo.feed.mvp.feed.domain.usecase;

import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.feed.data.ExceptionFeed;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8550b;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.C20834z0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import p185gc.AbstractC19377a;
import p398oo.C24348b;
import p398oo.C24371m0;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes4.dex */
public final class UnTagFeedUseCase extends AbstractC19377a {
    public static final C8545a Companion = new C8545a(null);

    /* renamed from: a */
    private final C24348b f46213a;

    /* renamed from: b */
    private final C24371m0 f46214b;

    /* loaded from: classes4.dex */
    public static final class ExceptionUnTagFeed extends Exception {

        /* renamed from: p */
        private final int f46215p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExceptionUnTagFeed(int i11, String str) {
            super(str);
            AbstractC19074t.m100208f(str, "msg");
            this.f46215p = i11;
        }

        /* renamed from: a */
        public final int m45586a() {
            return this.f46215p;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase$a */
    /* loaded from: classes4.dex */
    public static final class C8545a {
        private C8545a() {
        }

        public /* synthetic */ C8545a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase$b */
    /* loaded from: classes4.dex */
    public static final class C8546b {

        /* renamed from: a */
        private final String f46216a;

        /* renamed from: b */
        private final List f46217b;

        /* renamed from: c */
        private final boolean f46218c;

        public C8546b(String str, List list) {
            boolean m127128x;
            boolean z11;
            AbstractC19074t.m100208f(str, "feedId");
            AbstractC19074t.m100208f(list, "uids");
            this.f46216a = str;
            this.f46217b = list;
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x && !list.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f46218c = z11;
        }

        /* renamed from: a */
        public final String m45587a() {
            return this.f46216a;
        }

        /* renamed from: b */
        public final List m45588b() {
            return this.f46217b;
        }

        /* renamed from: c */
        public final boolean m45589c() {
            return this.f46218c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8546b)) {
                return false;
            }
            C8546b c8546b = (C8546b) obj;
            return AbstractC19074t.m100204b(this.f46216a, c8546b.f46216a) && AbstractC19074t.m100204b(this.f46217b, c8546b.f46217b);
        }

        public int hashCode() {
            return (this.f46216a.hashCode() * 31) + this.f46217b.hashCode();
        }

        public String toString() {
            return "Param(feedId=" + this.f46216a + ", uids=" + this.f46217b + ")";
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase$c */
    /* loaded from: classes4.dex */
    public static final class C8547c {

        /* renamed from: a */
        private final String f46219a;

        public C8547c(String str) {
            AbstractC19074t.m100208f(str, "msg");
            this.f46219a = str;
        }

        /* renamed from: a */
        public final String m45590a() {
            return this.f46219a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8547c) && AbstractC19074t.m100204b(this.f46219a, ((C8547c) obj).f46219a);
        }

        public int hashCode() {
            return this.f46219a.hashCode();
        }

        public String toString() {
            return "Result(msg=" + this.f46219a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase$d */
    /* loaded from: classes4.dex */
    public static final class C8548d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46220t;

        /* renamed from: u */
        private /* synthetic */ Object f46221u;

        /* renamed from: v */
        final /* synthetic */ C8546b f46222v;

        /* renamed from: w */
        final /* synthetic */ UnTagFeedUseCase f46223w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.UnTagFeedUseCase$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ C8546b f46224q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C8546b c8546b) {
                super(2);
                this.f46224q = c8546b;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
                AbstractC19074t.m100208f(c3020p0, "feedItem");
                AbstractC19074t.m100208f(c3000l0, "<anonymous parameter 1>");
                c3020p0.m14530v0(this.f46224q.m45588b(), true);
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8548d(C8546b c8546b, UnTagFeedUseCase unTagFeedUseCase, Continuation continuation) {
            super(2, continuation);
            this.f46222v = c8546b;
            this.f46223w = unTagFeedUseCase;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C8548d c8548d = new C8548d(this.f46222v, this.f46223w, continuation);
            c8548d.f46221u = obj;
            return c8548d;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:15:0x0027, B:17:0x0033, B:18:0x0079, B:20:0x0092, B:21:0x0097, B:25:0x0054, B:27:0x005c, B:30:0x00b5, B:31:0x00ba), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b4 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.FlowCollector, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Exception exc;
            FlowCollector flowCollector;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r12 = this.f46220t;
            try {
            } catch (Exception e11) {
                if (e11 instanceof ExceptionFeed) {
                    ExceptionFeed exceptionFeed = (ExceptionFeed) e11;
                    int m104491c = exceptionFeed.mo45581a().m104491c();
                    if (m104491c != 1001 && m104491c != 1005 && m104491c != 10002) {
                        int m104491c2 = exceptionFeed.mo45581a().m104491c();
                        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.error_general_error_code, AbstractC29094b.m145341c(exceptionFeed.mo45581a().m104491c()));
                        AbstractC19074t.m100207e(m118746s0, "getString(...)");
                        exc = new ExceptionUnTagFeed(m104491c2, m118746s0);
                    } else {
                        new C8550b(null, 1, null).m101508a(new C8550b.a(this.f46222v.m45587a(), false, 2, null));
                        int m104491c3 = exceptionFeed.mo45581a().m104491c();
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        exc = new ExceptionUnTagFeed(m104491c3, m118743r0);
                    }
                } else {
                    exc = new Exception("");
                }
                AbstractC25468a.a aVar = new AbstractC25468a.a(exc);
                this.f46221u = null;
                this.f46220t = 4;
                if (r12.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            if (r12 == 4) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                        }
                        return C24848g0.f119245a;
                    }
                    flowCollector = (FlowCollector) this.f46221u;
                    AbstractC24862s.m129228b(obj);
                    if (this.f46223w.m45584d().m127481s(this.f46222v.m45587a(), new a(this.f46222v))) {
                        C20834z0.f102412a.m108927f(true);
                    }
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_untag_success);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    cVar = new AbstractC25468a.c(new C8547c(m118743r02));
                    this.f46221u = flowCollector;
                    this.f46220t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f46221u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f46221u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f46221u = flowCollector2;
                this.f46220t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (!this.f46222v.m45589c()) {
                C24348b m45583c = this.f46223w.m45583c();
                String m45587a = this.f46222v.m45587a();
                List m45588b = this.f46222v.m45588b();
                this.f46221u = flowCollector;
                this.f46220t = 2;
                if (m45583c.m127234m(m45587a, m45588b, this) == m142578e) {
                    return m142578e;
                }
                if (this.f46223w.m45584d().m127481s(this.f46222v.m45587a(), new a(this.f46222v))) {
                }
                String m118743r022 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_untag_success);
                AbstractC19074t.m100207e(m118743r022, "getString(...)");
                cVar = new AbstractC25468a.c(new C8547c(m118743r022));
                this.f46221u = flowCollector;
                this.f46220t = 3;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            throw new Exception();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((C8548d) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ UnTagFeedUseCase(C24348b c24348b, C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C24348b() : c24348b, (i11 & 2) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    /* renamed from: c */
    public final C24348b m45583c() {
        return this.f46213a;
    }

    /* renamed from: d */
    public final C24371m0 m45584d() {
        return this.f46214b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object mo451b(C8546b c8546b, Continuation continuation) {
        return FlowKt.m113265A(new C8548d(c8546b, this, null));
    }

    public UnTagFeedUseCase(C24348b c24348b, C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f46213a = c24348b;
        this.f46214b = c24371m0;
    }
}
