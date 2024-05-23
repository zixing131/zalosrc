package com.zing.zalo.p077ui.zalocloud.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import bc0.C2742i;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.bottomsheet.ToolStorageDetailFilterBottomSheet;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.widget.layoutmanager.LinearLayoutManagerFixed;
import com.zing.zalo.p077ui.zalocloud.home.CloudMediaThreadsListView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kc0.C21672k;
import kc0.C21677p;
import p649xl.C29758d2;
import p649xl.C30125xf;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import tg0.C26676b;

/* loaded from: classes6.dex */
public final class CloudMediaThreadsListView extends SlidableZaloView {
    public static final C13880a Companion = new C13880a(null);

    /* renamed from: P0 */
    private C29758d2 f71617P0;

    /* renamed from: Q0 */
    private C30125xf f71618Q0;

    /* renamed from: R0 */
    private String f71619R0 = "Largest";

    /* renamed from: S0 */
    private final InterfaceC24854k f71620S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f71621T0;

    /* renamed from: U0 */
    private final InterfaceC24854k f71622U0;

    /* renamed from: V0 */
    private final C13881b f71623V0;

    /* renamed from: W0 */
    private final List f71624W0;

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$a */
    /* loaded from: classes6.dex */
    public static final class C13880a {
        private C13880a() {
        }

