package com.zing.zalo.feed.mvp.bottomsheetmenu.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.C8540a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import io.AbstractC20641e;
import io.C20639c;
import io.C20640d;
import io.C20642f;
import io.C20643g;
import java.util.ArrayList;
import java.util.List;
import qm0.AbstractC25368s;

/* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a */
/* loaded from: classes4.dex */
public final class C8540a extends RecyclerView.AbstractC1880g {

    /* renamed from: u */
    public static final i f46164u = new i(null);

    /* renamed from: r */
    private List f46165r = new ArrayList();

    /* renamed from: s */
    private List f46166s = new ArrayList();

    /* renamed from: t */
    private a f46167t;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: jl */
        void mo45462jl(C20639c c20639c);

        /* renamed from: xc */
        void mo45466xc(C20640d c20640d);
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m45487a(ViewGroup viewGroup, int i11) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new b(new BottomSheetMenuContentView(context, i11));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BottomSheetMenuContentView bottomSheetMenuContentView) {
            super(bottomSheetMenuContentView);
            AbstractC19074t.m100208f(bottomSheetMenuContentView, "itemView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m45484l0(a aVar, C20639c c20639c, View view) {
            AbstractC19074t.m100208f(c20639c, "$data");
            if (aVar != null) {
                aVar.mo45462jl(c20639c);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final boolean m45485m0(a aVar, C20639c c20639c, View view) {
            AbstractC19074t.m100208f(c20639c, "$data");
            if (aVar != null) {
                aVar.mo45462jl(c20639c);
                return true;
            }
            return true;
        }

        /* renamed from: k0 */
        public final void m45486k0(final C20639c c20639c, final a aVar) {
            AbstractC19074t.m100208f(c20639c, "data");
            View view = this.f7784p;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.BottomSheetMenuContentView");
            BottomSheetMenuContentView bottomSheetMenuContentView = (BottomSheetMenuContentView) view;
            bottomSheetMenuContentView.m45476c(c20639c);
            bottomSheetMenuContentView.setOnClickListener(new View.OnClickListener() { // from class: ho.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C8540a.b.m45484l0(C8540a.a.this, c20639c, view2);
                }
            });
            bottomSheetMenuContentView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ho.b
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m45485m0;
                    m45485m0 = C8540a.b.m45485m0(C8540a.a.this, c20639c, view2);
                    return m45485m0;
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m45493a(ViewGroup viewGroup, int i11) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new c(new BottomSheetMenuContentQuickSettingView(context, i11));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BottomSheetMenuContentQuickSettingView bottomSheetMenuContentQuickSettingView) {
            super(bottomSheetMenuContentQuickSettingView);
            AbstractC19074t.m100208f(bottomSheetMenuContentQuickSettingView, "itemView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final void m45490l0(a aVar, C20640d c20640d, View view) {
            AbstractC19074t.m100208f(c20640d, "$data");
            if (aVar != null) {
                aVar.mo45466xc(c20640d);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final boolean m45491m0(a aVar, C20640d c20640d, View view) {
            AbstractC19074t.m100208f(c20640d, "$data");
            if (aVar != null) {
                aVar.mo45466xc(c20640d);
                return true;
            }
            return true;
        }

        /* renamed from: k0 */
        public final void m45492k0(final C20640d c20640d, final a aVar) {
            AbstractC19074t.m100208f(c20640d, "data");
            View view = this.f7784p;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.BottomSheetMenuContentQuickSettingView");
            BottomSheetMenuContentQuickSettingView bottomSheetMenuContentQuickSettingView = (BottomSheetMenuContentQuickSettingView) view;
            bottomSheetMenuContentQuickSettingView.m45475b(c20640d, aVar);
            bottomSheetMenuContentQuickSettingView.setOnClickListener(new View.OnClickListener() { // from class: ho.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C8540a.c.m45490l0(C8540a.a.this, c20640d, view2);
                }
            });
            bottomSheetMenuContentQuickSettingView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ho.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m45491m0;
                    m45491m0 = C8540a.c.m45491m0(C8540a.a.this, c20640d, view2);
                    return m45491m0;
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m45494a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new d(new BottomSheetMenuDividerHeaderView(context));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$e$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m45495a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new e(new BottomSheetMenuDividerView(context));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$f$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final f m45496a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new f(new BottomSheetMenuFooterView(context));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$g */
    /* loaded from: classes4.dex */
    public static final class g extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$g$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final g m45498a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new g(new BottomSheetMenuHeaderView(context));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BottomSheetMenuHeaderView bottomSheetMenuHeaderView) {
            super(bottomSheetMenuHeaderView);
            AbstractC19074t.m100208f(bottomSheetMenuHeaderView, "itemView");
        }

        /* renamed from: i0 */
        public final void m45497i0(C20643g c20643g) {
            AbstractC19074t.m100208f(c20643g, "data");
            View view = this.f7784p;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.BottomSheetMenuHeaderView");
            ((BottomSheetMenuHeaderView) view).m45477a(c20643g);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$h$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final h m45499a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new h(new BottomSheetMenuUnknownView(context));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.adapter.a$i */
    /* loaded from: classes4.dex */
    public static final class i {
        private i() {
        }

        public /* synthetic */ i(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: L */
    private final List m45478L(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i11 = 0;
            if (list.size() == 1) {
                arrayList.add(m45479M((AbstractC20641e) list.get(0)));
            } else if (list.size() > 1) {
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    AbstractC20641e abstractC20641e = (AbstractC20641e) obj;
                    if (i11 == list.size() - 1) {
                        arrayList.add(m45479M(abstractC20641e));
                    } else {
                        C20642f m45479M = m45479M(abstractC20641e);
                        arrayList.add(m45479M);
                        if (m45479M.m107582b() == 1) {
                            arrayList.add(new C20642f(4, abstractC20641e));
                        } else if (m45479M.m107582b() == 5) {
                            arrayList.add(new C20642f(3, abstractC20641e));
                        }
                    }
                    i11 = i12;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: M */
    private final C20642f m45479M(AbstractC20641e abstractC20641e) {
        int m107578a = abstractC20641e.m107578a();
        int i11 = 1;
        if (m107578a != 1) {
            i11 = 2;
            if (m107578a != 2) {
                if (m107578a != 3) {
                    if (m107578a != 4) {
                        i11 = 0;
                    } else {
                        i11 = 6;
                    }
                } else {
                    i11 = 5;
                }
            }
        }
        return new C20642f(i11, abstractC20641e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (i11 >= 0 && i11 < this.f46166s.size()) {
            AbstractC20641e m107581a = ((C20642f) this.f46166s.get(i11)).m107581a();
            if (abstractC1876c0 instanceof g) {
                AbstractC19074t.m100206d(m107581a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuHeaderData");
                ((g) abstractC1876c0).m45497i0((C20643g) m107581a);
            } else if (abstractC1876c0 instanceof b) {
                AbstractC19074t.m100206d(m107581a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuContentData");
                ((b) abstractC1876c0).m45486k0((C20639c) m107581a, this.f46167t);
            } else if (abstractC1876c0 instanceof c) {
                AbstractC19074t.m100206d(m107581a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuContentQuickSettingData");
                ((c) abstractC1876c0).m45492k0((C20640d) m107581a, this.f46167t);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 0:
                return h.Companion.m45499a(viewGroup);
            case 1:
                return g.Companion.m45498a(viewGroup);
            case 2:
                return f.Companion.m45496a(viewGroup);
            case 3:
                return e.Companion.m45495a(viewGroup);
            case 4:
                return d.Companion.m45494a(viewGroup);
            case 5:
                return b.Companion.m45487a(viewGroup, 5);
            case 6:
                return b.Companion.m45487a(viewGroup, 6);
            case 7:
                return b.Companion.m45487a(viewGroup, 7);
            case 8:
                return c.Companion.m45493a(viewGroup, 8);
            case 9:
                return c.Companion.m45493a(viewGroup, 9);
            default:
                return h.Companion.m45499a(viewGroup);
        }
    }

    /* renamed from: N */
    public final void m45480N(a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f46167t = aVar;
    }

    /* renamed from: O */
    public final void m45481O(List list) {
        AbstractC19074t.m100208f(list, "dataList");
        this.f46165r.clear();
        this.f46165r.addAll(list);
        this.f46166s.clear();
        this.f46166s = m45478L(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f46166s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 >= 0 && i11 < this.f46166s.size()) {
            switch (((C20642f) this.f46166s.get(i11)).m107582b()) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    if (((C20642f) this.f46166s.get(i11)).m107581a() instanceof C20639c) {
                        AbstractC20641e m107581a = ((C20642f) this.f46166s.get(i11)).m107581a();
                        AbstractC19074t.m100206d(m107581a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuContentData");
                        int m107560e = ((C20639c) m107581a).m107560e();
                        if (m107560e != 1) {
                            if (m107560e == 2) {
                                return 7;
                            }
                            return 5;
                        }
                        return 6;
                    }
                    return 5;
                case 6:
                    if (((C20642f) this.f46166s.get(i11)).m107581a() instanceof C20640d) {
                        AbstractC20641e m107581a2 = ((C20642f) this.f46166s.get(i11)).m107581a();
                        AbstractC19074t.m100206d(m107581a2, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuContentQuickSettingData");
                        if (((C20640d) m107581a2).m107571e() == 2) {
                            return 9;
                        }
                        return 8;
                    }
                    return 8;
                default:
                    return 0;
            }
        }
        return 0;
    }
}
