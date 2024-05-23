package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.d */
/* loaded from: classes4.dex */
public final class EnumC2341d {

    /* renamed from: q */
    public static final EnumC2341d f9839q = new EnumC2341d("ALBUM_FOOTER_ACTION_UNKNOWN", 0, 0);

    /* renamed from: r */
    public static final EnumC2341d f9840r = new EnumC2341d("ALBUM_FOOTER_ACTION_SEND_VIDEO", 1, 4);

    /* renamed from: s */
    private static final /* synthetic */ EnumC2341d[] f9841s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f9842t;

    /* renamed from: p */
    private final int f9843p;

    static {
        EnumC2341d[] m12304b = m12304b();
        f9841s = m12304b;
        f9842t = AbstractC30166b.m148796a(m12304b);
    }

    private EnumC2341d(String str, int i11, int i12) {
        this.f9843p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2341d[] m12304b() {
        return new EnumC2341d[]{f9839q, f9840r};
    }

    public static EnumC2341d valueOf(String str) {
        return (EnumC2341d) Enum.valueOf(EnumC2341d.class, str);
    }

    public static EnumC2341d[] values() {
        return (EnumC2341d[]) f9841s.clone();
    }
}
