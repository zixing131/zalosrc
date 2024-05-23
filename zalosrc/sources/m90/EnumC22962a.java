package m90;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m90.a */
/* loaded from: classes6.dex */
public final class EnumC22962a {

    /* renamed from: q */
    public static final EnumC22962a f111693q = new EnumC22962a("POST", 0, 1);

    /* renamed from: r */
    public static final EnumC22962a f111694r = new EnumC22962a("CHAT", 1, 2);

    /* renamed from: s */
    public static final EnumC22962a f111695s = new EnumC22962a("SHARE", 2, 3);

    /* renamed from: t */
    public static final EnumC22962a f111696t = new EnumC22962a("STORY", 3, 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC22962a[] f111697u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f111698v;

    /* renamed from: p */
    private final int f111699p;

    static {
        EnumC22962a[] m117712b = m117712b();
        f111697u = m117712b;
        f111698v = AbstractC30166b.m148796a(m117712b);
    }

    private EnumC22962a(String str, int i11, int i12) {
        this.f111699p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC22962a[] m117712b() {
        return new EnumC22962a[]{f111693q, f111694r, f111695s, f111696t};
    }

    public static EnumC22962a valueOf(String str) {
        return (EnumC22962a) Enum.valueOf(EnumC22962a.class, str);
    }

    public static EnumC22962a[] values() {
        return (EnumC22962a[]) f111697u.clone();
    }
}
