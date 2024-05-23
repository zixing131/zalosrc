package com.zing.zalo.uicontrol.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import com.zing.zalo.uicontrol.svg.C16652a;
import com.zing.zalo.uicontrol.svg.C16653b;
import com.zing.zalo.uicontrol.svg.C16654c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* renamed from: com.zing.zalo.uicontrol.svg.d */
/* loaded from: classes4.dex */
public class C16655d {

    /* renamed from: l */
    static HashSet f84228l;

    /* renamed from: a */
    Canvas f84229a;

    /* renamed from: b */
    C16654c.b f84230b;

    /* renamed from: c */
    float f84231c;

    /* renamed from: d */
    boolean f84232d;

    /* renamed from: e */
    C16654c f84233e;

    /* renamed from: f */
    h f84234f;

    /* renamed from: g */
    Stack f84235g;

    /* renamed from: h */
    Stack f84236h;

    /* renamed from: i */
    Stack f84237i;

    /* renamed from: j */
    Stack f84238j;

    /* renamed from: k */
    Stack f84239k;

    /* renamed from: com.zing.zalo.uicontrol.svg.d$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f84240a;

        /* renamed from: b */
        static final /* synthetic */ int[] f84241b;

        /* renamed from: c */
        static final /* synthetic */ int[] f84242c;

        /* renamed from: d */
        static final /* synthetic */ int[] f84243d;

