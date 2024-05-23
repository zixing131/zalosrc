package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.AbstractC1409d;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.graphics.drawable.InterfaceC1416c;
import androidx.core.text.C1462a;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import com.google.android.material.internal.C6352s;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23587l;
import p382o6.C24048h;
import p417p6.AbstractC24659a;
import p439q6.AbstractC25136a;
import p474r6.AbstractC25666b;
import p599w6.AbstractC28774c;
import p599w6.C28775d;
import p634x6.AbstractC29387b;
import p706z6.C31689h;

/* renamed from: com.google.android.material.chip.b */
/* loaded from: classes3.dex */
public class C6284b extends C31689h implements InterfaceC1416c, Drawable.Callback, C6352s.b {

    /* renamed from: W0 */
    private static final int[] f35152W0 = {R.attr.state_enabled};

    /* renamed from: X0 */
    private static final ShapeDrawable f35153X0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private final C6352s f35154A0;

    /* renamed from: B0 */
    private int f35155B0;

    /* renamed from: C0 */
    private int f35156C0;

    /* renamed from: D0 */
    private int f35157D0;

    /* renamed from: E0 */
    private int f35158E0;

    /* renamed from: F0 */
    private int f35159F0;

    /* renamed from: G0 */
    private int f35160G0;

    /* renamed from: H0 */
    private boolean f35161H0;

    /* renamed from: I0 */
    private int f35162I0;

    /* renamed from: J0 */
    private int f35163J0;

    /* renamed from: K0 */
    private ColorFilter f35164K0;

    /* renamed from: L0 */
    private PorterDuffColorFilter f35165L0;

    /* renamed from: M */
    private ColorStateList f35166M;

    /* renamed from: M0 */
    private ColorStateList f35167M0;

    /* renamed from: N */
    private ColorStateList f35168N;

    /* renamed from: N0 */
    private PorterDuff.Mode f35169N0;

    /* renamed from: O */
    private float f35170O;

    /* renamed from: O0 */
    private int[] f35171O0;

    /* renamed from: P */
    private float f35172P;

    /* renamed from: P0 */
    private boolean f35173P0;

    /* renamed from: Q */
    private ColorStateList f35174Q;

    /* renamed from: Q0 */
    private ColorStateList f35175Q0;

    /* renamed from: R */
    private float f35176R;

    /* renamed from: R0 */
    private WeakReference f35177R0;

    /* renamed from: S */
    private ColorStateList f35178S;

    /* renamed from: S0 */
    private TextUtils.TruncateAt f35179S0;

    /* renamed from: T */
    private CharSequence f35180T;

    /* renamed from: T0 */
    private boolean f35181T0;

    /* renamed from: U */
    private boolean f35182U;

    /* renamed from: U0 */
    private int f35183U0;

    /* renamed from: V */
    private Drawable f35184V;

    /* renamed from: V0 */
    private boolean f35185V0;

    /* renamed from: W */
    private ColorStateList f35186W;

    /* renamed from: X */
    private float f35187X;

    /* renamed from: Y */
    private boolean f35188Y;

    /* renamed from: Z */
    private boolean f35189Z;

    /* renamed from: a0 */
    private Drawable f35190a0;

    /* renamed from: b0 */
    private Drawable f35191b0;

    /* renamed from: c0 */
    private ColorStateList f35192c0;

    /* renamed from: d0 */
    private float f35193d0;

    /* renamed from: e0 */
    private CharSequence f35194e0;

    /* renamed from: f0 */
    private boolean f35195f0;

    /* renamed from: g0 */
    private boolean f35196g0;

    /* renamed from: h0 */
    private Drawable f35197h0;

    /* renamed from: i0 */
    private ColorStateList f35198i0;

    /* renamed from: j0 */
    private C24048h f35199j0;

    /* renamed from: k0 */
    private C24048h f35200k0;

    /* renamed from: l0 */
    private float f35201l0;

    /* renamed from: m0 */
    private float f35202m0;

    /* renamed from: n0 */
    private float f35203n0;

    /* renamed from: o0 */
    private float f35204o0;

    /* renamed from: p0 */
    private float f35205p0;

    /* renamed from: q0 */
    private float f35206q0;

    /* renamed from: r0 */
    private float f35207r0;

    /* renamed from: s0 */
    private float f35208s0;

    /* renamed from: t0 */
    private final Context f35209t0;

    /* renamed from: u0 */
    private final Paint f35210u0;

    /* renamed from: v0 */
    private final Paint f35211v0;

    /* renamed from: w0 */
    private final Paint.FontMetrics f35212w0;

    /* renamed from: x0 */
    private final RectF f35213x0;

    /* renamed from: y0 */
    private final PointF f35214y0;

    /* renamed from: z0 */
    private final Path f35215z0;

