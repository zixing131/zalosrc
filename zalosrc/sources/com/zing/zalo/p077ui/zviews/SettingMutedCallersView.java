package com.zing.zalo.p077ui.zviews;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g50.C19234g;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p354n3.C23528a;
import p445qe.C25244a;
import p649xl.C29929mb;
import p716zh.C31853b5;
import pm0.C24848g0;
import sy.AbstractC26423o;

/* loaded from: classes6.dex */
public final class SettingMutedCallersView extends SlidableZaloView {
    public static final C15036a Companion = new C15036a(null);

    /* renamed from: P0 */
    private C29929mb f77521P0;

    /* renamed from: Q0 */
    private C19234g f77522Q0;

    /* renamed from: com.zing.zalo.ui.zviews.SettingMutedCallersView$a */
    /* loaded from: classes6.dex */
    public static final class C15036a {
        private C15036a() {
        }

        public /* synthetic */ C15036a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingMutedCallersView$b */
    /* loaded from: classes6.dex */
    public static final class C15037b implements C19234g.b {
        C15037b() {
        }

        @Override // g50.C19234g.b
        /* renamed from: a */
        public void mo84172a(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "contactProfile");
            SettingMutedCallersView.this.m84168mM(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingMutedCallersView$c */
    /* loaded from: classes6.dex */
    public static final class C15038c extends AbstractC19075u implements InterfaceC18505l {
        C15038c() {
            super(1);
        }

        /* renamed from: a */
        public final void m84173a(boolean z11) {
            SettingMutedCallersView.this.mo49315c4();
            SettingMutedCallersView.this.m84170oM();
            if (!z11) {
                ToastUtils.m89266n(AbstractC8020f0.str_call_ringtone_general_error, new Object[0]);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m84173a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: kM */
    private final void m84166kM() {
        m84170oM();
    }

    /* renamed from: lM */
    private final void m84167lM() {
        this.f77522Q0 = new C19234g(new C23528a(m92689tK()), new C15037b());
        C29929mb c29929mb = this.f77521P0;
        if (c29929mb == null) {
            AbstractC19074t.m100223u("binding");
            c29929mb = null;
        }
        RecyclerView recyclerView = c29929mb.f138693s;
        recyclerView.setLayoutManager(new LinearLayoutManager(m92689tK()));
        C19234g c19234g = this.f77522Q0;
        if (c19234g == null) {
            AbstractC19074t.m100223u("adapter");
            c19234g = null;
        }
        recyclerView.setAdapter(c19234g);
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public final void m84168mM(ContactProfile contactProfile) {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        mo46829Y();
        C25244a c25244a = C25244a.f121072a;
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        c25244a.m130648F(str, new C15038c());
        c25244a.m130646A("setting_notification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m84169nM(SettingMutedCallersView settingMutedCallersView, View view) {
        AbstractC19074t.m100208f(settingMutedCallersView, "this$0");
        if (C25244a.m130615B() > 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromSettingNotiStory", true);
            C17487o0 m92662fJ = settingMutedCallersView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ChooseMultiFriendsView.class, bundle, 1001, 1, true);
                return;
            }
            return;
        }
        settingMutedCallersView.showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public final void m84170oM() {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.ki0
            @Override // java.lang.Runnable
            public final void run() {
                SettingMutedCallersView.m84171pM(SettingMutedCallersView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m84171pM(SettingMutedCallersView settingMutedCallersView) {
        AbstractC19074t.m100208f(settingMutedCallersView, "this$0");
        C31853b5 m130654p = C25244a.f121072a.m130654p();
        C29929mb c29929mb = null;
        C19234g c19234g = null;
        if (m130654p.size() > 0) {
            C29929mb c29929mb2 = settingMutedCallersView.f77521P0;
            if (c29929mb2 == null) {
                AbstractC19074t.m100223u("binding");
                c29929mb2 = null;
            }
            LinearLayout linearLayout = c29929mb2.f138691q;
            AbstractC19074t.m100207e(linearLayout, "layoutEmptyMsg");
            AbstractC26423o.m136267a(linearLayout);
            C29929mb c29929mb3 = settingMutedCallersView.f77521P0;
            if (c29929mb3 == null) {
                AbstractC19074t.m100223u("binding");
                c29929mb3 = null;
            }
            RecyclerView recyclerView = c29929mb3.f138693s;
            AbstractC19074t.m100207e(recyclerView, "rvMutedCallers");
            AbstractC26423o.m136269c(recyclerView);
            C19234g c19234g2 = settingMutedCallersView.f77522Q0;
            if (c19234g2 == null) {
                AbstractC19074t.m100223u("adapter");
            } else {
                c19234g = c19234g2;
            }
            c19234g.m100912W(m130654p);
            return;
        }
        C29929mb c29929mb4 = settingMutedCallersView.f77521P0;
        if (c29929mb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29929mb4 = null;
        }
        LinearLayout linearLayout2 = c29929mb4.f138691q;
        AbstractC19074t.m100207e(linearLayout2, "layoutEmptyMsg");
        AbstractC26423o.m136269c(linearLayout2);
        C29929mb c29929mb5 = settingMutedCallersView.f77521P0;
        if (c29929mb5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29929mb = c29929mb5;
        }
        RecyclerView recyclerView2 = c29929mb.f138693s;
        AbstractC19074t.m100207e(recyclerView2, "rvMutedCallers");
        AbstractC26423o.m136267a(recyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            C8009j.a aVar = new C8009j.a(getContext());
            aVar.m43159h(4).m43162k(AbstractC23136l9.m118746s0(AbstractC8020f0.str_call_setting_notif_except_exceed_limit, Integer.valueOf(C25244a.m130642v()))).m43169r(AbstractC8020f0.str_call_setting_notif_except_exceed_limit_confirm, new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        return super.mo39014DJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29929mb m148254c = C29929mb.m148254c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148254c, "inflate(...)");
        this.f77521P0 = m148254c;
        m84167lM();
        m84166kM();
        m92637BK(true);
        C29929mb c29929mb = this.f77521P0;
        if (c29929mb == null) {
            AbstractC19074t.m100223u("binding");
            c29929mb = null;
        }
        LinearLayout root = c29929mb.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_setting_notif_except);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
                m87077NK.setEnableTrailingButton(true);
                m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ji0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SettingMutedCallersView.m84169nM(SettingMutedCallersView.this, view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingMutedCallersView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1001) {
            m84170oM();
        }
    }
}
