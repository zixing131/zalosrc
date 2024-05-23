package bv;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bv.b */
/* loaded from: classes4.dex */
public final class EnumC3144b {

    /* renamed from: q */
    public static final EnumC3144b f13275q = new EnumC3144b("START_FLOW", 0, 1);

    /* renamed from: r */
    public static final EnumC3144b f13276r = new EnumC3144b("SHOW_LOADING_VIEW", 1, 2);

    /* renamed from: s */
    public static final EnumC3144b f13277s = new EnumC3144b("INIT_WEBKIT", 2, 3);

    /* renamed from: t */
    public static final EnumC3144b f13278t = new EnumC3144b("LOAD_URL", 3, 4);

    /* renamed from: u */
    public static final EnumC3144b f13279u = new EnumC3144b("PAGE_STARTED", 4, 5);

    /* renamed from: v */
    public static final EnumC3144b f13280v = new EnumC3144b("PAGE_FINISHED", 5, 6);

    /* renamed from: w */
    public static final EnumC3144b f13281w = new EnumC3144b("HIDE_LOADING_VIEW", 6, 8);

    /* renamed from: x */
    public static final EnumC3144b f13282x = new EnumC3144b("LOGIN_JUMP", 7, 9);

    /* renamed from: y */
    private static final /* synthetic */ EnumC3144b[] f13283y;

    /* renamed from: z */
    private static final /* synthetic */ InterfaceC30165a f13284z;

    /* renamed from: p */
    private final int f13285p;

    static {
        EnumC3144b[] m15827b = m15827b();
        f13283y = m15827b;
        f13284z = AbstractC30166b.m148796a(m15827b);
    }

    private EnumC3144b(String str, int i11, int i12) {
        this.f13285p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3144b[] m15827b() {
        return new EnumC3144b[]{f13275q, f13276r, f13277s, f13278t, f13279u, f13280v, f13281w, f13282x};
    }

    public static EnumC3144b valueOf(String str) {
        return (EnumC3144b) Enum.valueOf(EnumC3144b.class, str);
    }

    public static EnumC3144b[] values() {
        return (EnumC3144b[]) f13283y.clone();
    }

    /* renamed from: c */
    public final int m15828c() {
        return this.f13285p;
    }
}
