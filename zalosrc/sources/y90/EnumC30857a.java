package y90;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y90.a */
/* loaded from: classes6.dex */
public final class EnumC30857a {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC30857a f142386q = new EnumC30857a("CHANGE_STICKER_POSITION", 0, 0);

    /* renamed from: r */
    public static final EnumC30857a f142387r = new EnumC30857a("DELETE_STICKER", 1, 1);

    /* renamed from: s */
    public static final EnumC30857a f142388s = new EnumC30857a("SHARE_STICKER", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC30857a[] f142389t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f142390u;

    /* renamed from: p */
    private final int f142391p;

    /* renamed from: y90.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC30857a m150000a(int i11) {
            for (EnumC30857a enumC30857a : EnumC30857a.values()) {
                if (enumC30857a.m149999c() == i11) {
                    return enumC30857a;
                }
            }
            return null;
        }
    }

    static {
        EnumC30857a[] m149998b = m149998b();
        f142389t = m149998b;
        f142390u = AbstractC30166b.m148796a(m149998b);
        Companion = new a(null);
    }

    private EnumC30857a(String str, int i11, int i12) {
        this.f142391p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30857a[] m149998b() {
        return new EnumC30857a[]{f142386q, f142387r, f142388s};
    }

    public static EnumC30857a valueOf(String str) {
        return (EnumC30857a) Enum.valueOf(EnumC30857a.class, str);
    }

    public static EnumC30857a[] values() {
        return (EnumC30857a[]) f142389t.clone();
    }

    /* renamed from: c */
    public final int m149999c() {
        return this.f142391p;
    }
}
