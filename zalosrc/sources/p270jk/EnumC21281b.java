package p270jk;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jk.b */
/* loaded from: classes3.dex */
public final class EnumC21281b {

    /* renamed from: q */
    public static final EnumC21281b f103710q = new EnumC21281b("UNKNOWN", 0, -1);

    /* renamed from: r */
    public static final EnumC21281b f103711r = new EnumC21281b("FULL_GRID", 1, 0);

    /* renamed from: s */
    public static final EnumC21281b f103712s = new EnumC21281b("MINI_GRID", 2, 1);

    /* renamed from: t */
    public static final EnumC21281b f103713t = new EnumC21281b("VIEW_FULL", 3, 2);

    /* renamed from: u */
    public static final EnumC21281b f103714u = new EnumC21281b("CAMERA", 4, 3);

    /* renamed from: v */
    private static final /* synthetic */ EnumC21281b[] f103715v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f103716w;

    /* renamed from: p */
    private final int f103717p;

    static {
        EnumC21281b[] m110228b = m110228b();
        f103715v = m110228b;
        f103716w = AbstractC30166b.m148796a(m110228b);
    }

    private EnumC21281b(String str, int i11, int i12) {
        this.f103717p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC21281b[] m110228b() {
        return new EnumC21281b[]{f103710q, f103711r, f103712s, f103713t, f103714u};
    }

    public static EnumC21281b valueOf(String str) {
        return (EnumC21281b) Enum.valueOf(EnumC21281b.class, str);
    }

    public static EnumC21281b[] values() {
        return (EnumC21281b[]) f103715v.clone();
    }

    /* renamed from: c */
    public final int m110229c() {
        return this.f103717p;
    }
}
