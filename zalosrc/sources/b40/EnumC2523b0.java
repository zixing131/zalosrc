package b40;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b40.b0 */
/* loaded from: classes5.dex */
public final class EnumC2523b0 {

    /* renamed from: C */
    private static final /* synthetic */ EnumC2523b0[] f10253C;

    /* renamed from: D */
    private static final /* synthetic */ InterfaceC30165a f10254D;

    /* renamed from: p */
    private final int f10265p;

    /* renamed from: q */
    public static final EnumC2523b0 f10255q = new EnumC2523b0("HasResent", 0, 1);

    /* renamed from: r */
    public static final EnumC2523b0 f10256r = new EnumC2523b0("ErrorCodeNotSupportingResend", 1, 2);

    /* renamed from: s */
    public static final EnumC2523b0 f10257s = new EnumC2523b0("RequestRetryAndRetryKeyMissing", 2, 3);

    /* renamed from: t */
    public static final EnumC2523b0 f10258t = new EnumC2523b0("NoRetryKeyAndRequestRetryDecryptFailed", 3, 4);

    /* renamed from: u */
    public static final EnumC2523b0 f10259u = new EnumC2523b0("ThreadIsNotE2ee", 4, 5);

    /* renamed from: v */
    public static final EnumC2523b0 f10260v = new EnumC2523b0("MessageNotFound", 5, 6);

    /* renamed from: w */
    public static final EnumC2523b0 f10261w = new EnumC2523b0("MessageDeletedOrRecalled", 6, 7);

    /* renamed from: x */
    public static final EnumC2523b0 f10262x = new EnumC2523b0("HasResentInSameSession", 7, 8);

    /* renamed from: y */
    public static final EnumC2523b0 f10263y = new EnumC2523b0("SessionChanged", 8, 9);

    /* renamed from: z */
    public static final EnumC2523b0 f10264z = new EnumC2523b0("RetryKeyNotFound", 9, 10);

    /* renamed from: A */
    public static final EnumC2523b0 f10251A = new EnumC2523b0("OverTime", 10, 11);

    /* renamed from: B */
    public static final EnumC2523b0 f10252B = new EnumC2523b0("MessageDecryptSuccessBefore", 11, 12);

    static {
        EnumC2523b0[] m12638b = m12638b();
        f10253C = m12638b;
        f10254D = AbstractC30166b.m148796a(m12638b);
    }

    private EnumC2523b0(String str, int i11, int i12) {
        this.f10265p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2523b0[] m12638b() {
        return new EnumC2523b0[]{f10255q, f10256r, f10257s, f10258t, f10259u, f10260v, f10261w, f10262x, f10263y, f10264z, f10251A, f10252B};
    }

    public static EnumC2523b0 valueOf(String str) {
        return (EnumC2523b0) Enum.valueOf(EnumC2523b0.class, str);
    }

    public static EnumC2523b0[] values() {
        return (EnumC2523b0[]) f10253C.clone();
    }

    /* renamed from: c */
    public final int m12639c() {
        return this.f10265p;
    }
}
