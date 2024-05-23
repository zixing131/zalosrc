package com.google.android.gms.internal.measurement;

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
/* renamed from: com.google.android.gms.internal.measurement.ba */
/* loaded from: classes2.dex */
public final class EnumC5307ba {

    /* renamed from: A */
    public static final EnumC5307ba f32278A;

    /* renamed from: B */
    public static final EnumC5307ba f32279B;

    /* renamed from: C */
    private static final /* synthetic */ EnumC5307ba[] f32280C;

    /* renamed from: s */
    public static final EnumC5307ba f32281s;

    /* renamed from: t */
    public static final EnumC5307ba f32282t;

    /* renamed from: u */
    public static final EnumC5307ba f32283u;

    /* renamed from: v */
    public static final EnumC5307ba f32284v;

    /* renamed from: w */
    public static final EnumC5307ba f32285w;

    /* renamed from: x */
    public static final EnumC5307ba f32286x;

    /* renamed from: y */
    public static final EnumC5307ba f32287y;

    /* renamed from: z */
    public static final EnumC5307ba f32288z;

    /* renamed from: p */
    private final Class f32289p;

    /* renamed from: q */
    private final Class f32290q;

    /* renamed from: r */
    private final Object f32291r;

    static {
        EnumC5307ba enumC5307ba = new EnumC5307ba("VOID", 0, Void.class, Void.class, null);
        f32281s = enumC5307ba;
        Class cls = Integer.TYPE;
        EnumC5307ba enumC5307ba2 = new EnumC5307ba("INT", 1, cls, Integer.class, 0);
        f32282t = enumC5307ba2;
        EnumC5307ba enumC5307ba3 = new EnumC5307ba("LONG", 2, Long.TYPE, Long.class, 0L);
        f32283u = enumC5307ba3;
        EnumC5307ba enumC5307ba4 = new EnumC5307ba("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f32284v = enumC5307ba4;
        EnumC5307ba enumC5307ba5 = new EnumC5307ba("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f32285w = enumC5307ba5;
        EnumC5307ba enumC5307ba6 = new EnumC5307ba("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f32286x = enumC5307ba6;
        EnumC5307ba enumC5307ba7 = new EnumC5307ba("STRING", 6, String.class, String.class, "");
        f32287y = enumC5307ba7;
        EnumC5307ba enumC5307ba8 = new EnumC5307ba("BYTE_STRING", 7, AbstractC5679x8.class, AbstractC5679x8.class, AbstractC5679x8.f32911q);
        f32288z = enumC5307ba8;
        EnumC5307ba enumC5307ba9 = new EnumC5307ba("ENUM", 8, cls, Integer.class, null);
        f32278A = enumC5307ba9;
        EnumC5307ba enumC5307ba10 = new EnumC5307ba("MESSAGE", 9, Object.class, Object.class, null);
        f32279B = enumC5307ba10;
        f32280C = new EnumC5307ba[]{enumC5307ba, enumC5307ba2, enumC5307ba3, enumC5307ba4, enumC5307ba5, enumC5307ba6, enumC5307ba7, enumC5307ba8, enumC5307ba9, enumC5307ba10};
    }

    private EnumC5307ba(String str, int i11, Class cls, Class cls2, Object obj) {
        this.f32289p = cls;
        this.f32290q = cls2;
        this.f32291r = obj;
    }

    public static EnumC5307ba[] values() {
        return (EnumC5307ba[]) f32280C.clone();
    }

    /* renamed from: b */
    public final Class m28951b() {
        return this.f32290q;
    }
}
