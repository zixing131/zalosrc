package p386ob;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ob.a */
/* loaded from: classes3.dex */
public final class EnumC24190a {

    /* renamed from: q */
    public static final EnumC24190a f116750q = new EnumC24190a("PHOTO", 0, 0);

    /* renamed from: r */
    public static final EnumC24190a f116751r = new EnumC24190a("PHOTO_HD", 1, 1);

    /* renamed from: s */
    public static final EnumC24190a f116752s = new EnumC24190a("VIDEO", 2, 2);

    /* renamed from: t */
    public static final EnumC24190a f116753t = new EnumC24190a("VIDEO_HD", 3, 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC24190a[] f116754u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f116755v;

    /* renamed from: p */
    private final int f116756p;

    static {
        EnumC24190a[] m126128b = m126128b();
        f116754u = m126128b;
        f116755v = AbstractC30166b.m148796a(m126128b);
    }

    private EnumC24190a(String str, int i11, int i12) {
        this.f116756p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24190a[] m126128b() {
        return new EnumC24190a[]{f116750q, f116751r, f116752s, f116753t};
    }

    public static EnumC24190a valueOf(String str) {
        return (EnumC24190a) Enum.valueOf(EnumC24190a.class, str);
    }

    public static EnumC24190a[] values() {
        return (EnumC24190a[]) f116754u.clone();
    }

    /* renamed from: c */
    public final int m126129c() {
        return this.f116756p;
    }
}
