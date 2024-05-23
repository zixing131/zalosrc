package sk;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sk.g */
/* loaded from: classes3.dex */
public final class EnumC26306g {

    /* renamed from: q */
    public static final EnumC26306g f124953q = new EnumC26306g("MiniApp", 0, 0);

    /* renamed from: r */
    public static final EnumC26306g f124954r = new EnumC26306g("HighPriorityOA", 1, 1);

    /* renamed from: s */
    public static final EnumC26306g f124955s = new EnumC26306g("LowPriorityOA", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC26306g[] f124956t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f124957u;

    /* renamed from: p */
    private final int f124958p;

    static {
        EnumC26306g[] m135431b = m135431b();
        f124956t = m135431b;
        f124957u = AbstractC30166b.m148796a(m135431b);
    }

    private EnumC26306g(String str, int i11, int i12) {
        this.f124958p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC26306g[] m135431b() {
        return new EnumC26306g[]{f124953q, f124954r, f124955s};
    }

    public static EnumC26306g valueOf(String str) {
        return (EnumC26306g) Enum.valueOf(EnumC26306g.class, str);
    }

    public static EnumC26306g[] values() {
        return (EnumC26306g[]) f124956t.clone();
    }

    /* renamed from: c */
    public final int m135432c() {
        return this.f124958p;
    }
}
