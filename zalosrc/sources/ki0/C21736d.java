package ki0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p667y2.C30268e;
import ui0.C27276c;

/* renamed from: ki0.d */
/* loaded from: classes7.dex */
public final class C21736d extends C16719g {
    public static final a Companion = new a(null);

    /* renamed from: D0 */
    private EnumC21741i f105555D0;

    /* renamed from: E0 */
    private int f105556E0;

    /* renamed from: F0 */
    private float f105557F0;

    /* renamed from: G0 */
    private RectF f105558G0;

    /* renamed from: H0 */
    private Paint f105559H0;

    /* renamed from: I0 */
    private Paint f105560I0;

    /* renamed from: J0 */
    private Drawable f105561J0;

    /* renamed from: K0 */
    private Drawable f105562K0;

    /* renamed from: L0 */
    private float f105563L0;

    /* renamed from: M0 */
    private float f105564M0;

    /* renamed from: N0 */
    private final int f105565N0;

    /* renamed from: O0 */
    private boolean f105566O0;

    /* renamed from: P0 */
    private long f105567P0;

    /* renamed from: Q0 */
    private float f105568Q0;

    /* renamed from: R0 */
    private float f105569R0;

    /* renamed from: S0 */
    private float f105570S0;

    /* renamed from: ki0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21736d(Context context, EnumC21741i enumC21741i) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC21741i, "size");
        this.f105555D0 = EnumC21741i.MEDIUM;
        this.f105565N0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        m112181i1(enumC21741i);
    }

    /* renamed from: g1 */
    private final float m112179g1() {
        return this.f105568Q0;
    }

