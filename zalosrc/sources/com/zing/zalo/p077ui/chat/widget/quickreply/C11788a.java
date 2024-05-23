package com.zing.zalo.p077ui.chat.widget.quickreply;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.chat.widget.quickreply.C11788a;
import dj.C17988o1;
import dj.C17991p1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p649xl.C29892ka;

/* renamed from: com.zing.zalo.ui.chat.widget.quickreply.a */
/* loaded from: classes5.dex */
public final class C11788a extends RecyclerView.AbstractC1880g {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private C17988o1 f61327r;

    /* renamed from: s */
    private a f61328s;

    /* renamed from: com.zing.zalo.ui.chat.widget.quickreply.a$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo65581a(C17991p1 c17991p1);
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.quickreply.a$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.quickreply.a$c */
    /* loaded from: classes5.dex */
    public final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C29892ka f61329I;

        /* renamed from: J */
        final /* synthetic */ C11788a f61330J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C11788a c11788a, C29892ka c29892ka) {
            super(c29892ka.getRoot());
            AbstractC19074t.m100208f(c29892ka, "binding");
            this.f61330J = c11788a;
            this.f61329I = c29892ka;
        }

        /* renamed from: i0 */
        public final C29892ka m65589i0() {
            return this.f61329I;
        }
    }

    public C11788a(C17988o1 c17988o1) {
        AbstractC19074t.m100208f(c17988o1, "quickReplySuggestion");
        this.f61327r = c17988o1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m65583O(C11788a c11788a, int i11, View view) {
        AbstractC19074t.m100208f(c11788a, "this$0");
        a aVar = c11788a.f61328s;
        if (aVar != null) {
            Object obj = c11788a.f61327r.m95661b().get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            aVar.mo65581a((C17991p1) obj);
        }
    }

    /* renamed from: M */
    public final C17988o1 m65584M() {
        return this.f61327r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, final int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        String m95674c = ((C17991p1) this.f61327r.m95661b().get(i11)).m95674c();
        if (m95674c.length() > 60) {
            String substring = m95674c.substring(0, 59);
            AbstractC19074t.m100207e(substring, "substring(...)");
            m95674c = substring + "...";
        }
        cVar.m65589i0().f138487r.setText(m95674c);
        cVar.m65589i0().f138486q.setOnClickListener(new View.OnClickListener() { // from class: q60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11788a.m65583O(C11788a.this, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        C29892ka m148168c = C29892ka.m148168c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148168c, "inflate(...)");
        return new c(this, m148168c);
    }

    /* renamed from: Q */
    public final void m65587Q(a aVar) {
        this.f61328s = aVar;
    }

    /* renamed from: R */
    public final void m65588R(C17988o1 c17988o1) {
        AbstractC19074t.m100208f(c17988o1, "<set-?>");
        this.f61327r = c17988o1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return Math.min(this.f61327r.m95661b().size(), 5);
    }
}
