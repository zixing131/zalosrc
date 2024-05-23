package p390of;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: of.b */
/* loaded from: classes3.dex */
public final class EnumC24246b {

    /* renamed from: q */
    public static final EnumC24246b f117117q = new EnumC24246b("UNKNOWN", 0, -1);

    /* renamed from: r */
    public static final EnumC24246b f117118r = new EnumC24246b("IDLE", 1, 1);

    /* renamed from: s */
    public static final EnumC24246b f117119s = new EnumC24246b("PENDING", 2, 2);

    /* renamed from: t */
    public static final EnumC24246b f117120t = new EnumC24246b("COMPLETE", 3, 3);

    /* renamed from: u */
    public static final EnumC24246b f117121u = new EnumC24246b("ERROR", 4, 4);

    /* renamed from: v */
    private static final /* synthetic */ EnumC24246b[] f117122v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f117123w;

    /* renamed from: p */
    private final int f117124p;

    static {
        EnumC24246b[] m126582b = m126582b();
        f117122v = m126582b;
        f117123w = AbstractC30166b.m148796a(m126582b);
    }

    private EnumC24246b(String str, int i11, int i12) {
        this.f117124p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24246b[] m126582b() {
        return new EnumC24246b[]{f117117q, f117118r, f117119s, f117120t, f117121u};
    }

    public static EnumC24246b valueOf(String str) {
        return (EnumC24246b) Enum.valueOf(EnumC24246b.class, str);
    }

    public static EnumC24246b[] values() {
        return (EnumC24246b[]) f117122v.clone();
    }
}
