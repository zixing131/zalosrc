package p361nb;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: nb.k */
/* loaded from: classes3.dex */
public final class EnumC23654k {

    /* renamed from: q */
    public static final EnumC23654k f114595q = new EnumC23654k("LOCAL_DELETE", 0, 0);

    /* renamed from: r */
    public static final EnumC23654k f114596r = new EnumC23654k("UNDO", 1, 1);

    /* renamed from: s */
    public static final EnumC23654k f114597s = new EnumC23654k("DELETE_FOR_EVERYONE", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC23654k[] f114598t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f114599u;

    /* renamed from: p */
    private final int f114600p;

    static {
        EnumC23654k[] m123970b = m123970b();
        f114598t = m123970b;
        f114599u = AbstractC30166b.m148796a(m123970b);
    }

    private EnumC23654k(String str, int i11, int i12) {
        this.f114600p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23654k[] m123970b() {
        return new EnumC23654k[]{f114595q, f114596r, f114597s};
    }

    public static EnumC23654k valueOf(String str) {
        return (EnumC23654k) Enum.valueOf(EnumC23654k.class, str);
    }

    public static EnumC23654k[] values() {
        return (EnumC23654k[]) f114598t.clone();
    }

    /* renamed from: c */
    public final int m123971c() {
        return this.f114600p;
    }
}
