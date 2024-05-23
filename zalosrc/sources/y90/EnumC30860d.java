package y90;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y90.d */
/* loaded from: classes6.dex */
public final class EnumC30860d {

    /* renamed from: D */
    private static final /* synthetic */ EnumC30860d[] f142404D;

    /* renamed from: E */
    private static final /* synthetic */ InterfaceC30165a f142405E;

    /* renamed from: p */
    private final int f142416p;

    /* renamed from: q */
    public static final EnumC30860d f142406q = new EnumC30860d("SEARCH_GIF_PAGE", 0, 0);

    /* renamed from: r */
    public static final EnumC30860d f142407r = new EnumC30860d("EMOJI_SYSTEM_PAGE", 1, 1);

    /* renamed from: s */
    public static final EnumC30860d f142408s = new EnumC30860d("EMOTICON_PAGE", 2, 2);

    /* renamed from: t */
    public static final EnumC30860d f142409t = new EnumC30860d("SEARCH_PAGE", 3, 3);

    /* renamed from: u */
    public static final EnumC30860d f142410u = new EnumC30860d("SEASONAL_PAGE", 4, 4);

    /* renamed from: v */
    public static final EnumC30860d f142411v = new EnumC30860d("TRENDING_PAGE", 5, 5);

    /* renamed from: w */
    public static final EnumC30860d f142412w = new EnumC30860d("DOWNLOADED_STICKER_PAGE", 6, 6);

    /* renamed from: x */
    public static final EnumC30860d f142413x = new EnumC30860d("PROMOTION_STICKER_PAGE_TYPE_1", 7, 7);

    /* renamed from: y */
    public static final EnumC30860d f142414y = new EnumC30860d("PROMOTION_STICKER_PAGE_TYPE_2", 8, 8);

    /* renamed from: z */
    public static final EnumC30860d f142415z = new EnumC30860d("SETTING_PAGE", 9, 9);

    /* renamed from: A */
    public static final EnumC30860d f142401A = new EnumC30860d("STICKER_CATES_PAGE", 10, 10);

    /* renamed from: B */
    public static final EnumC30860d f142402B = new EnumC30860d("ZALO_EMOJI_REACTION_PAGE", 11, 11);

    /* renamed from: C */
    public static final EnumC30860d f142403C = new EnumC30860d("RECENT_EMOJI_REACTION_PAGE", 12, 12);

    static {
        EnumC30860d[] m150003b = m150003b();
        f142404D = m150003b;
        f142405E = AbstractC30166b.m148796a(m150003b);
    }

    private EnumC30860d(String str, int i11, int i12) {
        this.f142416p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30860d[] m150003b() {
        return new EnumC30860d[]{f142406q, f142407r, f142408s, f142409t, f142410u, f142411v, f142412w, f142413x, f142414y, f142415z, f142401A, f142402B, f142403C};
    }

    public static EnumC30860d valueOf(String str) {
        return (EnumC30860d) Enum.valueOf(EnumC30860d.class, str);
    }

    public static EnumC30860d[] values() {
        return (EnumC30860d[]) f142404D.clone();
    }

    /* renamed from: c */
    public final int m150004c() {
        return this.f142416p;
    }
}
