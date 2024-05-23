package e10;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e10.i */
/* loaded from: classes5.dex */
public final class EnumC18172i {

    /* renamed from: p */
    public static final EnumC18172i f92266p = new EnumC18172i("NEW", 0);

    /* renamed from: q */
    public static final EnumC18172i f92267q = new EnumC18172i("ENCODED", 1);

    /* renamed from: r */
    public static final EnumC18172i f92268r = new EnumC18172i("UPLOADED", 2);

    /* renamed from: s */
    public static final EnumC18172i f92269s = new EnumC18172i("SUCCESS", 3);

    /* renamed from: t */
    public static final EnumC18172i f92270t = new EnumC18172i("FAIL", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC18172i[] f92271u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f92272v;

    static {
        EnumC18172i[] m96844b = m96844b();
        f92271u = m96844b;
        f92272v = AbstractC30166b.m148796a(m96844b);
    }

    private EnumC18172i(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18172i[] m96844b() {
        return new EnumC18172i[]{f92266p, f92267q, f92268r, f92269s, f92270t};
    }

    public static EnumC18172i valueOf(String str) {
        return (EnumC18172i) Enum.valueOf(EnumC18172i.class, str);
    }

    public static EnumC18172i[] values() {
        return (EnumC18172i[]) f92271u.clone();
    }
}
