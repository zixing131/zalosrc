package uf0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: uf0.a */
/* loaded from: classes5.dex */
public final class EnumC27244a {

    /* renamed from: q */
    public static final EnumC27244a f128026q = new EnumC27244a("SHOW", 0, "back");

    /* renamed from: r */
    public static final EnumC27244a f128027r = new EnumC27244a("HIDE", 1, "none");

    /* renamed from: s */
    private static final /* synthetic */ EnumC27244a[] f128028s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f128029t;

    /* renamed from: p */
    private final String f128030p;

    static {
        EnumC27244a[] m139383b = m139383b();
        f128028s = m139383b;
        f128029t = AbstractC30166b.m148796a(m139383b);
    }

    private EnumC27244a(String str, int i11, String str2) {
        this.f128030p = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27244a[] m139383b() {
        return new EnumC27244a[]{f128026q, f128027r};
    }

    public static EnumC27244a valueOf(String str) {
        return (EnumC27244a) Enum.valueOf(EnumC27244a.class, str);
    }

    public static EnumC27244a[] values() {
        return (EnumC27244a[]) f128028s.clone();
    }

    /* renamed from: c */
    public final String m139384c() {
        return this.f128030p;
    }
}
