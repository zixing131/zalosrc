package og0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: og0.a */
/* loaded from: classes7.dex */
public final class EnumC24250a {

    /* renamed from: p */
    public static final EnumC24250a f117141p = new EnumC24250a("SYNCING", 0);

    /* renamed from: q */
    public static final EnumC24250a f117142q = new EnumC24250a("TEMP", 1);

    /* renamed from: r */
    public static final EnumC24250a f117143r = new EnumC24250a("CLOUD", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC24250a[] f117144s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f117145t;

    static {
        EnumC24250a[] m126590b = m126590b();
        f117144s = m126590b;
        f117145t = AbstractC30166b.m148796a(m126590b);
    }

    private EnumC24250a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24250a[] m126590b() {
        return new EnumC24250a[]{f117141p, f117142q, f117143r};
    }

    public static EnumC24250a valueOf(String str) {
        return (EnumC24250a) Enum.valueOf(EnumC24250a.class, str);
    }

    public static EnumC24250a[] values() {
        return (EnumC24250a[]) f117144s.clone();
    }
}
