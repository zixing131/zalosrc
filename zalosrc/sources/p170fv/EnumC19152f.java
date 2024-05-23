package p170fv;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fv.f */
/* loaded from: classes4.dex */
public final class EnumC19152f {

    /* renamed from: p */
    public static final EnumC19152f f95191p = new EnumC19152f("LEFT", 0);

    /* renamed from: q */
    public static final EnumC19152f f95192q = new EnumC19152f("CENTER", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC19152f[] f95193r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f95194s;

    static {
        EnumC19152f[] m100496b = m100496b();
        f95193r = m100496b;
        f95194s = AbstractC30166b.m148796a(m100496b);
    }

    private EnumC19152f(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19152f[] m100496b() {
        return new EnumC19152f[]{f95191p, f95192q};
    }

    public static EnumC19152f valueOf(String str) {
        return (EnumC19152f) Enum.valueOf(EnumC19152f.class, str);
    }

    public static EnumC19152f[] values() {
        return (EnumC19152f[]) f95193r.clone();
    }
}
