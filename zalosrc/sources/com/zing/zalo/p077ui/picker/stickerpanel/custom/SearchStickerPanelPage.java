package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.C1761c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7273y6;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.util.List;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p716zh.C31887d9;

/* loaded from: classes6.dex */
public final class SearchStickerPanelPage extends RecyclerView implements InterfaceC12966p {
    public static final C12936b Companion = new C12936b(null);

    /* renamed from: V0 */
    private C7273y6 f67030V0;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.SearchStickerPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12935a extends RecyclerView.AbstractC1887n {
        C12935a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int m104529e;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            m104529e = AbstractC20104d.m104529e(AbstractC23136l9.m118742r(6.0f));
            rect.set(m104529e, m104529e, m104529e, m104529e);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.SearchStickerPanelPage$b */
    /* loaded from: classes6.dex */
    public static final class C12936b {
        private C12936b() {
        }

        public /* synthetic */ C12936b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SearchStickerPanelPage(Context context) {
        super(context);
        AbstractC19074t.m100205c(context);
        setLayoutManager(new GridLayoutManager(context, 2));
        setOverScrollMode(2);
        m9816A(new C12935a());
    }

    /* renamed from: a2 */
    public final void m72833a2(List list, C31887d9 c31887d9) {
        AbstractC19074t.m100208f(list, "keywords");
        C7273y6 c7273y6 = this.f67030V0;
        if (c7273y6 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7273y6 = null;
        }
        c7273y6.m37040N(list, c31887d9);
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        C7273y6 c7273y6 = this.f67030V0;
        if (c7273y6 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7273y6 = null;
        }
        c7273y6.m10008p();
    }

    public Integer getPageId() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchStickerPanelPage(Context context, C23528a c23528a, C1761c0 c1761c0) {
        this(context);
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c1761c0, "searchKwdSelectLiveData");
        C7273y6 c7273y6 = new C7273y6(c23528a, c1761c0);
        this.f67030V0 = c7273y6;
        setAdapter(c7273y6);
    }
}
