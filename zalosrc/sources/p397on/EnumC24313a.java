package p397on;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: on.a */
/* loaded from: classes3.dex */
public final class EnumC24313a {
    public static final a Companion;

    /* renamed from: p */
    public static final EnumC24313a f117397p = new EnumC24313a("VIDEO", 0);

    /* renamed from: q */
    public static final EnumC24313a f117398q = new EnumC24313a("PHOTO", 1);

    /* renamed from: r */
    public static final EnumC24313a f117399r = new EnumC24313a("LOOP", 2);

    /* renamed from: s */
    private static final /* synthetic */ EnumC24313a[] f117400s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f117401t;

    /* renamed from: on.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC24313a m126963a(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return EnumC24313a.f117397p;
            }
            return EnumC24313a.f117398q;
        }

        /* renamed from: b */
        public final EnumC24313a m126964b(int i11) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return EnumC24313a.f117399r;
                }
                return EnumC24313a.f117397p;
            }
            return EnumC24313a.f117398q;
        }
    }

    static {
        EnumC24313a[] m126960b = m126960b();
        f117400s = m126960b;
        f117401t = AbstractC30166b.m148796a(m126960b);
        Companion = new a(null);
    }

    private EnumC24313a(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24313a[] m126960b() {
        return new EnumC24313a[]{f117397p, f117398q, f117399r};
    }

    /* renamed from: c */
    public static final EnumC24313a m126961c(int i11) {
        return Companion.m126963a(i11);
    }

    /* renamed from: d */
    public static final EnumC24313a m126962d(int i11) {
        return Companion.m126964b(i11);
    }

    public static EnumC24313a valueOf(String str) {
        return (EnumC24313a) Enum.valueOf(EnumC24313a.class, str);
    }

    public static EnumC24313a[] values() {
        return (EnumC24313a[]) f117400s.clone();
    }
}
