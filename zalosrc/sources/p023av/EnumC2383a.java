package p023av;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: av.a */
/* loaded from: classes4.dex */
public final class EnumC2383a {
    public static final a Companion;

    /* renamed from: s */
    public static final EnumC2383a f9952s = new EnumC2383a("NO_COMPRESS", 0, 0, 0, 0, 6, null);

    /* renamed from: t */
    public static final EnumC2383a f9953t = new EnumC2383a("HIGH_QUALITY", 1, 1, 1080, 80);

    /* renamed from: u */
    public static final EnumC2383a f9954u = new EnumC2383a("MEDIUM_QUALITY", 2, 2, 720, 70);

    /* renamed from: v */
    public static final EnumC2383a f9955v = new EnumC2383a("LOW_QUALITY", 3, 3, 480, 60);

    /* renamed from: w */
    private static final /* synthetic */ EnumC2383a[] f9956w;

    /* renamed from: x */
    private static final /* synthetic */ InterfaceC30165a f9957x;

    /* renamed from: p */
    private final int f9958p;

    /* renamed from: q */
    private final int f9959q;

    /* renamed from: r */
    private final int f9960r;

    /* renamed from: av.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC2383a m12443a(int i11) {
            EnumC2383a enumC2383a = EnumC2383a.f9952s;
            if (i11 != enumC2383a.m12440c()) {
                EnumC2383a enumC2383a2 = EnumC2383a.f9953t;
                if (i11 != enumC2383a2.m12440c()) {
                    EnumC2383a enumC2383a3 = EnumC2383a.f9954u;
                    if (i11 != enumC2383a3.m12440c()) {
                        EnumC2383a enumC2383a4 = EnumC2383a.f9955v;
                        if (i11 == enumC2383a4.m12440c()) {
                            return enumC2383a4;
                        }
                        return enumC2383a3;
                    }
                    return enumC2383a3;
                }
                return enumC2383a2;
            }
            return enumC2383a;
        }
    }

    static {
        EnumC2383a[] m12439b = m12439b();
        f9956w = m12439b;
        f9957x = AbstractC30166b.m148796a(m12439b);
        Companion = new a(null);
    }

    private EnumC2383a(String str, int i11, int i12, int i13, int i14) {
        this.f9958p = i12;
        this.f9959q = i13;
        this.f9960r = i14;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2383a[] m12439b() {
        return new EnumC2383a[]{f9952s, f9953t, f9954u, f9955v};
    }

    public static EnumC2383a valueOf(String str) {
        return (EnumC2383a) Enum.valueOf(EnumC2383a.class, str);
    }

    public static EnumC2383a[] values() {
        return (EnumC2383a[]) f9956w.clone();
    }

    /* renamed from: c */
    public final int m12440c() {
        return this.f9958p;
    }

    /* renamed from: d */
    public final int m12441d() {
        return this.f9960r;
    }

    /* renamed from: e */
    public final int m12442e() {
        return this.f9959q;
    }

    /* synthetic */ EnumC2383a(String str, int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this(str, i11, i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }
}
