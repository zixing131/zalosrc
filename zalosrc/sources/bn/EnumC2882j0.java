package bn;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bn.j0 */
/* loaded from: classes3.dex */
public final class EnumC2882j0 {

    /* renamed from: A */
    private static final /* synthetic */ InterfaceC30165a f11476A;

    /* renamed from: p */
    public static final EnumC2882j0 f11477p = new EnumC2882j0("FILE_FAILED", 0);

    /* renamed from: q */
    public static final EnumC2882j0 f11478q = new EnumC2882j0("FILE_ROLLED_FROM_MY_CLOUD", 1);

    /* renamed from: r */
    public static final EnumC2882j0 f11479r = new EnumC2882j0("FILE_ROLLED", 2);

    /* renamed from: s */
    public static final EnumC2882j0 f11480s = new EnumC2882j0("VIDEO_FAILED", 3);

    /* renamed from: t */
    public static final EnumC2882j0 f11481t = new EnumC2882j0("VIDEO_ROLLED_FROM_MY_CLOUD", 4);

    /* renamed from: u */
    public static final EnumC2882j0 f11482u = new EnumC2882j0("VIDEO_ROLLED", 5);

    /* renamed from: v */
    public static final EnumC2882j0 f11483v = new EnumC2882j0("BIG_FILE", 6);

    /* renamed from: w */
    public static final EnumC2882j0 f11484w = new EnumC2882j0("BIG_VIDEO", 7);

    /* renamed from: x */
    public static final EnumC2882j0 f11485x = new EnumC2882j0("MULTI_MESSAGES_FAILED", 8);

    /* renamed from: y */
    public static final EnumC2882j0 f11486y = new EnumC2882j0("NETWORK_ERROR", 9);

    /* renamed from: z */
    private static final /* synthetic */ EnumC2882j0[] f11487z;

    static {
        EnumC2882j0[] m13837b = m13837b();
        f11487z = m13837b;
        f11476A = AbstractC30166b.m148796a(m13837b);
    }

    private EnumC2882j0(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2882j0[] m13837b() {
        return new EnumC2882j0[]{f11477p, f11478q, f11479r, f11480s, f11481t, f11482u, f11483v, f11484w, f11485x, f11486y};
    }

    public static EnumC2882j0 valueOf(String str) {
        return (EnumC2882j0) Enum.valueOf(EnumC2882j0.class, str);
    }

    public static EnumC2882j0[] values() {
        return (EnumC2882j0[]) f11487z.clone();
    }
}
