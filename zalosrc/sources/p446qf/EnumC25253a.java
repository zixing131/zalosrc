package p446qf;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qf.a */
/* loaded from: classes3.dex */
public final class EnumC25253a {

    /* renamed from: p */
    public static final EnumC25253a f121115p = new EnumC25253a("RIGHT_TOP", 0);

    /* renamed from: q */
    public static final EnumC25253a f121116q = new EnumC25253a("RIGHT_CENTER", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC25253a[] f121117r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f121118s;

    static {
        EnumC25253a[] m130685b = m130685b();
        f121117r = m130685b;
        f121118s = AbstractC30166b.m148796a(m130685b);
    }

    private EnumC25253a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25253a[] m130685b() {
        return new EnumC25253a[]{f121115p, f121116q};
    }

    public static EnumC25253a valueOf(String str) {
        return (EnumC25253a) Enum.valueOf(EnumC25253a.class, str);
    }

    public static EnumC25253a[] values() {
        return (EnumC25253a[]) f121117r.clone();
    }
}
