package lk;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lk.a */
/* loaded from: classes3.dex */
public final class EnumC22502a {

    /* renamed from: C */
    private static final /* synthetic */ EnumC22502a[] f110109C;

    /* renamed from: D */
    private static final /* synthetic */ InterfaceC30165a f110110D;

    /* renamed from: p */
    public static final EnumC22502a f110111p = new EnumC22502a("NETWORK_CONNECTION", 0);

    /* renamed from: q */
    public static final EnumC22502a f110112q = new EnumC22502a("REMIND_NOTIFICATION", 1);

    /* renamed from: r */
    public static final EnumC22502a f110113r = new EnumC22502a("NOTIFICATION_RESTRICT", 2);

    /* renamed from: s */
    public static final EnumC22502a f110114s = new EnumC22502a("CALL", 3);

    /* renamed from: t */
    public static final EnumC22502a f110115t = new EnumC22502a("DELETE_CONVERSATION", 4);

    /* renamed from: u */
    public static final EnumC22502a f110116u = new EnumC22502a("UPDATE_PROFILE", 5);

    /* renamed from: v */
    public static final EnumC22502a f110117v = new EnumC22502a("TRANSFER_PC", 6);

    /* renamed from: w */
    public static final EnumC22502a f110118w = new EnumC22502a("ZCLOUD_ONBOARDING", 7);

    /* renamed from: x */
    public static final EnumC22502a f110119x = new EnumC22502a("ZCLOUD_REMIND_SETUP", 8);

    /* renamed from: y */
    public static final EnumC22502a f110120y = new EnumC22502a("ZCLOUD_REMIND_RESTORE", 9);

    /* renamed from: z */
    public static final EnumC22502a f110121z = new EnumC22502a("ZCLOUD_CHANGE_BACKUP_KEY", 10);

    /* renamed from: A */
    public static final EnumC22502a f110107A = new EnumC22502a("ZCLOUD_LOCK_VERIFY_CLOUD", 11);

    /* renamed from: B */
    public static final EnumC22502a f110108B = new EnumC22502a("ZCLOUD_GRACE_PERIOD", 12);

    static {
        EnumC22502a[] m116347b = m116347b();
        f110109C = m116347b;
        f110110D = AbstractC30166b.m148796a(m116347b);
    }

    private EnumC22502a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC22502a[] m116347b() {
        return new EnumC22502a[]{f110111p, f110112q, f110113r, f110114s, f110115t, f110116u, f110117v, f110118w, f110119x, f110120y, f110121z, f110107A, f110108B};
    }

    public static EnumC22502a valueOf(String str) {
        return (EnumC22502a) Enum.valueOf(EnumC22502a.class, str);
    }

    public static EnumC22502a[] values() {
        return (EnumC22502a[]) f110109C.clone();
    }
}
