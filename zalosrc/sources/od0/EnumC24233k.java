package od0;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: od0.k */
/* loaded from: classes4.dex */
public final class EnumC24233k {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC24233k f117063q = new EnumC24233k("COM", 0, 0);

    /* renamed from: r */
    public static final EnumC24233k f117064r = new EnumC24233k("HTTP", 1, 1);

    /* renamed from: s */
    public static final EnumC24233k f117065s = new EnumC24233k("COM_HTTP_FAILOVER", 2, 2);

    /* renamed from: t */
    public static final EnumC24233k f117066t = new EnumC24233k("HTTP_COM_FAILOVER", 3, 4);

    /* renamed from: u */
    private static final /* synthetic */ EnumC24233k[] f117067u;

    /* renamed from: v */
    private static final /* synthetic */ InterfaceC30165a f117068v;

    /* renamed from: p */
    private final int f117069p;

    /* renamed from: od0.k$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        EnumC24233k[] m126538b = m126538b();
        f117067u = m126538b;
        f117068v = AbstractC30166b.m148796a(m126538b);
        Companion = new a(null);
    }

    private EnumC24233k(String str, int i11, int i12) {
        this.f117069p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24233k[] m126538b() {
        return new EnumC24233k[]{f117063q, f117064r, f117065s, f117066t};
    }

    public static EnumC24233k valueOf(String str) {
        return (EnumC24233k) Enum.valueOf(EnumC24233k.class, str);
    }

    public static EnumC24233k[] values() {
        return (EnumC24233k[]) f117067u.clone();
    }

    /* renamed from: c */
    public final int m126539c() {
        return this.f117069p;
    }
}
