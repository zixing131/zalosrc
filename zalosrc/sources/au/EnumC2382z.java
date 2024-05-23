package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.z */
/* loaded from: classes4.dex */
public final class EnumC2382z {

    /* renamed from: q */
    public static final EnumC2382z f9944q = new EnumC2382z("MEDIA_STORE_TYPE_UNSPECIFIED", 0, 0);

    /* renamed from: r */
    public static final EnumC2382z f9945r = new EnumC2382z("MEDIA_STORE_TYPE_MEDIA", 1, 1);

    /* renamed from: s */
    public static final EnumC2382z f9946s = new EnumC2382z("MEDIA_STORE_TYPE_LINK", 2, 5);

    /* renamed from: t */
    public static final EnumC2382z f9947t = new EnumC2382z("MEDIA_STORE_TYPE_FILE", 3, 2);

    /* renamed from: u */
    public static final EnumC2382z f9948u = new EnumC2382z("MEDIA_STORE_TYPE_COLLECTION", 4, 6);

    /* renamed from: v */
    private static final /* synthetic */ EnumC2382z[] f9949v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f9950w;

    /* renamed from: p */
    private final int f9951p;

    static {
        EnumC2382z[] m12437b = m12437b();
        f9949v = m12437b;
        f9950w = AbstractC30166b.m148796a(m12437b);
    }

    private EnumC2382z(String str, int i11, int i12) {
        this.f9951p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2382z[] m12437b() {
        return new EnumC2382z[]{f9944q, f9945r, f9946s, f9947t, f9948u};
    }

    public static EnumC2382z valueOf(String str) {
        return (EnumC2382z) Enum.valueOf(EnumC2382z.class, str);
    }

    public static EnumC2382z[] values() {
        return (EnumC2382z[]) f9949v.clone();
    }

    /* renamed from: c */
    public final int m12438c() {
        return this.f9951p;
    }
}
