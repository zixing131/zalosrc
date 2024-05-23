package mo0;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mo0.b */
/* loaded from: classes7.dex */
public final class EnumC23411b {

    /* renamed from: p */
    public static final EnumC23411b f113754p = new EnumC23411b(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC23411b f113755q = new EnumC23411b("NO_NETWORK", 1);

    /* renamed from: r */
    public static final EnumC23411b f113756r = new EnumC23411b("LOCAL_INTERRUPTED", 2);

    /* renamed from: s */
    public static final EnumC23411b f113757s = new EnumC23411b("PARTNER_INTERRUPTED", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC23411b[] f113758t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f113759u;

    static {
        EnumC23411b[] m123020b = m123020b();
        f113758t = m123020b;
        f113759u = AbstractC30166b.m148796a(m123020b);
    }

    private EnumC23411b(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23411b[] m123020b() {
        return new EnumC23411b[]{f113754p, f113755q, f113756r, f113757s};
    }

    public static EnumC23411b valueOf(String str) {
        return (EnumC23411b) Enum.valueOf(EnumC23411b.class, str);
    }

    public static EnumC23411b[] values() {
        return (EnumC23411b[]) f113758t.clone();
    }
}
