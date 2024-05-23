package gi;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gi.c */
/* loaded from: classes3.dex */
public final class EnumC19450c {

    /* renamed from: A */
    private static final /* synthetic */ InterfaceC30165a f96552A;

    /* renamed from: p */
    public static final EnumC19450c f96553p = new EnumC19450c(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC19450c f96554q = new EnumC19450c("CONTEXT", 1);

    /* renamed from: r */
    public static final EnumC19450c f96555r = new EnumC19450c("REPLY", 2);

    /* renamed from: s */
    public static final EnumC19450c f96556s = new EnumC19450c("FIRST_KWD", 3);

    /* renamed from: t */
    public static final EnumC19450c f96557t = new EnumC19450c("POST_SENDING", 4);

    /* renamed from: u */
    public static final EnumC19450c f96558u = new EnumC19450c("SEARCH", 5);

    /* renamed from: v */
    public static final EnumC19450c f96559v = new EnumC19450c("TYPO", 6);

    /* renamed from: w */
    public static final EnumC19450c f96560w = new EnumC19450c("FEED_SUGGESTION", 7);

    /* renamed from: x */
    public static final EnumC19450c f96561x = new EnumC19450c("MSG_HINT_SUGGESTION", 8);

    /* renamed from: y */
    public static final EnumC19450c f96562y = new EnumC19450c("POST_SENDING_WITH_MODEL", 9);

    /* renamed from: z */
    private static final /* synthetic */ EnumC19450c[] f96563z;

    static {
        EnumC19450c[] m101748b = m101748b();
        f96563z = m101748b;
        f96552A = AbstractC30166b.m148796a(m101748b);
    }

    private EnumC19450c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19450c[] m101748b() {
        return new EnumC19450c[]{f96553p, f96554q, f96555r, f96556s, f96557t, f96558u, f96559v, f96560w, f96561x, f96562y};
    }

    public static EnumC19450c valueOf(String str) {
        return (EnumC19450c) Enum.valueOf(EnumC19450c.class, str);
    }

    public static EnumC19450c[] values() {
        return (EnumC19450c[]) f96563z.clone();
    }
}
