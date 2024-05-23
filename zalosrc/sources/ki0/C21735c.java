package ki0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2810d;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: ki0.c */
/* loaded from: classes7.dex */
public final class C21735c extends C16719g {
    public static final a Companion = new a(null);

    /* renamed from: D0 */
    private b f105545D0;

    /* renamed from: E0 */
    private Drawable f105546E0;

    /* renamed from: F0 */
    private boolean f105547F0;

    /* renamed from: G0 */
    private boolean f105548G0;

    /* renamed from: H0 */
    private long f105549H0;

    /* renamed from: I0 */
    private AnimatedVectorDrawable f105550I0;

    /* renamed from: J0 */
    private AnimatedVectorDrawable f105551J0;

    /* renamed from: ki0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ki0.c$b */
    /* loaded from: classes7.dex */
    public enum b {
        MEDIUM,
        SMALL
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21735c(Context context, b bVar) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(bVar, "size");
        this.f105545D0 = b.MEDIUM;
        this.f105547F0 = true;
        m112174h1(bVar);
    }

    /* renamed from: g1 */
    private final void m112173g1(Drawable drawable) {
        int m104529e;
        int m104529e2;
        if (drawable != null && m89110N() > 0 && m89108M() > 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int m89110N = m89110N();
            int m89108M = m89108M();
            if (intrinsicWidth != 0 && intrinsicHeight != 0) {
                float f11 = m89110N;
                float f12 = intrinsicWidth;
                float f13 = m89108M;
                float f14 = intrinsicHeight;
                float min = Math.min(f11 / f12, f13 / f14);
                float f15 = f12 * min;
                m104529e = AbstractC20104d.m104529e((f11 - f15) * 0.5f);
                float f16 = f14 * min;
                m104529e2 = AbstractC20104d.m104529e((f13 - f16) * 0.5f);
                drawable.setBounds(m104529e, m104529e2, ((int) f15) + m104529e, ((int) f16) + m104529e2);
                return;
            }
            drawable.setBounds(0, 0, m89110N, m89108M);
        }
    }

    /* renamed from: h1 */
    private final void m112174h1(b bVar) {
        Drawable m139658a;
        if (bVar == b.SMALL) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int m139649b = C27276c.m139649b(context, 16);
            m89106L().m89028L(m139649b, m139649b);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            m139658a = C27280g.m139658a(context2, AbstractC2810d.radio_button_small);
        } else {
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            int m139649b2 = C27276c.m139649b(context3, 24);
            m89106L().m89028L(m139649b2, m139649b2);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            m139658a = C27280g.m139658a(context4, AbstractC2810d.radio_button_medium);
        }
        this.f105546E0 = m139658a;
        this.f105545D0 = bVar;
    }

    /* renamed from: j1 */
    private final void m112175j1() {
        Drawable m6964f;
        if (this.f105550I0 == null) {
            if (this.f105545D0 == b.SMALL) {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.rb_small_checked_anim);
            } else {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.rb_medium_checked_anim);
            }
            if (m6964f != null && (m6964f instanceof AnimatedVectorDrawable)) {
                this.f105550I0 = (AnimatedVectorDrawable) m6964f;
            } else {
                return;
            }
        }
        AnimatedVectorDrawable animatedVectorDrawable = this.f105550I0;
        AbstractC19074t.m100205c(animatedVectorDrawable);
        animatedVectorDrawable.setBounds(this.f84743C, this.f84744D, this.f84745E, this.f84746F);
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f105550I0;
        if (animatedVectorDrawable2 != null) {
            AbstractC19074t.m100205c(animatedVectorDrawable2);
            if (!animatedVectorDrawable2.isRunning()) {
                AnimatedVectorDrawable animatedVectorDrawable3 = this.f105550I0;
                AbstractC19074t.m100205c(animatedVectorDrawable3);
                animatedVectorDrawable3.start();
            }
        }
    }

    /* renamed from: k1 */
    private final void m112176k1() {
        Drawable m6964f;
        if (this.f105551J0 == null) {
            if (this.f105545D0 == b.SMALL) {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.rb_small_unchecked_anim);
            } else {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.rb_medium_unchecked_anim);
            }
            if (m6964f != null && (m6964f instanceof AnimatedVectorDrawable)) {
                this.f105551J0 = (AnimatedVectorDrawable) m6964f;
            } else {
                return;
            }
        }
        AnimatedVectorDrawable animatedVectorDrawable = this.f105551J0;
        AbstractC19074t.m100205c(animatedVectorDrawable);
        animatedVectorDrawable.setBounds(this.f84743C, this.f84744D, this.f84745E, this.f84746F);
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f105551J0;
        if (animatedVectorDrawable2 != null) {
            AbstractC19074t.m100205c(animatedVectorDrawable2);
            if (!animatedVectorDrawable2.isRunning()) {
                AnimatedVectorDrawable animatedVectorDrawable3 = this.f105551J0;
                AbstractC19074t.m100205c(animatedVectorDrawable3);
                animatedVectorDrawable3.start();
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: D0 */
    public void mo89091D0(boolean z11) {
        if (m89141i0() == z11) {
            return;
        }
        m112177i1(z11, this.f105547F0);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: H0 */
    public void mo89099H0(boolean z11) {
        super.mo89099H0(z11);
        if (this.f105546E0 == null) {
            return;
        }
        invalidate();
    }

    /* renamed from: i1 */
    public final void m112177i1(boolean z11, boolean z12) {
        long j11;
        if (m89141i0() == z11) {
            return;
        }
        super.mo89091D0(z11);
        this.f105547F0 = z12;
        if (z12) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f105549H0 = j11;
        invalidate();
        this.f105547F0 = true;
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
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        Drawable drawable = this.f105546E0;
        if (drawable instanceof StateListDrawable) {
            AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            ((StateListDrawable) drawable).setState(this.f84794x);
            Drawable drawable2 = this.f105546E0;
            AbstractC19074t.m100206d(drawable2, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
            drawable = ((StateListDrawable) drawable2).getCurrent();
        }
        if (m89141i0()) {
            if (this.f105547F0) {
                if (this.f105549H0 > 0 && System.currentTimeMillis() - this.f105549H0 < 160) {
                    m112175j1();
                    AnimatedVectorDrawable animatedVectorDrawable = this.f105550I0;
                    if (animatedVectorDrawable != null) {
                        animatedVectorDrawable.draw(canvas);
                    }
                    invalidate();
                    return;
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                    return;
                }
                return;
            }
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.f105547F0) {
            if (this.f105549H0 > 0 && System.currentTimeMillis() - this.f105549H0 < 160) {
                m112176k1();
                AnimatedVectorDrawable animatedVectorDrawable2 = this.f105551J0;
                if (animatedVectorDrawable2 != null) {
                    animatedVectorDrawable2.draw(canvas);
                }
                invalidate();
                return;
            }
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        boolean z11;
        int m89110N = m89110N();
        int m89108M = m89108M();
        super.mo44180q0(i11, i12, i13, i14);
        if (this.f105548G0 && m89110N == m89110N() && m89108M == m89108M()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f105548G0 = z11;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105548G0) {
            return;
        }
        this.f105548G0 = true;
        m112173g1(this.f105546E0);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        super.mo89151s0(i11, iArr, i12, iArr2);
        if (((i11 ^ i12) & 256) != 0) {
            invalidate();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: u0 */
    public void mo89153u0() {
        if (!m89141i0()) {
            m112177i1(true, this.f105547F0);
        }
        super.mo89153u0();
    }
}
