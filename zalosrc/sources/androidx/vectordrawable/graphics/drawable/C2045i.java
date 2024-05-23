package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.content.res.C1397d;
import androidx.core.graphics.AbstractC1424h;
import androidx.core.graphics.drawable.AbstractC1414a;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p665y0.C30239a;

/* renamed from: androidx.vectordrawable.graphics.drawable.i */
/* loaded from: classes.dex */
public class C2045i extends AbstractC2044h {

    /* renamed from: z */
    static final PorterDuff.Mode f8668z = PorterDuff.Mode.SRC_IN;

    /* renamed from: q */
    private h f8669q;

    /* renamed from: r */
    private PorterDuffColorFilter f8670r;

    /* renamed from: s */
    private ColorFilter f8671s;

    /* renamed from: t */
    private boolean f8672t;

    /* renamed from: u */
    private boolean f8673u;

    /* renamed from: v */
    private Drawable.ConstantState f8674v;

    /* renamed from: w */
    private final float[] f8675w;

    /* renamed from: x */
    private final Matrix f8676x;

    /* renamed from: y */
    private final Rect f8677y;

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$b */
    /* loaded from: classes2.dex */
    public static class b extends f {
        b() {
        }

        /* renamed from: f */
        private void m11082f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f8704b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f8703a = AbstractC1424h.m7243d(string2);
            }
            this.f8705c = AbstractC1404k.m7111g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2045i.f
        /* renamed from: c */
        public boolean mo11083c() {
            return true;
        }

