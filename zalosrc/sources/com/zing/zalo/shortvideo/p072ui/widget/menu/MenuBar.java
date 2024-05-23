package com.zing.zalo.shortvideo.p072ui.widget.menu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.menu.MenuBar;
import en0.InterfaceC18494a;
import f20.C18705c;
import f20.InterfaceC18703a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19053g0;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class MenuBar extends HorizontalScrollView implements ViewPager.InterfaceC6874i, ViewPager.InterfaceC6875j {

    /* renamed from: p */
    private MenuList f54394p;

    /* renamed from: q */
    private ViewPager f54395q;

    /* renamed from: r */
    private AbstractC6881a f54396r;

    /* renamed from: s */
    private int f54397s;

    /* renamed from: t */
    private int f54398t;

    /* renamed from: u */
    private int f54399u;

    /* renamed from: v */
    private final C10765a f54400v;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class MenuItem extends RelativeLayout {

        /* renamed from: p */
        private final InterfaceC24854k f54401p;

        /* renamed from: q */
        private final InterfaceC24854k f54402q;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.MenuBar$MenuItem$a */
        /* loaded from: classes5.dex */
        static final class C10763a extends AbstractC19075u implements InterfaceC18494a {
            C10763a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View mo12V4() {
                return MenuItem.this.findViewById(AbstractC27409d.dotRed);
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.MenuBar$MenuItem$b */
        /* loaded from: classes5.dex */
        static final class C10764b extends AbstractC19075u implements InterfaceC18494a {
            C10764b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView mo12V4() {
                return (TextView) MenuItem.this.findViewById(AbstractC27409d.txtTitle);
            }
        }

        public /* synthetic */ MenuItem(Context context, AttributeSet attributeSet, int i11, AbstractC19060k abstractC19060k) {
            this(context, (i11 & 2) != 0 ? null : attributeSet);
        }

        /* renamed from: a */
        public final View m55966a() {
            Object value = this.f54402q.getValue();
            AbstractC19074t.m100207e(value, "getValue(...)");
            return (View) value;
        }

        /* renamed from: b */
        public final TextView m55967b() {
            Object value = this.f54401p.getValue();
            AbstractC19074t.m100207e(value, "getValue(...)");
            return (TextView) value;
        }

        /* renamed from: c */
        public final void m55968c(boolean z11) {
            int i11;
            TextView m55967b = m55967b();
            if (z11) {
                i11 = AbstractC27406a.zch_text_primary;
            } else {
                i11 = AbstractC27406a.zch_text_inverse_subtle;
            }
            m55967b.setTextColor(AbstractC26112n.m134426u(this, i11));
        }

        /* renamed from: d */
        public final void m55969d(CharSequence charSequence) {
            m55967b().setText(charSequence);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuItem(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(context, "context");
            View.inflate(context, AbstractC27410e.zch_item_menu, this);
            m129210a = AbstractC24856m.m129210a(new C10764b());
            this.f54401p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C10763a());
            this.f54402q = m129210a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class MenuList extends FrameLayout {

        /* renamed from: p */
        private final int f54405p;

        /* renamed from: q */
        private final int f54406q;

        public /* synthetic */ MenuList(Context context, AttributeSet attributeSet, int i11, AbstractC19060k abstractC19060k) {
            this(context, (i11 & 2) != 0 ? null : attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55973c(ViewPager viewPager, int i11, View view) {
            InterfaceC18703a interfaceC18703a;
            AbstractC19074t.m100208f(viewPager, "$viewPager");
            if (viewPager.getCurrentItem() != i11) {
                viewPager.setCurrentItem(i11);
                return;
            }
            Object adapter = viewPager.getAdapter();
            if (adapter instanceof InterfaceC18703a) {
                interfaceC18703a = (InterfaceC18703a) adapter;
            } else {
                interfaceC18703a = null;
            }
            if (interfaceC18703a != null) {
                interfaceC18703a.mo98627c(i11);
            }
        }

        /* renamed from: b */
        public final void m55974b(final int i11, final ViewPager viewPager) {
            boolean z11;
            AbstractC19074t.m100208f(viewPager, "viewPager");
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            CharSequence charSequence = null;
            MenuItem menuItem = new MenuItem(context, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
            AbstractC6881a adapter = viewPager.getAdapter();
            if (adapter != null) {
                charSequence = adapter.mo35337i(i11);
            }
            menuItem.m55969d(charSequence);
            if (viewPager.getCurrentItem() == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            menuItem.m55968c(z11);
            menuItem.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MenuBar.MenuList.m55973c(ViewPager.this, i11, view);
                }
            });
            addView(menuItem);
        }

        /* renamed from: d */
        public final MenuItem m55975d(int i11) {
            View childAt = getChildAt(i11);
            AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.menu.MenuBar.MenuItem");
            return (MenuItem) childAt;
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            int childCount = getChildCount();
            int i15 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.menu.MenuBar.MenuItem");
                MenuItem menuItem = (MenuItem) childAt;
                AbstractC26112n.m134383X(menuItem, 0, i15);
                i15 += menuItem.getMeasuredWidth() + this.f54405p;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            int i13 = -this.f54405p;
            int i14 = this.f54406q;
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.widget.menu.MenuBar.MenuItem");
                MenuItem menuItem = (MenuItem) childAt;
                AbstractC26112n.m134387a0(menuItem, 0, 0, i14, 1073741824);
                i13 += this.f54405p + menuItem.getMeasuredWidth();
            }
            setMeasuredDimension(i13, i14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuList(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
            this.f54405p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_main_item_menu_spacing);
            this.f54406q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.MenuBar$a */
    /* loaded from: classes5.dex */
    public static final class C10765a {

        /* renamed from: a */
        private final MenuBar f54407a;

        /* renamed from: b */
        private final float f54408b;

        /* renamed from: c */
        private final float f54409c;

        /* renamed from: d */
        private final float f54410d;

        /* renamed from: e */
        private final Paint f54411e;

        /* renamed from: f */
        private float f54412f;

        /* renamed from: g */
        private float f54413g;

        public C10765a(MenuBar menuBar) {
            AbstractC19074t.m100208f(menuBar, "container");
            this.f54407a = menuBar;
            this.f54408b = AbstractC26112n.m134433y(menuBar, AbstractC27407b.zch_page_main_item_menu_indicator_margin_horizontal);
            this.f54409c = AbstractC26112n.m134433y(menuBar, AbstractC27407b.zch_page_main_item_menu_indicator_margin_vertical);
            this.f54410d = AbstractC26112n.m134433y(menuBar, AbstractC27407b.zch_page_main_item_menu_indicator_length);
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(AbstractC26112n.m134426u(menuBar, AbstractC27406a.zch_text_primary));
            paint.setStrokeWidth(AbstractC26112n.m134433y(menuBar, AbstractC27407b.zch_page_main_item_menu_indicator_thickness));
            this.f54411e = paint;
        }

        /* renamed from: a */
        public final void m55976a(Canvas canvas) {
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC6881a abstractC6881a = this.f54407a.f54396r;
            if (abstractC6881a != null && abstractC6881a.mo35335g() > 1) {
                float height = this.f54407a.getHeight() - this.f54409c;
                canvas.drawLine(this.f54407a.getPaddingLeft() + this.f54412f, height, this.f54407a.getPaddingLeft() + this.f54413g, height, this.f54411e);
            }
        }

        /* renamed from: b */
        public final void m55977b(View view, View view2, float f11) {
            AbstractC19074t.m100208f(view, "lView");
            AbstractC19074t.m100208f(view2, "rView");
            float m134422s = (AbstractC26112n.m134422s(view) * (1.0f - f11)) + (AbstractC26112n.m134422s(view2) * f11);
            float f12 = this.f54410d;
            this.f54412f = m134422s - (f12 / 2.0f);
            this.f54413g = m134422s + (f12 / 2.0f);
            this.f54407a.invalidate();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.MenuBar$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10766b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54414a;

        static {
            int[] iArr = new int[C18705c.d.values().length];
            try {
                iArr[C18705c.d.f93972q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C18705c.d.f93974s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54414a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54400v = new C10765a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m55961g(MenuBar menuBar, MenuList menuList, int i11, int i12, C19053g0 c19053g0) {
        AbstractC19074t.m100208f(menuBar, "this$0");
        AbstractC19074t.m100208f(menuList, "$menuList");
        AbstractC19074t.m100208f(c19053g0, "$progress");
        menuBar.f54400v.m55977b(menuList.m55975d(i11), menuList.m55975d(i12), c19053g0.f94930p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m55962h(MenuBar menuBar, MenuList menuList, int i11, int i12, C19053g0 c19053g0) {
        AbstractC19074t.m100208f(menuBar, "this$0");
        AbstractC19074t.m100208f(menuList, "$menuList");
        AbstractC19074t.m100208f(c19053g0, "$progress");
        menuBar.f54400v.m55977b(menuList.m55975d(i11), menuList.m55975d(i12), c19053g0.f94930p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m55963i(MenuList menuList, MenuBar menuBar, C19053g0 c19053g0) {
        AbstractC19074t.m100208f(menuList, "$menuList");
        AbstractC19074t.m100208f(menuBar, "this$0");
        AbstractC19074t.m100208f(c19053g0, "$progress");
        MenuItem m55975d = menuList.m55975d(menuBar.f54398t);
        int left = m55975d.getLeft() - menuBar.getScrollX();
        float f11 = c19053g0.f94930p;
        if (menuBar.f54399u == 0) {
            f11 = 1.0f;
        }
        if (menuBar.f54398t != 0) {
            left -= menuBar.getHorizontalFadingEdgeLength();
        }
        if (left < 0) {
            menuBar.setScrollX(menuBar.getScrollX() + ((int) (left * (1.0f - f11))));
            return;
        }
        int right = (m55975d.getRight() - menuBar.getScrollX()) - menuBar.getWidth();
        int i11 = menuBar.f54398t;
        AbstractC19074t.m100205c(menuBar.f54396r);
        if (i11 != r1.mo35335g() - 1) {
            right += menuBar.getHorizontalFadingEdgeLength();
        }
        if (right > 0) {
            menuBar.setScrollX(menuBar.getScrollX() + ((int) (right * f11)));
        }
    }

    private final void setPagerAdapter(AbstractC6881a abstractC6881a) {
        ViewPager viewPager;
        MenuList menuList = this.f54394p;
        if (menuList == null || (viewPager = this.f54395q) == null) {
            return;
        }
        menuList.removeAllViews();
        if (abstractC6881a != null) {
            this.f54397s = viewPager.getCurrentItem();
            this.f54398t = viewPager.getCurrentItem();
            int mo35335g = abstractC6881a.mo35335g();
            for (int i11 = 0; i11 < mo35335g; i11++) {
                menuList.m55974b(i11, viewPager);
            }
        }
        this.f54396r = abstractC6881a;
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6874i
    /* renamed from: a */
    public void mo35301a(ViewPager viewPager, AbstractC6881a abstractC6881a, AbstractC6881a abstractC6881a2) {
        AbstractC19074t.m100208f(viewPager, "viewPager");
        setPagerAdapter(abstractC6881a2);
    }

    /* renamed from: f */
    public final void m55964f(int i11) {
        MenuItem m55975d;
        View m55966a;
        MenuList menuList = this.f54394p;
        if (menuList != null && (m55975d = menuList.m55975d(i11)) != null && (m55966a = m55975d.m55966a()) != null) {
            AbstractC26112n.m134367H(m55966a);
        }
    }

    /* renamed from: j */
    public final void m55965j(int i11) {
        MenuItem m55975d;
        View m55966a;
        MenuList menuList = this.f54394p;
        if (menuList != null && (m55975d = menuList.m55975d(i11)) != null && (m55966a = m55975d.m55966a()) != null) {
            AbstractC26112n.m134431w0(m55966a);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        this.f54400v.m55976a(canvas);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setHorizontalScrollBarEnabled(false);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        MenuList menuList = new MenuList(context, null, 2, 0 == true ? 1 : 0);
        addView(menuList);
        this.f54394p = menuList;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        super.onMeasure(i11, i12);
        MenuList menuList = this.f54394p;
        if (menuList != null) {
            i13 = menuList.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        if (i13 < getMeasuredWidth()) {
            AbstractC26112n.m134415o0(this, (getMeasuredWidth() - i13) / 2);
        } else {
            AbstractC26112n.m134415o0(this, 0);
        }
        onPageScrolled(this.f54398t, 0.0f, 0);
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        if (i11 == 0) {
            this.f54397s = this.f54398t;
        }
        this.f54399u = i11;
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(final int i11, float f11, int i12) {
        int i13;
        int i14;
        final int i15;
        final int i16;
        final MenuList menuList = this.f54394p;
        if (menuList == null) {
            return;
        }
        final C19053g0 c19053g0 = new C19053g0();
        c19053g0.f94930p = f11;
        int i17 = 1;
        if (this.f54399u != 1 && (i13 = this.f54397s) != (i14 = this.f54398t)) {
            if (i13 < i14) {
                i15 = i13;
            } else {
                i15 = i14;
            }
            if (i13 > i14) {
                i16 = i13;
            } else {
                i16 = i14;
            }
            c19053g0.f94930p = ((i11 - i15) + f11) / (i16 - i15);
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.b
                @Override // java.lang.Runnable
                public final void run() {
                    MenuBar.m55962h(MenuBar.this, menuList, i15, i16, c19053g0);
                }
            });
        } else {
            if (i11 + 1 >= menuList.getChildCount()) {
                i17 = 0;
            }
            final int i18 = i11 + i17;
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.a
                @Override // java.lang.Runnable
                public final void run() {
                    MenuBar.m55961g(MenuBar.this, menuList, i11, i18, c19053g0);
                }
            });
        }
        int i19 = this.f54399u;
        if (i19 == 0 || i19 == 2) {
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.c
                @Override // java.lang.Runnable
                public final void run() {
                    MenuBar.m55963i(MenuBar.MenuList.this, this, c19053g0);
                }
            });
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        MenuItem m55975d;
        AbstractC6881a abstractC6881a;
        C18705c c18705c;
        C18705c.d dVar;
        int i12;
        MenuItem m55975d2;
        int i13 = this.f54398t;
        this.f54397s = i13;
        this.f54398t = i11;
        MenuList menuList = this.f54394p;
        if (menuList != null && (m55975d2 = menuList.m55975d(i13)) != null) {
            m55975d2.m55968c(false);
        }
        MenuList menuList2 = this.f54394p;
        if (menuList2 != null && (m55975d = menuList2.m55975d(this.f54398t)) != null) {
            if (AbstractC26112n.m134380U(m55975d.m55966a())) {
                AbstractC26112n.m134367H(m55975d.m55966a());
                ViewPager viewPager = this.f54395q;
                InterfaceC18703a interfaceC18703a = null;
                if (viewPager != null) {
                    abstractC6881a = viewPager.getAdapter();
                } else {
                    abstractC6881a = null;
                }
                if (abstractC6881a instanceof C18705c) {
                    c18705c = (C18705c) abstractC6881a;
                } else {
                    c18705c = null;
                }
                if (c18705c != null) {
                    dVar = c18705c.m98637F(this.f54398t);
                } else {
                    dVar = null;
                }
                if (dVar == null) {
                    i12 = -1;
                } else {
                    i12 = C10766b.f54414a[dVar.ordinal()];
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        Object obj = this.f54396r;
                        if (obj instanceof InterfaceC18703a) {
                            interfaceC18703a = (InterfaceC18703a) obj;
                        }
                        if (interfaceC18703a != null) {
                            interfaceC18703a.mo98626a(this.f54398t);
                        }
                    } else {
                        AbstractC28684a.Companion.m143692z().mo146372k(false);
                    }
                } else {
                    AbstractC28684a.Companion.m143692z().mo146363b(false);
                }
            }
            m55975d.m55968c(true);
        }
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        AbstractC19074t.m100208f(viewPager, "viewPager");
        ViewPager viewPager2 = this.f54395q;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            viewPager2.removeOnAdapterChangeListener(this);
        }
        viewPager.addOnPageChangeListener(this);
        viewPager.addOnAdapterChangeListener(this);
        this.f54395q = viewPager;
        setPagerAdapter(viewPager.getAdapter());
    }
}
