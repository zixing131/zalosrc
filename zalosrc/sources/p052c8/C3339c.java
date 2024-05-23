package p052c8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c8.c */
/* loaded from: classes.dex */
public final class C3339c {

    /* renamed from: a */
    private final String f14161a;

    /* renamed from: b */
    private final Set f14162b;

    /* renamed from: c */
    private final Set f14163c;

    /* renamed from: d */
    private final int f14164d;

    /* renamed from: e */
    private final int f14165e;

    /* renamed from: f */
    private final InterfaceC3345h f14166f;

    /* renamed from: g */
    private final Set f14167g;

    /* renamed from: c */
    public static b m16819c(C3338b0 c3338b0) {
        return new b(c3338b0, new C3338b0[0]);
    }

    /* renamed from: d */
    public static b m16820d(C3338b0 c3338b0, C3338b0... c3338b0Arr) {
        return new b(c3338b0, c3338b0Arr);
    }

    /* renamed from: e */
    public static b m16821e(Class cls) {
        return new b(cls, new Class[0]);
    }

    /* renamed from: f */
    public static b m16822f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    /* renamed from: l */
    public static C3339c m16823l(final Object obj, Class cls) {
        return m16824m(cls).m16845f(new InterfaceC3345h() { // from class: c8.b
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                Object m16825q;
                m16825q = C3339c.m16825q(obj, interfaceC3342e);
                return m16825q;
            }
        }).m16843d();
    }

    /* renamed from: m */
    public static b m16824m(Class cls) {
        return m16821e(cls).m16838g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Object m16825q(Object obj, InterfaceC3342e interfaceC3342e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ Object m16826r(Object obj, InterfaceC3342e interfaceC3342e) {
        return obj;
    }

    /* renamed from: s */
    public static C3339c m16827s(final Object obj, Class cls, Class... clsArr) {
        return m16822f(cls, clsArr).m16845f(new InterfaceC3345h() { // from class: c8.a
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                Object m16826r;
                m16826r = C3339c.m16826r(obj, interfaceC3342e);
                return m16826r;
            }
        }).m16843d();
    }

    /* renamed from: g */
    public Set m16828g() {
        return this.f14163c;
    }

    /* renamed from: h */
    public InterfaceC3345h m16829h() {
        return this.f14166f;
    }

    /* renamed from: i */
    public String m16830i() {
        return this.f14161a;
    }

    /* renamed from: j */
    public Set m16831j() {
        return this.f14162b;
    }

    /* renamed from: k */
    public Set m16832k() {
        return this.f14167g;
    }

    /* renamed from: n */
    public boolean m16833n() {
        return this.f14164d == 1;
    }

    /* renamed from: o */
    public boolean m16834o() {
        return this.f14164d == 2;
    }

    /* renamed from: p */
    public boolean m16835p() {
        return this.f14165e == 0;
    }

    /* renamed from: t */
    public C3339c m16836t(InterfaceC3345h interfaceC3345h) {
        return new C3339c(this.f14161a, this.f14162b, this.f14163c, this.f14164d, this.f14165e, interfaceC3345h, this.f14167g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f14162b.toArray()) + ">{" + this.f14164d + ", type=" + this.f14165e + ", deps=" + Arrays.toString(this.f14163c.toArray()) + "}";
    }

    /* renamed from: c8.c$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private String f14168a;

        /* renamed from: b */
        private final Set f14169b;

        /* renamed from: c */
        private final Set f14170c;

        /* renamed from: d */
        private int f14171d;

        /* renamed from: e */
        private int f14172e;

        /* renamed from: f */
        private InterfaceC3345h f14173f;

        /* renamed from: g */
        private final Set f14174g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public b m16838g() {
            this.f14172e = 1;
            return this;
        }

        /* renamed from: i */
        private b m16839i(int i11) {
            boolean z11;
            if (this.f14171d == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC3336a0.m16814d(z11, "Instantiation type has already been set.");
            this.f14171d = i11;
            return this;
        }

        /* renamed from: j */
        private void m16840j(C3338b0 c3338b0) {
            AbstractC3336a0.m16811a(!this.f14169b.contains(c3338b0), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public b m16841b(C3355r c3355r) {
            AbstractC3336a0.m16813c(c3355r, "Null dependency");
            m16840j(c3355r.m16912c());
            this.f14170c.add(c3355r);
            return this;
        }

        /* renamed from: c */
        public b m16842c() {
            return m16839i(1);
        }

        /* renamed from: d */
        public C3339c m16843d() {
            boolean z11;
            if (this.f14173f != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC3336a0.m16814d(z11, "Missing required property: factory.");
            return new C3339c(this.f14168a, new HashSet(this.f14169b), new HashSet(this.f14170c), this.f14171d, this.f14172e, this.f14173f, this.f14174g);
        }

        /* renamed from: e */
        public b m16844e() {
            return m16839i(2);
        }

        /* renamed from: f */
        public b m16845f(InterfaceC3345h interfaceC3345h) {
            this.f14173f = (InterfaceC3345h) AbstractC3336a0.m16813c(interfaceC3345h, "Null factory");
            return this;
        }

        /* renamed from: h */
        public b m16846h(String str) {
            this.f14168a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f14168a = null;
            HashSet hashSet = new HashSet();
            this.f14169b = hashSet;
            this.f14170c = new HashSet();
            this.f14171d = 0;
            this.f14172e = 0;
            this.f14174g = new HashSet();
            AbstractC3336a0.m16813c(cls, "Null interface");
            hashSet.add(C3338b0.m16816b(cls));
            for (Class cls2 : clsArr) {
                AbstractC3336a0.m16813c(cls2, "Null interface");
                this.f14169b.add(C3338b0.m16816b(cls2));
            }
        }

        private b(C3338b0 c3338b0, C3338b0... c3338b0Arr) {
            this.f14168a = null;
            HashSet hashSet = new HashSet();
            this.f14169b = hashSet;
            this.f14170c = new HashSet();
            this.f14171d = 0;
            this.f14172e = 0;
            this.f14174g = new HashSet();
            AbstractC3336a0.m16813c(c3338b0, "Null interface");
            hashSet.add(c3338b0);
            for (C3338b0 c3338b02 : c3338b0Arr) {
                AbstractC3336a0.m16813c(c3338b02, "Null interface");
            }
            Collections.addAll(this.f14169b, c3338b0Arr);
        }
    }

    private C3339c(String str, Set set, Set set2, int i11, int i12, InterfaceC3345h interfaceC3345h, Set set3) {
        this.f14161a = str;
        this.f14162b = Collections.unmodifiableSet(set);
        this.f14163c = Collections.unmodifiableSet(set2);
        this.f14164d = i11;
        this.f14165e = i12;
        this.f14166f = interfaceC3345h;
        this.f14167g = Collections.unmodifiableSet(set3);
    }
}
