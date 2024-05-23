package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import ck.C3565f;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.ViewOnClickListenerC7161o4;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.OANearbyZView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23181q;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3544l;
import p172fy.C19171b;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p510sq.C26365a;
import p716zh.C31965ic;
import p716zh.C32002l4;
import vg.AbstractC28034c7;
import vg.C28139n5;
import vg.C28203u6;
import vg.C28239y6;

/* loaded from: classes6.dex */
public class OANearbyZView extends SlidableZaloView implements ViewOnClickListenerC7161o4.b, InterfaceC17463d.d, ViewOnClickListenerC7161o4.f, InterfaceC0733x {

    /* renamed from: P0 */
    View f75681P0;

    /* renamed from: Q0 */
    SwipeRefreshListView f75682Q0;

    /* renamed from: R0 */
    ListView f75683R0;

    /* renamed from: S0 */
    MultiStateView f75684S0;

    /* renamed from: T0 */
    boolean f75685T0;

    /* renamed from: Y0 */
    InterfaceC0765j f75690Y0;

    /* renamed from: Z0 */
    ViewOnClickListenerC7161o4 f75691Z0;

    /* renamed from: a1 */
    C23528a f75692a1;

    /* renamed from: b1 */
    int f75693b1;

    /* renamed from: U0 */
    List f75686U0 = new ArrayList();

    /* renamed from: V0 */
    List f75687V0 = new ArrayList();

    /* renamed from: W0 */
    List f75688W0 = new ArrayList();

    /* renamed from: X0 */
    Handler f75689X0 = new Handler();

    /* renamed from: c1 */
    boolean f75694c1 = true;

