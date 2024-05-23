package com.zing.zalo.p077ui.widget.draggridview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import java.util.LinkedList;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class DragGridView extends GridView {

    /* renamed from: A */
    WindowManager.LayoutParams f70202A;

    /* renamed from: B */
    Bitmap f70203B;

    /* renamed from: C */
    int f70204C;

    /* renamed from: D */
    int f70205D;

    /* renamed from: E */
    int f70206E;

    /* renamed from: F */
    int f70207F;

    /* renamed from: G */
    int f70208G;

    /* renamed from: H */
    int f70209H;

    /* renamed from: I */
    int f70210I;

    /* renamed from: J */
    boolean f70211J;

    /* renamed from: K */
    int f70212K;

    /* renamed from: L */
    int f70213L;

    /* renamed from: M */
    boolean f70214M;

    /* renamed from: N */
    int f70215N;

    /* renamed from: O */
    int f70216O;

    /* renamed from: P */
    Handler f70217P;

    /* renamed from: Q */
    Runnable f70218Q;

    /* renamed from: R */
    Runnable f70219R;

    /* renamed from: p */
    long f70220p;

    /* renamed from: q */
    boolean f70221q;

    /* renamed from: r */
    int f70222r;

    /* renamed from: s */
    int f70223s;

    /* renamed from: t */
    int f70224t;

    /* renamed from: u */
    int f70225u;

    /* renamed from: v */
    int f70226v;

    /* renamed from: w */
    View f70227w;

    /* renamed from: x */
    ImageView f70228x;

    /* renamed from: y */
    Vibrator f70229y;

    /* renamed from: z */
    WindowManager f70230z;

    /* renamed from: com.zing.zalo.ui.widget.draggridview.DragGridView$a */
    /* loaded from: classes6.dex */
    class RunnableC13614a implements Runnable {
        RunnableC13614a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC23647d.m123906p("15021");
                AbstractC23647d.m123893c();
                DragGridView dragGridView = DragGridView.this;
                dragGridView.f70221q = true;
                dragGridView.f70229y.vibrate(50L);
                DragGridView dragGridView2 = DragGridView.this;
                dragGridView2.m76186b(dragGridView2.f70203B, dragGridView2.f70222r, dragGridView2.f70223s);
                DragGridView.this.f70227w.setVisibility(4);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.draggridview.DragGridView$b */
    /* loaded from: classes6.dex */
    class RunnableC13615b implements Runnable {
        RunnableC13615b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0024, B:9:0x002e, B:10:0x004e, B:14:0x0038, B:16:0x003c, B:17:0x0046, B:18:0x001b), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:2:0x0000, B:4:0x0008, B:7:0x0024, B:9:0x002e, B:10:0x004e, B:14:0x0038, B:16:0x003c, B:17:0x0046, B:18:0x001b), top: B:1:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            DragGridView dragGridView;
            int i11;
            int i12;
            try {
                if (DragGridView.this.getFirstVisiblePosition() != 0) {
                    if (DragGridView.this.getLastVisiblePosition() == DragGridView.this.getCount() - 1) {
                    }
                    dragGridView = DragGridView.this;
                    i11 = dragGridView.f70225u;
                    if (i11 <= dragGridView.f70210I) {
                        dragGridView.f70217P.postDelayed(dragGridView.f70219R, 25L);
                        i12 = 20;
                    } else if (i11 < dragGridView.f70209H) {
                        dragGridView.f70217P.postDelayed(dragGridView.f70219R, 25L);
                        i12 = -20;
                    } else {
                        dragGridView.f70217P.removeCallbacks(dragGridView.f70219R);
                        i12 = 0;
                    }
                    DragGridView.this.smoothScrollBy(i12, 10);
                }
                DragGridView dragGridView2 = DragGridView.this;
                dragGridView2.f70217P.removeCallbacks(dragGridView2.f70219R);
                dragGridView = DragGridView.this;
                i11 = dragGridView.f70225u;
                if (i11 <= dragGridView.f70210I) {
                }
                DragGridView.this.smoothScrollBy(i12, 10);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.draggridview.DragGridView$c */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnPreDrawListenerC13616c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ ViewTreeObserver f70233p;

        /* renamed from: q */
        final /* synthetic */ int f70234q;

        ViewTreeObserverOnPreDrawListenerC13616c(ViewTreeObserver viewTreeObserver, int i11) {
            this.f70233p = viewTreeObserver;
            this.f70234q = i11;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f70233p.removeOnPreDrawListener(this);
            DragGridView dragGridView = DragGridView.this;
            dragGridView.m76185a(dragGridView.f70226v, this.f70234q);
            DragGridView.this.f70226v = this.f70234q;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.draggridview.DragGridView$d */
    /* loaded from: classes6.dex */
    public class C13617d extends AnimatorListenerAdapter {
        C13617d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DragGridView.this.f70211J = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DragGridView.this.f70211J = false;
        }
    }

    public DragGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70220p = 1000L;
        this.f70221q = false;
        this.f70227w = null;
        this.f70211J = true;
        this.f70217P = new Handler();
        this.f70218Q = new RunnableC13614a();
        this.f70219R = new RunnableC13615b();
        this.f70229y = (Vibrator) context.getSystemService("vibrator");
        this.f70230z = (WindowManager) context.getSystemService("window");
        this.f70208G = AbstractC23136l9.m118737p0();
        if (!this.f70214M) {
            this.f70212K = -1;
        }
    }

    /* renamed from: a */
    void m76185a(int i11, int i12) {
        boolean z11;
        if (i12 > i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (z11) {
                while (i11 < i12) {
                    View childAt = getChildAt(i11 - getFirstVisiblePosition());
                    i11++;
                    if (i11 % this.f70212K == 0) {
                        if (childAt != null) {
                            linkedList.add(m76187c(childAt, (-(childAt.getWidth() + this.f70215N)) * (this.f70212K - 1), 0.0f, childAt.getHeight() + this.f70216O, 0.0f));
                        }
                    } else if (childAt != null) {
                        linkedList.add(m76187c(childAt, childAt.getWidth() + this.f70215N, 0.0f, 0.0f, 0.0f));
                    }
                }
            } else {
                while (i11 > i12) {
                    View childAt2 = getChildAt(i11 - getFirstVisiblePosition());
                    if (i11 % this.f70212K == 0) {
                        if (childAt2 != null) {
                            linkedList.add(m76187c(childAt2, (childAt2.getWidth() + this.f70215N) * (this.f70212K - 1), 0.0f, (-childAt2.getHeight()) - this.f70216O, 0.0f));
                        }
                    } else if (childAt2 != null) {
                        linkedList.add(m76187c(childAt2, (-childAt2.getWidth()) - this.f70215N, 0.0f, 0.0f, 0.0f));
                    }
                    i11--;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(linkedList);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.addListener(new C13617d());
            animatorSet.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    void m76186b(Bitmap bitmap, int i11, int i12) {
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f70202A = layoutParams;
            layoutParams.format = -3;
            layoutParams.gravity = 51;
            layoutParams.x = (i11 - this.f70205D) + this.f70207F;
            layoutParams.y = ((i12 - this.f70204C) + this.f70206E) - this.f70208G;
            layoutParams.alpha = 0.55f;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.flags = 24;
            ImageView imageView = new ImageView(getContext());
            this.f70228x = imageView;
            imageView.setImageBitmap(bitmap);
            this.f70230z.addView(this.f70228x, this.f70202A);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    AnimatorSet m76187c(View view, float f11, float f12, float f13, float f14) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", f11, f12);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", f13, f14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* renamed from: d */
    boolean m76188d(View view, int i11, int i12) {
        if (view == null) {
            return false;
        }
        try {
            int left = view.getLeft();
            int top = view.getTop();
            if (i11 < left || i11 > left + view.getWidth() || i12 < top) {
                return false;
            }
            if (i12 > top + view.getHeight()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (!m76188d(this.f70227w, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            this.f70217P.removeCallbacks(this.f70218Q);
                        }
                    }
                } else {
                    this.f70217P.removeCallbacks(this.f70218Q);
                    this.f70217P.removeCallbacks(this.f70219R);
                    if (this.f70221q && this.f70228x != null) {
                        m76190f();
                        this.f70221q = false;
                    }
                }
            } else {
                this.f70222r = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                this.f70223s = y11;
                int pointToPosition = pointToPosition(this.f70222r, y11);
                this.f70226v = pointToPosition;
                if (pointToPosition == -1) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                this.f70217P.postDelayed(this.f70218Q, this.f70220p);
                View childAt = getChildAt(this.f70226v - getFirstVisiblePosition());
                this.f70227w = childAt;
                this.f70204C = this.f70223s - childAt.getTop();
                this.f70205D = this.f70222r - this.f70227w.getLeft();
                this.f70206E = (int) (motionEvent.getRawY() - this.f70223s);
                this.f70207F = (int) (motionEvent.getRawX() - this.f70222r);
                this.f70209H = getHeight() / 5;
                this.f70210I = (getHeight() * 4) / 5;
                this.f70227w.setDrawingCacheEnabled(true);
                this.f70203B = Bitmap.createBitmap(this.f70227w.getDrawingCache());
                this.f70227w.destroyDrawingCache();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    void m76189e(int i11, int i12) {
        try {
            WindowManager.LayoutParams layoutParams = this.f70202A;
            layoutParams.x = (i11 - this.f70205D) + this.f70207F;
            layoutParams.y = ((i12 - this.f70204C) + this.f70206E) - this.f70208G;
            this.f70230z.updateViewLayout(this.f70228x, layoutParams);
            m76191g(i11, i12);
            this.f70217P.post(this.f70219R);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    void m76190f() {
        try {
            View childAt = getChildAt(this.f70226v - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setVisibility(0);
            }
            throw null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    void m76191g(int i11, int i12) {
        try {
            int pointToPosition = pointToPosition(i11, i12);
            if (pointToPosition != this.f70226v && pointToPosition != -1 && this.f70211J) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC13616c(viewTreeObserver, pointToPosition));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            if (getParent() != null && getAdapter() != null && getAdapter().getCount() > 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent != null && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) && getParent() != null)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        try {
            if (this.f70212K == -1) {
                if (this.f70213L > 0) {
                    int max = Math.max((View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight(), 0);
                    int i14 = max / this.f70213L;
                    i13 = 1;
                    if (i14 > 0) {
                        while (i14 != 1 && (this.f70213L * i14) + ((i14 - 1) * this.f70215N) > max) {
                            i14--;
                        }
                        i13 = i14;
                    }
                } else {
                    i13 = 2;
                }
                this.f70212K = i13;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f70221q && this.f70228x != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    this.f70224t = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    this.f70225u = y11;
                    m76189e(this.f70224t, y11);
                }
            } else {
                m76190f();
                this.f70221q = false;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.GridView
    public void setColumnWidth(int i11) {
        super.setColumnWidth(i11);
        this.f70213L = i11;
    }

    @Override // android.widget.GridView
    public void setHorizontalSpacing(int i11) {
        super.setHorizontalSpacing(i11);
        this.f70215N = i11;
    }

    @Override // android.widget.GridView
    public void setNumColumns(int i11) {
        super.setNumColumns(i11);
        this.f70214M = true;
        this.f70212K = i11;
    }

    @Override // android.widget.GridView
    public void setVerticalSpacing(int i11) {
        super.setVerticalSpacing(i11);
        this.f70216O = i11;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        throw new IllegalStateException("the adapter must be implements DragGridAdapter");
    }
}
