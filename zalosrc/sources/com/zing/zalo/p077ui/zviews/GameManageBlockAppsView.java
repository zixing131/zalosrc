package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.GameManageBlockAppsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import ms.C23436b;
import org.json.JSONArray;
import org.json.JSONObject;
import p354n3.C23528a;
import p402os.C24546a;

/* loaded from: classes6.dex */
public class GameManageBlockAppsView extends SlidableZaloView implements C23436b.a, InterfaceC0733x {

    /* renamed from: c1 */
    protected static final String f73433c1 = "GameManageBlockAppsView";

    /* renamed from: P0 */
    ListView f73434P0;

    /* renamed from: Q0 */
    SwipeRefreshListView f73435Q0;

    /* renamed from: R0 */
    MultiStateView f73436R0;

    /* renamed from: T0 */
    volatile C23436b f73438T0;

    /* renamed from: U0 */
    C23528a f73439U0;

    /* renamed from: V0 */
    volatile C24546a f73440V0;

    /* renamed from: S0 */
    InterfaceC0765j f73437S0 = new C0766k();

    /* renamed from: W0 */
    AtomicInteger f73441W0 = new AtomicInteger(0);

    /* renamed from: X0 */
    AtomicBoolean f73442X0 = new AtomicBoolean(false);

    /* renamed from: Y0 */
    volatile boolean f73443Y0 = false;

    /* renamed from: Z0 */
    volatile boolean f73444Z0 = false;

    /* renamed from: a1 */
    InterfaceC20094a f73445a1 = new C14290b();

    /* renamed from: b1 */
    InterfaceC20094a f73446b1 = new C14291c();

