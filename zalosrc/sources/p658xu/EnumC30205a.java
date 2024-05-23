package p658xu;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xu.a */
/* loaded from: classes4.dex */
public final class EnumC30205a {

    /* renamed from: q */
    public static final EnumC30205a f140320q = new EnumC30205a("MA_LOCAL_FILE_STORAGE", 0, 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC30205a[] f140321r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f140322s;

    /* renamed from: p */
    private final int f140323p;

    static {
        EnumC30205a[] m148967b = m148967b();
        f140321r = m148967b;
        f140322s = AbstractC30166b.m148796a(m148967b);
    }

    private EnumC30205a(String str, int i11, int i12) {
        this.f140323p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30205a[] m148967b() {
        return new EnumC30205a[]{f140320q};
    }

    public static EnumC30205a valueOf(String str) {
        return (EnumC30205a) Enum.valueOf(EnumC30205a.class, str);
    }

    public static EnumC30205a[] values() {
        return (EnumC30205a[]) f140321r.clone();
    }

    /* renamed from: c */
    public final int m148968c() {
        return this.f140323p;
    }
}
