package com.zing.zalo.report_v2.reportsuccess;

import am.AbstractC0906d0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.PolicyZView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.report_v2.reportsuccess.ReportSuccessActionView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mz.C23493c;
import nz.C23965b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23309i;
import p409oz.C24585b;
import p497rz.C26037b;
import p497rz.C26041f;
import p497rz.InterfaceC26036a;
import p497rz.InterfaceC26038c;
import p649xl.C30000qa;
import p716zh.C31901e8;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ReportSuccessActionView extends SlidableZaloView implements InterfaceC26038c {

    /* renamed from: P0 */
    private C30000qa f49462P0;

    /* renamed from: Q0 */
    private InterfaceC26036a f49463Q0;

    /* renamed from: R0 */
    private C16972e0 f49464R0;

    /* renamed from: S0 */
    private CheckBox f49465S0;

    /* renamed from: com.zing.zalo.report_v2.reportsuccess.ReportSuccessActionView$a */
    /* loaded from: classes4.dex */
    public static final class C9336a extends ClickableSpan {
        C9336a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            C17487o0 m92662fJ = ReportSuccessActionView.this.f72421L0.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(PolicyZView.class, null, 1, true);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            try {
                textPaint.setUnderlineText(false);
                textPaint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.f150821b60));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: nM */
    private final void m50266nM() {
        C16972e0 c16972e0 = this.f49464R0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
            this.f49464R0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m50267oM(ReportSuccessActionView reportSuccessActionView) {
        AbstractC19074t.m100208f(reportSuccessActionView, "this$0");
        reportSuccessActionView.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        reportSuccessActionView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m50268pM(ReportSuccessActionView reportSuccessActionView, C26037b c26037b, ListItem listItem, View view) {
        AbstractC19074t.m100208f(reportSuccessActionView, "this$0");
        AbstractC19074t.m100208f(c26037b, "$actionItem");
        AbstractC19074t.m100208f(listItem, "$this_apply");
        InterfaceC26036a interfaceC26036a = reportSuccessActionView.f49463Q0;
        if (interfaceC26036a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC26036a = null;
        }
        interfaceC26036a.mo134103Pg(c26037b, listItem.getTitle().toString());
    }

    /* renamed from: qM */
    private final void m50269qM() {
        C30000qa c30000qa = this.f49462P0;
        if (c30000qa == null) {
            AbstractC19074t.m100223u("binding");
            c30000qa = null;
        }
        c30000qa.f139116q.setOnClickListener(new View.OnClickListener() { // from class: rz.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportSuccessActionView.m50270rM(ReportSuccessActionView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m50270rM(ReportSuccessActionView reportSuccessActionView, View view) {
        AbstractC19074t.m100208f(reportSuccessActionView, "this$0");
        reportSuccessActionView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m50271sM(ReportSuccessActionView reportSuccessActionView, ContactProfile contactProfile, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(reportSuccessActionView, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$profileReport");
        interfaceC17463d.dismiss();
        InterfaceC26036a interfaceC26036a = reportSuccessActionView.f49463Q0;
        if (interfaceC26036a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC26036a = null;
        }
        interfaceC26036a.mo134106rm(contactProfile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m50272tM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m50273uM(ReportSuccessActionView reportSuccessActionView, ContactProfile contactProfile, InterfaceC17463d interfaceC17463d, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(reportSuccessActionView, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$profileReport");
        interfaceC17463d.dismiss();
        CheckBox checkBox = reportSuccessActionView.f49465S0;
        if (checkBox != null) {
            z11 = checkBox.isChecked();
        } else {
            z11 = false;
        }
        InterfaceC26036a interfaceC26036a = reportSuccessActionView.f49463Q0;
        if (interfaceC26036a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC26036a = null;
        }
        interfaceC26036a.mo134104c6(contactProfile, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m50274vM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C26041f c26041f = new C26041f(this, C24585b.Companion.m128049a());
        this.f49463Q0 = c26041f;
        c26041f.mo995Nd(C9337a.Companion.m50283a(this.f72421L0.m92642L3()), null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30000qa m148410c = C30000qa.m148410c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148410c, "inflate(...)");
        this.f49462P0 = m148410c;
        C30000qa c30000qa = null;
        if (m148410c == null) {
            AbstractC19074t.m100223u("binding");
            m148410c = null;
        }
        m148410c.f139116q.setIdTracking("REPORT_SUCCESS_ACTION_BTN_DONE");
        m50269qM();
        C30000qa c30000qa2 = this.f49462P0;
        if (c30000qa2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30000qa = c30000qa2;
        }
        return c30000qa.getRoot();
    }

    @Override // p497rz.InterfaceC26038c
    /* renamed from: I */
    public void mo50275I() {
        mo70710wy(new Runnable() { // from class: rz.l
            @Override // java.lang.Runnable
            public final void run() {
                ReportSuccessActionView.m50267oM(ReportSuccessActionView.this);
            }
        });
    }

    @Override // p497rz.InterfaceC26038c
    /* renamed from: Lt */
    public void mo50276Lt(C23965b c23965b, String str, String str2, String str3, String str4, final ContactProfile contactProfile) {
        C31901e8 m2800f;
        String m125414i;
        int m127173b0;
        int m127173b02;
        AbstractC19074t.m100208f(c23965b, "actionConfig");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        AbstractC19074t.m100208f(str3, "ctaConfirm");
        AbstractC19074t.m100208f(str4, "ctaDeny");
        AbstractC19074t.m100208f(contactProfile, "profileReport");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("report_modal_confirm_action_unfriend");
        aVar.m90918B(str);
        if (str2.length() > 0) {
            aVar.m90949z(str2);
        }
        aVar.m90947x("report_modal_confirm_action_unfriend_cta_confirm");
        aVar.m90943t(str3, new InterfaceC17463d.d() { // from class: rz.q
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ReportSuccessActionView.m50273uM(ReportSuccessActionView.this, contactProfile, interfaceC17463d, i11);
            }
        });
        aVar.m90921E(true);
        aVar.m90937n("report_modal_confirm_action_unfriend_cta_deny");
        aVar.m90934k(str4, new InterfaceC17463d.d() { // from class: rz.r
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ReportSuccessActionView.m50274vM(interfaceC17463d, i11);
            }
        });
        if (c23965b.m125415j().length() > 0 && AbstractC19074t.m100204b(c23965b.m125415j(), "remove_phonebook")) {
            this.f49465S0 = null;
            if (AbstractC23309i.m121566Wf()) {
                try {
                    if (!TextUtils.isEmpty(contactProfile.f42455y) && AbstractC23034c6.m118167n(m92686rK(), AbstractC23034c6.f112032i) == 0 && C8937j0.m47663l("phonebook_delete_after_report") && (m2800f = AbstractC0906d0.m2800f(getContext(), contactProfile.f42455y)) != null && !TextUtils.isEmpty(m2800f.m153297j())) {
                        Context m92689tK2 = m92689tK();
                        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
                        CheckBox checkBox = new CheckBox(m92689tK2);
                        C26708g c26708g = new C26708g(checkBox);
                        Context context = checkBox.getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        c26708g.m137319a(C26705d.m137293a(context, AbstractC2814h.t_small));
                        checkBox.setTextColor(C23212s8.m119607o(m92689tK(), AbstractC2807a.text_01));
                        if (AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a)) {
                            m125414i = c23965b.m125416k();
                        } else {
                            m125414i = c23965b.m125414i();
                        }
                        m127173b0 = AbstractC24342w.m127173b0(m125414i, "/alias_name", 0, false, 6, null);
                        if (m127173b0 >= 0) {
                            String m40385R = contactProfile.m40385R(true, false, true);
                            AbstractC19074t.m100207e(m40385R, "getDpnPhoneContact(...)");
                            m125414i = AbstractC24341v.m127114D(m125414i, "/alias_name", m40385R, false, 4, null);
                        }
                        m127173b02 = AbstractC24342w.m127173b0(m125414i, "/phone", 0, false, 6, null);
                        if (m127173b02 >= 0) {
                            String m153297j = m2800f.m153297j();
                            AbstractC19074t.m100207e(m153297j, "getNumber(...)");
                            m125414i = AbstractC24341v.m127114D(m125414i, "/phone", m153297j, false, 4, null);
                        }
                        checkBox.setText(C23493c.f114055a.m123317a(m125414i));
                        aVar.m90924a(checkBox);
                        this.f49465S0 = checkBox;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104551d("CommonZaloview", e11.toString());
                }
            }
        }
        this.f49464R0 = aVar.m90923G();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m50266nM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        InterfaceC26036a interfaceC26036a = this.f49463Q0;
        if (interfaceC26036a == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC26036a = null;
        }
        interfaceC26036a.mo134105d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p497rz.InterfaceC26038c
    /* renamed from: dA */
    public void mo50277dA(List list, String str) {
        int m127173b0;
        C30000qa c30000qa;
        String m127114D;
        AbstractC19074t.m100208f(str, "reportObjectNameDisplayTarget");
        C30000qa c30000qa2 = this.f49462P0;
        if (c30000qa2 == null) {
            AbstractC19074t.m100223u("binding");
            c30000qa2 = null;
        }
        c30000qa2.f139117r.removeAllViews();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C26037b c26037b = (C26037b) it.next();
                try {
                    Context m92689tK = m92689tK();
                    AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                    final ListItem listItem = new ListItem(m92689tK);
                    listItem.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    listItem.setIdTracking(c26037b.m134107a());
                    Context context = listItem.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    listItem.setBackground(C27280g.m139658a(context, AbstractC2810d.stencils_list_bg));
                    ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
                    int m118712h = AbstractC23136l9.m118712h(zAppCompatImageView.getContext(), 24.0f);
                    zAppCompatImageView.setLayoutParams(new RelativeLayout.LayoutParams(m118712h, m118712h));
                    listItem.m90587c(zAppCompatImageView);
                    Integer m134110d = c26037b.m134110d();
                    if (m134110d != null) {
                        int intValue = m134110d.intValue();
                        Context context2 = zAppCompatImageView.getContext();
                        AbstractC19074t.m100207e(context2, "getContext(...)");
                        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, intValue, AbstractC2807a.icon_01));
                    }
                    listItem.setLeadingGravity(EnumC16952b0.CENTER);
                    Integer m134109c = c26037b.m134109c();
                    if (m134109c != null) {
                        listItem.setTitleColor(C23212s8.m119607o(listItem.getContext(), m134109c.intValue()));
                    }
                    String m134111e = c26037b.m134111e();
                    m127173b0 = AbstractC24342w.m127173b0(m134111e, "/user", 0, false, 6, null);
                    if (m127173b0 >= 0) {
                        m127114D = AbstractC24341v.m127114D(m134111e, "/user", str, false, 4, null);
                        if (str.length() > 0) {
                            SpannableString spannableString = new SpannableString(m127114D);
                            spannableString.setSpan(new StyleSpan(1), m127173b0, m127173b0 + str.length(), 33);
                            if (!c26037b.m134112f()) {
                                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(listItem.getContext(), AbstractC2807a.text_01)), m127173b0, m127173b0 + str.length(), 33);
                            }
                            m127114D = spannableString;
                        }
                        listItem.setTitle(m127114D);
                    } else {
                        listItem.setTitle(m134111e);
                    }
                    listItem.m90592m(c26037b.m134113g());
                    listItem.m90591l(AbstractC23136l9.m118712h(listItem.getContext(), 56.0f), 0, 0, 0);
                    if (c26037b.m134112f()) {
                        listItem.setOnClickListener(new View.OnClickListener() { // from class: rz.n
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ReportSuccessActionView.m50268pM(ReportSuccessActionView.this, c26037b, listItem, view);
                            }
                        });
                        c30000qa = null;
                    } else {
                        c30000qa = null;
                        listItem.setOnClickListener(null);
                    }
                    C30000qa c30000qa3 = this.f49462P0;
                    if (c30000qa3 == null) {
                        try {
                            AbstractC19074t.m100223u("binding");
                            c30000qa3 = c30000qa;
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC20110a.f98889a.mo104551d("CommonZaloview", e);
                        }
                    }
                    c30000qa3.f139117r.addView(listItem);
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ReportSuccessActionView";
    }

    @Override // p497rz.InterfaceC26038c
    /* renamed from: hB */
    public void mo50278hB(String str) {
        AbstractC19074t.m100208f(str, "reportObjectLabelName");
        C30000qa c30000qa = this.f49462P0;
        if (c30000qa == null) {
            AbstractC19074t.m100223u("binding");
            c30000qa = null;
        }
        RobotoTextView robotoTextView = c30000qa.f139119t;
        robotoTextView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_success_title, C23493c.f114055a.m123320h(str)));
        robotoTextView.setVisibility(0);
    }

    @Override // p497rz.InterfaceC26038c
    /* renamed from: jc */
    public void mo50279jc(String str) {
        int m127173b0;
        int m127173b02;
        AbstractC19074t.m100208f(str, "reportObjectNameDisplayTarget");
        try {
            C30000qa c30000qa = this.f49462P0;
            if (c30000qa == null) {
                AbstractC19074t.m100223u("binding");
                c30000qa = null;
            }
            RobotoTextView robotoTextView = c30000qa.f139118s;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_success_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#p1#", 0, false, 6, null);
            int i11 = -1;
            if (m127173b0 >= 0) {
                m118743r0 = AbstractC24341v.m127114D(m118743r0, "#p1#", str, false, 4, null);
                if (str.length() > 0) {
                    i11 = m127173b0 + str.length();
                }
            }
            String str2 = m118743r0;
            m127173b02 = AbstractC24342w.m127173b0(str2, "#x#", 0, false, 6, null);
            if (m127173b02 >= 0) {
                str2 = AbstractC24341v.m127114D(str2, "#x#", "", false, 4, null);
            }
            SpannableString spannableString = new SpannableString(str2);
            if (m127173b0 >= 0 && i11 >= 0) {
                spannableString.setSpan(new StyleSpan(1), m127173b0, i11, 33);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_01)), m127173b0, i11, 33);
            }
            robotoTextView.setMovementMethod(CustomMovementMethod.m56305e());
            if (m127173b02 >= 0) {
                spannableString.setSpan(new C9336a(), m127173b02, str2.length(), 33);
            }
            robotoTextView.setText(spannableString);
            robotoTextView.setVisibility(0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p497rz.InterfaceC26038c
    /* renamed from: zt */
    public void mo50280zt(C23965b c23965b, String str, String str2, String str3, String str4, final ContactProfile contactProfile) {
        AbstractC19074t.m100208f(c23965b, "actionConfig");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        AbstractC19074t.m100208f(str3, "ctaConfirm");
        AbstractC19074t.m100208f(str4, "ctaDeny");
        AbstractC19074t.m100208f(contactProfile, "profileReport");
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("report_modal_confirm_action_block");
        aVar.m90918B(str);
        if (str2.length() > 0) {
            aVar.m90949z(C23493c.f114055a.m123317a(str2));
        }
        aVar.m90947x("report_modal_confirm_action_block_cta_confirm");
        aVar.m90943t(str3, new InterfaceC17463d.d() { // from class: rz.o
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ReportSuccessActionView.m50271sM(ReportSuccessActionView.this, contactProfile, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("report_modal_confirm_action_block_cta_deny");
        aVar.m90934k(str4, new InterfaceC17463d.d() { // from class: rz.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ReportSuccessActionView.m50272tM(interfaceC17463d, i11);
            }
        });
        this.f49464R0 = aVar.m90923G();
    }
}
