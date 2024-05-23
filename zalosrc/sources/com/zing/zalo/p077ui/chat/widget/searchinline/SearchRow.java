package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow;
import com.zing.zalo.p077ui.widget.layout.DrawableCallbackFrameLayout;
import com.zing.zalo.zview.AbstractC17466e;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class SearchRow extends DrawableCallbackFrameLayout {

    /* renamed from: A */
    protected float f61359A;

    /* renamed from: B */
    protected boolean f61360B;

    /* renamed from: C */
    protected boolean f61361C;

    /* renamed from: q */
    protected Drawable f61362q;

    /* renamed from: r */
    protected Drawable f61363r;

    /* renamed from: s */
    protected int f61364s;

    /* renamed from: t */
    private int f61365t;

    /* renamed from: u */
    private int f61366u;

    /* renamed from: v */
    boolean f61367v;

    /* renamed from: w */
    RunnableC11799b f61368w;

    /* renamed from: x */
    int f61369x;

    /* renamed from: y */
    RunnableC11800c f61370y;

    /* renamed from: z */
    SearchRow f61371z;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRow$a */
    /* loaded from: classes5.dex */
    class C11798a extends AnimatorListenerAdapter {
        C11798a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            SearchRow searchRow = SearchRow.this;
            searchRow.f61360B = false;
            searchRow.f61359A = 0.0f;
            searchRow.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            SearchRow searchRow = SearchRow.this;
            searchRow.f61360B = false;
            searchRow.f61359A = 0.0f;
            searchRow.invalidate();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRow$b */
    /* loaded from: classes5.dex */
    class RunnableC11799b implements Runnable {

        /* renamed from: p */
        public int f61373p;

        RunnableC11799b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchRow searchRow = SearchRow.this;
            if (searchRow.f61367v && searchRow.f61371z.getParent() != null) {
                int i11 = this.f61373p;
                SearchRow searchRow2 = SearchRow.this;
                if (i11 == searchRow2.f61369x) {
                    searchRow2.f61367v = false;
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    SearchRow.this.onTouchEvent(obtain);
                    obtain.recycle();
                    SearchRow.this.performHapticFeedback(0);
                    SearchRow.this.mo65616h();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRow$c */
    /* loaded from: classes5.dex */
    final class RunnableC11800c implements Runnable {
        RunnableC11800c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchRow searchRow = SearchRow.this;
            if (searchRow.f61368w == null) {
                searchRow.f61368w = new RunnableC11799b();
            }
            SearchRow searchRow2 = SearchRow.this;
            RunnableC11799b runnableC11799b = searchRow2.f61368w;
            int i11 = searchRow2.f61369x + 1;
            searchRow2.f61369x = i11;
            runnableC11799b.f61373p = i11;
            searchRow2.postDelayed(runnableC11799b, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
        }
    }

    public SearchRow(Context context) {
        super(context);
        this.f61364s = AbstractC17466e.transparent;
        this.f61365t = 0;
        this.f61366u = 0;
        this.f61367v = false;
        this.f61368w = null;
        this.f61369x = 0;
        this.f61370y = null;
        this.f61371z = this;
        this.f61359A = 0.0f;
        this.f61360B = false;
        this.f61361C = false;
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m65612g(ValueAnimator valueAnimator) {
        this.f61359A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m65613d() {
        this.f61367v = false;
        RunnableC11799b runnableC11799b = this.f61368w;
        if (runnableC11799b != null) {
            removeCallbacks(runnableC11799b);
        }
        RunnableC11800c runnableC11800c = this.f61370y;
        if (runnableC11800c != null) {
            removeCallbacks(runnableC11800c);
        }
    }

    /* renamed from: e */
    public void mo65614e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m65615f(Canvas canvas) {
        try {
            if (this.f61360B) {
                Drawable drawable = this.f61362q;
                if (drawable != null) {
                    drawable.setAlpha((int) (this.f61359A * 255.0f));
                    this.f61362q.setBounds(0, 0, this.f61371z.getWidth(), this.f61371z.getHeight());
                    this.f61362q.draw(canvas);
                }
                Drawable drawable2 = this.f61363r;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.f61359A * 255.0f));
                    this.f61363r.setBounds(0, 0, this.f61365t, this.f61366u);
                    canvas.save();
                    canvas.translate((this.f61371z.getWidth() / 2.0f) - (this.f61365t / 2.0f), (this.f61371z.getHeight() / 2.0f) - (this.f61366u / 2.0f));
                    this.f61363r.draw(canvas);
                    canvas.restore();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public void mo65616h() {
    }

    /* renamed from: i */
    public void m65617i(int i11, Drawable drawable, Drawable drawable2) {
        this.f61363r = drawable2;
        this.f61364s = i11;
        this.f61362q = drawable;
        if (drawable2 != null) {
            this.f61365t = drawable2.getIntrinsicWidth();
            this.f61366u = this.f61363r.getIntrinsicHeight();
        }
        AbstractC23136l9.m118693a1(this.f61371z, this.f61364s);
    }

    /* renamed from: j */
    public void m65618j() {
        try {
            if (!this.f61361C) {
                this.f61360B = false;
                return;
            }
            this.f61360B = true;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: s60.k
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SearchRow.this.m65612g(valueAnimator);
                }
            };
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(animatorUpdateListener);
            ofFloat.setDuration(400L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(animatorUpdateListener);
            ofFloat2.setDuration(400L);
            ofFloat2.setStartDelay(100L);
            animatorSet.addListener(new C11798a());
            animatorSet.playSequentially(ofFloat, ofFloat2);
            animatorSet.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m65619k() {
        if (this.f61367v) {
            return;
        }
        this.f61367v = true;
        if (this.f61370y == null) {
            this.f61370y = new RunnableC11800c();
        }
        postDelayed(this.f61370y, ViewConfiguration.getTapTimeout());
    }

    public void setEnableAnimOverlay(boolean z11) {
        this.f61361C = z11;
    }
}
