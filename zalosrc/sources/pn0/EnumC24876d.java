package pn0;

import java.util.concurrent.TimeUnit;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pn0.d */
/* loaded from: classes7.dex */
public final class EnumC24876d {

    /* renamed from: q */
    public static final EnumC24876d f119364q = new EnumC24876d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: r */
    public static final EnumC24876d f119365r = new EnumC24876d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: s */
    public static final EnumC24876d f119366s = new EnumC24876d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: t */
    public static final EnumC24876d f119367t = new EnumC24876d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: u */
    public static final EnumC24876d f119368u = new EnumC24876d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: v */
    public static final EnumC24876d f119369v = new EnumC24876d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: w */
    public static final EnumC24876d f119370w = new EnumC24876d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: x */
    private static final /* synthetic */ EnumC24876d[] f119371x;

    /* renamed from: y */
    private static final /* synthetic */ InterfaceC30165a f119372y;

    /* renamed from: p */
    private final TimeUnit f119373p;

    static {
        EnumC24876d[] m129365b = m129365b();
        f119371x = m129365b;
        f119372y = AbstractC30166b.m148796a(m129365b);
    }

    private EnumC24876d(String str, int i11, TimeUnit timeUnit) {
        this.f119373p = timeUnit;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24876d[] m129365b() {
        return new EnumC24876d[]{f119364q, f119365r, f119366s, f119367t, f119368u, f119369v, f119370w};
    }

    public static EnumC24876d valueOf(String str) {
        return (EnumC24876d) Enum.valueOf(EnumC24876d.class, str);
    }

    public static EnumC24876d[] values() {
        return (EnumC24876d[]) f119371x.clone();
    }

    /* renamed from: c */
    public final TimeUnit m129366c() {
        return this.f119373p;
    }
}
