package p698yz;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yz.c */
/* loaded from: classes4.dex */
public final class EnumC31107c {

    /* renamed from: p */
    public static final EnumC31107c f143342p = new EnumC31107c("CHAT_VIEW", 0);

    /* renamed from: q */
    public static final EnumC31107c f143343q = new EnumC31107c("MEDIA_STORE", 1);

    /* renamed from: r */
    public static final EnumC31107c f143344r = new EnumC31107c("MY_CLOUD_LISTING", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC31107c[] f143345s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f143346t;

    static {
        EnumC31107c[] m151117b = m151117b();
        f143345s = m151117b;
        f143346t = AbstractC30166b.m148796a(m151117b);
    }

    private EnumC31107c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31107c[] m151117b() {
        return new EnumC31107c[]{f143342p, f143343q, f143344r};
    }

    public static EnumC31107c valueOf(String str) {
        return (EnumC31107c) Enum.valueOf(EnumC31107c.class, str);
    }

    public static EnumC31107c[] values() {
        return (EnumC31107c[]) f143345s.clone();
    }
}
