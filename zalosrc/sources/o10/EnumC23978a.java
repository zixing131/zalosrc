package o10;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o10.a */
/* loaded from: classes5.dex */
public final class EnumC23978a {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC23978a f116044q = new EnumC23978a("JOIN_LIVE", 0, 5001);

    /* renamed from: r */
    public static final EnumC23978a f116045r = new EnumC23978a("LEAVE_LIVE", 1, 5002);

    /* renamed from: s */
    public static final EnumC23978a f116046s = new EnumC23978a("DETAIL_LIVE", 2, 5200);

    /* renamed from: t */
    public static final EnumC23978a f116047t = new EnumC23978a("REACTION_LIVE", 3, 5101);

    /* renamed from: u */
    public static final EnumC23978a f116048u = new EnumC23978a("GET_LIST_COMMENT", 4, 5201);

    /* renamed from: v */
    public static final EnumC23978a f116049v = new EnumC23978a("POST_COMMENT_LIVE", 5, 5111);

    /* renamed from: w */
    public static final EnumC23978a f116050w = new EnumC23978a("GET_STATS_LIVE", 6, 5202);

    /* renamed from: x */
    public static final EnumC23978a f116051x = new EnumC23978a("NOT_SUPPORT", 7, -1);

    /* renamed from: y */
    private static final /* synthetic */ EnumC23978a[] f116052y;

    /* renamed from: z */
    private static final /* synthetic */ InterfaceC30165a f116053z;

    /* renamed from: p */
    private final int f116054p;

    /* renamed from: o10.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        EnumC23978a[] m125476b = m125476b();
        f116052y = m125476b;
        f116053z = AbstractC30166b.m148796a(m125476b);
        Companion = new a(null);
    }

    private EnumC23978a(String str, int i11, int i12) {
        this.f116054p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23978a[] m125476b() {
        return new EnumC23978a[]{f116044q, f116045r, f116046s, f116047t, f116048u, f116049v, f116050w, f116051x};
    }

    public static EnumC23978a valueOf(String str) {
        return (EnumC23978a) Enum.valueOf(EnumC23978a.class, str);
    }

    public static EnumC23978a[] values() {
        return (EnumC23978a[]) f116052y.clone();
    }

    /* renamed from: c */
    public final int m125477c() {
        return this.f116054p;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + "(" + this.f116054p + ")";
    }
}
