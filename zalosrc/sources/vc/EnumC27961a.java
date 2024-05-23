package vc;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vc.a */
/* loaded from: classes3.dex */
public final class EnumC27961a {

    /* renamed from: p */
    public static final EnumC27961a f130357p = new EnumC27961a(Image.SCALE_TYPE_NONE, 0);

    /* renamed from: q */
    public static final EnumC27961a f130358q = new EnumC27961a("CREATE", 1);

    /* renamed from: r */
    public static final EnumC27961a f130359r = new EnumC27961a("UPDATE", 2);

    /* renamed from: s */
    public static final EnumC27961a f130360s = new EnumC27961a("GET", 3);

    /* renamed from: t */
    public static final EnumC27961a f130361t = new EnumC27961a("DELETE", 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC27961a[] f130362u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f130363v;

    static {
        EnumC27961a[] m140922b = m140922b();
        f130362u = m140922b;
        f130363v = AbstractC30166b.m148796a(m140922b);
    }

    private EnumC27961a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC27961a[] m140922b() {
        return new EnumC27961a[]{f130357p, f130358q, f130359r, f130360s, f130361t};
    }

    public static EnumC27961a valueOf(String str) {
        return (EnumC27961a) Enum.valueOf(EnumC27961a.class, str);
    }

    public static EnumC27961a[] values() {
        return (EnumC27961a[]) f130362u.clone();
    }
}
