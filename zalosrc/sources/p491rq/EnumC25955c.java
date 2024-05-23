package p491rq;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rq.c */
/* loaded from: classes4.dex */
public final class EnumC25955c {

    /* renamed from: q */
    public static final EnumC25955c f123844q = new EnumC25955c("TYPE_PHOTO", 0, 1);

    /* renamed from: r */
    public static final EnumC25955c f123845r = new EnumC25955c("TYPE_VIDEO", 1, 2);

    /* renamed from: s */
    public static final EnumC25955c f123846s = new EnumC25955c("TYPE_MOST_LIKE", 2, 3);

    /* renamed from: t */
    public static final EnumC25955c f123847t = new EnumC25955c("TYPE_MOST_COMMENT", 3, 4);

    /* renamed from: u */
    public static final EnumC25955c f123848u = new EnumC25955c("TYPE_MEMORIES", 4, 5);

    /* renamed from: v */
    public static final EnumC25955c f123849v = new EnumC25955c("TYPE_LIST_ALBUM", 5, 6);

    /* renamed from: w */
    public static final EnumC25955c f123850w = new EnumC25955c("TYPE_STORY_ARCHIVE", 6, 7);

    /* renamed from: x */
    private static final /* synthetic */ EnumC25955c[] f123851x;

    /* renamed from: y */
    private static final /* synthetic */ InterfaceC30165a f123852y;

    /* renamed from: p */
    private final int f123853p;

    static {
        EnumC25955c[] m133706b = m133706b();
        f123851x = m133706b;
        f123852y = AbstractC30166b.m148796a(m133706b);
    }

    private EnumC25955c(String str, int i11, int i12) {
        this.f123853p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25955c[] m133706b() {
        return new EnumC25955c[]{f123844q, f123845r, f123846s, f123847t, f123848u, f123849v, f123850w};
    }

    public static EnumC25955c valueOf(String str) {
        return (EnumC25955c) Enum.valueOf(EnumC25955c.class, str);
    }

    public static EnumC25955c[] values() {
        return (EnumC25955c[]) f123851x.clone();
    }

    /* renamed from: c */
    public final int m133707c() {
        return this.f123853p;
    }
}
