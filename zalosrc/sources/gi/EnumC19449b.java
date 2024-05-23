package gi;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gi.b */
/* loaded from: classes3.dex */
public final class EnumC19449b {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC19449b f96542q = new EnumC19449b("HORIZONTAL_LIST", 0, 1);

    /* renamed from: r */
    public static final EnumC19449b f96543r = new EnumC19449b("VERTICAL_LIST", 1, 2);

    /* renamed from: s */
    public static final EnumC19449b f96544s = new EnumC19449b("BANNER", 2, 3);

    /* renamed from: t */
    public static final EnumC19449b f96545t = new EnumC19449b("POPUP", 3, 4);

    /* renamed from: u */
    public static final EnumC19449b f96546u = new EnumC19449b("REPLY_POPUP", 4, 5);

    /* renamed from: v */
    public static final EnumC19449b f96547v = new EnumC19449b("REPLY_HORIZONTAL", 5, 6);

    /* renamed from: w */
    public static final EnumC19449b f96548w = new EnumC19449b("PANEL", 6, 7);

    /* renamed from: x */
    private static final /* synthetic */ EnumC19449b[] f96549x;

    /* renamed from: y */
    private static final /* synthetic */ InterfaceC30165a f96550y;

    /* renamed from: p */
    private final int f96551p;

    /* renamed from: gi.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC19449b m101747a(int i11) {
            EnumC19449b enumC19449b;
            EnumC19449b[] values = EnumC19449b.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    enumC19449b = values[i12];
                    if (enumC19449b.m101746d() == i11) {
                        break;
                    }
                    i12++;
                } else {
                    enumC19449b = null;
                    break;
                }
            }
            if (enumC19449b == null) {
                return EnumC19449b.f96542q;
            }
            return enumC19449b;
        }
    }

    static {
        EnumC19449b[] m101744b = m101744b();
        f96549x = m101744b;
        f96550y = AbstractC30166b.m148796a(m101744b);
        Companion = new a(null);
    }

    private EnumC19449b(String str, int i11, int i12) {
        this.f96551p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19449b[] m101744b() {
        return new EnumC19449b[]{f96542q, f96543r, f96544s, f96545t, f96546u, f96547v, f96548w};
    }

    /* renamed from: c */
    public static final EnumC19449b m101745c(int i11) {
        return Companion.m101747a(i11);
    }

    public static EnumC19449b valueOf(String str) {
        return (EnumC19449b) Enum.valueOf(EnumC19449b.class, str);
    }

    public static EnumC19449b[] values() {
        return (EnumC19449b[]) f96549x.clone();
    }

    /* renamed from: d */
    public final int m101746d() {
        return this.f96551p;
    }
}
