package com.zing.zalo.shortvideo.p072ui.widget.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19053g0;
import java.util.ArrayList;
import pm0.C24848g0;
import s20.AbstractC26100b;
import s20.AbstractC26103e;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class PageBar extends HorizontalScrollView implements ViewPager.InterfaceC6874i, ViewPager.InterfaceC6875j {
    public static final C10768b Companion = new C10768b(null);

    /* renamed from: A */
    private int f54415A;

    /* renamed from: B */
    private int f54416B;

    /* renamed from: C */
    private int f54417C;

    /* renamed from: D */
    private int f54418D;

    /* renamed from: E */
    private int f54419E;

    /* renamed from: F */
    private boolean f54420F;

    /* renamed from: p */
    private C10769c f54421p;

    /* renamed from: q */
    private C10770d f54422q;

    /* renamed from: r */
    private ViewPager f54423r;

    /* renamed from: s */
    private AbstractC6881a f54424s;

    /* renamed from: t */
    private InterfaceC10772f f54425t;

    /* renamed from: u */
    private InterfaceC10771e f54426u;

    /* renamed from: v */
    private InterfaceC10773g f54427v;

    /* renamed from: w */
    private int f54428w;

    /* renamed from: x */
    private int f54429x;

    /* renamed from: y */
    private int f54430y;

    /* renamed from: z */
    private int f54431z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$a */
    /* loaded from: classes5.dex */
    static final class C10767a extends AbstractC19075u implements InterfaceC18505l {
        C10767a() {
            super(1);
        }

        /* renamed from: a */
        public final void m56003a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            PageBar.this.f54431z = typedArray.getInt(AbstractC27414i.ZchPageBar_zchPageMode, 2);
            PageBar.this.f54415A = AbstractC26100b.m134296b(typedArray, AbstractC27414i.ZchPageBar_zchPageMargin, 0, 2, null);
            int m134296b = AbstractC26100b.m134296b(typedArray, AbstractC27414i.ZchPageBar_zchPagePadding, 0, 2, null);
            PageBar.this.f54416B = AbstractC26100b.m134295a(typedArray, AbstractC27414i.ZchPageBar_zchPagePaddingLeft, m134296b);
            PageBar.this.f54417C = AbstractC26100b.m134295a(typedArray, AbstractC27414i.ZchPageBar_zchPagePaddingTop, m134296b);
            PageBar.this.f54418D = AbstractC26100b.m134295a(typedArray, AbstractC27414i.ZchPageBar_zchPagePaddingRight, m134296b);
            PageBar.this.f54419E = AbstractC26100b.m134295a(typedArray, AbstractC27414i.ZchPageBar_zchPagePaddingBottom, m134296b);
            PageBar.this.f54420F = typedArray.getBoolean(AbstractC27414i.ZchPageBar_zchPageRippleEnable, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m56003a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$b */
    /* loaded from: classes5.dex */
    public static final class C10768b {
        private C10768b() {
        }

        public /* synthetic */ C10768b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$c */
    /* loaded from: classes5.dex */
    public final class C10769c extends FrameLayout {

        /* renamed from: p */
        private final ArrayList f54433p;

        /* renamed from: q */
        private final ArrayList f54434q;

        /* renamed from: r */
        final /* synthetic */ PageBar f54435r;

        public /* synthetic */ C10769c(PageBar pageBar, Context context, AttributeSet attributeSet, int i11, AbstractC19060k abstractC19060k) {
            this(pageBar, context, (i11 & 2) != 0 ? null : attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m56006f(PageBar pageBar, int i11, C10769c c10769c, View view) {
            AbstractC19074t.m100208f(pageBar, "this$0");
            AbstractC19074t.m100208f(c10769c, "this$1");
            if (pageBar.getSelectedPagePosition() == i11) {
                InterfaceC10773g interfaceC10773g = pageBar.f54427v;
                if (interfaceC10773g != null) {
                    Object obj = c10769c.f54433p.get(i11);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    interfaceC10773g.mo56015c((C10774h) obj);
                    return;
                }
                return;
            }
            pageBar.setSelectedPagePosition(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m56007g(C10769c c10769c, int i11, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            AbstractC19074t.m100208f(c10769c, "this$0");
            ((Rect) c10769c.f54434q.get(i11)).set(i12, i13, i14, i15);
        }

        /* renamed from: c */
        public final C10774h m56008c(int i11) {
            Object obj = this.f54433p.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            return (C10774h) obj;
        }

        /* renamed from: d */
        public final Rect m56009d(int i11) {
            Object obj = this.f54434q.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            return (Rect) obj;
        }

        /* renamed from: e */
        public final void m56010e(final int i11, View view) {
            AbstractC19074t.m100208f(view, "view");
            FrameLayout frameLayout = new FrameLayout(getContext());
            final PageBar pageBar = this.f54435r;
            if (pageBar.f54420F) {
                frameLayout.setBackgroundResource(AbstractC27408c.zch_bg_ripple_rectangle);
            }
            frameLayout.setPadding(pageBar.f54416B, pageBar.f54417C, pageBar.f54418D, pageBar.f54419E);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PageBar.C10769c.m56006f(PageBar.this, i11, this, view2);
                }
            });
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.i
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    PageBar.C10769c.m56007g(PageBar.C10769c.this, i11, view2, i12, i13, i14, i15, i16, i17, i18, i19);
                }
            });
            frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
            addView(frameLayout);
            this.f54433p.add(new C10774h(i11, view, this.f54435r));
            this.f54434q.add(new Rect());
        }

        /* renamed from: h */
        public final void m56011h() {
            removeAllViews();
            this.f54433p.clear();
            this.f54434q.clear();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            int i15 = this.f54435r.f54415A;
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                AbstractC19074t.m100205c(childAt);
                AbstractC26112n.m134383X(childAt, 0, i15);
                i15 += childAt.getMeasuredWidth();
            }
            this.f54435r.f54422q.m56013b(i11, i12, i13, i14);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            int size = View.MeasureSpec.getSize(i11);
            int size2 = View.MeasureSpec.getSize(i12);
            int i13 = this.f54435r.f54415A * 2;
            int i14 = 0;
            if (this.f54435r.f54431z != 1) {
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    AbstractC19074t.m100205c(childAt);
                    AbstractC26112n.m134387a0(childAt, 0, 0, size2, 1073741824);
                    i13 += childAt.getMeasuredWidth();
                }
            }
            if (this.f54435r.f54431z != 0 && i13 < size && getChildCount() > 0) {
                if (this.f54435r.f54431z == 1) {
                    int childCount2 = (size - (this.f54435r.f54415A * 2)) / getChildCount();
                    int childCount3 = getChildCount();
                    while (i14 < childCount3) {
                        View childAt2 = getChildAt(i14);
                        AbstractC19074t.m100207e(childAt2, "getChildAt(...)");
                        AbstractC26112n.m134387a0(childAt2, childCount2, 1073741824, size2, 1073741824);
                        i14++;
                    }
                } else {
                    int childCount4 = (size - i13) / getChildCount();
                    int childCount5 = getChildCount();
                    while (i14 < childCount5) {
                        View childAt3 = getChildAt(i14);
                        AbstractC19074t.m100205c(childAt3);
                        AbstractC26112n.m134387a0(childAt3, childAt3.getMeasuredWidth() + childCount4, 1073741824, size2, 1073741824);
                        i14++;
                    }
                }
            }
            if (i13 >= size) {
                size = i13;
            }
            setMeasuredDimension(size, size2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10769c(PageBar pageBar, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
            this.f54435r = pageBar;
            this.f54433p = new ArrayList();
            this.f54434q = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$d */
    /* loaded from: classes5.dex */
    public final class C10770d {

        /* renamed from: a */
        private Rect f54436a;

        /* renamed from: b */
        private Rect f54437b;

        /* renamed from: c */
        private Rect f54438c;

        /* renamed from: d */
        private float f54439d;

        public C10770d() {
        }

        /* renamed from: a */
        public final void m56012a(Canvas canvas) {
            InterfaceC10771e interfaceC10771e;
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC6881a abstractC6881a = PageBar.this.f54424s;
            if (abstractC6881a != null && abstractC6881a.mo35335g() > 1 && (interfaceC10771e = PageBar.this.f54426u) != null) {
                interfaceC10771e.mo54597a(canvas, new Rect(this.f54436a), new Rect(this.f54437b), new Rect(this.f54438c), this.f54439d);
            }
        }

        /* renamed from: b */
        public final void m56013b(int i11, int i12, int i13, int i14) {
            this.f54436a = new Rect(i11, i12, i13, i14);
        }

        /* renamed from: c */
        public final void m56014c(Rect rect, Rect rect2, float f11) {
            AbstractC19074t.m100208f(rect, "l");
            AbstractC19074t.m100208f(rect2, "r");
            this.f54437b = rect;
            this.f54438c = rect2;
            this.f54439d = f11;
            PageBar.this.invalidate();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC10771e {
        /* renamed from: a */
        void mo54597a(Canvas canvas, Rect rect, Rect rect2, Rect rect3, float f11);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$f */
    /* loaded from: classes5.dex */
    public interface InterfaceC10772f {
        /* renamed from: a */
        View mo54594a(ViewGroup viewGroup, int i11, CharSequence charSequence);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC10773g {
        /* renamed from: a */
        void mo54595a(C10774h c10774h);

        /* renamed from: b */
        void mo54596b(C10774h c10774h);

        /* renamed from: c */
        void mo56015c(C10774h c10774h);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$h */
    /* loaded from: classes5.dex */
    public static final class C10774h {

        /* renamed from: a */
        private final int f54441a;

        /* renamed from: b */
        private final View f54442b;

        /* renamed from: c */
        private final PageBar f54443c;

        public C10774h(int i11, View view, PageBar pageBar) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(pageBar, "parent");
            this.f54441a = i11;
            this.f54442b = view;
            this.f54443c = pageBar;
        }

        /* renamed from: a */
        public final View m56016a() {
            return this.f54442b;
        }

        /* renamed from: b */
        public final boolean m56017b() {
            if (this.f54441a == this.f54443c.getSelectedPagePosition()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$i */
    /* loaded from: classes5.dex */
    public static class C10775i implements InterfaceC10771e {

        /* renamed from: a */
        private final Paint f54444a;

        /* renamed from: b */
        private float f54445b;

        /* renamed from: c */
        private int f54446c;

        /* renamed from: d */
        private int f54447d;

        /* renamed from: e */
        private RectF f54448e;

        public C10775i(Context context) {
            AbstractC19074t.m100208f(context, "context");
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            this.f54444a = paint;
            this.f54445b = AbstractC26103e.m134328b(context, AbstractC27407b.zch_divider_thick);
            this.f54446c = AbstractC26103e.m134327a(context, AbstractC27406a.zch_divider_subtle);
            this.f54447d = AbstractC26103e.m134327a(context, AbstractC27406a.zch_icon_primary);
            this.f54448e = new RectF();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10771e
        /* renamed from: a */
        public void mo54597a(Canvas canvas, Rect rect, Rect rect2, Rect rect3, float f11) {
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC19074t.m100208f(rect, "bound");
            AbstractC19074t.m100208f(rect2, "lPage");
            AbstractC19074t.m100208f(rect3, "rPage");
            m56018d().set(rect);
            m56018d().top = rect.bottom - m56020f();
            RectF m56018d = m56018d();
            Paint m56019e = m56019e();
            m56019e.setColor(mo54598b());
            C24848g0 c24848g0 = C24848g0.f119245a;
            canvas.drawRect(m56018d, m56019e);
            m56018d().left = rect2.left + ((rect3.left - r0) * f11);
            m56018d().right = rect2.right + ((rect3.right - r6) * f11);
            RectF m56018d2 = m56018d();
            Paint m56019e2 = m56019e();
            m56019e2.setColor(mo54599c());
            canvas.drawRect(m56018d2, m56019e2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b */
        public int mo54598b() {
            return this.f54446c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: c */
        public int mo54599c() {
            return this.f54447d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: d */
        public RectF m56018d() {
            return this.f54448e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public Paint m56019e() {
            return this.f54444a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: f */
        public float m56020f() {
            return this.f54445b;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$j */
    /* loaded from: classes5.dex */
    public static class C10776j implements InterfaceC10772f {
        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10772f
        /* renamed from: a */
        public View mo54594a(ViewGroup viewGroup, int i11, CharSequence charSequence) {
            AbstractC19074t.m100208f(viewGroup, "container");
            View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_page_simple, false, 2, null);
            AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) m134372M).setText(charSequence);
            return m134372M;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.menu.PageBar$k */
    /* loaded from: classes5.dex */
    public static class C10777k implements InterfaceC10773g {
        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10773g
        /* renamed from: a */
        public void mo54595a(C10774h c10774h) {
            TextView textView;
            AbstractC19074t.m100208f(c10774h, "page");
            View m56016a = c10774h.m56016a();
            if (m56016a instanceof TextView) {
                textView = (TextView) m56016a;
            } else {
                textView = null;
            }
            if (textView != null) {
                AbstractC26112n.m134425t0(textView, AbstractC27406a.zch_text_tertiary);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10773g
        /* renamed from: b */
        public void mo54596b(C10774h c10774h) {
            TextView textView;
            AbstractC19074t.m100208f(c10774h, "page");
            View m56016a = c10774h.m56016a();
            if (m56016a instanceof TextView) {
                textView = (TextView) m56016a;
            } else {
                textView = null;
            }
            if (textView != null) {
                AbstractC26112n.m134425t0(textView, AbstractC27406a.zch_text_primary);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar.InterfaceC10773g
        /* renamed from: c */
        public void mo56015c(C10774h c10774h) {
            AbstractC19074t.m100208f(c10774h, "page");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54421p = new C10769c(this, context, null, 2, null);
        this.f54422q = new C10770d();
        this.f54425t = new C10776j();
        this.f54426u = new C10775i(context);
        this.f54427v = new C10777k();
        this.f54431z = 2;
        this.f54420F = true;
        int[] iArr = AbstractC27414i.ZchPageBar;
        AbstractC19074t.m100207e(iArr, "ZchPageBar");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10767a());
        addView(this.f54421p);
        setHorizontalScrollBarEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m55978A(PageBar pageBar, C10769c c10769c, int i11, int i12, C19053g0 c19053g0) {
        AbstractC19074t.m100208f(pageBar, "this$0");
        AbstractC19074t.m100208f(c10769c, "$container");
        AbstractC19074t.m100208f(c19053g0, "$progress");
        pageBar.f54422q.m56014c(c10769c.m56009d(i11), c10769c.m56009d(i12), c19053g0.f94930p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m55979B(C10769c c10769c, PageBar pageBar, C19053g0 c19053g0) {
        AbstractC19074t.m100208f(c10769c, "$container");
        AbstractC19074t.m100208f(pageBar, "this$0");
        AbstractC19074t.m100208f(c19053g0, "$progress");
        Rect m56009d = c10769c.m56009d(pageBar.f54430y);
        int scrollX = m56009d.left - pageBar.getScrollX();
        float f11 = c19053g0.f94930p;
        if (pageBar.f54428w == 0) {
            f11 = 1.0f;
        }
        if (pageBar.f54430y != 0) {
            scrollX -= pageBar.getHorizontalFadingEdgeLength();
        }
        if (scrollX < 0) {
            pageBar.setScrollX(pageBar.getScrollX() + ((int) (scrollX * (1.0f - f11))));
            return;
        }
        int scrollX2 = (m56009d.right - pageBar.getScrollX()) - pageBar.getWidth();
        int i11 = pageBar.f54430y;
        AbstractC19074t.m100205c(pageBar.f54424s);
        if (i11 != r1.mo35335g() - 1) {
            scrollX2 += pageBar.getHorizontalFadingEdgeLength();
        }
        if (scrollX2 > 0) {
            pageBar.setScrollX(pageBar.getScrollX() + ((int) (scrollX2 * f11)));
        }
    }

    private final void setPagerAdapter(AbstractC6881a abstractC6881a) {
        ViewPager viewPager;
        C10769c c10769c = this.f54421p;
        if (c10769c == null || (viewPager = this.f54423r) == null) {
            return;
        }
        c10769c.m56011h();
        if (abstractC6881a != null) {
            this.f54429x = viewPager.getCurrentItem();
            this.f54430y = viewPager.getCurrentItem();
            int mo35335g = abstractC6881a.mo35335g();
            for (int i11 = 0; i11 < mo35335g; i11++) {
                c10769c.m56010e(i11, this.f54425t.mo54594a(c10769c, i11, abstractC6881a.mo35337i(i11)));
                C10774h m56008c = c10769c.m56008c(i11);
                if (m56008c.m56017b()) {
                    InterfaceC10773g interfaceC10773g = this.f54427v;
                    if (interfaceC10773g != null) {
                        interfaceC10773g.mo54596b(m56008c);
                    }
                } else {
                    InterfaceC10773g interfaceC10773g2 = this.f54427v;
                    if (interfaceC10773g2 != null) {
                        interfaceC10773g2.mo54595a(m56008c);
                    }
                }
            }
        }
        this.f54424s = abstractC6881a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m56001z(PageBar pageBar, C10769c c10769c, int i11, int i12, C19053g0 c19053g0) {
        AbstractC19074t.m100208f(pageBar, "this$0");
        AbstractC19074t.m100208f(c10769c, "$container");
        AbstractC19074t.m100208f(c19053g0, "$progress");
        pageBar.f54422q.m56014c(c10769c.m56009d(i11), c10769c.m56009d(i12), c19053g0.f94930p);
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6874i
    /* renamed from: a */
    public void mo35301a(ViewPager viewPager, AbstractC6881a abstractC6881a, AbstractC6881a abstractC6881a2) {
        AbstractC19074t.m100208f(viewPager, "viewPager");
        setPagerAdapter(abstractC6881a2);
    }

    public final int getPageMargin() {
        return this.f54415A;
    }

    public final int getPageMode() {
        return this.f54431z;
    }

    public final int getPagePaddingBottom() {
        return this.f54419E;
    }

    public final int getPagePaddingLeft() {
        return this.f54416B;
    }

    public final int getPagePaddingRight() {
        return this.f54418D;
    }

    public final int getPagePaddingTop() {
        return this.f54417C;
    }

    public final int getSelectedPagePosition() {
        return this.f54430y;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        this.f54422q.m56012a(canvas);
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrollStateChanged(int i11) {
        if (i11 == 0) {
            this.f54429x = this.f54430y;
        }
        this.f54428w = i11;
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageScrolled(final int i11, float f11, int i12) {
        int i13;
        int i14;
        final int i15;
        final int i16;
        final C10769c c10769c = this.f54421p;
        final C19053g0 c19053g0 = new C19053g0();
        c19053g0.f94930p = f11;
        int i17 = 1;
        if (this.f54428w != 1 && (i13 = this.f54429x) != (i14 = this.f54430y)) {
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
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.f
                @Override // java.lang.Runnable
                public final void run() {
                    PageBar.m55978A(PageBar.this, c10769c, i15, i16, c19053g0);
                }
            });
        } else {
            if (i11 + 1 >= c10769c.getChildCount()) {
                i17 = 0;
            }
            final int i18 = i11 + i17;
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.e
                @Override // java.lang.Runnable
                public final void run() {
                    PageBar.m56001z(PageBar.this, c10769c, i11, i18, c19053g0);
                }
            });
        }
        int i19 = this.f54428w;
        if (i19 == 0 || i19 == 2) {
            post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.menu.g
                @Override // java.lang.Runnable
                public final void run() {
                    PageBar.m55979B(PageBar.C10769c.this, this, c19053g0);
                }
            });
        }
    }

    @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
    public void onPageSelected(int i11) {
        int i12 = this.f54430y;
        this.f54429x = i12;
        this.f54430y = i11;
        InterfaceC10773g interfaceC10773g = this.f54427v;
        if (interfaceC10773g != null) {
            interfaceC10773g.mo54595a(this.f54421p.m56008c(i12));
        }
        InterfaceC10773g interfaceC10773g2 = this.f54427v;
        if (interfaceC10773g2 != null) {
            interfaceC10773g2.mo54596b(this.f54421p.m56008c(this.f54430y));
        }
    }

    public final void setOnDrawIndicatorListener(InterfaceC10771e interfaceC10771e) {
        this.f54426u = interfaceC10771e;
    }

    public final void setOnInstantiatePageViewListener(InterfaceC10772f interfaceC10772f) {
        AbstractC19074t.m100208f(interfaceC10772f, "listener");
        this.f54425t = interfaceC10772f;
    }

    public final void setOnPageSelectedListener(InterfaceC10773g interfaceC10773g) {
        this.f54427v = interfaceC10773g;
    }

    public final void setPageMargin(int i11) {
        if (this.f54415A != i11) {
            this.f54415A = i11;
            requestLayout();
        }
    }

    public final void setPageMode(int i11) {
        if (this.f54431z != i11) {
            this.f54431z = i11;
            requestLayout();
        }
    }

    public final void setSelectedPagePosition(int i11) {
        ViewPager viewPager;
        ViewPager viewPager2 = this.f54423r;
        if ((viewPager2 == null || viewPager2.getCurrentItem() != i11) && (viewPager = this.f54423r) != null) {
            viewPager.setCurrentItem(i11);
        }
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        AbstractC19074t.m100208f(viewPager, "viewPager");
        ViewPager viewPager2 = this.f54423r;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            viewPager2.removeOnAdapterChangeListener(this);
        }
        viewPager.addOnPageChangeListener(this);
        viewPager.addOnAdapterChangeListener(this);
        this.f54423r = viewPager;
        setPagerAdapter(viewPager.getAdapter());
    }

    /* renamed from: y */
    public final C10774h m56002y(int i11) {
        return this.f54421p.m56008c(i11);
    }
}
