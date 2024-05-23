package ug0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ug0.c */
/* loaded from: classes7.dex */
public final class EnumC27248c {

    /* renamed from: p */
    public static final EnumC27248c f128035p = new EnumC27248c("BatterLow", 0);

    /* renamed from: q */
    public static final EnumC27248c f128036q = new EnumC27248c("NetworkError", 1);

    /* renamed from: r */
    public static final EnumC27248c f128037r = new EnumC27248c("DriveProblem", 2);

    /* renamed from: s */
    public static final EnumC27248c f128038s = new EnumC27248c("StorageNotAvailable", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC27248c[] f128039t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f128040u;

    static {
        EnumC27248c[] m139398b = m139398b();
        f128039t = m139398b;
        f128040u = AbstractC30166b.m148796a(m139398b);
    }

    private EnumC27248c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27248c[] m139398b() {
        return new EnumC27248c[]{f128035p, f128036q, f128037r, f128038s};
    }

    public static EnumC27248c valueOf(String str) {
        return (EnumC27248c) Enum.valueOf(EnumC27248c.class, str);
    }

    public static EnumC27248c[] values() {
        return (EnumC27248c[]) f128039t.clone();
    }
}
