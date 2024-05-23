package c50;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c50.c */
/* loaded from: classes5.dex */
public final class EnumC3292c {

    /* renamed from: p */
    public static final EnumC3292c f14089p = new EnumC3292c("BASE_64", 0);

    /* renamed from: q */
    private static final /* synthetic */ EnumC3292c[] f14090q;

    /* renamed from: r */
    private static final /* synthetic */ InterfaceC30165a f14091r;

    static {
        EnumC3292c[] m16711b = m16711b();
        f14090q = m16711b;
        f14091r = AbstractC30166b.m148796a(m16711b);
    }

    private EnumC3292c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3292c[] m16711b() {
        return new EnumC3292c[]{f14089p};
    }

    public static EnumC3292c valueOf(String str) {
        return (EnumC3292c) Enum.valueOf(EnumC3292c.class, str);
    }

    public static EnumC3292c[] values() {
        return (EnumC3292c[]) f14090q.clone();
    }
}
