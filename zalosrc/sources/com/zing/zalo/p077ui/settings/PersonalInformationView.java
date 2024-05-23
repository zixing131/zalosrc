package com.zing.zalo.p077ui.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.PersonalInformationView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoZView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p348mi.AbstractC23304d;
import p649xl.C29837h9;
import ui0.C27280g;
import vl0.AbstractC28291a;

/* loaded from: classes6.dex */
public final class PersonalInformationView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29837h9 f67568P0;

    /* renamed from: Q0 */
    private RobotoTextView f67569Q0;

    /* renamed from: R0 */
    private RobotoTextView f67570R0;

    /* renamed from: S0 */
    private RobotoTextView f67571S0;

    /* renamed from: com.zing.zalo.ui.settings.PersonalInformationView$a */
    /* loaded from: classes6.dex */
    public static final class C13114a extends ZdsActionBar.AbstractC16987c {
        C13114a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            super.mo39913a();
            PersonalInformationView.this.finish();
        }
    }

    /* renamed from: kM */
    private final void m73595kM() {
        C29837h9 c29837h9 = this.f67568P0;
        C29837h9 c29837h92 = null;
        if (c29837h9 == null) {
            AbstractC19074t.m100223u("binding");
            c29837h9 = null;
        }
        Avatar avatar = c29837h9.f138018q;
        Context context = avatar.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        avatar.m90481x(context, EnumC16949e.SIZE_96);
        C29837h9 c29837h93 = this.f67568P0;
        if (c29837h93 == null) {
            AbstractC19074t.m100223u("binding");
            c29837h93 = null;
        }
        ListItem listItem = c29837h93.f138022u;
        listItem.setOnClickListener(new View.OnClickListener() { // from class: la0.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInformationView.m73598nM(view);
            }
        });
        listItem.setLeadingGravity(EnumC16952b0.CENTER);
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(listItem.getContext());
        Context context2 = listItem.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_user_circle_line_24, AbstractC28291a.icon_tertiary));
        listItem.m90587c(zAppCompatImageView);
        listItem.m90592m(true);
        listItem.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_personal_information_item_zalo_name_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        listItem.setTitle(m118743r0);
        listItem.setTitleColor(C23212s8.m119607o(listItem.getContext(), AbstractC2807a.text_tertiary));
        Context context3 = listItem.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context3);
        robotoTextView.setFontStyle(AbstractC2814h.t_normal);
        robotoTextView.setTextColor(C23212s8.m119607o(listItem.getContext(), AbstractC2807a.text_01));
        robotoTextView.setMaxWidth(AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(200.0f));
        robotoTextView.setTextAlignment(3);
        this.f67569Q0 = robotoTextView;
        listItem.m90589e(robotoTextView);
        C29837h9 c29837h94 = this.f67568P0;
        if (c29837h94 == null) {
            AbstractC19074t.m100223u("binding");
            c29837h94 = null;
        }
        ListItem listItem2 = c29837h94.f138020s;
        listItem2.setOnClickListener(new View.OnClickListener() { // from class: la0.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInformationView.m73599oM(view);
            }
        });
        ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(listItem2.getContext());
        Context context4 = listItem2.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context4, AbstractC23322a.zds_ic_calendar_line_24, AbstractC28291a.icon_tertiary));
        listItem2.m90587c(zAppCompatImageView2);
        listItem2.m90592m(true);
        listItem2.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_personal_information_item_birthday_title);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        listItem2.setTitle(m118743r02);
        listItem2.setTitleColor(C23212s8.m119607o(listItem2.getContext(), AbstractC2807a.text_tertiary));
        Context context5 = listItem2.getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        RobotoTextView robotoTextView2 = new RobotoTextView(context5);
        robotoTextView2.setFontStyle(AbstractC2814h.t_normal);
        robotoTextView2.setTextColor(C23212s8.m119607o(listItem2.getContext(), AbstractC2807a.text_01));
        this.f67570R0 = robotoTextView2;
        listItem2.m90589e(robotoTextView2);
        C29837h9 c29837h95 = this.f67568P0;
        if (c29837h95 == null) {
            AbstractC19074t.m100223u("binding");
            c29837h95 = null;
        }
        ListItem listItem3 = c29837h95.f138021t;
        listItem3.setOnClickListener(new View.OnClickListener() { // from class: la0.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInformationView.m73596lM(view);
            }
        });
        ZAppCompatImageView zAppCompatImageView3 = new ZAppCompatImageView(listItem3.getContext());
        Context context6 = listItem3.getContext();
        AbstractC19074t.m100207e(context6, "getContext(...)");
        zAppCompatImageView3.setImageDrawable(C27280g.m139660c(context6, AbstractC23322a.zds_ic_user_line_24, AbstractC28291a.icon_tertiary));
        listItem3.m90587c(zAppCompatImageView3);
        listItem3.m90592m(true);
        listItem3.m90591l(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_personal_information_item_gender_title);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        listItem3.setTitle(m118743r03);
        listItem3.setTitleColor(C23212s8.m119607o(listItem3.getContext(), AbstractC2807a.text_tertiary));
        Context context7 = listItem3.getContext();
        AbstractC19074t.m100207e(context7, "getContext(...)");
        RobotoTextView robotoTextView3 = new RobotoTextView(context7);
        robotoTextView3.setFontStyle(AbstractC2814h.t_normal);
        robotoTextView3.setTextColor(C23212s8.m119607o(listItem3.getContext(), AbstractC2807a.text_01));
        this.f67571S0 = robotoTextView3;
        listItem3.m90589e(robotoTextView3);
        C29837h9 c29837h96 = this.f67568P0;
        if (c29837h96 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29837h92 = c29837h96;
        }
        c29837h92.f138019r.setOnClickListener(new View.OnClickListener() { // from class: la0.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalInformationView.m73597mM(PersonalInformationView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m73596lM(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m73597mM(PersonalInformationView personalInformationView, View view) {
        AbstractC19074t.m100208f(personalInformationView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean("update", true);
        C17487o0 m92662fJ = personalInformationView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(UpdateUserInfoZView.class, bundle, 1005, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m73598nM(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m73599oM(View view) {
    }

    /* renamed from: pM */
    private final void m73600pM() {
        String m118743r0;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null) {
            C16948d m40361D = contactProfile.m40361D();
            RobotoTextView robotoTextView = null;
            if (m40361D != null) {
                AbstractC19074t.m100205c(m40361D);
                C29837h9 c29837h9 = this.f67568P0;
                if (c29837h9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29837h9 = null;
                }
                c29837h9.f138018q.m90478m(m40361D);
            }
            String m40383Q = contactProfile.m40383Q(true, false);
            if (m40383Q != null) {
                AbstractC19074t.m100205c(m40383Q);
                RobotoTextView robotoTextView2 = this.f67569Q0;
                if (robotoTextView2 == null) {
                    AbstractC19074t.m100223u("tvZaloName");
                    robotoTextView2 = null;
                }
                robotoTextView2.setText(m40383Q);
            }
            String str = contactProfile.f42452x;
            if (str != null) {
                AbstractC19074t.m100205c(str);
                RobotoTextView robotoTextView3 = this.f67570R0;
                if (robotoTextView3 == null) {
                    AbstractC19074t.m100223u("tvBirthday");
                    robotoTextView3 = null;
                }
                robotoTextView3.setText(str);
            }
            RobotoTextView robotoTextView4 = this.f67571S0;
            if (robotoTextView4 == null) {
                AbstractC19074t.m100223u("tvGender");
            } else {
                robotoTextView = robotoTextView4;
            }
            int i11 = contactProfile.f42449w;
            if (i11 != 0) {
                if (i11 != 1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_personal_information_item_gender_not_disclose);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_personal_information_item_gender_female);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_personal_information_item_gender_male);
            }
            robotoTextView.setText(m118743r0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29837h9 m148036c = C29837h9.m148036c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148036c, "inflate(...)");
        this.f67568P0 = m148036c;
        m73595kM();
        C29837h9 c29837h9 = this.f67568P0;
        if (c29837h9 == null) {
            AbstractC19074t.m100223u("binding");
            c29837h9 = null;
        }
        FrameLayout root = c29837h9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C13114a());
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PersonalInformationView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m73600pM();
    }
}
