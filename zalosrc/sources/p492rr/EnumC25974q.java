package p492rr;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rr.q */
/* loaded from: classes4.dex */
public final class EnumC25974q {

    /* renamed from: p */
    public static final EnumC25974q f123928p = new EnumC25974q("VALID", 0);

    /* renamed from: q */
    public static final EnumC25974q f123929q = new EnumC25974q("INVALID_DATA", 1);

    /* renamed from: r */
    public static final EnumC25974q f123930r = new EnumC25974q("INVALID_SUBMITTING", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC25974q[] f123931s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f123932t;

    static {
        EnumC25974q[] m133797b = m133797b();
        f123931s = m133797b;
        f123932t = AbstractC30166b.m148796a(m133797b);
    }

    private EnumC25974q(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25974q[] m133797b() {
        return new EnumC25974q[]{f123928p, f123929q, f123930r};
    }

    public static EnumC25974q valueOf(String str) {
        return (EnumC25974q) Enum.valueOf(EnumC25974q.class, str);
    }

    public static EnumC25974q[] values() {
        return (EnumC25974q[]) f123931s.clone();
    }
}
