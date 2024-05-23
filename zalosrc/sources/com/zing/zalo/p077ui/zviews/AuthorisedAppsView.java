package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import au.AbstractC2364o0;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.AuthorisedAppsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.thirdparty.model.AuthorisedApp;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import z30.C31212a;

/* loaded from: classes6.dex */
public class AuthorisedAppsView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: b1 */
    protected static final String f72186b1 = "AuthorisedAppsView";

    /* renamed from: U0 */
    volatile C31212a f72192U0;

    /* renamed from: V0 */
    C23528a f72193V0;

    /* renamed from: W0 */
    ListView f72194W0;

    /* renamed from: X0 */
    SwipeRefreshListView f72195X0;

    /* renamed from: Y0 */
    MultiStateView f72196Y0;

    /* renamed from: Z0 */
    View f72197Z0;

    /* renamed from: P0 */
    private AtomicInteger f72187P0 = new AtomicInteger(0);

    /* renamed from: Q0 */
    AtomicBoolean f72188Q0 = new AtomicBoolean(false);

    /* renamed from: R0 */
    InterfaceC0765j f72189R0 = new C0766k();

    /* renamed from: S0 */
    volatile boolean f72190S0 = false;

    /* renamed from: T0 */
    volatile boolean f72191T0 = false;

    /* renamed from: a1 */
    InterfaceC20094a f72198a1 = new C14040b();

    /* renamed from: com.zing.zalo.ui.zviews.AuthorisedAppsView$a */
    /* loaded from: classes6.dex */
    class C14039a implements AbsListView.OnScrollListener {
        C14039a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            if (i11 + i12 >= i13 - 1 && !AuthorisedAppsView.this.f72190S0 && AuthorisedAppsView.this.f72187P0.get() * 25 == AuthorisedAppsView.this.f72192U0.getCount() && AuthorisedAppsView.this.f72188Q0.get()) {
                String str = AuthorisedAppsView.f72186b1;
                AuthorisedAppsView.this.m78133oM(false);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 0) {
                AuthorisedAppsView.this.f72192U0.notifyDataSetChanged();
            } else {
                AuthorisedAppsView.this.f72195X0.m88202K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AuthorisedAppsView$b */
    /* loaded from: classes6.dex */
    public class C14040b implements InterfaceC20094a {
        C14040b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78138f(List list) {
            boolean z11;
            String str = AuthorisedAppsView.f72186b1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mCurrentPage:");
            sb2.append(AuthorisedAppsView.this.f72187P0.get());
            if (AuthorisedAppsView.this.f72191T0) {
                AuthorisedAppsView.this.f72195X0.setRefreshing(false);
                AuthorisedAppsView.this.f72191T0 = false;
            }
            if (AuthorisedAppsView.this.f72187P0.get() == 1) {
                AuthorisedAppsView.this.f72192U0.m35953b();
            }
            AtomicBoolean atomicBoolean = AuthorisedAppsView.this.f72188Q0;
            if (list.size() == 25) {
                z11 = true;
            } else {
                z11 = false;
            }
            atomicBoolean.set(z11);
            AuthorisedAppsView.this.f72192U0.m35952a(list);
            AuthorisedAppsView.this.m78131Q7(false);
            AuthorisedAppsView.this.m78132kM(true, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m78139g() {
            AuthorisedAppsView.this.m78131Q7(false);
            AuthorisedAppsView.this.m78132kM(false, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m78140h(C20096c c20096c) {
            try {
                int m104491c = c20096c.m104491c();
                AuthorisedAppsView.this.m78131Q7(false);
                AuthorisedAppsView.this.m78132kM(false, m104491c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            String str = AuthorisedAppsView.f72186b1;
            c20096c.toString();
            if (AuthorisedAppsView.this.f72421L0.m92648SI() == null) {
                return;
            }
            try {
                AuthorisedAppsView.this.f72195X0.setRefreshing(false);
                AuthorisedAppsView.this.f72188Q0.set(false);
                AuthorisedAppsView.this.m78134pM(false);
                AuthorisedAppsView.this.f72190S0 = false;
                AuthorisedAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthorisedAppsView.C14040b.this.m78140h(c20096c);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = AuthorisedAppsView.f72186b1;
            obj.toString();
            if (AuthorisedAppsView.this.f72421L0.m92648SI() == null) {
                return;
            }
            AuthorisedAppsView.this.m78134pM(false);
            AuthorisedAppsView.this.f72190S0 = false;
            final ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(new AuthorisedApp(jSONArray.getJSONObject(i11)));
                }
                AuthorisedAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthorisedAppsView.C14040b.this.m78138f(arrayList);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(AuthorisedAppsView.f72186b1, e11);
                AuthorisedAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthorisedAppsView.C14040b.this.m78139g();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m78128lM() {
        m78131Q7(true);
        m78133oM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m78129mM() {
        if (!C23055e5.m118271f()) {
            this.f72195X0.setRefreshing(false);
            this.f72195X0.m88209V();
        } else {
            this.f72195X0.m88202K();
            this.f72191T0 = true;
            m78133oM(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m78130nM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            AuthorisedApp authorisedApp = (AuthorisedApp) this.f72192U0.getItem(i11 - this.f72194W0.getHeaderViewsCount());
            if (authorisedApp.m56633n()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_data", authorisedApp);
            if (this.f72421L0.m92648SI() != null) {
                this.f72421L0.m92662fJ().m93066i2(AuthorisedAppDetailView.class, bundle, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f72186b1, e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        this.f72189R0.mo1704o8(this.f72198a1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        try {
            if (this.f72197Z0 == null) {
                this.f72197Z0 = actionBarMenu.m92744k(0, AbstractC7409c0.holo_circular_progress_bar_abs);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.authorised_apps_view, viewGroup, false);
        MultiStateView multiStateView = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f72196Y0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.q0
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                AuthorisedAppsView.this.m78128lM();
            }
        });
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) inflate.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f72195X0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.r0
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                AuthorisedAppsView.this.m78129mM();
            }
        });
        ListView listView = this.f72195X0.f83579m0;
        this.f72194W0 = listView;
        listView.setBackgroundColor(C23212s8.m119607o(listView.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        this.f72192U0 = new C31212a(this.f72421L0.m92648SI().getApplicationContext());
        this.f72194W0.setAdapter((ListAdapter) this.f72192U0);
        this.f72194W0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.s0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                AuthorisedAppsView.this.m78130nM(adapterView, view, i11, j11);
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.authorised_app_list_title));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q7 */
    void m78131Q7(boolean z11) {
        try {
            if (z11) {
                this.f72196Y0.setVisibility(0);
                this.f72196Y0.setState(MultiStateView.EnumC15914e.LOADING);
            } else {
                this.f72196Y0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ThirdpartyView";
    }

    /* renamed from: kM */
    void m78132kM(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                if (this.f72192U0.getCount() <= 0) {
                    this.f72192U0.m35953b();
                    this.f72196Y0.setVisibility(0);
                    this.f72196Y0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.authorised_app_list_empty_message));
                    this.f72196Y0.setState(MultiStateView.EnumC15914e.EMPTY);
                    this.f72195X0.setVisibility(4);
                } else {
                    this.f72196Y0.setVisibility(8);
                    this.f72195X0.setVisibility(0);
                }
            } else {
                if (this.f72187P0.get() == 1 && this.f72191T0) {
                    this.f72191T0 = false;
                }
                if (this.f72192U0.getCount() <= 0) {
                    this.f72195X0.setVisibility(8);
                    this.f72196Y0.setVisibility(0);
                    MultiStateView multiStateView = this.f72196Y0;
                    if (i11 == 50001) {
                        i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                    } else {
                        i12 = AbstractC8020f0.str_error_loadingList;
                    }
                    multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
                    this.f72196Y0.setState(MultiStateView.EnumC15914e.ERROR);
                    MultiStateView multiStateView2 = this.f72196Y0;
                    if (i11 == 50001) {
                        enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                    } else {
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    }
                    multiStateView2.setErrorType(enumC15915f);
                } else {
                    this.f72196Y0.setVisibility(8);
                    this.f72195X0.setVisibility(0);
                }
                this.f72187P0.decrementAndGet();
            }
            if (this.f72192U0 != null) {
                this.f72192U0.notifyDataSetChanged();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m78133oM(boolean z11) {
        if (!z11 && this.f72187P0.get() >= 1) {
            if (this.f72187P0.get() * 25 == this.f72192U0.getCount() && this.f72188Q0.get()) {
                this.f72187P0.incrementAndGet();
            } else {
                return;
            }
        } else {
            this.f72187P0.set(1);
        }
        if (this.f72192U0.getCount() > 0) {
            m78131Q7(false);
            m78134pM(true);
        } else {
            m78131Q7(true);
            m78134pM(false);
        }
        this.f72190S0 = true;
        this.f72189R0.mo1470K8(this.f72187P0.get(), 25);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 2001 && i12 == -1) {
            m78133oM(true);
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* renamed from: pM */
    public void m78134pM(boolean z11) {
        int i11;
        try {
            if (this.f72197Z0 != null && this.f72421L0.m92648SI() != null) {
                InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
                View view = this.f72197Z0;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                AbstractC2364o0.m12372o(m92676n2, view, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f72193V0 = new C23528a(this.f72421L0.m92648SI());
        this.f72194W0.setOnScrollListener(new C14039a());
        m78133oM(true);
    }
}
