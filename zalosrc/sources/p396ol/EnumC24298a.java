package p396ol;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ol.a */
/* loaded from: classes3.dex */
public final class EnumC24298a {

    /* renamed from: p */
    public static final EnumC24298a f117297p = new EnumC24298a("ZCLOUD_HOME_GRID", 0);

    /* renamed from: q */
    public static final EnumC24298a f117298q = new EnumC24298a("VIEWFULL", 1);

    /* renamed from: r */
    public static final EnumC24298a f117299r = new EnumC24298a("MEDIA_STORE", 2);

    /* renamed from: s */
    public static final EnumC24298a f117300s = new EnumC24298a("CSC", 3);

    /* renamed from: t */
    public static final EnumC24298a f117301t = new EnumC24298a("AUDITOR", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC24298a[] f117302u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f117303v;

    static {
        EnumC24298a[] m126840b = m126840b();
        f117302u = m126840b;
        f117303v = AbstractC30166b.m148796a(m126840b);
    }

    private EnumC24298a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24298a[] m126840b() {
        return new EnumC24298a[]{f117297p, f117298q, f117299r, f117300s, f117301t};
    }

    public static EnumC24298a valueOf(String str) {
        return (EnumC24298a) Enum.valueOf(EnumC24298a.class, str);
    }

    public static EnumC24298a[] values() {
        return (EnumC24298a[]) f117302u.clone();
    }
}
