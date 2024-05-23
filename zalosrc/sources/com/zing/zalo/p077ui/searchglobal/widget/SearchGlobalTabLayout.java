package com.zing.zalo.p077ui.searchglobal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi0.AbstractC2814h;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.searchglobal.widget.SearchGlobalTabLayout;
import com.zing.zalo.p077ui.widget.RobotoTextViewStateAware;
import com.zing.zalo.p077ui.widget.springback.HorizontalNestedScrollView;
import com.zing.zalo.p077ui.widget.springback.SpringBackLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p612wk.AbstractC29080l;
import p612wk.C29077i;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes6.dex */
public class SearchGlobalTabLayout extends FrameLayout {

    /* renamed from: A */
    private final HashMap f67486A;

    /* renamed from: B */
    private final TabIndicator f67487B;

    /* renamed from: C */
    private int f67488C;

    /* renamed from: D */
    private boolean f67489D;

    /* renamed from: E */
    private ViewPager f67490E;

    /* renamed from: F */
    private final ViewPager.InterfaceC6875j f67491F;

    /* renamed from: p */
    private final Integer[] f67492p;

    /* renamed from: q */
    private final int f67493q;

    /* renamed from: r */
    private final TextView[] f67494r;

    /* renamed from: s */
    private final boolean f67495s;

    /* renamed from: t */
    private final int f67496t;

    /* renamed from: u */
    private final HorizontalNestedScrollView f67497u;

    /* renamed from: v */
    private final View f67498v;

    /* renamed from: w */
    private int f67499w;

    /* renamed from: x */
    private final InterfaceC24854k f67500x;

    /* renamed from: y */
    private final InterfaceC24854k f67501y;

    /* renamed from: z */
    private final List f67502z;

    /* loaded from: classes6.dex */
    public static final class TabIndicator extends View {

        /* renamed from: p */
        private Paint f67503p;

        /* renamed from: q */
        private Rect f67504q;

        /* renamed from: r */
        private final InterfaceC24854k f67505r;

        /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTabLayout$TabIndicator$a */
        /* loaded from: classes6.dex */
        static final class C13096a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C13096a f67506q = new C13096a();

