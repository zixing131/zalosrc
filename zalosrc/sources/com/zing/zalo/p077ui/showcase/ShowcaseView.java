package com.zing.zalo.p077ui.showcase;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.zview.AbstractC17454d;
import hu.AbstractC20130d;
import java.io.File;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p354n3.C23528a;
import p588vw.C28652r;
import p620wt.AbstractC29226a;
import sa0.C26203c;
import sa0.EnumC26201a;
import sa0.EnumC26202b;
import sa0.RunnableC26206f;
import vg.C28212v6;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class ShowcaseView extends FrameLayout implements InterfaceC13305a {

    /* renamed from: A */
    String f68314A;

    /* renamed from: B */
    C23528a f68315B;

    /* renamed from: C */
    C13306b f68316C;

    /* renamed from: D */
    Handler f68317D;

    /* renamed from: E */
    final int f68318E;

    /* renamed from: F */
    final int f68319F;

    /* renamed from: G */
    Rect f68320G;

    /* renamed from: H */
    EnumC26202b f68321H;

    /* renamed from: I */
    Paint f68322I;

    /* renamed from: J */
    boolean f68323J;

    /* renamed from: K */
    Animator f68324K;

    /* renamed from: L */
    boolean f68325L;

    /* renamed from: M */
    ViewTreeObserver.OnGlobalLayoutListener f68326M;

    /* renamed from: N */
    ViewTreeObserver.OnScrollChangedListener f68327N;

    /* renamed from: O */
    long f68328O;

    /* renamed from: P */
    int f68329P;

    /* renamed from: p */
    Bitmap f68330p;

    /* renamed from: q */
    Canvas f68331q;

    /* renamed from: r */
    Paint f68332r;

    /* renamed from: s */
    View f68333s;

    /* renamed from: t */
    View f68334t;

    /* renamed from: u */
    View f68335u;

    /* renamed from: v */
    ImageView f68336v;

    /* renamed from: w */
    View f68337w;

    /* renamed from: x */
    C26203c f68338x;

    /* renamed from: y */
    InterfaceC13298d f68339y;

    /* renamed from: z */
    Drawable f68340z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.showcase.ShowcaseView$a */
    /* loaded from: classes6.dex */
    public class C13295a implements Handler.Callback {
        C13295a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ShowcaseView.this.m74639u();
                        ShowcaseView showcaseView = ShowcaseView.this;
                        if (!showcaseView.f68323J) {
                            showcaseView.f68317D.sendEmptyMessageDelayed(2, 10L);
                        }
                    }
                } else {
                    ShowcaseView.this.m74639u();
                }
            } else {
                ShowcaseView.this.m74628f(2, false, true);
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.ShowcaseView$b */
    /* loaded from: classes6.dex */
    public class C13296b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f68342p;

        C13296b(Runnable runnable) {
            this.f68342p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Runnable runnable = this.f68342p;
            if (runnable != null) {
                runnable.run();
            }
            ShowcaseView.this.f68325L = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.ShowcaseView$c */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C13297c {

        /* renamed from: a */
        static final /* synthetic */ int[] f68344a;

        static {
            int[] iArr = new int[EnumC26202b.values().length];
            f68344a = iArr;
            try {
                iArr[EnumC26202b.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68344a[EnumC26202b.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68344a[EnumC26202b.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68344a[EnumC26202b.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.showcase.ShowcaseView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13298d {
        /* renamed from: a */
        void mo39159a(ShowcaseView showcaseView, int i11, int i12, boolean z11);
    }

    public ShowcaseView(Context context) {
        super(context);
        this.f68314A = null;
        this.f68317D = new Handler(Looper.getMainLooper(), new C13295a());
        this.f68318E = AbstractC23136l9.m118742r(100.0f);
        this.f68319F = AbstractC23136l9.m118742r(4.0f);
        this.f68320G = new Rect();
        this.f68323J = false;
        this.f68324K = null;
        this.f68325L = false;
        this.f68326M = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sa0.g
            public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC26207g() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ShowcaseView.this.m74639u();
            }
        };
        this.f68327N = new ViewTreeObserver.OnScrollChangedListener() { // from class: sa0.h
            public /* synthetic */ ViewTreeObserverOnScrollChangedListenerC26208h() {
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ShowcaseView.this.m74639u();
            }
        };
        this.f68328O = 0L;
        this.f68329P = 0;
        Paint paint = new Paint(1);
        this.f68332r = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (this.f68338x == null) {
            this.f68338x = new C26203c();
        }
        this.f68315B = new C23528a(getContext());
        setElevation(getResources().getDimension(AbstractC17454d.tip_elevation));
    }

    /* renamed from: h */
    private View m74622h(int i11) {
        if (TextUtils.isEmpty(this.f68338x.f124515f)) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        int m118742r = AbstractC23136l9.m118742r(12.0f);
        this.f68338x.f124520k = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_80);
        linearLayout.setPadding(m118742r, m118742r, m118742r, m118742r);
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        robotoTextView.setText(C28652r.m143349v().m143357H(this.f68338x.f124515f));
        robotoTextView.setTextColor(this.f68338x.f124517h);
        robotoTextView.setGravity(this.f68338x.f124519j);
        robotoTextView.setTextSize(1, this.f68338x.f124518i);
        robotoTextView.setMaxWidth(i11);
        linearLayout.addView(robotoTextView, new LinearLayout.LayoutParams(-2, -2));
        if (!TextUtils.isEmpty(this.f68338x.f124516g)) {
            RobotoTextView robotoTextView2 = new RobotoTextView(getContext());
            robotoTextView2.setText(C28652r.m143349v().m143357H(this.f68338x.f124516g));
            robotoTextView2.setTextColor(this.f68338x.f124520k);
            robotoTextView2.setGravity(this.f68338x.f124522m);
            robotoTextView2.setTextSize(1, this.f68338x.f124521l);
            robotoTextView2.setMaxWidth(i11);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = AbstractC23222t7.f112552c;
            linearLayout.addView(robotoTextView2, layoutParams);
        }
        if (this.f68338x.f124504A) {
            RobotoTextView robotoTextView3 = new RobotoTextView(getContext());
            robotoTextView3.setText(getResources().getString(AbstractC8020f0.str_tip_banner_got_it));
            robotoTextView3.setTextColor(this.f68338x.f124517h);
            robotoTextView3.setGravity(8388613);
            robotoTextView3.setTextSize(1, 16.0f);
            robotoTextView3.setTextStyleBold(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = AbstractC23222t7.f112586t;
            linearLayout.addView(robotoTextView3, layoutParams2);
            this.f68337w = robotoTextView3;
        }
        return linearLayout;
    }

    /* renamed from: k */
    public /* synthetic */ void m74623k(int i11, boolean z11, boolean z12) {
        C13306b c13306b;
        m74633m();
        InterfaceC13298d interfaceC13298d = this.f68339y;
        if (interfaceC13298d != null) {
            interfaceC13298d.mo39159a(this, i11, this.f68329P, z11);
        }
        if (z12 && (c13306b = this.f68316C) != null) {
            c13306b.m74708t();
        }
    }

    @Override // com.zing.zalo.p077ui.showcase.InterfaceC13305a
    /* renamed from: a */
    public boolean mo74624a() {
        return this.f68335u != null;
    }

    @Override // com.zing.zalo.p077ui.showcase.InterfaceC13305a
    /* renamed from: b */
    public void mo74625b() {
        m74628f(0, false, false);
    }

    /* renamed from: d */
    public void m74626d() {
        m74627e(3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        View view;
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            View view2 = this.f68333s;
            if (view2 != null) {
                int i11 = iArr[1];
                view2.getLocationOnScreen(iArr);
                iArr[1] = iArr[1] - i11;
            }
            Drawable drawable = null;
            if (this.f68320G != null) {
                C26203c c26203c = this.f68338x;
                if (c26203c.f124510a != 0 && c26203c.f124530u != null) {
                    if (this.f68322I == null) {
                        Paint paint = new Paint(1);
                        this.f68322I = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    this.f68322I.setColor(this.f68338x.f124510a);
                    C26203c c26203c2 = this.f68338x;
                    EnumC26201a enumC26201a = c26203c2.f124530u;
                    EnumC26201a enumC26201a2 = EnumC26201a.RECTANGLE;
                    if (enumC26201a != enumC26201a2 && enumC26201a != EnumC26201a.CIRCLE) {
                        canvas.drawColor(c26203c2.f124510a);
                    }
                    int i12 = this.f68320G.left;
                    int i13 = this.f68338x.f124525p;
                    RectF rectF = new RectF(i12 - i13, r1.top - i13, r1.right + i13, r1.bottom + i13);
                    if (this.f68331q == null) {
                        if (this.f68330p == null) {
                            this.f68330p = Bitmap.createBitmap((int) Math.ceil(rectF.width()), (int) Math.ceil(rectF.height()), Bitmap.Config.ARGB_4444);
                        }
                        Canvas canvas2 = new Canvas(this.f68330p);
                        this.f68331q = canvas2;
                        canvas2.drawColor(this.f68338x.f124510a);
                        EnumC26201a enumC26201a3 = this.f68338x.f124530u;
                        if (enumC26201a3 == enumC26201a2) {
                            RectF rectF2 = new RectF(0.0f, 0.0f, this.f68331q.getWidth(), this.f68331q.getHeight());
                            Canvas canvas3 = this.f68331q;
                            int i14 = this.f68338x.f124526q;
                            canvas3.drawRoundRect(rectF2, i14, i14, this.f68332r);
                        } else if (enumC26201a3 == EnumC26201a.CIRCLE) {
                            this.f68331q.drawCircle(this.f68331q.getWidth() / 2.0f, this.f68331q.getHeight() / 2.0f, (Math.min(rectF.width(), rectF.height()) / 2.0f) + this.f68338x.f124525p, this.f68332r);
                        }
                    }
                    Bitmap bitmap = this.f68330p;
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, rectF.left, rectF.top, (Paint) null);
                    }
                    canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), rectF.top, this.f68322I);
                    canvas.drawRect(0.0f, rectF.bottom, canvas.getWidth(), canvas.getHeight(), this.f68322I);
                    canvas.drawRect(0.0f, rectF.top, rectF.left, rectF.bottom, this.f68322I);
                    canvas.drawRect(rectF.right, rectF.top, canvas.getWidth(), rectF.bottom, this.f68322I);
                }
            }
            C26203c c26203c3 = this.f68338x;
            if (c26203c3.f124530u == EnumC26201a.NONE && c26203c3.f124510a != 0) {
                Drawable drawable2 = this.f68340z;
                if (drawable2 != null) {
                    drawable = drawable2;
                } else {
                    View view3 = this.f68333s;
                    if (view3 instanceof ImageView) {
                        drawable = ((ImageView) view3).getDrawable();
                    }
                }
                if (drawable != null && (view = this.f68333s) != null) {
                    int width = iArr[0] + (view.getWidth() / 2);
                    int height = iArr[1] + (this.f68333s.getHeight() / 2);
                    drawable.setBounds(width - (drawable.getIntrinsicWidth() / 2), height - (drawable.getIntrinsicHeight() / 2), width + (drawable.getIntrinsicWidth() / 2), height + (drawable.getIntrinsicHeight() / 2));
                    drawable.draw(canvas);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public void m74627e(int i11) {
        m74628f(i11, false, true);
    }

    /* renamed from: f */
    void m74628f(int i11, boolean z11, boolean z12) {
        if (!this.f68323J && getParent() != null) {
            this.f68323J = true;
            RunnableC26206f runnableC26206f = new Runnable() { // from class: sa0.f

                /* renamed from: q */
                public final /* synthetic */ int f124541q;

                /* renamed from: r */
                public final /* synthetic */ boolean f124542r;

                /* renamed from: s */
                public final /* synthetic */ boolean f124543s;

                public /* synthetic */ RunnableC26206f(int i112, boolean z112, boolean z122) {
                    r2 = i112;
                    r3 = z112;
                    r4 = z122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ShowcaseView.this.m74623k(r2, r3, r4);
                }
            };
            Animator animator = this.f68324K;
            if (animator != null && animator.isRunning()) {
                this.f68324K.end();
            }
            Animator m74629g = m74629g(false, runnableC26206f);
            this.f68324K = m74629g;
            if (m74629g != null) {
                m74629g.start();
            } else {
                runnableC26206f.run();
            }
            View view = this.f68333s;
            if (view != null && view.getViewTreeObserver() != null) {
                this.f68333s.getViewTreeObserver().removeOnGlobalLayoutListener(this.f68326M);
                this.f68333s.getViewTreeObserver().removeOnScrollChangedListener(this.f68327N);
            }
        }
    }

    /* renamed from: g */
    Animator m74629g(boolean z11, Runnable runnable) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z11) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f));
        }
        animatorSet.setDuration(200L);
        animatorSet.addListener(new C13296b(runnable));
        this.f68325L = z11;
        return animatorSet;
    }

    public C26203c getConfigs() {
        return this.f68338x;
    }

    public String getShowcaseId() {
        return this.f68314A;
    }

    public View getShowcaseView() {
        return this.f68335u;
    }

    public View getTargetView() {
        return this.f68333s;
    }

    /* renamed from: i */
    boolean m74630i(float f11, float f12, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (f11 <= i11 || f11 >= i11 + view.getWidth() || f12 <= i12 || f12 >= i12 + view.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    boolean m74631j() {
        C26203c c26203c;
        int i11;
        int i12;
        View view = this.f68333s;
        if (view == null || view.getParent() == null) {
            return false;
        }
        boolean isShown = this.f68333s.isShown();
        if (isShown && (c26203c = this.f68338x) != null && c26203c.f124528s != null) {
            m74640v();
            View view2 = (View) this.f68333s.getParent();
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            int width = view2.getWidth() + i13;
            int height = view2.getHeight() + i14;
            EnumC26202b enumC26202b = this.f68321H;
            if (enumC26202b == EnumC26202b.TOP) {
                Rect rect = this.f68320G;
                if (rect.left > width || rect.right < i13 || (i12 = rect.top) > height || i12 < i14) {
                    return false;
                }
            } else if (enumC26202b == EnumC26202b.BOTTOM) {
                Rect rect2 = this.f68320G;
                if (rect2.left > width || rect2.right < i13 || (i11 = rect2.bottom) > height || i11 < i14) {
                    return false;
                }
            } else {
                Rect rect3 = this.f68320G;
                if (rect3.left > width || rect3.right < i13 || rect3.top > height || rect3.bottom < i14) {
                    return false;
                }
            }
        }
        return isShown;
    }

    /* renamed from: l */
    void m74632l(ZSimpleGIFView zSimpleGIFView, String str, String str2, int i11, int i12) {
        if (zSimpleGIFView != null) {
            zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str, str2, i11, i12, "ShowcaseView"), 0, null);
            zSimpleGIFView.m88224g(100L);
        }
    }

    /* renamed from: m */
    public void m74633m() {
        long j11;
        this.f68317D.removeMessages(0);
        this.f68317D.removeMessages(2);
        if (this.f68328O > 0) {
            j11 = System.currentTimeMillis() - this.f68328O;
        } else {
            j11 = 0;
        }
        this.f68329P = (int) (this.f68329P + j11);
        this.f68328O = 0L;
        setVisibility(4);
    }

    /* renamed from: n */
    public void m74634n() {
        m74633m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f68333s;
        if (view != null && view.getViewTreeObserver() != null) {
            this.f68333s.getViewTreeObserver().addOnGlobalLayoutListener(this.f68326M);
            this.f68333s.getViewTreeObserver().addOnScrollChangedListener(this.f68327N);
        }
        this.f68329P = 0;
        m74636q();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i11 = configuration.orientation;
        if (i11 == 2 || i11 == 1) {
            this.f68331q = null;
            Bitmap bitmap = this.f68330p;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f68330p.recycle();
            }
            this.f68330p = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f68331q != null) {
            this.f68331q = null;
        }
        Bitmap bitmap = this.f68330p;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                this.f68330p.recycle();
            }
            this.f68330p = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m74639u();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean m74630i = m74630i(motionEvent.getRawX(), motionEvent.getRawY(), this.f68335u);
        boolean m74638s = m74638s(motionEvent.getRawX(), motionEvent.getRawY());
        if (!m74638s && !m74630i) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f68337w != null && m74630i(motionEvent.getRawX(), motionEvent.getRawY(), this.f68337w)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m74638s) {
            m74628f(1, true, true);
            return super.onTouchEvent(motionEvent);
        }
        if (m74630i) {
            if (this.f68338x.f124534y) {
                m74628f(1, false, true);
            }
            if (this.f68338x.f124535z && z12) {
                m74628f(1, false, true);
            }
            return true;
        }
        if (z11) {
            if (this.f68338x.f124533x) {
                m74628f(1, false, true);
            }
            if (this.f68338x.f124510a != 0) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void m74635p() {
        m74636q();
    }

    /* renamed from: q */
    public void m74636q() {
        this.f68317D.removeMessages(0);
        this.f68328O = System.currentTimeMillis();
        C26203c c26203c = this.f68338x;
        if (c26203c != null) {
            C28212v6 c28212v6 = c26203c.f124532w;
            if (c28212v6 != null && c28212v6.f131593s) {
                this.f68317D.sendEmptyMessageDelayed(0, (c28212v6.f131592r * 1000) - this.f68329P);
            }
            if (this.f68338x.f124506C) {
                this.f68317D.sendEmptyMessageDelayed(2, 10L);
            }
        }
        setVisibility(0);
    }

    /* renamed from: r */
    public void m74637r() {
        this.f68323J = false;
        C13306b c13306b = this.f68316C;
        if (c13306b != null) {
            c13306b.m74692H(this);
        }
        Animator animator = this.f68324K;
        if (animator != null && animator.isRunning()) {
            this.f68324K.end();
        }
        if (m74631j()) {
            Animator m74629g = m74629g(true, null);
            this.f68324K = m74629g;
            if (m74629g != null) {
                m74629g.start();
                return;
            }
            return;
        }
        m74633m();
    }

    /* renamed from: s */
    boolean m74638s(float f11, float f12) {
        int i11;
        int i12;
        int width;
        int height;
        Rect rect;
        View view = this.f68333s;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        C26203c c26203c = this.f68338x;
        if (c26203c != null && (rect = c26203c.f124528s) != null && c26203c.f124529t) {
            i11 = iArr[0] + rect.left;
            i12 = iArr[1] + rect.top;
            width = rect.width() + i11;
            height = this.f68338x.f124528s.height();
        } else {
            i11 = iArr[0];
            i12 = iArr[1];
            width = this.f68333s.getWidth() + i11;
            height = this.f68333s.getHeight();
        }
        Rect rect2 = new Rect(i11, i12, width, height + i12);
        if (f11 <= rect2.left || f11 >= rect2.right || f12 <= rect2.top || f12 >= rect2.bottom) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196 A[Catch: Exception -> 0x0031, TryCatch #3 {Exception -> 0x0031, blocks: (B:31:0x001e, B:33:0x002e, B:36:0x003b, B:38:0x0041, B:41:0x0048, B:43:0x004e, B:45:0x0052, B:46:0x0063, B:48:0x0074, B:51:0x0196, B:53:0x01b1, B:54:0x01b7, B:55:0x01bc, B:58:0x01c5, B:61:0x01d0, B:64:0x01eb, B:66:0x01f1, B:67:0x01fb, B:70:0x01df, B:72:0x0083, B:84:0x00cc, B:87:0x00d4, B:89:0x00d8, B:91:0x00dc, B:92:0x00f1, B:94:0x0107, B:95:0x0116, B:97:0x0162, B:102:0x0186, B:105:0x0180, B:116:0x015e, B:118:0x00ed, B:100:0x016a, B:107:0x011e, B:109:0x013c, B:110:0x0148, B:112:0x014e, B:75:0x008b, B:77:0x00a9, B:78:0x00b5, B:80:0x00bb), top: B:30:0x001e, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setConfigs(C26203c c26203c) {
        LinearLayout linearLayout;
        RecyclingImageView recyclingImageView;
        C28212v6.a aVar;
        int i11;
        int m118742r;
        int i12;
        int i13;
        this.f68338x = c26203c;
        if (c26203c == null) {
            this.f68338x = new C26203c();
        }
        setTargetView(this.f68338x.f124524o);
        View view = this.f68338x.f124531v;
        if (view == null) {
            try {
                linearLayout = new LinearLayout(getContext());
                C28212v6 c28212v6 = this.f68338x.f124532w;
                recyclingImageView = null;
                if (c28212v6 != null) {
                    aVar = c28212v6.f131584j;
                } else {
                    aVar = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (aVar != null && aVar.m142172a()) {
                int i14 = aVar.f131596a;
                if (i14 == 1) {
                    int i15 = this.f68318E;
                    int i16 = aVar.f131598c;
                    if (i16 > 0 && aVar.f131599d > 0) {
                        i11 = AbstractC23136l9.m118742r(i16);
                        i12 = AbstractC23136l9.m118742r(aVar.f131599d);
                    } else {
                        i11 = i15;
                        i12 = i11;
                    }
                    ZSimpleGIFView zSimpleGIFView = new ZSimpleGIFView(getContext());
                    if (!TextUtils.isEmpty(aVar.f131597b)) {
                        m74632l(zSimpleGIFView, aVar.f131597b, "", aVar.f131598c, aVar.f131599d);
                    } else if (!TextUtils.isEmpty(aVar.f131600e)) {
                        try {
                            String str = aVar.f131600e;
                            File file = new File(AbstractC20130d.m104849P(), str.substring(str.lastIndexOf("/") + 1));
                            if (!AbstractC23041d2.m118194A(file.getAbsolutePath())) {
                                AbstractC29226a.m145976a(getContext(), aVar.f131600e, file);
                            }
                            if (file.exists()) {
                                m74632l(zSimpleGIFView, file.getAbsolutePath(), "", aVar.f131598c, aVar.f131599d);
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    recyclingImageView = zSimpleGIFView;
                    if (recyclingImageView != null) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i12);
                        layoutParams.gravity = 16;
                        int m118742r2 = AbstractC23136l9.m118742r(6.0f);
                        layoutParams.bottomMargin = m118742r2;
                        layoutParams.topMargin = m118742r2;
                        layoutParams.leftMargin = m118742r2;
                        if (TextUtils.isEmpty(this.f68338x.f124515f)) {
                            layoutParams.rightMargin = AbstractC23136l9.m118742r(6.0f);
                        }
                        linearLayout.addView(recyclingImageView, layoutParams);
                    }
                } else {
                    if (i14 == 0) {
                        int i17 = aVar.f131598c;
                        if (i17 > 0 && aVar.f131599d > 0) {
                            i11 = AbstractC23136l9.m118742r(i17);
                            i12 = AbstractC23136l9.m118742r(aVar.f131599d);
                        } else {
                            if (i17 == -2) {
                                int i18 = aVar.f131599d;
                            }
                            i11 = -2;
                            i12 = -2;
                        }
                        recyclingImageView = new RecyclingImageView(getContext());
                        recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        if (!TextUtils.isEmpty(aVar.f131597b)) {
                            ((C23528a) this.f68315B.m123612r(recyclingImageView)).m123616v(aVar.f131597b);
                        } else if (!TextUtils.isEmpty(aVar.f131600e)) {
                            try {
                                String str2 = aVar.f131600e;
                                File file2 = new File(AbstractC20130d.m104849P(), str2.substring(str2.lastIndexOf("/") + 1));
                                if (!AbstractC23041d2.m118194A(file2.getAbsolutePath())) {
                                    AbstractC29226a.m145976a(getContext(), aVar.f131600e, file2);
                                }
                                if (file2.exists()) {
                                    ((C23528a) this.f68315B.m123612r(recyclingImageView)).m123616v(file2.getAbsolutePath());
                                }
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                        } else if (!TextUtils.isEmpty(aVar.f131601f)) {
                            try {
                                i13 = getResources().getIdentifier(aVar.f131601f, "drawable", getContext().getPackageName());
                            } catch (Exception e14) {
                                e14.printStackTrace();
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                ((C23528a) this.f68315B.m123612r(recyclingImageView)).m123613s(i13);
                            }
                        }
                    } else {
                        i11 = -2;
                        i12 = -2;
                    }
                    if (recyclingImageView != null) {
                    }
                }
                e11.printStackTrace();
            } else {
                i11 = -2;
            }
            int i19 = this.f68338x.f124508E;
            if (i19 <= 0) {
                i19 = 270;
            }
            int m118742r3 = AbstractC23136l9.m118742r(i19);
            if (recyclingImageView != null && i11 > 0) {
                m118742r = (m118742r3 - (i11 + AbstractC23136l9.m118742r(6.0f))) - (AbstractC23136l9.m118742r(12.0f) * 2);
            } else {
                m118742r = m118742r3 - (AbstractC23136l9.m118742r(12.0f) * 2);
            }
            if (m118742r > 0) {
                m118742r3 = m118742r;
            }
            View m74622h = m74622h(m118742r3);
            if (m74622h != null) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                linearLayout.addView(m74622h, layoutParams2);
            }
            this.f68335u = linearLayout;
            linearLayout.setBackground(this.f68338x.f124514e);
        } else {
            this.f68335u = view;
        }
        View view2 = this.f68335u;
        if (view2 != null) {
            this.f68334t = view2.findViewById(AbstractC6918a0.showcase_button_next);
            if (this.f68335u.getLayoutParams() != null) {
                addView(this.f68335u);
            } else {
                addView(this.f68335u, new ViewGroup.LayoutParams(-2, -2));
            }
        }
        if (this.f68338x.f124512c != null) {
            if (this.f68336v == null) {
                ImageView imageView = new ImageView(getContext());
                this.f68336v = imageView;
                addView(imageView, 0, new ViewGroup.LayoutParams(-2, -2));
            }
            this.f68336v.setImageDrawable(this.f68338x.f124512c);
        }
        if (this.f68338x.f124523n) {
            setBackgroundColor(0);
            int m118742r4 = AbstractC23136l9.m118742r(8.0f);
            View view3 = this.f68335u;
            if (view3 != null) {
                view3.setElevation(m118742r4);
            }
            ImageView imageView2 = this.f68336v;
            if (imageView2 != null) {
                imageView2.setElevation(m118742r4);
            }
        }
        requestLayout();
    }

    public void setOnShowcaseFinishedListener(InterfaceC13298d interfaceC13298d) {
        this.f68339y = interfaceC13298d;
    }

    public void setShowcaseId(String str) {
        this.f68314A = str;
    }

    public void setShowcaseManager(C13306b c13306b) {
        this.f68316C = c13306b;
    }

    public void setTargetIconDrawable(Drawable drawable) {
        this.f68340z = drawable;
        requestLayout();
    }

    public void setTargetView(View view) {
        this.f68333s = view;
    }

    /* renamed from: u */
    public void m74639u() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        C26203c c26203c;
        EnumC26202b enumC26202b;
        try {
            m74641w();
            Animator animator = this.f68324K;
            if (animator != null && animator.isRunning() && !this.f68325L) {
                return;
            }
            int childCount = getChildCount();
            int width = getWidth();
            int height = getHeight();
            if (this.f68333s != null) {
                m74640v();
                Rect rect = this.f68320G;
                i12 = rect.left;
                i13 = rect.top;
                i11 = rect.width();
                i14 = this.f68320G.height();
                C26203c c26203c2 = this.f68338x;
                if (c26203c2 != null && c26203c2.f124505B) {
                    i11 = (int) (i11 * this.f68333s.getScaleX());
                    i14 = (int) (i11 * this.f68333s.getScaleY());
                }
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (this.f68333s != null) {
                i16 = width - (i12 + i11);
                i15 = height - (i13 + i14);
                i18 = i12;
                i17 = i13;
            } else {
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
            }
            View view = this.f68335u;
            if (view != null) {
                i19 = view.getHeight();
            } else {
                i19 = 0;
            }
            View view2 = this.f68335u;
            if (view2 != null) {
                i21 = view2.getWidth();
            } else {
                i21 = 0;
            }
            if (this.f68335u != null) {
                EnumC26202b enumC26202b2 = this.f68321H;
                if (enumC26202b2 == EnumC26202b.TOP && i17 < i19) {
                    this.f68321H = null;
                } else if (enumC26202b2 == EnumC26202b.BOTTOM && i15 < i19) {
                    this.f68321H = null;
                } else if (enumC26202b2 == EnumC26202b.LEFT && i18 < i21) {
                    this.f68321H = null;
                } else if (enumC26202b2 == EnumC26202b.RIGHT && i16 < i21) {
                    this.f68321H = null;
                }
            }
            int i29 = 2;
            if (this.f68321H == null && (c26203c = this.f68338x) != null && (enumC26202b = c26203c.f124507D) != null) {
                int i31 = C13297c.f68344a[enumC26202b.ordinal()];
                if (i31 != 1) {
                    if (i31 != 2) {
                        if (i31 != 3) {
                            if (i31 == 4 && i21 > 0 && i16 > i21) {
                                this.f68321H = EnumC26202b.RIGHT;
                            }
                        } else if (i21 > 0 && i18 > i21) {
                            this.f68321H = EnumC26202b.LEFT;
                        }
                    } else if (i19 > 0 && i15 > i19) {
                        this.f68321H = EnumC26202b.BOTTOM;
                    }
                } else if (i19 > 0 && i17 > i19) {
                    this.f68321H = EnumC26202b.TOP;
                }
            }
            if (this.f68321H == null) {
                EnumC26202b enumC26202b3 = EnumC26202b.TOP;
                this.f68321H = enumC26202b3;
                if (i18 > 0 || i17 > 0 || i16 > 0 || i15 > 0) {
                    int max = Math.max(i17, i15);
                    if (max == i17) {
                        this.f68321H = enumC26202b3;
                    } else if (max == i15) {
                        this.f68321H = EnumC26202b.BOTTOM;
                    } else if (max == i18) {
                        this.f68321H = EnumC26202b.LEFT;
                    } else if (max == i16) {
                        this.f68321H = EnumC26202b.RIGHT;
                    }
                }
            }
            int i32 = 0;
            while (i32 < childCount) {
                View childAt = getChildAt(i32);
                if (childAt.getVisibility() == 8) {
                    i24 = childCount;
                } else {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    ImageView imageView = this.f68336v;
                    if (childAt == imageView) {
                        if (this.f68333s != null) {
                            EnumC26202b enumC26202b4 = this.f68321H;
                            if (enumC26202b4 == EnumC26202b.TOP) {
                                int i33 = i13 - measuredHeight;
                                C26203c c26203c3 = this.f68338x;
                                i28 = (i33 - c26203c3.f124525p) - c26203c3.f124513d;
                                i27 = ((i11 - measuredWidth) / i29) + i12;
                                imageView.setImageResource(AbstractC16803z.bubble_tooltip_arrowdown);
                            } else if (enumC26202b4 == EnumC26202b.BOTTOM) {
                                C26203c c26203c4 = this.f68338x;
                                i28 = i13 + i14 + c26203c4.f124525p + c26203c4.f124513d;
                                i27 = ((i11 - measuredWidth) / i29) + i12;
                                imageView.setImageResource(AbstractC16803z.bubble_tooltip_arrowup);
                            } else if (enumC26202b4 == EnumC26202b.LEFT) {
                                int i34 = i12 - measuredWidth;
                                C26203c c26203c5 = this.f68338x;
                                i27 = (i34 - c26203c5.f124525p) - c26203c5.f124513d;
                                i28 = ((i11 - measuredHeight) / i29) + i13;
                                imageView.setRotation(90.0f);
                            } else if (enumC26202b4 == EnumC26202b.RIGHT) {
                                C26203c c26203c6 = this.f68338x;
                                i27 = c26203c6.f124513d + i12 + i11 + c26203c6.f124525p;
                                i28 = ((i14 - measuredHeight) / i29) + i13;
                                imageView.setRotation(-90.0f);
                            }
                            i24 = childCount;
                            childAt.setTranslationX(i27);
                            childAt.setTranslationY(i28);
                        }
                        i24 = childCount;
                        i28 = 0;
                        i27 = 0;
                        childAt.setTranslationX(i27);
                        childAt.setTranslationY(i28);
                    } else {
                        if (childAt == this.f68335u) {
                            if (imageView != null) {
                                i22 = imageView.getMeasuredHeight();
                                i23 = this.f68336v.getMeasuredWidth();
                            } else {
                                i22 = 0;
                                i23 = 0;
                            }
                            if (this.f68333s != null) {
                                EnumC26202b enumC26202b5 = this.f68321H;
                                EnumC26202b enumC26202b6 = EnumC26202b.TOP;
                                if (enumC26202b5 != enumC26202b6) {
                                    i24 = childCount;
                                    if (enumC26202b5 != EnumC26202b.BOTTOM) {
                                        EnumC26202b enumC26202b7 = EnumC26202b.LEFT;
                                        if (enumC26202b5 == enumC26202b7 || enumC26202b5 == EnumC26202b.RIGHT) {
                                            i28 = ((i14 - measuredHeight) / 2) + i13;
                                            if (enumC26202b5 == enumC26202b7) {
                                                int i35 = i12 - measuredWidth;
                                                C26203c c26203c7 = this.f68338x;
                                                i27 = ((i35 - c26203c7.f124525p) - i23) - c26203c7.f124513d;
                                            } else {
                                                C26203c c26203c8 = this.f68338x;
                                                i27 = c26203c8.f124513d + i12 + i11 + c26203c8.f124525p + i23;
                                            }
                                            childAt.setTranslationX(i27);
                                            childAt.setTranslationY(i28);
                                        }
                                        i28 = 0;
                                        i27 = 0;
                                        childAt.setTranslationX(i27);
                                        childAt.setTranslationY(i28);
                                    }
                                } else {
                                    i24 = childCount;
                                }
                                if (enumC26202b5 == enumC26202b6) {
                                    int i36 = i13 - measuredHeight;
                                    C26203c c26203c9 = this.f68338x;
                                    i25 = (((i36 - c26203c9.f124525p) - i22) - c26203c9.f124513d) + 1;
                                } else {
                                    C26203c c26203c10 = this.f68338x;
                                    i25 = ((((i13 + i14) + c26203c10.f124525p) + i22) + c26203c10.f124513d) - 1;
                                }
                                int i37 = width - measuredWidth;
                                int i38 = ((i37 / 2) + layoutParams.leftMargin) - layoutParams.rightMargin;
                                if ((i11 / 2) + i12 < getMeasuredWidth() / 2) {
                                    if (i12 + measuredWidth > getMeasuredWidth()) {
                                        i38 = (width - layoutParams.rightMargin) - measuredWidth;
                                    } else {
                                        i38 = i12;
                                    }
                                } else if (i12 > getMeasuredWidth() / 2) {
                                    i38 = (i12 + i11) - measuredWidth;
                                    if (i38 + measuredWidth > getMeasuredWidth() || i38 < 0) {
                                        i38 = ((i37 / 2) + layoutParams.leftMargin) - layoutParams.rightMargin;
                                    }
                                }
                                if (i38 == 0) {
                                    i38 += this.f68319F;
                                } else if (i38 + measuredWidth == width) {
                                    i38 -= this.f68319F;
                                }
                                ImageView imageView2 = this.f68336v;
                                if (imageView2 != null) {
                                    int translationX = (int) imageView2.getTranslationX();
                                    int width2 = this.f68336v.getWidth() + translationX;
                                    int i39 = i38 + measuredWidth;
                                    int m155453a = AbstractC32232i.m155453a(10.0f);
                                    if (i39 - m155453a < width2) {
                                        i26 = i25;
                                        i27 = (width2 + m155453a) - measuredWidth;
                                    } else if (i38 + m155453a > translationX) {
                                        i26 = i25;
                                        i27 = translationX - m155453a;
                                    } else {
                                        int i41 = ((width2 - translationX) / 2) + translationX;
                                        if (i41 - (measuredWidth / 2) >= 0) {
                                            i26 = i25;
                                            if (i41 + (measuredWidth / 2) <= width) {
                                                i27 = i41 - (measuredWidth / 2);
                                                i28 = i26;
                                                childAt.setTranslationX(i27);
                                                childAt.setTranslationY(i28);
                                            }
                                        } else {
                                            i26 = i25;
                                        }
                                        if (i38 < translationX && translationX - i38 < m155453a) {
                                            int i42 = translationX - m155453a;
                                            if (i42 < 0) {
                                                i27 = 0;
                                            } else {
                                                i27 = i42;
                                            }
                                        } else if (i39 > width2 && i39 - width2 < m155453a) {
                                            int i43 = width2 + m155453a;
                                            if (i43 > width) {
                                                i43 = width;
                                            }
                                            i27 = i43 - measuredWidth;
                                        }
                                        i28 = i26;
                                        childAt.setTranslationX(i27);
                                        childAt.setTranslationY(i28);
                                    }
                                    i28 = i26;
                                    childAt.setTranslationX(i27);
                                    childAt.setTranslationY(i28);
                                } else {
                                    i26 = i25;
                                }
                                i27 = i38;
                                i28 = i26;
                                childAt.setTranslationX(i27);
                                childAt.setTranslationY(i28);
                            }
                        }
                        i24 = childCount;
                        i28 = 0;
                        i27 = 0;
                        childAt.setTranslationX(i27);
                        childAt.setTranslationY(i28);
                    }
                }
                i32++;
                childCount = i24;
                i29 = 2;
            }
            C26203c c26203c11 = this.f68338x;
            if (c26203c11 != null) {
                EnumC26201a enumC26201a = c26203c11.f124530u;
                if (enumC26201a == EnumC26201a.CIRCLE || enumC26201a == EnumC26201a.RECTANGLE) {
                    invalidate();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    void m74640v() {
        int i11;
        int i12;
        int width;
        int height;
        Rect rect;
        if (this.f68333s != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            this.f68333s.getLocationOnScreen(iArr2);
            C26203c c26203c = this.f68338x;
            if (c26203c != null && (rect = c26203c.f124528s) != null) {
                int i13 = iArr2[0] + rect.left;
                int i14 = iArr2[1] + rect.top;
                i11 = i13 - iArr[0];
                i12 = i14 - iArr[1];
                width = rect.width() + i11;
                height = this.f68338x.f124528s.height() + i12;
            } else {
                int i15 = iArr2[0];
                int i16 = iArr2[1];
                i11 = i15 - iArr[0];
                i12 = i16 - iArr[1];
                width = this.f68333s.getWidth() + i11;
                height = this.f68333s.getHeight() + i12;
                C26203c c26203c2 = this.f68338x;
                if (c26203c2 != null && c26203c2.f124527r) {
                    i11 += this.f68333s.getPaddingLeft();
                    i12 += this.f68333s.getPaddingTop();
                    width -= this.f68333s.getPaddingRight();
                    height -= this.f68333s.getPaddingBottom();
                }
            }
            this.f68320G.set(i11, i12, width, height);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m74641w() {
        boolean z11;
        if (this.f68333s != null) {
            if (m74631j()) {
                if (getVisibility() != 0) {
                    Animator animator = this.f68324K;
                    if (animator != null && animator.isRunning()) {
                        if (!this.f68325L) {
                            this.f68324K.end();
                        } else {
                            z11 = false;
                            setVisibility(0);
                            if (!z11) {
                                Animator m74629g = m74629g(true, new Runnable() { // from class: com.zing.zalo.ui.showcase.c
                                    public /* synthetic */ RunnableC13307c() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ShowcaseView.this.m74636q();
                                    }
                                });
                                this.f68324K = m74629g;
                                if (m74629g != null) {
                                    m74629g.start();
                                    return;
                                } else {
                                    m74636q();
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    z11 = true;
                    setVisibility(0);
                    if (!z11) {
                    }
                }
            } else if (getVisibility() == 0) {
                Animator animator2 = this.f68324K;
                if (animator2 != null && animator2.isRunning()) {
                    if (this.f68325L) {
                        this.f68324K.end();
                    } else {
                        return;
                    }
                }
                setVisibility(0);
                Animator m74629g2 = m74629g(false, new Runnable() { // from class: com.zing.zalo.ui.showcase.d
                    public /* synthetic */ RunnableC13308d() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShowcaseView.this.m74633m();
                    }
                });
                this.f68324K = m74629g2;
                if (m74629g2 != null) {
                    m74629g2.start();
                } else {
                    m74633m();
                }
            }
        }
    }
}
