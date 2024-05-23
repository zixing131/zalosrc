package y90;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y90.e */
/* loaded from: classes6.dex */
public final class EnumC30861e {

    /* renamed from: p */
    public static final EnumC30861e f142417p = new EnumC30861e("TYPE_NORMAL", 0);

    /* renamed from: q */
    public static final EnumC30861e f142418q = new EnumC30861e("TYPE_CAMERA", 1);

    /* renamed from: r */
    public static final EnumC30861e f142419r = new EnumC30861e("TYPE_SYSTEM_EMOJI", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC30861e[] f142420s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f142421t;

    static {
        EnumC30861e[] m150005b = m150005b();
        f142420s = m150005b;
        f142421t = AbstractC30166b.m148796a(m150005b);
    }

    private EnumC30861e(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30861e[] m150005b() {
        return new EnumC30861e[]{f142417p, f142418q, f142419r};
    }

    public static EnumC30861e valueOf(String str) {
        return (EnumC30861e) Enum.valueOf(EnumC30861e.class, str);
    }

    public static EnumC30861e[] values() {
        return (EnumC30861e[]) f142420s.clone();
    }
}
