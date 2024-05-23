package p367nn;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: nn.c */
/* loaded from: classes3.dex */
public final class EnumC23888c {

    /* renamed from: p */
    public static final EnumC23888c f115483p = new EnumC23888c("CAPTION", 0);

    /* renamed from: q */
    public static final EnumC23888c f115484q = new EnumC23888c("STICKER", 1);

    /* renamed from: r */
    public static final EnumC23888c f115485r = new EnumC23888c("CROP", 2);

    /* renamed from: s */
    public static final EnumC23888c f115486s = new EnumC23888c("FILTER", 3);

    /* renamed from: t */
    public static final EnumC23888c f115487t = new EnumC23888c("BLUR", 4);

    /* renamed from: u */
    public static final EnumC23888c f115488u = new EnumC23888c("DOODLE", 5);

    /* renamed from: v */
    public static final EnumC23888c f115489v = new EnumC23888c("LOCATION", 6);

    /* renamed from: w */
    public static final EnumC23888c f115490w = new EnumC23888c("SPEED", 7);

    /* renamed from: x */
    public static final EnumC23888c f115491x = new EnumC23888c("ARROW", 8);

    /* renamed from: y */
    private static final /* synthetic */ EnumC23888c[] f115492y;

    /* renamed from: z */
    private static final /* synthetic */ InterfaceC30165a f115493z;

    static {
        EnumC23888c[] m124980b = m124980b();
        f115492y = m124980b;
        f115493z = AbstractC30166b.m148796a(m124980b);
    }

    private EnumC23888c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23888c[] m124980b() {
        return new EnumC23888c[]{f115483p, f115484q, f115485r, f115486s, f115487t, f115488u, f115489v, f115490w, f115491x};
    }

    public static EnumC23888c valueOf(String str) {
        return (EnumC23888c) Enum.valueOf(EnumC23888c.class, str);
    }

    public static EnumC23888c[] values() {
        return (EnumC23888c[]) f115492y.clone();
    }
}
