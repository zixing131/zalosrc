package p581vo;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vo.c */
/* loaded from: classes4.dex */
public final class EnumC28360c {

    /* renamed from: p */
    public static final EnumC28360c f132137p = new EnumC28360c("SAVE_ASYNC_FEED", 0);

    /* renamed from: q */
    public static final EnumC28360c f132138q = new EnumC28360c("CANCEL_UPLOAD", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC28360c[] f132139r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f132140s;

    static {
        EnumC28360c[] m142816b = m142816b();
        f132139r = m142816b;
        f132140s = AbstractC30166b.m148796a(m142816b);
    }

    private EnumC28360c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC28360c[] m142816b() {
        return new EnumC28360c[]{f132137p, f132138q};
    }

    public static EnumC28360c valueOf(String str) {
        return (EnumC28360c) Enum.valueOf(EnumC28360c.class, str);
    }

    public static EnumC28360c[] values() {
        return (EnumC28360c[]) f132139r.clone();
    }
}
