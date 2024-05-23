package p550ul;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import tg0.C26676b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ul.a */
/* loaded from: classes3.dex */
public final class EnumC27295a {

    /* renamed from: B */
    private static final /* synthetic */ EnumC27295a[] f128393B;

    /* renamed from: C */
    private static final /* synthetic */ InterfaceC30165a f128394C;
    public static final a Companion;

    /* renamed from: p */
    private final int f128404p;

    /* renamed from: q */
    private final String f128405q;

    /* renamed from: r */
    public static final EnumC27295a f128395r = new EnumC27295a("NOT_AUTHORIZE", 0, -12104, "User không được hỗ trợ - Outside Việt Nam");

    /* renamed from: s */
    public static final EnumC27295a f128396s = new EnumC27295a("INVALID_PARAMS", 1, -12101, "Param không hợp lệ");

    /* renamed from: t */
    public static final EnumC27295a f128397t = new EnumC27295a("SESSION_EXPIRE", 2, -12102, "Không lấy đc thông tin session Zalo");

    /* renamed from: u */
    public static final EnumC27295a f128398u = new EnumC27295a("INVALID_SESSION", 3, -205, "Invalid session");

    /* renamed from: v */
    public static final EnumC27295a f128399v = new EnumC27295a("UNKNOWN_EXCEPTION", 4, -12105, "Lỗi không xác định");

    /* renamed from: w */
    public static final EnumC27295a f128400w = new EnumC27295a("CANNOT_CREATE_ORDER", 5, -12106, "Không tạo được order");

    /* renamed from: x */
    public static final EnumC27295a f128401x = new EnumC27295a("VERSION_NOT_SUPPORT", 6, -12110, "Version không hỗ trợ payment");

    /* renamed from: y */
    public static final EnumC27295a f128402y = new EnumC27295a("SUBSCRIPTION_OTHER_GW", 7, -12113, "User đã mua trên OS này tiếp tục thực hiện tại OS khác");

    /* renamed from: z */
    public static final EnumC27295a f128403z = new EnumC27295a("UNKNOWN_EXCEPTION_2", 8, -112, "Lỗi không xác định");

    /* renamed from: A */
    public static final EnumC27295a f128392A = new EnumC27295a("UNDEFINED_EXCEPTION", 9, -1, "Lỗi chưa đươợc định nghĩa");

    /* renamed from: ul.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC27295a m139708a(int i11) {
            EnumC27295a enumC27295a;
            EnumC27295a[] values = EnumC27295a.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    enumC27295a = values[i12];
                    if (enumC27295a.m139706c() == i11) {
                        break;
                    }
                    i12++;
                } else {
                    enumC27295a = null;
                    break;
                }
            }
            if (enumC27295a == null) {
                return EnumC27295a.f128392A;
            }
            return enumC27295a;
        }
    }

    static {
        EnumC27295a[] m139705b = m139705b();
        f128393B = m139705b;
        f128394C = AbstractC30166b.m148796a(m139705b);
        Companion = new a(null);
    }

    private EnumC27295a(String str, int i11, int i12, String str2) {
        this.f128404p = i12;
        this.f128405q = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27295a[] m139705b() {
        return new EnumC27295a[]{f128395r, f128396s, f128397t, f128398u, f128399v, f128400w, f128401x, f128402y, f128403z, f128392A};
    }

    public static EnumC27295a valueOf(String str) {
        return (EnumC27295a) Enum.valueOf(EnumC27295a.class, str);
    }

    public static EnumC27295a[] values() {
        return (EnumC27295a[]) f128393B.clone();
    }

    /* renamed from: c */
    public final int m139706c() {
        return this.f128404p;
    }

    /* renamed from: d */
    public final void m139707d(int i11, String str) {
        AbstractC19074t.m100208f(str, "serverMsg");
        String name = name();
        int i12 = this.f128404p;
        if (i12 != f128392A.f128404p) {
            i11 = i12;
        }
        C26676b.m136957g("SMLZCloudTransactionError", "Error: " + name + ". Code: " + i11 + ". Msg: " + this.f128405q + ". Server msg: " + str, null, 4, null);
    }
}
