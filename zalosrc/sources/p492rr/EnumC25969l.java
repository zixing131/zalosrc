package p492rr;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rr.l */
/* loaded from: classes4.dex */
public final class EnumC25969l {

    /* renamed from: p */
    public static final EnumC25969l f123900p = new EnumC25969l("MODE_OPTIONS", 0);

    /* renamed from: q */
    public static final EnumC25969l f123901q = new EnumC25969l("MODE_DATE_PICKER", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC25969l[] f123902r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f123903s;

    static {
        EnumC25969l[] m133750b = m133750b();
        f123902r = m133750b;
        f123903s = AbstractC30166b.m148796a(m133750b);
    }

    private EnumC25969l(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25969l[] m133750b() {
        return new EnumC25969l[]{f123900p, f123901q};
    }

    public static EnumC25969l valueOf(String str) {
        return (EnumC25969l) Enum.valueOf(EnumC25969l.class, str);
    }

    public static EnumC25969l[] values() {
        return (EnumC25969l[]) f123902r.clone();
    }
}
