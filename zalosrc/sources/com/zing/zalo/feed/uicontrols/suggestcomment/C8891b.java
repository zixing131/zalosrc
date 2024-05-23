package com.zing.zalo.feed.uicontrols.suggestcomment;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.b */
/* loaded from: classes4.dex */
public final class C8891b extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    final /* synthetic */ SuggestCommentView f47607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8891b(SuggestCommentView suggestCommentView) {
        this.f47607a = suggestCommentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:            if (r2 != 3) goto L32;     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int m118736p;
        int m118736p2;
        C8890a c8890a;
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        super.mo10066g(rect, view, recyclerView, c1899z);
        int i12 = 0;
        if (this.f47607a.getMode() == 10) {
            m118736p = 0;
        } else {
            m118736p = AbstractC23136l9.m118736p(AbstractC16802y.suggest_comment_first_item_margin_left);
        }
        if (this.f47607a.getMode() == 10) {
            m118736p2 = 0;
        } else {
            m118736p2 = AbstractC23136l9.m118736p(AbstractC16802y.suggest_comment_last_item_margin_right);
        }
        int m9817A0 = recyclerView.m9817A0(view);
        c8890a = this.f47607a.f47561t;
        int mo10005m = c8890a.mo10005m(m9817A0);
        if (m9817A0 != 0) {
            if (mo10005m != 1) {
                if (mo10005m != 2) {
                    m118736p = 0;
                } else {
                    m118736p = AbstractC23136l9.m118742r(16.0f) / 2;
                }
            } else {
                m118736p = AbstractC23136l9.m118742r(8.0f) / 2;
            }
        }
        rect.left = m118736p;
        RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i11 = adapter.mo10003k();
        } else {
            i11 = 0;
        }
        if (m9817A0 == i11 - 1) {
            i12 = m118736p2;
        } else {
            if (mo10005m != 1) {
                if (mo10005m == 2) {
                    i12 = AbstractC23136l9.m118742r(16.0f) / 2;
                }
            }
            i12 = AbstractC23136l9.m118742r(8.0f) / 2;
        }
        rect.right = i12;
    }
}
