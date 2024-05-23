package com.zing.zalo.p077ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.C7232u9;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import l00.AbstractC21993a;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.custom.f */
/* loaded from: classes5.dex */
public abstract class AbstractC11855f extends AbstractC21993a {

    /* renamed from: L */
    boolean f61746L;

    /* renamed from: M */
    View f61747M;

    /* renamed from: N */
    TextView f61748N;

    /* renamed from: O */
    C7232u9 f61749O;

    /* renamed from: P */
    boolean f61750P;

    /* renamed from: Q */
    boolean f61751Q;

    /* renamed from: R */
    final ValueAnimator f61752R;

    /* renamed from: S */
    int f61753S;

    /* renamed from: T */
    private final Runnable f61754T;

    /* renamed from: U */
    final int f61755U;

    /* renamed from: V */
    ContactProfile f61756V;

    /* renamed from: com.zing.zalo.ui.custom.f$a */
    /* loaded from: classes5.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f61757p = false;

        /* renamed from: q */
        final /* synthetic */ View f61758q;

        a(View view) {
            this.f61758q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f61757p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f61757p) {
                this.f61757p = false;
                return;
            }
            if (((Float) AbstractC11855f.this.f61752R.getAnimatedValue()).floatValue() == 0.0f) {
                AbstractC11855f abstractC11855f = AbstractC11855f.this;
                abstractC11855f.f61753S = 0;
                if (!abstractC11855f.f61751Q) {
                    abstractC11855f.f61750P = false;
                    View view = this.f61758q;
                    if (view != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC11855f.this.f61753S = 2;
        }
    }

    public AbstractC11855f(RecyclerView recyclerView, C7232u9 c7232u9, final View view, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2, AbstractC23136l9.m118742r(18.0f), AbstractC23136l9.m118742r(40.0f), 0);
        this.f61746L = false;
        this.f61750P = false;
        this.f61751Q = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f61752R = ofFloat;
        this.f61753S = 0;
        this.f61754T = new Runnable() { // from class: com.zing.zalo.ui.custom.d
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC11855f.this.m65878c0();
            }
        };
        this.f61755U = AbstractC23136l9.m118742r(24.0f);
        this.f61756V = null;
        this.f61749O = c7232u9;
        this.f61747M = view;
        this.f61748N = (TextView) view.findViewById(AbstractC6918a0.tvBubbleScroll);
        ofFloat.addListener(new a(view));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.custom.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC11855f.m65879d0(view, valueAnimator);
            }
        });
    }

    /* renamed from: b0 */
    private View m65877b0(RecyclerView recyclerView, int i11) {
        View view = null;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
            View childAt = recyclerView.getChildAt(i13);
            if (childAt.getTop() < i11 && i11 - childAt.getTop() < i12) {
                i12 = i11 - childAt.getTop();
                view = childAt;
            }
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m65878c0() {
        int i11 = this.f61753S;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
        } else {
            this.f61752R.cancel();
        }
        this.f61753S = 3;
        this.f61752R.setFloatValues(this.f61747M.getAlpha(), 0.0f);
        this.f61752R.setDuration(500L);
        this.f61752R.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static /* synthetic */ void m65879d0(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view != null) {
            view.setAlpha(floatValue);
        }
    }

    /* renamed from: g0 */
    private void m65880g0() {
        this.f61751Q = false;
        if (this.f61753S == 0) {
            this.f61750P = false;
            View view = this.f61747M;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        View view2 = this.f61747M;
        if (view2 != null) {
            view2.postDelayed(this.f61754T, 1200L);
        }
    }

    /* renamed from: h0 */
    private void m65881h0() {
        float f11;
        int i11 = this.f61753S;
        if (i11 != 0) {
            if (i11 == 3) {
                this.f61752R.cancel();
            } else {
                return;
            }
        }
        View view = this.f61747M;
        if (view != null) {
            view.removeCallbacks(this.f61754T);
            this.f61747M.setVisibility(0);
        }
        this.f61753S = 1;
        ValueAnimator valueAnimator = this.f61752R;
        float[] fArr = new float[2];
        View view2 = this.f61747M;
        if (view2 != null) {
            f11 = view2.getAlpha();
        } else {
            f11 = 0.0f;
        }
        fArr[0] = f11;
        fArr[1] = 1.0f;
        valueAnimator.setFloatValues(fArr);
        this.f61752R.setDuration(500L);
        this.f61752R.setStartDelay(0L);
        this.f61752R.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l00.AbstractC21994b
    /* renamed from: B */
    public void mo65882B(Canvas canvas, int i11, int i12) {
        try {
            if (this.f61750P && this.f108341u.getChildAt(0) != null && this.f61748N != null) {
                this.f61747M.setTranslationY(i12 - this.f61755U);
                View m65877b0 = m65877b0(this.f108341u, i12);
                if (m65877b0 != null) {
                    int mo36532c = this.f61749O.mo36532c(this.f108341u.m9817A0(m65877b0));
                    if (mo36532c >= 0) {
                        ContactProfile m36915S = this.f61749O.m36915S(mo36532c);
                        if (m36915S != null && !m36915S.m40366G0() && m36915S != this.f61756V) {
                            this.f61756V = m36915S;
                            if (m36915S.f42335E1 == 0) {
                                TextView textView = this.f61748N;
                                textView.setCompoundDrawablesWithIntrinsicBounds(AbstractC23136l9.m118665N(textView.getContext(), AbstractC16803z.ic_favorite_24), (Drawable) null, (Drawable) null, (Drawable) null);
                                this.f61748N.setText("");
                            } else {
                                this.f61748N.setText(m36915S.f42437s.substring(0, 1));
                                this.f61748N.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                        }
                        if (this.f61751Q) {
                            m65881h0();
                            return;
                        }
                        return;
                    }
                    m65878c0();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // l00.AbstractC21993a, l00.AbstractC21994b, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        super.mo951a(recyclerView, motionEvent);
        if (this.f61746L && !m114868x()) {
            if (ZaloListView.m86977gN()) {
                m65880g0();
            }
            mo65884f0();
        }
        this.f61746L = m114868x();
    }

    @Override // l00.AbstractC21993a, l00.AbstractC21994b, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean mo953c = super.mo953c(recyclerView, motionEvent);
        if (m114868x()) {
            if (ZaloListView.m86977gN()) {
                this.f61751Q = true;
                this.f61750P = true;
            }
            mo65883e0();
        }
        return mo953c;
    }

    /* renamed from: e0 */
    protected abstract void mo65883e0();

    /* renamed from: f0 */
    protected abstract void mo65884f0();
}
