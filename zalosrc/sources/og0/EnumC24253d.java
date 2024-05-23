package og0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: og0.d */
/* loaded from: classes7.dex */
public final class EnumC24253d {

    /* renamed from: p */
    public static final EnumC24253d f117153p = new EnumC24253d("DEFAULT", 0);

    /* renamed from: q */
    public static final EnumC24253d f117154q = new EnumC24253d("OUT_CLOUD_FILE_SIZE", 1);

    /* renamed from: r */
    public static final EnumC24253d f117155r = new EnumC24253d("OUT_CLOUD_FULL_QUOTA", 2);

    /* renamed from: s */
    public static final EnumC24253d f117156s = new EnumC24253d("NON_CLOUD_DEFAULT", 3);

    /* renamed from: t */
    public static final EnumC24253d f117157t = new EnumC24253d("ROLLED", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC24253d[] f117158u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f117159v;

    static {
        EnumC24253d[] m126605b = m126605b();
        f117158u = m126605b;
        f117159v = AbstractC30166b.m148796a(m126605b);
    }

    private EnumC24253d(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24253d[] m126605b() {
        return new EnumC24253d[]{f117153p, f117154q, f117155r, f117156s, f117157t};
    }

    public static EnumC24253d valueOf(String str) {
        return (EnumC24253d) Enum.valueOf(EnumC24253d.class, str);
    }

    public static EnumC24253d[] values() {
        return (EnumC24253d[]) f117158u.clone();
    }
}
