package yg0;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yg0.a */
/* loaded from: classes7.dex */
public final class EnumC30980a {

    /* renamed from: q */
    public static final EnumC30980a f142925q = new EnumC30980a(Image.SCALE_TYPE_NONE, 0, -1);

    /* renamed from: r */
    public static final EnumC30980a f142926r = new EnumC30980a("BANNER", 1, 0);

    /* renamed from: s */
    public static final EnumC30980a f142927s = new EnumC30980a("VIEW_FULL", 2, 1);

    /* renamed from: t */
    public static final EnumC30980a f142928t = new EnumC30980a("ZCLOUD_HOME", 3, 2);

    /* renamed from: u */
    private static final /* synthetic */ EnumC30980a[] f142929u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f142930v;

    /* renamed from: p */
    private final int f142931p;

    static {
        EnumC30980a[] m150596b = m150596b();
        f142929u = m150596b;
        f142930v = AbstractC30166b.m148796a(m150596b);
    }

    private EnumC30980a(String str, int i11, int i12) {
        this.f142931p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC30980a[] m150596b() {
        return new EnumC30980a[]{f142925q, f142926r, f142927s, f142928t};
    }

    public static EnumC30980a valueOf(String str) {
        return (EnumC30980a) Enum.valueOf(EnumC30980a.class, str);
    }

    public static EnumC30980a[] values() {
        return (EnumC30980a[]) f142929u.clone();
    }

    /* renamed from: c */
    public final int m150597c() {
        return this.f142931p;
    }
}
