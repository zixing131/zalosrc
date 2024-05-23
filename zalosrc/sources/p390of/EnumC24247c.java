package p390of;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: of.c */
/* loaded from: classes3.dex */
public final class EnumC24247c {

    /* renamed from: q */
    public static final EnumC24247c f117125q = new EnumC24247c("UNKNOWN", 0, -1);

    /* renamed from: r */
    public static final EnumC24247c f117126r = new EnumC24247c("CREATED", 1, 0);

    /* renamed from: s */
    public static final EnumC24247c f117127s = new EnumC24247c("STARTED", 2, 1);

    /* renamed from: t */
    private static final /* synthetic */ EnumC24247c[] f117128t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f117129u;

    /* renamed from: p */
    private final int f117130p;

    static {
        EnumC24247c[] m126583b = m126583b();
        f117128t = m126583b;
        f117129u = AbstractC30166b.m148796a(m126583b);
    }

    private EnumC24247c(String str, int i11, int i12) {
        this.f117130p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24247c[] m126583b() {
        return new EnumC24247c[]{f117125q, f117126r, f117127s};
    }

    public static EnumC24247c valueOf(String str) {
        return (EnumC24247c) Enum.valueOf(EnumC24247c.class, str);
    }

    public static EnumC24247c[] values() {
        return (EnumC24247c[]) f117128t.clone();
    }

    /* renamed from: c */
    public final int m126584c() {
        return this.f117130p;
    }
}
