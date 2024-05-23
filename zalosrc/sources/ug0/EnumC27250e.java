package ug0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ug0.e */
/* loaded from: classes7.dex */
public final class EnumC27250e {

    /* renamed from: p */
    public static final EnumC27250e f128047p = new EnumC27250e("UploadingLocalItems", 0);

    /* renamed from: q */
    public static final EnumC27250e f128048q = new EnumC27250e("UploadingServerItems", 1);

    /* renamed from: r */
    public static final EnumC27250e f128049r = new EnumC27250e("UploadingBackupItems", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC27250e[] f128050s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f128051t;

    static {
        EnumC27250e[] m139400b = m139400b();
        f128050s = m139400b;
        f128051t = AbstractC30166b.m148796a(m139400b);
    }

    private EnumC27250e(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27250e[] m139400b() {
        return new EnumC27250e[]{f128047p, f128048q, f128049r};
    }

    public static EnumC27250e valueOf(String str) {
        return (EnumC27250e) Enum.valueOf(EnumC27250e.class, str);
    }

    public static EnumC27250e[] values() {
        return (EnumC27250e[]) f128050s.clone();
    }
}
