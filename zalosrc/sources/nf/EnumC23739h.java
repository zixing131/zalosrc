package nf;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: nf.h */
/* loaded from: classes3.dex */
public final class EnumC23739h {

    /* renamed from: p */
    public static final EnumC23739h f114838p = new EnumC23739h("COMPACT", 0);

    /* renamed from: q */
    public static final EnumC23739h f114839q = new EnumC23739h("MEDIUM", 1);

    /* renamed from: r */
    public static final EnumC23739h f114840r = new EnumC23739h("EXPANDED", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC23739h[] f114841s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f114842t;

    static {
        EnumC23739h[] m124103b = m124103b();
        f114841s = m124103b;
        f114842t = AbstractC30166b.m148796a(m124103b);
    }

    private EnumC23739h(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23739h[] m124103b() {
        return new EnumC23739h[]{f114838p, f114839q, f114840r};
    }

    public static EnumC23739h valueOf(String str) {
        return (EnumC23739h) Enum.valueOf(EnumC23739h.class, str);
    }

    public static EnumC23739h[] values() {
        return (EnumC23739h[]) f114841s.clone();
    }
}