        public /* synthetic */ C13880a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$b */
    /* loaded from: classes6.dex */
    public static final class C13881b implements StorageUsageItemModuleViewKt.InterfaceC12460b {
        C13881b() {
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: a */
        public boolean mo69967a(String str) {
            AbstractC19074t.m100208f(str, "ownerId");
            return false;
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: b */
        public boolean mo69968b() {
            return false;
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: c */
        public boolean mo69969c(ThreadStorageInfo threadStorageInfo) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            return false;
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: d */
        public void mo69970d(ThreadStorageInfo threadStorageInfo) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            C17487o0 m92662fJ = CloudMediaThreadsListView.this.m92662fJ();
            if (m92662fJ != null) {
                CloudMediaThreadsListView.this.m77268xM(m92662fJ, threadStorageInfo);
                C26676b.f126324a.m136964C(threadStorageInfo);
            }
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: e */
        public void mo69971e(ThreadStorageInfo threadStorageInfo, boolean z11) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$c */
    /* loaded from: classes6.dex */
    public static final class C13882c extends AbstractC19075u implements InterfaceC18505l {
        C13882c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77270a(int i11) {
            CloudMediaThreadsListView.this.m77262rM().m10009q(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77270a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$d */
    /* loaded from: classes6.dex */
    static final class C13883d extends AbstractC19075u implements InterfaceC18494a {
        C13883d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2742i mo12V4() {
            return new C2742i(CloudMediaThreadsListView.this.f71623V0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$e */
    /* loaded from: classes6.dex */
    public static final class C13884e extends AbstractC19075u implements InterfaceC18505l {
        C13884e() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m77273c(CloudMediaThreadsListView cloudMediaThreadsListView) {
            AbstractC19074t.m100208f(cloudMediaThreadsListView, "this$0");
            cloudMediaThreadsListView.m77261qM(cloudMediaThreadsListView.m77263sM().m9745c2(), cloudMediaThreadsListView.m77263sM().m9740Y1());
        }

        /* renamed from: b */
        public final void m77274b(List list) {
            C29758d2 c29758d2 = null;
            if (list.isEmpty()) {
                C29758d2 c29758d22 = CloudMediaThreadsListView.this.f71617P0;
                if (c29758d22 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29758d22 = null;
                }
                c29758d22.f137475s.setVisibility(8);
                C30125xf c30125xf = CloudMediaThreadsListView.this.f71618Q0;
                if (c30125xf == null) {
                    AbstractC19074t.m100223u("dockedFilterBinding");
                    c30125xf = null;
                }
                c30125xf.getRoot().setVisibility(8);
                C29758d2 c29758d23 = CloudMediaThreadsListView.this.f71617P0;
                if (c29758d23 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29758d23 = null;
                }
                c29758d23.f137474r.setVisibility(0);
                C29758d2 c29758d24 = CloudMediaThreadsListView.this.f71617P0;
                if (c29758d24 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29758d2 = c29758d24;
                }
                c29758d2.f137474r.setState(MultiStateView.EnumC15914e.EMPTY);
                return;
            }
            C29758d2 c29758d25 = CloudMediaThreadsListView.this.f71617P0;
            if (c29758d25 == null) {
                AbstractC19074t.m100223u("binding");
                c29758d25 = null;
            }
            c29758d25.f137475s.setVisibility(0);
            C30125xf c30125xf2 = CloudMediaThreadsListView.this.f71618Q0;
            if (c30125xf2 == null) {
                AbstractC19074t.m100223u("dockedFilterBinding");
                c30125xf2 = null;
            }
            c30125xf2.getRoot().setVisibility(0);
            C29758d2 c29758d26 = CloudMediaThreadsListView.this.f71617P0;
            if (c29758d26 == null) {
                AbstractC19074t.m100223u("binding");
                c29758d26 = null;
            }
            c29758d26.f137474r.setVisibility(8);
            C29758d2 c29758d27 = CloudMediaThreadsListView.this.f71617P0;
            if (c29758d27 == null) {
                AbstractC19074t.m100223u("binding");
                c29758d27 = null;
            }
            c29758d27.f137474r.setState(MultiStateView.EnumC15914e.CONTENT);
            C2742i m77262rM = CloudMediaThreadsListView.this.m77262rM();
            AbstractC19074t.m100205c(list);
            m77262rM.m13303N(list);
            C29758d2 c29758d28 = CloudMediaThreadsListView.this.f71617P0;
            if (c29758d28 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29758d2 = c29758d28;
            }
            RecyclerView recyclerView = c29758d2.f137475s;
            final CloudMediaThreadsListView cloudMediaThreadsListView = CloudMediaThreadsListView.this;
            recyclerView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zalocloud.home.d
                @Override // java.lang.Runnable
                public final void run() {
                    CloudMediaThreadsListView.C13884e.m77273c(CloudMediaThreadsListView.this);
                }
            }, 500L);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77274b((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$f */
    /* loaded from: classes6.dex */
    public static final class C13885f extends AbstractC19075u implements InterfaceC18505l {
        C13885f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77275a(String str) {
            CloudMediaThreadsListView cloudMediaThreadsListView = CloudMediaThreadsListView.this;
            AbstractC19074t.m100205c(str);
            cloudMediaThreadsListView.f71619R0 = str;
            C30125xf c30125xf = CloudMediaThreadsListView.this.f71618Q0;
            C29758d2 c29758d2 = null;
            if (c30125xf == null) {
                AbstractC19074t.m100223u("dockedFilterBinding");
                c30125xf = null;
            }
            Button button = c30125xf.f139977q;
            ToolStorageDetailFilterBottomSheet.C13332a c13332a = ToolStorageDetailFilterBottomSheet.Companion;
            C29758d2 c29758d22 = CloudMediaThreadsListView.this.f71617P0;
            if (c29758d22 == null) {
                AbstractC19074t.m100223u("binding");
                c29758d22 = null;
            }
            Context context = c29758d22.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            button.setText(c13332a.m74844a(context, CloudMediaThreadsListView.this.f71619R0));
            C30125xf c30125xf2 = CloudMediaThreadsListView.this.f71618Q0;
            if (c30125xf2 == null) {
                AbstractC19074t.m100223u("dockedFilterBinding");
                c30125xf2 = null;
            }
            LinearLayout root = c30125xf2.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            if (root.getVisibility() == 0) {
                C29758d2 c29758d23 = CloudMediaThreadsListView.this.f71617P0;
                if (c29758d23 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29758d2 = c29758d23;
                }
                c29758d2.f137475s.m9837K1(0);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77275a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$g */
    /* loaded from: classes6.dex */
    public static final class C13886g extends RecyclerView.AbstractC1892s {
        C13886g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            int m9740Y1 = CloudMediaThreadsListView.this.m77263sM().m9740Y1();
            CloudMediaThreadsListView.this.m77261qM(CloudMediaThreadsListView.this.m77263sM().m9745c2(), m9740Y1);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$h */
    /* loaded from: classes6.dex */
    static final class C13887h extends AbstractC19075u implements InterfaceC18494a {
        C13887h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManagerFixed mo12V4() {
            return new LinearLayoutManagerFixed(CloudMediaThreadsListView.this.getContext(), 1, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$i */
    /* loaded from: classes6.dex */
    public static final class C13888i implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71632p;

        C13888i(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71632p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71632p;
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
            this.f71632p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$j */
    /* loaded from: classes6.dex */
    public static final class C13889j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f71633q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13889j(ZaloView zaloView) {
            super(0);
            this.f71633q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f71633q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$k */
    /* loaded from: classes6.dex */
    public static final class C13890k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f71634q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13890k(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f71634q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f71634q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.home.CloudMediaThreadsListView$l */
    /* loaded from: classes6.dex */
    static final class C13891l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13891l f71635q = new C13891l();

        C13891l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return C21677p.Companion.m111768a();
        }
    }

    public CloudMediaThreadsListView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        List m131505m;
        m129210a = AbstractC24856m.m129210a(new C13887h());
        this.f71620S0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13883d());
        this.f71621T0 = m129210a2;
        this.f71622U0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C21672k.class), new C13890k(new C13889j(this)), C13891l.f71635q);
        this.f71623V0 = new C13881b();
        m131505m = AbstractC25368s.m131505m("Largest", "Newest", "Oldest");
        this.f71624W0 = m131505m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final void m77261qM(int i11, int i12) {
        m77264tM().m111740p0(i12, i11, new C13882c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public final C2742i m77262rM() {
        return (C2742i) this.f71621T0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public final LinearLayoutManagerFixed m77263sM() {
        return (LinearLayoutManagerFixed) this.f71620S0.getValue();
    }

    /* renamed from: tM */
    private final C21672k m77264tM() {
        return (C21672k) this.f71622U0.getValue();
    }

    /* renamed from: uM */
    private final void m77265uM() {
        m77264tM().m111724D0().m9219j(m92657cJ(), new C13888i(new C13884e()));
        m77264tM().m111746x0().m9219j(m92657cJ(), new C13888i(new C13885f()));
        m77264tM().m111728K0(true, true);
    }

    /* renamed from: vM */
    private final void m77266vM() {
        C30125xf c30125xf = this.f71618Q0;
        C29758d2 c29758d2 = null;
        if (c30125xf == null) {
            AbstractC19074t.m100223u("dockedFilterBinding");
            c30125xf = null;
        }
        c30125xf.f139978r.setVisibility(8);
        C30125xf c30125xf2 = this.f71618Q0;
        if (c30125xf2 == null) {
            AbstractC19074t.m100223u("dockedFilterBinding");
            c30125xf2 = null;
        }
        c30125xf2.f139977q.setOnClickListener(new View.OnClickListener() { // from class: bc0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloudMediaThreadsListView.m77267wM(CloudMediaThreadsListView.this, view);
            }
        });
        C29758d2 c29758d22 = this.f71617P0;
        if (c29758d22 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29758d2 = c29758d22;
        }
        RecyclerView recyclerView = c29758d2.f137475s;
        recyclerView.setLayoutManager(m77263sM());
        recyclerView.setAdapter(m77262rM());
        recyclerView.m9826E(new C13886g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m77267wM(CloudMediaThreadsListView cloudMediaThreadsListView, View view) {
        AbstractC19074t.m100208f(cloudMediaThreadsListView, "this$0");
        cloudMediaThreadsListView.m77269yM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final void m77268xM(C17487o0 c17487o0, ThreadStorageInfo threadStorageInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("details", threadStorageInfo);
        bundle.putString("access_flow", ToolStorageDetailPage.EnumC13333a.f68485s.m74885c());
        bundle.putCharSequenceArrayList("thread_ids_list", new ArrayList<>(m77264tM().m111741q0()));
        c17487o0.m93066i2(ToolStorageDetailView.class, bundle, 131, 1, true);
    }

    /* renamed from: yM */
    private final void m77269yM() {
        try {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("EXTRA_PARAM_LIST_FILTER", new ArrayList<>(this.f71624W0));
            bundle.putInt("EXTRA_PARAM_SELECTED_POS", this.f71624W0.indexOf(this.f71619R0));
            m92693xK().mo89694j2(ToolStorageDetailFilterBottomSheet.class, bundle, 130, ToolStorageDetailFilterBottomSheet.Companion.m74845b(), 1, true);
        } catch (Exception e11) {
            C26676b.m136954d("Cloudmedia_Threads", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.cloud_media_threads_list_view, viewGroup, false);
        C29758d2 m147837a = C29758d2.m147837a(inflate);
        AbstractC19074t.m100207e(m147837a, "bind(...)");
        this.f71617P0 = m147837a;
        if (m147837a == null) {
            AbstractC19074t.m100223u("binding");
            m147837a = null;
        }
        C30125xf c30125xf = m147837a.f137473q;
        AbstractC19074t.m100207e(c30125xf, "dockedFiler");
        this.f71618Q0 = c30125xf;
        m77266vM();
        m77265uM();
        AbstractC19074t.m100205c(inflate);
        return inflate;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "Cloudmedia_Threads";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 131 && i12 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("need_reload", false)) {
                    mo50035CK(-1, null);
                    m77264tM().m111739l0();
                    m77264tM().m111728K0(false, true);
                }
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudHome", e11);
            }
        }
        if (i11 == 130 && i12 == -1 && intent != null) {
            String str = (String) this.f71624W0.get(intent.getIntExtra("EXTRA_PARAM_SELECTED_POS", 0));
            m77264tM().m111737W0(str);
            m77261qM(m77263sM().m9745c2(), m77263sM().m9740Y1());
            C26676b c26676b = C26676b.f126324a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            c26676b.m136991d0(lowerCase);
        }
        super.onActivityResult(i11, i12, intent);
    }
}
