package p698yz;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yz.a */
/* loaded from: classes4.dex */
public final class EnumC31105a {

    /* renamed from: p */
    public static final EnumC31105a f143329p = new EnumC31105a("UPLOADING", 0);

    /* renamed from: q */
    public static final EnumC31105a f143330q = new EnumC31105a("NOT_AVAILABLE", 1);

    /* renamed from: r */
    public static final EnumC31105a f143331r = new EnumC31105a("DOWNLOADING", 2);

    /* renamed from: s */
    public static final EnumC31105a f143332s = new EnumC31105a("DOWNLOAD_ERROR", 3);

    /* renamed from: t */
    public static final EnumC31105a f143333t = new EnumC31105a("DOWNLOADED_AND_PERSISTED", 4);

    /* renamed from: u */
    public static final EnumC31105a f143334u = new EnumC31105a("DOWNLOADED_TO_CACHE", 5);

    /* renamed from: v */
    public static final EnumC31105a f143335v = new EnumC31105a("ROLLED", 6);

    /* renamed from: w */
    public static final EnumC31105a f143336w = new EnumC31105a("BIG_FILE_NOT_EXPIRED", 7);

    /* renamed from: x */
    public static final EnumC31105a f143337x = new EnumC31105a("BIG_FILE_EXPIRED", 8);

    /* renamed from: y */
    private static final /* synthetic */ EnumC31105a[] f143338y;

    /* renamed from: z */
    private static final /* synthetic */ InterfaceC30165a f143339z;

    static {
        EnumC31105a[] m151114b = m151114b();
        f143338y = m151114b;
        f143339z = AbstractC30166b.m148796a(m151114b);
    }

    private EnumC31105a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31105a[] m151114b() {
        return new EnumC31105a[]{f143329p, f143330q, f143331r, f143332s, f143333t, f143334u, f143335v, f143336w, f143337x};
    }

    public static EnumC31105a valueOf(String str) {
        return (EnumC31105a) Enum.valueOf(EnumC31105a.class, str);
    }

    public static EnumC31105a[] values() {
        return (EnumC31105a[]) f143338y.clone();
    }
}
