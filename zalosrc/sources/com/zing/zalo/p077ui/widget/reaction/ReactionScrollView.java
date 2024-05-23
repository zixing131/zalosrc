package com.zing.zalo.p077ui.widget.reaction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.p077ui.widget.reaction.ReactionScrollView;
import java.util.ArrayList;
import java.util.List;
import lb0.C22422x;
import nh0.C23793c;
import p392oh.C24265l;
import p500s1.C26087b;
import ph.C24753f;

/* loaded from: classes6.dex */
public class ReactionScrollView extends HorizontalScrollView {

    /* renamed from: p */
    int f71174p;

    /* renamed from: q */
    int f71175q;

    /* renamed from: r */
    int f71176r;

    /* renamed from: s */
    boolean f71177s;

    /* renamed from: t */
    ReactionPickerView.InterfaceC13747a f71178t;

    /* renamed from: u */
    C13748a f71179u;

    /* renamed from: v */
    String f71180v;

    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionScrollView$a */
    /* loaded from: classes6.dex */
    public class C13748a extends View {

        /* renamed from: p */
        List f71181p;

        /* renamed from: q */
        List f71182q;

        /* renamed from: r */
        List f71183r;

        /* renamed from: s */
        int f71184s;

        /* renamed from: t */
        int f71185t;

        /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionScrollView$a$a */
        /* loaded from: classes6.dex */
        public class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ReactionPickerView.InterfaceC13747a interfaceC13747a = ReactionScrollView.this.f71178t;
                if (interfaceC13747a != null) {
                    interfaceC13747a.mo62730p2();
                }
            }
        }

        C13748a(Context context, int i11, int i12) {
            super(context);
            this.f71181p = C24265l.m126676s().m126698n();
            this.f71182q = new ArrayList();
            this.f71183r = new ArrayList();
            this.f71184s = -1;
            this.f71185t = i12;
            int i13 = (i11 / 2) - (i12 / 2);
            int i14 = i13 + i12;
            for (int i15 = 0; i15 < this.f71181p.size(); i15++) {
                C22422x c22422x = new C22422x(((C24753f) this.f71181p.get(i15)).m128595h(), i12);
                int i16 = ReactionScrollView.this.f71175q + (i15 * i12) + (ReactionScrollView.this.f71174p * i15);
                c22422x.setBounds(i16, i13, i16 + i12, i14);
                this.f71182q.add(c22422x);
                this.f71183r.add(Float.valueOf(0.0f));
            }
        }

        /* renamed from: e */
        public /* synthetic */ void m76816e(int i11, ValueAnimator valueAnimator) {
            try {
                this.f71183r.set(i11, (Float) valueAnimator.getAnimatedValue());
                invalidate();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m76817f(int i11, ValueAnimator valueAnimator) {
            try {
                this.f71183r.set(i11, (Float) valueAnimator.getAnimatedValue());
                invalidate();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: c */
        boolean m76818c(int i11) {
            try {
                int scrollX = ((View) getParent()).getScrollX();
                int width = ((View) getParent()).getWidth() + scrollX;
                Rect bounds = ((C22422x) this.f71182q.get(i11)).getBounds();
                if (bounds.left > width) {
                    return false;
                }
                if (bounds.right < scrollX) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }

        /* renamed from: d */
        int m76819d(float f11) {
            for (int i11 = 0; i11 < this.f71182q.size(); i11++) {
                C22422x c22422x = (C22422x) this.f71182q.get(i11);
                if (f11 >= c22422x.getBounds().left - (ReactionScrollView.this.f71174p / 2) && f11 <= c22422x.getBounds().right + (ReactionScrollView.this.f71174p / 2)) {
                    return i11;
                }
            }
            return -1;
        }

        /* renamed from: g */
        void m76820g(int i11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.75f, 1.75f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new C26087b());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.reaction.d

                /* renamed from: q */
                public final /* synthetic */ int f71237q;

                public /* synthetic */ C13763d(int i112) {
                    r2 = i112;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionScrollView.C13748a.this.m76816e(r2, valueAnimator);
                }
            });
            ofFloat.addListener(new a());
            ofFloat.start();
        }

        /* renamed from: h */
        void m76821h() {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f71182q.size(); i11++) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new OvershootInterpolator());
                ofFloat.setDuration(120L);
                ofFloat.setStartDelay(i11 * 20);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.reaction.e

                    /* renamed from: q */
                    public final /* synthetic */ int f71239q;

                    public /* synthetic */ C13764e(int i112) {
                        r2 = i112;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ReactionScrollView.C13748a.this.m76817f(r2, valueAnimator);
                    }
                });
                arrayList.add(ofFloat);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setStartDelay(100L);
            animatorSet.start();
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            m76821h();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            for (int i11 = 0; i11 < this.f71182q.size(); i11++) {
                if (m76818c(i11)) {
                    C22422x c22422x = (C22422x) this.f71182q.get(i11);
                    c22422x.m115849a(((Float) this.f71183r.get(i11)).floatValue());
                    c22422x.draw(canvas);
                }
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i11, int i12) {
            int i13;
            int size = ReactionScrollView.this.f71175q + (this.f71182q.size() * this.f71185t);
            int size2 = this.f71182q.size() - 1;
            ReactionScrollView reactionScrollView = ReactionScrollView.this;
            int i14 = size + (size2 * reactionScrollView.f71174p) + reactionScrollView.f71176r;
            if (View.MeasureSpec.getMode(i12) == 1073741824) {
                i13 = View.MeasureSpec.getSize(i12);
            } else {
                i13 = ReactionPickerView.f71134f0;
            }
            setMeasuredDimension(i14, i13);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        int m76819d = m76819d(motionEvent.getX());
                        int i11 = this.f71184s;
                        if (m76819d == i11 && !ReactionScrollView.this.f71177s && i11 >= 0 && i11 < this.f71182q.size()) {
                            if (ReactionScrollView.this.f71178t != null) {
                                C24753f c24753f = (C24753f) this.f71181p.get(this.f71184s);
                                ReactionScrollView.this.f71178t.mo62725G8(C24753f.m128591e(c24753f.m128599l(), c24753f.m128595h(), c24753f.m128601n(), C23793c.m124316k().mo124314i()), ReactionScrollView.this.f71180v);
                                ReactionScrollView.this.f71177s = true;
                            }
                            m76820g(this.f71184s);
                        }
                    }
                } else {
                    this.f71184s = m76819d(motionEvent.getX());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    public ReactionScrollView(Context context, int i11, int i12, int i13, int i14, int i15, ReactionPickerView.InterfaceC13747a interfaceC13747a, String str) {
        super(context, null);
        this.f71177s = false;
        this.f71174p = i13;
        this.f71175q = i14;
        this.f71176r = i15;
        this.f71178t = interfaceC13747a;
        this.f71180v = str;
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        C13748a c13748a = new C13748a(context, i11, i12);
        this.f71179u = c13748a;
        addView(c13748a, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        this.f71179u.invalidate();
    }
}
