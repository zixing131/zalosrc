package p210hh;

import com.zing.zalo.p062db.C7962g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24341v;

/* renamed from: hh.d */
/* loaded from: classes3.dex */
public final class C20061d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f98646a;

    /* renamed from: b */
    private final String f98647b;

    /* renamed from: c */
    private final byte f98648c;

    /* renamed from: d */
    private final long f98649d;

    /* renamed from: hh.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m104227a(String str, byte b11) {
            AbstractC19074t.m100208f(str, "threadId");
            if (b11 == 1) {
                return "group_" + str;
            }
            return str;
        }

        /* renamed from: b */
        public final String m104228b(String str) {
            String m127114D;
            AbstractC19074t.m100208f(str, "serverThreadId");
            m127114D = AbstractC24341v.m127114D(str, C7962g.f43287r, "", false, 4, null);
            return m127114D;
        }

        /* renamed from: c */
        public final byte m104229c(String str) {
            boolean m127120J;
            AbstractC19074t.m100208f(str, "serverThreadId");
            m127120J = AbstractC24341v.m127120J(str, C7962g.f43287r, false, 2, null);
            if (!m127120J) {
                return (byte) 2;
            }
            return (byte) 1;
        }
    }

    public C20061d(int i11, String str, byte b11, long j11) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f98646a = i11;
        this.f98647b = str;
        this.f98648c = b11;
        this.f98649d = j11;
    }

    /* renamed from: a */
    public final String m104222a() {
        return Companion.m104227a(this.f98647b, this.f98648c);
    }

    /* renamed from: b */
    public final int m104223b() {
        return this.f98646a;
    }

    /* renamed from: c */
    public final String m104224c() {
        return this.f98647b;
    }

    /* renamed from: d */
    public final byte m104225d() {
        return this.f98648c;
    }

    /* renamed from: e */
    public final long m104226e() {
        return this.f98649d;
    }
}
