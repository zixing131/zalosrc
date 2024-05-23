package ki;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ki.b */
/* loaded from: classes.dex */
public final class EnumC21730b {

    /* renamed from: p */
    public static final EnumC21730b f105515p = new EnumC21730b("SILENT", 0);

    /* renamed from: q */
    public static final EnumC21730b f105516q = new EnumC21730b("TOAST", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC21730b[] f105517r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f105518s;

    static {
        EnumC21730b[] m112152b = m112152b();
        f105517r = m112152b;
        f105518s = AbstractC30166b.m148796a(m112152b);
    }

    private EnumC21730b(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC21730b[] m112152b() {
        return new EnumC21730b[]{f105515p, f105516q};
    }

    public static EnumC21730b valueOf(String str) {
        return (EnumC21730b) Enum.valueOf(EnumC21730b.class, str);
    }

    public static EnumC21730b[] values() {
        return (EnumC21730b[]) f105517r.clone();
    }
}
