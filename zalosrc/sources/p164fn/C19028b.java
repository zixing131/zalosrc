package p164fn;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: fn.b */
/* loaded from: classes3.dex */
public final class C19028b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final b f94835a;

    /* renamed from: b */
    private final boolean f94836b;

    /* renamed from: c */
    private final boolean f94837c;

    /* renamed from: d */
    private final boolean f94838d;

    /* renamed from: e */
    private final boolean f94839e;

    /* renamed from: f */
    private final boolean f94840f;

    /* renamed from: g */
    private final boolean f94841g;

    /* renamed from: h */
    private final boolean f94842h;

    /* renamed from: fn.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19028b m100098b(a aVar, b bVar, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = b.f94843p;
            }
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            return aVar.m100099a(bVar, z11, z12);
        }

        /* renamed from: a */
        public final C19028b m100099a(b bVar, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(bVar, "downloadFlow");
            return new C19028b(bVar, z11, z12, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: fn.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f94843p = new b("VISIBLE", 0);

        /* renamed from: q */
        public static final b f94844q = new b("AUTO_DOWNLOAD", 1);

        /* renamed from: r */
        public static final b f94845r = new b("DOWNLOAD_TO_FORWARD", 2);

        /* renamed from: s */
        public static final b f94846s = new b("DOWNLOAD_TO_SEND", 3);

        /* renamed from: t */
        public static final b f94847t = new b("RECOVER_MEDIA_Z_CLOUD", 4);

        /* renamed from: u */
        private static final /* synthetic */ b[] f94848u;

        /* renamed from: v */
        private static final /* synthetic */ InterfaceC30165a f94849v;

        static {
            b[] m100100b = m100100b();
            f94848u = m100100b;
            f94849v = AbstractC30166b.m148796a(m100100b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m100100b() {
            return new b[]{f94843p, f94844q, f94845r, f94846s, f94847t};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f94848u.clone();
        }
    }

    public /* synthetic */ C19028b(b bVar, boolean z11, boolean z12, AbstractC19060k abstractC19060k) {
        this(bVar, z11, z12);
    }

    /* renamed from: a */
    public final b m100091a() {
        return this.f94835a;
    }

    /* renamed from: b */
    public final boolean m100092b() {
        return this.f94839e;
    }

    /* renamed from: c */
    public final boolean m100093c() {
        return this.f94840f;
    }

    /* renamed from: d */
    public final boolean m100094d() {
        return this.f94841g;
    }

    /* renamed from: e */
    public final boolean m100095e() {
        return this.f94837c;
    }

    /* renamed from: f */
    public final boolean m100096f() {
        return this.f94842h;
    }

    /* renamed from: g */
    public final boolean m100097g() {
        return this.f94836b;
    }

    private C19028b(b bVar, boolean z11, boolean z12) {
        this.f94835a = bVar;
        this.f94836b = z11;
        this.f94837c = z12;
        this.f94838d = bVar == b.f94843p;
        this.f94839e = bVar == b.f94844q;
        this.f94840f = bVar == b.f94845r;
        this.f94841g = bVar == b.f94846s;
        this.f94842h = bVar == b.f94847t;
    }
}
