package p706z6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.InterfaceC1416c;
import androidx.core.util.AbstractC1482d;
import java.util.BitSet;
import p357n6.AbstractC23577b;
import p439q6.AbstractC25136a;
import p505s6.C26159a;
import p671y6.C30797a;
import p706z6.C31694m;
import p706z6.C31695n;
import p706z6.C31696o;

/* renamed from: z6.h */
/* loaded from: classes3.dex */
public class C31689h extends Drawable implements InterfaceC1416c, InterfaceC31697p {

    /* renamed from: L */
    private static final Paint f145534L = new Paint(1);

    /* renamed from: A */
    private final Region f145535A;

    /* renamed from: B */
    private C31694m f145536B;

    /* renamed from: C */
    private final Paint f145537C;

    /* renamed from: D */
    private final Paint f145538D;

    /* renamed from: E */
    private final C30797a f145539E;

    /* renamed from: F */
    private final C31695n.b f145540F;

    /* renamed from: G */
    private final C31695n f145541G;

    /* renamed from: H */
    private PorterDuffColorFilter f145542H;

    /* renamed from: I */
    private PorterDuffColorFilter f145543I;

    /* renamed from: J */
    private final RectF f145544J;

    /* renamed from: K */
    private boolean f145545K;

    /* renamed from: p */
    private c f145546p;

    /* renamed from: q */
    private final C31696o.g[] f145547q;

    /* renamed from: r */
    private final C31696o.g[] f145548r;

    /* renamed from: s */
    private final BitSet f145549s;

    /* renamed from: t */
    private boolean f145550t;

    /* renamed from: u */
    private final Matrix f145551u;

    /* renamed from: v */
    private final Path f145552v;

    /* renamed from: w */
    private final Path f145553w;

    /* renamed from: x */
    private final RectF f145554x;

    /* renamed from: y */
    private final RectF f145555y;

    /* renamed from: z */
    private final Region f145556z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.h$a */
    /* loaded from: classes3.dex */
    public class a implements C31695n.b {
        a() {
        }

        @Override // p706z6.C31695n.b
        /* renamed from: a */
        public void mo152462a(C31696o c31696o, Matrix matrix, int i11) {
            C31689h.this.f145549s.set(i11, c31696o.m152558e());
            C31689h.this.f145547q[i11] = c31696o.m152559f(matrix);
        }

        @Override // p706z6.C31695n.b
        /* renamed from: b */
        public void mo152463b(C31696o c31696o, Matrix matrix, int i11) {
            C31689h.this.f145549s.set(i11 + 4, c31696o.m152558e());
            C31689h.this.f145548r[i11] = c31696o.m152559f(matrix);
        }
    }

    /* renamed from: z6.h$b */
    /* loaded from: classes3.dex */
    public class b implements C31694m.c {

        /* renamed from: a */
        final /* synthetic */ float f145558a;

        b(float f11) {
            this.f145558a = f11;
        }

        @Override // p706z6.C31694m.c
        /* renamed from: a */
        public InterfaceC31684c mo152464a(InterfaceC31684c interfaceC31684c) {
            if (!(interfaceC31684c instanceof C31692k)) {
                return new C31683b(this.f145558a, interfaceC31684c);
            }
            return interfaceC31684c;
        }
    }

    /* synthetic */ C31689h(c cVar, a aVar) {
        this(cVar);
    }

