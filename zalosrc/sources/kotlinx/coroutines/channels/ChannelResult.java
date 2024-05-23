package kotlinx.coroutines.channels;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.coroutines.InternalCoroutinesApi;

/* loaded from: classes7.dex */
public final class ChannelResult<T> {

    /* renamed from: b */
    public static final Companion f106070b = new Companion(null);

    /* renamed from: c */
    private static final Failed f106071c = new Failed();

    /* renamed from: a */
    private final Object f106072a;

    /* loaded from: classes7.dex */
    public static final class Closed extends Failed {

        /* renamed from: a */
        public final Throwable f106073a;

        public Closed(Throwable th2) {
            this.f106073a = th2;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof Closed) && AbstractC19074t.m100204b(this.f106073a, ((Closed) obj).f106073a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th2 = this.f106073a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public String toString() {
            return "Closed(" + this.f106073a + ')';
        }
    }

    @InternalCoroutinesApi
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Object m113091a(Throwable th2) {
            return ChannelResult.m113082c(new Closed(th2));
        }

        /* renamed from: b */
        public final Object m113092b() {
            return ChannelResult.m113082c(ChannelResult.f106071c);
        }

        /* renamed from: c */
        public final Object m113093c(Object obj) {
            return ChannelResult.m113082c(obj);
        }
    }

    /* loaded from: classes7.dex */
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ ChannelResult(Object obj) {
        this.f106072a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ ChannelResult m113081b(Object obj) {
        return new ChannelResult(obj);
    }

    /* renamed from: c */
    public static Object m113082c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m113083d(Object obj, Object obj2) {
        return (obj2 instanceof ChannelResult) && AbstractC19074t.m100204b(obj, ((ChannelResult) obj2).m113090k());
    }

    /* renamed from: e */
    public static final Throwable m113084e(Object obj) {
        Closed closed;
        if (obj instanceof Closed) {
            closed = (Closed) obj;
        } else {
            closed = null;
        }
        if (closed == null) {
            return null;
        }
        return closed.f106073a;
    }

    /* renamed from: f */
    public static final Object m113085f(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m113086g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m113087h(Object obj) {
        return obj instanceof Closed;
    }

    /* renamed from: i */
    public static final boolean m113088i(Object obj) {
        return !(obj instanceof Failed);
    }

    /* renamed from: j */
    public static String m113089j(Object obj) {
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m113083d(this.f106072a, obj);
    }

    public int hashCode() {
        return m113086g(this.f106072a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m113090k() {
        return this.f106072a;
    }

    public String toString() {
        return m113089j(this.f106072a);
    }
}