    /* renamed from: d1 */
    boolean f75695d1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OANearbyZView$a */
    /* loaded from: classes6.dex */
    public class C14700a extends AbstractC28034c7 {
        C14700a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            try {
                if (i11 == 0) {
                    OANearbyZView.this.f75691Z0.m36434d(false);
                    OANearbyZView.this.f75691Z0.notifyDataSetChanged();
                } else {
                    OANearbyZView.this.f75691Z0.m36434d(true);
                    OANearbyZView.this.f75691Z0.notifyDataSetChanged();
                    OANearbyZView.this.f75682Q0.m88202K();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OANearbyZView$b */
    /* loaded from: classes6.dex */
    public class C14701b implements InterfaceC20094a {
        C14701b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m82393e(int i11) {
            OANearbyZView.this.m82389yM(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m82394f() {
            OANearbyZView.this.f75682Q0.setRefreshing(false);
            OANearbyZView.this.f75682Q0.setVisibility(8);
            OANearbyZView.this.m82390zM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_result_user_oa), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (OANearbyZView.this.m92674mJ()) {
                OANearbyZView.this.m82383nM(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            OANearbyZView oANearbyZView = OANearbyZView.this;
            oANearbyZView.f75685T0 = false;
            try {
                if (oANearbyZView.m92674mJ()) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    final int i11 = jSONObject.getInt("error_code");
                    if (i11 == 0) {
                        OANearbyZView.this.m82386vM(jSONObject2);
                        OANearbyZView.this.m82385uM(jSONObject2);
                        OANearbyZView.this.m82380BM();
                    } else {
                        OANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.t20
                            @Override // java.lang.Runnable
                            public final void run() {
                                OANearbyZView.C14701b.this.m82393e(i11);
                            }
                        });
                    }
                }
            } catch (Exception unused) {
                if (OANearbyZView.this.m92674mJ()) {
                    OANearbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.u20
                        @Override // java.lang.Runnable
                        public final void run() {
                            OANearbyZView.C14701b.this.m82394f();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.OANearbyZView$c */
    /* loaded from: classes6.dex */
    public class C14702c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f75698a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f75699b;

        /* renamed from: com.zing.zalo.ui.zviews.OANearbyZView$c$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75701a;

            a(ContactProfile contactProfile) {
                this.f75701a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f75701a);
            }
        }

        C14702c(String str, ContactProfile contactProfile) {
            this.f75698a = str;
            this.f75699b = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m82396d() {
            try {
                OANearbyZView.this.f75691Z0.notifyDataSetChanged();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (OANearbyZView.this.m92672lJ()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                OANearbyZView oANearbyZView = OANearbyZView.this;
                oANearbyZView.f75695d1 = false;
                oANearbyZView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            ContactProfile contactProfile;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(this.f75698a);
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        if (m141809c == null && (contactProfile = this.f75699b) != null) {
                            contactProfile.f42447v0 = contactProfile.f42352K0;
                            m141809c = contactProfile;
                        } else if (m141809c != null) {
                            m141809c.f42447v0 = m141809c.f42352K0;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(this.f75698a)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(this.f75698a)).m153681a();
                        }
                        m141809c.f42441t0 = true;
                        m141809c.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str)) {
                            m141809c.f42442t1 = str;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            m141809c.f42436r1 = new SpannableStringBuilder(str2);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(this.f75698a)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(this.f75698a) != null) {
                                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(this.f75698a);
                                m153138j.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    m153138j.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    m153138j.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        c28203u6.m141806D(this.f75698a, false);
                        if (!TextUtils.isEmpty(this.f75698a)) {
                            AbstractC23181q.m119431d(this.f75698a, true);
                        }
                        OANearbyZView.this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.v20
                            @Override // java.lang.Runnable
                            public final void run() {
                                OANearbyZView.C14702c.this.m82396d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_follow_success));
                OANearbyZView.this.mo78960q3();
                OANearbyZView.this.f75695d1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m82374oM(int i11) {
        String m118743r0;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            boolean z11 = false;
            this.f75682Q0.setRefreshing(false);
            this.f75684S0.setVisibility(8);
            if (i11 == 50001) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                z11 = true;
            } else if (i11 == 402) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby);
                removeDialog(4);
                showDialog(4);
            } else if (i11 == 21000) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.warning_mock_location_detected);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_user_oa);
            }
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f75691Z0;
            if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() == 0) {
                if (z11) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                m82390zM(m118743r0, enumC15915f);
                this.f75682Q0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m82375pM() {
        AbstractC23647d.m123907q("5370", "");
        this.f75694c1 = true;
        m82382mM();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m82376qM() {
        if (!C23055e5.m118271f()) {
            this.f75682Q0.setRefreshing(false);
            this.f75682Q0.m88209V();
            return;
        }
        AbstractC23647d.m123907q("5330", "");
        this.f75682Q0.m88202K();
        this.f75693b1 = 1;
        m82382mM();
        AbstractC23647d.m123893c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m82377rM(int i11) {
        int i12;
        MultiStateView.EnumC15915f enumC15915f;
        try {
            this.f75682Q0.setRefreshing(false);
            if (i11 == 50001) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.str_error_user_oa;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i12);
            if (i11 == 50001) {
                enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
            } else {
                enumC15915f = MultiStateView.EnumC15915f.NEARBY_ERROR;
            }
            m82390zM(m118743r0, enumC15915f);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m82378sM() {
        try {
            this.f75682Q0.setRefreshing(false);
            if (this.f75686U0.size() > 0) {
                this.f75688W0.add(new C3544l(3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_place_from_OA)));
                for (int i11 = 0; i11 < this.f75686U0.size(); i11++) {
                    this.f75688W0.add(new C3544l(2, (C3565f) this.f75686U0.get(i11)));
                }
            }
            if (this.f75687V0.size() > 0) {
                this.f75688W0.add(new C3544l(3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_other_place)));
                for (int i12 = 0; i12 < this.f75687V0.size(); i12++) {
                    this.f75688W0.add(new C3544l(2, (C3565f) this.f75687V0.get(i12)));
                }
            }
            if (this.f75688W0.size() > 0) {
                this.f75684S0.setVisibility(8);
                this.f75682Q0.setVisibility(0);
                this.f75691Z0.m36431a(this.f75688W0);
                this.f75691Z0.notifyDataSetChanged();
                return;
            }
            this.f75682Q0.setVisibility(8);
            m82390zM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_result_user_oa), MultiStateView.EnumC15915f.UNKNOWN_ERROR);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: AM */
    void m82379AM() {
        MultiStateView multiStateView = this.f75684S0;
        if (multiStateView != null) {
            multiStateView.setVisibility(0);
            this.f75684S0.setState(MultiStateView.EnumC15914e.LOADING);
        }
    }

    /* renamed from: BM */
    void m82380BM() {
        this.f75689X0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.s20
            @Override // java.lang.Runnable
            public final void run() {
                OANearbyZView.this.m82378sM();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f75692a1 = new C23528a(m92648SI());
        this.f75693b1 = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j c8009j = null;
        if (i11 != 3) {
            if (i11 == 4) {
                try {
                    C8009j.a aVar = new C8009j.a(m92648SI());
                    aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9));
                    aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.warning_location_invalid_dob));
                    aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), this);
                    aVar.m43169r(AbstractC8020f0.update, this);
                    return aVar.m43152a();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            try {
                C8009j.a aVar2 = new C8009j.a(m92648SI());
                aVar2.m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.ask_to_enable_gps)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_confirm_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_title), this);
                c8009j = aVar2.m43152a();
                c8009j.m92874z(false);
                return c8009j;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return c8009j;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75681P0 = layoutInflater.inflate(AbstractC7409c0.user_oa_view, viewGroup, false);
        m82388xM();
        return this.f75681P0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int mo92862f = interfaceC17463d.mo92862f();
        if (mo92862f != 3) {
            if (mo92862f == 4) {
                if (i11 == -1) {
                    m82384tM();
                    interfaceC17463d.dismiss();
                    return;
                } else {
                    if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        finish();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i11 == -1) {
            interfaceC17463d.dismiss();
            m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OANearbyZView";
    }

    /* renamed from: lM */
    void m82381lM(ContactProfile contactProfile) {
        try {
            if (this.f75695d1) {
                return;
            }
            String str = contactProfile.f42434r;
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14702c(str, contactProfile));
            this.f75695d1 = true;
            c0766k.mo1578Y4(Integer.parseInt(str), new TrackingSource(273));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m82382mM() {
        try {
            if (this.f75685T0) {
                return;
            }
            if (!C23055e5.m118271f()) {
                m82390zM(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG), MultiStateView.EnumC15915f.NETWORK_ERROR);
                return;
            }
            this.f75688W0.clear();
            this.f75686U0.clear();
            this.f75687V0.clear();
            this.f75684S0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_nearby));
            this.f75684S0.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_friend_location));
            if (this.f75694c1) {
                m82379AM();
            }
            this.f75694c1 = false;
            if (this.f75690Y0 == null) {
                this.f75690Y0 = new C0766k();
            }
            this.f75690Y0.mo1704o8(new C14701b());
            this.f75685T0 = true;
            this.f75690Y0.mo1489N3(C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m(), String.valueOf(C28139n5.m141620j().m141637i()), "" + C28139n5.m141620j().m141646s(), "" + C28139n5.m141620j().m141647t(), "" + C28139n5.m141620j().m141639l(), this.f75693b1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.ViewOnClickListenerC7161o4.b
    /* renamed from: n */
    public void mo36435n(int i11) {
        try {
            C3544l c3544l = (C3544l) this.f75691Z0.getItem(i11);
            if (c3544l.m18014d() == 2) {
                C3565f m18012b = c3544l.m18012b();
                if (m18012b.m18121j()) {
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(String.valueOf(m18012b.m18119h()), C32002l4.m154264g(20)).m135743b(), 0, 1));
                } else {
                    AbstractC23152n3.m119042f0(m92648SI(), m18012b.m18112a(), m18012b.m18118g(), m18012b.m18117f());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m82383nM(C20096c c20096c) {
        final int m104491c;
        if (c20096c == null) {
            m104491c = -1;
        } else {
            try {
                m104491c = c20096c.m104491c();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.q20
            @Override // java.lang.Runnable
            public final void run() {
                OANearbyZView.this.m82374oM(m104491c);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i12 == -1 && i11 == 10) {
            m82387wM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f75691Z0;
        if (viewOnClickListenerC7161o4 != null) {
            viewOnClickListenerC7161o4.notifyDataSetChanged();
        }
    }

    @Override // com.zing.zalo.adapters.ViewOnClickListenerC7161o4.f
    /* renamed from: pr */
    public void mo36436pr(ContactProfile contactProfile, int i11) {
        try {
            if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f75691Z0;
                if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() > 0) {
                    TrackingSource trackingSource = new TrackingSource(80);
                    trackingSource.m40677a("idx", Integer.valueOf(i11));
                    C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                    new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(20)).m135744c(contactProfile).m135739F("5360").m135743b(), 0, 1));
                }
                AbstractC23647d.m123893c();
                return;
            }
            m82381lM(contactProfile);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m82384tM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("update", true);
        m92662fJ().m93069k2(UpdateUserInfoZView.class, bundle, 1, true);
    }

    /* renamed from: uM */
    void m82385uM(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("oa_data");
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2 != null) {
                        this.f75686U0.add(new C3565f(jSONObject2));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vM */
    void m82386vM(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("others_data");
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2 != null) {
                        this.f75687V0.add(new C3565f(jSONObject2));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    public void m82387wM() {
        try {
            C28239y6 c28239y6 = new C28239y6();
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = this.f75691Z0;
            if (viewOnClickListenerC7161o4 != null && viewOnClickListenerC7161o4.getCount() == 0 && !c28239y6.m142222a(m92648SI())) {
                removeDialog(3);
                showDialog(3);
            } else {
                m82382mM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m82382mM();
    }

    /* renamed from: xM */
    void m82388xM() {
        MultiStateView multiStateView = (MultiStateView) this.f75681P0.findViewById(AbstractC6918a0.multi_state);
        this.f75684S0 = multiStateView;
        multiStateView.setEnableLoadingText(true);
        this.f75684S0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.o20
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                OANearbyZView.this.m82375pM();
            }
        });
        this.f75681P0.findViewById(AbstractC6918a0.user_settings_layout).setVisibility(8);
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) this.f75681P0.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f75682Q0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.p20
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                OANearbyZView.this.m82376qM();
            }
        });
        this.f75682Q0.m35371s(false, 0, AbstractC23136l9.m118655I(AbstractC16802y.func_bar_general_h) + AbstractC23136l9.m118742r(10.0f));
        if (this.f75683R0 == null) {
            this.f75683R0 = this.f75682Q0.f83579m0;
        }
        this.f75683R0.setOnScrollListener(new C14700a());
        if (this.f75691Z0 == null) {
            ViewOnClickListenerC7161o4 viewOnClickListenerC7161o4 = new ViewOnClickListenerC7161o4(m92648SI(), this.f75692a1, this.f75688W0);
            this.f75691Z0 = viewOnClickListenerC7161o4;
            viewOnClickListenerC7161o4.m36432b(this);
            this.f75691Z0.m36433c(this);
            this.f75683R0.setAdapter((ListAdapter) this.f75691Z0);
            this.f75683R0.setSelection(0);
            if (this.f75691Z0.getCount() > 0) {
                this.f75684S0.setVisibility(8);
                this.f75682Q0.setVisibility(0);
            } else {
                this.f75682Q0.setVisibility(8);
                m82379AM();
            }
        }
    }

    /* renamed from: yM */
    void m82389yM(final int i11) {
        try {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.r20
                @Override // java.lang.Runnable
                public final void run() {
                    OANearbyZView.this.m82377rM(i11);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: zM */
    void m82390zM(String str, MultiStateView.EnumC15915f enumC15915f) {
        MultiStateView multiStateView = this.f75684S0;
        if (multiStateView != null) {
            boolean z11 = false;
            multiStateView.setVisibility(0);
            this.f75684S0.bringToFront();
            this.f75684S0.setErrorTitleString(str);
            MultiStateView multiStateView2 = this.f75684S0;
            if (enumC15915f == MultiStateView.EnumC15915f.NETWORK_ERROR) {
                z11 = true;
            }
            multiStateView2.setEnableImageErrorView(z11);
            this.f75684S0.setState(MultiStateView.EnumC15914e.ERROR);
            this.f75684S0.setErrorType(enumC15915f);
        }
    }
}
