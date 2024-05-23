package p425po;

import bo.InterfaceC3058y;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: po.h */
/* loaded from: classes4.dex */
public final class C24886h extends AbstractC24887i {

    /* renamed from: b */
    private final String f119401b;

    /* renamed from: c */
    private String f119402c;

    /* renamed from: d */
    private final String f119403d;

    /* renamed from: e */
    private d f119404e;

    /* renamed from: f */
    private String f119405f;

    /* renamed from: po.h$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3058y {

        /* renamed from: a */
        private final C24886h f119406a;

        public a(C24886h c24886h) {
            AbstractC19074t.m100208f(c24886h, "data");
            this.f119406a = c24886h;
        }

        /* renamed from: a */
        public final C24886h m129405a() {
            return this.f119406a;
        }
    }

    /* renamed from: po.h$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3058y {

        /* renamed from: a */
        private final C24886h f119407a;

        public b(C24886h c24886h) {
            AbstractC19074t.m100208f(c24886h, "data");
            this.f119407a = c24886h;
        }

        /* renamed from: a */
        public final C24886h m129406a() {
            return this.f119407a;
        }
    }

    /* renamed from: po.h$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3058y {

        /* renamed from: a */
        private final C24886h f119408a;

        public c(C24886h c24886h) {
            AbstractC19074t.m100208f(c24886h, "data");
            this.f119408a = c24886h;
        }

        /* renamed from: a */
        public final C24886h m129407a() {
            return this.f119408a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: po.h$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: p */
        public static final d f119409p = new d("DELETE", 0);

        /* renamed from: q */
        public static final d f119410q = new d("ADD", 1);

        /* renamed from: r */
        public static final d f119411r = new d("LOADING", 2);

        /* renamed from: s */
        private static final /* synthetic */ d[] f119412s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f119413t;

        static {
            d[] m129408b = m129408b();
            f119412s = m129408b;
            f119413t = AbstractC30166b.m148796a(m129408b);
        }

        private d(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m129408b() {
            return new d[]{f119409p, f119410q, f119411r};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f119412s.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24886h(String str, String str2, String str3, d dVar, String str4) {
        super(0);
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "name");
        AbstractC19074t.m100208f(str3, "avatarUrl");
        AbstractC19074t.m100208f(dVar, "state");
        AbstractC19074t.m100208f(str4, "tag");
        this.f119401b = str;
        this.f119402c = str2;
        this.f119403d = str3;
        this.f119404e = dVar;
        this.f119405f = str4;
    }

    /* renamed from: b */
    public final String m129400b() {
        return this.f119402c;
    }

    /* renamed from: c */
    public final d m129401c() {
        return this.f119404e;
    }

    /* renamed from: d */
    public final String m129402d() {
        return this.f119405f;
    }

    /* renamed from: e */
    public final String m129403e() {
        return this.f119401b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24886h)) {
            return false;
        }
        C24886h c24886h = (C24886h) obj;
        return AbstractC19074t.m100204b(this.f119401b, c24886h.f119401b) && AbstractC19074t.m100204b(this.f119402c, c24886h.f119402c) && AbstractC19074t.m100204b(this.f119403d, c24886h.f119403d) && this.f119404e == c24886h.f119404e && AbstractC19074t.m100204b(this.f119405f, c24886h.f119405f);
    }

    /* renamed from: f */
    public final void m129404f(d dVar) {
        AbstractC19074t.m100208f(dVar, "<set-?>");
        this.f119404e = dVar;
    }

    public int hashCode() {
        return (((((((this.f119401b.hashCode() * 31) + this.f119402c.hashCode()) * 31) + this.f119403d.hashCode()) * 31) + this.f119404e.hashCode()) * 31) + this.f119405f.hashCode();
    }

    public String toString() {
        return "MoveTabProfileRow(uid=" + this.f119401b + ", name=" + this.f119402c + ", avatarUrl=" + this.f119403d + ", state=" + this.f119404e + ", tag=" + this.f119405f + ")";
    }

    public /* synthetic */ C24886h(String str, String str2, String str3, d dVar, String str4, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, dVar, (i11 & 16) != 0 ? "" : str4);
    }
}
