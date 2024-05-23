package mo0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mo0.a */
/* loaded from: classes7.dex */
public final class EnumC23410a {

    /* renamed from: E */
    private static final /* synthetic */ EnumC23410a[] f113741E;

    /* renamed from: F */
    private static final /* synthetic */ InterfaceC30165a f113742F;

    /* renamed from: p */
    public static final EnumC23410a f113743p = new EnumC23410a("IDLE", 0);

    /* renamed from: q */
    public static final EnumC23410a f113744q = new EnumC23410a("PARTNER_POOR_CONNECT", 1);

    /* renamed from: r */
    public static final EnumC23410a f113745r = new EnumC23410a("USER_POOR_CONNECT", 2);

    /* renamed from: s */
    public static final EnumC23410a f113746s = new EnumC23410a("PARTNER_RECONNECT", 3);

    /* renamed from: t */
    public static final EnumC23410a f113747t = new EnumC23410a("USER_RECONNECT", 4);

    /* renamed from: u */
    public static final EnumC23410a f113748u = new EnumC23410a("IMPROVING", 5);

    /* renamed from: v */
    public static final EnumC23410a f113749v = new EnumC23410a("ROAMING", 6);

    /* renamed from: w */
    public static final EnumC23410a f113750w = new EnumC23410a("PARTNER_CAM_ERROR", 7);

    /* renamed from: x */
    public static final EnumC23410a f113751x = new EnumC23410a("PARTNER_SPEAKER_ERROR", 8);

    /* renamed from: y */
    public static final EnumC23410a f113752y = new EnumC23410a("PARTNER_MIC_ERROR", 9);

    /* renamed from: z */
    public static final EnumC23410a f113753z = new EnumC23410a("USER_CAM_ERROR", 10);

    /* renamed from: A */
    public static final EnumC23410a f113737A = new EnumC23410a("USER_SPEAKER_ERROR", 11);

    /* renamed from: B */
    public static final EnumC23410a f113738B = new EnumC23410a("USER_MIC_ERROR", 12);

    /* renamed from: C */
    public static final EnumC23410a f113739C = new EnumC23410a("HOLD_DUE_TO_NATIVE_CALL", 13);

    /* renamed from: D */
    public static final EnumC23410a f113740D = new EnumC23410a("SWITCH_TO_VIDEO", 14);

    static {
        EnumC23410a[] m123019b = m123019b();
        f113741E = m123019b;
        f113742F = AbstractC30166b.m148796a(m123019b);
    }

    private EnumC23410a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23410a[] m123019b() {
        return new EnumC23410a[]{f113743p, f113744q, f113745r, f113746s, f113747t, f113748u, f113749v, f113750w, f113751x, f113752y, f113753z, f113737A, f113738B, f113739C, f113740D};
    }

    public static EnumC23410a valueOf(String str) {
        return (EnumC23410a) Enum.valueOf(EnumC23410a.class, str);
    }

    public static EnumC23410a[] values() {
        return (EnumC23410a[]) f113741E.clone();
    }
}
