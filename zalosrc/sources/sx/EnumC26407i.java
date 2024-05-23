package sx;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sx.i */
/* loaded from: classes4.dex */
public final class EnumC26407i {

    /* renamed from: A */
    private static final /* synthetic */ EnumC26407i[] f125513A;

    /* renamed from: B */
    private static final /* synthetic */ InterfaceC30165a f125514B;

    /* renamed from: q */
    public static final EnumC26407i f125515q = new EnumC26407i("UNSPECIFIED", 0, 0);

    /* renamed from: r */
    public static final EnumC26407i f125516r = new EnumC26407i("SINGLE_MESSAGE_CONTEXT_MENU", 1, 1);

    /* renamed from: s */
    public static final EnumC26407i f125517s = new EnumC26407i("MULTIPLE_MESSAGE_CONTEXT_MENU", 2, 2);

    /* renamed from: t */
    public static final EnumC26407i f125518t = new EnumC26407i("CHAT_GROUP_PHOTO_MENU", 3, 3);

    /* renamed from: u */
    public static final EnumC26407i f125519u = new EnumC26407i("SHARE_SHEET_IN_APP", 4, 4);

    /* renamed from: v */
    public static final EnumC26407i f125520v = new EnumC26407i("SHARE_SHEET_OUT_APP", 5, 5);

    /* renamed from: w */
    public static final EnumC26407i f125521w = new EnumC26407i("SEND_DIRECTLY", 6, 6);

    /* renamed from: x */
    public static final EnumC26407i f125522x = new EnumC26407i("FORWARD", 7, 7);

    /* renamed from: y */
    public static final EnumC26407i f125523y = new EnumC26407i("SEND_DIRECTLY_LISTING", 8, 8);

    /* renamed from: z */
    public static final EnumC26407i f125524z = new EnumC26407i("IN_APP_BROWSER", 9, 9);

    /* renamed from: p */
    private final int f125525p;

    static {
        EnumC26407i[] m136201b = m136201b();
        f125513A = m136201b;
        f125514B = AbstractC30166b.m148796a(m136201b);
    }

    private EnumC26407i(String str, int i11, int i12) {
        this.f125525p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC26407i[] m136201b() {
        return new EnumC26407i[]{f125515q, f125516r, f125517s, f125518t, f125519u, f125520v, f125521w, f125522x, f125523y, f125524z};
    }

    public static EnumC26407i valueOf(String str) {
        return (EnumC26407i) Enum.valueOf(EnumC26407i.class, str);
    }

    public static EnumC26407i[] values() {
        return (EnumC26407i[]) f125513A.clone();
    }

    /* renamed from: c */
    public final int m136202c() {
        return this.f125525p;
    }
}
