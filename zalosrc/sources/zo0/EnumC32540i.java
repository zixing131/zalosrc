package zo0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zo0.i */
/* loaded from: classes7.dex */
public final class EnumC32540i {

    /* renamed from: p */
    public static final EnumC32540i f150295p = new EnumC32540i("Hide", 0);

    /* renamed from: q */
    public static final EnumC32540i f150296q = new EnumC32540i("Disable", 1);

    /* renamed from: r */
    public static final EnumC32540i f150297r = new EnumC32540i("Loading", 2);

    /* renamed from: s */
    public static final EnumC32540i f150298s = new EnumC32540i("Off", 3);

    /* renamed from: t */
    public static final EnumC32540i f150299t = new EnumC32540i("On", 4);

    /* renamed from: u */
    public static final EnumC32540i f150300u = new EnumC32540i("Error", 5);

    /* renamed from: v */
    private static final /* synthetic */ EnumC32540i[] f150301v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f150302w;

    static {
        EnumC32540i[] m157521b = m157521b();
        f150301v = m157521b;
        f150302w = AbstractC30166b.m148796a(m157521b);
    }

    private EnumC32540i(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC32540i[] m157521b() {
        return new EnumC32540i[]{f150295p, f150296q, f150297r, f150298s, f150299t, f150300u};
    }

    /* renamed from: c */
    public static InterfaceC30165a m157522c() {
        return f150302w;
    }

    public static EnumC32540i valueOf(String str) {
        return (EnumC32540i) Enum.valueOf(EnumC32540i.class, str);
    }

    public static EnumC32540i[] values() {
        return (EnumC32540i[]) f150301v.clone();
    }
}
