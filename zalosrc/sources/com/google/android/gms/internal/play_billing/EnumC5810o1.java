package com.google.android.gms.internal.play_billing;

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
/* renamed from: com.google.android.gms.internal.play_billing.o1 */
/* loaded from: classes2.dex */
public final class EnumC5810o1 {

    /* renamed from: A */
    public static final EnumC5810o1 f33382A;

    /* renamed from: B */
    public static final EnumC5810o1 f33383B;

    /* renamed from: C */
    private static final /* synthetic */ EnumC5810o1[] f33384C;

    /* renamed from: s */
    public static final EnumC5810o1 f33385s;

    /* renamed from: t */
    public static final EnumC5810o1 f33386t;

    /* renamed from: u */
    public static final EnumC5810o1 f33387u;

    /* renamed from: v */
    public static final EnumC5810o1 f33388v;

    /* renamed from: w */
    public static final EnumC5810o1 f33389w;

    /* renamed from: x */
    public static final EnumC5810o1 f33390x;

    /* renamed from: y */
    public static final EnumC5810o1 f33391y;

    /* renamed from: z */
    public static final EnumC5810o1 f33392z;

    /* renamed from: p */
    private final Class f33393p;

    /* renamed from: q */
    private final Class f33394q;

    /* renamed from: r */
    private final Object f33395r;

    static {
        EnumC5810o1 enumC5810o1 = new EnumC5810o1("VOID", 0, Void.class, Void.class, null);
        f33385s = enumC5810o1;
        Class cls = Integer.TYPE;
        EnumC5810o1 enumC5810o12 = new EnumC5810o1("INT", 1, cls, Integer.class, 0);
        f33386t = enumC5810o12;
        EnumC5810o1 enumC5810o13 = new EnumC5810o1("LONG", 2, Long.TYPE, Long.class, 0L);
        f33387u = enumC5810o13;
        EnumC5810o1 enumC5810o14 = new EnumC5810o1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f33388v = enumC5810o14;
        EnumC5810o1 enumC5810o15 = new EnumC5810o1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f33389w = enumC5810o15;
        EnumC5810o1 enumC5810o16 = new EnumC5810o1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f33390x = enumC5810o16;
        EnumC5810o1 enumC5810o17 = new EnumC5810o1("STRING", 6, String.class, String.class, "");
        f33391y = enumC5810o17;
        EnumC5810o1 enumC5810o18 = new EnumC5810o1("BYTE_STRING", 7, AbstractC5803n0.class, AbstractC5803n0.class, AbstractC5803n0.f33371q);
        f33392z = enumC5810o18;
        EnumC5810o1 enumC5810o19 = new EnumC5810o1("ENUM", 8, cls, Integer.class, null);
        f33382A = enumC5810o19;
        EnumC5810o1 enumC5810o110 = new EnumC5810o1("MESSAGE", 9, Object.class, Object.class, null);
        f33383B = enumC5810o110;
        f33384C = new EnumC5810o1[]{enumC5810o1, enumC5810o12, enumC5810o13, enumC5810o14, enumC5810o15, enumC5810o16, enumC5810o17, enumC5810o18, enumC5810o19, enumC5810o110};
    }

    private EnumC5810o1(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f33393p = cls;
        this.f33394q = cls2;
        this.f33395r = obj;
    }

    public static EnumC5810o1[] values() {
        return (EnumC5810o1[]) f33384C.clone();
    }

    /* renamed from: b */
    public final Class m30420b() {
        return this.f33394q;
    }
}
