package bc0;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bc0.k */
/* loaded from: classes6.dex */
public final class EnumC2746k {

    /* renamed from: p */
    public static final EnumC2746k f10888p = new EnumC2746k("SKIP_DRIVE", 0);

    /* renamed from: q */
    public static final EnumC2746k f10889q = new EnumC2746k("DRIVE_NOT_LOGIN", 1);

    /* renamed from: r */
    public static final EnumC2746k f10890r = new EnumC2746k("OLD_BACKUP_PASSWORD", 2);

    /* renamed from: s */
    public static final EnumC2746k f10891s = new EnumC2746k("UNKNOWN", 3);

    /* renamed from: t */
    public static final EnumC2746k f10892t = new EnumC2746k(Image.SCALE_TYPE_NONE, 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC2746k[] f10893u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f10894v;

    static {
        EnumC2746k[] m13305b = m13305b();
        f10893u = m13305b;
        f10894v = AbstractC30166b.m148796a(m13305b);
    }

    private EnumC2746k(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC2746k[] m13305b() {
        return new EnumC2746k[]{f10888p, f10889q, f10890r, f10891s, f10892t};
    }

    public static EnumC2746k valueOf(String str) {
        return (EnumC2746k) Enum.valueOf(EnumC2746k.class, str);
    }

    public static EnumC2746k[] values() {
        return (EnumC2746k[]) f10893u.clone();
    }
}
