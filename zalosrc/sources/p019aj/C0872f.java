package p019aj;

import ag0.AbstractC0837p0;
import bj.C2818b;
import bj.InterfaceC2817a;
import com.zing.zalo.data.entity.chat.message.MessageId;
import d60.C17794c;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fj.C18957a0;
import fj.InterfaceC18956a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import on0.AbstractC24341v;
import p020ak.C0882a;
import p020ak.C0883b;
import p020ak.C0884c;
import p037bk.C2827a;
import p056cj.C3538f;
import p056cj.C3540h;
import p056cj.C3545m;
import p363nh.C23744a;
import p405ov.C24559a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p718zj.C32218a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;

/* renamed from: aj.f */
/* loaded from: classes.dex */
public final class C0872f {
    public static final b Companion = new b(null);

    /* renamed from: w */
    private static final InterfaceC24854k f3188w;

    /* renamed from: a */
    private final InterfaceC2817a f3189a;

    /* renamed from: b */
    private final InterfaceC18956a f3190b;

    /* renamed from: c */
    private final int f3191c;

    /* renamed from: d */
    private long f3192d;

    /* renamed from: e */
    private final Map f3193e;

    /* renamed from: f */
    private final Set f3194f;

    /* renamed from: g */
    private final Map f3195g;

    /* renamed from: h */
    private String f3196h;

    /* renamed from: i */
    private int f3197i;

    /* renamed from: j */
    private final Map f3198j;

    /* renamed from: k */
    private final Map f3199k;

    /* renamed from: l */
    private C2827a f3200l;

    /* renamed from: m */
    private final InterfaceC29232g f3201m;

    /* renamed from: n */
    private C32218a f3202n;

    /* renamed from: o */
    private C0884c f3203o;

    /* renamed from: p */
    private final InterfaceC29232g f3204p;

    /* renamed from: q */
    private final InterfaceC29232g f3205q;

    /* renamed from: r */
    private final Map f3206r;

    /* renamed from: s */
    private final Map f3207s;

    /* renamed from: t */
    private final Map f3208t;

    /* renamed from: u */
    private boolean f3209u;

    /* renamed from: v */
    private final HashMap f3210v;

    /* renamed from: aj.f$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f3211q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0872f mo12V4() {
            return c.f3212a.m2570a();
        }
    }

    /* renamed from: aj.f$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0872f m2569a() {
            return (C0872f) C0872f.f3188w.getValue();
        }
    }

    /* renamed from: aj.f$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f3212a = new c();

        /* renamed from: b */
        private static final C0872f f3213b = new C0872f(new C2818b(), new C18957a0());

        private c() {
        }

