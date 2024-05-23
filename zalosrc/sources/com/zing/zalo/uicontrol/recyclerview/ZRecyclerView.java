package com.zing.zalo.uicontrol.recyclerview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import p098dc.AbstractC17876j;

/* loaded from: classes4.dex */
public class ZRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    int f83924V0;

    /* renamed from: W0 */
    float f83925W0;

    /* renamed from: X0 */
    int f83926X0;

    /* renamed from: Y0 */
    boolean f83927Y0;

    /* renamed from: Z0 */
    boolean f83928Z0;

    /* renamed from: a1 */
    float f83929a1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.recyclerview.ZRecyclerView$a */
    /* loaded from: classes4.dex */
    public class C16646a extends AbstractC17876j {
        C16646a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l
        /* renamed from: s */
        public void mo10053s(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            super.mo10053s(abstractC1876c0);
            ZRecyclerView.this.m88425c2(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.recyclerview.ZRecyclerView$b */
    /* loaded from: classes4.dex */
    public class C16647b extends RecyclerView.AbstractC1892s {
        C16647b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            ZRecyclerView.this.m88425c2(false);
        }
    }

    public ZRecyclerView(Context context) {
        super(context);
        this.f83925W0 = 0.9f;
        this.f83926X0 = Integer.MAX_VALUE;
        this.f83927Y0 = false;
        this.f83928Z0 = false;
        this.f83929a1 = 0.5f;
        m88424b2();
    }

    /* renamed from: a2 */
    private float m88423a2(View view) {
        float measuredWidth = getMeasuredWidth() / 2;
        float x11 = view.getX() + (view.getWidth() / 2);
        int i11 = this.f83924V0;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (i11 == 2) {
            float measuredWidth2 = getMeasuredWidth() / 2;
            float abs = Math.abs(measuredWidth - x11);
            if (measuredWidth2 != 0.0f) {
                f11 = abs / measuredWidth2;
            }
            f12 = 1.0f - f11;
        } else if (i11 == 1) {
            float max = Math.max(measuredWidth, x11) - Math.min(measuredWidth, x11);
            float width = measuredWidth + view.getWidth();
            if (width != 0.0f) {
                f11 = max / width;
            }
            f12 = 1.0f - ((1.0f - this.f83925W0) * f11);
        }
        return Math.max(f12, this.f83925W0);
    }

    /* renamed from: b2 */
    private void m88424b2() {
        setItemAnimator(new C16646a());
        m9826E(new C16647b());
    }

    /* renamed from: c2 */
    public void m88425c2(boolean z11) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            float m88423a2 = m88423a2(childAt);
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.f83927Y0) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, "scaleX", m88423a2), ObjectAnimator.ofFloat(childAt, "scaleY", m88423a2));
                } else {
                    animatorSet.play(ObjectAnimator.ofFloat(childAt, "scaleY", m88423a2));
                }
                animatorSet.setDuration(200L);
                animatorSet.start();
            } else {
                if (this.f83927Y0) {
                    childAt.setScaleX(m88423a2);
                }
                childAt.setScaleY(m88423a2);
            }
            if (this.f83928Z0) {
                View findViewById = childAt.findViewById(AbstractC6918a0.overlay);
                float f11 = (1.0f - m88423a2) * 3.5f;
                if (f11 != 0.0f) {
                    f11 = Math.min(f11, this.f83929a1);
                }
                findViewById.setAlpha(f11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: f1 */
    public void mo9880f1(View view) {
        super.mo9880f1(view);
        m88425c2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEnableOverlayAnim(boolean z11) {
        this.f83928Z0 = z11;
    }

    public void setEnableScaleX(boolean z11) {
        this.f83927Y0 = z11;
    }

    public void setMaxVelocity(int i11) {
        this.f83926X0 = i11;
    }

    public void setMinScale(float f11) {
        this.f83925W0 = f11;
    }

    public void setScaleType(int i11) {
        this.f83924V0 = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: x0 */
    public boolean mo9906x0(int i11, int i12) {
        int max;
        int max2;
        int i13 = this.f83926X0;
        if (i11 >= 0) {
            max = Math.min(i11, i13);
        } else {
            max = Math.max(i11, -i13);
        }
        int i14 = this.f83926X0;
        if (i12 >= 0) {
            max2 = Math.min(i12, i14);
        } else {
            max2 = Math.max(i12, -i14);
        }
        return super.mo9906x0(max, max2);
    }

    public ZRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83925W0 = 0.9f;
        this.f83926X0 = Integer.MAX_VALUE;
        this.f83927Y0 = false;
        this.f83928Z0 = false;
        this.f83929a1 = 0.5f;
        m88424b2();
    }

    public ZRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83925W0 = 0.9f;
        this.f83926X0 = Integer.MAX_VALUE;
        this.f83927Y0 = false;
        this.f83928Z0 = false;
        this.f83929a1 = 0.5f;
        m88424b2();
    }
}
