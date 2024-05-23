package me0;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.res.AbstractC1401h;
import bo.C3020p0;
import bo.C3047v0;
import bp0.AbstractC3096i0;
import bz.C3162g;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.reddot.RedDotRobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import dk0.C18020c;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.Locale;
import kd0.C21697g;
import mm0.AbstractC23350e;
import p128ed.C18387b;
import p161fg.C18922m;
import p164fn.C19027a;
import p175g0.AbstractC19178a;
import p193h0.AbstractC19694b;
import p207he.C20024r;
import p248iy.C20882b;
import p262jb.AbstractC21196a;
import p266jg.C21243a;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p379o3.C23999j;
import p399op.C24405q;
import p502s3.C26117c;
import p542ub.InterfaceC27218a;
import p588vw.C28646l;
import p594w1.C28685a;
import qd0.C25239f;
import tg.C26674y;
import th.AbstractC26683d;
import ui0.C27280g;
import vg.C28020b3;
import vg.C28023b6;
import vg.C28181s2;
import zl0.AbstractC32229f;
import zl0.AbstractC32232i;

/* renamed from: me0.l9 */
/* loaded from: classes.dex */
public abstract class AbstractC23136l9 {

    /* renamed from: c */
    private static Rect f112242c;

    /* renamed from: a */
    public static View.OnClickListener f112240a = new View.OnClickListener() { // from class: me0.i9
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC23136l9.m118674R0(view);
        }
    };

    /* renamed from: b */
    public static final String[] f112241b = {"drawable-mdpi", "drawable-hdpi", "drawable-xhdpi", "drawable-xxhdpi", "drawable-xxxhdpi"};

    /* renamed from: d */
    public static volatile boolean f112243d = true;

    /* renamed from: e */
    private static final RectF f112244e = new RectF();

    /* renamed from: f */
    private static final int[] f112245f = {0, 0};

    /* renamed from: g */
    static int f112246g = -1;

    /* renamed from: h */
    static int f112247h = -1;

    /* renamed from: i */
    static int f112248i = 0;

    /* renamed from: j */
    static int f112249j = 0;

    /* renamed from: k */
    static int f112250k = -1;

    /* renamed from: me0.l9$a */
    /* loaded from: classes4.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f112251p;

        /* renamed from: q */
        final /* synthetic */ View f112252q;

        /* renamed from: r */
        final /* synthetic */ Drawable f112253r;

        a(boolean z11, View view, Drawable drawable) {
            this.f112251p = z11;
            this.f112252q = view;
            this.f112253r = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                if (!this.f112251p) {
                    this.f112252q.setBackground(this.f112253r);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.l9$b */
    /* loaded from: classes4.dex */
    public class b extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f112254a;

        b(int i11) {
            this.f112254a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view != null && outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f112254a);
            }
        }
    }

    /* renamed from: A */
    public static int m118639A(int i11) {
        return m118641B(MainApplication.getAppContext(), i11);
    }

    /* renamed from: A0 */
    public static Typeface m118640A0(Context context, boolean z11) {
        if (z11) {
            if (C13778s1.m76960a()) {
                return C13718q1.m76694c(context, 7);
            }
            return Typeface.DEFAULT_BOLD;
        }
        if (C13778s1.m76960a()) {
            return C13718q1.m76694c(context, 5);
        }
        return Typeface.DEFAULT;
    }

    /* renamed from: B */
    public static int m118641B(Context context, int i11) {
        return AbstractC1388a.m6961c(context, i11);
    }

    /* renamed from: B0 */
    public static Typeface m118642B0(boolean z11) {
        return m118640A0(MainApplication.getAppContext(), z11);
    }

    /* renamed from: C */
    public static ColorStateList m118643C(int i11) {
        return m118645D(MainApplication.getAppContext(), i11);
    }

    /* renamed from: C0 */
    public static Rect m118644C0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        return new Rect(i11, i12, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i12);
    }

    /* renamed from: D */
    public static ColorStateList m118645D(Context context, int i11) {
        if (context == null) {
            return null;
        }
        return AbstractC19694b.m103335c(context, i11);
    }

    /* renamed from: D0 */
    public static boolean m118646D0(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a instanceof ZaloActivity) {
            return AbstractC32229f.m155442n((ZaloActivity) interfaceC27218a);
        }
        return true;
    }

    /* renamed from: E */
    public static Context m118647E(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: E0 */
    public static void m118648E0(View view, int i11, long j11, boolean z11, Drawable drawable, TooltipView tooltipView) {
        int i12;
        if (view != null) {
            try {
                if (view.getVisibility() == 0) {
                    int argb = Color.argb(0, Color.red(i11), Color.green(i11), Color.blue(i11));
                    if (z11) {
                        if (drawable instanceof ColorDrawable) {
                            view.setBackground(null);
                        }
                        i12 = i11;
                    } else {
                        if (tooltipView != null) {
                            tooltipView.setOnTooltipFinishedListener(null);
                            tooltipView.m90727Q();
                        }
                        i12 = argb;
                        argb = i11;
                    }
                    ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(argb), Integer.valueOf(i12));
                    ofObject.setDuration(300L);
                    ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: me0.j9

                        /* renamed from: p */
                        public final /* synthetic */ View f112205p;

                        public /* synthetic */ C23114j9(View view2) {
                            r1 = view2;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            AbstractC23136l9.m118668O0(r1, valueAnimator);
                        }
                    });
                    ofObject.addListener(new a(z11, view2, drawable));
                    ofObject.start();
                    if (z11) {
                        view2.postDelayed(new Runnable() { // from class: me0.k9

                            /* renamed from: p */
                            public final /* synthetic */ View f112231p;

                            /* renamed from: q */
                            public final /* synthetic */ int f112232q;

                            /* renamed from: r */
                            public final /* synthetic */ long f112233r;

                            /* renamed from: s */
                            public final /* synthetic */ Drawable f112234s;

                            public /* synthetic */ RunnableC23125k9(View view2, int i112, long j112, Drawable drawable2) {
                                r1 = view2;
                                r2 = i112;
                                r3 = j112;
                                r5 = drawable2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC23136l9.m118648E0(r1, r2, r3, false, r5, null);
                            }
                        }, j112);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: F */
    public static Context m118649F(Locale locale) {
        return m118647E(MainApplication.getAppContext(), locale);
    }

    /* renamed from: F0 */
    public static boolean m118650F0(Context context) {
        if (context != null) {
            if (m118763y(context) > m118766z(context)) {
                return true;
            }
            return false;
        }
        return m118656I0();
    }

    /* renamed from: G */
    public static ZaloView m118651G() {
        if (ZaloBubbleActivity.m57017B5() && ZaloBubbleActivity.m57028V4() != null && ZaloBubbleActivity.m57028V4().mo35579p() != null) {
            return ZaloBubbleActivity.m57028V4().mo35579p().m93012K0();
        }
        if (C18922m.m99141t().m99164y() && C18922m.m99141t().m99165z() && C18922m.m99141t().m99159s() != null && C18922m.m99141t().m99159s().mo35579p() != null) {
            return C18922m.m99141t().m99159s().mo35579p().m93012K0();
        }
        if (ZaloLauncherActivity.m57061E5() != null && ZaloLauncherActivity.m57061E5().mo35579p() != null) {
            return ZaloLauncherActivity.m57061E5().mo35579p().m93012K0();
        }
        return null;
    }

    /* renamed from: G0 */
    public static boolean m118652G0(Context context) {
        if (m118704e0(context) == 240) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static int m118653H(Context context) {
        int m118704e0 = m118704e0(context);
        if (m118704e0 <= 160) {
            return 0;
        }
        if (m118704e0 <= 240) {
            return 1;
        }
        if (m118704e0 <= 320) {
            return 2;
        }
        if (m118704e0 <= 480) {
            return 3;
        }
        return 4;
    }

    /* renamed from: H0 */
    public static boolean m118654H0(Context context) {
        int m118704e0 = m118704e0(context);
        if (m118704e0 != 120 && m118704e0 != 160 && m118731n0(context) > 480) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public static int m118655I(int i11) {
        return m118657J(MainApplication.getAppContext(), i11);
    }

    /* renamed from: I0 */
    public static boolean m118656I0() {
        if (m118722k0() < m118713h0()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static int m118657J(Context context, int i11) {
        return (int) (context.getResources().getDimension(i11) + 0.5f);
    }

    /* renamed from: J0 */
    public static boolean m118658J0(Context context) {
        if (m118704e0(context) < 640) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static int m118659K(int i11) {
        return m118661L(MainApplication.getAppContext(), i11);
    }

    /* renamed from: K0 */
    public static boolean m118660K0(Context context) {
        if (m118704e0(context) < 320) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public static int m118661L(Context context, int i11) {
        return context.getResources().getDimensionPixelSize(i11);
    }

    /* renamed from: L0 */
    public static boolean m118662L0(View view, int i11, int i12, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        view2.getLocationOnScreen(iArr);
        int i15 = iArr[0] + i11;
        int i16 = iArr[1] + i12;
        if (i15 <= i13 || i15 >= i13 + view.getMeasuredWidth() || i16 <= i14 || i16 >= i14 + view.getMeasuredHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public static Drawable m118663M(int i11) {
        return m118665N(MainApplication.getAppContext(), i11);
    }

    /* renamed from: M0 */
    public static boolean m118664M0(View view, MotionEvent motionEvent, View view2) {
        if (motionEvent != null && view != null && view2 != null) {
            return m118662L0(view, (int) motionEvent.getX(), (int) motionEvent.getY(), view2);
        }
        return false;
    }

    /* renamed from: N */
    public static Drawable m118665N(Context context, int i11) {
        if (context == null) {
            return null;
        }
        return AbstractC19694b.m103336d(context, i11);
    }

    /* renamed from: N0 */
    public static boolean m118666N0(View view) {
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static int m118667O(boolean z11, boolean z12) {
        return -1;
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m118668O0(View view, ValueAnimator valueAnimator) {
        try {
            view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: P */
    public static int m118669P(boolean z11, boolean z12) {
        return -1;
    }

    /* renamed from: Q */
    public static int m118671Q(int i11) {
        return m118673R(MainApplication.getAppContext(), i11);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m118672Q0() {
        AbstractC23306f.m120716u0().m154500d();
    }

    /* renamed from: R */
    public static int m118673R(Context context, int i11) {
        return context.getResources().getInteger(i11);
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m118674R0(View view) {
    }

    /* renamed from: S */
    public static String m118675S(Locale locale, int i11) {
        return m118649F(locale).getText(i11).toString();
    }

    /* renamed from: S0 */
    public static int m118676S0(TextView textView, int i11, String str) {
        String str2;
        String str3;
        if (textView == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(textView.getText())) {
            str2 = textView.getText().toString();
        } else {
            str2 = "abcd";
        }
        if (!TextUtils.isEmpty(str)) {
            str3 = str;
        } else {
            str3 = str2;
        }
        float lineSpacingExtra = textView.getLineSpacingExtra();
        return new StaticLayout(str3, textView.getPaint(), i11, Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), lineSpacingExtra, textView.getIncludeFontPadding()).getHeight();
    }

    /* renamed from: T */
    public static String m118677T(Locale locale, int i11, Object... objArr) {
        return m118649F(locale).getString(i11, objArr);
    }

    /* renamed from: T0 */
    public static void m118678T0(Activity activity) {
        m118680U0(activity, true);
    }

    /* renamed from: U */
    public static int m118679U() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: U0 */
    public static void m118680U0(Activity activity, boolean z11) {
        if (activity != null) {
            try {
                activity.moveTaskToBack(true);
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (z11 && C28023b6.m141250h0().m141327Z()) {
            AbstractC23059e9.m118331j();
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.h9
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23136l9.m118672Q0();
                }
            });
            AbstractC23304d.f113338V0 = false;
            AbstractC23304d.f113341W = 0;
            AbstractC23304d.f113337V = false;
            AbstractC0924m0.m3693bh(false);
            AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
            AbstractC23309i.m120913Es("");
            AbstractC23304d.f113350Y0 = 0L;
            AbstractC23304d.f113253A = null;
            AbstractC23304d.f113257B = null;
            AbstractC23304d.f113254A0 = false;
            C23999j.m125715X1(2);
            C23999j.m125715X1(1);
            C26117c.m134452a();
            C19027a.m100086c().m100087a();
            C3162g.f13363a.m15933r();
            C7853b.m40052a0().m40144o1();
            C7853b.m40052a0().m40101O0();
            C28020b3.f130648a.m141186N();
            C28181s2.f131306a.m141724e();
            C26674y.m136865t().m136872I();
            C26674y.m136865t().m136870E();
            C26674y.m136865t().m136871G();
            C26674y.m136865t().m136873J();
            C24405q.m127646x().mo127603o();
            C28646l.m143315b();
            C20882b.m109134j();
            AbstractC23304d.f113413n.clear();
            C25239f.f121027a.m130561n();
            C21933s.m114404I().m114474k();
            C21933s.m114404I().m114476l();
            C18020c.m95817m().m95830h();
            C18387b.f92777a.m97388b();
        }
    }

    /* renamed from: V */
    public static int m118681V() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: V0 */
    public static int m118682V0(String str) {
        if ("medium".equals(str)) {
            return 7;
        }
        if ("bold".equals(str)) {
            return 9;
        }
        if ("italic".equals(str)) {
            return 6;
        }
        return 5;
    }

    /* renamed from: W */
    public static int m118683W(Context context) {
        DisplayMetrics displayMetrics;
        if (context != null) {
            displayMetrics = context.getResources().getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return m118681V();
    }

    /* renamed from: W0 */
    public static void m118684W0(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: X */
    public static int m118685X() {
        return m118687Y(MainApplication.getAppContext());
    }

    /* renamed from: X0 */
    public static void m118686X0(Object obj, boolean z11) {
        if (obj instanceof ZaloView) {
            ZaloView zaloView = (ZaloView) obj;
            if (zaloView.m92676n2() != null && zaloView.m92672lJ()) {
                if (zaloView.m92676n2().mo35576n3()) {
                    m118686X0(zaloView.m92656bJ(), z11);
                    return;
                } else {
                    m118686X0(zaloView.m92676n2().getWindow(), z11);
                    return;
                }
            }
            return;
        }
        if (obj instanceof Window) {
            Window window = (Window) obj;
            if (z11) {
                window.setFlags(1024, 1024);
                return;
            } else {
                window.clearFlags(1024);
                return;
            }
        }
        if (obj instanceof View) {
            View view = (View) obj;
            if (z11) {
                view.setSystemUiVisibility(view.getSystemUiVisibility() | 4);
            } else {
                view.setSystemUiVisibility(view.getSystemUiVisibility() & (-5));
            }
        }
    }

    /* renamed from: Y */
    public static int m118687Y(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: Y0 */
    public static void m118688Y0(ActionBar actionBar) {
        if (actionBar == null) {
            return;
        }
        actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
        actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
    }

    /* renamed from: Z */
    public static float m118689Z(float f11, boolean z11) {
        return m118692a0(MainApplication.getAppContext(), f11, z11);
    }

    /* renamed from: Z0 */
    public static void m118690Z0(ActionBar actionBar) {
        if (actionBar == null) {
            return;
        }
        actionBar.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
        actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
        actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormTitleColor));
        actionBar.setSubTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor2));
    }

    /* renamed from: a0 */
    public static float m118692a0(Context context, float f11, boolean z11) {
        float f12;
        float f13 = f11 / 2.54f;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z11) {
            f12 = displayMetrics.xdpi;
        } else {
            f12 = displayMetrics.ydpi;
        }
        return f13 * f12;
    }

    /* renamed from: a1 */
    public static void m118693a1(View view, int i11) {
        m118696b1(view, m118665N(view.getContext(), i11));
    }

    /* renamed from: b0 */
    public static int m118695b0(Layout layout) {
        int i11 = 0;
        try {
            int lineCount = layout.getLineCount();
            int i12 = 0;
            while (i11 < lineCount) {
                try {
                    i12 = Math.max(i12, (int) layout.getLineWidth(i11));
                    i11++;
                } catch (Exception e11) {
                    e = e11;
                    i11 = i12;
                    e.printStackTrace();
                    return i11;
                }
            }
            return i12;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: b1 */
    public static void m118696b1(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: c0 */
    public static Resources m118698c0() {
        return m118701d0(MainApplication.getAppContext());
    }

    /* renamed from: c1 */
    public static void m118699c1(View view, int i11) {
        ColorDrawable colorDrawable;
        if (i11 != 0) {
            colorDrawable = new ColorDrawable(i11);
        } else {
            colorDrawable = null;
        }
        m118696b1(view, colorDrawable);
    }

    /* renamed from: d0 */
    public static Resources m118701d0(Context context) {
        return context.getResources();
    }

    /* renamed from: d1 */
    public static void m118702d1(Context context, C3020p0 c3020p0, TextView textView) {
        Drawable m7082f;
        if (c3020p0 != null) {
            C3047v0 c3047v0 = c3020p0.f12022B;
            if (c3047v0.f12280b != null && textView != null) {
                try {
                    int i11 = c3047v0.f12279a;
                    if (ContactProfile.m40347T0(i11) && ContactProfile.m40345C0(i11)) {
                        int m118667O = m118667O(ContactProfile.m40345C0(i11), C21927m.m114302u().m114318P(c3020p0.f12022B.f12280b));
                        if (m118667O != -1 && (m7082f = AbstractC1401h.m7082f(context.getResources(), m118667O, context.getTheme())) != null) {
                            m7082f.setBounds(0, 0, m7082f.getMinimumWidth(), m7082f.getMinimumHeight());
                            textView.setCompoundDrawables(m7082f, null, null, null);
                            textView.setCompoundDrawablePadding(5);
                        }
                    } else {
                        textView.setCompoundDrawables(null, null, null, null);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: e */
    public static void m118703e(CharSequence charSequence, C21697g c21697g, int i11) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append(charSequence);
            Drawable m7082f = AbstractC1401h.m7082f(c21697g.getContext().getResources(), AbstractC16803z.none, c21697g.getContext().getTheme());
            if (m7082f != null) {
                m7082f.setBounds(0, 0, i11, 1);
                spannableStringBuilder.setSpan(new ImageSpan(m7082f), 0, 1, 33);
                c21697g.m111959G1(spannableStringBuilder);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            c21697g.m111959G1(charSequence);
        }
    }

    /* renamed from: e0 */
    public static int m118704e0(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: e1 */
    public static void m118705e1(Context context, int i11, String str, TextView textView) {
        m118708f1(context, i11, str, textView, true);
    }

    /* renamed from: f */
    public static void m118706f(Context context, boolean z11) {
        boolean z12;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i11 = f112250k;
            if (i11 > 0 && i11 != displayMetrics.densityDpi) {
                z12 = true;
            } else {
                z12 = false;
            }
            f112250k = displayMetrics.densityDpi;
            if (z12 && z11 && AbstractC23309i.m120899Ee()) {
                if (!AbstractC26683d.f126391B && !AbstractC3096i0.m15511R() && !C20024r.m103941j()) {
                    AbstractC23193r0.m119508q();
                    return;
                }
                DisplayMetrics displayMetrics2 = MainApplication.getAppContext().getResources().getDisplayMetrics();
                float f11 = displayMetrics2.density;
                float f12 = displayMetrics.density;
                if (f11 != f12) {
                    displayMetrics2.densityDpi = displayMetrics.densityDpi;
                    displayMetrics2.density = f12;
                }
                AbstractC23222t7.m119685a();
                AbstractC19646n0.m102940V1();
                C28685a.m143693b(context).m143696d(new Intent("com.zing.zalo.action.ACTION_DENSITY_CONFIG_CHANGED"));
                return;
            }
            if (context instanceof ZaloLauncherActivity) {
                DisplayMetrics displayMetrics3 = MainApplication.getAppContext().getResources().getDisplayMetrics();
                float f13 = displayMetrics3.density;
                float f14 = displayMetrics.density;
                if (f13 != f14) {
                    displayMetrics3.densityDpi = displayMetrics.densityDpi;
                    displayMetrics3.density = f14;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f0 */
    public static int m118707f0() {
        return m118710g0(MainApplication.getAppContext());
    }

    /* renamed from: f1 */
    public static void m118708f1(Context context, int i11, String str, TextView textView, boolean z11) {
        int m118667O;
        Drawable m7082f;
        if (str != null && textView != null) {
            try {
                if (ContactProfile.m40347T0(i11) && ContactProfile.m40345C0(i11)) {
                    boolean m114318P = C21927m.m114302u().m114318P(str);
                    boolean m40345C0 = ContactProfile.m40345C0(i11);
                    if (z11) {
                        m118667O = m118669P(m40345C0, m114318P);
                    } else {
                        m118667O = m118667O(m40345C0, m114318P);
                    }
                    if (m118667O != -1 && (m7082f = AbstractC1401h.m7082f(context.getResources(), m118667O, context.getTheme())) != null) {
                        m7082f.setBounds(0, 0, m7082f.getMinimumWidth(), m7082f.getMinimumHeight());
                        textView.setCompoundDrawables(m7082f, null, null, null);
                        textView.setCompoundDrawablePadding(5);
                        return;
                    }
                    return;
                }
                textView.setCompoundDrawables(null, null, null, null);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public static void m118709g(Context context, Configuration configuration, boolean z11) {
        boolean z12;
        if (configuration == null) {
            try {
                configuration = context.getResources().getConfiguration();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        int i11 = f112246g;
        boolean z13 = true;
        if (i11 != -1 && i11 != configuration.orientation) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i12 = configuration.orientation;
        f112246g = i12;
        if (i12 == 2) {
            f112248i = m118679U();
            f112249j = m118681V();
        } else {
            f112248i = m118681V();
            f112249j = m118679U();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i13 = f112247h;
        if (i13 <= 0 || i13 == displayMetrics.widthPixels || z12) {
            z13 = false;
        }
        f112247h = displayMetrics.widthPixels;
        if (z11 && AbstractC23309i.m120899Ee() && z13 && !AbstractC26683d.f126391B && !AbstractC3096i0.m15511R()) {
            AbstractC23193r0.m119508q();
        }
        m118706f(context, z11);
    }

    /* renamed from: g0 */
    public static int m118710g0(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) Math.sqrt(Math.pow(displayMetrics.widthPixels, 2.0d) + Math.pow(displayMetrics.heightPixels, 2.0d));
    }

    /* renamed from: g1 */
    public static void m118711g1(Context context, ContactProfile contactProfile, TextView textView) {
        if (contactProfile != null && textView != null) {
            m118705e1(context, contactProfile.f42352K0, contactProfile.f42434r, textView);
        }
    }

    /* renamed from: h */
    public static int m118712h(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: h0 */
    public static int m118713h0() {
        int i11 = f112249j;
        if (i11 <= 0) {
            return Resources.getSystem().getDisplayMetrics().heightPixels;
        }
        return i11;
    }

    /* renamed from: h1 */
    public static void m118714h1(View view, int i11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    /* renamed from: i */
    public static int m118715i(Resources resources, float f11) {
        return (int) ((f11 * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: i0 */
    public static int m118716i0(Context context) {
        DisplayMetrics displayMetrics;
        if (context != null) {
            displayMetrics = context.getResources().getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return m118713h0();
    }

    /* renamed from: i1 */
    public static void m118717i1(View view, int i11) {
        view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* renamed from: j */
    public static Drawable m118718j(Context context) {
        return new RippleDrawable(ColorStateList.valueOf(C23212s8.m119607o(context, AbstractC16781w.ItemBackgroundRipple)), null, null);
    }

    /* renamed from: j0 */
    public static int m118719j0(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: j1 */
    public static void m118720j1(View view, boolean z11) {
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ((ViewGroup) parent).setClipChildren(z11);
        }
    }

    /* renamed from: k */
    public static View m118721k(Context context, int i11, String str, String str2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.height = m118742r(48.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setPadding(0, 0, AbstractC32232i.m155453a(16.0f), 0);
        linearLayout.setMinimumWidth(m118742r(196.0f));
        linearLayout.setBackground(AbstractC19694b.m103336d(context, AbstractC17466e.list_selector));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.width = m118742r(54.0f);
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setGravity(17);
        robotoTextView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        robotoTextView.setEllipsize(truncateAt);
        robotoTextView.setMaxLines(1);
        robotoTextView.setSingleLine(true);
        robotoTextView.setText(str2);
        robotoTextView.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        RedDotRobotoTextView redDotRobotoTextView = new RedDotRobotoTextView(context);
        redDotRobotoTextView.setLayoutParams(layoutParams3);
        redDotRobotoTextView.setDrawRedDotOnCompoundDrawable(true);
        redDotRobotoTextView.setTextColor(AbstractC32232i.m155465m(context, AbstractC17450b.TextColor1));
        redDotRobotoTextView.setGravity(16);
        redDotRobotoTextView.setTextSize(1, 16.0f);
        redDotRobotoTextView.setMinWidth(AbstractC32232i.m155453a(100.0f));
        redDotRobotoTextView.setEllipsize(truncateAt);
        redDotRobotoTextView.setMaxLines(1);
        redDotRobotoTextView.setSingleLine(true);
        redDotRobotoTextView.setTag(Integer.valueOf(i11));
        redDotRobotoTextView.setText(str);
        linearLayout.addView(robotoTextView);
        linearLayout.addView(redDotRobotoTextView);
        linearLayout.setTag(Integer.valueOf(i11));
        return linearLayout;
    }

    /* renamed from: k0 */
    public static int m118722k0() {
        int i11 = f112248i;
        if (i11 <= 0) {
            return Resources.getSystem().getDisplayMetrics().widthPixels;
        }
        return i11;
    }

    /* renamed from: k1 */
    public static void m118723k1(Path path, float f11, float f12, float f13, float f14, float f15) {
        RectF rectF = f112244e;
        rectF.set(f11, f12, f13, f14);
        path.rewind();
        path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
    }

    /* renamed from: l */
    public static TextView m118724l(Context context, int i11, int i12) {
        return m118727m(context, i11, i12, 0);
    }

    /* renamed from: l0 */
    public static int m118725l0(Context context) {
        DisplayMetrics displayMetrics;
        if (context != null) {
            displayMetrics = context.getResources().getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return m118722k0();
    }

    /* renamed from: l1 */
    public static void m118726l1(Context context, View view) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AbstractC19178a.selectableItemBackground, typedValue, true);
            view.setBackgroundResource(typedValue.resourceId);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static TextView m118727m(Context context, int i11, int i12, int i13) {
        Drawable drawable;
        if (i13 != 0) {
            drawable = AbstractC19694b.m103336d(context, i13);
        } else {
            drawable = null;
        }
        return m118733o(context, i11, m118743r0(i12), drawable);
    }

    /* renamed from: m0 */
    public static int m118728m0(Context context, boolean z11) {
        if (z11 && m118698c0().getConfiguration().orientation == 2) {
            return (m118725l0(context) - C21243a.f103541p) - (C21243a.f103542q * 2);
        }
        return m118725l0(context);
    }

    /* renamed from: m1 */
    public static void m118729m1(View view, int i11) {
        if (view != null) {
            try {
                view.setOutlineProvider(new b(i11));
                view.setClipToOutline(true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: n */
    public static TextView m118730n(Context context, int i11, String str, int i12) {
        Drawable drawable;
        if (i12 != 0) {
            drawable = AbstractC19694b.m103336d(context, i12);
        } else {
            drawable = null;
        }
        return m118733o(context, i11, str, drawable);
    }

    /* renamed from: n0 */
    public static int m118731n0(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: n1 */
    public static void m118732n1(TextView textView, int i11, int i12, int i13, int i14, int i15) {
        Drawable m139660c = C27280g.m139660c(textView.getContext(), i11, i12);
        if (m139660c != null) {
            m139660c.setBounds(0, 0, i14, i15);
            textView.setCompoundDrawablePadding(i13);
            textView.setCompoundDrawables(m139660c, null, null, null);
        }
    }

    /* renamed from: o */
    public static TextView m118733o(Context context, int i11, String str, Drawable drawable) {
        RedDotRobotoTextView redDotRobotoTextView = new RedDotRobotoTextView(context);
        redDotRobotoTextView.setDrawRedDotOnCompoundDrawable(true);
        redDotRobotoTextView.setTextColor(AbstractC32232i.m155465m(context, AbstractC17450b.TextColor1));
        redDotRobotoTextView.setBackground(AbstractC19694b.m103336d(context, AbstractC17466e.list_selector));
        redDotRobotoTextView.setGravity(16);
        redDotRobotoTextView.setPadding(AbstractC32232i.m155453a(16.0f), 0, AbstractC32232i.m155453a(16.0f), 0);
        redDotRobotoTextView.setMaxScaledTextSize(m118742r(20.0f));
        redDotRobotoTextView.setTextSize(1, 16.0f);
        redDotRobotoTextView.setMinWidth(AbstractC32232i.m155453a(196.0f));
        redDotRobotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        redDotRobotoTextView.setMaxLines(1);
        redDotRobotoTextView.setSingleLine(true);
        redDotRobotoTextView.setTag(Integer.valueOf(i11));
        redDotRobotoTextView.setText(str);
        if (drawable != null) {
            redDotRobotoTextView.setCompoundDrawablePadding(AbstractC32232i.m155453a(12.0f));
            redDotRobotoTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        return redDotRobotoTextView;
    }

    /* renamed from: o0 */
    public static int m118734o0(Context context, boolean z11) {
        int i11;
        int i12 = !z11 ? 1 : 0;
        try {
            int[] iArr = f112245f;
            int i13 = iArr[i12];
            if (i13 > 0) {
                return i13;
            }
            if (z11) {
                i11 = AbstractC19178a.selectableItemBackgroundBorderless;
            } else {
                i11 = AbstractC19178a.selectableItemBackground;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i11, typedValue, true);
            int i14 = typedValue.resourceId;
            iArr[i12] = i14;
            return i14;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: o1 */
    public static void m118735o1(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(256);
            window.addFlags(512);
            window.addFlags(134217728);
            m118738p1(activity);
        }
    }

    /* renamed from: p */
    public static int m118736p(int i11) {
        return m118739q(MainApplication.getAppContext(), i11);
    }

    /* renamed from: p0 */
    public static int m118737p0() {
        return AbstractC17484n.Companion.m92931b();
    }

    /* renamed from: p1 */
    public static void m118738p1(Activity activity) {
        activity.getWindow().setFlags(512, 512);
    }

    /* renamed from: q */
    public static int m118739q(Context context, int i11) {
        return (int) (context.getResources().getDimension(i11) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q0 */
    public static int m118740q0(Context context) {
        try {
            if (!(context instanceof InterfaceC27218a)) {
                return 0;
            }
            ((InterfaceC27218a) context).mo35576n3();
            return 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: q1 */
    public static void m118741q1(ContactProfile contactProfile, ImageView imageView) {
        if (contactProfile != null && imageView != null && contactProfile.m40387S0()) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: r */
    public static int m118742r(float f11) {
        return m118745s(MainApplication.getAppContext(), f11);
    }

    /* renamed from: r0 */
    public static String m118743r0(int i11) {
        return m118749t0(MainApplication.getAppContext(), i11);
    }

    /* renamed from: r1 */
    public static void m118744r1(View view, int i11) {
        if (view != null) {
            view.setVisibility(i11);
        }
    }

    /* renamed from: s */
    public static int m118745s(Context context, float f11) {
        return m118712h(context, f11);
    }

    /* renamed from: s0 */
    public static String m118746s0(int i11, Object... objArr) {
        return m118752u0(MainApplication.getAppContext(), i11, objArr);
    }

    /* renamed from: s1 */
    public static void m118747s1(ViewGroup viewGroup, int i11, boolean z11) {
        if (viewGroup != null) {
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                try {
                    View childAt = viewGroup.getChildAt(i12);
                    if (childAt instanceof ViewGroup) {
                        m118747s1((ViewGroup) childAt, i11, z11);
                    } else if (childAt != null) {
                        if (i11 == 0) {
                            if (z11 && childAt.getVisibility() != 0) {
                                AbstractC23115k.m118571b(childAt, AbstractC10919t.fadein);
                            } else {
                                childAt.setVisibility(i11);
                            }
                        } else if (z11 && childAt.getVisibility() == 0) {
                            AbstractC23115k.m118570a(childAt, AbstractC10919t.fadeout);
                        } else {
                            childAt.setVisibility(i11);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (i11 == 0) {
                if (z11 && viewGroup.getVisibility() != 0) {
                    AbstractC23115k.m118571b(viewGroup, AbstractC10919t.fadein);
                    return;
                } else {
                    viewGroup.setVisibility(i11);
                    return;
                }
            }
            if (z11 && viewGroup.getVisibility() == 0) {
                AbstractC23115k.m118570a(viewGroup, AbstractC10919t.fadeout);
            } else {
                viewGroup.setVisibility(i11);
            }
        }
    }

    /* renamed from: t */
    public static float m118748t(Context context, float f11) {
        return TypedValue.applyDimension(1, f11, context.getResources().getDisplayMetrics());
    }

    /* renamed from: t0 */
    public static String m118749t0(Context context, int i11) {
        return context.getString(i11);
    }

    /* renamed from: t1 */
    public static void m118750t1(InterfaceC27218a interfaceC27218a, boolean z11) {
        if (interfaceC27218a != null && interfaceC27218a.getWindow() != null) {
            f112243d = z11;
            View decorView = interfaceC27218a.getWindow().getDecorView();
            if (decorView != null) {
                m118686X0(decorView, !z11);
            }
        }
    }

    /* renamed from: u */
    public static Bitmap m118751u(Drawable drawable, int i11, int i12) {
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: u0 */
    public static String m118752u0(Context context, int i11, Object... objArr) {
        return context.getString(i11, objArr);
    }

    /* renamed from: u1 */
    public static void m118753u1(CustomEditText customEditText, RobotoTextView robotoTextView) {
        robotoTextView.setVisibility(0);
        customEditText.setRightDrawable(m118665N(customEditText.getContext(), AbstractC16803z.icn_forgotpass_delete_error));
    }

    /* renamed from: v */
    public static void m118754v(View view, boolean z11) {
        view.setEnabled(z11);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                m118754v(viewGroup.getChildAt(i11), z11);
            }
        }
    }

    /* renamed from: v0 */
    public static String[] m118755v0(int i11) {
        return m118758w0(MainApplication.getAppContext(), i11);
    }

    /* renamed from: v1 */
    public static void m118756v1(CustomEditText customEditText, RobotoTextView robotoTextView) {
        robotoTextView.setVisibility(8);
        customEditText.setRightDrawable(m118665N(customEditText.getContext(), AbstractC16803z.icn_forgotpass_check));
        customEditText.setEnableClearText(false);
        customEditText.setClearDrawable(m118665N(customEditText.getContext(), AbstractC16803z.icn_forgotpass_delete));
    }

    /* renamed from: w */
    public static TouchDelegate m118757w(View view, int i11) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int m118712h = m118712h(view.getContext(), i11);
        rect.left -= m118712h;
        rect.top -= m118712h;
        rect.right += m118712h;
        rect.bottom = m118712h + rect.bottom;
        return new TouchDelegate(rect, view);
    }

    /* renamed from: w0 */
    public static String[] m118758w0(Context context, int i11) {
        return context.getResources().getStringArray(i11);
    }

    /* renamed from: w1 */
    public static int m118759w1(int i11) {
        return m118742r(i11);
    }

    /* renamed from: x */
    public static TouchDelegate m118760x(View view, int i11, int i12) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top = i11;
        rect.bottom = i12;
        return new TouchDelegate(rect, view);
    }

    /* renamed from: x0 */
    public static int m118761x0(TextPaint textPaint, String str) {
        if (textPaint == null || str == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        if (f112242c == null) {
            f112242c = new Rect();
        }
        textPaint.getTextBounds(str, 0, 1, f112242c);
        return f112242c.height();
    }

    /* renamed from: x1 */
    public static int m118762x1(float f11) {
        return m118765y1(MainApplication.getAppContext(), f11);
    }

    /* renamed from: y */
    public static int m118763y(Context context) {
        try {
            if (context instanceof Activity) {
                return context.getResources().getDisplayMetrics().heightPixels;
            }
            return m118713h0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return m118713h0();
        }
    }

    /* renamed from: y0 */
    public static int m118764y0(TextPaint textPaint, String str) {
        if (!TextUtils.isEmpty(str) && textPaint != null) {
            return (int) textPaint.measureText(str);
        }
        return 0;
    }

    /* renamed from: y1 */
    public static int m118765y1(Context context, float f11) {
        return (int) TypedValue.applyDimension(1, f11, context.getResources().getDisplayMetrics());
    }

    /* renamed from: z */
    public static int m118766z(Context context) {
        try {
            if (context instanceof Activity) {
                return context.getResources().getDisplayMetrics().widthPixels;
            }
            return m118722k0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return m118722k0();
        }
    }

    /* renamed from: z0 */
    public static int m118767z0(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(AbstractC19178a.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    /* renamed from: z1 */
    public static int m118768z1(String str, int i11) {
        try {
            return Color.parseColor(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return i11;
        }
    }
}
