package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.zing.zalo.adapters.C7079h;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.StoryBlockedListView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import l30.C22035l0;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import p304ks.C21927m;
import vg.AbstractC28034c7;

/* loaded from: classes6.dex */
public final class StoryBlockedListView extends SlidableZaloView implements InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: Q0 */
    MultiStateView f77893Q0;

    /* renamed from: R0 */
    ListView f77894R0;

    /* renamed from: S0 */
    C7079h f77895S0;

    /* renamed from: V0 */
    C22035l0 f77898V0;

    /* renamed from: P0 */
    private final String f77892P0 = StoryBlockedListView.class.getSimpleName();

    /* renamed from: T0 */
    String f77896T0 = "";

    /* renamed from: U0 */
    int f77897U0 = -1;

    /* renamed from: W0 */
    int f77899W0 = 0;

    /* renamed from: X0 */
    C22035l0.d f77900X0 = new C15095b();

    /* renamed from: Y0 */
    C7079h.b f77901Y0 = new C15096c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StoryBlockedListView$a */
    /* loaded from: classes6.dex */
    public class C15094a extends AbstractC28034c7 {
        C15094a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    C7079h c7079h = StoryBlockedListView.this.f77895S0;
                    c7079h.f38701s = false;
                    c7079h.notifyDataSetChanged();
                } else {
                    StoryBlockedListView.this.f77895S0.f38701s = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.StoryBlockedListView$b */
    /* loaded from: classes6.dex */
    public class C15095b extends C22035l0.d {
        C15095b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m84524f(int i11) {
            StoryBlockedListView.this.m84521qM(false, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m84525g() {
            StoryBlockedListView.this.m84521qM(false, 0);
        }

        @Override // l30.C22035l0.d
        /* renamed from: b */
        public void mo84526b(final int i11, String str) {
            if (i11 != 0 && StoryBlockedListView.this.m92672lJ()) {
                if (!TextUtils.isEmpty(str)) {
                    ToastUtils.showMess(str);
                } else {
                    ToastUtils.showMess(StoryBlockedListView.this.m92652XI(AbstractC8020f0.error_message));
                }
            }
            StoryBlockedListView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.km0
                @Override // java.lang.Runnable
                public final void run() {
                    StoryBlockedListView.C15095b.this.m84524f(i11);
                }
            });
        }

        @Override // l30.C22035l0.d
        /* renamed from: c */
        public void mo84527c(int i11, String str) {
            if (i11 != 0 && StoryBlockedListView.this.m92672lJ()) {
                if (!TextUtils.isEmpty(str)) {
                    ToastUtils.showMess(str);
                } else {
                    ToastUtils.showMess(StoryBlockedListView.this.m92652XI(AbstractC8020f0.error_message));
                }
            }
            StoryBlockedListView.this.mo49315c4();
            StoryBlockedListView storyBlockedListView = StoryBlockedListView.this;
            C7079h c7079h = storyBlockedListView.f77895S0;
            if (c7079h != null) {
                c7079h.f38702t = 0L;
            }
            storyBlockedListView.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jm0
                @Override // java.lang.Runnable
                public final void run() {
                    StoryBlockedListView.C15095b.this.m84525g();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryBlockedListView$c */
    /* loaded from: classes6.dex */
    class C15096c implements C7079h.b {
        C15096c() {
        }

        @Override // com.zing.zalo.adapters.C7079h.b
        /* renamed from: C0 */
        public void mo36129C0(String str, int i11) {
            StoryBlockedListView.this.m84520pM(str);
        }

        @Override // com.zing.zalo.adapters.C7079h.b
        public Context getContext() {
            return StoryBlockedListView.this.m92648SI();
        }

        @Override // com.zing.zalo.adapters.C7079h.b
        /* renamed from: wg */
        public boolean mo36130wg() {
            C22035l0 c22035l0 = StoryBlockedListView.this.f77898V0;
            if (c22035l0 != null && c22035l0.f108545i) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: iM */
    private int m84513iM() {
        int i11 = this.f77899W0;
        if (i11 != 1) {
            return i11 != 2 ? 150 : 107;
        }
        return 103;
    }

    /* renamed from: jM */
    private int m84514jM() {
        int i11 = this.f77899W0;
        if (i11 != 1) {
            return i11 != 2 ? 150 : 107;
        }
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m84515mM() {
        m84518kM(1, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m84516nM(View view) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromStoryBlockList", true);
        bundle.putInt("intExtraTrackingSource", m84513iM());
        m92662fJ().m93066i2(ChooseMultiFriendsView.class, bundle, 1000, 1, true);
    }

    /* renamed from: oM */
    private void m84517oM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            int i11 = 0;
            if (m92642L3.containsKey("int_extra_source_open")) {
                i11 = m92642L3.getInt("int_extra_source_open", 0);
            }
            this.f77899W0 = i11;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        m84517oM();
        AbstractC23126l.m118627a(this.f77892P0);
        this.f77898V0 = new C22035l0(this.f77900X0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 0) {
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(1).m43162k(m92652XI(AbstractC8020f0.str_ask_remove_from_blacklist)).m43165n(m92652XI(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_yes), this);
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
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_blocked_list_view, viewGroup, false);
        m84519lM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 0 && i11 == -1) {
            interfaceC17463d.dismiss();
            m84520pM(this.f77896T0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_blocked_story));
                m87077NK.setEnableTrailingButton(true);
                m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.im0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryBlockedListView.this.m84516nM(view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StoryBlockedListView";
    }

    /* renamed from: kM */
    void m84518kM(int i11, int i12) {
        try {
            if (this.f77898V0.f108538b) {
                return;
            }
            m84521qM(true, 0);
            this.f77898V0.m115024c(i11, i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m84519lM(View view) {
        m92676n2().mo35554O(3);
        ListView listView = (ListView) view.findViewById(AbstractC6918a0.lv_blocked);
        this.f77894R0 = listView;
        listView.setOnScrollListener(new C15094a());
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f77893Q0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.hm0
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                StoryBlockedListView.this.m84515mM();
            }
        });
        C7079h c7079h = new C7079h(this.f77901Y0, C21927m.m114302u().m114309G());
        this.f77895S0 = c7079h;
        this.f77894R0.setAdapter((ListAdapter) c7079h);
        m84518kM(1, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1000 && i12 == -1) {
            m84518kM(1, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f77893Q0.getState().f81257p == MultiStateView.EnumC15914e.EMPTY.f81257p) {
            try {
                ((ImageView) this.f77893Q0.findViewById(AbstractC6918a0.imvEmpty)).setImageDrawable(AbstractC23136l9.m118665N(this.f77893Q0.getContext(), AbstractC16803z.illus_emptystate_list));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: pM */
    void m84520pM(String str) {
        if (this.f77898V0.f108545i) {
            return;
        }
        mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
        this.f77896T0 = str;
        this.f77898V0.m115025d(str, new TrackingSource(m84514jM()));
    }

    /* renamed from: qM */
    void m84521qM(boolean z11, int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            if (z11) {
                MultiStateView multiStateView = this.f77893Q0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f77893Q0.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f77894R0.setVisibility(8);
                return;
            }
            if (C21927m.m114302u().m114309G().size() > 0) {
                MultiStateView multiStateView2 = this.f77893Q0;
                if (multiStateView2 != null) {
                    multiStateView2.setVisibility(8);
                }
                this.f77894R0.setVisibility(0);
            } else {
                this.f77894R0.setVisibility(8);
                if (i11 == 0) {
                    this.f77893Q0.setState(MultiStateView.EnumC15914e.EMPTY);
                    this.f77893Q0.setEmptyViewString(m92652XI(AbstractC8020f0.ignorelist_empty));
                    this.f77893Q0.setVisibility(0);
                } else {
                    this.f77893Q0.setState(MultiStateView.EnumC15914e.ERROR);
                    MultiStateView multiStateView3 = this.f77893Q0;
                    if (i11 == 50001) {
                        i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
                    } else {
                        i12 = AbstractC8020f0.facebook_mag_emptyList;
                    }
                    multiStateView3.setErrorTitleString(m92652XI(i12));
                    MultiStateView multiStateView4 = this.f77893Q0;
                    if (i11 == 50001) {
                        enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                    } else {
                        enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                    }
                    multiStateView4.setErrorType(enumC15915f);
                    this.f77893Q0.setVisibility(0);
                }
            }
            this.f77895S0.m36128e(C21927m.m114302u().m114309G());
            this.f77895S0.notifyDataSetChanged();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
