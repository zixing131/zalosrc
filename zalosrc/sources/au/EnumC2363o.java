package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.o */
/* loaded from: classes4.dex */
public final class EnumC2363o {

    /* renamed from: p */
    public static final EnumC2363o f9889p = new EnumC2363o("NO_FILTER", 0);

    /* renamed from: q */
    public static final EnumC2363o f9890q = new EnumC2363o("FILTER_BY_SENDER", 1);

    /* renamed from: r */
    public static final EnumC2363o f9891r = new EnumC2363o("FILTER_BY_VIDEO", 2);

    /* renamed from: s */
    public static final EnumC2363o f9892s = new EnumC2363o("FILTER_BY_PHOTO", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC2363o[] f9893t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f9894u;

    static {
        EnumC2363o[] m12357b = m12357b();
        f9893t = m12357b;
        f9894u = AbstractC30166b.m148796a(m12357b);
    }

    private EnumC2363o(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2363o[] m12357b() {
        return new EnumC2363o[]{f9889p, f9890q, f9891r, f9892s};
    }

    public static EnumC2363o valueOf(String str) {
        return (EnumC2363o) Enum.valueOf(EnumC2363o.class, str);
    }

    public static EnumC2363o[] values() {
        return (EnumC2363o[]) f9893t.clone();
    }
}
