package au;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: au.e0 */
/* loaded from: classes4.dex */
public final class EnumC2344e0 {

    /* renamed from: q */
    public static final EnumC2344e0 f9852q = new EnumC2344e0("MEDIA", 0, "MEDIA");

    /* renamed from: r */
    public static final EnumC2344e0 f9853r = new EnumC2344e0("LINK", 1, "LINK");

    /* renamed from: s */
    public static final EnumC2344e0 f9854s = new EnumC2344e0("FILE", 2, "FILE");

    /* renamed from: t */
    private static final /* synthetic */ EnumC2344e0[] f9855t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f9856u;

    /* renamed from: p */
    private final String f9857p;

    static {
        EnumC2344e0[] m12310b = m12310b();
        f9855t = m12310b;
        f9856u = AbstractC30166b.m148796a(m12310b);
    }

    private EnumC2344e0(String str, int i11, String str2) {
        this.f9857p = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2344e0[] m12310b() {
        return new EnumC2344e0[]{f9852q, f9853r, f9854s};
    }

    public static EnumC2344e0 valueOf(String str) {
        return (EnumC2344e0) Enum.valueOf(EnumC2344e0.class, str);
    }

    public static EnumC2344e0[] values() {
        return (EnumC2344e0[]) f9855t.clone();
    }

    /* renamed from: c */
    public final String m12311c() {
        return this.f9857p;
    }
}
