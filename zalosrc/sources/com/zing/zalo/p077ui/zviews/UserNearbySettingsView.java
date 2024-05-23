package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.zviews.UserNearbySettingsView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class UserNearbySettingsView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: P0 */
    View f79201P0;

    /* renamed from: Q0 */
    MultiStateView f79202Q0;

    /* renamed from: R0 */
    RadioButton f79203R0;

    /* renamed from: S0 */
    RadioButton f79204S0;

    /* renamed from: T0 */
    RadioButton f79205T0;

    /* renamed from: U0 */
    RadioButton f79206U0;

    /* renamed from: V0 */
    RadioButton f79207V0;

    /* renamed from: W0 */
    RadioButton f79208W0;

    /* renamed from: X0 */
    View f79209X0;

    /* renamed from: Y0 */
    C15326c f79210Y0;

    /* renamed from: Z0 */
    Handler f79211Z0;

    /* renamed from: a1 */
    boolean f79212a1;

    /* renamed from: b1 */
    TextView f79213b1;

    /* renamed from: c1 */
    int f79214c1;

    /* renamed from: d1 */
    int f79215d1;

    /* renamed from: e1 */
    int f79216e1;

    /* renamed from: f1 */
    boolean f79217f1;

    /* renamed from: g1 */
    InterfaceC0765j f79218g1 = new C0766k();

    /* renamed from: h1 */
    InterfaceC20094a f79219h1 = new C15324a();

    /* renamed from: i1 */
    InterfaceC20094a f79220i1 = new C15325b();

    /* renamed from: j1 */
    int f79221j1;

    /* renamed from: k1 */
    int f79222k1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbySettingsView$a */
    /* loaded from: classes6.dex */
    public class C15324a implements InterfaceC20094a {
        C15324a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m86422g() {
            UserNearbySettingsView.this.m86417qM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m86423h() {
            try {
                UserNearbySettingsView.this.m86416pM(false);
                UserNearbySettingsView.this.m86412jM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m86424i() {
            UserNearbySettingsView.this.m86416pM(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m86425j(C20096c c20096c) {
            int i11;
            MultiStateView.EnumC15915f enumC15915f;
            if (c20096c != null && !UserNearbySettingsView.this.mo60294yp()) {
                UserNearbySettingsView.this.f79202Q0.setVisibility(0);
                UserNearbySettingsView.this.f79202Q0.setState(MultiStateView.EnumC15914e.ERROR);
                MultiStateView multiStateView = UserNearbySettingsView.this.f79202Q0;
                if (c20096c.m104491c() == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.nearby_setting_empty_text;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
                MultiStateView multiStateView2 = UserNearbySettingsView.this.f79202Q0;
                if (c20096c.m104491c() == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView2.setErrorType(enumC15915f);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                UserNearbySettingsView.this.f79211Z0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.j21
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserNearbySettingsView.C15324a.this.m86425j(c20096c);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && jSONObject.has("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    UserNearbySettingsView.this.f79215d1 = jSONObject2.getInt("ageFrom");
                    UserNearbySettingsView.this.f79216e1 = jSONObject2.getInt("ageTo");
                    int i12 = jSONObject2.getInt("gender");
                    int i13 = jSONObject2.getInt("minAge");
                    int i14 = jSONObject2.getInt("maxAge");
                    UserNearbySettingsView userNearbySettingsView = UserNearbySettingsView.this;
                    int i15 = userNearbySettingsView.f79215d1;
                    if (i15 >= 0 && (i11 = userNearbySettingsView.f79216e1) >= 0 && i13 >= 0 && i14 >= 0 && i13 <= i14) {
                        userNearbySettingsView.f79210Y0 = new C15326c(i15, i11, i12, i13, i14);
                        UserNearbySettingsView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.g21
                            @Override // java.lang.Runnable
                            public final void run() {
                                UserNearbySettingsView.C15324a.this.m86422g();
                            }
                        });
                        UserNearbySettingsView.this.f79211Z0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.h21
                            @Override // java.lang.Runnable
                            public final void run() {
                                UserNearbySettingsView.C15324a.this.m86423h();
                            }
                        });
                        return;
                    }
                    throw new JSONException("Invalid nearby setting");
                }
                throw new Exception("Null json");
            } catch (Exception e11) {
                e11.printStackTrace();
                UserNearbySettingsView.this.f79211Z0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.i21
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserNearbySettingsView.C15324a.this.m86424i();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbySettingsView$b */
    /* loaded from: classes6.dex */
    public class C15325b implements InterfaceC20094a {
        C15325b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86428e() {
            UserNearbySettingsView.this.mo49315c4();
            if (UserNearbySettingsView.this.m92672lJ()) {
                UserNearbySettingsView.this.mo50035CK(-1, null);
                UserNearbySettingsView.this.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86429f() {
            UserNearbySettingsView.this.mo49315c4();
            UserNearbySettingsView.this.showDialog(1);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            UserNearbySettingsView userNearbySettingsView = UserNearbySettingsView.this;
            userNearbySettingsView.f79212a1 = false;
            try {
                userNearbySettingsView.f79211Z0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserNearbySettingsView.C15325b.this.m86429f();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                UserNearbySettingsView userNearbySettingsView = UserNearbySettingsView.this;
                int i11 = 0;
                userNearbySettingsView.f79212a1 = false;
                if (userNearbySettingsView.f79206U0.isChecked()) {
                    i11 = 1;
                } else if (!UserNearbySettingsView.this.f79207V0.isChecked()) {
                    i11 = -1;
                }
                AbstractC23309i.m122253oo(i11);
                UserNearbySettingsView userNearbySettingsView2 = UserNearbySettingsView.this;
                AbstractC23304d.f113440t2 = userNearbySettingsView2.f79217f1;
                userNearbySettingsView2.f79211Z0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.l21
                    @Override // java.lang.Runnable
                    public final void run() {
                        UserNearbySettingsView.C15325b.this.m86428e();
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.UserNearbySettingsView$c */
    /* loaded from: classes6.dex */
    public static class C15326c {

        /* renamed from: a */
        int f79225a;

        /* renamed from: b */
        int f79226b;

        /* renamed from: c */
        int f79227c;

        /* renamed from: d */
        final int f79228d;

        /* renamed from: e */
        final int f79229e;

        public C15326c(int i11, int i12, int i13, int i14, int i15) {
            this.f79225a = i11;
            this.f79226b = i12;
            this.f79227c = i13;
            this.f79229e = i14;
            this.f79228d = i15;
        }

        /* renamed from: a */
        public boolean m86430a() {
            return (this.f79229e == 0 && this.f79228d == 0) ? false : true;
        }

        /* renamed from: b */
        public int m86431b() {
            return this.f79225a;
        }

        /* renamed from: c */
        public int m86432c() {
            return this.f79226b;
        }

        /* renamed from: d */
        public int m86433d() {
            return this.f79227c;
        }

        /* renamed from: e */
        public int m86434e() {
            return this.f79228d;
        }

        /* renamed from: f */
        public int m86435f() {
            return this.f79229e;
        }

        /* renamed from: g */
        public void m86436g(int i11) {
            this.f79225a = i11;
        }

        /* renamed from: h */
        public void m86437h(int i11) {
            this.f79226b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m86409nM(NumberPicker numberPicker, NumberPicker numberPicker2, int i11, int i12) {
        try {
            if (i12 > numberPicker.getValue()) {
                numberPicker.setValue(i12);
                this.f79222k1 = i12;
            }
            this.f79221j1 = i12;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m86410oM(NumberPicker numberPicker, NumberPicker numberPicker2, int i11, int i12) {
        if (i12 < numberPicker.getValue()) {
            numberPicker.setValue(i12);
            this.f79221j1 = i12;
        }
        this.f79222k1 = i12;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                try {
                    C8009j.a aVar = new C8009j.a(m92648SI());
                    View inflate = LayoutInflater.from(m92648SI()).inflate(AbstractC7409c0.pick_number_range_layout, (ViewGroup) null);
                    final NumberPicker numberPicker = (NumberPicker) inflate.findViewById(AbstractC6918a0.picker_num_from);
                    final NumberPicker numberPicker2 = (NumberPicker) inflate.findViewById(AbstractC6918a0.picker_num_to);
                    numberPicker.setDescendantFocusability(393216);
                    numberPicker2.setDescendantFocusability(393216);
                    numberPicker.setMaxValue(this.f79210Y0.m86434e());
                    numberPicker.setMinValue(this.f79210Y0.m86435f());
                    numberPicker.setFocusable(true);
                    numberPicker.setFocusableInTouchMode(true);
                    numberPicker2.setMaxValue(this.f79210Y0.m86434e());
                    numberPicker2.setMinValue(this.f79210Y0.m86435f());
                    numberPicker2.setFocusable(true);
                    numberPicker2.setFocusableInTouchMode(true);
                    numberPicker.setValue(this.f79210Y0.m86431b());
                    this.f79221j1 = this.f79210Y0.m86431b();
                    numberPicker2.setValue(this.f79210Y0.m86432c());
                    this.f79222k1 = this.f79210Y0.m86432c();
                    numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.zing.zalo.ui.zviews.d21
                        @Override // android.widget.NumberPicker.OnValueChangeListener
                        public final void onValueChange(NumberPicker numberPicker3, int i12, int i13) {
                            UserNearbySettingsView.this.m86409nM(numberPicker2, numberPicker3, i12, i13);
                        }
                    });
                    numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: com.zing.zalo.ui.zviews.e21
                        @Override // android.widget.NumberPicker.OnValueChangeListener
                        public final void onValueChange(NumberPicker numberPicker3, int i12, int i13) {
                            UserNearbySettingsView.this.m86410oM(numberPicker, numberPicker3, i12, i13);
                        }
                    });
                    aVar.m43177z(inflate);
                    aVar.m43171t(AbstractC8020f0.nearby_age_range_dialog_header);
                    aVar.m43154c(false);
                    aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel), this);
                    aVar.m43169r(AbstractC8020f0.f43842ok, this);
                    return aVar.m43152a();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            try {
                C8009j.a aVar2 = new C8009j.a(m92648SI());
                aVar2.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_setting_update_failed)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleClose), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry), this);
                C8009j m43152a = aVar2.m43152a();
                m43152a.m92873y(false);
                return m43152a;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.user_nearby_settings_view, viewGroup, false);
        this.f79211Z0 = new Handler();
        m86415mM(inflate);
        m86413kM();
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f == 2) {
                    if (i11 == -1) {
                        if (this.f79221j1 > this.f79222k1) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.neary_age_range_invalid));
                        } else {
                            interfaceC17463d.dismiss();
                            C15326c c15326c = this.f79210Y0;
                            if (c15326c != null) {
                                c15326c.m86436g(this.f79221j1);
                                this.f79210Y0.m86437h(this.f79222k1);
                                m86417qM();
                            }
                        }
                    } else if (i11 == -2) {
                        interfaceC17463d.dismiss();
                        removeDialog(2);
                    }
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                m86414lM();
            } else if (i11 == -2) {
                interfaceC17463d.dismiss();
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_option_nearby_advanced_settings));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserNearbySettingsView";
    }

    /* renamed from: iM */
    void m86411iM(int i11) {
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f79206U0.setChecked(true);
                    return;
                }
                return;
            }
            this.f79207V0.setChecked(true);
            return;
        }
        this.f79208W0.setChecked(true);
    }

    /* renamed from: jM */
    void m86412jM() {
        try {
            if (this.f79210Y0 == null) {
                return;
            }
            int m122081k4 = AbstractC23309i.m122081k4();
            this.f79214c1 = m122081k4;
            m86411iM(m122081k4);
            if (this.f79210Y0.m86433d() == 1) {
                this.f79203R0.setChecked(true);
            } else if (this.f79210Y0.m86433d() == 0) {
                this.f79204S0.setChecked(true);
            } else {
                this.f79205T0.setChecked(true);
            }
            if (this.f79210Y0.m86430a()) {
                this.f79209X0.setVisibility(0);
                m86417qM();
            } else {
                this.f79209X0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kM */
    public void m86413kM() {
        try {
            m86416pM(true);
            this.f79218g1.mo1704o8(this.f79219h1);
            this.f79218g1.mo1672k5();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m86414lM() {
        int i11;
        int i12;
        int i13;
        try {
            if (!this.f79212a1 && this.f79210Y0 != null) {
                mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f79212a1 = true;
                if (this.f79203R0.isChecked()) {
                    i11 = 1;
                } else if (this.f79204S0.isChecked()) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                if (this.f79210Y0.m86430a()) {
                    i12 = this.f79210Y0.m86431b();
                    i13 = this.f79210Y0.m86432c();
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (this.f79215d1 != i12 || this.f79216e1 != i13 || this.f79214c1 != i11) {
                    this.f79217f1 = true;
                }
                this.f79218g1.mo1704o8(this.f79220i1);
                this.f79218g1.mo1405C8(i12, i13, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f79212a1 = false;
            mo49315c4();
        }
    }

    /* renamed from: mM */
    void m86415mM(View view) {
        view.findViewById(AbstractC6918a0.btn_update_nearby_settings).setOnClickListener(this);
        this.f79201P0 = view.findViewById(AbstractC6918a0.ll_setting);
        this.f79213b1 = (TextView) view.findViewById(AbstractC6918a0.tv_selected_age);
        View findViewById = view.findViewById(AbstractC6918a0.rl_nearby_setting_age_range);
        this.f79209X0 = findViewById;
        findViewById.setOnClickListener(this);
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f79202Q0 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.f21
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                UserNearbySettingsView.this.m86413kM();
            }
        });
        this.f79202Q0.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_setting_empty_text));
        this.f79202Q0.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING));
        Context context = view.getContext();
        RadioButton radioButton = (RadioButton) view.findViewById(AbstractC6918a0.rb_all);
        this.f79205T0 = radioButton;
        radioButton.setTypeface(C13718q1.m76694c(context, 7));
        RadioButton radioButton2 = (RadioButton) view.findViewById(AbstractC6918a0.rb_male);
        this.f79204S0 = radioButton2;
        radioButton2.setTypeface(C13718q1.m76694c(context, 7));
        RadioButton radioButton3 = (RadioButton) view.findViewById(AbstractC6918a0.rb_female);
        this.f79203R0 = radioButton3;
        radioButton3.setTypeface(C13718q1.m76694c(context, 7));
        RadioButton radioButton4 = (RadioButton) view.findViewById(AbstractC6918a0.rb_search_who_all);
        this.f79208W0 = radioButton4;
        radioButton4.setTypeface(C13718q1.m76694c(context, 7));
        RadioButton radioButton5 = (RadioButton) view.findViewById(AbstractC6918a0.rb_search_who_female);
        this.f79206U0 = radioButton5;
        radioButton5.setTypeface(C13718q1.m76694c(context, 7));
        RadioButton radioButton6 = (RadioButton) view.findViewById(AbstractC6918a0.rb_search_who_male);
        this.f79207V0 = radioButton6;
        radioButton6.setTypeface(C13718q1.m76694c(context, 7));
        this.f79205T0.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.nearby_radio_button_text_color));
        this.f79204S0.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.nearby_radio_button_text_color));
        this.f79203R0.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.nearby_radio_button_text_color));
        this.f79208W0.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.nearby_radio_button_text_color));
        this.f79206U0.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.nearby_radio_button_text_color));
        this.f79207V0.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.nearby_radio_button_text_color));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_update_nearby_settings) {
            m86414lM();
        } else if (id2 == AbstractC6918a0.rl_nearby_setting_age_range) {
            showDialog(2);
        }
    }

    /* renamed from: pM */
    void m86416pM(boolean z11) {
        try {
            if (z11) {
                this.f79201P0.setVisibility(8);
                this.f79202Q0.setVisibility(0);
                this.f79202Q0.setState(MultiStateView.EnumC15914e.LOADING);
            } else if (this.f79210Y0 != null) {
                this.f79202Q0.setVisibility(8);
                this.f79201P0.setVisibility(0);
            } else {
                this.f79201P0.setVisibility(8);
                this.f79202Q0.setVisibility(0);
                this.f79202Q0.setState(MultiStateView.EnumC15914e.ERROR);
                this.f79202Q0.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_setting_empty_text));
                this.f79202Q0.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m86417qM() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f79210Y0.m86431b());
            if (this.f79210Y0.m86431b() != this.f79210Y0.m86432c()) {
                sb2.append(" - ");
                sb2.append(this.f79210Y0.m86432c());
            }
            this.f79213b1.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.nearby_filter_by_string), sb2.toString()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
