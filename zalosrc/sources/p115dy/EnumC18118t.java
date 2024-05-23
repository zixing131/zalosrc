package p115dy;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dy.t */
/* loaded from: classes4.dex */
public final class EnumC18118t {

    /* renamed from: p */
    public static final EnumC18118t f91727p = new EnumC18118t(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC18118t f91728q = new EnumC18118t("FULL", 1);

    /* renamed from: r */
    public static final EnumC18118t f91729r = new EnumC18118t("TEXT_ALIGNED", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC18118t[] f91730s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f91731t;

    static {
        EnumC18118t[] m96408b = m96408b();
        f91730s = m96408b;
        f91731t = AbstractC30166b.m148796a(m96408b);
    }

    private EnumC18118t(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18118t[] m96408b() {
        return new EnumC18118t[]{f91727p, f91728q, f91729r};
    }

    public static EnumC18118t valueOf(String str) {
        return (EnumC18118t) Enum.valueOf(EnumC18118t.class, str);
    }

    public static EnumC18118t[] values() {
        return (EnumC18118t[]) f91730s.clone();
    }
}
