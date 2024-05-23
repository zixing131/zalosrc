package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.y */
/* loaded from: classes4.dex */
public final class EnumC2381y {

    /* renamed from: p */
    public static final EnumC2381y f9939p = new EnumC2381y("MEDIA_LAYOUT_MODE_DAILY_DYNAMIC", 0);

    /* renamed from: q */
    public static final EnumC2381y f9940q = new EnumC2381y("MEDIA_LAYOUT_MODE_DAILY_STATIC_3_COLUMNS", 1);

    /* renamed from: r */
    public static final EnumC2381y f9941r = new EnumC2381y("MEDIA_LAYOUT_MODE_DAILY_STATIC_4_COLUMNS", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC2381y[] f9942s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f9943t;

    static {
        EnumC2381y[] m12436b = m12436b();
        f9942s = m12436b;
        f9943t = AbstractC30166b.m148796a(m12436b);
    }

    private EnumC2381y(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2381y[] m12436b() {
        return new EnumC2381y[]{f9939p, f9940q, f9941r};
    }

    public static EnumC2381y valueOf(String str) {
        return (EnumC2381y) Enum.valueOf(EnumC2381y.class, str);
    }

    public static EnumC2381y[] values() {
        return (EnumC2381y[]) f9942s.clone();
    }
}
