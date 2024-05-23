package gi;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gi.a */
/* loaded from: classes3.dex */
public final class EnumC19448a {

    /* renamed from: p */
    public static final EnumC19448a f96533p = new EnumC19448a("INVALID_KWD", 0);

    /* renamed from: q */
    public static final EnumC19448a f96534q = new EnumC19448a("ANNOY_LIMIT_EXCEED", 1);

    /* renamed from: r */
    public static final EnumC19448a f96535r = new EnumC19448a("POPUP_SHOW_TIME_LIMIT_EXCEED", 2);

    /* renamed from: s */
    public static final EnumC19448a f96536s = new EnumC19448a("LAYOUT_TYPE_NOT_SUPPORT", 3);

    /* renamed from: t */
    public static final EnumC19448a f96537t = new EnumC19448a("EMPTY_RESULT", 4);

    /* renamed from: u */
    public static final EnumC19448a f96538u = new EnumC19448a("SUGGEST_TYPE_DISABLE", 5);

    /* renamed from: v */
    public static final EnumC19448a f96539v = new EnumC19448a("PROCESS_EXCEPTION", 6);

    /* renamed from: w */
    private static final /* synthetic */ EnumC19448a[] f96540w;

    /* renamed from: x */
    private static final /* synthetic */ InterfaceC30165a f96541x;

    static {
        EnumC19448a[] m101743b = m101743b();
        f96540w = m101743b;
        f96541x = AbstractC30166b.m148796a(m101743b);
    }

    private EnumC19448a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19448a[] m101743b() {
        return new EnumC19448a[]{f96533p, f96534q, f96535r, f96536s, f96537t, f96538u, f96539v};
    }

    public static EnumC19448a valueOf(String str) {
        return (EnumC19448a) Enum.valueOf(EnumC19448a.class, str);
    }

    public static EnumC19448a[] values() {
        return (EnumC19448a[]) f96540w.clone();
    }
}
