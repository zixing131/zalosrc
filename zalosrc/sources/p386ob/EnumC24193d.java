package p386ob;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ob.d */
/* loaded from: classes3.dex */
public final class EnumC24193d {

    /* renamed from: q */
    public static final EnumC24193d f116765q = new EnumC24193d("SUCCESS", 0, 0);

    /* renamed from: r */
    public static final EnumC24193d f116766r = new EnumC24193d("EXPORT", 1, 1);

    /* renamed from: s */
    public static final EnumC24193d f116767s = new EnumC24193d("UPLOAD", 2, 2);

    /* renamed from: t */
    public static final EnumC24193d f116768t = new EnumC24193d("UPLOAD_THUMB", 3, 3);

    /* renamed from: u */
    public static final EnumC24193d f116769u = new EnumC24193d("SEND_MESSAGE", 4, 4);

    /* renamed from: v */
    public static final EnumC24193d f116770v = new EnumC24193d("DOWNLOAD_RESOURCE", 5, 5);

    /* renamed from: w */
    public static final EnumC24193d f116771w = new EnumC24193d("EXPORT_THUMB", 6, 7);

    /* renamed from: x */
    public static final EnumC24193d f116772x = new EnumC24193d("DOWNLOAD_BEFORE_SENDING", 7, 8);

    /* renamed from: y */
    private static final /* synthetic */ EnumC24193d[] f116773y;

    /* renamed from: z */
    private static final /* synthetic */ InterfaceC30165a f116774z;

    /* renamed from: p */
    private final int f116775p;

    static {
        EnumC24193d[] m126132b = m126132b();
        f116773y = m126132b;
        f116774z = AbstractC30166b.m148796a(m126132b);
    }

    private EnumC24193d(String str, int i11, int i12) {
        this.f116775p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24193d[] m126132b() {
        return new EnumC24193d[]{f116765q, f116766r, f116767s, f116768t, f116769u, f116770v, f116771w, f116772x};
    }

    public static EnumC24193d valueOf(String str) {
        return (EnumC24193d) Enum.valueOf(EnumC24193d.class, str);
    }

    public static EnumC24193d[] values() {
        return (EnumC24193d[]) f116773y.clone();
    }

    /* renamed from: c */
    public final int m126133c() {
        return this.f116775p;
    }
}
