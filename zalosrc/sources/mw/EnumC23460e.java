package mw;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mw.e */
/* loaded from: classes4.dex */
public final class EnumC23460e {

    /* renamed from: q */
    public static final EnumC23460e f113955q = new EnumC23460e("ALL", 0, "ALL");

    /* renamed from: r */
    public static final EnumC23460e f113956r = new EnumC23460e("TEXT", 1, "TEXT");

    /* renamed from: s */
    public static final EnumC23460e f113957s = new EnumC23460e("MEDIA", 2, "MEDIA");

    /* renamed from: t */
    public static final EnumC23460e f113958t = new EnumC23460e("FILE", 3, "FILE");

    /* renamed from: u */
    public static final EnumC23460e f113959u = new EnumC23460e("LINK", 4, "LINK");

    /* renamed from: v */
    private static final /* synthetic */ EnumC23460e[] f113960v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f113961w;

    /* renamed from: p */
    private final String f113962p;

    static {
        EnumC23460e[] m123171b = m123171b();
        f113960v = m123171b;
        f113961w = AbstractC30166b.m148796a(m123171b);
    }

    private EnumC23460e(String str, int i11, String str2) {
        this.f113962p = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23460e[] m123171b() {
        return new EnumC23460e[]{f113955q, f113956r, f113957s, f113958t, f113959u};
    }

    public static EnumC23460e valueOf(String str) {
        return (EnumC23460e) Enum.valueOf(EnumC23460e.class, str);
    }

    public static EnumC23460e[] values() {
        return (EnumC23460e[]) f113960v.clone();
    }

    /* renamed from: c */
    public final String m123172c() {
        return this.f113962p;
    }
}
