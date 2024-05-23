package com.zing.zalo.p077ui.mediastore.search;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ci.C3518o;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.adapters.C7016b4;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public final class MediaStoreQuickSearchListView extends LinearLayout {

    /* renamed from: p */
    private FeedRecyclerView f64460p;

    /* renamed from: q */
    private C7016b4 f64461q;

    /* renamed from: r */
    private final int f64462r;

    /* renamed from: s */
    private final int f64463s;

    /* renamed from: t */
    private InterfaceC12387a f64464t;

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreQuickSearchListView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12387a {
        /* renamed from: a */
        void mo69247a(boolean z11);

        /* renamed from: b */
        void mo69248b(C3518o c3518o);
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreQuickSearchListView$b */
    /* loaded from: classes6.dex */
    public static final class C12388b implements C7016b4.b {
        C12388b() {
        }

        @Override // com.zing.zalo.adapters.C7016b4.b
        /* renamed from: a */
        public void mo35871a(C3518o c3518o) {
            AbstractC19074t.m100208f(c3518o, "item");
            InterfaceC12387a interfaceC12387a = MediaStoreQuickSearchListView.this.f64464t;
            if (interfaceC12387a != null) {
                interfaceC12387a.mo69248b(c3518o);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreQuickSearchListView$c */
    /* loaded from: classes6.dex */
    public static final class C12389c extends RecyclerView.AbstractC1887n {
        C12389c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            if (recyclerView.m9817A0(view) == 0) {
                rect.left = MediaStoreQuickSearchListView.this.f64462r;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreQuickSearchListView$d */
    /* loaded from: classes6.dex */
    public static final class C12390d implements FeedRecyclerView.InterfaceC8863b {
        C12390d() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            InterfaceC12387a interfaceC12387a = MediaStoreQuickSearchListView.this.f64464t;
            if (interfaceC12387a != null) {
                interfaceC12387a.mo69247a(false);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            InterfaceC12387a interfaceC12387a = MediaStoreQuickSearchListView.this.f64464t;
            if (interfaceC12387a != null) {
                interfaceC12387a.mo69247a(true);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            InterfaceC12387a interfaceC12387a = MediaStoreQuickSearchListView.this.f64464t;
            if (interfaceC12387a != null) {
                interfaceC12387a.mo69247a(true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreQuickSearchListView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f64462r = AbstractC23136l9.m118742r(16.0f);
        this.f64463s = AbstractC23136l9.m118742r(12.0f);
        m69630c();
    }

    /* renamed from: c */
    private final void m69630c() {
        setOrientation(1);
        C7016b4 c7016b4 = new C7016b4();
        this.f64461q = c7016b4;
        c7016b4.m35869R(new C12388b());
        FeedRecyclerView feedRecyclerView = new FeedRecyclerView(getContext());
        feedRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        feedRecyclerView.setLayoutManager(new LinearLayoutManager(feedRecyclerView.getContext(), 0, false));
        C7016b4 c7016b42 = this.f64461q;
        FeedRecyclerView feedRecyclerView2 = null;
        if (c7016b42 == null) {
            AbstractC19074t.m100223u("mListAdapter");
            c7016b42 = null;
        }
        feedRecyclerView.setAdapter(c7016b42);
        feedRecyclerView.m9816A(new C12389c());
        int i11 = this.f64463s;
        feedRecyclerView.setPadding(0, i11, 0, i11);
        feedRecyclerView.setCatchTouchEventListener(new C12390d());
        this.f64460p = feedRecyclerView;
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC23136l9.m118655I(AbstractC16802y.media_store_horizontal_album_list_bottom_divider_height)));
        view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.SecondaryBackgroundColor));
        FeedRecyclerView feedRecyclerView3 = this.f64460p;
        if (feedRecyclerView3 == null) {
            AbstractC19074t.m100223u("mRvList");
        } else {
            feedRecyclerView2 = feedRecyclerView3;
        }
        addView(feedRecyclerView2);
        addView(view);
    }

    /* renamed from: d */
    public final void m69631d(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "list");
        C7016b4 c7016b4 = this.f64461q;
        C7016b4 c7016b42 = null;
        if (c7016b4 == null) {
            AbstractC19074t.m100223u("mListAdapter");
            c7016b4 = null;
        }
        c7016b4.m35868Q(z11);
        C7016b4 c7016b43 = this.f64461q;
        if (c7016b43 == null) {
            AbstractC19074t.m100223u("mListAdapter");
        } else {
            c7016b42 = c7016b43;
        }
        c7016b42.m35867P(list);
    }

    public final void setEnable(boolean z11) {
        C7016b4 c7016b4 = this.f64461q;
        if (c7016b4 == null) {
            AbstractC19074t.m100223u("mListAdapter");
            c7016b4 = null;
        }
        c7016b4.m35868Q(z11);
    }

    public final void setQuickSearchItemEventListener(InterfaceC12387a interfaceC12387a) {
        AbstractC19074t.m100208f(interfaceC12387a, "listener");
        this.f64464t = interfaceC12387a;
    }
}
