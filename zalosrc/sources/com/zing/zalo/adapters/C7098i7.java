package com.zing.zalo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.adapters.C7098i7;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p649xl.C29768dc;
import p649xl.C29786ec;
import t00.C26445b;

/* renamed from: com.zing.zalo.adapters.i7 */
/* loaded from: classes3.dex */
public final class C7098i7 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f38799r = new ArrayList();

    /* renamed from: s */
    private View.OnClickListener f38800s;

    /* renamed from: com.zing.zalo.adapters.i7$a */
    /* loaded from: classes3.dex */
    public final class a extends c {

        /* renamed from: I */
        private C29768dc f38801I;

        /* renamed from: J */
        final /* synthetic */ C7098i7 f38802J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(C7098i7 c7098i7, C29768dc c29768dc) {
            super(r2);
            AbstractC19074t.m100208f(c29768dc, "binding");
            this.f38802J = c7098i7;
            LinearLayout root = c29768dc.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f38801I = c29768dc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m36184k0(C7098i7 c7098i7, View view) {
            AbstractC19074t.m100208f(c7098i7, "this$0");
            View.OnClickListener m36178L = c7098i7.m36178L();
            if (m36178L != null) {
                m36178L.onClick(view);
            }
        }

        @Override // com.zing.zalo.adapters.C7098i7.c
        /* renamed from: i0 */
        public void mo36185i0(C26445b c26445b) {
            AbstractC19074t.m100208f(c26445b, "securityItem");
            this.f38801I.f137572s.setText(c26445b.m136324b());
            this.f38801I.f137571r.setText(c26445b.m136323a());
            RecyclingImageView recyclingImageView = this.f38801I.f137570q;
            final C7098i7 c7098i7 = this.f38802J;
            recyclingImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.h7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7098i7.a.m36184k0(C7098i7.this, view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.adapters.i7$b */
    /* loaded from: classes3.dex */
    public static final class b extends c {

        /* renamed from: I */
        private C29786ec f38803I;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(C29786ec c29786ec) {
            super(r0);
            AbstractC19074t.m100208f(c29786ec, "binding");
            LinearLayout root = c29786ec.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f38803I = c29786ec;
        }

        @Override // com.zing.zalo.adapters.C7098i7.c
        /* renamed from: i0 */
        public void mo36185i0(C26445b c26445b) {
            AbstractC19074t.m100208f(c26445b, "securityItem");
            this.f38803I.f137689q.setText(c26445b.m136324b());
        }
    }

    /* renamed from: com.zing.zalo.adapters.i7$c */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public abstract void mo36185i0(C26445b c26445b);
    }

    /* renamed from: L */
    public final View.OnClickListener m36178L() {
        return this.f38800s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        cVar.mo36185i0((C26445b) this.f38799r.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 2) {
            C29768dc m147863c = C29768dc.m147863c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            AbstractC19074t.m100207e(m147863c, "inflate(...)");
            return new a(this, m147863c);
        }
        C29786ec m147907c = C29786ec.m147907c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m147907c, "inflate(...)");
        return new b(m147907c);
    }

    /* renamed from: O */
    public final void m36181O(List list) {
        AbstractC19074t.m100208f(list, "<set-?>");
        this.f38799r = list;
    }

    /* renamed from: P */
    public final void m36182P(View.OnClickListener onClickListener) {
        this.f38800s = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38799r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C26445b) this.f38799r.get(i11)).m136325c();
    }
}
