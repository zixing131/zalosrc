package c50;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c50.b */
/* loaded from: classes5.dex */
public final class EnumC3291b {

    /* renamed from: p */
    public static final EnumC3291b f14081p = new EnumC3291b("IDLE", 0);

    /* renamed from: q */
    public static final EnumC3291b f14082q = new EnumC3291b("TYPING", 1);

    /* renamed from: r */
    public static final EnumC3291b f14083r = new EnumC3291b("INPUT_DONE", 2);

    /* renamed from: s */
    public static final EnumC3291b f14084s = new EnumC3291b("EXCEED_INPUT", 3);

    /* renamed from: t */
    public static final EnumC3291b f14085t = new EnumC3291b("SUCCESS", 4);

    /* renamed from: u */
    public static final EnumC3291b f14086u = new EnumC3291b("FAILED", 5);

    /* renamed from: v */
    private static final /* synthetic */ EnumC3291b[] f14087v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f14088w;

    static {
        EnumC3291b[] m16710b = m16710b();
        f14087v = m16710b;
        f14088w = AbstractC30166b.m148796a(m16710b);
    }

    private EnumC3291b(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3291b[] m16710b() {
        return new EnumC3291b[]{f14081p, f14082q, f14083r, f14084s, f14085t, f14086u};
    }

    public static EnumC3291b valueOf(String str) {
        return (EnumC3291b) Enum.valueOf(EnumC3291b.class, str);
    }

    public static EnumC3291b[] values() {
        return (EnumC3291b[]) f14087v.clone();
    }
}
