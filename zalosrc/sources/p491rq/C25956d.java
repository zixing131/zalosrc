package p491rq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2961d1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.mvp.profile.ProfileSkeletonView;
import com.zing.zalo.feed.mvp.profile.quickaccess.ProfileQuickAccessLayoutManager;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import p273jq.C21342c;
import p354n3.C23528a;

/* renamed from: rq.d */
/* loaded from: classes4.dex */
public class C25956d {

    /* renamed from: a */
    ViewGroup f123854a;

    /* renamed from: b */
    FeedRecyclerView f123855b;

    /* renamed from: c */
    ProfileQuickAccessLayoutManager f123856c;

    /* renamed from: d */
    C25954b f123857d;

    /* renamed from: e */
    ProfileSkeletonView f123858e;

    /* renamed from: f */
    C23528a f123859f;

    /* renamed from: g */
    FeedBaseAdapter.InterfaceC8049z f123860g;

    /* renamed from: h */
    View f123861h;

    /* renamed from: k */
    private int f123864k;

    /* renamed from: i */
    C21342c f123862i = new C21342c();

    /* renamed from: j */
    private int f123863j = 0;

    /* renamed from: l */
    f f123865l = new c();

    /* renamed from: m */
    f f123866m = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rq.d$a */
    /* loaded from: classes4.dex */
    public class a implements FeedRecyclerView.InterfaceC8863b {
        a() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            FeedBaseAdapter.InterfaceC8049z interfaceC8049z = C25956d.this.f123860g;
            if (interfaceC8049z != null) {
                interfaceC8049z.mo43239v(false);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            FeedBaseAdapter.InterfaceC8049z interfaceC8049z = C25956d.this.f123860g;
            if (interfaceC8049z != null) {
                interfaceC8049z.mo43239v(true);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            FeedBaseAdapter.InterfaceC8049z interfaceC8049z = C25956d.this.f123860g;
            if (interfaceC8049z != null) {
                interfaceC8049z.mo43239v(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rq.d$b */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.AbstractC1892s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            super.mo952b(recyclerView, i11);
            FeedBaseAdapter.InterfaceC8049z interfaceC8049z = C25956d.this.f123860g;
            if (i11 == 0 && interfaceC8049z != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            interfaceC8049z.mo43241x(z11);
        }
    }

    /* renamed from: rq.d$c */
    /* loaded from: classes4.dex */
    class c implements f {

        /* renamed from: p */
        private e f123869p = e.m133725b();

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C25956d c25956d;
            FeedRecyclerView feedRecyclerView;
            C25956d c25956d2 = C25956d.this;
            if (!c25956d2.m133712h(c25956d2.f123864k)) {
                C25956d c25956d3 = C25956d.this;
                c25956d3.m133714j(c25956d3.f123864k, this.f123869p);
                C25956d c25956d4 = C25956d.this;
                if (!c25956d4.m133712h(c25956d4.f123864k) && (feedRecyclerView = (c25956d = C25956d.this).f123855b) != null) {
                    feedRecyclerView.removeCallbacks(c25956d.f123866m);
                    C25956d c25956d5 = C25956d.this;
                    c25956d5.f123855b.postDelayed(c25956d5.f123866m, 200L);
                }
            }
        }

        @Override // p491rq.C25956d.f
        /* renamed from: s0 */
        public Runnable mo133723s0(e eVar) {
            this.f123869p = eVar;
            return this;
        }
    }

    /* renamed from: rq.d$d */
    /* loaded from: classes4.dex */
    class d implements f {

        /* renamed from: p */
        private e f123871p = e.m133725b();

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C25956d c25956d = C25956d.this;
            if (!c25956d.m133712h(c25956d.f123864k)) {
                C25956d c25956d2 = C25956d.this;
                c25956d2.m133714j(c25956d2.f123864k, this.f123871p);
            }
        }

        @Override // p491rq.C25956d.f
        /* renamed from: s0 */
        public Runnable mo133723s0(e eVar) {
            this.f123871p = eVar;
            return this;
        }
    }

    /* renamed from: rq.d$e */
    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a */
        boolean f123873a = false;

        /* renamed from: b */
        int f123874b = 0;

        /* renamed from: a */
        public static e m133724a(boolean z11, int i11) {
            e eVar = new e();
            eVar.f123873a = z11;
            eVar.f123874b = i11;
            return eVar;
        }

        /* renamed from: b */
        public static e m133725b() {
            e eVar = new e();
            eVar.f123873a = false;
            eVar.f123874b = 0;
            return eVar;
        }
    }

    /* renamed from: rq.d$f */
    /* loaded from: classes4.dex */
    public interface f extends Runnable {
        /* renamed from: s0 */
        Runnable mo133723s0(e eVar);
    }

    public C25956d(View view, Context context) {
        m133717g(view, context);
    }

