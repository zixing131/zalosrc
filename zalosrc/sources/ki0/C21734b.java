package ki0;

import ac.C0708i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C17067v;
import com.zing.zalo.zdesign.component.EnumC17065u;
import com.zing.zalo.zdesign.component.EnumC17069w;
import com.zing.zalo.zdesign.component.EnumC17071x;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.lang.ref.WeakReference;
import ri0.C25807a;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: ki0.b */
/* loaded from: classes7.dex */
public final class C21734b extends C16719g implements InterfaceC16976f1 {
    public static final a Companion = new a(null);

    /* renamed from: D0 */
    private EnumC17071x f105532D0;

    /* renamed from: E0 */
    private Drawable f105533E0;

    /* renamed from: F0 */
    private Drawable f105534F0;

    /* renamed from: G0 */
    private boolean f105535G0;

    /* renamed from: H0 */
    private boolean f105536H0;

    /* renamed from: I0 */
    private long f105537I0;

    /* renamed from: J0 */
    private AnimatedVectorDrawable f105538J0;

    /* renamed from: K0 */
    private AnimatedVectorDrawable f105539K0;

    /* renamed from: L0 */
    private C25807a f105540L0;

    /* renamed from: M0 */
    private EnumC17065u f105541M0;

    /* renamed from: N0 */
    private EnumC17069w f105542N0;

    /* renamed from: O0 */
    private Paint f105543O0;

    /* renamed from: P0 */
    private C17067v.b f105544P0;