        /* renamed from: e */
        public void m11084e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!AbstractC1404k.m7114j(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8639d);
            m11082f(m7115k, xmlPullParser);
            m7115k.recycle();
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$e */
    /* loaded from: classes2.dex */
    public static abstract class e {
        private e() {
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo11088a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo11089b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$f */
    /* loaded from: classes2.dex */
    public static abstract class f extends e {

        /* renamed from: a */
        protected AbstractC1424h.b[] f8703a;

        /* renamed from: b */
        String f8704b;

        /* renamed from: c */
        int f8705c;

        /* renamed from: d */
        int f8706d;

        public f() {
            super();
            this.f8703a = null;
            this.f8705c = 0;
        }

        /* renamed from: c */
        public boolean mo11083c() {
            return false;
        }

        /* renamed from: d */
        public void m11094d(Path path) {
            path.reset();
            AbstractC1424h.b[] bVarArr = this.f8703a;
            if (bVarArr != null) {
                AbstractC1424h.b.m7253e(bVarArr, path);
            }
        }

        public AbstractC1424h.b[] getPathData() {
            return this.f8703a;
        }

        public String getPathName() {
            return this.f8704b;
        }

        public void setPathData(AbstractC1424h.b[] bVarArr) {
            if (!AbstractC1424h.m7241b(this.f8703a, bVarArr)) {
                this.f8703a = AbstractC1424h.m7245f(bVarArr);
            } else {
                AbstractC1424h.m7249j(this.f8703a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f8703a = null;
            this.f8705c = 0;
            this.f8704b = fVar.f8704b;
            this.f8706d = fVar.f8706d;
            this.f8703a = AbstractC1424h.m7245f(fVar.f8703a);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$h */
    /* loaded from: classes2.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        int f8724a;

        /* renamed from: b */
        g f8725b;

        /* renamed from: c */
        ColorStateList f8726c;

        /* renamed from: d */
        PorterDuff.Mode f8727d;

        /* renamed from: e */
        boolean f8728e;

        /* renamed from: f */
        Bitmap f8729f;

        /* renamed from: g */
        ColorStateList f8730g;

        /* renamed from: h */
        PorterDuff.Mode f8731h;

        /* renamed from: i */
        int f8732i;

        /* renamed from: j */
        boolean f8733j;

        /* renamed from: k */
        boolean f8734k;

        /* renamed from: l */
        Paint f8735l;

        public h(h hVar) {
            this.f8726c = null;
            this.f8727d = C2045i.f8668z;
            if (hVar != null) {
                this.f8724a = hVar.f8724a;
                g gVar = new g(hVar.f8725b);
                this.f8725b = gVar;
                if (hVar.f8725b.f8712e != null) {
                    gVar.f8712e = new Paint(hVar.f8725b.f8712e);
                }
                if (hVar.f8725b.f8711d != null) {
                    this.f8725b.f8711d = new Paint(hVar.f8725b.f8711d);
                }
                this.f8726c = hVar.f8726c;
                this.f8727d = hVar.f8727d;
                this.f8728e = hVar.f8728e;
            }
        }

        /* renamed from: a */
        public boolean m11102a(int i11, int i12) {
            if (i11 == this.f8729f.getWidth() && i12 == this.f8729f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m11103b() {
            if (!this.f8734k && this.f8730g == this.f8726c && this.f8731h == this.f8727d && this.f8733j == this.f8728e && this.f8732i == this.f8725b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m11104c(int i11, int i12) {
            if (this.f8729f == null || !m11102a(i11, i12)) {
                this.f8729f = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                this.f8734k = true;
            }
        }

        /* renamed from: d */
        public void m11105d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f8729f, (Rect) null, rect, m11106e(colorFilter));
        }

        /* renamed from: e */
        public Paint m11106e(ColorFilter colorFilter) {
            if (!m11107f() && colorFilter == null) {
                return null;
            }
            if (this.f8735l == null) {
                Paint paint = new Paint();
                this.f8735l = paint;
                paint.setFilterBitmap(true);
            }
            this.f8735l.setAlpha(this.f8725b.getRootAlpha());
            this.f8735l.setColorFilter(colorFilter);
            return this.f8735l;
        }

        /* renamed from: f */
        public boolean m11107f() {
            if (this.f8725b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean m11108g() {
            return this.f8725b.m11100f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8724a;
        }

        /* renamed from: h */
        public boolean m11109h(int[] iArr) {
            boolean m11101g = this.f8725b.m11101g(iArr);
            this.f8734k |= m11101g;
            return m11101g;
        }

        /* renamed from: i */
        public void m11110i() {
            this.f8730g = this.f8726c;
            this.f8731h = this.f8727d;
            this.f8732i = this.f8725b.getRootAlpha();
            this.f8733j = this.f8728e;
            this.f8734k = false;
        }

        /* renamed from: j */
        public void m11111j(int i11, int i12) {
            this.f8729f.eraseColor(0);
            this.f8725b.m11099b(new Canvas(this.f8729f), i11, i12, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2045i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2045i(this);
        }

        public h() {
            this.f8726c = null;
            this.f8727d = C2045i.f8668z;
            this.f8725b = new g();
        }
    }

    C2045i() {
        this.f8673u = true;
        this.f8675w = new float[9];
        this.f8676x = new Matrix();
        this.f8677y = new Rect();
        this.f8669q = new h();
    }

    /* renamed from: b */
    static int m11072b(int i11, float f11) {
        return (i11 & 16777215) | (((int) (Color.alpha(i11) * f11)) << 24);
    }

    /* renamed from: c */
    public static C2045i m11073c(Resources resources, int i11, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C2045i c2045i = new C2045i();
            c2045i.f8667p = AbstractC1401h.m7082f(resources, i11, theme);
            c2045i.f8674v = new i(c2045i.f8667p.getConstantState());
            return c2045i;
        }
        try {
            XmlResourceParser xml = resources.getXml(i11);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m11074d(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static C2045i m11074d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2045i c2045i = new C2045i();
        c2045i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c2045i;
    }

    /* renamed from: f */
    private void m11075f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f8669q;
        g gVar = hVar.f8725b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f8715h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z11 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m11090g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f8691b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f8723p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f8724a = cVar.f8706d | hVar.f8724a;
                    z11 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m11084e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f8691b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f8723p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f8724a = bVar.f8706d | hVar.f8724a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m11093c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f8691b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f8723p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f8724a = dVar2.f8700k | hVar.f8724a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z11) {
        } else {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: g */
    private boolean m11076g() {
        if (isAutoMirrored() && AbstractC1414a.m7188f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static PorterDuff.Mode m11077h(int i11, PorterDuff.Mode mode) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 9) {
                    switch (i11) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: j */
    private void m11078j(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f8669q;
        g gVar = hVar.f8725b;
        hVar.f8727d = m11077h(AbstractC1404k.m7111g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m7107c = AbstractC1404k.m7107c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m7107c != null) {
            hVar.f8726c = m7107c;
        }
        hVar.f8728e = AbstractC1404k.m7105a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f8728e);
        gVar.f8718k = AbstractC1404k.m7110f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f8718k);
        float m7110f = AbstractC1404k.m7110f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f8719l);
        gVar.f8719l = m7110f;
        if (gVar.f8718k > 0.0f) {
            if (m7110f > 0.0f) {
                gVar.f8716i = typedArray.getDimension(3, gVar.f8716i);
                float dimension = typedArray.getDimension(2, gVar.f8717j);
                gVar.f8717j = dimension;
                if (gVar.f8716i > 0.0f) {
                    if (dimension > 0.0f) {
                        gVar.setAlpha(AbstractC1404k.m7110f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            gVar.f8721n = string;
                            gVar.f8723p.put(string, gVar);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7184b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f8677y);
        if (this.f8677y.width() > 0 && this.f8677y.height() > 0) {
            ColorFilter colorFilter = this.f8671s;
            if (colorFilter == null) {
                colorFilter = this.f8670r;
            }
            canvas.getMatrix(this.f8676x);
            this.f8676x.getValues(this.f8675w);
            float abs = Math.abs(this.f8675w[0]);
            float abs2 = Math.abs(this.f8675w[4]);
            float abs3 = Math.abs(this.f8675w[1]);
            float abs4 = Math.abs(this.f8675w[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, (int) (this.f8677y.width() * abs));
            int min2 = Math.min(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, (int) (this.f8677y.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f8677y;
                canvas.translate(rect.left, rect.top);
                if (m11076g()) {
                    canvas.translate(this.f8677y.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f8677y.offsetTo(0, 0);
                this.f8669q.m11104c(min, min2);
                if (!this.f8673u) {
                    this.f8669q.m11111j(min, min2);
                } else if (!this.f8669q.m11103b()) {
                    this.f8669q.m11111j(min, min2);
                    this.f8669q.m11110i();
                }
                this.f8669q.m11105d(canvas, colorFilter, this.f8677y);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: e */
    public Object m11079e(String str) {
        return this.f8669q.f8725b.f8723p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7186d(drawable);
        }
        return this.f8669q.f8725b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f8669q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7187e(drawable);
        }
        return this.f8671s;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f8667p != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f8667p.getConstantState());
        }
        this.f8669q.f8724a = getChangingConfigurations();
        return this.f8669q;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f8669q.f8725b.f8717j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f8669q.f8725b.f8716i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: i */
    public void m11080i(boolean z11) {
        this.f8673u = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return AbstractC1414a.m7190h(drawable);
        }
        return this.f8669q.f8728e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((hVar = this.f8669q) == null || (!hVar.m11108g() && ((colorStateList = this.f8669q.f8726c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* renamed from: k */
    PorterDuffColorFilter m11081k(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f8672t && super.mutate() == this) {
            this.f8669q = new h(this.f8669q);
            this.f8672t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z11;
        PorterDuff.Mode mode;
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f8669q;
        ColorStateList colorStateList = hVar.f8726c;
        if (colorStateList != null && (mode = hVar.f8727d) != null) {
            this.f8670r = m11081k(this.f8670r, colorStateList, mode);
            invalidateSelf();
            z11 = true;
        } else {
            z11 = false;
        }
        if (hVar.m11108g() && hVar.m11109h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j11);
        } else {
            super.scheduleSelf(runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f8669q.f8725b.getRootAlpha() != i11) {
            this.f8669q.f8725b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7192j(drawable, z11);
        } else {
            this.f8669q.f8728e = z11;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i11) {
        super.setChangingConfigurations(i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i11, PorterDuff.Mode mode) {
        super.setColorFilter(i11, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z11) {
        super.setFilterBitmap(z11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f11, float f12) {
        super.setHotspot(f11, f12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i11, int i12, int i13, int i14) {
        super.setHotspotBounds(i11, i12, i13, i14);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC2044h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7196n(drawable, i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7197o(drawable, colorStateList);
            return;
        }
        h hVar = this.f8669q;
        if (hVar.f8726c != colorStateList) {
            hVar.f8726c = colorStateList;
            this.f8670r = m11081k(this.f8670r, colorStateList, hVar.f8727d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7198p(drawable, mode);
            return;
        }
        h hVar = this.f8669q;
        if (hVar.f8727d != mode) {
            hVar.f8727d = mode;
            this.f8670r = m11081k(this.f8670r, hVar.f8726c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i */
    /* loaded from: classes2.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f8736a;

        public i(Drawable.ConstantState constantState) {
            this.f8736a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f8736a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f8736a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2045i c2045i = new C2045i();
            c2045i.f8667p = (VectorDrawable) this.f8736a.newDrawable();
            return c2045i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C2045i c2045i = new C2045i();
            c2045i.f8667p = (VectorDrawable) this.f8736a.newDrawable(resources);
            return c2045i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2045i c2045i = new C2045i();
            c2045i.f8667p = (VectorDrawable) this.f8736a.newDrawable(resources, theme);
            return c2045i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8671s = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$c */
    /* loaded from: classes2.dex */
    public static class c extends f {

        /* renamed from: e */
        private int[] f8678e;

        /* renamed from: f */
        C1397d f8679f;

        /* renamed from: g */
        float f8680g;

        /* renamed from: h */
        C1397d f8681h;

        /* renamed from: i */
        float f8682i;

        /* renamed from: j */
        float f8683j;

        /* renamed from: k */
        float f8684k;

        /* renamed from: l */
        float f8685l;

        /* renamed from: m */
        float f8686m;

        /* renamed from: n */
        Paint.Cap f8687n;

        /* renamed from: o */
        Paint.Join f8688o;

        /* renamed from: p */
        float f8689p;

        c() {
            this.f8680g = 0.0f;
            this.f8682i = 1.0f;
            this.f8683j = 1.0f;
            this.f8684k = 0.0f;
            this.f8685l = 1.0f;
            this.f8686m = 0.0f;
            this.f8687n = Paint.Cap.BUTT;
            this.f8688o = Paint.Join.MITER;
            this.f8689p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m11085e(int i11, Paint.Cap cap) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m11086f(int i11, Paint.Join join) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m11087h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f8678e = null;
            if (!AbstractC1404k.m7114j(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f8704b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f8703a = AbstractC1424h.m7243d(string2);
            }
            this.f8681h = AbstractC1404k.m7109e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f8683j = AbstractC1404k.m7110f(typedArray, xmlPullParser, "fillAlpha", 12, this.f8683j);
            this.f8687n = m11085e(AbstractC1404k.m7111g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f8687n);
            this.f8688o = m11086f(AbstractC1404k.m7111g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f8688o);
            this.f8689p = AbstractC1404k.m7110f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f8689p);
            this.f8679f = AbstractC1404k.m7109e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f8682i = AbstractC1404k.m7110f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f8682i);
            this.f8680g = AbstractC1404k.m7110f(typedArray, xmlPullParser, "strokeWidth", 4, this.f8680g);
            this.f8685l = AbstractC1404k.m7110f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f8685l);
            this.f8686m = AbstractC1404k.m7110f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f8686m);
            this.f8684k = AbstractC1404k.m7110f(typedArray, xmlPullParser, "trimPathStart", 5, this.f8684k);
            this.f8705c = AbstractC1404k.m7111g(typedArray, xmlPullParser, "fillType", 13, this.f8705c);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2045i.e
        /* renamed from: a */
        public boolean mo11088a() {
            if (!this.f8681h.m7046i() && !this.f8679f.m7046i()) {
                return false;
            }
            return true;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2045i.e
        /* renamed from: b */
        public boolean mo11089b(int[] iArr) {
            return this.f8679f.m7047j(iArr) | this.f8681h.m7047j(iArr);
        }

        /* renamed from: g */
        public void m11090g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8638c);
            m11087h(m7115k, xmlPullParser, theme);
            m7115k.recycle();
        }

        float getFillAlpha() {
            return this.f8683j;
        }

        int getFillColor() {
            return this.f8681h.m7043e();
        }

        float getStrokeAlpha() {
            return this.f8682i;
        }

        int getStrokeColor() {
            return this.f8679f.m7043e();
        }

        float getStrokeWidth() {
            return this.f8680g;
        }

        float getTrimPathEnd() {
            return this.f8685l;
        }

        float getTrimPathOffset() {
            return this.f8686m;
        }

        float getTrimPathStart() {
            return this.f8684k;
        }

        void setFillAlpha(float f11) {
            this.f8683j = f11;
        }

        void setFillColor(int i11) {
            this.f8681h.m7048k(i11);
        }

        void setStrokeAlpha(float f11) {
            this.f8682i = f11;
        }

        void setStrokeColor(int i11) {
            this.f8679f.m7048k(i11);
        }

        void setStrokeWidth(float f11) {
            this.f8680g = f11;
        }

        void setTrimPathEnd(float f11) {
            this.f8685l = f11;
        }

        void setTrimPathOffset(float f11) {
            this.f8686m = f11;
        }

        void setTrimPathStart(float f11) {
            this.f8684k = f11;
        }

        c(c cVar) {
            super(cVar);
            this.f8680g = 0.0f;
            this.f8682i = 1.0f;
            this.f8683j = 1.0f;
            this.f8684k = 0.0f;
            this.f8685l = 1.0f;
            this.f8686m = 0.0f;
            this.f8687n = Paint.Cap.BUTT;
            this.f8688o = Paint.Join.MITER;
            this.f8689p = 4.0f;
            this.f8678e = cVar.f8678e;
            this.f8679f = cVar.f8679f;
            this.f8680g = cVar.f8680g;
            this.f8682i = cVar.f8682i;
            this.f8681h = cVar.f8681h;
            this.f8705c = cVar.f8705c;
            this.f8683j = cVar.f8683j;
            this.f8684k = cVar.f8684k;
            this.f8685l = cVar.f8685l;
            this.f8686m = cVar.f8686m;
            this.f8687n = cVar.f8687n;
            this.f8688o = cVar.f8688o;
            this.f8689p = cVar.f8689p;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f8667p;
        if (drawable != null) {
            AbstractC1414a.m7189g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f8669q;
        hVar.f8725b = new g();
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8636a);
        m11078j(m7115k, xmlPullParser, theme);
        m7115k.recycle();
        hVar.f8724a = getChangingConfigurations();
        hVar.f8734k = true;
        m11075f(resources, xmlPullParser, attributeSet, theme);
        this.f8670r = m11081k(this.f8670r, hVar.f8726c, hVar.f8727d);
    }

    C2045i(h hVar) {
        this.f8673u = true;
        this.f8675w = new float[9];
        this.f8676x = new Matrix();
        this.f8677y = new Rect();
        this.f8669q = hVar;
        this.f8670r = m11081k(this.f8670r, hVar.f8726c, hVar.f8727d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$g */
    /* loaded from: classes2.dex */
    public static class g {

        /* renamed from: q */
        private static final Matrix f8707q = new Matrix();

        /* renamed from: a */
        private final Path f8708a;

        /* renamed from: b */
        private final Path f8709b;

        /* renamed from: c */
        private final Matrix f8710c;

        /* renamed from: d */
        Paint f8711d;

        /* renamed from: e */
        Paint f8712e;

        /* renamed from: f */
        private PathMeasure f8713f;

        /* renamed from: g */
        private int f8714g;

        /* renamed from: h */
        final d f8715h;

        /* renamed from: i */
        float f8716i;

        /* renamed from: j */
        float f8717j;

        /* renamed from: k */
        float f8718k;

        /* renamed from: l */
        float f8719l;

        /* renamed from: m */
        int f8720m;

        /* renamed from: n */
        String f8721n;

        /* renamed from: o */
        Boolean f8722o;

        /* renamed from: p */
        final C30239a f8723p;

        public g() {
            this.f8710c = new Matrix();
            this.f8716i = 0.0f;
            this.f8717j = 0.0f;
            this.f8718k = 0.0f;
            this.f8719l = 0.0f;
            this.f8720m = 255;
            this.f8721n = null;
            this.f8722o = null;
            this.f8723p = new C30239a();
            this.f8715h = new d();
            this.f8708a = new Path();
            this.f8709b = new Path();
        }

        /* renamed from: a */
        private static float m11095a(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        /* renamed from: c */
        private void m11096c(d dVar, Matrix matrix, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            dVar.f8690a.set(matrix);
            dVar.f8690a.preConcat(dVar.f8699j);
            canvas.save();
            for (int i13 = 0; i13 < dVar.f8691b.size(); i13++) {
                e eVar = (e) dVar.f8691b.get(i13);
                if (eVar instanceof d) {
                    m11096c((d) eVar, dVar.f8690a, canvas, i11, i12, colorFilter);
                } else if (eVar instanceof f) {
                    m11097d(dVar, (f) eVar, canvas, i11, i12, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m11097d(d dVar, f fVar, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f11 = i11 / this.f8718k;
            float f12 = i12 / this.f8719l;
            float min = Math.min(f11, f12);
            Matrix matrix = dVar.f8690a;
            this.f8710c.set(matrix);
            this.f8710c.postScale(f11, f12);
            float m11098e = m11098e(matrix);
            if (m11098e == 0.0f) {
                return;
            }
            fVar.m11094d(this.f8708a);
            Path path = this.f8708a;
            this.f8709b.reset();
            if (fVar.mo11083c()) {
                Path path2 = this.f8709b;
                if (fVar.f8705c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f8709b.addPath(path, this.f8710c);
                canvas.clipPath(this.f8709b);
                return;
            }
            c cVar = (c) fVar;
            float f13 = cVar.f8684k;
            if (f13 != 0.0f || cVar.f8685l != 1.0f) {
                float f14 = cVar.f8686m;
                float f15 = (f13 + f14) % 1.0f;
                float f16 = (cVar.f8685l + f14) % 1.0f;
                if (this.f8713f == null) {
                    this.f8713f = new PathMeasure();
                }
                this.f8713f.setPath(this.f8708a, false);
                float length = this.f8713f.getLength();
                float f17 = f15 * length;
                float f18 = f16 * length;
                path.reset();
                if (f17 > f18) {
                    this.f8713f.getSegment(f17, length, path, true);
                    this.f8713f.getSegment(0.0f, f18, path, true);
                } else {
                    this.f8713f.getSegment(f17, f18, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f8709b.addPath(path, this.f8710c);
            if (cVar.f8681h.m7049l()) {
                C1397d c1397d = cVar.f8681h;
                if (this.f8712e == null) {
                    Paint paint = new Paint(1);
                    this.f8712e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f8712e;
                if (c1397d.m7045h()) {
                    Shader m7044f = c1397d.m7044f();
                    m7044f.setLocalMatrix(this.f8710c);
                    paint2.setShader(m7044f);
                    paint2.setAlpha(Math.round(cVar.f8683j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C2045i.m11072b(c1397d.m7043e(), cVar.f8683j));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f8709b;
                if (cVar.f8705c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f8709b, paint2);
            }
            if (cVar.f8679f.m7049l()) {
                C1397d c1397d2 = cVar.f8679f;
                if (this.f8711d == null) {
                    Paint paint3 = new Paint(1);
                    this.f8711d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f8711d;
                Paint.Join join = cVar.f8688o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f8687n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f8689p);
                if (c1397d2.m7045h()) {
                    Shader m7044f2 = c1397d2.m7044f();
                    m7044f2.setLocalMatrix(this.f8710c);
                    paint4.setShader(m7044f2);
                    paint4.setAlpha(Math.round(cVar.f8682i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C2045i.m11072b(c1397d2.m7043e(), cVar.f8682i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f8680g * min * m11098e);
                canvas.drawPath(this.f8709b, paint4);
            }
        }

        /* renamed from: e */
        private float m11098e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m11095a = m11095a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(m11095a) / max;
        }

        /* renamed from: b */
        public void m11099b(Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            m11096c(this.f8715h, f8707q, canvas, i11, i12, colorFilter);
        }

        /* renamed from: f */
        public boolean m11100f() {
            if (this.f8722o == null) {
                this.f8722o = Boolean.valueOf(this.f8715h.mo11088a());
            }
            return this.f8722o.booleanValue();
        }

        /* renamed from: g */
        public boolean m11101g(int[] iArr) {
            return this.f8715h.mo11089b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f8720m;
        }

        public void setAlpha(float f11) {
            setRootAlpha((int) (f11 * 255.0f));
        }

        public void setRootAlpha(int i11) {
            this.f8720m = i11;
        }

        public g(g gVar) {
            this.f8710c = new Matrix();
            this.f8716i = 0.0f;
            this.f8717j = 0.0f;
            this.f8718k = 0.0f;
            this.f8719l = 0.0f;
            this.f8720m = 255;
            this.f8721n = null;
            this.f8722o = null;
            C30239a c30239a = new C30239a();
            this.f8723p = c30239a;
            this.f8715h = new d(gVar.f8715h, c30239a);
            this.f8708a = new Path(gVar.f8708a);
            this.f8709b = new Path(gVar.f8709b);
            this.f8716i = gVar.f8716i;
            this.f8717j = gVar.f8717j;
            this.f8718k = gVar.f8718k;
            this.f8719l = gVar.f8719l;
            this.f8714g = gVar.f8714g;
            this.f8720m = gVar.f8720m;
            this.f8721n = gVar.f8721n;
            String str = gVar.f8721n;
            if (str != null) {
                c30239a.put(str, this);
            }
            this.f8722o = gVar.f8722o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$d */
    /* loaded from: classes2.dex */
    public static class d extends e {

        /* renamed from: a */
        final Matrix f8690a;

        /* renamed from: b */
        final ArrayList f8691b;

        /* renamed from: c */
        float f8692c;

        /* renamed from: d */
        private float f8693d;

        /* renamed from: e */
        private float f8694e;

        /* renamed from: f */
        private float f8695f;

        /* renamed from: g */
        private float f8696g;

        /* renamed from: h */
        private float f8697h;

        /* renamed from: i */
        private float f8698i;

        /* renamed from: j */
        final Matrix f8699j;

        /* renamed from: k */
        int f8700k;

        /* renamed from: l */
        private int[] f8701l;

        /* renamed from: m */
        private String f8702m;

        public d(d dVar, C30239a c30239a) {
            super();
            f bVar;
            this.f8690a = new Matrix();
            this.f8691b = new ArrayList();
            this.f8692c = 0.0f;
            this.f8693d = 0.0f;
            this.f8694e = 0.0f;
            this.f8695f = 1.0f;
            this.f8696g = 1.0f;
            this.f8697h = 0.0f;
            this.f8698i = 0.0f;
            Matrix matrix = new Matrix();
            this.f8699j = matrix;
            this.f8702m = null;
            this.f8692c = dVar.f8692c;
            this.f8693d = dVar.f8693d;
            this.f8694e = dVar.f8694e;
            this.f8695f = dVar.f8695f;
            this.f8696g = dVar.f8696g;
            this.f8697h = dVar.f8697h;
            this.f8698i = dVar.f8698i;
            this.f8701l = dVar.f8701l;
            String str = dVar.f8702m;
            this.f8702m = str;
            this.f8700k = dVar.f8700k;
            if (str != null) {
                c30239a.put(str, this);
            }
            matrix.set(dVar.f8699j);
            ArrayList arrayList = dVar.f8691b;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = arrayList.get(i11);
                if (obj instanceof d) {
                    this.f8691b.add(new d((d) obj, c30239a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else if (obj instanceof b) {
                        bVar = new b((b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f8691b.add(bVar);
                    Object obj2 = bVar.f8704b;
                    if (obj2 != null) {
                        c30239a.put(obj2, bVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m11091d() {
            this.f8699j.reset();
            this.f8699j.postTranslate(-this.f8693d, -this.f8694e);
            this.f8699j.postScale(this.f8695f, this.f8696g);
            this.f8699j.postRotate(this.f8692c, 0.0f, 0.0f);
            this.f8699j.postTranslate(this.f8697h + this.f8693d, this.f8698i + this.f8694e);
        }

        /* renamed from: e */
        private void m11092e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f8701l = null;
            this.f8692c = AbstractC1404k.m7110f(typedArray, xmlPullParser, "rotation", 5, this.f8692c);
            this.f8693d = typedArray.getFloat(1, this.f8693d);
            this.f8694e = typedArray.getFloat(2, this.f8694e);
            this.f8695f = AbstractC1404k.m7110f(typedArray, xmlPullParser, "scaleX", 3, this.f8695f);
            this.f8696g = AbstractC1404k.m7110f(typedArray, xmlPullParser, "scaleY", 4, this.f8696g);
            this.f8697h = AbstractC1404k.m7110f(typedArray, xmlPullParser, "translateX", 6, this.f8697h);
            this.f8698i = AbstractC1404k.m7110f(typedArray, xmlPullParser, "translateY", 7, this.f8698i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f8702m = string;
            }
            m11091d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2045i.e
        /* renamed from: a */
        public boolean mo11088a() {
            for (int i11 = 0; i11 < this.f8691b.size(); i11++) {
                if (((e) this.f8691b.get(i11)).mo11088a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C2045i.e
        /* renamed from: b */
        public boolean mo11089b(int[] iArr) {
            boolean z11 = false;
            for (int i11 = 0; i11 < this.f8691b.size(); i11++) {
                z11 |= ((e) this.f8691b.get(i11)).mo11089b(iArr);
            }
            return z11;
        }

        /* renamed from: c */
        public void m11093c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8637b);
            m11092e(m7115k, xmlPullParser);
            m7115k.recycle();
        }

        public String getGroupName() {
            return this.f8702m;
        }

        public Matrix getLocalMatrix() {
            return this.f8699j;
        }

        public float getPivotX() {
            return this.f8693d;
        }

        public float getPivotY() {
            return this.f8694e;
        }

        public float getRotation() {
            return this.f8692c;
        }

        public float getScaleX() {
            return this.f8695f;
        }

        public float getScaleY() {
            return this.f8696g;
        }

        public float getTranslateX() {
            return this.f8697h;
        }

        public float getTranslateY() {
            return this.f8698i;
        }

        public void setPivotX(float f11) {
            if (f11 != this.f8693d) {
                this.f8693d = f11;
                m11091d();
            }
        }

        public void setPivotY(float f11) {
            if (f11 != this.f8694e) {
                this.f8694e = f11;
                m11091d();
            }
        }

        public void setRotation(float f11) {
            if (f11 != this.f8692c) {
                this.f8692c = f11;
                m11091d();
            }
        }

        public void setScaleX(float f11) {
            if (f11 != this.f8695f) {
                this.f8695f = f11;
                m11091d();
            }
        }

        public void setScaleY(float f11) {
            if (f11 != this.f8696g) {
                this.f8696g = f11;
                m11091d();
            }
        }

        public void setTranslateX(float f11) {
            if (f11 != this.f8697h) {
                this.f8697h = f11;
                m11091d();
            }
        }

        public void setTranslateY(float f11) {
            if (f11 != this.f8698i) {
                this.f8698i = f11;
                m11091d();
            }
        }

        public d() {
            super();
            this.f8690a = new Matrix();
            this.f8691b = new ArrayList();
            this.f8692c = 0.0f;
            this.f8693d = 0.0f;
            this.f8694e = 0.0f;
            this.f8695f = 1.0f;
            this.f8696g = 1.0f;
            this.f8697h = 0.0f;
            this.f8698i = 0.0f;
            this.f8699j = new Matrix();
            this.f8702m = null;
        }
    }
}
