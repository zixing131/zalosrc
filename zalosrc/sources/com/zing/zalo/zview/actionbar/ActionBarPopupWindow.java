package com.zing.zalo.zview.actionbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.zview.AbstractC17450b;
import java.util.HashMap;
import zl0.AbstractC32232i;

/* loaded from: classes7.dex */
public class ActionBarPopupWindow extends PopupWindow {

    /* renamed from: b */
    static DecelerateInterpolator f88865b = new DecelerateInterpolator(1.5f);

    /* renamed from: a */
    AnimatorSet f88866a;

    /* loaded from: classes7.dex */
    public static class ActionBarPopupWindowLayout extends FrameLayout {

        /* renamed from: y */
        protected static Drawable f88867y;

        /* renamed from: p */
        InterfaceC17438c f88868p;

        /* renamed from: q */
        float f88869q;

        /* renamed from: r */
        float f88870r;

        /* renamed from: s */
        int f88871s;

        /* renamed from: t */
        int f88872t;

        /* renamed from: u */
        boolean f88873u;

        /* renamed from: v */
        HashMap f88874v;

        /* renamed from: w */
        ScrollView f88875w;

        /* renamed from: x */
        LinearLayout f88876x;

        public ActionBarPopupWindowLayout(Context context) {
            super(context);
            this.f88869q = 1.0f;
            this.f88870r = 1.0f;
            this.f88871s = 255;
            this.f88872t = 0;
            this.f88874v = new HashMap();
            f88867y = AbstractC32232i.m155466n(getContext(), AbstractC17450b.PopupActionBarMenuBackground);
            setPadding(AbstractC32232i.m155453a(8.0f), AbstractC32232i.m155453a(8.0f), AbstractC32232i.m155453a(8.0f), AbstractC32232i.m155453a(8.0f));
            setWillNotDraw(false);
            ScrollView scrollView = new ScrollView(context);
            this.f88875w = scrollView;
            scrollView.setVerticalScrollBarEnabled(false);
            addView(this.f88875w, new ViewGroup.LayoutParams(-2, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f88876x = linearLayout;
            linearLayout.setOrientation(1);
            this.f88875w.addView(this.f88876x, new FrameLayout.LayoutParams(-2, -2));
        }

        /* renamed from: a */
        public View m92788a(int i11) {
            return this.f88876x.getChildAt(i11);
        }

        @Override // android.view.ViewGroup
        public void addView(View view) {
            this.f88876x.addView(view);
        }

        /* renamed from: b */
        public void m92789b() {
            this.f88876x.removeAllViews();
        }

        /* renamed from: c */
        public void m92790c() {
            this.f88875w.scrollTo(0, 0);
        }

        /* renamed from: d */
        void m92791d(View view) {
            float f11;
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            animatorArr[0] = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            float[] fArr = new float[2];
            if (this.f88873u) {
                f11 = 6.0f;
            } else {
                f11 = -6.0f;
            }
            fArr[0] = AbstractC32232i.m155453a(f11);
            fArr[1] = 0.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(view, "translationY", fArr);
            animatorSet.playTogether(animatorArr);
            animatorSet.setDuration(60L);
            animatorSet.setInterpolator(ActionBarPopupWindow.f88865b);
            animatorSet.start();
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            InterfaceC17438c interfaceC17438c = this.f88868p;
            if (interfaceC17438c != null) {
                interfaceC17438c.mo92792a(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        public int getBackAlpha() {
            return this.f88871s;
        }

        public float getBackScaleX() {
            return this.f88869q;
        }

        public float getBackScaleY() {
            return this.f88870r;
        }

        public int getItemsCount() {
            return this.f88876x.getChildCount();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            Drawable drawable = f88867y;
            if (drawable != null) {
                drawable.setAlpha(this.f88871s);
                if (this.f88873u) {
                    f88867y.setBounds(0, (int) (getMeasuredHeight() * (1.0f - this.f88870r)), (int) (getMeasuredWidth() * this.f88869q), getMeasuredHeight());
                } else {
                    f88867y.setBounds(0, 0, (int) (getMeasuredWidth() * this.f88869q), (int) (getMeasuredHeight() * this.f88870r));
                }
                f88867y.draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewManager
        public void removeView(View view) {
            this.f88876x.removeView(view);
        }

        public void setBackAlpha(int i11) {
            this.f88871s = i11;
        }

        public void setBackScaleX(float f11) {
            this.f88869q = f11;
            invalidate();
        }

        public void setBackScaleY(float f11) {
            this.f88870r = f11;
            int itemsCount = getItemsCount();
            for (int i11 = 0; i11 < itemsCount; i11++) {
                m92788a(i11).getVisibility();
            }
            int measuredHeight = getMeasuredHeight() - AbstractC32232i.m155453a(16.0f);
            if (this.f88873u) {
                for (int i12 = this.f88872t; i12 >= 0; i12--) {
                    View m92788a = m92788a(i12);
                    if (m92788a.getVisibility() == 0) {
                        if (((Integer) this.f88874v.get(m92788a)) != null && measuredHeight - ((r6.intValue() * AbstractC32232i.m155453a(48.0f)) + AbstractC32232i.m155453a(32.0f)) > measuredHeight * f11 && (f11 < 1.0d || measuredHeight > 0)) {
                            break;
                        }
                        this.f88872t = i12 - 1;
                        m92791d(m92788a);
                    }
                }
            } else {
                int i13 = this.f88872t;
                while (i13 < itemsCount) {
                    View m92788a2 = m92788a(i13);
                    if (m92788a2.getVisibility() == 0) {
                        if (((Integer) this.f88874v.get(m92788a2)) != null && ((r7.intValue() + 1) * AbstractC32232i.m155453a(48.0f)) - AbstractC32232i.m155453a(24.0f) > measuredHeight * f11 && (f11 < 1.0d || measuredHeight > 0)) {
                            if (f11 == 1.0f && i13 < itemsCount - 1) {
                                while (i13 < itemsCount) {
                                    View m92788a3 = m92788a(i13);
                                    if (m92788a3.getVisibility() == 0) {
                                        m92788a3.setAlpha(1.0f);
                                        i13++;
                                    }
                                }
                            }
                        } else {
                            this.f88872t = i13 + 1;
                            m92791d(m92788a2);
                        }
                    }
                    i13++;
                }
            }
            invalidate();
        }

        public void setOnDispatchKeyEventListener(InterfaceC17438c interfaceC17438c) {
            this.f88868p = interfaceC17438c;
        }

        public void setShowedFromBottom(boolean z11) {
            this.f88873u = z11;
        }
    }

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarPopupWindow$a */
    /* loaded from: classes7.dex */
    class C17436a extends AnimatorListenerAdapter {
        C17436a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarPopupWindow.this.f88866a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarPopupWindow$b */
    /* loaded from: classes7.dex */
    public class C17437b extends AnimatorListenerAdapter {
        C17437b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarPopupWindow actionBarPopupWindow = ActionBarPopupWindow.this;
            actionBarPopupWindow.f88866a = null;
            actionBarPopupWindow.setFocusable(false);
            try {
                ActionBarPopupWindow.super.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarPopupWindow$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC17438c {
        /* renamed from: a */
        void mo92792a(KeyEvent keyEvent);
    }

    public ActionBarPopupWindow(View view, int i11, int i12) {
        super(view, i11, i12);
        m92786c();
    }

    /* renamed from: b */
    public void m92785b(boolean z11) {
        float f11;
        if (z11) {
            AnimatorSet animatorSet = this.f88866a;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) getContentView();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f88866a = animatorSet2;
            Animator[] animatorArr = new Animator[2];
            float[] fArr = new float[1];
            if (actionBarPopupWindowLayout.f88873u) {
                f11 = 5.0f;
            } else {
                f11 = -5.0f;
            }
            fArr[0] = AbstractC32232i.m155453a(f11);
            animatorArr[0] = ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "translationY", fArr);
            animatorArr[1] = ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "alpha", 0.0f);
            animatorSet2.playTogether(animatorArr);
            this.f88866a.setDuration(150L);
            this.f88866a.addListener(new C17437b());
            this.f88866a.start();
            return;
        }
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    void m92786c() {
    }

    /* renamed from: d */
    public void m92787d() {
        if (this.f88866a != null) {
            return;
        }
        ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) getContentView();
        AbstractC1579n0.m7857b1(actionBarPopupWindowLayout, 0.0f);
        AbstractC1579n0.m7805C0(actionBarPopupWindowLayout, 1.0f);
        AbstractC1579n0.m7839T0(actionBarPopupWindowLayout, actionBarPopupWindowLayout.getMeasuredWidth());
        AbstractC1579n0.m7841U0(actionBarPopupWindowLayout, 0.0f);
        int itemsCount = actionBarPopupWindowLayout.getItemsCount();
        actionBarPopupWindowLayout.f88874v.clear();
        int i11 = 0;
        for (int i12 = 0; i12 < itemsCount; i12++) {
            View m92788a = actionBarPopupWindowLayout.m92788a(i12);
            if (m92788a.getVisibility() == 0) {
                actionBarPopupWindowLayout.f88874v.put(m92788a, Integer.valueOf(i11));
                AbstractC1579n0.m7805C0(m92788a, 0.0f);
                i11++;
            }
        }
        if (actionBarPopupWindowLayout.f88873u) {
            actionBarPopupWindowLayout.f88872t = itemsCount - 1;
        } else {
            actionBarPopupWindowLayout.f88872t = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f88866a = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "backScaleY", 0.0f, 1.0f), ObjectAnimator.ofInt(actionBarPopupWindowLayout, "backAlpha", 0, 255));
        this.f88866a.setDuration((i11 * 8) + 30);
        this.f88866a.addListener(new C17436a());
        this.f88866a.start();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        m92785b(true);
    }
}
