package com.zing.zalo.p077ui.maintab.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.custom.RevealView;
import com.zing.zalo.p077ui.maintab.widget.CustomMainTab;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.zdesign.component.Badge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import o70.C24099q0;
import p363nh.C23744a;
import p716zh.C31994kb;
import sx.C26408j;
import th.AbstractC26683d;

/* loaded from: classes5.dex */
public class CustomMainTab extends RelativeLayout {

    /* renamed from: J */
    static int f63891J = 5;

    /* renamed from: A */
    int f63892A;

    /* renamed from: B */
    int f63893B;

    /* renamed from: C */
    boolean f63894C;

    /* renamed from: D */
    int f63895D;

    /* renamed from: E */
    boolean f63896E;

    /* renamed from: F */
    boolean f63897F;

    /* renamed from: G */
    C26408j.e f63898G;

    /* renamed from: H */
    int f63899H;

    /* renamed from: I */
    Runnable f63900I;

    /* renamed from: p */
    ViewPager f63901p;

    /* renamed from: q */
    TabMainView[] f63902q;

    /* renamed from: r */
    int f63903r;

    /* renamed from: s */
    int f63904s;

    /* renamed from: t */
    int f63905t;

    /* renamed from: u */
    SlidingTabLayout.InterfaceC13529b f63906u;

    /* renamed from: v */
    List f63907v;

    /* renamed from: w */
    List f63908w;

    /* renamed from: x */
    List f63909x;

    /* renamed from: y */
    List f63910y;

    /* renamed from: z */
    RevealView f63911z;

    /* loaded from: classes5.dex */
    public class TabMainView extends FrameLayout {

        /* renamed from: p */
        RobotoTextView f63912p;

        /* renamed from: q */
        RelativeLayout f63913q;

        /* renamed from: r */
        ImageView f63914r;

        /* renamed from: s */
        ImageView f63915s;

        /* renamed from: t */
        int f63916t;