    /* renamed from: H */
    private float m152396H() {
        if (m152399Q()) {
            return this.f145538D.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: O */
    private boolean m152397O() {
        c cVar = this.f145546p;
        int i11 = cVar.f145576q;
        if (i11 != 1 && cVar.f145577r > 0 && (i11 == 2 || m152438Y())) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private boolean m152398P() {
        Paint.Style style = this.f145546p.f145581v;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private boolean m152399Q() {
        Paint.Style style = this.f145546p.f145581v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f145538D.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private void m152400S() {
        super.invalidateSelf();
    }

    /* renamed from: V */
    private void m152401V(Canvas canvas) {
        if (!m152397O()) {
            return;
        }
        canvas.save();
        m152403X(canvas);
        if (!this.f145545K) {
            m152414n(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.f145544J.width() - getBounds().width());
        int height = (int) (this.f145544J.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f145544J.width()) + (this.f145546p.f145577r * 2) + width, ((int) this.f145544J.height()) + (this.f145546p.f145577r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f11 = (getBounds().left - this.f145546p.f145577r) - width;
            float f12 = (getBounds().top - this.f145546p.f145577r) - height;
            canvas2.translate(-f11, -f12);
            m152414n(canvas2);
            canvas.drawBitmap(createBitmap, f11, f12, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    /* renamed from: W */
    private static int m152402W(int i11, int i12) {
        return (i11 * (i12 + (i12 >>> 7))) >>> 8;
    }

    /* renamed from: X */
    private void m152403X(Canvas canvas) {
        canvas.translate(m152424C(), m152425D());
    }

    /* renamed from: f */
    private PorterDuffColorFilter m152408f(Paint paint, boolean z11) {
        int color;
        int m152452l;
        if (z11 && (m152452l = m152452l((color = paint.getColor()))) != color) {
            return new PorterDuffColorFilter(m152452l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* renamed from: g */
    private void m152409g(RectF rectF, Path path) {
        m152447h(rectF, path);
        if (this.f145546p.f145569j != 1.0f) {
            this.f145551u.reset();
            Matrix matrix = this.f145551u;
            float f11 = this.f145546p.f145569j;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f145551u);
        }
        path.computeBounds(this.f145544J, true);
    }

    /* renamed from: i */
    private void m152410i() {
        C31694m m152495y = m152427F().m152495y(new b(-m152396H()));
        this.f145536B = m152495y;
        this.f145541G.m152544d(m152495y, this.f145546p.f145570k, m152421x(), this.f145553w);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m152411j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z11) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z11) {
            colorForState = m152452l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m152412k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z11) {
        if (colorStateList != null && mode != null) {
            return m152411j(colorStateList, mode, z11);
        }
        return m152408f(paint, z11);
    }

    /* renamed from: m */
    public static C31689h m152413m(Context context, float f11) {
        int m130293c = AbstractC25136a.m130293c(context, AbstractC23577b.colorSurface, C31689h.class.getSimpleName());
        C31689h c31689h = new C31689h();
        c31689h.m152435R(context);
        c31689h.m152442c0(ColorStateList.valueOf(m130293c));
        c31689h.m152441b0(f11);
        return c31689h;
    }

    /* renamed from: n */
    private void m152414n(Canvas canvas) {
        this.f145549s.cardinality();
        if (this.f145546p.f145578s != 0) {
            canvas.drawPath(this.f145552v, this.f145539E.m149842c());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.f145547q[i11].m152594b(this.f145539E, this.f145546p.f145577r, canvas);
            this.f145548r[i11].m152594b(this.f145539E, this.f145546p.f145577r, canvas);
        }
        if (this.f145545K) {
            int m152424C = m152424C();
            int m152425D = m152425D();
            canvas.translate(-m152424C, -m152425D);
            canvas.drawPath(this.f145552v, f145534L);
            canvas.translate(m152424C, m152425D);
        }
    }

    /* renamed from: o0 */
    private boolean m152415o0(int[] iArr) {
        boolean z11;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f145546p.f145563d != null && color2 != (colorForState2 = this.f145546p.f145563d.getColorForState(iArr, (color2 = this.f145537C.getColor())))) {
            this.f145537C.setColor(colorForState2);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f145546p.f145564e != null && color != (colorForState = this.f145546p.f145564e.getColorForState(iArr, (color = this.f145538D.getColor())))) {
            this.f145538D.setColor(colorForState);
            return true;
        }
        return z11;
    }

    /* renamed from: p */
    private void m152416p(Canvas canvas) {
        m152419r(canvas, this.f145537C, this.f145552v, this.f145546p.f145560a, m152459w());
    }

    /* renamed from: p0 */
    private boolean m152417p0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f145542H;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f145543I;
        c cVar = this.f145546p;
        this.f145542H = m152412k(cVar.f145566g, cVar.f145567h, this.f145537C, true);
        c cVar2 = this.f145546p;
        this.f145543I = m152412k(cVar2.f145565f, cVar2.f145567h, this.f145538D, false);
        c cVar3 = this.f145546p;
        if (cVar3.f145580u) {
            this.f145539E.m149843d(cVar3.f145566g.getColorForState(getState(), 0));
        }
        if (!AbstractC1482d.m7475a(porterDuffColorFilter, this.f145542H) || !AbstractC1482d.m7475a(porterDuffColorFilter2, this.f145543I)) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    private void m152418q0() {
        float m152434N = m152434N();
        this.f145546p.f145577r = (int) Math.ceil(0.75f * m152434N);
        this.f145546p.f145578s = (int) Math.ceil(m152434N * 0.25f);
        m152417p0();
        m152400S();
    }

    /* renamed from: r */
    private void m152419r(Canvas canvas, Paint paint, Path path, C31694m c31694m, RectF rectF) {
        if (c31694m.m152491u(rectF)) {
            float mo152392a = c31694m.m152490t().mo152392a(rectF) * this.f145546p.f145570k;
            canvas.drawRoundRect(rectF, mo152392a, mo152392a, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: s */
    private void m152420s(Canvas canvas) {
        m152419r(canvas, this.f145538D, this.f145553w, this.f145536B, m152421x());
    }

    /* renamed from: x */
    private RectF m152421x() {
        this.f145555y.set(m152459w());
        float m152396H = m152396H();
        this.f145555y.inset(m152396H, m152396H);
        return this.f145555y;
    }

    /* renamed from: A */
    public float m152422A() {
        return this.f145546p.f145570k;
    }

    /* renamed from: B */
    public float m152423B() {
        return this.f145546p.f145573n;
    }

    /* renamed from: C */
    public int m152424C() {
        c cVar = this.f145546p;
        return (int) (cVar.f145578s * Math.sin(Math.toRadians(cVar.f145579t)));
    }

    /* renamed from: D */
    public int m152425D() {
        c cVar = this.f145546p;
        return (int) (cVar.f145578s * Math.cos(Math.toRadians(cVar.f145579t)));
    }

    /* renamed from: E */
    public int m152426E() {
        return this.f145546p.f145577r;
    }

    /* renamed from: F */
    public C31694m m152427F() {
        return this.f145546p.f145560a;
    }

    /* renamed from: G */
    public ColorStateList m152428G() {
        return this.f145546p.f145564e;
    }

    /* renamed from: I */
    public float m152429I() {
        return this.f145546p.f145571l;
    }

    /* renamed from: J */
    public ColorStateList m152430J() {
        return this.f145546p.f145566g;
    }

    /* renamed from: K */
    public float m152431K() {
        return this.f145546p.f145560a.m152488r().mo152392a(m152459w());
    }

    /* renamed from: L */
    public float m152432L() {
        return this.f145546p.f145560a.m152490t().mo152392a(m152459w());
    }

    /* renamed from: M */
    public float m152433M() {
        return this.f145546p.f145575p;
    }

    /* renamed from: N */
    public float m152434N() {
        return m152460y() + m152433M();
    }

    /* renamed from: R */
    public void m152435R(Context context) {
        this.f145546p.f145561b = new C26159a(context);
        m152418q0();
    }

    /* renamed from: T */
    public boolean m152436T() {
        C26159a c26159a = this.f145546p.f145561b;
        if (c26159a != null && c26159a.m134515e()) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public boolean m152437U() {
        return this.f145546p.f145560a.m152491u(m152459w());
    }

    /* renamed from: Y */
    public boolean m152438Y() {
        int i11 = Build.VERSION.SDK_INT;
        if (!m152437U() && !this.f145552v.isConvex() && i11 < 29) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public void m152439Z(float f11) {
        setShapeAppearanceModel(this.f145546p.f145560a.m152493w(f11));
    }

    /* renamed from: a0 */
    public void m152440a0(InterfaceC31684c interfaceC31684c) {
        setShapeAppearanceModel(this.f145546p.f145560a.m152494x(interfaceC31684c));
    }

    /* renamed from: b0 */
    public void m152441b0(float f11) {
        c cVar = this.f145546p;
        if (cVar.f145574o != f11) {
            cVar.f145574o = f11;
            m152418q0();
        }
    }

    /* renamed from: c0 */
    public void m152442c0(ColorStateList colorStateList) {
        c cVar = this.f145546p;
        if (cVar.f145563d != colorStateList) {
            cVar.f145563d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d0 */
    public void m152443d0(float f11) {
        c cVar = this.f145546p;
        if (cVar.f145570k != f11) {
            cVar.f145570k = f11;
            this.f145550t = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f145537C.setColorFilter(this.f145542H);
        int alpha = this.f145537C.getAlpha();
        this.f145537C.setAlpha(m152402W(alpha, this.f145546p.f145572m));
        this.f145538D.setColorFilter(this.f145543I);
        this.f145538D.setStrokeWidth(this.f145546p.f145571l);
        int alpha2 = this.f145538D.getAlpha();
        this.f145538D.setAlpha(m152402W(alpha2, this.f145546p.f145572m));
        if (this.f145550t) {
            m152410i();
            m152409g(m152459w(), this.f145552v);
            this.f145550t = false;
        }
        m152401V(canvas);
        if (m152398P()) {
            m152416p(canvas);
        }
        if (m152399Q()) {
            m152420s(canvas);
        }
        this.f145537C.setAlpha(alpha);
        this.f145538D.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m152444e0(int i11, int i12, int i13, int i14) {
        c cVar = this.f145546p;
        if (cVar.f145568i == null) {
            cVar.f145568i = new Rect();
        }
        this.f145546p.f145568i.set(i11, i12, i13, i14);
        invalidateSelf();
    }

    /* renamed from: f0 */
    public void m152445f0(Paint.Style style) {
        this.f145546p.f145581v = style;
        m152400S();
    }

    /* renamed from: g0 */
    public void m152446g0(float f11) {
        c cVar = this.f145546p;
        if (cVar.f145573n != f11) {
            cVar.f145573n = f11;
            m152418q0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f145546p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f145546p.f145576q == 2) {
            return;
        }
        if (m152437U()) {
            outline.setRoundRect(getBounds(), m152431K() * this.f145546p.f145570k);
            return;
        }
        m152409g(m152459w(), this.f145552v);
        if (this.f145552v.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f145552v);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f145546p.f145568i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f145556z.set(getBounds());
        m152409g(m152459w(), this.f145552v);
        this.f145535A.setPath(this.f145552v, this.f145556z);
        this.f145556z.op(this.f145535A, Region.Op.DIFFERENCE);
        return this.f145556z;
    }

    /* renamed from: h */
    public final void m152447h(RectF rectF, Path path) {
        C31695n c31695n = this.f145541G;
        c cVar = this.f145546p;
        c31695n.m152545e(cVar.f145560a, cVar.f145570k, rectF, this.f145540F, path);
    }

    /* renamed from: h0 */
    public void m152448h0(boolean z11) {
        this.f145545K = z11;
    }

    /* renamed from: i0 */
    public void m152449i0(int i11) {
        this.f145539E.m149843d(i11);
        this.f145546p.f145580u = false;
        m152400S();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f145550t = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f145546p.f145566g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f145546p.f145565f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f145546p.f145564e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f145546p.f145563d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    /* renamed from: j0 */
    public void m152450j0(int i11) {
        c cVar = this.f145546p;
        if (cVar.f145576q != i11) {
            cVar.f145576q = i11;
            m152400S();
        }
    }

    /* renamed from: k0 */
    public void m152451k0(float f11, int i11) {
        m152455n0(f11);
        m152454m0(ColorStateList.valueOf(i11));
    }

    /* renamed from: l */
    public int m152452l(int i11) {
        float m152434N = m152434N() + m152423B();
        C26159a c26159a = this.f145546p.f145561b;
        if (c26159a != null) {
            return c26159a.m134513c(i11, m152434N);
        }
        return i11;
    }

    /* renamed from: l0 */
    public void m152453l0(float f11, ColorStateList colorStateList) {
        m152455n0(f11);
        m152454m0(colorStateList);
    }

    /* renamed from: m0 */
    public void m152454m0(ColorStateList colorStateList) {
        c cVar = this.f145546p;
        if (cVar.f145564e != colorStateList) {
            cVar.f145564e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f145546p = new c(this.f145546p);
        return this;
    }

    /* renamed from: n0 */
    public void m152455n0(float f11) {
        this.f145546p.f145571l = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f145550t = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C6352s.b
    public boolean onStateChange(int[] iArr) {
        boolean z11;
        boolean m152415o0 = m152415o0(iArr);
        boolean m152417p0 = m152417p0();
        if (!m152415o0 && !m152417p0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    /* renamed from: q */
    public void m152456q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m152419r(canvas, paint, path, this.f145546p.f145560a, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        c cVar = this.f145546p;
        if (cVar.f145572m != i11) {
            cVar.f145572m = i11;
            m152400S();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f145546p.f145562c = colorFilter;
        m152400S();
    }

    @Override // p706z6.InterfaceC31697p
    public void setShapeAppearanceModel(C31694m c31694m) {
        this.f145546p.f145560a = c31694m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f145546p.f145566g = colorStateList;
        m152417p0();
        m152400S();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f145546p;
        if (cVar.f145567h != mode) {
            cVar.f145567h = mode;
            m152417p0();
            m152400S();
        }
    }

    /* renamed from: u */
    public float m152457u() {
        return this.f145546p.f145560a.m152481j().mo152392a(m152459w());
    }

    /* renamed from: v */
    public float m152458v() {
        return this.f145546p.f145560a.m152483l().mo152392a(m152459w());
    }

    /* renamed from: w */
    public RectF m152459w() {
        this.f145554x.set(getBounds());
        return this.f145554x;
    }

    /* renamed from: y */
    public float m152460y() {
        return this.f145546p.f145574o;
    }

    /* renamed from: z */
    public ColorStateList m152461z() {
        return this.f145546p.f145563d;
    }

    public C31689h() {
        this(new C31694m());
    }

    /* renamed from: z6.h$c */
    /* loaded from: classes3.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a */
        public C31694m f145560a;

        /* renamed from: b */
        public C26159a f145561b;

        /* renamed from: c */
        public ColorFilter f145562c;

        /* renamed from: d */
        public ColorStateList f145563d;

        /* renamed from: e */
        public ColorStateList f145564e;

        /* renamed from: f */
        public ColorStateList f145565f;

        /* renamed from: g */
        public ColorStateList f145566g;

        /* renamed from: h */
        public PorterDuff.Mode f145567h;

        /* renamed from: i */
        public Rect f145568i;

        /* renamed from: j */
        public float f145569j;

        /* renamed from: k */
        public float f145570k;

        /* renamed from: l */
        public float f145571l;

        /* renamed from: m */
        public int f145572m;

        /* renamed from: n */
        public float f145573n;

        /* renamed from: o */
        public float f145574o;

        /* renamed from: p */
        public float f145575p;

        /* renamed from: q */
        public int f145576q;

        /* renamed from: r */
        public int f145577r;

        /* renamed from: s */
        public int f145578s;

        /* renamed from: t */
        public int f145579t;

        /* renamed from: u */
        public boolean f145580u;

        /* renamed from: v */
        public Paint.Style f145581v;

        public c(C31694m c31694m, C26159a c26159a) {
            this.f145563d = null;
            this.f145564e = null;
            this.f145565f = null;
            this.f145566g = null;
            this.f145567h = PorterDuff.Mode.SRC_IN;
            this.f145568i = null;
            this.f145569j = 1.0f;
            this.f145570k = 1.0f;
            this.f145572m = 255;
            this.f145573n = 0.0f;
            this.f145574o = 0.0f;
            this.f145575p = 0.0f;
            this.f145576q = 0;
            this.f145577r = 0;
            this.f145578s = 0;
            this.f145579t = 0;
            this.f145580u = false;
            this.f145581v = Paint.Style.FILL_AND_STROKE;
            this.f145560a = c31694m;
            this.f145561b = c26159a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C31689h c31689h = new C31689h(this, null);
            c31689h.f145550t = true;
            return c31689h;
        }

        public c(c cVar) {
            this.f145563d = null;
            this.f145564e = null;
            this.f145565f = null;
            this.f145566g = null;
            this.f145567h = PorterDuff.Mode.SRC_IN;
            this.f145568i = null;
            this.f145569j = 1.0f;
            this.f145570k = 1.0f;
            this.f145572m = 255;
            this.f145573n = 0.0f;
            this.f145574o = 0.0f;
            this.f145575p = 0.0f;
            this.f145576q = 0;
            this.f145577r = 0;
            this.f145578s = 0;
            this.f145579t = 0;
            this.f145580u = false;
            this.f145581v = Paint.Style.FILL_AND_STROKE;
            this.f145560a = cVar.f145560a;
            this.f145561b = cVar.f145561b;
            this.f145571l = cVar.f145571l;
            this.f145562c = cVar.f145562c;
            this.f145563d = cVar.f145563d;
            this.f145564e = cVar.f145564e;
            this.f145567h = cVar.f145567h;
            this.f145566g = cVar.f145566g;
            this.f145572m = cVar.f145572m;
            this.f145569j = cVar.f145569j;
            this.f145578s = cVar.f145578s;
            this.f145576q = cVar.f145576q;
            this.f145580u = cVar.f145580u;
            this.f145570k = cVar.f145570k;
            this.f145573n = cVar.f145573n;
            this.f145574o = cVar.f145574o;
            this.f145575p = cVar.f145575p;
            this.f145577r = cVar.f145577r;
            this.f145579t = cVar.f145579t;
            this.f145565f = cVar.f145565f;
            this.f145581v = cVar.f145581v;
            if (cVar.f145568i != null) {
                this.f145568i = new Rect(cVar.f145568i);
            }
        }
    }

    public C31689h(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(C31694m.m152475e(context, attributeSet, i11, i12).m152519m());
    }

    public C31689h(C31694m c31694m) {
        this(new c(c31694m, null));
    }

    private C31689h(c cVar) {
        this.f145547q = new C31696o.g[4];
        this.f145548r = new C31696o.g[4];
        this.f145549s = new BitSet(8);
        this.f145551u = new Matrix();
        this.f145552v = new Path();
        this.f145553w = new Path();
        this.f145554x = new RectF();
        this.f145555y = new RectF();
        this.f145556z = new Region();
        this.f145535A = new Region();
        Paint paint = new Paint(1);
        this.f145537C = paint;
        Paint paint2 = new Paint(1);
        this.f145538D = paint2;
        this.f145539E = new C30797a();
        this.f145541G = Looper.getMainLooper().getThread() == Thread.currentThread() ? C31695n.m152540k() : new C31695n();
        this.f145544J = new RectF();
        this.f145545K = true;
        this.f145546p = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f145534L;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m152417p0();
        m152415o0(getState());
        this.f145540F = new a();
    }
}
