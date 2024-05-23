package p274jr;

import fn0.AbstractC19060k;
import p456qp.C25461m;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: jr.b */
/* loaded from: classes4.dex */
public final class C21344b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f103946a = -1;

    /* renamed from: b */
    private int f103947b = -1;

    /* renamed from: c */
    private int f103948c = -1;

    /* renamed from: jr.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: jr.b$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f103949p = new b("PLAY_MUSIC", 0);

        /* renamed from: q */
        public static final b f103950q = new b("PAUSE_MUSIC", 1);

        /* renamed from: r */
        public static final b f103951r = new b("NO_CHANGE", 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f103952s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f103953t;

        static {
            b[] m110556b = m110556b();
            f103952s = m110556b;
            f103953t = AbstractC30166b.m148796a(m110556b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m110556b() {
            return new b[]{f103949p, f103950q, f103951r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f103952s.clone();
        }
    }

    /* renamed from: d */
    private final b m110551d() {
        if (this.f103946a == 3) {
            int i11 = this.f103947b;
            if (i11 != 701) {
                if (i11 != 702) {
                    return b.f103951r;
                }
                return b.f103949p;
            }
            return b.f103950q;
        }
        return b.f103951r;
    }

    /* renamed from: e */
    private final b m110552e() {
        if (this.f103946a == 3) {
            return b.f103949p;
        }
        return b.f103950q;
    }

    /* renamed from: a */
    public final b m110553a(int i11) {
        if (this.f103947b != i11) {
            this.f103947b = i11;
            return m110551d();
        }
        return b.f103951r;
    }

    /* renamed from: b */
    public final b m110554b(int i11) {
        int i12 = this.f103946a;
        if (i12 != i11) {
            this.f103948c = i12;
            this.f103946a = i11;
            return m110552e();
        }
        return b.f103951r;
    }

    /* renamed from: c */
    public final void m110555c(int i11, int i12, int i13) {
        if (i13 > i11 && i13 - i11 > 1000 && i13 < i12) {
            new C25461m().m101508a(new C25461m.a(i13));
        }
    }
}
