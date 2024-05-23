package p487rl;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rl.e */
/* loaded from: classes3.dex */
public final class EnumC25824e {

    /* renamed from: q */
    public static final EnumC25824e f123201q = new EnumC25824e("None", 0, 0);

    /* renamed from: r */
    public static final EnumC25824e f123202r = new EnumC25824e("Success", 1, 1);

    /* renamed from: s */
    public static final EnumC25824e f123203s = new EnumC25824e("Failed", 2, -1);

    /* renamed from: t */
    public static final EnumC25824e f123204t = new EnumC25824e("Skipped", 3, -2);

    /* renamed from: u */
    private static final /* synthetic */ EnumC25824e[] f123205u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f123206v;

    /* renamed from: p */
    private final int f123207p;

    static {
        EnumC25824e[] m133196b = m133196b();
        f123205u = m133196b;
        f123206v = AbstractC30166b.m148796a(m133196b);
    }

    private EnumC25824e(String str, int i11, int i12) {
        this.f123207p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25824e[] m133196b() {
        return new EnumC25824e[]{f123201q, f123202r, f123203s, f123204t};
    }

    public static EnumC25824e valueOf(String str) {
        return (EnumC25824e) Enum.valueOf(EnumC25824e.class, str);
    }

    public static EnumC25824e[] values() {
        return (EnumC25824e[]) f123205u.clone();
    }

    /* renamed from: c */
    public final int m133197c() {
        return this.f123207p;
    }
}
