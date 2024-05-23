package com.google.protobuf;

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
/* renamed from: com.google.protobuf.u */
/* loaded from: classes3.dex */
public final class EnumC6834u {

    /* renamed from: A */
    public static final EnumC6834u f37485A;

    /* renamed from: B */
    public static final EnumC6834u f37486B;

    /* renamed from: C */
    private static final /* synthetic */ EnumC6834u[] f37487C;

    /* renamed from: s */
    public static final EnumC6834u f37488s;

    /* renamed from: t */
    public static final EnumC6834u f37489t;

    /* renamed from: u */
    public static final EnumC6834u f37490u;

    /* renamed from: v */
    public static final EnumC6834u f37491v;

    /* renamed from: w */
    public static final EnumC6834u f37492w;

    /* renamed from: x */
    public static final EnumC6834u f37493x;

    /* renamed from: y */
    public static final EnumC6834u f37494y;

    /* renamed from: z */
    public static final EnumC6834u f37495z;

    /* renamed from: p */
    private final Class f37496p;

    /* renamed from: q */
    private final Class f37497q;

    /* renamed from: r */
    private final Object f37498r;

    static {
        EnumC6834u enumC6834u = new EnumC6834u("VOID", 0, Void.class, Void.class, null);
        f37488s = enumC6834u;
        Class cls = Integer.TYPE;
        EnumC6834u enumC6834u2 = new EnumC6834u("INT", 1, cls, Integer.class, 0);
        f37489t = enumC6834u2;
        EnumC6834u enumC6834u3 = new EnumC6834u("LONG", 2, Long.TYPE, Long.class, 0L);
        f37490u = enumC6834u3;
        EnumC6834u enumC6834u4 = new EnumC6834u("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f37491v = enumC6834u4;
        EnumC6834u enumC6834u5 = new EnumC6834u("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f37492w = enumC6834u5;
        EnumC6834u enumC6834u6 = new EnumC6834u("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f37493x = enumC6834u6;
        EnumC6834u enumC6834u7 = new EnumC6834u("STRING", 6, String.class, String.class, "");
        f37494y = enumC6834u7;
        EnumC6834u enumC6834u8 = new EnumC6834u("BYTE_STRING", 7, AbstractC6799f.class, AbstractC6799f.class, AbstractC6799f.f37259q);
        f37495z = enumC6834u8;
        EnumC6834u enumC6834u9 = new EnumC6834u("ENUM", 8, cls, Integer.class, null);
        f37485A = enumC6834u9;
        EnumC6834u enumC6834u10 = new EnumC6834u("MESSAGE", 9, Object.class, Object.class, null);
        f37486B = enumC6834u10;
        f37487C = new EnumC6834u[]{enumC6834u, enumC6834u2, enumC6834u3, enumC6834u4, enumC6834u5, enumC6834u6, enumC6834u7, enumC6834u8, enumC6834u9, enumC6834u10};
    }

    private EnumC6834u(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f37496p = cls;
        this.f37497q = cls2;
        this.f37498r = obj;
    }

    public static EnumC6834u valueOf(String str) {
        return (EnumC6834u) Enum.valueOf(EnumC6834u.class, str);
    }

    public static EnumC6834u[] values() {
        return (EnumC6834u[]) f37487C.clone();
    }

    /* renamed from: b */
    public Class m35145b() {
        return this.f37497q;
    }
}
