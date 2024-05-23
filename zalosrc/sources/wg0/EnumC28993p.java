package wg0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: wg0.p */
/* loaded from: classes7.dex */
public final class EnumC28993p extends Enum {

    /* renamed from: p */
    public static final EnumC28993p f134266p = new EnumC28993p("BatteryLow", 0);

    /* renamed from: q */
    public static final EnumC28993p f134267q = new EnumC28993p("NetworkError", 1);

    /* renamed from: r */
    public static final EnumC28993p f134268r = new EnumC28993p("DriveProblem", 2);

    /* renamed from: s */
    public static final EnumC28993p f134269s = new EnumC28993p("RestoreProblem", 3);

    /* renamed from: t */
    public static final EnumC28993p f134270t = new EnumC28993p("CorruptedRestoreData", 4);

    /* renamed from: u */
    public static final EnumC28993p f134271u = new EnumC28993p("StorageNotAvailable", 5);

    /* renamed from: v */
    private static final /* synthetic */ EnumC28993p[] f134272v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f134273w;

    static {
        EnumC28993p[] m144864b = m144864b();
        f134272v = m144864b;
        f134273w = AbstractC30166b.m148796a(m144864b);
    }

    private EnumC28993p(String str, int i11) {
        super(str, i11);
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC28993p[] m144864b() {
        return new EnumC28993p[]{f134266p, f134267q, f134268r, f134269s, f134270t, f134271u};
    }

    public static EnumC28993p valueOf(String str) {
        return (EnumC28993p) Enum.valueOf(EnumC28993p.class, str);
    }

    public static EnumC28993p[] values() {
        return (EnumC28993p[]) f134272v.clone();
    }
}
