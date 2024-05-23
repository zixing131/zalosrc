package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import bi0.AbstractC2810d;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.EditProfileConfig;
import com.zing.zalo.shortvideo.data.remote.common.EditChannelInvalidException;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import h20.InterfaceC19722f;
import i20.C20196i;
import java.util.regex.Pattern;
import m20.InterfaceC22728c0;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C24997d1;
import q10.C25017i1;
import q20.C25097t;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class EditProfileDetailView extends AbstractC10623a implements InterfaceC22728c0 {
    public static final C10210b Companion = new C10210b(null);

    /* renamed from: B0 */
    private final InterfaceC19722f f52756B0;

    /* renamed from: C0 */
    private final InterfaceC24854k f52757C0;

    /* renamed from: D0 */
    private String f52758D0;

    /* renamed from: E0 */
    private boolean f52759E0;

    /* renamed from: F0 */
    private String f52760F0;

    /* renamed from: G0 */
    private final String f52761G0;

    /* renamed from: H0 */
    private final Pattern f52762H0;

    /* renamed from: I0 */
    private C20196i f52763I0;

    /* renamed from: J0 */
    private Boolean f52764J0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class C10209a extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final C10209a f52765y = new C10209a();

        C10209a() {
            super(3, C24997d1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchLayoutEditChannelNameBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m54272h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24997d1 m54272h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24997d1.m129788c(layoutInflater, viewGroup, z11);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$b */
    /* loaded from: classes5.dex */
    public static final class C10210b {
        private C10210b() {
        }

        public /* synthetic */ C10210b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m54273a(String str) {
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            return AbstractC1438d.m7341b(AbstractC24866w.m129235a("EDIT_TYPE", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$c */
    /* loaded from: classes5.dex */
    public static final class C10211c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f52767r;

        /* renamed from: s */
        final /* synthetic */ ConfirmPopupView f52768s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10211c(String str, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52767r = str;
            this.f52768s = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54274a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54274a() {
            EditProfileDetailView.this.f52756B0.mo53172Fa(this.f52767r);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = this.f52768s.m92652XI(AbstractC27413h.zch_action_key_change_bio_confirm);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$d */
    /* loaded from: classes5.dex */
    public static final class C10212d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f52770r;

        /* renamed from: s */
        final /* synthetic */ ConfirmPopupView f52771s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10212d(String str, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52770r = str;
            this.f52771s = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54275a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54275a() {
            EditProfileDetailView.this.f52756B0.mo53173GD(this.f52770r);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = this.f52771s.m92652XI(AbstractC27413h.zch_action_key_change_alias_confirm);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$e */
    /* loaded from: classes5.dex */
    public static final class C10213e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ String f52773r;

        /* renamed from: s */
        final /* synthetic */ ConfirmPopupView f52774s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10213e(String str, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52773r = str;
            this.f52774s = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54276a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54276a() {
            EditProfileDetailView.this.f52756B0.mo53174j8(this.f52773r);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = this.f52774s.m92652XI(AbstractC27413h.zch_action_key_change_channel_name_confirm);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$f */
    /* loaded from: classes5.dex */
    static final class C10214f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$f$a */
        /* loaded from: classes5.dex */
        public static final class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ C24997d1 f52776p;

            a(C24997d1 c24997d1) {
                this.f52776p = c24997d1;
            }

            @Override // java.lang.Runnable
            public void run() {
                RobotoEditText robotoEditText = this.f52776p.f119845q;
                AbstractC19074t.m100207e(robotoEditText, "edt");
                if (!AbstractC26112n.m134427u0(robotoEditText)) {
                    this.f52776p.f119845q.post(this);
                }
            }
        }

        C10214f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54277a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54277a() {
            C24997d1 c24997d1 = (C24997d1) EditProfileDetailView.this.m55556SK();
            if (c24997d1 != null) {
                c24997d1.f119845q.requestFocus();
                c24997d1.f119845q.post(new a(c24997d1));
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$g */
    /* loaded from: classes5.dex */
    static final class C10215g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final C10215g f52777q = new C10215g();

        C10215g() {
            super(2);
        }

        /* renamed from: a */
        public final void m54278a(int i11, float f11) {
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54278a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$h */
    /* loaded from: classes5.dex */
    static final class C10216h extends AbstractC19075u implements InterfaceC18505l {
        C10216h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54279a(View view) {
            AbstractC19074t.m100208f(view, "it");
            EditProfileDetailView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54279a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$i */
    /* loaded from: classes5.dex */
    static final class C10217i extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: r */
        final /* synthetic */ C24997d1 f52780r;

        /* renamed from: s */
        final /* synthetic */ RobotoEditText f52781s;

        /* renamed from: t */
        final /* synthetic */ String f52782t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10217i(C24997d1 c24997d1, RobotoEditText robotoEditText, String str) {
            super(4);
            this.f52780r = c24997d1;
            this.f52781s = robotoEditText;
            this.f52782t = str;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54280a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54280a(CharSequence charSequence, int i11, int i12, int i13) {
            boolean z11;
            String str;
            String str2;
            String str3;
            CharSequence m127168X0;
            boolean m127128x;
            EditProfileDetailView editProfileDetailView = EditProfileDetailView.this;
            if (charSequence != null && charSequence.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            editProfileDetailView.m54265lL(!z11);
            String str4 = EditProfileDetailView.this.f52760F0;
            if (str4 != null) {
                int hashCode = str4.hashCode();
                if (hashCode != -570087573) {
                    if (hashCode != -166936401) {
                        if (hashCode == 1901804763 && str4.equals("TYPE_EDIT_NAME")) {
                            RobotoTextView robotoTextView = this.f52780r.f119854z;
                            if (charSequence != null && charSequence.length() != 0) {
                                str3 = charSequence.length() + "/30";
                            } else {
                                str3 = "0/30";
                            }
                            robotoTextView.setText(str3);
                            if (charSequence != null) {
                                m127168X0 = AbstractC24342w.m127168X0(charSequence);
                                m127128x = AbstractC24341v.m127128x(m127168X0);
                                if (m127128x && charSequence.length() > 0) {
                                    this.f52781s.setText("");
                                    EditProfileDetailView.this.m54264kL(false);
                                    return;
                                }
                            }
                            if (charSequence == null || charSequence.length() == 0 || charSequence.length() < 4) {
                                EditProfileDetailView.this.m54264kL(false);
                                return;
                            }
                            if (charSequence.length() > 30) {
                                this.f52780r.f119845q.setText(charSequence.subSequence(0, 30));
                                this.f52780r.f119845q.setSelection(30);
                                C25097t.f120556a.m130154o(EditProfileDetailView.this.m92689tK(), EditProfileDetailView.this.m92652XI(AbstractC27413h.zch_page_edit_profile_channel_name_limit_max_length));
                                EditProfileDetailView.this.m54264kL(true);
                                return;
                            }
                            if (!AbstractC19074t.m100204b(charSequence.toString(), EditProfileDetailView.this.f52758D0)) {
                                EditProfileDetailView.this.m54264kL(true);
                                return;
                            } else {
                                EditProfileDetailView.this.m54264kL(false);
                                return;
                            }
                        }
                        return;
                    }
                    if (str4.equals("TYPE_EDIT_INTRODUCE")) {
                        RobotoTextView robotoTextView2 = this.f52780r.f119854z;
                        if (charSequence != null && charSequence.length() != 0) {
                            str2 = charSequence.length() + "/150";
                        } else {
                            str2 = "0/150";
                        }
                        robotoTextView2.setText(str2);
                        if (charSequence != null && charSequence.length() != 0) {
                            if (charSequence.length() > 150) {
                                this.f52780r.f119845q.setText(charSequence.subSequence(0, 150));
                                this.f52780r.f119845q.setSelection(150);
                                C25097t.f120556a.m130154o(EditProfileDetailView.this.m92689tK(), EditProfileDetailView.this.m92652XI(AbstractC27413h.zch_page_edit_profile_channel_bio_limit_max_length));
                                EditProfileDetailView.this.m54264kL(true);
                                return;
                            }
                            if (!AbstractC19074t.m100204b(charSequence.toString(), EditProfileDetailView.this.f52758D0)) {
                                EditProfileDetailView.this.m54264kL(true);
                                return;
                            } else {
                                EditProfileDetailView.this.m54264kL(false);
                                return;
                            }
                        }
                        if (!AbstractC19074t.m100204b(String.valueOf(charSequence), EditProfileDetailView.this.f52758D0)) {
                            EditProfileDetailView.this.m54264kL(true);
                            return;
                        } else {
                            EditProfileDetailView.this.m54264kL(false);
                            return;
                        }
                    }
                    return;
                }
                if (str4.equals("TYPE_EDIT_ID")) {
                    RobotoTextView robotoTextView3 = this.f52780r.f119854z;
                    if (charSequence != null && charSequence.length() != 0) {
                        str = charSequence.length() + "/20";
                    } else {
                        str = "0/20";
                    }
                    robotoTextView3.setText(str);
                    if (!EditProfileDetailView.this.f52762H0.matcher(charSequence).find()) {
                        this.f52780r.f119852x.setText(EditProfileDetailView.this.m92652XI(AbstractC27413h.zch_page_edit_profile_channel_id_input_rule));
                        RobotoTextView robotoTextView4 = this.f52780r.f119852x;
                        AbstractC19074t.m100207e(robotoTextView4, "tvIdInvalid");
                        AbstractC26112n.m134431w0(robotoTextView4);
                        if (charSequence != null && charSequence.length() != 0 && charSequence.length() > 20) {
                            this.f52780r.f119845q.setText(charSequence.subSequence(0, 20));
                            this.f52780r.f119845q.setSelection(20);
                        }
                        EditProfileDetailView.this.m54264kL(false);
                    } else {
                        RobotoTextView robotoTextView5 = this.f52780r.f119852x;
                        AbstractC19074t.m100207e(robotoTextView5, "tvIdInvalid");
                        AbstractC26112n.m134367H(robotoTextView5);
                        if (charSequence == null || charSequence.length() == 0 || charSequence.length() < 4) {
                            EditProfileDetailView.this.m54264kL(false);
                        } else if (charSequence.length() > 20) {
                            this.f52780r.f119845q.setText(charSequence.subSequence(0, 20));
                            this.f52780r.f119845q.setSelection(20);
                            C25097t.f120556a.m130154o(EditProfileDetailView.this.m92689tK(), EditProfileDetailView.this.m92652XI(AbstractC27413h.zch_page_edit_profile_channel_id_limit_max_length));
                            EditProfileDetailView.this.m54264kL(true);
                        } else if (!AbstractC19074t.m100204b(charSequence.toString(), EditProfileDetailView.this.f52758D0)) {
                            EditProfileDetailView.this.m54264kL(true);
                        } else {
                            EditProfileDetailView.this.m54264kL(false);
                        }
                    }
                    this.f52780r.f119851w.setText(this.f52782t + "/" + ((Object) charSequence));
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$j */
    /* loaded from: classes5.dex */
    static final class C10218j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C24997d1 f52783q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10218j(C24997d1 c24997d1) {
            super(1);
            this.f52783q = c24997d1;
        }

        /* renamed from: a */
        public final void m54281a(View view) {
            AbstractC19074t.m100208f(view, "it");
            this.f52783q.f119845q.setText("");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54281a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$k */
    /* loaded from: classes5.dex */
    static final class C10219k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C24997d1 f52784q;

        /* renamed from: r */
        final /* synthetic */ EditProfileDetailView f52785r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10219k(C24997d1 c24997d1, EditProfileDetailView editProfileDetailView) {
            super(1);
            this.f52784q = c24997d1;
            this.f52785r = editProfileDetailView;
        }

        /* renamed from: a */
        public final void m54282a(View view) {
            AbstractC19074t.m100208f(view, "it");
            String valueOf = String.valueOf(this.f52784q.f119845q.getText());
            if (!AbstractC19074t.m100204b(valueOf, this.f52785r.f52758D0) && this.f52785r.f52759E0) {
                RobotoEditText robotoEditText = this.f52784q.f119845q;
                AbstractC19074t.m100207e(robotoEditText, "edt");
                AbstractC26112n.m134369J(robotoEditText);
                String str = this.f52785r.f52760F0;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -570087573) {
                        if (hashCode != -166936401) {
                            if (hashCode == 1901804763 && str.equals("TYPE_EDIT_NAME")) {
                                this.f52785r.m54259fL(valueOf);
                                return;
                            }
                            return;
                        }
                        if (str.equals("TYPE_EDIT_INTRODUCE")) {
                            this.f52785r.m54257dL(valueOf);
                            return;
                        }
                        return;
                    }
                    if (str.equals("TYPE_EDIT_ID")) {
                        this.f52785r.m54258eL(valueOf);
                    }
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54282a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditProfileDetailView$l */
    /* loaded from: classes5.dex */
    static final class C10220l extends AbstractC19075u implements InterfaceC18494a {
        C10220l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(EditProfileDetailView.this.m92651WI().getDimension(AbstractC27407b.zch_radius_4dp));
        }
    }

    public EditProfileDetailView() {
        super(C10209a.f52765y);
        InterfaceC24854k m129210a;
        this.f52756B0 = AbstractC28684a.Companion.m143687u();
        m129210a = AbstractC24856m.m129210a(new C10220l());
        this.f52757C0 = m129210a;
        this.f52761G0 = "^[A-Za-z0-9_]*$";
        this.f52762H0 = Pattern.compile("^[A-Za-z0-9_]*$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dL */
    public final void m54257dL(String str) {
        String str2;
        EditProfileConfig m51426c;
        Long m51466c;
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51426c = m140381e.m51426c()) != null && (m51466c = m51426c.m51466c()) != null) {
            str2 = AbstractC26105g.m134339f(m51466c.longValue(), getContext());
        } else {
            str2 = null;
        }
        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, m92652XI(AbstractC27413h.zch_popup_change_channel_bio_title), m92653YI(AbstractC27413h.zch_popup_change_channel_bio_message, str2), m92652XI(AbstractC27413h.zch_popup_change_channel_bio_positive), m92652XI(AbstractC27413h.zch_popup_change_channel_bio_negative), null, false, false, 80, null);
        m51992b.m51991lL(new C10211c(str, m51992b));
        m51992b.m51978ZK(true);
        BasePopupView.m51974dL(m51992b, m54260gL(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eL */
    public final void m54258eL(String str) {
        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, m92652XI(AbstractC27413h.zch_popup_change_id_title), m92653YI(AbstractC27413h.zch_popup_change_id_message, str), m92652XI(AbstractC27413h.zch_popup_change_id_positive), m92652XI(AbstractC27413h.zch_popup_change_id_negative), null, false, false, 80, null);
        m51992b.m51991lL(new C10212d(str, m51992b));
        m51992b.m51978ZK(true);
        BasePopupView.m51974dL(m51992b, m54260gL(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public final void m54259fL(String str) {
        String str2;
        EditProfileConfig m51426c;
        Long m51467d;
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51426c = m140381e.m51426c()) != null && (m51467d = m51426c.m51467d()) != null) {
            str2 = AbstractC26105g.m134339f(m51467d.longValue(), getContext());
        } else {
            str2 = null;
        }
        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, m92652XI(AbstractC27413h.zch_popup_change_channel_name_title), m92653YI(AbstractC27413h.zch_popup_change_channel_name_message, str2), m92652XI(AbstractC27413h.zch_popup_change_channel_name_positive), m92652XI(AbstractC27413h.zch_popup_change_channel_name_negative), null, false, false, 80, null);
        m51992b.m51991lL(new C10213e(str, m51992b));
        m51992b.m51978ZK(true);
        BasePopupView.m51974dL(m51992b, m54260gL(), null, 2, null);
    }

    /* renamed from: gL */
    private final C17487o0 m54260gL() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof EditProfileDetailView) {
            C17487o0 m92649TI = ((EditProfileDetailView) m92650VI).m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            return m92649TI;
        }
        C17487o0 m92649TI2 = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI2, "getChildZaloViewManager(...)");
        return m92649TI2;
    }

    /* renamed from: hL */
    private final float m54261hL() {
        return ((Number) this.f52757C0.getValue()).floatValue();
    }

    /* renamed from: iL */
    private final CharSequence m54262iL() {
        String str = this.f52760F0;
        if (AbstractC19074t.m100204b(str, "TYPE_EDIT_ID")) {
            String m92652XI = m92652XI(AbstractC27413h.zch_page_edit_profile_channel_id_title);
            AbstractC19074t.m100205c(m92652XI);
            return m92652XI;
        }
        if (AbstractC19074t.m100204b(str, "TYPE_EDIT_INTRODUCE")) {
            String m92652XI2 = m92652XI(AbstractC27413h.zch_page_edit_profile_channel_bio_title);
            AbstractC19074t.m100205c(m92652XI2);
            return m92652XI2;
        }
        String m92652XI3 = m92652XI(AbstractC27413h.zch_page_edit_profile_channel_name);
        AbstractC19074t.m100205c(m92652XI3);
        return m92652XI3;
    }

    /* renamed from: jL */
    private final void m54263jL(Intent intent) {
        RobotoEditText robotoEditText;
        C24997d1 c24997d1 = (C24997d1) m55556SK();
        if (c24997d1 != null && (robotoEditText = c24997d1.f119845q) != null) {
            AbstractC26112n.m134369J(robotoEditText);
        }
        mo50035CK(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public final void m54264kL(boolean z11) {
        C25017i1 c25017i1;
        SimpleShadowTextView simpleShadowTextView;
        if (this.f52759E0 == z11) {
            return;
        }
        this.f52759E0 = z11;
        C24997d1 c24997d1 = (C24997d1) m55556SK();
        if (c24997d1 != null && (c25017i1 = c24997d1.f119846r) != null && (simpleShadowTextView = c25017i1.f119959q) != null) {
            if (z11) {
                AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_active), m54261hL());
                simpleShadowTextView.setClickable(true);
            } else {
                AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_background), m54261hL());
                simpleShadowTextView.setClickable(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lL */
    public final void m54265lL(boolean z11) {
        ImageView imageView;
        ImageView imageView2;
        if (AbstractC19074t.m100204b(Boolean.valueOf(z11), this.f52764J0)) {
            return;
        }
        this.f52764J0 = Boolean.valueOf(z11);
        if (z11) {
            C24997d1 c24997d1 = (C24997d1) m55556SK();
            if (c24997d1 != null && (imageView2 = c24997d1.f119847s) != null) {
                AbstractC26112n.m134431w0(imageView2);
                return;
            }
            return;
        }
        C24997d1 c24997d12 = (C24997d1) m55556SK();
        if (c24997d12 != null && (imageView = c24997d12.f119847s) != null) {
            AbstractC26112n.m134367H(imageView);
        }
    }

    @Override // m20.InterfaceC22728c0
    /* renamed from: AH */
    public void mo54266AH(String str) {
        AbstractC19074t.m100208f(str, "name");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_EDIT_PROFILE", str);
        m54263jL(intent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        this.f52756B0.mo52970uo(m92642L3());
        this.f52756B0.mo52965Lb(this);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("EDIT_TYPE");
        } else {
            str = null;
        }
        this.f52760F0 = str;
    }

    @Override // m20.InterfaceC22728c0
    /* renamed from: EB */
    public void mo54267EB(String str) {
        AbstractC19074t.m100208f(str, "id");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_EDIT_PROFILE", str);
        m54263jL(intent);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C20196i c20196i = this.f52763I0;
        if (c20196i != null) {
            c20196i.m105320p(new C10214f());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        RobotoEditText robotoEditText;
        super.mo37712VJ();
        C24997d1 c24997d1 = (C24997d1) m55556SK();
        if (c24997d1 != null && (robotoEditText = c24997d1.f119845q) != null) {
            AbstractC26112n.m134369J(robotoEditText);
        }
        C20196i c20196i = this.f52763I0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        int i11;
        EditProfileConfig m51426c;
        EditProfileConfig m51426c2;
        EditProfileConfig m51426c3;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        this.f52763I0 = new C20196i(this, false, C10215g.f52777q, 2, null);
        C24997d1 c24997d1 = (C24997d1) m55556SK();
        if (c24997d1 != null) {
            LinearLayout linearLayout = c24997d1.f119849u;
            AbstractC19074t.m100207e(linearLayout, "lytContainer");
            AbstractC26112n.m134419q0(linearLayout, AbstractC17484n.Companion.m92931b());
            ImageView imageView = c24997d1.f119846r.f119960r;
            AbstractC19074t.m100207e(imageView, "btnBack");
            AbstractC26112n.m134407k0(imageView, new C10216h());
            c24997d1.f119846r.f119966x.setText(m54262iL());
            ImageView imageView2 = c24997d1.f119847s;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            imageView2.setImageDrawable(C27280g.m139659b(m92689tK, AbstractC2810d.zds_ic_close_circle_solid_16, AbstractC27406a.zch_icon_tertiary));
            ImageView imageView3 = c24997d1.f119848t;
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
            imageView3.setImageDrawable(C27280g.m139659b(m92689tK2, AbstractC2810d.zds_ic_info_circle_solid_16, AbstractC27406a.zch_icon_tertiary));
            C27417l c27417l = C27417l.f129055a;
            Channel m140377a = c27417l.m140377a();
            ChannelConfig m140381e = c27417l.m140381e();
            Long l11 = null;
            if (m140381e != null && (m51426c3 = m140381e.m51426c()) != null) {
                str = m51426c3.m51464a();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.f52760F0;
            if (str3 != null) {
                int hashCode = str3.hashCode();
                int i12 = 0;
                if (hashCode != -570087573) {
                    if (hashCode != -166936401) {
                        if (hashCode == 1901804763 && str3.equals("TYPE_EDIT_NAME") && m140377a != null) {
                            c24997d1.f119845q.setSingleLine(true);
                            RobotoTextView robotoTextView = c24997d1.f119851w;
                            AbstractC19074t.m100207e(robotoTextView, "tvID");
                            AbstractC26112n.m134367H(robotoTextView);
                            RobotoTextView robotoTextView2 = c24997d1.f119852x;
                            AbstractC19074t.m100207e(robotoTextView2, "tvIdInvalid");
                            AbstractC26112n.m134367H(robotoTextView2);
                            this.f52758D0 = m140377a.m50775o();
                            String m50775o = m140377a.m50775o();
                            if (m50775o == null || m50775o.length() == 0) {
                                ImageView imageView4 = c24997d1.f119847s;
                                AbstractC19074t.m100207e(imageView4, "ivClearText");
                                AbstractC26112n.m134367H(imageView4);
                            }
                            String m50775o2 = m140377a.m50775o();
                            if (m50775o2 != null) {
                                c24997d1.f119845q.setText(m50775o2);
                                c24997d1.f119845q.setSelection(m50775o2.length());
                                c24997d1.f119854z.setText(m50775o2.length() + "/30");
                            }
                            if (m140381e != null && (m51426c2 = m140381e.m51426c()) != null) {
                                l11 = m51426c2.m51467d();
                            }
                            if (l11 != null) {
                                RobotoTextView robotoTextView3 = c24997d1.f119853y;
                                AbstractC19074t.m100207e(robotoTextView3, "tvInfo");
                                AbstractC26112n.m134431w0(robotoTextView3);
                                c24997d1.f119853y.setText(m92653YI(AbstractC27413h.zch_page_edit_profile_channel_name_policy, AbstractC26105g.m134339f(l11.longValue(), getContext())));
                            } else {
                                RobotoTextView robotoTextView4 = c24997d1.f119853y;
                                AbstractC19074t.m100207e(robotoTextView4, "tvInfo");
                                AbstractC26112n.m134367H(robotoTextView4);
                            }
                        }
                    } else if (str3.equals("TYPE_EDIT_INTRODUCE") && m140377a != null) {
                        String m50755d = m140377a.m50755d();
                        if (m50755d == null || m50755d.length() == 0) {
                            ImageView imageView5 = c24997d1.f119847s;
                            AbstractC19074t.m100207e(imageView5, "ivClearText");
                            AbstractC26112n.m134367H(imageView5);
                        }
                        c24997d1.f119845q.setSingleLine(false);
                        c24997d1.f119845q.setMaxLines(5);
                        RobotoTextView robotoTextView5 = c24997d1.f119851w;
                        AbstractC19074t.m100207e(robotoTextView5, "tvID");
                        AbstractC26112n.m134367H(robotoTextView5);
                        RobotoTextView robotoTextView6 = c24997d1.f119852x;
                        AbstractC19074t.m100207e(robotoTextView6, "tvIdInvalid");
                        AbstractC26112n.m134367H(robotoTextView6);
                        this.f52758D0 = m140377a.m50755d();
                        String m50755d2 = m140377a.m50755d();
                        if (m50755d2 != null) {
                            c24997d1.f119845q.setText(m50755d2);
                            c24997d1.f119845q.setSelection(m50755d2.length());
                            c24997d1.f119854z.setText(m50755d2.length() + "/150");
                        }
                        String m50755d3 = m140377a.m50755d();
                        if (m50755d3 == null || m50755d3.length() == 0) {
                            c24997d1.f119845q.setHint(m92652XI(AbstractC27413h.zch_page_edit_profile_add_bio));
                        }
                        if (m140381e != null && (m51426c = m140381e.m51426c()) != null) {
                            l11 = m51426c.m51466c();
                        }
                        if (l11 != null) {
                            RobotoTextView robotoTextView7 = c24997d1.f119853y;
                            AbstractC19074t.m100207e(robotoTextView7, "tvInfo");
                            AbstractC26112n.m134431w0(robotoTextView7);
                            c24997d1.f119853y.setText(m92653YI(AbstractC27413h.zch_page_edit_profile_channel_bio_police, AbstractC26105g.m134339f(l11.longValue(), getContext())));
                        } else {
                            RobotoTextView robotoTextView8 = c24997d1.f119853y;
                            AbstractC19074t.m100207e(robotoTextView8, "tvInfo");
                            AbstractC26112n.m134367H(robotoTextView8);
                        }
                    }
                } else if (str3.equals("TYPE_EDIT_ID") && m140377a != null) {
                    String m50752b = m140377a.m50752b();
                    if (m50752b == null || m50752b.length() == 0) {
                        ImageView imageView6 = c24997d1.f119847s;
                        AbstractC19074t.m100207e(imageView6, "ivClearText");
                        AbstractC26112n.m134367H(imageView6);
                    }
                    c24997d1.f119845q.setSingleLine(true);
                    RobotoTextView robotoTextView9 = c24997d1.f119851w;
                    AbstractC19074t.m100207e(robotoTextView9, "tvID");
                    AbstractC26112n.m134431w0(robotoTextView9);
                    RobotoTextView robotoTextView10 = c24997d1.f119852x;
                    AbstractC19074t.m100207e(robotoTextView10, "tvIdInvalid");
                    AbstractC26112n.m134367H(robotoTextView10);
                    if (str.length() == 0) {
                        RobotoTextView robotoTextView11 = c24997d1.f119851w;
                        AbstractC19074t.m100207e(robotoTextView11, "tvID");
                        AbstractC26112n.m134367H(robotoTextView11);
                    } else {
                        RobotoTextView robotoTextView12 = c24997d1.f119851w;
                        String m50752b2 = m140377a.m50752b();
                        if (m50752b2 == null) {
                            m50752b2 = "";
                        }
                        robotoTextView12.setText(str + "/" + m50752b2);
                    }
                    this.f52758D0 = m140377a.m50752b();
                    String m50752b3 = m140377a.m50752b();
                    RobotoEditText robotoEditText = c24997d1.f119845q;
                    if (m50752b3 != null) {
                        str2 = m50752b3;
                    }
                    robotoEditText.setText(str2);
                    RobotoEditText robotoEditText2 = c24997d1.f119845q;
                    if (m50752b3 != null) {
                        i11 = m50752b3.length();
                    } else {
                        i11 = 0;
                    }
                    robotoEditText2.setSelection(i11);
                    RobotoTextView robotoTextView13 = c24997d1.f119854z;
                    if (m50752b3 != null) {
                        i12 = m50752b3.length();
                    }
                    robotoTextView13.setText(i12 + "/20");
                    c24997d1.f119853y.setText(m92652XI(AbstractC27413h.zch_page_edit_profile_channel_id_policy));
                }
            }
            RobotoEditText robotoEditText3 = c24997d1.f119845q;
            AbstractC19074t.m100205c(robotoEditText3);
            AbstractC26112n.m134414o(robotoEditText3, new C10217i(c24997d1, robotoEditText3, str));
            ImageView imageView7 = c24997d1.f119847s;
            AbstractC19074t.m100207e(imageView7, "ivClearText");
            AbstractC26112n.m134407k0(imageView7, new C10218j(c24997d1));
            SimpleShadowTextView simpleShadowTextView = c24997d1.f119846r.f119959q;
            simpleShadowTextView.setText(m92652XI(AbstractC27413h.zch_page_edit_profile_save));
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134431w0(simpleShadowTextView);
            AbstractC26112n.m134407k0(simpleShadowTextView, new C10219k(c24997d1, this));
            AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_background), m54261hL());
        }
    }

    @Override // m20.InterfaceC22728c0
    /* renamed from: eo */
    public void mo54268eo(String str) {
        AbstractC19074t.m100208f(str, "bio");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_EDIT_PROFILE", str);
        m54263jL(intent);
    }

    @Override // m20.InterfaceC22728c0
    /* renamed from: jb */
    public void mo54269jb(Throwable th2) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        if (th2 instanceof EditChannelInvalidException) {
            C24997d1 c24997d1 = (C24997d1) m55556SK();
            if (c24997d1 != null && (robotoTextView = c24997d1.f119852x) != null) {
                robotoTextView.setText(((EditChannelInvalidException) th2).getMessage());
                AbstractC26112n.m134431w0(robotoTextView);
                return;
            }
            return;
        }
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // m20.InterfaceC22728c0
    /* renamed from: o9 */
    public void mo54270o9(Throwable th2) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        if (th2 instanceof EditChannelInvalidException) {
            C24997d1 c24997d1 = (C24997d1) m55556SK();
            if (c24997d1 != null && (robotoTextView = c24997d1.f119852x) != null) {
                robotoTextView.setText(((EditChannelInvalidException) th2).getMessage());
                AbstractC26112n.m134431w0(robotoTextView);
                return;
            }
            return;
        }
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // m20.InterfaceC22728c0
    /* renamed from: pc */
    public void mo54271pc(Throwable th2) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        if (th2 instanceof EditChannelInvalidException) {
            C24997d1 c24997d1 = (C24997d1) m55556SK();
            if (c24997d1 != null && (robotoTextView = c24997d1.f119852x) != null) {
                robotoTextView.setText(((EditChannelInvalidException) th2).getMessage());
                AbstractC26112n.m134431w0(robotoTextView);
                return;
            }
            return;
        }
        C25097t.f120556a.m130155r(getContext(), th2);
    }
}
