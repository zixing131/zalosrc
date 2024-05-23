package p427pq;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pq.a */
/* loaded from: classes4.dex */
public final class EnumC24904a {

    /* renamed from: q */
    public static final EnumC24904a f119495q = new EnumC24904a("MainEntrypoint", 0, "main_entrypoint");

    /* renamed from: r */
    public static final EnumC24904a f119496r = new EnumC24904a("SeeMoreEntrypointFull", 1, "see_more_entrypoint_full");

    /* renamed from: s */
    public static final EnumC24904a f119497s = new EnumC24904a("SeeMoreEntrypointWithoutSeeAvatar", 2, "see_more_entrypoint_without_see_avatar");

    /* renamed from: t */
    private static final /* synthetic */ EnumC24904a[] f119498t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f119499u;

    /* renamed from: p */
    private final String f119500p;

    static {
        EnumC24904a[] m129506b = m129506b();
        f119498t = m129506b;
        f119499u = AbstractC30166b.m148796a(m129506b);
    }

    private EnumC24904a(String str, int i11, String str2) {
        this.f119500p = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24904a[] m129506b() {
        return new EnumC24904a[]{f119495q, f119496r, f119497s};
    }

    public static EnumC24904a valueOf(String str) {
        return (EnumC24904a) Enum.valueOf(EnumC24904a.class, str);
    }

    public static EnumC24904a[] values() {
        return (EnumC24904a[]) f119498t.clone();
    }

    /* renamed from: c */
    public final String m129507c() {
        return this.f119500p;
    }
}
