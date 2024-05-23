package p10;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p10.e */
/* loaded from: classes5.dex */
public final class EnumC24601e {

    /* renamed from: q */
    public static final EnumC24601e f118372q = new EnumC24601e("UNKNOWN", 0, 0);

    /* renamed from: r */
    public static final EnumC24601e f118373r = new EnumC24601e("STREAMING", 1, 1);

    /* renamed from: s */
    public static final EnumC24601e f118374s = new EnumC24601e("CLOSED", 2, 2);

    /* renamed from: t */
    public static final EnumC24601e f118375t = new EnumC24601e("SCHEDULED_READY", 3, 3);

    /* renamed from: u */
    public static final EnumC24601e f118376u = new EnumC24601e("PAUSE", 4, 4);

    /* renamed from: v */
    public static final EnumC24601e f118377v = new EnumC24601e("NO_SIGNAL", 5, 5);

    /* renamed from: w */
    private static final /* synthetic */ EnumC24601e[] f118378w;

    /* renamed from: x */
    private static final /* synthetic */ InterfaceC30165a f118379x;

    /* renamed from: p */
    private final int f118380p;

    static {
        EnumC24601e[] m128089b = m128089b();
        f118378w = m128089b;
        f118379x = AbstractC30166b.m148796a(m128089b);
    }

    private EnumC24601e(String str, int i11, int i12) {
        this.f118380p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24601e[] m128089b() {
        return new EnumC24601e[]{f118372q, f118373r, f118374s, f118375t, f118376u, f118377v};
    }

    public static EnumC24601e valueOf(String str) {
        return (EnumC24601e) Enum.valueOf(EnumC24601e.class, str);
    }

    public static EnumC24601e[] values() {
        return (EnumC24601e[]) f118378w.clone();
    }

    /* renamed from: c */
    public final int m128090c() {
        return this.f118380p;
    }
}
