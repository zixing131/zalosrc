package qd0;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qd0.h */
/* loaded from: classes4.dex */
public final class EnumC25241h {

    /* renamed from: p */
    public static final EnumC25241h f121059p = new EnumC25241h(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC25241h f121060q = new EnumC25241h("UPLOADING", 1);

    /* renamed from: r */
    public static final EnumC25241h f121061r = new EnumC25241h("UPLOADED", 2);

    /* renamed from: s */
    public static final EnumC25241h f121062s = new EnumC25241h("ERROR", 3);

    /* renamed from: t */
    public static final EnumC25241h f121063t = new EnumC25241h("CANCEL", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC25241h[] f121064u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f121065v;

    static {
        EnumC25241h[] m130610b = m130610b();
        f121064u = m130610b;
        f121065v = AbstractC30166b.m148796a(m130610b);
    }

    private EnumC25241h(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25241h[] m130610b() {
        return new EnumC25241h[]{f121059p, f121060q, f121061r, f121062s, f121063t};
    }

    public static EnumC25241h valueOf(String str) {
        return (EnumC25241h) Enum.valueOf(EnumC25241h.class, str);
    }

    public static EnumC25241h[] values() {
        return (EnumC25241h[]) f121064u.clone();
    }
}
