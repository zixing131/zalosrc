package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.GameManageView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import ms.C23440f;
import org.json.JSONArray;
import org.json.JSONObject;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p402os.C24546a;

/* loaded from: classes6.dex */
public class GameManageView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: c1 */
    protected static final String f73477c1 = "GameManageView";

    /* renamed from: P0 */
    ListView f73478P0;

    /* renamed from: Q0 */
    SwipeRefreshListView f73479Q0;

    /* renamed from: R0 */
    MultiStateView f73480R0;

    /* renamed from: S0 */
    TextView f73481S0;

    /* renamed from: T0 */
    volatile C23440f f73482T0;

    /* renamed from: U0 */
    C23528a f73483U0;

    /* renamed from: V0 */
    InterfaceC0765j f73484V0 = new C0766k();

    /* renamed from: W0 */
    AtomicInteger f73485W0 = new AtomicInteger(0);

    /* renamed from: X0 */
    AtomicBoolean f73486X0 = new AtomicBoolean(false);

    /* renamed from: Y0 */
    volatile boolean f73487Y0 = false;

    /* renamed from: Z0 */
    volatile boolean f73488Z0 = false;

    /* renamed from: a1 */
    boolean f73489a1 = false;

    /* renamed from: b1 */
    InterfaceC20094a f73490b1 = new C14297b();

    /* renamed from: com.zing.zalo.ui.zviews.GameManageView$a */
    /* loaded from: classes6.dex */
    class C14296a implements AbsListView.OnScrollListener {
        C14296a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            if (i11 + i12 >= i13 - 1 && !GameManageView.this.f73487Y0 && GameManageView.this.f73485W0.get() * 25 == GameManageView.this.f73482T0.getCount() && GameManageView.this.f73486X0.get()) {
                String str = GameManageView.f73477c1;
                GameManageView.this.m79833nM(false);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 0) {
                GameManageView.this.f73482T0.notifyDataSetChanged();
            } else {
                GameManageView.this.f73479Q0.m88202K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GameManageView$b */
    /* loaded from: classes6.dex */
    public class C14297b implements InterfaceC20094a {
        C14297b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m79837f(List list) {
            boolean z11;
            try {
                String str = GameManageView.f73477c1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCurrentPage:");
                sb2.append(GameManageView.this.f73485W0.get());
                if (GameManageView.this.f73488Z0) {
                    GameManageView.this.f73479Q0.setRefreshing(false);
                    GameManageView.this.f73488Z0 = false;
                }
                if (GameManageView.this.f73485W0.get() == 1) {
                    GameManageView.this.f73482T0.m35953b();
                }
                AtomicBoolean atomicBoolean = GameManageView.this.f73486X0;
                if (list.size() == 25) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                atomicBoolean.set(z11);
                GameManageView.this.f73482T0.m35952a(list);
                GameManageView.this.m79831Q7(false);
                GameManageView.this.m79832jM(true, 0);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageView.f73477c1, e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m79838g() {
            GameManageView.this.m79831Q7(false);
            GameManageView.this.m79832jM(false, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m79839h(C20096c c20096c) {
            int m104491c = c20096c.m104491c();
            GameManageView.this.m79831Q7(false);
            GameManageView.this.m79832jM(false, m104491c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                String str = GameManageView.f73477c1;
                c20096c.toString();
                GameManageView.this.f73479Q0.setRefreshing(false);
                GameManageView.this.f73486X0.set(false);
                GameManageView.this.f73487Y0 = false;
                GameManageView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kg
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameManageView.C14297b.this.m79839h(c20096c);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageView.f73477c1, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                String str = GameManageView.f73477c1;
                obj.toString();
                GameManageView.this.f73487Y0 = false;
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                int optInt = jSONObject.optInt("total");
                JSONArray jSONArray = jSONObject.getJSONArray("listApps");
                final ArrayList arrayList = new ArrayList(optInt);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(new C24546a(jSONArray.getJSONObject(i11)));
                }
                GameManageView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ig
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameManageView.C14297b.this.m79837f(arrayList);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(GameManageView.f73477c1, e11);
                GameManageView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jg
                    @Override // java.lang.Runnable
                    public final void run() {
                        GameManageView.C14297b.this.m79838g();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m79828kM(AdapterView adapterView, View view, int i11, long j11) {
        try {
            AbstractC23647d.m123906p("550072");
            AbstractC23647d.m123893c();
            if (this.f72421L0.m92674mJ() && !this.f72421L0.m92677nJ() && i11 >= this.f73478P0.getHeaderViewsCount()) {
                C24546a c24546a = (C24546a) this.f73482T0.getItem(i11 - this.f73478P0.getHeaderViewsCount());
                Bundle bundle = new Bundle();
                bundle.putSerializable("com.zing.zalo.game.EXTRA_GAME_OBJECT", c24546a);
                this.f72421L0.m92662fJ().m93066i2(GameManageDetailView.class, bundle, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, 1, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73477c1, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m79829lM() {
        m79831Q7(true);
        m79833nM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m79830mM() {
        if (!C23055e5.m118271f()) {
            this.f73479Q0.setRefreshing(false);
            this.f73479Q0.m88209V();
        } else {
            this.f73479Q0.m88202K();
            this.f73488Z0 = true;
            m79833nM(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null && this.f72421L0.m92648SI() != null && this.f72421L0.m92674mJ() && !this.f72421L0.m92681pJ()) {
            actionBarMenu.m92750r();
            actionBarMenu.m92738e(1, AbstractC16803z.ic_head_banned);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.game_manage_view, viewGroup, false);
        this.f73483U0 = new C23528a(this.f72421L0.m92648SI());
        MultiStateView multiStateView = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f73480R0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.gg
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                GameManageView.this.m79829lM();
            }
        });
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) inflate.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f73479Q0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.hg
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                GameManageView.this.m79830mM();
            }
        });
        ListView listView = this.f73479Q0.f83579m0;
        this.f73478P0 = listView;
        listView.setBackgroundColor(C23212s8.m119607o(listView.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        View inflate2 = layoutInflater.inflate(AbstractC7409c0.game_center_list_header_with_separate_line, (ViewGroup) this.f73478P0, false);
        TextView textView = (TextView) inflate2.findViewById(AbstractC6918a0.layout_header_title);
        this.f73481S0 = textView;
        textView.setText(this.f72421L0.m92652XI(AbstractC8020f0.game_manage_list_title));
        this.f73478P0.addHeaderView(inflate2);
        return inflate;
    }

    /* renamed from: Q7 */
    void m79831Q7(boolean z11) {
        try {
            if (z11) {
                this.f73480R0.setVisibility(0);
                this.f73480R0.setState(MultiStateView.EnumC15914e.LOADING);
            } else {
                this.f73480R0.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73477c1, e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332 && !this.f72421L0.m92681pJ() && !this.f72421L0.m92677nJ()) {
            if (this.f73489a1) {
                this.f72421L0.mo50035CK(-1, null);
            }
            finish();
            return true;
        }
        if (i11 == 1) {
            AbstractC23647d.m123906p("550071");
            this.f72421L0.m92662fJ().m93066i2(GameManageBlockAppsView.class, null, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, 1, true);
            AbstractC23647d.m123893c();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.game_center_manage_activity_title));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f73477c1;
    }

    /* renamed from: jM */
    void m79832jM(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                if (this.f73482T0.getCount() <= 0) {
                    this.f73482T0.m35953b();
                    this.f73479Q0.setVisibility(4);
                    MultiStateView multiStateView = this.f73480R0;
                    if (multiStateView != null) {
                        multiStateView.setVisibility(0);
                        this.f73480R0.setEmptyViewString(this.f72421L0.m92652XI(AbstractC8020f0.game_manage_list_empty_msg));
                        this.f73480R0.setState(MultiStateView.EnumC15914e.EMPTY);
                    }
                } else {
                    MultiStateView multiStateView2 = this.f73480R0;
                    if (multiStateView2 != null) {
                        multiStateView2.setVisibility(8);
                    }
                    this.f73479Q0.setVisibility(0);
                }
                this.f73481S0.setText(String.format("%s (%d)", this.f72421L0.m92652XI(AbstractC8020f0.game_manage_list_title), Integer.valueOf(this.f73482T0.getCount())));
            } else {
                if (this.f73485W0.get() == 1 && this.f73488Z0) {
                    this.f73488Z0 = false;
                }
                if (this.f73482T0.getCount() <= 0) {
                    this.f73479Q0.setVisibility(8);
                    MultiStateView multiStateView3 = this.f73480R0;
                    if (multiStateView3 != null) {
                        multiStateView3.setVisibility(0);
                        MultiStateView multiStateView4 = this.f73480R0;
                        BaseZaloView baseZaloView = this.f72421L0;
                        if (i11 == 50001) {
                            i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                        } else {
                            i12 = AbstractC8020f0.game_manage_list_error_msg;
                        }
                        multiStateView4.setErrorTitleString(baseZaloView.m92652XI(i12));
                        this.f73480R0.setState(MultiStateView.EnumC15914e.ERROR);
                        MultiStateView multiStateView5 = this.f73480R0;
                        if (i11 == 50001) {
                            enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                        } else {
                            enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                        }
                        multiStateView5.setErrorType(enumC15915f);
                    }
                } else {
                    MultiStateView multiStateView6 = this.f73480R0;
                    if (multiStateView6 != null) {
                        multiStateView6.setVisibility(8);
                    }
                    this.f73479Q0.setVisibility(0);
                }
                AtomicInteger atomicInteger = this.f73485W0;
                atomicInteger.set(atomicInteger.get() - 1);
            }
            if (this.f73482T0 != null) {
                this.f73482T0.notifyDataSetChanged();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f73477c1, e11);
        }
    }

    /* renamed from: nM */
    void m79833nM(boolean z11) {
        boolean z12;
        if (!z11 && this.f73485W0.get() >= 1) {
            if (this.f73485W0.get() * 25 == this.f73482T0.getCount() && this.f73486X0.get()) {
                AtomicInteger atomicInteger = this.f73485W0;
                atomicInteger.set(atomicInteger.get() + 1);
            } else {
                return;
            }
        } else {
            this.f73485W0.set(1);
        }
        if (this.f73482T0.getCount() <= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m79831Q7(z12);
        this.f73487Y0 = true;
        this.f73484V0.mo1521R3(this.f73485W0.get(), 25);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 2001 && i12 == -1) {
            m79833nM(true);
            this.f73489a1 = true;
        }
        if (i11 == 2002 && i12 == -1) {
            m79833nM(true);
            this.f73489a1 = true;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f73489a1) {
                this.f72421L0.mo50035CK(-1, null);
            }
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f73482T0 != null) {
            this.f73482T0.notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f73483U0 = new C23528a(this.f72421L0.m92648SI());
        this.f73482T0 = new C23440f(this.f72421L0.m92648SI());
        this.f73478P0.setAdapter((ListAdapter) this.f73482T0);
        this.f73478P0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.zviews.fg
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                GameManageView.this.m79828kM(adapterView, view, i11, j11);
            }
        });
        this.f73478P0.setOnScrollListener(new C14296a());
        this.f73484V0.mo1704o8(this.f73490b1);
        m79833nM(true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        try {
            this.f73483U0 = new C23528a(this.f72421L0.m92648SI());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
