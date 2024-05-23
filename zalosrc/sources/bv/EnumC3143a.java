package bv;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bv.a */
/* loaded from: classes4.dex */
public final class EnumC3143a {

    /* renamed from: A */
    private static final /* synthetic */ InterfaceC30165a f13263A;

    /* renamed from: q */
    public static final EnumC3143a f13264q = new EnumC3143a("UNKNOWN_OR_MA_HAS_NOT_BEEN_CLOSED", 0, -1);

    /* renamed from: r */
    public static final EnumC3143a f13265r = new EnumC3143a("CLICK_CLOSE_BUTTON_POP_UP_ON_LOADING_VIEW", 1, 1);

    /* renamed from: s */
    public static final EnumC3143a f13266s = new EnumC3143a("CLICK_CLOSE_BUTTON_ON_ACTION_BAR", 2, 2);

    /* renamed from: t */
    public static final EnumC3143a f13267t = new EnumC3143a("CLICK_BACK_BUTTON_ON_ACTION_BAR", 3, 3);

    /* renamed from: u */
    public static final EnumC3143a f13268u = new EnumC3143a("USE_SYSTEM_BACK", 4, 4);

    /* renamed from: v */
    public static final EnumC3143a f13269v = new EnumC3143a("KILL_APP", 5, 5);

    /* renamed from: w */
    public static final EnumC3143a f13270w = new EnumC3143a("H5_DELEGATE_TIME_OUT", 6, 6);

    /* renamed from: x */
    public static final EnumC3143a f13271x = new EnumC3143a("H5_DELEGATE_WITHOUT_HANDLE_CLOSE_ACTION", 7, 7);

    /* renamed from: y */
    public static final EnumC3143a f13272y = new EnumC3143a("H5_CALL_ACTION_WINDOW_CLOSE", 8, 8);

    /* renamed from: z */
    private static final /* synthetic */ EnumC3143a[] f13273z;

    /* renamed from: p */
    private final int f13274p;

    static {
        EnumC3143a[] m15825b = m15825b();
        f13273z = m15825b;
        f13263A = AbstractC30166b.m148796a(m15825b);
    }

    private EnumC3143a(String str, int i11, int i12) {
        this.f13274p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3143a[] m15825b() {
        return new EnumC3143a[]{f13264q, f13265r, f13266s, f13267t, f13268u, f13269v, f13270w, f13271x, f13272y};
    }

    public static EnumC3143a valueOf(String str) {
        return (EnumC3143a) Enum.valueOf(EnumC3143a.class, str);
    }

    public static EnumC3143a[] values() {
        return (EnumC3143a[]) f13273z.clone();
    }

    /* renamed from: c */
    public final int m15826c() {
        return this.f13274p;
    }
}
