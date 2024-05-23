package mk;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mk.d */
/* loaded from: classes3.dex */
public final class EnumC23326d {

    /* renamed from: p */
    public static final EnumC23326d f113521p = new EnumC23326d("BATTERY_SAVED", 0);

    /* renamed from: q */
    public static final EnumC23326d f113522q = new EnumC23326d("BATTERY_OPTIMIZED", 1);

    /* renamed from: r */
    public static final EnumC23326d f113523r = new EnumC23326d("DATA_SAVED", 2);

    /* renamed from: s */
    public static final EnumC23326d f113524s = new EnumC23326d("MIX", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC23326d[] f113525t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f113526u;

    static {
        EnumC23326d[] m122718b = m122718b();
        f113525t = m122718b;
        f113526u = AbstractC30166b.m148796a(m122718b);
    }

    private EnumC23326d(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23326d[] m122718b() {
        return new EnumC23326d[]{f113521p, f113522q, f113523r, f113524s};
    }

    public static EnumC23326d valueOf(String str) {
        return (EnumC23326d) Enum.valueOf(EnumC23326d.class, str);
    }

    public static EnumC23326d[] values() {
        return (EnumC23326d[]) f113525t.clone();
    }
}
