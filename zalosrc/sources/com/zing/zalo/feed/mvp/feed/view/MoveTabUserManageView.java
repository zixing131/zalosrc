package com.zing.zalo.feed.mvp.feed.view;

import ac.InterfaceC0733x;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bo.InterfaceC3058y;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.SearchField;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p022ap.C2278i;
import p039bp.C3072f;
import p082cp.C17538k;
import p172fy.C19171b;
import p205hc.C19964c;
import p363nh.C23744a;
import p425po.AbstractC24887i;
import p425po.C24894p;
import p510sq.C26365a;
import p649xl.C29744c6;
import p716zh.C32002l4;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class MoveTabUserManageView extends SlidableZaloView implements InterfaceC0733x, C17538k.a {
    public static final C8551a Companion = new C8551a(null);

    /* renamed from: P0 */
    private C17538k f46242P0;

    /* renamed from: Q0 */
    private C29744c6 f46243Q0;

    /* renamed from: R0 */
    private SwipeRefreshListView f46244R0;

    /* renamed from: S0 */
    private RecyclerView f46245S0;

    /* renamed from: T0 */
    private ActionBarMenuItem f46246T0;

    /* renamed from: U0 */
    private SearchField f46247U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f46248V0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C3072f.class), new C8564n(new C8563m(this)), C8565o.f46264q);

    /* renamed from: W0 */
    private boolean f46249W0;

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$a */
    /* loaded from: classes4.dex */
    public static final class C8551a {
        private C8551a() {
        }

        public /* synthetic */ C8551a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$b */
    /* loaded from: classes4.dex */
    public static final class C8552b implements InterfaceC3058y {

        /* renamed from: a */
        private final String f46250a;

        public C8552b(String str) {
            AbstractC19074t.m100208f(str, "uid");
            this.f46250a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8552b) && AbstractC19074t.m100204b(this.f46250a, ((C8552b) obj).f46250a);
        }

        public int hashCode() {
            return this.f46250a.hashCode();
        }

        public String toString() {
            return "ReceiveUnfriendEvent(uid=" + this.f46250a + ")";
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$c */
    /* loaded from: classes4.dex */
    public static final class C8553c implements InterfaceC3058y {

        /* renamed from: a */
        public static final C8553c f46251a = new C8553c();

        private C8553c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$d */
    /* loaded from: classes4.dex */
    public static final class C8554d extends AbstractC19075u implements InterfaceC18505l {
        C8554d() {
            super(1);
        }

        /* renamed from: a */
        public final void m45637a(C3072f.c cVar) {
            if (AbstractC19074t.m100204b(cVar, C3072f.a.f12495a)) {
                MoveTabUserManageView.this.m45614FM();
            } else {
                MoveTabUserManageView.this.m45615GM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45637a((C3072f.c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$e */
    /* loaded from: classes4.dex */
    public static final class C8555e extends AbstractC19075u implements InterfaceC18505l {
        C8555e() {
            super(1);
        }

        /* renamed from: a */
        public final void m45638a(C3072f.d dVar) {
            List m131187O0;
            C17538k c17538k = null;
            if (dVar instanceof C3072f.o) {
                C17538k c17538k2 = MoveTabUserManageView.this.f46242P0;
                if (c17538k2 == null) {
                    AbstractC19074t.m100223u("bodyAdapter");
                    c17538k2 = null;
                }
                m131187O0 = AbstractC25332a0.m131187O0(((C3072f.o) dVar).m14918a());
                c17538k2.m93460Q(m131187O0);
                C17538k c17538k3 = MoveTabUserManageView.this.f46242P0;
                if (c17538k3 == null) {
                    AbstractC19074t.m100223u("bodyAdapter");
                } else {
                    c17538k = c17538k3;
                }
                c17538k.m10008p();
                return;
            }
            if (dVar instanceof C3072f.v) {
                C17538k c17538k4 = MoveTabUserManageView.this.f46242P0;
                if (c17538k4 == null) {
                    AbstractC19074t.m100223u("bodyAdapter");
                    c17538k4 = null;
                }
                C3072f.v vVar = (C3072f.v) dVar;
                if (c17538k4.m93462S(vVar.m14927a(), vVar.m14928b())) {
                    C17538k c17538k5 = MoveTabUserManageView.this.f46242P0;
                    if (c17538k5 == null) {
                        AbstractC19074t.m100223u("bodyAdapter");
                    } else {
                        c17538k = c17538k5;
                    }
                    c17538k.m10009q(vVar.m14927a());
                    return;
                }
                return;
            }
            if (dVar instanceof C3072f.m) {
                C3072f.m mVar = (C3072f.m) dVar;
                int m14929a = mVar.m14915b().m14929a();
                C17538k c17538k6 = MoveTabUserManageView.this.f46242P0;
                if (c17538k6 == null) {
                    AbstractC19074t.m100223u("bodyAdapter");
                    c17538k6 = null;
                }
                int m93455L = c17538k6.m93455L(mVar.m14915b().m14930b(), mVar.m14915b().m14929a(), mVar.m14914a());
                if (m93455L != -1) {
                    C17538k c17538k7 = MoveTabUserManageView.this.f46242P0;
                    if (c17538k7 == null) {
                        AbstractC19074t.m100223u("bodyAdapter");
                        c17538k7 = null;
                    }
                    c17538k7.m10015w(m14929a + 1, m93455L);
                    C17538k c17538k8 = MoveTabUserManageView.this.f46242P0;
                    if (c17538k8 == null) {
                        AbstractC19074t.m100223u("bodyAdapter");
                    } else {
                        c17538k = c17538k8;
                    }
                    c17538k.m10009q(m14929a);
                    return;
                }
                return;
            }
            if (dVar instanceof C3072f.i) {
                C3072f.i iVar = (C3072f.i) dVar;
                int m14929a2 = iVar.m14904a().m14929a();
                C17538k c17538k9 = MoveTabUserManageView.this.f46242P0;
                if (c17538k9 == null) {
                    AbstractC19074t.m100223u("bodyAdapter");
                    c17538k9 = null;
                }
                int m93459P = c17538k9.m93459P(iVar.m14904a().m14930b(), iVar.m14904a().m14929a());
                if (m93459P != -1) {
                    C17538k c17538k10 = MoveTabUserManageView.this.f46242P0;
                    if (c17538k10 == null) {
                        AbstractC19074t.m100223u("bodyAdapter");
                        c17538k10 = null;
                    }
                    c17538k10.m10016x(m14929a2 + 1, m93459P);
                    C17538k c17538k11 = MoveTabUserManageView.this.f46242P0;
                    if (c17538k11 == null) {
                        AbstractC19074t.m100223u("bodyAdapter");
                    } else {
                        c17538k = c17538k11;
                    }
                    c17538k.m10009q(m14929a2);
                    return;
                }
                return;
            }
            if (dVar instanceof C3072f.r) {
                List<C3072f.v> m14922a = ((C3072f.r) dVar).m14922a();
                MoveTabUserManageView moveTabUserManageView = MoveTabUserManageView.this;
                for (C3072f.v vVar2 : m14922a) {
                    C17538k c17538k12 = moveTabUserManageView.f46242P0;
                    if (c17538k12 == null) {
                        AbstractC19074t.m100223u("bodyAdapter");
                        c17538k12 = null;
                    }
                    if (c17538k12.m93462S(vVar2.m14927a(), vVar2.m14928b())) {
                        C17538k c17538k13 = moveTabUserManageView.f46242P0;
                        if (c17538k13 == null) {
                            AbstractC19074t.m100223u("bodyAdapter");
                            c17538k13 = null;
                        }
                        c17538k13.m10009q(vVar2.m14927a());
                    }
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45638a((C3072f.d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$f */
    /* loaded from: classes4.dex */
    public static final class C8556f extends RecyclerView.AbstractC1892s {
        C8556f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 1 && MoveTabUserManageView.this.f46249W0) {
                C29744c6 c29744c6 = MoveTabUserManageView.this.f46243Q0;
                if (c29744c6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29744c6 = null;
                }
                AbstractC2379w.m12430d(c29744c6.f137401r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$g */
    /* loaded from: classes4.dex */
    public static final class C8557g extends AbstractC19075u implements InterfaceC18505l {
        C8557g() {
            super(1);
        }

        /* renamed from: a */
        public final void m45639a(C19964c c19964c) {
            C3072f.t tVar = (C3072f.t) c19964c.m103749a();
            if (tVar instanceof C3072f.s) {
                MoveTabUserManageView.this.m45629tM(((C3072f.s) tVar).m14924a());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45639a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$h */
    /* loaded from: classes4.dex */
    public static final class C8558h extends AbstractC18391a {
        C8558h() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MoveTabUserManageView.this.mo14631rG(new C2278i(String.valueOf(editable)));
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$i */
    /* loaded from: classes4.dex */
    public static final class C8559i implements KeyboardFrameLayout.InterfaceC13508a {
        C8559i() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            MoveTabUserManageView.this.f46249W0 = false;
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            MoveTabUserManageView.this.f46249W0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$j */
    /* loaded from: classes4.dex */
    public static final class C8560j extends AbstractC19075u implements InterfaceC18505l {
        C8560j() {
            super(1);
        }

        /* renamed from: a */
        public final void m45640a(C19964c c19964c) {
            C3072f.y yVar = (C3072f.y) c19964c.m103749a();
            if (yVar instanceof C3072f.p) {
                MoveTabUserManageView.this.m45612DM(false);
            } else if (yVar instanceof C3072f.x) {
                MoveTabUserManageView.this.mo78936E(((C3072f.x) yVar).m14931a());
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45640a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$k */
    /* loaded from: classes4.dex */
    static final class C8561k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ ActionBarMenu f46259q;

        /* renamed from: r */
        final /* synthetic */ MoveTabUserManageView f46260r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8561k(ActionBarMenu actionBarMenu, MoveTabUserManageView moveTabUserManageView) {
            super(1);
            this.f46259q = actionBarMenu;
            this.f46260r = moveTabUserManageView;
        }

        /* renamed from: a */
        public final void m45641a(List list) {
            AbstractC19074t.m100208f(list, "listMenuItems");
            this.f46259q.m92750r();
            MoveTabUserManageView moveTabUserManageView = this.f46260r;
            ActionBarMenu actionBarMenu = this.f46259q;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() == 1) {
                    int i11 = AbstractC6918a0.menu_item_search;
                    Context context = moveTabUserManageView.getContext();
                    if (context == null) {
                        C29744c6 c29744c6 = moveTabUserManageView.f46243Q0;
                        if (c29744c6 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29744c6 = null;
                        }
                        context = c29744c6.f137401r.getContext();
                    }
                    AbstractC19074t.m100205c(context);
                    moveTabUserManageView.f46246T0 = actionBarMenu.m92742i(i11, C27280g.m139660c(context, AbstractC23322a.zds_ic_search_line_24, AbstractC2807a.icon_01));
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45641a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$l */
    /* loaded from: classes4.dex */
    public static final class C8562l implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46261p;

        C8562l(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46261p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46261p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f46261p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$m */
    /* loaded from: classes4.dex */
    public static final class C8563m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f46262q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8563m(ZaloView zaloView) {
            super(0);
            this.f46262q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f46262q;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$n */
    /* loaded from: classes4.dex */
    public static final class C8564n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f46263q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8564n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f46263q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f46263q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView$o */
    /* loaded from: classes4.dex */
    static final class C8565o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8565o f46264q = new C8565o();

        C8565o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C3072f.q();
        }
    }

    /* renamed from: AM */
    private final void m45609AM() {
        m45628sM().m14885I0().m9219j(this, new C8562l(new C8557g()));
    }

    /* renamed from: BM */
    private final void m45610BM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        SearchField searchField = new SearchField(m92689tK);
        this.f46247U0 = searchField;
        searchField.getEditText().addTextChangedListener(new C8558h());
        SearchField searchField2 = this.f46247U0;
        C29744c6 c29744c6 = null;
        if (searchField2 == null) {
            AbstractC19074t.m100223u("menuSearchField");
            searchField2 = null;
        }
        searchField2.getEditText().setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_default_search));
        C29744c6 c29744c62 = this.f46243Q0;
        if (c29744c62 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29744c6 = c29744c62;
        }
        c29744c6.f137400q.setOnKeyboardListener(new C8559i());
        m45633xM(m92689tK);
    }

    /* renamed from: CM */
    private final void m45611CM() {
        m45628sM().m14887O0().m9219j(this, new C8562l(new C8560j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m45612DM(final boolean z11) {
        long j11;
        if (!z11) {
            j11 = 1000;
        } else {
            j11 = 0;
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: xo.c
            @Override // java.lang.Runnable
            public final void run() {
                MoveTabUserManageView.m45613EM(MoveTabUserManageView.this, z11);
            }
        }, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m45613EM(MoveTabUserManageView moveTabUserManageView, boolean z11) {
        AbstractC19074t.m100208f(moveTabUserManageView, "this$0");
        SwipeRefreshListView swipeRefreshListView = moveTabUserManageView.f46244R0;
        if (swipeRefreshListView == null) {
            AbstractC19074t.m100223u("swipeRefreshView");
            swipeRefreshListView = null;
        }
        swipeRefreshListView.setRefreshing(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m45614FM() {
        ActionBar actionBar = this.f88760a0;
        SearchField searchField = null;
        if (actionBar != null) {
            Context context = getContext();
            if (context == null) {
                C29744c6 c29744c6 = this.f46243Q0;
                if (c29744c6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29744c6 = null;
                }
                context = c29744c6.f137401r.getContext();
            }
            AbstractC19074t.m100205c(context);
            actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_24, AbstractC2807a.icon_01));
        }
        SearchField searchField2 = this.f46247U0;
        if (searchField2 == null) {
            AbstractC19074t.m100223u("menuSearchField");
            searchField2 = null;
        }
        AbstractC2379w.m12430d(searchField2.getEditText());
        ActionBarMenuItem actionBarMenuItem = this.f46246T0;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(0);
        }
        SearchField searchField3 = this.f46247U0;
        if (searchField3 == null) {
            AbstractC19074t.m100223u("menuSearchField");
            searchField3 = null;
        }
        Editable text = searchField3.getEditText().getText();
        if (text != null && text.length() > 0) {
            SearchField searchField4 = this.f46247U0;
            if (searchField4 == null) {
                AbstractC19074t.m100223u("menuSearchField");
                searchField4 = null;
            }
            searchField4.getEditText().setText("");
        }
        ActionBar m92646QI = m92646QI();
        if (m92646QI != null) {
            SearchField searchField5 = this.f46247U0;
            if (searchField5 == null) {
                AbstractC19074t.m100223u("menuSearchField");
            } else {
                searchField = searchField5;
            }
            m92646QI.removeView(searchField);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public final void m45615GM() {
        ActionBar actionBar = this.f88760a0;
        SearchField searchField = null;
        if (actionBar != null) {
            Context context = getContext();
            if (context == null) {
                C29744c6 c29744c6 = this.f46243Q0;
                if (c29744c6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29744c6 = null;
                }
                context = c29744c6.f137401r.getContext();
            }
            AbstractC19074t.m100205c(context);
            actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_01));
        }
        ActionBarMenuItem actionBarMenuItem = this.f46246T0;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        layoutParams.leftMargin = AbstractC23136l9.m118742r(54.0f);
        layoutParams.topMargin = AbstractC23136l9.m118742r(8.0f);
        layoutParams.bottomMargin = AbstractC23136l9.m118742r(8.0f);
        layoutParams.rightMargin = AbstractC23136l9.m118742r(8.0f);
        ActionBar m92646QI = m92646QI();
        if (m92646QI != null) {
            SearchField searchField2 = this.f46247U0;
            if (searchField2 == null) {
                AbstractC19074t.m100223u("menuSearchField");
                searchField2 = null;
            }
            m92646QI.addView(searchField2, layoutParams);
        }
        SearchField searchField3 = this.f46247U0;
        if (searchField3 == null) {
            AbstractC19074t.m100223u("menuSearchField");
            searchField3 = null;
        }
        searchField3.getEditText().requestFocus();
        SearchField searchField4 = this.f46247U0;
        if (searchField4 == null) {
            AbstractC19074t.m100223u("menuSearchField");
        } else {
            searchField = searchField4;
        }
        AbstractC2379w.m12432f(searchField.getEditText());
    }

    /* renamed from: sM */
    private final C3072f m45628sM() {
        return (C3072f) this.f46248V0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public final void m45629tM(String str) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(str, C32002l4.Companion.m154287a(10030)).m135743b(), 0, 1));
    }

    /* renamed from: uM */
    private final void m45630uM() {
        m45628sM().m14893z0().m9219j(this, new C8562l(new C8554d()));
    }

    /* renamed from: vM */
    private final void m45631vM() {
        m45628sM().m14884A0().m9219j(this, new C8562l(new C8555e()));
    }

    /* renamed from: wM */
    private final void m45632wM() {
        m45630uM();
        m45609AM();
        m45631vM();
        m45611CM();
    }

    /* renamed from: xM */
    private final void m45633xM(Context context) {
        try {
            C29744c6 c29744c6 = this.f46243Q0;
            RecyclerView recyclerView = null;
            if (c29744c6 == null) {
                AbstractC19074t.m100223u("binding");
                c29744c6 = null;
            }
            SwipeRefreshListView swipeRefreshListView = c29744c6.f137402s;
            AbstractC19074t.m100207e(swipeRefreshListView, "swipeRefreshLayout");
            this.f46244R0 = swipeRefreshListView;
            if (swipeRefreshListView == null) {
                AbstractC19074t.m100223u("swipeRefreshView");
                swipeRefreshListView = null;
            }
            swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: xo.a
                @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                /* renamed from: a */
                public final void mo12137a() {
                    MoveTabUserManageView.m45634yM(MoveTabUserManageView.this);
                }
            });
            SwipeRefreshListView swipeRefreshListView2 = this.f46244R0;
            if (swipeRefreshListView2 == null) {
                AbstractC19074t.m100223u("swipeRefreshView");
                swipeRefreshListView2 = null;
            }
            C29744c6 c29744c62 = this.f46243Q0;
            if (c29744c62 == null) {
                AbstractC19074t.m100223u("binding");
                c29744c62 = null;
            }
            swipeRefreshListView2.setContainerViewSnackBar(c29744c62.getRoot());
            SwipeRefreshListView swipeRefreshListView3 = this.f46244R0;
            if (swipeRefreshListView3 == null) {
                AbstractC19074t.m100223u("swipeRefreshView");
                swipeRefreshListView3 = null;
            }
            RecyclerView recyclerView2 = swipeRefreshListView3.f83582p0;
            AbstractC19074t.m100207e(recyclerView2, "mRecyclerView");
            this.f46245S0 = recyclerView2;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.m9723C2(1);
            RecyclerView recyclerView3 = this.f46245S0;
            if (recyclerView3 == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView3 = null;
            }
            recyclerView3.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView4 = this.f46245S0;
            if (recyclerView4 == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView4 = null;
            }
            recyclerView4.setVisibility(0);
            C17538k c17538k = new C17538k(context);
            this.f46242P0 = c17538k;
            c17538k.m93461R(this);
            RecyclerView recyclerView5 = this.f46245S0;
            if (recyclerView5 == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView5 = null;
            }
            recyclerView5.setBackgroundColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
            RecyclerView recyclerView6 = this.f46245S0;
            if (recyclerView6 == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView6 = null;
            }
            C17538k c17538k2 = this.f46242P0;
            if (c17538k2 == null) {
                AbstractC19074t.m100223u("bodyAdapter");
                c17538k2 = null;
            }
            recyclerView6.setAdapter(c17538k2);
            RecyclerView recyclerView7 = this.f46245S0;
            if (recyclerView7 == null) {
                AbstractC19074t.m100223u("recyclerView");
                recyclerView7 = null;
            }
            recyclerView7.m9826E(new C8556f());
            RecyclerView recyclerView8 = this.f46245S0;
            if (recyclerView8 == null) {
                AbstractC19074t.m100223u("recyclerView");
            } else {
                recyclerView = recyclerView8;
            }
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: xo.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m45635zM;
                    m45635zM = MoveTabUserManageView.m45635zM(MoveTabUserManageView.this, view, motionEvent);
                    return m45635zM;
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m45634yM(MoveTabUserManageView moveTabUserManageView) {
        AbstractC19074t.m100208f(moveTabUserManageView, "this$0");
        moveTabUserManageView.m45628sM().mo14631rG(C8553c.f46251a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final boolean m45635zM(MoveTabUserManageView moveTabUserManageView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(moveTabUserManageView, "this$0");
        if (moveTabUserManageView.f46249W0) {
            C29744c6 c29744c6 = moveTabUserManageView.f46243Q0;
            if (c29744c6 == null) {
                AbstractC19074t.m100223u("binding");
                c29744c6 = null;
            }
            AbstractC2379w.m12430d(c29744c6.f137401r);
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        m45628sM().m14886J0().m9219j(this, new C8562l(new C8561k(actionBarMenu, this)));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29744c6 m147805c = C29744c6.m147805c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147805c, "inflate(...)");
        this.f46243Q0 = m147805c;
        m92637BK(true);
        m45610BM();
        C29744c6 c29744c6 = this.f46243Q0;
        if (c29744c6 == null) {
            AbstractC19074t.m100223u("binding");
            c29744c6 = null;
        }
        KeyboardFrameLayout root = c29744c6.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        m45628sM().m14890m1();
        C23744a.Companion.m124119a().m124117e(this, 6042);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_item_search) {
            m45628sM().m14888k1();
            return true;
        }
        if (i11 == 16908332 && AbstractC19074t.m100204b(m45628sM().m14893z0().mo9215f(), C3072f.b.f12497a)) {
            m45628sM().m14889l1();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeline_manage_tab_other_title));
            this.f88760a0.setTitleColor(C23212s8.m119607o(getContext(), AbstractC2807a.text_01));
            this.f88760a0.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
            ActionBar actionBar2 = this.f88760a0;
            Context context = getContext();
            if (context == null) {
                C29744c6 c29744c6 = this.f46243Q0;
                if (c29744c6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29744c6 = null;
                }
                context = c29744c6.f137401r.getContext();
            }
            AbstractC19074t.m100205c(context);
            actionBar2.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_24, AbstractC2807a.icon_01));
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m45632wM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MoveTabUserTimelineView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f46249W0) {
                SearchField searchField = this.f46247U0;
                if (searchField == null) {
                    AbstractC19074t.m100223u("menuSearchField");
                    searchField = null;
                }
                AbstractC2379w.m12430d(searchField.getEditText());
                return true;
            }
            if (AbstractC19074t.m100204b(m45628sM().m14893z0().mo9215f(), C3072f.b.f12497a)) {
                m45628sM().m14889l1();
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // bo.InterfaceC3045u2
    /* renamed from: rG */
    public void mo14631rG(InterfaceC3058y interfaceC3058y) {
        AbstractC19074t.m100208f(interfaceC3058y, "event");
        m45628sM().mo14631rG(interfaceC3058y);
    }

    @Override // com.zing.zalo.feed.mvp.feed.view.component.TimelineEmptyContentView.InterfaceC8571a
    /* renamed from: vB */
    public void mo45636vB(C24894p c24894p) {
        AbstractC19074t.m100208f(c24894p, "emptyContentData");
        m45628sM().mo14631rG(new AbstractC24887i.b());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6042) {
            try {
                if (objArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        m45628sM().mo14631rG(new C8552b((String) obj));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 6042);
    }
}
