package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2813g;
import bi0.AbstractC2816j;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.layout.BasePopupView;
import com.zing.zalo.zdesign.layout.BoundedLinearLayout;
import com.zing.zalo.zdesign.layout.BoundedScrollView;
import ei0.C18438c;
import ei0.InterfaceC18437b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import me0.AbstractC23146m8;
import me0.AbstractC23150n1;
import on0.AbstractC24342w;
import p239ih.C20556f;
import pm0.C24848g0;
import qi0.AbstractC25298g;
import qi0.C25292a;
import qi0.C25297f;
import qi0.EnumC25294c;
import qi0.EnumC25295d;
import qi0.InterfaceC25296e;
import ri0.C25808b;
import ui0.AbstractC27281h;
import ui0.C27276c;
import ui0.C27279f;
import ui0.C27280g;

/* loaded from: classes7.dex */
public final class TooltipView extends BasePopupView implements InterfaceC25296e {
    public static final C16937a Companion = new C16937a(null);

    /* renamed from: A0 */
    private FrameLayout f86439A0;

    /* renamed from: B0 */
    private RobotoTextView f86440B0;

    /* renamed from: C0 */
    private RobotoTextView f86441C0;

    /* renamed from: D0 */
    private LinearLayout f86442D0;

    /* renamed from: E0 */
    private int f86443E0;

    /* renamed from: F0 */
    private int f86444F0;

    /* renamed from: g0 */
    private String f86445g0;

    /* renamed from: h0 */
    private ButtonWithProgress f86446h0;

    /* renamed from: i0 */
    private ButtonWithProgress f86447i0;

    /* renamed from: j0 */
    private RobotoTextView f86448j0;

    /* renamed from: k0 */
    private View f86449k0;

    /* renamed from: l0 */
    private BoundedScrollView f86450l0;

    /* renamed from: m0 */
    private LinearLayout f86451m0;

    /* renamed from: n0 */
    private boolean f86452n0;

    /* renamed from: o0 */
    private AbstractC25298g f86453o0;

    /* renamed from: p0 */
    private C25297f f86454p0;

    /* renamed from: q0 */
    private InterfaceC16938b f86455q0;

    /* renamed from: r0 */
    private AbstractC16939c f86456r0;

    /* renamed from: s0 */
    private String f86457s0;

    /* renamed from: t0 */
    private String f86458t0;

    /* renamed from: u0 */
    private C0708i f86459u0;

    /* renamed from: v0 */
    private C0708i f86460v0;

    /* renamed from: w0 */
    private View.OnClickListener f86461w0;

    /* renamed from: x0 */
    private View.OnClickListener f86462x0;

    /* renamed from: y0 */
    private Handler f86463y0;

    /* renamed from: z0 */
    private final int f86464z0;

    /* renamed from: com.zing.zalo.zdesign.component.TooltipView$a */
    /* loaded from: classes7.dex */
    public static final class C16937a {
        private C16937a() {
        }

        public /* synthetic */ C16937a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.TooltipView$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC16938b {
        /* renamed from: a */
        void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11);
    }

    /* renamed from: com.zing.zalo.zdesign.component.TooltipView$c */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC16939c {
        /* renamed from: a */
        public void mo60330a() {
        }

        /* renamed from: b */
        public abstract void mo60331b();
    }

    /* renamed from: com.zing.zalo.zdesign.component.TooltipView$d */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16940d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86465a;

