package p113dw;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dw.c */
/* loaded from: classes4.dex */
public final class EnumC18074c {

    /* renamed from: p */
    public static final EnumC18074c f91494p = new EnumC18074c("NOT_STARTED", 0);

    /* renamed from: q */
    public static final EnumC18074c f91495q = new EnumC18074c("START_SUCCESS", 1);

    /* renamed from: r */
    public static final EnumC18074c f91496r = new EnumC18074c("START_FAIL", 2);

    /* renamed from: s */
    public static final EnumC18074c f91497s = new EnumC18074c("START_TIMEOUT", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC18074c[] f91498t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f91499u;

    static {
        EnumC18074c[] m96122b = m96122b();
        f91498t = m96122b;
        f91499u = AbstractC30166b.m148796a(m96122b);
    }

    private EnumC18074c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18074c[] m96122b() {
        return new EnumC18074c[]{f91494p, f91495q, f91496r, f91497s};
    }

    public static EnumC18074c valueOf(String str) {
        return (EnumC18074c) Enum.valueOf(EnumC18074c.class, str);
    }

    public static EnumC18074c[] values() {
        return (EnumC18074c[]) f91498t.clone();
    }
}
