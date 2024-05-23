package p10;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: p10.h */
/* loaded from: classes5.dex */
public final class EnumC24604h extends Enum {

    /* renamed from: A */
    private static final /* synthetic */ EnumC24604h[] f118384A;

    /* renamed from: B */
    private static final /* synthetic */ InterfaceC30165a f118385B;
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC24604h f118386q = new EnumC24604h("NOT_SUPPORT", 0, -1);

    /* renamed from: r */
    public static final EnumC24604h f118387r = new EnumC24604h("JOINED", 1, 5003);

    /* renamed from: s */
    public static final EnumC24604h f118388s = new EnumC24604h("LEAVED", 2, 5004);

    /* renamed from: t */
    public static final EnumC24604h f118389t = new EnumC24604h("INTERACT_USER", 3, 5005);

    /* renamed from: u */
    public static final EnumC24604h f118390u = new EnumC24604h("WELCOME_MESSAGE", 4, 5006);

    /* renamed from: v */
    public static final EnumC24604h f118391v = new EnumC24604h("GOT_NEW_COMMENT", 5, 5201);

    /* renamed from: w */
    public static final EnumC24604h f118392w = new EnumC24604h("UPDATE_STREAM", 6, 5200);

    /* renamed from: x */
    public static final EnumC24604h f118393x = new EnumC24604h("STAT_STREAM", 7, 5202);

    /* renamed from: y */
    public static final EnumC24604h f118394y = new EnumC24604h("BLOCK_USER_COMMENT_BY_OWNER", 8, 5203);

    /* renamed from: z */
    public static final EnumC24604h f118395z = new EnumC24604h("DEL_USER_COMMENT_BY_OWNER", 9, 5204);

    /* renamed from: p */
    private final int f118396p;

    /* renamed from: p10.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC24604h m128095a(int i11) {
            EnumC24604h enumC24604h;
            EnumC24604h[] values = EnumC24604h.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    enumC24604h = values[i12];
                    if (enumC24604h.m128094c() == i11) {
                        break;
                    }
                    i12++;
                } else {
                    enumC24604h = null;
                    break;
                }
            }
            if (enumC24604h == null) {
                return EnumC24604h.f118386q;
            }
            return enumC24604h;
        }
    }

    static {
        EnumC24604h[] m128093b = m128093b();
        f118384A = m128093b;
        f118385B = AbstractC30166b.m148796a(m128093b);
        Companion = new a(null);
    }

    private EnumC24604h(String str, int i11, int i12) {
        super(str, i11);
        this.f118396p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24604h[] m128093b() {
        return new EnumC24604h[]{f118386q, f118387r, f118388s, f118389t, f118390u, f118391v, f118392w, f118393x, f118394y, f118395z};
    }

    public static EnumC24604h valueOf(String str) {
        return (EnumC24604h) Enum.valueOf(EnumC24604h.class, str);
    }

    public static EnumC24604h[] values() {
        return (EnumC24604h[]) f118384A.clone();
    }

    /* renamed from: c */
    public final int m128094c() {
        return this.f118396p;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + "(" + this.f118396p + ")";
    }
}
