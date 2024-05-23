package mo0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: mo0.c */
/* loaded from: classes7.dex */
public final class EnumC23412c extends Enum {

    /* renamed from: p */
    public static final EnumC23412c f113760p = new EnumC23412c("OFF", 0);

    /* renamed from: q */
    public static final EnumC23412c f113761q = new EnumC23412c("LOW", 1);

    /* renamed from: r */
    public static final EnumC23412c f113762r = new EnumC23412c("MEDIUM", 2);

    /* renamed from: s */
    public static final EnumC23412c f113763s = new EnumC23412c("HIGH", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC23412c[] f113764t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f113765u;

    static {
        EnumC23412c[] m123021b = m123021b();
        f113764t = m123021b;
        f113765u = AbstractC30166b.m148796a(m123021b);
    }

    private EnumC23412c(String str, int i11) {
        super(str, i11);
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23412c[] m123021b() {
        return new EnumC23412c[]{f113760p, f113761q, f113762r, f113763s};
    }

    public static EnumC23412c valueOf(String str) {
        return (EnumC23412c) Enum.valueOf(EnumC23412c.class, str);
    }

    public static EnumC23412c[] values() {
        return (EnumC23412c[]) f113764t.clone();
    }
}
