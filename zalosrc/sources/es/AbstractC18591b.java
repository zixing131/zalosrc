package es;

import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeed;
import com.zing.zalo.feed.mvp.feed.data.ExceptionReactFeedUnknown;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p167fs.C19137b;
import p167fs.C19140e;
import p185gc.AbstractC19377a;
import p726zr.C32547c;
import p726zr.C32550f;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: es.b */
/* loaded from: classes4.dex */
public abstract class AbstractC18591b extends AbstractC19377a {

    /* renamed from: es.b$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a */
        private final C32547c f93406a;

        /* renamed from: es.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32819a extends a {

            /* renamed from: b */
            private final C32547c f93407b;

            /* renamed from: c */
            private final ExceptionReactFeed f93408c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C32819a(C32547c c32547c, ExceptionReactFeed exceptionReactFeed) {
                super(c32547c, null);
                AbstractC19074t.m100208f(c32547c, "info");
                AbstractC19074t.m100208f(exceptionReactFeed, "exception");
                this.f93407b = c32547c;
                this.f93408c = exceptionReactFeed;
            }

            @Override // es.AbstractC18591b.a
            /* renamed from: a */
            public C32547c mo98147a() {
                return this.f93407b;
            }

            /* renamed from: b */
            public final ExceptionReactFeed m98148b() {
                return this.f93408c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32819a)) {
                    return false;
                }
                C32819a c32819a = (C32819a) obj;
                return AbstractC19074t.m100204b(this.f93407b, c32819a.f93407b) && AbstractC19074t.m100204b(this.f93408c, c32819a.f93408c);
            }

            public int hashCode() {
                return (this.f93407b.hashCode() * 31) + this.f93408c.hashCode();
            }

            public String toString() {
                return "Error(info=" + this.f93407b + ", exception=" + this.f93408c + ")";
            }
        }

        /* renamed from: es.b$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: b */
            private final C32547c f93409b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C32547c c32547c) {
                super(c32547c, null);
                AbstractC19074t.m100208f(c32547c, "info");
                this.f93409b = c32547c;
            }

            @Override // es.AbstractC18591b.a
            /* renamed from: a */
            public C32547c mo98147a() {
                return this.f93409b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC19074t.m100204b(this.f93409b, ((b) obj).f93409b);
            }

            public int hashCode() {
                return this.f93409b.hashCode();
            }

            public String toString() {
                return "Loading(info=" + this.f93409b + ")";
            }
        }

        /* renamed from: es.b$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: b */
            private final C32547c f93410b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C32547c c32547c) {
                super(c32547c, null);
                AbstractC19074t.m100208f(c32547c, "info");
                this.f93410b = c32547c;
            }

            @Override // es.AbstractC18591b.a
            /* renamed from: a */
            public C32547c mo98147a() {
                return this.f93410b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC19074t.m100204b(this.f93410b, ((c) obj).f93410b);
            }

            public int hashCode() {
                return this.f93410b.hashCode();
            }

            public String toString() {
                return "None(info=" + this.f93410b + ")";
            }
        }

        /* renamed from: es.b$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: b */
            private final C32547c f93411b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C32547c c32547c) {
                super(c32547c, null);
                AbstractC19074t.m100208f(c32547c, "info");
                this.f93411b = c32547c;
            }

            @Override // es.AbstractC18591b.a
            /* renamed from: a */
            public C32547c mo98147a() {
                return this.f93411b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC19074t.m100204b(this.f93411b, ((d) obj).f93411b);
            }

            public int hashCode() {
                return this.f93411b.hashCode();
            }

            public String toString() {
                return "Success(info=" + this.f93411b + ")";
            }
        }

        public /* synthetic */ a(C32547c c32547c, AbstractC19060k abstractC19060k) {
            this(c32547c);
        }

        /* renamed from: a */
        public abstract C32547c mo98147a();

        private a(C32547c c32547c) {
            this.f93406a = c32547c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: es.b$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f93412p = new b("NEW_REACT", 0);

        /* renamed from: q */
        public static final b f93413q = new b("CHANGE_REACT", 1);

        /* renamed from: r */
        public static final b f93414r = new b("UN_REACT", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f93415s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f93416t;

        static {
            b[] m98149b = m98149b();
            f93415s = m98149b;
            f93416t = AbstractC30166b.m148796a(m98149b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m98149b() {
            return new b[]{f93412p, f93413q, f93414r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f93415s.clone();
        }
    }

    /* renamed from: c */
    private final List m98136c(List list, int i11) {
        int m131511r;
        ArrayList<C32550f> arrayList = new ArrayList();
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(C32550f.m157621b((C32550f) it.next(), 0, 0, 3, null));
        }
        arrayList.addAll(arrayList2);
        for (C32550f c32550f : arrayList) {
            if (c32550f.m157624d() == i11) {
                c32550f.m157625e(c32550f.m157623c() - 1);
            }
        }
        C19137b.f95167a.m100444f("REACT_FEED_ABSTRACT_USE_CASE", "decreaseReactCount: \n " + m98141m(list, i11, arrayList));
        return arrayList;
    }

    /* renamed from: i */
    private final List m98137i(List list, int i11) {
        int m131511r;
        ArrayList<C32550f> arrayList = new ArrayList();
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(C32550f.m157621b((C32550f) it.next(), 0, 0, 3, null));
        }
        arrayList.addAll(arrayList2);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((C32550f) it2.next()).m157624d() == i11) {
                    for (C32550f c32550f : arrayList) {
                        if (c32550f.m157624d() == i11) {
                            c32550f.m157625e(c32550f.m157623c() + 1);
                        }
                    }
                    C19137b.f95167a.m100444f("REACT_FEED_ABSTRACT_USE_CASE", "increaseReactCount: \n " + m98141m(list, i11, arrayList));
                    return arrayList;
                }
            }
        }
        arrayList.add(new C32550f(i11, 1));
        C19137b.f95167a.m100444f("REACT_FEED_ABSTRACT_USE_CASE", "increaseReactCount: \n " + m98141m(list, i11, arrayList));
        return arrayList;
    }

    /* renamed from: j */
    private final boolean m98138j(b bVar) {
        if (bVar == b.f93413q) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m98139k(b bVar) {
        if (bVar == b.f93412p) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final boolean m98140l(b bVar) {
        if (bVar == b.f93414r) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final String m98141m(List list, int i11, List list2) {
        String m131214n0;
        String m131214n02;
        m131214n0 = AbstractC25332a0.m131214n0(list, "-", null, null, 0, null, null, 62, null);
        m131214n02 = AbstractC25332a0.m131214n0(list2, "-", null, null, 0, null, null, 62, null);
        return "Original list: " + m131214n0 + " \n React id: " + i11 + " \n Result list: " + m131214n02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final int m98142d(boolean z11) {
        return z11 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final List m98143e(int i11) {
        List m131502j;
        if (i11 <= 0) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C32550f(1, i11));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final ExceptionReactFeed m98144f(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        if (th2 instanceof ExceptionReactFeed) {
            return (ExceptionReactFeed) th2;
        }
        return ExceptionReactFeedUnknown.f46212q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final List m98145g(List list, b bVar, int i11, int i12) {
        int m131511r;
        List m131502j;
        List m131177E0;
        String m131214n0;
        AbstractC19074t.m100208f(list, "originalTopReaction");
        AbstractC19074t.m100208f(bVar, "reactType");
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(C32550f.m157621b((C32550f) it.next(), 0, 0, 3, null));
        }
        arrayList.addAll(arrayList2);
        m131502j = AbstractC25368s.m131502j();
        if (m98139k(bVar)) {
            m131502j = m98137i(arrayList, i12);
        } else if (m98140l(bVar)) {
            m131502j = m98136c(arrayList, i11);
        } else if (m98138j(bVar)) {
            m131502j = m98136c(m98137i(arrayList, i12), i11);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : m131502j) {
            if (((C32550f) obj).m157623c() > 0) {
                arrayList3.add(obj);
            }
        }
        m131177E0 = AbstractC25332a0.m131177E0(arrayList3, C19140e.f95172a.m100455f());
        C19137b c19137b = C19137b.f95167a;
        m131214n0 = AbstractC25332a0.m131214n0(m131177E0, "-", null, null, 0, null, null, 62, null);
        c19137b.m100444f("REACT_FEED_ABSTRACT_USE_CASE", "getNewTopReactionsList: \n " + m131214n0);
        return m131177E0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int m98146h(int i11) {
        if (i11 > 0) {
            return i11;
        }
        return 1;
    }
}
