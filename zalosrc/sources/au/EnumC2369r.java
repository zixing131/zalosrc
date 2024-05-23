package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.r */
/* loaded from: classes4.dex */
public final class EnumC2369r {

    /* renamed from: p */
    public static final EnumC2369r f9910p = new EnumC2369r("MEDIA_STORE_HEADER_MODE_DAY_MONTH", 0);

    /* renamed from: q */
    public static final EnumC2369r f9911q = new EnumC2369r("MEDIA_STORE_HEADER_MODE_DAY_MONTH_YEAR", 1);

    /* renamed from: r */
    public static final EnumC2369r f9912r = new EnumC2369r("MEDIA_STORE_HEADER_MODE_MONTH_YEAR", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC2369r[] f9913s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f9914t;

    static {
        EnumC2369r[] m12393b = m12393b();
        f9913s = m12393b;
        f9914t = AbstractC30166b.m148796a(m12393b);
    }

    private EnumC2369r(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2369r[] m12393b() {
        return new EnumC2369r[]{f9910p, f9911q, f9912r};
    }

    public static EnumC2369r valueOf(String str) {
        return (EnumC2369r) Enum.valueOf(EnumC2369r.class, str);
    }

    public static EnumC2369r[] values() {
        return (EnumC2369r[]) f9913s.clone();
    }
}
