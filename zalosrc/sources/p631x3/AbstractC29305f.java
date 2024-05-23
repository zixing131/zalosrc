package p631x3;

import java.util.Arrays;
import java.util.Locale;
import p148f3.C18711c;
import p516t3.C26467a;

/* renamed from: x3.f */
/* loaded from: classes2.dex */
public abstract class AbstractC29305f {

    /* renamed from: a */
    final b f135741a;

    /* renamed from: b */
    final float[] f135742b;

    /* renamed from: c */
    private float[] f135743c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x3.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f135744a;

        /* renamed from: b */
        static final /* synthetic */ int[] f135745b;

        static {
            int[] iArr = new int[b.values().length];
            f135745b = iArr;
            try {
                iArr[b.RELATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f135745b[b.ABSOLUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.values().length];
            f135744a = iArr2;
            try {
                iArr2[g.f135749r.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f135744a[g.f135750s.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f135744a[g.f135751t.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f135744a[g.f135752u.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f135744a[g.f135753v.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f135744a[g.f135754w.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f135744a[g.f135755x.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f135744a[g.f135756y.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x3.f$b */
    /* loaded from: classes2.dex */
    public enum b {
        RELATIVE,
        ABSOLUTE
    }

    /* renamed from: x3.f$c */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC29305f {
        public c(b bVar, float[] fArr) {
            super(bVar, fArr);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: a */
        public void mo146410a(C26467a c26467a) {
            mo146411b(c26467a, this.f135741a, this.f135742b);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: b */
        protected void mo146411b(C26467a c26467a, b bVar, float[] fArr) {
            int i11 = a.f135745b[bVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c26467a.m136385b(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", bVar));
            }
            c26467a.m136392j(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
        }
    }

    /* renamed from: x3.f$d */
    /* loaded from: classes2.dex */
    public static class d extends AbstractC29305f {
        public d(b bVar, float[] fArr) {
            super(bVar, fArr);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: a */
        public void mo146410a(C26467a c26467a) {
            mo146411b(c26467a, this.f135741a, this.f135742b);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: b */
        protected void mo146411b(C26467a c26467a, b bVar, float[] fArr) {
            int i11 = a.f135745b[bVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c26467a.m136389f(fArr[0], fArr[1]);
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", bVar));
            }
            c26467a.m136393k(fArr[0], fArr[1]);
        }
    }

    /* renamed from: x3.f$e */
    /* loaded from: classes2.dex */
    public static class e extends AbstractC29305f {
        public e(b bVar, float[] fArr) {
            super(bVar, fArr);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: a */
        public void mo146410a(C26467a c26467a) {
            mo146411b(c26467a, this.f135741a, this.f135742b);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: b */
        protected void mo146411b(C26467a c26467a, b bVar, float[] fArr) {
            int i11 = a.f135745b[bVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c26467a.m136390g(fArr[0], fArr[1]);
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", bVar));
            }
            c26467a.m136394l(fArr[0], fArr[1]);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: h */
        public void mo146412h(AbstractC29305f abstractC29305f, float f11, C26467a c26467a) {
            if (abstractC29305f instanceof e) {
                super.mo146412h(abstractC29305f, f11, c26467a);
                return;
            }
            throw new IllegalArgumentException("MoveToCommand should only be interpolated with other instances of MoveToCommand");
        }
    }

    /* renamed from: x3.f$f */
    /* loaded from: classes2.dex */
    public static class f extends AbstractC29305f {
        public f(b bVar, float[] fArr) {
            super(bVar, fArr);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: a */
        public void mo146410a(C26467a c26467a) {
            mo146411b(c26467a, this.f135741a, this.f135742b);
        }

        @Override // p631x3.AbstractC29305f
        /* renamed from: b */
        protected void mo146411b(C26467a c26467a, b bVar, float[] fArr) {
            int i11 = a.f135745b[bVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    c26467a.m136391h(fArr[0], fArr[1], fArr[2], fArr[3]);
                    return;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "No such argument format %s", bVar));
            }
            c26467a.m136395m(fArr[0], fArr[1], fArr[2], fArr[3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: x3.f$g */
    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: r */
        public static final g f135749r;

        /* renamed from: s */
        public static final g f135750s;

        /* renamed from: t */
        public static final g f135751t;

        /* renamed from: u */
        public static final g f135752u;

        /* renamed from: v */
        public static final g f135753v;

        /* renamed from: w */
        public static final g f135754w;

        /* renamed from: x */
        public static final g f135755x;

        /* renamed from: y */
        public static final g f135756y;

        /* renamed from: z */
        private static final /* synthetic */ g[] f135757z;

        /* renamed from: p */
        public final b f135758p;

        /* renamed from: q */
        public final int f135759q;

        static {
            b bVar = b.RELATIVE;
            f135749r = new g("m", 0, bVar, 2);
            b bVar2 = b.ABSOLUTE;
            f135750s = new g("M", 1, bVar2, 2);
            f135751t = new g("q", 2, bVar, 4);
            f135752u = new g("Q", 3, bVar2, 4);
            f135753v = new g(C18711c.f94014e, 4, bVar, 6);
            f135754w = new g("C", 5, bVar2, 6);
            f135755x = new g("l", 6, bVar, 2);
            f135756y = new g("L", 7, bVar2, 2);
            f135757z = m146414b();
        }

        private g(String str, int i11, b bVar, int i12) {
            this.f135758p = bVar;
            this.f135759q = i12;
        }

        /* renamed from: b */
        private static /* synthetic */ g[] m146414b() {
            return new g[]{f135749r, f135750s, f135751t, f135752u, f135753v, f135754w, f135755x, f135756y};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f135757z.clone();
        }
    }

    public AbstractC29305f(b bVar, float[] fArr) {
        this.f135741a = bVar;
        this.f135742b = fArr;
    }

    /* renamed from: c */
    public static boolean m146404c(g gVar, float[] fArr) {
        if (gVar.f135759q == fArr.length) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static float[] m146405d(float[] fArr, float[] fArr2, float[] fArr3) {
        if (fArr2.length < fArr3.length) {
            if (fArr2.length == 2) {
                if (fArr3.length == 4) {
                    fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                    fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
                    fArr3[2] = fArr2[0];
                    fArr3[3] = fArr2[1];
                } else if (fArr3.length == 6) {
                    float f11 = fArr[0];
                    fArr3[0] = f11 + ((fArr2[0] - f11) / 3.0f);
                    float f12 = fArr[1];
                    fArr3[1] = f12 + ((fArr2[1] - f12) / 3.0f);
                    float f13 = fArr2[0];
                    fArr3[2] = ((fArr[0] - f13) / 3.0f) + f13;
                    float f14 = fArr2[1];
                    fArr3[3] = ((fArr[1] - f14) / 3.0f) + f14;
                    fArr3[4] = f13;
                    fArr3[5] = f14;
                } else {
                    throw new IllegalArgumentException(String.format("Unknown conversion from %d args to %d", Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)));
                }
            } else if (fArr2.length == 4) {
                if (fArr3.length == 6) {
                    float f15 = fArr[0];
                    fArr3[0] = f15 + ((fArr2[0] - f15) * 0.6666667f);
                    float f16 = fArr[1];
                    fArr3[1] = f16 + ((fArr2[1] - f16) * 0.6666667f);
                    float f17 = fArr2[2];
                    fArr3[2] = f17 + ((fArr2[0] - f17) * 0.6666667f);
                    float f18 = fArr2[3];
                    fArr3[3] = f18 + ((fArr2[1] - f18) * 0.6666667f);
                    fArr3[4] = fArr2[2];
                    fArr3[5] = fArr2[3];
                } else {
                    throw new IllegalArgumentException(String.format("Unknown conversion from %d args to %d", Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)));
                }
            } else {
                throw new IllegalArgumentException(String.format("Unknown conversion from %d args to %d", Integer.valueOf(fArr2.length), Integer.valueOf(fArr3.length)));
            }
            return fArr3;
        }
        throw new IllegalArgumentException("convertUp should only be called to convert a lower order argument array to a higher one.");
    }

    /* renamed from: e */
    public static AbstractC29305f m146406e(String str) {
        g valueOf = g.valueOf(str.substring(0, 1));
        String[] split = str.substring(1).split(",");
        float[] fArr = new float[split.length];
        int length = split.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            fArr[i12] = Float.parseFloat(split[i11]);
            i11++;
            i12++;
        }
        switch (a.f135744a[valueOf.ordinal()]) {
            case 1:
            case 2:
                if (m146404c(valueOf, fArr)) {
                    return new e(valueOf.f135758p, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand MoveTo requires two arguments, but got %s", Arrays.toString(fArr)));
            case 3:
            case 4:
                if (m146404c(valueOf, fArr)) {
                    return new f(valueOf.f135758p, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand QuadraticTo requires four arguments, but got %s", Arrays.toString(fArr)));
            case 5:
            case 6:
                if (m146404c(valueOf, fArr)) {
                    return new c(valueOf.f135758p, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand CubicTo requires six arguments, but got %s", Arrays.toString(fArr)));
            case 7:
            case 8:
                if (m146404c(valueOf, fArr)) {
                    return new d(valueOf.f135758p, fArr);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "VectorCommand LineTo requires two arguments, but got %s", Arrays.toString(fArr)));
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unhandled vector command: %s", str));
        }
    }

    /* renamed from: f */
    private int m146407f() {
        return this.f135742b.length;
    }

    /* renamed from: g */
    private float[] m146408g() {
        if (this.f135743c == null) {
            this.f135743c = new float[this.f135742b.length];
        }
        return this.f135743c;
    }

    /* renamed from: i */
    private static float m146409i(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* renamed from: a */
    public abstract void mo146410a(C26467a c26467a);

    /* renamed from: b */
    protected abstract void mo146411b(C26467a c26467a, b bVar, float[] fArr);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[LOOP:0: B:8:0x0056->B:9:0x0058, LOOP_END] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo146412h(AbstractC29305f abstractC29305f, float f11, C26467a c26467a) {
        float[] fArr;
        float[] fArr2;
        float[] m146408g;
        float[] m146408g2;
        AbstractC29305f abstractC29305f2;
        float[] fArr3;
        int length;
        int i11;
        if (this.f135741a == abstractC29305f.f135741a) {
            if (m146407f() > abstractC29305f.m146407f()) {
                fArr = this.f135742b;
                fArr2 = m146405d(c26467a.m136386c(), abstractC29305f.f135742b, m146408g());
                m146408g = m146408g();
            } else {
                if (m146407f() < abstractC29305f.m146407f()) {
                    float[] m146405d = m146405d(c26467a.m136386c(), this.f135742b, abstractC29305f.m146408g());
                    float[] fArr4 = abstractC29305f.f135742b;
                    m146408g2 = abstractC29305f.m146408g();
                    abstractC29305f2 = abstractC29305f;
                    fArr2 = fArr4;
                    fArr3 = m146405d;
                    length = m146408g2.length;
                    for (i11 = 0; i11 < length; i11++) {
                        m146408g2[i11] = m146409i(fArr3[i11], fArr2[i11], f11);
                    }
                    abstractC29305f2.mo146411b(c26467a, this.f135741a, m146408g2);
                    return;
                }
                fArr = this.f135742b;
                fArr2 = abstractC29305f.f135742b;
                m146408g = m146408g();
            }
            m146408g2 = m146408g;
            fArr3 = fArr;
            abstractC29305f2 = this;
            length = m146408g2.length;
            while (i11 < length) {
            }
            abstractC29305f2.mo146411b(c26467a, this.f135741a, m146408g2);
            return;
        }
        throw new IllegalArgumentException("Argument format must match between interpolated commands. RELATIVE and ABSOLUTE coordinates should stay consistent");
    }
}
