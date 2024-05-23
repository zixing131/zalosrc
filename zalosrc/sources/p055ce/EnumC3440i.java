package p055ce;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ce.i */
/* loaded from: classes3.dex */
public final class EnumC3440i {

    /* renamed from: I */
    private static final /* synthetic */ EnumC3440i[] f14446I;

    /* renamed from: J */
    private static final /* synthetic */ InterfaceC30165a f14447J;

    /* renamed from: p */
    private final int f14458p;

    /* renamed from: q */
    public static final EnumC3440i f14448q = new EnumC3440i("UNDEFINE", 0, -1);

    /* renamed from: r */
    public static final EnumC3440i f14449r = new EnumC3440i("OTHER_SERVICE", 1, 0);

    /* renamed from: s */
    public static final EnumC3440i f14450s = new EnumC3440i("REAL_ESTATE", 2, 1);

    /* renamed from: t */
    public static final EnumC3440i f14451t = new EnumC3440i("TECHNOLOGY_AND_EQUIPMENT", 3, 2);

    /* renamed from: u */
    public static final EnumC3440i f14452u = new EnumC3440i("TRAVEL_AND_ACCOMMODATION", 4, 3);

    /* renamed from: v */
    public static final EnumC3440i f14453v = new EnumC3440i("EDUCATION_AND_TRAINING", 5, 4);

    /* renamed from: w */
    public static final EnumC3440i f14454w = new EnumC3440i("SHOPPING_AND_RETAIL", 6, 5);

    /* renamed from: x */
    public static final EnumC3440i f14455x = new EnumC3440i("COSMETIC", 7, 6);

    /* renamed from: y */
    public static final EnumC3440i f14456y = new EnumC3440i("RESTAURANT_AND_BAR", 8, 7);

    /* renamed from: z */
    public static final EnumC3440i f14457z = new EnumC3440i("CAR_AND_MOTORCYCLES", 9, 8);

    /* renamed from: A */
    public static final EnumC3440i f14438A = new EnumC3440i("FINANCE_AND_BANKING", 10, 9);

    /* renamed from: B */
    public static final EnumC3440i f14439B = new EnumC3440i("FASHION_AND_APPAREL", 11, 10);

    /* renamed from: C */
    public static final EnumC3440i f14440C = new EnumC3440i("FOOD_AND_BEVERAGES", 12, 11);

    /* renamed from: D */
    public static final EnumC3440i f14441D = new EnumC3440i("MEDIA_AND_ENTERTAINMENT", 13, 12);

    /* renamed from: E */
    public static final EnumC3440i f14442E = new EnumC3440i("INTERNAL_COMMUNICATION", 14, 13);

    /* renamed from: F */
    public static final EnumC3440i f14443F = new EnumC3440i("TRANSPORTATION", 15, 14);

    /* renamed from: G */
    public static final EnumC3440i f14444G = new EnumC3440i("TELECOMMUNICATION", 16, 15);

    /* renamed from: H */
    public static final EnumC3440i f14445H = new EnumC3440i("MEDICAL_AND_PHARMACEUTICAL", 17, 16);

    static {
        EnumC3440i[] m17293b = m17293b();
        f14446I = m17293b;
        f14447J = AbstractC30166b.m148796a(m17293b);
    }

    private EnumC3440i(String str, int i11, int i12) {
        this.f14458p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3440i[] m17293b() {
        return new EnumC3440i[]{f14448q, f14449r, f14450s, f14451t, f14452u, f14453v, f14454w, f14455x, f14456y, f14457z, f14438A, f14439B, f14440C, f14441D, f14442E, f14443F, f14444G, f14445H};
    }

    public static EnumC3440i valueOf(String str) {
        return (EnumC3440i) Enum.valueOf(EnumC3440i.class, str);
    }

    public static EnumC3440i[] values() {
        return (EnumC3440i[]) f14446I.clone();
    }

    /* renamed from: c */
    public final int m17294c() {
        return this.f14458p;
    }
}
