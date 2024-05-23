package com.zing.zalo.feed.reactions.bottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.feed.reactions.bottomsheet.C8840a;
import com.zing.zalo.feed.reactions.bottomsheet.bts_item.p064ui.FeedReactionHeader;
import com.zing.zalo.feed.reactions.bottomsheet.bts_item.p064ui.FeedReactionRow;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p556ur.C27360c;
import p584vr.C28608e;
import p584vr.InterfaceC28604a;
import p619wr.C29194a;
import p619wr.C29196c;
import p619wr.C29197d;
import p619wr.C29198e;
import p619wr.InterfaceC29195b;
import p649xl.C29742c4;
import p649xl.C29760d4;
import p649xl.C29975p3;
import qm0.AbstractC25332a0;

/* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a */
/* loaded from: classes4.dex */
public final class C8840a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f47215r = new ArrayList();

    /* renamed from: s */
    private c f47216s;

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {
        public static final C32710a Companion = new C32710a(null);

        /* renamed from: I */
        private final C29975p3 f47217I;

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$a$a */
        /* loaded from: classes4.dex */
        public static final class C32710a {
            private C32710a() {
            }

            public /* synthetic */ C32710a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final a m47191a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29975p3 m148354c = C29975p3.m148354c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148354c, "inflate(...)");
                return new a(m148354c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29975p3 c29975p3) {
            super(c29975p3.getRoot());
            AbstractC19074t.m100208f(c29975p3, "binding");
            this.f47217I = c29975p3;
        }

        /* renamed from: k0 */
        public static final void m47189k0(c cVar, View view) {
            if (cVar != null) {
                cVar.mo47168a(C28608e.f132633a);
            }
        }

        /* renamed from: j0 */
        public final void m47190j0(c cVar) {
            this.f47217I.f138940r.setOnClickListener(new View.OnClickListener() { // from class: ur.a
                public /* synthetic */ ViewOnClickListenerC27358a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8840a.a.m47189k0(C8840a.c.this, view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C29742c4 f47218I;

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m47195a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29742c4 m147800c = C29742c4.m147800c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m147800c, "inflate(...)");
                return new b(m147800c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29742c4 c29742c4) {
            super(c29742c4.getRoot());
            AbstractC19074t.m100208f(c29742c4, "binding");
            this.f47218I = c29742c4;
        }

        /* renamed from: k0 */
        public static final void m47193k0(c cVar, View view) {
            if (cVar != null) {
                cVar.mo47168a(C28608e.f132633a);
            }
        }

        /* renamed from: j0 */
        public final void m47194j0(c cVar, C29196c c29196c) {
            AbstractC19074t.m100208f(c29196c, "errorData");
            this.f47218I.f137392q.f137853r.setText(c29196c.m145761a());
            this.f47218I.f137392q.f137852q.setOnClickListener(new View.OnClickListener() { // from class: ur.b
                public /* synthetic */ ViewOnClickListenerC27359b() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8840a.b.m47193k0(C8840a.c.this, view);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo47168a(InterfaceC28604a interfaceC28604a);
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final FeedReactionHeader f47219I;

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m47197a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new d(new FeedReactionHeader(context, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FeedReactionHeader feedReactionHeader) {
            super(feedReactionHeader);
            AbstractC19074t.m100208f(feedReactionHeader, "contentView");
            this.f47219I = feedReactionHeader;
        }

        /* renamed from: i0 */
        public final void m47196i0(InterfaceC29195b interfaceC29195b) {
            if (interfaceC29195b instanceof C29197d) {
                this.f47219I.m47211V(((C29197d) interfaceC29195b).m145762a());
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C29760d4 f47220I;

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$e$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m47199a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29760d4 m147842c = C29760d4.m147842c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m147842c, "inflate(...)");
                return new e(m147842c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C29760d4 c29760d4) {
            super(c29760d4.getRoot());
            AbstractC19074t.m100208f(c29760d4, "binding");
            this.f47220I = c29760d4;
        }

        /* renamed from: i0 */
        public final void m47198i0() {
            this.f47220I.f137488q.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final FeedReactionRow f47221I;

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.a$f$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final f m47201a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new f(new FeedReactionRow(context, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FeedReactionRow feedReactionRow) {
            super(feedReactionRow);
            AbstractC19074t.m100208f(feedReactionRow, "contentView");
            this.f47221I = feedReactionRow;
        }

        /* renamed from: i0 */
        public final void m47200i0(int i11, InterfaceC29195b interfaceC29195b, c cVar) {
            if (interfaceC29195b != null && (interfaceC29195b instanceof C29198e)) {
                this.f47221I.m47219r(i11, (C29198e) interfaceC29195b, cVar);
            }
        }
    }

    /* renamed from: R */
    public static /* synthetic */ void m47177R(C8840a c8840a, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        c8840a.m47184Q(z11, str);
    }

    /* renamed from: U */
    public static /* synthetic */ void m47178U(C8840a c8840a, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        c8840a.m47186T(z11, str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        Object m131207g0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        m131207g0 = AbstractC25332a0.m131207g0(this.f47215r, i11);
        C27360c c27360c = (C27360c) m131207g0;
        InterfaceC29195b interfaceC29195b = null;
        if (abstractC1876c0 instanceof d) {
            d dVar = (d) abstractC1876c0;
            if (c27360c != null) {
                interfaceC29195b = c27360c.m140157a();
            }
            AbstractC19074t.m100206d(interfaceC29195b, "null cannot be cast to non-null type com.zing.zalo.feed.reactions.bottomsheet.bts_item.data.FeedReactionHeaderData");
            dVar.m47196i0((C29197d) interfaceC29195b);
            return;
        }
        if (abstractC1876c0 instanceof f) {
            f fVar = (f) abstractC1876c0;
            if (c27360c != null) {
                interfaceC29195b = c27360c.m140157a();
            }
            AbstractC19074t.m100206d(interfaceC29195b, "null cannot be cast to non-null type com.zing.zalo.feed.reactions.bottomsheet.bts_item.data.FeedReactionViewerData");
            fVar.m47200i0(i11, (C29198e) interfaceC29195b, this.f47216s);
            return;
        }
        if (abstractC1876c0 instanceof e) {
            ((e) abstractC1876c0).m47198i0();
            return;
        }
        if (abstractC1876c0 instanceof b) {
            b bVar = (b) abstractC1876c0;
            c cVar = this.f47216s;
            if (c27360c != null) {
                interfaceC29195b = c27360c.m140157a();
            }
            AbstractC19074t.m100206d(interfaceC29195b, "null cannot be cast to non-null type com.zing.zalo.feed.reactions.bottomsheet.bts_item.data.FeedReactionErrorData");
            bVar.m47194j0(cVar, (C29196c) interfaceC29195b);
            return;
        }
        if (abstractC1876c0 instanceof a) {
            ((a) abstractC1876c0).m47190j0(this.f47216s);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return a.Companion.m47191a(viewGroup);
                        }
                        throw new ClassCastException("FeedReactionAdapter Unknown view type: " + i11);
                    }
                    return b.Companion.m47195a(viewGroup);
                }
                return e.Companion.m47199a(viewGroup);
            }
            return f.Companion.m47201a(viewGroup);
        }
        return d.Companion.m47197a(viewGroup);
    }

    /* renamed from: L */
    public final void m47179L() {
        int size = this.f47215r.size();
        this.f47215r.clear();
        m10016x(0, size);
    }

    /* renamed from: M */
    public final List m47180M() {
        return this.f47215r;
    }

    /* renamed from: N */
    public final void m47181N(List list) {
        List m131187O0;
        AbstractC19074t.m100208f(list, "items");
        m131187O0 = AbstractC25332a0.m131187O0(list);
        this.f47215r = m131187O0;
    }

    /* renamed from: O */
    public final void m47182O(c cVar) {
        this.f47216s = cVar;
    }

    /* renamed from: P */
    public final void m47183P(boolean z11) {
        m47177R(this, z11, null, 2, null);
    }

    /* renamed from: Q */
    public final void m47184Q(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "exceptionText");
        try {
            if (z11) {
                this.f47215r.add(new C27360c(4, new C29196c(str)));
                m10011s(this.f47215r.size() - 1);
            } else if (!this.f47215r.isEmpty()) {
                List list = this.f47215r;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((C27360c) listIterator.previous()).m140158b() == 4) {
                        listIterator.remove();
                        m10017y(listIterator.previousIndex() + 1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public final void m47185S(boolean z11) {
        m47178U(this, z11, null, 2, null);
    }

    /* renamed from: T */
    public final void m47186T(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "exceptionText");
        try {
            if (z11) {
                this.f47215r.add(new C27360c(3, new C29196c(str)));
                m10011s(this.f47215r.size() - 1);
            } else if (!this.f47215r.isEmpty()) {
                List list = this.f47215r;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((C27360c) listIterator.previous()).m140158b() == 3) {
                        listIterator.remove();
                        m10017y(listIterator.previousIndex() + 1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public final void m47187V(boolean z11) {
        try {
            if (z11) {
                this.f47215r.add(new C27360c(2, new C29194a()));
                m10011s(this.f47215r.size() - 1);
            } else if (!this.f47215r.isEmpty()) {
                List list = this.f47215r;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((C27360c) listIterator.previous()).m140158b() == 2) {
                        listIterator.remove();
                        m10017y(listIterator.previousIndex() + 1);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f47215r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object m131207g0;
        m131207g0 = AbstractC25332a0.m131207g0(this.f47215r, i11);
        C27360c c27360c = (C27360c) m131207g0;
        if (c27360c == null) {
            return 3;
        }
        return c27360c.m140158b();
    }
}
