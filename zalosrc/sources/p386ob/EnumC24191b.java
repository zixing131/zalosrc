package p386ob;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ob.b */
/* loaded from: classes3.dex */
public final class EnumC24191b {

    /* renamed from: q */
    public static final EnumC24191b f116757q = new EnumC24191b(Image.SCALE_TYPE_NONE, 0, 0);

    /* renamed from: r */
    public static final EnumC24191b f116758r = new EnumC24191b("SUCCESS", 1, 1);

    /* renamed from: s */
    public static final EnumC24191b f116759s = new EnumC24191b("FAILED", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC24191b[] f116760t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f116761u;

    /* renamed from: p */
    private final int f116762p;

    static {
        EnumC24191b[] m126130b = m126130b();
        f116760t = m126130b;
        f116761u = AbstractC30166b.m148796a(m126130b);
    }

    private EnumC24191b(String str, int i11, int i12) {
        this.f116762p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24191b[] m126130b() {
        return new EnumC24191b[]{f116757q, f116758r, f116759s};
    }

    public static EnumC24191b valueOf(String str) {
        return (EnumC24191b) Enum.valueOf(EnumC24191b.class, str);
    }

    public static EnumC24191b[] values() {
        return (EnumC24191b[]) f116760t.clone();
    }

    /* renamed from: c */
    public final int m126131c() {
        return this.f116762p;
    }
}