        static {
            int[] iArr = new int[EnumC25294c.values().length];
            try {
                iArr[EnumC25294c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25294c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25294c.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25294c.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f86465a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f86452n0 = true;
        this.f86457s0 = "";
        this.f86458t0 = "";
        this.f86463y0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.zdesign.component.c1
            public /* synthetic */ C16960c1() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m90718X;
                m90718X = TooltipView.m90718X(TooltipView.this, message);
                return m90718X;
            }
        });
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext()");
        this.f86464z0 = C27276c.m139649b(context2, 40);
        this.f86443E0 = -2;
        this.f86444F0 = -2;
        this.f86454p0 = new C25297f();
        setElevation(C27276c.m139649b(context, 8));
    }

    /* renamed from: G */
    private final void m90705G() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.7f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.7f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.5f, 1.0f));
        AbstractC19074t.m100207e(ofPropertyValuesHolder, "ofPropertyValuesHolder(n…leUpX, scaleUpY, alphaUp)");
        FrameLayout frameLayout = this.f86439A0;
        AbstractC19074t.m100206d(frameLayout, "null cannot be cast to non-null type android.view.ViewGroup");
        LayoutTransition layoutTransition = frameLayout.getLayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.setAnimator(2, ofPropertyValuesHolder);
    }

    /* renamed from: H */
    private final void m90706H() {
        View view = this.f86449k0;
        View view2 = null;
        if (view == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view = null;
        }
        this.f86450l0 = (BoundedScrollView) view.findViewById(AbstractC2811e.scrollView_tooltip);
        View view3 = this.f86449k0;
        if (view3 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view3 = null;
        }
        this.f86451m0 = (LinearLayout) view3.findViewById(AbstractC2811e.tooltip_rl_btn);
        View view4 = this.f86449k0;
        if (view4 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view4 = null;
        }
        this.f86442D0 = (LinearLayout) view4.findViewById(AbstractC2811e.ll_text_container_tooltip);
        View view5 = this.f86449k0;
        if (view5 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view5 = null;
        }
        this.f86440B0 = (RobotoTextView) view5.findViewById(AbstractC2811e.tooltip_title);
        View view6 = this.f86449k0;
        if (view6 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view6 = null;
        }
        this.f86441C0 = (RobotoTextView) view6.findViewById(AbstractC2811e.tooltip_subtitle);
        View view7 = this.f86449k0;
        if (view7 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view7 = null;
        }
        this.f86446h0 = (ButtonWithProgress) view7.findViewById(AbstractC2811e.tooltip_btn_right);
        View view8 = this.f86449k0;
        if (view8 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view8 = null;
        }
        this.f86447i0 = (ButtonWithProgress) view8.findViewById(AbstractC2811e.tooltip_btn_left);
        View view9 = this.f86449k0;
        if (view9 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view9 = null;
        }
        this.f86448j0 = (RobotoTextView) view9.findViewById(AbstractC2811e.tv_step_counter);
        View view10 = this.f86449k0;
        if (view10 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
        } else {
            view2 = view10;
        }
        View findViewById = view2.findViewById(AbstractC2811e.ll_tooltip_text);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) findViewById).getLayoutTransition().enableTransitionType(4);
        ButtonWithProgress buttonWithProgress = this.f86446h0;
        AbstractC19074t.m100206d(buttonWithProgress, "null cannot be cast to non-null type android.view.ViewGroup");
        buttonWithProgress.getLayoutTransition().enableTransitionType(4);
        ButtonWithProgress buttonWithProgress2 = this.f86447i0;
        AbstractC19074t.m100206d(buttonWithProgress2, "null cannot be cast to non-null type android.view.ViewGroup");
        buttonWithProgress2.getLayoutTransition().enableTransitionType(4);
    }

    /* renamed from: I */
    private final void m90707I() {
        if (this.f86454p0.m130928e().length() == 0 && this.f86454p0.m130926d().length() > 0) {
            C25297f c25297f = this.f86454p0;
            c25297f.m130911Q(c25297f.m130926d());
            this.f86454p0.m130910P("");
        }
        if (this.f86454p0.m130928e().length() > 0) {
            ButtonWithProgress buttonWithProgress = this.f86446h0;
            if (buttonWithProgress != null) {
                AbstractC19074t.m100205c(buttonWithProgress);
                buttonWithProgress.getButton().setText(this.f86454p0.m130928e());
                ButtonWithProgress buttonWithProgress2 = this.f86446h0;
                AbstractC19074t.m100205c(buttonWithProgress2);
                buttonWithProgress2.setVisibility(0);
            }
            RobotoTextView robotoTextView = this.f86448j0;
            if (robotoTextView != null) {
                robotoTextView.setVisibility(0);
            }
            if (this.f86454p0.m130936i().length() > 0) {
                RobotoTextView robotoTextView2 = this.f86448j0;
                if (robotoTextView2 != null) {
                    robotoTextView2.setText(this.f86454p0.m130936i());
                }
            } else if (this.f86454p0.m130898D() != 0) {
                RobotoTextView robotoTextView3 = this.f86448j0;
                if (robotoTextView3 != null) {
                    robotoTextView3.setText(getContext().getString(AbstractC2813g.tooltip_step_counter, Integer.valueOf(this.f86454p0.m130932g()), Integer.valueOf(this.f86454p0.m130898D())));
                }
            } else {
                RobotoTextView robotoTextView4 = this.f86448j0;
                if (robotoTextView4 != null) {
                    robotoTextView4.setVisibility(8);
                }
            }
        } else {
            ButtonWithProgress buttonWithProgress3 = this.f86446h0;
            if (buttonWithProgress3 != null) {
                buttonWithProgress3.setVisibility(8);
            }
            LinearLayout linearLayout = this.f86451m0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
        if (this.f86454p0.m130926d().length() > 0) {
            ButtonWithProgress buttonWithProgress4 = this.f86447i0;
            if (buttonWithProgress4 != null) {
                AbstractC19074t.m100205c(buttonWithProgress4);
                buttonWithProgress4.getButton().setText(this.f86454p0.m130926d());
                ButtonWithProgress buttonWithProgress5 = this.f86447i0;
                AbstractC19074t.m100205c(buttonWithProgress5);
                buttonWithProgress5.setVisibility(0);
                return;
            }
            return;
        }
        ButtonWithProgress buttonWithProgress6 = this.f86447i0;
        if (buttonWithProgress6 != null) {
            buttonWithProgress6.setVisibility(8);
        }
    }

    /* renamed from: J */
    private final void m90708J() {
        CharSequence charSequence;
        if (this.f86454p0.m130928e().length() == 0 && this.f86454p0.m130926d().length() == 0) {
            View view = this.f86449k0;
            CharSequence charSequence2 = null;
            if (view == null) {
                AbstractC19074t.m100223u("tooltipRootView");
                view = null;
            }
            ScrollView scrollView = (ScrollView) view.findViewById(AbstractC2811e.scrollView_tooltip);
            int padding16 = getPadding16();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            scrollView.setPadding(0, padding16, C27276c.m139649b(context, 4), getPadding16());
            RobotoTextView robotoTextView = this.f86440B0;
            if (robotoTextView != null) {
                charSequence = robotoTextView.getText();
            } else {
                charSequence = null;
            }
            if (charSequence != null && charSequence.length() != 0) {
                RobotoTextView robotoTextView2 = this.f86441C0;
                if (robotoTextView2 != null) {
                    charSequence2 = robotoTextView2.getText();
                }
                if (charSequence2 != null && charSequence2.length() != 0) {
                    LinearLayout linearLayout = this.f86442D0;
                    AbstractC19074t.m100205c(linearLayout);
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 48;
                    LinearLayout linearLayout2 = this.f86442D0;
                    AbstractC19074t.m100205c(linearLayout2);
                    linearLayout2.setLayoutParams(layoutParams2);
                    FrameLayout frameLayout = this.f86439A0;
                    if (frameLayout != null && this.f86452n0) {
                        AbstractC19074t.m100205c(frameLayout);
                        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.gravity = 17;
                        FrameLayout frameLayout2 = this.f86439A0;
                        AbstractC19074t.m100205c(frameLayout2);
                        frameLayout2.setLayoutParams(layoutParams4);
                        return;
                    }
                    return;
                }
            }
            LinearLayout linearLayout3 = this.f86442D0;
            AbstractC19074t.m100205c(linearLayout3);
            ViewGroup.LayoutParams layoutParams5 = linearLayout3.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.gravity = 17;
            LinearLayout linearLayout4 = this.f86442D0;
            AbstractC19074t.m100205c(linearLayout4);
            linearLayout4.setLayoutParams(layoutParams6);
            FrameLayout frameLayout3 = this.f86439A0;
            if (frameLayout3 != null && this.f86452n0) {
                AbstractC19074t.m100205c(frameLayout3);
                ViewGroup.LayoutParams layoutParams7 = frameLayout3.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                layoutParams8.gravity = 48;
                FrameLayout frameLayout4 = this.f86439A0;
                AbstractC19074t.m100205c(frameLayout4);
                frameLayout4.setLayoutParams(layoutParams8);
                return;
            }
            return;
        }
        LinearLayout linearLayout5 = this.f86442D0;
        AbstractC19074t.m100205c(linearLayout5);
        ViewGroup.LayoutParams layoutParams9 = linearLayout5.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
        layoutParams10.gravity = 48;
        LinearLayout linearLayout6 = this.f86442D0;
        AbstractC19074t.m100205c(linearLayout6);
        linearLayout6.setLayoutParams(layoutParams10);
        FrameLayout frameLayout5 = this.f86439A0;
        if (frameLayout5 != null && this.f86452n0) {
            AbstractC19074t.m100205c(frameLayout5);
            ViewGroup.LayoutParams layoutParams11 = frameLayout5.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams11, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
            layoutParams12.gravity = 48;
            FrameLayout frameLayout6 = this.f86439A0;
            AbstractC19074t.m100205c(frameLayout6);
            frameLayout6.setLayoutParams(layoutParams12);
        }
    }

    /* renamed from: K */
    private final void m90709K() {
        C25292a.a aVar;
        View view = null;
        if (this.f86454p0.m130940k() != null) {
            aVar = C25292a.f121281a.m130871d();
        } else {
            aVar = null;
        }
        if (aVar != null && aVar.m130883h()) {
            if (aVar.m130882g() <= 96 && aVar.m130877b() <= 96) {
                View view2 = this.f86449k0;
                if (view2 == null) {
                    AbstractC19074t.m100223u("tooltipRootView");
                    view2 = null;
                }
                View findViewById = view2.findViewById(AbstractC2811e.tooltip_image_top);
                AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) findViewById).setVisibility(8);
                View view3 = this.f86449k0;
                if (view3 == null) {
                    AbstractC19074t.m100223u("tooltipRootView");
                } else {
                    view = view3;
                }
                FrameLayout frameLayout = (FrameLayout) view.findViewById(AbstractC2811e.tooltip_image_left);
                this.f86439A0 = frameLayout;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                this.f86452n0 = true;
            } else {
                View view4 = this.f86449k0;
                if (view4 == null) {
                    AbstractC19074t.m100223u("tooltipRootView");
                    view4 = null;
                }
                View findViewById2 = view4.findViewById(AbstractC2811e.tooltip_image_left);
                AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) findViewById2).setVisibility(8);
                View view5 = this.f86449k0;
                if (view5 == null) {
                    AbstractC19074t.m100223u("tooltipRootView");
                } else {
                    view = view5;
                }
                FrameLayout frameLayout2 = (FrameLayout) view.findViewById(AbstractC2811e.tooltip_image_top);
                this.f86439A0 = frameLayout2;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                this.f86452n0 = false;
                if (this.f86454p0.m130906L() != EnumC25295d.EXTENDED) {
                    RobotoTextView robotoTextView = this.f86440B0;
                    if (robotoTextView != null) {
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "context");
                        robotoTextView.setMaxWidth(C27276c.m139649b(context, aVar.m130882g()));
                    }
                    RobotoTextView robotoTextView2 = this.f86441C0;
                    if (robotoTextView2 != null) {
                        Context context2 = getContext();
                        AbstractC19074t.m100207e(context2, "context");
                        robotoTextView2.setMaxWidth(C27276c.m139649b(context2, aVar.m130882g()));
                    }
                }
            }
            m90720Z(aVar);
            FrameLayout frameLayout3 = this.f86439A0;
            AbstractC19074t.m100205c(frameLayout3);
            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f86443E0;
            layoutParams2.height = this.f86444F0;
            layoutParams2.gravity = 17;
            FrameLayout frameLayout4 = this.f86439A0;
            AbstractC19074t.m100205c(frameLayout4);
            frameLayout4.setLayoutParams(layoutParams2);
            m90705G();
        }
    }

    /* renamed from: L */
    private final void m90710L(C25292a.a aVar) {
        int m127178g0;
        AbstractC25298g abstractC25298g;
        View view;
        int i11 = this.f86464z0;
        this.f86443E0 = i11;
        this.f86444F0 = i11;
        if (aVar.m130882g() > 0 && aVar.m130877b() > 0) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            this.f86443E0 = C27276c.m139649b(context, aVar.m130882g());
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            this.f86444F0 = C27276c.m139649b(context2, aVar.m130877b());
        }
        if (!TextUtils.isEmpty(aVar.m130881f())) {
            AbstractC25298g abstractC25298g2 = this.f86453o0;
            if (abstractC25298g2 != null) {
                abstractC25298g2.mo88429b(aVar.m130881f(), "", aVar.m130882g(), aVar.m130877b());
            }
        } else if (!TextUtils.isEmpty(aVar.m130876a())) {
            try {
                String m130876a = aVar.m130876a();
                m127178g0 = AbstractC24342w.m127178g0(aVar.m130876a(), "/", 0, false, 6, null);
                String substring = m130876a.substring(m127178g0 + 1);
                AbstractC19074t.m100207e(substring, "this as java.lang.String).substring(startIndex)");
                File file = new File(AbstractC23150n1.m118870C(), substring);
                if (!new C20556f(file.getAbsolutePath()).m106830b()) {
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    m90714P(context3, aVar.m130876a(), file);
                }
                if (file.exists() && (abstractC25298g = this.f86453o0) != null) {
                    abstractC25298g.mo88429b(file.getAbsolutePath(), "", aVar.m130882g(), aVar.m130877b());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104546o(e11);
            }
        }
        FrameLayout frameLayout = this.f86439A0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.f86439A0;
        if (frameLayout2 != null) {
            AbstractC25298g abstractC25298g3 = this.f86453o0;
            if (abstractC25298g3 != null) {
                view = abstractC25298g3.mo88428a();
            } else {
                view = null;
            }
            frameLayout2.addView(view);
        }
    }

    /* renamed from: M */
    private final void m90711M(C25292a.a aVar) {
        int m127178g0;
        AbstractC25298g abstractC25298g;
        int i11;
        if (aVar.m130882g() > 0 && aVar.m130877b() > 0) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            this.f86443E0 = C27276c.m139649b(context, aVar.m130882g());
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            this.f86444F0 = C27276c.m139649b(context2, aVar.m130877b());
        } else if (aVar.m130882g() != -2 || aVar.m130877b() != -2) {
            this.f86443E0 = -2;
            this.f86444F0 = -2;
        }
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        recyclingImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (!TextUtils.isEmpty(aVar.m130881f())) {
            AbstractC25298g abstractC25298g2 = this.f86453o0;
            if (abstractC25298g2 != null) {
                abstractC25298g2.mo88430c(recyclingImageView, aVar.m130881f());
            }
        } else if (!TextUtils.isEmpty(aVar.m130876a())) {
            try {
                String m130876a = aVar.m130876a();
                m127178g0 = AbstractC24342w.m127178g0(aVar.m130876a(), "/", 0, false, 6, null);
                String substring = m130876a.substring(m127178g0 + 1);
                AbstractC19074t.m100207e(substring, "this as java.lang.String).substring(startIndex)");
                File file = new File(AbstractC23150n1.m118870C(), substring);
                if (!new C20556f(file.getAbsolutePath()).m106830b()) {
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    m90714P(context3, aVar.m130876a(), file);
                }
                if (file.exists() && (abstractC25298g = this.f86453o0) != null) {
                    abstractC25298g.mo88430c(recyclingImageView, file.getAbsolutePath());
                }
            } catch (Exception e11) {
                AbstractC20110a.m104546o(e11);
            }
        } else if (!TextUtils.isEmpty(aVar.m130878c())) {
            try {
                i11 = getResources().getIdentifier(aVar.m130878c(), "drawable", getContext().getPackageName());
            } catch (Exception e12) {
                AbstractC20110a.m104546o(e12);
                i11 = 0;
            }
            if (i11 != 0) {
                m90717W(recyclingImageView, i11, aVar.m130879d());
            }
        }
        FrameLayout frameLayout = this.f86439A0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.f86439A0;
        if (frameLayout2 != null) {
            frameLayout2.addView(recyclingImageView);
        }
    }

    /* renamed from: N */
    private final void m90712N(C25292a.a aVar) {
        C24848g0 c24848g0;
        FrameLayout frameLayout;
        if (aVar.m130882g() > 0 && aVar.m130877b() > 0) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            this.f86443E0 = C27276c.m139649b(context, aVar.m130882g());
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            this.f86444F0 = C27276c.m139649b(context2, aVar.m130877b());
        } else if (aVar.m130882g() != -2 || aVar.m130877b() != -2) {
            this.f86443E0 = -2;
            this.f86444F0 = -2;
        }
        FrameLayout frameLayout2 = this.f86439A0;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        View m130934h = this.f86454p0.m130934h();
        if (m130934h != null) {
            ViewParent parent = m130934h.getParent();
            if (parent != null) {
                AbstractC19074t.m100207e(parent, "parent");
                ViewParent parent2 = m130934h.getParent();
                AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(m130934h);
            }
            FrameLayout frameLayout3 = this.f86439A0;
            if (frameLayout3 != null) {
                frameLayout3.addView(m130934h);
            }
            FrameLayout frameLayout4 = this.f86439A0;
            if (frameLayout4 != null) {
                frameLayout4.setVisibility(0);
            }
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null && (frameLayout = this.f86439A0) != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: O */
    private final void m90713O() {
        CharSequence charSequence;
        int i11;
        RobotoTextView robotoTextView = this.f86440B0;
        int i12 = 0;
        if (robotoTextView != null) {
            AbstractC25298g abstractC25298g = this.f86453o0;
            if (abstractC25298g != null) {
                AbstractC19074t.m100205c(robotoTextView);
                abstractC25298g.mo88433f(robotoTextView, this.f86454p0.m130896B());
            }
            RobotoTextView robotoTextView2 = this.f86440B0;
            AbstractC19074t.m100205c(robotoTextView2);
            robotoTextView2.setTextColor(this.f86454p0.m130895A());
            RobotoTextView robotoTextView3 = this.f86440B0;
            AbstractC19074t.m100205c(robotoTextView3);
            RobotoTextView robotoTextView4 = this.f86440B0;
            AbstractC19074t.m100205c(robotoTextView4);
            CharSequence text = robotoTextView4.getText();
            if (text != null && text.length() != 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            robotoTextView3.setVisibility(i11);
        }
        RobotoTextView robotoTextView5 = this.f86441C0;
        if (robotoTextView5 != null) {
            robotoTextView5.setText(this.f86454p0.m130957y());
        }
        RobotoTextView robotoTextView6 = this.f86440B0;
        CharSequence charSequence2 = null;
        if (robotoTextView6 != null) {
            charSequence = robotoTextView6.getText();
        } else {
            charSequence = null;
        }
        if (charSequence != null && charSequence.length() != 0) {
            RobotoTextView robotoTextView7 = this.f86441C0;
            if (robotoTextView7 != null) {
                robotoTextView7.setTextColor(this.f86454p0.m130958z());
            }
        } else {
            RobotoTextView robotoTextView8 = this.f86441C0;
            if (robotoTextView8 != null) {
                AbstractC2816j.a aVar = AbstractC2816j.Companion;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                robotoTextView8.setTextColor(aVar.m13592a(context, AbstractC2807a.tooltip_text_body_primary));
            }
        }
        RobotoTextView robotoTextView9 = this.f86441C0;
        if (robotoTextView9 != null) {
            if (robotoTextView9 != null) {
                charSequence2 = robotoTextView9.getText();
            }
            if (charSequence2 == null || charSequence2.length() == 0) {
                i12 = 8;
            }
            robotoTextView9.setVisibility(i12);
        }
    }

    /* renamed from: P */
    private final void m90714P(Context context, String str, File file) {
        try {
            InputStream open = context.getAssets().open(str);
            AbstractC19074t.m100207e(open, "context.assets.open(assetPath)");
            AbstractC23146m8.m118825a(open, new FileOutputStream(file));
        } catch (Exception e11) {
            AbstractC20110a.m104543l("TooltipView").mo104551d(e11.toString(), new Object[0]);
        }
    }

    /* renamed from: T */
    public static final void m90715T(TooltipView tooltipView, int i11, boolean z11) {
        AbstractC19074t.m100208f(tooltipView, "this$0");
        tooltipView.mo90739s();
        InterfaceC16938b interfaceC16938b = tooltipView.f86455q0;
        if (interfaceC16938b != null) {
            interfaceC16938b.mo66113a(tooltipView, i11, tooltipView.getMTotalShowingTime(), z11);
        }
        AbstractC25298g abstractC25298g = tooltipView.f86453o0;
        if (abstractC25298g != null) {
            abstractC25298g.mo88431d();
        }
    }

    /* renamed from: U */
    private final void m90716U() {
        if (this.f86449k0 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC2812f.layout_tooltip, (ViewGroup) this, false);
            AbstractC19074t.m100207e(inflate, "from(context).inflate(R.…out_tooltip, this, false)");
            this.f86449k0 = inflate;
            this.f86453o0 = this.f86454p0.m130897C();
        }
        View view = this.f86449k0;
        View view2 = null;
        if (view == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view = null;
        }
        if (view instanceof BoundedLinearLayout) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int min = Math.min((int) (getResources().getDisplayMetrics().widthPixels * 0.75f), C27276c.m139649b(context, 400));
            View view3 = this.f86449k0;
            if (view3 == null) {
                AbstractC19074t.m100223u("tooltipRootView");
            } else {
                view2 = view3;
            }
            ((BoundedLinearLayout) view2).setMaxWidth(min);
        }
        if (this.f86454p0.m130906L() == EnumC25295d.EXTENDED) {
            m90722b0();
        }
    }

    /* renamed from: W */
    private final void m90717W(RecyclingImageView recyclingImageView, int i11, int i12) {
        Drawable m139658a;
        try {
            if (i12 != 0) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "context");
                m139658a = C27280g.m139659b(context, i11, i12);
            } else {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "context");
                m139658a = C27280g.m139658a(context2, i11);
            }
            recyclingImageView.setImageDrawable(m139658a);
        } catch (Exception unused) {
            recyclingImageView.setImageDrawable(null);
        } catch (Throwable th2) {
            recyclingImageView.setImageDrawable(null);
            throw th2;
        }
    }

    /* renamed from: X */
    public static final boolean m90718X(TooltipView tooltipView, Message message) {
        AbstractC19074t.m100208f(tooltipView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    tooltipView.m91379y();
                    if (!tooltipView.getMDismissed()) {
                        tooltipView.m90721a0(2, 10L);
                    }
                }
            } else {
                tooltipView.m91379y();
            }
        } else {
            tooltipView.m90729S(2, false, true);
        }
        return false;
    }

    /* renamed from: Y */
    private final void m90719Y() {
        m90716U();
        m90706H();
        m90713O();
        m90707I();
        m90709K();
        m90708J();
        View view = this.f86449k0;
        if (view == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view = null;
        }
        setMainPopupView(view);
        View mainPopupView = getMainPopupView();
        if (mainPopupView != null) {
            mainPopupView.setBackground(this.f86454p0.m130924c());
        }
    }

    /* renamed from: Z */
    private final void m90720Z(C25292a.a aVar) {
        FrameLayout frameLayout = this.f86439A0;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        int m130880e = aVar.m130880e();
        if (m130880e != 0) {
            if (m130880e != 1) {
                if (m130880e == 2) {
                    m90712N(aVar);
                    return;
                }
                return;
            }
            m90710L(aVar);
            return;
        }
        m90711M(aVar);
    }

    /* renamed from: a0 */
    private final void m90721a0(int i11, long j11) {
        this.f86463y0.sendEmptyMessageDelayed(i11, j11);
    }

    /* renamed from: b0 */
    private final void m90722b0() {
        View view = this.f86449k0;
        View view2 = null;
        if (view == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        View view3 = this.f86449k0;
        if (view3 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
            view3 = null;
        }
        if (view3 instanceof BoundedLinearLayout) {
            int padding16 = getResources().getDisplayMetrics().widthPixels - (getPadding16() * 2);
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int min = Math.min(padding16, C27276c.m139649b(context, 480));
            View view4 = this.f86449k0;
            if (view4 == null) {
                AbstractC19074t.m100223u("tooltipRootView");
                view4 = null;
            }
            ((BoundedLinearLayout) view4).setMaxWidth(min);
        }
        View view5 = this.f86449k0;
        if (view5 == null) {
            AbstractC19074t.m100223u("tooltipRootView");
        } else {
            view2 = view5;
        }
        view2.setLayoutParams(layoutParams);
    }

    /* renamed from: e0 */
    public static final void m90723e0(TooltipView tooltipView) {
        AbstractC19074t.m100208f(tooltipView, "this$0");
        tooltipView.mo90740x();
    }

    /* renamed from: f0 */
    public static final void m90724f0(TooltipView tooltipView) {
        AbstractC19074t.m100208f(tooltipView, "this$0");
        tooltipView.mo90739s();
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: A */
    protected void mo90725A() {
        int padding8;
        int padding82;
        setNoOfChild(getChildCount());
        int left = getLeft();
        EnumC25295d m130906L = this.f86454p0.m130906L();
        EnumC25295d enumC25295d = EnumC25295d.EXTENDED;
        if (m130906L == enumC25295d) {
            padding8 = getPadding16();
        } else {
            padding8 = getPadding8();
        }
        setSafeAreaLeft(left + padding8);
        setSafeAreaTop(getTop() + getStatusBarHeight() + getPadding16());
        int right = getRight();
        if (this.f86454p0.m130906L() == enumC25295d) {
            padding82 = getPadding16();
        } else {
            padding82 = getPadding8();
        }
        setSafeAreaRight(right - padding82);
        setSafeAreaBottom(getBottom() - getPadding16());
        View targetView = getTargetView();
        if (targetView != null) {
            m90734d0();
            setTargetViewLeft(getTargetViewRect().left);
            setTargetViewTop(getTargetViewRect().top);
            setTargetViewWidth(getTargetViewRect().width());
            setTargetViewHeight(getTargetViewRect().height());
            if (this.f86454p0.m130905K()) {
                setTargetViewWidth(targetView.getWidth());
                setTargetViewHeight(targetView.getHeight());
            }
            setLeftSpaceValid((getTargetViewLeft() - getSafeAreaLeft()) - getPadding12());
            setTopSpaceValid((getTargetViewTop() - getSafeAreaTop()) - getPadding12());
            setRightSpaceValid(getSafeAreaRight() - ((getTargetViewLeft() + getTargetViewWidth()) + getPadding12()));
            setBottomSpaceValid(getSafeAreaBottom() - ((getTargetViewTop() + getTargetViewHeight()) + getPadding12()));
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: B */
    protected void mo90726B() {
        if (getTargetView() != null) {
            C24848g0 c24848g0 = null;
            if (m91376p()) {
                if (getVisibility() != 0) {
                    boolean z11 = true;
                    if (getShowHideAlphaAnimator() != null) {
                        Animator showHideAlphaAnimator = getShowHideAlphaAnimator();
                        AbstractC19074t.m100205c(showHideAlphaAnimator);
                        if (showHideAlphaAnimator.isRunning()) {
                            if (m91375n()) {
                                Animator showHideAlphaAnimator2 = getShowHideAlphaAnimator();
                                if (showHideAlphaAnimator2 != null) {
                                    showHideAlphaAnimator2.end();
                                }
                            } else {
                                z11 = false;
                            }
                        }
                    }
                    setVisibility(0);
                    if (z11) {
                        setShowHideAlphaAnimator(BasePopupView.m91368h(this, true, 0L, new Runnable() { // from class: com.zing.zalo.zdesign.component.d1
                            public /* synthetic */ RunnableC16970d1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                TooltipView.m90723e0(TooltipView.this);
                            }
                        }, 2, null));
                        Animator showHideAlphaAnimator3 = getShowHideAlphaAnimator();
                        if (showHideAlphaAnimator3 != null) {
                            showHideAlphaAnimator3.start();
                            c24848g0 = C24848g0.f119245a;
                        }
                        if (c24848g0 == null) {
                            mo90740x();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (getVisibility() == 0) {
                if (getShowHideAlphaAnimator() != null) {
                    Animator showHideAlphaAnimator4 = getShowHideAlphaAnimator();
                    AbstractC19074t.m100205c(showHideAlphaAnimator4);
                    if (showHideAlphaAnimator4.isRunning()) {
                        if (m91375n()) {
                            Animator showHideAlphaAnimator5 = getShowHideAlphaAnimator();
                            if (showHideAlphaAnimator5 != null) {
                                showHideAlphaAnimator5.end();
                            }
                        } else {
                            return;
                        }
                    }
                }
                setVisibility(0);
                setShowHideAlphaAnimator(BasePopupView.m91368h(this, false, 0L, new Runnable() { // from class: com.zing.zalo.zdesign.component.e1
                    public /* synthetic */ RunnableC16973e1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TooltipView.m90724f0(TooltipView.this);
                    }
                }, 2, null));
                Animator showHideAlphaAnimator6 = getShowHideAlphaAnimator();
                if (showHideAlphaAnimator6 != null) {
                    showHideAlphaAnimator6.start();
                    c24848g0 = C24848g0.f119245a;
                }
                if (c24848g0 == null) {
                    mo90739s();
                }
            }
        }
    }

    /* renamed from: Q */
    public void m90727Q() {
        m90728R(3);
    }

    /* renamed from: R */
    public final void m90728R(int i11) {
        m90729S(i11, false, true);
    }

    /* renamed from: S */
    public final void m90729S(int i11, boolean z11, boolean z12) {
        C24848g0 c24848g0;
        ViewTreeObserver viewTreeObserver;
        if (!getMDismissed() && getParent() != null) {
            setMDismissed(true);
            if (AbstractC27281h.Companion.m139666b()) {
                AbstractC20110a.m104543l("TooltipView").mo104548a("dismissInternal: finishType= " + i11 + ", tipCat= " + this.f86454p0.m130946n(), new Object[0]);
            }
            RunnableC16953b1 runnableC16953b1 = new Runnable() { // from class: com.zing.zalo.zdesign.component.b1

                /* renamed from: q */
                public final /* synthetic */ int f86533q;

                /* renamed from: r */
                public final /* synthetic */ boolean f86534r;

                public /* synthetic */ RunnableC16953b1(int i112, boolean z112) {
                    r2 = i112;
                    r3 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TooltipView.m90715T(TooltipView.this, r2, r3);
                }
            };
            if (getShowHideAlphaAnimator() != null) {
                Animator showHideAlphaAnimator = getShowHideAlphaAnimator();
                AbstractC19074t.m100205c(showHideAlphaAnimator);
                if (showHideAlphaAnimator.isRunning()) {
                    Animator showHideAlphaAnimator2 = getShowHideAlphaAnimator();
                    AbstractC19074t.m100205c(showHideAlphaAnimator2);
                    showHideAlphaAnimator2.end();
                }
            }
            setShowHideAlphaAnimator(BasePopupView.m91368h(this, false, 0L, runnableC16953b1, 2, null));
            Animator showHideAlphaAnimator3 = getShowHideAlphaAnimator();
            if (showHideAlphaAnimator3 != null) {
                showHideAlphaAnimator3.start();
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                runnableC16953b1.run();
            }
            View targetView = getTargetView();
            if (targetView != null && (viewTreeObserver = targetView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(getOnGlobalLayoutListener());
                viewTreeObserver.removeOnScrollChangedListener(getOnScrollChangedListener());
            }
        }
    }

    /* renamed from: V */
    protected void m90730V() {
        setTrackingViewHolder(new C25808b(new WeakReference(getMainPopupView())));
    }

    @Override // qi0.InterfaceC25296e
    /* renamed from: a */
    public boolean mo90731a() {
        if (getMainPopupView() != null) {
            return true;
        }
        return false;
    }

    @Override // qi0.InterfaceC25296e
    /* renamed from: b */
    public void mo90732b() {
        m90729S(0, false, false);
    }

    /* renamed from: c0 */
    public void m90733c0() {
        setMDismissed(false);
        AbstractC25298g abstractC25298g = this.f86453o0;
        if (abstractC25298g != null) {
            abstractC25298g.mo88432e(this);
        }
        if (getShowHideAlphaAnimator() != null) {
            Animator showHideAlphaAnimator = getShowHideAlphaAnimator();
            AbstractC19074t.m100205c(showHideAlphaAnimator);
            if (showHideAlphaAnimator.isRunning()) {
                Animator showHideAlphaAnimator2 = getShowHideAlphaAnimator();
                AbstractC19074t.m100205c(showHideAlphaAnimator2);
                showHideAlphaAnimator2.end();
            }
        }
        if (m91376p()) {
            setShowHideAlphaAnimator(BasePopupView.m91368h(this, true, 0L, null, 6, null));
            Animator showHideAlphaAnimator3 = getShowHideAlphaAnimator();
            if (showHideAlphaAnimator3 != null) {
                showHideAlphaAnimator3.start();
                return;
            }
            return;
        }
        mo90739s();
    }

    /* renamed from: d0 */
    public final void m90734d0() {
        int i11;
        int width;
        int i12;
        int i13;
        View targetView = getTargetView();
        if (targetView != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            targetView.getLocationOnScreen(iArr2);
            if (this.f86454p0.m130953u() != null) {
                int i14 = iArr2[0];
                Rect m130953u = this.f86454p0.m130953u();
                AbstractC19074t.m100205c(m130953u);
                int i15 = i14 + m130953u.left;
                int i16 = iArr2[1];
                Rect m130953u2 = this.f86454p0.m130953u();
                AbstractC19074t.m100205c(m130953u2);
                int i17 = i16 + m130953u2.top;
                i12 = i15 - iArr[0];
                i11 = i17 - iArr[1];
                Rect m130953u3 = this.f86454p0.m130953u();
                AbstractC19074t.m100205c(m130953u3);
                width = m130953u3.width() + i12;
                Rect m130953u4 = this.f86454p0.m130953u();
                AbstractC19074t.m100205c(m130953u4);
                i13 = m130953u4.height() + i11;
            } else {
                int i18 = iArr2[0];
                int i19 = iArr2[1];
                int i21 = i18 - iArr[0];
                i11 = i19 - iArr[1];
                width = targetView.getWidth() + i21;
                int height = targetView.getHeight() + i11;
                if (this.f86454p0.m130944m()) {
                    int paddingLeft = i21 + targetView.getPaddingLeft();
                    i11 += targetView.getPaddingTop();
                    width -= targetView.getPaddingRight();
                    i13 = height - targetView.getPaddingBottom();
                    i12 = paddingLeft;
                } else {
                    i12 = i21;
                    i13 = height;
                }
            }
            getTargetViewRect().set(i12, i11, width, i13);
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: f */
    protected void mo90735f() {
        int i11;
        ImageView arrowView = getArrowView();
        if (arrowView != null) {
            int measuredHeight = arrowView.getMeasuredHeight();
            int measuredWidth = arrowView.getMeasuredWidth();
            int translationX = (int) arrowView.getTranslationX();
            int width = arrowView.getWidth() + translationX;
            int translationY = (int) arrowView.getTranslationY();
            int height = arrowView.getHeight() + translationY;
            View mainPopupView = getMainPopupView();
            AbstractC19074t.m100205c(mainPopupView);
            int measuredWidth2 = mainPopupView.getMeasuredWidth();
            View mainPopupView2 = getMainPopupView();
            AbstractC19074t.m100205c(mainPopupView2);
            int measuredHeight2 = mainPopupView2.getMeasuredHeight();
            int childLeft = getChildLeft() + measuredWidth2;
            int childTop = getChildTop() + measuredHeight2;
            EnumC25294c overlayPlace = getOverlayPlace();
            if (overlayPlace == null) {
                i11 = -1;
            } else {
                i11 = C16940d.f86465a[overlayPlace.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            if (translationY - getChildTop() < getPadding16()) {
                                setArrowViewResId(AbstractC2810d.ic_arrow_left_top);
                                int targetViewTop = getTargetViewTop() + (getTargetViewWidth() / 2);
                                arrowView.setTranslationY(targetViewTop);
                                setChildTop(targetViewTop);
                                setChildLeft(getTargetViewLeft() + getTargetViewWidth() + (measuredWidth / 2));
                                return;
                            }
                            if (childTop - height < getPadding16()) {
                                setArrowViewResId(AbstractC2810d.ic_arrow_left_bottom);
                                int targetViewTop2 = (getTargetViewTop() + (getTargetViewWidth() / 2)) - measuredHeight;
                                arrowView.setTranslationY(targetViewTop2);
                                setChildTop((targetViewTop2 + arrowView.getHeight()) - measuredHeight2);
                                setChildLeft(getTargetViewLeft() + getTargetViewWidth() + (measuredWidth / 2));
                                return;
                            }
                            setChildLeft(getTargetViewLeft() + getTargetViewWidth() + measuredWidth);
                            setArrowViewResId(AbstractC2810d.ic_arrow_left_center);
                            return;
                        }
                        return;
                    }
                    if (translationY - getChildTop() < getPadding16()) {
                        setArrowViewResId(AbstractC2810d.ic_arrow_right_top);
                        int targetViewTop3 = getTargetViewTop() + (getTargetViewWidth() / 2);
                        arrowView.setTranslationY(targetViewTop3);
                        setChildTop(targetViewTop3);
                        setChildLeft((getTargetViewLeft() - measuredWidth2) - (measuredWidth / 2));
                        return;
                    }
                    if (childTop - height < getPadding16()) {
                        setArrowViewResId(AbstractC2810d.ic_arrow_right_bottom);
                        int targetViewTop4 = (getTargetViewTop() + (getTargetViewWidth() / 2)) - measuredHeight;
                        arrowView.setTranslationY(targetViewTop4);
                        setChildTop((targetViewTop4 + arrowView.getHeight()) - measuredHeight2);
                        setChildLeft((getTargetViewLeft() - measuredWidth2) - (measuredWidth / 2));
                        return;
                    }
                    setChildLeft((getTargetViewLeft() - measuredWidth2) - measuredWidth);
                    setArrowViewResId(AbstractC2810d.ic_arrow_right_center);
                    return;
                }
                if (translationX - getChildLeft() < getPadding16()) {
                    setArrowViewResId(AbstractC2810d.ic_arrow_up_left);
                    int targetViewLeft = getTargetViewLeft() + (getTargetViewWidth() / 2);
                    arrowView.setTranslationX(targetViewLeft);
                    setChildLeft(targetViewLeft);
                    setChildTop(getTargetViewTop() + getTargetViewHeight() + (measuredHeight / 2));
                    return;
                }
                if (childLeft - width < getPadding16()) {
                    setArrowViewResId(AbstractC2810d.ic_arrow_up_right);
                    int targetViewLeft2 = (getTargetViewLeft() + (getTargetViewWidth() / 2)) - measuredWidth;
                    arrowView.setTranslationX(targetViewLeft2);
                    setChildLeft((targetViewLeft2 + arrowView.getWidth()) - measuredWidth2);
                    setChildTop(getTargetViewTop() + getTargetViewHeight() + (measuredHeight / 2));
                    return;
                }
                setChildTop(getTargetViewTop() + getTargetViewHeight() + measuredHeight);
                setArrowViewResId(AbstractC2810d.ic_arrow_up_center);
                return;
            }
            if (translationX - getChildLeft() < getPadding16()) {
                setArrowViewResId(AbstractC2810d.ic_arrow_down_left);
                int targetViewLeft3 = getTargetViewLeft() + (getTargetViewWidth() / 2);
                arrowView.setTranslationX(targetViewLeft3);
                setChildLeft(targetViewLeft3);
                setChildTop((getTargetViewTop() - measuredHeight2) - (measuredHeight / 2));
                return;
            }
            if (childLeft - width < getPadding16()) {
                setArrowViewResId(AbstractC2810d.ic_arrow_down_right);
                int targetViewLeft4 = (getTargetViewLeft() + (getTargetViewWidth() / 2)) - measuredWidth;
                arrowView.setTranslationX(targetViewLeft4);
                setChildLeft((targetViewLeft4 + arrowView.getWidth()) - measuredWidth2);
                setChildTop((getTargetViewTop() - measuredHeight2) - (measuredHeight / 2));
                return;
            }
            setChildTop((getTargetViewTop() - measuredHeight2) - measuredHeight);
            setArrowViewResId(AbstractC2810d.ic_arrow_down_center);
        }
    }

    public final C25297f getConfigs() {
        return this.f86454p0;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    protected int getDimColor() {
        C25297f c25297f = this.f86454p0;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        return c25297f.m130942l(context);
    }

    public final String getTooltipId() {
        return this.f86445g0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: j */
    public void mo90736j(int i11, int i12, int i13) {
        BoundedScrollView boundedScrollView;
        int i14;
        super.mo90736j(i11, i12, i13);
        int max = Math.max(i11, i12);
        if ((1 > i13 || i13 >= max) && (boundedScrollView = this.f86450l0) != null) {
            LinearLayout linearLayout = this.f86451m0;
            if (linearLayout != null) {
                i14 = linearLayout.getHeight();
            } else {
                i14 = 0;
            }
            boundedScrollView.setMaxHeight(max - i14);
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: k */
    protected void mo90737k() {
        int i11;
        ImageView arrowView = getArrowView();
        AbstractC19074t.m100205c(arrowView);
        int measuredWidth = arrowView.getMeasuredWidth();
        ImageView arrowView2 = getArrowView();
        AbstractC19074t.m100205c(arrowView2);
        int measuredHeight = arrowView2.getMeasuredHeight();
        if (getTargetView() != null) {
            EnumC25294c overlayPlace = getOverlayPlace();
            if (overlayPlace == null) {
                i11 = -1;
            } else {
                i11 = C16940d.f86465a[overlayPlace.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        setChildLeft(getTargetViewLeft() + getTargetViewWidth());
                        setChildTop(getTargetViewTop() + ((getTargetViewHeight() - measuredHeight) / 2));
                        setArrowViewResId(AbstractC2810d.ic_arrow_left_center);
                        return;
                    } else {
                        setChildLeft(getTargetViewLeft() - measuredWidth);
                        setChildTop(getTargetViewTop() + ((getTargetViewWidth() - measuredHeight) / 2));
                        setArrowViewResId(AbstractC2810d.ic_arrow_right_center);
                        return;
                    }
                }
                setChildTop(getTargetViewTop() + getTargetViewHeight());
                setChildLeft(getTargetViewLeft() + ((getTargetViewWidth() - measuredWidth) / 2));
                setArrowViewResId(AbstractC2810d.ic_arrow_up_center);
                return;
            }
            setChildTop(getTargetViewTop() - measuredHeight);
            setChildLeft(getTargetViewLeft() + ((getTargetViewWidth() - measuredWidth) / 2));
            setArrowViewResId(AbstractC2810d.ic_arrow_down_center);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "event");
        C27279f c27279f = C27279f.f128337a;
        boolean m139653c = c27279f.m139653c(getMainPopupView(), motionEvent);
        boolean m139654d = c27279f.m139654d(getTargetView(), motionEvent, this.f86454p0.m130953u(), this.f86454p0.m130954v());
        boolean m139653c2 = c27279f.m139653c(this.f86446h0, motionEvent);
        boolean m139653c3 = c27279f.m139653c(this.f86447i0, motionEvent);
        if (!m139653c2 && !m139653c3) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean m139653c4 = c27279f.m139653c(this.f86451m0, motionEvent);
        if (m139654d) {
            if (this.f86454p0.m130900F()) {
                m90729S(1, true, true);
            }
            if (!this.f86454p0.m130948p()) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (m139653c) {
            if (this.f86454p0.m130903I()) {
                if (m139653c2) {
                    return super.onTouchEvent(motionEvent);
                }
                if (!m139653c4) {
                    return false;
                }
            }
            if (this.f86454p0.m130901G() && z11) {
                if (m139653c3) {
                    m90729S(1, m139654d, false);
                    return super.onTouchEvent(motionEvent);
                }
                m90729S(1, m139654d, true);
                return super.onTouchEvent(motionEvent);
            }
            if (this.f86454p0.m130902H()) {
                m90729S(1, false, true);
            }
            if (!m139653c4) {
                return false;
            }
            return true;
        }
        if (this.f86454p0.m130899E()) {
            m90729S(1, false, true);
        }
        if (!this.f86454p0.m130952t() && this.f86454p0.m130947o()) {
            return super.onTouchEvent(motionEvent);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: q */
    protected boolean mo90738q() {
        Object parent;
        int i11;
        View targetView = getTargetView();
        if (targetView == null || (parent = targetView.getParent()) == null) {
            return false;
        }
        View targetView2 = getTargetView();
        AbstractC19074t.m100205c(targetView2);
        boolean isShown = targetView2.isShown();
        Rect rect = new Rect();
        View targetView3 = getTargetView();
        AbstractC19074t.m100205c(targetView3);
        if (!targetView3.getGlobalVisibleRect(rect)) {
            isShown = false;
        }
        if (isShown && this.f86454p0.m130953u() != null) {
            m90734d0();
            View view = (View) parent;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            int width = view.getWidth() + i12;
            int height = view.getHeight() + i13;
            EnumC25294c overlayPlace = getOverlayPlace();
            if (overlayPlace == null) {
                i11 = -1;
            } else {
                i11 = C16940d.f86465a[overlayPlace.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (getTargetViewRect().left > width || getTargetViewRect().right < i12 || getTargetViewRect().top > height || getTargetViewRect().bottom < i13) {
                        return false;
                    }
                } else if (getTargetViewRect().left > width || getTargetViewRect().right < i12 || getTargetViewRect().bottom > height || getTargetViewRect().bottom < i13) {
                    return false;
                }
            } else if (getTargetViewRect().left > width || getTargetViewRect().right < i12 || getTargetViewRect().top > height || getTargetViewRect().bottom < i13) {
                return false;
            }
        }
        return isShown;
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: s */
    protected void mo90739s() {
        long j11;
        String str;
        this.f86463y0.removeMessages(0);
        this.f86463y0.removeMessages(2);
        if (getMStartShowingTime() > 0) {
            j11 = System.currentTimeMillis() - getMStartShowingTime();
        } else {
            j11 = 0;
        }
        setMTotalShowingTime(getMTotalShowingTime() + ((int) j11));
        setMStartShowingTime(0L);
        if (AbstractC27281h.Companion.m139666b()) {
            if (this.f86454p0.m130940k() != null) {
                str = C25292a.f121281a.m130869b();
            } else {
                str = "N/A";
            }
            AbstractC20110a.m104543l("TooltipView").mo104548a("onHidden: tipCat= " + str + ", mTotalShowingTime= " + getMTotalShowingTime(), new Object[0]);
        }
        setVisibility(4);
        AbstractC16939c abstractC16939c = this.f86456r0;
        if (abstractC16939c != null) {
            abstractC16939c.mo60330a();
        }
    }

    public final void setButtonLeftClickListener(View.OnClickListener onClickListener) {
        this.f86461w0 = onClickListener;
        if (this.f86457s0.length() == 0) {
            setButtonLeftIdTracking("btn_skip_tip");
        }
        ButtonWithProgress buttonWithProgress = this.f86447i0;
        if (buttonWithProgress != null) {
            buttonWithProgress.setIdTracking(this.f86457s0);
        }
        ButtonWithProgress buttonWithProgress2 = this.f86447i0;
        if (buttonWithProgress2 != null) {
            buttonWithProgress2.setTrackingExtraData(this.f86459u0);
        }
        ButtonWithProgress buttonWithProgress3 = this.f86447i0;
        if (buttonWithProgress3 != null) {
            buttonWithProgress3.setOnClickListener(this.f86461w0);
        }
    }

    public final void setButtonLeftExtraData(C0708i c0708i) {
        this.f86459u0 = c0708i;
    }

    public final void setButtonLeftIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f86457s0 = str;
    }

    public final void setButtonRightClickListener(View.OnClickListener onClickListener) {
        this.f86462x0 = onClickListener;
        if (this.f86458t0.length() == 0) {
            setButtonRightIdTracking("btn_next_tip");
        }
        ButtonWithProgress buttonWithProgress = this.f86446h0;
        if (buttonWithProgress != null) {
            buttonWithProgress.setIdTracking(this.f86458t0);
        }
        ButtonWithProgress buttonWithProgress2 = this.f86446h0;
        if (buttonWithProgress2 != null) {
            buttonWithProgress2.setTrackingExtraData(this.f86460v0);
        }
        ButtonWithProgress buttonWithProgress3 = this.f86446h0;
        if (buttonWithProgress3 != null) {
            buttonWithProgress3.setOnClickListener(this.f86462x0);
        }
    }

    public final void setButtonRightExtraData(C0708i c0708i) {
        this.f86460v0 = c0708i;
    }

    public final void setButtonRightIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        this.f86458t0 = str;
    }

    public final void setConfigs(C25297f c25297f) {
        C24848g0 c24848g0;
        if (c25297f == null) {
            c25297f = new C25297f();
        }
        this.f86454p0 = c25297f;
        if (c25297f.m130897C() == null) {
            C25297f c25297f2 = this.f86454p0;
            C18438c c18438c = C18438c.f92957a;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            InterfaceC18437b m97716b = c18438c.m97716b(context);
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            c25297f2.m130935h0(m97716b.mo88402a(context2));
        }
        m90730V();
        setTargetView(this.f86454p0.m130956x());
        setTargetRounded(this.f86454p0.m130955w());
        setOverlayPlace(this.f86454p0.m130949q());
        setClearTargetShape(this.f86454p0.m130930f());
        if (this.f86454p0.m130906L() != EnumC25295d.COMPACT && this.f86454p0.m130906L() != EnumC25295d.EXTENDED) {
            if (this.f86454p0.m130938j() != null) {
                setMainPopupView(this.f86454p0.m130938j());
            }
        } else if (this.f86454p0.m130938j() == null) {
            m90719Y();
        } else {
            setMainPopupView(this.f86454p0.m130938j());
        }
        View mainPopupView = getMainPopupView();
        ViewParent viewParent = null;
        if (mainPopupView != null) {
            ButtonWithProgress buttonWithProgress = this.f86446h0;
            if (buttonWithProgress == null) {
                buttonWithProgress = (ButtonWithProgress) mainPopupView.findViewById(AbstractC2811e.tooltip_btn_right);
            }
            this.f86446h0 = buttonWithProgress;
            ButtonWithProgress buttonWithProgress2 = this.f86447i0;
            if (buttonWithProgress2 == null) {
                buttonWithProgress2 = (ButtonWithProgress) mainPopupView.findViewById(AbstractC2811e.tooltip_btn_left);
            }
            this.f86447i0 = buttonWithProgress2;
            if (mainPopupView.getParent() != null && !AbstractC19074t.m100204b(mainPopupView.getParent(), this) && (mainPopupView.getParent() instanceof ViewGroup)) {
                ViewParent parent = mainPopupView.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(mainPopupView);
            }
            if (mainPopupView.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = mainPopupView.getLayoutParams();
                if (layoutParams != null) {
                    AbstractC19074t.m100207e(layoutParams, "layoutParams");
                    addView(mainPopupView);
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 == null) {
                    addView(mainPopupView, new ViewGroup.LayoutParams(-2, -2));
                }
            }
        }
        if (this.f86454p0.m130922b() != null && this.f86454p0.m130951s()) {
            if (getArrowView() == null) {
                setArrowView(new ImageView(getContext()));
            }
            ImageView arrowView = getArrowView();
            if (arrowView != null) {
                viewParent = arrowView.getParent();
            }
            if (viewParent == null) {
                addView(getArrowView(), 0, new ViewGroup.LayoutParams(-2, -2));
            }
            ImageView arrowView2 = getArrowView();
            if (arrowView2 != null) {
                arrowView2.setImageDrawable(this.f86454p0.m130922b());
            }
        }
        requestLayout();
        if (getVisibility() == 0 && getShowHideAlphaAnimator() != null) {
            mo90740x();
        }
    }

    public final void setOnTooltipFinishedListener(InterfaceC16938b interfaceC16938b) {
        this.f86455q0 = interfaceC16938b;
    }

    public final void setOnTooltipShowHideListener(AbstractC16939c abstractC16939c) {
        this.f86456r0 = abstractC16939c;
    }

    public final void setTargetIconDrawable(Drawable drawable) {
        setTargetIcon(drawable);
        requestLayout();
    }

    public final void setTooltipId(String str) {
        this.f86445g0 = str;
    }

    public final void setTooltipManager(Object obj) {
        AbstractC19074t.m100208f(obj, "tooltipManager");
        AbstractC25298g abstractC25298g = this.f86453o0;
        if (abstractC25298g != null) {
            abstractC25298g.mo88435h(obj);
        }
    }

    @Override // com.zing.zalo.zdesign.layout.BasePopupView
    /* renamed from: x */
    protected void mo90740x() {
        this.f86463y0.removeMessages(0);
        setMStartShowingTime(System.currentTimeMillis());
        if (this.f86454p0.m130940k() != null) {
            C25292a c25292a = C25292a.f121281a;
            if (c25292a.m130868a()) {
                long j11 = 1000;
                long m130870c = (c25292a.m130870c() * j11) - getMTotalShowingTime();
                this.f86463y0.sendEmptyMessageDelayed(0, m130870c);
                if (AbstractC27281h.Companion.m139666b()) {
                    AbstractC20110a.m104543l("TooltipView").mo104548a("onShown: tipCat= " + c25292a.m130869b() + ", tipDuration= " + (c25292a.m130870c() * j11) + ", mTotalShowingTime= " + getMTotalShowingTime() + ", remainedDuration= " + m130870c, new Object[0]);
                }
            }
        }
        if (this.f86454p0.m130904J()) {
            this.f86463y0.sendEmptyMessageDelayed(2, 10L);
        }
        setVisibility(0);
        AbstractC16939c abstractC16939c = this.f86456r0;
        if (abstractC16939c != null) {
            abstractC16939c.mo60331b();
        }
    }
}
