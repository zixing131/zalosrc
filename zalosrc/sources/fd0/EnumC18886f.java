package fd0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fd0.f */
/* loaded from: classes4.dex */
public final class EnumC18886f {

    /* renamed from: p */
    public static final EnumC18886f f94270p = new EnumC18886f("DEFAULT", 0);

    /* renamed from: q */
    public static final EnumC18886f f94271q = new EnumC18886f("CANCEL", 1);

    /* renamed from: r */
    public static final EnumC18886f f94272r = new EnumC18886f("ERROR", 2);

    /* renamed from: s */
    public static final EnumC18886f f94273s = new EnumC18886f("TIMEOUT", 3);

    /* renamed from: t */
    public static final EnumC18886f f94274t = new EnumC18886f("OTHER_INPUT_MODE_INTERRUPT", 4);

    /* renamed from: u */
    public static final EnumC18886f f94275u = new EnumC18886f("SEND_BUTTON", 5);

    /* renamed from: v */
    public static final EnumC18886f f94276v = new EnumC18886f("INTERCEPT_LAYOUT", 6);

    /* renamed from: w */
    private static final /* synthetic */ EnumC18886f[] f94277w;

    /* renamed from: x */
    private static final /* synthetic */ InterfaceC30165a f94278x;

    static {
        EnumC18886f[] m99017b = m99017b();
        f94277w = m99017b;
        f94278x = AbstractC30166b.m148796a(m99017b);
    }

    private EnumC18886f(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18886f[] m99017b() {
        return new EnumC18886f[]{f94270p, f94271q, f94272r, f94273s, f94274t, f94275u, f94276v};
    }

    public static EnumC18886f valueOf(String str) {
        return (EnumC18886f) Enum.valueOf(EnumC18886f.class, str);
    }

    public static EnumC18886f[] values() {
        return (EnumC18886f[]) f94277w.clone();
    }
}
