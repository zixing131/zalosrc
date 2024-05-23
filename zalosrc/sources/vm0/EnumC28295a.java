package vm0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vm0.a */
/* loaded from: classes.dex */
public final class EnumC28295a {

    /* renamed from: p */
    public static final EnumC28295a f131997p = new EnumC28295a("COROUTINE_SUSPENDED", 0);

    /* renamed from: q */
    public static final EnumC28295a f131998q = new EnumC28295a("UNDECIDED", 1);

    /* renamed from: r */
    public static final EnumC28295a f131999r = new EnumC28295a("RESUMED", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC28295a[] f132000s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f132001t;

    static {
        EnumC28295a[] m142569b = m142569b();
        f132000s = m142569b;
        f132001t = AbstractC30166b.m148796a(m142569b);
    }

    private EnumC28295a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC28295a[] m142569b() {
        return new EnumC28295a[]{f131997p, f131998q, f131999r};
    }

    public static EnumC28295a valueOf(String str) {
        return (EnumC28295a) Enum.valueOf(EnumC28295a.class, str);
    }

    public static EnumC28295a[] values() {
        return (EnumC28295a[]) f132000s.clone();
    }
}
