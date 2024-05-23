package mg0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mg0.a */
/* loaded from: classes7.dex */
public final class EnumC23289a {

    /* renamed from: p */
    public static final EnumC23289a f113039p = new EnumC23289a("DRIVE_FULL_STORAGE", 0);

    /* renamed from: q */
    public static final EnumC23289a f113040q = new EnumC23289a("TOKEN_INVALID", 1);

    /* renamed from: r */
    public static final EnumC23289a f113041r = new EnumC23289a("UNKNOWN", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC23289a[] f113042s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f113043t;

    static {
        EnumC23289a[] m120393b = m120393b();
        f113042s = m120393b;
        f113043t = AbstractC30166b.m148796a(m120393b);
    }

    private EnumC23289a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23289a[] m120393b() {
        return new EnumC23289a[]{f113039p, f113040q, f113041r};
    }

    public static EnumC23289a valueOf(String str) {
        return (EnumC23289a) Enum.valueOf(EnumC23289a.class, str);
    }

    public static EnumC23289a[] values() {
        return (EnumC23289a[]) f113042s.clone();
    }
}
