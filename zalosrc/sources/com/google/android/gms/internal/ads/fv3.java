package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 't' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class fv3 {

    /* renamed from: A */
    public static final fv3 f20289A;

    /* renamed from: B */
    public static final fv3 f20290B;

    /* renamed from: C */
    private static final /* synthetic */ fv3[] f20291C;

    /* renamed from: s */
    public static final fv3 f20292s;

    /* renamed from: t */
    public static final fv3 f20293t;

    /* renamed from: u */
    public static final fv3 f20294u;

    /* renamed from: v */
    public static final fv3 f20295v;

    /* renamed from: w */
    public static final fv3 f20296w;

    /* renamed from: x */
    public static final fv3 f20297x;

    /* renamed from: y */
    public static final fv3 f20298y;

    /* renamed from: z */
    public static final fv3 f20299z;

    /* renamed from: p */
    private final Class f20300p;

    /* renamed from: q */
    private final Class f20301q;

    /* renamed from: r */
    private final Object f20302r;

    static {
        fv3 fv3Var = new fv3("VOID", 0, Void.class, Void.class, null);
        f20292s = fv3Var;
        Class cls = Integer.TYPE;
        fv3 fv3Var2 = new fv3("INT", 1, cls, Integer.class, 0);
        f20293t = fv3Var2;
        fv3 fv3Var3 = new fv3("LONG", 2, Long.TYPE, Long.class, 0L);
        f20294u = fv3Var3;
        fv3 fv3Var4 = new fv3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f20295v = fv3Var4;
        fv3 fv3Var5 = new fv3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f20296w = fv3Var5;
        fv3 fv3Var6 = new fv3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f20297x = fv3Var6;
        fv3 fv3Var7 = new fv3("STRING", 6, String.class, String.class, "");
        f20298y = fv3Var7;
        fv3 fv3Var8 = new fv3("BYTE_STRING", 7, mt3.class, mt3.class, mt3.f24751q);
        f20299z = fv3Var8;
        fv3 fv3Var9 = new fv3("ENUM", 8, cls, Integer.class, null);
        f20289A = fv3Var9;
        fv3 fv3Var10 = new fv3("MESSAGE", 9, Object.class, Object.class, null);
        f20290B = fv3Var10;
        f20291C = new fv3[]{fv3Var, fv3Var2, fv3Var3, fv3Var4, fv3Var5, fv3Var6, fv3Var7, fv3Var8, fv3Var9, fv3Var10};
    }

    private fv3(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f20300p = cls;
        this.f20301q = cls2;
        this.f20302r = obj;
    }

    public static fv3[] values() {
        return (fv3[]) f20291C.clone();
    }

    /* renamed from: b */
    public final Class m22192b() {
        return this.f20301q;
    }
}
