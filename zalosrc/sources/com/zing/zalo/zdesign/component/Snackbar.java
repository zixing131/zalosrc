package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1617x0;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import mi0.C23314b;
import oi0.C24274b;
import p500s1.C26087b;
import ri0.C25808b;
import ui0.AbstractViewOnTouchListenerC27278e;
import ui0.C27276c;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class Snackbar implements InterfaceC16976f1 {
    public static final C16925c Companion = new C16925c(null);

    /* renamed from: J */
    private static Handler f86355J = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.zdesign.component.r0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m90626d;
            m90626d = Snackbar.m90626d(message);
            return m90626d;
        }
    });

    /* renamed from: A */
    private C0708i f86356A;

    /* renamed from: B */
    private WeakReference f86357B;

    /* renamed from: C */
    private WeakReference f86358C;

    /* renamed from: D */
    private float f86359D;

    /* renamed from: E */
    private EnumC16926d f86360E;

    /* renamed from: F */
    private boolean f86361F;

    /* renamed from: G */
    private final C24274b.a f86362G;

    /* renamed from: H */
    private final View.OnLayoutChangeListener f86363H;

    /* renamed from: I */
    private final AnimatorSet f86364I;

    /* renamed from: p */
    private ViewGroup f86365p;

    /* renamed from: q */
    private Context f86366q;

    /* renamed from: r */
    private SnackbarLayout f86367r;

    /* renamed from: s */
    private int f86368s;

    /* renamed from: t */
    private AbstractC16924b f86369t;

    /* renamed from: u */
    private int f86370u;

    /* renamed from: v */
    private int f86371v;

    /* renamed from: w */
    private long f86372w;

    /* renamed from: x */
    private boolean f86373x;

    /* renamed from: y */
    private C25808b f86374y;

    /* renamed from: z */
    private String f86375z;

    /* loaded from: classes7.dex */
    public static final class SnackbarLayout extends LinearLayout {
        public static final C16920a Companion = new C16920a(null);

        /* renamed from: p */
        private RobotoTextView f86376p;

        /* renamed from: q */
        private ButtonWithProgress f86377q;

        /* renamed from: r */
        private RecyclingImageView f86378r;

        /* renamed from: s */
        private ProgressBar f86379s;

        /* renamed from: t */
        private ProgressBar f86380t;

        /* renamed from: u */
        private int f86381u;

        /* renamed from: v */
        private int f86382v;

        /* renamed from: w */
        private InterfaceC16922c f86383w;

        /* renamed from: x */
        private InterfaceC16921b f86384x;

        /* renamed from: com.zing.zalo.zdesign.component.Snackbar$SnackbarLayout$a */
        /* loaded from: classes7.dex */
        public static final class C16920a {
            private C16920a() {
            }

            public /* synthetic */ C16920a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: com.zing.zalo.zdesign.component.Snackbar$SnackbarLayout$b */
        /* loaded from: classes7.dex */
        public interface InterfaceC16921b {
            void onViewAttachedToWindow(View view);

            void onViewDetachedFromWindow(View view);
        }

        /* renamed from: com.zing.zalo.zdesign.component.Snackbar$SnackbarLayout$c */
        /* loaded from: classes7.dex */
        public interface InterfaceC16922c {
            /* renamed from: a */
            void mo90665a(View view, int i11, int i12, int i13, int i14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.SnackbarLayout);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…styleable.SnackbarLayout)");
            this.f86381u = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.SnackbarLayout_android_maxWidth, C27276c.m139649b(context, 512));
            this.f86382v = obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(AbstractC2815i.SnackbarLayout_elevation)) {
                AbstractC1579n0.m7817I0(this, obtainStyledAttributes.getDimensionPixelSize(AbstractC2815i.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(AbstractC2812f.layout_snackbar_include, this);
            AbstractC1579n0.m7803B0(this, 1);
        }

        public final ButtonWithProgress getButtonAction() {
            return this.f86377q;
        }

        public final RecyclingImageView getIconView() {
            return this.f86378r;
        }

        public final int getMMaxInlineActionWidth() {
            return this.f86382v;
        }

        public final int getMMaxWidth() {
            return this.f86381u;
        }

        public final InterfaceC16921b getMOnAttachStateChangeListener() {
            return this.f86384x;
        }

        public final InterfaceC16922c getMOnLayoutChangeListener() {
            return this.f86383w;
        }

        public final RobotoTextView getMessageView() {
            return this.f86376p;
        }

        public final ProgressBar getProgressBar() {
            return this.f86380t;
        }

        public final ProgressBar getProgressLeading() {
            return this.f86379s;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            InterfaceC16921b interfaceC16921b = this.f86384x;
            if (interfaceC16921b != null) {
                AbstractC19074t.m100205c(interfaceC16921b);
                interfaceC16921b.onViewAttachedToWindow(this);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            InterfaceC16921b interfaceC16921b = this.f86384x;
            if (interfaceC16921b != null) {
                AbstractC19074t.m100205c(interfaceC16921b);
                interfaceC16921b.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.f86376p = (RobotoTextView) findViewById(AbstractC2811e.snackbar_text);
            this.f86377q = (ButtonWithProgress) findViewById(AbstractC2811e.snackbar_action);
            this.f86378r = (RecyclingImageView) findViewById(AbstractC2811e.snackbar_icon);
            this.f86379s = (ProgressBar) findViewById(AbstractC2811e.snackbar_progress_leading);
            this.f86380t = (ProgressBar) findViewById(AbstractC2811e.snackbar_progress_bar);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            InterfaceC16922c interfaceC16922c;
            super.onLayout(z11, i11, i12, i13, i14);
            if (z11 && (interfaceC16922c = this.f86383w) != null) {
                AbstractC19074t.m100205c(interfaceC16922c);
                interfaceC16922c.mo90665a(this, i11, i12, i13, i14);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            int measuredWidth = getMeasuredWidth();
            int i13 = this.f86381u;
            if (1 <= i13 && i13 < measuredWidth) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
            }
        }

        public final void setButtonAction(ButtonWithProgress buttonWithProgress) {
            this.f86377q = buttonWithProgress;
        }

        public final void setIconView(RecyclingImageView recyclingImageView) {
            this.f86378r = recyclingImageView;
        }

        public final void setMMaxInlineActionWidth(int i11) {
            this.f86382v = i11;
        }

        public final void setMMaxWidth(int i11) {
            this.f86381u = i11;
        }

        public final void setMOnAttachStateChangeListener(InterfaceC16921b interfaceC16921b) {
            this.f86384x = interfaceC16921b;
        }

        public final void setMOnLayoutChangeListener(InterfaceC16922c interfaceC16922c) {
            this.f86383w = interfaceC16922c;
        }

        public final void setMaxWidth(int i11) {
            this.f86381u = Math.min(i11, Resources.getSystem().getDisplayMetrics().widthPixels);
        }

        public final void setMessageView(RobotoTextView robotoTextView) {
            this.f86376p = robotoTextView;
        }

        public final void setOnAttachStateChangeListener(InterfaceC16921b interfaceC16921b) {
            this.f86384x = interfaceC16921b;
        }

        public final void setOnLayoutChangeListener(InterfaceC16922c interfaceC16922c) {
            this.f86383w = interfaceC16922c;
        }

        public final void setProgressBar(ProgressBar progressBar) {
            this.f86380t = progressBar;
        }

        public final void setProgressLeading(ProgressBar progressBar) {
            this.f86379s = progressBar;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$a */
    /* loaded from: classes7.dex */
    public static final class C16923a extends AbstractViewOnTouchListenerC27278e {
        C16923a(Context context) {
            super(context);
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: a */
        public void mo55516a() {
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: b */
        public void mo55517b() {
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: c */
        public void mo55518c() {
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: d */
        public void mo55519d() {
            if (Snackbar.this.f86373x) {
                Snackbar.this.m90656o(0);
            }
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: e */
        public void mo55520e() {
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: f */
        public void mo55521f() {
        }

        @Override // ui0.AbstractViewOnTouchListenerC27278e
        /* renamed from: g */
        public void mo55522g() {
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$b */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC16924b {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.zdesign.component.Snackbar$b$a */
        /* loaded from: classes7.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public void mo49166a(Snackbar snackbar, int i11) {
        }

        /* renamed from: b */
        public void mo84743b(Snackbar snackbar) {
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$c */
    /* loaded from: classes7.dex */
    public static final class C16925c {
        private C16925c() {
        }

        public /* synthetic */ C16925c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ViewGroup m90666a(View view) {
            ViewGroup viewGroup = null;
            while (!(view instanceof RelativeLayout) && !(view instanceof FrameLayout)) {
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                }
                if (view != null) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    return viewGroup;
                }
            }
            return (ViewGroup) view;
        }

        /* renamed from: b */
        public final Handler m90667b() {
            return Snackbar.f86355J;
        }

        /* renamed from: c */
        public final Snackbar m90668c(View view, int i11, int i12) {
            AbstractC19074t.m100208f(view, "view");
            CharSequence text = view.getResources().getText(i11);
            AbstractC19074t.m100207e(text, "view.resources.getText(resId)");
            return m90669d(view, text, i12);
        }

        /* renamed from: d */
        public final Snackbar m90669d(View view, CharSequence charSequence, int i11) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(charSequence, "text");
            ViewGroup m90666a = m90666a(view);
            AbstractC19074t.m100205c(m90666a);
            Snackbar snackbar = new Snackbar(m90666a);
            snackbar.m90647M(charSequence);
            snackbar.m90642H(i11);
            return snackbar;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$d */
    /* loaded from: classes7.dex */
    public enum EnumC16926d {
        BOTTOM_UP,
        TOP_DOWN
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$e */
    /* loaded from: classes7.dex */
    public static final class C16927e extends AnimatorListenerAdapter {
        C16927e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (Snackbar.this.f86369t != null) {
                AbstractC16924b abstractC16924b = Snackbar.this.f86369t;
                AbstractC19074t.m100205c(abstractC16924b);
                abstractC16924b.mo84743b(Snackbar.this);
            }
            C24274b.Companion.m126757a().m126753m(Snackbar.this.m90657p());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            Snackbar.this.f86361F = true;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$f */
    /* loaded from: classes7.dex */
    public static final class C16928f extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ int f86391q;

        C16928f(int i11) {
            this.f86391q = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            Snackbar.this.m90663y(this.f86391q);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$g */
    /* loaded from: classes7.dex */
    public static final class C16929g extends AbstractC1617x0 {

        /* renamed from: b */
        final /* synthetic */ int f86393b;

        C16929g(int i11) {
            this.f86393b = i11;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            AbstractC19074t.m100208f(view, "view");
            Snackbar.this.m90663y(this.f86393b);
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$h */
    /* loaded from: classes7.dex */
    public static final class C16930h implements C24274b.a {
        C16930h() {
        }

        @Override // oi0.C24274b.a
        /* renamed from: a */
        public void mo90671a() {
            C16925c c16925c = Snackbar.Companion;
            Handler m90667b = c16925c.m90667b();
            AbstractC19074t.m100205c(m90667b);
            Handler m90667b2 = c16925c.m90667b();
            AbstractC19074t.m100205c(m90667b2);
            m90667b.sendMessage(m90667b2.obtainMessage(0, Snackbar.this));
        }

        @Override // oi0.C24274b.a
        /* renamed from: b */
        public void mo90672b(int i11) {
            C16925c c16925c = Snackbar.Companion;
            Handler m90667b = c16925c.m90667b();
            AbstractC19074t.m100205c(m90667b);
            Handler m90667b2 = c16925c.m90667b();
            AbstractC19074t.m100205c(m90667b2);
            m90667b.sendMessage(m90667b2.obtainMessage(1, i11, 0, Snackbar.this));
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$i */
    /* loaded from: classes7.dex */
    public static final class C16931i implements SnackbarLayout.InterfaceC16921b {
        C16931i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m90674b(Snackbar snackbar) {
            AbstractC19074t.m100208f(snackbar, "this$0");
            snackbar.m90663y(3);
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.SnackbarLayout.InterfaceC16921b
        public void onViewAttachedToWindow(View view) {
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.SnackbarLayout.InterfaceC16921b
        public void onViewDetachedFromWindow(View view) {
            if (Snackbar.this.m90662u()) {
                Handler m90667b = Snackbar.Companion.m90667b();
                AbstractC19074t.m100205c(m90667b);
                final Snackbar snackbar = Snackbar.this;
                m90667b.post(new Runnable() { // from class: com.zing.zalo.zdesign.component.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Snackbar.C16931i.m90674b(Snackbar.this);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.Snackbar$j */
    /* loaded from: classes7.dex */
    public static final class C16932j implements SnackbarLayout.InterfaceC16922c {
        C16932j() {
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.SnackbarLayout.InterfaceC16922c
        /* renamed from: a */
        public void mo90665a(View view, int i11, int i12, int i13, int i14) {
            if (Snackbar.this.f86361F) {
                Snackbar.this.m90650P();
            } else {
                Snackbar.this.m90652j();
            }
        }
    }

    public Snackbar(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f86365p = viewGroup;
        this.f86372w = 200L;
        this.f86360E = EnumC16926d.BOTTOM_UP;
        this.f86362G = new C16930h();
        this.f86363H = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.zdesign.component.t0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                Snackbar.m90635x(Snackbar.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f86364I = new AnimatorSet();
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "parent.context");
        this.f86366q = context;
        SnackbarLayout snackbarLayout = (SnackbarLayout) LayoutInflater.from(context).inflate(AbstractC2812f.layout_snackbar, this.f86365p, false);
        this.f86367r = snackbarLayout;
        if (snackbarLayout != null) {
            snackbarLayout.setPadding(C27276c.m139649b(this.f86366q, 16), C27276c.m139649b(this.f86366q, 4), C27276c.m139649b(this.f86366q, 8), C27276c.m139649b(this.f86366q, 4));
        }
        SnackbarLayout snackbarLayout2 = this.f86367r;
        if (snackbarLayout2 != null) {
            snackbarLayout2.setBackground(C27280g.m139658a(this.f86366q, AbstractC2810d.bg_snackbar));
        }
        SnackbarLayout snackbarLayout3 = this.f86367r;
        if (snackbarLayout3 != null) {
            snackbarLayout3.setOnTouchListener(new C16923a(this.f86366q));
        }
        this.f86370u = C27276c.m139649b(this.f86366q, 12);
        this.f86371v = C27276c.m139649b(this.f86366q, 12);
        m90621Q();
        this.f86374y = new C25808b(new WeakReference(this.f86367r));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m90620B(View.OnClickListener onClickListener, Snackbar snackbar, View view) {
        AbstractC19074t.m100208f(snackbar, "this$0");
        onClickListener.onClick(view);
        snackbar.m90656o(1);
    }

    /* renamed from: Q */
    private final void m90621Q() {
        SnackbarLayout snackbarLayout;
        if (this.f86365p != null && (snackbarLayout = this.f86367r) != null) {
            AbstractC19074t.m100205c(snackbarLayout);
            if (snackbarLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                if (this.f86360E == EnumC16926d.TOP_DOWN) {
                    SnackbarLayout snackbarLayout2 = this.f86367r;
                    AbstractC19074t.m100205c(snackbarLayout2);
                    ViewGroup.LayoutParams layoutParams = snackbarLayout2.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 49;
                    return;
                }
                SnackbarLayout snackbarLayout3 = this.f86367r;
                AbstractC19074t.m100205c(snackbarLayout3);
                ViewGroup.LayoutParams layoutParams2 = snackbarLayout3.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 81;
            }
        }
    }

    /* renamed from: S */
    private final void m90622S(boolean z11) {
        ViewGroup.LayoutParams layoutParams;
        SnackbarLayout snackbarLayout = this.f86367r;
        if (snackbarLayout != null) {
            layoutParams = snackbarLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (z11) {
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
        } else if (layoutParams != null) {
            layoutParams.width = -2;
        }
        SnackbarLayout snackbarLayout2 = this.f86367r;
        if (snackbarLayout2 != null) {
            snackbarLayout2.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m90626d(Message message) {
        AbstractC19074t.m100208f(message, "message");
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 != 1) {
                return false;
            }
            Object obj = message.obj;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.Snackbar");
            ((Snackbar) obj).m90660s(message.arg1);
            return true;
        }
        Object obj2 = message.obj;
        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.Snackbar");
        ((Snackbar) obj2).m90649O();
        return true;
    }

    /* renamed from: m */
    private final float m90632m() {
        int i11;
        ZaloView zaloView;
        View view;
        SnackbarLayout snackbarLayout;
        int i12;
        ZaloView zaloView2;
        View view2;
        int i13 = 0;
        if (this.f86360E == EnumC16926d.TOP_DOWN) {
            WeakReference weakReference = this.f86357B;
            if (weakReference != null && (view2 = (View) weakReference.get()) != null && this.f86367r != null) {
                int bottom = view2.getBottom();
                SnackbarLayout snackbarLayout2 = this.f86367r;
                AbstractC19074t.m100205c(snackbarLayout2);
                i12 = bottom - snackbarLayout2.getTop();
            } else {
                i12 = 0;
            }
            WeakReference weakReference2 = this.f86358C;
            if (weakReference2 != null && (zaloView2 = (ZaloView) weakReference2.get()) != null && this.f86367r != null && zaloView2.m92656bJ() != null) {
                Rect rect = new Rect(0, 0, 0, 0);
                View m92656bJ = zaloView2.m92656bJ();
                if (m92656bJ != null) {
                    m92656bJ.getGlobalVisibleRect(rect);
                }
                int i14 = rect.bottom;
                SnackbarLayout snackbarLayout3 = this.f86367r;
                AbstractC19074t.m100205c(snackbarLayout3);
                i12 = i14 - snackbarLayout3.getTop();
            }
            float f11 = this.f86371v + i12;
            this.f86359D = f11 - C27276c.m139649b(this.f86366q, 32);
            return f11;
        }
        WeakReference weakReference3 = this.f86357B;
        if (weakReference3 != null && (view = (View) weakReference3.get()) != null && (snackbarLayout = this.f86367r) != null) {
            AbstractC19074t.m100205c(snackbarLayout);
            i11 = snackbarLayout.getBottom() - view.getTop();
        } else {
            i11 = 0;
        }
        WeakReference weakReference4 = this.f86358C;
        if (weakReference4 != null && (zaloView = (ZaloView) weakReference4.get()) != null && this.f86367r != null && zaloView.m92656bJ() != null) {
            Rect rect2 = new Rect(0, 0, 0, 0);
            View m92656bJ2 = zaloView.m92656bJ();
            if (m92656bJ2 != null) {
                m92656bJ2.getGlobalVisibleRect(rect2);
            }
            if ((zaloView instanceof BottomSheet) && ((BottomSheet) zaloView).m90516fL() == EnumC17017m.HUG_CONTENT) {
                i13 = AbstractC17484n.Companion.m92931b();
            }
            SnackbarLayout snackbarLayout4 = this.f86367r;
            AbstractC19074t.m100205c(snackbarLayout4);
            i11 = (snackbarLayout4.getBottom() - rect2.top) - i13;
        }
        float f12 = (-this.f86370u) - i11;
        this.f86359D = C27276c.m139649b(this.f86366q, 32) + f12;
        return f12;
    }

    /* renamed from: v */
    public static final Snackbar m90633v(View view, int i11, int i12) {
        return Companion.m90668c(view, i11, i12);
    }

    /* renamed from: w */
    public static final Snackbar m90634w(View view, CharSequence charSequence, int i11) {
        return Companion.m90669d(view, charSequence, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m90635x(Snackbar snackbar, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(snackbar, "this$0");
        if (snackbar.f86367r == null) {
            return;
        }
        if (i14 == i18 && i12 == i16) {
            return;
        }
        snackbar.m90650P();
    }

    /* renamed from: A */
    public final Snackbar m90636A(CharSequence charSequence, final View.OnClickListener onClickListener) {
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        ButtonWithProgress buttonAction = snackbarLayout.getButtonAction();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            AbstractC19074t.m100205c(buttonAction);
            buttonAction.setVisibility(0);
            buttonAction.getButton().setText(charSequence);
            String str = this.f86375z;
            if (str != null) {
                AbstractC19074t.m100205c(str);
                buttonAction.setIdTracking(str);
                C0708i c0708i = this.f86356A;
                if (c0708i != null) {
                    buttonAction.setTrackingExtraData(c0708i);
                }
            }
            buttonAction.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zdesign.component.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.m90620B(onClickListener, this, view);
                }
            });
            m90622S(true);
        } else {
            AbstractC19074t.m100205c(buttonAction);
            buttonAction.setVisibility(8);
            String str2 = this.f86375z;
            if (str2 != null) {
                AbstractC19074t.m100205c(str2);
                buttonAction.setIdTracking(str2);
            }
            buttonAction.setOnClickListener(null);
        }
        return this;
    }

    /* renamed from: C */
    public final Snackbar m90637C(C0708i c0708i) {
        AbstractC19074t.m100208f(c0708i, "extraData");
        this.f86356A = c0708i;
        return this;
    }

    /* renamed from: D */
    public final Snackbar m90638D(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f86375z = str;
        return this;
    }

    /* renamed from: E */
    public final void m90639E(View view) {
        View view2;
        WeakReference weakReference = new WeakReference(view);
        this.f86357B = weakReference;
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.addOnLayoutChangeListener(this.f86363H);
        }
        WeakReference weakReference2 = this.f86357B;
        if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && view2.getVisibility() == 0) {
            m90650P();
        }
    }

    /* renamed from: F */
    public final Snackbar m90640F(AbstractC16924b abstractC16924b) {
        this.f86369t = abstractC16924b;
        return this;
    }

    /* renamed from: G */
    public final Snackbar m90641G(boolean z11) {
        this.f86373x = z11;
        return this;
    }

    /* renamed from: H */
    public final Snackbar m90642H(int i11) {
        this.f86368s = i11;
        return this;
    }

    /* renamed from: I */
    public final Snackbar m90643I(int i11) {
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        RecyclingImageView iconView = snackbarLayout.getIconView();
        if (iconView != null) {
            iconView.setImageResource(i11);
        }
        if (iconView != null) {
            iconView.setVisibility(0);
        }
        m90622S(true);
        return this;
    }

    /* renamed from: J */
    public final Snackbar m90644J(Drawable drawable) {
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        RecyclingImageView iconView = snackbarLayout.getIconView();
        if (drawable == null) {
            if (iconView != null) {
                iconView.setVisibility(8);
            }
            return this;
        }
        if (iconView != null) {
            iconView.setImageDrawable(drawable);
        }
        if (iconView != null) {
            iconView.setVisibility(0);
        }
        m90622S(true);
        return this;
    }

    /* renamed from: K */
    public final Snackbar m90645K(int i11) {
        this.f86370u = i11;
        return this;
    }

    /* renamed from: L */
    public final Snackbar m90646L(boolean z11, boolean z12) {
        int i11;
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        ProgressBar progressLeading = snackbarLayout.getProgressLeading();
        if (progressLeading != null) {
            Context context = this.f86366q;
            AbstractC19074t.m100205c(context);
            progressLeading.m90610b(C23314b.m122698a(context, AbstractC2814h.ProgressBar_Size24_Blue));
        }
        if (progressLeading != null) {
            progressLeading.setIndeterminate(z12);
        }
        if (progressLeading != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            progressLeading.setVisibility(i11);
        }
        if (z11) {
            m90622S(true);
        }
        return this;
    }

    /* renamed from: M */
    public final Snackbar m90647M(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "message");
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        RobotoTextView messageView = snackbarLayout.getMessageView();
        AbstractC19074t.m100205c(messageView);
        messageView.setText(charSequence);
        return this;
    }

    /* renamed from: N */
    public final void m90648N() {
        C24274b.Companion.m126757a().m126755o(this.f86368s, this.f86362G, false);
    }

    /* renamed from: O */
    public final void m90649O() {
        if (this.f86367r == null) {
            return;
        }
        m90621Q();
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        if (snackbarLayout.getParent() == null) {
            ViewGroup viewGroup = this.f86365p;
            AbstractC19074t.m100205c(viewGroup);
            viewGroup.addView(this.f86367r);
        }
        SnackbarLayout snackbarLayout2 = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout2);
        snackbarLayout2.setOnAttachStateChangeListener(new C16931i());
        SnackbarLayout snackbarLayout3 = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout3);
        if (AbstractC1579n0.m7865e0(snackbarLayout3)) {
            m90652j();
            return;
        }
        SnackbarLayout snackbarLayout4 = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout4);
        snackbarLayout4.setOnLayoutChangeListener(new C16932j());
    }

    /* renamed from: P */
    public final void m90650P() {
        this.f86364I.cancel();
        SnackbarLayout snackbarLayout = this.f86367r;
        if (snackbarLayout != null) {
            snackbarLayout.setAlpha(1.0f);
        }
        float m90632m = m90632m();
        SnackbarLayout snackbarLayout2 = this.f86367r;
        if (snackbarLayout2 != null) {
            snackbarLayout2.setTranslationY(m90632m);
        }
    }

    /* renamed from: R */
    public final void m90651R(float f11) {
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        ProgressBar progressLeading = snackbarLayout.getProgressLeading();
        if (progressLeading != null) {
            ProgressBar.m90609f(progressLeading, f11, false, 2, null);
        }
    }

    /* renamed from: j */
    public final void m90652j() {
        float m90632m = m90632m();
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(snackbarLayout, "translationY", this.f86359D, m90632m);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(this.f86372w);
        SnackbarLayout snackbarLayout2 = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(snackbarLayout2, "alpha", 0.0f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(this.f86372w);
        this.f86364I.playTogether(ofFloat, ofFloat2);
        this.f86364I.addListener(new C16927e());
        this.f86364I.start();
    }

    /* renamed from: k */
    public final void m90653k(int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(snackbarLayout, "translationY", this.f86359D);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(this.f86372w);
        SnackbarLayout snackbarLayout2 = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(snackbarLayout2, "alpha", 1.0f, 0.0f);
        ofFloat2.setInterpolator(new AccelerateInterpolator());
        ofFloat2.setDuration(this.f86372w);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.addListener(new C16928f(i11));
        animatorSet.start();
    }

    /* renamed from: l */
    public final void m90654l(int i11) {
        SnackbarLayout snackbarLayout = this.f86367r;
        if (snackbarLayout != null) {
            snackbarLayout.setAlpha(1.0f);
        }
        SnackbarLayout snackbarLayout2 = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout2);
        AbstractC1579n0.m7864e(snackbarLayout2).m8218f(0.9f).m8219g(0.9f).m8221i(new C26087b()).m8215b(0.0f).m8220h(this.f86372w).m8222j(new C16929g(i11)).m8225n();
    }

    /* renamed from: n */
    public final void m90655n() {
        m90656o(3);
    }

    /* renamed from: o */
    public final void m90656o(int i11) {
        C24274b.Companion.m126757a().m126749f(this.f86362G, i11);
    }

    /* renamed from: p */
    public final C24274b.a m90657p() {
        return this.f86362G;
    }

    /* renamed from: q */
    public final SnackbarLayout m90658q() {
        return this.f86367r;
    }

    /* renamed from: r */
    public final View m90659r() {
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        return snackbarLayout;
    }

    /* renamed from: s */
    public final void m90660s(int i11) {
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        if (snackbarLayout.getVisibility() != 0) {
            m90663y(i11);
        } else if (i11 == 4) {
            m90654l(i11);
        } else {
            m90653k(i11);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86374y;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86374y;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* renamed from: t */
    public final boolean m90661t() {
        return C24274b.Companion.m126757a().m126750h(this.f86362G);
    }

    /* renamed from: u */
    public final boolean m90662u() {
        return C24274b.Companion.m126757a().m126751i(this.f86362G);
    }

    /* renamed from: y */
    public final void m90663y(int i11) {
        ZaloView zaloView;
        View m92656bJ;
        View view;
        C24274b.Companion.m126757a().m126752l(this.f86362G);
        AbstractC16924b abstractC16924b = this.f86369t;
        if (abstractC16924b != null) {
            AbstractC19074t.m100205c(abstractC16924b);
            abstractC16924b.mo49166a(this, i11);
        }
        SnackbarLayout snackbarLayout = this.f86367r;
        AbstractC19074t.m100205c(snackbarLayout);
        ViewParent parent = snackbarLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f86367r);
        }
        WeakReference weakReference = this.f86357B;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.removeOnLayoutChangeListener(this.f86363H);
        }
        WeakReference weakReference2 = this.f86358C;
        if (weakReference2 != null && (zaloView = (ZaloView) weakReference2.get()) != null && (m92656bJ = zaloView.m92656bJ()) != null) {
            m92656bJ.removeOnLayoutChangeListener(this.f86363H);
        }
        this.f86361F = false;
    }

    /* renamed from: z */
    public final Snackbar m90664z(int i11, View.OnClickListener onClickListener) {
        Context context = this.f86366q;
        AbstractC19074t.m100205c(context);
        return m90636A(context.getText(i11), onClickListener);
    }
}
