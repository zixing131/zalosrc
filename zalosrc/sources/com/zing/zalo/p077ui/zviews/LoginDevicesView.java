package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7094i3;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.LoginDevicesView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p716zh.C32077q6;
import v50.C27870vb;

/* loaded from: classes6.dex */
public class LoginDevicesView extends SlidableZaloView implements C7094i3.a, InterfaceC0733x {

    /* renamed from: e1 */
    public static int f74699e1 = 0;

    /* renamed from: f1 */
    public static int f74700f1 = 1;

    /* renamed from: g1 */
    public static int f74701g1 = 2;

    /* renamed from: P0 */
    SwipeRefreshListView f74702P0;

    /* renamed from: Q0 */
    ListView f74703Q0;

    /* renamed from: R0 */
    MultiStateView f74704R0;

    /* renamed from: S0 */
    volatile boolean f74705S0;

    /* renamed from: T0 */
    InterfaceC0765j f74706T0;

    /* renamed from: U0 */
    InterfaceC20094a f74707U0;

    /* renamed from: V0 */
    volatile boolean f74708V0;

    /* renamed from: W0 */
    InterfaceC0765j f74709W0;

    /* renamed from: X0 */
    InterfaceC20094a f74710X0;

    /* renamed from: Y0 */
    C7094i3 f74711Y0;

    /* renamed from: Z0 */
    ArrayList f74712Z0;

    /* renamed from: a1 */
    String f74713a1;

    /* renamed from: b1 */
    C32077q6 f74714b1;

    /* renamed from: c1 */
    View f74715c1;

