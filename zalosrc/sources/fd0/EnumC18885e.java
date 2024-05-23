package fd0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fd0.e */
/* loaded from: classes4.dex */
public final class EnumC18885e {

    /* renamed from: p */
    public static final EnumC18885e f94266p = new EnumC18885e("RECORDING", 0);

    /* renamed from: q */
    public static final EnumC18885e f94267q = new EnumC18885e("PREVIEW", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC18885e[] f94268r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f94269s;

    static {
        EnumC18885e[] m99016b = m99016b();
        f94268r = m99016b;
        f94269s = AbstractC30166b.m148796a(m99016b);
    }

    private EnumC18885e(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18885e[] m99016b() {
        return new EnumC18885e[]{f94266p, f94267q};
    }

    public static EnumC18885e valueOf(String str) {
        return (EnumC18885e) Enum.valueOf(EnumC18885e.class, str);
    }

    public static EnumC18885e[] values() {
        return (EnumC18885e[]) f94268r.clone();
    }
}
