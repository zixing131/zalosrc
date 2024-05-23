package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.x */
/* loaded from: classes4.dex */
public final class EnumC2380x {

    /* renamed from: p */
    public static final EnumC2380x f9933p = new EnumC2380x("MEDIA_ITEM_SIZE_SUPER_SMALL", 0);

    /* renamed from: q */
    public static final EnumC2380x f9934q = new EnumC2380x("MEDIA_ITEM_SIZE_SMALL", 1);

    /* renamed from: r */
    public static final EnumC2380x f9935r = new EnumC2380x("MEDIA_ITEM_SIZE_MEDIUM", 2);

    /* renamed from: s */
    public static final EnumC2380x f9936s = new EnumC2380x("MEDIA_ITEM_SIZE_LARGE", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC2380x[] f9937t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f9938u;

    static {
        EnumC2380x[] m12435b = m12435b();
        f9937t = m12435b;
        f9938u = AbstractC30166b.m148796a(m12435b);
    }

    private EnumC2380x(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2380x[] m12435b() {
        return new EnumC2380x[]{f9933p, f9934q, f9935r, f9936s};
    }

    public static EnumC2380x valueOf(String str) {
        return (EnumC2380x) Enum.valueOf(EnumC2380x.class, str);
    }

    public static EnumC2380x[] values() {
        return (EnumC2380x[]) f9937t.clone();
    }
}