    /* renamed from: ki0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21734b(Context context, EnumC17071x enumC17071x) {
        this(context, enumC17071x, EnumC17069w.CONTAINER);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC17071x, "size");
    }

    /* renamed from: g1 */
    private final void m112163g1(Canvas canvas, Drawable drawable) {
        if (m89141i0()) {
            if (this.f105535G0) {
                if (this.f105537I0 > 0 && System.currentTimeMillis() - this.f105537I0 < 250) {
                    m112167o1();
                    AnimatedVectorDrawable animatedVectorDrawable = this.f105538J0;
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
        if (this.f105535G0) {
            if (this.f105537I0 > 0 && System.currentTimeMillis() - this.f105537I0 < 250) {
                m112168p1();
                AnimatedVectorDrawable animatedVectorDrawable2 = this.f105539K0;
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

    /* renamed from: h1 */
    private final void m112164h1(Drawable drawable) {
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

    /* renamed from: i1 */
    private final void m112165i1(Canvas canvas) {
        float f11 = 2;
        float m89114P = m89114P() / f11;
        float m89112O = m89112O() / f11;
        float m89114P2 = m89114P() / f11;
        Paint paint = this.f105543O0;
        if (paint == null) {
            AbstractC19074t.m100223u("paint");
            paint = null;
        }
        canvas.drawCircle(m89114P, m89112O, m89114P2, paint);
    }

    /* renamed from: j1 */
    private final void m112166j1(EnumC17071x enumC17071x, EnumC17069w enumC17069w) {
        float f11;
        EnumC17071x enumC17071x2 = EnumC17071x.SMALL;
        if (enumC17071x == enumC17071x2) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int m139649b = C27276c.m139649b(context, 16);
            m89106L().m89028L(m139649b, m139649b);
            if (enumC17069w == EnumC17069w.IMAGE) {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                this.f105533E0 = C27280g.m139658a(context2, AbstractC2810d.check_circle_size_small_image);
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "context");
                this.f105534F0 = C27280g.m139658a(context3, AbstractC2810d.check_circle_size_small_image_number);
            } else {
                Context context4 = getContext();
                AbstractC19074t.m100207e(context4, "context");
                this.f105533E0 = C27280g.m139658a(context4, AbstractC2810d.check_circle_size_small);
                Context context5 = getContext();
                AbstractC19074t.m100207e(context5, "context");
                this.f105534F0 = C27280g.m139658a(context5, AbstractC2810d.check_circle_size_small_number);
            }
        } else {
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "context");
            int m139649b2 = C27276c.m139649b(context6, 24);
            m89106L().m89028L(m139649b2, m139649b2);
            if (enumC17069w == EnumC17069w.IMAGE) {
                Context context7 = getContext();
                AbstractC19074t.m100207e(context7, "context");
                this.f105533E0 = C27280g.m139658a(context7, AbstractC2810d.check_circle_size_medium_image);
                Context context8 = getContext();
                AbstractC19074t.m100207e(context8, "context");
                this.f105534F0 = C27280g.m139658a(context8, AbstractC2810d.check_circle_size_medium_image_number);
            } else {
                Context context9 = getContext();
                AbstractC19074t.m100207e(context9, "context");
                this.f105533E0 = C27280g.m139658a(context9, AbstractC2810d.check_circle_size_medium);
                Context context10 = getContext();
                AbstractC19074t.m100207e(context10, "context");
                this.f105534F0 = C27280g.m139658a(context10, AbstractC2810d.check_circle_size_medium_number);
            }
        }
        this.f105532D0 = enumC17071x;
        this.f105542N0 = enumC17069w;
        Paint paint = new Paint(1);
        this.f105543O0 = paint;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context11 = getContext();
        AbstractC19074t.m100207e(context11, "context");
        paint.setColor(aVar.m13592a(context11, AbstractC2807a.checkcircle_border_image));
        Paint paint2 = this.f105543O0;
        Paint paint3 = null;
        if (paint2 == null) {
            AbstractC19074t.m100223u("paint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.f105543O0;
        if (paint4 == null) {
            AbstractC19074t.m100223u("paint");
        } else {
            paint3 = paint4;
        }
        AbstractC19074t.m100207e(getContext(), "context");
        if (enumC17071x == enumC17071x2) {
            f11 = 1.5f;
        } else {
            f11 = 2.0f;
        }
        paint3.setStrokeWidth(C27276c.m139648a(r7, f11));
    }

    /* renamed from: o1 */
    private final void m112167o1() {
        Drawable m6964f;
        if (this.f105538J0 == null) {
            if (this.f105532D0 == EnumC17071x.SMALL) {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.cc_small_checked_anim);
            } else {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.cc_medium_checked_anim);
            }
            if (m6964f != null && (m6964f instanceof AnimatedVectorDrawable)) {
                this.f105538J0 = (AnimatedVectorDrawable) m6964f;
            } else {
                return;
            }
        }
        AnimatedVectorDrawable animatedVectorDrawable = this.f105538J0;
        AbstractC19074t.m100205c(animatedVectorDrawable);
        animatedVectorDrawable.setBounds(this.f84743C, this.f84744D, this.f84745E, this.f84746F);
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f105538J0;
        if (animatedVectorDrawable2 != null) {
            AbstractC19074t.m100205c(animatedVectorDrawable2);
            if (!animatedVectorDrawable2.isRunning()) {
                AnimatedVectorDrawable animatedVectorDrawable3 = this.f105538J0;
                AbstractC19074t.m100205c(animatedVectorDrawable3);
                animatedVectorDrawable3.start();
            }
        }
    }

    /* renamed from: p1 */
    private final void m112168p1() {
        Drawable m6964f;
        if (this.f105539K0 == null) {
            if (this.f105532D0 == EnumC17071x.SMALL) {
                if (this.f105542N0 == EnumC17069w.IMAGE) {
                    m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.cc_small_unchecked_anim_image);
                } else {
                    m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.cc_small_unchecked_anim);
                }
            } else if (this.f105542N0 == EnumC17069w.IMAGE) {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.cc_medium_unchecked_anim_image);
            } else {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC2810d.cc_medium_unchecked_anim);
            }
            if (m6964f != null && (m6964f instanceof AnimatedVectorDrawable)) {
                this.f105539K0 = (AnimatedVectorDrawable) m6964f;
            } else {
                return;
            }
        }
        AnimatedVectorDrawable animatedVectorDrawable = this.f105539K0;
        AbstractC19074t.m100205c(animatedVectorDrawable);
        animatedVectorDrawable.setBounds(this.f84743C, this.f84744D, this.f84745E, this.f84746F);
        AnimatedVectorDrawable animatedVectorDrawable2 = this.f105539K0;
        if (animatedVectorDrawable2 != null) {
            AbstractC19074t.m100205c(animatedVectorDrawable2);
            if (!animatedVectorDrawable2.isRunning()) {
                AnimatedVectorDrawable animatedVectorDrawable3 = this.f105539K0;
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
        m112170l1(z11, this.f105535G0);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: H0 */
    public void mo89099H0(boolean z11) {
        super.mo89099H0(z11);
        if (this.f105533E0 == null && this.f105534F0 == null) {
            return;
        }
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f105540L0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    /* renamed from: k1 */
    public final void m112169k1(EnumC17065u enumC17065u) {
        AbstractC19074t.m100208f(enumC17065u, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f105541M0 = enumC17065u;
    }

    /* renamed from: l1 */
    public final void m112170l1(boolean z11, boolean z12) {
        long j11;
        if (m89141i0() == z11) {
            return;
        }
        super.mo89091D0(z11);
        this.f105535G0 = z12;
        if (z12) {
            j11 = System.currentTimeMillis();
        } else {
            j11 = 0;
        }
        this.f105537I0 = j11;
        invalidate();
        this.f105535G0 = true;
    }

    /* renamed from: m1 */
    public final void m112171m1(C17067v.b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        this.f105544P0 = bVar;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: n */
    public boolean mo89149n() {
        if (!super.mo89149n() && (!this.f84777k0 || !m89143j0())) {
            return false;
        }
        return true;
    }

    /* renamed from: n1 */
    public final void m112172n1(EnumC17069w enumC17069w) {
        AbstractC19074t.m100208f(enumC17069w, "placement");
        this.f105542N0 = enumC17069w;
        if (this.f105532D0 == EnumC17071x.SMALL) {
            if (enumC17069w == EnumC17069w.IMAGE) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                this.f105533E0 = C27280g.m139658a(context, AbstractC2810d.check_circle_size_small_image);
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                this.f105534F0 = C27280g.m139658a(context2, AbstractC2810d.check_circle_size_small_image_number);
                return;
            }
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            this.f105533E0 = C27280g.m139658a(context3, AbstractC2810d.check_circle_size_small);
            Context context4 = getContext();
            AbstractC19074t.m100207e(context4, "context");
            this.f105534F0 = C27280g.m139658a(context4, AbstractC2810d.check_circle_size_small_number);
            return;
        }
        if (enumC17069w == EnumC17069w.IMAGE) {
            Context context5 = getContext();
            AbstractC19074t.m100207e(context5, "context");
            this.f105533E0 = C27280g.m139658a(context5, AbstractC2810d.check_circle_size_medium_image);
            Context context6 = getContext();
            AbstractC19074t.m100207e(context6, "context");
            this.f105534F0 = C27280g.m139658a(context6, AbstractC2810d.check_circle_size_medium_image_number);
            return;
        }
        Context context7 = getContext();
        AbstractC19074t.m100207e(context7, "context");
        this.f105533E0 = C27280g.m139658a(context7, AbstractC2810d.check_circle_size_medium);
        Context context8 = getContext();
        AbstractC19074t.m100207e(context8, "context");
        this.f105534F0 = C27280g.m139658a(context8, AbstractC2810d.check_circle_size_medium_number);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.mo44775o0(canvas);
        if (this.f105541M0 == EnumC17065u.TICK) {
            Drawable drawable = this.f105533E0;
            if (drawable instanceof StateListDrawable) {
                AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
                ((StateListDrawable) drawable).setState(this.f84794x);
                Drawable drawable2 = this.f105533E0;
                AbstractC19074t.m100206d(drawable2, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
                drawable = ((StateListDrawable) drawable2).getCurrent();
            }
            m112163g1(canvas, drawable);
        } else {
            Drawable drawable3 = this.f105534F0;
            if (drawable3 instanceof StateListDrawable) {
                AbstractC19074t.m100206d(drawable3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
                ((StateListDrawable) drawable3).setState(this.f84794x);
                Drawable drawable4 = this.f105534F0;
                AbstractC19074t.m100206d(drawable4, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
                drawable3 = ((StateListDrawable) drawable4).getCurrent();
            }
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
        if (this.f105542N0 == EnumC17069w.IMAGE) {
            m112165i1(canvas);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        boolean z11;
        int m89110N = m89110N();
        int m89108M = m89108M();
        super.mo44180q0(i11, i12, i13, i14);
        if (this.f105536H0 && m89110N == m89110N() && m89108M == m89108M()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f105536H0 = z11;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105536H0) {
            return;
        }
        this.f105536H0 = true;
        if (this.f105541M0 == EnumC17065u.NUMBER) {
            m112164h1(this.f105534F0);
        } else {
            m112164h1(this.f105533E0);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        super.mo89151s0(i11, iArr, i12, iArr2);
        if (((i11 ^ i12) & 256) != 0) {
            C17067v.b bVar = this.f105544P0;
            if (bVar != null) {
                bVar.mo91353a(m89141i0());
            }
            invalidate();
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f105540L0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f105540L0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: u0 */
    public void mo89153u0() {
        m112170l1(!m89141i0(), this.f105535G0);
        super.mo89153u0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21734b(Context context, EnumC17071x enumC17071x, EnumC17069w enumC17069w) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC17071x, "size");
        AbstractC19074t.m100208f(enumC17069w, "placement");
        this.f105532D0 = EnumC17071x.MEDIUM;
        this.f105535G0 = true;
        this.f105541M0 = EnumC17065u.TICK;
        this.f105542N0 = EnumC17069w.CONTAINER;
        m112166j1(enumC17071x, enumC17069w);
        this.f105540L0 = new C25807a(new WeakReference(this));
    }
}
