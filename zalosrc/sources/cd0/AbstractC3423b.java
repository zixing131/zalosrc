package cd0;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.p077ui.widget.StoryBarItemImageView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import i40.AbstractC20279i;
import is.C20830x0;
import l30.AbstractC22055v0;
import l30.C22013a0;
import p354n3.C23528a;
import p716zh.C31980jc;

/* renamed from: cd0.b */
/* loaded from: classes4.dex */
public abstract class AbstractC3423b extends StoryDetailsView.AbstractC15101b0 {

    /* renamed from: a */
    protected C23528a f14364a;

    /* renamed from: b */
    protected View f14365b;

    /* renamed from: c */
    protected LinearLayoutManager f14366c;

    /* renamed from: d */
    protected RecyclerView f14367d;

    /* renamed from: e */
    protected Point f14368e;

    /* renamed from: f */
    AbstractC20279i.a f14369f;

    /* renamed from: g */
    protected Context f14370g;

    /* renamed from: h */
    protected AbstractC7220t8 f14371h;

    /* renamed from: i */
    protected int f14372i;

    /* renamed from: j */
    protected AbstractC22055v0.j f14373j;

    /* renamed from: k */
    protected StoryBarItemImageView f14374k;

    /* renamed from: cd0.b$a */
    /* loaded from: classes4.dex */
    class a extends RecyclerView.AbstractC1892s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            AbstractC3423b.this.mo17186k(i11);
        }
    }

    public AbstractC3423b(View view, AbstractC7220t8 abstractC7220t8) {
        this.f14365b = view;
        Context context = view.getContext();
        this.f14370g = context;
        this.f14364a = new C23528a(context);
        this.f14371h = abstractC7220t8;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(AbstractC6918a0.rv_story_bar);
        this.f14367d = recyclerView;
        recyclerView.setOverScrollMode(0);
        C1914g c1914g = new C1914g();
        c1914g.m10694V(false);
        this.f14367d.setItemAnimator(c1914g);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f14370g, 0, false);
        this.f14366c = linearLayoutManager;
        this.f14367d.setLayoutManager(linearLayoutManager);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: cd0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                AbstractC3423b.this.m17179j(view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        this.f14367d.m9826E(new a());
        if (abstractC7220t8 != null) {
            abstractC7220t8.mo36733a(C20830x0.f102390a.m108863f() > 0 || C22013a0.m114929i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m17179j(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i11 != 0 || i12 != 0 || i13 != 0 || i14 != 0) {
            mo17191p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: a */
    public AbstractC20279i.a mo17180a(C31980jc c31980jc) {
        m17190o(this.f14372i);
        return this.f14369f;
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: b */
    public void mo17181b(boolean z11) {
        View view;
        AbstractC20279i.a mo17180a = mo17180a(null);
        if (mo17180a != null && (view = mo17180a.f100222a) != null) {
            view.setVisibility(0);
        }
        if (!z11 && this.f14373j != null) {
            this.f14369f = null;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: c */
    public void mo17182c(boolean z11) {
        View view;
        AbstractC20279i.a mo17180a = mo17180a(null);
        if (mo17180a != null && (view = mo17180a.f100222a) != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: d */
    public void mo17183d(boolean z11) {
        StoryBarItemImageView storyBarItemImageView;
        if (z11 && (storyBarItemImageView = this.f14374k) != null) {
            storyBarItemImageView.setShouldDrawOutLine(false);
        }
    }

    /* renamed from: h */
    public void m17184h() {
        this.f14369f = null;
        AbstractC22055v0.j jVar = this.f14373j;
        if (jVar != null) {
            if (jVar.getThumbView() != null) {
                this.f14373j.getThumbView().setVisibility(0);
            }
            this.f14373j = null;
        }
        this.f14374k = null;
    }

    /* renamed from: i */
    public Point m17185i() {
        if (this.f14368e != null) {
            return new Point(this.f14368e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void mo17186k(int i11) {
        if (i11 == 0) {
            mo17187l();
        }
    }

    /* renamed from: l */
    public void mo17187l() {
    }

    /* renamed from: m */
    public void m17188m(int i11) {
        RecyclerView recyclerView = this.f14367d;
        if (recyclerView != null) {
            recyclerView.m9837K1(i11);
        }
    }

    /* renamed from: n */
    public void m17189n(int i11) {
        RecyclerView recyclerView = this.f14367d;
        if (recyclerView != null) {
            recyclerView.mo9854S1(i11);
        }
    }

    /* renamed from: o */
    public void m17190o(int i11) {
        m17184h();
        if (!this.f14367d.m9838L0()) {
            this.f14372i = i11;
            Object m9900t0 = this.f14367d.m9900t0(i11);
            if (m9900t0 instanceof AbstractC22055v0.j) {
                this.f14373j = (AbstractC22055v0.j) m9900t0;
            }
        }
        AbstractC22055v0.j jVar = this.f14373j;
        if (jVar != null) {
            View thumbView = jVar.getThumbView();
            if (thumbView != null) {
                this.f14369f = AbstractC20279i.m105893a(thumbView);
            } else {
                this.f14369f = AbstractC20279i.m105894b(this.f14373j.getThumbModule());
            }
            AbstractC20279i.a aVar = this.f14369f;
            if (aVar != null) {
                aVar.f100235n = this.f14373j.getThumbRoundCorner();
            }
            if (thumbView instanceof StoryBarItemImageView) {
                this.f14374k = (StoryBarItemImageView) thumbView;
                return;
            }
            return;
        }
        this.f14369f = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void mo17191p() {
    }
}
