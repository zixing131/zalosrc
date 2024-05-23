package es;

import com.zing.zalo.control.ItemAlbumMobile;
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
import org.json.JSONObject;
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

/* renamed from: es.d */
/* loaded from: classes4.dex */
public final class C18593d extends AbstractC18591b {

    /* renamed from: a */
    private final C32549e f93443a;

    /* renamed from: es.d$a */
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: c */
        private final ItemAlbumMobile f93444c;

        /* renamed from: d */
        private final int f93445d;

        /* renamed from: e */
        private final TrackingSource f93446e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ItemAlbumMobile itemAlbumMobile, int i11, TrackingSource trackingSource) {
            super(itemAlbumMobile, trackingSource);
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93444c = itemAlbumMobile;
            this.f93445d = i11;
            this.f93446e = trackingSource;
        }

        @Override // es.C18593d.c
        /* renamed from: a */
        public ItemAlbumMobile mo98186a() {
            return this.f93444c;
        }

        @Override // es.C18593d.c
        /* renamed from: b */
        public TrackingSource mo98187b() {
            return this.f93446e;
        }

        /* renamed from: c */
        public final int m98188c() {
            return this.f93445d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f93444c, aVar.f93444c) && this.f93445d == aVar.f93445d && AbstractC19074t.m100204b(this.f93446e, aVar.f93446e);
        }

        public int hashCode() {
            return (((this.f93444c.hashCode() * 31) + this.f93445d) * 31) + this.f93446e.hashCode();
        }

        public String toString() {
            return "ChangeReactParams(photoItem=" + this.f93444c + ", reactionId=" + this.f93445d + ", trackingSource=" + this.f93446e + ")";
        }
    }

    /* renamed from: es.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: c */
        private final ItemAlbumMobile f93447c;

        /* renamed from: d */
        private final int f93448d;

        /* renamed from: e */
        private final TrackingSource f93449e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ItemAlbumMobile itemAlbumMobile, int i11, TrackingSource trackingSource) {
            super(itemAlbumMobile, trackingSource);
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93447c = itemAlbumMobile;
            this.f93448d = i11;
            this.f93449e = trackingSource;
        }

        @Override // es.C18593d.c
        /* renamed from: a */
        public ItemAlbumMobile mo98186a() {
            return this.f93447c;
        }

        @Override // es.C18593d.c
        /* renamed from: b */
        public TrackingSource mo98187b() {
            return this.f93449e;
        }

        /* renamed from: c */
        public final int m98189c() {
            return this.f93448d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f93447c, bVar.f93447c) && this.f93448d == bVar.f93448d && AbstractC19074t.m100204b(this.f93449e, bVar.f93449e);
        }

        public int hashCode() {
            return (((this.f93447c.hashCode() * 31) + this.f93448d) * 31) + this.f93449e.hashCode();
        }

        public String toString() {
            return "NewReactParams(photoItem=" + this.f93447c + ", reactionId=" + this.f93448d + ", trackingSource=" + this.f93449e + ")";
        }
    }

    /* renamed from: es.d$c */
    /* loaded from: classes4.dex */
    public static abstract class c {

        /* renamed from: a */
        private final ItemAlbumMobile f93450a;

        /* renamed from: b */
        private final TrackingSource f93451b;

        public c(ItemAlbumMobile itemAlbumMobile, TrackingSource trackingSource) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93450a = itemAlbumMobile;
            this.f93451b = trackingSource;
        }

        /* renamed from: a */
        public abstract ItemAlbumMobile mo98186a();

        /* renamed from: b */
        public abstract TrackingSource mo98187b();
    }

    /* renamed from: es.d$d */
    /* loaded from: classes4.dex */
    public static final class d extends c {

        /* renamed from: c */
        private final ItemAlbumMobile f93452c;

        /* renamed from: d */
        private final TrackingSource f93453d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ItemAlbumMobile itemAlbumMobile, TrackingSource trackingSource) {
            super(itemAlbumMobile, trackingSource);
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            AbstractC19074t.m100208f(trackingSource, "trackingSource");
            this.f93452c = itemAlbumMobile;
            this.f93453d = trackingSource;
        }

        @Override // es.C18593d.c
        /* renamed from: a */
        public ItemAlbumMobile mo98186a() {
            return this.f93452c;
        }

        @Override // es.C18593d.c
        /* renamed from: b */
        public TrackingSource mo98187b() {
            return this.f93453d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f93452c, dVar.f93452c) && AbstractC19074t.m100204b(this.f93453d, dVar.f93453d);
        }

        public int hashCode() {
            return (this.f93452c.hashCode() * 31) + this.f93453d.hashCode();
        }

        public String toString() {
            return "UnReactParams(photoItem=" + this.f93452c + ", trackingSource=" + this.f93453d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.d$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f93454q;

        /* renamed from: r */
        final /* synthetic */ C32547c f93455r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, C32547c c32547c) {
            super(0);
            this.f93454q = str;
            this.f93455r = c32547c;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f93454q + ": " + AbstractC32548d.m157613a(this.f93455r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.d$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ c f93456q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.f93456q = cVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            JSONObject jSONObject;
            c cVar = this.f93456q;
            String str = cVar.mo98186a().f42595r;
            String str2 = this.f93456q.mo98186a().f42552E;
            String str3 = this.f93456q.mo98186a().f42560K;
            C32546b c32546b = this.f93456q.mo98186a().f42563N;
            if (c32546b != null) {
                jSONObject = c32546b.m157608d();
            } else {
                jSONObject = null;
            }
            return cVar + " - " + str + " - isLike: " + str2 + "- total like: " + str3 + " - " + jSONObject + " ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.d$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f93457t;

        /* renamed from: u */
        Object f93458u;

        /* renamed from: v */
        int f93459v;

        /* renamed from: w */
        private /* synthetic */ Object f93460w;

        /* renamed from: x */
        final /* synthetic */ c f93461x;

        /* renamed from: y */
        final /* synthetic */ C18593d f93462y;

        /* renamed from: z */
        final /* synthetic */ C32547c f93463z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c cVar, C18593d c18593d, C32547c c32547c, Continuation continuation) {
            super(2, continuation);
            this.f93461x = cVar;
            this.f93462y = c18593d;
            this.f93463z = c32547c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            g gVar = new g(this.f93461x, this.f93462y, this.f93463z, continuation);
            gVar.f93460w = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00f0 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C32547c m98180v;
            ItemAlbumMobile itemAlbumMobile;
            FlowCollector flowCollector;
            C32547c c32547c;
            Object m98184z;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f93459v;
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
                        c32547c = (C32547c) this.f93458u;
                        itemAlbumMobile = (ItemAlbumMobile) this.f93457t;
                        flowCollector = (FlowCollector) this.f93460w;
                        AbstractC24862s.m129228b(obj);
                        m98184z = obj;
                    } else {
                        c32547c = (C32547c) this.f93458u;
                        itemAlbumMobile = (ItemAlbumMobile) this.f93457t;
                        flowCollector = (FlowCollector) this.f93460w;
                        AbstractC24862s.m129228b(obj);
                        C18593d c18593d = this.f93462y;
                        c cVar = this.f93461x;
                        this.f93460w = flowCollector;
                        this.f93457t = itemAlbumMobile;
                        this.f93458u = c32547c;
                        this.f93459v = 3;
                        m98184z = c18593d.m98184z(cVar, this);
                        if (m98184z == m142578e) {
                            return m142578e;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.f93460w;
                ItemAlbumMobile mo98186a = this.f93461x.mo98186a();
                C32549e c32549e = this.f93462y.f93443a;
                String str = mo98186a.f42595r;
                AbstractC19074t.m100207e(str, "picid");
                if (c32549e.m157616a(str)) {
                    AbstractC18591b.a.c cVar2 = new AbstractC18591b.a.c(this.f93462y.m98180v(mo98186a));
                    this.f93459v = 1;
                    if (flowCollector2.mo12109b(cVar2, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                c cVar3 = this.f93461x;
                if (cVar3 instanceof b) {
                    C18593d c18593d2 = this.f93462y;
                    m98180v = c18593d2.m98179u(mo98186a, c18593d2.m98146h(((b) cVar3).m98189c()));
                } else if (cVar3 instanceof d) {
                    m98180v = this.f93462y.m98179u(mo98186a, 0);
                } else if (!(cVar3 instanceof a)) {
                    m98180v = this.f93462y.m98180v(mo98186a);
                } else {
                    C18593d c18593d3 = this.f93462y;
                    m98180v = c18593d3.m98178t(mo98186a, c18593d3.m98146h(((a) cVar3).m98188c()));
                }
                AbstractC18591b.a.b bVar = new AbstractC18591b.a.b(m98180v);
                this.f93460w = flowCollector2;
                this.f93457t = mo98186a;
                this.f93458u = m98180v;
                this.f93459v = 2;
                if (flowCollector2.mo12109b(bVar, this) == m142578e) {
                    return m142578e;
                }
                itemAlbumMobile = mo98186a;
                C32547c c32547c2 = m98180v;
                flowCollector = flowCollector2;
                c32547c = c32547c2;
                C18593d c18593d4 = this.f93462y;
                c cVar4 = this.f93461x;
                this.f93460w = flowCollector;
                this.f93457t = itemAlbumMobile;
                this.f93458u = c32547c;
                this.f93459v = 3;
                m98184z = c18593d4.m98184z(cVar4, this);
                if (m98184z == m142578e) {
                }
            }
            if (!((Boolean) m98184z).booleanValue()) {
                this.f93462y.m98182x("React error - fallback", this.f93463z);
                AbstractC18591b.a.C32819a c32819a = new AbstractC18591b.a.C32819a(this.f93463z, ExceptionReactFeedUnknown.f46212q);
                this.f93460w = null;
                this.f93457t = null;
                this.f93458u = null;
                this.f93459v = 5;
                if (flowCollector.mo12109b(c32819a, this) == m142578e) {
                    return m142578e;
                }
            } else {
                C25422m0 c25422m0 = new C25422m0(null, null, 3, null);
                String str2 = itemAlbumMobile.f42599t;
                AbstractC19074t.m100207e(str2, "feedid");
                c25422m0.m101508a(new C25422m0.a(str2, c32547c.m157611b(), c32547c.m157612c(), itemAlbumMobile.f42562M, c32547c.m157610a(), false, false));
                this.f93462y.m98182x("React success", c32547c);
                AbstractC18591b.a.d dVar = new AbstractC18591b.a.d(c32547c);
                this.f93460w = null;
                this.f93457t = null;
                this.f93458u = null;
                this.f93459v = 4;
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
    /* renamed from: es.d$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f93464t;

        /* renamed from: u */
        private /* synthetic */ Object f93465u;

        /* renamed from: v */
        /* synthetic */ Object f93466v;

        /* renamed from: x */
        final /* synthetic */ C32547c f93468x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C32547c c32547c, Continuation continuation) {
            super(3, continuation);
            this.f93468x = c32547c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f93464t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f93465u;
                Throwable th2 = (Throwable) this.f93466v;
                C18593d.this.m98182x("React error - fallback - " + th2, this.f93468x);
                AbstractC18591b.a.C32819a c32819a = new AbstractC18591b.a.C32819a(this.f93468x, C18593d.this.m98144f(th2));
                this.f93465u = null;
                this.f93464t = 1;
                if (flowCollector.mo12109b(c32819a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            h hVar = new h(this.f93468x, continuation);
            hVar.f93465u = flowCollector;
            hVar.f93466v = th2;
            return hVar.mo239o(C24848g0.f119245a);
        }
    }

    public C18593d(C32549e c32549e) {
        AbstractC19074t.m100208f(c32549e, "feedReactionRepo");
        this.f93443a = c32549e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:            r2 = qm0.AbstractC25332a0.m131185M0(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:            r1 = on0.AbstractC24340u.m127107m(r1);     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32547c m98178t(ItemAlbumMobile itemAlbumMobile, int i11) {
        int i12;
        List m98143e;
        int m98142d;
        Integer m127107m;
        boolean m100204b = AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1");
        String str = itemAlbumMobile.f42560K;
        if (str != null && m127107m != null) {
            i12 = m127107m.intValue();
        } else {
            i12 = 0;
        }
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b == null || (r2 = c32546b.m157607c()) == null || m98143e == null) {
            m98143e = m98143e(i12);
        }
        C32546b c32546b2 = itemAlbumMobile.f42563N;
        if (c32546b2 != null) {
            m98142d = c32546b2.m157605a();
        } else {
            m98142d = m98142d(m100204b);
        }
        C32547c c32547c = new C32547c(m100204b, i12, new C32546b(i11, m98145g(m98143e, AbstractC18591b.b.f93413q, m98142d, i11)));
        m98182x("getChangedReactInfo", c32547c);
        return c32547c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:            r5 = qm0.AbstractC25332a0.m131185M0(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:            r1 = on0.AbstractC24340u.m127107m(r1);     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32547c m98179u(ItemAlbumMobile itemAlbumMobile, int i11) {
        int i12;
        int m98142d;
        List m98143e;
        AbstractC18591b.b bVar;
        Integer m127107m;
        boolean z11 = !itemAlbumMobile.f42552E.equals("1");
        String str = itemAlbumMobile.f42560K;
        int i13 = 0;
        if (str != null && m127107m != null) {
            i12 = m127107m.intValue();
        } else {
            i12 = 0;
        }
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b != null) {
            m98142d = c32546b.m157605a();
        } else {
            m98142d = m98142d(z11);
        }
        if (!z11) {
            i11 = 0;
        }
        C32546b c32546b2 = itemAlbumMobile.f42563N;
        if (c32546b2 == null || (r5 = c32546b2.m157607c()) == null || m98143e == null) {
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
        m98182x("getFlippedReactInfo", c32547c);
        return c32547c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final C32547c m98180v(ItemAlbumMobile itemAlbumMobile) {
        int m98142d;
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b != null) {
            m98142d = c32546b.m157605a();
        } else {
            m98142d = m98142d(AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1"));
        }
        return m98181w(itemAlbumMobile, m98142d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:            r5 = qm0.AbstractC25332a0.m131185M0(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:            r1 = on0.AbstractC24340u.m127107m(r1);     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C32547c m98181w(ItemAlbumMobile itemAlbumMobile, int i11) {
        int i12;
        List m98143e;
        Integer m127107m;
        boolean m100204b = AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1");
        String str = itemAlbumMobile.f42560K;
        if (str != null && m127107m != null) {
            i12 = m127107m.intValue();
        } else {
            i12 = 0;
        }
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b == null || (r5 = c32546b.m157607c()) == null || m98143e == null) {
            m98143e = m98143e(i12);
        }
        C32547c c32547c = new C32547c(m100204b, i12, new C32546b(i11, m98143e));
        m98182x("getReactInfo", c32547c);
        return c32547c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m98182x(String str, C32547c c32547c) {
        if (C26360i.f125213a.m135694c("FEED_MULTI_REACTIONS")) {
            C26359h.f125209a.mo135685a("FEED_MULTI_REACTIONS", "REACT_PHOTO_USE_CASE", new e(str, c32547c));
        }
    }

    /* renamed from: y */
    private final void m98183y(c cVar) {
        if (C26360i.f125213a.m135694c("FEED_MULTI_REACTIONS")) {
            C26359h.f125209a.mo135685a("FEED_MULTI_REACTIONS", "REACT_PHOTO_USE_CASE", new f(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final Object m98184z(c cVar, Continuation continuation) {
        String str = cVar.mo98186a().f42595r;
        TrackingSource mo98187b = cVar.mo98187b();
        if (cVar instanceof b) {
            C32549e c32549e = this.f93443a;
            AbstractC19074t.m100205c(str);
            return c32549e.m157618d(str, m98146h(((b) cVar).m98189c()), mo98187b, continuation);
        }
        if (cVar instanceof a) {
            C32549e c32549e2 = this.f93443a;
            AbstractC19074t.m100205c(str);
            return c32549e2.m157618d(str, m98146h(((a) cVar).m98188c()), mo98187b, continuation);
        }
        if (cVar instanceof d) {
            C32549e c32549e3 = this.f93443a;
            AbstractC19074t.m100205c(str);
            return c32549e3.m157620g(str, mo98187b, continuation);
        }
        return AbstractC29094b.m145339a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Object mo451b(c cVar, Continuation continuation) {
        C32547c m98180v = m98180v(cVar.mo98186a());
        m98183y(cVar);
        return FlowKt.m113288f(FlowKt.m113265A(new g(cVar, this, m98180v, null)), new h(m98180v, null));
    }

    public /* synthetic */ C18593d(C32549e c32549e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C32549e.f150403a : c32549e);
    }
}
