package ci;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ci.o */
/* loaded from: classes3.dex */
public final class C3518o {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private int f14753c;

    /* renamed from: e */
    private C3508j f14755e;

    /* renamed from: a */
    private b f14751a = b.f14756p;

    /* renamed from: b */
    private ArrayList f14752b = new ArrayList();

    /* renamed from: d */
    private String f14754d = "";

    /* renamed from: ci.o$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ci.o$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f14756p = new b("TYPE_UNDEFINED", 0);

        /* renamed from: q */
        public static final b f14757q = new b("TYPE_SEARCH_TEXT", 1);

        /* renamed from: r */
        public static final b f14758r = new b("TYPE_SENDER_COLLECTION", 2);

        /* renamed from: s */
        public static final b f14759s = new b("TYPE_TIME", 3);

        /* renamed from: t */
        public static final b f14760t = new b("TYPE_VIDEO_COLLECTION", 4);

        /* renamed from: u */
        public static final b f14761u = new b("TYPE_AVATAR_COLLECTION", 5);

        /* renamed from: v */
        private static final /* synthetic */ b[] f14762v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f14763w;

        static {
            b[] m17771b = m17771b();
            f14762v = m17771b;
            f14763w = AbstractC30166b.m148796a(m17771b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m17771b() {
            return new b[]{f14756p, f14757q, f14758r, f14759s, f14760t, f14761u};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f14762v.clone();
        }
    }

    /* renamed from: a */
    public final C3508j m17762a() {
        return this.f14755e;
    }

    /* renamed from: b */
    public final int m17763b() {
        return this.f14753c;
    }

    /* renamed from: c */
    public final ArrayList m17764c() {
        return this.f14752b;
    }

    /* renamed from: d */
    public final String m17765d() {
        return this.f14754d;
    }

    /* renamed from: e */
    public final b m17766e() {
        return this.f14751a;
    }

    /* renamed from: f */
    public final void m17767f(C3508j c3508j) {
        this.f14755e = c3508j;
    }

    /* renamed from: g */
    public final void m17768g(int i11) {
        this.f14753c = i11;
    }

    /* renamed from: h */
    public final void m17769h(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f14754d = str;
    }

    /* renamed from: i */
    public final void m17770i(b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f14751a = bVar;
    }
}
