package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7214t2;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import p304ks.C21937w;
import to.C26855e;
import vg.AbstractC28034c7;

/* loaded from: classes6.dex */
public final class HiddenListView extends SlidableZaloView implements C7214t2.b, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: Q0 */
    MultiStateView f74273Q0;

    /* renamed from: R0 */
    ListView f74274R0;

    /* renamed from: S0 */
    C7214t2 f74275S0;

    /* renamed from: P0 */
    private final String f74272P0 = HiddenListView.class.getSimpleName();

    /* renamed from: T0 */
    String f74276T0 = "";

    /* renamed from: U0 */
    int f74277U0 = -1;

    /* renamed from: V0 */
    int f74278V0 = 0;

    /* renamed from: W0 */
    public boolean f74279W0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.HiddenListView$a */
    /* loaded from: classes6.dex */
    public class C14453a extends AbstractC28034c7 {
        C14453a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    HiddenListView.this.f74275S0.m36719f(false);
                    HiddenListView.this.f74275S0.notifyDataSetChanged();
                } else {
                    HiddenListView.this.f74275S0.m36719f(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.HiddenListView$b */
    /* loaded from: classes6.dex */
    public class C14454b implements InterfaceC20094a {
        C14454b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            HiddenListView.this.m80704tM(false, c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            HiddenListView.this.m80704tM(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.HiddenListView$c */
    /* loaded from: classes6.dex */
    public class C14455c implements C26855e.a {
        C14455c() {
        }

        @Override // to.C26855e.a
        /* renamed from: a */
        public void mo80705a() {
            HiddenListView.this.m80704tM(false, 0);
            HiddenListView hiddenListView = HiddenListView.this;
            hiddenListView.f74279W0 = false;
            hiddenListView.f72421L0.mo78960q3();
        }

        @Override // to.C26855e.a
        /* renamed from: b */
        public void mo80706b() {
            HiddenListView hiddenListView = HiddenListView.this;
            hiddenListView.f74279W0 = false;
            hiddenListView.f72421L0.mo78960q3();
        }

        @Override // to.C26855e.a
        /* renamed from: c */
        public void mo80707c() {
            HiddenListView hiddenListView = HiddenListView.this;
            hiddenListView.f74279W0 = true;
            hiddenListView.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        }
    }

    /* renamed from: jM */
    private int m80694jM() {
        int i11 = this.f74278V0;
        if (i11 != 1) {
            return i11 != 2 ? 150 : 107;
        }
        return 103;
    }

    /* renamed from: lM */
    private int m80695lM() {
        int i11 = this.f74278V0;
        if (i11 != 1) {
            return i11 != 2 ? 150 : 107;
        }
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m80697oM(View view) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromHiddenListActivity", true);
        bundle.putInt("intExtraTrackingSource", m80694jM());
        this.f72421L0.m92662fJ().m93066i2(ChooseMultiFriendsView.class, bundle, 1001, 1, true);
    }

    /* renamed from: qM */
    private void m80699qM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            int i11 = 0;
            if (m92642L3.containsKey("int_extra_source_open")) {
                i11 = m92642L3.getInt("int_extra_source_open", 0);
            }
            this.f74278V0 = i11;
        }
    }

    @Override // com.zing.zalo.adapters.C7214t2.b
    /* renamed from: C0 */
    public void mo36720C0(String str, int i11) {
        this.f74276T0 = str;
        this.f74277U0 = i11;
        try {
            m80702rM(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        m80699qM();
        AbstractC23126l.m118627a(this.f74272P0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 0) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_remove_from_hiddenlist)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), this);
                return aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.hidden_list_view, viewGroup, false);
        m80701mM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 0 && i11 == -1) {
                interfaceC17463d.dismiss();
                m80702rM(this.f74276T0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_hide_timeline));
                m87077NK.setEnableTrailingButton(true);
                m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.np
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HiddenListView.this.m80697oM(view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7214t2.b
    /* renamed from: Xl */
    public boolean mo36721Xl() {
        return this.f74279W0;
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.adapters.C7079h.b
    public Context getContext() {
        return this.f72421L0.m92648SI();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "HiddenListView";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kM, reason: merged with bridge method [inline-methods] */
    public void m80696nM() {
        try {
            m80698pM(true, 0);
            C21937w.f108027a.m114572k(new C14454b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m80701mM(View view) {
        this.f72421L0.m92676n2().mo35554O(3);
        ListView listView = (ListView) view.findViewById(AbstractC6918a0.lv_black);
        this.f74274R0 = listView;
        listView.setOnScrollListener(new C14453a());
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f74273Q0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.mp
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                HiddenListView.this.m80696nM();
            }
        });
        C7214t2 c7214t2 = new C7214t2(this, C21937w.f108027a.m114571j());
        this.f74275S0 = c7214t2;
        this.f74274R0.setAdapter((ListAdapter) c7214t2);
        m80696nM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1001 && i12 == -1) {
            m80696nM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f74273Q0.getState().f81257p == MultiStateView.EnumC15914e.EMPTY.f81257p) {
            try {
                ((ImageView) this.f74273Q0.findViewById(AbstractC6918a0.imvEmpty)).setImageDrawable(AbstractC23136l9.m118665N(this.f74273Q0.getContext(), AbstractC16803z.illus_emptystate_list));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: rM */
    void m80702rM(String str) {
        if (this.f74279W0) {
            return;
        }
        this.f74276T0 = str;
        new C26855e().m101508a(new C26855e.b(new ContactProfile(str), new TrackingSource(m80695lM()), getLifecycle(), new C14455c()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sM, reason: merged with bridge method [inline-methods] */
    public void m80698pM(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                this.f74273Q0.setVisibility(0);
                this.f74273Q0.setState(MultiStateView.EnumC15914e.LOADING);
                this.f74274R0.setVisibility(8);
                return;
            }
            C21937w c21937w = C21937w.f108027a;
            if (c21937w.m114571j().size() > 0) {
                this.f74273Q0.setVisibility(8);
                this.f74274R0.setVisibility(0);
            } else {
                this.f74273Q0.setVisibility(0);
                this.f74274R0.setVisibility(8);
                if (i11 == 0) {
                    this.f74273Q0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_empty_hiddenList));
                    this.f74273Q0.setState(MultiStateView.EnumC15914e.EMPTY);
                } else {
                    MultiStateView multiStateView = this.f74273Q0;
                    if (i11 == 50001) {
                        i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                    } else {
                        i12 = AbstractC8020f0.facebook_mag_emptyList;
                    }
                    multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
                    this.f74273Q0.setState(MultiStateView.EnumC15914e.ERROR);
                    MultiStateView multiStateView2 = this.f74273Q0;
                    if (i11 == 50001) {
                        enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                    } else {
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    }
                    multiStateView2.setErrorType(enumC15915f);
                }
            }
            this.f74275S0.m36718e(c21937w.m114571j());
            this.f74275S0.notifyDataSetChanged();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: tM */
    void m80704tM(final boolean z11, final int i11) {
        this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.lp
            @Override // java.lang.Runnable
            public final void run() {
                HiddenListView.this.m80698pM(z11, i11);
            }
        });
    }
}
