package fd0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fd0.a */
/* loaded from: classes4.dex */
public final class EnumC18881a {

    /* renamed from: q */
    public static final EnumC18881a f94254q = new EnumC18881a("UNKNOWN", 0, -1);

    /* renamed from: r */
    public static final EnumC18881a f94255r = new EnumC18881a("CANCEL", 1, 0);

    /* renamed from: s */
    public static final EnumC18881a f94256s = new EnumC18881a("CLEAR_TEXT", 2, 1);

    /* renamed from: t */
    public static final EnumC18881a f94257t = new EnumC18881a("KILL_CSC", 3, 2);

    /* renamed from: u */
    private static final /* synthetic */ EnumC18881a[] f94258u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f94259v;

    /* renamed from: p */
    private final int f94260p;

    static {
        EnumC18881a[] m99000b = m99000b();
        f94258u = m99000b;
        f94259v = AbstractC30166b.m148796a(m99000b);
    }

    private EnumC18881a(String str, int i11, int i12) {
        this.f94260p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18881a[] m99000b() {
        return new EnumC18881a[]{f94254q, f94255r, f94256s, f94257t};
    }

    public static EnumC18881a valueOf(String str) {
        return (EnumC18881a) Enum.valueOf(EnumC18881a.class, str);
    }

    public static EnumC18881a[] values() {
        return (EnumC18881a[]) f94258u.clone();
    }

    /* renamed from: c */
    public final int m99001c() {
        return this.f94260p;
    }
}
