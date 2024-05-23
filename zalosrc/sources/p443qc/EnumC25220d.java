package p443qc;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qc.d */
/* loaded from: classes3.dex */
public final class EnumC25220d {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC25220d f120980q = new EnumC25220d("NONE_ACTION", 0, 0);

    /* renamed from: r */
    public static final EnumC25220d f120981r = new EnumC25220d("DENY", 1, 1);

    /* renamed from: s */
    public static final EnumC25220d f120982s = new EnumC25220d("ACCEPT", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC25220d[] f120983t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f120984u;

    /* renamed from: p */
    private final int f120985p;

    /* renamed from: qc.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC25220d m130486a(int i11) {
            EnumC25220d enumC25220d;
            EnumC25220d[] values = EnumC25220d.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    enumC25220d = values[i12];
                    if (enumC25220d.m130485c() == i11) {
                        break;
                    }
                    i12++;
                } else {
                    enumC25220d = null;
                    break;
                }
            }
            if (enumC25220d == null) {
                return EnumC25220d.f120980q;
            }
            return enumC25220d;
        }
    }

    static {
        EnumC25220d[] m130484b = m130484b();
        f120983t = m130484b;
        f120984u = AbstractC30166b.m148796a(m130484b);
        Companion = new a(null);
    }

    private EnumC25220d(String str, int i11, int i12) {
        this.f120985p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25220d[] m130484b() {
        return new EnumC25220d[]{f120980q, f120981r, f120982s};
    }

    public static EnumC25220d valueOf(String str) {
        return (EnumC25220d) Enum.valueOf(EnumC25220d.class, str);
    }

    public static EnumC25220d[] values() {
        return (EnumC25220d[]) f120983t.clone();
    }

    /* renamed from: c */
    public final int m130485c() {
        return this.f120985p;
    }
}
