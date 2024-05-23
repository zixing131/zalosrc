package p138ep;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ep.i */
/* loaded from: classes4.dex */
public final class EnumC18539i {

    /* renamed from: p */
    public static final EnumC18539i f93233p = new EnumC18539i("NOT_LOADED", 0);

    /* renamed from: q */
    public static final EnumC18539i f93234q = new EnumC18539i("LOADING", 1);

    /* renamed from: r */
    public static final EnumC18539i f93235r = new EnumC18539i("LOADED", 2);

    /* renamed from: s */
    public static final EnumC18539i f93236s = new EnumC18539i("ERROR_GENERAL", 3);

    /* renamed from: t */
    public static final EnumC18539i f93237t = new EnumC18539i("ERROR_ZVIDEO_INVALID", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC18539i[] f93238u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f93239v;

    static {
        EnumC18539i[] m97947b = m97947b();
        f93238u = m97947b;
        f93239v = AbstractC30166b.m148796a(m97947b);
    }

    private EnumC18539i(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18539i[] m97947b() {
        return new EnumC18539i[]{f93233p, f93234q, f93235r, f93236s, f93237t};
    }

    public static EnumC18539i valueOf(String str) {
        return (EnumC18539i) Enum.valueOf(EnumC18539i.class, str);
    }

    public static EnumC18539i[] values() {
        return (EnumC18539i[]) f93238u.clone();
    }
}