            C13096a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer mo12V4() {
                return Integer.valueOf(AbstractC23136l9.m118742r(8.0f));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabIndicator(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            AbstractC19074t.m100208f(context, "context");
            this.f67503p = new Paint();
            m129210a = AbstractC24856m.m129210a(C13096a.f67506q);
            this.f67505r = m129210a;
            this.f67503p.setAntiAlias(true);
            this.f67503p.setColor(C23212s8.m119607o(context, AbstractC16781w.TabSelectedColor));
            this.f67504q = new Rect();
        }

        private final int getTabItemHorizontalPadding() {
            return ((Number) this.f67505r.getValue()).intValue();
        }

        /* renamed from: a */
        public final void m73439a(int i11, int i12) {
            this.f67504q.left = getTabItemHorizontalPadding() + i11;
            this.f67504q.right = (i11 + i12) - getTabItemHorizontalPadding();
            Rect rect = this.f67504q;
            rect.top = 0;
            rect.bottom = getHeight();
            invalidate();
        }

        public final Paint getPaint() {
            return this.f67503p;
        }

        public final Rect getRect() {
            return this.f67504q;
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            AbstractC19074t.m100208f(canvas, "canvas");
            super.onDraw(canvas);
            canvas.drawRect(this.f67504q, this.f67503p);
        }

        public final void setPaint(Paint paint) {
            AbstractC19074t.m100208f(paint, "<set-?>");
            this.f67503p = paint;
        }

        public final void setRect(Rect rect) {
            AbstractC19074t.m100208f(rect, "<set-?>");
            this.f67504q = rect;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTabLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13097a {

        /* renamed from: a */
        private int f67507a;

        /* renamed from: b */
        private int f67508b;

        public C13097a(int i11, int i12) {
            this.f67507a = i11;
            this.f67508b = i12;
        }

        /* renamed from: a */
        public final int m73441a() {
            return this.f67508b;
        }

        /* renamed from: b */
        public final int m73442b() {
            return this.f67507a;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTabLayout$b */
    /* loaded from: classes6.dex */
    public static final class C13098b implements ViewPager.InterfaceC6875j {
        C13098b() {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            SearchGlobalTabLayout.this.m73438j(i11, f11);
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTabLayout$c */
    /* loaded from: classes6.dex */
    static final class C13099c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13099c f67510q = new C13099c();

        C13099c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118742r(12.0f));
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalTabLayout$d */
    /* loaded from: classes6.dex */
    static final class C13100d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13100d f67511q = new C13100d();

        C13100d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118742r(8.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGlobalTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        AbstractC29080l[] m145299a = C29077i.Companion.m145299a();
        ArrayList arrayList = new ArrayList(m145299a.length);
        for (AbstractC29080l abstractC29080l : m145299a) {
            arrayList.add(Integer.valueOf(abstractC29080l.m145312a()));
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        this.f67492p = numArr;
        int length = numArr.length;
        this.f67493q = length;
        this.f67495s = true;
        this.f67496t = 99;
        m129210a = AbstractC24856m.m129210a(C13100d.f67511q);
        this.f67500x = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C13099c.f67510q);
        this.f67501y = m129210a2;
        this.f67502z = new ArrayList();
        this.f67486A = new HashMap();
        this.f67491F = new C13098b();
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.gravity = 80;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        super.addView(view);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        linearLayout.setGravity(16);
        linearLayout.setPadding(getTabLayoutHorizontalPadding(), linearLayout.getPaddingTop(), getTabLayoutHorizontalPadding(), linearLayout.getPaddingBottom());
        TextView[] textViewArr = new TextView[length];
        for (int i11 = 0; i11 < length; i11++) {
            RobotoTextViewStateAware robotoTextViewStateAware = new RobotoTextViewStateAware(context);
            robotoTextViewStateAware.setGravity(17);
            robotoTextViewStateAware.setPadding(getTabItemHorizontalPadding(), 0, getTabItemHorizontalPadding(), 0);
            new C26708g(robotoTextViewStateAware).m137319a(C26705d.m137293a(context, AbstractC2814h.t_normal_m));
            robotoTextViewStateAware.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.pager_tab_title_selector_gray));
            robotoTextViewStateAware.setMaxLines(1);
            robotoTextViewStateAware.setBackgroundResource(AbstractC16803z.search_global_bg_rect_transparent_with_press_state);
            linearLayout.addView(robotoTextViewStateAware, -2, -1);
            C24848g0 c24848g0 = C24848g0.f119245a;
            textViewArr[i11] = robotoTextViewStateAware;
        }
        this.f67494r = textViewArr;
        this.f67498v = linearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        TabIndicator tabIndicator = new TabIndicator(context);
        this.f67487B = tabIndicator;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AbstractC23136l9.m118655I(AbstractC16802y.height_linear_tab_search));
        layoutParams2.gravity = 80;
        tabIndicator.setLayoutParams(layoutParams2);
        frameLayout.addView(tabIndicator);
        HorizontalNestedScrollView horizontalNestedScrollView = new HorizontalNestedScrollView(context);
        this.f67497u = horizontalNestedScrollView;
        horizontalNestedScrollView.setOverScrollMode(2);
        horizontalNestedScrollView.addView(frameLayout, -2, -1);
        SpringBackLayout springBackLayout = new SpringBackLayout(context);
        springBackLayout.setTarget(horizontalNestedScrollView);
        springBackLayout.setScrollOrientation(1);
        springBackLayout.setSpringBackEnable(true);
        springBackLayout.setSpringBackMode(3);
        springBackLayout.addView(horizontalNestedScrollView, -1, -1);
        super.addView(springBackLayout, -1, -1);
        int length2 = textViewArr.length;
        for (final int i12 = 0; i12 < length2; i12++) {
            this.f67494r[i12].setOnClickListener(new View.OnClickListener() { // from class: ka0.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SearchGlobalTabLayout.m73429c(SearchGlobalTabLayout.this, i12, view2);
                }
            });
        }
        m73433h(AbstractC23136l9.m118731n0(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m73429c(SearchGlobalTabLayout searchGlobalTabLayout, int i11, View view) {
        AbstractC19074t.m100208f(searchGlobalTabLayout, "this$0");
        searchGlobalTabLayout.f67488C = i11;
        searchGlobalTabLayout.f67489D = true;
        ViewPager viewPager = searchGlobalTabLayout.f67490E;
        if (viewPager != null) {
            viewPager.setCurrentItem(i11);
        }
    }

    /* renamed from: d */
    private final void m73430d(View view, int i11, int i12) {
        if (view.getPaddingLeft() != i12 || view.getPaddingRight() != i12) {
            view.setPadding(i12, view.getPaddingTop(), i12, view.getPaddingBottom());
        }
        if (view.getLayoutParams().width != i11) {
            view.getLayoutParams().width = i11;
            view.requestLayout();
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m73431e(SearchGlobalTabLayout searchGlobalTabLayout, View view, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 4) != 0) {
                i12 = searchGlobalTabLayout.getTabItemHorizontalPadding();
            }
            searchGlobalTabLayout.m73430d(view, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assignTabItemWidth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m73432g(SearchGlobalTabLayout searchGlobalTabLayout) {
        AbstractC19074t.m100208f(searchGlobalTabLayout, "this$0");
        ViewPager viewPager = searchGlobalTabLayout.f67490E;
        if (viewPager != null) {
            searchGlobalTabLayout.m73438j(viewPager.getCurrentItem(), 0.0f);
        }
    }

    private final int getTabItemHorizontalPadding() {
        return ((Number) this.f67501y.getValue()).intValue();
    }

    private final int getTabLayoutHorizontalPadding() {
        return ((Number) this.f67500x.getValue()).intValue();
    }

    /* renamed from: h */
    private final void m73433h(int i11) {
        int i12;
        TextView[] textViewArr = this.f67494r;
        if (textViewArr.length == 0 || this.f67499w == i11) {
            return;
        }
        int i13 = 0;
        if (this.f67495s) {
            i12 = m73434i(textViewArr[0], " (99+)", 0);
        } else {
            i12 = 0;
        }
        int tabLayoutHorizontalPadding = getTabLayoutHorizontalPadding() * 2;
        int i14 = 0;
        for (Integer num : this.f67492p) {
            int m73434i = m73434i(this.f67494r[0], m73435k(num.intValue()), (getTabItemHorizontalPadding() * 2) + i12);
            if (m73434i > i14) {
                i14 = m73434i;
            }
            tabLayoutHorizontalPadding += m73434i;
        }
        if (tabLayoutHorizontalPadding <= i11 && i14 < i11 / this.f67493q) {
            TextView[] textViewArr2 = this.f67494r;
            int length = textViewArr2.length;
            while (i13 < length) {
                m73431e(this, textViewArr2[i13], i11 / this.f67493q, 0, 4, null);
                i13++;
            }
        } else if (tabLayoutHorizontalPadding <= i11) {
            TextView[] textViewArr3 = this.f67494r;
            int length2 = textViewArr3.length;
            while (i13 < length2) {
                m73430d(textViewArr3[i13], -2, getTabItemHorizontalPadding() + ((i11 - tabLayoutHorizontalPadding) / (this.f67493q * 2)));
                i13++;
            }
        } else {
            TextView[] textViewArr4 = this.f67494r;
            int length3 = textViewArr4.length;
            while (i13 < length3) {
                m73431e(this, textViewArr4[i13], -2, 0, 4, null);
                i13++;
            }
        }
        this.f67499w = i11;
    }

    /* renamed from: i */
    private final int m73434i(TextView textView, String str, int i11) {
        return (int) (textView.getPaint().measureText(str) + i11);
    }

    /* renamed from: k */
    private final String m73435k(int i11) {
        String str = (String) this.f67486A.get(Integer.valueOf(i11));
        if (str == null) {
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            Integer valueOf = Integer.valueOf(i11);
            HashMap hashMap = this.f67486A;
            AbstractC19074t.m100205c(m118743r0);
            hashMap.put(valueOf, m118743r0);
            AbstractC19074t.m100207e(m118743r0, "apply(...)");
            return m118743r0;
        }
        return str;
    }

    /* renamed from: l */
    private final String m73436l(int i11, int i12) {
        if (i11 == AbstractC29080l.a.f134882b.m145312a()) {
            return m73435k(i11);
        }
        boolean z11 = this.f67495s;
        if (z11 && i12 > this.f67496t) {
            return m73435k(i11) + " (" + this.f67496t + "+)";
        }
        if (z11 && i12 > 0) {
            return m73435k(i11) + " (" + i12 + ")";
        }
        return m73435k(i11);
    }

    /* renamed from: f */
    public final void m73437f(List list, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(list, "arrData");
        try {
            setTitle(list);
            if (list.isEmpty()) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            int length = this.f67494r.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (i12 < list.size()) {
                    C13097a c13097a = (C13097a) list.get(i12);
                    Integer[] numArr = this.f67492p;
                    int length2 = numArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length2) {
                            break;
                        }
                        if (c13097a.m73442b() == numArr[i13].intValue()) {
                            String m73436l = m73436l(c13097a.m73442b(), c13097a.m73441a());
                            if (!AbstractC19074t.m100204b(m73436l, this.f67494r[i12].getText())) {
                                this.f67494r[i12].setText(m73436l);
                            }
                        } else {
                            i13++;
                        }
                    }
                    TextView textView = this.f67494r[i12];
                    if (i11 == i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    textView.setSelected(z11);
                    this.f67494r[i12].setVisibility(0);
                } else {
                    this.f67494r[i12].setVisibility(8);
                }
            }
            post(new Runnable() { // from class: ka0.c
                @Override // java.lang.Runnable
                public final void run() {
                    SearchGlobalTabLayout.m73432g(SearchGlobalTabLayout.this);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final HorizontalNestedScrollView getScrollView() {
        return this.f67497u;
    }

    public final ViewPager getViewPager() {
        return this.f67490E;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:8:0x0016, B:11:0x00ef, B:13:0x00f8, B:14:0x014a, B:16:0x0151, B:17:0x0153, B:19:0x0159, B:22:0x0162, B:29:0x010f, B:30:0x0024, B:32:0x0042, B:33:0x0055, B:34:0x0069, B:36:0x0074, B:37:0x00ed, B:38:0x007c, B:40:0x0090, B:41:0x009d, B:43:0x00ab, B:44:0x00b1, B:46:0x00b9, B:48:0x00c1, B:49:0x00c7, B:51:0x00cf, B:53:0x00e1, B:54:0x0057), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0151 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:8:0x0016, B:11:0x00ef, B:13:0x00f8, B:14:0x014a, B:16:0x0151, B:17:0x0153, B:19:0x0159, B:22:0x0162, B:29:0x010f, B:30:0x0024, B:32:0x0042, B:33:0x0055, B:34:0x0069, B:36:0x0074, B:37:0x00ed, B:38:0x007c, B:40:0x0090, B:41:0x009d, B:43:0x00ab, B:44:0x00b1, B:46:0x00b9, B:48:0x00c1, B:49:0x00c7, B:51:0x00cf, B:53:0x00e1, B:54:0x0057), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0159 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:8:0x0016, B:11:0x00ef, B:13:0x00f8, B:14:0x014a, B:16:0x0151, B:17:0x0153, B:19:0x0159, B:22:0x0162, B:29:0x010f, B:30:0x0024, B:32:0x0042, B:33:0x0055, B:34:0x0069, B:36:0x0074, B:37:0x00ed, B:38:0x007c, B:40:0x0090, B:41:0x009d, B:43:0x00ab, B:44:0x00b1, B:46:0x00b9, B:48:0x00c1, B:49:0x00c7, B:51:0x00cf, B:53:0x00e1, B:54:0x0057), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:8:0x0016, B:11:0x00ef, B:13:0x00f8, B:14:0x014a, B:16:0x0151, B:17:0x0153, B:19:0x0159, B:22:0x0162, B:29:0x010f, B:30:0x0024, B:32:0x0042, B:33:0x0055, B:34:0x0069, B:36:0x0074, B:37:0x00ed, B:38:0x007c, B:40:0x0090, B:41:0x009d, B:43:0x00ab, B:44:0x00b1, B:46:0x00b9, B:48:0x00c1, B:49:0x00c7, B:51:0x00cf, B:53:0x00e1, B:54:0x0057), top: B:1:0x0000 }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73438j(int i11, float f11) {
        float x11;
        float width;
        int length;
        int i12;
        boolean z11;
        try {
            if (this.f67494r.length > i11) {
                if (this.f67489D) {
                    if (Math.abs(f11) > 0.1f) {
                        if (Math.abs(1 - f11) <= 0.1f) {
                        }
                        if (i11 != this.f67502z.size() - 1) {
                            this.f67487B.m73439a((int) this.f67494r[i11].getX(), this.f67494r[i11].getWidth());
                        } else {
                            this.f67487B.m73439a((int) (this.f67494r[i11].getX() + (this.f67494r[i11].getWidth() * f11)), (int) (this.f67494r[i11].getWidth() + ((this.f67494r[i11 + 1].getWidth() - this.f67494r[i11].getWidth()) * f11)));
                        }
                        if (f11 > 0.5d) {
                            i11++;
                        }
                        length = this.f67494r.length;
                        for (i12 = 0; i12 < length; i12++) {
                            TextView textView = this.f67494r[i12];
                            if (i11 == i12) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            textView.setSelected(z11);
                        }
                    }
                }
                float x12 = this.f67494r[i11].getX() + (this.f67494r[i11].getWidth() * f11);
                int i13 = i11 + 1;
                if (i13 < this.f67502z.size()) {
                    x11 = this.f67494r[i13].getX();
                    width = this.f67494r[i13].getWidth() * f11;
                } else {
                    x11 = this.f67494r[i11].getX();
                    width = this.f67494r[i11].getWidth();
                }
                float f12 = x11 + width;
                if (this.f67497u.getScrollX() > x12) {
                    this.f67497u.m76989y((int) x12, 0);
                } else if (this.f67497u.getScrollX() < f12 - this.f67497u.getWidth()) {
                    this.f67497u.m76989y((int) (f12 - r0.getWidth()), 0);
                } else if (this.f67498v.getWidth() <= this.f67497u.getWidth()) {
                    this.f67497u.m76989y(0, 0);
                } else if (this.f67502z.size() <= 1) {
                    if (this.f67497u.getScrollX() != 0) {
                        this.f67497u.setScrollX(0);
                    }
                } else if (i13 == this.f67502z.size() && this.f67497u.getScrollX() != ((int) (f12 - this.f67497u.getWidth()))) {
                    this.f67497u.setScrollX((int) (f12 - r0.getWidth()));
                }
                this.f67489D = false;
                if (i11 != this.f67502z.size() - 1) {
                }
                if (f11 > 0.5d) {
                }
                length = this.f67494r.length;
                while (i12 < length) {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m73433h(i11);
    }

    public final void setSelect(boolean z11) {
        this.f67489D = z11;
    }

    public final void setTitle(List<C13097a> list) {
        AbstractC19074t.m100208f(list, "arrData");
        this.f67502z.clear();
        this.f67502z.addAll(list);
    }

    public final void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f67490E;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this.f67491F);
        }
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(this.f67491F);
        }
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(this.f67491F);
        }
        this.f67490E = viewPager;
    }
}
