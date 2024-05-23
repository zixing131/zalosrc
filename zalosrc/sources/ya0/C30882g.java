package ya0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageBaseLargestItemModuleView;
import com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageLargestFileItemModuleView;
import com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageLargestMediaLItemModuleView;
import com.zing.zalo.p077ui.toolstorage.overview.moduleviews.ToolStorageMoreItemModuleView;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import p227i3.C20218v;

/* renamed from: ya0.g */
/* loaded from: classes6.dex */
public final class C30882g extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final InterfaceC18494a f142473r;

    /* renamed from: s */
    private final ExecutorService f142474s;

    /* renamed from: t */
    private final HashMap f142475t;

    /* renamed from: u */
    private ArrayList f142476u;

    /* renamed from: ya0.g$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ya0.g$b */
    /* loaded from: classes6.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private ToolStorageBaseLargestItemModuleView f142477I;

        /* renamed from: J */
        final /* synthetic */ C30882g f142478J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C30882g c30882g, View view, int i11) {
            super(view);
            ToolStorageBaseLargestItemModuleView toolStorageBaseLargestItemModuleView;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f142478J = c30882g;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        toolStorageBaseLargestItemModuleView = null;
                    } else {
                        toolStorageBaseLargestItemModuleView = (ToolStorageMoreItemModuleView) view;
                    }
                } else {
                    toolStorageBaseLargestItemModuleView = (ToolStorageLargestFileItemModuleView) view;
                }
            } else {
                toolStorageBaseLargestItemModuleView = (ToolStorageLargestMediaLItemModuleView) view;
            }
            this.f142477I = toolStorageBaseLargestItemModuleView;
        }

        /* renamed from: i0 */
        public final ToolStorageBaseLargestItemModuleView m150103i0() {
            return this.f142477I;
        }
    }

    public C30882g(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onClickedItem");
        this.f142473r = interfaceC18494a;
        this.f142474s = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("TSBigOldFiles-" + System.currentTimeMillis()));
        this.f142475t = new HashMap();
        this.f142476u = new ArrayList();
    }

    /* renamed from: O */
    private final C13380a m150095O(int i11) {
        Object obj = this.f142476u.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return (C13380a) obj;
    }

    /* renamed from: Q */
    public static final void m150096Q(C13380a c13380a, C30882g c30882g, int i11) {
        AbstractC19074t.m100208f(c13380a, "$item");
        AbstractC19074t.m100208f(c30882g, "this$0");
        try {
            c13380a.m75089k().m94860C2(false);
            AbstractC19444a.m101695c(new Runnable() { // from class: ya0.f

                /* renamed from: q */
                public final /* synthetic */ int f142472q;

                public /* synthetic */ RunnableC30881f(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C30882g.m150097R(C30882g.this, r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageLargestFilesAdapter", e11);
        }
    }

    /* renamed from: R */
    public static final void m150097R(C30882g c30882g, int i11) {
        AbstractC19074t.m100208f(c30882g, "this$0");
        c30882g.m10009q(i11);
    }

    /* renamed from: S */
    public static final void m150098S(C30882g c30882g, View view) {
        AbstractC19074t.m100208f(c30882g, "this$0");
        c30882g.f142473r.mo12V4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        C13380a m150095O = m150095O(i11);
        C17945a0 m75089k = m150095O.m75089k();
        if (m75089k != null && m75089k.m95306y8() && !AbstractC23041d2.m118194A(m150095O.m75089k().m94947M4())) {
            if (!this.f142475t.containsKey(Integer.valueOf(i11))) {
                Future<?> submit = this.f142474s.submit(new Runnable() { // from class: ya0.d

                    /* renamed from: q */
                    public final /* synthetic */ C30882g f142468q;

                    /* renamed from: r */
                    public final /* synthetic */ int f142469r;

                    public /* synthetic */ RunnableC30879d(C30882g this, int i112) {
                        r2 = this;
                        r3 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C30882g.m150096Q(C13380a.this, r2, r3);
                    }
                });
                Integer valueOf = Integer.valueOf(i112);
                HashMap hashMap = this.f142475t;
                AbstractC19074t.m100205c(submit);
                hashMap.put(valueOf, submit);
                bVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: ya0.e
                    public /* synthetic */ ViewOnClickListenerC30880e() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C30882g.m150098S(C30882g.this, view);
                    }
                });
            }
        }
        ToolStorageBaseLargestItemModuleView m150103i0 = bVar.m150103i0();
        if (m150103i0 != null) {
            m150103i0.mo75450V(m150095O);
        }
        bVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: ya0.e
            public /* synthetic */ ViewOnClickListenerC30880e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C30882g.m150098S(C30882g.this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View toolStorageLargestMediaLItemModuleView;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    toolStorageLargestMediaLItemModuleView = new View(viewGroup.getContext());
                } else {
                    toolStorageLargestMediaLItemModuleView = new ToolStorageMoreItemModuleView(viewGroup.getContext());
                }
            } else {
                toolStorageLargestMediaLItemModuleView = new ToolStorageLargestFileItemModuleView(viewGroup.getContext());
            }
        } else {
            toolStorageLargestMediaLItemModuleView = new ToolStorageLargestMediaLItemModuleView(viewGroup.getContext());
        }
        return new b(this, toolStorageLargestMediaLItemModuleView, i11);
    }

    /* renamed from: U */
    public final void m150101U() {
        this.f142474s.shutdownNow();
        Collection values = this.f142475t.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f142475t.clear();
    }

    /* renamed from: V */
    public final void m150102V(List list) {
        AbstractC19074t.m100208f(list, "listItems");
        this.f142476u.clear();
        this.f142476u.addAll(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f142476u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C13380a m150095O = m150095O(i11);
        if (m150095O.m75094p() == 1) {
            if (m150095O.m75103y()) {
                return 1;
            }
            if (m150095O.m75100v() || m150095O.m75076F()) {
                return 2;
            }
        } else if (m150095O.m75094p() == 2) {
            return 3;
        }
        return 4;
    }
}
