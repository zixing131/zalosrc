package p457qq;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qq.a */
/* loaded from: classes4.dex */
public final class EnumC25467a {

    /* renamed from: q */
    public static final EnumC25467a f122043q = new EnumC25467a("CoverEntrypointFull", 0, "cover_entrypoint_full");

    /* renamed from: r */
    public static final EnumC25467a f122044r = new EnumC25467a("SeeMoreEntrypointWithoutSeeCover", 1, "see_more_entrypoint_without_see_cover");

    /* renamed from: s */
    private static final /* synthetic */ EnumC25467a[] f122045s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f122046t;

    /* renamed from: p */
    private final String f122047p;

    static {
        EnumC25467a[] m131932b = m131932b();
        f122045s = m131932b;
        f122046t = AbstractC30166b.m148796a(m131932b);
    }

    private EnumC25467a(String str, int i11, String str2) {
        this.f122047p = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25467a[] m131932b() {
        return new EnumC25467a[]{f122043q, f122044r};
    }

    public static EnumC25467a valueOf(String str) {
        return (EnumC25467a) Enum.valueOf(EnumC25467a.class, str);
    }

    public static EnumC25467a[] values() {
        return (EnumC25467a[]) f122045s.clone();
    }

    /* renamed from: c */
    public final String m131933c() {
        return this.f122047p;
    }
}
