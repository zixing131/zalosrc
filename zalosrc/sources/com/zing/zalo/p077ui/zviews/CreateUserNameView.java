package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.CreateUserNameView;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23115k;
import me0.AbstractC23136l9;
import p348mi.AbstractC23304d;

/* loaded from: classes6.dex */
public class CreateUserNameView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: P0 */
    View f73025P0;

    /* renamed from: Q0 */
    ActionEditText f73026Q0;

    /* renamed from: R0 */
    ImageView f73027R0;

    /* renamed from: S0 */
    RobotoTextView f73028S0;

    /* renamed from: T0 */
    RobotoButton f73029T0;

    /* renamed from: U0 */
    Handler f73030U0;

    /* renamed from: V0 */
    ProgressBar f73031V0;

    /* renamed from: W0 */
    boolean f73032W0 = false;

    /* renamed from: X0 */
    String f73033X0 = "";

    /* renamed from: Y0 */
    boolean f73034Y0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.CreateUserNameView$a */
    /* loaded from: classes6.dex */
    class C14197a extends AbstractC18391a {
        C14197a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            try {
                String obj = CreateUserNameView.this.f73026Q0.getText().toString();
                if (obj.length() > 20) {
                    CreateUserNameView.this.f73026Q0.setText(obj.substring(0, 20));
                    CreateUserNameView.this.f73026Q0.setSelection(20);
                }
                CreateUserNameView createUserNameView = CreateUserNameView.this;
                createUserNameView.m79180kM(createUserNameView.f73026Q0.getText().toString());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CreateUserNameView$b */
    /* loaded from: classes6.dex */
    public class C14198b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f73036a;

        C14198b(String str) {
            this.f73036a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                if (!CreateUserNameView.this.f72421L0.m92681pJ() && !CreateUserNameView.this.f72421L0.m92677nJ() && CreateUserNameView.this.f73033X0.equals(this.f73036a)) {
                    CreateUserNameView.this.m79181nM(c20096c.m104491c());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (!CreateUserNameView.this.f72421L0.m92681pJ() && !CreateUserNameView.this.f72421L0.m92677nJ() && CreateUserNameView.this.f73033X0.equals(this.f73036a)) {
                    CreateUserNameView.this.m79181nM(1000);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.CreateUserNameView$c */
    /* loaded from: classes6.dex */
    public class C14199c implements InterfaceC20094a {
        C14199c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m79184d() {
            try {
                ActionEditText actionEditText = CreateUserNameView.this.f73026Q0;
                if (actionEditText != null) {
                    AbstractC23304d.f113368c0.f42460z1 = actionEditText.getText().toString();
                }
                Intent intent = new Intent();
                intent.putExtra("extra_user_name", CreateUserNameView.this.f73033X0);
                CreateUserNameView.this.f72421L0.mo50035CK(-1, intent);
                CreateUserNameView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                CreateUserNameView.this.m79181nM(c20096c.m104491c());
                CreateUserNameView.this.f73034Y0 = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (!CreateUserNameView.this.f72421L0.m92681pJ() && !CreateUserNameView.this.f72421L0.m92677nJ()) {
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    CreateUserNameView createUserNameView = CreateUserNameView.this;
                    contactProfile.f42460z1 = createUserNameView.f73033X0;
                    createUserNameView.f73030U0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.la
                        @Override // java.lang.Runnable
                        public final void run() {
                            CreateUserNameView.C14199c.this.m79184d();
                        }
                    });
                    CreateUserNameView.this.f73034Y0 = false;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m79176lM(String str) {
        m79177mM(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
        m79178iM(str);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f73030U0 = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(4);
                aVar.m43155d(true);
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_username_confirm_dialog, this.f73033X0);
                SpannableString spannableString = new SpannableString(m118746s0);
                spannableString.setSpan(new StyleSpan(1), m118746s0.length() - (this.f73033X0.length() + 3), m118746s0.length() - 3, 33);
                aVar.m43162k(spannableString);
                aVar.m43172u(this.f73033X0);
                aVar.m43169r(AbstractC8020f0.ls_ok, this);
                aVar.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                return aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_create_username, viewGroup, false);
        this.f73025P0 = inflate;
        this.f73026Q0 = (ActionEditText) inflate.findViewById(AbstractC6918a0.edit_username);
        this.f73027R0 = (ImageView) this.f73025P0.findViewById(AbstractC6918a0.ic_valid);
        this.f73028S0 = (RobotoTextView) this.f73025P0.findViewById(AbstractC6918a0.tv_hint);
        RobotoButton robotoButton = (RobotoButton) this.f73025P0.findViewById(AbstractC6918a0.btn_update);
        this.f73029T0 = robotoButton;
        robotoButton.setEnabled(false);
        this.f73031V0 = (ProgressBar) this.f73025P0.findViewById(AbstractC6918a0.progress_checking);
        this.f73026Q0.addTextChangedListener(new C14197a());
        this.f73029T0.setOnClickListener(this);
        return this.f73025P0;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                interfaceC17463d.dismiss();
                m79179jM(this.f73033X0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBar actionBar;
        super.mo37493TJ();
        try {
            if (this.f72421L0.m92648SI() != null && this.f72421L0.m92674mJ() && (actionBar = this.f88760a0) != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_username_tittle));
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC2379w.m12430d(this.f73026Q0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CreateUserNameView";
    }

    /* renamed from: iM */
    void m79178iM(String str) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14198b(str));
            c0766k.mo1732s4(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    void m79179jM(String str) {
        try {
            if (this.f73034Y0) {
                return;
            }
            this.f73034Y0 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14199c());
            c0766k.mo1630e9(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kM */
    void m79180kM(CharSequence charSequence) {
        final String charSequence2 = charSequence.toString();
        this.f73033X0 = charSequence2;
        this.f73030U0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.ja
            @Override // java.lang.Runnable
            public final void run() {
                CreateUserNameView.this.m79176lM(charSequence2);
            }
        }, 400L);
    }

    /* renamed from: nM */
    void m79181nM(final int i11) {
        this.f73030U0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ka
            @Override // java.lang.Runnable
            public final void run() {
                CreateUserNameView.this.m79177mM(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oM, reason: merged with bridge method [inline-methods] */
    public void m79177mM(int i11) {
        try {
            if (i11 != 1000) {
                if (i11 != 2001) {
                    if (i11 != 50001) {
                        switch (i11) {
                            case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                                this.f73028S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_username_must_begin_from_letter));
                                RobotoTextView robotoTextView = this.f73028S0;
                                robotoTextView.setTextColor(AbstractC23136l9.m118641B(robotoTextView.getContext(), AbstractC16801x.cNotify1));
                                this.f73027R0.setVisibility(8);
                                this.f73029T0.setEnabled(false);
                                this.f73031V0.setVisibility(8);
                                return;
                            case 1004:
                                this.f73028S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_hint));
                                RobotoTextView robotoTextView2 = this.f73028S0;
                                robotoTextView2.setTextColor(AbstractC23136l9.m118641B(robotoTextView2.getContext(), AbstractC16801x.cNotify1));
                                this.f73027R0.setVisibility(8);
                                this.f73029T0.setEnabled(false);
                                this.f73031V0.setVisibility(8);
                                return;
                            case 1005:
                                this.f73028S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_exist));
                                RobotoTextView robotoTextView3 = this.f73028S0;
                                robotoTextView3.setTextColor(AbstractC23136l9.m118641B(robotoTextView3.getContext(), AbstractC16801x.cNotify1));
                                this.f73027R0.setVisibility(8);
                                this.f73029T0.setEnabled(false);
                                this.f73031V0.setVisibility(8);
                                return;
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                    this.f73028S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_hint));
                    RobotoTextView robotoTextView4 = this.f73028S0;
                    robotoTextView4.setTextColor(AbstractC23136l9.m118641B(robotoTextView4.getContext(), AbstractC16801x.cMtxt1));
                    this.f73027R0.setVisibility(8);
                    this.f73029T0.setEnabled(false);
                    this.f73031V0.setVisibility(8);
                    return;
                }
                this.f73027R0.setVisibility(8);
                this.f73031V0.setVisibility(0);
                return;
            }
            this.f73028S0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_valid));
            if (this.f73031V0.getVisibility() == 0) {
                AbstractC23115k.m118570a(this.f73031V0, AbstractC10919t.fadeout);
            }
            AbstractC23115k.m118571b(this.f73027R0, AbstractC10919t.fadein);
            this.f73029T0.setEnabled(true);
            RobotoTextView robotoTextView5 = this.f73028S0;
            robotoTextView5.setTextColor(AbstractC23136l9.m118641B(robotoTextView5.getContext(), AbstractC16801x.blue_valid_username));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.btn_update) {
                AbstractC2379w.m12430d(this.f73026Q0);
                this.f72421L0.removeDialog(1);
                this.f72421L0.showDialog(1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle == null) {
            this.f73026Q0.requestFocus();
            AbstractC2379w.m12432f(this.f73026Q0);
        }
    }
}
