package com.zing.zalo.p077ui.moduleview.contact;

import ag0.AbstractC0826k;
import ag0.C0824j;
import ag0.C0843s0;
import am.AbstractC0939u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7072g3;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.moduleview.contact.ContactNativeItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import gg0.AbstractC19444a;
import hd0.C20003a;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import r30.C25637g;
import t00.C26446c;
import vg.C28203u6;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ContactNativeItemModuleView extends ModulesView {

    /* renamed from: K */
    C22129e f64590K;

    /* renamed from: L */
    C16716d f64591L;

    /* renamed from: M */
    C16716d f64592M;

    /* renamed from: N */
    C22126c0 f64593N;

    /* renamed from: O */
    C22126c0 f64594O;

    /* renamed from: P */
    C22126c0 f64595P;

    /* renamed from: Q */
    C22126c0 f64596Q;

    /* renamed from: R */
    C22126c0 f64597R;

    /* renamed from: S */
    int f64598S;

    /* renamed from: T */
    boolean f64599T;

    /* renamed from: U */
    C7072g3.a f64600U;

    /* renamed from: V */
    C7072g3 f64601V;

    /* renamed from: W */
    int f64602W;

    /* renamed from: a0 */
    int f64603a0;

    /* renamed from: b0 */
    int f64604b0;

    /* renamed from: c0 */
    int f64605c0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.moduleview.contact.ContactNativeItemModuleView$a */
    /* loaded from: classes6.dex */
    public class C12408a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f64606a;

        C12408a(ContactProfile contactProfile) {
            this.f64606a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f64606a.f42434r);
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s) && !TextUtils.isEmpty(m141809c.f42446v)) {
                ContactProfile contactProfile = this.f64606a;
                String str = contactProfile.f42434r;
                String str2 = m141809c.f42437s;
                String str3 = m141809c.f42446v;
                String str4 = m141809c.f42460z1;
                contactProfile.f42437s = str2;
                contactProfile.f42446v = str3;
                C7960e.m41971c6().m42124Fd(str, str2, str3, str4);
                ContactNativeItemModuleView.this.m69713f0();
                return;
            }
            C0843s0.m2286r().m2294e(new C12409b(this.f64606a.f42434r));
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.contact.ContactNativeItemModuleView$b */
    /* loaded from: classes6.dex */
    class C12409b extends AbstractC0826k {
        C12409b(String str) {
            this.f2902a = 0;
            this.f2903b = str;
            this.f2904c = new TrackingSource((short) 1018);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            ContactProfile contactProfile;
            if (obj != null) {
                try {
                    contactProfile = new ContactProfile((JSONObject) obj);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                if (C7960e.m41971c6() != null && str.length() > 0 && !str.equalsIgnoreCase("null")) {
                    C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(str));
                    C7960e.m41971c6().m42113Ed(contactProfile.f42434r, contactProfile.f42437s, contactProfile.f42446v, contactProfile.f42460z1);
                    ContactNativeItemModuleView.this.m69713f0();
                }
            }
        }
    }

    public ContactNativeItemModuleView(Context context, C7072g3 c7072g3, C7072g3.a aVar) {
        super(context);
        this.f64599T = false;
        this.f64598S = AbstractC23136l9.m118655I(AbstractC16802y.avt_image_size_default);
        this.f64600U = aVar;
        this.f64603a0 = AbstractC23136l9.m118742r(10.0f);
        this.f64605c0 = AbstractC23136l9.m118742r(12.0f);
        this.f64602W = AbstractC23136l9.m118742r(16.0f);
        this.f64604b0 = AbstractC23136l9.m118655I(AbstractC16802y.f13);
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_2_w_xsmal);
        int m118742r = AbstractC23136l9.m118742r(2.0f);
        int m118742r2 = AbstractC23136l9.m118742r(6.0f);
        this.f64601V = c7072g3;
        C22129e c22129e = new C22129e(context, this.f64598S);
        this.f64590K = c22129e;
        C16718f m89106L = c22129e.m89106L();
        int i11 = this.f64598S;
        m89106L.m89028L(i11, i11).m89034R(this.f64602W).m89036T(this.f64603a0).m89033Q(this.f64603a0).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64595P = c22126c0;
        C16718f m89040X = c22126c0.m89106L().m89028L(-2, -2).m89040X(m118655I);
        Boolean bool = Boolean.TRUE;
        C16718f m89017A = m89040X.m89017A(bool);
        int i12 = this.f64602W;
        m89017A.m89042Z(i12, 0, i12, 0).m89027K(true).m89034R(this.f64605c0).m89035S(this.f64602W).m89029M(15);
        this.f64595P.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
        this.f64595P.m111979u1(true);
        this.f64595P.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_view_add_friend));
        AbstractC23022b5.m118023a(this.f64595P, AbstractC8915g0.btnType2_small);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64596Q = c22126c02;
        c22126c02.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89034R(this.f64605c0).m89035S(this.f64602W);
        this.f64596Q.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
        this.f64596Q.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_done));
        this.f64596Q.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64596Q.mo44614b1(8);
        C16716d c16716d = new C16716d(context);
        this.f64592M = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89054h0(this.f64590K).m89034R(this.f64602W).m89036T(this.f64603a0).m89033Q(this.f64603a0).m89027K(true).m89050f0(new C20003a(this.f64595P, this.f64596Q));
        C16716d c16716d2 = new C16716d(context);
        this.f64591L = c16716d2;
        c16716d2.m89106L().m89028L(-2, -2);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64597R = c22126c03;
        c22126c03.m89106L().m89028L(-2, -2).m89017A(bool).m89042Z(m118742r2, m118742r, m118742r2, m118742r).m89034R(m118742r2).m89036T(AbstractC23136l9.m118742r(3.0f)).m89029M(15);
        this.f64597R.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f64597R.mo111964L1(AbstractC23136l9.m118742r(9.0f));
        this.f64597R.m89087B0(AbstractC16803z.bg_noti_green);
        this.f64597R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_label_new));
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64593N = c22126c04;
        c22126c04.m89106L().m89028L(-2, -2).m89049e0(this.f64597R);
        this.f64593N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f64593N.m111953A1(1);
        this.f64593N.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85295f2));
        C22126c0 c22126c05 = this.f64593N;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c05.m111980v1(truncateAt);
        C22126c0 c22126c06 = new C22126c0(context);
        this.f64594O = c22126c06;
        c22126c06.m89106L().m89028L(-1, -2).m89023G(this.f64591L);
        this.f64594O.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64594O.m111953A1(1);
        this.f64594O.mo111964L1(this.f64604b0);
        this.f64594O.m111980v1(truncateAt);
        mo69681L(this.f64590K);
        this.f64591L.m89001g1(this.f64597R);
        this.f64591L.m89001g1(this.f64593N);
        mo69681L(this.f64595P);
        mo69681L(this.f64596Q);
        this.f64592M.m89001g1(this.f64591L);
        this.f64592M.m89001g1(this.f64594O);
        mo69681L(this.f64592M);
        m88987U(-1, -2);
        setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m69708b0(ContactProfile contactProfile, int i11, C16719g c16719g) {
        C7072g3.a aVar = this.f64600U;
        if (aVar != null) {
            aVar.mo36106Yd(contactProfile, i11, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m69709c0(ContactProfile contactProfile, int i11, C16719g c16719g) {
        C7072g3.a aVar = this.f64600U;
        if (aVar != null) {
            aVar.mo36107zc(contactProfile, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m69710d0(ContactProfile contactProfile, int i11, C16719g c16719g) {
        C7072g3.a aVar = this.f64600U;
        if (aVar != null) {
            aVar.mo36106Yd(contactProfile, i11, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m69711e0() {
        C7072g3 c7072g3 = this.f64601V;
        if (c7072g3 != null && !this.f64599T) {
            c7072g3.m10008p();
        }
    }

    /* renamed from: a0 */
    public void m69712a0(final ContactProfile contactProfile, boolean z11, final int i11) {
        int i12;
        try {
            this.f64599T = z11;
            if (contactProfile != null) {
                m69714g0(contactProfile);
                C22129e c22129e = this.f64590K;
                c22129e.f108931U0 = z11;
                c22129e.m115433q1(contactProfile);
                if (contactProfile.f42393Y && C25637g.m132489q().m132460d(contactProfile.f42434r)) {
                    setBackgroundResource(AbstractC16803z.stencils_contact_bg_new);
                } else {
                    setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
                }
                this.f64597R.mo44614b1(8);
                String m40383Q = contactProfile.m40383Q(true, false);
                String str = contactProfile.f42437s;
                int i13 = contactProfile.f42335E1;
                if ((i13 == 1 || i13 == 2) && !TextUtils.isEmpty(contactProfile.f42436r1)) {
                    this.f64593N.m111959G1(m40383Q);
                    if (contactProfile.f42335E1 == 1) {
                        if (!TextUtils.equals(m40383Q, contactProfile.f42436r1)) {
                            String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_zalo_name_text), "");
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(contactProfile.f42436r1);
                            spannableStringBuilder.insert(0, (CharSequence) format);
                            this.f64594O.m111959G1(spannableStringBuilder);
                            this.f64594O.mo44614b1(0);
                        } else {
                            this.f64594O.mo44614b1(8);
                        }
                    } else if (!TextUtils.isEmpty(m40383Q) && !TextUtils.isEmpty(str) && !m40383Q.equals(str)) {
                        this.f64594O.m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_zalo_name_text), str));
                        this.f64594O.mo44614b1(0);
                    } else {
                        this.f64594O.mo44614b1(8);
                    }
                } else {
                    C22126c0 c22126c0 = this.f64597R;
                    if (contactProfile.f42403c1) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c22126c0.mo44614b1(i12);
                    if (contactProfile.f42399a1.isEmpty()) {
                        this.f64593N.m111959G1(contactProfile.m40383Q(true, false));
                    } else {
                        m40383Q = contactProfile.f42363O;
                        if (TextUtils.isEmpty(m40383Q)) {
                            m40383Q = contactProfile.m40383Q(true, false);
                        }
                        SpannableString spannableString = new SpannableString(m40383Q);
                        for (int i14 = 0; i14 < contactProfile.f42399a1.size() - 1; i14 += 2) {
                            try {
                                if (((Integer) contactProfile.f42399a1.get(i14)).intValue() >= 0) {
                                    int i15 = i14 + 1;
                                    if (((Integer) contactProfile.f42399a1.get(i15)).intValue() > ((Integer) contactProfile.f42399a1.get(i14)).intValue()) {
                                        spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i14)).intValue(), ((Integer) contactProfile.f42399a1.get(i15)).intValue(), 33);
                                    }
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                        this.f64593N.m111959G1(spannableString);
                    }
                    if (!TextUtils.isEmpty(m40383Q) && !TextUtils.isEmpty(str) && !m40383Q.equals(str)) {
                        this.f64594O.m111959G1(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_zalo_name_text), str));
                        this.f64594O.mo44614b1(0);
                    } else {
                        this.f64594O.mo44614b1(8);
                    }
                }
                if (AbstractC23063f2.m118360l(contactProfile.f42434r)) {
                    this.f64595P.mo44614b1(0);
                    this.f64596Q.mo44614b1(8);
                    this.f64595P.m111959G1(C26446c.m136326b().m136327a());
                    AbstractC23022b5.m118023a(this.f64595P, AbstractC8915g0.btnType1_small);
                    this.f64595P.mo89109M0(new C16719g.c() { // from class: h80.a
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            ContactNativeItemModuleView.this.m69708b0(contactProfile, i11, c16719g);
                        }
                    });
                    return;
                }
                if (AbstractC23063f2.m118359k(contactProfile.f42434r)) {
                    this.f64595P.mo44614b1(0);
                    this.f64596Q.mo44614b1(8);
                    this.f64595P.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_undo_request_friend));
                    AbstractC23022b5.m118023a(this.f64595P, AbstractC8915g0.btnType3_small);
                    this.f64595P.mo89109M0(new C16719g.c() { // from class: h80.b
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            ContactNativeItemModuleView.this.m69709c0(contactProfile, i11, c16719g);
                        }
                    });
                    return;
                }
                if (AbstractC21935u.m114554u(contactProfile.f42434r)) {
                    this.f64595P.mo44614b1(8);
                    this.f64596Q.mo44614b1(0);
                    return;
                }
                this.f64595P.mo44614b1(0);
                this.f64596Q.mo44614b1(8);
                this.f64595P.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_func_add_friend_new));
                AbstractC23022b5.m118023a(this.f64595P, AbstractC8915g0.btnType2_small);
                this.f64595P.mo89109M0(new C16719g.c() { // from class: h80.c
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        ContactNativeItemModuleView.this.m69710d0(contactProfile, i11, c16719g);
                    }
                });
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: f0 */
    void m69713f0() {
        AbstractC19444a.m101695c(new Runnable() { // from class: h80.d
            @Override // java.lang.Runnable
            public final void run() {
                ContactNativeItemModuleView.this.m69711e0();
            }
        });
    }

    /* renamed from: g0 */
    public void m69714g0(ContactProfile contactProfile) {
        try {
            if (!TextUtils.isEmpty(contactProfile.f42437s) && !TextUtils.isEmpty(contactProfile.f42446v)) {
                return;
            }
            if (Long.parseLong(contactProfile.f42434r) > 0) {
                C0824j.m2153b(new C12408a(contactProfile));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
