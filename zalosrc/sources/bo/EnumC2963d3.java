package bo;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bo.d3 */
/* loaded from: classes4.dex */
public final class EnumC2963d3 {

    /* renamed from: p */
    public static final EnumC2963d3 f11681p = new EnumC2963d3("LOADING", 0);

    /* renamed from: q */
    public static final EnumC2963d3 f11682q = new EnumC2963d3("VALID", 1);

    /* renamed from: r */
    public static final EnumC2963d3 f11683r = new EnumC2963d3("ERROR", 2);

    /* renamed from: s */
    public static final EnumC2963d3 f11684s = new EnumC2963d3("ERROR_LOCATION_NOT_SUPPORTED", 3);

    /* renamed from: t */
    public static final EnumC2963d3 f11685t = new EnumC2963d3("ERROR_SONG_NOT_EXIST", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC2963d3[] f11686u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f11687v;

    static {
        EnumC2963d3[] m14026b = m14026b();
        f11686u = m14026b;
        f11687v = AbstractC30166b.m148796a(m14026b);
    }

    private EnumC2963d3(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2963d3[] m14026b() {
        return new EnumC2963d3[]{f11681p, f11682q, f11683r, f11684s, f11685t};
    }

    public static EnumC2963d3 valueOf(String str) {
        return (EnumC2963d3) Enum.valueOf(EnumC2963d3.class, str);
    }

    public static EnumC2963d3[] values() {
        return (EnumC2963d3[]) f11686u.clone();
    }
}
