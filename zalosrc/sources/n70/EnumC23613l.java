package n70;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n70.l */
/* loaded from: classes5.dex */
public final class EnumC23613l {

    /* renamed from: p */
    public static final EnumC23613l f114470p = new EnumC23613l("DEFAULT", 0);

    /* renamed from: q */
    public static final EnumC23613l f114471q = new EnumC23613l("BLUR", 1);

    /* renamed from: r */
    public static final EnumC23613l f114472r = new EnumC23613l("DRAW", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC23613l[] f114473s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f114474t;

    static {
        EnumC23613l[] m123779b = m123779b();
        f114473s = m123779b;
        f114474t = AbstractC30166b.m148796a(m123779b);
    }

    private EnumC23613l(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23613l[] m123779b() {
        return new EnumC23613l[]{f114470p, f114471q, f114472r};
    }

    public static EnumC23613l valueOf(String str) {
        return (EnumC23613l) Enum.valueOf(EnumC23613l.class, str);
    }

    public static EnumC23613l[] values() {
        return (EnumC23613l[]) f114473s.clone();
    }
}
