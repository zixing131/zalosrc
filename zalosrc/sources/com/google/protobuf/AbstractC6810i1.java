package com.google.protobuf;

/* renamed from: com.google.protobuf.i1 */
/* loaded from: classes3.dex */
public abstract class AbstractC6810i1 {

    /* renamed from: a */
    static final int f37315a = m34983c(1, 3);

    /* renamed from: b */
    static final int f37316b = m34983c(1, 4);

    /* renamed from: c */
    static final int f37317c = m34983c(2, 0);

    /* renamed from: d */
    static final int f37318d = m34983c(3, 2);

    /* renamed from: com.google.protobuf.i1$b */
    /* loaded from: classes3.dex */
    public static class b extends Enum {

        /* renamed from: A */
        public static final b f37319A;

        /* renamed from: B */
        public static final b f37320B;

        /* renamed from: C */
        public static final b f37321C;

        /* renamed from: D */
        public static final b f37322D;

        /* renamed from: E */
        public static final b f37323E;

        /* renamed from: F */
        public static final b f37324F;

        /* renamed from: G */
        public static final b f37325G;

        /* renamed from: H */
        public static final b f37326H;

        /* renamed from: I */
        public static final b f37327I;

        /* renamed from: J */
        private static final /* synthetic */ b[] f37328J;

        /* renamed from: r */
        public static final b f37329r;

        /* renamed from: s */
        public static final b f37330s;

        /* renamed from: t */
        public static final b f37331t;

        /* renamed from: u */
        public static final b f37332u;

        /* renamed from: v */
        public static final b f37333v;

        /* renamed from: w */
        public static final b f37334w;

        /* renamed from: x */
        public static final b f37335x;

        /* renamed from: y */
        public static final b f37336y;

        /* renamed from: z */
        public static final b f37337z;

        /* renamed from: p */
        private final c f37338p;

        /* renamed from: q */
        private final int f37339q;

        /* renamed from: com.google.protobuf.i1$b$a */
        /* loaded from: classes3.dex */
        enum a extends b {
            a(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* renamed from: com.google.protobuf.i1$b$b */
        /* loaded from: classes3.dex */
        enum C32696b extends b {
            C32696b(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* renamed from: com.google.protobuf.i1$b$c */
        /* loaded from: classes3.dex */
        enum c extends b {
            c(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        /* renamed from: com.google.protobuf.i1$b$d */
        /* loaded from: classes3.dex */
        enum d extends b {
            d(String str, int i11, c cVar, int i12) {
                super(str, i11, cVar, i12);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f37329r = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f37330s = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f37331t = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f37332u = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f37333v = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f37334w = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f37335x = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f37336y = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f37337z = aVar;
            c cVar3 = c.MESSAGE;
            C32696b c32696b = new C32696b("GROUP", 9, cVar3, 3);
            f37319A = c32696b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f37320B = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f37321C = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f37322D = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f37323E = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f37324F = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f37325G = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f37326H = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f37327I = bVar14;
            f37328J = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c32696b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i11, c cVar, int i12, a aVar) {
            this(str, i11, cVar, i12);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37328J.clone();
        }

        /* renamed from: b */
        public c m34984b() {
            return this.f37338p;
        }

        /* renamed from: c */
        public int m34985c() {
            return this.f37339q;
        }

        private b(String str, int i11, c cVar, int i12) {
            super(str, i11);
            this.f37338p = cVar;
            this.f37339q = i12;
        }
    }

    /* renamed from: com.google.protobuf.i1$c */
    /* loaded from: classes3.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC6799f.f37259q),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: p */
        private final Object f37350p;

        c(Object obj) {
            this.f37350p = obj;
        }
    }

    /* renamed from: a */
    public static int m34981a(int i11) {
        return i11 >>> 3;
    }

    /* renamed from: b */
    public static int m34982b(int i11) {
        return i11 & 7;
    }

    /* renamed from: c */
    public static int m34983c(int i11, int i12) {
        return (i11 << 3) | i12;
    }
}
