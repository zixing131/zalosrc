package p164fn;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fn.l */
/* loaded from: classes3.dex */
public final class EnumC19038l {

    /* renamed from: p */
    public static final EnumC19038l f94903p = new EnumC19038l("NOT_START", 0);

    /* renamed from: q */
    public static final EnumC19038l f94904q = new EnumC19038l("DOWNLOADING", 1);

    /* renamed from: r */
    public static final EnumC19038l f94905r = new EnumC19038l("SUCCESS", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC19038l[] f94906s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f94907t;

    static {
        EnumC19038l[] m100146b = m100146b();
        f94906s = m100146b;
        f94907t = AbstractC30166b.m148796a(m100146b);
    }

    private EnumC19038l(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19038l[] m100146b() {
        return new EnumC19038l[]{f94903p, f94904q, f94905r};
    }

    public static EnumC19038l valueOf(String str) {
        return (EnumC19038l) Enum.valueOf(EnumC19038l.class, str);
    }

    public static EnumC19038l[] values() {
        return (EnumC19038l[]) f94906s.clone();
    }
}
