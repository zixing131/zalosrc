package qd0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qd0.i */
/* loaded from: classes4.dex */
public final class EnumC25242i {

    /* renamed from: p */
    public static final EnumC25242i f121066p = new EnumC25242i("PHOTO", 0);

    /* renamed from: q */
    public static final EnumC25242i f121067q = new EnumC25242i("PHOTO_HD", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC25242i[] f121068r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f121069s;

    static {
        EnumC25242i[] m130611b = m130611b();
        f121068r = m130611b;
        f121069s = AbstractC30166b.m148796a(m130611b);
    }

    private EnumC25242i(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25242i[] m130611b() {
        return new EnumC25242i[]{f121066p, f121067q};
    }

    public static EnumC25242i valueOf(String str) {
        return (EnumC25242i) Enum.valueOf(EnumC25242i.class, str);
    }

    public static EnumC25242i[] values() {
        return (EnumC25242i[]) f121068r.clone();
    }
}
