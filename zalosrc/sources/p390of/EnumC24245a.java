package p390of;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: of.a */
/* loaded from: classes3.dex */
public final class EnumC24245a {

    /* renamed from: E */
    private static final /* synthetic */ EnumC24245a[] f117104E;

    /* renamed from: F */
    private static final /* synthetic */ InterfaceC30165a f117105F;

    /* renamed from: p */
    private final int f117116p;

    /* renamed from: q */
    public static final EnumC24245a f117106q = new EnumC24245a("PENDING", 0, -1);

    /* renamed from: r */
    public static final EnumC24245a f117107r = new EnumC24245a("SUCCEED", 1, 0);

    /* renamed from: s */
    public static final EnumC24245a f117108s = new EnumC24245a("THUMB_EXCEPTION_ERROR", 2, 1);

    /* renamed from: t */
    public static final EnumC24245a f117109t = new EnumC24245a("THUMB_FILE_ERROR", 3, 2);

    /* renamed from: u */
    public static final EnumC24245a f117110u = new EnumC24245a("THUMB_TIMEOUT_ERROR", 4, 3);

    /* renamed from: v */
    public static final EnumC24245a f117111v = new EnumC24245a("COMPRESS_FILE_ERROR", 5, 4);

    /* renamed from: w */
    public static final EnumC24245a f117112w = new EnumC24245a("COMPRESS_TIMEOUT_ERROR", 6, 5);

    /* renamed from: x */
    public static final EnumC24245a f117113x = new EnumC24245a("COMPRESS_EXCEPTION_ERROR", 7, 6);

    /* renamed from: y */
    public static final EnumC24245a f117114y = new EnumC24245a("COMPRESS_SERVICE_NOT_EXIST_FILE_INPUT_ERROR", 8, 7);

    /* renamed from: z */
    public static final EnumC24245a f117115z = new EnumC24245a("COMPRESS_SERVICE_EXCEPTION_ERROR", 9, 8);

    /* renamed from: A */
    public static final EnumC24245a f117100A = new EnumC24245a("FULL_STORAGE_ERROR", 10, 9);

    /* renamed from: B */
    public static final EnumC24245a f117101B = new EnumC24245a("FOREGROUND_SERVICE_START_NOT_ALLOWED_EXCEPTION", 11, 10);

    /* renamed from: C */
    public static final EnumC24245a f117102C = new EnumC24245a("NOTI_CHANNEL_LIMIT_EXCEED", 12, 11);

    /* renamed from: D */
    public static final EnumC24245a f117103D = new EnumC24245a("COMPRESS_SERVICE_NOT_STARTED", 13, 12);

    static {
        EnumC24245a[] m126580b = m126580b();
        f117104E = m126580b;
        f117105F = AbstractC30166b.m148796a(m126580b);
    }

    private EnumC24245a(String str, int i11, int i12) {
        this.f117116p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24245a[] m126580b() {
        return new EnumC24245a[]{f117106q, f117107r, f117108s, f117109t, f117110u, f117111v, f117112w, f117113x, f117114y, f117115z, f117100A, f117101B, f117102C, f117103D};
    }

    public static EnumC24245a valueOf(String str) {
        return (EnumC24245a) Enum.valueOf(EnumC24245a.class, str);
    }

    public static EnumC24245a[] values() {
        return (EnumC24245a[]) f117104E.clone();
    }

    /* renamed from: c */
    public final int m126581c() {
        return this.f117116p;
    }
}
