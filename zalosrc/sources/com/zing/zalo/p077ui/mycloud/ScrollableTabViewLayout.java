package com.zing.zalo.p077ui.mycloud;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.mycloud.ScrollableTabViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Divider;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;

/* loaded from: classes6.dex */
public final class ScrollableTabViewLayout extends LinearLayout {

    /* renamed from: p */
    private RecyclerView f65402p;

    /* renamed from: q */
    private C12503c f65403q;

    /* renamed from: r */
    private View f65404r;

    /* renamed from: s */
    private View f65405s;

    /* renamed from: t */
    private InterfaceC12502b f65406t;

    /* renamed from: u */
    private boolean f65407u;

    /* renamed from: com.zing.zalo.ui.mycloud.ScrollableTabViewLayout$a */
    /* loaded from: classes6.dex */
    public static final class C12501a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private RobotoTextView f65408I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12501a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f65408I = (RobotoTextView) view;
        }

        /* renamed from: i0 */
        public final RobotoTextView m70267i0() {
            return this.f65408I;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.ScrollableTabViewLayout$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12502b {
        /* renamed from: a */
        void mo70203a(int i11, String str);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.ScrollableTabViewLayout$c */
    /* loaded from: classes6.dex */
    public static final class C12503c extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        private final Map f65409r = new LinkedHashMap();

        /* renamed from: s */
        private final List f65410s = new ArrayList();

        /* renamed from: t */
        private int f65411t;

        /* renamed from: u */
        private InterfaceC12502b f65412u;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public static final void m70269O(C12503c c12503c, int i11, View view) {
            AbstractC19074t.m100208f(c12503c, "this$0");
            if (c12503c.f65411t != i11) {
                c12503c.m70275S(i11);
            }
            InterfaceC12502b interfaceC12502b = c12503c.f65412u;
            if (interfaceC12502b != null) {
                interfaceC12502b.mo70203a(i11, (String) c12503c.f65410s.get(i11));
            }
        }

        /* renamed from: M */
        public final List m70270M() {
            return this.f65410s;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public void mo9990A(C12501a c12501a, final int i11) {
            AbstractC19074t.m100208f(c12501a, "holder");
            c12501a.m70267i0().setText((CharSequence) this.f65409r.get(this.f65410s.get(i11)));
            Context context = c12501a.f7784p.getContext();
            if (i11 == this.f65411t) {
                c12501a.m70267i0().setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_oval_tab_item_selected));
                c12501a.m70267i0().setTextColor(C23212s8.m119607o(context, AbstractC16781w.chip_selected_text));
                c12501a.m70267i0().setFontStyle(7);
            } else {
                c12501a.m70267i0().setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_oval_tab_item_normal));
                c12501a.m70267i0().setTextColor(C23212s8.m119607o(context, AbstractC16781w.chip_unselected_text));
                c12501a.m70267i0().setFontStyle(5);
            }
            c12501a.f7784p.setOnClickListener(new View.OnClickListener() { // from class: u80.n2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScrollableTabViewLayout.C12503c.m70269O(ScrollableTabViewLayout.C12503c.this, i11, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public C12501a mo9992C(ViewGroup viewGroup, int i11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
            robotoTextView.setPadding(AbstractC23222t7.f112576o, AbstractC23222t7.f112566j, AbstractC23222t7.f112576o, AbstractC23222t7.f112566j);
            if (Build.VERSION.SDK_INT >= 23) {
                robotoTextView.setTextAppearance(AbstractC2814h.t_normal);
            } else {
                robotoTextView.setTextSize(15.0f);
            }
            robotoTextView.setMinWidth(AbstractC23222t7.f112553c0);
            robotoTextView.setTextAlignment(4);
            return new C12501a(robotoTextView);
        }

        /* renamed from: Q */
        public final void m70273Q(Map map) {
            AbstractC19074t.m100208f(map, "itemList");
            this.f65409r.clear();
            this.f65409r.putAll(map);
            this.f65410s.clear();
            this.f65410s.addAll(map.keySet());
            m10008p();
        }

        /* renamed from: R */
        public final void m70274R(InterfaceC12502b interfaceC12502b) {
            this.f65412u = interfaceC12502b;
        }

        /* renamed from: S */
        public final void m70275S(int i11) {
            if (this.f65411t != i11) {
                this.f65411t = i11;
                m10008p();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f65410s.size();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.ScrollableTabViewLayout$d */
    /* loaded from: classes6.dex */
    public static final class C12504d implements InterfaceC12502b {
        C12504d() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.ScrollableTabViewLayout.InterfaceC12502b
        /* renamed from: a */
        public void mo70203a(int i11, String str) {
            AbstractC19074t.m100208f(str, "tabId");
            InterfaceC12502b listener = ScrollableTabViewLayout.this.getListener();
            if (listener != null) {
                listener.mo70203a(i11, str);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.ScrollableTabViewLayout$e */
    /* loaded from: classes6.dex */
    public static final class C12505e extends RecyclerView.AbstractC1887n {
        C12505e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 == 0) {
                rect.left = AbstractC23222t7.f112586t;
            } else {
                rect.left = AbstractC23222t7.f112566j;
            }
            if (m9817A0 == c1899z.m10253b() - 1) {
                rect.right = AbstractC23222t7.f112586t;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.ScrollableTabViewLayout$f */
    /* loaded from: classes6.dex */
    public static final class C12506f implements FeedRecyclerView.InterfaceC8863b {
        C12506f() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            ScrollableTabViewLayout.this.setAllowSlideBack(false);
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            ScrollableTabViewLayout.this.setAllowSlideBack(true);
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            ScrollableTabViewLayout.this.setAllowSlideBack(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabViewLayout(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65407u = true;
        m70264b();
    }

    /* renamed from: b */
    private final void m70264b() {
        setOrientation(1);
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        C12503c c12503c = new C12503c();
        this.f65403q = c12503c;
        c12503c.m70274R(new C12504d());
        FeedRecyclerView feedRecyclerView = new FeedRecyclerView(getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(feedRecyclerView.getContext(), 0, false);
        int i11 = AbstractC23222t7.f112576o;
        feedRecyclerView.setPadding(0, i11, 0, i11);
        feedRecyclerView.setLayoutManager(linearLayoutManager);
        C12503c c12503c2 = this.f65403q;
        View view = null;
        if (c12503c2 == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12503c2 = null;
        }
        feedRecyclerView.setAdapter(c12503c2);
        feedRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        feedRecyclerView.m9816A(new C12505e());
        feedRecyclerView.setCatchTouchEventListener(new C12506f());
        this.f65402p = feedRecyclerView;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Divider divider = new Divider(context);
        divider.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        divider.m90563c(0, 0, 0, 0);
        divider.setVisibility(8);
        this.f65405s = divider;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        Divider divider2 = new Divider(context2);
        divider2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        divider2.m90563c(0, 0, 0, 0);
        this.f65404r = divider2;
        View view2 = this.f65405s;
        if (view2 == null) {
            AbstractC19074t.m100223u("topDivider");
            view2 = null;
        }
        addView(view2);
        RecyclerView recyclerView = this.f65402p;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("rvTabList");
            recyclerView = null;
        }
        addView(recyclerView);
        View view3 = this.f65404r;
        if (view3 == null) {
            AbstractC19074t.m100223u("bottomDivider");
        } else {
            view = view3;
        }
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m70265d(ScrollableTabViewLayout scrollableTabViewLayout, boolean z11) {
        View view;
        View view2;
        float f11;
        AbstractC19074t.m100208f(scrollableTabViewLayout, "this$0");
        C12503c c12503c = scrollableTabViewLayout.f65403q;
        if (c12503c == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12503c = null;
        }
        int mo10003k = c12503c.mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            RecyclerView recyclerView = scrollableTabViewLayout.f65402p;
            if (recyclerView == null) {
                AbstractC19074t.m100223u("rvTabList");
                recyclerView = null;
            }
            RecyclerView.AbstractC1876c0 m9900t0 = recyclerView.m9900t0(i11);
            if (m9900t0 != null) {
                view = m9900t0.f7784p;
            } else {
                view = null;
            }
            if (view != null) {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.3f;
                }
                view.setAlpha(f11);
            }
            if (m9900t0 != null) {
                view2 = m9900t0.f7784p;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                view2.setClickable(z11);
            }
        }
    }

    /* renamed from: c */
    public final void m70266c(String str) {
        AbstractC19074t.m100208f(str, "tabId");
        C12503c c12503c = this.f65403q;
        C12503c c12503c2 = null;
        if (c12503c == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12503c = null;
        }
        int indexOf = c12503c.m70270M().indexOf(str);
        C12503c c12503c3 = this.f65403q;
        if (c12503c3 == null) {
            AbstractC19074t.m100223u("rvAdapter");
        } else {
            c12503c2 = c12503c3;
        }
        c12503c2.m70275S(indexOf);
    }

    public final boolean getAllowSlideBack() {
        return this.f65407u;
    }

    public final InterfaceC12502b getListener() {
        return this.f65406t;
    }

    public final void setAllowSlideBack(boolean z11) {
        this.f65407u = z11;
    }

    public final void setBottomDividerVisibility(boolean z11) {
        View view = null;
        if (z11) {
            View view2 = this.f65404r;
            if (view2 == null) {
                AbstractC19074t.m100223u("bottomDivider");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            return;
        }
        View view3 = this.f65404r;
        if (view3 == null) {
            AbstractC19074t.m100223u("bottomDivider");
        } else {
            view = view3;
        }
        view.setVisibility(8);
    }

    public final void setEnableTabLayout(final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.l2
            @Override // java.lang.Runnable
            public final void run() {
                ScrollableTabViewLayout.m70265d(ScrollableTabViewLayout.this, z11);
            }
        });
    }

    public final void setListener(InterfaceC12502b interfaceC12502b) {
        this.f65406t = interfaceC12502b;
    }

    public final void setTabList(Map<String, String> map) {
        AbstractC19074t.m100208f(map, "tabList");
        C12503c c12503c = this.f65403q;
        if (c12503c == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12503c = null;
        }
        c12503c.m70273Q(map);
    }

    public final void setTopDividerVisibility(boolean z11) {
        View view = null;
        if (z11) {
            View view2 = this.f65405s;
            if (view2 == null) {
                AbstractC19074t.m100223u("topDivider");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            return;
        }
        View view3 = this.f65405s;
        if (view3 == null) {
            AbstractC19074t.m100223u("topDivider");
        } else {
            view = view3;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f65407u = true;
        m70264b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabViewLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f65407u = true;
        m70264b();
    }
}
