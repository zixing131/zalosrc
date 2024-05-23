package pm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;

/* renamed from: pm0.r */
/* loaded from: classes.dex */
public final class C24861r implements Serializable {

    /* renamed from: q */
    public static final a f119264q = new a(null);

    /* renamed from: p */
    private final Object f119265p;

    /* renamed from: pm0.r$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: pm0.r$b */
    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: p */
        public final Throwable f119266p;

        public b(Throwable th2) {
            AbstractC19074t.m100208f(th2, "exception");
            this.f119266p = th2;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && AbstractC19074t.m100204b(this.f119266p, ((b) obj).f119266p)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f119266p.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f119266p + ')';
        }
    }

    private /* synthetic */ C24861r(Object obj) {
        this.f119265p = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C24861r m129217a(Object obj) {
        return new C24861r(obj);
    }

    /* renamed from: b */
    public static Object m129218b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m129219c(Object obj, Object obj2) {
        return (obj2 instanceof C24861r) && AbstractC19074t.m100204b(obj, ((C24861r) obj2).m129226j());
    }

    /* renamed from: d */
    public static final boolean m129220d(Object obj, Object obj2) {
        return AbstractC19074t.m100204b(obj, obj2);
    }

    /* renamed from: e */
    public static final Throwable m129221e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f119266p;
        }
        return null;
    }

    /* renamed from: f */
    public static int m129222f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m129223g(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: h */
    public static final boolean m129224h(Object obj) {
        return !(obj instanceof b);
    }

    /* renamed from: i */
    public static String m129225i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m129219c(this.f119265p, obj);
    }

    public int hashCode() {
        return m129222f(this.f119265p);
    }

    /* renamed from: j */
    public final /* synthetic */ Object m129226j() {
        return this.f119265p;
    }

    public String toString() {
        return m129225i(this.f119265p);
    }
}
