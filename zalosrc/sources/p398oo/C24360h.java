package p398oo;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import p509sp.C26359h;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: oo.h */
/* loaded from: classes4.dex */
public final class C24360h implements InterfaceC24368l {

    /* renamed from: a */
    private final int f117580a;

    /* renamed from: b */
    private final C24348b f117581b;

    /* renamed from: c */
    private AtomicBoolean f117582c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        Object f117583s;

        /* renamed from: t */
        /* synthetic */ Object f117584t;

        /* renamed from: v */
        int f117586v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117584t = obj;
            this.f117586v |= Integer.MIN_VALUE;
            return C24360h.this.mo127373a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f117587s;

        /* renamed from: t */
        /* synthetic */ Object f117588t;

        /* renamed from: v */
        int f117590v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117588t = obj;
            this.f117590v |= Integer.MIN_VALUE;
            return C24360h.this.mo127375c(0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f117592r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f117592r = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Tab " + C24360h.this.m127376d() + "\n " + this.f117592r;
        }
    }

    public C24360h(int i11, C24348b c24348b) {
        AbstractC19074t.m100208f(c24348b, "feedApi");
        this.f117580a = i11;
        this.f117581b = c24348b;
        this.f117582c = new AtomicBoolean(true);
    }

    /* renamed from: e */
    private final void m127371e(String str) {
        C26359h.f125209a.mo135685a("FEED_TIMELINE", "REMOTE_SOURCE", new c(str));
    }

    /* renamed from: f */
    private final void m127372f(C24358g c24358g) {
        if (c24358g.m127369d() == 3 || c24358g.m127369d() == 4 || c24358g.m127369d() == 0) {
            this.f117582c.set(c24358g.m127370e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // p398oo.InterfaceC24368l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo127373a(C24376q c24376q, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C24360h c24360h;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f117586v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f117586v = i12 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.f117584t;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar2.f117586v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c24360h = (C24360h) aVar2.f117583s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m127371e("fetchNewFeed " + c24376q);
                    C24348b c24348b = this.f117581b;
                    int m127376d = m127376d();
                    long m127493c = c24376q.m127493c();
                    long m127494d = c24376q.m127494d();
                    aVar2.f117583s = this;
                    aVar2.f117586v = 1;
                    obj = c24348b.m127232h(m127376d, "0", "0", m127493c, m127494d, 0, aVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24360h = this;
                }
                C24358g c24358g = (C24358g) obj;
                c24360h.m127371e("fetchNewFeed completed " + c24358g);
                c24360h.m127372f(c24358g);
                return c24358g;
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.f117584t;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar22.f117586v;
        if (i11 == 0) {
        }
        C24358g c24358g2 = (C24358g) obj2;
        c24360h.m127371e("fetchNewFeed completed " + c24358g2);
        c24360h.m127372f(c24358g2);
        return c24358g2;
    }

    @Override // p398oo.InterfaceC24368l
    /* renamed from: b */
    public boolean mo127374b() {
        return this.f117582c.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // p398oo.InterfaceC24368l
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo127375c(int i11, C24376q c24376q, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i12;
        C24360h c24360h;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i13 = bVar.f117590v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f117590v = i13 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f117588t;
                m142578e = AbstractC28298d.m142578e();
                i12 = bVar2.f117590v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c24360h = (C24360h) bVar2.f117587s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m127371e("loadFeedPage page " + i11 + " " + c24376q);
                    C24348b c24348b = this.f117581b;
                    int m127376d = m127376d();
                    String m127492b = c24376q.m127492b();
                    String m127491a = c24376q.m127491a();
                    long m127493c = c24376q.m127493c();
                    long m127494d = c24376q.m127494d();
                    bVar2.f117587s = this;
                    bVar2.f117590v = 1;
                    obj = c24348b.m127232h(m127376d, m127492b, m127491a, m127493c, m127494d, i11, bVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24360h = this;
                }
                C24358g c24358g = (C24358g) obj;
                c24360h.m127371e("loadFeedPage completed " + c24358g);
                c24360h.m127372f(c24358g);
                return c24358g;
            }
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f117588t;
        m142578e = AbstractC28298d.m142578e();
        i12 = bVar22.f117590v;
        if (i12 == 0) {
        }
        C24358g c24358g2 = (C24358g) obj2;
        c24360h.m127371e("loadFeedPage completed " + c24358g2);
        c24360h.m127372f(c24358g2);
        return c24358g2;
    }

    /* renamed from: d */
    public int m127376d() {
        return this.f117580a;
    }

    public /* synthetic */ C24360h(int i11, C24348b c24348b, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? new C24348b() : c24348b);
    }
}
