package bo;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bo.x2 */
/* loaded from: classes4.dex */
public final class EnumC3057x2 {

    /* renamed from: p */
    public static final EnumC3057x2 f12359p = new EnumC3057x2("PLAY", 0);

    /* renamed from: q */
    public static final EnumC3057x2 f12360q = new EnumC3057x2("PAUSE", 1);

    /* renamed from: r */
    public static final EnumC3057x2 f12361r = new EnumC3057x2("PREPARING_PLAY", 2);

    /* renamed from: s */
    public static final EnumC3057x2 f12362s = new EnumC3057x2("PREPARING_PAUSE", 3);

    /* renamed from: t */
    public static final EnumC3057x2 f12363t = new EnumC3057x2("INIT_PLAYING", 4);

    /* renamed from: u */
    public static final EnumC3057x2 f12364u = new EnumC3057x2("INIT_PAUSING", 5);

    /* renamed from: v */
    private static final /* synthetic */ EnumC3057x2[] f12365v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f12366w;

    static {
        EnumC3057x2[] m14705b = m14705b();
        f12365v = m14705b;
        f12366w = AbstractC30166b.m148796a(m14705b);
    }

    private EnumC3057x2(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3057x2[] m14705b() {
        return new EnumC3057x2[]{f12359p, f12360q, f12361r, f12362s, f12363t, f12364u};
    }

    public static EnumC3057x2 valueOf(String str) {
        return (EnumC3057x2) Enum.valueOf(EnumC3057x2.class, str);
    }

    public static EnumC3057x2[] values() {
        return (EnumC3057x2[]) f12365v.clone();
    }
}
