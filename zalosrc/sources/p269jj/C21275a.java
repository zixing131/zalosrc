package p269jj;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Map;
import org.json.JSONArray;
import p299kj.C21743b;
import p299kj.InterfaceC21742a;
import p325lj.C22498e;
import p325lj.C22499f;
import p349mj.C23321g;
import p349mj.InterfaceC23315a;
import p405ov.C24559a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: jj.a */
/* loaded from: classes3.dex */
public final class C21275a {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static final InterfaceC24854k f103653f;

    /* renamed from: a */
    private final InterfaceC21742a f103654a;

    /* renamed from: b */
    private final InterfaceC23315a f103655b;

    /* renamed from: c */
    private final InterfaceC29232g f103656c;

    /* renamed from: d */
    private final InterfaceC24854k f103657d;

    /* renamed from: e */
    private final InterfaceC29232g f103658e;

    /* renamed from: jj.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f103659q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C21275a mo12V4() {
            return c.f103660a.m110212a();
        }
    }

    /* renamed from: jj.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C21275a m110211a() {
            return (C21275a) C21275a.f103653f.getValue();
        }
    }

    /* renamed from: jj.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f103660a = new c();

        /* renamed from: b */
        private static final C21275a f103661b = new C21275a(new C21743b(), new C23321g());

        private c() {
        }

        /* renamed from: a */
        public final C21275a m110212a() {
            return f103661b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            return C21275a.this.f103654a.mo112189c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C22498e mo12V4() {
            C22498e mo112191e = C21275a.this.f103654a.mo112191e();
            if (mo112191e == null) {
                return new C22498e();
            }
            return mo112191e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jj.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C22499f mo12V4() {
            return C21275a.this.f103654a.mo112188b();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f103659q);
        f103653f = m129210a;
    }

    public C21275a(InterfaceC21742a interfaceC21742a, InterfaceC23315a interfaceC23315a) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC21742a, "localDataSource");
        AbstractC19074t.m100208f(interfaceC23315a, "apiHelper");
        this.f103654a = interfaceC21742a;
        this.f103655b = interfaceC23315a;
        this.f103656c = AbstractC29233h.m145990a(new f());
        m129210a = AbstractC24856m.m129210a(new d());
        this.f103657d = m129210a;
        this.f103658e = AbstractC29233h.m145990a(new e());
    }

    /* renamed from: f */
    public static final C21275a m110197f() {
        return Companion.m110211a();
    }

    /* renamed from: i */
    private final C22499f m110198i() {
        return (C22499f) this.f103656c.getValue();
    }

    /* renamed from: j */
    private final Map m110199j() {
        return (Map) this.f103657d.getValue();
    }

    /* renamed from: k */
    private final C22498e m110200k() {
        return (C22498e) this.f103658e.getValue();
    }

    /* renamed from: c */
    public final void m110201c() {
        C24559a.m127933c("CommonRepository", "clearAllMemCache()");
        m110206l();
    }

    /* renamed from: d */
    public final void m110202d() {
        m110199j().clear();
        this.f103654a.mo112187a("");
    }

    /* renamed from: e */
    public final Map m110203e() {
        return m110199j();
    }

    /* renamed from: g */
    public final C22498e m110204g() {
        return m110200k();
    }

    /* renamed from: h */
    public final C22499f m110205h() {
        return m110198i();
    }

    /* renamed from: l */
    public final void m110206l() {
        this.f103656c.reset();
    }

    /* renamed from: m */
    public final void m110207m(Map map, JSONArray jSONArray) {
        AbstractC19074t.m100208f(map, "data");
        AbstractC19074t.m100208f(jSONArray, "dataJS");
        m110199j().putAll(map);
        InterfaceC21742a interfaceC21742a = this.f103654a;
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        interfaceC21742a.mo112187a(jSONArray2);
    }

    /* renamed from: n */
    public final void m110208n(String str) {
        AbstractC19074t.m100208f(str, "jsonData");
        this.f103654a.mo112190d(str);
        this.f103658e.reset();
    }

    /* renamed from: o */
    public final void m110209o(C22499f c22499f) {
        this.f103654a.mo112192f(c22499f);
        this.f103656c.reset();
    }
}