        /* renamed from: a */
        public final C0872f m2570a() {
            return f3213b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.f$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0882a mo12V4() {
            return C0872f.this.f3189a.mo13606l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.f$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C0883b mo12V4() {
            return C0872f.this.f3189a.mo13600f();
        }
    }

    /* renamed from: aj.f$f */
    /* loaded from: classes.dex */
    public static final class f extends LinkedHashMap {
        f() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m2573a(String str) {
            return super.containsKey(str);
        }

        /* renamed from: b */
        public /* bridge */ boolean m2574b(C3538f c3538f) {
            return super.containsValue(c3538f);
        }

        /* renamed from: c */
        public /* bridge */ C3538f m2575c(String str) {
            return (C3538f) super.get(str);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return m2573a((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C3538f)) {
                return false;
            }
            return m2574b((C3538f) obj);
        }

        /* renamed from: e */
        public /* bridge */ Set m2576e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return m2576e();
        }

        /* renamed from: f */
        public /* bridge */ Set m2577f() {
            return super.keySet();
        }

        /* renamed from: g */
        public /* bridge */ C3538f m2578g(String str, C3538f c3538f) {
            return (C3538f) super.getOrDefault(str, c3538f);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return m2575c((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return m2578g((String) obj, (C3538f) obj2);
        }

        /* renamed from: h */
        public /* bridge */ int m2579h() {
            return super.size();
        }

        /* renamed from: i */
        public /* bridge */ Collection m2580i() {
            return super.values();
        }

        /* renamed from: k */
        public /* bridge */ C3538f m2581k(String str) {
            return (C3538f) super.remove(str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return m2577f();
        }

        /* renamed from: l */
        public /* bridge */ boolean m2582l(String str, C3538f c3538f) {
            return super.remove(str, c3538f);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof String) {
                return m2581k((String) obj);
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "eldest");
            if (size() > 50) {
                return true;
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m2579h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return m2580i();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof C3538f)) {
                return m2582l((String) obj, (C3538f) obj2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.f$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            Map m131417v;
            m131417v = AbstractC25363p0.m131417v(C0872f.this.f3189a.mo13613s());
            return m131417v;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f3211q);
        f3188w = m129210a;
    }

    public C0872f(InterfaceC2817a interfaceC2817a, InterfaceC18956a interfaceC18956a) {
        AbstractC19074t.m100208f(interfaceC2817a, "localDataSource");
        AbstractC19074t.m100208f(interfaceC18956a, "apiHelper");
        this.f3189a = interfaceC2817a;
        this.f3190b = interfaceC18956a;
        this.f3191c = 50;
        this.f3192d = -1L;
        this.f3193e = Collections.synchronizedMap(new HashMap());
        this.f3194f = new HashSet();
        this.f3195g = Collections.synchronizedMap(new HashMap());
        this.f3196h = "";
        this.f3197i = -1;
        this.f3198j = new HashMap();
        Map synchronizedMap = Collections.synchronizedMap(new f());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f3199k = synchronizedMap;
        this.f3201m = AbstractC29233h.m145990a(new g());
        this.f3204p = AbstractC29233h.m145990a(new d());
        this.f3205q = AbstractC29233h.m145990a(new e());
        Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        this.f3206r = synchronizedMap2;
        this.f3207s = new HashMap();
        Map synchronizedMap3 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap3, "synchronizedMap(...)");
        this.f3208t = synchronizedMap3;
        this.f3210v = new HashMap();
    }

    /* renamed from: I */
    private final C0882a m2494I() {
        return (C0882a) this.f3204p.getValue();
    }

    /* renamed from: J */
    private final C0883b m2495J() {
        return (C0883b) this.f3205q.getValue();
    }

    /* renamed from: M */
    public static final void m2496M(C0872f c0872f, String str, C3540h c3540h) {
        AbstractC19074t.m100208f(c0872f, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(c3540h, "$draftMsg");
        c0872f.f3189a.mo13603i(str, c3540h);
    }

    /* renamed from: P */
    public static final void m2497P(C0872f c0872f, String str, C3545m c3545m, String str2) {
        AbstractC19074t.m100208f(c0872f, "this$0");
        AbstractC19074t.m100208f(str, "$pageId");
        AbstractC19074t.m100208f(c3545m, "$menu");
        AbstractC19074t.m100208f(str2, "$menuContent");
        c0872f.f3189a.mo13616v(str, c3545m, str2);
    }

    /* renamed from: b0 */
    public static final void m2500b0(C0872f c0872f) {
        AbstractC19074t.m100208f(c0872f, "this$0");
        Map mo13601g = c0872f.f3189a.mo13601g();
        if (!mo13601g.isEmpty()) {
            c0872f.f3195g.putAll(mo13601g);
            C23744a.Companion.m124119a().m124116d(6031, new Object[0]);
        }
    }

    /* renamed from: n */
    public static final void m2506n(C0872f c0872f, String str) {
        AbstractC19074t.m100208f(c0872f, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        c0872f.f3189a.mo13618x(str);
    }

    /* renamed from: u */
    public static final C0872f m2507u() {
        return Companion.m2569a();
    }

    /* renamed from: v0 */
    public static final void m2508v0(C0872f c0872f) {
        AbstractC19074t.m100208f(c0872f, "this$0");
        C19669z.Companion.m103232a().m103229t0();
        c0872f.f3190b.mo99469b();
    }

    /* renamed from: y */
    private final Map m2509y() {
        return (Map) this.f3201m.getValue();
    }

    /* renamed from: A */
    public final int m2510A() {
        return this.f3191c;
    }

    /* renamed from: B */
    public final C0882a m2511B() {
        return m2494I();
    }

    /* renamed from: C */
    public final int m2512C(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Integer num = (Integer) this.f3210v.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    /* renamed from: D */
    public final C3545m m2513D(String str) {
        AbstractC19074t.m100208f(str, "pageId");
        C3545m c3545m = (C3545m) this.f3193e.get(str);
        if (c3545m == null) {
            C3545m mo13599e = this.f3189a.mo13599e(str);
            if (mo13599e != null) {
                Map map = this.f3193e;
                AbstractC19074t.m100207e(map, "menuMap");
                map.put(str, mo13599e);
                return mo13599e;
            }
            return null;
        }
        return c3545m;
    }

    /* renamed from: E */
    public final C0883b m2514E() {
        return m2495J();
    }

    /* renamed from: F */
    public final C0884c m2515F() {
        if (this.f3203o == null) {
            this.f3203o = this.f3189a.mo13612r();
        }
        C0884c c0884c = this.f3203o;
        AbstractC19074t.m100206d(c0884c, "null cannot be cast to non-null type com.zing.zalo.data.entity.chat.suggestion.photo.PhotoSuggestSetting");
        return c0884c;
    }

    /* renamed from: G */
    public final C2827a m2516G() {
        C2827a c2827a = this.f3200l;
        if (c2827a == null) {
            C2827a mo13595a = this.f3189a.mo13595a();
            this.f3200l = mo13595a;
            return mo13595a;
        }
        return c2827a;
    }

    /* renamed from: H */
    public final int m2517H(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f3189a.mo13614t(str, j11);
    }

    /* renamed from: K */
    public final int m2518K(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int m2512C = m2512C(str) + 1;
        this.f3210v.put(str, Integer.valueOf(m2512C));
        return m2512C;
    }

    /* renamed from: L */
    public final void m2519L(String str, C3540h c3540h) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c3540h, "draftMsg");
        Map map = this.f3195g;
        AbstractC19074t.m100207e(map, "draftMsgMap");
        map.put(str, c3540h);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: aj.d

            /* renamed from: q */
            public final /* synthetic */ String f3182q;

            /* renamed from: r */
            public final /* synthetic */ C3540h f3183r;

            public /* synthetic */ RunnableC0870d(String str2, C3540h c3540h2) {
                r2 = str2;
                r3 = c3540h2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0872f.m2496M(C0872f.this, r2, r3);
            }
        });
    }

    /* renamed from: N */
    public final void m2520N(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        m2509y().put(str, Long.valueOf(j11));
        this.f3189a.mo13607m(str, j11);
    }

    /* renamed from: O */
    public final void m2521O(String str, C3545m c3545m, String str2) {
        AbstractC19074t.m100208f(str, "pageId");
        AbstractC19074t.m100208f(c3545m, "menu");
        AbstractC19074t.m100208f(str2, "menuContent");
        Map map = this.f3193e;
        AbstractC19074t.m100207e(map, "menuMap");
        map.put(str, c3545m);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: aj.e

            /* renamed from: q */
            public final /* synthetic */ String f3185q;

            /* renamed from: r */
            public final /* synthetic */ C3545m f3186r;

            /* renamed from: s */
            public final /* synthetic */ String f3187s;

            public /* synthetic */ RunnableC0871e(String str3, C3545m c3545m2, String str22) {
                r2 = str3;
                r3 = c3545m2;
                r4 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0872f.m2497P(C0872f.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: Q */
    public final void m2522Q(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f3194f.add(str);
    }

    /* renamed from: R */
    public final boolean m2523R(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f3194f.contains(str);
    }

    /* renamed from: S */
    public final boolean m2524S(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        List list = (List) this.f3208t.get(c17945a0.mo95039W2());
        if (list == null) {
            return false;
        }
        return list.contains(c17945a0.m95029V3());
    }

    /* renamed from: T */
    public final boolean m2525T() {
        if (this.f3189a.mo13609o() && this.f3189a.mo13602h()) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m2526U() {
        return this.f3189a.mo13602h();
    }

    /* renamed from: V */
    public final boolean m2527V(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return AbstractC19074t.m100204b(this.f3196h, str);
    }

    /* renamed from: W */
    public final boolean m2528W() {
        return this.f3189a.mo13611q();
    }

    /* renamed from: X */
    public final boolean m2529X(String str) {
        AbstractC19074t.m100208f(str, "friendUid");
        if (m2561t(str) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public final boolean m2530Y(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (((List) this.f3208t.get(str)) != null && (!r2.isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean m2531Z() {
        return this.f3209u;
    }

    /* renamed from: a0 */
    public final void m2532a0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: aj.b
            public /* synthetic */ RunnableC0868b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0872f.m2500b0(C0872f.this);
            }
        });
    }

    /* renamed from: c0 */
    public final void m2533c0(String str, C3538f c3538f) {
        AbstractC19074t.m100208f(str, "uid");
        if (str.length() == 0 || c3538f == null) {
            return;
        }
        this.f3199k.put(str, c3538f);
    }

    /* renamed from: d0 */
    public final void m2534d0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        List list = (List) this.f3208t.get(c17945a0.mo95039W2());
        if (list != null) {
            list.remove(c17945a0.m95029V3());
        }
    }

    /* renamed from: e0 */
    public final void m2535e0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (str.length() == 0) {
            return;
        }
        this.f3199k.remove(str);
    }

    /* renamed from: f0 */
    public final void m2536f0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f3194f.remove(str);
    }

    /* renamed from: g0 */
    public final C17945a0 m2537g0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C17945a0) this.f3206r.remove(str);
    }

    /* renamed from: h */
    public final void m2538h(String str) {
        AbstractC19074t.m100208f(str, "data");
        this.f3190b.mo99468a(str);
    }

    /* renamed from: h0 */
    public final void m2539h0() {
        this.f3201m.reset();
        this.f3204p.reset();
        this.f3205q.reset();
        C17794c.Companion.m93979a().m93973i();
    }

    /* renamed from: i */
    public final void m2540i(String str) {
        AbstractC19074t.m100208f(str, "friendUid");
        this.f3198j.put(str, 1);
    }

    /* renamed from: i0 */
    public final void m2541i0(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        this.f3207s.put(str, Long.valueOf(j11));
    }

    /* renamed from: j */
    public final void m2542j(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        List list = (List) this.f3208t.get(c17945a0.mo95039W2());
        if (list == null) {
            list = Collections.synchronizedList(new ArrayList());
        }
        AbstractC19074t.m100205c(list);
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        list.add(m95029V3);
        Map map = this.f3208t;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        map.put(mo95039W2, list);
    }

    /* renamed from: j0 */
    public final void m2543j0(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "whereLeftJump");
        this.f3206r.put(str, c17945a0);
    }

