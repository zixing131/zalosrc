package y90;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y90.c */
/* loaded from: classes6.dex */
public final class EnumC30859c {

    /* renamed from: p */
    public static final EnumC30859c f142396p = new EnumC30859c(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC30859c f142397q = new EnumC30859c("FROM_TIP_PRESSED", 1);

    /* renamed from: r */
    public static final EnumC30859c f142398r = new EnumC30859c("FROM_EMOJI_PRESSED", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC30859c[] f142399s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f142400t;

    static {
        EnumC30859c[] m150002b = m150002b();
        f142399s = m150002b;
        f142400t = AbstractC30166b.m148796a(m150002b);
    }

    private EnumC30859c(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30859c[] m150002b() {
        return new EnumC30859c[]{f142396p, f142397q, f142398r};
    }

    public static EnumC30859c valueOf(String str) {
        return (EnumC30859c) Enum.valueOf(EnumC30859c.class, str);
    }

    public static EnumC30859c[] values() {
        return (EnumC30859c[]) f142399s.clone();
    }
}
