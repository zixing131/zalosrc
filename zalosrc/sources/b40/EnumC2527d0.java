package b40;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b40.d0 */
/* loaded from: classes5.dex */
public final class EnumC2527d0 {

    /* renamed from: q */
    public static final EnumC2527d0 f10277q = new EnumC2527d0("SessionChanged", 0, 61);

    /* renamed from: r */
    public static final EnumC2527d0 f10278r = new EnumC2527d0("EncryptFailed", 1, 62);

    /* renamed from: s */
    private static final /* synthetic */ EnumC2527d0[] f10279s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f10280t;

    /* renamed from: p */
    private final int f10281p;

    static {
        EnumC2527d0[] m12739b = m12739b();
        f10279s = m12739b;
        f10280t = AbstractC30166b.m148796a(m12739b);
    }

    private EnumC2527d0(String str, int i11, int i12) {
        this.f10281p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2527d0[] m12739b() {
        return new EnumC2527d0[]{f10277q, f10278r};
    }

    public static EnumC2527d0 valueOf(String str) {
        return (EnumC2527d0) Enum.valueOf(EnumC2527d0.class, str);
    }

    public static EnumC2527d0[] values() {
        return (EnumC2527d0[]) f10279s.clone();
    }

    /* renamed from: c */
    public final int m12740c() {
        return this.f10281p;
    }
}
