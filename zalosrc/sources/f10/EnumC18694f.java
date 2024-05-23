package f10;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f10.f */
/* loaded from: classes5.dex */
public final class EnumC18694f {

    /* renamed from: p */
    public static final EnumC18694f f93916p = new EnumC18694f("SUCCESS", 0);

    /* renamed from: q */
    private static final /* synthetic */ EnumC18694f[] f93917q;

    /* renamed from: r */
    private static final /* synthetic */ InterfaceC30165a f93918r;

    static {
        EnumC18694f[] m98600b = m98600b();
        f93917q = m98600b;
        f93918r = AbstractC30166b.m148796a(m98600b);
    }

    private EnumC18694f(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC18694f[] m98600b() {
        return new EnumC18694f[]{f93916p};
    }

    public static EnumC18694f valueOf(String str) {
        return (EnumC18694f) Enum.valueOf(EnumC18694f.class, str);
    }

    public static EnumC18694f[] values() {
        return (EnumC18694f[]) f93917q.clone();
    }
}
