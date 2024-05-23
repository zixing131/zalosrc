package p487rl;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rl.f */
/* loaded from: classes3.dex */
public final class EnumC25825f {

    /* renamed from: q */
    public static final EnumC25825f f123208q = new EnumC25825f("Server", 0, 1);

    /* renamed from: r */
    public static final EnumC25825f f123209r = new EnumC25825f("Local", 1, 2);

    /* renamed from: s */
    public static final EnumC25825f f123210s = new EnumC25825f("Backup", 2, 3);

    /* renamed from: t */
    public static final EnumC25825f f123211t = new EnumC25825f("PotentiallyBackup", 3, 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC25825f[] f123212u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f123213v;

    /* renamed from: p */
    private final int f123214p;

    static {
        EnumC25825f[] m133198b = m133198b();
        f123212u = m133198b;
        f123213v = AbstractC30166b.m148796a(m133198b);
    }

    private EnumC25825f(String str, int i11, int i12) {
        this.f123214p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25825f[] m133198b() {
        return new EnumC25825f[]{f123208q, f123209r, f123210s, f123211t};
    }

    public static EnumC25825f valueOf(String str) {
        return (EnumC25825f) Enum.valueOf(EnumC25825f.class, str);
    }

    public static EnumC25825f[] values() {
        return (EnumC25825f[]) f123212u.clone();
    }

    /* renamed from: c */
    public final int m133199c() {
        return this.f123214p;
    }
}
