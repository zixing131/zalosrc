package yt;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: yt.d */
/* loaded from: classes4.dex */
public final class EnumC31074d extends Enum {

    /* renamed from: p */
    public static final EnumC31074d f143265p = new EnumC31074d("UNDEFINED", 0);

    /* renamed from: q */
    public static final EnumC31074d f143266q = new EnumC31074d("MINI_APP", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC31074d[] f143267r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f143268s;

    static {
        EnumC31074d[] m150995b = m150995b();
        f143267r = m150995b;
        f143268s = AbstractC30166b.m148796a(m150995b);
    }

    private EnumC31074d(String str, int i11) {
        super(str, i11);
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31074d[] m150995b() {
        return new EnumC31074d[]{f143265p, f143266q};
    }

    public static EnumC31074d valueOf(String str) {
        return (EnumC31074d) Enum.valueOf(EnumC31074d.class, str);
    }

    public static EnumC31074d[] values() {
        return (EnumC31074d[]) f143267r.clone();
    }
}
