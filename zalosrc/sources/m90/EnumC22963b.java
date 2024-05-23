package m90;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m90.b */
/* loaded from: classes6.dex */
public final class EnumC22963b {

    /* renamed from: p */
    public static final EnumC22963b f111700p = new EnumC22963b("DEFAULT", 0);

    /* renamed from: q */
    public static final EnumC22963b f111701q = new EnumC22963b("SOCIAL_FPF", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC22963b[] f111702r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f111703s;

    static {
        EnumC22963b[] m117713b = m117713b();
        f111702r = m117713b;
        f111703s = AbstractC30166b.m148796a(m117713b);
    }

    private EnumC22963b(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC22963b[] m117713b() {
        return new EnumC22963b[]{f111700p, f111701q};
    }

    public static EnumC22963b valueOf(String str) {
        return (EnumC22963b) Enum.valueOf(EnumC22963b.class, str);
    }

    public static EnumC22963b[] values() {
        return (EnumC22963b[]) f111702r.clone();
    }
}
