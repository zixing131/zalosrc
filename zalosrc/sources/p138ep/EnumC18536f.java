package p138ep;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ep.f */
/* loaded from: classes4.dex */
public final class EnumC18536f {

    /* renamed from: p */
    public static final EnumC18536f f93224p = new EnumC18536f("NOT_LOADED", 0);

    /* renamed from: q */
    public static final EnumC18536f f93225q = new EnumC18536f("LOADING", 1);

    /* renamed from: r */
    public static final EnumC18536f f93226r = new EnumC18536f("LOADED", 2);

    /* renamed from: s */
    public static final EnumC18536f f93227s = new EnumC18536f("ERROR_GENERAL", 3);

    /* renamed from: t */
    public static final EnumC18536f f93228t = new EnumC18536f("ERROR_ZVIDEO_INVALID", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC18536f[] f93229u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f93230v;

    static {
        EnumC18536f[] m97931b = m97931b();
        f93229u = m97931b;
        f93230v = AbstractC30166b.m148796a(m97931b);
    }

    private EnumC18536f(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18536f[] m97931b() {
        return new EnumC18536f[]{f93224p, f93225q, f93226r, f93227s, f93228t};
    }

    public static EnumC18536f valueOf(String str) {
        return (EnumC18536f) Enum.valueOf(EnumC18536f.class, str);
    }

    public static EnumC18536f[] values() {
        return (EnumC18536f[]) f93229u.clone();
    }
}
