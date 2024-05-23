package p476r9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r9.k */
/* loaded from: classes3.dex */
public abstract class EnumC25703k {

    /* renamed from: q */
    public static final EnumC25703k f122720q;

    /* renamed from: r */
    public static final EnumC25703k f122721r;

    /* renamed from: s */
    public static final EnumC25703k f122722s;

    /* renamed from: t */
    public static final EnumC25703k f122723t;

    /* renamed from: u */
    public static final EnumC25703k f122724u;

    /* renamed from: v */
    private static final /* synthetic */ EnumC25703k[] f122725v;

    /* renamed from: p */
    long f122726p;

    /* renamed from: r9.k$a */
    /* loaded from: classes3.dex */
    enum a extends EnumC25703k {
        a(String str, int i11, long j11) {
            super(str, i11, j11, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        f122720q = aVar;
        EnumC25703k enumC25703k = new EnumC25703k("GIGABYTES", 1, 1073741824L) { // from class: r9.k.b
            {
                a aVar2 = null;
            }
        };
        f122721r = enumC25703k;
        EnumC25703k enumC25703k2 = new EnumC25703k("MEGABYTES", 2, 1048576L) { // from class: r9.k.c
            {
                a aVar2 = null;
            }
        };
        f122722s = enumC25703k2;
        EnumC25703k enumC25703k3 = new EnumC25703k("KILOBYTES", 3, 1024L) { // from class: r9.k.d
            {
                a aVar2 = null;
            }
        };
        f122723t = enumC25703k3;
        EnumC25703k enumC25703k4 = new EnumC25703k("BYTES", 4, 1L) { // from class: r9.k.e
            {
                a aVar2 = null;
            }
        };
        f122724u = enumC25703k4;
        f122725v = new EnumC25703k[]{aVar, enumC25703k, enumC25703k2, enumC25703k3, enumC25703k4};
    }

    /* synthetic */ EnumC25703k(String str, int i11, long j11, a aVar) {
        this(str, i11, j11);
    }

    public static EnumC25703k valueOf(String str) {
        return (EnumC25703k) Enum.valueOf(EnumC25703k.class, str);
    }

    public static EnumC25703k[] values() {
        return (EnumC25703k[]) f122725v.clone();
    }

    /* renamed from: b */
    public long m132617b(long j11) {
        return (j11 * this.f122726p) / f122723t.f122726p;
    }

    private EnumC25703k(String str, int i11, long j11) {
        this.f122726p = j11;
    }
}
