package c20;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C1923p;
import androidx.recyclerview.widget.C1924q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;

/* renamed from: c20.a */
/* loaded from: classes5.dex */
public final class C3211a extends C1924q {

    /* renamed from: f */
    private RecyclerView f13730f;

    /* renamed from: c20.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1923p {

        /* renamed from: r */
        final /* synthetic */ RecyclerView.AbstractC1888o f13732r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(RecyclerView.AbstractC1888o abstractC1888o, Context context) {
            super(context);
            this.f13732r = abstractC1888o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: o */
        public void mo10243o(View view, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
            int m10623w;
            AbstractC19074t.m100208f(view, "targetView");
            AbstractC19074t.m100208f(c1899z, "state");
            AbstractC19074t.m100208f(aVar, "action");
            int[] mo10398c = C3211a.this.mo10398c(this.f13732r, view);
            if (mo10398c != null && (m10623w = m10623w(Math.abs(mo10398c[0]))) > 0) {
                aVar.m10251d(mo10398c[0], mo10398c[1], m10623w, this.f8200j);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            AbstractC19074t.m100208f(displayMetrics, "displayMetrics");
            return 75.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: x */
        public int mo10624x(int i11) {
            return Math.min(200, super.mo10624x(i11));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: b */
    public void mo10397b(RecyclerView recyclerView) {
        super.mo10397b(recyclerView);
        this.f13730f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.C1924q, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: c */
    public int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view) {
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        AbstractC19074t.m100208f(view, "targetView");
        if (abstractC1888o.m10127i() != 0 && (abstractC1888o instanceof LinearLayoutManager)) {
            return new int[]{view.getLeft() - ((((LinearLayoutManager) abstractC1888o).getWidth() - view.getWidth()) / 2)};
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: e */
    public RecyclerView.AbstractC1898y mo10400e(RecyclerView.AbstractC1888o abstractC1888o) {
        Context context;
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        RecyclerView recyclerView = this.f13730f;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        return new a(abstractC1888o, context);
    }

    @Override // androidx.recyclerview.widget.C1924q, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: h */
    public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
        LinearLayoutManager linearLayoutManager;
        int m9740Y1;
        int m9745c2;
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        View view = null;
        if (abstractC1888o.m10127i() != 0 && (abstractC1888o instanceof LinearLayoutManager) && (m9740Y1 = (linearLayoutManager = (LinearLayoutManager) abstractC1888o).m9740Y1()) <= (m9745c2 = linearLayoutManager.m9745c2())) {
            int i11 = Integer.MAX_VALUE;
            while (true) {
                View mo9732P = abstractC1888o.mo9732P(m9740Y1);
                if (mo9732P != null) {
                    int[] mo10398c = mo10398c(abstractC1888o, mo9732P);
                    AbstractC19074t.m100205c(mo10398c);
                    int abs = Math.abs(mo10398c[0]);
                    if (abs < i11) {
                        view = mo9732P;
                        i11 = abs;
                    }
                }
                if (m9740Y1 == m9745c2) {
                    break;
                }
                m9740Y1++;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.C1924q, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: i */
    public int mo10403i(RecyclerView.AbstractC1888o abstractC1888o, int i11, int i12) {
        int m10112b;
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        View mo10402h = mo10402h(abstractC1888o);
        if (mo10402h == null || (m10112b = abstractC1888o.m10112b(mo10402h)) == -1) {
            return -1;
        }
        if (i11 == 0) {
            return m10112b;
        }
        if (i11 > 0) {
            if (AbstractC26112n.m134422s(mo10402h) > abstractC1888o.getWidth() / 2) {
                return m10112b;
            }
            return m10112b + 1;
        }
        if (AbstractC26112n.m134422s(mo10402h) < abstractC1888o.getWidth() / 2) {
            return m10112b;
        }
        return m10112b - 1;
    }

    /* renamed from: s */
    public final void m16326s(int i11) {
        RecyclerView.AbstractC1888o layoutManager;
        RecyclerView recyclerView = this.f13730f;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            RecyclerView.AbstractC1898y mo10400e = mo10400e(layoutManager);
            mo10400e.m10244p(i11);
            layoutManager.m10090H1(mo10400e);
        }
    }
}
