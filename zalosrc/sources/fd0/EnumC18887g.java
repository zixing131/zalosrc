package fd0;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fd0.g */
/* loaded from: classes4.dex */
public final class EnumC18887g {

    /* renamed from: p */
    public static final EnumC18887g f94279p = new EnumC18887g(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC18887g f94280q = new EnumC18887g("STOP_S2T", 1);

    /* renamed from: r */
    public static final EnumC18887g f94281r = new EnumC18887g("RESET", 2);

    /* renamed from: s */
    public static final EnumC18887g f94282s = new EnumC18887g("SEND", 3);

    /* renamed from: t */
    public static final EnumC18887g f94283t = new EnumC18887g("PREVIEW", 4);

    /* renamed from: u */
    public static final EnumC18887g f94284u = new EnumC18887g("PREVIEW_AUTO_PLAY", 5);

    /* renamed from: v */
    private static final /* synthetic */ EnumC18887g[] f94285v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f94286w;

    static {
        EnumC18887g[] m99018b = m99018b();
        f94285v = m99018b;
        f94286w = AbstractC30166b.m148796a(m99018b);
    }

    private EnumC18887g(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18887g[] m99018b() {
        return new EnumC18887g[]{f94279p, f94280q, f94281r, f94282s, f94283t, f94284u};
    }

    public static EnumC18887g valueOf(String str) {
        return (EnumC18887g) Enum.valueOf(EnumC18887g.class, str);
    }

    public static EnumC18887g[] values() {
        return (EnumC18887g[]) f94285v.clone();
    }
}
