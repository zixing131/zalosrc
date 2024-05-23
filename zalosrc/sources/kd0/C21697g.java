package kd0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.view.MotionEvent;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import java.util.Objects;
import ld0.InterfaceC22449b;
import md0.C22990c;

/* renamed from: kd0.g */
/* loaded from: classes4.dex */
public class C21697g extends C16719g {

    /* renamed from: e1 */
    private static final float f105362e1 = Resources.getSystem().getDisplayMetrics().scaledDensity * 14.0f;

    /* renamed from: D0 */
    private C22990c f105363D0;

    /* renamed from: E0 */
    private Layout f105364E0;

    /* renamed from: F0 */
    private CharSequence f105365F0;

    /* renamed from: G0 */
    private float f105366G0;

    /* renamed from: H0 */
    private int f105367H0;

    /* renamed from: I0 */
    private ColorStateList f105368I0;

    /* renamed from: J0 */
    private Layout.Alignment f105369J0;

    /* renamed from: K0 */
    private int f105370K0;

    /* renamed from: L0 */
    private int f105371L0;

    /* renamed from: M0 */
    private boolean f105372M0;

    /* renamed from: N0 */
    private TextUtils.TruncateAt f105373N0;

    /* renamed from: O0 */
    private Typeface f105374O0;

    /* renamed from: P0 */
    private int f105375P0;

    /* renamed from: Q0 */
    private boolean f105376Q0;

    /* renamed from: R0 */
    private boolean f105377R0;

    /* renamed from: S0 */
    private float f105378S0;

    /* renamed from: T0 */
    private float f105379T0;

    /* renamed from: U0 */
    private float f105380U0;

    /* renamed from: V0 */
    private int f105381V0;

    /* renamed from: W0 */
    private boolean f105382W0;

    /* renamed from: X0 */
    private InterfaceC22449b f105383X0;

    /* renamed from: Y0 */
    private float f105384Y0;

    /* renamed from: Z0 */
    private float f105385Z0;

    /* renamed from: a1 */
    private float f105386a1;

    /* renamed from: b1 */
    private int f105387b1;

    /* renamed from: c1 */
    private boolean f105388c1;

    /* renamed from: d1 */
    private boolean f105389d1;

    public C21697g(Context context) {
        super(context);
        this.f105389d1 = false;
        m111951s1();
    }

    /* renamed from: g1 */
    private void m111949g1() {
        this.f105365F0 = "";
        this.f105366G0 = f105362e1;
        this.f105367H0 = -1979711488;
        this.f105370K0 = 0;
        this.f105371L0 = Integer.MAX_VALUE;
        this.f105372M0 = false;
        this.f105369J0 = null;
        this.f105373N0 = null;
        this.f105374O0 = null;
        this.f105375P0 = 0;
        this.f105382W0 = true;
        this.f105378S0 = 0.0f;
        this.f105379T0 = 0.0f;
        this.f105380U0 = 0.0f;
        this.f105384Y0 = 1.0f;
        this.f105385Z0 = 0.0f;
        this.f105387b1 = 0;
    }

    /* renamed from: h1 */
    private void m111950h1() {
        this.f105364E0 = null;
        if (m89106L().f84708d != -2 && m89106L().f84709e != -2) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    /* renamed from: s1 */
    private void m111951s1() {
        m111949g1();
        this.f105363D0 = new C22990c().m117781q(m111952t1(this.f105365F0)).m117782r(this.f105367H0).m117773i(this.f105369J0).m117774j(this.f105373N0).m117777m(this.f105371L0).m117780p(this.f105372M0).m117783s(this.f105366G0).m117787w(this.f105374O0).m117786v(this.f105375P0).m117785u(this.f105384Y0).m117784t(this.f105385Z0).m117775k(this.f105382W0);
    }

    /* renamed from: t1 */
    private CharSequence m111952t1(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        if (this.f105377R0) {
            charSequence = charSequence.toString().toUpperCase();
        }
        if (this.f105372M0) {
            return SingleLineTransformationMethod.getInstance().getTransformation(charSequence, null);
        }
        return charSequence;
    }

    /* renamed from: A1 */
    public void m111953A1(int i11) {
        if (i11 != this.f105371L0) {
            this.f105371L0 = i11;
            this.f105363D0.m117777m(i11);
            int i12 = this.f105370K0;
            int i13 = this.f105371L0;
            if (i12 > i13) {
                this.f105370K0 = i13;
            }
            m111950h1();
        }
    }

    /* renamed from: B1 */
    public void m111954B1(int i11) {
        if (i11 != this.f105370K0) {
            this.f105370K0 = i11;
            if (this.f105371L0 < i11) {
                this.f105371L0 = i11;
                this.f105363D0.m117777m(i11);
            }
            m111950h1();
        }
    }

    /* renamed from: C1 */
    public void m111955C1(InterfaceC22449b interfaceC22449b) {
        if (this.f105383X0 != interfaceC22449b) {
            this.f105383X0 = interfaceC22449b;
            if (interfaceC22449b != null) {
                CharSequence charSequence = this.f105365F0;
                if (charSequence instanceof Spannable) {
                    interfaceC22449b.mo116080a(this, (Spannable) charSequence);
                }
            }
        }
    }

    /* renamed from: D1 */
    public void m111956D1(float f11, float f12, float f13, int i11) {
        if (this.f105378S0 != f11 || this.f105379T0 != f12 || this.f105380U0 != f13 || this.f105381V0 != i11) {
            this.f105378S0 = f11;
            this.f105379T0 = f12;
            this.f105380U0 = f13;
            this.f105381V0 = i11;
            this.f105363D0.m117779o(f11, f12, f13, i11);
            invalidate();
        }
    }

    /* renamed from: E1 */
    public void m111957E1(boolean z11) {
        if (z11 != this.f105372M0) {
            this.f105372M0 = z11;
            this.f105363D0.m117780p(z11);
            this.f105363D0.m117781q(m111952t1(this.f105365F0));
            m111950h1();
        }
    }

    /* renamed from: F1 */
    public void m111958F1(int i11) {
        m111960H1(getContext().getText(i11), false);
    }

    /* renamed from: G1 */
    public void m111959G1(CharSequence charSequence) {
        m111960H1(charSequence, false);
    }

    /* renamed from: H1 */
    public void m111960H1(CharSequence charSequence, boolean z11) {
        if (Objects.equals(this.f105365F0, charSequence)) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        } else if (z11) {
            charSequence = charSequence.subSequence(0, charSequence.length());
        }
        this.f105365F0 = charSequence;
        InterfaceC22449b interfaceC22449b = this.f105383X0;
        if (interfaceC22449b != null && (charSequence instanceof Spannable)) {
            interfaceC22449b.mo116080a(this, (Spannable) charSequence);
        }
        this.f105363D0.m117781q(m111952t1(this.f105365F0));
        m111950h1();
    }

