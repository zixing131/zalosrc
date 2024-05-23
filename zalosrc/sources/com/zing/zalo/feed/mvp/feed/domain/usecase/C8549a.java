package com.zing.zalo.feed.mvp.feed.domain.usecase;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8550b;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import on0.AbstractC24341v;
import p185gc.AbstractC19377a;
import p398oo.C24348b;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import sn.C26333b;
import tn.C26747f0;
import tn.C26761p;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.a */
/* loaded from: classes4.dex */
public final class C8549a extends AbstractC19377a {

    /* renamed from: a */
    private final C24348b f46225a;

    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f46226a;

        /* renamed from: b */
        private final boolean f46227b;

        /* renamed from: c */
        private final boolean f46228c;

        public a(String str, boolean z11) {
            boolean m127128x;
            AbstractC19074t.m100208f(str, "feedId");
            this.f46226a = str;
            this.f46227b = z11;
            m127128x = AbstractC24341v.m127128x(str);
            this.f46228c = m127128x;
        }

        /* renamed from: a */
        public final String m45595a() {
            return this.f46226a;
        }

        /* renamed from: b */
        public final boolean m45596b() {
            return this.f46227b;
        }

        /* renamed from: c */
        public final boolean m45597c() {
            return this.f46228c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f46226a, aVar.f46226a) && this.f46227b == aVar.f46227b;
        }

        public int hashCode() {
            return (this.f46226a.hashCode() * 31) + AbstractC2144f.m11520a(this.f46227b);
        }

        public String toString() {
            return "Param(feedId=" + this.f46226a + ", isHideFeed=" + this.f46227b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46229t;

        /* renamed from: u */
        private /* synthetic */ Object f46230u;

        /* renamed from: v */
        final /* synthetic */ a f46231v;

        /* renamed from: w */
        final /* synthetic */ C8549a f46232w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, C8549a c8549a, Continuation continuation) {
            super(2, continuation);
            this.f46231v = aVar;
            this.f46232w = c8549a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f46231v, this.f46232w, continuation);
            bVar.f46230u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            FlowCollector flowCollector;
            AbstractC25468a.c cVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46229t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) this.f46230u;
                    AbstractC24862s.m129228b(obj);
                    C26747f0.m137582I().m137617f0(this.f46231v.m45595a());
                    C26747f0.m137582I().m137611d0(this.f46231v.m45595a());
                    C26333b.f125013a.m135518n(this.f46231v.m45595a(), 1);
                    C26761p.m137741q().m137765m(this.f46231v.m45595a());
                    new C8550b(null, 1, null).m101508a(new C8550b.a(this.f46231v.m45595a(), this.f46231v.m45596b()));
                    cVar = new AbstractC25468a.c(C24848g0.f119245a);
                    this.f46230u = null;
                    this.f46229t = 3;
                    if (flowCollector.mo12109b(cVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                flowCollector = (FlowCollector) this.f46230u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f46230u;
                AbstractC25468a.b bVar = AbstractC25468a.b.f122049a;
                this.f46230u = flowCollector2;
                this.f46229t = 1;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                flowCollector = flowCollector2;
            }
            if (!this.f46231v.m45597c()) {
                C24348b m45593c = this.f46232w.m45593c();
                String m45595a = this.f46231v.m45595a();
                this.f46230u = flowCollector;
                this.f46229t = 2;
                if (m45593c.m127230e(m45595a, this) == m142578e) {
                    return m142578e;
                }
                C26747f0.m137582I().m137617f0(this.f46231v.m45595a());
                C26747f0.m137582I().m137611d0(this.f46231v.m45595a());
                C26333b.f125013a.m135518n(this.f46231v.m45595a(), 1);
                C26761p.m137741q().m137765m(this.f46231v.m45595a());
                new C8550b(null, 1, null).m101508a(new C8550b.a(this.f46231v.m45595a(), this.f46231v.m45596b()));
                cVar = new AbstractC25468a.c(C24848g0.f119245a);
                this.f46230u = null;
                this.f46229t = 3;
                if (flowCollector.mo12109b(cVar, this) == m142578e) {
                }
                return C24848g0.f119245a;
            }
            throw new Exception();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((b) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.domain.usecase.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f46233t;

        /* renamed from: u */
        private /* synthetic */ Object f46234u;

        /* renamed from: v */
        /* synthetic */ Object f46235v;

        c(Continuation continuation) {
            super(3, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46233t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f46234u;
                AbstractC25468a.a aVar = new AbstractC25468a.a(new Exception((Throwable) this.f46235v));
                this.f46234u = null;
                this.f46233t = 1;
                if (flowCollector.mo12109b(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f46234u = flowCollector;
            cVar.f46235v = th2;
            return cVar.mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C8549a(C24348b c24348b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C24348b() : c24348b);
    }

    /* renamed from: c */
    public final C24348b m45593c() {
        return this.f46225a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return FlowKt.m113288f(FlowKt.m113265A(new b(aVar, this, null)), new c(null));
    }

    public C8549a(C24348b c24348b) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        this.f46225a = c24348b;
    }
}