    /* renamed from: d1 */
    CheckBox f74716d1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.LoginDevicesView$a */
    /* loaded from: classes6.dex */
    public class C14519a implements InterfaceC20094a {
        C14519a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m81172e(ArrayList arrayList) {
            SwipeRefreshListView swipeRefreshListView = LoginDevicesView.this.f74702P0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
            }
            LoginDevicesView.this.f74711Y0.m36170d(arrayList);
            LoginDevicesView.this.m81169zM(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m81173f(C20096c c20096c) {
            SwipeRefreshListView swipeRefreshListView = LoginDevicesView.this.f74702P0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
            }
            LoginDevicesView.this.m81169zM(false);
            if (c20096c.m104491c() == 50001) {
                LoginDevicesView.this.f74704R0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                LoginDevicesView.this.f74704R0.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            } else {
                LoginDevicesView.this.f74704R0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loadingList));
                LoginDevicesView.this.f74704R0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            LoginDevicesView.this.f74705S0 = false;
            LoginDevicesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.cu
                @Override // java.lang.Runnable
                public final void run() {
                    LoginDevicesView.C14519a.this.m81173f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    JSONArray jSONArray = ((JSONObject) obj).getJSONObject("data").getJSONArray("devices");
                    if (jSONArray.length() > 0) {
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            arrayList.add(C32077q6.m154729a(jSONArray.getJSONObject(i11)));
                        }
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(LoginDevicesView.this.m81158oM());
                    }
                    LoginDevicesView loginDevicesView = LoginDevicesView.this;
                    loginDevicesView.f74712Z0 = arrayList;
                    final ArrayList m81157nM = loginDevicesView.m81157nM();
                    LoginDevicesView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.du
                        @Override // java.lang.Runnable
                        public final void run() {
                            LoginDevicesView.C14519a.this.m81172e(m81157nM);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                LoginDevicesView.this.f74705S0 = false;
            } catch (Throwable th2) {
                LoginDevicesView.this.f74705S0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.LoginDevicesView$b */
    /* loaded from: classes6.dex */
    public class C14520b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C32077q6 f74718a;

        /* renamed from: b */
        final /* synthetic */ int f74719b;

        C14520b(C32077q6 c32077q6, int i11) {
            this.f74718a = c32077q6;
            this.f74719b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81175d(int i11) {
            if (!LoginDevicesView.this.f72421L0.m92677nJ() && !LoginDevicesView.this.f72421L0.m92681pJ()) {
                if (i11 == LoginDevicesView.f74699e1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_logoutpc_success));
                } else if (i11 == LoginDevicesView.f74700f1) {
                    LoginDevicesView.this.showDialog(4);
                } else if (i11 == LoginDevicesView.f74701g1) {
                    LoginDevicesView.this.showDialog(3);
                }
                C7094i3 c7094i3 = LoginDevicesView.this.f74711Y0;
                if (c7094i3 != null) {
                    c7094i3.notifyDataSetChanged();
                }
                LoginDevicesView.this.m81165qM(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            LoginDevicesView.this.f74708V0 = false;
            LoginDevicesView.this.f72421L0.mo49315c4();
            ToastUtils.showMess(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                LoginDevicesView.this.f74708V0 = false;
                LoginDevicesView.this.f72421L0.mo49315c4();
                C32077q6 c32077q6 = this.f74718a;
                if (c32077q6 != null) {
                    c32077q6.m154737i();
                }
                InterfaceC27218a m92676n2 = LoginDevicesView.this.f72421L0.m92676n2();
                final int i11 = this.f74719b;
                m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.eu
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoginDevicesView.C14520b.this.m81175d(i11);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public ArrayList m81157nM() {
        ArrayList arrayList = this.f74712Z0;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        if (size == 0) {
            return arrayList2;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C32077q6 c32077q6 = (C32077q6) arrayList.get(i11);
            if (c32077q6 != null) {
                int i12 = c32077q6.f147717j;
                if (i12 == C32077q6.f147703G && !z11) {
                    C32077q6 c32077q62 = new C32077q6(C32077q6.f147698B);
                    c32077q62.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_new_logged_in_device);
                    arrayList2.add(c32077q62);
                    z11 = true;
                } else if (i12 == C32077q6.f147704H && !z12) {
                    if (z11) {
                        if (arrayList2.size() > 0) {
                            ((C32077q6) arrayList2.get(arrayList2.size() - 1)).f147722o = false;
                        }
                        arrayList2.add(new C32077q6(C32077q6.f147699C));
                    }
                    C32077q6 c32077q63 = new C32077q6(C32077q6.f147698B);
                    c32077q63.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_list_login_device);
                    arrayList2.add(c32077q63);
                    z12 = true;
                }
                arrayList2.add(c32077q6);
            }
        }
        if (arrayList2.size() > 0) {
            ((C32077q6) arrayList2.get(arrayList2.size() - 1)).f147722o = false;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public C32077q6 m81158oM() {
        C32077q6 c32077q6 = new C32077q6();
        c32077q6.f147713f = 1;
        c32077q6.f147712e = 2;
        c32077q6.f147717j = C32077q6.f147704H;
        c32077q6.f147708a = m81159pM();
        c32077q6.f147721n = c32077q6.m154733e();
        c32077q6.f147722o = false;
        return c32077q6;
    }

    /* renamed from: pM */
    private String m81159pM() {
        StringBuilder sb2 = new StringBuilder();
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            if (!TextUtils.isEmpty(sb2)) {
                sb2.append("_");
            }
            String str2 = Build.MODEL;
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m81160tM() {
        m81165qM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m81161uM() {
        if (!C23055e5.m118271f()) {
            this.f74702P0.setRefreshing(false);
            this.f74702P0.m88209V();
            return;
        }
        this.f74702P0.m88202K();
        if (!this.f74705S0 && !this.f74708V0) {
            m81165qM(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m81162vM(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        C32077q6 c32077q6 = this.f74714b1;
        if (this.f74716d1.isChecked()) {
            i12 = f74700f1;
        } else {
            i12 = f74699e1;
        }
        m81168yM(c32077q6, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m81163wM(View view) {
        CheckBox checkBox = this.f74716d1;
        if (checkBox != null) {
            checkBox.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m81164xM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m81168yM(this.f74714b1, f74701g1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_logout_report_device_success);
                    int indexOf = m118743r0.indexOf("*#*");
                    String replace = m118743r0.replace("*#*", "");
                    int indexOf2 = replace.indexOf(":", indexOf);
                    SpannableString spannableString = new SpannableString(replace);
                    spannableString.setSpan(new StyleSpan(1), indexOf, indexOf2, 33);
                    C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                    aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_logout_report_device_success)).m43162k(spannableString).m43164m(AbstractC8020f0.str_btn_cancel_popup_report_device, new InterfaceC17463d.b());
                    return aVar.m43152a();
                }
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_report_device_success);
                int indexOf3 = m118743r02.indexOf("*#*");
                String replace2 = m118743r02.replace("*#*", "");
                int indexOf4 = replace2.indexOf(":", indexOf3);
                SpannableString spannableString2 = new SpannableString(replace2);
                spannableString2.setSpan(new StyleSpan(1), indexOf3, indexOf4, 33);
                C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
                aVar2.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_report_device_success)).m43162k(spannableString2).m43164m(AbstractC8020f0.str_btn_cancel_popup_report_device, new InterfaceC17463d.b());
                return aVar2.m43152a();
            }
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_report_device);
            int indexOf5 = m118743r03.indexOf("*#*");
            String replace3 = m118743r03.replace("*#*", "");
            int indexOf6 = replace3.indexOf(":", indexOf5);
            SpannableString spannableString3 = new SpannableString(replace3);
            spannableString3.setSpan(new StyleSpan(1), indexOf5, indexOf6, 33);
            C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
            aVar3.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_report_device)).m43162k(spannableString3).m43164m(AbstractC8020f0.str_btn_cancel_popup_report_device, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_report_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bu
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    LoginDevicesView.this.m81164xM(interfaceC17463d, i12);
                }
            });
            return aVar3.m43152a();
        }
        C8009j.a aVar4 = new C8009j.a(this.f72421L0.m92648SI());
        aVar4.m43159h(4).m43162k(this.f74713a1).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.logout_title, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.zt
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                LoginDevicesView.this.m81162vM(interfaceC17463d, i12);
            }
        });
        View inflate = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.checkbox_remove_contact_view, (ViewGroup) null);
        this.f74716d1 = (CheckBox) inflate.findViewById(AbstractC6918a0.cbRemoveContact);
        ((TextView) inflate.findViewById(AbstractC6918a0.tvRemoveContact)).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_checkbox_report_device));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.au
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginDevicesView.this.m81163wM(view);
            }
        });
        aVar4.m43177z(inflate);
        return aVar4.m43152a();
    }

    @Override // com.zing.zalo.adapters.C7094i3.a
    /* renamed from: F4 */
    public void mo36171F4(C32077q6 c32077q6) {
        if (c32077q6.f147712e != 2) {
            this.f74714b1 = c32077q6;
            showDialog(2);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.login_devices_view, viewGroup, false);
        this.f74715c1 = inflate;
        m81167sM(inflate);
        return this.f74715c1;
    }

    @Override // com.zing.zalo.adapters.C7094i3.a
    /* renamed from: Ky */
    public void mo36172Ky(C32077q6 c32077q6) {
        String str = c32077q6.f147710c;
        this.f74713a1 = str;
        if (TextUtils.isEmpty(str)) {
            this.f74713a1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_logout);
        }
        this.f74714b1 = c32077q6;
        AbstractC23647d.m123897g("5811164");
        this.f72421L0.showDialog(1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("5811165");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_history_login));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, com.zing.zalo.adapters.C7079h.b
    public Context getContext() {
        return this.f72421L0.m92648SI();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LoginDevicesView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("5811165");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: qM */
    void m81165qM(boolean z11) {
        if (this.f74705S0) {
            return;
        }
        m81169zM(z11);
        this.f74705S0 = true;
        this.f74702P0.setRefreshing(true);
        this.f74706T0.mo1704o8(this.f74707U0);
        this.f74706T0.mo1764w4(AbstractC18458a.f93019a, 0);
    }

    /* renamed from: rM */
    void m81166rM() {
        this.f74712Z0 = new ArrayList();
        C7094i3 c7094i3 = new C7094i3(this);
        this.f74711Y0 = c7094i3;
        this.f74703Q0.setAdapter((ListAdapter) c7094i3);
        this.f74709W0 = new C0766k();
        this.f74704R0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.xt
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                LoginDevicesView.this.m81160tM();
            }
        });
        this.f74702P0.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.yt
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                LoginDevicesView.this.m81161uM();
            }
        });
        this.f74706T0 = new C0766k();
        this.f74707U0 = new C14519a();
        m81165qM(true);
    }

    /* renamed from: sM */
    void m81167sM(View view) {
        this.f74704R0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f74702P0 = swipeRefreshListView;
        this.f74703Q0 = swipeRefreshListView.f83579m0;
    }

    @Override // com.zing.zalo.adapters.C7094i3.a
    /* renamed from: w */
    public void mo36173w(ContactProfile contactProfile) {
        if (contactProfile != null) {
            this.f72421L0.m92662fJ().m93069k2(ChatView.class, new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b(), 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m81166rM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yM */
    void m81168yM(C32077q6 c32077q6, int i11) {
        if (!this.f74708V0 && c32077q6 != null) {
            this.f74710X0 = new C14520b(c32077q6, i11);
            this.f74708V0 = true;
            this.f72421L0.mo46829Y();
            this.f74709W0.mo1704o8(this.f74710X0);
            this.f74709W0.mo1441H3(c32077q6.f147719l, c32077q6.f147709b, 0, i11, c32077q6.f147720m);
        }
    }

    /* renamed from: zM */
    void m81169zM(boolean z11) {
        try {
            if (z11) {
                this.f74702P0.setVisibility(8);
                this.f74704R0.setVisibility(0);
                this.f74704R0.setState(MultiStateView.EnumC15914e.LOADING);
            } else if (this.f74712Z0.size() > 0) {
                this.f74702P0.setVisibility(0);
                this.f74704R0.setVisibility(8);
                this.f74711Y0.notifyDataSetChanged();
            } else {
                this.f74702P0.setVisibility(8);
                this.f74704R0.setVisibility(0);
                this.f74704R0.setState(MultiStateView.EnumC15914e.ERROR);
                this.f74704R0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                this.f74704R0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loadingList));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
