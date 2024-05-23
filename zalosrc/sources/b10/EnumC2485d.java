package b10;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b10.d */
/* loaded from: classes5.dex */
public final class EnumC2485d {

    /* renamed from: R */
    private static final /* synthetic */ EnumC2485d[] f10158R;

    /* renamed from: S */
    private static final /* synthetic */ InterfaceC30165a f10159S;

    /* renamed from: p */
    private final int f10170p;

    /* renamed from: q */
    public static final EnumC2485d f10160q = new EnumC2485d("iab", 0, 1);

    /* renamed from: r */
    public static final EnumC2485d f10161r = new EnumC2485d("channelShare", 1, 10);

    /* renamed from: s */
    public static final EnumC2485d f10162s = new EnumC2485d("channelAnalytics", 2, 11);

    /* renamed from: t */
    public static final EnumC2485d f10163t = new EnumC2485d("channelEditProfile", 3, 12);

    /* renamed from: u */
    public static final EnumC2485d f10164u = new EnumC2485d("channelLock", 4, 13);

    /* renamed from: v */
    public static final EnumC2485d f10165v = new EnumC2485d("channelReport", 5, 14);

    /* renamed from: w */
    public static final EnumC2485d f10166w = new EnumC2485d("channelUnlock", 6, 15);

    /* renamed from: x */
    public static final EnumC2485d f10167x = new EnumC2485d("videoShare", 7, 40);

    /* renamed from: y */
    public static final EnumC2485d f10168y = new EnumC2485d("videoBookmark", 8, 41);

    /* renamed from: z */
    public static final EnumC2485d f10169z = new EnumC2485d("videoUnbookmark", 9, 48);

    /* renamed from: A */
    public static final EnumC2485d f10141A = new EnumC2485d("videoAutoSwipe", 10, 42);

    /* renamed from: B */
    public static final EnumC2485d f10142B = new EnumC2485d("videoPin", 11, 43);

    /* renamed from: C */
    public static final EnumC2485d f10143C = new EnumC2485d("videoUnpin", 12, 49);

    /* renamed from: D */
    public static final EnumC2485d f10144D = new EnumC2485d("videoDelete", 13, 44);

    /* renamed from: E */
    public static final EnumC2485d f10145E = new EnumC2485d("videoReport", 14, 45);

    /* renamed from: F */
    public static final EnumC2485d f10146F = new EnumC2485d("videoUninterested", 15, 46);

    /* renamed from: G */
    public static final EnumC2485d f10147G = new EnumC2485d("videoChannelUninterested", 16, 47);

    /* renamed from: H */
    public static final EnumC2485d f10148H = new EnumC2485d("videoLockComment", 17, 50);

    /* renamed from: I */
    public static final EnumC2485d f10149I = new EnumC2485d("userTopicFavourte", 18, 60);

    /* renamed from: J */
    public static final EnumC2485d f10150J = new EnumC2485d("userFeedbackAndReport", 19, 61);

    /* renamed from: K */
    public static final EnumC2485d f10151K = new EnumC2485d("userPrivacyAndTerm", 20, 62);

    /* renamed from: L */
    public static final EnumC2485d f10152L = new EnumC2485d("commentCopy", 21, 80);

    /* renamed from: M */
    public static final EnumC2485d f10153M = new EnumC2485d("commentDelete", 22, 81);

    /* renamed from: N */
    public static final EnumC2485d f10154N = new EnumC2485d("commentReport", 23, 82);

    /* renamed from: O */
    public static final EnumC2485d f10155O = new EnumC2485d("commentPin", 24, 83);

    /* renamed from: P */
    public static final EnumC2485d f10156P = new EnumC2485d("commentUnPin", 25, 84);

    /* renamed from: Q */
    public static final EnumC2485d f10157Q = new EnumC2485d("liveReport", 26, 85);

    static {
        EnumC2485d[] m12551b = m12551b();
        f10158R = m12551b;
        f10159S = AbstractC30166b.m148796a(m12551b);
    }

    private EnumC2485d(String str, int i11, int i12) {
        this.f10170p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2485d[] m12551b() {
        return new EnumC2485d[]{f10160q, f10161r, f10162s, f10163t, f10164u, f10165v, f10166w, f10167x, f10168y, f10169z, f10141A, f10142B, f10143C, f10144D, f10145E, f10146F, f10147G, f10148H, f10149I, f10150J, f10151K, f10152L, f10153M, f10154N, f10155O, f10156P, f10157Q};
    }

    public static EnumC2485d valueOf(String str) {
        return (EnumC2485d) Enum.valueOf(EnumC2485d.class, str);
    }

    public static EnumC2485d[] values() {
        return (EnumC2485d[]) f10158R.clone();
    }

    /* renamed from: c */
    public final int m12552c() {
        return this.f10170p;
    }
}