        public TabMainView(Context context, int i11) {
            super(context);
            try {
                this.f63916t = i11;
                setId(((Integer) CustomMainTab.this.f63910y.get(i11)).intValue());
                RobotoTextView robotoTextView = new RobotoTextView(context);
                this.f63912p = robotoTextView;
                robotoTextView.setText((CharSequence) CustomMainTab.this.f63907v.get(i11));
                this.f63912p.setTextColor(CustomMainTab.this.f63898G.f125554b);
                this.f63912p.setFontStyle(CustomMainTab.this.f63898G.f125556d);
                this.f63912p.setTextSize(0, context.getResources().getDimension(AbstractC16802y.f85301f8));
                this.f63912p.setVisibility(4);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, AbstractC23136l9.m118742r(5.0f), 0, AbstractC23136l9.m118742r(6.0f));
                this.f63912p.setLayoutParams(layoutParams);
                addView(this.f63912p);
                this.f63913q = (RelativeLayout) LayoutInflater.from(context).inflate(AbstractC7409c0.main_tab_new_stencils_bg, (ViewGroup) this, false);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, AbstractC23136l9.m118742r(32.0f));
                layoutParams2.gravity = 17;
                addView(this.f63913q, layoutParams2);
                ImageView imageView = (ImageView) this.f63913q.findViewById(AbstractC6918a0.icon);
                this.f63914r = imageView;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                imageView.setScaleType(scaleType);
                this.f63914r.setImageDrawable((Drawable) CustomMainTab.this.f63908w.get(i11));
                if (C24099q0.m125958k().m125962c() && i11 == 2) {
                    ViewGroup.LayoutParams layoutParams3 = this.f63914r.getLayoutParams();
                    layoutParams3.width = AbstractC23136l9.m118742r(32.0f);
                    this.f63914r.setLayoutParams(layoutParams3);
                }
                ImageView imageView2 = (ImageView) this.f63913q.findViewById(AbstractC6918a0.iconActive);
                this.f63915s = imageView2;
                imageView2.setScaleType(scaleType);
                this.f63915s.setImageDrawable((Drawable) CustomMainTab.this.f63909x.get(i11));
                this.f63915s.setVisibility(4);
                setBackground(AbstractC23136l9.m118718j(context));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        public void setProgess(float f11) {
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            try {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (CustomMainTab.this.f63903r + ((r2.f63904s - r3) * f11));
                    setLayoutParams(layoutParams);
                    this.f63913q.setTranslationY((-CustomMainTab.this.f63905t) * f11);
                    if (f11 > 0.5f) {
                        this.f63914r.setVisibility(4);
                        this.f63915s.setVisibility(0);
                        this.f63915s.setAlpha(f11);
                    } else {
                        this.f63915s.setVisibility(4);
                        this.f63914r.setVisibility(0);
                        this.f63914r.setAlpha(1.0f - f11);
                    }
                    if (f11 > 0.65f) {
                        this.f63912p.setVisibility(0);
                        this.f63912p.setAlpha((f11 - 0.65f) * 2.857143f);
                    } else {
                        this.f63912p.setVisibility(4);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.widget.CustomMainTab$a */
    /* loaded from: classes5.dex */
    class C12261a implements ViewPager.InterfaceC6875j {

        /* renamed from: p */
        final /* synthetic */ ViewPager f63918p;

        C12261a(ViewPager viewPager) {
            this.f63918p = viewPager;
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            CustomMainTab customMainTab = CustomMainTab.this;
            if (customMainTab.f63896E && i11 == 0) {
                customMainTab.m68755u(this.f63918p.getCurrentItem());
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            float abs;
            try {
                CustomMainTab customMainTab = CustomMainTab.this;
                if (customMainTab.f63896E) {
                    float f12 = ((int) (((f11 * 1000.0f) + 5.0f) / 10.0f)) / 100.0f;
                    if (f12 == 1.0f) {
                        i11++;
                        f12 = 0.0f;
                    }
                    int i13 = 0;
                    if (customMainTab.f63894C) {
                        if (f12 == 0.0f) {
                            customMainTab.m68755u(i11);
                            return;
                        }
                        while (true) {
                            int i14 = CustomMainTab.f63891J;
                            if (i13 < i14) {
                                if (i13 == i11) {
                                    CustomMainTab.this.f63902q[i11].setProgess(1.0f - f12);
                                } else {
                                    int i15 = i11 + 1;
                                    if (i13 == i15 && i15 < i14) {
                                        CustomMainTab.this.f63902q[i15].setProgess(f12);
                                    } else {
                                        CustomMainTab.this.f63902q[i13].setProgess(0.0f);
                                    }
                                }
                                i13++;
                            } else {
                                return;
                            }
                        }
                    } else {
                        if (f12 == 0.0f) {
                            customMainTab.m68755u(customMainTab.f63893B);
                            return;
                        }
                        if (customMainTab.f63892A < customMainTab.f63893B) {
                            float abs2 = Math.abs(i11 - r2) + f12;
                            CustomMainTab customMainTab2 = CustomMainTab.this;
                            abs = abs2 / Math.abs(customMainTab2.f63892A - customMainTab2.f63893B);
                        } else {
                            float abs3 = Math.abs(i11 - r7) + f12;
                            CustomMainTab customMainTab3 = CustomMainTab.this;
                            abs = 1.0f - (abs3 / Math.abs(customMainTab3.f63892A - customMainTab3.f63893B));
                        }
                        while (i13 < CustomMainTab.f63891J) {
                            CustomMainTab customMainTab4 = CustomMainTab.this;
                            int i16 = customMainTab4.f63893B;
                            if (i13 == i16) {
                                customMainTab4.f63902q[i16].setProgess(abs);
                            } else {
                                int i17 = customMainTab4.f63892A;
                                if (i13 == i17) {
                                    customMainTab4.f63902q[i17].setProgess(1.0f - abs);
                                } else {
                                    customMainTab4.f63902q[i13].setProgess(0.0f);
                                }
                            }
                            i13++;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            CustomMainTab customMainTab = CustomMainTab.this;
            if (customMainTab.f63896E) {
                customMainTab.f63893B = i11;
            } else {
                customMainTab.m68755u(this.f63918p.getCurrentItem());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.widget.CustomMainTab$b */
    /* loaded from: classes5.dex */
    class C12262b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ float[] f63920p;

        C12262b(float[] fArr) {
            this.f63920p = fArr;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            TabMainView[] tabMainViewArr = CustomMainTab.this.f63902q;
            if (tabMainViewArr != null && tabMainViewArr.length > 0) {
                int i11 = 0;
                while (true) {
                    TabMainView[] tabMainViewArr2 = CustomMainTab.this.f63902q;
                    if (i11 < tabMainViewArr2.length) {
                        tabMainViewArr2[i11].setProgess(this.f63920p[i11]);
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.widget.CustomMainTab$c */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C12263c {

        /* renamed from: a */
        static final /* synthetic */ int[] f63922a;

        static {
            int[] iArr = new int[C24099q0.d.values().length];
            f63922a = iArr;
            try {
                iArr[C24099q0.d.f116458p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63922a[C24099q0.d.f116459q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63922a[C24099q0.d.f116460r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63922a[C24099q0.d.f116462t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63922a[C24099q0.d.f116461s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63922a[C24099q0.d.f116463u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63922a[C24099q0.d.f116464v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CustomMainTab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63894C = true;
        this.f63895D = -16777216;
        this.f63896E = true;
        this.f63897F = true;
        try {
            f63891J = C24099q0.m125958k().m125975s();
            int m118722k0 = AbstractC23136l9.m118722k0();
            this.f63899H = m118722k0;
            int i11 = f63891J;
            int i12 = (int) (m118722k0 / (i11 + 0.6f));
            this.f63903r = i12;
            this.f63904s = m118722k0 - (i12 * (i11 - 1));
            int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.height_tab_main);
            this.f63905t = AbstractC23136l9.m118742r(8.0f);
            RevealView revealView = new RevealView(context);
            this.f63911z = revealView;
            addView(revealView, new RelativeLayout.LayoutParams(-1, m118655I));
            LinearLayout linearLayout = new LinearLayout(context);
            addView(linearLayout, new RelativeLayout.LayoutParams(-1, m118655I));
            this.f63907v = new ArrayList();
            this.f63908w = new ArrayList();
            this.f63909x = new ArrayList();
            this.f63910y = new ArrayList();
            C26408j.e m154243k = C31994kb.m154233h().m154243k();
            this.f63898G = m154243k;
            if (m154243k == null) {
                this.f63898G = new C26408j.e();
            }
            for (C24099q0.d dVar : C24099q0.m125958k().m125976t()) {
                this.f63907v.add("");
                this.f63908w.add(C31994kb.m154233h().m154244l(context, m68746m(dVar), 0));
                this.f63909x.add(C31994kb.m154233h().m154244l(context, m68746m(dVar), 1));
                this.f63910y.add(Integer.valueOf(C24099q0.m125958k().m125968j(dVar)));
            }
            this.f63902q = new TabMainView[f63891J];
            for (final int i13 = 0; i13 < f63891J; i13++) {
                this.f63902q[i13] = new TabMainView(context, i13);
                this.f63902q[i13].setLayoutParams(new ViewGroup.LayoutParams(this.f63903r, -1));
                linearLayout.addView(this.f63902q[i13]);
                this.f63902q[i13].setOnClickListener(new View.OnClickListener() { // from class: w70.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CustomMainTab.this.m68749q(i13, view);
                    }
                });
            }
            m68755u(0);
            m68741e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m68741e() {
        m68742f(C24099q0.m125958k().m125966g(), "discovery_reddot_tabbar");
    }

    /* renamed from: f */
    private void m68742f(int i11, String str) {
        Badge badge;
        TabMainView[] tabMainViewArr = this.f63902q;
        if (tabMainViewArr != null && i11 >= 0 && tabMainViewArr.length > i11 && (badge = (Badge) tabMainViewArr[i11].findViewById(AbstractC6918a0.badge_dot)) != null) {
            badge.setIdTracking(str);
        }
    }

    /* renamed from: h */
    public static View m68743h(View view) {
        if (view == null) {
            return null;
        }
        return view.findViewById(AbstractC6918a0.badge_dot);
    }

    /* renamed from: i */
    public static TextView m68744i(View view) {
        if (view == null) {
            return null;
        }
        return (TextView) view.findViewById(AbstractC6918a0.numnotification);
    }

    /* renamed from: j */
    public static ImageView m68745j(View view) {
        if (view == null) {
            return null;
        }
        return (ImageView) view.findViewById(AbstractC6918a0.badge_warning);
    }

    /* renamed from: m */
    private int m68746m(C24099q0.d dVar) {
        switch (C12263c.f63922a[dVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    /* renamed from: n */
    private String m68747n(C24099q0.d dVar) {
        switch (C12263c.f63922a[dVar.ordinal()]) {
            case 1:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_message);
            case 2:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_contact);
            case 3:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_group);
            case 4:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_timeline);
            case 5:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_discovery);
            case 6:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_more);
            case 7:
                return MainApplication.getAppContext().getResources().getString(AbstractC8020f0.label_tab_me);
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m68748p(float[] fArr, float[] fArr2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TabMainView[] tabMainViewArr = this.f63902q;
        if (tabMainViewArr != null && tabMainViewArr.length > 0) {
            int i11 = 0;
            while (true) {
                TabMainView[] tabMainViewArr2 = this.f63902q;
                if (i11 < tabMainViewArr2.length) {
                    TabMainView tabMainView = tabMainViewArr2[i11];
                    float f11 = fArr[i11];
                    tabMainView.setProgess(f11 + ((fArr2[i11] - f11) * floatValue));
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m68749q(int i11, View view) {
        SlidingTabLayout.InterfaceC13529b interfaceC13529b = this.f63906u;
        if (interfaceC13529b != null) {
            interfaceC13529b.mo67720a(m68753k(i11), i11);
        }
        if (this.f63896E) {
            if (this.f63893B != i11) {
                this.f63892A = this.f63901p.getCurrentItem();
                this.f63893B = i11;
                this.f63894C = false;
                ViewPager viewPager = this.f63901p;
                if (viewPager != null) {
                    viewPager.setCurrentItem(i11, this.f63897F);
                }
            }
        } else {
            ViewPager viewPager2 = this.f63901p;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i11, this.f63897F);
            }
        }
        if (AbstractC26683d.f126399r && i11 == C24099q0.m125958k().m125971o()) {
            C23744a.m124114c().m124116d(4002, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m68750r() {
        int i11 = this.f63899H;
        int i12 = f63891J;
        int i13 = (int) (i11 / (i12 + 0.6f));
        this.f63903r = i13;
        this.f63904s = i11 - (i13 * (i12 - 1));
        for (int i14 = 0; i14 < f63891J; i14++) {
            ViewGroup.LayoutParams layoutParams = this.f63902q[i14].getLayoutParams();
            layoutParams.width = this.f63903r;
            this.f63902q[i14].setLayoutParams(layoutParams);
        }
        m68755u(this.f63901p.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ boolean m68751s(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 2) {
            this.f63894C = true;
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public View m68752g(int i11) {
        TabMainView[] tabMainViewArr;
        TabMainView tabMainView;
        RelativeLayout relativeLayout;
        if (i11 < 0 || (tabMainViewArr = this.f63902q) == null || i11 >= tabMainViewArr.length || (tabMainView = tabMainViewArr[i11]) == null || (relativeLayout = tabMainView.f63913q) == null) {
            return null;
        }
        return relativeLayout.findViewById(AbstractC6918a0.badge_dot);
    }

    /* renamed from: k */
    public View m68753k(int i11) {
        TabMainView tabMainView;
        if (i11 < 0 || i11 >= f63891J || (tabMainView = this.f63902q[i11]) == null) {
            return null;
        }
        return tabMainView.f63913q;
    }

    /* renamed from: l */
    public Animator m68754l(int i11, int i12) {
        TabMainView[] tabMainViewArr;
        if (this.f63896E && (tabMainViewArr = this.f63902q) != null && tabMainViewArr.length != 0) {
            int length = tabMainViewArr.length;
            final float[] fArr = new float[length];
            final float[] fArr2 = new float[length];
            if (i11 >= 0 && i11 < length) {
                fArr[i11] = 0.0f;
                fArr2[i11] = 1.0f;
            }
            if (i12 >= 0 && i12 < length) {
                fArr[i12] = 1.0f;
                fArr2[i12] = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w70.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CustomMainTab.this.m68748p(fArr, fArr2, valueAnimator);
                }
            });
            ofFloat.addListener(new C12262b(fArr2));
            return ofFloat;
        }
        return null;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        try {
            int size = View.MeasureSpec.getSize(i11);
            if (size != this.f63899H) {
                this.f63899H = size;
                Runnable runnable = this.f63900I;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: w70.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomMainTab.this.m68750r();
                    }
                };
                this.f63900I = runnable2;
                postDelayed(runnable2, 50L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setAllowTabChangeLateralAnim(boolean z11) {
        this.f63897F = z11;
    }

    public void setOnTabClickListener(SlidingTabLayout.InterfaceC13529b interfaceC13529b) {
        this.f63906u = interfaceC13529b;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(ViewPager viewPager) {
        this.f63901p = viewPager;
        viewPager.setOnTouchListener(new View.OnTouchListener() { // from class: w70.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m68751s;
                m68751s = CustomMainTab.this.m68751s(view, motionEvent);
                return m68751s;
            }
        });
        viewPager.addOnPageChangeListener(new C12261a(viewPager));
    }

    /* renamed from: u */
    public void m68755u(int i11) {
        float f11;
        for (int i12 = 0; i12 < f63891J; i12++) {
            TabMainView tabMainView = this.f63902q[i12];
            if (i12 == i11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            tabMainView.setProgess(f11);
        }
    }

    /* renamed from: v */
    public void m68756v() {
        TabMainView tabMainView;
        RobotoTextView robotoTextView;
        try {
            this.f63907v.clear();
            Iterator it = C24099q0.m125958k().m125976t().iterator();
            while (it.hasNext()) {
                this.f63907v.add(m68747n((C24099q0.d) it.next()));
            }
            f63891J = C24099q0.m125958k().m125975s();
            for (int i11 = 0; i11 < f63891J; i11++) {
                TabMainView[] tabMainViewArr = this.f63902q;
                if (i11 < tabMainViewArr.length && (tabMainView = tabMainViewArr[i11]) != null && (robotoTextView = tabMainView.f63912p) != null) {
                    robotoTextView.setText((CharSequence) this.f63907v.get(i11));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    public void m68757w() {
        int i11;
        try {
            C26408j.e m154243k = C31994kb.m154233h().m154243k();
            this.f63898G = m154243k;
            if (m154243k == null) {
                this.f63898G = new C26408j.e();
            }
            this.f63907v.clear();
            this.f63908w.clear();
            this.f63909x.clear();
            Iterator it = C24099q0.m125958k().m125976t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C24099q0.d dVar = (C24099q0.d) it.next();
                this.f63907v.add(m68747n(dVar));
                this.f63908w.add(C31994kb.m154233h().m154244l(getContext(), m68746m(dVar), 0));
                this.f63909x.add(C31994kb.m154233h().m154244l(getContext(), m68746m(dVar), 1));
            }
            f63891J = C24099q0.m125958k().m125975s();
            for (i11 = 0; i11 < f63891J; i11++) {
                TabMainView tabMainView = this.f63902q[i11];
                if (tabMainView != null) {
                    RobotoTextView robotoTextView = tabMainView.f63912p;
                    if (robotoTextView != null) {
                        robotoTextView.setTextColor(this.f63898G.f125554b);
                        tabMainView.f63912p.setFontStyle(this.f63898G.f125556d);
                        tabMainView.f63912p.setText((CharSequence) this.f63907v.get(i11));
                    }
                    ImageView imageView = tabMainView.f63914r;
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) this.f63908w.get(i11));
                    }
                    ImageView imageView2 = tabMainView.f63915s;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable((Drawable) this.f63909x.get(i11));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
