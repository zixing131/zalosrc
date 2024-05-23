package p581vo;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vo.d */
/* loaded from: classes4.dex */
public final class EnumC28361d {

    /* renamed from: p */
    public static final EnumC28361d f132141p = new EnumC28361d("SUCCESS", 0);

    /* renamed from: q */
    public static final EnumC28361d f132142q = new EnumC28361d("ERROR", 1);

    /* renamed from: r */
    public static final EnumC28361d f132143r = new EnumC28361d("PROCESSING", 2);

    /* renamed from: s */
    public static final EnumC28361d f132144s = new EnumC28361d("CANCEL", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC28361d[] f132145t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f132146u;

    static {
        EnumC28361d[] m142817b = m142817b();
        f132145t = m142817b;
        f132146u = AbstractC30166b.m148796a(m142817b);
    }

    private EnumC28361d(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC28361d[] m142817b() {
        return new EnumC28361d[]{f132141p, f132142q, f132143r, f132144s};
    }

    public static EnumC28361d valueOf(String str) {
        return (EnumC28361d) Enum.valueOf(EnumC28361d.class, str);
    }

    public static EnumC28361d[] values() {
        return (EnumC28361d[]) f132145t.clone();
    }
}
