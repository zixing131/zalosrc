package p492rr;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rr.a */
/* loaded from: classes4.dex */
public final class EnumC25958a {

    /* renamed from: p */
    public static final EnumC25958a f123879p = new EnumC25958a("STATE_CANCEL", 0);

    /* renamed from: q */
    public static final EnumC25958a f123880q = new EnumC25958a("STATE_FINISH_UPDATE_FAIL", 1);

    /* renamed from: r */
    public static final EnumC25958a f123881r = new EnumC25958a("STATE_FINISH_UPDATE_SUCCESS", 2);

    /* renamed from: s */
    public static final EnumC25958a f123882s = new EnumC25958a("STATE_ACTIVE", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC25958a[] f123883t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f123884u;

    static {
        EnumC25958a[] m133729b = m133729b();
        f123883t = m133729b;
        f123884u = AbstractC30166b.m148796a(m133729b);
    }

    private EnumC25958a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25958a[] m133729b() {
        return new EnumC25958a[]{f123879p, f123880q, f123881r, f123882s};
    }

    public static EnumC25958a valueOf(String str) {
        return (EnumC25958a) Enum.valueOf(EnumC25958a.class, str);
    }

    public static EnumC25958a[] values() {
        return (EnumC25958a[]) f123883t.clone();
    }
}
