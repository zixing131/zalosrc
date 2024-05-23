package is;

import fn0.AbstractC19060k;
import java.util.ArrayList;
import java.util.List;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: is.i */
/* loaded from: classes4.dex */
public final class EnumC20799i extends Enum {

    /* renamed from: B */
    private static final /* synthetic */ EnumC20799i[] f102201B;

    /* renamed from: C */
    private static final /* synthetic */ InterfaceC30165a f102202C;
    public static final a Companion;

    /* renamed from: p */
    private final int f102213p;

    /* renamed from: q */
    public static final EnumC20799i f102203q = new EnumC20799i("UNKNOWN", 0, 0);

    /* renamed from: r */
    public static final EnumC20799i f102204r = new EnumC20799i("MY_QR", 1, 1);

    /* renamed from: s */
    public static final EnumC20799i f102205s = new EnumC20799i("SAVED_MESSAGE", 2, 2);

    /* renamed from: t */
    public static final EnumC20799i f102206t = new EnumC20799i("MY_OA", 3, 3);

    /* renamed from: u */
    public static final EnumC20799i f102207u = new EnumC20799i("ACCOUNT", 4, 4);

    /* renamed from: v */
    public static final EnumC20799i f102208v = new EnumC20799i("PRIVACY", 5, 5);

    /* renamed from: w */
    public static final EnumC20799i f102209w = new EnumC20799i("QR_WALLET", 6, 6);

    /* renamed from: x */
    public static final EnumC20799i f102210x = new EnumC20799i("BA_TOOL", 7, 7);

    /* renamed from: y */
    public static final EnumC20799i f102211y = new EnumC20799i("BA_IAP", 8, 8);

    /* renamed from: z */
    public static final EnumC20799i f102212z = new EnumC20799i("TOOL_STORAGE", 9, 9);

    /* renamed from: A */
    public static final EnumC20799i f102200A = new EnumC20799i("ZALO_CLOUD", 10, 10);

    /* renamed from: is.i$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final List m108531a() {
            ArrayList arrayList = new ArrayList();
            for (EnumC20799i enumC20799i : EnumC20799i.values()) {
                if (enumC20799i.m108529c()) {
                    arrayList.add(enumC20799i);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public final EnumC20799i m108532b(int i11) {
            for (EnumC20799i enumC20799i : EnumC20799i.values()) {
                if (enumC20799i.m108530d() == i11) {
                    return enumC20799i;
                }
            }
            return null;
        }
    }

    /* renamed from: is.i$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f102214a;

        static {
            int[] iArr = new int[EnumC20799i.values().length];
            try {
                iArr[EnumC20799i.f102206t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20799i.f102205s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20799i.f102204r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC20799i.f102209w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC20799i.f102210x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC20799i.f102211y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC20799i.f102212z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC20799i.f102200A.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC20799i.f102203q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f102214a = iArr;
        }
    }

    static {
        EnumC20799i[] m108528b = m108528b();
        f102201B = m108528b;
        f102202C = AbstractC30166b.m148796a(m108528b);
        Companion = new a(null);
    }

    private EnumC20799i(String str, int i11, int i12) {
        super(str, i11);
        this.f102213p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC20799i[] m108528b() {
        return new EnumC20799i[]{f102203q, f102204r, f102205s, f102206t, f102207u, f102208v, f102209w, f102210x, f102211y, f102212z, f102200A};
    }

    public static EnumC20799i valueOf(String str) {
        return (EnumC20799i) Enum.valueOf(EnumC20799i.class, str);
    }

    public static EnumC20799i[] values() {
        return (EnumC20799i[]) f102201B.clone();
    }

    /* renamed from: c */
    public final boolean m108529c() {
        switch (b.f102214a[ordinal()]) {
            case 1:
                return C20795g.f102172a.m108497a().m108507c();
            case 2:
                return C20795g.f102172a.m108497a().m108510f();
            case 3:
                return C20795g.f102172a.m108497a().m108508d();
            case 4:
                return C20795g.f102172a.m108497a().m108509e();
            case 5:
                return C20795g.f102172a.m108497a().m108506b();
            case 6:
                return C20795g.f102172a.m108497a().m108505a();
            case 7:
                return C20795g.f102172a.m108497a().m108511g();
            case 8:
                return C20795g.f102172a.m108497a().m108512h();
            case 9:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: d */
    public final int m108530d() {
        return this.f102213p;
    }
}
