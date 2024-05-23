package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import bn.C2913t1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p510sq.C26365a;
import p716zh.C31973j5;
import p716zh.C32002l4;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public abstract class RemoveGroupMemberBaseView extends BaseInviteGroupMemberView {

    /* renamed from: X0 */
    protected String f76928X0;

    /* renamed from: Y0 */
    KeyEventCallbackC17462c f76929Y0;

    /* renamed from: f1 */
    ContactProfile f76936f1;

    /* renamed from: Z0 */
    int f76930Z0 = 30;

    /* renamed from: a1 */
    InterfaceC20094a f76931a1 = new C14934b();

    /* renamed from: b1 */
    InterfaceC0765j f76932b1 = new C0766k();

    /* renamed from: c1 */
    boolean f76933c1 = false;

    /* renamed from: d1 */
    InterfaceC0765j f76934d1 = new C0766k();

    /* renamed from: e1 */
    InterfaceC20094a f76935e1 = new C14935c();

    /* renamed from: g1 */
    int f76937g1 = 0;

    /* renamed from: h1 */
    boolean f76938h1 = false;

    /* renamed from: i1 */
    public String f76939i1 = "";

    /* renamed from: com.zing.zalo.ui.zviews.RemoveGroupMemberBaseView$a */
    /* loaded from: classes6.dex */
    public class C14933a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f76940a;

        C14933a(int i11) {
            this.f76940a = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (RemoveGroupMemberBaseView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (RemoveGroupMemberBaseView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(this.f76940a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RemoveGroupMemberBaseView$b */
    /* loaded from: classes6.dex */
    public class C14934b implements InterfaceC20094a {
        C14934b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            RemoveGroupMemberBaseView.this.f72421L0.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            RemoveGroupMemberBaseView.this.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RemoveGroupMemberBaseView$c */
    /* loaded from: classes6.dex */
    public class C14935c implements InterfaceC20094a {
        C14935c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                RemoveGroupMemberBaseView removeGroupMemberBaseView = RemoveGroupMemberBaseView.this;
                boolean z11 = false;
                removeGroupMemberBaseView.f76933c1 = false;
                removeGroupMemberBaseView.f72421L0.mo49315c4();
                if (c20096c.m104491c() == 17029) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(RemoveGroupMemberBaseView.this.f76928X0);
                    if (m141809c != null) {
                        ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_user_no_longer_member_of_group, m141809c.m40383Q(true, false)));
                    }
                } else {
                    C31973j5 c31973j5 = RemoveGroupMemberBaseView.this.f72357R0;
                    if (c31973j5 != null && c31973j5.m153747Y()) {
                        z11 = true;
                    }
                    ToastUtils.m89261i(c20096c, z11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            RemoveGroupMemberBaseView.this.f76928X0 = null;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            boolean z11;
            RemoveGroupMemberBaseView removeGroupMemberBaseView = RemoveGroupMemberBaseView.this;
            removeGroupMemberBaseView.f76933c1 = false;
            try {
                removeGroupMemberBaseView.f72421L0.mo49315c4();
                jSONObject = (JSONObject) obj;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                RemoveGroupMemberBaseView.this.f76933c1 = false;
            }
            if (jSONObject.isNull("data")) {
                if (!jSONObject.isNull("error_code")) {
                }
                RemoveGroupMemberBaseView.this.f76928X0 = null;
            }
            int i11 = jSONObject.getInt("error_code");
            if (i11 != 0) {
                C31973j5 c31973j5 = RemoveGroupMemberBaseView.this.f72357R0;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ToastUtils.m89260h(i11, z11);
                return;
            }
            RemoveGroupMemberBaseView.this.mo78398HM();
            RemoveGroupMemberBaseView.this.f76928X0 = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RemoveGroupMemberBaseView$d */
    /* loaded from: classes6.dex */
    public class C14936d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f76944a;

        /* renamed from: com.zing.zalo.ui.zviews.RemoveGroupMemberBaseView$d$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(C14936d.this.f76944a.f42434r);
            }
        }

        C14936d(ContactProfile contactProfile) {
            this.f76944a = contactProfile;
        }

        /* renamed from: f */
        public /* synthetic */ void m83614f(Bundle bundle) {
            RemoveGroupMemberBaseView.this.f72421L0.m92676n2().mo35579p().m93066i2(WriteInvitationView.class, bundle, RemoveGroupMemberBaseView.this.f76937g1, 1, true);
        }

        /* renamed from: g */
        public /* synthetic */ void m83615g() {
            RemoveGroupMemberBaseView.this.m83603JM();
        }

        /* renamed from: h */
        public /* synthetic */ void m83616h() {
            RemoveGroupMemberBaseView.this.m83607NM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            RemoveGroupMemberBaseView removeGroupMemberBaseView = RemoveGroupMemberBaseView.this;
            removeGroupMemberBaseView.f76938h1 = false;
            removeGroupMemberBaseView.f72421L0.mo49315c4();
            if (RemoveGroupMemberBaseView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            int i12;
            int i13;
            ContactProfile contactProfile;
            RemoveGroupMemberBaseView removeGroupMemberBaseView = RemoveGroupMemberBaseView.this;
            removeGroupMemberBaseView.f76938h1 = false;
            removeGroupMemberBaseView.f72421L0.mo49315c4();
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && !jSONObject.isNull("data")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.isNull("isRequested")) {
                        i11 = 0;
                    } else {
                        i11 = jSONObject2.getInt("isRequested");
                    }
                    if (jSONObject2.isNull("isFriend")) {
                        i12 = 0;
                    } else {
                        i12 = jSONObject2.getInt("isFriend");
                    }
                    if (jSONObject2.isNull("isRequesting")) {
                        i13 = 0;
                    } else {
                        i13 = jSONObject2.getInt("isRequesting");
                    }
                    int optInt = jSONObject2.optInt("ranking", 0);
                    int optInt2 = jSONObject2.optInt("addFriendPrivacy", 1);
                    if (optInt2 == 1) {
                        if (i11 == 0 && i13 == 0) {
                            if (i12 == 0) {
                                if (!AbstractC21935u.m114558y(this.f76944a.f42434r)) {
                                    TrackingSource m114310H = C21927m.m114302u().m114310H(this.f76944a.f42434r);
                                    if (m114310H == null) {
                                        m114310H = new TrackingSource(this.f76944a.f42373R0);
                                    }
                                    m114310H.m40677a("sourceView", 20);
                                    C21927m.m114302u().m114330e0(this.f76944a.f42434r, m114310H);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("uid", this.f76944a.f42434r);
                                    bundle.putString("dpn", this.f76944a.f42437s);
                                    bundle.putString("avatar", this.f76944a.f42446v);
                                    bundle.putString("phone", this.f76944a.f42455y);
                                    RemoveGroupMemberBaseView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ac0

                                        /* renamed from: q */
                                        public final /* synthetic */ Bundle f79804q;

                                        public /* synthetic */ ac0(Bundle bundle2) {
                                            r2 = bundle2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            RemoveGroupMemberBaseView.C14936d.this.m83614f(r2);
                                        }
                                    });
                                    return;
                                }
                                if (RemoveGroupMemberBaseView.this.f72421L0.m92672lJ()) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                }
                                AbstractC23074g2.m118375a(0, this.f76944a.f42434r, "", 5);
                                return;
                            }
                            if (i12 == 1) {
                                if (RemoveGroupMemberBaseView.this.f72421L0.m92672lJ()) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                                }
                                if (!AbstractC21935u.m114558y(this.f76944a.f42434r) && (contactProfile = this.f76944a) != null) {
                                    contactProfile.f42330D = 0L;
                                    C18644n.m98531l().m98543e(this.f76944a);
                                    C0824j.m2153b(new a());
                                }
                                AbstractC23074g2.m118375a(0, this.f76944a.f42434r, "", 5);
                                return;
                            }
                            return;
                        }
                        if (i13 != 0) {
                            ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(this.f76944a.f42434r);
                            if (mo98491j != null) {
                                mo98491j.f42369Q = optInt;
                            }
                            C7960e.m41971c6().m42566vd(this.f76944a.f42434r, optInt);
                            RemoveGroupMemberBaseView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.bc0
                                public /* synthetic */ bc0() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    RemoveGroupMemberBaseView.C14936d.this.m83615g();
                                }
                            });
                            return;
                        }
                        if (i11 != 0) {
                            AbstractC23063f2.m118349a(this.f76944a);
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                            AbstractC23074g2.m118375a(0, this.f76944a.f42434r, "", 5);
                            return;
                        }
                        return;
                    }
                    if (optInt2 < 0) {
                        if (optInt2 != -40 && optInt2 != -41 && optInt2 != -42 && optInt2 != -43 && optInt2 != -44) {
                            if (!AbstractC23216t1.m119641f(RemoveGroupMemberBaseView.this.f72421L0, optInt2, false)) {
                                ToastUtils.m89259g(optInt2);
                                return;
                            }
                            return;
                        }
                        RemoveGroupMemberBaseView.this.f76939i1 = AbstractC23161o1.m119317b(optInt2);
                        RemoveGroupMemberBaseView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.cc0
                            public /* synthetic */ cc0() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                RemoveGroupMemberBaseView.C14936d.this.m83616h();
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: AM */
    public static /* synthetic */ void m83585AM(CheckBox checkBox, View view) {
        if (checkBox != null) {
            try {
                checkBox.setChecked(!checkBox.isChecked());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: BM */
    public static /* synthetic */ void m83586BM(CheckBox checkBox, View view) {
        if (checkBox != null) {
            try {
                checkBox.setChecked(!checkBox.isChecked());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: CM */
    public /* synthetic */ void m83587CM(CheckBox checkBox, String str, String str2, CheckBox checkBox2, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (checkBox.isChecked()) {
            m83609vM(str, str2);
        } else {
            m83608uM(str, str2);
        }
        if (checkBox2.isChecked()) {
            m83606MM(str, str2);
        }
    }

    /* renamed from: DM */
    public /* synthetic */ void m83588DM(int i11, String str, String str2, int i12, String str3) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14933a(i11));
        c0766k.mo1787ya(str, "15", str2, "", i12, str3);
    }

    /* renamed from: EM */
    public /* synthetic */ void m83589EM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        ContactProfile contactProfile = this.f76936f1;
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            Bundle m140776b = new C27870vb(this.f76936f1.mo2478b()).m140780g(this.f76936f1).m140776b();
            if (this.f72421L0.m92676n2() != null) {
                this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
            }
        }
    }

    /* renamed from: GM */
    private void m83590GM(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(31);
            trackingSource.m40677a("sourceView", 20);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            C32002l4 m154264g = C32002l4.m154264g(46);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, m154264g).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.zb0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m83599xM;
                    m83599xM = RemoveGroupMemberBaseView.m83599xM();
                    return m83599xM;
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    public static /* synthetic */ Void m83599xM() {
        return null;
    }

    /* renamed from: yM */
    public /* synthetic */ void m83600yM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        ContactProfile contactProfile = this.f76936f1;
        if (contactProfile != null) {
            m83590GM(contactProfile);
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m83601zM(String str, String str2, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m83602IM(str, str2);
    }

    /* renamed from: FM */
    public void mo78395FM() {
    }

    /* renamed from: HM */
    public abstract void mo78398HM();

    /* renamed from: IM */
    void m83602IM(String str, String str2) {
        this.f72421L0.mo46829Y();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f76931a1);
        c0766k.mo1575X9(str, arrayList);
    }

    /* renamed from: JM */
    public void m83603JM() {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(4).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.xb0
            public /* synthetic */ xb0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                RemoveGroupMemberBaseView.this.m83600yM(interfaceC17463d, i11);
            }
        });
        aVar.m43152a().mo13822K();
    }

    /* renamed from: KM */
    public void m83604KM(String str, String str2) {
        boolean z11;
        int i11;
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f76929Y0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f76929Y0.dismiss();
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        ContactProfile m141811g = C28203u6.f131407a.m141811g(str2);
        if (m141811g == null) {
            return;
        }
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 != null) {
            z11 = c31973j5.m153747Y();
        } else {
            z11 = false;
        }
        C8009j.a m43159h = aVar.m43159h(7);
        if (z11) {
            i11 = AbstractC8020f0.str_title_dialog_remove_community_invitation;
        } else {
            i11 = AbstractC8020f0.str_title_dialog_remove_invitation;
        }
        m43159h.m43162k(AbstractC23136l9.m118746s0(i11, m141811g.m40383Q(true, false))).m43164m(AbstractC8020f0.str_btn_back, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_button_remove_invitation, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.sb0

            /* renamed from: q */
            public final /* synthetic */ String f81919q;

            /* renamed from: r */
            public final /* synthetic */ String f81920r;

            public /* synthetic */ sb0(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                RemoveGroupMemberBaseView.this.m83601zM(r2, r3, interfaceC17463d, i12);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f76929Y0 = m43152a;
        m43152a.mo13822K();
    }

    /* renamed from: LM */
    public void m83605LM(String str, String str2) {
        int i11;
        int i12;
        LinearLayout linearLayout = new LinearLayout(this.f72421L0.m92648SI());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.photo_hd_caution_not_show_again_view, (ViewGroup) linearLayout, false);
        inflate.setMinimumHeight(AbstractC23136l9.m118742r(30.0f));
        CheckBox checkBox = (CheckBox) inflate.findViewById(AbstractC6918a0.cbNotShowAgain);
        checkBox.setDuplicateParentStateEnabled(true);
        checkBox.setBackgroundColor(0);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvNotShowAgain);
        if (m4472f != null && m4472f.m153747Y()) {
            textView.setText(AbstractC8020f0.str_title_check_box_confirm_block_community_mem);
        } else {
            textView.setText(AbstractC8020f0.str_title_check_box_confirm_block_group_mem);
        }
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.tb0

            /* renamed from: p */
            public final /* synthetic */ CheckBox f82192p;

            public /* synthetic */ tb0(CheckBox checkBox2) {
                r1 = checkBox2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemoveGroupMemberBaseView.m83585AM(r1, view);
            }
        });
        linearLayout.addView(inflate, layoutParams);
        View inflate2 = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.photo_hd_caution_not_show_again_view, (ViewGroup) linearLayout, false);
        inflate2.setMinimumHeight(AbstractC23136l9.m118742r(30.0f));
        CheckBox checkBox2 = (CheckBox) inflate2.findViewById(AbstractC6918a0.cbNotShowAgain);
        checkBox2.setDuplicateParentStateEnabled(true);
        checkBox2.setBackgroundColor(0);
        ((TextView) inflate2.findViewById(AbstractC6918a0.tvNotShowAgain)).setText(AbstractC8020f0.profile_reportabuse);
        inflate2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ub0

            /* renamed from: p */
            public final /* synthetic */ CheckBox f82287p;

            public /* synthetic */ ub0(CheckBox checkBox22) {
                r1 = checkBox22;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemoveGroupMemberBaseView.m83586BM(r1, view);
            }
        });
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        int m118712h = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 24.0f);
        int m118712h2 = AbstractC23136l9.m118712h(MainApplication.getAppContext(), 8.0f);
        ContactProfile m141811g = C28203u6.f131407a.m141811g(str2);
        if (m141811g == null) {
            return;
        }
        if (m4472f != null && m4472f.m153747Y()) {
            i11 = AbstractC8020f0.str_title_dialog_confirm_remove_community_mem;
        } else {
            i11 = AbstractC8020f0.str_title_dialog_confirm_remove_group_mem;
        }
        if (m4472f != null && m4472f.m153747Y()) {
            i12 = AbstractC8020f0.str_button_remove_community_mem;
        } else {
            i12 = AbstractC8020f0.str_button_remove_group_mem;
        }
        aVar.m43159h(7).m43173v(3).m43172u(AbstractC23136l9.m118746s0(i11, m141811g.m40383Q(true, false))).m43150A(linearLayout, m118712h, m118712h2, m118712h, 0).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(i12, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.vb0

            /* renamed from: q */
            public final /* synthetic */ CheckBox f82405q;

            /* renamed from: r */
            public final /* synthetic */ String f82406r;

            /* renamed from: s */
            public final /* synthetic */ String f82407s;

            /* renamed from: t */
            public final /* synthetic */ CheckBox f82408t;

            public /* synthetic */ vb0(CheckBox checkBox22, String str3, String str22, CheckBox checkBox222) {
                r2 = checkBox22;
                r3 = str3;
                r4 = str22;
                r5 = checkBox222;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RemoveGroupMemberBaseView.this.m83587CM(r2, r3, r4, r5, interfaceC17463d, i13);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f76929Y0 = m43152a;
        m43152a.mo13822K();
    }

    /* renamed from: MM */
    public void m83606MM(String str, String str2) {
        KeyEventCallbackC17462c keyEventCallbackC17462c = this.f76929Y0;
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            this.f76929Y0.dismiss();
        }
        int i11 = AbstractC8020f0.profile_reportabuseconfirm;
        C2913t1.a m13861a = new C2913t1(this.f72421L0.getContext()).m13865e(new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.wb0

            /* renamed from: b */
            public final /* synthetic */ int f82503b;

            /* renamed from: c */
            public final /* synthetic */ String f82504c;

            /* renamed from: d */
            public final /* synthetic */ String f82505d;

            public /* synthetic */ wb0(int i12, String str22, String str3) {
                r2 = i12;
                r3 = str22;
                r4 = str3;
            }

            @Override // bn.C2913t1.b
            /* renamed from: a */
            public final void mo13056a(int i12, String str3) {
                RemoveGroupMemberBaseView.this.m83588DM(r2, r3, r4, i12, str3);
            }
        }).m13862b(AbstractC23136l9.m118743r0(i11), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no)).m13861a();
        this.f76929Y0 = m13861a;
        m13861a.mo13822K();
    }

    /* renamed from: NM */
    public void m83607NM() {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f76939i1).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.yb0
            public /* synthetic */ yb0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                RemoveGroupMemberBaseView.this.m83589EM(interfaceC17463d, i11);
            }
        }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
        aVar.m43152a().mo13822K();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        mo78395FM();
    }

    /* renamed from: uM */
    void m83608uM(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2) || this.f76933c1) {
                return;
            }
            this.f72421L0.mo46829Y();
            this.f76928X0 = str2;
            this.f76933c1 = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.f76934d1.mo1704o8(this.f76935e1);
            this.f76934d1.mo1715q3(str, arrayList);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: vM */
    void m83609vM(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2) || this.f76933c1) {
                return;
            }
            this.f72421L0.mo46829Y();
            this.f76928X0 = str2;
            this.f76933c1 = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.f76932b1.mo1704o8(this.f76935e1);
            this.f76932b1.mo1781y4(str, arrayList, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wM */
    public void m83610wM(ContactProfile contactProfile) {
        if (this.f76938h1 || !AbstractC23138m0.m118770b()) {
            return;
        }
        this.f72421L0.mo46829Y();
        this.f76938h1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14936d(contactProfile));
        c0766k.mo1615ca(contactProfile.f42434r);
    }
}