        static {
            int[] iArr = new int[C16654c.e0.a.values().length];
            f84243d = iArr;
            try {
                iArr[C16654c.e0.a.EvenOdd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84243d[C16654c.e0.a.NonZero.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C16654c.e0.d.values().length];
            f84242c = iArr2;
            try {
                iArr2[C16654c.e0.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84242c[C16654c.e0.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84242c[C16654c.e0.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[C16654c.e0.c.values().length];
            f84241b = iArr3;
            try {
                iArr3[C16654c.e0.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84241b[C16654c.e0.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84241b[C16654c.e0.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[C16653b.a.values().length];
            f84240a = iArr4;
            try {
                iArr4[C16653b.a.XMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84240a[C16653b.a.XMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f84240a[C16653b.a.XMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f84240a[C16653b.a.XMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f84240a[C16653b.a.XMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f84240a[C16653b.a.XMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f84240a[C16653b.a.XMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f84240a[C16653b.a.XMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$b */
    /* loaded from: classes4.dex */
    public class b implements C16654c.x {

        /* renamed from: b */
        float f84245b;

        /* renamed from: c */
        float f84246c;

        /* renamed from: h */
        boolean f84251h;

        /* renamed from: a */
        List f84244a = new ArrayList();

        /* renamed from: d */
        c f84247d = null;

        /* renamed from: e */
        boolean f84248e = false;

        /* renamed from: f */
        boolean f84249f = true;

        /* renamed from: g */
        int f84250g = -1;

        public b(C16654c.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.m88542h(this);
            if (this.f84251h) {
                this.f84247d.m88644b((c) this.f84244a.get(this.f84250g));
                this.f84244a.set(this.f84250g, this.f84247d);
                this.f84251h = false;
            }
            c cVar = this.f84247d;
            if (cVar != null) {
                this.f84244a.add(cVar);
            }
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: a */
        public void mo88537a(float f11, float f12, float f13, float f14) {
            this.f84247d.m88643a(f11, f12);
            this.f84244a.add(this.f84247d);
            this.f84247d = new c(f13, f14, f13 - f11, f14 - f12);
            this.f84251h = false;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: b */
        public void mo88538b(float f11, float f12) {
            if (this.f84251h) {
                this.f84247d.m88644b((c) this.f84244a.get(this.f84250g));
                this.f84244a.set(this.f84250g, this.f84247d);
                this.f84251h = false;
            }
            c cVar = this.f84247d;
            if (cVar != null) {
                this.f84244a.add(cVar);
            }
            this.f84245b = f11;
            this.f84246c = f12;
            this.f84247d = new c(f11, f12, 0.0f, 0.0f);
            this.f84250g = this.f84244a.size();
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: c */
        public void mo88539c(float f11, float f12, float f13, float f14, float f15, float f16) {
            if (this.f84249f || this.f84248e) {
                this.f84247d.m88643a(f11, f12);
                this.f84244a.add(this.f84247d);
                this.f84248e = false;
            }
            this.f84247d = new c(f15, f16, f15 - f13, f16 - f14);
            this.f84251h = false;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        public void close() {
            this.f84244a.add(this.f84247d);
            mo88541e(this.f84245b, this.f84246c);
            this.f84251h = true;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: d */
        public void mo88540d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            this.f84248e = true;
            this.f84249f = false;
            c cVar = this.f84247d;
            C16655d.m88548f(cVar.f84253a, cVar.f84254b, f11, f12, f13, z11, z12, f14, f15, this);
            this.f84249f = true;
            this.f84251h = false;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: e */
        public void mo88541e(float f11, float f12) {
            this.f84247d.m88643a(f11, f12);
            this.f84244a.add(this.f84247d);
            c cVar = this.f84247d;
            this.f84247d = new c(f11, f12, f11 - cVar.f84253a, f12 - cVar.f84254b);
            this.f84251h = false;
        }

        /* renamed from: f */
        public List m88642f() {
            return this.f84244a;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        public float f84253a;

        /* renamed from: b */
        public float f84254b;

        /* renamed from: c */
        public float f84255c;

        /* renamed from: d */
        public float f84256d;

        public c(float f11, float f12, float f13, float f14) {
            this.f84255c = 0.0f;
            this.f84256d = 0.0f;
            this.f84253a = f11;
            this.f84254b = f12;
            double sqrt = Math.sqrt((f13 * f13) + (f14 * f14));
            if (sqrt != 0.0d) {
                this.f84255c = (float) (f13 / sqrt);
                this.f84256d = (float) (f14 / sqrt);
            }
        }

        /* renamed from: a */
        public void m88643a(float f11, float f12) {
            float f13 = f11 - this.f84253a;
            float f14 = f12 - this.f84254b;
            double sqrt = Math.sqrt((f13 * f13) + (f14 * f14));
            if (sqrt != 0.0d) {
                this.f84255c += (float) (f13 / sqrt);
                this.f84256d += (float) (f14 / sqrt);
            }
        }

        /* renamed from: b */
        public void m88644b(c cVar) {
            this.f84255c += cVar.f84255c;
            this.f84256d += cVar.f84256d;
        }

        public String toString() {
            return "(" + this.f84253a + "," + this.f84254b + " " + this.f84255c + "," + this.f84256d + ")";
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$d */
    /* loaded from: classes4.dex */
    public static class d implements C16654c.x {

        /* renamed from: a */
        Path f84257a = new Path();

        /* renamed from: b */
        float f84258b;

        /* renamed from: c */
        float f84259c;

        public d(C16654c.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.m88542h(this);
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: a */
        public void mo88537a(float f11, float f12, float f13, float f14) {
            this.f84257a.quadTo(f11, f12, f13, f14);
            this.f84258b = f13;
            this.f84259c = f14;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: b */
        public void mo88538b(float f11, float f12) {
            this.f84257a.moveTo(f11, f12);
            this.f84258b = f11;
            this.f84259c = f12;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: c */
        public void mo88539c(float f11, float f12, float f13, float f14, float f15, float f16) {
            this.f84257a.cubicTo(f11, f12, f13, f14, f15, f16);
            this.f84258b = f15;
            this.f84259c = f16;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        public void close() {
            this.f84257a.close();
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: d */
        public void mo88540d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            C16655d.m88548f(this.f84258b, this.f84259c, f11, f12, f13, z11, z12, f14, f15, this);
            this.f84258b = f14;
            this.f84259c = f15;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16654c.x
        /* renamed from: e */
        public void mo88541e(float f11, float f12) {
            this.f84257a.lineTo(f11, f12);
            this.f84258b = f11;
            this.f84259c = f12;
        }

        /* renamed from: f */
        public Path m88645f() {
            return this.f84257a;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$e */
    /* loaded from: classes4.dex */
    public class e extends f {

        /* renamed from: d */
        Path f84260d;

        public e(Path path, float f11, float f12) {
            super(f11, f12);
            this.f84260d = path;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.f, com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: b */
        public void mo88646b(String str) {
            if (C16655d.this.m88585R0()) {
                C16655d c16655d = C16655d.this;
                h hVar = c16655d.f84234f;
                if (hVar.f84270q) {
                    c16655d.f84229a.drawTextOnPath(str, this.f84260d, this.f84262a, this.f84263b, hVar.f84272s);
                }
                C16655d c16655d2 = C16655d.this;
                h hVar2 = c16655d2.f84234f;
                if (hVar2.f84271r) {
                    c16655d2.f84229a.drawTextOnPath(str, this.f84260d, this.f84262a, this.f84263b, hVar2.f84273t);
                }
            }
            this.f84262a += C16655d.this.f84234f.f84272s.measureText(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$f */
    /* loaded from: classes4.dex */
    public class f extends j {

        /* renamed from: a */
        public float f84262a;

        /* renamed from: b */
        public float f84263b;

        public f(float f11, float f12) {
            this.f84262a = f11;
            this.f84263b = f12;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: b */
        public void mo88646b(String str) {
            C16655d.m88550v("TextSequence render", new Object[0]);
            if (C16655d.this.m88585R0()) {
                C16655d c16655d = C16655d.this;
                h hVar = c16655d.f84234f;
                if (hVar.f84270q) {
                    c16655d.f84229a.drawText(str, this.f84262a, this.f84263b, hVar.f84272s);
                }
                C16655d c16655d2 = C16655d.this;
                h hVar2 = c16655d2.f84234f;
                if (hVar2.f84271r) {
                    c16655d2.f84229a.drawText(str, this.f84262a, this.f84263b, hVar2.f84273t);
                }
            }
            this.f84262a += C16655d.this.f84234f.f84272s.measureText(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$g */
    /* loaded from: classes4.dex */
    public class g extends j {

        /* renamed from: a */
        public float f84265a;

        /* renamed from: b */
        public float f84266b;

        /* renamed from: c */
        public Path f84267c;

        public g(float f11, float f12, Path path) {
            this.f84265a = f11;
            this.f84266b = f12;
            this.f84267c = path;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: a */
        public boolean mo88647a(C16654c.y0 y0Var) {
            if (y0Var instanceof C16654c.z0) {
                C16655d.m88547S0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
                return false;
            }
            return true;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: b */
        public void mo88646b(String str) {
            if (C16655d.this.m88585R0()) {
                Path path = new Path();
                C16655d.this.f84234f.f84272s.getTextPath(str, 0, str.length(), this.f84265a, this.f84266b, path);
                this.f84267c.addPath(path);
            }
            this.f84265a += C16655d.this.f84234f.f84272s.measureText(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$h */
    /* loaded from: classes4.dex */
    public static class h implements Cloneable {

        /* renamed from: p */
        public C16654c.e0 f84269p;

        /* renamed from: q */
        public boolean f84270q;

        /* renamed from: r */
        public boolean f84271r;

        /* renamed from: s */
        public Paint f84272s;

        /* renamed from: t */
        public Paint f84273t;

        /* renamed from: u */
        public C16654c.b f84274u;

        /* renamed from: v */
        public C16654c.b f84275v;

        /* renamed from: w */
        public boolean f84276w;

        /* renamed from: x */
        public boolean f84277x;

        public h() {
            Paint paint = new Paint();
            this.f84272s = paint;
            paint.setFlags(385);
            this.f84272s.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f84272s;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f84273t = paint3;
            paint3.setFlags(385);
            this.f84273t.setStyle(Paint.Style.STROKE);
            this.f84273t.setTypeface(typeface);
            this.f84269p = C16654c.e0.m88502a();
        }

        protected Object clone() {
            try {
                h hVar = (h) super.clone();
                hVar.f84269p = (C16654c.e0) this.f84269p.clone();
                hVar.f84272s = new Paint(this.f84272s);
                hVar.f84273t = new Paint(this.f84273t);
                return hVar;
            } catch (CloneNotSupportedException e11) {
                throw new InternalError(e11.toString());
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$i */
    /* loaded from: classes4.dex */
    public class i extends j {

        /* renamed from: a */
        float f84278a;

        /* renamed from: b */
        float f84279b;

        /* renamed from: c */
        RectF f84280c = new RectF();

        public i(float f11, float f12) {
            this.f84278a = f11;
            this.f84279b = f12;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: a */
        public boolean mo88647a(C16654c.y0 y0Var) {
            if (!(y0Var instanceof C16654c.z0)) {
                return true;
            }
            C16654c.z0 z0Var = (C16654c.z0) y0Var;
            C16654c.n0 m88490k = y0Var.f84171a.m88490k(z0Var.f84225o);
            if (m88490k == null) {
                C16655d.m88545C("TextPath path reference '%s' not found", z0Var.f84225o);
                return false;
            }
            C16654c.v vVar = (C16654c.v) m88490k;
            Path m88645f = new d(vVar.f84208o).m88645f();
            Matrix matrix = vVar.f84160n;
            if (matrix != null) {
                m88645f.transform(matrix);
            }
            RectF rectF = new RectF();
            m88645f.computeBounds(rectF, true);
            this.f84280c.union(rectF);
            return false;
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: b */
        public void mo88646b(String str) {
            if (C16655d.this.m88585R0()) {
                Rect rect = new Rect();
                C16655d.this.f84234f.f84272s.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f84278a, this.f84279b);
                this.f84280c.union(rectF);
            }
            this.f84278a += C16655d.this.f84234f.f84272s.measureText(str);
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$j */
    /* loaded from: classes4.dex */
    public static abstract class j {
        j() {
        }

        /* renamed from: a */
        public boolean mo88647a(C16654c.y0 y0Var) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo88646b(String str);
    }

    /* renamed from: com.zing.zalo.uicontrol.svg.d$k */
    /* loaded from: classes4.dex */
    public class k extends j {

        /* renamed from: a */
        public float f84282a = 0.0f;

        k() {
        }

        @Override // com.zing.zalo.uicontrol.svg.C16655d.j
        /* renamed from: b */
        public void mo88646b(String str) {
            this.f84282a += C16655d.this.f84234f.f84272s.measureText(str);
        }
    }

    public C16655d(Canvas canvas, C16654c.b bVar, float f11) {
        this.f84229a = canvas;
        this.f84231c = f11;
        this.f84230b = bVar;
    }

    /* renamed from: C */
    static void m88545C(String str, Object... objArr) {
    }

    /* renamed from: S */
    static synchronized void m88546S() {
        synchronized (C16655d.class) {
            HashSet hashSet = new HashSet();
            f84228l = hashSet;
            hashSet.add("Structure");
            f84228l.add("BasicStructure");
            f84228l.add("ConditionalProcessing");
            f84228l.add("Image");
            f84228l.add("Style");
            f84228l.add("ViewportAttribute");
            f84228l.add("Shape");
            f84228l.add("BasicText");
            f84228l.add("PaintAttribute");
            f84228l.add("BasicPaintAttribute");
            f84228l.add("OpacityAttribute");
            f84228l.add("BasicGraphicsAttribute");
            f84228l.add("Marker");
            f84228l.add("Gradient");
            f84228l.add("Pattern");
            f84228l.add("Clip");
            f84228l.add("BasicClip");
            f84228l.add("Mask");
            f84228l.add("View");
        }
    }

    /* renamed from: S0 */
    static void m88547S0(String str, Object... objArr) {
    }

    /* renamed from: f */
    static void m88548f(float f11, float f12, float f13, float f14, float f15, boolean z11, boolean z12, float f16, float f17, C16654c.x xVar) {
        float f18;
        float f19;
        float f21;
        float f22;
        double d11;
        if (f11 == f16 && f12 == f17) {
            return;
        }
        if (f13 != 0.0f && f14 != 0.0f) {
            float abs = Math.abs(f13);
            float abs2 = Math.abs(f14);
            double radians = (float) Math.toRadians(f15 % 360.0d);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f23 = (f11 - f16) / 2.0f;
            float f24 = (f12 - f17) / 2.0f;
            float f25 = (cos * f23) + (sin * f24);
            float f26 = ((-sin) * f23) + (f24 * cos);
            float f27 = abs * abs;
            float f28 = abs2 * abs2;
            float f29 = f25 * f25;
            float f31 = f26 * f26;
            float f32 = (f29 / f27) + (f31 / f28);
            if (f32 > 1.0f) {
                double d12 = f32;
                f18 = cos;
                abs *= (float) Math.sqrt(d12);
                abs2 *= (float) Math.sqrt(d12);
                f27 = abs * abs;
                f28 = abs2 * abs2;
            } else {
                f18 = cos;
            }
            if (z11 == z12) {
                f19 = -1.0f;
            } else {
                f19 = 1.0f;
            }
            float f33 = f27 * f28;
            float f34 = f27 * f31;
            float f35 = f28 * f29;
            float f36 = ((f33 - f34) - f35) / (f34 + f35);
            if (f36 < 0.0f) {
                f36 = 0.0f;
            }
            float sqrt = (float) (f19 * Math.sqrt(f36));
            float f37 = ((abs * f26) / abs2) * sqrt;
            float f38 = sqrt * (-((abs2 * f25) / abs));
            float f39 = ((f11 + f16) / 2.0f) + ((f18 * f37) - (sin * f38));
            float f41 = ((f12 + f17) / 2.0f) + (sin * f37) + (f18 * f38);
            float f42 = (f25 - f37) / abs;
            float f43 = (f26 - f38) / abs2;
            float f44 = ((-f25) - f37) / abs;
            float f45 = ((-f26) - f38) / abs2;
            float f46 = abs;
            float sqrt2 = (float) Math.sqrt((f42 * f42) + (f43 * f43));
            if (f43 < 0.0f) {
                f21 = -1.0f;
            } else {
                f21 = 1.0f;
            }
            float degrees = (float) Math.toDegrees(f21 * Math.acos(f42 / sqrt2));
            float sqrt3 = (float) Math.sqrt(r9 * ((f44 * f44) + (f45 * f45)));
            float f47 = (f42 * f44) + (f43 * f45);
            if ((f42 * f45) - (f43 * f44) < 0.0f) {
                f22 = -1.0f;
            } else {
                f22 = 1.0f;
            }
            double degrees2 = Math.toDegrees(f22 * Math.acos(f47 / sqrt3));
            if (!z12 && degrees2 > 0.0d) {
                d11 = 360.0d;
                degrees2 -= 360.0d;
            } else {
                d11 = 360.0d;
                if (z12 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            }
            float[] m88549g = m88549g(degrees % 360.0f, degrees2 % d11);
            Matrix matrix = new Matrix();
            matrix.postScale(f46, abs2);
            matrix.postRotate(f15);
            matrix.postTranslate(f39, f41);
            matrix.mapPoints(m88549g);
            m88549g[m88549g.length - 2] = f16;
            m88549g[m88549g.length - 1] = f17;
            for (int i11 = 0; i11 < m88549g.length; i11 += 6) {
                xVar.mo88539c(m88549g[i11], m88549g[i11 + 1], m88549g[i11 + 2], m88549g[i11 + 3], m88549g[i11 + 4], m88549g[i11 + 5]);
            }
            return;
        }
        xVar.mo88541e(f16, f17);
    }

    /* renamed from: g */
    static float[] m88549g(double d11, double d12) {
        int ceil = (int) Math.ceil(Math.abs(d12) / 90.0d);
        double radians = Math.toRadians(d11);
        double radians2 = (float) (Math.toRadians(d12) / ceil);
        double d13 = radians2 / 2.0d;
        double sin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i11 = 0;
        int i12 = 0;
        while (i11 < ceil) {
            double d14 = (i11 * r3) + radians;
            double cos = Math.cos(d14);
            double sin2 = Math.sin(d14);
            double d15 = radians;
            fArr[i12] = (float) (cos - (sin * sin2));
            fArr[i12 + 1] = (float) (sin2 + (cos * sin));
            double d16 = d14 + radians2;
            double cos2 = Math.cos(d16);
            double sin3 = Math.sin(d16);
            fArr[i12 + 2] = (float) ((sin * sin3) + cos2);
            fArr[i12 + 3] = (float) (sin3 - (sin * cos2));
            int i13 = i12 + 5;
            fArr[i12 + 4] = (float) cos2;
            i12 += 6;
            fArr[i13] = (float) sin3;
            i11++;
            radians = d15;
            ceil = ceil;
        }
        return fArr;
    }

    /* renamed from: v */
    static void m88550v(String str, Object... objArr) {
    }

    /* renamed from: A */
    void m88551A() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.f84229a.getWidth(), this.f84229a.getHeight(), Bitmap.Config.ARGB_8888);
            this.f84239k.push(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setMatrix(this.f84229a.getMatrix());
            this.f84229a = canvas;
        } catch (OutOfMemoryError e11) {
            m88545C("Not enough memory to create temporary bitmaps for mask processing", new Object[0]);
            throw e11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0106, code lost:            if (r7 != 8) goto L148;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m88552A0(C16654c.r rVar, c cVar) {
        float f11;
        float m88526b;
        C16654c.p pVar;
        float f12;
        C16654c.p pVar2;
        float f13;
        C16654c.p pVar3;
        float f14;
        C16654c.p pVar4;
        C16654c.b bVar;
        boolean m88604g0;
        float f15;
        float f16;
        float f17;
        float min;
        m88573L0();
        Float f18 = rVar.f84196v;
        float f19 = 0.0f;
        if (f18 != null) {
            if (Float.isNaN(f18.floatValue())) {
                float f21 = cVar.f84255c;
                if (f21 != 0.0f || cVar.f84256d != 0.0f) {
                    f11 = (float) Math.toDegrees(Math.atan2(cVar.f84256d, f21));
                }
            } else {
                f11 = rVar.f84196v.floatValue();
            }
            if (!rVar.f84191q) {
                m88526b = 1.0f;
            } else {
                m88526b = this.f84234f.f84269p.f84086v.m88526b(this.f84231c);
            }
            this.f84234f = m88568J(rVar);
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.f84253a, cVar.f84254b);
            matrix.preRotate(f11);
            matrix.preScale(m88526b, m88526b);
            pVar = rVar.f84192r;
            if (pVar == null) {
                f12 = pVar.m88529f(this);
            } else {
                f12 = 0.0f;
            }
            pVar2 = rVar.f84193s;
            if (pVar2 == null) {
                f13 = pVar2.m88530g(this);
            } else {
                f13 = 0.0f;
            }
            pVar3 = rVar.f84194t;
            float f22 = 3.0f;
            if (pVar3 == null) {
                f14 = pVar3.m88529f(this);
            } else {
                f14 = 3.0f;
            }
            pVar4 = rVar.f84195u;
            if (pVar4 != null) {
                f22 = pVar4.m88530g(this);
            }
            bVar = rVar.f84197p;
            if (bVar == null) {
                float f23 = f14 / bVar.f84024r;
                float f24 = f22 / bVar.f84025s;
                C16653b c16653b = rVar.f84181o;
                if (c16653b == null) {
                    c16653b = C16653b.f83988e;
                }
                if (!c16653b.equals(C16653b.f83987d)) {
                    if (c16653b.m88477b() == C16653b.b.Slice) {
                        min = Math.max(f23, f24);
                    } else {
                        min = Math.min(f23, f24);
                    }
                    f23 = min;
                    f24 = f23;
                }
                matrix.preTranslate((-f12) * f23, (-f13) * f24);
                this.f84229a.concat(matrix);
                C16654c.b bVar2 = rVar.f84197p;
                float f25 = bVar2.f84024r * f23;
                float f26 = bVar2.f84025s * f24;
                int[] iArr = a.f84240a;
                switch (iArr[c16653b.m88476a().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f15 = (f14 - f25) / 2.0f;
                        f16 = 0.0f - f15;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f15 = f14 - f25;
                        f16 = 0.0f - f15;
                        break;
                    default:
                        f16 = 0.0f;
                        break;
                }
                int i11 = iArr[c16653b.m88476a().ordinal()];
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 5) {
                            if (i11 != 6) {
                                if (i11 != 7) {
                                }
                            }
                        }
                    }
                    f17 = f22 - f26;
                    f19 = 0.0f - f17;
                    if (!this.f84234f.f84269p.f84063K.booleanValue()) {
                        m88565H0(f16, f19, f14, f22);
                    }
                    matrix.reset();
                    matrix.preScale(f23, f24);
                    this.f84229a.concat(matrix);
                }
                f17 = (f22 - f26) / 2.0f;
                f19 = 0.0f - f17;
                if (!this.f84234f.f84269p.f84063K.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f23, f24);
                this.f84229a.concat(matrix);
            } else {
                matrix.preTranslate(-f12, -f13);
                this.f84229a.concat(matrix);
                if (!this.f84234f.f84269p.f84063K.booleanValue()) {
                    m88565H0(0.0f, 0.0f, f14, f22);
                }
            }
            m88604g0 = m88604g0();
            m88639y0(rVar, false);
            if (m88604g0) {
                m88600d0(rVar);
            }
            m88571K0();
        }
        f11 = 0.0f;
        if (!rVar.f84191q) {
        }
        this.f84234f = m88568J(rVar);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(cVar.f84253a, cVar.f84254b);
        matrix2.preRotate(f11);
        matrix2.preScale(m88526b, m88526b);
        pVar = rVar.f84192r;
        if (pVar == null) {
        }
        pVar2 = rVar.f84193s;
        if (pVar2 == null) {
        }
        pVar3 = rVar.f84194t;
        float f222 = 3.0f;
        if (pVar3 == null) {
        }
        pVar4 = rVar.f84195u;
        if (pVar4 != null) {
        }
        bVar = rVar.f84197p;
        if (bVar == null) {
        }
        m88604g0 = m88604g0();
        m88639y0(rVar, false);
        if (m88604g0) {
        }
        m88571K0();
    }

    /* renamed from: B */
    void m88553B(C16654c.y0 y0Var, j jVar) {
        if (!m88636x()) {
            return;
        }
        Iterator it = y0Var.f84135i.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            C16654c.n0 n0Var = (C16654c.n0) it.next();
            if (n0Var instanceof C16654c.c1) {
                jVar.mo88646b(m88575M0(((C16654c.c1) n0Var).f84036c, z11, !it.hasNext()));
            } else {
                m88603f0(n0Var, jVar);
            }
            z11 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* renamed from: B0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m88554B0(C16654c.l lVar) {
        C16654c.r rVar;
        String str;
        C16654c.r rVar2;
        String str2;
        C16654c.r rVar3;
        List m88607i;
        int size;
        C16654c.e0 e0Var = this.f84234f.f84269p;
        String str3 = e0Var.f84065M;
        if (str3 == null && e0Var.f84066N == null && e0Var.f84067O == null) {
            return;
        }
        if (str3 != null) {
            C16654c.n0 m88490k = lVar.f84171a.m88490k(str3);
            if (m88490k != null) {
                rVar = (C16654c.r) m88490k;
                str = this.f84234f.f84269p.f84066N;
                if (str != null) {
                    C16654c.n0 m88490k2 = lVar.f84171a.m88490k(str);
                    if (m88490k2 != null) {
                        rVar2 = (C16654c.r) m88490k2;
                        str2 = this.f84234f.f84269p.f84067O;
                        if (str2 != null) {
                            C16654c.n0 m88490k3 = lVar.f84171a.m88490k(str2);
                            if (m88490k3 != null) {
                                rVar3 = (C16654c.r) m88490k3;
                                if (!(lVar instanceof C16654c.v)) {
                                    m88607i = new b(((C16654c.v) lVar).f84208o).m88642f();
                                } else if (lVar instanceof C16654c.q) {
                                    m88607i = m88605h((C16654c.q) lVar);
                                } else {
                                    m88607i = m88607i((C16654c.z) lVar);
                                }
                                if (m88607i != null || (size = m88607i.size()) == 0) {
                                    return;
                                }
                                C16654c.e0 e0Var2 = this.f84234f.f84269p;
                                e0Var2.f84067O = null;
                                e0Var2.f84066N = null;
                                e0Var2.f84065M = null;
                                if (rVar != null) {
                                    m88552A0(rVar, (c) m88607i.get(0));
                                }
                                if (rVar2 != null) {
                                    for (int i11 = 1; i11 < size - 1; i11++) {
                                        m88552A0(rVar2, (c) m88607i.get(i11));
                                    }
                                }
                                if (rVar3 == null) {
                                    m88552A0(rVar3, (c) m88607i.get(size - 1));
                                    return;
                                }
                                return;
                            }
                            m88545C("Marker reference '%s' not found", this.f84234f.f84269p.f84067O);
                        }
                        rVar3 = null;
                        if (!(lVar instanceof C16654c.v)) {
                        }
                        if (m88607i != null) {
                            return;
                        }
                        C16654c.e0 e0Var22 = this.f84234f.f84269p;
                        e0Var22.f84067O = null;
                        e0Var22.f84066N = null;
                        e0Var22.f84065M = null;
                        if (rVar != null) {
                        }
                        if (rVar2 != null) {
                        }
                        if (rVar3 == null) {
                        }
                    } else {
                        m88545C("Marker reference '%s' not found", this.f84234f.f84269p.f84066N);
                    }
                }
                rVar2 = null;
                str2 = this.f84234f.f84269p.f84067O;
                if (str2 != null) {
                }
                rVar3 = null;
                if (!(lVar instanceof C16654c.v)) {
                }
                if (m88607i != null) {
                }
            } else {
                m88545C("Marker reference '%s' not found", this.f84234f.f84269p.f84065M);
            }
        }
        rVar = null;
        str = this.f84234f.f84269p.f84066N;
        if (str != null) {
        }
        rVar2 = null;
        str2 = this.f84234f.f84269p.f84067O;
        if (str2 != null) {
        }
        rVar3 = null;
        if (!(lVar instanceof C16654c.v)) {
        }
        if (m88607i != null) {
        }
    }

    /* renamed from: C0 */
    void m88555C0(C16654c.s sVar, C16654c.k0 k0Var) {
        float f11;
        float f12;
        float f13;
        m88550v("Mask render", new Object[0]);
        Boolean bool = sVar.f84198o;
        if (bool != null && bool.booleanValue()) {
            C16654c.p pVar = sVar.f84202s;
            if (pVar != null) {
                f12 = pVar.m88529f(this);
            } else {
                f12 = k0Var.f84159h.f84024r;
            }
            C16654c.p pVar2 = sVar.f84203t;
            if (pVar2 != null) {
                f13 = pVar2.m88530g(this);
            } else {
                f13 = k0Var.f84159h.f84025s;
            }
            C16654c.p pVar3 = sVar.f84200q;
            if (pVar3 != null) {
                pVar3.m88529f(this);
            } else {
                C16654c.b bVar = k0Var.f84159h;
                float f14 = bVar.f84022p;
                float f15 = bVar.f84024r;
            }
            C16654c.p pVar4 = sVar.f84201r;
            if (pVar4 != null) {
                pVar4.m88530g(this);
            } else {
                C16654c.b bVar2 = k0Var.f84159h;
                float f16 = bVar2.f84023q;
                float f17 = bVar2.f84025s;
            }
        } else {
            C16654c.p pVar5 = sVar.f84200q;
            if (pVar5 != null) {
                pVar5.m88528e(this, 1.0f);
            }
            C16654c.p pVar6 = sVar.f84201r;
            if (pVar6 != null) {
                pVar6.m88528e(this, 1.0f);
            }
            C16654c.p pVar7 = sVar.f84202s;
            float f18 = 1.2f;
            if (pVar7 != null) {
                f11 = pVar7.m88528e(this, 1.0f);
            } else {
                f11 = 1.2f;
            }
            C16654c.p pVar8 = sVar.f84203t;
            if (pVar8 != null) {
                f18 = pVar8.m88528e(this, 1.0f);
            }
            C16654c.b bVar3 = k0Var.f84159h;
            float f19 = bVar3.f84022p;
            float f21 = bVar3.f84024r;
            float f22 = bVar3.f84023q;
            f12 = f11 * f21;
            f13 = f18 * bVar3.f84025s;
        }
        if (f12 != 0.0f && f13 != 0.0f) {
            m88573L0();
            h m88568J = m88568J(sVar);
            this.f84234f = m88568J;
            m88568J.f84269p.f84054B = Float.valueOf(1.0f);
            Boolean bool2 = sVar.f84199p;
            if (bool2 != null && !bool2.booleanValue()) {
                Canvas canvas = this.f84229a;
                C16654c.b bVar4 = k0Var.f84159h;
                canvas.translate(bVar4.f84022p, bVar4.f84023q);
                Canvas canvas2 = this.f84229a;
                C16654c.b bVar5 = k0Var.f84159h;
                canvas2.scale(bVar5.f84024r, bVar5.f84025s);
            }
            m88639y0(sVar, false);
            m88571K0();
        }
    }

    /* renamed from: D */
    void m88556D(C16654c.y0 y0Var, StringBuilder sb2) {
        Iterator it = y0Var.f84135i.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            C16654c.n0 n0Var = (C16654c.n0) it.next();
            if (n0Var instanceof C16654c.y0) {
                m88556D((C16654c.y0) n0Var, sb2);
            } else if (n0Var instanceof C16654c.c1) {
                sb2.append(m88575M0(((C16654c.c1) n0Var).f84036c, z11, !it.hasNext()));
            }
            z11 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D0 */
    void m88557D0(C16654c.s0 s0Var) {
        Set mo88513a;
        String language = Locale.getDefault().getLanguage();
        this.f84233e.m88485e();
        for (C16654c.n0 n0Var : s0Var.mo88498b()) {
            if (n0Var instanceof C16654c.g0) {
                C16654c.g0 g0Var = (C16654c.g0) n0Var;
                if (g0Var.mo88514c() == null && ((mo88513a = g0Var.mo88513a()) == null || (!mo88513a.isEmpty() && mo88513a.contains(language)))) {
                    Set mo88517g = g0Var.mo88517g();
                    if (mo88517g != null) {
                        if (f84228l == null) {
                            m88546S();
                        }
                        if (!mo88517g.isEmpty() && f84228l.containsAll(mo88517g)) {
                        }
                    }
                    Set mo88521m = g0Var.mo88521m();
                    if (mo88521m != null) {
                        mo88521m.isEmpty();
                    } else {
                        Set mo88522n = g0Var.mo88522n();
                        if (mo88522n != null) {
                            mo88522n.isEmpty();
                        } else {
                            m88630t0(n0Var);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E */
    void m88558E(C16654c.j jVar, String str) {
        C16654c.n0 m88490k = jVar.f84171a.m88490k(str);
        if (m88490k == null) {
            m88547S0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(m88490k instanceof C16654c.j)) {
            m88545C("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (m88490k == jVar) {
            m88545C("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        C16654c.j jVar2 = (C16654c.j) m88490k;
        if (jVar.f84151i == null) {
            jVar.f84151i = jVar2.f84151i;
        }
        if (jVar.f84152j == null) {
            jVar.f84152j = jVar2.f84152j;
        }
        if (jVar.f84153k == null) {
            jVar.f84153k = jVar2.f84153k;
        }
        if (jVar.f84150h.isEmpty()) {
            jVar.f84150h = jVar2.f84150h;
        }
        try {
            if (jVar instanceof C16654c.m0) {
                m88560F((C16654c.m0) jVar, (C16654c.m0) m88490k);
            } else {
                m88562G((C16654c.q0) jVar, (C16654c.q0) m88490k);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.f84154l;
        if (str2 != null) {
            m88558E(jVar, str2);
        }
    }

    /* renamed from: E0 */
    void m88559E0(C16654c.z0 z0Var) {
        float f11;
        m88550v("TextPath render", new Object[0]);
        m88581P0(this.f84234f, z0Var);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        C16654c.n0 m88490k = z0Var.f84171a.m88490k(z0Var.f84225o);
        if (m88490k == null) {
            m88545C("TextPath reference '%s' not found", z0Var.f84225o);
            return;
        }
        C16654c.v vVar = (C16654c.v) m88490k;
        Path m88645f = new d(vVar.f84208o).m88645f();
        Matrix matrix = vVar.f84160n;
        if (matrix != null) {
            m88645f.transform(matrix);
        }
        PathMeasure pathMeasure = new PathMeasure(m88645f, false);
        C16654c.p pVar = z0Var.f84226p;
        if (pVar != null) {
            f11 = pVar.m88528e(this, pathMeasure.getLength());
        } else {
            f11 = 0.0f;
        }
        C16654c.e0.e m88572L = m88572L();
        if (m88572L != C16654c.e0.e.Start) {
            float m88611k = m88611k(z0Var);
            if (m88572L == C16654c.e0.e.Middle) {
                m88611k /= 2.0f;
            }
            f11 -= m88611k;
        }
        m88619o((C16654c.k0) z0Var.mo88500e());
        boolean m88604g0 = m88604g0();
        m88553B(z0Var, new e(m88645f, f11, 0.0f));
        if (m88604g0) {
            m88600d0(z0Var);
        }
    }

    /* renamed from: F */
    void m88560F(C16654c.m0 m0Var, C16654c.m0 m0Var2) {
        if (m0Var.f84167m == null) {
            m0Var.f84167m = m0Var2.f84167m;
        }
        if (m0Var.f84168n == null) {
            m0Var.f84168n = m0Var2.f84168n;
        }
        if (m0Var.f84169o == null) {
            m0Var.f84169o = m0Var2.f84169o;
        }
        if (m0Var.f84170p == null) {
            m0Var.f84170p = m0Var2.f84170p;
        }
    }

    /* renamed from: F0 */
    boolean m88561F0() {
        h hVar = this.f84234f;
        if (hVar.f84269p.f84074V != null && !hVar.f84277x) {
            m88547S0("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.f84234f.f84269p.f84054B.floatValue() >= 1.0f) {
            h hVar2 = this.f84234f;
            if (hVar2.f84269p.f84074V == null || !hVar2.f84277x) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    void m88562G(C16654c.q0 q0Var, C16654c.q0 q0Var2) {
        if (q0Var.f84186m == null) {
            q0Var.f84186m = q0Var2.f84186m;
        }
        if (q0Var.f84187n == null) {
            q0Var.f84187n = q0Var2.f84187n;
        }
        if (q0Var.f84188o == null) {
            q0Var.f84188o = q0Var2.f84188o;
        }
        if (q0Var.f84189p == null) {
            q0Var.f84189p = q0Var2.f84189p;
        }
        if (q0Var.f84190q == null) {
            q0Var.f84190q = q0Var2.f84190q;
        }
    }

    /* renamed from: G0 */
    void m88563G0() {
        this.f84234f = new h();
        this.f84235g = new Stack();
        m88579O0(this.f84234f, C16654c.e0.m88502a());
        h hVar = this.f84234f;
        hVar.f84274u = this.f84230b;
        hVar.f84276w = false;
        hVar.f84277x = this.f84232d;
        this.f84235g.push((h) hVar.clone());
        this.f84238j = new Stack();
        this.f84239k = new Stack();
        this.f84237i = new Stack();
        this.f84236h = new Stack();
    }

    /* renamed from: H */
    void m88564H(C16654c.y yVar, String str) {
        C16654c.n0 m88490k = yVar.f84171a.m88490k(str);
        if (m88490k == null) {
            m88547S0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(m88490k instanceof C16654c.y)) {
            m88545C("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (m88490k == yVar) {
            m88545C("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C16654c.y yVar2 = (C16654c.y) m88490k;
        if (yVar.f84216q == null) {
            yVar.f84216q = yVar2.f84216q;
        }
        if (yVar.f84217r == null) {
            yVar.f84217r = yVar2.f84217r;
        }
        if (yVar.f84218s == null) {
            yVar.f84218s = yVar2.f84218s;
        }
        if (yVar.f84219t == null) {
            yVar.f84219t = yVar2.f84219t;
        }
        if (yVar.f84220u == null) {
            yVar.f84220u = yVar2.f84220u;
        }
        if (yVar.f84221v == null) {
            yVar.f84221v = yVar2.f84221v;
        }
        if (yVar.f84222w == null) {
            yVar.f84222w = yVar2.f84222w;
        }
        if (yVar.f84135i.isEmpty()) {
            yVar.f84135i = yVar2.f84135i;
        }
        if (yVar.f84197p == null) {
            yVar.f84197p = yVar2.f84197p;
        }
        if (yVar.f84181o == null) {
            yVar.f84181o = yVar2.f84181o;
        }
        String str2 = yVar2.f84223x;
        if (str2 != null) {
            m88564H(yVar, str2);
        }
    }

    /* renamed from: H0 */
    void m88565H0(float f11, float f12, float f13, float f14) {
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        C16654c.c cVar = this.f84234f.f84269p.f84064L;
        if (cVar != null) {
            f11 += cVar.f84035d.m88529f(this);
            f12 += this.f84234f.f84269p.f84064L.f84032a.m88530g(this);
            f15 -= this.f84234f.f84269p.f84064L.f84033b.m88529f(this);
            f16 -= this.f84234f.f84269p.f84064L.f84034c.m88530g(this);
        }
        this.f84229a.clipRect(f11, f12, f15, f16);
    }

    /* renamed from: I */
    void m88566I(C16654c.k0 k0Var, Path path, C16654c.y yVar) {
        boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z12;
        Boolean bool = yVar.f84216q;
        if (bool != null && bool.booleanValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str = yVar.f84223x;
        if (str != null) {
            m88564H(yVar, str);
        }
        if (z11) {
            C16654c.p pVar = yVar.f84219t;
            if (pVar != null) {
                f15 = pVar.m88529f(this);
            } else {
                f15 = 0.0f;
            }
            C16654c.p pVar2 = yVar.f84220u;
            if (pVar2 != null) {
                f17 = pVar2.m88530g(this);
            } else {
                f17 = 0.0f;
            }
            C16654c.p pVar3 = yVar.f84221v;
            if (pVar3 != null) {
                f18 = pVar3.m88529f(this);
            } else {
                f18 = 0.0f;
            }
            C16654c.p pVar4 = yVar.f84222w;
            if (pVar4 != null) {
                f16 = pVar4.m88530g(this);
            } else {
                f16 = 0.0f;
            }
        } else {
            C16654c.p pVar5 = yVar.f84219t;
            if (pVar5 != null) {
                f11 = pVar5.m88528e(this, 1.0f);
            } else {
                f11 = 0.0f;
            }
            C16654c.p pVar6 = yVar.f84220u;
            if (pVar6 != null) {
                f12 = pVar6.m88528e(this, 1.0f);
            } else {
                f12 = 0.0f;
            }
            C16654c.p pVar7 = yVar.f84221v;
            if (pVar7 != null) {
                f13 = pVar7.m88528e(this, 1.0f);
            } else {
                f13 = 0.0f;
            }
            C16654c.p pVar8 = yVar.f84222w;
            if (pVar8 != null) {
                f14 = pVar8.m88528e(this, 1.0f);
            } else {
                f14 = 0.0f;
            }
            C16654c.b bVar = k0Var.f84159h;
            float f19 = bVar.f84022p;
            float f21 = bVar.f84024r;
            f15 = (f11 * f21) + f19;
            float f22 = bVar.f84023q;
            float f23 = bVar.f84025s;
            float f24 = f13 * f21;
            f16 = f14 * f23;
            f17 = (f12 * f23) + f22;
            f18 = f24;
        }
        if (f18 != 0.0f && f16 != 0.0f) {
            C16653b c16653b = yVar.f84181o;
            if (c16653b == null) {
                c16653b = C16653b.f83988e;
            }
            m88573L0();
            this.f84229a.clipPath(path);
            h hVar = new h();
            m88579O0(hVar, C16654c.e0.m88502a());
            hVar.f84269p.f84063K = Boolean.FALSE;
            this.f84234f = m88570K(yVar, hVar);
            C16654c.b bVar2 = k0Var.f84159h;
            Matrix matrix = yVar.f84218s;
            if (matrix != null) {
                this.f84229a.concat(matrix);
                Matrix matrix2 = new Matrix();
                if (yVar.f84218s.invert(matrix2)) {
                    C16654c.b bVar3 = k0Var.f84159h;
                    C16654c.b bVar4 = k0Var.f84159h;
                    C16654c.b bVar5 = k0Var.f84159h;
                    float[] fArr = {bVar3.f84022p, bVar3.f84023q, bVar3.m88495b(), bVar4.f84023q, bVar4.m88495b(), k0Var.f84159h.m88496c(), bVar5.f84022p, bVar5.m88496c()};
                    matrix2.mapPoints(fArr);
                    float f25 = fArr[0];
                    float f26 = fArr[1];
                    RectF rectF = new RectF(f25, f26, f25, f26);
                    for (int i11 = 2; i11 <= 6; i11 += 2) {
                        float f27 = fArr[i11];
                        if (f27 < rectF.left) {
                            rectF.left = f27;
                        }
                        if (f27 > rectF.right) {
                            rectF.right = f27;
                        }
                        float f28 = fArr[i11 + 1];
                        if (f28 < rectF.top) {
                            rectF.top = f28;
                        }
                        if (f28 > rectF.bottom) {
                            rectF.bottom = f28;
                        }
                    }
                    float f29 = rectF.left;
                    float f31 = rectF.top;
                    bVar2 = new C16654c.b(f29, f31, rectF.right - f29, rectF.bottom - f31);
                }
            }
            float floor = f15 + (((float) Math.floor((bVar2.f84022p - f15) / f18)) * f18);
            float m88495b = bVar2.m88495b();
            float m88496c = bVar2.m88496c();
            C16654c.b bVar6 = new C16654c.b(0.0f, 0.0f, f18, f16);
            for (float floor2 = f17 + (((float) Math.floor((bVar2.f84023q - f17) / f16)) * f16); floor2 < m88496c; floor2 += f16) {
                for (float f32 = floor; f32 < m88495b; f32 += f18) {
                    bVar6.f84022p = f32;
                    bVar6.f84023q = floor2;
                    m88573L0();
                    if (!this.f84234f.f84269p.f84063K.booleanValue()) {
                        m88565H0(bVar6.f84022p, bVar6.f84023q, bVar6.f84024r, bVar6.f84025s);
                    }
                    C16654c.b bVar7 = yVar.f84197p;
                    if (bVar7 != null) {
                        this.f84229a.concat(m88613l(bVar6, bVar7, c16653b));
                    } else {
                        Boolean bool2 = yVar.f84217r;
                        if (bool2 != null && !bool2.booleanValue()) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        this.f84229a.translate(f32, floor2);
                        if (!z12) {
                            Canvas canvas = this.f84229a;
                            C16654c.b bVar8 = k0Var.f84159h;
                            canvas.scale(bVar8.f84024r, bVar8.f84025s);
                        }
                    }
                    boolean m88604g0 = m88604g0();
                    Iterator it = yVar.f84135i.iterator();
                    while (it.hasNext()) {
                        m88630t0((C16654c.n0) it.next());
                    }
                    if (m88604g0) {
                        m88600d0(yVar);
                    }
                    m88571K0();
                }
            }
            m88571K0();
        }
    }

    /* renamed from: I0 */
    void m88567I0(h hVar, boolean z11, C16654c.o0 o0Var) {
        Float f11;
        int i11;
        C16654c.e0 e0Var = hVar.f84269p;
        if (z11) {
            f11 = e0Var.f84083s;
        } else {
            f11 = e0Var.f84085u;
        }
        float floatValue = f11.floatValue();
        if (o0Var instanceof C16654c.f) {
            i11 = ((C16654c.f) o0Var).f84128p;
        } else if (o0Var instanceof C16654c.g) {
            i11 = hVar.f84269p.f84055C.f84128p;
        } else {
            return;
        }
        int m88627s = i11 | (m88627s(floatValue) << 24);
        if (z11) {
            hVar.f84272s.setColor(m88627s);
        } else {
            hVar.f84273t.setColor(m88627s);
        }
    }

    /* renamed from: J */
    h m88568J(C16654c.n0 n0Var) {
        h hVar = new h();
        m88579O0(hVar, C16654c.e0.m88502a());
        return m88570K(n0Var, hVar);
    }

    /* renamed from: J0 */
    void m88569J0(boolean z11, C16654c.c0 c0Var) {
        boolean z12 = false;
        if (z11) {
            if (m88586T(c0Var.f84163e, 2147483648L)) {
                h hVar = this.f84234f;
                C16654c.e0 e0Var = hVar.f84269p;
                C16654c.o0 o0Var = c0Var.f84163e.f84075W;
                e0Var.f84081q = o0Var;
                if (o0Var != null) {
                    z12 = true;
                }
                hVar.f84270q = z12;
            }
            if (m88586T(c0Var.f84163e, 4294967296L)) {
                this.f84234f.f84269p.f84083s = c0Var.f84163e.f84076X;
            }
            if (m88586T(c0Var.f84163e, 6442450944L)) {
                h hVar2 = this.f84234f;
                m88567I0(hVar2, z11, hVar2.f84269p.f84081q);
                return;
            }
            return;
        }
        if (m88586T(c0Var.f84163e, 2147483648L)) {
            h hVar3 = this.f84234f;
            C16654c.e0 e0Var2 = hVar3.f84269p;
            C16654c.o0 o0Var2 = c0Var.f84163e.f84075W;
            e0Var2.f84084t = o0Var2;
            if (o0Var2 != null) {
                z12 = true;
            }
            hVar3.f84271r = z12;
        }
        if (m88586T(c0Var.f84163e, 4294967296L)) {
            this.f84234f.f84269p.f84085u = c0Var.f84163e.f84076X;
        }
        if (m88586T(c0Var.f84163e, 6442450944L)) {
            h hVar4 = this.f84234f;
            m88567I0(hVar4, z11, hVar4.f84269p.f84084t);
        }
    }

    /* renamed from: K */
    h m88570K(C16654c.n0 n0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (n0Var instanceof C16654c.l0) {
                arrayList.add(0, (C16654c.l0) n0Var);
            }
            Object obj = n0Var.f84172b;
            if (obj == null) {
                break;
            }
            n0Var = (C16654c.n0) obj;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m88581P0(hVar, (C16654c.l0) it.next());
        }
        C16654c.b bVar = this.f84233e.m88486g().f84197p;
        hVar.f84275v = bVar;
        if (bVar == null) {
            hVar.f84275v = this.f84230b;
        }
        hVar.f84274u = this.f84230b;
        hVar.f84277x = this.f84234f.f84277x;
        return hVar;
    }

    /* renamed from: K0 */
    void m88571K0() {
        this.f84229a.restore();
        this.f84234f = (h) this.f84235g.pop();
    }

    /* renamed from: L */
    C16654c.e0.e m88572L() {
        C16654c.e0.e eVar;
        C16654c.e0 e0Var = this.f84234f.f84269p;
        if (e0Var.f84061I != C16654c.e0.g.LTR && (eVar = e0Var.f84062J) != C16654c.e0.e.Middle) {
            C16654c.e0.e eVar2 = C16654c.e0.e.Start;
            if (eVar == eVar2) {
                return C16654c.e0.e.End;
            }
            return eVar2;
        }
        return e0Var.f84062J;
    }

    /* renamed from: L0 */
    void m88573L0() {
        this.f84229a.save();
        this.f84235g.push(this.f84234f);
        this.f84234f = (h) this.f84234f.clone();
    }

    /* renamed from: M */
    Path.FillType m88574M() {
        C16654c.e0.a aVar = this.f84234f.f84269p.f84073U;
        if (aVar == null) {
            return Path.FillType.WINDING;
        }
        if (a.f84243d[aVar.ordinal()] != 1) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: M0 */
    String m88575M0(String str, boolean z11, boolean z12) {
        if (this.f84234f.f84276w) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z11) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z12) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: N */
    public float m88576N() {
        return this.f84234f.f84272s.getTextSize();
    }

    /* renamed from: N0 */
    void m88577N0(C16654c.k0 k0Var) {
        if (k0Var.f84172b == null || k0Var.f84159h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f84237i.peek()).invert(matrix)) {
            C16654c.b bVar = k0Var.f84159h;
            C16654c.b bVar2 = k0Var.f84159h;
            C16654c.b bVar3 = k0Var.f84159h;
            float[] fArr = {bVar.f84022p, bVar.f84023q, bVar.m88495b(), bVar2.f84023q, bVar2.m88495b(), k0Var.f84159h.m88496c(), bVar3.f84022p, bVar3.m88496c()};
            matrix.preConcat(this.f84229a.getMatrix());
            matrix.mapPoints(fArr);
            float f11 = fArr[0];
            float f12 = fArr[1];
            RectF rectF = new RectF(f11, f12, f11, f12);
            for (int i11 = 2; i11 <= 6; i11 += 2) {
                float f13 = fArr[i11];
                if (f13 < rectF.left) {
                    rectF.left = f13;
                }
                if (f13 > rectF.right) {
                    rectF.right = f13;
                }
                float f14 = fArr[i11 + 1];
                if (f14 < rectF.top) {
                    rectF.top = f14;
                }
                if (f14 > rectF.bottom) {
                    rectF.bottom = f14;
                }
            }
            C16654c.k0 k0Var2 = (C16654c.k0) this.f84236h.peek();
            C16654c.b bVar4 = k0Var2.f84159h;
            if (bVar4 == null) {
                k0Var2.f84159h = C16654c.b.m88494a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                bVar4.m88497e(C16654c.b.m88494a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* renamed from: O */
    public float m88578O() {
        return this.f84234f.f84272s.getTextSize() / 2.0f;
    }

    /* renamed from: O0 */
    void m88579O0(h hVar, C16654c.e0 e0Var) {
        boolean z11;
        boolean z12;
        boolean z13;
        C16654c c16654c;
        int i11;
        boolean z14;
        boolean z15;
        if (m88586T(e0Var, 4096L)) {
            hVar.f84269p.f84055C = e0Var.f84055C;
        }
        if (m88586T(e0Var, 2048L)) {
            hVar.f84269p.f84054B = e0Var.f84054B;
        }
        boolean z16 = false;
        if (m88586T(e0Var, 1L)) {
            hVar.f84269p.f84081q = e0Var.f84081q;
            if (e0Var.f84081q != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            hVar.f84270q = z15;
        }
        if (m88586T(e0Var, 4L)) {
            hVar.f84269p.f84083s = e0Var.f84083s;
        }
        if (m88586T(e0Var, 6149L)) {
            m88567I0(hVar, true, hVar.f84269p.f84081q);
        }
        if (m88586T(e0Var, 2L)) {
            hVar.f84269p.f84082r = e0Var.f84082r;
        }
        if (m88586T(e0Var, 8L)) {
            hVar.f84269p.f84084t = e0Var.f84084t;
            if (e0Var.f84084t != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            hVar.f84271r = z14;
        }
        if (m88586T(e0Var, 16L)) {
            hVar.f84269p.f84085u = e0Var.f84085u;
        }
        if (m88586T(e0Var, 6168L)) {
            m88567I0(hVar, false, hVar.f84269p.f84084t);
        }
        if (m88586T(e0Var, 34359738368L)) {
            hVar.f84269p.f84079a0 = e0Var.f84079a0;
        }
        if (m88586T(e0Var, 32L)) {
            C16654c.e0 e0Var2 = hVar.f84269p;
            C16654c.p pVar = e0Var.f84086v;
            e0Var2.f84086v = pVar;
            hVar.f84273t.setStrokeWidth(pVar.m88527c(this));
        }
        if (m88586T(e0Var, 64L)) {
            hVar.f84269p.f84087w = e0Var.f84087w;
            int i12 = a.f84241b[e0Var.f84087w.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        hVar.f84273t.setStrokeCap(Paint.Cap.SQUARE);
                    }
                } else {
                    hVar.f84273t.setStrokeCap(Paint.Cap.ROUND);
                }
            } else {
                hVar.f84273t.setStrokeCap(Paint.Cap.BUTT);
            }
        }
        if (m88586T(e0Var, 128L)) {
            hVar.f84269p.f84088x = e0Var.f84088x;
            int i13 = a.f84242c[e0Var.f84088x.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        hVar.f84273t.setStrokeJoin(Paint.Join.BEVEL);
                    }
                } else {
                    hVar.f84273t.setStrokeJoin(Paint.Join.ROUND);
                }
            } else {
                hVar.f84273t.setStrokeJoin(Paint.Join.MITER);
            }
        }
        if (m88586T(e0Var, 256L)) {
            hVar.f84269p.f84089y = e0Var.f84089y;
            hVar.f84273t.setStrokeMiter(e0Var.f84089y.floatValue());
        }
        if (m88586T(e0Var, 512L)) {
            hVar.f84269p.f84090z = e0Var.f84090z;
        }
        if (m88586T(e0Var, 1024L)) {
            hVar.f84269p.f84053A = e0Var.f84053A;
        }
        Typeface typeface = null;
        if (m88586T(e0Var, 1536L)) {
            C16654c.p[] pVarArr = hVar.f84269p.f84090z;
            if (pVarArr == null) {
                hVar.f84273t.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                if (length % 2 == 0) {
                    i11 = length;
                } else {
                    i11 = length * 2;
                }
                float[] fArr = new float[i11];
                float f11 = 0.0f;
                for (int i14 = 0; i14 < i11; i14++) {
                    float m88527c = hVar.f84269p.f84090z[i14 % length].m88527c(this);
                    fArr[i14] = m88527c;
                    f11 += m88527c;
                }
                if (f11 == 0.0f) {
                    hVar.f84273t.setPathEffect(null);
                } else {
                    float m88527c2 = hVar.f84269p.f84053A.m88527c(this);
                    if (m88527c2 < 0.0f) {
                        m88527c2 = (m88527c2 % f11) + f11;
                    }
                    hVar.f84273t.setPathEffect(new DashPathEffect(fArr, m88527c2));
                }
            }
        }
        if (m88586T(e0Var, 16384L)) {
            float m88576N = m88576N();
            hVar.f84269p.f84057E = e0Var.f84057E;
            hVar.f84272s.setTextSize(e0Var.f84057E.m88528e(this, m88576N));
            hVar.f84273t.setTextSize(e0Var.f84057E.m88528e(this, m88576N));
        }
        if (m88586T(e0Var, 8192L)) {
            hVar.f84269p.f84056D = e0Var.f84056D;
        }
        if (m88586T(e0Var, 32768L)) {
            if (e0Var.f84058F.intValue() == -1 && hVar.f84269p.f84058F.intValue() > 100) {
                C16654c.e0 e0Var3 = hVar.f84269p;
                e0Var3.f84058F = Integer.valueOf(e0Var3.f84058F.intValue() - 100);
            } else if (e0Var.f84058F.intValue() == 1 && hVar.f84269p.f84058F.intValue() < 900) {
                C16654c.e0 e0Var4 = hVar.f84269p;
                e0Var4.f84058F = Integer.valueOf(e0Var4.f84058F.intValue() + 100);
            } else {
                hVar.f84269p.f84058F = e0Var.f84058F;
            }
        }
        if (m88586T(e0Var, 65536L)) {
            hVar.f84269p.f84059G = e0Var.f84059G;
        }
        if (m88586T(e0Var, 106496L)) {
            if (hVar.f84269p.f84056D != null && (c16654c = this.f84233e) != null) {
                c16654c.m88485e();
                for (String str : hVar.f84269p.f84056D) {
                    C16654c.e0 e0Var5 = hVar.f84269p;
                    typeface = m88623q(str, e0Var5.f84058F, e0Var5.f84059G);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                C16654c.e0 e0Var6 = hVar.f84269p;
                typeface = m88623q("sans-serif", e0Var6.f84058F, e0Var6.f84059G);
            }
            hVar.f84272s.setTypeface(typeface);
            hVar.f84273t.setTypeface(typeface);
        }
        if (m88586T(e0Var, 131072L)) {
            hVar.f84269p.f84060H = e0Var.f84060H;
            Paint paint = hVar.f84272s;
            C16654c.e0.f fVar = e0Var.f84060H;
            C16654c.e0.f fVar2 = C16654c.e0.f.LineThrough;
            if (fVar == fVar2) {
                z11 = true;
            } else {
                z11 = false;
            }
            paint.setStrikeThruText(z11);
            Paint paint2 = hVar.f84272s;
            C16654c.e0.f fVar3 = e0Var.f84060H;
            C16654c.e0.f fVar4 = C16654c.e0.f.Underline;
            if (fVar3 == fVar4) {
                z12 = true;
            } else {
                z12 = false;
            }
            paint2.setUnderlineText(z12);
            Paint paint3 = hVar.f84273t;
            if (e0Var.f84060H == fVar2) {
                z13 = true;
            } else {
                z13 = false;
            }
            paint3.setStrikeThruText(z13);
            Paint paint4 = hVar.f84273t;
            if (e0Var.f84060H == fVar4) {
                z16 = true;
            }
            paint4.setUnderlineText(z16);
        }
        if (m88586T(e0Var, 68719476736L)) {
            hVar.f84269p.f84061I = e0Var.f84061I;
        }
        if (m88586T(e0Var, 262144L)) {
            hVar.f84269p.f84062J = e0Var.f84062J;
        }
        if (m88586T(e0Var, 524288L)) {
            hVar.f84269p.f84063K = e0Var.f84063K;
        }
        if (m88586T(e0Var, 2097152L)) {
            hVar.f84269p.f84065M = e0Var.f84065M;
        }
        if (m88586T(e0Var, 4194304L)) {
            hVar.f84269p.f84066N = e0Var.f84066N;
        }
        if (m88586T(e0Var, 8388608L)) {
            hVar.f84269p.f84067O = e0Var.f84067O;
        }
        if (m88586T(e0Var, 16777216L)) {
            hVar.f84269p.f84068P = e0Var.f84068P;
        }
        if (m88586T(e0Var, 33554432L)) {
            hVar.f84269p.f84069Q = e0Var.f84069Q;
        }
        if (m88586T(e0Var, 1048576L)) {
            hVar.f84269p.f84064L = e0Var.f84064L;
        }
        if (m88586T(e0Var, 268435456L)) {
            hVar.f84269p.f84072T = e0Var.f84072T;
        }
        if (m88586T(e0Var, 536870912L)) {
            hVar.f84269p.f84073U = e0Var.f84073U;
        }
        if (m88586T(e0Var, 1073741824L)) {
            hVar.f84269p.f84074V = e0Var.f84074V;
        }
        if (m88586T(e0Var, 67108864L)) {
            hVar.f84269p.f84070R = e0Var.f84070R;
        }
        if (m88586T(e0Var, 134217728L)) {
            hVar.f84269p.f84071S = e0Var.f84071S;
        }
        if (m88586T(e0Var, 8589934592L)) {
            hVar.f84269p.f84077Y = e0Var.f84077Y;
        }
        if (m88586T(e0Var, 17179869184L)) {
            hVar.f84269p.f84078Z = e0Var.f84078Z;
        }
    }

    /* renamed from: P */
    public C16654c.b m88580P() {
        h hVar = this.f84234f;
        C16654c.b bVar = hVar.f84275v;
        if (bVar != null) {
            return bVar;
        }
        return hVar.f84274u;
    }

    /* renamed from: P0 */
    void m88581P0(h hVar, C16654c.l0 l0Var) {
        boolean z11;
        if (l0Var.f84172b == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        hVar.f84269p.m88503b(z11);
        C16654c.e0 e0Var = l0Var.f84163e;
        if (e0Var != null) {
            m88579O0(hVar, e0Var);
        }
        if (this.f84233e.m88487h()) {
            for (C16652a.g gVar : this.f84233e.m88483b()) {
                if (C16652a.m88449m(gVar.f83977a, l0Var)) {
                    m88579O0(hVar, gVar.f83978b);
                }
            }
        }
        C16654c.e0 e0Var2 = l0Var.f84164f;
        if (e0Var2 != null) {
            m88579O0(hVar, e0Var2);
        }
    }

    /* renamed from: Q */
    public float m88582Q() {
        return this.f84231c;
    }

    /* renamed from: Q0 */
    void m88583Q0() {
        int i11;
        C16654c.e0 e0Var = this.f84234f.f84269p;
        C16654c.o0 o0Var = e0Var.f84077Y;
        if (o0Var instanceof C16654c.f) {
            i11 = ((C16654c.f) o0Var).f84128p;
        } else if (o0Var instanceof C16654c.g) {
            i11 = e0Var.f84055C.f84128p;
        } else {
            return;
        }
        Float f11 = e0Var.f84078Z;
        if (f11 != null) {
            i11 |= m88627s(f11.floatValue()) << 24;
        }
        this.f84229a.drawColor(i11);
    }

    /* renamed from: R */
    Path.FillType m88584R() {
        C16654c.e0.a aVar = this.f84234f.f84269p.f84082r;
        if (aVar == null) {
            return Path.FillType.WINDING;
        }
        if (a.f84243d[aVar.ordinal()] != 1) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: R0 */
    boolean m88585R0() {
        Boolean bool = this.f84234f.f84269p.f84069Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: T */
    boolean m88586T(C16654c.e0 e0Var, long j11) {
        if ((e0Var.f84080p & j11) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    void m88587U(boolean z11, C16654c.b bVar, C16654c.m0 m0Var) {
        boolean z12;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f21;
        String str = m0Var.f84154l;
        if (str != null) {
            m88558E(m0Var, str);
        }
        Boolean bool = m0Var.f84151i;
        int i11 = 0;
        if (bool != null && bool.booleanValue()) {
            z12 = true;
        } else {
            z12 = false;
        }
        h hVar = this.f84234f;
        if (z11) {
            paint = hVar.f84272s;
        } else {
            paint = hVar.f84273t;
        }
        float f22 = 0.0f;
        if (z12) {
            C16654c.b m88580P = m88580P();
            C16654c.p pVar = m0Var.f84167m;
            if (pVar != null) {
                f18 = pVar.m88529f(this);
            } else {
                f18 = 0.0f;
            }
            C16654c.p pVar2 = m0Var.f84168n;
            if (pVar2 != null) {
                f19 = pVar2.m88530g(this);
            } else {
                f19 = 0.0f;
            }
            C16654c.p pVar3 = m0Var.f84169o;
            if (pVar3 != null) {
                f21 = pVar3.m88529f(this);
            } else {
                f21 = m88580P.f84024r;
            }
            C16654c.p pVar4 = m0Var.f84170p;
            if (pVar4 != null) {
                f22 = pVar4.m88530g(this);
            }
            f14 = f22;
            f17 = f21;
            f15 = f18;
            f16 = f19;
        } else {
            C16654c.p pVar5 = m0Var.f84167m;
            if (pVar5 != null) {
                f11 = pVar5.m88528e(this, 1.0f);
            } else {
                f11 = 0.0f;
            }
            C16654c.p pVar6 = m0Var.f84168n;
            if (pVar6 != null) {
                f12 = pVar6.m88528e(this, 1.0f);
            } else {
                f12 = 0.0f;
            }
            C16654c.p pVar7 = m0Var.f84169o;
            if (pVar7 != null) {
                f13 = pVar7.m88528e(this, 1.0f);
            } else {
                f13 = 1.0f;
            }
            C16654c.p pVar8 = m0Var.f84170p;
            if (pVar8 != null) {
                f22 = pVar8.m88528e(this, 1.0f);
            }
            f14 = f22;
            f15 = f11;
            f16 = f12;
            f17 = f13;
        }
        m88573L0();
        this.f84234f = m88568J(m0Var);
        Matrix matrix = new Matrix();
        if (!z12) {
            matrix.preTranslate(bVar.f84022p, bVar.f84023q);
            matrix.preScale(bVar.f84024r, bVar.f84025s);
        }
        Matrix matrix2 = m0Var.f84152j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m0Var.f84150h.size();
        if (size == 0) {
            m88571K0();
            if (z11) {
                this.f84234f.f84270q = false;
                return;
            } else {
                this.f84234f.f84271r = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = m0Var.f84150h.iterator();
        float f23 = -1.0f;
        while (it.hasNext()) {
            C16654c.d0 d0Var = (C16654c.d0) ((C16654c.n0) it.next());
            if (i11 != 0 && d0Var.f84041h.floatValue() < f23) {
                fArr[i11] = f23;
            } else {
                fArr[i11] = d0Var.f84041h.floatValue();
                f23 = d0Var.f84041h.floatValue();
            }
            m88573L0();
            m88581P0(this.f84234f, d0Var);
            C16654c.e0 e0Var = this.f84234f.f84269p;
            C16654c.f fVar = (C16654c.f) e0Var.f84070R;
            if (fVar == null) {
                fVar = C16654c.f.f84127q;
            }
            iArr[i11] = (m88627s(e0Var.f84071S.floatValue()) << 24) | fVar.f84128p;
            i11++;
            m88571K0();
        }
        if ((f15 == f17 && f16 == f14) || size == 1) {
            m88571K0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C16654c.k kVar = m0Var.f84153k;
        if (kVar != null) {
            if (kVar == C16654c.k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (kVar == C16654c.k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m88571K0();
        LinearGradient linearGradient = new LinearGradient(f15, f16, f17, f14, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
    }

    /* renamed from: V */
    Path m88588V(C16654c.d dVar) {
        float f11;
        C16654c.p pVar = dVar.f84038o;
        float f12 = 0.0f;
        if (pVar != null) {
            f11 = pVar.m88529f(this);
        } else {
            f11 = 0.0f;
        }
        C16654c.p pVar2 = dVar.f84039p;
        if (pVar2 != null) {
            f12 = pVar2.m88530g(this);
        }
        float m88527c = dVar.f84040q.m88527c(this);
        float f13 = f11 - m88527c;
        float f14 = f12 - m88527c;
        float f15 = f11 + m88527c;
        float f16 = f12 + m88527c;
        if (dVar.f84159h == null) {
            float f17 = 2.0f * m88527c;
            dVar.f84159h = new C16654c.b(f13, f14, f17, f17);
        }
        float f18 = 0.5522848f * m88527c;
        Path path = new Path();
        path.moveTo(f11, f14);
        float f19 = f11 + f18;
        float f21 = f12 - f18;
        path.cubicTo(f19, f14, f15, f21, f15, f12);
        float f22 = f12 + f18;
        path.cubicTo(f15, f22, f19, f16, f11, f16);
        float f23 = f11 - f18;
        path.cubicTo(f23, f16, f13, f22, f13, f12);
        path.cubicTo(f13, f21, f23, f14, f11, f14);
        path.close();
        return path;
    }

    /* renamed from: W */
    Path m88589W(C16654c.i iVar) {
        float f11;
        C16654c.p pVar = iVar.f84141o;
        float f12 = 0.0f;
        if (pVar != null) {
            f11 = pVar.m88529f(this);
        } else {
            f11 = 0.0f;
        }
        C16654c.p pVar2 = iVar.f84142p;
        if (pVar2 != null) {
            f12 = pVar2.m88530g(this);
        }
        float m88529f = iVar.f84143q.m88529f(this);
        float m88530g = iVar.f84144r.m88530g(this);
        float f13 = f11 - m88529f;
        float f14 = f12 - m88530g;
        float f15 = f11 + m88529f;
        float f16 = f12 + m88530g;
        if (iVar.f84159h == null) {
            iVar.f84159h = new C16654c.b(f13, f14, m88529f * 2.0f, 2.0f * m88530g);
        }
        float f17 = m88529f * 0.5522848f;
        float f18 = 0.5522848f * m88530g;
        Path path = new Path();
        path.moveTo(f11, f14);
        float f19 = f11 + f17;
        float f21 = f12 - f18;
        path.cubicTo(f19, f14, f15, f21, f15, f12);
        float f22 = f18 + f12;
        path.cubicTo(f15, f22, f19, f16, f11, f16);
        float f23 = f11 - f17;
        path.cubicTo(f23, f16, f13, f22, f13, f12);
        path.cubicTo(f13, f21, f23, f14, f11, f14);
        path.close();
        return path;
    }

    /* renamed from: X */
    Path m88590X(C16654c.q qVar) {
        float m88529f;
        float m88530g;
        float m88529f2;
        C16654c.p pVar = qVar.f84182o;
        float f11 = 0.0f;
        if (pVar == null) {
            m88529f = 0.0f;
        } else {
            m88529f = pVar.m88529f(this);
        }
        C16654c.p pVar2 = qVar.f84183p;
        if (pVar2 == null) {
            m88530g = 0.0f;
        } else {
            m88530g = pVar2.m88530g(this);
        }
        C16654c.p pVar3 = qVar.f84184q;
        if (pVar3 == null) {
            m88529f2 = 0.0f;
        } else {
            m88529f2 = pVar3.m88529f(this);
        }
        C16654c.p pVar4 = qVar.f84185r;
        if (pVar4 != null) {
            f11 = pVar4.m88530g(this);
        }
        if (qVar.f84159h == null) {
            qVar.f84159h = new C16654c.b(Math.min(m88529f, m88529f2), Math.min(m88530g, f11), Math.abs(m88529f2 - m88529f), Math.abs(f11 - m88530g));
        }
        Path path = new Path();
        path.moveTo(m88529f, m88530g);
        path.lineTo(m88529f2, f11);
        return path;
    }

    /* renamed from: Y */
    Path m88591Y(C16654c.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.f84224o;
        path.moveTo(fArr[0], fArr[1]);
        int i11 = 2;
        while (true) {
            float[] fArr2 = zVar.f84224o;
            if (i11 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i11], fArr2[i11 + 1]);
            i11 += 2;
        }
        if (zVar instanceof C16654c.a0) {
            path.close();
        }
        if (zVar.f84159h == null) {
            zVar.f84159h = m88609j(path);
        }
        path.setFillType(m88574M());
        return path;
    }

    /* renamed from: Z */
    Path m88592Z(C16654c.b0 b0Var) {
        float m88529f;
        float m88530g;
        float f11;
        float f12;
        Path path;
        C16654c.p pVar = b0Var.f84030s;
        if (pVar == null && b0Var.f84031t == null) {
            m88529f = 0.0f;
            m88530g = 0.0f;
        } else {
            if (pVar == null) {
                m88529f = b0Var.f84031t.m88530g(this);
            } else if (b0Var.f84031t == null) {
                m88529f = pVar.m88529f(this);
            } else {
                m88529f = pVar.m88529f(this);
                m88530g = b0Var.f84031t.m88530g(this);
            }
            m88530g = m88529f;
        }
        float min = Math.min(m88529f, b0Var.f84028q.m88529f(this) / 2.0f);
        float min2 = Math.min(m88530g, b0Var.f84029r.m88530g(this) / 2.0f);
        C16654c.p pVar2 = b0Var.f84026o;
        if (pVar2 != null) {
            f11 = pVar2.m88529f(this);
        } else {
            f11 = 0.0f;
        }
        C16654c.p pVar3 = b0Var.f84027p;
        if (pVar3 != null) {
            f12 = pVar3.m88530g(this);
        } else {
            f12 = 0.0f;
        }
        float m88529f2 = b0Var.f84028q.m88529f(this);
        float m88530g2 = b0Var.f84029r.m88530g(this);
        if (b0Var.f84159h == null) {
            b0Var.f84159h = new C16654c.b(f11, f12, m88529f2, m88530g2);
        }
        float f13 = f11 + m88529f2;
        float f14 = f12 + m88530g2;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(f11, f12);
            path.lineTo(f13, f12);
            path.lineTo(f13, f14);
            path.lineTo(f11, f14);
            path.lineTo(f11, f12);
        } else {
            float f15 = min * 0.5522848f;
            float f16 = 0.5522848f * min2;
            float f17 = f12 + min2;
            path2.moveTo(f11, f17);
            float f18 = f17 - f16;
            float f19 = f11 + min;
            float f21 = f19 - f15;
            path2.cubicTo(f11, f18, f21, f12, f19, f12);
            float f22 = f13 - min;
            path2.lineTo(f22, f12);
            float f23 = f22 + f15;
            path2.cubicTo(f23, f12, f13, f18, f13, f17);
            float f24 = f14 - min2;
            path2.lineTo(f13, f24);
            float f25 = f24 + f16;
            path = path2;
            path2.cubicTo(f13, f25, f23, f14, f22, f14);
            path.lineTo(f19, f14);
            path.cubicTo(f21, f14, f11, f25, f11, f24);
            path.lineTo(f11, f17);
        }
        path.close();
        return path;
    }

    /* renamed from: a */
    void m88593a(C16654c.l lVar, Path path, Matrix matrix) {
        Path m88591Y;
        m88581P0(this.f84234f, lVar);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        Matrix matrix2 = lVar.f84160n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        if (lVar instanceof C16654c.b0) {
            m88591Y = m88592Z((C16654c.b0) lVar);
        } else if (lVar instanceof C16654c.d) {
            m88591Y = m88588V((C16654c.d) lVar);
        } else if (lVar instanceof C16654c.i) {
            m88591Y = m88589W((C16654c.i) lVar);
        } else if (lVar instanceof C16654c.z) {
            m88591Y = m88591Y((C16654c.z) lVar);
        } else {
            return;
        }
        m88615m(lVar);
        path.setFillType(m88591Y.getFillType());
        path.addPath(m88591Y, matrix);
    }

    /* renamed from: a0 */
    void m88594a0(boolean z11, C16654c.b bVar, C16654c.q0 q0Var) {
        boolean z12;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float m88529f;
        float m88530g;
        float m88527c;
        String str = q0Var.f84154l;
        if (str != null) {
            m88558E(q0Var, str);
        }
        Boolean bool = q0Var.f84151i;
        int i11 = 0;
        if (bool != null && bool.booleanValue()) {
            z12 = true;
        } else {
            z12 = false;
        }
        h hVar = this.f84234f;
        if (z11) {
            paint = hVar.f84272s;
        } else {
            paint = hVar.f84273t;
        }
        if (z12) {
            C16654c.p pVar = new C16654c.p(50.0f, C16654c.d1.percent);
            C16654c.p pVar2 = q0Var.f84186m;
            if (pVar2 != null) {
                m88529f = pVar2.m88529f(this);
            } else {
                m88529f = pVar.m88529f(this);
            }
            C16654c.p pVar3 = q0Var.f84187n;
            if (pVar3 != null) {
                m88530g = pVar3.m88530g(this);
            } else {
                m88530g = pVar.m88530g(this);
            }
            C16654c.p pVar4 = q0Var.f84188o;
            if (pVar4 != null) {
                m88527c = pVar4.m88527c(this);
            } else {
                m88527c = pVar.m88527c(this);
            }
            f14 = m88527c;
            f13 = m88529f;
            f15 = m88530g;
        } else {
            C16654c.p pVar5 = q0Var.f84186m;
            float f16 = 0.5f;
            if (pVar5 != null) {
                f11 = pVar5.m88528e(this, 1.0f);
            } else {
                f11 = 0.5f;
            }
            C16654c.p pVar6 = q0Var.f84187n;
            if (pVar6 != null) {
                f12 = pVar6.m88528e(this, 1.0f);
            } else {
                f12 = 0.5f;
            }
            C16654c.p pVar7 = q0Var.f84188o;
            if (pVar7 != null) {
                f16 = pVar7.m88528e(this, 1.0f);
            }
            f13 = f11;
            f14 = f16;
            f15 = f12;
        }
        m88573L0();
        this.f84234f = m88568J(q0Var);
        Matrix matrix = new Matrix();
        if (!z12) {
            matrix.preTranslate(bVar.f84022p, bVar.f84023q);
            matrix.preScale(bVar.f84024r, bVar.f84025s);
        }
        Matrix matrix2 = q0Var.f84152j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q0Var.f84150h.size();
        if (size == 0) {
            m88571K0();
            if (z11) {
                this.f84234f.f84270q = false;
                return;
            } else {
                this.f84234f.f84271r = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = q0Var.f84150h.iterator();
        float f17 = -1.0f;
        while (it.hasNext()) {
            C16654c.d0 d0Var = (C16654c.d0) ((C16654c.n0) it.next());
            if (i11 != 0 && d0Var.f84041h.floatValue() < f17) {
                fArr[i11] = f17;
            } else {
                fArr[i11] = d0Var.f84041h.floatValue();
                f17 = d0Var.f84041h.floatValue();
            }
            m88573L0();
            m88581P0(this.f84234f, d0Var);
            C16654c.e0 e0Var = this.f84234f.f84269p;
            C16654c.f fVar = (C16654c.f) e0Var.f84070R;
            if (fVar == null) {
                fVar = C16654c.f.f84127q;
            }
            iArr[i11] = (m88627s(e0Var.f84071S.floatValue()) << 24) | fVar.f84128p;
            i11++;
            m88571K0();
        }
        if (f14 != 0.0f && size != 1) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            C16654c.k kVar = q0Var.f84153k;
            if (kVar != null) {
                if (kVar == C16654c.k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (kVar == C16654c.k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            m88571K0();
            RadialGradient radialGradient = new RadialGradient(f13, f15, f14, iArr, fArr, tileMode2);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            return;
        }
        m88571K0();
        paint.setColor(iArr[size - 1]);
    }

    /* renamed from: b */
    void m88595b(C16654c.v vVar, Path path, Matrix matrix) {
        m88581P0(this.f84234f, vVar);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        Matrix matrix2 = vVar.f84160n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path m88645f = new d(vVar.f84208o).m88645f();
        if (vVar.f84159h == null) {
            vVar.f84159h = m88609j(m88645f);
        }
        m88615m(vVar);
        path.setFillType(m88574M());
        path.addPath(m88645f, matrix);
    }

    /* renamed from: b0 */
    void m88596b0() {
        this.f84236h.pop();
        this.f84237i.pop();
    }

    /* renamed from: c */
    void m88597c(C16654c.n0 n0Var, boolean z11, Path path, Matrix matrix) {
        if (!m88636x()) {
            return;
        }
        m88631u();
        if (n0Var instanceof C16654c.e1) {
            if (z11) {
                m88601e((C16654c.e1) n0Var, path, matrix);
            } else {
                m88545C("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
        } else if (n0Var instanceof C16654c.v) {
            m88595b((C16654c.v) n0Var, path, matrix);
        } else if (n0Var instanceof C16654c.w0) {
            m88599d((C16654c.w0) n0Var, path, matrix);
        } else if (n0Var instanceof C16654c.l) {
            m88593a((C16654c.l) n0Var, path, matrix);
        } else {
            m88545C("Invalid %s element found in clipPath definition", n0Var.getClass().getSimpleName());
        }
        m88629t();
    }

    /* renamed from: c0 */
    void m88598c0(C16654c.j0 j0Var) {
        this.f84236h.push(j0Var);
        this.f84237i.push(this.f84229a.getMatrix());
    }

    /* renamed from: d */
    void m88599d(C16654c.w0 w0Var, Path path, Matrix matrix) {
        float f11;
        float f12;
        float f13;
        m88581P0(this.f84234f, w0Var);
        if (!m88636x()) {
            return;
        }
        Matrix matrix2 = w0Var.f84215s;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        List list = w0Var.f84018o;
        float f14 = 0.0f;
        if (list != null && list.size() != 0) {
            f11 = ((C16654c.p) w0Var.f84018o.get(0)).m88529f(this);
        } else {
            f11 = 0.0f;
        }
        List list2 = w0Var.f84019p;
        if (list2 != null && list2.size() != 0) {
            f12 = ((C16654c.p) w0Var.f84019p.get(0)).m88530g(this);
        } else {
            f12 = 0.0f;
        }
        List list3 = w0Var.f84020q;
        if (list3 != null && list3.size() != 0) {
            f13 = ((C16654c.p) w0Var.f84020q.get(0)).m88529f(this);
        } else {
            f13 = 0.0f;
        }
        List list4 = w0Var.f84021r;
        if (list4 != null && list4.size() != 0) {
            f14 = ((C16654c.p) w0Var.f84021r.get(0)).m88530g(this);
        }
        if (this.f84234f.f84269p.f84062J != C16654c.e0.e.Start) {
            float m88611k = m88611k(w0Var);
            if (this.f84234f.f84269p.f84062J == C16654c.e0.e.Middle) {
                m88611k /= 2.0f;
            }
            f11 -= m88611k;
        }
        if (w0Var.f84159h == null) {
            i iVar = new i(f11, f12);
            m88553B(w0Var, iVar);
            RectF rectF = iVar.f84280c;
            w0Var.f84159h = new C16654c.b(rectF.left, rectF.top, rectF.width(), iVar.f84280c.height());
        }
        m88615m(w0Var);
        Path path2 = new Path();
        m88553B(w0Var, new g(f11 + f13, f12 + f14, path2));
        path.setFillType(m88574M());
        path.addPath(path2, matrix);
    }

    /* renamed from: d0 */
    void m88600d0(C16654c.k0 k0Var) {
        h hVar = this.f84234f;
        String str = hVar.f84269p.f84074V;
        if (str != null && hVar.f84277x) {
            C16654c.n0 m88490k = this.f84233e.m88490k(str);
            m88551A();
            m88555C0((C16654c.s) m88490k, k0Var);
            Bitmap m88602e0 = m88602e0();
            Canvas canvas = (Canvas) this.f84238j.pop();
            this.f84229a = canvas;
            canvas.save();
            this.f84229a.setMatrix(new Matrix());
            this.f84229a.drawBitmap(m88602e0, 0.0f, 0.0f, this.f84234f.f84272s);
            m88602e0.recycle();
            this.f84229a.restore();
        }
        m88571K0();
    }

    /* renamed from: e */
    void m88601e(C16654c.e1 e1Var, Path path, Matrix matrix) {
        m88581P0(this.f84234f, e1Var);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        Matrix matrix2 = e1Var.f84166o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        C16654c.n0 m88490k = e1Var.f84171a.m88490k(e1Var.f84122p);
        if (m88490k == null) {
            m88545C("Use reference '%s' not found", e1Var.f84122p);
        } else {
            m88615m(e1Var);
            m88597c(m88490k, false, path, matrix);
        }
    }

    /* renamed from: e0 */
    Bitmap m88602e0() {
        Bitmap bitmap = (Bitmap) this.f84239k.pop();
        Bitmap bitmap2 = (Bitmap) this.f84239k.pop();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width];
        int[] iArr2 = new int[width];
        int i11 = 0;
        while (i11 < height) {
            bitmap.getPixels(iArr, 0, width, 0, i11, width, 1);
            int i12 = i11;
            bitmap2.getPixels(iArr2, 0, width, 0, i11, width, 1);
            for (int i13 = 0; i13 < width; i13++) {
                int i14 = iArr[i13];
                int i15 = i14 & 255;
                int i16 = (i14 >> 8) & 255;
                int i17 = (i14 >> 16) & 255;
                int i18 = (i14 >> 24) & 255;
                if (i18 == 0) {
                    iArr2[i13] = 0;
                } else {
                    int i19 = ((((i17 * 6963) + (i16 * 23442)) + (i15 * 2362)) * i18) / 8355840;
                    int i21 = iArr2[i13];
                    iArr2[i13] = (i21 & 16777215) | (((((i21 >> 24) & 255) * i19) / 255) << 24);
                }
            }
            bitmap2.setPixels(iArr2, 0, width, 0, i12, width, 1);
            i11 = i12 + 1;
        }
        bitmap.recycle();
        return bitmap2;
    }

    /* renamed from: f0 */
    void m88603f0(C16654c.n0 n0Var, j jVar) {
        float f11;
        float f12;
        float f13;
        float f14;
        if (!jVar.mo88647a((C16654c.y0) n0Var)) {
            return;
        }
        if (n0Var instanceof C16654c.z0) {
            m88573L0();
            m88559E0((C16654c.z0) n0Var);
            m88571K0();
            return;
        }
        if (n0Var instanceof C16654c.v0) {
            m88550v("TSpan render", new Object[0]);
            m88573L0();
            C16654c.v0 v0Var = (C16654c.v0) n0Var;
            m88581P0(this.f84234f, v0Var);
            if (m88636x()) {
                boolean z11 = jVar instanceof f;
                float f15 = 0.0f;
                if (z11) {
                    List list = v0Var.f84018o;
                    if (list != null && list.size() != 0) {
                        f14 = ((C16654c.p) v0Var.f84018o.get(0)).m88529f(this);
                    } else {
                        f14 = ((f) jVar).f84262a;
                    }
                    List list2 = v0Var.f84019p;
                    if (list2 != null && list2.size() != 0) {
                        f12 = ((C16654c.p) v0Var.f84019p.get(0)).m88530g(this);
                    } else {
                        f12 = ((f) jVar).f84263b;
                    }
                    List list3 = v0Var.f84020q;
                    if (list3 != null && list3.size() != 0) {
                        f13 = ((C16654c.p) v0Var.f84020q.get(0)).m88529f(this);
                    } else {
                        f13 = 0.0f;
                    }
                    List list4 = v0Var.f84021r;
                    if (list4 != null && list4.size() != 0) {
                        f15 = ((C16654c.p) v0Var.f84021r.get(0)).m88530g(this);
                    }
                    f11 = f15;
                    f15 = f14;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
                }
                m88619o((C16654c.k0) v0Var.mo88500e());
                if (z11) {
                    f fVar = (f) jVar;
                    fVar.f84262a = f15 + f13;
                    fVar.f84263b = f12 + f11;
                }
                boolean m88604g0 = m88604g0();
                m88553B(v0Var, jVar);
                if (m88604g0) {
                    m88600d0(v0Var);
                }
            }
            m88571K0();
            return;
        }
        if (n0Var instanceof C16654c.u0) {
            m88573L0();
            C16654c.u0 u0Var = (C16654c.u0) n0Var;
            m88581P0(this.f84234f, u0Var);
            if (m88636x()) {
                m88619o((C16654c.k0) u0Var.mo88500e());
                C16654c.n0 m88490k = n0Var.f84171a.m88490k(u0Var.f84206o);
                if (m88490k != null && (m88490k instanceof C16654c.y0)) {
                    StringBuilder sb2 = new StringBuilder();
                    m88556D((C16654c.y0) m88490k, sb2);
                    if (sb2.length() > 0) {
                        jVar.mo88646b(sb2.toString());
                    }
                } else {
                    m88545C("Tref reference '%s' not found", u0Var.f84206o);
                }
            }
            m88571K0();
        }
    }

    /* renamed from: g0 */
    boolean m88604g0() {
        if (!m88561F0()) {
            return false;
        }
        this.f84229a.saveLayerAlpha(null, m88627s(this.f84234f.f84269p.f84054B.floatValue()));
        this.f84235g.push(this.f84234f);
        h hVar = (h) this.f84234f.clone();
        this.f84234f = hVar;
        String str = hVar.f84269p.f84074V;
        if (str != null && hVar.f84277x) {
            C16654c.n0 m88490k = this.f84233e.m88490k(str);
            if (m88490k != null && (m88490k instanceof C16654c.s)) {
                this.f84238j.push(this.f84229a);
                m88551A();
            } else {
                m88545C("Mask reference '%s' not found", this.f84234f.f84269p.f84074V);
                this.f84234f.f84269p.f84074V = null;
            }
        }
        return true;
    }

    /* renamed from: h */
    List m88605h(C16654c.q qVar) {
        float f11;
        float f12;
        float f13;
        C16654c.p pVar = qVar.f84182o;
        float f14 = 0.0f;
        if (pVar != null) {
            f11 = pVar.m88529f(this);
        } else {
            f11 = 0.0f;
        }
        C16654c.p pVar2 = qVar.f84183p;
        if (pVar2 != null) {
            f12 = pVar2.m88530g(this);
        } else {
            f12 = 0.0f;
        }
        C16654c.p pVar3 = qVar.f84184q;
        if (pVar3 != null) {
            f13 = pVar3.m88529f(this);
        } else {
            f13 = 0.0f;
        }
        C16654c.p pVar4 = qVar.f84185r;
        if (pVar4 != null) {
            f14 = pVar4.m88530g(this);
        }
        ArrayList arrayList = new ArrayList(2);
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        arrayList.add(new c(f11, f12, f15, f16));
        arrayList.add(new c(f13, f14, f15, f16));
        return arrayList;
    }

    /* renamed from: h0 */
    void m88606h0(C16654c.d dVar) {
        m88550v("Circle render", new Object[0]);
        C16654c.p pVar = dVar.f84040q;
        if (pVar != null && !pVar.m88532i()) {
            m88581P0(this.f84234f, dVar);
            if (!m88636x() || !m88585R0()) {
                return;
            }
            Matrix matrix = dVar.f84160n;
            if (matrix != null) {
                this.f84229a.concat(matrix);
            }
            Path m88588V = m88588V(dVar);
            m88577N0(dVar);
            m88619o(dVar);
            m88615m(dVar);
            boolean m88604g0 = m88604g0();
            if (this.f84234f.f84270q) {
                m88638y(dVar, m88588V);
            }
            if (this.f84234f.f84271r) {
                m88640z(m88588V);
            }
            if (m88604g0) {
                m88600d0(dVar);
            }
        }
    }

    /* renamed from: i */
    List m88607i(C16654c.z zVar) {
        int length = zVar.f84224o.length;
        int i11 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = zVar.f84224o;
        float f11 = 0.0f;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f12 = 0.0f;
        while (i11 < length) {
            float[] fArr2 = zVar.f84224o;
            f11 = fArr2[i11];
            f12 = fArr2[i11 + 1];
            cVar.m88643a(f11, f12);
            arrayList.add(cVar);
            i11 += 2;
            cVar = new c(f11, f12, f11 - cVar.f84253a, f12 - cVar.f84254b);
        }
        if (zVar instanceof C16654c.a0) {
            float[] fArr3 = zVar.f84224o;
            float f13 = fArr3[0];
            if (f11 != f13) {
                float f14 = fArr3[1];
                if (f12 != f14) {
                    cVar.m88643a(f13, f14);
                    arrayList.add(cVar);
                    c cVar2 = new c(f13, f14, f13 - cVar.f84253a, f14 - cVar.f84254b);
                    cVar2.m88644b((c) arrayList.get(0));
                    arrayList.add(cVar2);
                    arrayList.set(0, cVar2);
                }
            }
        } else {
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: i0 */
    void m88608i0(C16654c.i iVar) {
        m88550v("Ellipse render", new Object[0]);
        C16654c.p pVar = iVar.f84143q;
        if (pVar != null && iVar.f84144r != null && !pVar.m88532i() && !iVar.f84144r.m88532i()) {
            m88581P0(this.f84234f, iVar);
            if (!m88636x() || !m88585R0()) {
                return;
            }
            Matrix matrix = iVar.f84160n;
            if (matrix != null) {
                this.f84229a.concat(matrix);
            }
            Path m88589W = m88589W(iVar);
            m88577N0(iVar);
            m88619o(iVar);
            m88615m(iVar);
            boolean m88604g0 = m88604g0();
            if (this.f84234f.f84270q) {
                m88638y(iVar, m88589W);
            }
            if (this.f84234f.f84271r) {
                m88640z(m88589W);
            }
            if (m88604g0) {
                m88600d0(iVar);
            }
        }
    }

    /* renamed from: j */
    C16654c.b m88609j(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C16654c.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: j0 */
    void m88610j0(C16654c.m mVar) {
        m88550v("Group render", new Object[0]);
        m88581P0(this.f84234f, mVar);
        if (!m88636x()) {
            return;
        }
        Matrix matrix = mVar.f84166o;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        m88615m(mVar);
        boolean m88604g0 = m88604g0();
        m88639y0(mVar, true);
        if (m88604g0) {
            m88600d0(mVar);
        }
        m88577N0(mVar);
    }

    /* renamed from: k */
    float m88611k(C16654c.y0 y0Var) {
        k kVar = new k();
        m88553B(y0Var, kVar);
        return kVar.f84282a;
    }

    /* renamed from: k0 */
    void m88612k0(C16654c.o oVar) {
        C16654c.p pVar;
        String str;
        float f11;
        float f12;
        m88550v("Image render", new Object[0]);
        C16654c.p pVar2 = oVar.f84176s;
        if (pVar2 == null || pVar2.m88532i() || (pVar = oVar.f84177t) == null || pVar.m88532i() || (str = oVar.f84173p) == null) {
            return;
        }
        C16653b c16653b = oVar.f84181o;
        if (c16653b == null) {
            c16653b = C16653b.f83988e;
        }
        Bitmap m88621p = m88621p(str);
        if (m88621p == null) {
            this.f84233e.m88485e();
            return;
        }
        m88581P0(this.f84234f, oVar);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        Matrix matrix = oVar.f84178u;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        C16654c.p pVar3 = oVar.f84174q;
        if (pVar3 != null) {
            f11 = pVar3.m88529f(this);
        } else {
            f11 = 0.0f;
        }
        C16654c.p pVar4 = oVar.f84175r;
        if (pVar4 != null) {
            f12 = pVar4.m88530g(this);
        } else {
            f12 = 0.0f;
        }
        this.f84234f.f84274u = new C16654c.b(f11, f12, oVar.f84176s.m88529f(this), oVar.f84177t.m88529f(this));
        if (!this.f84234f.f84269p.f84063K.booleanValue()) {
            C16654c.b bVar = this.f84234f.f84274u;
            m88565H0(bVar.f84022p, bVar.f84023q, bVar.f84024r, bVar.f84025s);
        }
        C16654c.b bVar2 = new C16654c.b(0.0f, 0.0f, m88621p.getWidth(), m88621p.getHeight());
        oVar.f84159h = bVar2;
        this.f84229a.concat(m88613l(this.f84234f.f84274u, bVar2, c16653b));
        m88577N0(oVar);
        m88615m(oVar);
        boolean m88604g0 = m88604g0();
        m88583Q0();
        this.f84229a.drawBitmap(m88621p, 0.0f, 0.0f, new Paint());
        if (m88604g0) {
            m88600d0(oVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:            if (r12 != 8) goto L76;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Matrix m88613l(C16654c.b bVar, C16654c.b bVar2, C16653b c16653b) {
        float min;
        float f11;
        float f12;
        Matrix matrix = new Matrix();
        if (c16653b != null && c16653b.m88476a() != null) {
            float f13 = bVar.f84024r / bVar2.f84024r;
            float f14 = bVar.f84025s / bVar2.f84025s;
            float f15 = -bVar2.f84022p;
            float f16 = -bVar2.f84023q;
            if (c16653b.equals(C16653b.f83987d)) {
                matrix.preTranslate(bVar.f84022p, bVar.f84023q);
                matrix.preScale(f13, f14);
                matrix.preTranslate(f15, f16);
                return matrix;
            }
            if (c16653b.m88477b() == C16653b.b.Slice) {
                min = Math.max(f13, f14);
            } else {
                min = Math.min(f13, f14);
            }
            float f17 = bVar.f84024r / min;
            float f18 = bVar.f84025s / min;
            int[] iArr = a.f84240a;
            switch (iArr[c16653b.m88476a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f12 = (bVar2.f84024r - f17) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f12 = bVar2.f84024r - f17;
                    break;
            }
            f15 -= f12;
            int i11 = iArr[c16653b.m88476a().ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                            }
                        }
                    }
                }
                f11 = bVar2.f84025s - f18;
                f16 -= f11;
                matrix.preTranslate(bVar.f84022p, bVar.f84023q);
                matrix.preScale(min, min);
                matrix.preTranslate(f15, f16);
            }
            f11 = (bVar2.f84025s - f18) / 2.0f;
            f16 -= f11;
            matrix.preTranslate(bVar.f84022p, bVar.f84023q);
            matrix.preScale(min, min);
            matrix.preTranslate(f15, f16);
        }
        return matrix;
    }

    /* renamed from: l0 */
    void m88614l0(C16654c.q qVar) {
        m88550v("Line render", new Object[0]);
        m88581P0(this.f84234f, qVar);
        if (!m88636x() || !m88585R0() || !this.f84234f.f84271r) {
            return;
        }
        Matrix matrix = qVar.f84160n;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        Path m88590X = m88590X(qVar);
        m88577N0(qVar);
        m88619o(qVar);
        m88615m(qVar);
        boolean m88604g0 = m88604g0();
        m88640z(m88590X);
        m88554B0(qVar);
        if (m88604g0) {
            m88600d0(qVar);
        }
    }

    /* renamed from: m */
    void m88615m(C16654c.k0 k0Var) {
        m88617n(k0Var, k0Var.f84159h);
    }

    /* renamed from: m0 */
    void m88616m0(C16654c.v vVar) {
        m88550v("Path render", new Object[0]);
        if (vVar.f84208o == null) {
            return;
        }
        m88581P0(this.f84234f, vVar);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        h hVar = this.f84234f;
        if (!hVar.f84271r && !hVar.f84270q) {
            return;
        }
        Matrix matrix = vVar.f84160n;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        Path m88645f = new d(vVar.f84208o).m88645f();
        if (vVar.f84159h == null) {
            vVar.f84159h = m88609j(m88645f);
        }
        m88577N0(vVar);
        m88619o(vVar);
        m88615m(vVar);
        boolean m88604g0 = m88604g0();
        if (this.f84234f.f84270q) {
            m88645f.setFillType(m88584R());
            m88638y(vVar, m88645f);
        }
        if (this.f84234f.f84271r) {
            m88640z(m88645f);
        }
        m88554B0(vVar);
        if (m88604g0) {
            m88600d0(vVar);
        }
    }

    /* renamed from: n */
    void m88617n(C16654c.k0 k0Var, C16654c.b bVar) {
        boolean z11;
        String str = this.f84234f.f84269p.f84072T;
        if (str == null) {
            return;
        }
        C16654c.n0 m88490k = k0Var.f84171a.m88490k(str);
        if (m88490k == null) {
            m88545C("ClipPath reference '%s' not found", this.f84234f.f84269p.f84072T);
            return;
        }
        C16654c.e eVar = (C16654c.e) m88490k;
        if (eVar.f84135i.isEmpty()) {
            this.f84229a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = eVar.f84052p;
        if (bool != null && !bool.booleanValue()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((k0Var instanceof C16654c.m) && !z11) {
            m88547S0("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", k0Var.getClass().getSimpleName());
            return;
        }
        m88631u();
        if (!z11) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(bVar.f84022p, bVar.f84023q);
            matrix.preScale(bVar.f84024r, bVar.f84025s);
            this.f84229a.concat(matrix);
        }
        Matrix matrix2 = eVar.f84166o;
        if (matrix2 != null) {
            this.f84229a.concat(matrix2);
        }
        this.f84234f = m88568J(eVar);
        m88615m(eVar);
        Path path = new Path();
        Iterator it = eVar.f84135i.iterator();
        while (it.hasNext()) {
            m88597c((C16654c.n0) it.next(), true, path, new Matrix());
        }
        this.f84229a.clipPath(path);
        m88629t();
    }

    /* renamed from: n0 */
    void m88618n0(C16654c.z zVar) {
        m88550v("PolyLine render", new Object[0]);
        m88581P0(this.f84234f, zVar);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        h hVar = this.f84234f;
        if (!hVar.f84271r && !hVar.f84270q) {
            return;
        }
        Matrix matrix = zVar.f84160n;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        if (zVar.f84224o.length < 2) {
            return;
        }
        Path m88591Y = m88591Y(zVar);
        m88577N0(zVar);
        m88619o(zVar);
        m88615m(zVar);
        boolean m88604g0 = m88604g0();
        if (this.f84234f.f84270q) {
            m88638y(zVar, m88591Y);
        }
        if (this.f84234f.f84271r) {
            m88640z(m88591Y);
        }
        m88554B0(zVar);
        if (m88604g0) {
            m88600d0(zVar);
        }
    }

    /* renamed from: o */
    void m88619o(C16654c.k0 k0Var) {
        C16654c.o0 o0Var = this.f84234f.f84269p.f84081q;
        if (o0Var instanceof C16654c.u) {
            m88634w(true, k0Var.f84159h, (C16654c.u) o0Var);
        }
        C16654c.o0 o0Var2 = this.f84234f.f84269p.f84084t;
        if (o0Var2 instanceof C16654c.u) {
            m88634w(false, k0Var.f84159h, (C16654c.u) o0Var2);
        }
    }

    /* renamed from: o0 */
    void m88620o0(C16654c.a0 a0Var) {
        m88550v("Polygon render", new Object[0]);
        m88581P0(this.f84234f, a0Var);
        if (!m88636x() || !m88585R0()) {
            return;
        }
        h hVar = this.f84234f;
        if (!hVar.f84271r && !hVar.f84270q) {
            return;
        }
        Matrix matrix = a0Var.f84160n;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        if (a0Var.f84224o.length < 2) {
            return;
        }
        Path m88591Y = m88591Y(a0Var);
        m88577N0(a0Var);
        m88619o(a0Var);
        m88615m(a0Var);
        boolean m88604g0 = m88604g0();
        if (this.f84234f.f84270q) {
            m88638y(a0Var, m88591Y);
        }
        if (this.f84234f.f84271r) {
            m88640z(m88591Y);
        }
        m88554B0(a0Var);
        if (m88604g0) {
            m88600d0(a0Var);
        }
    }

    /* renamed from: p */
    Bitmap m88621p(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) == -1 || indexOf < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: p0 */
    void m88622p0(C16654c.b0 b0Var) {
        m88550v("Rect render", new Object[0]);
        C16654c.p pVar = b0Var.f84028q;
        if (pVar != null && b0Var.f84029r != null && !pVar.m88532i() && !b0Var.f84029r.m88532i()) {
            m88581P0(this.f84234f, b0Var);
            if (!m88636x() || !m88585R0()) {
                return;
            }
            Matrix matrix = b0Var.f84160n;
            if (matrix != null) {
                this.f84229a.concat(matrix);
            }
            Path m88592Z = m88592Z(b0Var);
            m88577N0(b0Var);
            m88619o(b0Var);
            m88615m(b0Var);
            boolean m88604g0 = m88604g0();
            if (this.f84234f.f84270q) {
                m88638y(b0Var, m88592Z);
            }
            if (this.f84234f.f84271r) {
                m88640z(m88592Z);
            }
            if (m88604g0) {
                m88600d0(b0Var);
            }
        }
    }

    /* renamed from: q */
    Typeface m88623q(String str, Integer num, C16654c.e0.b bVar) {
        boolean z11;
        int i11 = 0;
        if (bVar == C16654c.e0.b.Italic) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (num.intValue() > 500) {
            if (z11) {
                i11 = 3;
            } else {
                i11 = 1;
            }
        } else if (z11) {
            i11 = 2;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i11);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i11);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i11);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i11);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i11);
        }
        return null;
    }

    /* renamed from: q0 */
    void m88624q0(C16654c.f0 f0Var) {
        m88626r0(f0Var, f0Var.f84131s, f0Var.f84132t);
    }

    /* renamed from: r */
    void m88625r(C16654c.n0 n0Var) {
        Boolean bool;
        if ((n0Var instanceof C16654c.l0) && (bool = ((C16654c.l0) n0Var).f84162d) != null) {
            this.f84234f.f84276w = bool.booleanValue();
        }
    }

    /* renamed from: r0 */
    void m88626r0(C16654c.f0 f0Var, C16654c.p pVar, C16654c.p pVar2) {
        m88628s0(f0Var, pVar, pVar2, f0Var.f84197p, f0Var.f84181o);
    }

    /* renamed from: s */
    int m88627s(float f11) {
        int i11 = (int) (f11 * 256.0f);
        if (i11 < 0) {
            return 0;
        }
        if (i11 > 255) {
            return 255;
        }
        return i11;
    }

    /* renamed from: s0 */
    void m88628s0(C16654c.f0 f0Var, C16654c.p pVar, C16654c.p pVar2, C16654c.b bVar, C16653b c16653b) {
        float f11;
        float f12;
        float f13;
        float f14;
        m88550v("Svg render", new Object[0]);
        if (pVar == null || !pVar.m88532i()) {
            if (pVar2 != null && pVar2.m88532i()) {
                return;
            }
            if (c16653b == null && (c16653b = f0Var.f84181o) == null) {
                c16653b = C16653b.f83988e;
            }
            m88581P0(this.f84234f, f0Var);
            if (!m88636x()) {
                return;
            }
            float f15 = 0.0f;
            if (f0Var.f84172b != null) {
                C16654c.p pVar3 = f0Var.f84129q;
                if (pVar3 != null) {
                    f14 = pVar3.m88529f(this);
                } else {
                    f14 = 0.0f;
                }
                C16654c.p pVar4 = f0Var.f84130r;
                if (pVar4 != null) {
                    f15 = pVar4.m88530g(this);
                }
                float f16 = f15;
                f15 = f14;
                f11 = f16;
            } else {
                f11 = 0.0f;
            }
            C16654c.b m88580P = m88580P();
            if (pVar != null) {
                f12 = pVar.m88529f(this);
            } else {
                f12 = m88580P.f84024r;
            }
            if (pVar2 != null) {
                f13 = pVar2.m88530g(this);
            } else {
                f13 = m88580P.f84025s;
            }
            this.f84234f.f84274u = new C16654c.b(f15, f11, f12, f13);
            if (!this.f84234f.f84269p.f84063K.booleanValue()) {
                C16654c.b bVar2 = this.f84234f.f84274u;
                m88565H0(bVar2.f84022p, bVar2.f84023q, bVar2.f84024r, bVar2.f84025s);
            }
            m88617n(f0Var, this.f84234f.f84274u);
            if (bVar != null) {
                this.f84229a.concat(m88613l(this.f84234f.f84274u, bVar, c16653b));
                this.f84234f.f84275v = f0Var.f84197p;
            } else {
                this.f84229a.translate(f15, f11);
            }
            boolean m88604g0 = m88604g0();
            m88583Q0();
            m88639y0(f0Var, true);
            if (m88604g0) {
                m88600d0(f0Var);
            }
            m88577N0(f0Var);
        }
    }

    /* renamed from: t */
    void m88629t() {
        this.f84229a.restore();
        this.f84234f = (h) this.f84235g.pop();
    }

    /* renamed from: t0 */
    void m88630t0(C16654c.n0 n0Var) {
        if (n0Var instanceof C16654c.t) {
            return;
        }
        m88573L0();
        m88625r(n0Var);
        if (n0Var instanceof C16654c.f0) {
            m88624q0((C16654c.f0) n0Var);
        } else if (n0Var instanceof C16654c.e1) {
            m88637x0((C16654c.e1) n0Var);
        } else if (n0Var instanceof C16654c.s0) {
            m88632u0((C16654c.s0) n0Var);
        } else if (n0Var instanceof C16654c.m) {
            m88610j0((C16654c.m) n0Var);
        } else if (n0Var instanceof C16654c.o) {
            m88612k0((C16654c.o) n0Var);
        } else if (n0Var instanceof C16654c.v) {
            m88616m0((C16654c.v) n0Var);
        } else if (n0Var instanceof C16654c.b0) {
            m88622p0((C16654c.b0) n0Var);
        } else if (n0Var instanceof C16654c.d) {
            m88606h0((C16654c.d) n0Var);
        } else if (n0Var instanceof C16654c.i) {
            m88608i0((C16654c.i) n0Var);
        } else if (n0Var instanceof C16654c.q) {
            m88614l0((C16654c.q) n0Var);
        } else if (n0Var instanceof C16654c.a0) {
            m88620o0((C16654c.a0) n0Var);
        } else if (n0Var instanceof C16654c.z) {
            m88618n0((C16654c.z) n0Var);
        } else if (n0Var instanceof C16654c.w0) {
            m88635w0((C16654c.w0) n0Var);
        }
        m88571K0();
    }

    /* renamed from: u */
    void m88631u() {
        this.f84229a.save();
        this.f84235g.push(this.f84234f);
        this.f84234f = (h) this.f84234f.clone();
    }

    /* renamed from: u0 */
    void m88632u0(C16654c.s0 s0Var) {
        m88550v("Switch render", new Object[0]);
        m88581P0(this.f84234f, s0Var);
        if (!m88636x()) {
            return;
        }
        Matrix matrix = s0Var.f84166o;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        m88615m(s0Var);
        boolean m88604g0 = m88604g0();
        m88557D0(s0Var);
        if (m88604g0) {
            m88600d0(s0Var);
        }
        m88577N0(s0Var);
    }

    /* renamed from: v0 */
    void m88633v0(C16654c.t0 t0Var, C16654c.p pVar, C16654c.p pVar2) {
        float f11;
        float f12;
        m88550v("Symbol render", new Object[0]);
        if (pVar == null || !pVar.m88532i()) {
            if (pVar2 != null && pVar2.m88532i()) {
                return;
            }
            C16653b c16653b = t0Var.f84181o;
            if (c16653b == null) {
                c16653b = C16653b.f83988e;
            }
            m88581P0(this.f84234f, t0Var);
            if (pVar != null) {
                f11 = pVar.m88529f(this);
            } else {
                f11 = this.f84234f.f84274u.f84024r;
            }
            if (pVar2 != null) {
                f12 = pVar2.m88529f(this);
            } else {
                f12 = this.f84234f.f84274u.f84025s;
            }
            this.f84234f.f84274u = new C16654c.b(0.0f, 0.0f, f11, f12);
            if (!this.f84234f.f84269p.f84063K.booleanValue()) {
                C16654c.b bVar = this.f84234f.f84274u;
                m88565H0(bVar.f84022p, bVar.f84023q, bVar.f84024r, bVar.f84025s);
            }
            C16654c.b bVar2 = t0Var.f84197p;
            if (bVar2 != null) {
                this.f84229a.concat(m88613l(this.f84234f.f84274u, bVar2, c16653b));
                this.f84234f.f84275v = t0Var.f84197p;
            }
            boolean m88604g0 = m88604g0();
            m88639y0(t0Var, true);
            if (m88604g0) {
                m88600d0(t0Var);
            }
            m88577N0(t0Var);
        }
    }

    /* renamed from: w */
    void m88634w(boolean z11, C16654c.b bVar, C16654c.u uVar) {
        String str;
        C16654c.n0 m88490k = this.f84233e.m88490k(uVar.f84204p);
        if (m88490k == null) {
            Object[] objArr = new Object[2];
            if (z11) {
                str = "Fill";
            } else {
                str = "Stroke";
            }
            objArr[0] = str;
            objArr[1] = uVar.f84204p;
            m88545C("%s reference '%s' not found", objArr);
            C16654c.o0 o0Var = uVar.f84205q;
            if (o0Var != null) {
                m88567I0(this.f84234f, z11, o0Var);
                return;
            } else if (z11) {
                this.f84234f.f84270q = false;
                return;
            } else {
                this.f84234f.f84271r = false;
                return;
            }
        }
        if (m88490k instanceof C16654c.m0) {
            m88587U(z11, bVar, (C16654c.m0) m88490k);
        }
        if (m88490k instanceof C16654c.q0) {
            m88594a0(z11, bVar, (C16654c.q0) m88490k);
        }
        if (m88490k instanceof C16654c.c0) {
            m88569J0(z11, (C16654c.c0) m88490k);
        }
    }

    /* renamed from: w0 */
    void m88635w0(C16654c.w0 w0Var) {
        float f11;
        float f12;
        float f13;
        m88550v("Text render", new Object[0]);
        m88581P0(this.f84234f, w0Var);
        if (!m88636x()) {
            return;
        }
        Matrix matrix = w0Var.f84215s;
        if (matrix != null) {
            this.f84229a.concat(matrix);
        }
        List list = w0Var.f84018o;
        float f14 = 0.0f;
        if (list != null && list.size() != 0) {
            f11 = ((C16654c.p) w0Var.f84018o.get(0)).m88529f(this);
        } else {
            f11 = 0.0f;
        }
        List list2 = w0Var.f84019p;
        if (list2 != null && list2.size() != 0) {
            f12 = ((C16654c.p) w0Var.f84019p.get(0)).m88530g(this);
        } else {
            f12 = 0.0f;
        }
        List list3 = w0Var.f84020q;
        if (list3 != null && list3.size() != 0) {
            f13 = ((C16654c.p) w0Var.f84020q.get(0)).m88529f(this);
        } else {
            f13 = 0.0f;
        }
        List list4 = w0Var.f84021r;
        if (list4 != null && list4.size() != 0) {
            f14 = ((C16654c.p) w0Var.f84021r.get(0)).m88530g(this);
        }
        C16654c.e0.e m88572L = m88572L();
        if (m88572L != C16654c.e0.e.Start) {
            float m88611k = m88611k(w0Var);
            if (m88572L == C16654c.e0.e.Middle) {
                m88611k /= 2.0f;
            }
            f11 -= m88611k;
        }
        if (w0Var.f84159h == null) {
            i iVar = new i(f11, f12);
            m88553B(w0Var, iVar);
            RectF rectF = iVar.f84280c;
            w0Var.f84159h = new C16654c.b(rectF.left, rectF.top, rectF.width(), iVar.f84280c.height());
        }
        m88577N0(w0Var);
        m88619o(w0Var);
        m88615m(w0Var);
        boolean m88604g0 = m88604g0();
        m88553B(w0Var, new f(f11 + f13, f12 + f14));
        if (m88604g0) {
            m88600d0(w0Var);
        }
    }

    /* renamed from: x */
    boolean m88636x() {
        Boolean bool = this.f84234f.f84269p.f84068P;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: x0 */
    void m88637x0(C16654c.e1 e1Var) {
        float f11;
        m88550v("Use render", new Object[0]);
        C16654c.p pVar = e1Var.f84125s;
        if (pVar == null || !pVar.m88532i()) {
            C16654c.p pVar2 = e1Var.f84126t;
            if (pVar2 != null && pVar2.m88532i()) {
                return;
            }
            m88581P0(this.f84234f, e1Var);
            if (!m88636x()) {
                return;
            }
            C16654c.n0 m88490k = e1Var.f84171a.m88490k(e1Var.f84122p);
            if (m88490k == null) {
                m88545C("Use reference '%s' not found", e1Var.f84122p);
                return;
            }
            Matrix matrix = e1Var.f84166o;
            if (matrix != null) {
                this.f84229a.concat(matrix);
            }
            Matrix matrix2 = new Matrix();
            C16654c.p pVar3 = e1Var.f84123q;
            float f12 = 0.0f;
            if (pVar3 != null) {
                f11 = pVar3.m88529f(this);
            } else {
                f11 = 0.0f;
            }
            C16654c.p pVar4 = e1Var.f84124r;
            if (pVar4 != null) {
                f12 = pVar4.m88530g(this);
            }
            matrix2.preTranslate(f11, f12);
            this.f84229a.concat(matrix2);
            m88615m(e1Var);
            boolean m88604g0 = m88604g0();
            m88598c0(e1Var);
            if (m88490k instanceof C16654c.f0) {
                m88573L0();
                C16654c.f0 f0Var = (C16654c.f0) m88490k;
                C16654c.p pVar5 = e1Var.f84125s;
                if (pVar5 == null) {
                    pVar5 = f0Var.f84131s;
                }
                C16654c.p pVar6 = e1Var.f84126t;
                if (pVar6 == null) {
                    pVar6 = f0Var.f84132t;
                }
                m88626r0(f0Var, pVar5, pVar6);
                m88571K0();
            } else if (m88490k instanceof C16654c.t0) {
                C16654c.p pVar7 = e1Var.f84125s;
                if (pVar7 == null) {
                    pVar7 = new C16654c.p(100.0f, C16654c.d1.percent);
                }
                C16654c.p pVar8 = e1Var.f84126t;
                if (pVar8 == null) {
                    pVar8 = new C16654c.p(100.0f, C16654c.d1.percent);
                }
                m88573L0();
                m88633v0((C16654c.t0) m88490k, pVar7, pVar8);
                m88571K0();
            } else {
                m88630t0(m88490k);
            }
            m88596b0();
            if (m88604g0) {
                m88600d0(e1Var);
            }
            m88577N0(e1Var);
        }
    }

    /* renamed from: y */
    void m88638y(C16654c.k0 k0Var, Path path) {
        C16654c.o0 o0Var = this.f84234f.f84269p.f84081q;
        if (o0Var instanceof C16654c.u) {
            C16654c.n0 m88490k = this.f84233e.m88490k(((C16654c.u) o0Var).f84204p);
            if (m88490k instanceof C16654c.y) {
                m88566I(k0Var, path, (C16654c.y) m88490k);
                return;
            }
        }
        this.f84229a.drawPath(path, this.f84234f.f84272s);
    }

    /* renamed from: y0 */
    void m88639y0(C16654c.j0 j0Var, boolean z11) {
        if (z11) {
            m88598c0(j0Var);
        }
        Iterator it = j0Var.mo88498b().iterator();
        while (it.hasNext()) {
            m88630t0((C16654c.n0) it.next());
        }
        if (z11) {
            m88596b0();
        }
    }

    /* renamed from: z */
    void m88640z(Path path) {
        h hVar = this.f84234f;
        if (hVar.f84269p.f84079a0 == C16654c.e0.h.NonScalingStroke) {
            Matrix matrix = this.f84229a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f84229a.setMatrix(new Matrix());
            Shader shader = this.f84234f.f84273t.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f84229a.drawPath(path2, this.f84234f.f84273t);
            this.f84229a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f84229a.drawPath(path, hVar.f84273t);
    }

    /* renamed from: z0 */
    public void m88641z0(C16654c c16654c, C16654c.b bVar, C16653b c16653b, boolean z11) {
        this.f84233e = c16654c;
        this.f84232d = z11;
        C16654c.f0 m88486g = c16654c.m88486g();
        if (m88486g == null) {
            m88547S0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        m88563G0();
        m88625r(m88486g);
        C16654c.p pVar = m88486g.f84131s;
        C16654c.p pVar2 = m88486g.f84132t;
        if (bVar == null) {
            bVar = m88486g.f84197p;
        }
        C16654c.b bVar2 = bVar;
        if (c16653b == null) {
            c16653b = m88486g.f84181o;
        }
        m88628s0(m88486g, pVar, pVar2, bVar2, c16653b);
    }
}