    /* renamed from: d */
    private void m133711d() {
        int m133694N;
        FeedBaseAdapter.InterfaceC8049z interfaceC8049z = this.f123860g;
        if (interfaceC8049z != null) {
            String mo43276Z = interfaceC8049z.mo43276Z();
            if (mo43276Z.equals("action.open.memorylist")) {
                int m133693M = this.f123857d.m133693M();
                if (m133693M >= 0) {
                    m133713i(m133693M, true);
                    return;
                }
                return;
            }
            if (mo43276Z.equals("action.open.story_archive") && (m133694N = this.f123857d.m133694N()) >= 0) {
                m133713i(m133694N, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m133712h(int i11) {
        ProfileQuickAccessLayoutManager profileQuickAccessLayoutManager;
        FeedRecyclerView feedRecyclerView = this.f123855b;
        if (feedRecyclerView != null && feedRecyclerView.getHeight() != 0 && (profileQuickAccessLayoutManager = this.f123856c) != null && profileQuickAccessLayoutManager.m9737T1() == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m133713i(int i11, boolean z11) {
        FeedRecyclerView feedRecyclerView = this.f123855b;
        if (feedRecyclerView != null) {
            this.f123864k = i11;
            feedRecyclerView.removeCallbacks(this.f123865l);
            this.f123855b.removeCallbacks(this.f123866m);
            this.f123855b.post(this.f123865l.mo133723s0(e.m133724a(true, AbstractC23136l9.m118742r(48.0f))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m133714j(int i11, e eVar) {
        boolean z11;
        boolean z12 = false;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            C25954b c25954b = this.f123857d;
            if (c25954b != null && c25954b.mo10003k() >= i11) {
                z12 = true;
            }
            if (z11 && z12 && !m133712h(i11)) {
                if (eVar != null && eVar.f123873a) {
                    this.f123856c.m9721B2(i11, eVar.f123874b);
                } else {
                    this.f123856c.mo9756v1(i11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m133715e() {
        ViewGroup viewGroup = this.f123854a;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.f123854a.getLayoutParams().height = 0;
        }
    }

    /* renamed from: f */
    public void m133716f() {
        FeedRecyclerView feedRecyclerView = this.f123855b;
        if (feedRecyclerView != null) {
            feedRecyclerView.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void m133717g(View view, Context context) {
        this.f123859f = new C23528a(context);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(AbstractC6918a0.quick_access_layout_container);
        this.f123854a = viewGroup;
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.f123855b = (FeedRecyclerView) view.findViewById(AbstractC6918a0.section_photo_quick_access_list);
        this.f123858e = (ProfileSkeletonView) view.findViewById(AbstractC6918a0.quick_access_skeleton);
        this.f123857d = new C25954b(this.f123859f);
        ProfileQuickAccessLayoutManager profileQuickAccessLayoutManager = new ProfileQuickAccessLayoutManager(context);
        this.f123856c = profileQuickAccessLayoutManager;
        profileQuickAccessLayoutManager.m9723C2(0);
        C25957e c25957e = new C25957e();
        c25957e.m133726l(AbstractC23136l9.m118742r(8.0f));
        c25957e.m133727m(AbstractC23136l9.m118742r(16.0f));
        c25957e.m133728n(AbstractC23136l9.m118742r(16.0f));
        this.f123855b.setAdapter(this.f123857d);
        this.f123855b.setLayoutManager(this.f123856c);
        this.f123855b.m9816A(c25957e);
        AbstractC20826v0.m108780Q0(this.f123855b);
        this.f123855b.setCatchTouchEventListener(new a());
        this.f123855b.m9826E(new b());
    }

    /* renamed from: k */
    public void m133718k(C2961d1 c2961d1) {
        boolean z11;
        if (c2961d1 != null && c2961d1.f11676a != null) {
            int m14019a = c2961d1.m14019a();
            this.f123863j = m14019a;
            ProfileQuickAccessLayoutManager profileQuickAccessLayoutManager = this.f123856c;
            if (m14019a == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            profileQuickAccessLayoutManager.m46419N2(z11);
            this.f123857d.m133699S(c2961d1, this.f123860g);
            this.f123857d.m10008p();
            m133711d();
        }
    }

    /* renamed from: l */
    public void m133719l(FeedBaseAdapter.InterfaceC8049z interfaceC8049z) {
        this.f123860g = interfaceC8049z;
    }

    /* renamed from: m */
    public void m133720m() {
        ViewGroup viewGroup = this.f123854a;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            this.f123854a.getLayoutParams().height = -2;
        }
    }

    /* renamed from: n */
    public void m133721n() {
        ProfileSkeletonView profileSkeletonView;
        FeedRecyclerView feedRecyclerView = this.f123855b;
        if (feedRecyclerView != null && (profileSkeletonView = this.f123858e) != null && this.f123861h != feedRecyclerView) {
            this.f123861h = feedRecyclerView;
            this.f123862i.m110549c(feedRecyclerView, profileSkeletonView);
        }
    }

    /* renamed from: o */
    public void m133722o() {
        ProfileSkeletonView profileSkeletonView = this.f123858e;
        if (profileSkeletonView != null) {
            profileSkeletonView.setSkeletonLayoutType(9);
            this.f123858e.setVisibility(0);
            this.f123861h = this.f123858e;
        }
    }
}
