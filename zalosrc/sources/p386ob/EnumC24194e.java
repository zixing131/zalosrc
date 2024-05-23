package p386ob;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ob.e */
/* loaded from: classes3.dex */
public final class EnumC24194e {

    /* renamed from: q */
    public static final EnumC24194e f116776q = new EnumC24194e("UNDEFINE", 0, -1);

    /* renamed from: r */
    public static final EnumC24194e f116777r = new EnumC24194e("NORMAL_THREAD_CHAT", 1, 0);

    /* renamed from: s */
    public static final EnumC24194e f116778s = new EnumC24194e("E2EE_THREAD_CHAT", 2, 1);

    /* renamed from: t */
    private static final /* synthetic */ EnumC24194e[] f116779t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f116780u;

    /* renamed from: p */
    private final int f116781p;

    static {
        EnumC24194e[] m126134b = m126134b();
        f116779t = m126134b;
        f116780u = AbstractC30166b.m148796a(m126134b);
    }

    private EnumC24194e(String str, int i11, int i12) {
        this.f116781p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24194e[] m126134b() {
        return new EnumC24194e[]{f116776q, f116777r, f116778s};
    }

    public static EnumC24194e valueOf(String str) {
        return (EnumC24194e) Enum.valueOf(EnumC24194e.class, str);
    }

    public static EnumC24194e[] values() {
        return (EnumC24194e[]) f116779t.clone();
    }

    /* renamed from: c */
    public final int m126135c() {
        return this.f116781p;
    }
}
