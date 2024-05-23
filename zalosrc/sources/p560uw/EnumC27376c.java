package p560uw;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uw.c */
/* loaded from: classes4.dex */
public final class EnumC27376c {

    /* renamed from: q */
    public static final EnumC27376c f128982q = new EnumC27376c("DEFAULT", 0, 0);

    /* renamed from: r */
    public static final EnumC27376c f128983r = new EnumC27376c("UPLOAD", 1, 1);

    /* renamed from: s */
    private static final /* synthetic */ EnumC27376c[] f128984s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f128985t;

    /* renamed from: p */
    private final int f128986p;

    static {
        EnumC27376c[] m140279b = m140279b();
        f128984s = m140279b;
        f128985t = AbstractC30166b.m148796a(m140279b);
    }

    private EnumC27376c(String str, int i11, int i12) {
        this.f128986p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27376c[] m140279b() {
        return new EnumC27376c[]{f128982q, f128983r};
    }

    public static EnumC27376c valueOf(String str) {
        return (EnumC27376c) Enum.valueOf(EnumC27376c.class, str);
    }

    public static EnumC27376c[] values() {
        return (EnumC27376c[]) f128984s.clone();
    }

    /* renamed from: c */
    public final int m140280c() {
        return this.f128986p;
    }
}
