package lc;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lc.a */
/* loaded from: classes.dex */
public final class EnumC22425a {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC22425a f109726q = new EnumC22425a("AUTO_DOWNLOAD", 0, 0);

    /* renamed from: r */
    public static final EnumC22425a f109727r = new EnumC22425a("VISIBLE", 1, 1);

    /* renamed from: s */
    public static final EnumC22425a f109728s = new EnumC22425a("SYNC_PC", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC22425a[] f109729t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f109730u;

    /* renamed from: p */
    private final int f109731p;

    /* renamed from: lc.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC22425a m115862a(int i11) {
            EnumC22425a enumC22425a = EnumC22425a.f109726q;
            if (i11 != enumC22425a.m115861c()) {
                enumC22425a = EnumC22425a.f109727r;
                if (i11 != enumC22425a.m115861c()) {
                    enumC22425a = EnumC22425a.f109728s;
                    if (i11 != enumC22425a.m115861c()) {
                        throw new IllegalArgumentException("Download type value not defined: " + i11);
                    }
                }
            }
            return enumC22425a;
        }
    }

    static {
        EnumC22425a[] m115860b = m115860b();
        f109729t = m115860b;
        f109730u = AbstractC30166b.m148796a(m115860b);
        Companion = new a(null);
    }

    private EnumC22425a(String str, int i11, int i12) {
        this.f109731p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC22425a[] m115860b() {
        return new EnumC22425a[]{f109726q, f109727r, f109728s};
    }

    public static EnumC22425a valueOf(String str) {
        return (EnumC22425a) Enum.valueOf(EnumC22425a.class, str);
    }

    public static EnumC22425a[] values() {
        return (EnumC22425a[]) f109729t.clone();
    }

    /* renamed from: c */
    public final int m115861c() {
        return this.f109731p;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.f109731p);
    }
}