    /* renamed from: I1 */
    public void m111961I1(Layout.Alignment alignment) {
        if (alignment != this.f105369J0) {
            this.f105369J0 = alignment;
            this.f105363D0.m117773i(alignment);
            m111950h1();
        }
    }

    /* renamed from: J1 */
    public void m111962J1(int i11) {
        if (i11 != this.f105367H0) {
            this.f105367H0 = i11;
            this.f105368I0 = null;
            this.f105363D0.m117782r(i11);
            this.f105364E0 = null;
            invalidate();
        }
    }

    /* renamed from: K1 */
    public void m111963K1(ColorStateList colorStateList) {
        if (this.f105368I0 != colorStateList) {
            this.f105368I0 = colorStateList;
            if (colorStateList != null) {
                int colorForState = colorStateList.getColorForState(this.f84794x, -1979711488);
                this.f105367H0 = colorForState;
                this.f105363D0.m117782r(colorForState);
                this.f105364E0 = null;
                invalidate();
            }
        }
    }

    /* renamed from: L1 */
    public void mo111964L1(float f11) {
        if (f11 != this.f105366G0) {
            this.f105366G0 = f11;
            this.f105363D0.m117783s(f11);
            m111950h1();
        }
    }

    /* renamed from: M1 */
    public void mo111965M1(int i11) {
        if (i11 != this.f105375P0) {
            this.f105375P0 = i11;
            this.f105363D0.m117786v(i11);
            m111950h1();
        }
    }

    /* renamed from: N1 */
    public void mo111966N1(Typeface typeface) {
        if (this.f105374O0 != typeface) {
            this.f105374O0 = typeface;
            this.f105363D0.m117787w(typeface);
            m111950h1();
        }
    }

    /* renamed from: O1 */
    public void m111967O1(boolean z11) {
        if (this.f105376Q0 != z11) {
            this.f105376Q0 = z11;
            this.f105363D0.m117788x(z11);
            this.f105364E0 = null;
            invalidate();
        }
    }

    /* renamed from: P1 */
    public void m111968P1(boolean z11) {
        if (this.f105388c1 != z11) {
            this.f105388c1 = z11;
            this.f105363D0.m117765A(z11);
            m111950h1();
        }
    }

    /* renamed from: i1 */
    public Paint.FontMetrics m111969i1() {
        return this.f105363D0.m117768d();
    }

    /* renamed from: j1 */
    public float m111970j1() {
        return this.f105385Z0;
    }

    /* renamed from: k1 */
    public int m111971k1() {
        return this.f105371L0;
    }

    /* renamed from: l1 */
    public int m111972l1() {
        return this.f105370K0;
    }

    /* renamed from: m1 */
    public CharSequence m111973m1() {
        return this.f105365F0;
    }

