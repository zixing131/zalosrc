package p033b7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.AbstractC1409d;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.C6352s;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.AbstractC24041a;
import p439q6.AbstractC25136a;
import p599w6.AbstractC28774c;
import p599w6.C28775d;
import p706z6.C31687f;
import p706z6.C31688g;
import p706z6.C31689h;
import p706z6.C31691j;

/* renamed from: b7.a */
/* loaded from: classes3.dex */
public class C2646a extends C31689h implements C6352s.b {

    /* renamed from: d0 */
    private static final int f10616d0 = AbstractC23586k.Widget_MaterialComponents_Tooltip;

    /* renamed from: e0 */
    private static final int f10617e0 = AbstractC23577b.tooltipStyle;

    /* renamed from: M */
    private CharSequence f10618M;

    /* renamed from: N */
    private final Context f10619N;

    /* renamed from: O */
    private final Paint.FontMetrics f10620O;

    /* renamed from: P */
    private final C6352s f10621P;

    /* renamed from: Q */
    private final View.OnLayoutChangeListener f10622Q;

    /* renamed from: R */
    private final Rect f10623R;

    /* renamed from: S */
    private int f10624S;

    /* renamed from: T */
    private int f10625T;

    /* renamed from: U */
    private int f10626U;

    /* renamed from: V */
    private int f10627V;

    /* renamed from: W */
    private int f10628W;

    /* renamed from: X */
    private int f10629X;

    /* renamed from: Y */
    private float f10630Y;

    /* renamed from: Z */
    private float f10631Z;

    /* renamed from: a0 */
    private final float f10632a0;

    /* renamed from: b0 */
    private float f10633b0;

    /* renamed from: c0 */
    private float f10634c0;

