package com.zing.zalo.feed.uicontrols.suggestcomment;

import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.feed.uicontrols.suggestcomment.c */
/* loaded from: classes4.dex */
public final class C8892c extends RecyclerView.AbstractC1892s {

    /* renamed from: a */
    final /* synthetic */ SuggestCommentView f47608a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8892c(SuggestCommentView suggestCommentView) {
        this.f47608a = suggestCommentView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: b */
    public void mo952b(RecyclerView recyclerView, int i11) {
        C8890a c8890a;
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        super.mo952b(recyclerView, i11);
        if (i11 == 0) {
            c8890a = this.f47608a.f47561t;
            c8890a.m10008p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: d */
    public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        super.mo10176d(recyclerView, i11, i12);
        if (i11 != 0) {
            this.f47608a.m47443h();
        }
    }
}
