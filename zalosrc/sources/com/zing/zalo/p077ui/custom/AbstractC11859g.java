package com.zing.zalo.p077ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import l00.AbstractC21993a;
import me0.AbstractC23136l9;
import p500s1.C26087b;

/* renamed from: com.zing.zalo.ui.custom.g */
/* loaded from: classes5.dex */
public abstract class AbstractC11859g extends AbstractC21993a {

    /* renamed from: L */
    private RobotoTextView f61806L;

    /* renamed from: M */
    private c f61807M;

    /* renamed from: N */
    private boolean f61808N;

    /* renamed from: O */
    private ValueAnimator f61809O;

    /* renamed from: P */
    private ValueAnimator f61810P;

    /* renamed from: Q */
    private float f61811Q;

    /* renamed from: R */
    private float f61812R;

    /* renamed from: S */
    private boolean f61813S;

    /* renamed from: T */
    private boolean f61814T;

    /* renamed from: com.zing.zalo.ui.custom.g$a */
    /* loaded from: classes5.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC11859g.this.f61806L.setVisibility(4);
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.g$b */
    /* loaded from: classes5.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            AbstractC11859g.this.f61806L.setTextColor(AbstractC11859g.this.f61806L.getTextColors().withAlpha(floatValue));
            AbstractC11859g.this.f61806L.getBackground().setAlpha(floatValue);
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.g$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: g */
        String mo36810g(int i11);
    }

    public AbstractC11859g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2, 50, 130, 0);
        this.f61808N = false;
        this.f61811Q = 0.0f;
        this.f61812R = 0.0f;
        this.f61813S = false;
        this.f61814T = false;
        if (recyclerView.getAdapter() instanceof c) {
            this.f61807M = (c) recyclerView.getAdapter();
        }
        m114859H(AbstractC23136l9.m118742r(35.0f), AbstractC23136l9.m118742r(35.0f));
    }

    /* renamed from: b0 */
    private boolean m65924b0() {
        return this.f61806L != null;
    }

    /* renamed from: c0 */
    private void m65925c0() {
        ValueAnimator valueAnimator = this.f61810P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f61808N = false;
        if (this.f61809O == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f61809O = ofFloat;
            ofFloat.setDuration(500L);
            this.f61809O.setInterpolator(new DecelerateInterpolator());
            this.f61809O.addListener(new a());
            this.f61809O.addUpdateListener(new b());
        }
        if (!this.f61809O.isRunning()) {
            this.f61809O.start();
        }
    }

    /* renamed from: h0 */
    private void m65926h0() {
        int i11;
        ValueAnimator valueAnimator = this.f61809O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f61808N = true;
        RobotoTextView robotoTextView = this.f61806L;
        if (!TextUtils.isEmpty(robotoTextView.getText()) && this.f61808N) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        robotoTextView.setVisibility(i11);
        if (this.f61810P == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f61810P = ofFloat;
            ofFloat.setDuration(500L);
            this.f61810P.setInterpolator(new C26087b());
            this.f61810P.addUpdateListener(new b());
        }
        if (!this.f61810P.isRunning()) {
            this.f61810P.start();
        }
    }

    /* renamed from: i0 */
    private void m65927i0() {
        if (m114868x() && !this.f61808N) {
            m65926h0();
        } else if (!m114868x() && this.f61808N) {
            m65925c0();
        }
    }

    @Override // l00.AbstractC21994b
    /* renamed from: B */
    public void mo65882B(Canvas canvas, int i11, int i12) {
        LinearLayoutManager linearLayoutManager;
        int i13;
        super.mo65882B(canvas, i11, i12);
        try {
            if (this.f61807M != null && (linearLayoutManager = (LinearLayoutManager) this.f108341u.getLayoutManager()) != null) {
                int m9740Y1 = linearLayoutManager.m9740Y1();
                int m9745c2 = linearLayoutManager.m9745c2();
                while (true) {
                    if (m9740Y1 > m9745c2) {
                        break;
                    }
                    View mo9732P = linearLayoutManager.mo9732P(m9740Y1);
                    if (mo9732P != null && i12 >= mo9732P.getTop() && i12 <= mo9732P.getBottom()) {
                        String mo36810g = this.f61807M.mo36810g(m9740Y1);
                        RobotoTextView robotoTextView = this.f61806L;
                        if (!TextUtils.isEmpty(mo36810g) && this.f61808N) {
                            i13 = 0;
                        } else {
                            i13 = 4;
                        }
                        robotoTextView.setVisibility(i13);
                        this.f61806L.setText(mo36810g);
                    } else {
                        m9740Y1++;
                    }
                }
                RobotoTextView robotoTextView2 = this.f61806L;
                if (robotoTextView2 != null) {
                    robotoTextView2.setTranslationY(i12 - (robotoTextView2.getMeasuredHeight() / 2));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // l00.AbstractC21993a, l00.AbstractC21994b, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean m114868x = m114868x();
        super.mo951a(recyclerView, motionEvent);
        if (m65924b0()) {
            m65927i0();
        }
        if (m114868x && !m114868x()) {
            mo46066f0();
        }
        m65928a0(motionEvent);
    }

    /* renamed from: a0 */
    void m65928a0(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    float y11 = motionEvent.getY();
                    if (this.f61812R == 0.0f) {
                        this.f61812R = y11;
                    }
                    if (this.f61811Q == 0.0f) {
                        this.f61811Q = y11;
                    }
                    if (!this.f61813S && !this.f61814T) {
                        float f11 = this.f61812R;
                        if (y11 > f11) {
                            this.f61814T = false;
                            this.f61813S = true;
                        } else if (y11 < f11) {
                            this.f61814T = true;
                            this.f61813S = false;
                        }
                    }
                    float f12 = this.f61812R;
                    if (y11 > f12) {
                        if (this.f61814T && !this.f61813S) {
                            this.f61811Q = y11;
                            this.f61814T = false;
                            this.f61813S = true;
                        }
                    } else if (y11 < f12 && this.f61813S && !this.f61814T) {
                        this.f61811Q = y11;
                        this.f61814T = true;
                        this.f61813S = false;
                    }
                    float f13 = y11 - this.f61811Q;
                    if (f13 > 3.0f) {
                        this.f61811Q = y11;
                        this.f61814T = false;
                        this.f61813S = false;
                        mo46065e0(2);
                    } else if (f13 < -3.0f) {
                        this.f61811Q = y11;
                        this.f61814T = false;
                        this.f61813S = false;
                        mo46065e0(1);
                    }
                    this.f61812R = y11;
                    return;
                }
            }
            this.f61811Q = 0.0f;
            this.f61812R = 0.0f;
            this.f61813S = false;
            this.f61814T = false;
            mo46065e0(0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // l00.AbstractC21993a, l00.AbstractC21994b, androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean mo953c = super.mo953c(recyclerView, motionEvent);
        if (m114868x()) {
            mo46064d0();
        }
        return mo953c;
    }

    /* renamed from: d0 */
    protected void mo46064d0() {
    }

    /* renamed from: e0 */
    public void mo46065e0(int i11) {
    }

    /* renamed from: f0 */
    protected abstract void mo46066f0();

    /* renamed from: g0 */
    public void m65929g0(RobotoTextView robotoTextView) {
        if (robotoTextView != null) {
            this.f61806L = robotoTextView;
            robotoTextView.setVisibility(4);
            this.f61808N = false;
        }
    }

    @Override // l00.AbstractC21994b
    /* renamed from: u */
    public void mo65930u() {
        super.mo65930u();
        m65925c0();
    }
}
