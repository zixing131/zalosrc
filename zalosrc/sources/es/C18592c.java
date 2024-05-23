package es;

import bo.C3020p0;
import bo.C3039t0;
import bo.C3051w0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedUnknown;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import es.AbstractC18591b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p455qo.C25422m0;
import p509sp.C26359h;
import p509sp.C26360i;
import p726zr.AbstractC32548d;
import p726zr.C32546b;
import p726zr.C32547c;
import p726zr.C32549e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: es.c */
/* loaded from: classes4.dex */
public final class C18592c extends AbstractC18591b {

    /* renamed from: a */
    private final C32549e f93417a;

    /* renamed from: es.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: c */
        private final C3020p0 f93418c;

        /* renamed from: d */
        private final int f93419d;

        /* renamed from: e */
        private final TrackingSource f93420e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3020p0 c3020p0, int i11, TrackingSource trackingSource) {
            super(c3020p0, trackingSource);
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93418c = c3020p0;
            this.f93419d = i11;
            this.f93420e = trackingSource;
        }

        @Override // es.C18592c.c
        /* renamed from: a */
        public C3020p0 mo98164a() {
            return this.f93418c;
        }

        @Override // es.C18592c.c
        /* renamed from: b */
        public TrackingSource mo98165b() {
            return this.f93420e;
        }

        /* renamed from: c */
        public final int m98166c() {
            return this.f93419d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f93418c, aVar.f93418c) && this.f93419d == aVar.f93419d && AbstractC19074t.m100204b(this.f93420e, aVar.f93420e);
        }

        public int hashCode() {
            return (((this.f93418c.hashCode() * 31) + this.f93419d) * 31) + this.f93420e.hashCode();
        }

        public String toString() {
            return "ChangeReactParams(feedItem=" + this.f93418c + ", reactionId=" + this.f93419d + ", trackingSource=" + this.f93420e + ")";
        }
    }

    /* renamed from: es.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: c */
        private final C3020p0 f93421c;

        /* renamed from: d */
        private final int f93422d;

        /* renamed from: e */
        private final TrackingSource f93423e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3020p0 c3020p0, int i11, TrackingSource trackingSource) {
            super(c3020p0, trackingSource);
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93421c = c3020p0;
            this.f93422d = i11;
            this.f93423e = trackingSource;
        }

        @Override // es.C18592c.c
        /* renamed from: a */
        public C3020p0 mo98164a() {
            return this.f93421c;
        }

        @Override // es.C18592c.c
        /* renamed from: b */
        public TrackingSource mo98165b() {
            return this.f93423e;
        }

        /* renamed from: c */
        public final int m98167c() {
            return this.f93422d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f93421c, bVar.f93421c) && this.f93422d == bVar.f93422d && AbstractC19074t.m100204b(this.f93423e, bVar.f93423e);
        }

        public int hashCode() {
            return (((this.f93421c.hashCode() * 31) + this.f93422d) * 31) + this.f93423e.hashCode();
        }

        public String toString() {
            return "NewReactParams(feedItem=" + this.f93421c + ", reactionId=" + this.f93422d + ", trackingSource=" + this.f93423e + ")";
        }
    }

    /* renamed from: es.c$c */
    /* loaded from: classes4.dex */
    public static abstract class c {

        /* renamed from: a */
        private final C3020p0 f93424a;

        /* renamed from: b */
        private final TrackingSource f93425b;

        public c(C3020p0 c3020p0, TrackingSource trackingSource) {
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93424a = c3020p0;
            this.f93425b = trackingSource;
        }

        /* renamed from: a */
        public abstract C3020p0 mo98164a();

        /* renamed from: b */
        public abstract TrackingSource mo98165b();
    }

    /* renamed from: es.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends c {

        /* renamed from: c */
        private final C3020p0 f93426c;

        /* renamed from: d */
        private final TrackingSource f93427d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3020p0 c3020p0, TrackingSource trackingSource) {
            super(c3020p0, trackingSource);
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93426c = c3020p0;
            this.f93427d = trackingSource;
        }

        @Override // es.C18592c.c
        /* renamed from: a */
        public C3020p0 mo98164a() {
            return this.f93426c;
        }

        @Override // es.C18592c.c
        /* renamed from: b */
        public TrackingSource mo98165b() {
            return this.f93427d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f93426c, dVar.f93426c) && AbstractC19074t.m100204b(this.f93427d, dVar.f93427d);
        }

        public int hashCode() {
            return (this.f93426c.hashCode() * 31) + this.f93427d.hashCode();
        }

        public String toString() {
            return "UnReactParams(feedItem=" + this.f93426c + ", trackingSource=" + this.f93427d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f93428q;

        /* renamed from: r */
        final /* synthetic */ C32547c f93429r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, C32547c c32547c) {
            super(0);
            this.f93428q = str;
            this.f93429r = c32547c;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f93428q + ": " + AbstractC32548d.m157613a(this.f93429r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.c$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ c f93430q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.f93430q = cVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            c cVar = this.f93430q;
            return cVar + " - " + cVar.mo98164a().m14474E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.c$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f93431t;

        /* renamed from: u */
        Object f93432u;

        /* renamed from: v */
        int f93433v;

        /* renamed from: w */
        private /* synthetic */ Object f93434w;

        /* renamed from: x */
        final /* synthetic */ c f93435x;

        /* renamed from: y */
        final /* synthetic */ C18592c f93436y;

        /* renamed from: z */
        final /* synthetic */ C32547c f93437z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c cVar, C18592c c18592c, C32547c c32547c, Continuation continuation) {
            super(2, continuation);
            this.f93435x = cVar;
            this.f93436y = c18592c;
            this.f93437z = c32547c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            g gVar = new g(this.f93435x, this.f93436y, this.f93437z, continuation);
            gVar.f93434w = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00f0 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C32547c m98158v;
            C3020p0 c3020p0;
            FlowCollector flowCollector;
            C32547c c32547c;
            Object m98162z;
            C3051w0 c3051w0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f93433v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4 && i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        c32547c = (C32547c) this.f93432u;
                        c3020p0 = (C3020p0) this.f93431t;
                        flowCollector = (FlowCollector) this.f93434w;
                        AbstractC24862s.m129228b(obj);
                        m98162z = obj;
                    } else {
                        c32547c = (C32547c) this.f93432u;
                        c3020p0 = (C3020p0) this.f93431t;
                        flowCollector = (FlowCollector) this.f93434w;
                        AbstractC24862s.m129228b(obj);
                        C18592c c18592c = this.f93436y;
                        c cVar = this.f93435x;
                        this.f93434w = flowCollector;
                        this.f93431t = c3020p0;
                        this.f93432u = c32547c;
                        this.f93433v = 3;
                        m98162z = c18592c.m98162z(cVar, this);
                        if (m98162z == m142578e) {
                            return m142578e;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f93434w;
                C3020p0 mo98164a = this.f93435x.mo98164a();
                C32549e c32549e = this.f93436y.f93417a;
                String str = mo98164a.f12057p;
                AbstractC19074t.m100207e(str, "fid");
                if (c32549e.m157616a(str)) {
                    AbstractC18591b.a.c cVar2 = new AbstractC18591b.a.c(this.f93436y.m98158v(mo98164a));
                    this.f93433v = 1;
                    if (flowCollector2.mo12109b(cVar2, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                c cVar3 = this.f93435x;
                if (cVar3 instanceof b) {
                    C18592c c18592c2 = this.f93436y;
                    m98158v = c18592c2.m98157u(mo98164a, c18592c2.m98146h(((b) cVar3).m98167c()));
                } else if (cVar3 instanceof d) {
                    m98158v = this.f93436y.m98157u(mo98164a, 0);
                } else if (!(cVar3 instanceof a)) {
                    m98158v = this.f93436y.m98158v(mo98164a);
                } else {
                    C18592c c18592c3 = this.f93436y;
                    m98158v = c18592c3.m98156t(mo98164a, c18592c3.m98146h(((a) cVar3).m98166c()));
                }
                AbstractC18591b.a.b bVar = new AbstractC18591b.a.b(m98158v);
                this.f93434w = flowCollector2;
                this.f93431t = mo98164a;
                this.f93432u = m98158v;
                this.f93433v = 2;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                c3020p0 = mo98164a;
                C32547c c32547c2 = m98158v;
                flowCollector = flowCollector2;
                c32547c = c32547c2;
                C18592c c18592c4 = this.f93436y;
                c cVar4 = this.f93435x;
                this.f93434w = flowCollector;
                this.f93431t = c3020p0;
                this.f93432u = c32547c;
                this.f93433v = 3;
                m98162z = c18592c4.m98162z(cVar4, this);
                if (m98162z == m142578e) {
                }
            }
            if (!((Boolean) m98162z).booleanValue()) {
                this.f93436y.m98160x("React error - fallback", this.f93437z);
                AbstractC18591b.a.C32819a c32819a = new AbstractC18591b.a.C32819a(this.f93437z, ExceptionReactFeedUnknown.f46212q);
                this.f93434w = null;
                this.f93431t = null;
                this.f93432u = null;
                this.f93433v = 5;
                if (flowCollector.mo12109b(c32819a, this) == m142578e) {
                    return m142578e;
                }
            } else {
                C25422m0 c25422m0 = new C25422m0(null, null, 3, null);
                String str2 = c3020p0.f12057p;
                AbstractC19074t.m100207e(str2, "fid");
                int m157611b = c32547c.m157611b();
                boolean m157612c = c32547c.m157612c();
                C3039t0 c3039t0 = c3020p0.f12025E;
                if (c3039t0 != null) {
                    c3051w0 = c3039t0.f12246d;
                } else {
                    c3051w0 = null;
                }
                c25422m0.m101508a(new C25422m0.a(str2, m157611b, m157612c, c3051w0, c32547c.m157610a(), false, false));
                this.f93436y.m98160x("React success", c32547c);
                AbstractC18591b.a.d dVar = new AbstractC18591b.a.d(c32547c);
                this.f93434w = null;
                this.f93431t = null;
                this.f93432u = null;
                this.f93433v = 4;
                if (flowCollector.mo12109b(dVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((g) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.c$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f93438t;

        /* renamed from: u */
        private /* synthetic */ Object f93439u;

        /* renamed from: v */
        /* synthetic */ Object f93440v;

        /* renamed from: x */
        final /* synthetic */ C32547c f93442x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C32547c c32547c, Continuation continuation) {
            super(3, continuation);
            this.f93442x = c32547c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f93438t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f93439u;
                Throwable th2 = (Throwable) this.f93440v;
                C18592c.this.m98160x("React error - fallback - " + th2, this.f93442x);
                AbstractC18591b.a.C32819a c32819a = new AbstractC18591b.a.C32819a(this.f93442x, C18592c.this.m98144f(th2));
                this.f93439u = null;
                this.f93438t = 1;
                if (flowCollector.mo12109b(c32819a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            h hVar = new h(this.f93442x, continuation);
            hVar.f93439u = flowCollector;
            hVar.f93440v = th2;
            return hVar.mo239o(C24848g0.f119245a);
        }
    }

    public C18592c(C32549e c32549e) {
        AbstractC19074t.m100208f(c32549e, "feedReactionRepo");
        this.f93417a = c32549e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:            r1 = qm0.AbstractC25332a0.m131185M0(r1);     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32547c m98156t(C3020p0 c3020p0, int i11) {
        int i12;
        List m98143e;
        int m98142d;
        C32546b c32546b;
        C32546b c32546b2;
        boolean z11 = c3020p0.f12064w;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null) {
            i12 = c3039t0.f12244b;
        } else {
            i12 = 0;
        }
        if (c3039t0 == null || (c32546b2 = c3039t0.f12247e) == null || (r1 = c32546b2.m157607c()) == null || m98143e == null) {
            m98143e = m98143e(i12);
        }
        C3039t0 c3039t02 = c3020p0.f12025E;
        if (c3039t02 != null && (c32546b = c3039t02.f12247e) != null) {
            m98142d = c32546b.m157605a();
        } else {
            m98142d = m98142d(z11);
        }
        C32547c c32547c = new C32547c(z11, i12, new C32546b(i11, m98145g(m98143e, AbstractC18591b.b.f93413q, m98142d, i11)));
        m98160x("getChangedReactInfo", c32547c);
        return c32547c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            r5 = qm0.AbstractC25332a0.m131185M0(r5);     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32547c m98157u(C3020p0 c3020p0, int i11) {
        int i12;
        int m98142d;
        List m98143e;
        AbstractC18591b.b bVar;
        C32546b c32546b;
        C32546b c32546b2;
        boolean z11 = !c3020p0.f12064w;
        C3039t0 c3039t0 = c3020p0.f12025E;
        int i13 = 0;
        if (c3039t0 != null) {
            i12 = c3039t0.f12244b;
        } else {
            i12 = 0;
        }
        if (c3039t0 != null && (c32546b2 = c3039t0.f12247e) != null) {
            m98142d = c32546b2.m157605a();
        } else {
            m98142d = m98142d(z11);
        }
        if (!z11) {
            i11 = 0;
        }
        C3039t0 c3039t02 = c3020p0.f12025E;
        if (c3039t02 == null || (c32546b = c3039t02.f12247e) == null || (r5 = c32546b.m157607c()) == null || m98143e == null) {
            m98143e = m98143e(i12);
        }
        if (z11) {
            i13 = i12 + 1;
        } else {
            int i14 = i12 - 1;
            if (i14 >= 0) {
                i13 = i14;
            }
        }
        if (z11) {
            bVar = AbstractC18591b.b.f93412p;
        } else {
            bVar = AbstractC18591b.b.f93414r;
        }
        C32547c c32547c = new C32547c(z11, i13, new C32546b(i11, m98145g(m98143e, bVar, m98142d, i11)));
        m98160x("getFlippedReactInfo", c32547c);
        return c32547c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final C32547c m98158v(C3020p0 c3020p0) {
        int m98142d;
        C32546b c32546b;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null && (c32546b = c3039t0.f12247e) != null) {
            m98142d = c32546b.m157605a();
        } else {
            m98142d = m98142d(c3020p0.f12064w);
        }
        return m98159w(c3020p0, m98142d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:            r5 = qm0.AbstractC25332a0.m131185M0(r5);     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C32547c m98159w(C3020p0 c3020p0, int i11) {
        int i12;
        List m98143e;
        C32546b c32546b;
        boolean z11 = c3020p0.f12064w;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null) {
            i12 = c3039t0.f12244b;
        } else {
            i12 = 0;
        }
        if (c3039t0 == null || (c32546b = c3039t0.f12247e) == null || (r5 = c32546b.m157607c()) == null || m98143e == null) {
            m98143e = m98143e(i12);
        }
        C32547c c32547c = new C32547c(z11, i12, new C32546b(i11, m98143e));
        m98160x("getReactInfo", c32547c);
        return c32547c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m98160x(String str, C32547c c32547c) {
        if (C26360i.f125213a.m135694c("FEED_MULTI_REACTIONS")) {
            C26359h.f125209a.mo135685a("FEED_MULTI_REACTIONS", "REACT_FEED_USE_CASE", new e(str, c32547c));
        }
    }

    /* renamed from: y */
    private final void m98161y(c cVar) {
        if (C26360i.f125213a.m135694c("FEED_MULTI_REACTIONS")) {
            C26359h.f125209a.mo135685a("FEED_MULTI_REACTIONS", "REACT_FEED_USE_CASE", new f(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final Object m98162z(c cVar, Continuation continuation) {
        String str = cVar.mo98164a().f12057p;
        TrackingSource mo98165b = cVar.mo98165b();
        if (cVar instanceof b) {
            C32549e c32549e = this.f93417a;
            AbstractC19074t.m100205c(str);
            return c32549e.m157617c(str, m98146h(((b) cVar).m98167c()), mo98165b, continuation);
        }
        if (cVar instanceof a) {
            C32549e c32549e2 = this.f93417a;
            AbstractC19074t.m100205c(str);
            return c32549e2.m157617c(str, m98146h(((a) cVar).m98166c()), mo98165b, continuation);
        }
        if (cVar instanceof d) {
            C32549e c32549e3 = this.f93417a;
            AbstractC19074t.m100205c(str);
            return c32549e3.m157619f(str, mo98165b, continuation);
        }
        return AbstractC29094b.m145339a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Object mo451b(c cVar, Continuation continuation) {
        C32547c m98158v = m98158v(cVar.mo98164a());
        m98161y(cVar);
        return FlowKt.m113288f(FlowKt.m113265A(new g(cVar, this, m98158v, null)), new h(m98158v, null));
    }

    public /* synthetic */ C18592c(C32549e c32549e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C32549e.f150403a : c32549e);
    }
}
