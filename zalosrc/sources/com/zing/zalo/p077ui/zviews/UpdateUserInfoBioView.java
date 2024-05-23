package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoBioView;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import sa0.C26209i;
import vg.AbstractC28025b8;

/* loaded from: classes6.dex */
public class UpdateUserInfoBioView extends BaseZaloView implements InterfaceC17463d.d, View.OnClickListener, View.OnFocusChangeListener, InterfaceC0733x {

    /* renamed from: c1 */
    public static final int f78893c1 = MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.ext_profile_limit_lenght_text_large);

    /* renamed from: M0 */
    View f78894M0;

    /* renamed from: N0 */
    EditText f78895N0;

    /* renamed from: O0 */
    ImageView f78896O0;

    /* renamed from: P0 */
    RobotoTextView f78897P0;

    /* renamed from: Q0 */
    Button f78898Q0;

    /* renamed from: R0 */
    View f78899R0;

    /* renamed from: S0 */
    CheckBox f78900S0;

    /* renamed from: T0 */
    View f78901T0;

    /* renamed from: V0 */
    AbstractC18391a f78903V0;

    /* renamed from: W0 */
    ContactProfile f78904W0;

    /* renamed from: X0 */
    C13306b f78905X0;

    /* renamed from: Y0 */
    C16572d1 f78906Y0;

    /* renamed from: U0 */
    int f78902U0 = 0;

    /* renamed from: Z0 */
    C13306b.c f78907Z0 = new C15281a();

    /* renamed from: a1 */
    InterfaceC0765j f78908a1 = new C0766k();

    /* renamed from: b1 */
    boolean f78909b1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoBioView$a */
    /* loaded from: classes6.dex */
    class C15281a extends C13306b.c {
        C15281a() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130831H;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            str.hashCode();
            if (!str.equals("tip.pushfeed.bio")) {
                return null;
            }
            return new C26209i(UpdateUserInfoBioView.this.f78900S0);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: i */
        public boolean mo66904i() {
            if (UpdateUserInfoBioView.this.f72421L0.m92672lJ() && UpdateUserInfoBioView.this.f72421L0.m92687sJ()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoBioView$b */
    /* loaded from: classes6.dex */
    public class C15282b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78911a;

        /* renamed from: b */
        final /* synthetic */ boolean f78912b;

        C15282b(String str, boolean z11) {
            this.f78911a = str;
            this.f78912b = z11;
        }

        /* renamed from: d */
        public /* synthetic */ void m86038d(boolean z11) {
            AbstractC2379w.m12430d(UpdateUserInfoBioView.this.f78895N0);
            UpdateUserInfoBioView.this.m86034iM();
            UpdateUserInfoBioView.this.m86036kM();
            UpdateUserInfoBioView.this.f72421L0.mo49315c4();
            ToastUtils.showMess(UpdateUserInfoBioView.this.m92651WI().getString(AbstractC8020f0.str_ext_profile_update_success));
            if (z11) {
                UpdateUserInfoBioView.this.f72421L0.finish();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            UpdateUserInfoBioView updateUserInfoBioView = UpdateUserInfoBioView.this;
            updateUserInfoBioView.f78909b1 = false;
            updateUserInfoBioView.f72421L0.mo49315c4();
            ToastUtils.showMess(UpdateUserInfoBioView.this.m92651WI().getString(AbstractC8020f0.str_ext_profile_update_fail));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            UpdateUserInfoBioView updateUserInfoBioView = UpdateUserInfoBioView.this;
            updateUserInfoBioView.f78909b1 = false;
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            ContactProfile.C7868d c7868d = contactProfile.f42366P;
            String str = this.f78911a;
            c7868d.f42479m = str;
            contactProfile.f42458z = str;
            updateUserInfoBioView.f78904W0 = contactProfile;
            AbstractC23309i.m121068Iz(contactProfile.m40373K());
            AbstractC23309i.m122097kj(AbstractC23304d.f113368c0.f42366P.m40451f());
            UpdateUserInfoBioView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nz0

                /* renamed from: q */
                public final /* synthetic */ boolean f81404q;

                public /* synthetic */ nz0(boolean z11) {
                    r2 = z11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UpdateUserInfoBioView.C15282b.this.m86038d(r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoBioView$c */
    /* loaded from: classes6.dex */
    public class C15283c extends AbstractC18391a {
        C15283c() {
        }

        /* renamed from: b */
        public /* synthetic */ void m86040b(String str, int i11, int i12) {
            if (i12 != 0) {
                UpdateUserInfoBioView.this.f78895N0.setText(str);
                if (i12 == -2) {
                    UpdateUserInfoBioView.this.f78895N0.setSelection(str.length());
                    ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_line_limit_bio));
                } else {
                    UpdateUserInfoBioView.this.f78895N0.setSelection(i11);
                }
            }
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            AbstractC20826v0.m108811h(editable.toString(), UpdateUserInfoBioView.this.f78895N0.getSelectionEnd(), UpdateUserInfoBioView.f78893c1, 5, new AbstractC20826v0.i() { // from class: com.zing.zalo.ui.zviews.oz0
                public /* synthetic */ oz0() {
                }

                @Override // is.AbstractC20826v0.i
                /* renamed from: a */
                public final void mo44661a(String str, int i11, int i12) {
                    UpdateUserInfoBioView.C15283c.this.m86040b(str, i11, i12);
                }
            });
            UpdateUserInfoBioView.this.f78897P0.setText(UpdateUserInfoBioView.this.f78895N0.getText().length() + "/" + UpdateUserInfoBioView.this.f78902U0);
            UpdateUserInfoBioView.this.m86036kM();
            EditText editText = UpdateUserInfoBioView.this.f78895N0;
            int i11 = 0;
            if (editText != null && !TextUtils.isEmpty(editText.getText())) {
                z11 = false;
            } else {
                z11 = true;
            }
            View view = UpdateUserInfoBioView.this.f78899R0;
            if (!z11) {
                i11 = 8;
            }
            AbstractC23136l9.m118744r1(view, i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoBioView$d */
    /* loaded from: classes6.dex */
    public class C15284d extends AbstractC18391a {
        C15284d() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            UpdateUserInfoBioView updateUserInfoBioView = UpdateUserInfoBioView.this;
            if (editable.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            updateUserInfoBioView.m86035jM(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUserInfoBioView$e */
    /* loaded from: classes6.dex */
    public class C15285e implements InterfaceC20094a {
        C15285e() {
        }

        /* renamed from: d */
        public /* synthetic */ void m86042d() {
            UpdateUserInfoBioView.this.m86034iM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC23350e.m122774d("UpdateUserInfoBioView", "cannot get extend profile .... " + c20096c.m104492d());
            AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                if ((obj instanceof JSONObject) && (optJSONObject = ((JSONObject) obj).optJSONObject("data")) != null) {
                    ContactProfile.C7868d c7868d = new ContactProfile.C7868d(optJSONObject);
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    ContactProfile.C7868d c7868d2 = contactProfile.f42366P;
                    if (c7868d2 == null) {
                        contactProfile.f42366P = c7868d;
                    } else {
                        c7868d2.f42479m = c7868d.f42479m;
                    }
                    AbstractC23309i.m122097kj(contactProfile.f42366P.m40451f());
                    Handler handler = UpdateUserInfoBioView.this.f72827B0;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.pz0
                            public /* synthetic */ pz0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateUserInfoBioView.C15285e.this.m86042d();
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f78904W0 = AbstractC23304d.f113368c0;
        this.f78905X0 = new C13306b(m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 0) {
            return super.mo39014DJ(i11);
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_submit_change_bio)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            Button button = (Button) actionBarMenu.m92744k(AbstractC6918a0.option_update_extend_profile, AbstractC7409c0.action_bar_menu_item_blue_text_only);
            this.f78898Q0 = button;
            button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved));
            this.f78898Q0.setOnClickListener(this);
        }
        m86036kM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m92637BK(true);
        View inflate = layoutInflater.inflate(AbstractC7409c0.update_user_bio_view, viewGroup, false);
        this.f78894M0 = inflate;
        m86033hM(inflate);
        m86034iM();
        return this.f78894M0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null && interfaceC17463d.mo92862f() == 0 && i11 == -1) {
            interfaceC17463d.dismiss();
            this.f72421L0.finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC2379w.m12430d(this.f78895N0);
            if (m86030eM()) {
                m86029dM(0);
                return true;
            }
            this.f72421L0.finish();
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C13306b c13306b = this.f78905X0;
        if (c13306b != null) {
            c13306b.m74709u();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.str_update_user_bio_title));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            AbstractC23136l9.m118690Z0(this.f88760a0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f78905X0;
        if (c13306b != null) {
            c13306b.m74697c(this.f78907Z0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C13306b c13306b = this.f78905X0;
        if (c13306b != null) {
            c13306b.m74701i();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        EditText editText;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12 && (editText = this.f78895N0) != null) {
            AbstractC2379w.m12432f(editText);
        }
    }

    /* renamed from: dM */
    void m86029dM(int i11) {
        if (this.f72421L0.m92648SI() != null && !this.f72421L0.mo60294yp()) {
            this.f72421L0.removeDialog(i11);
            this.f72421L0.showDialog(i11);
        }
    }

    /* renamed from: eM */
    boolean m86030eM() {
        EditText editText;
        EditText editText2;
        ContactProfile.C7868d c7868d = this.f78904W0.f42366P;
        if (c7868d == null) {
            return false;
        }
        if (c7868d.f42479m == null && (editText2 = this.f78895N0) != null && !TextUtils.isEmpty(editText2.getText().toString())) {
            return true;
        }
        String str = this.f78904W0.f42366P.f42479m;
        if (str == null || (editText = this.f78895N0) == null || str.equals(editText.getText().toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: fM */
    void m86031fM(boolean z11) {
        boolean z12 = true;
        if (C23055e5.m118272g(true) && !this.f78909b1) {
            String trim = this.f78895N0.getText().toString().trim();
            this.f78908a1.mo1704o8(new C15282b(trim, z11));
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile.f42366P == null) {
                contactProfile.f42366P = new ContactProfile.C7868d();
            }
            ContactProfile.C7868d c7868d = AbstractC23304d.f113368c0.f42366P;
            if (c7868d != null) {
                this.f78909b1 = true;
                ContactProfile.C7868d c7868d2 = new ContactProfile.C7868d(c7868d);
                c7868d2.f42479m = trim;
                CheckBox checkBox = this.f78900S0;
                if (checkBox == null || !checkBox.isChecked()) {
                    z12 = false;
                }
                c7868d2.f42491y = z12;
                this.f78908a1.mo1592Za(c7868d2.m40448c());
                this.f72421L0.mo46829Y();
                return;
            }
            return;
        }
        ToastUtils.showMess(this.f72421L0.m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG));
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        mo50035CK(-1, null);
        super.finish();
    }

    /* renamed from: gM */
    void m86032gM() {
        if (AbstractC23304d.f113368c0 == null) {
            try {
                String m121675Zd = AbstractC23309i.m121675Zd();
                if (!TextUtils.isEmpty(m121675Zd)) {
                    AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null && contactProfile.f42366P == null) {
            String m121700a1 = AbstractC23309i.m121700a1();
            if (!TextUtils.isEmpty(m121700a1)) {
                try {
                    JSONObject jSONObject = new JSONObject(m121700a1);
                    AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d(jSONObject);
                    return;
                } catch (JSONException e12) {
                    e12.printStackTrace();
                    return;
                }
            }
            if (C23055e5.m118271f()) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15285e());
                c0766k.mo1550U8(CoreUtility.f89233i, AbstractC20826v0.m108765J(1), 0, 0);
            } else {
                AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d();
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UpdateUserInfoBioView";
    }

    /* renamed from: hM */
    void m86033hM(View view) {
        this.f78903V0 = new C15283c();
        ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.close_btn);
        this.f78896O0 = imageView;
        imageView.setOnClickListener(this);
        EditText editText = (EditText) view.findViewById(AbstractC6918a0.user_bio);
        this.f78895N0 = editText;
        editText.setOnFocusChangeListener(this);
        this.f78895N0.addTextChangedListener(new C15284d());
        this.f78895N0.addTextChangedListener(this.f78903V0);
        this.f78897P0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_count_number);
        View findViewById = view.findViewById(AbstractC6918a0.push_feed_option_overlay);
        this.f78899R0 = findViewById;
        if (findViewById != null) {
            findViewById.setAlpha(0.7f);
            this.f78899R0.setOnClickListener(this);
        }
        this.f78900S0 = (CheckBox) view.findViewById(AbstractC6918a0.cb_push_feed_update);
        View findViewById2 = view.findViewById(AbstractC6918a0.tv_push_feed_update);
        this.f78901T0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        C13306b c13306b = this.f78905X0;
        if (c13306b != null) {
            c13306b.m74714z("tip.pushfeed.bio", 0);
        }
        this.f78906Y0 = new C16572d1(this.f78895N0, false, null);
    }

    /* renamed from: iM */
    void m86034iM() {
        String str;
        try {
            for (InputFilter inputFilter : this.f78895N0.getFilters()) {
                if (inputFilter instanceof InputFilter.LengthFilter) {
                    this.f78902U0 = ((InputFilter.LengthFilter) inputFilter).getMax();
                }
            }
            m86032gM();
            ContactProfile.C7868d c7868d = this.f78904W0.f42366P;
            if (c7868d != null && (str = c7868d.f42479m) != null) {
                this.f78895N0.setText(str);
                EditText editText = this.f78895N0;
                editText.setSelection(editText.getText().length());
                this.f78895N0.clearFocus();
            }
            this.f78897P0.setText(this.f78895N0.getText().length() + "/" + this.f78902U0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    void m86035jM(boolean z11) {
        int i11;
        ImageView imageView = this.f78896O0;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    /* renamed from: kM */
    void m86036kM() {
        Button button = this.f78898Q0;
        if (button != null) {
            button.setEnabled(m86030eM());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EditText editText;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.option_update_extend_profile) {
            AbstractC23647d.m123907q("19513", "");
            m86031fM(true);
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.close_btn) {
            this.f78895N0.setText("");
            this.f78895N0.setSelection(0);
            return;
        }
        if (id2 == AbstractC6918a0.tv_push_feed_update) {
            CheckBox checkBox = this.f78900S0;
            if (checkBox != null) {
                checkBox.setChecked(!checkBox.isChecked());
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.push_feed_option_overlay && (editText = this.f78895N0) != null && TextUtils.isEmpty(editText.getText())) {
            ToastUtils.m89266n(AbstractC8020f0.str_empty_bio_push_feed_option, new Object[0]);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z11) {
        if (view.getId() == AbstractC6918a0.user_bio) {
            boolean z12 = false;
            if (z11) {
                if (this.f78895N0.getText().length() > 0) {
                    z12 = true;
                }
                m86035jM(z12);
                return;
            }
            m86035jM(false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m86030eM()) {
            m86029dM(0);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C13306b c13306b = this.f78905X0;
        if (c13306b != null) {
            c13306b.m74710v();
        }
    }
}