    /* renamed from: n1 */
    public int m111974n1() {
        return this.f105367H0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        if (m89114P() > 0 && m89112O() > 0) {
            Layout layout = this.f105364E0;
            int i11 = this.f105367H0;
            int i12 = this.f105381V0;
            float f11 = this.f105378S0;
            float f12 = this.f105379T0;
            float f13 = this.f105380U0;
            int i13 = m89106L().f84716l;
            int i14 = m89106L().f84717m;
            canvas.save();
            canvas.translate(i13, i14);
            canvas.clipRect(0, 0, m89110N(), m89108M());
            if (layout != null) {
                if (layout.getPaint() != null) {
                    if (m89084A() != 1.0f) {
                        layout.getPaint().setColor((i11 & 16777215) | (((int) ((i11 >>> 24) * m89084A())) << 24));
                        if (i12 != 0) {
                            layout.getPaint().setShadowLayer(f11, f12, f13, (i12 & 16777215) | (((int) ((i12 >>> 24) * m89084A())) << 24));
                        }
                    } else {
                        layout.getPaint().setColor(i11);
                        if (i12 != 0) {
                            layout.getPaint().setShadowLayer(f11, f12, f13, i12);
                        }
                    }
                }
                try {
                    layout.draw(canvas);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            canvas.restore();
        }
    }

    /* renamed from: o1 */
    public Layout m111975o1() {
        return this.f105364E0;
    }

    /* renamed from: p1 */
    public int m111976p1() {
        return this.f105363D0.m117770f();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        C22990c c22990c = this.f105363D0;
        CharSequence charSequence = this.f105365F0;
        boolean z11 = this.f105389d1;
        if (i12 == 1073741824 && c22990c.m117767c() != null) {
            int m89016r = C16718f.m89016r(i11, m89106L().m89057j(), m89106L().m89053h());
            c22990c.m117789y(m89016r);
            c22990c.m117778n(m89016r);
        } else {
            int m89016r2 = C16718f.m89016r(i11, 0, m89106L().m89053h());
            c22990c.m117790z(0, 0);
            if (m89016r2 <= 0) {
                m89016r2 = m89106L().m89053h();
            }
            c22990c.m117778n(m89016r2);
        }
        Layout m117766a = c22990c.m117766a();
        int width = m117766a.getWidth();
        int height = m117766a.getHeight();
        if (m117766a.getLineCount() < m111972l1()) {
            height += (m111972l1() - m117766a.getLineCount()) * c22990c.m117770f();
        }
        if (m117766a.getLineCount() > m111971k1()) {
            height = m117766a.getLineTop(m111971k1());
        }
        if (z11 && TextUtils.isEmpty(charSequence)) {
            m89097G0(0, 0);
        } else {
            m89097G0(width, height);
        }
        this.f105364E0 = m117766a;
    }

    /* renamed from: q1 */
    public float m111977q1() {
        return this.f105366G0;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105364E0 == null) {
            this.f105364E0 = this.f105363D0.m117766a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r0 */
    public boolean mo89008r0() {
        return true;
    }

    /* renamed from: r1 */
    public Typeface m111978r1() {
        return this.f105374O0;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        int colorForState;
        super.mo89151s0(i11, iArr, i12, iArr2);
        ColorStateList colorStateList = this.f105368I0;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr2, this.f105367H0)) != this.f105367H0) {
            this.f105367H0 = colorForState;
            this.f105363D0.m117782r(colorForState);
            this.f105364E0 = null;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        boolean z11;
        if (!m89143j0()) {
            return false;
        }
        InterfaceC22449b interfaceC22449b = this.f105383X0;
        CharSequence charSequence = this.f105365F0;
        if (interfaceC22449b != null && (charSequence instanceof Spanned)) {
            z11 = interfaceC22449b.mo56523b(this, (Spanned) charSequence, motionEvent);
            if (z11 && motionEvent.getAction() == 1) {
                super.mo65871t0(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return true;
            }
        } else {
            z11 = false;
        }
        if (!super.mo65871t0(motionEvent) && !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: u1 */
    public void m111979u1(boolean z11) {
        if (this.f105377R0 != z11) {
            this.f105377R0 = z11;
            if (!TextUtils.isEmpty(this.f105365F0)) {
                this.f105363D0.m117781q(m111952t1(this.f105365F0));
                m111950h1();
            }
        }
    }

    /* renamed from: v1 */
    public void m111980v1(TextUtils.TruncateAt truncateAt) {
        if (this.f105373N0 != truncateAt) {
            this.f105373N0 = truncateAt;
            this.f105363D0.m117774j(truncateAt);
            this.f105364E0 = null;
            invalidate();
        }
    }

    /* renamed from: w1 */
    public void m111981w1(boolean z11) {
        this.f105389d1 = z11;
    }

    /* renamed from: x1 */
    public void m111982x1(boolean z11) {
        if (this.f105382W0 != z11) {
            this.f105382W0 = z11;
            this.f105363D0.m117775k(z11);
            m111950h1();
        }
    }

    /* renamed from: y1 */
    public void m111983y1(float f11) {
        if (this.f105386a1 != f11) {
            this.f105386a1 = f11;
            this.f105363D0.m117776l(f11);
            m111950h1();
        }
    }

    /* renamed from: z1 */
    public void m111984z1(float f11, float f12) {
        if (this.f105385Z0 != f11 || this.f105384Y0 != f12) {
            this.f105385Z0 = f11;
            this.f105384Y0 = f12;
            this.f105363D0.m117784t(f11);
            this.f105363D0.m117785u(this.f105384Y0);
            m111950h1();
        }
    }
}