    /* renamed from: com.zing.zalo.ui.zviews.GameManageBlockAppsView$a */
    /* loaded from: classes6.dex */
    class C14289a implements AbsListView.OnScrollListener {
        C14289a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            if (i11 + i12 >= i13 - 1 && !GameManageBlockAppsView.this.f73443Y0 && GameManageBlockAppsView.this.f73441W0.get() * 25 == GameManageBlockAppsView.this.f73438T0.getCount() && GameManageBlockAppsView.this.f73442X0.get()) {
                String str = GameManageBlockAppsView.f73433c1;
                GameManageBlockAppsView.this.m79799lM(false);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 0) {
                GameManageBlockAppsView.this.f73438T0.notifyDataSetChanged();
            } else {
                GameManageBlockAppsView.this.f73435Q0.m88202K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GameManageBlockAppsView$b */
    /* loaded from: classes6.dex */
    public class C14290b implements InterfaceC20094a {
        C14290b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m79803f(List list) {
            boolean z11;
            try {
                String str = GameManageBlockAppsView.f73433c1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCurrentPage:");
                sb2.append(GameManageBlockAppsView.this.f73441W0.get());
                if (GameManageBlockAppsView.this.f73444Z0) {
                    GameManageBlockAppsView.this.f73435Q0.setRefreshing(false);
                    GameManageBlockAppsView.this.f73444Z0 = false;
                }
                if (GameManageBlockAppsView.this.f73441W0.get() == 1) {
                    GameManageBlockAppsView.this.f73438T0.m35953b();
                }
                AtomicBoolean atomicBoolean = GameManageBlockAppsView.this.f73442X0;
                if (list.size() == 25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                atomicBoolean.set(z11);
                GameManageBlockAppsView.this.f73438T0.m35952a(list);
                GameManageBlockAppsView.this.m79796Q7(false);
                GameManageBlockAppsView.this.m79798iM(true, 0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageBlockAppsView.f73433c1, e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m79804g() {
            GameManageBlockAppsView.this.m79796Q7(false);
            GameManageBlockAppsView.this.m79798iM(false, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m79805h(C20096c c20096c) {
            int m104491c = c20096c.m104491c();
            GameManageBlockAppsView.this.m79796Q7(false);
            GameManageBlockAppsView.this.m79798iM(false, m104491c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                GameManageBlockAppsView.this.f73435Q0.setRefreshing(false);
                String str = GameManageBlockAppsView.f73433c1;
                c20096c.toString();
                GameManageBlockAppsView.this.f73442X0.set(false);
                GameManageBlockAppsView.this.f73443Y0 = false;
                GameManageBlockAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameManageBlockAppsView.C14290b.this.m79805h(c20096c);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageBlockAppsView.f73433c1, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                String str = GameManageBlockAppsView.f73433c1;
                obj.toString();
                GameManageBlockAppsView.this.f73443Y0 = false;
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                int optInt = jSONObject.optInt("total");
                JSONArray jSONArray = jSONObject.getJSONArray("listApps");
                final ArrayList arrayList = new ArrayList(optInt);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(new C24546a(jSONArray.getJSONObject(i11)));
                }
                GameManageBlockAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.vf
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameManageBlockAppsView.C14290b.this.m79803f(arrayList);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageBlockAppsView.f73433c1, e11);
                GameManageBlockAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.wf
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameManageBlockAppsView.C14290b.this.m79804g();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GameManageBlockAppsView$c */
    /* loaded from: classes6.dex */
    public class C14291c implements InterfaceC20094a {
        C14291c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m79807d(C24546a c24546a) {
            try {
                GameManageBlockAppsView.this.f73438T0.m35955g(c24546a);
                GameManageBlockAppsView.this.m79798iM(true, 0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageBlockAppsView.f73433c1, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    String str = GameManageBlockAppsView.f73433c1;
                    c20096c.toString();
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(GameManageBlockAppsView.f73433c1, e11);
                }
            } finally {
                GameManageBlockAppsView.this.f73440V0 = null;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    String str = GameManageBlockAppsView.f73433c1;
                    obj.toString();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(GameManageBlockAppsView.f73433c1, e11);
                }
                if (GameManageBlockAppsView.this.f73440V0 != null && GameManageBlockAppsView.this.f72421L0.m92648SI() != null && !GameManageBlockAppsView.this.f72421L0.m92677nJ()) {
                    GameManageBlockAppsView.this.f72421L0.mo50035CK(-1, null);
                    ToastUtils.m89266n(AbstractC8020f0.game_manage_block_apps_unblock_success_message, new Object[0]);
                    final C24546a c24546a = GameManageBlockAppsView.this.f73440V0;
                    GameManageBlockAppsView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yf
                        @Override // java.lang.Runnable
                        public final void run() {
                            GameManageBlockAppsView.C14291c.this.m79807d(c24546a);
                        }
                    });
                }
            } finally {
                GameManageBlockAppsView.this.f73440V0 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m79794jM() {
        m79796Q7(true);
        m79799lM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m79795kM() {
        if (!C23055e5.m118271f()) {
            this.f73435Q0.setRefreshing(false);
            this.f73435Q0.m88209V();
        } else {
            this.f73435Q0.m88202K();
            this.f73444Z0 = true;
            m79799lM(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.game_manage_blockapp_view, viewGroup, false);
        this.f73439U0 = new C23528a(this.f72421L0.m92648SI());
        MultiStateView multiStateView = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f73436R0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.tf
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GameManageBlockAppsView.this.m79794jM();
            }
        });
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) inflate.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f73435Q0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.uf
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                GameManageBlockAppsView.this.m79795kM();
            }
        });
        ListView listView = this.f73435Q0.f83579m0;
        this.f73434P0 = listView;
        listView.setBackgroundColor(C23212s8.m119607o(listView.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        return inflate;
    }

    /* renamed from: Q7 */
    void m79796Q7(boolean z11) {
        try {
            if (z11) {
                this.f73436R0.setVisibility(0);
                this.f73436R0.setState(MultiStateView.EnumC15914e.LOADING);
            } else {
                this.f73436R0.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73433c1, e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.game_center_manage_block_apps_activity_title));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // ms.C23436b.a
    /* renamed from: Vu */
    public void mo79797Vu(C24546a c24546a) {
        if (this.f72421L0.m92674mJ() && !this.f72421L0.m92677nJ() && c24546a != null && this.f73440V0 == null) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f73446b1);
            this.f73440V0 = c24546a;
            c0766k.mo1397B8(c24546a.m127871b(), false);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f73433c1;
    }

    /* renamed from: iM */
    void m79798iM(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                if (this.f73438T0.getCount() <= 0) {
                    this.f73438T0.m35953b();
                    this.f73435Q0.setVisibility(4);
                    MultiStateView multiStateView = this.f73436R0;
                    if (multiStateView != null) {
                        multiStateView.setVisibility(0);
                        this.f73436R0.setState(MultiStateView.EnumC15914e.EMPTY);
                        this.f73436R0.setEmptyViewString(this.f72421L0.m92652XI(AbstractC8020f0.game_center_manage_block_apps_list_empty_message));
                    }
                } else {
                    MultiStateView multiStateView2 = this.f73436R0;
                    if (multiStateView2 != null) {
                        multiStateView2.setVisibility(8);
                    }
                    this.f73435Q0.setVisibility(0);
                }
            } else {
                if (this.f73441W0.get() == 1 && this.f73444Z0) {
                    this.f73444Z0 = false;
                }
                if (this.f73438T0.getCount() <= 0) {
                    this.f73435Q0.setVisibility(8);
                    MultiStateView multiStateView3 = this.f73436R0;
                    if (multiStateView3 != null) {
                        multiStateView3.setVisibility(0);
                        MultiStateView multiStateView4 = this.f73436R0;
                        BaseZaloView baseZaloView = this.f72421L0;
                        if (i11 == 50001) {
                            i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                        } else {
                            i12 = AbstractC8020f0.game_center_manage_block_apps_list_error_message;
                        }
                        multiStateView4.setErrorTitleString(baseZaloView.m92652XI(i12));
                        MultiStateView multiStateView5 = this.f73436R0;
                        if (i11 == 50001) {
                            enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                        } else {
                            enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                        }
                        multiStateView5.setErrorType(enumC15915f);
                        this.f73436R0.setState(MultiStateView.EnumC15914e.ERROR);
                    }
                } else {
                    MultiStateView multiStateView6 = this.f73436R0;
                    if (multiStateView6 != null) {
                        multiStateView6.setVisibility(8);
                    }
                    this.f73435Q0.setVisibility(0);
                }
                AtomicInteger atomicInteger = this.f73441W0;
                atomicInteger.set(atomicInteger.get() - 1);
            }
            if (this.f73438T0 != null) {
                this.f73438T0.notifyDataSetChanged();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73433c1, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    /* renamed from: lM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m79799lM(boolean z11) {
        boolean z12;
        if (!z11) {
            try {
                if (this.f73441W0.get() >= 1) {
                    if (this.f73441W0.get() * 25 == this.f73438T0.getCount() && this.f73442X0.get()) {
                        AtomicInteger atomicInteger = this.f73441W0;
                        atomicInteger.set(atomicInteger.get() + 1);
                        if (this.f73438T0.getCount() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m79796Q7(z12);
                        this.f73443Y0 = true;
                        this.f73437S0.mo1420E7(this.f73441W0.get(), 25);
                    }
                    return;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f73433c1, e11);
                return;
            }
        }
        this.f73441W0.set(1);
        if (this.f73438T0.getCount() > 0) {
        }
        m79796Q7(z12);
        this.f73443Y0 = true;
        this.f73437S0.mo1420E7(this.f73441W0.get(), 25);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f73439U0 = new C23528a(this.f72421L0.m92648SI());
        this.f73438T0 = new C23436b(this.f72421L0.m92648SI());
        this.f73438T0.m123099l(this);
        this.f73434P0.setAdapter((ListAdapter) this.f73438T0);
        this.f73434P0.setOnScrollListener(new C14289a());
        this.f73437S0.mo1704o8(this.f73445a1);
        m79799lM(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        try {
            this.f73439U0 = new C23528a(this.f72421L0.m92648SI());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
