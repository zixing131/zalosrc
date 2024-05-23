package ug0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ug0.d */
/* loaded from: classes7.dex */
public final class EnumC27249d {

    /* renamed from: p */
    public static final EnumC27249d f128041p = new EnumC27249d("Analyzing", 0);

    /* renamed from: q */
    public static final EnumC27249d f128042q = new EnumC27249d("UploadingLocalItems", 1);

    /* renamed from: r */
    public static final EnumC27249d f128043r = new EnumC27249d("UploadingServerItems", 2);

    /* renamed from: s */
    public static final EnumC27249d f128044s = new EnumC27249d("UploadingBackupItems", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC27249d[] f128045t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f128046u;

    static {
        EnumC27249d[] m139399b = m139399b();
        f128045t = m139399b;
        f128046u = AbstractC30166b.m148796a(m139399b);
    }

    private EnumC27249d(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27249d[] m139399b() {
        return new EnumC27249d[]{f128041p, f128042q, f128043r, f128044s};
    }

    public static EnumC27249d valueOf(String str) {
        return (EnumC27249d) Enum.valueOf(EnumC27249d.class, str);
    }

    public static EnumC27249d[] values() {
        return (EnumC27249d[]) f128045t.clone();
    }
}
