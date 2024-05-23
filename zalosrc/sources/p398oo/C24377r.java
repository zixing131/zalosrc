package p398oo;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: oo.r */
/* loaded from: classes4.dex */
public final class C24377r {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f117729a;

    /* renamed from: b */
    private final b f117730b;

    /* renamed from: oo.r$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24377r m127497a(String str) {
            AbstractC19074t.m100208f(str, "feedContentId");
            return new C24377r(str, null, 2, 0 == true ? 1 : 0);
        }

        /* renamed from: b */
        public final C24377r m127498b(String str) {
            AbstractC19074t.m100208f(str, "feedContentId");
            return new C24377r(str, b.f117732q);
        }

        /* renamed from: c */
        public final b m127499c(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return b.f117731p;
                    }
                    return b.f117733r;
                }
                return b.f117731p;
            }
            return b.f117732q;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: oo.r$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f117731p = new b("NORMAL", 0);

        /* renamed from: q */
        public static final b f117732q = new b("TEMP", 1);

        /* renamed from: r */
        public static final b f117733r = new b("NEW_GENERATED", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f117734s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f117735t;

        static {
            b[] m127500b = m127500b();
            f117734s = m127500b;
            f117735t = AbstractC30166b.m148796a(m127500b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m127500b() {
            return new b[]{f117731p, f117732q, f117733r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f117734s.clone();
        }
    }

    public C24377r(String str, b bVar) {
        AbstractC19074t.m100208f(str, "feedContentId");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f117729a = str;
        this.f117730b = bVar;
    }

    /* renamed from: a */
    public final String m127495a() {
        return this.f117729a;
    }

    /* renamed from: b */
    public final b m127496b() {
        return this.f117730b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24377r)) {
            return false;
        }
        C24377r c24377r = (C24377r) obj;
        return AbstractC19074t.m100204b(this.f117729a, c24377r.f117729a) && this.f117730b == c24377r.f117730b;
    }

    public int hashCode() {
        return (this.f117729a.hashCode() * 31) + this.f117730b.hashCode();
    }

    public String toString() {
        return "OrderData(feedContentId=" + this.f117729a + ", type=" + this.f117730b + ")";
    }

    public /* synthetic */ C24377r(String str, b bVar, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? b.f117731p : bVar);
    }
}
