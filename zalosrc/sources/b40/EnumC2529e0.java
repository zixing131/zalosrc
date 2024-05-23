package b40;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b40.e0 */
/* loaded from: classes5.dex */
public final class EnumC2529e0 {

    /* renamed from: q */
    public static final EnumC2529e0 f10285q = new EnumC2529e0("OverTime", 0, 51);

    /* renamed from: r */
    public static final EnumC2529e0 f10286r = new EnumC2529e0("FailedToHash", 1, 52);

    /* renamed from: s */
    private static final /* synthetic */ EnumC2529e0[] f10287s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f10288t;

    /* renamed from: p */
    private final int f10289p;

    static {
        EnumC2529e0[] m12741b = m12741b();
        f10287s = m12741b;
        f10288t = AbstractC30166b.m148796a(m12741b);
    }

    private EnumC2529e0(String str, int i11, int i12) {
        this.f10289p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2529e0[] m12741b() {
        return new EnumC2529e0[]{f10285q, f10286r};
    }

    public static EnumC2529e0 valueOf(String str) {
        return (EnumC2529e0) Enum.valueOf(EnumC2529e0.class, str);
    }

    public static EnumC2529e0[] values() {
        return (EnumC2529e0[]) f10287s.clone();
    }

    /* renamed from: c */
    public final int m12742c() {
        return this.f10289p;
    }
}
