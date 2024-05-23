package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.UpdateGenderAndBirthdayView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Calendar;
import me0.AbstractC23136l9;
import me0.AbstractC23216t1;
import me0.C23055e5;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class UpdateGenderAndBirthdayView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: N0 */
    View f78561N0;

    /* renamed from: O0 */
    View f78562O0;

    /* renamed from: P0 */
    View f78563P0;

    /* renamed from: S0 */
    DatePicker f78566S0;

    /* renamed from: T0 */
    int f78567T0;

    /* renamed from: U0 */
    int f78568U0;

    /* renamed from: V0 */
    int f78569V0;

    /* renamed from: W0 */
    int f78570W0;

    /* renamed from: M0 */
    final String f78560M0 = UpdateGenderAndBirthdayView.class.getSimpleName();

    /* renamed from: Q0 */
    boolean f78564Q0 = true;

    /* renamed from: R0 */
    boolean f78565R0 = false;

    /* renamed from: X0 */
    private final InterfaceC0765j f78571X0 = new C0766k();

    /* renamed from: Y0 */
    boolean f78572Y0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.UpdateGenderAndBirthdayView$a */
    /* loaded from: classes6.dex */
    public class C15232a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78573a;

        /* renamed from: b */
        final /* synthetic */ String f78574b;

        /* renamed from: c */
        final /* synthetic */ String f78575c;

        /* renamed from: d */
        final /* synthetic */ String f78576d;

        C15232a(String str, String str2, String str3, String str4) {
            this.f78573a = str;
            this.f78574b = str2;
            this.f78575c = str3;
            this.f78576d = str4;
        }

        /* renamed from: f */
        public /* synthetic */ void m85576f() {
            try {
                UpdateGenderAndBirthdayView.this.m92662fJ().m93069k2(UpdateAvatarView.class, null, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: g */
        public static /* synthetic */ void m85577g(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* renamed from: h */
        public static /* synthetic */ void m85578h(C20096c c20096c) {
            try {
                ToastUtils.showMess(c20096c.m104492d());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (AbstractC23216t1.m119643h(UpdateGenderAndBirthdayView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.wv0
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        UpdateGenderAndBirthdayView.C15232a.m85577g(str);
                    }
                })) {
                    return;
                }
                if (c20096c != null && UpdateGenderAndBirthdayView.this.m92676n2() != null) {
                    UpdateGenderAndBirthdayView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.xv0
                        public /* synthetic */ xv0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateGenderAndBirthdayView.C15232a.m85578h(C20096c.this);
                        }
                    });
                }
            } finally {
                UpdateGenderAndBirthdayView updateGenderAndBirthdayView = UpdateGenderAndBirthdayView.this;
                updateGenderAndBirthdayView.f78572Y0 = false;
                updateGenderAndBirthdayView.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (!jSONObject.isNull("update_status")) {
                    AbstractC23309i.m122037iz(jSONObject.getJSONObject("update_status").toString());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                try {
                    if (AbstractC23304d.f113368c0 == null) {
                        if (!TextUtils.isEmpty(AbstractC23309i.m121675Zd())) {
                            AbstractC23304d.f113368c0 = new ContactProfile(AbstractC23309i.m121675Zd());
                        } else {
                            AbstractC23304d.f113368c0 = C28203u6.f131407a.m141809c(CoreUtility.f89233i);
                        }
                        if (AbstractC23304d.f113368c0 == null) {
                            AbstractC23304d.f113368c0 = new ContactProfile(CoreUtility.f89233i);
                        }
                    }
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    if (contactProfile != null) {
                        contactProfile.f42449w = Integer.parseInt(this.f78573a);
                        AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
                    }
                    ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
                    if (contactProfile2 != null) {
                        contactProfile2.f42452x = this.f78574b + "/" + this.f78575c + "/" + this.f78576d;
                        AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
                    }
                    if (UpdateGenderAndBirthdayView.this.m92676n2() != null) {
                        UpdateGenderAndBirthdayView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.yv0
                            public /* synthetic */ yv0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateGenderAndBirthdayView.C15232a.this.m85576f();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    UpdateGenderAndBirthdayView updateGenderAndBirthdayView = UpdateGenderAndBirthdayView.this;
                    updateGenderAndBirthdayView.f78572Y0 = false;
                    updateGenderAndBirthdayView.mo49315c4();
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            UpdateGenderAndBirthdayView updateGenderAndBirthdayView2 = UpdateGenderAndBirthdayView.this;
            updateGenderAndBirthdayView2.f78572Y0 = false;
            updateGenderAndBirthdayView2.mo49315c4();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:            if (r5.f78567T0 == r0.get(1)) goto L25;     */
    /* renamed from: gM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m85566gM() {
        boolean z11;
        Calendar calendar = Calendar.getInstance();
        View view = this.f78561N0;
        if (this.f78565R0) {
            z11 = true;
            if (this.f78569V0 == calendar.get(5)) {
                if (this.f78568U0 == calendar.get(2)) {
                }
            }
            view.setEnabled(z11);
        }
        z11 = false;
        view.setEnabled(z11);
    }

    /* renamed from: jM */
    public /* synthetic */ void m85567jM(DatePicker datePicker, int i11, int i12, int i13) {
        this.f78569V0 = i13;
        this.f78568U0 = i12;
        this.f78567T0 = i11;
        m85566gM();
    }

    /* renamed from: kM */
    public static /* synthetic */ void m85568kM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("38545");
    }

    /* renamed from: lM */
    public /* synthetic */ void m85569lM(InterfaceC17463d interfaceC17463d, int i11) {
        String str;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        String valueOf = String.valueOf(this.f78569V0);
        String valueOf2 = String.valueOf(this.f78568U0);
        String valueOf3 = String.valueOf(this.f78567T0);
        if (this.f78564Q0) {
            str = "0";
        } else {
            str = "1";
        }
        m85570hM(valueOf, valueOf2, valueOf3, str);
        AbstractC23647d.m123897g("38546");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(m92651WI().getString(AbstractC8020f0.str_titleDlg2)).m43162k(String.format(m92651WI().getString(AbstractC8020f0.str_confirm_dob_to_set), this.f78569V0 + "/" + this.f78568U0 + "/" + this.f78567T0)).m43165n(m92651WI().getString(AbstractC8020f0.change).toUpperCase(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.tv0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                UpdateGenderAndBirthdayView.m85568kM(interfaceC17463d, i12);
            }
        }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm).toUpperCase(), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.uv0
            public /* synthetic */ uv0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                UpdateGenderAndBirthdayView.this.m85569lM(interfaceC17463d, i12);
            }
        });
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.update_gender_and_birthday_view, viewGroup, false);
        try {
            m85571iM(inflate, bundle);
            AbstractC23647d.m123897g("38540");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            bundle.putBoolean("isSetGender", this.f78565R0);
            bundle.putBoolean("isMale", this.f78564Q0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m92652XI(AbstractC8020f0.str_title_gender_and_birthday));
                this.f88760a0.setBackButtonImage(0);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UpdateGenderAndBirthdayView";
    }

    /* renamed from: hM */
    public void m85570hM(String str, String str2, String str3, String str4) {
        if (C23055e5.m118272g(true) && !this.f78572Y0) {
            this.f78571X0.mo1704o8(new C15232a(str4, str, str2, str3));
            mo46829Y();
            this.f78572Y0 = true;
            this.f78571X0.mo1449I3("", "", str, str2, str3, str4, "", "", "", "", "", "", "");
        }
    }

    /* renamed from: iM */
    void m85571iM(View view, Bundle bundle) {
        DatePicker datePicker = (DatePicker) view.findViewById(AbstractC6918a0.birthDayPicker);
        this.f78566S0 = datePicker;
        datePicker.setDescendantFocusability(393216);
        View findViewById = view.findViewById(AbstractC6918a0.btnNext);
        this.f78561N0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f78561N0.setEnabled(false);
        this.f78562O0 = view.findViewById(AbstractC6918a0.rbMale);
        this.f78563P0 = view.findViewById(AbstractC6918a0.rbFemale);
        view.findViewById(AbstractC6918a0.fl_select_male).setOnClickListener(this);
        view.findViewById(AbstractC6918a0.fl_select_female).setOnClickListener(this);
        if (bundle != null && bundle.getBoolean("isSetGender", false)) {
            m85572mM(bundle.getBoolean("isMale"));
        }
    }

    /* renamed from: mM */
    public void m85572mM(boolean z11) {
        this.f78565R0 = true;
        this.f78564Q0 = z11;
        if (z11) {
            this.f78562O0.setVisibility(0);
            this.f78563P0.setVisibility(8);
        } else {
            this.f78562O0.setVisibility(8);
            this.f78563P0.setVisibility(0);
        }
        m85566gM();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnNext) {
            this.f78569V0 = this.f78566S0.getDayOfMonth();
            this.f78568U0 = this.f78566S0.getMonth() + 1;
            this.f78567T0 = this.f78566S0.getYear();
            String valueOf = String.valueOf(this.f78569V0);
            String valueOf2 = String.valueOf(this.f78568U0);
            String valueOf3 = String.valueOf(this.f78567T0);
            if (this.f78564Q0) {
                str = "0";
            } else {
                str = "1";
            }
            m85570hM(valueOf, valueOf2, valueOf3, str);
            AbstractC23647d.m123897g("38543");
            return;
        }
        if (id2 == AbstractC6918a0.fl_select_male) {
            m85572mM(true);
            AbstractC23647d.m123897g("38541");
        } else if (id2 == AbstractC6918a0.fl_select_female) {
            m85572mM(false);
            AbstractC23647d.m123897g("38542");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            Calendar calendar = Calendar.getInstance();
            this.f78570W0 = calendar.get(1);
            if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42452x)) {
                try {
                    String[] split = AbstractC23304d.f113368c0.f42452x.split("/");
                    this.f78569V0 = Integer.parseInt(split[0]);
                    this.f78568U0 = Integer.parseInt(split[1]) - 1;
                    this.f78567T0 = Integer.parseInt(split[2]);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                this.f78569V0 = calendar.get(5);
                this.f78568U0 = calendar.get(2);
                this.f78567T0 = calendar.get(1);
            }
            this.f78566S0.init(this.f78567T0, this.f78568U0, this.f78569V0, new DatePicker.OnDateChangedListener() { // from class: com.zing.zalo.ui.zviews.vv0
                public /* synthetic */ vv0() {
                }

                @Override // android.widget.DatePicker.OnDateChangedListener
                public final void onDateChanged(DatePicker datePicker, int i11, int i12, int i13) {
                    UpdateGenderAndBirthdayView.this.m85567jM(datePicker, i11, i12, i13);
                }
            });
            this.f78566S0.setMaxDate(System.currentTimeMillis() - 60000);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}