    /* renamed from: k */
    public final void m2544k() {
        C24559a.m127933c("ChatRepository", "clearAllMemCache()");
        m2539h0();
        this.f3199k.clear();
        this.f3193e.clear();
        this.f3198j.clear();
        this.f3195g.clear();
    }

    /* renamed from: k0 */
    public final void m2545k0(int i11) {
        this.f3197i = i11;
    }

    /* renamed from: l */
    public final void m2546l(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f3208t.remove(str);
    }

    /* renamed from: l0 */
    public final void m2547l0(boolean z11) {
        this.f3189a.mo13597c(z11);
    }

    /* renamed from: m */
    public final void m2548m(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f3195g.remove(str);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: aj.c

            /* renamed from: q */
            public final /* synthetic */ String f3180q;

            public /* synthetic */ RunnableC0869c(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0872f.m2506n(C0872f.this, r2);
            }
        });
    }

    /* renamed from: m0 */
    public final void m2549m0(boolean z11) {
        this.f3189a.mo13617w(z11);
    }

    /* renamed from: n0 */
    public final void m2550n0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f3196h = str;
    }

    /* renamed from: o */
    public final void m2551o(String str) {
        AbstractC19074t.m100208f(str, "friendUid");
        this.f3198j.remove(str);
    }

    /* renamed from: o0 */
    public final void m2552o0(String str) {
        AbstractC19074t.m100208f(str, "config");
        this.f3202n = C32218a.Companion.m155348a(str);
        this.f3189a.mo13615u(str);
    }

    /* renamed from: p */
    public final void m2553p() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 35);
        long m2567z = m2567z();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("ChatRepository").mo104556o(8, m127130z + "\nMax TS: " + m2567z + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: p0 */
    public final void m2554p0(long j11) {
        this.f3192d = j11;
    }

    /* renamed from: q */
    public final C3538f m2555q(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (str.length() == 0) {
            return null;
        }
        return (C3538f) this.f3199k.get(str);
    }

    /* renamed from: q0 */
    public final void m2556q0(boolean z11) {
        this.f3189a.mo13610p(z11);
    }

    /* renamed from: r */
    public final C3540h m2557r(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C3540h) this.f3195g.get(str);
    }

    /* renamed from: r0 */
    public final void m2558r0(String str) {
        AbstractC19074t.m100208f(str, "config");
        this.f3203o = C0884c.Companion.m2733a(str);
        this.f3189a.mo13608n(str);
    }

    /* renamed from: s */
    public final int m2559s() {
        return this.f3197i;
    }

    /* renamed from: s0 */
    public final void m2560s0(C2827a c2827a) {
        AbstractC19074t.m100208f(c2827a, "themeInfo");
        this.f3200l = c2827a;
        this.f3189a.mo13605k(c2827a);
    }

    /* renamed from: t */
    public final int m2561t(String str) {
        AbstractC19074t.m100208f(str, "friendUid");
        Integer num = (Integer) this.f3198j.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(this.f3189a.mo13598d(str));
        this.f3198j.put(str, valueOf);
        return valueOf.intValue();
    }

    /* renamed from: t0 */
    public final void m2562t0(boolean z11) {
        this.f3209u = z11;
    }

    /* renamed from: u0 */
    public final void m2563u0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: aj.a
            public /* synthetic */ RunnableC0867a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0872f.m2508v0(C0872f.this);
            }
        });
    }

    /* renamed from: v */
    public final long m2564v(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Long l11 = (Long) this.f3207s.get(str);
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    /* renamed from: w */
    public final long m2565w(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Long l11 = (Long) m2509y().get(str);
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    /* renamed from: x */
    public final C32218a m2566x() {
        if (this.f3202n == null) {
            this.f3202n = this.f3189a.mo13596b();
        }
        C32218a c32218a = this.f3202n;
        AbstractC19074t.m100206d(c32218a, "null cannot be cast to non-null type com.zing.zalo.data.entity.chat.suggestion.link.LinkSuggestionConfig");
        return c32218a;
    }

    /* renamed from: z */
    public final synchronized long m2567z() {
        try {
            if (this.f3192d == -1) {
                this.f3192d = this.f3189a.mo13604j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3192d;
    }
}
