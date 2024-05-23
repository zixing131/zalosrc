package p164fn;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fn.c */
/* loaded from: classes3.dex */
public final class EnumC19029c {

    /* renamed from: A */
    private static final /* synthetic */ InterfaceC30165a f94850A;

    /* renamed from: q */
    public static final EnumC19029c f94851q = new EnumC19029c("ALREADY_HAS_RESOURCE", 0, -3);

    /* renamed from: r */
    public static final EnumC19029c f94852r = new EnumC19029c("NOT_NEED_DOWNLOAD", 1, -2);

    /* renamed from: s */
    public static final EnumC19029c f94853s = new EnumC19029c("CAN_DOWNLOAD", 2, -1);

    /* renamed from: t */
    public static final EnumC19029c f94854t = new EnumC19029c("SUCCESS", 3, 0);

    /* renamed from: u */
    public static final EnumC19029c f94855u = new EnumC19029c("ERROR_UNKNOWN", 4, 1);

    /* renamed from: v */
    public static final EnumC19029c f94856v = new EnumC19029c("EXCEED_LIMIT_SIZE", 5, 2);

    /* renamed from: w */
    public static final EnumC19029c f94857w = new EnumC19029c("ROLLED", 6, 3);

    /* renamed from: x */
    public static final EnumC19029c f94858x = new EnumC19029c("NETWORK_ERROR", 7, 4);

    /* renamed from: y */
    public static final EnumC19029c f94859y = new EnumC19029c("STORAGE_NOT_AVAILABLE", 8, 5);

    /* renamed from: z */
    private static final /* synthetic */ EnumC19029c[] f94860z;

    /* renamed from: p */
    private final int f94861p;

    static {
        EnumC19029c[] m100101b = m100101b();
        f94860z = m100101b;
        f94850A = AbstractC30166b.m148796a(m100101b);
    }

    private EnumC19029c(String str, int i11, int i12) {
        this.f94861p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19029c[] m100101b() {
        return new EnumC19029c[]{f94851q, f94852r, f94853s, f94854t, f94855u, f94856v, f94857w, f94858x, f94859y};
    }

    public static EnumC19029c valueOf(String str) {
        return (EnumC19029c) Enum.valueOf(EnumC19029c.class, str);
    }

    public static EnumC19029c[] values() {
        return (EnumC19029c[]) f94860z.clone();
    }

    /* renamed from: c */
    public final int m100102c() {
        return this.f94861p;
    }
}
