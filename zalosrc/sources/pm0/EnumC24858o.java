package pm0;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pm0.o */
/* loaded from: classes.dex */
public final class EnumC24858o {

    /* renamed from: p */
    public static final EnumC24858o f119257p = new EnumC24858o("SYNCHRONIZED", 0);

    /* renamed from: q */
    public static final EnumC24858o f119258q = new EnumC24858o("PUBLICATION", 1);

    /* renamed from: r */
    public static final EnumC24858o f119259r = new EnumC24858o(Image.SCALE_TYPE_NONE, 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC24858o[] f119260s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f119261t;

    static {
        EnumC24858o[] m129212b = m129212b();
        f119260s = m129212b;
        f119261t = AbstractC30166b.m148796a(m129212b);
    }

    private EnumC24858o(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24858o[] m129212b() {
        return new EnumC24858o[]{f119257p, f119258q, f119259r};
    }

    public static EnumC24858o valueOf(String str) {
        return (EnumC24858o) Enum.valueOf(EnumC24858o.class, str);
    }

    public static EnumC24858o[] values() {
        return (EnumC24858o[]) f119260s.clone();
    }
}
