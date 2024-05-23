package p560uw;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uw.b */
/* loaded from: classes4.dex */
public final class EnumC27375b {

    /* renamed from: q */
    public static final EnumC27375b f128972q = new EnumC27375b("DEFAULT", 0, 0);

    /* renamed from: r */
    public static final EnumC27375b f128973r = new EnumC27375b("PASTE", 1, 1);

    /* renamed from: s */
    public static final EnumC27375b f128974s = new EnumC27375b("QR_SCAN_SHARE", 2, 2);

    /* renamed from: t */
    public static final EnumC27375b f128975t = new EnumC27375b("SINGLE_FORWARD", 3, 3);

    /* renamed from: u */
    public static final EnumC27375b f128976u = new EnumC27375b("SINGLE_SHARE_OUT_APP", 4, 4);

    /* renamed from: v */
    public static final EnumC27375b f128977v = new EnumC27375b("MULTI_FORWARD", 5, 5);

    /* renamed from: w */
    public static final EnumC27375b f128978w = new EnumC27375b("MULTI_SHARE_OUT_APP", 6, 6);

    /* renamed from: x */
    private static final /* synthetic */ EnumC27375b[] f128979x;

    /* renamed from: y */
    private static final /* synthetic */ InterfaceC30165a f128980y;

    /* renamed from: p */
    private final int f128981p;

    static {
        EnumC27375b[] m140277b = m140277b();
        f128979x = m140277b;
        f128980y = AbstractC30166b.m148796a(m140277b);
    }

    private EnumC27375b(String str, int i11, int i12) {
        this.f128981p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27375b[] m140277b() {
        return new EnumC27375b[]{f128972q, f128973r, f128974s, f128975t, f128976u, f128977v, f128978w};
    }

    public static EnumC27375b valueOf(String str) {
        return (EnumC27375b) Enum.valueOf(EnumC27375b.class, str);
    }

    public static EnumC27375b[] values() {
        return (EnumC27375b[]) f128979x.clone();
    }

    /* renamed from: c */
    public final int m140278c() {
        return this.f128981p;
    }
}
