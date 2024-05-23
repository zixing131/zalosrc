package c20;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: c20.b */
/* loaded from: classes5.dex */
public final class C3212b extends C1929v {

    /* renamed from: f */
    private RecyclerView f13733f;

    /* renamed from: g */
    private RecyclerView.AbstractC1890q f13734g;

    /* renamed from: c20.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1923p {

        /* renamed from: r */
        final /* synthetic */ RecyclerView.AbstractC1888o f13736r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(RecyclerView.AbstractC1888o abstractC1888o, Context context) {
            super(context);
            this.f13736r = abstractC1888o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: o */
        public void mo10243o(View view, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
            int m10623w;
            AbstractC19074t.m100208f(view, "targetView");
            AbstractC19074t.m100208f(c1899z, "state");
            AbstractC19074t.m100208f(aVar, "action");
            int[] mo10398c = C3212b.this.mo10398c(this.f13736r, view);
            if (mo10398c != null && (m10623w = m10623w(Math.max(Math.abs(mo10398c[0]), Math.abs(mo10398c[1])))) > 0) {
                aVar.m10251d(mo10398c[0], mo10398c[1], m10623w, this.f8200j);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            AbstractC19074t.m100208f(displayMetrics, "displayMetrics");
            return 25.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: x */
        public int mo10624x(int i11) {
            return super.mo10624x(i11);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0, androidx.recyclerview.widget.RecyclerView.AbstractC1890q
    /* renamed from: a */
    public boolean mo10175a(int i11, int i12) {
        RecyclerView.AbstractC1890q abstractC1890q = this.f13734g;
        if (abstractC1890q != null && abstractC1890q.mo10175a(i11, i12)) {
            return true;
        }
        return super.mo10175a(i11, i12);
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: b */
    public void mo10397b(RecyclerView recyclerView) {
        super.mo10397b(recyclerView);
        this.f13733f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.C1929v, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: f */
    protected C1923p mo10401f(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        RecyclerView recyclerView = this.f13733f;
        AbstractC19074t.m100205c(recyclerView);
        return new a(abstractC1888o, recyclerView.getContext());
    }

    /* renamed from: t */
    public final void m16327t(int i11) {
        RecyclerView.AbstractC1888o layoutManager;
        RecyclerView recyclerView = this.f13733f;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            RecyclerView.AbstractC1898y mo10400e = mo10400e(layoutManager);
            if (mo10400e != null) {
                mo10400e.m10244p(i11);
            } else {
                mo10400e = null;
            }
            layoutManager.m10090H1(mo10400e);
        }
    }
}
