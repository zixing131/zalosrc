package fr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bo.C3054x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fr.C19134g;
import gg0.AbstractC19444a;
import gr.C19589a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import ln0.C22535d;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p649xl.C29925m7;
import p649xl.C30105wc;
import p649xl.C30122xc;
import p649xl.C30139yc;
import qm0.AbstractC25332a0;
import ui0.C27280g;

/* renamed from: fr.g */
/* loaded from: classes4.dex */
public final class C19134g extends RecyclerView.AbstractC1880g implements AbstractC11859g.c {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private b f95152r;

    /* renamed from: s */
    private List f95153s;

    /* renamed from: t */
    private int f95154t;

    /* renamed from: u */
    private int f95155u;

    /* renamed from: fr.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: fr.g$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo46886a(boolean z11);

        /* renamed from: b */
        void mo46887b(boolean z11);

        /* renamed from: c */
        void mo46888c(int i11);
    }

    /* renamed from: fr.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C30105wc f95156I;

        /* renamed from: fr.g$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m100421a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30105wc m148664c = C30105wc.m148664c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148664c, "inflate(...)");
                return new c(m148664c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C30105wc c30105wc) {
            super(c30105wc.getRoot());
            AbstractC19074t.m100208f(c30105wc, "binding");
            this.f95156I = c30105wc;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m100420i0(C3054x c3054x, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            int i11;
            CharSequence m14673e;
            int i12;
            boolean m127128x;
            boolean m127128x2;
            AbstractC19074t.m100208f(c3054x, "data");
            C30105wc c30105wc = this.f95156I;
            c30105wc.getRoot().setPadding(0, AbstractC23222t7.f112567j0, 0, 0);
            c30105wc.f139835s.setImageResource(c3054x.m14685q());
            c30105wc.f139837u.setText(c3054x.m14694z());
            RobotoTextView robotoTextView = c30105wc.f139837u;
            CharSequence m14694z = c3054x.m14694z();
            if (m14694z != null) {
                m127128x2 = AbstractC24341v.m127128x(m14694z);
                if (!m127128x2) {
                    i11 = 0;
                    robotoTextView.setVisibility(i11);
                    c30105wc.f139836t.setText(c3054x.m14673e());
                    RobotoTextView robotoTextView2 = c30105wc.f139836t;
                    m14673e = c3054x.m14673e();
                    if (m14673e != null) {
                        m127128x = AbstractC24341v.m127128x(m14673e);
                        if (!m127128x) {
                            i12 = 0;
                            robotoTextView2.setVisibility(i12);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMarginStart(AbstractC23222t7.f112514B);
                            layoutParams.setMarginEnd(AbstractC23222t7.f112514B);
                            if (c3054x.m14676h()) {
                                c30105wc.f139833q.setText(c3054x.m14643A());
                                c30105wc.f139833q.setVisibility(0);
                                c30105wc.f139833q.setOnClickListener(onClickListener);
                                c30105wc.f139834r.setVisibility(8);
                                c30105wc.f139837u.setVisibility(8);
                                layoutParams.topMargin = AbstractC23222t7.f112514B;
                                c30105wc.f139836t.setLayoutParams(layoutParams);
                                return;
                            }
                            c30105wc.f139833q.setVisibility(8);
                            c30105wc.f139834r.setVisibility(0);
                            c30105wc.f139837u.setVisibility(0);
                            layoutParams.topMargin = AbstractC23222t7.f112566j;
                            c30105wc.f139836t.setLayoutParams(layoutParams);
                            c30105wc.f139834r.setOnClickListener(onClickListener2);
                            c30105wc.f139834r.setSupportiveIcon(C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_add_story_solid_24, AbstractC2807a.icWhite));
                            c30105wc.f139834r.setIdTracking("social_profile_storyarchive_emptystate_createstory");
                            return;
                        }
                    }
                    i12 = 8;
                    robotoTextView2.setVisibility(i12);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMarginStart(AbstractC23222t7.f112514B);
                    layoutParams2.setMarginEnd(AbstractC23222t7.f112514B);
                    if (c3054x.m14676h()) {
                    }
                }
            }
            i11 = 8;
            robotoTextView.setVisibility(i11);
            c30105wc.f139836t.setText(c3054x.m14673e());
            RobotoTextView robotoTextView22 = c30105wc.f139836t;
            m14673e = c3054x.m14673e();
            if (m14673e != null) {
            }
            i12 = 8;
            robotoTextView22.setVisibility(i12);
            LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams22.setMarginStart(AbstractC23222t7.f112514B);
            layoutParams22.setMarginEnd(AbstractC23222t7.f112514B);
            if (c3054x.m14676h()) {
            }
        }
    }

    /* renamed from: fr.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C30122xc f95157I;

        /* renamed from: fr.g$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final d m100426a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30122xc m148704c = C30122xc.m148704c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148704c, "inflate(...)");
                return new d(m148704c);
            }
        }

        /* renamed from: fr.g$d$b */
        /* loaded from: classes4.dex */
        public interface b {
            /* renamed from: a */
            void mo100427a();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C30122xc c30122xc) {
            super(c30122xc.getRoot());
            AbstractC19074t.m100208f(c30122xc, "binding");
            this.f95157I = c30122xc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m100423k0(b bVar, View view) {
            AbstractC19074t.m100208f(bVar, "$listener");
            bVar.mo100427a();
        }

        /* renamed from: j0 */
        public final void m100424j0(int i11, final b bVar) {
            int i12;
            AbstractC19074t.m100208f(bVar, "listener");
            this.f95157I.f139952s.setVisibility(8);
            RobotoTextView robotoTextView = this.f95157I.f139953t;
            if (i11 == 50001) {
                i12 = AbstractC8020f0.str_story_archive_loadmore_failed_network;
            } else {
                i12 = AbstractC8020f0.str_story_archive_loadmore_failed;
            }
            robotoTextView.setText(i12);
            this.f95157I.f139951r.setVisibility(0);
            this.f95157I.f139951r.setOnClickListener(new View.OnClickListener() { // from class: fr.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C19134g.d.m100423k0(C19134g.d.b.this, view);
                }
            });
        }

        /* renamed from: l0 */
        public final void m100425l0() {
            this.f95157I.f139952s.setVisibility(0);
            this.f95157I.f139951r.setVisibility(8);
        }
    }

    /* renamed from: fr.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: fr.g$e$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m100428a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30139yc m148748c = C30139yc.m148748c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148748c, "inflate(...)");
                return new e(m148748c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C30139yc c30139yc) {
            super(c30139yc.getRoot());
            AbstractC19074t.m100208f(c30139yc, "binding");
        }
    }

    /* renamed from: fr.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final StoryArchiveCard f95158I;

        /* renamed from: fr.g$f$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final f m100432a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                return new f(new StoryArchiveCard(viewGroup.getContext(), null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StoryArchiveCard storyArchiveCard) {
            super(storyArchiveCard);
            AbstractC19074t.m100208f(storyArchiveCard, "contentView");
            this.f95158I = storyArchiveCard;
        }

        /* renamed from: i0 */
        public final void m100429i0(C19589a c19589a, int i11, StoryArchiveCard.InterfaceC8765b interfaceC8765b) {
            this.f95158I.m46916c0(c19589a, i11, interfaceC8765b);
        }

        /* renamed from: j0 */
        public final void m100430j0() {
            this.f95158I.m46917e0();
        }

        /* renamed from: k0 */
        public final StoryArchiveCard m100431k0() {
            return this.f95158I;
        }
    }

    /* renamed from: fr.g$g */
    /* loaded from: classes4.dex */
    public static final class g extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C29925m7 f95159I;

        /* renamed from: fr.g$g$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final g m100434a(ViewGroup viewGroup) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C29925m7 m148243c = C29925m7.m148243c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148243c, "inflate(...)");
                return new g(m148243c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C29925m7 c29925m7) {
            super(c29925m7.getRoot());
            AbstractC19074t.m100208f(c29925m7, "binding");
            this.f95159I = c29925m7;
        }

        /* renamed from: i0 */
        public final void m100433i0() {
            this.f95159I.f138665q.setSkeletonLayoutType(3);
        }
    }

    /* renamed from: fr.g$h */
    /* loaded from: classes4.dex */
    public static final class h implements StoryArchiveCard.InterfaceC8765b {
        h() {
        }

        @Override // com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveCard.InterfaceC8765b
        /* renamed from: a */
        public void mo46918a(int i11) {
            int m100413W = i11 - C19134g.this.m100413W();
            b m100411U = C19134g.this.m100411U();
            if (m100411U != null) {
                m100411U.mo46888c(m100413W);
            }
        }
    }

    /* renamed from: fr.g$i */
    /* loaded from: classes4.dex */
    public static final class i implements d.b {

        /* renamed from: a */
        final /* synthetic */ C19589a f95161a;

        /* renamed from: b */
        final /* synthetic */ C19134g f95162b;

        i(C19589a c19589a, C19134g c19134g) {
            this.f95161a = c19589a;
            this.f95162b = c19134g;
        }

        @Override // fr.C19134g.d.b
        /* renamed from: a */
        public void mo100427a() {
            boolean z11;
            if (this.f95161a.m102539d() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            b m100411U = this.f95162b.m100411U();
            if (m100411U != null) {
                m100411U.mo46887b(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m100403S(C19134g c19134g) {
        AbstractC19074t.m100208f(c19134g, "this$0");
        c19134g.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m100404Z(C19134g c19134g, View view) {
        AbstractC19074t.m100208f(c19134g, "this$0");
        b bVar = c19134g.f95152r;
        if (bVar != null) {
            bVar.mo46886a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m100405a0(C19134g c19134g, View view) {
        AbstractC19074t.m100208f(c19134g, "this$0");
        b bVar = c19134g.f95152r;
        if (bVar != null) {
            bVar.mo46886a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m100406c0(C19134g c19134g) {
        AbstractC19074t.m100208f(c19134g, "this$0");
        c19134g.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m100407f0(C19134g c19134g) {
        AbstractC19074t.m100208f(c19134g, "this$0");
        c19134g.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m100408h0(C19134g c19134g) {
        AbstractC19074t.m100208f(c19134g, "this$0");
        c19134g.m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        C19589a c19589a;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        List list = this.f95153s;
        if (list != null) {
            c19589a = (C19589a) list.get(i11);
        } else {
            c19589a = null;
        }
        if (!(abstractC1876c0 instanceof e)) {
            if (abstractC1876c0 instanceof f) {
                ((f) abstractC1876c0).m100429i0(c19589a, i11, new h());
                return;
            }
            if (abstractC1876c0 instanceof d) {
                if (c19589a != null && c19589a.m102541f() == 3) {
                    ((d) abstractC1876c0).m100425l0();
                    return;
                } else {
                    if (c19589a != null && c19589a.m102541f() == 4) {
                        ((d) abstractC1876c0).m100424j0(c19589a.m102538c(), new i(c19589a, this));
                        return;
                    }
                    return;
                }
            }
            if (abstractC1876c0 instanceof c) {
                if (c19589a != null) {
                    ((c) abstractC1876c0).m100420i0(c19589a.m102537b(), new View.OnClickListener() { // from class: fr.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C19134g.m100404Z(C19134g.this, view);
                        }
                    }, new View.OnClickListener() { // from class: fr.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C19134g.m100405a0(C19134g.this, view);
                        }
                    });
                }
            } else if (abstractC1876c0 instanceof g) {
                ((g) abstractC1876c0).m100433i0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        switch (i11) {
            case 1:
                return e.Companion.m100428a(viewGroup);
            case 2:
                return f.Companion.m100432a(viewGroup);
            case 3:
            case 4:
                return d.Companion.m100426a(viewGroup);
            case 5:
                return c.Companion.m100421a(viewGroup);
            case 6:
                return g.Companion.m100434a(viewGroup);
            default:
                throw new ClassCastException("StoryArchiveAdapter Unknown view type: " + i11);
        }
    }

    /* renamed from: R */
    public final void m100409R(boolean z11) {
        try {
            int m100412V = m100412V(z11);
            if (m100412V != -1) {
                List list = this.f95153s;
                if (list != null) {
                }
                if (z11) {
                    this.f95154t = 0;
                } else {
                    this.f95155u = 0;
                }
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: fr.c
                @Override // java.lang.Runnable
                public final void run() {
                    C19134g.m100403S(C19134g.this);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: T */
    public final int m100410T() {
        return this.f95155u;
    }

    /* renamed from: U */
    public final b m100411U() {
        return this.f95152r;
    }

    /* renamed from: V */
    public final int m100412V(boolean z11) {
        int i11;
        C19589a c19589a;
        List list = this.f95153s;
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 0;
        }
        C22535d m116593p = z11 ? AbstractC22543l.m116593p(0, i11) : AbstractC22543l.m116590m(i11 - 1, 0);
        int m116547d = m116593p.m116547d();
        int m116548e = m116593p.m116548e();
        int m116549g = m116593p.m116549g();
        if ((m116549g > 0 && m116547d <= m116548e) || (m116549g < 0 && m116548e <= m116547d)) {
            while (true) {
                List list2 = this.f95153s;
                if (list2 != null) {
                    c19589a = (C19589a) list2.get(m116547d);
                } else {
                    c19589a = null;
                }
                if (c19589a != null && (c19589a.m102541f() == 3 || c19589a.m102541f() == 4)) {
                    break;
                }
                if (m116547d == m116548e) {
                    break;
                }
                m116547d += m116549g;
            }
        }
        m116547d = -1;
        int i12 = this.f95154t;
        if (i12 != 0 && this.f95155u != 0) {
            return m116547d;
        }
        if (i12 != 0) {
            if (!z11) {
                return -1;
            }
            return m116547d;
        }
        if (this.f95155u == 0 || z11) {
            return -1;
        }
        return m116547d;
    }

    /* renamed from: W */
    public final int m100413W() {
        List list = this.f95153s;
        int i11 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext() && ((C19589a) it.next()).m102541f() != 2) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: X */
    public final int m100414X() {
        return this.f95154t;
    }

    /* renamed from: Y */
    public final boolean m100415Y(int i11) {
        int mo10005m = mo10005m(i11);
        if (mo10005m == 1 || mo10005m == 3 || mo10005m == 4 || mo10005m == 5 || mo10005m == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public final void m100416b0(List list) {
        C19589a c19589a;
        int i11;
        List m131187O0;
        List list2;
        int m100412V;
        List list3;
        AbstractC19074t.m100208f(list, "storyList");
        try {
            C19589a c19589a2 = null;
            if (this.f95154t != 0 && (i11 = m100412V(true)) != -1) {
                List list4 = this.f95153s;
                if (list4 != null) {
                    c19589a = (C19589a) list4.get(i11);
                } else {
                    c19589a = null;
                }
            } else {
                c19589a = null;
                i11 = 0;
            }
            if (this.f95155u != 0 && (m100412V = m100412V(false)) != -1 && (list3 = this.f95153s) != null) {
                c19589a2 = (C19589a) list3.get(m100412V);
            }
            m131187O0 = AbstractC25332a0.m131187O0(list);
            this.f95153s = m131187O0;
            if (c19589a != null && m131187O0 != null) {
                m131187O0.add(i11, c19589a);
            }
            if (c19589a2 != null && (list2 = this.f95153s) != null) {
                list2.add(c19589a2);
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: fr.b
                @Override // java.lang.Runnable
                public final void run() {
                    C19134g.m100406c0(C19134g.this);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d0 */
    public final void m100417d0(b bVar) {
        this.f95152r = bVar;
    }

    /* renamed from: e0 */
    public final void m100418e0(C3054x c3054x) {
        AbstractC19074t.m100208f(c3054x, "data");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C19589a(1, null, false, null, null, 0, 0, null, false, 510, null));
            arrayList.add(new C19589a(5, null, false, null, null, 0, 0, c3054x, false, 382, null));
            this.f95153s = arrayList;
            AbstractC19444a.m101695c(new Runnable() { // from class: fr.d
                @Override // java.lang.Runnable
                public final void run() {
                    C19134g.m100407f0(C19134g.this);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.custom.AbstractC11859g.c
    /* renamed from: g */
    public String mo36810g(int i11) {
        C19589a c19589a;
        List list = this.f95153s;
        if (list != null) {
            c19589a = (C19589a) list.get(i11);
        } else {
            c19589a = null;
        }
        if (c19589a != null && c19589a.m102543h().f148150p != 0) {
            String m119738b = AbstractC23244v8.m119738b(AbstractC23160o0.m119305y0(c19589a.m102543h().f148150p));
            AbstractC19074t.m100207e(m119738b, "capitalize(...)");
            return m119738b;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m100419g0(boolean z11, boolean z12, int i11, boolean z13) {
        C19589a c19589a;
        C19589a c19589a2;
        int m100412V;
        List list;
        C19589a c19589a3 = null;
        try {
            if (z11) {
                c19589a2 = new C19589a(3, null, false, null, null, 0, i11, null, false, 446, null);
            } else if (z12) {
                c19589a2 = new C19589a(4, null, false, null, null, 0, i11, null, false, 446, null);
            } else {
                c19589a = null;
                m100412V = m100412V(z13);
                if (m100412V != -1 && (list = this.f95153s) != null) {
                    c19589a3 = (C19589a) list.get(m100412V);
                }
                if (c19589a == null) {
                    int i12 = 4;
                    int i13 = 2;
                    if (z13) {
                        int i14 = this.f95154t;
                        if (i14 == 0) {
                            c19589a.m102545j(0);
                            List list2 = this.f95153s;
                            if (list2 != null) {
                                list2.add(m100413W(), c19589a);
                            }
                        } else if (((z11 && i14 == 2) || (z12 && i14 == 1)) && c19589a3 != null) {
                            c19589a3.m102545j(0);
                            if (z11) {
                                i12 = 3;
                            }
                            c19589a3.m102546k(i12);
                            c19589a3.m102544i(i11);
                        }
                        if (z11) {
                            i13 = 1;
                        }
                        this.f95154t = i13;
                    } else {
                        int i15 = this.f95155u;
                        if (i15 == 0) {
                            c19589a.m102545j(1);
                            List list3 = this.f95153s;
                            if (list3 != null) {
                                list3.add(c19589a);
                            }
                        } else if (((z11 && i15 == 2) || (z12 && i15 == 1)) && c19589a3 != null) {
                            c19589a3.m102545j(1);
                            if (z11) {
                                i12 = 3;
                            }
                            c19589a3.m102546k(i12);
                            c19589a3.m102544i(i11);
                        }
                        if (z11) {
                            i13 = 1;
                        }
                        this.f95155u = i13;
                    }
                    AbstractC19444a.m101695c(new Runnable() { // from class: fr.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19134g.m100408h0(C19134g.this);
                        }
                    });
                    return;
                }
                return;
            }
            c19589a = c19589a2;
            m100412V = m100412V(z13);
            if (m100412V != -1) {
                c19589a3 = (C19589a) list.get(m100412V);
            }
            if (c19589a == null) {
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f95153s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C19589a c19589a;
        Object m131207g0;
        List list = this.f95153s;
        if (list != null) {
            m131207g0 = AbstractC25332a0.m131207g0(list, i11);
            c19589a = (C19589a) m131207g0;
        } else {
            c19589a = null;
        }
        if (c19589a == null) {
            return 0;
        }
        switch (c19589a.m102541f()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }
}
