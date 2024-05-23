package p491rq;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: rq.e */
/* loaded from: classes4.dex */
public class C25957e extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    int f123875a = 0;

    /* renamed from: b */
    int f123876b = 0;

    /* renamed from: c */
    int f123877c = 0;

    /* renamed from: d */
    int f123878d = 0;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int i11;
        int i12;
        int i13;
        super.mo10066g(rect, view, recyclerView, c1899z);
        int m9817A0 = recyclerView.m9817A0(view);
        if (recyclerView.getAdapter() != null) {
            i11 = recyclerView.getAdapter().mo10003k();
        } else {
            i11 = 0;
        }
        if (m9817A0 == 0) {
            i12 = this.f123877c;
        } else {
            i12 = this.f123875a;
        }
        rect.left = i12;
        if (m9817A0 == i11 - 1) {
            i13 = this.f123878d;
        } else {
            i13 = this.f123876b;
        }
        rect.right = i13;
    }

    /* renamed from: l */
    public void m133726l(int i11) {
        this.f123875a = i11;
    }

    /* renamed from: m */
    public void m133727m(int i11) {
        this.f123877c = i11;
    }

    /* renamed from: n */
    public void m133728n(int i11) {
        this.f123878d = i11;
    }
}
