package bn0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bn0.f */
/* loaded from: classes7.dex */
public final class EnumC2937f {

    /* renamed from: p */
    public static final EnumC2937f f11622p = new EnumC2937f("TOP_DOWN", 0);

    /* renamed from: q */
    public static final EnumC2937f f11623q = new EnumC2937f("BOTTOM_UP", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC2937f[] f11624r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f11625s;

    static {
        EnumC2937f[] m13905b = m13905b();
        f11624r = m13905b;
        f11625s = AbstractC30166b.m148796a(m13905b);
    }

    private EnumC2937f(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2937f[] m13905b() {
        return new EnumC2937f[]{f11622p, f11623q};
    }

    public static EnumC2937f valueOf(String str) {
        return (EnumC2937f) Enum.valueOf(EnumC2937f.class, str);
    }

    public static EnumC2937f[] values() {
        return (EnumC2937f[]) f11624r.clone();
    }
}
