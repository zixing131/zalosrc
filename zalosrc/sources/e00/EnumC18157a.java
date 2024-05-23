package e00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e00.a */
/* loaded from: classes4.dex */
public abstract class EnumC18157a {

    /* renamed from: p */
    public static final EnumC18157a f91819p;

    /* renamed from: q */
    public static final EnumC18157a f91820q;

    /* renamed from: r */
    public static final EnumC18157a f91821r;

    /* renamed from: s */
    public static final EnumC18157a f91822s;

    /* renamed from: t */
    public static final EnumC18157a f91823t;

    /* renamed from: u */
    public static final EnumC18157a f91824u;

    /* renamed from: v */
    private static final /* synthetic */ EnumC18157a[] f91825v;

    /* renamed from: e00.a$a */
    /* loaded from: classes4.dex */
    enum a extends EnumC18157a {
        a(String str, int i11) {
            super(str, i11, null);
        }
    }

    static {
        a aVar = new a("RGB", 0);
        f91819p = aVar;
        EnumC18157a enumC18157a = new EnumC18157a("HSV", 1) { // from class: e00.a.b
            {
                a aVar2 = null;
            }
        };
        f91820q = enumC18157a;
        EnumC18157a enumC18157a2 = new EnumC18157a("HUE", 2) { // from class: e00.a.c
            {
                a aVar2 = null;
            }
        };
        f91821r = enumC18157a2;
        EnumC18157a enumC18157a3 = new EnumC18157a("SATURATION", 3) { // from class: e00.a.d
            {
                a aVar2 = null;
            }
        };
        f91822s = enumC18157a3;
        EnumC18157a enumC18157a4 = new EnumC18157a("CUSTOM", 4) { // from class: e00.a.e
            {
                a aVar2 = null;
            }
        };
        f91823t = enumC18157a4;
        EnumC18157a enumC18157a5 = new EnumC18157a("RGBA", 5) { // from class: e00.a.f
            {
                a aVar2 = null;
            }
        };
        f91824u = enumC18157a5;
        f91825v = new EnumC18157a[]{aVar, enumC18157a, enumC18157a2, enumC18157a3, enumC18157a4, enumC18157a5};
    }

    private EnumC18157a(String str, int i11) {
    }

    public static EnumC18157a valueOf(String str) {
        return (EnumC18157a) Enum.valueOf(EnumC18157a.class, str);
    }

    public static EnumC18157a[] values() {
        return (EnumC18157a[]) f91825v.clone();
    }

    /* synthetic */ EnumC18157a(String str, int i11, a aVar) {
        this(str, i11);
    }
}
