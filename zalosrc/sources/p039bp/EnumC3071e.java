package p039bp;

import p723zo.InterfaceC32525d;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bp.e */
/* loaded from: classes4.dex */
public final class EnumC3071e implements InterfaceC32525d {

    /* renamed from: p */
    public static final EnumC3071e f12475p = new EnumC3071e("ON_MOVE_USER_TO_DIFFERENT_TAB", 0);

    /* renamed from: q */
    private static final /* synthetic */ EnumC3071e[] f12476q;

    /* renamed from: r */
    private static final /* synthetic */ InterfaceC30165a f12477r;

    static {
        EnumC3071e[] m14799b = m14799b();
        f12476q = m14799b;
        f12477r = AbstractC30166b.m148796a(m14799b);
    }

    private EnumC3071e(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3071e[] m14799b() {
        return new EnumC3071e[]{f12475p};
    }

    public static EnumC3071e valueOf(String str) {
        return (EnumC3071e) Enum.valueOf(EnumC3071e.class, str);
    }

    public static EnumC3071e[] values() {
        return (EnumC3071e[]) f12476q.clone();
    }
}
