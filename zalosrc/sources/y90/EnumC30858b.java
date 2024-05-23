package y90;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y90.b */
/* loaded from: classes6.dex */
public final class EnumC30858b {

    /* renamed from: p */
    public static final EnumC30858b f142392p = new EnumC30858b(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC30858b f142393q = new EnumC30858b("NOT_EMPTY_INPUT", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC30858b[] f142394r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f142395s;

    static {
        EnumC30858b[] m150001b = m150001b();
        f142394r = m150001b;
        f142395s = AbstractC30166b.m148796a(m150001b);
    }

    private EnumC30858b(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30858b[] m150001b() {
        return new EnumC30858b[]{f142392p, f142393q};
    }

    public static EnumC30858b valueOf(String str) {
        return (EnumC30858b) Enum.valueOf(EnumC30858b.class, str);
    }

    public static EnumC30858b[] values() {
        return (EnumC30858b[]) f142394r.clone();
    }
}