    /* renamed from: com.google.android.material.chip.b$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo32051a();
    }

    private C6284b(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f35172P = -1.0f;
        this.f35210u0 = new Paint(1);
        this.f35212w0 = new Paint.FontMetrics();
        this.f35213x0 = new RectF();
        this.f35214y0 = new PointF();
        this.f35215z0 = new Path();
        this.f35163J0 = 255;
        this.f35169N0 = PorterDuff.Mode.SRC_IN;
        this.f35177R0 = new WeakReference(null);
        m152435R(context);
        this.f35209t0 = context;
        C6352s c6352s = new C6352s(this);
        this.f35154A0 = c6352s;
        this.f35180T = "";
        c6352s.m32625e().density = context.getResources().getDisplayMetrics().density;
        this.f35211v0 = null;
        int[] iArr = f35152W0;
        setState(iArr);
        m32206s2(iArr);
        this.f35181T0 = true;
        if (AbstractC29387b.f135923a) {
            f35153X0.setTint(-1);
        }
    }

    /* renamed from: A1 */
    private static boolean m32082A1(C28775d c28775d) {
        ColorStateList colorStateList;
        if (c28775d != null && (colorStateList = c28775d.f133362a) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    private boolean m32083B0() {
        return this.f35196g0 && this.f35197h0 != null && this.f35195f0;
    }

    /* renamed from: B1 */
    private void m32084B1(AttributeSet attributeSet, int i11, int i12) {
        TypedArray m32639h = AbstractC6355v.m32639h(this.f35209t0, attributeSet, AbstractC23587l.Chip, i11, i12, new int[0]);
        this.f35185V0 = m32639h.hasValue(AbstractC23587l.Chip_shapeAppearance);
        m32104i2(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_chipSurfaceColor));
        m32139M1(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_chipBackgroundColor));
        m32174a2(m32639h.getDimension(AbstractC23587l.Chip_chipMinHeight, 0.0f));
        if (m32639h.hasValue(AbstractC23587l.Chip_chipCornerRadius)) {
            m32145O1(m32639h.getDimension(AbstractC23587l.Chip_chipCornerRadius, 0.0f));
        }
        m32182e2(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_chipStrokeColor));
        m32185g2(m32639h.getDimension(AbstractC23587l.Chip_chipStrokeWidth, 0.0f));
        m32125F2(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_rippleColor));
        m32135K2(m32639h.getText(AbstractC23587l.Chip_android_text));
        C28775d m143978f = AbstractC28774c.m143978f(this.f35209t0, m32639h, AbstractC23587l.Chip_android_textAppearance);
        m143978f.f133375n = m32639h.getDimension(AbstractC23587l.Chip_android_textSize, m143978f.f133375n);
        m32137L2(m143978f);
        int i13 = m32639h.getInt(AbstractC23587l.Chip_android_ellipsize, 0);
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    m32217x2(TextUtils.TruncateAt.END);
                }
            } else {
                m32217x2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            m32217x2(TextUtils.TruncateAt.START);
        }
        m32172Z1(m32639h.getBoolean(AbstractC23587l.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m32172Z1(m32639h.getBoolean(AbstractC23587l.Chip_chipIconEnabled, false));
        }
        m32157S1(AbstractC28774c.m143976d(this.f35209t0, m32639h, AbstractC23587l.Chip_chipIcon));
        if (m32639h.hasValue(AbstractC23587l.Chip_chipIconTint)) {
            m32166W1(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_chipIconTint));
        }
        m32162U1(m32639h.getDimension(AbstractC23587l.Chip_chipIconSize, -1.0f));
        m32212v2(m32639h.getBoolean(AbstractC23587l.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m32212v2(m32639h.getBoolean(AbstractC23587l.Chip_closeIconEnabled, false));
        }
        m32189j2(AbstractC28774c.m143976d(this.f35209t0, m32639h, AbstractC23587l.Chip_closeIcon));
        m32209t2(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_closeIconTint));
        m32199o2(m32639h.getDimension(AbstractC23587l.Chip_closeIconSize, 0.0f));
        m32122E1(m32639h.getBoolean(AbstractC23587l.Chip_android_checkable, false));
        m32136L1(m32639h.getBoolean(AbstractC23587l.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m32136L1(m32639h.getBoolean(AbstractC23587l.Chip_checkedIconEnabled, false));
        }
        m32126G1(AbstractC28774c.m143976d(this.f35209t0, m32639h, AbstractC23587l.Chip_checkedIcon));
        if (m32639h.hasValue(AbstractC23587l.Chip_checkedIconTint)) {
            m32130I1(AbstractC28774c.m143973a(this.f35209t0, m32639h, AbstractC23587l.Chip_checkedIconTint));
        }
        m32131I2(C24048h.m125924c(this.f35209t0, m32639h, AbstractC23587l.Chip_showMotionSpec));
        m32218y2(C24048h.m125924c(this.f35209t0, m32639h, AbstractC23587l.Chip_hideMotionSpec));
        m32178c2(m32639h.getDimension(AbstractC23587l.Chip_chipStartPadding, 0.0f));
        m32120C2(m32639h.getDimension(AbstractC23587l.Chip_iconStartPadding, 0.0f));
        m32117A2(m32639h.getDimension(AbstractC23587l.Chip_iconEndPadding, 0.0f));
        m32149P2(m32639h.getDimension(AbstractC23587l.Chip_textStartPadding, 0.0f));
        m32143N2(m32639h.getDimension(AbstractC23587l.Chip_textEndPadding, 0.0f));
        m32203q2(m32639h.getDimension(AbstractC23587l.Chip_closeIconStartPadding, 0.0f));
        m32193l2(m32639h.getDimension(AbstractC23587l.Chip_closeIconEndPadding, 0.0f));
        m32151Q1(m32639h.getDimension(AbstractC23587l.Chip_chipEndPadding, 0.0f));
        m32123E2(m32639h.getDimensionPixelSize(AbstractC23587l.Chip_android_maxWidth, Integer.MAX_VALUE));
        m32639h.recycle();
    }

    /* renamed from: C0 */
    public static C6284b m32085C0(Context context, AttributeSet attributeSet, int i11, int i12) {
        C6284b c6284b = new C6284b(context, attributeSet, i11, i12);
        c6284b.m32084B1(attributeSet, i11, i12);
        return c6284b;
    }

    /* renamed from: D0 */
    private void m32086D0(Canvas canvas, Rect rect) {
        if (m32096T2()) {
            m32106s0(rect, this.f35213x0);
            RectF rectF = this.f35213x0;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.f35197h0.setBounds(0, 0, (int) this.f35213x0.width(), (int) this.f35213x0.height());
            this.f35197h0.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m32087D1(int[] iArr, int[] iArr2) {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        ColorStateList colorStateList;
        int i16;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f35166M;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(iArr, this.f35155B0);
        } else {
            i11 = 0;
        }
        int m152452l = m152452l(i11);
        boolean z15 = true;
        if (this.f35155B0 != m152452l) {
            this.f35155B0 = m152452l;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f35168N;
        if (colorStateList3 != null) {
            i12 = colorStateList3.getColorForState(iArr, this.f35156C0);
        } else {
            i12 = 0;
        }
        int m152452l2 = m152452l(i12);
        if (this.f35156C0 != m152452l2) {
            this.f35156C0 = m152452l2;
            onStateChange = true;
        }
        int m130296f = AbstractC25136a.m130296f(m152452l, m152452l2);
        if (this.f35157D0 != m130296f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m152461z() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 | z12) {
            this.f35157D0 = m130296f;
            m152442c0(ColorStateList.valueOf(m130296f));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f35174Q;
        if (colorStateList4 != null) {
            i13 = colorStateList4.getColorForState(iArr, this.f35158E0);
        } else {
            i13 = 0;
        }
        if (this.f35158E0 != i13) {
            this.f35158E0 = i13;
            onStateChange = true;
        }
        if (this.f35175Q0 != null && AbstractC29387b.m146555e(iArr)) {
            i14 = this.f35175Q0.getColorForState(iArr, this.f35159F0);
        } else {
            i14 = 0;
        }
        if (this.f35159F0 != i14) {
            this.f35159F0 = i14;
            if (this.f35173P0) {
                onStateChange = true;
            }
        }
        if (this.f35154A0.m32624d() != null && this.f35154A0.m32624d().f133362a != null) {
            i15 = this.f35154A0.m32624d().f133362a.getColorForState(iArr, this.f35160G0);
        } else {
            i15 = 0;
        }
        if (this.f35160G0 != i15) {
            this.f35160G0 = i15;
            onStateChange = true;
        }
        if (m32109u1(getState(), R.attr.state_checked) && this.f35195f0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f35161H0 != z13 && this.f35197h0 != null) {
            float m32207t0 = m32207t0();
            this.f35161H0 = z13;
            if (m32207t0 != m32207t0()) {
                onStateChange = true;
                z14 = true;
                colorStateList = this.f35167M0;
                if (colorStateList == null) {
                    i16 = colorStateList.getColorForState(iArr, this.f35162I0);
                } else {
                    i16 = 0;
                }
                if (this.f35162I0 == i16) {
                    this.f35162I0 = i16;
                    this.f35165L0 = AbstractC25666b.m132553b(this, this.f35167M0, this.f35169N0);
                } else {
                    z15 = onStateChange;
                }
                if (m32115z1(this.f35184V)) {
                    z15 |= this.f35184V.setState(iArr);
                }
                if (m32115z1(this.f35197h0)) {
                    z15 |= this.f35197h0.setState(iArr);
                }
                if (m32115z1(this.f35190a0)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z15 |= this.f35190a0.setState(iArr3);
                }
                if (AbstractC29387b.f135923a && m32115z1(this.f35191b0)) {
                    z15 |= this.f35191b0.setState(iArr2);
                }
                if (z15) {
                    invalidateSelf();
                }
                if (z14) {
                    m32119C1();
                }
                return z15;
            }
            onStateChange = true;
        }
        z14 = false;
        colorStateList = this.f35167M0;
        if (colorStateList == null) {
        }
        if (this.f35162I0 == i16) {
        }
        if (m32115z1(this.f35184V)) {
        }
        if (m32115z1(this.f35197h0)) {
        }
        if (m32115z1(this.f35190a0)) {
        }
        if (AbstractC29387b.f135923a) {
            z15 |= this.f35191b0.setState(iArr2);
        }
        if (z15) {
        }
        if (z14) {
        }
        return z15;
    }

    /* renamed from: E0 */
    private void m32088E0(Canvas canvas, Rect rect) {
        if (!this.f35185V0) {
            this.f35210u0.setColor(this.f35156C0);
            this.f35210u0.setStyle(Paint.Style.FILL);
            this.f35210u0.setColorFilter(m32107s1());
            this.f35213x0.set(rect);
            canvas.drawRoundRect(this.f35213x0, m32147P0(), m32147P0(), this.f35210u0);
        }
    }

    /* renamed from: F0 */
    private void m32089F0(Canvas canvas, Rect rect) {
        if (m32097U2()) {
            m32106s0(rect, this.f35213x0);
            RectF rectF = this.f35213x0;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.f35184V.setBounds(0, 0, (int) this.f35213x0.width(), (int) this.f35213x0.height());
            this.f35184V.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    /* renamed from: G0 */
    private void m32090G0(Canvas canvas, Rect rect) {
        if (this.f35176R > 0.0f && !this.f35185V0) {
            this.f35210u0.setColor(this.f35158E0);
            this.f35210u0.setStyle(Paint.Style.STROKE);
            if (!this.f35185V0) {
                this.f35210u0.setColorFilter(m32107s1());
            }
            RectF rectF = this.f35213x0;
            float f11 = rect.left;
            float f12 = this.f35176R;
            rectF.set(f11 + (f12 / 2.0f), rect.top + (f12 / 2.0f), rect.right - (f12 / 2.0f), rect.bottom - (f12 / 2.0f));
            float f13 = this.f35172P - (this.f35176R / 2.0f);
            canvas.drawRoundRect(this.f35213x0, f13, f13, this.f35210u0);
        }
    }

    /* renamed from: H0 */
    private void m32091H0(Canvas canvas, Rect rect) {
        if (!this.f35185V0) {
            this.f35210u0.setColor(this.f35155B0);
            this.f35210u0.setStyle(Paint.Style.FILL);
            this.f35213x0.set(rect);
            canvas.drawRoundRect(this.f35213x0, m32147P0(), m32147P0(), this.f35210u0);
        }
    }

    /* renamed from: I0 */
    private void m32092I0(Canvas canvas, Rect rect) {
        if (m32098V2()) {
            m32110v0(rect, this.f35213x0);
            RectF rectF = this.f35213x0;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.f35190a0.setBounds(0, 0, (int) this.f35213x0.width(), (int) this.f35213x0.height());
            if (AbstractC29387b.f135923a) {
                this.f35191b0.setBounds(this.f35190a0.getBounds());
                this.f35191b0.jumpToCurrentState();
                this.f35191b0.draw(canvas);
            } else {
                this.f35190a0.draw(canvas);
            }
            canvas.translate(-f11, -f12);
        }
    }

    /* renamed from: J0 */
    private void m32093J0(Canvas canvas, Rect rect) {
        this.f35210u0.setColor(this.f35159F0);
        this.f35210u0.setStyle(Paint.Style.FILL);
        this.f35213x0.set(rect);
        if (!this.f35185V0) {
            canvas.drawRoundRect(this.f35213x0, m32147P0(), m32147P0(), this.f35210u0);
        } else {
            m152447h(new RectF(rect), this.f35215z0);
            super.m152456q(canvas, this.f35210u0, this.f35215z0, m152459w());
        }
    }

    /* renamed from: K0 */
    private void m32094K0(Canvas canvas, Rect rect) {
        Paint paint = this.f35211v0;
        if (paint != null) {
            paint.setColor(AbstractC1409d.m7147p(-16777216, 127));
            canvas.drawRect(rect, this.f35211v0);
            if (m32097U2() || m32096T2()) {
                m32106s0(rect, this.f35213x0);
                canvas.drawRect(this.f35213x0, this.f35211v0);
            }
            if (this.f35180T != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f35211v0);
            }
            if (m32098V2()) {
                m32110v0(rect, this.f35213x0);
                canvas.drawRect(this.f35213x0, this.f35211v0);
            }
            this.f35211v0.setColor(AbstractC1409d.m7147p(-65536, 127));
            m32108u0(rect, this.f35213x0);
            canvas.drawRect(this.f35213x0, this.f35211v0);
            this.f35211v0.setColor(AbstractC1409d.m7147p(-16711936, 127));
            m32111w0(rect, this.f35213x0);
            canvas.drawRect(this.f35213x0, this.f35211v0);
        }
    }

    /* renamed from: L0 */
    private void m32095L0(Canvas canvas, Rect rect) {
        boolean z11;
        if (this.f35180T != null) {
            Paint.Align m32116A0 = m32116A0(rect, this.f35214y0);
            m32112y0(rect, this.f35213x0);
            if (this.f35154A0.m32624d() != null) {
                this.f35154A0.m32625e().drawableState = getState();
                this.f35154A0.m32630j(this.f35209t0);
            }
            this.f35154A0.m32625e().setTextAlign(m32116A0);
            int i11 = 0;
            if (Math.round(this.f35154A0.m32626f(m32198o1().toString())) > Math.round(this.f35213x0.width())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = canvas.save();
                canvas.clipRect(this.f35213x0);
            }
            CharSequence charSequence = this.f35180T;
            if (z11 && this.f35179S0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f35154A0.m32625e(), this.f35213x0.width(), this.f35179S0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f35214y0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f35154A0.m32625e());
            if (z11) {
                canvas.restoreToCount(i11);
            }
        }
    }

    /* renamed from: T2 */
    private boolean m32096T2() {
        return this.f35196g0 && this.f35197h0 != null && this.f35161H0;
    }

    /* renamed from: U2 */
    private boolean m32097U2() {
        return this.f35182U && this.f35184V != null;
    }

    /* renamed from: V2 */
    private boolean m32098V2() {
        return this.f35189Z && this.f35190a0 != null;
    }

    /* renamed from: W2 */
    private void m32099W2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: X2 */
    private void m32100X2() {
        ColorStateList colorStateList;
        if (this.f35173P0) {
            colorStateList = AbstractC29387b.m146554d(this.f35178S);
        } else {
            colorStateList = null;
        }
        this.f35175Q0 = colorStateList;
    }

    /* renamed from: Y2 */
    private void m32101Y2() {
        this.f35191b0 = new RippleDrawable(AbstractC29387b.m146554d(m32194m1()), this.f35190a0, f35153X0);
    }

    /* renamed from: g1 */
    private float m32102g1() {
        Drawable drawable;
        if (this.f35161H0) {
            drawable = this.f35197h0;
        } else {
            drawable = this.f35184V;
        }
        float f11 = this.f35187X;
        if (f11 <= 0.0f && drawable != null) {
            f11 = (float) Math.ceil(AbstractC6359z.m32648c(this.f35209t0, 24));
            if (drawable.getIntrinsicHeight() <= f11) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f11;
    }

    /* renamed from: h1 */
    private float m32103h1() {
        Drawable drawable;
        if (this.f35161H0) {
            drawable = this.f35197h0;
        } else {
            drawable = this.f35184V;
        }
        float f11 = this.f35187X;
        if (f11 <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f11;
    }

    /* renamed from: i2 */
    private void m32104i2(ColorStateList colorStateList) {
        if (this.f35166M != colorStateList) {
            this.f35166M = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: r0 */
    private void m32105r0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC1414a.m7195m(drawable, AbstractC1414a.m7188f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f35190a0) {
            if (drawable.isStateful()) {
                drawable.setState(m32179d1());
            }
            AbstractC1414a.m7197o(drawable, this.f35192c0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f35184V;
        if (drawable == drawable2 && this.f35188Y) {
            AbstractC1414a.m7197o(drawable2, this.f35186W);
        }
    }

    /* renamed from: s0 */
    private void m32106s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m32097U2() || m32096T2()) {
            float f11 = this.f35201l0 + this.f35202m0;
            float m32103h1 = m32103h1();
            if (AbstractC1414a.m7188f(this) == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + m32103h1;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - m32103h1;
            }
            float m32102g1 = m32102g1();
            float exactCenterY = rect.exactCenterY() - (m32102g1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m32102g1;
        }
    }

    /* renamed from: s1 */
    private ColorFilter m32107s1() {
        ColorFilter colorFilter = this.f35164K0;
        return colorFilter != null ? colorFilter : this.f35165L0;
    }

    /* renamed from: u0 */
    private void m32108u0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m32098V2()) {
            float f11 = this.f35208s0 + this.f35207r0 + this.f35193d0 + this.f35206q0 + this.f35205p0;
            if (AbstractC1414a.m7188f(this) == 0) {
                rectF.right = rect.right - f11;
            } else {
                rectF.left = rect.left + f11;
            }
        }
    }

    /* renamed from: u1 */
    private static boolean m32109u1(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    private void m32110v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m32098V2()) {
            float f11 = this.f35208s0 + this.f35207r0;
            if (AbstractC1414a.m7188f(this) == 0) {
                float f12 = rect.right - f11;
                rectF.right = f12;
                rectF.left = f12 - this.f35193d0;
            } else {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + this.f35193d0;
            }
            float exactCenterY = rect.exactCenterY();
            float f14 = this.f35193d0;
            float f15 = exactCenterY - (f14 / 2.0f);
            rectF.top = f15;
            rectF.bottom = f15 + f14;
        }
    }

    /* renamed from: w0 */
    private void m32111w0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m32098V2()) {
            float f11 = this.f35208s0 + this.f35207r0 + this.f35193d0 + this.f35206q0 + this.f35205p0;
            if (AbstractC1414a.m7188f(this) == 0) {
                float f12 = rect.right;
                rectF.right = f12;
                rectF.left = f12 - f11;
            } else {
                int i11 = rect.left;
                rectF.left = i11;
                rectF.right = i11 + f11;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: y0 */
    private void m32112y0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f35180T != null) {
            float m32207t0 = this.f35201l0 + m32207t0() + this.f35204o0;
            float m32215x0 = this.f35208s0 + m32215x0() + this.f35205p0;
            if (AbstractC1414a.m7188f(this) == 0) {
                rectF.left = rect.left + m32207t0;
                rectF.right = rect.right - m32215x0;
            } else {
                rectF.left = rect.left + m32215x0;
                rectF.right = rect.right - m32207t0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: y1 */
    private static boolean m32113y1(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    private float m32114z0() {
        this.f35154A0.m32625e().getFontMetrics(this.f35212w0);
        Paint.FontMetrics fontMetrics = this.f35212w0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: z1 */
    private static boolean m32115z1(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    Paint.Align m32116A0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f35180T != null) {
            float m32207t0 = this.f35201l0 + m32207t0() + this.f35204o0;
            if (AbstractC1414a.m7188f(this) == 0) {
                pointF.x = rect.left + m32207t0;
            } else {
                pointF.x = rect.right - m32207t0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m32114z0();
        }
        return align;
    }

    /* renamed from: A2 */
    public void m32117A2(float f11) {
        if (this.f35203n0 != f11) {
            float m32207t0 = m32207t0();
            this.f35203n0 = f11;
            float m32207t02 = m32207t0();
            invalidateSelf();
            if (m32207t0 != m32207t02) {
                m32119C1();
            }
        }
    }

    /* renamed from: B2 */
    public void m32118B2(int i11) {
        m32117A2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: C1 */
    protected void m32119C1() {
        a aVar = (a) this.f35177R0.get();
        if (aVar != null) {
            aVar.mo32051a();
        }
    }

    /* renamed from: C2 */
    public void m32120C2(float f11) {
        if (this.f35202m0 != f11) {
            float m32207t0 = m32207t0();
            this.f35202m0 = f11;
            float m32207t02 = m32207t0();
            invalidateSelf();
            if (m32207t0 != m32207t02) {
                m32119C1();
            }
        }
    }

    /* renamed from: D2 */
    public void m32121D2(int i11) {
        m32120C2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: E1 */
    public void m32122E1(boolean z11) {
        if (this.f35195f0 != z11) {
            this.f35195f0 = z11;
            float m32207t0 = m32207t0();
            if (!z11 && this.f35161H0) {
                this.f35161H0 = false;
            }
            float m32207t02 = m32207t0();
            invalidateSelf();
            if (m32207t0 != m32207t02) {
                m32119C1();
            }
        }
    }

    /* renamed from: E2 */
    public void m32123E2(int i11) {
        this.f35183U0 = i11;
    }

    /* renamed from: F1 */
    public void m32124F1(int i11) {
        m32122E1(this.f35209t0.getResources().getBoolean(i11));
    }

    /* renamed from: F2 */
    public void m32125F2(ColorStateList colorStateList) {
        if (this.f35178S != colorStateList) {
            this.f35178S = colorStateList;
            m32100X2();
            onStateChange(getState());
        }
    }

    /* renamed from: G1 */
    public void m32126G1(Drawable drawable) {
        if (this.f35197h0 != drawable) {
            float m32207t0 = m32207t0();
            this.f35197h0 = drawable;
            float m32207t02 = m32207t0();
            m32099W2(this.f35197h0);
            m32105r0(this.f35197h0);
            invalidateSelf();
            if (m32207t0 != m32207t02) {
                m32119C1();
            }
        }
    }

    /* renamed from: G2 */
    public void m32127G2(int i11) {
        m32125F2(AbstractC19694b.m103335c(this.f35209t0, i11));
    }

    /* renamed from: H1 */
    public void m32128H1(int i11) {
        m32126G1(AbstractC19694b.m103336d(this.f35209t0, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H2 */
    public void m32129H2(boolean z11) {
        this.f35181T0 = z11;
    }

    /* renamed from: I1 */
    public void m32130I1(ColorStateList colorStateList) {
        if (this.f35198i0 != colorStateList) {
            this.f35198i0 = colorStateList;
            if (m32083B0()) {
                AbstractC1414a.m7197o(this.f35197h0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: I2 */
    public void m32131I2(C24048h c24048h) {
        this.f35199j0 = c24048h;
    }

    /* renamed from: J1 */
    public void m32132J1(int i11) {
        m32130I1(AbstractC19694b.m103335c(this.f35209t0, i11));
    }

    /* renamed from: J2 */
    public void m32133J2(int i11) {
        m32131I2(C24048h.m125925d(this.f35209t0, i11));
    }

    /* renamed from: K1 */
    public void m32134K1(int i11) {
        m32136L1(this.f35209t0.getResources().getBoolean(i11));
    }

    /* renamed from: K2 */
    public void m32135K2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f35180T, charSequence)) {
            this.f35180T = charSequence;
            this.f35154A0.m32629i(true);
            invalidateSelf();
            m32119C1();
        }
    }

    /* renamed from: L1 */
    public void m32136L1(boolean z11) {
        if (this.f35196g0 != z11) {
            boolean m32096T2 = m32096T2();
            this.f35196g0 = z11;
            boolean m32096T22 = m32096T2();
            if (m32096T2 != m32096T22) {
                if (m32096T22) {
                    m32105r0(this.f35197h0);
                } else {
                    m32099W2(this.f35197h0);
                }
                invalidateSelf();
                m32119C1();
            }
        }
    }

    /* renamed from: L2 */
    public void m32137L2(C28775d c28775d) {
        this.f35154A0.m32628h(c28775d, this.f35209t0);
    }

    /* renamed from: M0 */
    public Drawable m32138M0() {
        return this.f35197h0;
    }

    /* renamed from: M1 */
    public void m32139M1(ColorStateList colorStateList) {
        if (this.f35168N != colorStateList) {
            this.f35168N = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: M2 */
    public void m32140M2(int i11) {
        m32137L2(new C28775d(this.f35209t0, i11));
    }

    /* renamed from: N0 */
    public ColorStateList m32141N0() {
        return this.f35198i0;
    }

    /* renamed from: N1 */
    public void m32142N1(int i11) {
        m32139M1(AbstractC19694b.m103335c(this.f35209t0, i11));
    }

    /* renamed from: N2 */
    public void m32143N2(float f11) {
        if (this.f35205p0 != f11) {
            this.f35205p0 = f11;
            invalidateSelf();
            m32119C1();
        }
    }

    /* renamed from: O0 */
    public ColorStateList m32144O0() {
        return this.f35168N;
    }

    /* renamed from: O1 */
    public void m32145O1(float f11) {
        if (this.f35172P != f11) {
            this.f35172P = f11;
            setShapeAppearanceModel(m152427F().m152493w(f11));
        }
    }

    /* renamed from: O2 */
    public void m32146O2(int i11) {
        m32143N2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: P0 */
    public float m32147P0() {
        if (this.f35185V0) {
            return m152431K();
        }
        return this.f35172P;
    }

    /* renamed from: P1 */
    public void m32148P1(int i11) {
        m32145O1(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: P2 */
    public void m32149P2(float f11) {
        if (this.f35204o0 != f11) {
            this.f35204o0 = f11;
            invalidateSelf();
            m32119C1();
        }
    }

    /* renamed from: Q0 */
    public float m32150Q0() {
        return this.f35208s0;
    }

    /* renamed from: Q1 */
    public void m32151Q1(float f11) {
        if (this.f35208s0 != f11) {
            this.f35208s0 = f11;
            invalidateSelf();
            m32119C1();
        }
    }

    /* renamed from: Q2 */
    public void m32152Q2(int i11) {
        m32149P2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: R0 */
    public Drawable m32153R0() {
        Drawable drawable = this.f35184V;
        if (drawable != null) {
            return AbstractC1414a.m7199q(drawable);
        }
        return null;
    }

    /* renamed from: R1 */
    public void m32154R1(int i11) {
        m32151Q1(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: R2 */
    public void m32155R2(boolean z11) {
        if (this.f35173P0 != z11) {
            this.f35173P0 = z11;
            m32100X2();
            onStateChange(getState());
        }
    }

    /* renamed from: S0 */
    public float m32156S0() {
        return this.f35187X;
    }

    /* renamed from: S1 */
    public void m32157S1(Drawable drawable) {
        Drawable drawable2;
        Drawable m32153R0 = m32153R0();
        if (m32153R0 != drawable) {
            float m32207t0 = m32207t0();
            if (drawable != null) {
                drawable2 = AbstractC1414a.m7200r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f35184V = drawable2;
            float m32207t02 = m32207t0();
            m32099W2(m32153R0);
            if (m32097U2()) {
                m32105r0(this.f35184V);
            }
            invalidateSelf();
            if (m32207t0 != m32207t02) {
                m32119C1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S2 */
    public boolean m32158S2() {
        return this.f35181T0;
    }

    /* renamed from: T0 */
    public ColorStateList m32159T0() {
        return this.f35186W;
    }

    /* renamed from: T1 */
    public void m32160T1(int i11) {
        m32157S1(AbstractC19694b.m103336d(this.f35209t0, i11));
    }

    /* renamed from: U0 */
    public float m32161U0() {
        return this.f35170O;
    }

    /* renamed from: U1 */
    public void m32162U1(float f11) {
        if (this.f35187X != f11) {
            float m32207t0 = m32207t0();
            this.f35187X = f11;
            float m32207t02 = m32207t0();
            invalidateSelf();
            if (m32207t0 != m32207t02) {
                m32119C1();
            }
        }
    }

    /* renamed from: V0 */
    public float m32163V0() {
        return this.f35201l0;
    }

    /* renamed from: V1 */
    public void m32164V1(int i11) {
        m32162U1(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: W0 */
    public ColorStateList m32165W0() {
        return this.f35174Q;
    }

    /* renamed from: W1 */
    public void m32166W1(ColorStateList colorStateList) {
        this.f35188Y = true;
        if (this.f35186W != colorStateList) {
            this.f35186W = colorStateList;
            if (m32097U2()) {
                AbstractC1414a.m7197o(this.f35184V, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: X0 */
    public float m32167X0() {
        return this.f35176R;
    }

    /* renamed from: X1 */
    public void m32168X1(int i11) {
        m32166W1(AbstractC19694b.m103335c(this.f35209t0, i11));
    }

    /* renamed from: Y0 */
    public Drawable m32169Y0() {
        Drawable drawable = this.f35190a0;
        if (drawable != null) {
            return AbstractC1414a.m7199q(drawable);
        }
        return null;
    }

    /* renamed from: Y1 */
    public void m32170Y1(int i11) {
        m32172Z1(this.f35209t0.getResources().getBoolean(i11));
    }

    /* renamed from: Z0 */
    public CharSequence m32171Z0() {
        return this.f35194e0;
    }

    /* renamed from: Z1 */
    public void m32172Z1(boolean z11) {
        if (this.f35182U != z11) {
            boolean m32097U2 = m32097U2();
            this.f35182U = z11;
            boolean m32097U22 = m32097U2();
            if (m32097U2 != m32097U22) {
                if (m32097U22) {
                    m32105r0(this.f35184V);
                } else {
                    m32099W2(this.f35184V);
                }
                invalidateSelf();
                m32119C1();
            }
        }
    }

    @Override // com.google.android.material.internal.C6352s.b
    /* renamed from: a */
    public void mo13074a() {
        m32119C1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public float m32173a1() {
        return this.f35207r0;
    }

    /* renamed from: a2 */
    public void m32174a2(float f11) {
        if (this.f35170O != f11) {
            this.f35170O = f11;
            invalidateSelf();
            m32119C1();
        }
    }

    /* renamed from: b1 */
    public float m32175b1() {
        return this.f35193d0;
    }

    /* renamed from: b2 */
    public void m32176b2(int i11) {
        m32174a2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: c1 */
    public float m32177c1() {
        return this.f35206q0;
    }

    /* renamed from: c2 */
    public void m32178c2(float f11) {
        if (this.f35201l0 != f11) {
            this.f35201l0 = f11;
            invalidateSelf();
            m32119C1();
        }
    }

    /* renamed from: d1 */
    public int[] m32179d1() {
        return this.f35171O0;
    }

    /* renamed from: d2 */
    public void m32180d2(int i11) {
        m32178c2(this.f35209t0.getResources().getDimension(i11));
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i12 = this.f35163J0;
            if (i12 < 255) {
                i11 = AbstractC24659a.m128196a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i12);
            } else {
                i11 = 0;
            }
            m32091H0(canvas, bounds);
            m32088E0(canvas, bounds);
            if (this.f35185V0) {
                super.draw(canvas);
            }
            m32090G0(canvas, bounds);
            m32093J0(canvas, bounds);
            m32089F0(canvas, bounds);
            m32086D0(canvas, bounds);
            if (this.f35181T0) {
                m32095L0(canvas, bounds);
            }
            m32092I0(canvas, bounds);
            m32094K0(canvas, bounds);
            if (this.f35163J0 < 255) {
                canvas.restoreToCount(i11);
            }
        }
    }

    /* renamed from: e1 */
    public ColorStateList m32181e1() {
        return this.f35192c0;
    }

    /* renamed from: e2 */
    public void m32182e2(ColorStateList colorStateList) {
        if (this.f35174Q != colorStateList) {
            this.f35174Q = colorStateList;
            if (this.f35185V0) {
                m152454m0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: f1 */
    public void m32183f1(RectF rectF) {
        m32111w0(getBounds(), rectF);
    }

    /* renamed from: f2 */
    public void m32184f2(int i11) {
        m32182e2(AbstractC19694b.m103335c(this.f35209t0, i11));
    }

    /* renamed from: g2 */
    public void m32185g2(float f11) {
        if (this.f35176R != f11) {
            this.f35176R = f11;
            this.f35210u0.setStrokeWidth(f11);
            if (this.f35185V0) {
                super.m152455n0(f11);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35163J0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f35164K0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f35170O;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f35201l0 + m32207t0() + this.f35204o0 + this.f35154A0.m32626f(m32198o1().toString()) + this.f35205p0 + m32215x0() + this.f35208s0), this.f35183U0);
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f35185V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f35172P);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f35172P);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h2 */
    public void m32186h2(int i11) {
        m32185g2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: i1 */
    public TextUtils.TruncateAt m32187i1() {
        return this.f35179S0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!m32113y1(this.f35166M) && !m32113y1(this.f35168N) && !m32113y1(this.f35174Q) && ((!this.f35173P0 || !m32113y1(this.f35175Q0)) && !m32082A1(this.f35154A0.m32624d()) && !m32083B0() && !m32115z1(this.f35184V) && !m32115z1(this.f35197h0) && !m32113y1(this.f35167M0))) {
            return false;
        }
        return true;
    }

    /* renamed from: j1 */
    public C24048h m32188j1() {
        return this.f35200k0;
    }

    /* renamed from: j2 */
    public void m32189j2(Drawable drawable) {
        Drawable drawable2;
        Drawable m32169Y0 = m32169Y0();
        if (m32169Y0 != drawable) {
            float m32215x0 = m32215x0();
            if (drawable != null) {
                drawable2 = AbstractC1414a.m7200r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f35190a0 = drawable2;
            if (AbstractC29387b.f135923a) {
                m32101Y2();
            }
            float m32215x02 = m32215x0();
            m32099W2(m32169Y0);
            if (m32098V2()) {
                m32105r0(this.f35190a0);
            }
            invalidateSelf();
            if (m32215x0 != m32215x02) {
                m32119C1();
            }
        }
    }

    /* renamed from: k1 */
    public float m32190k1() {
        return this.f35203n0;
    }

    /* renamed from: k2 */
    public void m32191k2(CharSequence charSequence) {
        if (this.f35194e0 != charSequence) {
            this.f35194e0 = C1462a.m7419c().m7424h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: l1 */
    public float m32192l1() {
        return this.f35202m0;
    }

    /* renamed from: l2 */
    public void m32193l2(float f11) {
        if (this.f35207r0 != f11) {
            this.f35207r0 = f11;
            invalidateSelf();
            if (m32098V2()) {
                m32119C1();
            }
        }
    }

    /* renamed from: m1 */
    public ColorStateList m32194m1() {
        return this.f35178S;
    }

    /* renamed from: m2 */
    public void m32195m2(int i11) {
        m32193l2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: n1 */
    public C24048h m32196n1() {
        return this.f35199j0;
    }

    /* renamed from: n2 */
    public void m32197n2(int i11) {
        m32189j2(AbstractC19694b.m103336d(this.f35209t0, i11));
    }

    /* renamed from: o1 */
    public CharSequence m32198o1() {
        return this.f35180T;
    }

    /* renamed from: o2 */
    public void m32199o2(float f11) {
        if (this.f35193d0 != f11) {
            this.f35193d0 = f11;
            invalidateSelf();
            if (m32098V2()) {
                m32119C1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (m32097U2()) {
            onLayoutDirectionChanged |= AbstractC1414a.m7195m(this.f35184V, i11);
        }
        if (m32096T2()) {
            onLayoutDirectionChanged |= AbstractC1414a.m7195m(this.f35197h0, i11);
        }
        if (m32098V2()) {
            onLayoutDirectionChanged |= AbstractC1414a.m7195m(this.f35190a0, i11);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        boolean onLevelChange = super.onLevelChange(i11);
        if (m32097U2()) {
            onLevelChange |= this.f35184V.setLevel(i11);
        }
        if (m32096T2()) {
            onLevelChange |= this.f35197h0.setLevel(i11);
        }
        if (m32098V2()) {
            onLevelChange |= this.f35190a0.setLevel(i11);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable, com.google.android.material.internal.C6352s.b
    public boolean onStateChange(int[] iArr) {
        if (this.f35185V0) {
            super.onStateChange(iArr);
        }
        return m32087D1(iArr, m32179d1());
    }

    /* renamed from: p1 */
    public C28775d m32200p1() {
        return this.f35154A0.m32624d();
    }

    /* renamed from: p2 */
    public void m32201p2(int i11) {
        m32199o2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: q1 */
    public float m32202q1() {
        return this.f35205p0;
    }

    /* renamed from: q2 */
    public void m32203q2(float f11) {
        if (this.f35206q0 != f11) {
            this.f35206q0 = f11;
            invalidateSelf();
            if (m32098V2()) {
                m32119C1();
            }
        }
    }

    /* renamed from: r1 */
    public float m32204r1() {
        return this.f35204o0;
    }

    /* renamed from: r2 */
    public void m32205r2(int i11) {
        m32203q2(this.f35209t0.getResources().getDimension(i11));
    }

    /* renamed from: s2 */
    public boolean m32206s2(int[] iArr) {
        if (!Arrays.equals(this.f35171O0, iArr)) {
            this.f35171O0 = iArr;
            if (m32098V2()) {
                return m32087D1(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f35163J0 != i11) {
            this.f35163J0 = i11;
            invalidateSelf();
        }
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f35164K0 != colorFilter) {
            this.f35164K0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f35167M0 != colorStateList) {
            this.f35167M0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f35169N0 != mode) {
            this.f35169N0 = mode;
            this.f35165L0 = AbstractC25666b.m132553b(this, this.f35167M0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (m32097U2()) {
            visible |= this.f35184V.setVisible(z11, z12);
        }
        if (m32096T2()) {
            visible |= this.f35197h0.setVisible(z11, z12);
        }
        if (m32098V2()) {
            visible |= this.f35190a0.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public float m32207t0() {
        if (!m32097U2() && !m32096T2()) {
            return 0.0f;
        }
        return this.f35202m0 + m32103h1() + this.f35203n0;
    }

    /* renamed from: t1 */
    public boolean m32208t1() {
        return this.f35173P0;
    }

    /* renamed from: t2 */
    public void m32209t2(ColorStateList colorStateList) {
        if (this.f35192c0 != colorStateList) {
            this.f35192c0 = colorStateList;
            if (m32098V2()) {
                AbstractC1414a.m7197o(this.f35190a0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: u2 */
    public void m32210u2(int i11) {
        m32209t2(AbstractC19694b.m103335c(this.f35209t0, i11));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public boolean m32211v1() {
        return this.f35195f0;
    }

    /* renamed from: v2 */
    public void m32212v2(boolean z11) {
        if (this.f35189Z != z11) {
            boolean m32098V2 = m32098V2();
            this.f35189Z = z11;
            boolean m32098V22 = m32098V2();
            if (m32098V2 != m32098V22) {
                if (m32098V22) {
                    m32105r0(this.f35190a0);
                } else {
                    m32099W2(this.f35190a0);
                }
                invalidateSelf();
                m32119C1();
            }
        }
    }

    /* renamed from: w1 */
    public boolean m32213w1() {
        return m32115z1(this.f35190a0);
    }

    /* renamed from: w2 */
    public void m32214w2(a aVar) {
        this.f35177R0 = new WeakReference(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public float m32215x0() {
        if (m32098V2()) {
            return this.f35206q0 + this.f35193d0 + this.f35207r0;
        }
        return 0.0f;
    }

    /* renamed from: x1 */
    public boolean m32216x1() {
        return this.f35189Z;
    }

    /* renamed from: x2 */
    public void m32217x2(TextUtils.TruncateAt truncateAt) {
        this.f35179S0 = truncateAt;
    }

    /* renamed from: y2 */
    public void m32218y2(C24048h c24048h) {
        this.f35200k0 = c24048h;
    }

    /* renamed from: z2 */
    public void m32219z2(int i11) {
        m32218y2(C24048h.m125925d(this.f35209t0, i11));
    }
}
