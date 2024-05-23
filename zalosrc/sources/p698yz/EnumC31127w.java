package p698yz;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yz.w */
/* loaded from: classes4.dex */
public final class EnumC31127w {

    /* renamed from: p */
    public static final EnumC31127w f143379p = new EnumC31127w("BOTTOM_SHEET", 0);

    /* renamed from: q */
    public static final EnumC31127w f143380q = new EnumC31127w("VIEW_FULL", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC31127w[] f143381r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f143382s;

    static {
        EnumC31127w[] m151202b = m151202b();
        f143381r = m151202b;
        f143382s = AbstractC30166b.m148796a(m151202b);
    }

    private EnumC31127w(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31127w[] m151202b() {
        return new EnumC31127w[]{f143379p, f143380q};
    }

    public static EnumC31127w valueOf(String str) {
        return (EnumC31127w) Enum.valueOf(EnumC31127w.class, str);
    }

    public static EnumC31127w[] values() {
        return (EnumC31127w[]) f143381r.clone();
    }
}
