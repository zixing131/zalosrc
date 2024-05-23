package p691yr;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yr.a */
/* loaded from: classes4.dex */
public final class EnumC31051a {

    /* renamed from: p */
    public static final EnumC31051a f143176p = new EnumC31051a("VALID", 0);

    /* renamed from: q */
    public static final EnumC31051a f143177q = new EnumC31051a("ERROR_OFF_FEATURE", 1);

    /* renamed from: r */
    public static final EnumC31051a f143178r = new EnumC31051a("ERROR_FEED_NOT_SUPPORTED", 2);

    /* renamed from: s */
    public static final EnumC31051a f143179s = new EnumC31051a("ERROR_EMOJI_INVALID", 3);

    /* renamed from: t */
    public static final EnumC31051a f143180t = new EnumC31051a("ERROR_UNKNOWN", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC31051a[] f143181u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f143182v;

    static {
        EnumC31051a[] m150887b = m150887b();
        f143181u = m150887b;
        f143182v = AbstractC30166b.m148796a(m150887b);
    }

    private EnumC31051a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31051a[] m150887b() {
        return new EnumC31051a[]{f143176p, f143177q, f143178r, f143179s, f143180t};
    }

    public static EnumC31051a valueOf(String str) {
        return (EnumC31051a) Enum.valueOf(EnumC31051a.class, str);
    }

    public static EnumC31051a[] values() {
        return (EnumC31051a[]) f143181u.clone();
    }
}