    /* renamed from: b7.a$a */
    /* loaded from: classes3.dex */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            C2646a.this.m13061F0(view);
        }
    }

    private C2646a(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f10620O = new Paint.FontMetrics();
        C6352s c6352s = new C6352s(this);
        this.f10621P = c6352s;
        this.f10622Q = new a();
        this.f10623R = new Rect();
        this.f10630Y = 1.0f;
        this.f10631Z = 1.0f;
        this.f10632a0 = 0.5f;
        this.f10633b0 = 0.5f;
        this.f10634c0 = 1.0f;
        this.f10619N = context;
        c6352s.m32625e().density = context.getResources().getDisplayMetrics().density;
        c6352s.m32625e().setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: A0 */
    private void m13060A0(AttributeSet attributeSet, int i11, int i12) {
        TypedArray m32639h = AbstractC6355v.m32639h(this.f10619N, attributeSet, AbstractC23587l.Tooltip, i11, i12, new int[0]);
        this.f10628W = this.f10619N.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(m152427F().m152492v().m152524s(m13067w0()).m152519m());
        m13072D0(m32639h.getText(AbstractC23587l.Tooltip_android_text));
        m13073E0(AbstractC28774c.m143978f(this.f10619N, m32639h, AbstractC23587l.Tooltip_android_textAppearance));
        m152442c0(ColorStateList.valueOf(m32639h.getColor(AbstractC23587l.Tooltip_backgroundTint, AbstractC25136a.m130296f(AbstractC1409d.m7147p(AbstractC25136a.m130293c(this.f10619N, R.attr.colorBackground, C2646a.class.getCanonicalName()), 229), AbstractC1409d.m7147p(AbstractC25136a.m130293c(this.f10619N, AbstractC23577b.colorOnBackground, C2646a.class.getCanonicalName()), 153)))));
        m152454m0(ColorStateList.valueOf(AbstractC25136a.m130293c(this.f10619N, AbstractC23577b.colorSurface, C2646a.class.getCanonicalName())));
        this.f10624S = m32639h.getDimensionPixelSize(AbstractC23587l.Tooltip_android_padding, 0);
        this.f10625T = m32639h.getDimensionPixelSize(AbstractC23587l.Tooltip_android_minWidth, 0);
        this.f10626U = m32639h.getDimensionPixelSize(AbstractC23587l.Tooltip_android_minHeight, 0);
        this.f10627V = m32639h.getDimensionPixelSize(AbstractC23587l.Tooltip_android_layout_margin, 0);
        m32639h.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m13061F0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f10629X = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f10623R);
    }

    /* renamed from: s0 */
    private float m13063s0() {
        int i11;
        if (((this.f10623R.right - getBounds().right) - this.f10629X) - this.f10627V < 0) {
            i11 = ((this.f10623R.right - getBounds().right) - this.f10629X) - this.f10627V;
        } else if (((this.f10623R.left - getBounds().left) - this.f10629X) + this.f10627V > 0) {
            i11 = ((this.f10623R.left - getBounds().left) - this.f10629X) + this.f10627V;
        } else {
            return 0.0f;
        }
        return i11;
    }

    /* renamed from: t0 */
    private float m13064t0() {
        this.f10621P.m32625e().getFontMetrics(this.f10620O);
        Paint.FontMetrics fontMetrics = this.f10620O;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: u0 */
    private float m13065u0(Rect rect) {
        return rect.centerY() - m13064t0();
    }

    /* renamed from: v0 */
    public static C2646a m13066v0(Context context, AttributeSet attributeSet, int i11, int i12) {
        C2646a c2646a = new C2646a(context, attributeSet, i11, i12);
        c2646a.m13060A0(attributeSet, i11, i12);
        return c2646a;
    }

    /* renamed from: w0 */
    private C31687f m13067w0() {
        float f11 = -m13063s0();
        float width = ((float) (getBounds().width() - (this.f10628W * Math.sqrt(2.0d)))) / 2.0f;
        return new C31691j(new C31688g(this.f10628W), Math.min(Math.max(f11, -width), width));
    }

    /* renamed from: y0 */
    private void m13068y0(Canvas canvas) {
        if (this.f10618M == null) {
            return;
        }
        int m13065u0 = (int) m13065u0(getBounds());
        if (this.f10621P.m32624d() != null) {
            this.f10621P.m32625e().drawableState = getState();
            this.f10621P.m32630j(this.f10619N);
            this.f10621P.m32625e().setAlpha((int) (this.f10634c0 * 255.0f));
        }
        CharSequence charSequence = this.f10618M;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), m13065u0, this.f10621P.m32625e());
    }

    /* renamed from: z0 */
    private float m13069z0() {
        CharSequence charSequence = this.f10618M;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f10621P.m32626f(charSequence.toString());
    }

    /* renamed from: B0 */
    public void m13070B0(View view) {
        if (view == null) {
            return;
        }
        m13061F0(view);
        view.addOnLayoutChangeListener(this.f10622Q);
    }

    /* renamed from: C0 */
    public void m13071C0(float f11) {
        this.f10633b0 = 1.2f;
        this.f10630Y = f11;
        this.f10631Z = f11;
        this.f10634c0 = AbstractC24041a.m125911b(0.0f, 1.0f, 0.19f, 1.0f, f11);
        invalidateSelf();
    }

    /* renamed from: D0 */
    public void m13072D0(CharSequence charSequence) {
        if (!TextUtils.equals(this.f10618M, charSequence)) {
            this.f10618M = charSequence;
            this.f10621P.m32629i(true);
            invalidateSelf();
        }
    }

    /* renamed from: E0 */
    public void m13073E0(C28775d c28775d) {
        this.f10621P.m32628h(c28775d, this.f10619N);
    }

    @Override // com.google.android.material.internal.C6352s.b
    /* renamed from: a */
    public void mo13074a() {
        invalidateSelf();
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float m13063s0 = m13063s0();
        float f11 = (float) (-((this.f10628W * Math.sqrt(2.0d)) - this.f10628W));
        canvas.scale(this.f10630Y, this.f10631Z, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.f10633b0));
        canvas.translate(m13063s0, f11);
        super.draw(canvas);
        m13068y0(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.f10621P.m32625e().getTextSize(), this.f10626U);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.f10624S * 2) + m13069z0(), this.f10625T);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p706z6.C31689h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(m152427F().m152492v().m152524s(m13067w0()).m152519m());
    }

    @Override // p706z6.C31689h, android.graphics.drawable.Drawable, com.google.android.material.internal.C6352s.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: x0 */
    public void m13075x0(View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.f10622Q);
    }
}
