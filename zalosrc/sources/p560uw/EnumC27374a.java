package p560uw;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uw.a */
/* loaded from: classes4.dex */
public final class EnumC27374a {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC27374a f128964q = new EnumC27374a("UNCHECK", 0, 0);

    /* renamed from: r */
    public static final EnumC27374a f128965r = new EnumC27374a(Image.SCALE_TYPE_NONE, 1, 1);

    /* renamed from: s */
    public static final EnumC27374a f128966s = new EnumC27374a("UNSURE", 2, 2);

    /* renamed from: t */
    public static final EnumC27374a f128967t = new EnumC27374a("SUSPICIOUS", 3, 3);

    /* renamed from: u */
    public static final EnumC27374a f128968u = new EnumC27374a("DANGER", 4, 4);

    /* renamed from: v */
    private static final /* synthetic */ EnumC27374a[] f128969v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f128970w;

    /* renamed from: p */
    private final int f128971p;

    /* renamed from: uw.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC27374a m140276a(int i11) {
            for (EnumC27374a enumC27374a : EnumC27374a.values()) {
                if (enumC27374a.m140275c() == i11) {
                    return enumC27374a;
                }
            }
            return null;
        }
    }

    static {
        EnumC27374a[] m140273b = m140273b();
        f128969v = m140273b;
        f128970w = AbstractC30166b.m148796a(m140273b);
        Companion = new a(null);
    }

    private EnumC27374a(String str, int i11, int i12) {
        this.f128971p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27374a[] m140273b() {
        return new EnumC27374a[]{f128964q, f128965r, f128966s, f128967t, f128968u};
    }

    /* renamed from: d */
    public static final EnumC27374a m140274d(int i11) {
        return Companion.m140276a(i11);
    }

    public static EnumC27374a valueOf(String str) {
        return (EnumC27374a) Enum.valueOf(EnumC27374a.class, str);
    }

    public static EnumC27374a[] values() {
        return (EnumC27374a[]) f128969v.clone();
    }

    /* renamed from: c */
    public final int m140275c() {
        return this.f128971p;
    }
}
