package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1906a0 extends RecyclerView.AbstractC1890q {

    /* renamed from: a */
    RecyclerView f7950a;

    /* renamed from: b */
    private Scroller f7951b;

    /* renamed from: c */
    private final RecyclerView.AbstractC1892s f7952c = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a0$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        boolean f7953a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0 && this.f7953a) {
                this.f7953a = false;
                AbstractC1906a0.this.m10404l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            if (i11 == 0 && i12 == 0) {
                return;
            }
            this.f7953a = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.a0$b */
    /* loaded from: classes2.dex */
    public class b extends C1923p {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: o */
        public void mo10243o(View view, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
            AbstractC1906a0 abstractC1906a0 = AbstractC1906a0.this;
            RecyclerView recyclerView = abstractC1906a0.f7950a;
            if (recyclerView == null) {
                return;
            }
            int[] mo10398c = abstractC1906a0.mo10398c(recyclerView.getLayoutManager(), view);
            int i11 = mo10398c[0];
            int i12 = mo10398c[1];
            int m10623w = m10623w(Math.max(Math.abs(i11), Math.abs(i12)));
            if (m10623w > 0) {
                aVar.m10251d(i11, i12, m10623w, this.f8200j);
            }
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* renamed from: g */
    private void m10394g() {
        this.f7950a.m9821B1(this.f7952c);
        this.f7950a.setOnFlingListener(null);
    }

    /* renamed from: j */
    private void m10395j() {
        if (this.f7950a.getOnFlingListener() == null) {
            this.f7950a.m9826E(this.f7952c);
            this.f7950a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m10396k(RecyclerView.AbstractC1888o abstractC1888o, int i11, int i12) {
        RecyclerView.AbstractC1898y mo10400e;
        int mo10403i;
        if (!(abstractC1888o instanceof RecyclerView.AbstractC1898y.b) || (mo10400e = mo10400e(abstractC1888o)) == null || (mo10403i = mo10403i(abstractC1888o, i11, i12)) == -1) {
            return false;
        }
        mo10400e.m10244p(mo10403i);
        abstractC1888o.m10090H1(mo10400e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
    /* renamed from: a */
    public boolean mo10175a(int i11, int i12) {
        RecyclerView.AbstractC1888o layoutManager = this.f7950a.getLayoutManager();
        if (layoutManager == null || this.f7950a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f7950a.getMinFlingVelocity();
        if ((Math.abs(i12) <= minFlingVelocity && Math.abs(i11) <= minFlingVelocity) || !m10396k(layoutManager, i11, i12)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo10397b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7950a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m10394g();
        }
        this.f7950a = recyclerView;
        if (recyclerView != null) {
            m10395j();
            this.f7951b = new Scroller(this.f7950a.getContext(), new DecelerateInterpolator());
            m10404l();
        }
    }

    /* renamed from: c */
    public abstract int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view);

    /* renamed from: d */
    public int[] m10399d(int i11, int i12) {
        this.f7951b.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f7951b.getFinalX(), this.f7951b.getFinalY()};
    }

    /* renamed from: e */
    public RecyclerView.AbstractC1898y mo10400e(RecyclerView.AbstractC1888o abstractC1888o) {
        return mo10401f(abstractC1888o);
    }

    /* renamed from: f */
    protected C1923p mo10401f(RecyclerView.AbstractC1888o abstractC1888o) {
        if (!(abstractC1888o instanceof RecyclerView.AbstractC1898y.b)) {
            return null;
        }
        return new b(this.f7950a.getContext());
    }

    /* renamed from: h */
    public abstract View mo10402h(RecyclerView.AbstractC1888o abstractC1888o);

    /* renamed from: i */
    public abstract int mo10403i(RecyclerView.AbstractC1888o abstractC1888o, int i11, int i12);

    /* renamed from: l */
    void m10404l() {
        RecyclerView.AbstractC1888o layoutManager;
        View mo10402h;
        RecyclerView recyclerView = this.f7950a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo10402h = mo10402h(layoutManager)) == null) {
            return;
        }
        int[] mo10398c = mo10398c(layoutManager, mo10402h);
        int i11 = mo10398c[0];
        if (i11 != 0 || mo10398c[1] != 0) {
            this.f7950a.m9845O1(i11, mo10398c[1]);
        }
    }
}
