package w30;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w30.h */
/* loaded from: classes5.dex */
public final class EnumC28720h {

    /* renamed from: p */
    public static final EnumC28720h f133236p = new EnumC28720h("PROCESSING", 0);

    /* renamed from: q */
    public static final EnumC28720h f133237q = new EnumC28720h("PLAYING", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC28720h[] f133238r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f133239s;

    static {
        EnumC28720h[] m143847b = m143847b();
        f133238r = m143847b;
        f133239s = AbstractC30166b.m148796a(m143847b);
    }

    private EnumC28720h(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC28720h[] m143847b() {
        return new EnumC28720h[]{f133236p, f133237q};
    }

    public static EnumC28720h valueOf(String str) {
        return (EnumC28720h) Enum.valueOf(EnumC28720h.class, str);
    }

    public static EnumC28720h[] values() {
        return (EnumC28720h[]) f133238r.clone();
    }
}
