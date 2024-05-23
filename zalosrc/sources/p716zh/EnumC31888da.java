package p716zh;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zh.da */
/* loaded from: classes3.dex */
public final class EnumC31888da {

    /* renamed from: p */
    public static final EnumC31888da f146476p = new EnumC31888da("SUCCESS", 0);

    /* renamed from: q */
    public static final EnumC31888da f146477q = new EnumC31888da("RECEIVER_FAIL_OLD_VERSION", 1);

    /* renamed from: r */
    public static final EnumC31888da f146478r = new EnumC31888da("FAIL", 2);

    /* renamed from: s */
    public static final EnumC31888da f146479s = new EnumC31888da("DISABLE", 3);

    /* renamed from: t */
    public static final EnumC31888da f146480t = new EnumC31888da("GROUP_UPGRADE_VERSION", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC31888da[] f146481u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f146482v;

    static {
        EnumC31888da[] m153226b = m153226b();
        f146481u = m153226b;
        f146482v = AbstractC30166b.m148796a(m153226b);
    }

    private EnumC31888da(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31888da[] m153226b() {
        return new EnumC31888da[]{f146476p, f146477q, f146478r, f146479s, f146480t};
    }

    public static EnumC31888da valueOf(String str) {
        return (EnumC31888da) Enum.valueOf(EnumC31888da.class, str);
    }

    public static EnumC31888da[] values() {
        return (EnumC31888da[]) f146481u.clone();
    }
}
