package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import ck.C3564e;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7260x4;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.OALocationsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23152n3;
import org.json.JSONArray;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import vg.AbstractC28034c7;

/* loaded from: classes6.dex */
public class OALocationsView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    View f75669P0;

    /* renamed from: Q0 */
    ListView f75670Q0;

    /* renamed from: R0 */
    C7260x4 f75671R0;

    /* renamed from: T0 */
    C23528a f75673T0;

    /* renamed from: U0 */
    String f75674U0;

    /* renamed from: V0 */
    MultiStateView f75675V0;

    /* renamed from: W0 */
    SwipeRefreshListView f75676W0;

    /* renamed from: S0 */
    List f75672S0 = new ArrayList();

    /* renamed from: X0 */
    boolean f75677X0 = false;

    /* renamed from: Y0 */
    InterfaceC20094a f75678Y0 = new C14699b();

    /* renamed from: com.zing.zalo.ui.zviews.OALocationsView$a */
    /* loaded from: classes6.dex */
    class C14698a extends AbstractC28034c7 {
        C14698a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    OALocationsView.this.f75671R0.m37018c(false);
                    OALocationsView.this.f75671R0.notifyDataSetChanged();
                } else {
                    OALocationsView.this.f75671R0.m37018c(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OALocationsView$b */
    /* loaded from: classes6.dex */
    public class C14699b implements InterfaceC20094a {
        C14699b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82367e() {
            try {
                SwipeRefreshListView swipeRefreshListView = OALocationsView.this.f75676W0;
                if (swipeRefreshListView != null) {
                    swipeRefreshListView.setRefreshing(false);
                }
                if (OALocationsView.this.f75672S0.size() > 0) {
                    OALocationsView.this.f75675V0.setVisibility(8);
                    OALocationsView.this.f75670Q0.setVisibility(0);
                    OALocationsView oALocationsView = OALocationsView.this;
                    oALocationsView.f75671R0.m37017b(oALocationsView.f75672S0);
                    OALocationsView.this.f75671R0.notifyDataSetChanged();
                    return;
                }
                OALocationsView.this.f75675V0.setVisibility(0);
                OALocationsView.this.f75675V0.setState(MultiStateView.EnumC15914e.EMPTY);
                OALocationsView oALocationsView2 = OALocationsView.this;
                oALocationsView2.f75675V0.setEmptyViewString(oALocationsView2.m92652XI(AbstractC8020f0.empty_list));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82368f(C20096c c20096c) {
            try {
                SwipeRefreshListView swipeRefreshListView = OALocationsView.this.f75676W0;
                if (swipeRefreshListView != null) {
                    swipeRefreshListView.setRefreshing(false);
                }
                String m92652XI = OALocationsView.this.m92652XI(AbstractC8020f0.UNKNOWN_MSG);
                MultiStateView.EnumC15915f enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                if (c20096c != null && c20096c.m104491c() == 50001) {
                    m92652XI = OALocationsView.this.m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG);
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                }
                OALocationsView.this.m82364pM(enumC15915f, m92652XI);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            OALocationsView oALocationsView = OALocationsView.this;
            oALocationsView.f75677X0 = false;
            oALocationsView.m82362kM(new Runnable() { // from class: com.zing.zalo.ui.zviews.n20
                @Override // java.lang.Runnable
                public final void run() {
                    OALocationsView.C14699b.this.m82368f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            if (obj != null) {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    JSONArray jSONArray = null;
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        if (!jSONObject.isNull("oalocations")) {
                            jSONArray = jSONObject.getJSONArray("oalocations");
                        }
                        if (jSONArray != null) {
                            OALocationsView.this.f75672S0.clear();
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                                if (jSONObject3 != null) {
                                    OALocationsView.this.f75672S0.add(new C3564e(jSONObject3));
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            OALocationsView oALocationsView = OALocationsView.this;
            oALocationsView.f75677X0 = false;
            oALocationsView.m82362kM(new Runnable() { // from class: com.zing.zalo.ui.zviews.m20
                @Override // java.lang.Runnable
                public final void run() {
                    OALocationsView.C14699b.this.m82367e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m82358lM() {
        m82361jM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m82359mM() {
        m82361jM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m82360nM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            if (this.f72421L0.m92676n2() != null && !this.f72421L0.m92676n2().isFinishing() && !this.f72421L0.mo60294yp()) {
                C3564e c3564e = (C3564e) this.f75672S0.get(i11);
                AbstractC23152n3.m119042f0(this.f72421L0.m92648SI(), c3564e.m18106a(), c3564e.m18108c(), c3564e.m18107b());
                AbstractC23647d.m123906p("870031");
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        try {
            this.f75673T0 = new C23528a(this.f72421L0.m92648SI());
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                this.f75674U0 = m92642L3.getString("extra_oa_id");
            }
            if (TextUtils.isEmpty(this.f75674U0)) {
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_oa_locations, viewGroup, false);
        this.f75669P0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBar actionBar;
        super.mo37493TJ();
        try {
            if (this.f72421L0.m92648SI() != null && this.f72421L0.m92674mJ() && (actionBar = this.f88760a0) != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setTitle(m92652XI(AbstractC8020f0.str_list_locations));
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        MultiStateView multiStateView = (MultiStateView) this.f75669P0.findViewById(AbstractC6918a0.multi_state);
        this.f75675V0 = multiStateView;
        multiStateView.setEnableSwapStateAnim(false);
        this.f75675V0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.j20
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                OALocationsView.this.m82358lM();
            }
        });
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f75669P0.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f75676W0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.k20
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                OALocationsView.this.m82359mM();
            }
        });
        this.f75670Q0 = this.f75676W0.f83579m0;
        C7260x4 c7260x4 = new C7260x4(this.f72421L0.m92648SI(), this.f75672S0, this.f75673T0);
        this.f75671R0 = c7260x4;
        this.f75670Q0.setAdapter((ListAdapter) c7260x4);
        this.f75670Q0.setOnScrollListener(new C14698a());
        this.f75670Q0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.l20
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i11, long j11) {
                OALocationsView.this.m82360nM(adapterView, view2, i11, j11);
            }
        });
        m82361jM(true);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OALocationsView";
    }

    /* renamed from: jM */
    void m82361jM(boolean z11) {
        if (this.f75677X0) {
            return;
        }
        this.f75677X0 = true;
        if (z11) {
            m82363oM();
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f75678Y0);
        c0766k.mo1518Q8(this.f75674U0);
    }

    /* renamed from: kM */
    void m82362kM(Runnable runnable) {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(runnable);
        }
    }

    /* renamed from: oM */
    void m82363oM() {
        MultiStateView multiStateView = this.f75675V0;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            this.f75675V0.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    /* renamed from: pM */
    void m82364pM(MultiStateView.EnumC15915f enumC15915f, String str) {
        try {
            C7260x4 c7260x4 = this.f75671R0;
            if (c7260x4 != null && c7260x4.getCount() > 0) {
                this.f75675V0.setVisibility(8);
                this.f75670Q0.setVisibility(0);
            } else {
                this.f75670Q0.setVisibility(8);
                this.f75675V0.setVisibility(0);
                this.f75675V0.setState(MultiStateView.EnumC15914e.ERROR);
                this.f75675V0.setErrorType(enumC15915f);
                this.f75675V0.setErrorTitleString(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
