package com.zing.zalo.p077ui.moduleview.inappnoti;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7027c3;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.moduleview.inappnoti.InAppNotiChatModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import gw.AbstractC19646n0;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.C23212s8;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p588vw.C28652r;
import p716zh.C31924g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class InAppNotiChatModuleView extends ModulesView {

    /* renamed from: W */
    public static final int f64801W;

    /* renamed from: a0 */
    public static final int f64802a0;

    /* renamed from: b0 */
    public static final int f64803b0;

    /* renamed from: c0 */
    public static final int f64804c0;

    /* renamed from: K */
    C23528a f64805K;

    /* renamed from: L */
    C7027c3 f64806L;

    /* renamed from: M */
    C16716d f64807M;

    /* renamed from: N */
    C22129e f64808N;

    /* renamed from: O */
    C16716d f64809O;

    /* renamed from: P */
    C22126c0 f64810P;

    /* renamed from: Q */
    C21693c f64811Q;

    /* renamed from: R */
    C22126c0 f64812R;

    /* renamed from: S */
    C16716d f64813S;

    /* renamed from: T */
    ContactProfile f64814T;

    /* renamed from: U */
    C22126c0 f64815U;

    /* renamed from: V */
    C16716d f64816V;

    /* renamed from: com.zing.zalo.ui.moduleview.inappnoti.InAppNotiChatModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12418a {
        /* renamed from: a */
        void mo69756a(ContactProfile contactProfile);

        /* renamed from: c2 */
        void mo69757c2(String str, int i11);
    }

    static {
        int i11 = AbstractC23222t7.f112562h;
        f64801W = i11;
        f64802a0 = i11;
        f64803b0 = i11;
        f64804c0 = i11;
    }

    public InAppNotiChatModuleView(Context context, C23528a c23528a, C7027c3 c7027c3) {
        super(context);
        this.f64805K = c23528a;
        this.f64806L = c7027c3;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64807M = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89048d0(f64801W).m89044a0(f64802a0).m89046b0(f64803b0).m89047c0(f64804c0);
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_S));
        this.f64808N = c22129e;
        C16718f m89027K = c22129e.m89106L().m89027K(true);
        Boolean bool = Boolean.TRUE;
        m89027K.m89073z(bool).m89035S(AbstractC23136l9.m118742r(6.0f));
        C16716d c16716d2 = new C16716d(context);
        this.f64816V = c16716d2;
        c16716d2.m89106L().m89017A(bool).m89027K(true).m89028L(-2, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64815U = c22126c0;
        c22126c0.m89106L().m89028L(-2, -2).m89017A(bool).m89029M(2).m89027K(true).m89042Z(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(5.0f));
        AbstractC23022b5.m118023a(this.f64815U, AbstractC8915g0.btnType2_medium);
        this.f64815U.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64815U.m111958F1(AbstractC8020f0.str_msg_callback);
        this.f64816V.m89001g1(this.f64815U);
        C16716d c16716d3 = new C16716d(context);
        this.f64809O = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89054h0(this.f64808N).m89049e0(this.f64816V).m89027K(true);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64810P = c22126c02;
        c22126c02.m89106L().m89028L(-2, -2).m89073z(bool);
        this.f64810P.mo111965M1(1);
        this.f64810P.m111953A1(1);
        this.f64810P.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        C22126c0 c22126c03 = this.f64810P;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        C16716d c16716d4 = new C16716d(context);
        this.f64813S = c16716d4;
        c16716d4.m89106L().m89028L(-1, -2).m89023G(this.f64810P).m89073z(bool);
        C21693c c21693c = new C21693c(context);
        this.f64811Q = c21693c;
        c21693c.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.im_downloadfile));
        this.f64811Q.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(4.0f)).m89027K(true).m89073z(bool);
        this.f64813S.m89001g1(this.f64811Q);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64812R = c22126c04;
        c22126c04.mo111965M1(0);
        this.f64812R.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64812R.m111953A1(1);
        this.f64812R.m111980v1(truncateAt);
        this.f64812R.m89106L().m89028L(-2, -2).m89056i0(new C20003a(this.f64811Q)).m89027K(true);
        this.f64813S.m89001g1(this.f64812R);
        this.f64809O.m89001g1(this.f64810P);
        this.f64809O.m89001g1(this.f64813S);
        this.f64807M.m89001g1(this.f64808N);
        this.f64807M.m89001g1(this.f64816V);
        this.f64807M.m89001g1(this.f64809O);
        mo69681L(this.f64807M);
        m69754a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m69752X(String str, ContactProfile contactProfile, C16719g c16719g) {
        C7027c3 c7027c3 = this.f64806L;
        if (c7027c3 != null) {
            c7027c3.f38416t.mo69757c2(str, contactProfile.f42384V.f146662c.f91038a);
        }
    }

    /* renamed from: Y */
    private void m69753Y() {
        this.f64815U.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64810P.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f64812R.mo111964L1(AbstractC23136l9.m118742r(14.0f));
    }

    /* renamed from: a0 */
    private void m69754a0() {
        setBackground(C23212s8.m119609q(getContext(), AbstractC16781w.ChatBgBannerFileTransfer));
        this.f64815U.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.AppPrimaryColor));
        this.f64810P.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.ChatTextColor1));
        this.f64812R.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.ChatTextColor1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a0, code lost:            r1 = gw.C19669z.m103146Y().m103222h0();     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a8, code lost:            if (r1 <= 0) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01aa, code lost:            r2 = com.zing.zalo.AbstractC8020f0.cm_strangermsg_with_count;        r3 = new java.lang.Object[2];        r3[0] = java.lang.Integer.valueOf(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b5, code lost:            if (r1 <= 1) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b7, code lost:            r1 = com.zing.zalo.AbstractC8020f0.str_more_s;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01bc, code lost:            r3[1] = me0.AbstractC23136l9.m118743r0(r1);        r1 = me0.AbstractC23136l9.m118746s0(r2, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ba, code lost:            r1 = com.zing.zalo.AbstractC8020f0.str_single_form;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c7, code lost:            r1 = me0.AbstractC23136l9.m118743r0(com.zing.zalo.AbstractC8020f0.cm_strangermsg);     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022b A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:4:0x0009, B:7:0x0017, B:9:0x0021, B:11:0x002d, B:12:0x004e, B:13:0x0095, B:16:0x0104, B:18:0x010a, B:20:0x0112, B:21:0x0118, B:22:0x011e, B:24:0x0127, B:26:0x0135, B:28:0x0151, B:30:0x0173, B:34:0x0176, B:35:0x017b, B:40:0x018d, B:42:0x01a0, B:44:0x01aa, B:46:0x01b7, B:47:0x01bc, B:48:0x01ba, B:49:0x01c7, B:50:0x01cd, B:52:0x01e6, B:54:0x01ed, B:55:0x02dc, B:58:0x02ed, B:63:0x0204, B:65:0x020c, B:67:0x0210, B:76:0x023c, B:78:0x0242, B:80:0x024d, B:82:0x0255, B:83:0x0284, B:85:0x028a, B:86:0x025f, B:87:0x0269, B:89:0x0271, B:90:0x027b, B:91:0x029a, B:93:0x02a5, B:95:0x02ad, B:96:0x02b7, B:97:0x02c1, B:99:0x02c9, B:100:0x02d3, B:101:0x0221, B:104:0x022b, B:107:0x0035, B:108:0x007d, B:109:0x009c, B:111:0x00a2, B:112:0x00c0, B:114:0x00c6, B:115:0x00e5), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:4:0x0009, B:7:0x0017, B:9:0x0021, B:11:0x002d, B:12:0x004e, B:13:0x0095, B:16:0x0104, B:18:0x010a, B:20:0x0112, B:21:0x0118, B:22:0x011e, B:24:0x0127, B:26:0x0135, B:28:0x0151, B:30:0x0173, B:34:0x0176, B:35:0x017b, B:40:0x018d, B:42:0x01a0, B:44:0x01aa, B:46:0x01b7, B:47:0x01bc, B:48:0x01ba, B:49:0x01c7, B:50:0x01cd, B:52:0x01e6, B:54:0x01ed, B:55:0x02dc, B:58:0x02ed, B:63:0x0204, B:65:0x020c, B:67:0x0210, B:76:0x023c, B:78:0x0242, B:80:0x024d, B:82:0x0255, B:83:0x0284, B:85:0x028a, B:86:0x025f, B:87:0x0269, B:89:0x0271, B:90:0x027b, B:91:0x029a, B:93:0x02a5, B:95:0x02ad, B:96:0x02b7, B:97:0x02c1, B:99:0x02c9, B:100:0x02d3, B:101:0x0221, B:104:0x022b, B:107:0x0035, B:108:0x007d, B:109:0x009c, B:111:0x00a2, B:112:0x00c0, B:114:0x00c6, B:115:0x00e5), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:4:0x0009, B:7:0x0017, B:9:0x0021, B:11:0x002d, B:12:0x004e, B:13:0x0095, B:16:0x0104, B:18:0x010a, B:20:0x0112, B:21:0x0118, B:22:0x011e, B:24:0x0127, B:26:0x0135, B:28:0x0151, B:30:0x0173, B:34:0x0176, B:35:0x017b, B:40:0x018d, B:42:0x01a0, B:44:0x01aa, B:46:0x01b7, B:47:0x01bc, B:48:0x01ba, B:49:0x01c7, B:50:0x01cd, B:52:0x01e6, B:54:0x01ed, B:55:0x02dc, B:58:0x02ed, B:63:0x0204, B:65:0x020c, B:67:0x0210, B:76:0x023c, B:78:0x0242, B:80:0x024d, B:82:0x0255, B:83:0x0284, B:85:0x028a, B:86:0x025f, B:87:0x0269, B:89:0x0271, B:90:0x027b, B:91:0x029a, B:93:0x02a5, B:95:0x02ad, B:96:0x02b7, B:97:0x02c1, B:99:0x02c9, B:100:0x02d3, B:101:0x0221, B:104:0x022b, B:107:0x0035, B:108:0x007d, B:109:0x009c, B:111:0x00a2, B:112:0x00c0, B:114:0x00c6, B:115:0x00e5), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:4:0x0009, B:7:0x0017, B:9:0x0021, B:11:0x002d, B:12:0x004e, B:13:0x0095, B:16:0x0104, B:18:0x010a, B:20:0x0112, B:21:0x0118, B:22:0x011e, B:24:0x0127, B:26:0x0135, B:28:0x0151, B:30:0x0173, B:34:0x0176, B:35:0x017b, B:40:0x018d, B:42:0x01a0, B:44:0x01aa, B:46:0x01b7, B:47:0x01bc, B:48:0x01ba, B:49:0x01c7, B:50:0x01cd, B:52:0x01e6, B:54:0x01ed, B:55:0x02dc, B:58:0x02ed, B:63:0x0204, B:65:0x020c, B:67:0x0210, B:76:0x023c, B:78:0x0242, B:80:0x024d, B:82:0x0255, B:83:0x0284, B:85:0x028a, B:86:0x025f, B:87:0x0269, B:89:0x0271, B:90:0x027b, B:91:0x029a, B:93:0x02a5, B:95:0x02ad, B:96:0x02b7, B:97:0x02c1, B:99:0x02c9, B:100:0x02d3, B:101:0x0221, B:104:0x022b, B:107:0x0035, B:108:0x007d, B:109:0x009c, B:111:0x00a2, B:112:0x00c0, B:114:0x00c6, B:115:0x00e5), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:4:0x0009, B:7:0x0017, B:9:0x0021, B:11:0x002d, B:12:0x004e, B:13:0x0095, B:16:0x0104, B:18:0x010a, B:20:0x0112, B:21:0x0118, B:22:0x011e, B:24:0x0127, B:26:0x0135, B:28:0x0151, B:30:0x0173, B:34:0x0176, B:35:0x017b, B:40:0x018d, B:42:0x01a0, B:44:0x01aa, B:46:0x01b7, B:47:0x01bc, B:48:0x01ba, B:49:0x01c7, B:50:0x01cd, B:52:0x01e6, B:54:0x01ed, B:55:0x02dc, B:58:0x02ed, B:63:0x0204, B:65:0x020c, B:67:0x0210, B:76:0x023c, B:78:0x0242, B:80:0x024d, B:82:0x0255, B:83:0x0284, B:85:0x028a, B:86:0x025f, B:87:0x0269, B:89:0x0271, B:90:0x027b, B:91:0x029a, B:93:0x02a5, B:95:0x02ad, B:96:0x02b7, B:97:0x02c1, B:99:0x02c9, B:100:0x02d3, B:101:0x0221, B:104:0x022b, B:107:0x0035, B:108:0x007d, B:109:0x009c, B:111:0x00a2, B:112:0x00c0, B:114:0x00c6, B:115:0x00e5), top: B:3:0x0009 }] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m69755W(C7027c3.b bVar) {
        Spanned fromHtml;
        boolean z11;
        boolean z12;
        C31924g1 c31924g1;
        int hashCode;
        char c11;
        String str;
        String str2;
        final ContactProfile contactProfile = bVar.f38418b;
        this.f64814T = contactProfile;
        AbstractC19646n0.m103016p2(contactProfile);
        if (contactProfile != null) {
            try {
                final String str3 = contactProfile.f42434r;
                int i11 = 0;
                if (contactProfile.m40374K0()) {
                    if (!TextUtils.isEmpty(contactProfile.m40396a0())) {
                        if (contactProfile.m40396a0().length() < 25) {
                            str2 = contactProfile.m40396a0();
                        } else {
                            str2 = contactProfile.m40396a0().substring(0, 25) + "...";
                        }
                        str = "<b>" + str2 + "</b> " + AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_app_noti_chat_msg_send) + " <b>" + contactProfile.f42437s.trim() + "</b>";
                    } else {
                        str = "<b>" + contactProfile.f42437s.trim() + "</b>";
                    }
                    fromHtml = Html.fromHtml(str);
                } else {
                    if (AbstractC25495a.m132081f(str3)) {
                        fromHtml = Html.fromHtml("<b>" + AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title) + "</b>");
                        z11 = true;
                        z12 = false;
                        if (!TextUtils.isEmpty(fromHtml)) {
                            if (contactProfile.f42399a1.isEmpty()) {
                                this.f64810P.m111959G1(fromHtml);
                            } else {
                                SpannableString spannableString = new SpannableString(fromHtml);
                                for (int i12 = 0; i12 < contactProfile.f42399a1.size() - 1; i12 += 2) {
                                    if (((Integer) contactProfile.f42399a1.get(i12)).intValue() >= 0) {
                                        int i13 = i12 + 1;
                                        if (((Integer) contactProfile.f42399a1.get(i13)).intValue() > ((Integer) contactProfile.f42399a1.get(i12)).intValue()) {
                                            spannableString.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i12)).intValue(), ((Integer) contactProfile.f42399a1.get(i13)).intValue(), 33);
                                        }
                                    }
                                }
                                this.f64810P.m111959G1(spannableString);
                            }
                        }
                        this.f64808N.m115433q1(contactProfile);
                        CharSequence charSequence = "";
                        if (!contactProfile.m40379N0()) {
                            if (!z11 && !z12) {
                                charSequence = C28652r.m143349v().m143357H(AbstractC23244v8.m119734D(contactProfile.m40378N()));
                            }
                        }
                        this.f64812R.m111959G1(charSequence);
                        this.f64816V.mo44614b1(8);
                        this.f64811Q.mo44614b1(8);
                        if (contactProfile.m40432u0() != 22 && contactProfile.m40393X() == 4) {
                            this.f64812R.mo44614b1(0);
                            this.f64811Q.mo44614b1(0);
                            this.f64812R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_downloading));
                        } else if (contactProfile.m40432u0() == 12 && (c31924g1 = contactProfile.f42384V) != null) {
                            String str4 = c31924g1.f146660a;
                            hashCode = str4.hashCode();
                            if (hashCode == -2138772447) {
                                if (hashCode == -1103456014 && str4.equals("recommened.calltime")) {
                                    c11 = 0;
                                    if (c11 == 0) {
                                        if (c11 == 1 && contactProfile.f42384V.f146662c != null) {
                                            this.f64811Q.mo44614b1(0);
                                            if (contactProfile.m40377M0()) {
                                                if (contactProfile.f42384V.f146662c.f91038a == 0) {
                                                    this.f64811Q.mo111925v1(AbstractC11531v0.m62310q2());
                                                } else {
                                                    this.f64811Q.mo111925v1(AbstractC11531v0.m62177N2());
                                                }
                                            } else if (contactProfile.f42384V.f146662c.f91038a == 0) {
                                                this.f64811Q.mo111925v1(AbstractC11531v0.m62315r2());
                                            } else {
                                                this.f64811Q.mo111925v1(AbstractC11531v0.m62182O2());
                                            }
                                            if (AbstractC23309i.m121195Me() != 0) {
                                                this.f64816V.mo44614b1(0);
                                                this.f64815U.mo89109M0(new C16719g.c() { // from class: j80.a
                                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                                    /* renamed from: y */
                                                    public final void mo929y(C16719g c16719g) {
                                                        InAppNotiChatModuleView.this.m69752X(str3, contactProfile, c16719g);
                                                    }
                                                });
                                            }
                                        }
                                    } else {
                                        this.f64811Q.mo44614b1(0);
                                        if (contactProfile.m40377M0()) {
                                            if (contactProfile.f42384V.f146662c.f91038a == 0) {
                                                this.f64811Q.mo111925v1(AbstractC11531v0.m62325t2());
                                            } else {
                                                this.f64811Q.mo111925v1(AbstractC11531v0.m62190Q2());
                                            }
                                        } else if (contactProfile.f42384V.f146662c.f91038a == 0) {
                                            this.f64811Q.mo111925v1(AbstractC11531v0.m62320s2());
                                        } else {
                                            this.f64811Q.mo111925v1(AbstractC11531v0.m62186P2());
                                        }
                                    }
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                            } else {
                                if (str4.equals("recommened.misscall")) {
                                    c11 = 1;
                                    if (c11 == 0) {
                                    }
                                }
                                c11 = 65535;
                                if (c11 == 0) {
                                }
                            }
                        }
                        C16716d c16716d = this.f64813S;
                        if (TextUtils.isEmpty(this.f64812R.m111973m1())) {
                            i11 = 8;
                        }
                        c16716d.mo44614b1(i11);
                        m69754a0();
                        m69753Y();
                    }
                    if (AbstractC25495a.m132084i(str3)) {
                        fromHtml = Html.fromHtml("<b>" + AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg) + "</b>");
                        z11 = false;
                        z12 = true;
                        if (!TextUtils.isEmpty(fromHtml)) {
                        }
                        this.f64808N.m115433q1(contactProfile);
                        CharSequence charSequence2 = "";
                        if (!contactProfile.m40379N0()) {
                        }
                        this.f64812R.m111959G1(charSequence2);
                        this.f64816V.mo44614b1(8);
                        this.f64811Q.mo44614b1(8);
                        if (contactProfile.m40432u0() != 22) {
                        }
                        if (contactProfile.m40432u0() == 12) {
                            String str42 = c31924g1.f146660a;
                            hashCode = str42.hashCode();
                            if (hashCode == -2138772447) {
                            }
                        }
                        C16716d c16716d2 = this.f64813S;
                        if (TextUtils.isEmpty(this.f64812R.m111973m1())) {
                        }
                        c16716d2.mo44614b1(i11);
                        m69754a0();
                        m69753Y();
                    }
                    fromHtml = Html.fromHtml("<b>" + contactProfile.m40383Q(true, false).trim() + "</b>");
                }
                z11 = false;
                z12 = false;
                if (!TextUtils.isEmpty(fromHtml)) {
                }
                this.f64808N.m115433q1(contactProfile);
                CharSequence charSequence22 = "";
                if (!contactProfile.m40379N0()) {
                }
                this.f64812R.m111959G1(charSequence22);
                this.f64816V.mo44614b1(8);
                this.f64811Q.mo44614b1(8);
                if (contactProfile.m40432u0() != 22) {
                }
                if (contactProfile.m40432u0() == 12) {
                }
                C16716d c16716d22 = this.f64813S;
                if (TextUtils.isEmpty(this.f64812R.m111973m1())) {
                }
                c16716d22.mo44614b1(i11);
                m69754a0();
                m69753Y();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
