package p361nb;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: nb.t */
/* loaded from: classes3.dex */
public final class EnumC23663t {

    /* renamed from: q */
    public static final EnumC23663t f114624q = new EnumC23663t("STORED_MEDIA_HOME_VIEW", 0, 0);

    /* renamed from: r */
    public static final EnumC23663t f114625r = new EnumC23663t("STORED_MEDIA_RESULT_SEARCH_TEXT_VIEW", 1, 1);

    /* renamed from: s */
    public static final EnumC23663t f114626s = new EnumC23663t("STORED_MEDIA_SENDER_COLLECTION", 2, 2);

    /* renamed from: t */
    public static final EnumC23663t f114627t = new EnumC23663t("STORED_MEDIA_VIDEO_COLLECTION", 3, 3);

    /* renamed from: u */
    public static final EnumC23663t f114628u = new EnumC23663t("STORE_MEDIA_RESULT_SEARCH_TIME", 4, 4);

    /* renamed from: v */
    private static final /* synthetic */ EnumC23663t[] f114629v;

    /* renamed from: w */
    private static final /* synthetic */ InterfaceC30165a f114630w;

    /* renamed from: p */
    private final int f114631p;

    static {
        EnumC23663t[] m123985b = m123985b();
        f114629v = m123985b;
        f114630w = AbstractC30166b.m148796a(m123985b);
    }

    private EnumC23663t(String str, int i11, int i12) {
        this.f114631p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC23663t[] m123985b() {
        return new EnumC23663t[]{f114624q, f114625r, f114626s, f114627t, f114628u};
    }

    public static EnumC23663t valueOf(String str) {
        return (EnumC23663t) Enum.valueOf(EnumC23663t.class, str);
    }

    public static EnumC23663t[] values() {
        return (EnumC23663t[]) f114629v.clone();
    }

    /* renamed from: c */
    public final int m123986c() {
        return this.f114631p;
    }
}