    /* renamed from: h1 */
    private final boolean m112180h1() {
        if (m112179g1() > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: i1 */
    private final void m112181i1(EnumC21741i enumC21741i) {
        this.f105555D0 = enumC21741i;
        this.f105558G0 = new RectF();
        Paint paint = new Paint(1);
        this.f105559H0 = paint;
        AbstractC19074t.m100205c(paint);
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        paint.setColor(aVar.m13592a(context, AbstractC2807a.switch_on_track));
        Paint paint2 = new Paint(1);
        this.f105560I0 = paint2;
        AbstractC19074t.m100205c(paint2);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        paint2.setColor(aVar.m13592a(context2, AbstractC2807a.switch_off_track));
        if (m89141i0()) {
            this.f105568Q0 = 1.0f;
            this.f105569R0 = 1.0f;
        } else {
            this.f105568Q0 = 0.0f;
            this.f105569R0 = 0.0f;
        }
    }

    /* renamed from: k1 */
    private final void m112182k1(float f11) {
        if (f11 > 1.0f) {
            f11 = 1.0f;
        } else if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (this.f105568Q0 == f11) {
            return;
        }
        this.f105568Q0 = f11;
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: D0 */
    public void mo89091D0(boolean z11) {
        if (m89141i0() == z11) {
            return;
        }
        m112183j1(z11, true);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: H0 */
    public void mo89099H0(boolean z11) {
        super.mo89099H0(z11);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (z11) {
            this.f105561J0 = AbstractC1388a.m6964f(context, AbstractC2810d.toggle_thumb_on);
            this.f105562K0 = AbstractC1388a.m6964f(context, AbstractC2810d.toggle_thumb_off);
            Paint paint = this.f105559H0;
            if (paint != null && this.f105560I0 != null) {
                AbstractC19074t.m100205c(paint);
                AbstractC2816j.a aVar = AbstractC2816j.Companion;
                paint.setColor(aVar.m13592a(context, AbstractC2807a.switch_on_track));
                Paint paint2 = this.f105560I0;
                AbstractC19074t.m100205c(paint2);
                paint2.setColor(aVar.m13592a(context, AbstractC2807a.switch_off_track));
            }
            invalidate();
            return;
        }
        this.f105561J0 = AbstractC1388a.m6964f(context, AbstractC2810d.toggle_thumb_on_disable);
        this.f105562K0 = AbstractC1388a.m6964f(context, AbstractC2810d.toggle_thumb_off_disable);
        Paint paint3 = this.f105559H0;
        if (paint3 != null && this.f105560I0 != null) {
            AbstractC19074t.m100205c(paint3);
            AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
            paint3.setColor(aVar2.m13592a(context, AbstractC2807a.switch_on_disabled_track));
            Paint paint4 = this.f105560I0;
            AbstractC19074t.m100205c(paint4);
            paint4.setColor(aVar2.m13592a(context, AbstractC2807a.switch_off_disabled_track));
        }
        invalidate();
    }

    /* renamed from: j1 */
    public final void m112183j1(boolean z11, boolean z12) {
        float f11;
        long j11;
        if (m89141i0() == z11) {
            return;
        }
        super.mo89091D0(z11);
        this.f105569R0 = this.f105568Q0;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        m112182k1(f11);
        if (z12 && this.f105569R0 != this.f105568Q0) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f105567P0 = j11;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: n */
    public boolean mo89149n() {
        if (!super.mo89149n() && (!this.f84777k0 || !m89143j0())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
        Paint paint;
        Drawable drawable;
        float f11;
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        int i11 = m89106L().f84716l;
        int i12 = m89106L().f84717m;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            canvas.save();
            canvas.translate(i11, i12);
            z11 = true;
        }
        boolean m89141i0 = m89141i0();
        if (this.f105567P0 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f105567P0;
            if (m89141i0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (currentTimeMillis < 100) {
                float f12 = this.f105569R0;
                this.f105568Q0 = f12 + ((((float) currentTimeMillis) / 100.0f) * (f11 - f12));
                invalidate();
            } else {
                this.f105568Q0 = f11;
                this.f105567P0 = 0L;
            }
        }
        if (m112180h1()) {
            paint = this.f105559H0;
        } else {
            paint = this.f105560I0;
        }
        AbstractC19074t.m100205c(paint);
        RectF rectF = this.f105558G0;
        AbstractC19074t.m100205c(rectF);
        float f13 = this.f105557F0;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        int i13 = (int) (this.f105568Q0 * this.f105570S0);
        if (m89141i0) {
            drawable = this.f105561J0;
        } else {
            drawable = this.f105562K0;
        }
        if (drawable != null) {
            float f14 = i13;
            float f15 = this.f105563L0;
            int i14 = this.f105556E0;
            drawable.setBounds((int) (f14 + f15), (int) f15, ((int) (f14 + f15)) + i14, ((int) f15) + i14);
            drawable.draw(canvas);
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int m139649b;
        int m139649b2;
        if (this.f105555D0 == EnumC21741i.SMALL) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            m139649b = C27276c.m139649b(context, 28);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m139649b2 = C27276c.m139649b(context2, 16);
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            this.f105556E0 = C27276c.m139649b(context3, 12);
        } else {
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            m139649b = C27276c.m139649b(context4, 40);
            Context context5 = getContext();
            AbstractC19074t.m100207e(context5, "context");
            m139649b2 = C27276c.m139649b(context5, 24);
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "context");
            this.f105556E0 = C27276c.m139649b(context6, 20);
        }
        AbstractC19074t.m100207e(getContext(), "context");
        this.f105563L0 = C27276c.m139649b(r7, 2);
        RectF rectF = this.f105558G0;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, m139649b, m139649b2);
        }
        RectF rectF2 = this.f105558G0;
        AbstractC19074t.m100205c(rectF2);
        float f11 = 2;
        this.f105557F0 = rectF2.height() / f11;
        this.f105570S0 = (m139649b - this.f105556E0) - (this.f105563L0 * f11);
        m89097G0(m139649b, m139649b2);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105561J0 == null) {
            this.f105561J0 = AbstractC1388a.m6964f(getContext(), AbstractC2810d.btn_switchknob_on);
        }
        if (this.f105562K0 == null) {
            this.f105562K0 = AbstractC1388a.m6964f(getContext(), AbstractC2810d.btn_switchknob_off);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        super.mo89151s0(i11, iArr, i12, iArr2);
        if (((i11 ^ i12) & 256) != 0) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:            if (r0 != 3) goto L48;     */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo65871t0(MotionEvent motionEvent) {
        boolean m89141i0;
        float f11;
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        super.mo65871t0(motionEvent);
        if (!mo89149n()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = motionEvent.getX();
                    if (!this.f105566O0 && Math.abs(x11 - this.f105564M0) >= this.f105565N0) {
                        this.f105566O0 = true;
                        this.f105564M0 = x11;
                    }
                    if (!this.f105566O0) {
                        return true;
                    }
                    float m112179g1 = m112179g1();
                    float f12 = this.f105570S0;
                    if (f12 > 0.0f) {
                        f11 = (x11 - this.f105564M0) / f12;
                    } else {
                        f11 = 0.0f;
                    }
                    m112182k1(m112179g1 + f11);
                    if (m112179g1() > 0.0f && m112179g1() < 1.0f) {
                        this.f105564M0 = x11;
                    }
                }
            }
            if (m89119T() != null && m89119T().getParent() != null) {
                m89119T().getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f105566O0) {
                return true;
            }
            this.f105566O0 = false;
            if (motionEvent.getAction() == 1) {
                m89141i0 = m112180h1();
            } else {
                m89141i0 = m89141i0();
            }
            m112183j1(m89141i0, true);
        } else {
            this.f105564M0 = motionEvent.getX();
            this.f105566O0 = false;
            if (m89119T() != null && m89119T().getParent() != null) {
                m89119T().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: u0 */
    public void mo89153u0() {
        if (!this.f105566O0) {
            m112183j1(!m89141i0(), true);
        }
        super.mo89153u0();
    }
}
