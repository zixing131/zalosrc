package iq;

import ac.C0708i;
import ac.C0732w;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import ap0.C2279a;
import au.C2343e;
import b40.C2526d;
import bo.AbstractC3035s0;
import bo.C2955c0;
import bo.C2961d1;
import bo.C2966e1;
import bo.C2977g2;
import bo.C2983h3;
import bo.C2991j1;
import bo.C2993j3;
import bo.C3000l0;
import bo.C3001l1;
import bo.C3003l3;
import bo.C3010n0;
import bo.C3019p;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3032r2;
import bo.C3037s2;
import bo.C3038t;
import bo.C3041t2;
import bo.C3042u;
import bo.C3050w;
import bo.C3054x;
import ck.C3563d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.feed.components.ProfileMusicView;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPrivacyQuickSetting;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.zviews.GroupInCommonView;
import com.zing.zalo.p077ui.zviews.TagsListView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoBioView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import fi.C18953k;
import gi.EnumC19448a;
import gi.EnumC19450c;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19637j;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import io.C20637a;
import iq.C20765w2;
import is.AbstractC20805l;
import is.AbstractC20826v0;
import is.C20785b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import l30.AbstractC22055v0;
import l30.C22012a;
import l30.C22013a0;
import l30.C22014b;
import l30.C22021e0;
import me0.AbstractC23028c0;
import me0.AbstractC23047d8;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mv.InterfaceC23448a;
import mz.C23493c;
import org.json.JSONArray;
import org.json.JSONObject;
import p055ce.C3432a;
import p056cj.C3535c;
import p111du.AbstractC18069a;
import p142ey.C18631a;
import p142ey.C18644n;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p302ko.C21785g;
import p303kq.C21909a;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21914b;
import p304ks.C21920f;
import p304ks.C21927m;
import p304ks.C21929o;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p368nq.C23927b;
import p398oo.C24346a;
import p398oo.C24355e0;
import p425po.C24880b;
import p426pp.C24902e;
import p426pp.C24903f;
import p444qd.C25231i;
import p456qp.C25453e;
import p458qr.C25470c;
import p492rr.C25973p;
import p604wb.C28905e;
import p617wp.C29186c;
import p683yj.C30997b;
import p716zh.C31862c;
import p716zh.C31874cb;
import p716zh.C31901e8;
import p716zh.C31902e9;
import p716zh.C31917f9;
import p716zh.C31965ic;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32020m7;
import p716zh.C32035n7;
import p716zh.C32065p8;
import sx.C26406h;
import t00.C26446c;
import vg.AbstractC28025b8;
import vg.C28011a4;
import vg.C28023b6;
import vg.C28203u6;
import vg.C28212v6;
import wd0.C28927g;

/* renamed from: iq.w2 */
/* loaded from: classes4.dex */
public class C20765w2 extends AbstractC20677f implements InterfaceC20653a2 {

    /* renamed from: L1 */
    static final String f101938L1 = "w2";

    /* renamed from: A0 */
    String f101939A0;

    /* renamed from: A1 */
    public boolean f101940A1;

    /* renamed from: B0 */
    String f101941B0;

    /* renamed from: B1 */
    public boolean f101942B1;

    /* renamed from: C0 */
    String f101943C0;

    /* renamed from: C1 */
    private String f101944C1;

    /* renamed from: D0 */
    String f101945D0;

    /* renamed from: D1 */
    private final C18953k.c f101946D1;

    /* renamed from: E0 */
    int f101947E0;

    /* renamed from: E1 */
    private C31917f9 f101948E1;

    /* renamed from: F0 */
    public C24902e f101949F0;

    /* renamed from: F1 */
    boolean f101950F1;

    /* renamed from: G0 */
    public C24903f f101951G0;

    /* renamed from: G1 */
    private final AtomicBoolean f101952G1;

    /* renamed from: H0 */
    private C8050a.d0 f101953H0;

    /* renamed from: H1 */
    MultiStateView.EnumC15914e f101954H1;

    /* renamed from: I0 */
    String f101955I0;

    /* renamed from: I1 */
    private int f101956I1;

    /* renamed from: J0 */
    private boolean f101957J0;

    /* renamed from: J1 */
    private boolean f101958J1;

    /* renamed from: K0 */
    private int f101959K0;

    /* renamed from: K1 */
    boolean f101960K1;

    /* renamed from: L0 */
    private final int f101961L0;

    /* renamed from: M0 */
    C24880b f101962M0;

    /* renamed from: N0 */
    ContactProfile f101963N0;

    /* renamed from: O0 */
    boolean f101964O0;

    /* renamed from: P0 */
    C3032r2 f101965P0;

    /* renamed from: Q */
    InterfaceC20659b2 f101966Q;

    /* renamed from: Q0 */
    C3041t2 f101967Q0;

    /* renamed from: R */
    String f101968R;

    /* renamed from: R0 */
    C3037s2 f101969R0;

    /* renamed from: S */
    boolean f101970S;

    /* renamed from: S0 */
    InterfaceC20094a f101971S0;

    /* renamed from: T */
    boolean f101972T;

    /* renamed from: T0 */
    boolean f101973T0;

    /* renamed from: U */
    boolean f101974U;

    /* renamed from: U0 */
    boolean f101975U0;

    /* renamed from: V */
    int f101976V;

    /* renamed from: V0 */
    boolean f101977V0;

    /* renamed from: W */
    C32002l4 f101978W;

    /* renamed from: W0 */
    boolean f101979W0;

    /* renamed from: X */
    String f101980X;

    /* renamed from: X0 */
    InterfaceC20094a f101981X0;

    /* renamed from: Y */
    boolean f101982Y;

    /* renamed from: Y0 */
    boolean f101983Y0;

    /* renamed from: Z */
    int f101984Z;

    /* renamed from: Z0 */
    InterfaceC20094a f101985Z0;

    /* renamed from: a0 */
    ContactProfile f101986a0;

    /* renamed from: a1 */
    String f101987a1;

    /* renamed from: b0 */
    boolean f101988b0;

    /* renamed from: b1 */
    boolean f101989b1;

    /* renamed from: c0 */
    boolean f101990c0;

    /* renamed from: c1 */
    boolean f101991c1;

    /* renamed from: d0 */
    String f101992d0;

    /* renamed from: d1 */
    boolean f101993d1;

    /* renamed from: e0 */
    boolean f101994e0;

    /* renamed from: e1 */
    InterfaceC20094a f101995e1;

    /* renamed from: f0 */
    boolean f101996f0;

    /* renamed from: f1 */
    boolean f101997f1;

    /* renamed from: g0 */
    boolean f101998g0;

    /* renamed from: g1 */
    InterfaceC20094a f101999g1;

    /* renamed from: h0 */
    boolean f102000h0;

    /* renamed from: h1 */
    boolean f102001h1;

    /* renamed from: i0 */
    boolean f102002i0;

    /* renamed from: i1 */
    boolean f102003i1;

    /* renamed from: j0 */
    boolean f102004j0;

    /* renamed from: j1 */
    boolean f102005j1;

    /* renamed from: k0 */
    boolean f102006k0;

    /* renamed from: k1 */
    InterfaceC20094a f102007k1;

    /* renamed from: l0 */
    boolean f102008l0;

    /* renamed from: l1 */
    ContactProfile f102009l1;

    /* renamed from: m0 */
    boolean f102010m0;

    /* renamed from: m1 */
    String f102011m1;

    /* renamed from: n0 */
    boolean f102012n0;

    /* renamed from: n1 */
    boolean f102013n1;

    /* renamed from: o0 */
    boolean f102014o0;

    /* renamed from: o1 */
    boolean f102015o1;

    /* renamed from: p0 */
    boolean f102016p0;

    /* renamed from: p1 */
    InterfaceC20094a f102017p1;

    /* renamed from: q0 */
    int f102018q0;

    /* renamed from: q1 */
    public boolean f102019q1;

    /* renamed from: r0 */
    String f102020r0;

    /* renamed from: r1 */
    String f102021r1;

    /* renamed from: s0 */
    String f102022s0;

    /* renamed from: s1 */
    InterfaceC20094a f102023s1;

    /* renamed from: t0 */
    int f102024t0;

    /* renamed from: t1 */
    boolean f102025t1;

    /* renamed from: u0 */
    int f102026u0;

    /* renamed from: u1 */
    InterfaceC20094a f102027u1;

    /* renamed from: v0 */
    long f102028v0;

    /* renamed from: v1 */
    boolean f102029v1;

    /* renamed from: w0 */
    boolean f102030w0;

    /* renamed from: w1 */
    boolean f102031w1;

    /* renamed from: x0 */
    boolean f102032x0;

    /* renamed from: x1 */
    boolean f102033x1;

    /* renamed from: y0 */
    int f102034y0;

    /* renamed from: y1 */
    C3563d f102035y1;

    /* renamed from: z0 */
    boolean f102036z0;

    /* renamed from: z1 */
    InterfaceC20094a f102037z1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f102038a;

        /* renamed from: iq.w2$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C32845a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f102040a;

            /* renamed from: b */
            final /* synthetic */ boolean f102041b;

            C32845a(ContactProfile contactProfile, boolean z11) {
                this.f102040a = contactProfile;
                this.f102041b = z11;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20765w2.this.f101652A.mo112401W(this.f102040a, this.f102041b);
                a aVar = a.this;
                C20765w2.this.f101652A.mo112403b(aVar.f102038a.f42434r);
            }
        }

        a(ContactProfile contactProfile) {
            this.f102038a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108353d() {
            AbstractC23088h5.m118426g();
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102010m0 = !c20765w2.f102010m0;
            c20765w2.m108295Or(c20765w2.f101968R);
            if (C20765w2.this.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.add_to_ignore_list));
            }
            C20765w2.this.m108297Ot();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C20765w2.this.f101966Q.mo49315c4();
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.m89259g(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            int optInt;
            try {
                try {
                    jSONObject = (JSONObject) obj;
                    new JSONObject();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (jSONObject.has("data") && (optInt = new JSONObject(jSONObject.getString("data")).optInt("code", -1000)) != 0) {
                    ToastUtils.m89259g(optInt);
                    return;
                }
                boolean m114558y = AbstractC21935u.m114558y(this.f102038a.f42434r);
                ContactProfile m98552o = C18644n.m98531l().m98552o(this.f102038a.f42434r);
                if (m98552o == null) {
                    m98552o = C28203u6.f131407a.m141809c(this.f102038a.f42434r);
                }
                if (m98552o == null) {
                    m98552o = this.f102038a;
                }
                C0824j.m2153b(new C32845a(m98552o, m114558y));
                C28203u6.f131407a.m141824w(m98552o);
                C21927m.m114302u().m114350o0(this.f102038a.f42434r);
                if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f102038a.f42434r)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(Integer.parseInt(this.f102038a.f42434r)));
                    C21927m.m114302u().m114338i0(arrayList);
                }
                C19669z.m103146Y().m103198O0();
                if (m114558y) {
                    C18644n.m98524E();
                }
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.v2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.a.this.m108353d();
                    }
                });
            } finally {
                C20765w2.this.f101966Q.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$a0 */
    /* loaded from: classes4.dex */
    public class a0 implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f102043a;

        a0(String str) {
            this.f102043a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m108356e() {
            C20765w2.this.f101966Q.onResume();
            C20765w2.this.m108218Pt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m108357f() {
            C20765w2.this.f101966Q.onResume();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (C18644n.m98531l().m98558u(this.f102043a)) {
                AbstractC23063f2.m118363o(this.f102043a);
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
            } else {
                ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_with_code), Integer.valueOf(c20096c.m104491c())));
            }
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f101991c1 = false;
            c20765w2.f101966Q.mo78960q3();
            C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.v3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.a0.this.m108357f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (C18644n.m98531l().m98558u(this.f102043a)) {
                    AbstractC23063f2.m118363o(this.f102043a);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                } else {
                    JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int optInt = optJSONArray.optJSONObject(0).optInt("errorCode");
                        if (optInt == 0) {
                            AbstractC23063f2.m118363o(this.f102043a);
                            C21920f.m114270a().m114273d(this.f102043a);
                        } else if (optInt == -47) {
                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.error_undo_friend_request), Integer.valueOf(optInt)));
                        } else {
                            ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message_with_code), Integer.valueOf(optInt)));
                        }
                    }
                }
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.w3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.a0.this.m108356e();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f101991c1 = false;
            c20765w2.f101966Q.mo78960q3();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: iq.w2$b$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f102046a;

            a(ContactProfile contactProfile) {
                this.f102046a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20765w2.this.f101652A.mo112399U(this.f102046a);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108359d(boolean z11) {
            try {
                C20765w2.this.m108301Rr();
                C20765w2.this.f101966Q.mo82925B4();
                C20765w2.this.m108297Ot();
                C20765w2.this.f101966Q.mo82218f5();
                if (z11) {
                    C20765w2.this.m108349ys();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (C20765w2.this.f101966Q.mo45894h0()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101993d1 = false;
                c20765w2.f101966Q.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    int i12 = -1000;
                    final boolean z11 = true;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && (i12 = jSONObject.optInt("error_code", -1000)) == 0) {
                        if (jSONObject.has("data") && !jSONObject.isNull("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                            i11 = optJSONObject.optInt("action", 0);
                            str = optJSONObject.optString("alias");
                            str2 = optJSONObject.optString("desc");
                        } else {
                            str = "";
                            str2 = "";
                            i11 = 0;
                        }
                        C20765w2 c20765w2 = C20765w2.this;
                        ContactProfile contactProfile = c20765w2.f101963N0;
                        if (contactProfile != null) {
                            contactProfile.f42447v0 = contactProfile.f42352K0;
                        } else {
                            contactProfile = C28203u6.f131407a.m141809c(c20765w2.f101968R);
                        }
                        if (contactProfile == null) {
                            return;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(C20765w2.this.f101968R)) {
                            contactProfile.f42438s0 = ((C31965ic) map.get(C20765w2.this.f101968R)).m153681a();
                        }
                        contactProfile.f42441t0 = true;
                        contactProfile.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str)) {
                            contactProfile.f42442t1 = str;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            contactProfile.f42436r1 = new SpannableStringBuilder(str2);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(C20765w2.this.f101968R)) {
                                C21927m.m114302u().m114357s().add(contactProfile);
                                C0824j.m2153b(new a(contactProfile));
                            } else if (C21927m.m114302u().m114357s().m153138j(C20765w2.this.f101968R) != null) {
                                contactProfile = C21927m.m114302u().m114357s().m153138j(C20765w2.this.f101968R);
                                contactProfile.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str)) {
                                    contactProfile.f42442t1 = str;
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    contactProfile.f42436r1 = new SpannableStringBuilder(str2);
                                }
                            }
                        }
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                            AbstractC23181q.m119431d(contactProfile.f42434r, true);
                        }
                    }
                    C20765w2 c20765w22 = C20765w2.this;
                    c20765w22.f101993d1 = false;
                    if (i12 != 0) {
                        z11 = false;
                    }
                    c20765w22.f101966Q.mo70710wy(new Runnable() { // from class: iq.x2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.b.this.m108359d(z11);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C20765w2 c20765w23 = C20765w2.this;
                c20765w23.f101993d1 = false;
                c20765w23.f101966Q.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$b0 */
    /* loaded from: classes4.dex */
    public class b0 implements C25453e.a {

        /* renamed from: a */
        final /* synthetic */ String f102048a;

        b0(String str) {
            this.f102048a = str;
        }

        @Override // p456qp.C25453e.a
        /* renamed from: a */
        public void mo87822a(String str, Exception exc) {
            int i11;
            try {
                if (TextUtils.equals(str, this.f102048a)) {
                    int m44477c = ProfileMusicView.m44477c(exc);
                    C20765w2 c20765w2 = C20765w2.this;
                    if (m44477c == 700) {
                        i11 = 0;
                    } else {
                        i11 = 3;
                    }
                    c20765w2.m108270pt(i11, m44477c);
                    C20765w2.this.m108271qt(false);
                    C20765w2.this.m108290Kt(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p456qp.C25453e.a
        /* renamed from: b */
        public void mo87823b(C24902e c24902e, C24903f c24903f) {
            if (c24902e != null) {
                try {
                    if (TextUtils.equals(this.f102048a, c24902e.m129490f())) {
                        C20765w2 c20765w2 = C20765w2.this;
                        c20765w2.f101949F0 = c24902e;
                        c20765w2.f101951G0 = c24903f;
                        c20765w2.m108270pt(1, 200);
                        C20765w2 c20765w22 = C20765w2.this;
                        c20765w22.m108271qt(c20765w22.m107783jq(c20765w22.f101949F0));
                        C20765w2.this.m107794zq(false);
                        C20765w2.this.m108211Mr();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // p456qp.C25453e.a
        /* renamed from: c */
        public void mo87824c(Job job) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: iq.w2$c$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101652A.mo112405c0(c20765w2.f101968R);
                C20765w2 c20765w22 = C20765w2.this;
                c20765w22.f101652A.mo112417p0(c20765w22.f101968R);
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108361d() {
            try {
                C20765w2.this.m108301Rr();
                C20765w2.this.f101966Q.mo82925B4();
                C20765w2.this.m108297Ot();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (C20765w2.this.f101966Q.mo45894h0()) {
                        ToastUtils.m89264l(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101997f1 = false;
                c20765w2.f101966Q.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data")) {
                        int optInt = jSONObject.optInt("error_code", -1000);
                        if (optInt == 0) {
                            C21927m.m114302u().m114342k0(C20765w2.this.f101968R);
                            AbstractC23306f.m120616S().m101508a(new C28927g.b(C20765w2.this.f101968R));
                            C0824j.m2153b(new a());
                            Map map = AbstractC23304d.f113405l;
                            C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                            if (c31965ic != null) {
                                int m153681a = c31965ic.m153681a();
                                if (m153681a > 0) {
                                    m153681a--;
                                }
                                ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(m153681a);
                            }
                            if (!TextUtils.isEmpty(C20765w2.this.f101968R)) {
                                AbstractC23181q.m119431d(C20765w2.this.f101968R, false);
                            }
                        } else if (C20765w2.this.f101966Q.mo45894h0()) {
                            ToastUtils.m89264l(new C20096c(optInt, AbstractC23161o1.m119318c(optInt, "")));
                        }
                    }
                    C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.y2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.c.this.m108361d();
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101997f1 = false;
                c20765w2.f101966Q.mo49315c4();
            } catch (Throwable th2) {
                C20765w2 c20765w22 = C20765w2.this;
                c20765w22.f101997f1 = false;
                c20765w22.f101966Q.mo49315c4();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$c0 */
    /* loaded from: classes4.dex */
    public class c0 implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f102052a;

        /* renamed from: iq.w2$c0$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                c0 c0Var = c0.this;
                C20765w2.this.f101652A.mo112397S(c0Var.f102052a.f42434r, 0);
                c0 c0Var2 = c0.this;
                C20765w2.this.f101652A.mo112403b(c0Var2.f102052a.f42434r);
            }
        }

        /* renamed from: iq.w2$c0$b */
        /* loaded from: classes4.dex */
        class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f102055a;

            b(ContactProfile contactProfile) {
                this.f102055a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                ContactProfile contactProfile = this.f102055a;
                if (contactProfile != null) {
                    C20765w2.this.f101652A.mo112423x0(contactProfile, true);
                }
                c0 c0Var = c0.this;
                C20765w2.this.f101652A.mo112397S(c0Var.f102052a.f42434r, 0);
            }
        }

        c0(ContactProfile contactProfile) {
            this.f102052a = contactProfile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m108365f(int i11) {
            ToastUtils.m89277y(C20765w2.this.f101966Q.mo82987k(), AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i11)), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m108366g() {
            try {
                AbstractC23088h5.m118426g();
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f102010m0 = !c20765w2.f102010m0;
                c20765w2.m108295Or(c20765w2.f101968R);
                C20765w2.this.m108297Ot();
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.m89277y(C20765w2.this.f101966Q.mo82987k(), AbstractC23136l9.m118743r0(AbstractC8020f0.msg_update_success), true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m108367h(C20096c c20096c) {
            int i11;
            if (c20096c != null) {
                i11 = c20096c.m104491c();
            } else {
                i11 = -1000;
            }
            if (C20765w2.this.f101966Q.mo45894h0()) {
                if (i11 == 50001) {
                    ToastUtils.m89277y(C20765w2.this.f101966Q.mo82987k(), c20096c.m104492d(), false);
                } else {
                    ToastUtils.m89277y(C20765w2.this.f101966Q.mo82987k(), AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_unknown, Integer.valueOf(i11)), false);
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                C20765w2.this.f101966Q.mo49315c4();
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.x3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.c0.this.m108367h(c20096c);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            final int parseInt;
            try {
                try {
                    jSONObject = (JSONObject) obj;
                    new JSONObject();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (jSONObject.has("data") && (parseInt = Integer.parseInt(new JSONObject(jSONObject.getString("data")).getString("code"))) != 0) {
                    C20765w2.this.f101966Q.mo49315c4();
                    C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.y3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.c0.this.m108365f(parseInt);
                        }
                    });
                    return;
                }
                boolean m114552s = AbstractC21935u.m114552s(false, this.f102052a.f42434r);
                C28203u6 c28203u6 = C28203u6.f131407a;
                ContactProfile m141809c = c28203u6.m141809c(this.f102052a.f42434r);
                if (m141809c == null) {
                    m141809c = this.f102052a;
                }
                if (m114552s) {
                    C0824j.m2153b(new a());
                } else {
                    C0824j.m2153b(new b(m141809c));
                    c28203u6.m141804B(this.f102052a.f42434r, 0);
                }
                C21927m.m114302u().m114354q0(this.f102052a.f42434r);
                C19669z.m103146Y().m103198O0();
                if (m114552s) {
                    C18644n.m98524E();
                }
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.z3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.c0.this.m108366g();
                    }
                });
            } finally {
                C20765w2.this.f101966Q.mo49315c4();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f102057a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: iq.w2$d$a */
        /* loaded from: classes4.dex */
        public class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f102059a;

            a(ContactProfile contactProfile) {
                this.f102059a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20765w2.this.f101652A.mo112403b(this.f102059a.f42434r);
            }
        }

        d(boolean z11) {
            this.f102057a = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m108375j(Bundle bundle, boolean z11) {
            C20765w2.this.f101966Q.mo86281qz(bundle, !z11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m108376k() {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.m108295Or(c20765w2.f101968R);
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                }
                C20765w2.this.f101966Q.mo82218f5();
                AbstractC23074g2.m118375a(0, C20765w2.this.f101968R, "", 6);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m108377l() {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.m108295Or(c20765w2.f101968R);
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_alreadyFriend));
                }
                ContactProfile contactProfile = C20765w2.this.f101963N0;
                if (contactProfile != null && !AbstractC21935u.m114558y(contactProfile.f42434r)) {
                    ContactProfile contactProfile2 = C20765w2.this.f101963N0;
                    C18644n.m98531l().m98543e(C20765w2.this.f101963N0);
                    C0824j.m2153b(new a(contactProfile2));
                    C18644n.m98524E();
                }
                C20765w2.this.f101966Q.mo82218f5();
                AbstractC23074g2.m118375a(0, C20765w2.this.f101968R, "", 6);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m108378m() {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f101966Q.mo86232QB(c20765w2.m108308Yr(15));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m108379n() {
            C20765w2.this.m108302Rt(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m108380o() {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f101966Q.mo86232QB(c20765w2.m108308Yr(23));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m108381p() {
            C20765w2.this.f101966Q.mo78960q3();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f102001h1 = false;
                c20765w2.f101966Q.mo49315c4();
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC20659b2 interfaceC20659b2;
            Runnable runnable;
            boolean z11;
            C20765w2 c20765w2;
            int i11;
            int i12;
            int i13;
            C20765w2.this.f102001h1 = false;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    z11 = true;
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
                        int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                        int optInt2 = jSONObject2.optInt("ranking", 0);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(C20765w2.this.f101963N0.f42434r)) {
                                        if (this.f102057a && !AbstractC21935u.m114553t(6)) {
                                            C20765w2 c20765w22 = C20765w2.this;
                                            ContactProfile contactProfile = c20765w22.f102009l1;
                                            c20765w22.m108278At(contactProfile.f42434r, contactProfile.f42373R0);
                                            z11 = false;
                                        } else {
                                            final Bundle bundle = new Bundle();
                                            bundle.putString("uid", C20765w2.this.f101963N0.f42434r);
                                            bundle.putString("dpn", C20765w2.this.f101963N0.f42437s);
                                            bundle.putString("avatar", C20765w2.this.f101963N0.f42446v);
                                            bundle.putInt("inviteFrom", 2);
                                            C20765w2 c20765w23 = C20765w2.this;
                                            if (c20765w23.f101968R.equals(c20765w23.f101963N0.f42434r)) {
                                                if (TextUtils.isEmpty(C20765w2.this.f101963N0.f42455y) && !TextUtils.isEmpty(C20765w2.this.f101980X)) {
                                                    bundle.putString("phone", C20765w2.this.f101980X);
                                                } else if (!TextUtils.isEmpty(C20765w2.this.f101963N0.f42455y)) {
                                                    bundle.putString("phone", C20765w2.this.f101963N0.f42455y);
                                                }
                                            }
                                            InterfaceC20659b2 interfaceC20659b22 = C20765w2.this.f101966Q;
                                            final boolean z12 = this.f102057a;
                                            interfaceC20659b22.mo70710wy(new Runnable() { // from class: iq.z2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C20765w2.d.this.m108375j(bundle, z12);
                                                }
                                            });
                                        }
                                    } else {
                                        C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.a3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C20765w2.d.this.m108376k();
                                            }
                                        });
                                    }
                                } else if (i12 == 1) {
                                    C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.b3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C20765w2.d.this.m108377l();
                                        }
                                    });
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(C20765w2.this.f101986a0.f42434r);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(C20765w2.this.f101986a0.f42434r, optInt2);
                                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.c3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C20765w2.d.this.m108378m();
                                    }
                                });
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C20765w2.this.f102009l1);
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23074g2.m118375a(0, C20765w2.this.f101968R, "", 6);
                                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.d3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C20765w2.d.this.m108379n();
                                    }
                                });
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(C20765w2.this.f101966Q.mo82987k(), optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            C20765w2.this.f101955I0 = AbstractC23161o1.m119317b(optInt);
                            C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.e3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C20765w2.d.this.m108380o();
                                }
                            });
                        }
                    }
                    c20765w2 = C20765w2.this;
                    c20765w2.f102001h1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C20765w2 c20765w24 = C20765w2.this;
                    c20765w24.f102001h1 = false;
                    interfaceC20659b2 = c20765w24.f101966Q;
                    runnable = new Runnable() { // from class: iq.f3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.d.this.m108381p();
                        }
                    };
                }
                if (z11) {
                    interfaceC20659b2 = c20765w2.f101966Q;
                    runnable = new Runnable() { // from class: iq.f3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.d.this.m108381p();
                        }
                    };
                    interfaceC20659b2.mo70710wy(runnable);
                }
            } catch (Throwable th2) {
                C20765w2 c20765w25 = C20765w2.this;
                c20765w25.f102001h1 = false;
                c20765w25.f101966Q.mo70710wy(new Runnable() { // from class: iq.f3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.d.this.m108381p();
                    }
                });
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f102061a;

        /* renamed from: b */
        final /* synthetic */ ContactProfile f102062b;

        /* renamed from: c */
        final /* synthetic */ boolean f102063c;

        e(String str, ContactProfile contactProfile, boolean z11) {
            this.f102061a = str;
            this.f102062b = contactProfile;
            this.f102063c = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108383d(ContactProfile contactProfile, boolean z11, String str) {
            try {
                if (C26446c.m136326b().m136328c() == 2) {
                    C20765w2.this.f101966Q.mo86261hA(contactProfile);
                } else if (z11) {
                    C20765w2.this.f101966Q.mo86277py(str);
                }
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.m108295Or(c20765w2.f101968R);
                C20765w2.this.m108297Ot();
                C20765w2.this.mo107719pd();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102003i1 = false;
            c20765w2.f101966Q.mo49315c4();
            if (C20765w2.this.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestFail));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102003i1 = false;
            c20765w2.f102016p0 = false;
            c20765w2.f101966Q.mo49315c4();
            try {
                JSONObject jSONObject2 = (JSONObject) obj;
                new JSONObject();
                if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                    int i11 = jSONObject.getInt("code");
                    if (i11 == 0) {
                        AbstractC23059e9.m118317F(this.f102061a);
                        C21927m.m114302u().m114337i(this.f102061a);
                        AbstractC23074g2.m118375a(0, this.f102061a, "", 6);
                        InterfaceC20659b2 interfaceC20659b2 = C20765w2.this.f101966Q;
                        final ContactProfile contactProfile = this.f102062b;
                        final boolean z11 = this.f102063c;
                        final String str = this.f102061a;
                        interfaceC20659b2.mo78955kl(new Runnable() { // from class: iq.g3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20765w2.e.this.m108383d(contactProfile, z11, str);
                            }
                        }, 500L);
                    } else if (C20765w2.this.f101966Q.mo45894h0() && !AbstractC23216t1.m119641f(C20765w2.this.f101966Q.mo82987k(), i11, true)) {
                        ToastUtils.m89259g(i11);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: iq.w2$f */
    /* loaded from: classes4.dex */
    class f implements InterfaceC20094a {
        f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102005j1 = false;
            c20765w2.f101966Q.mo49315c4();
            if (C20765w2.this.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_rejectFriendRequestFail));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:3:0x0010, B:5:0x001d, B:7:0x0023, B:9:0x0029, B:11:0x002f, B:13:0x0043, B:16:0x005a, B:18:0x006f, B:19:0x0078, B:22:0x004b, B:23:0x0080, B:25:0x008a), top: B:2:0x0010 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102005j1 = false;
            c20765w2.f102016p0 = false;
            c20765w2.f101966Q.mo49315c4();
            try {
                JSONObject jSONObject2 = (JSONObject) obj;
                new JSONObject();
                if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                    int i11 = jSONObject.getInt("code");
                    if (i11 == 0) {
                        AbstractC23059e9.m118317F(C20765w2.this.f101968R);
                        AbstractC23063f2.m118364p(C20765w2.this.f101968R);
                        C20765w2 c20765w22 = C20765w2.this;
                        if (!c20765w22.f101974U) {
                            if (c20765w22.f101984Z == 2) {
                            }
                            AbstractC23074g2.m118375a(1, C20765w2.this.f101968R, "", 6);
                            if (C20765w2.this.f101966Q.mo45894h0()) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_removeFriendRequestSuccessNew));
                            }
                            C20765w2 c20765w23 = C20765w2.this;
                            c20765w23.m108298Pr(c20765w23.f101968R);
                            return;
                        }
                        Map m114392b = C21929o.m114391a().m114392b();
                        String str = C20765w2.this.f101968R;
                        m114392b.put(str, str);
                        AbstractC23074g2.m118375a(1, C20765w2.this.f101968R, "", 6);
                        if (C20765w2.this.f101966Q.mo45894h0()) {
                        }
                        C20765w2 c20765w232 = C20765w2.this;
                        c20765w232.m108298Pr(c20765w232.f101968R);
                        return;
                    }
                    if (C20765w2.this.f101966Q.mo45894h0()) {
                        ToastUtils.m89259g(i11);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$g */
    /* loaded from: classes4.dex */
    public class g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31874cb f102066a;

        g(C31874cb c31874cb) {
            this.f102066a = c31874cb;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f102013n1 = false;
                c20765w2.f101966Q.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C31874cb c31874cb = this.f102066a;
                    if (c31874cb.f146399o == 2) {
                        AbstractC23059e9.m118317F(c31874cb.f146385a);
                    }
                    AbstractC23063f2.m118364p(this.f102066a.f146385a);
                    AbstractC23074g2.m118375a(1, this.f102066a.f146385a, "", 7);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f102013n1 = false;
                c20765w2.f101966Q.mo78960q3();
                C21933s.m114404I().m114495v();
            } catch (Throwable th2) {
                C20765w2 c20765w22 = C20765w2.this;
                c20765w22.f102013n1 = false;
                c20765w22.f101966Q.mo78960q3();
                C21933s.m114404I().m114495v();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$h */
    /* loaded from: classes4.dex */
    public class h implements InterfaceC20094a {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108385d() {
            C20765w2.this.m108218Pt();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    e11.printStackTrace();
                }
            } finally {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f102015o1 = false;
                c20765w2.f101966Q.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC20659b2 interfaceC20659b2;
            Runnable runnable;
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            C21933s.f107870s0 = C20765w2.this.f102011m1;
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                            AbstractC23059e9.m118317F(C20765w2.this.f102011m1);
                            AbstractC23074g2.m118375a(0, C20765w2.this.f102011m1, "", 7);
                            AbstractC23063f2.m118349a(C20765w2.this.f102009l1);
                        } else {
                            AbstractC23063f2.m118357i(i11, C20765w2.this.f102011m1);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(C20765w2.this.f101966Q.mo82987k(), i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            C20765w2.this.f101955I0 = AbstractC23161o1.m119317b(i11);
                            C20765w2 c20765w2 = C20765w2.this;
                            c20765w2.f101966Q.mo86232QB(c20765w2.m108308Yr(23));
                        }
                    }
                    C20765w2 c20765w22 = C20765w2.this;
                    c20765w22.f102015o1 = false;
                    c20765w22.f101966Q.mo78960q3();
                    interfaceC20659b2 = C20765w2.this.f101966Q;
                    runnable = new Runnable() { // from class: iq.h3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.h.this.m108385d();
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C20765w2 c20765w23 = C20765w2.this;
                    c20765w23.f102015o1 = false;
                    c20765w23.f101966Q.mo78960q3();
                    interfaceC20659b2 = C20765w2.this.f101966Q;
                    runnable = new Runnable() { // from class: iq.h3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.h.this.m108385d();
                        }
                    };
                }
                interfaceC20659b2.mo70710wy(runnable);
            } catch (Throwable th2) {
                C20765w2 c20765w24 = C20765w2.this;
                c20765w24.f102015o1 = false;
                c20765w24.f101966Q.mo78960q3();
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.h3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.h.this.m108385d();
                    }
                });
                throw th2;
            }
        }
    }

    /* renamed from: iq.w2$i */
    /* loaded from: classes4.dex */
    class i implements InterfaceC20094a {
        i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102019q1 = false;
            if (c20765w2.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
            C20765w2.this.m108332rt(true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f102019q1 = false;
                c20765w2.f101966Q.mo49315c4();
                C20765w2 c20765w22 = C20765w2.this;
                c20765w22.f101996f0 = false;
                c20765w22.f101966Q.mo86254eH(false);
                if (C20765w2.this.f102021r1.length() > 0 && !C20765w2.this.f102021r1.equalsIgnoreCase("null")) {
                    C21912a.m114159g().m114173o(C20765w2.this.f102021r1);
                    C20765w2.this.m108332rt(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: iq.w2$j */
    /* loaded from: classes4.dex */
    class j implements InterfaceC20094a {
        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102025t1 = false;
            if (c20765w2.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
            C20765w2.this.m108332rt(true);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C20765w2.this.f102025t1 = false;
            C21912a.m114159g().m114162b(C20765w2.this.f101963N0);
            if (C20765w2.this.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_hide_my_timeline_from_friend_successfully));
            }
            C20765w2.this.m108332rt(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$k */
    /* loaded from: classes4.dex */
    public class k extends AbstractC0939u {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108387d(boolean z11) {
            try {
                C20765w2.this.m108344wr(new C3001l1(z11, false));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            boolean z11;
            ArrayList arrayList;
            boolean z12;
            try {
                boolean m114558y = AbstractC21935u.m114558y(C20765w2.this.f101968R);
                boolean m153137g = C21927m.m114302u().m114312J().m153137g(C20765w2.this.f101968R);
                final boolean z13 = false;
                if (!m114558y) {
                    ContactProfile contactProfile = C20765w2.this.f101963N0;
                    if (contactProfile != null) {
                        if (contactProfile.f42352K0 <= 0) {
                        }
                    }
                    if (!C21927m.m114302u().m114318P(C20765w2.this.f101968R)) {
                        z11 = true;
                        arrayList = C20765w2.this.f101671w;
                        if (arrayList == null && !arrayList.isEmpty() && C20765w2.this.f101671w.size() <= 10) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!m153137g && z11 && z12 && !C20765w2.this.f102016p0) {
                            z13 = true;
                        }
                        C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.u2
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20765w2.k.this.m108387d(z13);
                            }
                        });
                    }
                }
                z11 = false;
                arrayList = C20765w2.this.f101671w;
                if (arrayList == null) {
                }
                z12 = false;
                if (!m153137g) {
                    z13 = true;
                }
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.u2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.k.this.m108387d(z13);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$l */
    /* loaded from: classes4.dex */
    public class l implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f102072a;

        /* renamed from: iq.w2$l$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                l lVar = l.this;
                C20765w2.this.f101652A.mo112404c(lVar.f102072a);
            }
        }

        l(String str) {
            this.f102072a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C20765w2.this.m108332rt(true);
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            C20765w2.this.f102029v1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.optInt("error_code", -999) == 0) {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            if (!jSONObject.isNull("data")) {
                                jSONArray = new JSONArray(jSONObject.getString("data"));
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.m104539h(e11);
                        }
                        boolean z12 = true;
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            if (Integer.parseInt(this.f102072a) == ((Integer) jSONArray.get(i11)).intValue()) {
                                z12 = false;
                            }
                        }
                        if (z12) {
                            if (!C21927m.m114302u().m114351p().contains(this.f102072a)) {
                                C21927m.m114302u().m114351p().add(this.f102072a);
                                AbstractC21935u.m114527Q(this.f102072a);
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            C0824j.m2153b(new a());
                            C18644n.m98524E();
                            ContactProfile m98552o = C18644n.m98531l().m98552o(this.f102072a);
                            if (m98552o != null) {
                                String m114539f = AbstractC21935u.m114539f(m98552o.f42455y, this.f102072a, m98552o.f42437s);
                                String format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_info_add_favorite_friend), m114539f, m114539f);
                                if (!z11) {
                                    AbstractC19646n0.m103026s0(this.f102072a, format);
                                }
                            }
                        } else if (C20765w2.this.f101966Q.mo45894h0()) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cant_add_favorite_friend));
                        }
                    } else if (C20765w2.this.f101966Q.mo45894h0()) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                C20765w2.this.f102029v1 = false;
            } finally {
                C20765w2.this.m108332rt(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$m */
    /* loaded from: classes4.dex */
    public class m implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f102075a;

        /* renamed from: iq.w2$m$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                m mVar = m.this;
                C20765w2.this.f101652A.mo112411j0(mVar.f102075a);
            }
        }

        m(String str) {
            this.f102075a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C20765w2.this.f101966Q.mo49315c4();
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            C20765w2.this.f102031w1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C20765w2.this.f101966Q.mo49315c4();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.optInt("error_code", -999) == 0) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        if (!jSONObject.isNull("data")) {
                            jSONArray = new JSONArray(jSONObject.getString("data"));
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    boolean z11 = true;
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        if (Integer.parseInt(this.f102075a) == ((Integer) jSONArray.get(i11)).intValue()) {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        C21927m.m114302u().m114340j0(this.f102075a);
                        AbstractC21935u.m114526P(this.f102075a);
                        C0824j.m2153b(new a());
                    }
                } else if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
            C18644n.m98524E();
            C20765w2.this.m108332rt(false);
            C20765w2.this.f102031w1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$n */
    /* loaded from: classes4.dex */
    public class n implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f102078a;

        /* renamed from: b */
        final /* synthetic */ boolean f102079b;

        n(ContactProfile contactProfile, boolean z11) {
            this.f102078a = contactProfile;
            this.f102079b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108389d() {
            try {
                C20765w2.this.f101966Q.mo49315c4();
                if (C20765w2.this.f101966Q.mo86269mc()) {
                    C20765w2.this.f101966Q.mo86284to();
                }
                AbstractC23088h5.m118426g();
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
                }
                C20765w2.this.m108226St();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C20765w2.this.f101966Q.mo49315c4();
                try {
                    i11 = c20096c.m104491c();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    i11 = -1000;
                }
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    ToastUtils.m89259g(i11);
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int parseInt;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                new JSONObject();
                if (jSONObject.has("data") && (parseInt = Integer.parseInt(new JSONObject(jSONObject.getString("data")).getString("code"))) != 0) {
                    C20765w2.this.f101966Q.mo49315c4();
                    if (C20765w2.this.f101966Q.mo45894h0()) {
                        ToastUtils.m89259g(parseInt);
                        return;
                    }
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC23047d8.m118259k(this.f102078a, this.f102079b, new SensitiveData("phonebook_delete_in_user_profile", "phonebook_delete"));
            C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.i3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.n.this.m108389d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$o */
    /* loaded from: classes4.dex */
    public class o implements InterfaceC20094a {
        o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m108392e() {
            try {
                C20765w2.this.m107770Tp(new C2977g2(0));
                C20765w2.this.f101966Q.mo82971a0();
                C20765w2 c20765w2 = C20765w2.this;
                if (c20765w2.f102035y1 != null) {
                    c20765w2.m108348yr(true);
                } else {
                    c20765w2.m107770Tp(new C2977g2(10));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m108393f(C20096c c20096c) {
            try {
                C20765w2.this.f101966Q.mo82971a0();
                if (c20096c != null && c20096c.m104491c() == 50001) {
                    C20765w2.this.m107770Tp(new C2977g2(5));
                } else {
                    C20765w2.this.m107770Tp(new C2977g2(10));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f102033x1 = false;
            c20765w2.f101966Q.mo70710wy(new Runnable() { // from class: iq.k3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.o.this.m108393f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            if (obj != null) {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data")) {
                        jSONObject = jSONObject2.getJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        C20765w2.this.f102035y1 = new C3563d(jSONObject);
                        ContactProfile contactProfile = C20765w2.this.f101963N0;
                        if (contactProfile != null && contactProfile.f42434r.length() > 0 && !C20765w2.this.f101963N0.f42434r.equalsIgnoreCase("null")) {
                            C20765w2 c20765w2 = C20765w2.this;
                            c20765w2.f101963N0.f42433q1 = c20765w2.f102035y1.m18101e().toString();
                            C20765w2 c20765w22 = C20765w2.this;
                            c20765w22.f101652A.mo112388G(c20765w22.f101963N0);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            C20765w2 c20765w23 = C20765w2.this;
            c20765w23.f102033x1 = false;
            c20765w23.f101966Q.mo70710wy(new Runnable() { // from class: iq.j3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.o.this.m108392e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$p */
    /* loaded from: classes4.dex */
    public class p extends AbstractC0939u {
        p() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108395d(boolean z11, boolean z12, boolean z13) {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101966Q.mo86253eF(c20765w2.f101940A1);
                C20765w2.this.f101966Q.mo86258gI(true);
                if (z11) {
                    C20765w2.this.m108191Ft(z12);
                } else {
                    C20765w2.this.m108198Ht(z13);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            boolean z11;
            boolean z12;
            try {
                final boolean m114558y = AbstractC21935u.m114558y(C20765w2.this.f101968R);
                final boolean m114536c = AbstractC21935u.m114536c(C20765w2.this.f101968R);
                boolean z13 = false;
                if (!m114558y) {
                    ContactProfile contactProfile = C20765w2.this.f101963N0;
                    if (contactProfile != null) {
                        if (contactProfile.f42352K0 <= 0) {
                        }
                    }
                    if (!C21927m.m114302u().m114318P(C20765w2.this.f101968R)) {
                        z11 = true;
                        if (TextUtils.isEmpty(C20765w2.this.f101968R) && C20765w2.this.f101968R.equals(CoreUtility.f89233i)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        final boolean m3746da = AbstractC0924m0.m3746da();
                        C20765w2 c20765w2 = C20765w2.this;
                        if (!z12 && (m114558y || (z11 && C18631a.m98446i().f93750b))) {
                            z13 = true;
                        }
                        c20765w2.f101942B1 = z13;
                        C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.l3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20765w2.p.this.m108395d(m114558y, m3746da, m114536c);
                            }
                        });
                    }
                }
                z11 = false;
                if (TextUtils.isEmpty(C20765w2.this.f101968R)) {
                }
                z12 = false;
                final boolean m3746da2 = AbstractC0924m0.m3746da();
                C20765w2 c20765w22 = C20765w2.this;
                if (!z12) {
                    z13 = true;
                }
                c20765w22.f101942B1 = z13;
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.p.this.m108395d(m114558y, m3746da2, m114536c);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: iq.w2$q */
    /* loaded from: classes4.dex */
    class q implements C25453e.a {

        /* renamed from: a */
        final /* synthetic */ String f102083a;

        q(String str) {
            this.f102083a = str;
        }

        @Override // p456qp.C25453e.a
        /* renamed from: a */
        public void mo87822a(String str, Exception exc) {
            int i11;
            if (TextUtils.equals(this.f102083a, str)) {
                int m44477c = ProfileMusicView.m44477c(exc);
                C20765w2 c20765w2 = C20765w2.this;
                if (m44477c == 700) {
                    i11 = 0;
                } else {
                    i11 = 3;
                }
                c20765w2.m108270pt(i11, m44477c);
                C20765w2.this.m108271qt(false);
            }
        }

        @Override // p456qp.C25453e.a
        /* renamed from: b */
        public void mo87823b(C24902e c24902e, C24903f c24903f) {
            if (c24902e != null && TextUtils.equals(this.f102083a, c24902e.m129490f())) {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101949F0 = c24902e;
                c20765w2.m108270pt(1, 200);
                C20765w2 c20765w22 = C20765w2.this;
                c20765w22.m108271qt(c20765w22.m107783jq(c20765w22.f101949F0));
            }
        }

        @Override // p456qp.C25453e.a
        /* renamed from: c */
        public void mo87824c(Job job) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$r */
    /* loaded from: classes4.dex */
    public class r implements C18953k.c {
        r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108397d(C31917f9 c31917f9) {
            try {
                C20765w2.this.m108320ks(c31917f9.f146629a);
                C20765w2.this.f101948E1 = c31917f9;
                C20765w2 c20765w2 = C20765w2.this;
                if (c20765w2.f101954H1 != MultiStateView.EnumC15914e.ERROR) {
                    c20765w2.m108224Sr();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // fi.C18953k.c
        /* renamed from: a */
        public void mo16434a(EnumC19450c enumC19450c, C30997b c30997b, final C31917f9 c31917f9) {
            C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.m3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.r.this.m108397d(c31917f9);
                }
            });
        }

        @Override // fi.C18953k.c
        /* renamed from: b */
        public void mo16435b(EnumC19448a enumC19448a, String str) {
            if (enumC19448a == EnumC19448a.f96537t) {
                C20765w2.this.m108187Cs();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$s */
    /* loaded from: classes4.dex */
    public class s extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f102086a;

        s(ContactProfile contactProfile) {
            this.f102086a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C30997b.c m99323B = C18953k.m99323B(this.f102086a);
                C30997b m99411s = C18953k.m99340R().m99411s(this.f102086a, m99323B);
                if (m99411s != null) {
                    C20765w2.this.f101944C1 = m99411s.m150661e();
                    C18953k.m99340R().m99400c0(EnumC19450c.f96554q, m99411s, false, m99323B, C20765w2.this.f101946D1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: iq.w2$t */
    /* loaded from: classes4.dex */
    class t implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f102088a;

        /* renamed from: b */
        final /* synthetic */ boolean f102089b;

        /* renamed from: c */
        final /* synthetic */ String f102090c;

        t(int i11, boolean z11, String str) {
            this.f102088a = i11;
            this.f102089b = z11;
            this.f102090c = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2.this.f101966Q.mo49315c4();
            C20765w2.this.f101966Q.mo59032jx(AbstractC8020f0.error_message);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C20765w2.this.f101966Q.mo49315c4();
            C20765w2.this.f101966Q.mo59032jx(this.f102088a);
            if (this.f102089b) {
                if (this.f102090c.equals("2")) {
                    AbstractC21935u.m114535b(C20765w2.this.mo107696Ya());
                } else if (this.f102090c.equals("5")) {
                    AbstractC21935u.m114530T(C20765w2.this.mo107696Ya());
                }
            }
            C20765w2.this.f101966Q.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$u */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class u {

        /* renamed from: a */
        static final /* synthetic */ int[] f102092a;

        static {
            int[] iArr = new int[C8050a.d0.values().length];
            f102092a = iArr;
            try {
                iArr[C8050a.d0.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$v */
    /* loaded from: classes4.dex */
    public class v extends ClickableSpan {
        v() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_conversation_id", C20765w2.this.f101963N0.f42434r);
            bundle.putString("extra_display_name", C20765w2.this.f101963N0.f42437s);
            if (C20765w2.this.f101966Q.mo82987k().m92676n2() != null) {
                C20765w2.this.f101966Q.mo82987k().m92676n2().mo35573l4(GroupInCommonView.class, bundle, 1, true);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$w */
    /* loaded from: classes4.dex */
    public class w implements InterfaceC20094a {

        /* renamed from: iq.w2$w$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f102095a;

            /* renamed from: b */
            final /* synthetic */ int f102096b;

            a(String str, int i11) {
                this.f102095a = str;
                this.f102096b = i11;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20765w2.this.f101652A.mo112395Q(this.f102095a, this.f102096b);
            }
        }

        /* renamed from: iq.w2$w$b */
        /* loaded from: classes4.dex */
        class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f102098a;

            /* renamed from: b */
            final /* synthetic */ String f102099b;

            /* renamed from: c */
            final /* synthetic */ String f102100c;

            b(String str, String str2, String str3) {
                this.f102098a = str;
                this.f102099b = str2;
                this.f102100c = str3;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                ContactProfile m41825s1 = C7959d.m41638d1().m41825s1(this.f102098a);
                if (m41825s1 != null && !TextUtils.isEmpty(this.f102099b) && !TextUtils.isEmpty(this.f102100c)) {
                    if (!this.f102099b.equals(m41825s1.f42446v) || !this.f102100c.equals(m41825s1.m40383Q(true, false))) {
                        C7959d.m41638d1().m41766Y2(this.f102098a, this.f102099b, this.f102100c);
                    }
                }
            }
        }

        w() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m108402g() {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101966Q.mo86232QB(c20765w2.m108308Yr(22));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m108403h() {
            try {
                ContactProfile contactProfile = C20765w2.this.f101963N0;
                if (contactProfile != null) {
                    boolean z11 = true;
                    if (contactProfile.m40387S0()) {
                        if (C20765w2.this.mo107721rc()) {
                            C20765w2.this.f101966Q.mo86280ql();
                            C20765w2.this.m108275wt();
                            C20765w2.this.mo107719pd();
                            C20765w2.this.f101966Q.mo86243bE(false);
                            return;
                        }
                        C20765w2 c20765w2 = C20765w2.this;
                        if (c20765w2.f102035y1 != null) {
                            z11 = false;
                        }
                        if (z11) {
                            c20765w2.f101966Q.mo82971a0();
                        }
                        if (C20765w2.this.f101652A.mo112414n()) {
                            C20765w2 c20765w22 = C20765w2.this;
                            c20765w22.f101966Q.mo86257fr(c20765w22.f101968R);
                            return;
                        } else {
                            C20765w2.this.m108313ds(z11);
                            return;
                        }
                    }
                    C20765w2.this.f101966Q.mo86285uB();
                    C20765w2 c20765w23 = C20765w2.this;
                    if (!c20765w23.f101975U0) {
                        c20765w23.f101966Q.mo86248dE();
                    }
                    C20765w2 c20765w24 = C20765w2.this;
                    c20765w24.f101992d0 = "0";
                    c20765w24.f101669u = true;
                    c20765w24.m108311bs(CoreUtility.f89233i, c20765w24.f101968R, "0", true);
                    C20765w2 c20765w25 = C20765w2.this;
                    c20765w25.mo107773Yp(c20765w25.f101968R);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m108404i() {
            try {
                try {
                    C20765w2.this.f101966Q.mo49315c4();
                    C20765w2 c20765w2 = C20765w2.this;
                    c20765w2.m108288Fr(c20765w2.f101963N0);
                    C20765w2 c20765w22 = C20765w2.this;
                    if (!c20765w22.f101670v && c20765w22.f102012n0) {
                        c20765w22.f101966Q.mo82925B4();
                        C20765w2.this.f102012n0 = true;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C20765w2.f101938L1, e11);
                }
                C20765w2.this.m108297Ot();
            } finally {
                C20765w2.this.f101975U0 = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:            if (r3.f102094a.f101988b0 == false) goto L23;     */
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m108405j(C20096c c20096c) {
            ContactProfile contactProfile;
            try {
                try {
                    C20765w2.this.f101966Q.mo82971a0();
                    ContactProfile contactProfile2 = C20765w2.this.f101963N0;
                    if (contactProfile2 != null && !contactProfile2.m40387S0()) {
                        C20765w2.this.f101966Q.mo86248dE();
                    }
                    C20765w2 c20765w2 = C20765w2.this;
                    c20765w2.m108288Fr(c20765w2.f101963N0);
                    contactProfile = C20765w2.this.f101963N0;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (contactProfile == null || !contactProfile.m40387S0()) {
                    C20765w2 c20765w22 = C20765w2.this;
                    if (!c20765w22.f101670v) {
                        if (c20765w22.m107781hq()) {
                        }
                    }
                    C20765w2.this.f101975U0 = false;
                }
                if (c20096c != null && c20096c.m104491c() == 50001) {
                    C20765w2.this.m107770Tp(new C2977g2(5));
                } else {
                    C20765w2.this.m107770Tp(new C2977g2(10));
                }
                C20765w2.this.f101975U0 = false;
            } catch (Throwable th2) {
                C20765w2.this.f101975U0 = false;
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            C20765w2.this.f101966Q.mo49315c4();
            if (c20096c.m104491c() == 515 && C20765w2.this.f101966Q.mo45894h0()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            }
            C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.n3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.w.this.m108405j(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            String str;
            C31901e8 m2801g;
            try {
                try {
                    C20765w2 c20765w2 = C20765w2.this;
                    c20765w2.f101973T0 = true;
                    if (obj != null) {
                        JSONObject jSONObject = (JSONObject) obj;
                        c20765w2.f101963N0 = new ContactProfile(jSONObject);
                        if (AbstractC0906d0.m2797c(MainApplication.getAppContext(), C20765w2.this.f101968R)) {
                            C20765w2.this.f102012n0 = true;
                        }
                        ContactProfile contactProfile2 = C20765w2.this.f101963N0;
                        if (contactProfile2 != null && contactProfile2.f42434r.length() > 0 && !C20765w2.this.f101963N0.f42434r.equalsIgnoreCase("null")) {
                            C20765w2 c20765w22 = C20765w2.this;
                            C21785g c21785g = c20765w22.f101652A;
                            ContactProfile contactProfile3 = c20765w22.f101963N0;
                            c21785g.mo112423x0(contactProfile3, AbstractC21935u.m114558y(contactProfile3.f42434r));
                        }
                        ContactProfile contactProfile4 = C20765w2.this.f101963N0;
                        if (contactProfile4.f42341G1 == 1 && TextUtils.isEmpty(contactProfile4.f42455y) && (m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), C20765w2.this.f101963N0.f42434r)) != null) {
                            m2801g.m153291A(0L);
                        }
                        if (C11318b.m60507e().m60520o(C20765w2.this.f101963N0.f42434r)) {
                            C3535c m2634q = AbstractC23306f.m120584H0().m2634q(C20765w2.this.f101963N0.f42434r);
                            if (m2634q != null) {
                                contactProfile = m2634q.m17971y0().m40998a();
                            } else {
                                contactProfile = null;
                            }
                            if (contactProfile != null && !contactProfile.m40374K0() && (str = C20765w2.this.f101963N0.f42458z) != null) {
                                contactProfile.f42458z = str;
                            }
                        }
                        C20765w2.this.f102002i0 = jSONObject.optBoolean("is_close_page");
                        C20765w2.this.f102004j0 = jSONObject.optBoolean("is_disable_follow");
                        C20765w2.this.f102006k0 = jSONObject.optBoolean("is_disable_unfollow");
                        C20765w2.this.f101994e0 = jSONObject.optBoolean("is_banned");
                        C20765w2.this.f102034y0 = jSONObject.optInt("profile_stt");
                        C20765w2 c20765w23 = C20765w2.this;
                        c20765w23.f101966Q.mo86208Bh(c20765w23.f101994e0, c20765w23.f102002i0, c20765w23.f102004j0, c20765w23.f102006k0);
                        ContactProfile contactProfile5 = C20765w2.this.f101963N0;
                        if (contactProfile5 != null && contactProfile5.m40387S0()) {
                            C20765w2.this.m108332rt(false);
                        }
                        if (C21927m.m114302u().m114322U(C20765w2.this.f101963N0.f42434r)) {
                            if (C21927m.m114302u().m114357s().m153138j(C20765w2.this.f101963N0.f42434r) != null) {
                                ContactProfile contactProfile6 = C20765w2.this.f101963N0;
                                String str2 = contactProfile6.f42434r;
                                int i11 = contactProfile6.f42453x0;
                                if (i11 != C21927m.m114302u().m114357s().m153138j(C20765w2.this.f101963N0.f42434r).f42453x0) {
                                    C21927m.m114302u().m114357s().m153138j(C20765w2.this.f101963N0.f42434r).f42453x0 = C20765w2.this.f101963N0.f42453x0;
                                    C0824j.m2153b(new a(str2, i11));
                                }
                            }
                        } else if (!AbstractC21935u.m114558y(C20765w2.this.f101963N0.f42434r)) {
                            ContactProfile contactProfile7 = C20765w2.this.f101963N0;
                            String str3 = contactProfile7.f42434r;
                            String str4 = contactProfile7.f42446v;
                            String m40383Q = contactProfile7.m40383Q(true, false);
                            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(m40383Q)) {
                                C0824j.m2153b(new b(str3, str4, m40383Q));
                            }
                        }
                        C20765w2 c20765w24 = C20765w2.this;
                        int i12 = c20765w24.f102034y0;
                        if (i12 == 1 || i12 == 2) {
                            c20765w24.f101966Q.mo70710wy(new Runnable() { // from class: iq.o3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C20765w2.w.this.m108402g();
                                }
                            });
                        }
                        C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.p3
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20765w2.w.this.m108403h();
                            }
                        });
                        C25231i.f121006a.m130533f(C20765w2.this.f101963N0);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(C20765w2.f101938L1, e11);
                }
                C20765w2.this.m108328os();
                if (C20765w2.this.f101966Q.mo45894h0()) {
                    C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.q3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.w.this.m108404i();
                        }
                    });
                }
            } catch (Throwable th2) {
                C20765w2.this.m108328os();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$x */
    /* loaded from: classes4.dex */
    public class x implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f102102a;

        x(ContactProfile contactProfile) {
            this.f102102a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                AbstractC23350e.m122774d(C20765w2.f101938L1, "cannot get extend profile .... " + c20096c.m104492d());
                C20765w2.this.m108270pt(0, 400);
                C20765w2.this.m108271qt(false);
                C20765w2.this.m108290Kt(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            List m40468d;
            try {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                        ContactProfile.C7868d c7868d = new ContactProfile.C7868d(optJSONObject);
                        ContactProfile contactProfile = this.f102102a;
                        ContactProfile.C7868d c7868d2 = contactProfile.f42366P;
                        if (c7868d2 == null) {
                            contactProfile.f42366P = c7868d;
                        } else {
                            c7868d2.f42479m = c7868d.f42479m;
                            c7868d2.f42489w = c7868d.f42489w;
                        }
                        C28011a4 m141160b = C28011a4.m141160b();
                        ContactProfile contactProfile2 = this.f102102a;
                        m141160b.m141163d(contactProfile2.f42434r, contactProfile2.f42366P);
                        C20765w2.this.m108326nt();
                        String str = "";
                        ContactProfile.C7872h c7872h = c7868d.f42489w;
                        if (c7872h != null && (m40468d = c7872h.m40468d()) != null && !m40468d.isEmpty()) {
                            str = (String) m40468d.get(0);
                        }
                        C20765w2.this.f101949F0 = new C24902e();
                        C20765w2.this.f101949F0.m129497m(str);
                        C20765w2.this.m108335ts();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$y */
    /* loaded from: classes4.dex */
    public class y implements InterfaceC20094a {

        /* renamed from: iq.w2$y$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ int f102105a;

            a(int i11) {
                this.f102105a = i11;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101652A.mo112391L(c20765w2.f101968R, this.f102105a);
            }
        }

        y() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m108408e() {
            C20765w2.this.m108304Tt();
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.m108295Or(c20765w2.f101968R);
            C20765w2.this.m108297Ot();
            C20765w2.this.mo107719pd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m108409f() {
            try {
                C20765w2 c20765w2 = C20765w2.this;
                c20765w2.f101977V0 = false;
                if (c20765w2.f102016p0 && c20765w2.f101671w.size() <= 0) {
                    C20765w2.this.m108289It(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f101977V0 = false;
            c20765w2.f101979W0 = true;
            c20765w2.f101966Q.mo86271mq(false);
            C20765w2 c20765w22 = C20765w2.this;
            c20765w22.m108298Pr(c20765w22.f101968R);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            C20765w2.this.f101990c0 = true;
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                boolean z15 = false;
                if (jSONObject.has("req_info")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("req_info");
                    C20765w2 c20765w2 = C20765w2.this;
                    if (AbstractC18069a.m96085d(jSONObject2, "isRequesting") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c20765w2.f102016p0 = z11;
                    C20765w2 c20765w22 = C20765w2.this;
                    if (AbstractC18069a.m96085d(jSONObject2, "isBlock") == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c20765w22.f102010m0 = z12;
                    C20765w2 c20765w23 = C20765w2.this;
                    if (AbstractC18069a.m96085d(jSONObject2, "isBlockTimeLine") == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c20765w23.f101996f0 = z13;
                    C20765w2 c20765w24 = C20765w2.this;
                    if (AbstractC18069a.m96085d(jSONObject2, "isHideTimeLine") == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    c20765w24.f101998g0 = z14;
                    C20765w2 c20765w25 = C20765w2.this;
                    if (c20765w25.f102016p0) {
                        c20765w25.f102018q0 = jSONObject2.optInt("reqSrc");
                        C20765w2.this.f102020r0 = jSONObject2.optString("msg");
                        C20765w2.this.f102022s0 = jSONObject2.optString("phone");
                        C20765w2.this.f102024t0 = jSONObject2.optInt("ranking");
                        C20765w2.this.f102026u0 = jSONObject2.optInt("total_group");
                        C20765w2.this.f102028v0 = jSONObject2.optLong("created_time");
                        C20765w2 c20765w26 = C20765w2.this;
                        ContactProfile contactProfile = c20765w26.f101963N0;
                        contactProfile.f42455y = c20765w26.f102022s0;
                        contactProfile.f42369Q = c20765w26.f102024t0;
                        ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(C20765w2.this.f101963N0.f42434r);
                        if (mo98491j != null) {
                            C20765w2 c20765w27 = C20765w2.this;
                            mo98491j.f42455y = c20765w27.f102022s0;
                            mo98491j.f42369Q = c20765w27.f102024t0;
                        }
                        C7960e m41971c6 = C7960e.m41971c6();
                        C20765w2 c20765w28 = C20765w2.this;
                        m41971c6.m42557ud(c20765w28.f101963N0, c20765w28.f102026u0, c20765w28.f102028v0, c20765w28.f102018q0);
                    }
                    if (C20765w2.this.f101996f0) {
                        C21912a.m114159g().m114162b(C20765w2.this.f101963N0);
                    } else {
                        C21912a.m114159g().m114172n(C20765w2.this.f101963N0);
                    }
                }
                C20765w2.this.m107761Bq(AbstractC18069a.m96085d(jSONObject, "total_photo"));
                if (jSONObject.has("total_follow")) {
                    i11 = AbstractC18069a.m96085d(jSONObject, "total_follow");
                    if (i11 >= 0 && C21927m.m114302u().m114318P(C20765w2.this.f101968R)) {
                        C21927m.m114302u().m114362v0(C20765w2.this.f101968R, i11);
                        C0824j.m2153b(new a(i11));
                    }
                } else {
                    i11 = 0;
                }
                if (jSONObject.has("limit_visible_feed_value")) {
                    z15 = C25973p.f123927a.m133794g(jSONObject);
                }
                C31965ic c31965ic = new C31965ic(i11, C20765w2.this.f101668t);
                c31965ic.m153685e(z15);
                AbstractC23304d.f113405l.put(C20765w2.this.f101968R, c31965ic);
                C20765w2 c20765w29 = C20765w2.this;
                c20765w29.f102000h0 = true;
                c20765w29.f101979W0 = true;
                c20765w29.f101966Q.mo70710wy(new Runnable() { // from class: iq.r3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.y.this.m108408e();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.s3
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.y.this.m108409f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.w2$z */
    /* loaded from: classes4.dex */
    public class z implements InterfaceC20094a {
        z() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m108412e() {
            C20765w2.this.f101966Q.mo82993mm(400);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m108413f() {
            try {
                ArrayList arrayList = C20765w2.this.f101671w;
                if (arrayList != null && arrayList.isEmpty()) {
                    C20765w2 c20765w2 = C20765w2.this;
                    if (c20765w2.f101669u) {
                        c20765w2.f101670v = false;
                        c20765w2.m108311bs(CoreUtility.f89233i, c20765w2.f101968R, c20765w2.f101992d0, true);
                        return;
                    }
                }
                C20765w2.this.m107769Sp(new C3010n0(0));
                C20765w2.this.f101966Q.mo82971a0();
                ArrayList arrayList2 = C20765w2.this.f101671w;
                if (arrayList2 != null) {
                    if (arrayList2.size() > 0) {
                        C20765w2.this.m107770Tp(new C2977g2(0));
                    } else {
                        C20765w2 c20765w22 = C20765w2.this;
                        c20765w22.f101669u = false;
                        c20765w22.f102014o0 = true;
                        c20765w22.m108289It(true);
                    }
                    ContactProfile contactProfile = C20765w2.this.f101963N0;
                    if (contactProfile != null && (contactProfile.m40387S0() || AbstractC3035s0.f12232d)) {
                        C20765w2.this.f101966Q.mo86265lA();
                    }
                    C20765w2.this.mo107650fc();
                    C32017m4 m154326S = C32017m4.m154326S();
                    C20765w2 c20765w23 = C20765w2.this;
                    m154326S.m154357d0(c20765w23.f101947E0, c20765w23.f101671w.size(), C20765w2.this.f101968R);
                    C20765w2.this.f101966Q.mo78955kl(new Runnable() { // from class: iq.u3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.z.this.m108412e();
                        }
                    }, 100L);
                    C20765w2.this.m108284Dt();
                }
                C20765w2.this.f101670v = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20765w2.this.m108186Bs(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            InterfaceC20659b2 interfaceC20659b2;
            Runnable runnable;
            ArrayList arrayList;
            JSONObject jSONObject;
            boolean z11;
            C20765w2 c20765w2 = C20765w2.this;
            c20765w2.f101988b0 = true;
            JSONArray jSONArray = null;
            c20765w2.f101962M0 = null;
            C24355e0.f117560a.m127364t(true);
            try {
                try {
                    if (C20765w2.this.f101992d0.equals("0")) {
                        ArrayList arrayList2 = C20765w2.this.f101671w;
                        if (arrayList2 != null) {
                            arrayList2.clear();
                        }
                        C20765w2.this.f101947E0 = 1;
                    } else {
                        C20765w2.this.f101947E0++;
                    }
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.has("sug_friend") && !jSONObject2.isNull("sug_friend") && (jSONObject = jSONObject2.getJSONObject("sug_friend")) != null) {
                        C20765w2 c20765w22 = C20765w2.this;
                        if (jSONObject.optInt("enable") == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c20765w22.f102030w0 = z11;
                    }
                    if (!jSONObject2.isNull("data")) {
                        String string = jSONObject2.getString("data");
                        C20765w2.this.f101983Y0 = false;
                        if (string.equals("0")) {
                            C20765w2 c20765w23 = C20765w2.this;
                            c20765w23.f101983Y0 = true;
                            c20765w23.f101669u = false;
                        } else {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            if (!jSONObject3.isNull("list")) {
                                jSONArray = jSONObject3.getJSONArray("list");
                            }
                            JSONObject optJSONObject = jSONObject3.optJSONObject("banner_year");
                            if (optJSONObject != null) {
                                C2955c0.m13997e(optJSONObject);
                            }
                            if (AbstractC3035s0.f12229a) {
                                C20765w2.this.f101671w.addAll(AbstractC3035s0.m14608r());
                            }
                            if (jSONArray != null && jSONArray.length() > 0) {
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i11);
                                    String m96089h = AbstractC18069a.m96089h(jSONObject4, "title");
                                    String m96089h2 = AbstractC18069a.m96089h(jSONObject4, "color");
                                    String m96089h3 = AbstractC18069a.m96089h(jSONObject4, "color_line");
                                    String m96089h4 = AbstractC18069a.m96089h(jSONObject4, "icon");
                                    String m96089h5 = AbstractC18069a.m96089h(jSONObject4, "color_title");
                                    JSONArray optJSONArray = jSONObject4.optJSONArray("feeds");
                                    if (optJSONArray != null) {
                                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                            C3000l0 m108750B0 = AbstractC20826v0.m108750B0(optJSONArray.getJSONObject(i12));
                                            m108750B0.f11869R = m96089h;
                                            m108750B0.f11870S = m96089h2;
                                            m108750B0.f11871T = m96089h3;
                                            m108750B0.f11872U = m96089h4;
                                            m108750B0.f11873V = m96089h5;
                                            if (!m108750B0.m14322a0().f12063v && (arrayList = C20765w2.this.f101671w) != null) {
                                                arrayList.add(m108750B0);
                                            }
                                        }
                                    }
                                }
                            }
                            C20765w2.this.f101669u = jSONObject3.optBoolean("lmore");
                            C20765w2.this.f101992d0 = jSONObject3.optString("lfid");
                            C20765w2 c20765w24 = C20765w2.this;
                            c20765w24.m108236Wr(c20765w24.f101968R);
                        }
                    } else {
                        C20765w2.this.f101669u = false;
                    }
                    C20765w2 c20765w25 = C20765w2.this;
                    c20765w25.m108205Jt(c20765w25.f101963N0);
                    interfaceC20659b2 = C20765w2.this.f101966Q;
                    runnable = new Runnable() { // from class: iq.t3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.z.this.m108413f();
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C20765w2 c20765w26 = C20765w2.this;
                    c20765w26.f101669u = false;
                    c20765w26.m108205Jt(c20765w26.f101963N0);
                    interfaceC20659b2 = C20765w2.this.f101966Q;
                    runnable = new Runnable() { // from class: iq.t3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.z.this.m108413f();
                        }
                    };
                }
                interfaceC20659b2.mo70710wy(runnable);
            } catch (Throwable th2) {
                C20765w2 c20765w27 = C20765w2.this;
                c20765w27.m108205Jt(c20765w27.f101963N0);
                C20765w2.this.f101966Q.mo70710wy(new Runnable() { // from class: iq.t3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.z.this.m108413f();
                    }
                });
                throw th2;
            }
        }
    }

    public C20765w2(InterfaceC20656b interfaceC20656b) {
        super(interfaceC20656b);
        this.f101968R = "";
        this.f101970S = false;
        this.f101972T = false;
        this.f101974U = false;
        this.f101976V = -1;
        this.f101978W = C32002l4.m154264g(10001);
        this.f101980X = "";
        this.f101982Y = false;
        this.f101984Z = 0;
        this.f101988b0 = false;
        this.f101990c0 = false;
        this.f101992d0 = "";
        this.f101994e0 = false;
        this.f102002i0 = false;
        this.f102004j0 = false;
        this.f102006k0 = false;
        this.f102008l0 = true;
        this.f102010m0 = false;
        this.f102012n0 = false;
        this.f102014o0 = false;
        this.f102016p0 = false;
        this.f102030w0 = true;
        this.f102032x0 = false;
        this.f102034y0 = 0;
        this.f102036z0 = false;
        this.f101939A0 = "";
        this.f101941B0 = "";
        this.f101943C0 = "";
        this.f101945D0 = "";
        this.f101947E0 = 0;
        this.f101955I0 = "";
        this.f101959K0 = -1;
        this.f101961L0 = 1;
        this.f101962M0 = null;
        this.f101963N0 = null;
        this.f101964O0 = false;
        this.f101971S0 = new w();
        this.f101973T0 = false;
        this.f101975U0 = false;
        this.f101977V0 = false;
        this.f101979W0 = false;
        this.f101981X0 = new y();
        this.f101983Y0 = false;
        this.f101985Z0 = new z();
        this.f101987a1 = "";
        this.f101989b1 = false;
        this.f101991c1 = false;
        this.f101993d1 = false;
        this.f101995e1 = new b();
        this.f101997f1 = false;
        this.f101999g1 = new c();
        this.f102001h1 = false;
        this.f102003i1 = false;
        this.f102005j1 = false;
        this.f102007k1 = new f();
        this.f102011m1 = "";
        this.f102013n1 = false;
        this.f102015o1 = false;
        this.f102017p1 = new h();
        this.f102019q1 = false;
        this.f102021r1 = "";
        this.f102023s1 = new i();
        this.f102025t1 = false;
        this.f102027u1 = new j();
        this.f102029v1 = false;
        this.f102031w1 = false;
        this.f102033x1 = false;
        this.f102037z1 = new o();
        this.f101944C1 = "";
        this.f101946D1 = new r();
        this.f101948E1 = null;
        this.f101950F1 = false;
        this.f101952G1 = new AtomicBoolean(false);
        this.f101966Q = (InterfaceC20659b2) interfaceC20656b;
    }

    /* renamed from: Ar */
    private void m108184Ar() {
        try {
            C24902e c24902e = this.f101949F0;
            if (c24902e != null) {
                this.f101966Q.mo82935Oq(c24902e.m129492h());
                this.f101966Q.mo82962Wl(this.f101949F0.m129494j());
                m108267mt();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Br */
    private void m108185Br(C2991j1 c2991j1) {
        this.f101666O.m123084l(c2991j1);
        m107790vq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bs */
    public void m108186Bs(C20096c c20096c) {
        final boolean z11;
        this.f101988b0 = true;
        if (this.f101671w.size() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f101947E0 = 1;
        }
        this.f101670v = false;
        C32017m4.m154326S().m154357d0(this.f101947E0, this.f101671w.size(), this.f101968R);
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.s2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108225Ss(z11);
            }
        });
        if (c20096c != null) {
            if (TextUtils.isEmpty(c20096c.m104490b())) {
                this.f101962M0 = null;
                if (c20096c.m104491c() == 114 && this.f101966Q.mo45894h0()) {
                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.USER_IS_BANNED_MSG), 114));
                }
                if (this.f101671w.size() == 0) {
                    this.f101966Q.mo70710wy(new Runnable() { // from class: iq.t2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20765w2.this.m108228Ts();
                        }
                    });
                    return;
                }
                return;
            }
            this.f101962M0 = new C24880b(c20096c.m104491c(), c20096c.m104490b());
            if (c20096c.m104491c() == 18028) {
                C24355e0.f117560a.m127364t(false);
                AbstractC20697j.m107826c(this);
                C23744a.m124114c().m124116d(6097, 10001);
            }
            this.f101966Q.mo70710wy(new Runnable() { // from class: iq.d2
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.this.m107790vq();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cs */
    public void m108187Cs() {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.k2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108230Us();
            }
        });
    }

    /* renamed from: Et */
    private void m108188Et() {
        this.f101966Q.mo86221In(this.f101940A1);
        this.f101966Q.mo86275oD(false);
    }

    /* renamed from: Fs */
    private void m108190Fs() {
        if (!C23055e5.m118271f()) {
            this.f101966Q.mo86225Mw(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ft */
    public void m108191Ft(boolean z11) {
        if (z11) {
            m108195Gt();
        } else {
            m108188Et();
        }
    }

    /* renamed from: Gr */
    private void m108193Gr(ContactProfile contactProfile) {
        m108213Nt(contactProfile);
        m108348yr(false);
    }

    /* renamed from: Gs */
    private void m108194Gs(boolean z11) {
        C2983h3 c2983h3 = new C2983h3();
        c2983h3.m14146f(z11);
        m108281Cr(c2983h3);
    }

    /* renamed from: Gt */
    private void m108195Gt() {
        this.f101966Q.mo86275oD(true);
        this.f101966Q.mo86221In(false);
    }

    /* renamed from: Hs */
    private void m108197Hs(boolean z11) {
        C2993j3 m123082j = this.f101666O.m123082j();
        m123082j.m14195f(false);
        m123082j.m14197h(z11);
        m108282Dr(m123082j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ht */
    public void m108198Ht(boolean z11) {
        boolean z12 = false;
        this.f101966Q.mo86275oD(false);
        InterfaceC20659b2 interfaceC20659b2 = this.f101966Q;
        if (this.f101940A1 && z11) {
            z12 = true;
        }
        interfaceC20659b2.mo86221In(z12);
    }

    /* renamed from: Ir */
    private void m108200Ir() {
        this.f101966Q.mo86225Mw(false);
    }

    /* renamed from: Is */
    private void m108201Is() {
        int i11 = this.f101959K0;
        if (i11 != -1) {
            this.f101966Q.mo86288v5(i11);
            this.f101959K0 = -1;
        }
    }

    /* renamed from: Jr */
    private void m108203Jr(ContactProfile contactProfile) {
        ContactProfile contactProfile2;
        if (contactProfile != null) {
            C28023b6.m141250h0().m141398z(this.f101968R);
            String str = contactProfile.f42446v;
            this.f101939A0 = str;
            if (!TextUtils.isEmpty(str) && !contactProfile.f42446v.equalsIgnoreCase("null")) {
                if (C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                    this.f101966Q.mo82981h6(C2343e.m12307a(contactProfile.f42434r, false), AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false)));
                } else {
                    this.f101966Q.mo82965Xu(contactProfile.f42446v, contactProfile.f42323A1);
                }
            }
            String str2 = contactProfile.f42324B;
            this.f101941B0 = str2;
            this.f101966Q.mo82979fp(str2);
            if (!TextUtils.isEmpty(contactProfile.f42437s)) {
                String m40383Q = contactProfile.m40383Q(true, false);
                this.f101945D0 = m40383Q;
                this.f101966Q.mo82958Vn(m40383Q);
                if (!TextUtils.isEmpty(this.f101945D0)) {
                    this.f101966Q.mo82958Vn(this.f101945D0);
                }
            }
            m108347xt();
            this.f101966Q.mo86266lD(true);
            this.f101966Q.mo86255ee(true);
            m108326nt();
            if (this.f101943C0 != null && (contactProfile2 = this.f101963N0) != null) {
                this.f101943C0 = contactProfile2.f42443u;
            }
            m108305Ur();
            m108303Tr();
        }
    }

    /* renamed from: Js */
    private boolean m108204Js() {
        ArrayList<C28212v6> arrayList = new ArrayList();
        arrayList.addAll(AbstractC28025b8.m141459o("tip.profile.setting.noti"));
        for (C28212v6 c28212v6 : arrayList) {
            if (c28212v6.m142167f() && c28212v6.f131580f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jt */
    public void m108205Jt(ContactProfile contactProfile) {
        try {
            if (!C18953k.m99340R().m99408o0() || contactProfile == null) {
                return;
            }
            C0824j.m2153b(new s(contactProfile));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ks */
    private boolean m108207Ks() {
        boolean z11;
        boolean z12;
        try {
            C24903f m154689d = C32065p8.m154684c().m154689d();
            if (m154689d != null && !TextUtils.isEmpty(m154689d.m129503f())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f101949F0 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 || !z12) {
                return false;
            }
            if (!TextUtils.equals(m154689d.m129502e(), this.f101949F0.m129490f())) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: Ls */
    private boolean m108209Ls() {
        if (!this.f101667P.m117201c().m14646D() && !this.f101666O.m123095e().m14129c()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mr */
    public void m108211Mr() {
        long j11;
        if (mo107643H6() && this.f101652A.mo112420u0() && this.f101966Q.mo45894h0()) {
            ContactProfile.C7873i m108274vs = m108274vs();
            if (m108274vs != null) {
                j11 = m108274vs.m40471a();
            } else {
                j11 = 0;
            }
            m108266lt((int) j11, true);
        }
    }

    /* renamed from: Nt */
    private void m108213Nt(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42433q1)) {
            try {
                this.f102035y1 = new C3563d(new JSONObject(contactProfile.f42433q1));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: O4 */
    private void m108214O4(int i11) {
        if (i11 == 1) {
            this.f101966Q.mo86264k2(mo107696Ya());
        } else if (i11 == 3) {
            m108232Vr(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ps */
    public /* synthetic */ void m108217Ps(String str) {
        m108295Or(str);
        m108297Ot();
        mo107719pd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pt */
    public void m108218Pt() {
        m108300Qt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qs */
    public /* synthetic */ void m108220Qs(final int i11, final boolean z11) {
        if (!this.f101966Q.mo78947bg() && this.f101966Q.mo78963ru()) {
            this.f101952G1.set(false);
            this.f101966Q.mo70710wy(new Runnable() { // from class: iq.j2
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.this.m108222Rs(i11, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rs */
    public /* synthetic */ void m108222Rs(int i11, boolean z11) {
        if (i11 != 0) {
            if (i11 == 1) {
                m108238Wt(z11);
                return;
            }
            return;
        }
        m108234Vt(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sr */
    public void m108224Sr() {
        try {
            C31917f9 c31917f9 = this.f101948E1;
            if (c31917f9 != null && !c31917f9.f146629a.isEmpty()) {
                m108281Cr(new C2983h3(this.f101963N0, this.f101944C1, this.f101948E1, C18953k.m99340R().m99385I(this.f101944C1)));
            } else {
                m108194Gs(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ss */
    public /* synthetic */ void m108225Ss(boolean z11) {
        this.f101966Q.mo82971a0();
        if (z11) {
            m107769Sp(new C3010n0(0));
        } else {
            m107769Sp(new C3010n0(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: St */
    public void m108226St() {
        m108305Ur();
        m108297Ot();
        mo107719pd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ts */
    public /* synthetic */ void m108228Ts() {
        m107770Tp(new C2977g2(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Us */
    public /* synthetic */ void m108230Us() {
        try {
            this.f101948E1 = null;
            if (this.f101954H1 != MultiStateView.EnumC15914e.ERROR) {
                m108224Sr();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Vr */
    private void m108232Vr(final int i11) {
        if (!TextUtils.isEmpty(this.f101968R) && !this.f101952G1.get()) {
            this.f101952G1.set(true);
            AbstractC21935u.m114537d(this.f101968R, new InterfaceC23448a() { // from class: iq.q2
                @Override // mv.InterfaceC23448a
                /* renamed from: a */
                public final void mo87300a(boolean z11) {
                    C20765w2.this.m108220Qs(i11, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Vs */
    public /* synthetic */ void m108233Vs() {
        m108304Tt();
        m108288Fr(this.f101963N0);
    }

    /* renamed from: Vt */
    private void m108234Vt(boolean z11) {
        String str;
        try {
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile != null) {
                if (contactProfile.m40387S0()) {
                    str = "8400";
                } else {
                    str = "7400";
                }
                AbstractC23647d.m123907q(str, this.f101966Q.mo86293y());
                AbstractC23647d.m123893c();
                C20785b.f102138a.m108465o(this.f101963N0.f42434r, "social_profile");
            }
            if (!TextUtils.isEmpty(this.f101968R) && !this.f101968R.equalsIgnoreCase("null") && !C23302b.f113247a.m120523d(this.f101939A0)) {
                this.f101966Q.mo86291xx(this.f101968R, this.f101939A0, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wr */
    public void m108236Wr(String str) {
        FeedActionZUtils.m47552j(str);
        FeedActionZUtils.m47551i(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ws */
    public /* synthetic */ void m108237Ws() {
        m107769Sp(new C3010n0(0));
        m107766Pp(new C2961d1(false));
        m107790vq();
    }

    /* renamed from: Wt */
    private void m108238Wt(boolean z11) {
        ItemAlbumMobile itemAlbumMobile;
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            itemAlbumMobile = contactProfile.m40376M();
        } else {
            itemAlbumMobile = null;
        }
        if (itemAlbumMobile != null) {
            this.f101966Q.mo86235Tz(itemAlbumMobile, z11);
        }
        ContactProfile contactProfile2 = this.f101963N0;
        if (contactProfile2 != null) {
            C20785b.f102138a.m108466p(contactProfile2.f42434r, "social_profile");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xs */
    public /* synthetic */ void m108240Xs() {
        try {
            mo107719pd();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ys */
    public /* synthetic */ void m108242Ys() {
        m108314es(this.f101968R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zs */
    public /* synthetic */ void m108244Zs() {
        this.f101966Q.mo86206BI(this.f101968R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: at */
    public /* synthetic */ void m108246at(C3019p c3019p, String str, int i11, int i12) {
        if (!TextUtils.isEmpty(str) && AbstractC20826v0.m108808f0(i12)) {
            str = str + "…";
        }
        c3019p.m14448n(str);
        c3019p.m14451q(!TextUtils.isEmpty(str));
        m107765Op(c3019p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bt */
    public /* synthetic */ void m108248bt() {
        ContactProfile m141809c;
        int i11;
        final C3019p m123079g = this.f101666O.m123079g();
        try {
            m141809c = C28203u6.f131407a.m141809c(this.f101968R);
        } catch (Exception e11) {
            m123079g.m14451q(false);
            m123079g.m14450p(false);
            AbstractC20110a.m104539h(e11);
        }
        if (m141809c == null) {
            return;
        }
        ContactProfile.C7868d m141161a = C28011a4.m141160b().m141161a(m141809c.f42434r);
        m107762Cq(m141809c, m123079g);
        if (m141161a != null) {
            if (C3432a.f14402a.m17234c() && m141809c.m40357A0()) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = UpdateUserInfoBioView.f78893c1;
            }
            AbstractC20826v0.m108811h(m141161a.f42479m, -1, i11, 5, new AbstractC20826v0.i() { // from class: iq.f2
                @Override // is.AbstractC20826v0.i
                /* renamed from: a */
                public final void mo44661a(String str, int i12, int i13) {
                    C20765w2.this.m108246at(m123079g, str, i12, i13);
                }
            });
        } else {
            m123079g.m14448n("");
            m123079g.m14451q(false);
        }
        m123079g.m14450p(false);
        m107765Op(m123079g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ct */
    public /* synthetic */ void m108250ct(int i11, int i12) {
        this.f101966Q.mo82191Re(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dt */
    public /* synthetic */ void m108252dt(boolean z11) {
        boolean z12;
        try {
            C24902e c24902e = this.f101949F0;
            if (c24902e != null && !TextUtils.isEmpty(c24902e.m129490f())) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                m108184Ar();
                this.f101966Q.mo82950Te(true);
            } else {
                this.f101966Q.mo82950Te(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: et */
    public /* synthetic */ void m108254et(boolean z11) {
        if (z11) {
            this.f101966Q.mo49315c4();
        }
        this.f101966Q.mo82218f5();
    }

    /* renamed from: ft */
    private String m108256ft(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "\"" + str + "\"";
    }

    /* renamed from: hs */
    private String m108259hs(String str) {
        String str2 = this.f101945D0;
        String[] split = str2.split("\\s+");
        if (split.length > 3) {
            str2 = TextUtils.join(" ", Arrays.copyOfRange(split, 0, 3));
        }
        return str.replace("display_name", str2);
    }

    /* renamed from: is */
    private void m108261is(C23927b c23927b) {
        c23927b.f115603g = m108259hs(c23927b.f115603g);
        c23927b.f115599c = m108259hs(c23927b.f115599c);
    }

    /* renamed from: js */
    private void m108263js(List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            m108261is((C23927b) list.get(i11));
        }
    }

    /* renamed from: lt */
    private void m108266lt(int i11, boolean z11) {
        C24903f c24903f = this.f101951G0;
        if (c24903f != null && !TextUtils.isEmpty(c24903f.m129503f()) && this.f101966Q.mo45894h0()) {
            C32065p8.m154684c().m154697l(this.f101951G0.m129500c(), i11, z11);
        }
    }

    /* renamed from: mt */
    private void m108267mt() {
        try {
            C24903f m154689d = C32065p8.m154684c().m154689d();
            C24902e c24902e = this.f101949F0;
            if (c24902e != null && m154689d != null && TextUtils.equals(c24902e.m129490f(), m154689d.m129502e())) {
                if (C32065p8.m154684c().m154691f()) {
                    this.f101966Q.mo82946Sr(true);
                    this.f101966Q.mo82952Ty(true);
                    this.f101966Q.mo82980ga(false);
                } else if (C32065p8.m154684c().m154692g()) {
                    this.f101966Q.mo82946Sr(false);
                    this.f101966Q.mo82952Ty(true);
                    this.f101966Q.mo82980ga(false);
                } else {
                    this.f101966Q.mo82952Ty(false);
                    this.f101966Q.mo82980ga(true);
                }
            } else {
                this.f101966Q.mo82952Ty(false);
                this.f101966Q.mo82980ga(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ot */
    private void m108268ot(String str, boolean z11) {
        try {
            int i11 = C21933s.m114404I().f107899Z.f107998d;
            List<C31874cb> list = C21933s.f107868q0;
            int min = Math.min(i11, list.size());
            ArrayList arrayList = new ArrayList();
            for (C31874cb c31874cb : list) {
                if (!c31874cb.f146385a.equals(str)) {
                    arrayList.add(c31874cb);
                }
                if (arrayList.size() == min) {
                    break;
                }
            }
            C2993j3 m123082j = this.f101666O.m123082j();
            m123082j.m14196g(z11);
            m123082j.m14195f(true);
            m123082j.m14194e(arrayList);
            m108282Dr(m123082j);
            AbstractC23304d.f113369c1 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pr */
    private void m108269pr(C23927b c23927b) {
        String str;
        if (this.f101978W != null) {
            if (c23927b.f115598b.equals("action.open.galary")) {
                str = C32017m4.m154326S().m154356d(this.f101978W.m154284u(26));
            } else if (c23927b.f115598b.equals("action.open.profile.albumdetail")) {
                str = C32017m4.m154326S().m154352b(this.f101978W.m154284u(27));
            } else {
                str = "";
            }
            AbstractC23647d.m123897g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pt */
    public void m108270pt(final int i11, final int i12) {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.r2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108250ct(i11, i12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qt */
    public void m108271qt(final boolean z11) {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.l2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108252dt(z11);
            }
        });
    }

    /* renamed from: rs */
    private int m108272rs() {
        if (m108204Js()) {
            Boolean bool = (Boolean) new C29186c().m101509a(new C29186c.a(this.f101968R));
            if (bool != null && bool.booleanValue()) {
                return 20;
            }
            return 21;
        }
        return -1;
    }

    /* renamed from: tr */
    private void m108273tr(C32002l4 c32002l4) {
        if (c32002l4 != null) {
            this.f101978W.m154273c(c32002l4);
        }
    }

    /* renamed from: vs */
    private ContactProfile.C7873i m108274vs() {
        ContactProfile.C7872h c7872h;
        ContactProfile.C7873i c7873i = new ContactProfile.C7873i();
        if (C28011a4.m141160b().m141161a(this.f101968R) != null && (c7872h = C28011a4.m141160b().m141161a(this.f101968R).f42489w) != null) {
            return c7872h.m40467c();
        }
        return c7873i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wt */
    public void m108275wt() {
        String str;
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            str = contactProfile.f42437s;
        } else {
            str = "";
        }
        this.f101966Q.mo86230P5(str, this.f101939A0);
    }

    /* renamed from: zt */
    private void m108276zt() {
        if (this.f101958J1) {
            this.f101958J1 = false;
            if (mo107643H6() && this.f101966Q.mo45894h0()) {
                if (m108207Ks()) {
                    C32065p8.m154684c().m154696k();
                } else {
                    m108266lt(this.f101956I1, false);
                }
            }
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ah */
    public void mo107662Ah(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (i11 == -1) {
                int mo92862f = interfaceC17463d.mo92862f();
                if (mo92862f != 7) {
                    if (mo92862f != 10) {
                        if (mo92862f != 22) {
                            if (mo92862f != 25) {
                                if (mo92862f != 14) {
                                    if (mo92862f == 15) {
                                        interfaceC17463d.dismiss();
                                        ContactProfile contactProfile = this.f101963N0;
                                        if (contactProfile != null) {
                                            m108306Ut(contactProfile, true);
                                        }
                                    }
                                } else {
                                    interfaceC17463d.dismiss();
                                    m108294Mt(Integer.parseInt(this.f101968R));
                                }
                            } else {
                                interfaceC17463d.dismiss();
                                ContactProfile contactProfile2 = this.f101963N0;
                                if (contactProfile2 != null) {
                                    m108324nr(contactProfile2, 9);
                                    C21914b c21914b = C21914b.f107731a;
                                    if (c21914b.m114200k(this.f101963N0.f42434r)) {
                                        c21914b.m114202m(this.f101963N0.f42434r, 9, null);
                                    }
                                }
                            }
                        } else {
                            interfaceC17463d.dismiss();
                            this.f101966Q.finish();
                        }
                    } else {
                        interfaceC17463d.dismiss();
                        ContactProfile contactProfile3 = this.f101963N0;
                        if (contactProfile3 != null) {
                            m108331rr(contactProfile3);
                        }
                    }
                } else {
                    interfaceC17463d.dismiss();
                }
            } else if (i11 == -2) {
                int mo92862f2 = interfaceC17463d.mo92862f();
                if (mo92862f2 != 7) {
                    if (mo92862f2 != 10) {
                        if (mo92862f2 == 23) {
                            interfaceC17463d.dismiss();
                            ContactProfile contactProfile4 = this.f102009l1;
                            if (contactProfile4 != null && !TextUtils.isEmpty(contactProfile4.f42434r)) {
                                ContactProfile contactProfile5 = new ContactProfile(this.f102009l1.f42434r);
                                ContactProfile contactProfile6 = this.f102009l1;
                                contactProfile5.f42446v = contactProfile6.f42446v;
                                contactProfile5.f42455y = contactProfile6.f42455y;
                                contactProfile5.f42437s = contactProfile6.f42437s;
                                contactProfile5.f42437s = contactProfile5.m40383Q(true, false);
                                this.f101966Q.mo86289vr(contactProfile5);
                            }
                        }
                    } else {
                        interfaceC17463d.dismiss();
                        this.f101966Q.mo82218f5();
                    }
                } else {
                    interfaceC17463d.dismiss();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: As */
    void m108277As(String str) {
        ArrayList arrayList;
        if (!TextUtils.isEmpty(str) && (arrayList = this.f101671w) != null && arrayList.size() != 0) {
            try {
                Iterator it = this.f101671w.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (c3000l0 != null && c3000l0.f11895q.equals(str)) {
                        it.remove();
                        mo107650fc();
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: At */
    public void m108278At(String str, int i11) {
        String str2;
        if (this.f102015o1) {
            return;
        }
        TrackingSource m114310H = C21927m.m114302u().m114310H(str);
        if (m114310H != null) {
            str2 = m114310H.m40682o();
        } else {
            str2 = "";
        }
        String str3 = str2;
        if (i11 == -1 || i11 == 30 || i11 == 10) {
            String m42229P6 = C7960e.m41971c6().m42229P6(str);
            if (!TextUtils.isEmpty(m42229P6)) {
                try {
                    i11 = new JSONObject(m42229P6).optInt("srcType", i11);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
        int i12 = i11;
        this.f102015o1 = true;
        this.f101652A.mo112376r(str, "", i12, 0, str3, this.f102017p1);
    }

    /* renamed from: B0 */
    void m108279B0(ContactProfile contactProfile, boolean z11) {
        try {
            this.f101966Q.mo46829Y();
            this.f101652A.mo112349B0(contactProfile.f42434r, 29, new n(contactProfile, z11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Bt */
    void m108280Bt(boolean z11) {
        C2993j3 m123082j = this.f101666O.m123082j();
        m123082j.m14196g(z11);
        m108282Dr(m123082j);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: C0 */
    public void mo107663C0() {
        String mo107725t3 = mo107725t3();
        if (!TextUtils.isEmpty(mo107725t3)) {
            new C25453e().m101508a(new C25453e.b(mo107725t3, GlobalScope.f105887p, new q(mo107725t3)));
        } else {
            m108270pt(0, 300);
            m108271qt(false);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Cf */
    public void mo107664Cf() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108324nr(contactProfile, 9);
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Cl */
    public void mo107638Cl() {
        String str;
        if (C32065p8.m154684c().m154691f()) {
            str = "800503";
        } else {
            str = "800504";
        }
        AbstractC23647d.m123897g(str);
        m108290Kt(false);
        m107760Aq(false);
        this.f101966Q.mo82950Te(false);
    }

    /* renamed from: Cr */
    protected void m108281Cr(C2983h3 c2983h3) {
        this.f101666O.m123090r(c2983h3);
        m107790vq();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: D3 */
    public void mo107665D3() {
        m108267mt();
        m108271qt(m107783jq(this.f101949F0));
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Di */
    public void mo107640Di(int i11) {
        try {
            m107794zq(false);
            if (i11 != 400) {
                if (i11 != 500) {
                    if (i11 != 600) {
                        if (i11 != 700) {
                            if (i11 == 800) {
                                this.f101966Q.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description));
                            }
                        }
                    }
                }
                this.f101966Q.mo86287uu(false);
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_load_music_failed));
            m108328os();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Dr */
    protected void m108282Dr(C2993j3 c2993j3) {
        this.f101666O.m123091s(c2993j3);
        m107790vq();
    }

    /* renamed from: Ds */
    boolean m108283Ds() {
        try {
            ArrayList arrayList = new ArrayList();
            if (mo107673Kf() != null && AbstractC0924m0.m3746da()) {
                arrayList.addAll(AbstractC28025b8.m141459o("tip.profile.privacyshortcut"));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131580f) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: Dt */
    void m108284Dt() {
        try {
            C0824j.m2153b(new k());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: E */
    public void mo107641E() {
        try {
            if (C23055e5.m118271f()) {
                m108315fs(true, false);
                ContactProfile contactProfile = this.f101963N0;
                if (contactProfile != null) {
                    if (contactProfile.m40387S0()) {
                        m108313ds(true);
                        return;
                    }
                    if (!this.f101977V0 && !this.f101990c0) {
                        m108312cs();
                    }
                    this.f101992d0 = "0";
                    this.f101669u = true;
                    m108311bs(CoreUtility.f89233i, this.f101968R, "0", false);
                    mo107773Yp(this.f101968R);
                    return;
                }
                return;
            }
            m107770Tp(new C2977g2(5));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: E1 */
    public void mo107666E1() {
        if (!C24346a.f117452a.m127220c(this.f101962M0)) {
            this.f101962M0 = C24355e0.f117560a.m127356d();
            this.f101966Q.mo70710wy(new Runnable() { // from class: iq.i2
                @Override // java.lang.Runnable
                public final void run() {
                    C20765w2.this.m108237Ws();
                }
            });
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ee */
    public void mo107667Ee() {
        m108346xs();
    }

    /* renamed from: Eg */
    void m108285Eg(String str) {
        if (this.f102029v1) {
            return;
        }
        this.f101966Q.mo46829Y();
        l lVar = new l(str);
        this.f102029v1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        this.f101652A.mo112378s0(arrayList, lVar);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ek */
    public void mo107668Ek(MultiStateView.EnumC15914e enumC15914e) {
        this.f101954H1 = enumC15914e;
    }

    /* renamed from: Er */
    void m108286Er(String str) {
        SpannableString spannableString;
        if (this.f102026u0 < 1) {
            this.f101966Q.mo86220IC(null);
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_details);
        v vVar = new v();
        if (this.f102026u0 == 1) {
            spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_friend_request_mutual_group, ((C32020m7) C19637j.f97466a.m102868t(str, this.f101963N0.m40383Q(true, false)).get(0)).f147413d.m153793y(), m118743r0));
        } else {
            spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_friend_request_mutual_group, AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_friend_request_multiple_mutual_group, String.valueOf(C19637j.f97466a.m102869v(str))), m118743r0));
        }
        spannableString.setSpan(vVar, spannableString.length() - m118743r0.length(), spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(1), spannableString.length() - m118743r0.length(), spannableString.length(), 33);
        this.f101966Q.mo86220IC(spannableString);
    }

    /* renamed from: Es */
    boolean m108287Es() {
        try {
            ArrayList arrayList = new ArrayList();
            if (mo107673Kf() != null) {
                if (C18631a.m98447m(mo107673Kf().f42434r)) {
                    arrayList.addAll(AbstractC28025b8.m141459o("tip.profile.rightmenu.setalias"));
                }
                arrayList.addAll(AbstractC28025b8.m141459o("tip.profile.setting.noti"));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131580f) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        ArrayList arrayList = this.f101671w;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: F3 */
    public void mo107669F3() {
        ContactProfile contactProfile;
        this.f101966Q.mo86218Gf(this.f101968R, this.f101945D0);
        this.f101665N = this.f101968R;
        this.f101654C = true;
        this.f101966Q.mo83000qh();
        m108288Fr(this.f101986a0);
        mo107650fc();
        m107786qq();
        if (C23055e5.m118271f()) {
            m108315fs(false, true);
            m108312cs();
            return;
        }
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f101968R);
        this.f101963N0 = m141809c;
        if (m141809c == null && (contactProfile = this.f101986a0) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            this.f101963N0 = this.f101986a0;
        }
        this.f101979W0 = true;
        m108288Fr(this.f101963N0);
        this.f101966Q.mo82971a0();
        ContactProfile contactProfile2 = this.f101963N0;
        if (contactProfile2 != null && contactProfile2.m40387S0()) {
            m107770Tp(new C2977g2(5));
        } else if (!this.f101670v && m107781hq() && !this.f101988b0) {
            m107770Tp(new C2977g2(5));
        }
        ContactProfile contactProfile3 = this.f101963N0;
        if (contactProfile3 != null && contactProfile3.m40387S0()) {
            AbstractC23647d.m123906p("8000");
            AbstractC23647d.m123893c();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: F4 */
    public boolean mo107670F4() {
        if (this.f101966Q.mo86262jC() || this.f101966Q.mo86269mc() || mo107673Kf() == null || !C18631a.m98447m(mo107673Kf().f42434r)) {
            return false;
        }
        return true;
    }

    /* renamed from: Fr */
    public void m108288Fr(ContactProfile contactProfile) {
        try {
            if (contactProfile != null) {
                if (contactProfile.m40387S0()) {
                    m108193Gr(contactProfile);
                } else {
                    ContactProfile contactProfile2 = this.f101963N0;
                    if (contactProfile2 != null && !contactProfile2.f42434r.equals("") && !this.f101963N0.f42434r.equalsIgnoreCase("null")) {
                        m108203Jr(contactProfile);
                    }
                }
            } else {
                m108200Ir();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ik */
    public void mo107671Ik() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108340ut(contactProfile);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* renamed from: It */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m108289It(boolean z11) {
        boolean z12;
        boolean z13;
        String str;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_friend_nofeed);
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42437s)) {
            ContactProfile contactProfile2 = this.f101963N0;
            m118743r0 = String.format(m118743r0, AbstractC21935u.m114542i(contactProfile2.f42434r, contactProfile2.f42437s));
            z12 = AbstractC21935u.m114558y(this.f101963N0.f42434r);
            if (this.f101963N0.f42352K0 > 0 || C21927m.m114302u().m114318P(this.f101963N0.f42434r)) {
                z13 = true;
                if (z13 && !z12 && !this.f102016p0 && !this.f102010m0) {
                    m108268ot(this.f101968R, this.f102030w0);
                    if (this.f101652A.mo112426z0()) {
                        m108302Rt(true);
                        m108268ot(this.f101968R, this.f102030w0);
                    } else {
                        m108280Bt(false);
                    }
                    m107770Tp(new C2977g2(0));
                    this.f101966Q.mo86225Mw(false);
                    m107769Sp(new C3010n0(0));
                    return;
                }
                if (!this.f101983Y0) {
                    this.f101983Y0 = false;
                    if (z13) {
                        this.f101987a1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_vip_nofeed);
                    } else {
                        if (!z12) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_norighttoview);
                        }
                        this.f101987a1 = m118743r0;
                    }
                } else if (!z12) {
                    if (z13) {
                        this.f101987a1 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_vip_nofeed);
                    } else {
                        ContactProfile contactProfile3 = this.f101963N0;
                        if (contactProfile3 != null) {
                            str = contactProfile3.m40383Q(true, false);
                        } else {
                            str = "";
                        }
                        this.f101987a1 = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_nofriend_nofeed), str);
                    }
                } else {
                    this.f101987a1 = m118743r0;
                }
                this.f101989b1 = z11;
                mo107650fc();
                if (C23055e5.m118271f()) {
                    m107770Tp(new C2977g2(5));
                } else {
                    m107769Sp(new C3010n0(0));
                }
                m108302Rt(false);
                m108197Hs(false);
            }
        } else {
            z12 = false;
        }
        z13 = false;
        if (z13) {
        }
        if (!this.f101983Y0) {
        }
        this.f101989b1 = z11;
        mo107650fc();
        if (C23055e5.m118271f()) {
        }
        m108302Rt(false);
        m108197Hs(false);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Jn */
    public void mo107672Jn() {
        m108346xs();
        AbstractC23647d.m123906p("7812");
        AbstractC23647d.m123893c();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Kf */
    public ContactProfile mo107673Kf() {
        return this.f101963N0;
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Km */
    public void mo107674Km(boolean z11) {
        m108279B0(this.f101963N0, z11);
        if (z11) {
            AbstractC23647d.m123906p("300018201");
            AbstractC23647d.m123893c();
        } else {
            AbstractC23647d.m123906p("300018200");
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: Kt */
    public void m108290Kt(boolean z11) {
        C32065p8.m154684c().m154701r(z11);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: L3 */
    public void mo107675L3() {
        ContactProfile contactProfile;
        String str;
        if (this.f101669u && !this.f101670v && !m108209Ls() && this.f101671w != null && (contactProfile = this.f101963N0) != null) {
            if (contactProfile.m40387S0()) {
                str = "8560";
            } else {
                str = "7560";
            }
            AbstractC23647d.m123907q(str, this.f101966Q.mo86293y());
            AbstractC23647d.m123893c();
            m108311bs(CoreUtility.f89233i, this.f101963N0.f42434r, this.f101992d0, false);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ll */
    public void mo107676Ll() {
        this.f101966Q.mo86290xl(m108283Ds());
    }

    /* renamed from: Lr */
    void m108291Lr() {
        if (this.f102028v0 > 0) {
            String lowerCase = AbstractC23160o0.m119210O0(System.currentTimeMillis(), this.f102028v0 * 1000, Boolean.TRUE, Boolean.FALSE).toLowerCase();
            if (TextUtils.equals(lowerCase, AbstractC23136l9.m118743r0(AbstractC8020f0.str_today).toLowerCase())) {
                this.f101966Q.mo86268ls(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stranger_friend_request_time_join_today));
                return;
            } else {
                this.f101966Q.mo86268ls(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_friend_request_time_join, lowerCase));
                return;
            }
        }
        this.f101966Q.mo86268ls("");
    }

    /* renamed from: Lt */
    void m108292Lt(String str) {
        if (this.f101991c1) {
            return;
        }
        this.f101991c1 = true;
        this.f101966Q.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        a0 a0Var = new a0(str);
        TrackingSource trackingSource = new TrackingSource(-1);
        trackingSource.m40677a("sourceView", 5);
        this.f101652A.mo112381u(str, trackingSource.m40682o(), a0Var);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: M1 */
    public void mo107677M1() {
        String str;
        if (C32065p8.m154684c().m154691f()) {
            str = "800501";
        } else {
            str = "800502";
        }
        AbstractC23647d.m123897g(str);
        this.f101966Q.mo86287uu(true);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ml */
    public boolean mo107678Ml() {
        if (!this.f101966Q.mo86262jC() && !this.f101966Q.mo86269mc()) {
            return true;
        }
        return false;
    }

    /* renamed from: Ms */
    boolean m108293Ms() {
        int mo112425y0 = this.f101652A.mo112425y0();
        if (mo112425y0 == 1 || mo112425y0 == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: Mt */
    void m108294Mt(int i11) {
        try {
            if (this.f101997f1) {
                return;
            }
            this.f101966Q.mo46829Y();
            this.f101997f1 = true;
            this.f101652A.mo112371m(i11, this.f101999g1, new TrackingSource(-1));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        C20661b4 c20661b4 = (C20661b4) interfaceC19969h;
        if (c20661b4 != null) {
            String str = c20661b4.f101620a;
            this.f101968R = str;
            this.f101970S = c20661b4.f101621b;
            boolean z11 = c20661b4.f101622c;
            this.f101972T = z11;
            this.f101974U = c20661b4.f101623d;
            this.f101976V = c20661b4.f101624e;
            this.f101980X = c20661b4.f101626g;
            this.f101982Y = c20661b4.f101627h;
            this.f101984Z = c20661b4.f101628i;
            this.f101986a0 = c20661b4.f101629j;
            this.f102036z0 = c20661b4.f101630k;
            this.f101953H0 = c20661b4.f101631l;
            AbstractC23304d.f113390h0 = str;
            if (z11) {
                AbstractC23304d.f113383f1 = false;
            }
            m108273tr(c20661b4.f101625f);
        }
        this.f101940A1 = this.f101652A.mo112418q();
        m108299Qr();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ni */
    public void mo107679Ni() {
        mo107720qj(false);
        m108332rt(true);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: O8 */
    public void mo107680O8() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            this.f101966Q.mo86242au(contactProfile.f42434r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:4:0x0016, B:6:0x001a, B:9:0x0022, B:12:0x002f, B:14:0x0037, B:16:0x003f, B:17:0x0058, B:19:0x005c, B:21:0x006f, B:23:0x0075, B:24:0x007a, B:26:0x0083, B:27:0x0108, B:31:0x0088, B:33:0x009b, B:35:0x009f, B:36:0x00f4, B:38:0x00fd, B:40:0x0103, B:41:0x00a3, B:43:0x00be, B:45:0x00c4, B:46:0x00cb, B:48:0x00cf, B:49:0x00d2, B:50:0x00db, B:51:0x00df, B:53:0x0045, B:55:0x0049, B:59:0x0055), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:2:0x0000, B:4:0x0016, B:6:0x001a, B:9:0x0022, B:12:0x002f, B:14:0x0037, B:16:0x003f, B:17:0x0058, B:19:0x005c, B:21:0x006f, B:23:0x0075, B:24:0x007a, B:26:0x0083, B:27:0x0108, B:31:0x0088, B:33:0x009b, B:35:0x009f, B:36:0x00f4, B:38:0x00fd, B:40:0x0103, B:41:0x00a3, B:43:0x00be, B:45:0x00c4, B:46:0x00cb, B:48:0x00cf, B:49:0x00d2, B:50:0x00db, B:51:0x00df, B:53:0x0045, B:55:0x0049, B:59:0x0055), top: B:1:0x0000 }] */
    /* renamed from: Or */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m108295Or(String str) {
        boolean z11;
        boolean z12;
        try {
            boolean m114558y = AbstractC21935u.m114558y(str);
            this.f102010m0 = C21927m.m114302u().m114312J().m153137g(str);
            if (!m114558y) {
                ContactProfile contactProfile = this.f101963N0;
                if (contactProfile != null) {
                    if (contactProfile.f42352K0 <= 0) {
                    }
                }
                if (!C21927m.m114302u().m114318P(str)) {
                    z11 = true;
                    this.f102032x0 = z11;
                    if (TextUtils.isEmpty(str) && str.equals(CoreUtility.f89233i)) {
                        m108316gs(false);
                    } else {
                        if (!m114558y && (!this.f102032x0 || !C18631a.m98446i().f93750b)) {
                            z12 = false;
                            m108316gs(z12);
                        }
                        z12 = true;
                        m108316gs(z12);
                    }
                    if (this.f102010m0) {
                        this.f101966Q.mo86226My(false);
                        this.f101966Q.mo86246cw(true);
                        this.f101966Q.mo86273nE(false);
                        ContactProfile contactProfile2 = this.f101963N0;
                        if (contactProfile2 != null && !contactProfile2.m40387S0()) {
                            this.f101966Q.mo86225Mw(true);
                        }
                        this.f101966Q.mo86212Ds(false);
                        if (this.f102014o0) {
                            m108289It(false);
                        }
                    } else {
                        this.f101966Q.mo86226My(true);
                        this.f101966Q.mo86246cw(false);
                        this.f101966Q.mo86273nE(false);
                        if (this.f102032x0) {
                            if (this.f102016p0) {
                                mo107723s5(str);
                            } else {
                                this.f101966Q.mo86212Ds(false);
                                m107768Rp(new C3054x(false));
                                this.f101966Q.mo86273nE(true);
                                this.f101966Q.mo86226My(false);
                                if (!this.f102014o0) {
                                    if (this.f101954H1 != MultiStateView.EnumC15914e.ERROR) {
                                        m108268ot(this.f101968R, this.f102030w0);
                                    }
                                    if (this.f101979W0) {
                                        m108302Rt(true);
                                    }
                                    m108280Bt(false);
                                    this.f101966Q.mo86225Mw(false);
                                } else {
                                    m108289It(true);
                                }
                            }
                        } else {
                            this.f101966Q.mo86212Ds(false);
                            m108302Rt(false);
                            m108197Hs(false);
                            this.f101966Q.mo86273nE(false);
                            this.f101966Q.mo86226My(true);
                        }
                        this.f101966Q.mo86250de();
                        ContactProfile contactProfile3 = this.f101963N0;
                        if (contactProfile3 != null && !contactProfile3.m40387S0()) {
                            this.f101966Q.mo86225Mw(true);
                        }
                    }
                    m108284Dt();
                    m108190Fs();
                }
            }
            z11 = false;
            this.f102032x0 = z11;
            if (TextUtils.isEmpty(str)) {
            }
            if (!m114558y) {
                z12 = false;
                m108316gs(z12);
                if (this.f102010m0) {
                }
                m108284Dt();
                m108190Fs();
            }
            z12 = true;
            m108316gs(z12);
            if (this.f102010m0) {
            }
            m108284Dt();
            m108190Fs();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Os */
    boolean m108296Os() {
        if (this.f101963N0 != null) {
            return C21927m.m114302u().m114318P(this.f101963N0.f42434r);
        }
        return false;
    }

    /* renamed from: Ot */
    void m108297Ot() {
        this.f101966Q.mo86276ou(this.f101963N0, false, this.f102032x0, this.f101945D0, this.f102016p0);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: P0 */
    public void mo107681P0() {
        boolean z11;
        try {
            boolean m154691f = C32065p8.m154684c().m154691f();
            if (m108207Ks() && m154691f) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f101958J1 = z11;
            this.f101956I1 = C32065p8.m154684c().m154688b();
            m108290Kt(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Pf */
    public void mo107682Pf() {
        ContactProfile m141809c;
        if (AbstractC23063f2.m118359k(mo107696Ya())) {
            m108292Lt(this.f101968R);
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null && contactProfile.f42434r.equals(this.f101968R)) {
            m141809c = this.f101963N0;
        } else {
            m141809c = C28203u6.f131407a.m141809c(this.f101968R);
        }
        this.f102009l1 = m141809c;
        m108339us(this.f101968R, false);
        AbstractC23647d.m123906p("7813");
        AbstractC23647d.m123893c();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Pm */
    public void mo107683Pm() {
        this.f101966Q.mo86259gk(m108287Es());
    }

    /* renamed from: Pr */
    void m108298Pr(final String str) {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.o2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108217Ps(str);
            }
        });
    }

    /* renamed from: Qr */
    void m108299Qr() {
        try {
            if (C21927m.m114302u().m114367y() != null) {
                boolean z11 = false;
                for (int i11 = 0; i11 < C21927m.m114302u().m114367y().size(); i11++) {
                    C32035n7 c32035n7 = (C32035n7) C21927m.m114302u().m114367y().get(i11);
                    if (c32035n7 != null && !TextUtils.isEmpty(c32035n7.m154511b()) && c32035n7.m154511b().equals(this.f101968R) && c32035n7.m154510a() >= 0 && c32035n7.f147507c == 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (c32035n7.m154510a() == 0) {
                            c32035n7.m154512c(currentTimeMillis);
                        }
                        ((C32035n7) C21927m.m114302u().m114367y().get(i11)).f147507c = currentTimeMillis;
                        c32035n7.f147507c = currentTimeMillis;
                        z11 = true;
                    }
                }
                if (z11) {
                    C21927m.m114302u().m114370z0();
                    C18644n.m98524E();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Qt */
    void m108300Qt() {
        C2991j1 m123080h = this.f101666O.m123080h();
        m123080h.m14185g(AbstractC23063f2.m118359k(mo107696Ya()));
        m108185Br(m123080h);
    }

    /* renamed from: Rr */
    void m108301Rr() {
        String upperCase;
        try {
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile != null && contactProfile.m40387S0()) {
                this.f101966Q.mo86225Mw(false);
                if (this.f101969R0 != null) {
                    boolean m108296Os = m108296Os();
                    C3037s2 c3037s2 = this.f101969R0;
                    if (m108296Os) {
                        upperCase = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_send_msg);
                    } else {
                        upperCase = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_vip_follow).toUpperCase();
                    }
                    c3037s2.f12236a = upperCase;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Rt */
    void m108302Rt(boolean z11) {
        String str;
        ContactProfile m141809c = C28203u6.f131407a.m141809c(mo107696Ya());
        String str2 = "";
        if (m141809c == null || TextUtils.isEmpty(m141809c.m40383Q(true, false))) {
            str = "";
        } else {
            str = m141809c.m40383Q(true, false);
        }
        C2991j1 m123080h = this.f101666O.m123080h();
        m123080h.m14184f(str);
        m123080h.m14183e(mo107696Ya());
        m123080h.m14186h(z11);
        m123080h.m14185g(AbstractC23063f2.m118359k(mo107696Ya()));
        if (m141809c != null) {
            m123080h.m14187i(m141809c.m40357A0());
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null && !contactProfile.m40357A0() && !C18644n.m98531l().m98558u(this.f101963N0.f42434r)) {
            str2 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_description_can_not_view_profile_non_ba, this.f101945D0);
        }
        m123080h.m14182d(str2);
        m108185Br(m123080h);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: S7 */
    public void mo107684S7() {
        m108317gt();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: S8 */
    public void mo107685S8() {
        m108334st(this.f101968R);
        AbstractC23647d.m123906p("7811");
        AbstractC23647d.m123893c();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Si */
    public void mo107686Si() {
        m108332rt(true);
        if (!C23055e5.m118271f()) {
            ((InterfaceC20656b) m103742Dp()).mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        } else {
            ((InterfaceC20656b) m103742Dp()).mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Sl */
    public String mo107687Sl() {
        ContactProfile.C7871g m40466b;
        try {
            if (C28011a4.m141160b().m141161a(this.f101968R) == null || C28011a4.m141160b().m141161a(this.f101968R).f42489w == null || (m40466b = C28011a4.m141160b().m141161a(this.f101968R).f42489w.m40466b()) == null || !m40466b.m40463f()) {
                return "";
            }
            return m40466b.m40464g().toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: T0 */
    public C24902e mo107688T0() {
        return this.f101949F0;
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Te */
    public String mo107689Te() {
        return this.f101939A0;
    }

    /* renamed from: Tr */
    void m108303Tr() {
        try {
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile == null || contactProfile.m40387S0()) {
                this.f101966Q.mo86225Mw(false);
                this.f101976V = 20;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Tt */
    void m108304Tt() {
        try {
            this.f101966Q.mo86238Yf(this.f101994e0, this.f102002i0, this.f102004j0, this.f102006k0, this.f101998g0, this.f101996f0, this.f102000h0, this.f101963N0, false, this.f102032x0, this.f101943C0, this.f102016p0, this.f102008l0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: U2 */
    public void mo107690U2() {
        this.f101966Q.mo86279qi(this.f101963N0, 691);
    }

    /* renamed from: Ur */
    void m108305Ur() {
        try {
            if (!TextUtils.isEmpty(this.f101968R) && !this.f101968R.equalsIgnoreCase("null")) {
                m108314es(this.f101968R);
                m108295Or(this.f101968R);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ut */
    public void m108306Ut(ContactProfile contactProfile, boolean z11) {
        try {
            this.f101950F1 = z11;
            if (C26446c.m136326b().m136329d()) {
                contactProfile.f42373R0 = this.f102018q0;
                String m40378N = contactProfile.m40378N();
                if (!TextUtils.isEmpty(this.f102020r0)) {
                    m40378N = m108256ft(this.f102020r0);
                }
                this.f101966Q.mo86229OA(contactProfile.m40373K(), m40378N);
                return;
            }
            m108327or(contactProfile, z11);
        } catch (Exception unused) {
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: V */
    public void mo107691V(int i11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ContactProfile m141809c;
        try {
            if (i11 != 1) {
                if (i11 != 33) {
                    switch (i11) {
                        case 3:
                            if (this.f101966Q.mo86233R4()) {
                                str3 = "870011";
                            } else {
                                str3 = "8220";
                            }
                            AbstractC23647d.m123907q(str3, this.f101966Q.mo86293y());
                            this.f101966Q.mo86267lc(this.f101963N0);
                            AbstractC23647d.m123893c();
                            return;
                        case 4:
                            if (this.f101966Q.mo86233R4()) {
                                str4 = "870012";
                            } else {
                                str4 = "8230";
                            }
                            AbstractC23647d.m123907q(str4, this.f101966Q.mo86293y());
                            this.f101966Q.mo86214Ej(this.f101963N0, this.f101968R);
                            AbstractC23647d.m123893c();
                            return;
                        case 5:
                            AbstractC23647d.m123907q("7210", this.f101966Q.mo86293y());
                            this.f101966Q.mo86227NH(this.f101963N0);
                            AbstractC23647d.m123893c();
                            return;
                        case 6:
                            ContactProfile contactProfile = this.f101963N0;
                            if (contactProfile != null) {
                                m108324nr(contactProfile, 9);
                                return;
                            }
                            return;
                        case 7:
                            AbstractC23647d.m123907q("7220", this.f101966Q.mo86293y());
                            this.f101966Q.mo86232QB(m108308Yr(7));
                            AbstractC23647d.m123893c();
                            AbstractC23647d.m123906p("300018101");
                            AbstractC23647d.m123893c();
                            return;
                        case 8:
                            ContactProfile contactProfile2 = this.f101963N0;
                            if (contactProfile2 != null) {
                                m108323ms(contactProfile2.f42434r);
                                return;
                            }
                            return;
                        case 9:
                            ContactProfile contactProfile3 = this.f101963N0;
                            if (contactProfile3 != null) {
                                m108325ns(contactProfile3.f42434r);
                                return;
                            }
                            return;
                        case 10:
                            m108322ls(Integer.parseInt(this.f101968R), null);
                            if (this.f101966Q.mo86233R4()) {
                                str5 = "870014";
                            } else {
                                str5 = "8250";
                            }
                            AbstractC23647d.m123906p(str5);
                            AbstractC23647d.m123893c();
                            return;
                        case 11:
                            this.f101966Q.mo86232QB(m108308Yr(14));
                            if (this.f101966Q.mo86233R4()) {
                                str6 = "870015";
                            } else {
                                str6 = "8260";
                            }
                            AbstractC23647d.m123906p(str6);
                            AbstractC23647d.m123893c();
                            return;
                        case 12:
                            ContactProfile contactProfile4 = this.f101963N0;
                            if (contactProfile4 != null && contactProfile4.f42434r.equals(this.f101968R)) {
                                m141809c = this.f101963N0;
                            } else {
                                m141809c = C28203u6.f131407a.m141809c(this.f101968R);
                            }
                            this.f102009l1 = m141809c;
                            if (AbstractC23063f2.m118359k(this.f101968R)) {
                                m108346xs();
                                return;
                            } else {
                                m108339us(this.f101968R, false);
                                return;
                            }
                        case 13:
                            C0815e1.m2075D().m2100V(new C23648e(27, "social_profile_right_menu", 0, "tap_option_share_name_card", new String[0]), false);
                            this.f101966Q.mo86267lc(this.f101963N0);
                            return;
                        case 14:
                            this.f101966Q.mo86241an(this.f101963N0);
                            return;
                        case 15:
                            ContactProfile contactProfile5 = this.f101963N0;
                            if (contactProfile5 != null) {
                                m108330qr(contactProfile5.f42434r);
                                return;
                            }
                            return;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            ContactProfile contactProfile6 = this.f101963N0;
                            if (contactProfile6 != null) {
                                m108336tt(contactProfile6.f42434r);
                                return;
                            }
                            return;
                        case 17:
                            ContactProfile contactProfile7 = this.f101963N0;
                            if (contactProfile7 != null) {
                                m108333sr(contactProfile7);
                                return;
                            }
                            return;
                        case 18:
                            ContactProfile contactProfile8 = this.f101963N0;
                            if (contactProfile8 != null) {
                                m108340ut(contactProfile8);
                                return;
                            }
                            return;
                        case 19:
                            ContactProfile contactProfile9 = this.f101963N0;
                            if (contactProfile9 != null) {
                                this.f101966Q.mo86279qi(contactProfile9, IMediaPlayer.MEDIA_INFO_BUFFERING_EMPTY);
                                this.f101966Q.mo82966Y4("tip.profile.rightmenu.setalias");
                                this.f101966Q.mo82218f5();
                                return;
                            }
                            return;
                        case 20:
                            mo107700b6();
                            return;
                        case 21:
                            mo107680O8();
                            return;
                        default:
                            return;
                    }
                }
                this.f101966Q.mo86247dB(this.f101963N0);
                if (this.f101966Q.mo86233R4()) {
                    str2 = "870013";
                } else {
                    str2 = "8270";
                }
                AbstractC23647d.m123906p(str2);
                AbstractC23647d.m123893c();
                return;
            }
            ContactProfile contactProfile10 = this.f101963N0;
            if (contactProfile10 != null) {
                if (contactProfile10.m40387S0()) {
                    if (this.f101966Q.mo86233R4()) {
                        str = "870016";
                    } else {
                        str = "8240";
                    }
                } else {
                    str = "7230";
                }
                AbstractC23647d.m123907q(str, this.f101966Q.mo86293y());
                AbstractC23647d.m123893c();
            }
            if (this.f101963N0 != null) {
                if (C23493c.m123312j()) {
                    this.f101966Q.mo86224Kx(this.f101963N0.f42434r);
                } else {
                    this.f101966Q.mo86232QB(m108308Yr(9));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: V1 */
    public void mo107692V1() {
        m108304Tt();
        m108201Is();
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Vf */
    public void mo107648Vf(C23927b c23927b) {
        try {
            m107789uq(c23927b, mo107651g().m154285v("pos_qa", Integer.valueOf(this.f101656E.indexOf(c23927b))));
            m108269pr(c23927b);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: X */
    public void mo107693X() {
        if (this.f101966Q.mo45894h0()) {
            m108232Vr(1);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: X2 */
    public void mo107694X2() {
        this.f101966Q.mo86251e7(this.f101968R, this.f101963N0, this.f101939A0, this.f102035y1);
        AbstractC23647d.m123906p("8700");
        AbstractC23647d.m123893c();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Xj */
    public void mo107695Xj() {
        this.f101966Q.mo86227NH(this.f101963N0);
    }

    /* renamed from: Xr */
    void m108307Xr(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.f101671w != null) {
                for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                    if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                        ((C3000l0) this.f101671w.get(i11)).m14322a0().f12059r.m14388a();
                        mo107650fc();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Ya */
    public String mo107696Ya() {
        return this.f101968R;
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: Yd */
    public void mo107697Yd(Object... objArr) {
        if (this.f101966Q.mo45894h0() && !TextUtils.isEmpty(this.f101968R) && objArr.length > 0) {
            if (this.f101968R.equals((String) objArr[0])) {
                this.f101966Q.mo78955kl(new Runnable() { // from class: iq.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20765w2.this.m108242Ys();
                    }
                }, 300L);
            }
        }
    }

    @Override // iq.AbstractC20677f
    /* renamed from: Yp */
    public void mo107773Yp(String str) {
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null && contactProfile.m40387S0()) {
            return;
        }
        super.mo107773Yp(str);
    }

    /* renamed from: Yr */
    public C3038t m108308Yr(int i11) {
        int i12;
        String str;
        C3038t c3038t = new C3038t();
        if (i11 != 7) {
            if (i11 != 18) {
                if (i11 != 25) {
                    if (i11 != 9) {
                        if (i11 != 10) {
                            if (i11 != 22) {
                                if (i11 != 23) {
                                    switch (i11) {
                                        case 13:
                                            c3038t.f12237a = 13;
                                            c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2);
                                            c3038t.f12242f = 4;
                                            c3038t.f12239c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_follow_vip_acc);
                                            c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes);
                                            c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no);
                                            return c3038t;
                                        case 14:
                                            c3038t.f12237a = 14;
                                            c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_unfollow_oa);
                                            c3038t.f12242f = 7;
                                            c3038t.f12239c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_unfollow_vip_acc);
                                            c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_yes_unfollow);
                                            c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_no_unfollow);
                                            return c3038t;
                                        case 15:
                                            c3038t.f12237a = 15;
                                            c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2);
                                            c3038t.f12242f = 4;
                                            c3038t.f12239c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_accept_friend_request_new);
                                            c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_accept_Invitation);
                                            c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_close);
                                            return c3038t;
                                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                            c3038t.f12237a = 16;
                                            c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.zalo);
                                            c3038t.f12239c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_send_friend_request_new);
                                            c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_close);
                                            return c3038t;
                                        default:
                                            return c3038t;
                                    }
                                }
                                c3038t.f12237a = 23;
                                c3038t.f12242f = 5;
                                c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error);
                                c3038t.f12239c = this.f101955I0;
                                c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_send_friend_request_error);
                                c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_sendmes);
                                return c3038t;
                            }
                            int i13 = this.f102034y0;
                            if (i13 == 1) {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_banned_user);
                            } else if (i13 == 2) {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_deleted_user_v2);
                            } else {
                                str = "";
                            }
                            c3038t.f12237a = 22;
                            c3038t.f12242f = 4;
                            c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9);
                            c3038t.f12239c = str;
                            c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.close);
                            return c3038t;
                        }
                        c3038t.f12237a = 10;
                        c3038t.f12242f = 7;
                        c3038t.f12239c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_ignore_zalo_user);
                        c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_popup);
                        c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                        return c3038t;
                    }
                    boolean z11 = !C21927m.m114302u().m114312J().m153137g(String.valueOf(this.f101968R));
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_check_block_user);
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_reportabuseconfirm);
                    C3050w c3050w = new C3050w();
                    c3050w.f12237a = 9;
                    c3050w.f12298g = z11;
                    c3050w.f12299h = m118743r0;
                    c3050w.f12300i = m118743r02;
                    c3050w.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes);
                    c3050w.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_no);
                    return c3050w;
                }
                c3038t.f12237a = 25;
                c3038t.f12242f = 7;
                ContactProfile contactProfile = this.f101963N0;
                if (contactProfile != null && C21914b.f107731a.m114200k(contactProfile.f42434r)) {
                    i12 = AbstractC8020f0.str_content_popup_confirm_unblock_msg_call;
                } else {
                    i12 = AbstractC8020f0.str_content_popup_confirm_unblock;
                }
                c3038t.f12239c = AbstractC23136l9.m118743r0(i12);
                c3038t.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_unblock);
                c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
                return c3038t;
            }
            c3038t.f12237a = 18;
            c3038t.f12238b = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg9);
            c3038t.f12239c = AbstractC23136l9.m118743r0(AbstractC8020f0.str_warningMsgcantuseVoiceCall);
            c3038t.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_close);
            return c3038t;
        }
        C3042u c3042u = new C3042u();
        c3042u.f12237a = 7;
        c3042u.f12242f = 7;
        c3042u.f12239c = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog), mo107673Kf().m40420o0());
        c3042u.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog);
        c3042u.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
        c3042u.f12258h = this.f101652A.mo112415n0();
        c3042u.f12257g = mo107673Kf();
        return c3042u;
    }

    @Override // iq.AbstractC20677f
    /* renamed from: Zp */
    protected void mo107774Zp() {
        boolean z11;
        boolean z12;
        C22012a c22012a;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f101671w;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        if (!arrayList.isEmpty() && this.f101962M0 == null && C24355e0.f117560a.m127361o()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (C22013a0.m114928g() && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        synchronized (this.f101664M) {
            try {
                this.f101666O.m123092b();
                this.f101667P.m117200b();
                if (z11) {
                    this.f101663L = C21909a.m114149b(arrayList, 2);
                    this.f101667P.m117206h(new C3054x(false));
                } else {
                    this.f101663L = new ArrayList();
                    C24880b c24880b = this.f101962M0;
                    if (c24880b != null) {
                        C3054x m107830g = AbstractC20697j.m107830g(c24880b);
                        m107830g.m14656N(1);
                        this.f101667P.m117206h(m107830g);
                        this.f101666O.m123096f(new C2977g2(0));
                        this.f101667P.m117208j(new C3010n0(0));
                    } else if (!TextUtils.isEmpty(this.f101987a1)) {
                        C3054x c3054x = new C3054x();
                        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.ProfilePrimaryBackgroundColor));
                        c3054x.m14650H(this.f101987a1);
                        c3054x.m14661S(AbstractC23136l9.m118742r(16.0f));
                        this.f101667P.m117206h(c3054x);
                        this.f101666O.m123096f(new C2977g2(0));
                        this.f101667P.m117208j(new C3010n0(0));
                    }
                }
                if (z12 && !TextUtils.isEmpty(this.f101665N)) {
                    C31980jc m115161u = AbstractC22055v0.m115161u(this.f101665N);
                    if (m115161u != null && !m115161u.m153831x()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (AbstractC21935u.m114558y(this.f101665N) && z13) {
                        this.f101663L.add(0, new C22012a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_add)));
                        this.f101663L.add(1, new C22014b(this.f101665N));
                    }
                }
                if (this.f101663L.size() > 0 && (this.f101663L.get(0) instanceof C22012a) && (c22012a = (C22012a) this.f101663L.get(0)) != null) {
                    c22012a.f108382M = true;
                }
                if (!this.f101663L.isEmpty()) {
                    this.f101663L.add(new C2966e1((C3000l0) null, (C3020p0) null, 62));
                }
                m108309Zr();
                this.f101663L.addAll(0, this.f101666O.m123093c());
                m107771Wp();
                this.f101663L.addAll(this.f101667P.m117204f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Zr */
    protected void m108309Zr() {
        boolean m14646D = this.f101667P.m117201c().m14646D();
        boolean m107782iq = m107782iq();
        this.f101666O.mo123078a(66);
        this.f101666O.mo123078a(67);
        this.f101666O.mo123078a(69);
        if (!m14646D && !m107782iq) {
            this.f101666O.mo123078a(73);
        }
        if (!m107782iq) {
            this.f101666O.mo123078a(86);
        }
        if (!m14646D && !m107782iq) {
            this.f101666O.mo123078a(79);
            this.f101666O.mo123078a(77);
        }
        this.f101666O.mo123078a(70);
    }

    /* renamed from: as */
    void m108310as(C31874cb c31874cb) {
        try {
            if (!this.f102013n1 && c31874cb != null) {
                this.f102013n1 = true;
                if (c31874cb.f146400p == 3) {
                    AbstractC23074g2.m118375a(1, c31874cb.f146385a, "", 7);
                    this.f102013n1 = false;
                    C21933s.m114404I().m114495v();
                } else {
                    this.f101966Q.mo46829Y();
                    g gVar = new g(c31874cb);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c31874cb);
                    this.f101652A.mo112383w0(arrayList, TrackingSource.m40665d(5), gVar);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: b */
    public void mo107698b(C25470c c25470c) {
        if (c25470c.m131938a("userID")) {
            this.f101968R = c25470c.m131944g("userID", "");
        }
        if (c25470c.m131938a("userID")) {
            this.f101945D0 = c25470c.m131944g("screenName", "");
        }
        if (c25470c.m131938a("fromPlugin")) {
            this.f101972T = c25470c.m131939b("fromPlugin", false);
        }
        if (c25470c.m131938a("no_cover_avatar")) {
            this.f101964O0 = c25470c.m131939b("no_cover_avatar", false);
        }
        this.f102036z0 = false;
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: b0 */
    public void mo107699b0(boolean z11) {
        if (z11) {
            m108317gt();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: b6 */
    public void mo107700b6() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            this.f101966Q.mo86210D8(contactProfile.f42434r);
        }
    }

    /* renamed from: bs */
    void m108311bs(String str, String str2, String str3, boolean z11) {
        int i11;
        try {
            if (this.f101670v) {
                return;
            }
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile != null && contactProfile.m40387S0()) {
                return;
            }
            if (z11) {
                this.f101966Q.mo82997pA();
            }
            this.f101670v = true;
            if (this.f101992d0.equals("0")) {
                i11 = 1;
            } else {
                i11 = this.f101947E0 + 1;
            }
            if (i11 > 1) {
                m107769Sp(new C3010n0(2));
            } else {
                m107769Sp(new C3010n0(0));
            }
            this.f101652A.mo112358Z(str, str2, str3, i11, C32017m4.m154326S().m154380z(this.f101978W), this.f101985Z0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: c */
    public C25470c mo107701c() {
        C25470c c25470c = new C25470c();
        try {
            String str = this.f101968R;
            if (str != null) {
                c25470c.m131950m("userID", str);
            }
            String str2 = this.f101945D0;
            if (str2 != null) {
                c25470c.m131950m("screenName", str2);
            }
            c25470c.m131945h("fromPlugin", this.f101972T);
            c25470c.m131945h("no_cover_avatar", this.f101964O0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c25470c;
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: c2 */
    public void mo107702c2() {
        this.f101966Q.mo82925B4();
    }

    /* renamed from: cs */
    void m108312cs() {
        if (TextUtils.isEmpty(this.f101968R) || this.f101977V0) {
            return;
        }
        this.f101977V0 = true;
        this.f101979W0 = false;
        TrackingSource trackingSource = new TrackingSource(-1);
        this.f101966Q.mo86292xy(this.f101968R);
        this.f101652A.mo112352F(this.f101968R, trackingSource, this.f101981X0);
    }

    /* renamed from: ds */
    void m108313ds(boolean z11) {
        try {
            if (this.f102033x1) {
                return;
            }
            this.f102033x1 = true;
            if (z11) {
                m107770Tp(new C2977g2(1));
            }
            this.f101652A.mo112353I(this.f101968R, this.f102037z1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: e */
    public void mo107703e() {
        String str;
        try {
            if (!C23055e5.m118271f()) {
                this.f101966Q.mo82971a0();
                if (!m107782iq()) {
                    this.f101966Q.mo82942S();
                    return;
                }
                return;
            }
            this.f101966Q.mo82947T();
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile != null) {
                if (contactProfile.m40387S0()) {
                    m108319jt();
                } else {
                    if (this.f101963N0.m40387S0()) {
                        str = "8100";
                    } else {
                        str = "7100";
                    }
                    AbstractC23647d.m123907q(str, this.f101966Q.mo86293y());
                    m108319jt();
                    AbstractC23647d.m123893c();
                }
            } else {
                m108315fs(false, true);
                if (!this.f101977V0 && !this.f101990c0) {
                    m108312cs();
                }
            }
            mo107719pd();
            C22021e0.m114963p().m114996y(this.f101968R);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: e3 */
    public void mo107704e3() {
        if (this.f101960K1) {
            this.f101960K1 = false;
            if (mo107643H6() && this.f101966Q.mo45894h0()) {
                if (m108207Ks()) {
                    C32065p8.m154684c().m154696k();
                } else {
                    m108266lt(this.f101956I1, false);
                }
            }
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: ed */
    public void mo107705ed() {
        mo107720qj(true);
        m108332rt(true);
    }

    /* renamed from: es */
    void m108314es(String str) {
        boolean z11;
        try {
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile != null) {
                if (contactProfile.f42352K0 <= 0) {
                }
                z11 = true;
                int m102746E = C19636i1.m102737w().m102746E(str);
                this.f101966Q.mo86231Q5(m102746E, z11);
                this.f101966Q.mo86236Xj(m102746E, z11);
            }
            if (!C21927m.m114302u().m114318P(str)) {
                z11 = false;
                int m102746E2 = C19636i1.m102737w().m102746E(str);
                this.f101966Q.mo86231Q5(m102746E2, z11);
                this.f101966Q.mo86236Xj(m102746E2, z11);
            }
            z11 = true;
            int m102746E22 = C19636i1.m102737w().m102746E(str);
            this.f101966Q.mo86231Q5(m102746E22, z11);
            this.f101966Q.mo86236Xj(m102746E22, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: fn */
    public void mo107706fn() {
        this.f101966Q.mo86259gk(m108287Es());
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: fo */
    public void mo107707fo() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108333sr(contactProfile);
        }
    }

    /* renamed from: fs */
    public void m108315fs(boolean z11, boolean z12) {
        int i11;
        try {
            this.f101975U0 = z11;
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f101968R);
            this.f101963N0 = m141809c;
            if (m141809c != null) {
                m108288Fr(m141809c);
                i11 = this.f101963N0.f42385V0;
            } else {
                i11 = 0;
            }
            TrackingSource m114310H = C21927m.m114302u().m114310H(this.f101968R);
            if (z12) {
                this.f101966Q.mo82997pA();
            }
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile != null && contactProfile.m40387S0()) {
                this.f101652A.mo112364f(this.f101968R, i11, m114310H, this.f101971S0);
            } else if (m114310H != null && !this.f101973T0) {
                this.f101652A.mo112366g(this.f101968R, i11, m114310H, true, this.f101971S0);
            } else {
                this.f101652A.mo112366g(this.f101968R, i11, new TrackingSource((short) 1045), true, this.f101971S0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: g */
    public C32002l4 mo107651g() {
        return this.f101978W;
    }

    /* renamed from: gs */
    void m108316gs(boolean z11) {
        this.f101957J0 = z11 & C18631a.m98446i().f93749a;
        m108347xt();
    }

    /* renamed from: gt */
    public void m108317gt() {
        this.f101966Q.mo82218f5();
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.m2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108233Vs();
            }
        });
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: h5 */
    public void mo107708h5() {
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108306Ut(contactProfile, true);
        }
        AbstractC23647d.m123897g("7810");
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: hc */
    public void mo107709hc() {
        ContactProfile m141809c;
        try {
            String str = this.f101968R;
            if (str != null && !str.equals("")) {
                if (this.f102032x0) {
                    ContactProfile contactProfile = this.f101963N0;
                    if (contactProfile != null && contactProfile.f42434r.equals(this.f101968R)) {
                        m141809c = this.f101963N0;
                    } else {
                        m141809c = C28203u6.f131407a.m141809c(this.f101968R);
                    }
                    this.f102009l1 = m141809c;
                    if (AbstractC23063f2.m118359k(this.f101968R)) {
                        m108292Lt(this.f102009l1.f42434r);
                        return;
                    }
                    AbstractC23647d.m123907q("7800", this.f101966Q.mo86293y());
                    m108339us(this.f101968R, false);
                    AbstractC23647d.m123893c();
                    return;
                }
                AbstractC23647d.m123907q("7803", this.f101966Q.mo86293y());
                if (m108293Ms()) {
                    if (!AbstractC23057e7.m118300g(MainApplication.getAppContext())) {
                        if (C23055e5.m118272g(true)) {
                            AbstractC23306f.m120722w0().m101508a(new C2279a.a(this.f101968R, this.f101945D0, this.f101939A0, false, 17));
                        }
                    } else {
                        this.f101966Q.mo86232QB(m108308Yr(18));
                    }
                } else {
                    this.f101966Q.mo86232QB(m108308Yr(7));
                    AbstractC23647d.m123906p("300018101");
                    AbstractC23647d.m123893c();
                }
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: he */
    public void mo107710he() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108330qr(contactProfile.f42434r);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: hn */
    public void mo107711hn() {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.h2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108226St();
            }
        });
    }

    /* renamed from: ht */
    public void m108318ht(C8050a.d0 d0Var) {
        if (d0Var != null && u.f102092a[d0Var.ordinal()] == 1) {
            this.f101966Q.mo86282t6(this.f101968R);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: j1 */
    public void mo107712j1() {
        if (mo107673Kf() != null && mo107673Kf().m40387S0()) {
            m108275wt();
        }
    }

    /* renamed from: jt */
    void m108319jt() {
        try {
            m108288Fr(this.f101963N0);
            boolean z11 = false;
            this.f102036z0 = false;
            if (C23055e5.m118271f() && !this.f101670v && !TextUtils.isEmpty(this.f101968R)) {
                m108315fs(true, true);
                m108312cs();
                this.f101992d0 = "0";
                this.f101669u = true;
                String str = CoreUtility.f89233i;
                String str2 = this.f101968R;
                if (this.f101671w.size() == 0) {
                    z11 = true;
                }
                m108311bs(str, str2, "0", z11);
                mo107773Yp(this.f101968R);
            } else {
                this.f101966Q.mo82971a0();
                ContactProfile contactProfile = this.f101963N0;
                if (contactProfile != null && contactProfile.m40387S0()) {
                    m107770Tp(new C2977g2(5));
                } else if (!this.f101670v && m107781hq() && !this.f101988b0) {
                    m107770Tp(new C2977g2(5));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ks */
    void m108320ks(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C31902e9 c31902e9 = (C31902e9) it.next();
                        if (c31902e9 != null && !c31902e9.m153325q()) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: kt */
    public void m108321kt() {
        List m40468d;
        try {
            String str = "";
            if (C28011a4.m141160b().m141161a(mo107696Ya()) != null && C28011a4.m141160b().m141161a(mo107696Ya()).f42489w != null && (m40468d = C28011a4.m141160b().m141161a(mo107696Ya()).f42489w.m40468d()) != null && !m40468d.isEmpty()) {
                str = (String) m40468d.get(0);
            }
            C24902e c24902e = this.f101949F0;
            if (c24902e != null && !TextUtils.equals(c24902e.m129490f(), str)) {
                C24902e c24902e2 = new C24902e();
                this.f101949F0 = c24902e2;
                c24902e2.m129497m(str);
                m108335ts();
                return;
            }
            if (this.f101966Q.mo86294y0()) {
                m108276zt();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: l */
    public void mo107713l(int i11) {
        String str;
        try {
            String str2 = "stranger";
            if (i11 == AbstractC6918a0.menu_drawer) {
                AbstractC23047d8.m118262n();
                this.f101966Q.mo86295zp();
                this.f101959K0 = m108272rs();
                ContactProfile contactProfile = this.f101963N0;
                if (contactProfile != null) {
                    if (contactProfile.m40387S0()) {
                        if (this.f101966Q.mo86233R4()) {
                            str = "870010";
                        } else {
                            str = "8200";
                        }
                        AbstractC23647d.m123906p(str);
                        AbstractC23647d.m123893c();
                    }
                    if (C18631a.m98447m(this.f101963N0.f42434r)) {
                        this.f101966Q.mo82924Aw("tip.profile.rightmenu.setalias", false);
                    }
                    this.f101966Q.mo82924Aw("tip.profile.setting.noti", false);
                    C0708i c0708i = new C0708i();
                    if (AbstractC21935u.m114554u(this.f101963N0.f42434r)) {
                        str2 = "friend";
                    }
                    c0708i.m1075f("profile_type", str2);
                    C0732w.Companion.m1189a().m1187q("social_profile_tap_menu_info", "", c0708i, null);
                    return;
                }
                return;
            }
            if (i11 == AbstractC6918a0.menu_call) {
                this.f101966Q.mo86252e8(this.f101963N0);
                C0708i c0708i2 = new C0708i();
                ContactProfile contactProfile2 = this.f101963N0;
                if (contactProfile2 != null && AbstractC21935u.m114554u(contactProfile2.f42434r)) {
                    str2 = "friend";
                }
                c0708i2.m1075f("profile_type", str2);
                C0732w.Companion.m1189a().m1187q("social_profile_tap_call_icon", "", c0708i2, null);
                return;
            }
            if (i11 == AbstractC6918a0.menu_call_video) {
                this.f101966Q.mo86211Dh(this.f101963N0);
                C0708i c0708i3 = new C0708i();
                ContactProfile contactProfile3 = this.f101963N0;
                if (contactProfile3 != null && AbstractC21935u.m114554u(contactProfile3.f42434r)) {
                    str2 = "friend";
                }
                c0708i3.m1075f("profile_type", str2);
                C0732w.Companion.m1189a().m1187q("social_profile_tap_call_icon", "", c0708i3, null);
                return;
            }
            if (i11 == AbstractC6918a0.menu_privacy_quick_setting) {
                this.f101966Q.mo86222Kg(this.f101963N0, this.f101998g0, this.f101996f0);
                if (this.f101963N0 != null && AbstractC0924m0.m3746da()) {
                    this.f101966Q.mo82924Aw("tip.profile.privacyshortcut", false);
                }
                C0708i c0708i4 = new C0708i();
                ContactProfile contactProfile4 = this.f101963N0;
                if (contactProfile4 != null && AbstractC21935u.m114554u(contactProfile4.f42434r)) {
                    str2 = "friend";
                }
                c0708i4.m1075f("profile_type", str2);
                C0732w.Companion.m1189a().m1187q("social_profile_tap_setting_icon", "", c0708i4, null);
                return;
            }
            if (i11 == AbstractC6918a0.menu_add_friend) {
                mo107682Pf();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f101938L1, e11);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: li */
    public void mo107714li() {
        this.f101966Q.mo86232QB(m108308Yr(25));
    }

    /* renamed from: ls */
    void m108322ls(int i11, TrackingSource trackingSource) {
        try {
            if (this.f101993d1) {
                return;
            }
            this.f101966Q.mo46829Y();
            this.f101993d1 = true;
            if (trackingSource == null) {
                trackingSource = C21927m.m114302u().m114310H(this.f101968R);
            }
            if (trackingSource == null) {
                trackingSource = new TrackingSource(-1);
            }
            this.f101652A.mo112360b0(i11, trackingSource, this.f101995e1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ms */
    void m108323ms(String str) {
        try {
            if (!TextUtils.isEmpty(str) && C21927m.m114302u().m114351p() != null && !C21927m.m114302u().m114351p().contains(str)) {
                if (C21927m.m114302u().m114351p().size() < this.f101652A.mo112419r0()) {
                    m108285Eg(str);
                } else {
                    this.f101966Q.mo82218f5();
                    ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_limit_favorite_list), Integer.valueOf(this.f101652A.mo112419r0())));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: n7 */
    public boolean mo107715n7() {
        return this.f101964O0;
    }

    /* renamed from: nr */
    public void m108324nr(ContactProfile contactProfile, int i11) {
        try {
            this.f101966Q.mo46829Y();
            this.f101652A.mo112356X(contactProfile.f42434r, new c0(contactProfile), i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ns */
    void m108325ns(String str) {
        try {
            if (!TextUtils.isEmpty(str) && C21927m.m114302u().m114351p() != null && C21927m.m114302u().m114351p().contains(str)) {
                m108337un(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nt */
    public void m108326nt() {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.c2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108248bt();
            }
        });
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: o1 */
    public void mo107716o1() {
        boolean z11;
        try {
            boolean m154691f = C32065p8.m154684c().m154691f();
            if (m108207Ks() && m154691f) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f101960K1 = z11;
            this.f101956I1 = C32065p8.m154684c().m154688b();
            m108290Kt(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: oi */
    public void mo107717oi() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108325ns(contactProfile.f42434r);
        }
    }

    @Override // iq.InterfaceC20653a2
    public void onActivityResult(int i11, int i12, Intent intent) {
        JSONObject jSONObject;
        C17244x0 c17244x0;
        int i13;
        ArrayList arrayList;
        int i14 = 0;
        C3000l0 c3000l0 = null;
        try {
            if (i11 == 68) {
                if (i12 == -1) {
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.getBoolean("deleted")) {
                        String string = extras.getString("feedId");
                        while (true) {
                            if (i14 >= this.f101671w.size()) {
                                break;
                            }
                            if (((C3000l0) this.f101671w.get(i14)).f11895q.equals(string)) {
                                C3020p0 m14322a0 = ((C3000l0) this.f101671w.remove(i14)).m14322a0();
                                if (m14322a0 != null && (((i13 = m14322a0.f12058q) == 2 || i13 == 3) && (arrayList = m14322a0.f12023C.f12118i) != null)) {
                                    arrayList.size();
                                }
                                mo107650fc();
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        while (i14 < this.f101671w.size()) {
                            C3000l0 c3000l02 = (C3000l0) this.f101671w.get(i14);
                            if (c3000l02.f11895q.equals(extras.getString("feedId"))) {
                                C3020p0 m14322a02 = c3000l02.m14322a0();
                                AbstractC20805l.m108547e(extras, m14322a02);
                                if (m14322a02.f12058q == 22) {
                                    m14322a02.f12023C.f12101J = extras.getString("extra_feed_memory_id", "");
                                    m14322a02.f12023C.f12103L = extras.getDouble("extra_ratio_zinstant", 0.0d);
                                    String string2 = extras.getString("extra_memory_zinstant_feed_info", "");
                                    try {
                                        if (!TextUtils.isEmpty(string2)) {
                                            jSONObject = new JSONObject(string2);
                                        } else {
                                            jSONObject = null;
                                        }
                                        C3025q0 c3025q0 = m14322a02.f12023C;
                                        if (jSONObject != null) {
                                            c17244x0 = new C17244x0(31, jSONObject);
                                        } else {
                                            c17244x0 = null;
                                        }
                                        c3025q0.f12104M = c17244x0;
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        m14322a02.f12023C.f12104M = null;
                                    }
                                    m14322a02.f12023C.f12105N = extras.getBoolean("extra_is_valid_content", true);
                                }
                                if (m14322a02.m14482K()) {
                                    int i15 = extras.getInt("extra_result_tag_count", -1);
                                    C3003l3 c3003l3 = m14322a02.f12059r;
                                    if (i15 != c3003l3.f11956a) {
                                        if (i15 == 0) {
                                            c3003l3.m14388a();
                                        } else if (extras.containsKey("extra_result_tag_uids")) {
                                            try {
                                                HashMap hashMap = (HashMap) extras.getSerializable("extra_result_tag_uids");
                                                if (hashMap != null && hashMap.size() > 0) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (String str : m14322a02.f12059r.f11957b.keySet()) {
                                                        if (str != null && !hashMap.containsKey(str)) {
                                                            arrayList2.add(str);
                                                        }
                                                    }
                                                    if (arrayList2.size() > 0) {
                                                        m14322a02.f12059r.m14395h(arrayList2, true);
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e12.printStackTrace();
                                            }
                                        }
                                    }
                                }
                                mo107650fc();
                            }
                            i14++;
                        }
                    }
                }
                this.f101966Q.mo86206BI(mo107696Ya());
                return;
            }
            if (i11 == 1006) {
                if (i12 == -1 && intent != null) {
                    if (TagsListView.m84992tM(intent)) {
                        String stringExtra = intent.getStringExtra("extra_feed_id");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            m108277As(stringExtra);
                            return;
                        }
                        return;
                    }
                    if (TagsListView.m84991sM(intent)) {
                        m108307Xr(intent.getStringExtra("extra_feed_id"));
                        return;
                    }
                    ArrayList m84989oM = TagsListView.m84989oM(intent);
                    if (m84989oM != null && m84989oM.size() > 0) {
                        m108343vt(intent.getStringExtra("extra_feed_id"), m84989oM);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 10000) {
                if (i12 == -1 && intent != null) {
                    String stringExtra2 = intent.getStringExtra("feedId");
                    boolean m108546d = AbstractC20805l.m108546d(intent, stringExtra2, this.f101671w);
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        if (intent.getBooleanExtra("extra_feed_empty_tag", false)) {
                            m108307Xr(stringExtra2);
                        } else {
                            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("extra_deleted_tag_uids");
                            if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                                m108343vt(stringExtra2, stringArrayListExtra);
                            }
                        }
                    }
                    if (m108546d) {
                        mo107650fc();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 2000) {
                mo107650fc();
                this.f101966Q.mo86205BA(mo107696Ya());
                return;
            }
            if (i11 == 10014) {
                if (i12 == -1 && AbstractC20805l.m108546d(intent, intent.getExtras().getString("EXTRA_STRING_FEED_ID"), this.f101671w)) {
                    mo107650fc();
                    return;
                }
                return;
            }
            if (i11 == 10099) {
                if (i12 == -1) {
                    try {
                        m108295Or(this.f101968R);
                        m108297Ot();
                        this.f101966Q.invalidateOptionsMenu();
                        if (this.f101950F1 && intent != null && intent.getExtras() != null) {
                            this.f101966Q.mo86277py(intent.getExtras().getString("result.accept_friend_uid", ""));
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        return;
                    }
                }
                return;
            }
            if (i11 == 10100) {
                if (i12 == -1 && this.f101950F1 && intent != null && intent.getExtras() != null) {
                    this.f101966Q.mo86277py(intent.getExtras().getString("result.accept_friend_uid", ""));
                    return;
                }
                return;
            }
            if (i11 == 12200) {
                if (i12 == -1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_send_invite_success));
                    return;
                }
                return;
            }
            if (i11 == 1007) {
                if (i12 == -1 && intent != null && intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT")) {
                    BottomSheetMenuResult bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT");
                    if (bottomSheetMenuResult != null && bottomSheetMenuResult.m45565a() != null && bottomSheetMenuResult.m45569e() == 4 && bottomSheetMenuResult.m45571g() != 0) {
                        C20637a m45565a = bottomSheetMenuResult.m45565a();
                        if (m45565a != null) {
                            c3000l0 = m45565a.m107540b();
                        }
                        if (c3000l0 == null) {
                            return;
                        }
                        mo107660wl(bottomSheetMenuResult.m45571g(), c3000l0);
                        return;
                    }
                    if (bottomSheetMenuResult != null && bottomSheetMenuResult.m45567c() != null && bottomSheetMenuResult.m45569e() == 10) {
                        BottomSheetMenuBundleDataPrivacyQuickSetting m45567c = bottomSheetMenuResult.m45567c();
                        this.f101998g0 = m45567c.m45558c().booleanValue();
                        this.f101996f0 = m45567c.m45557b().booleanValue();
                        this.f101966Q.mo86272n6(this.f101998g0);
                        this.f101966Q.mo86254eH(this.f101996f0);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i11 == 1085) {
                if (i12 == -1) {
                    String str2 = this.f102011m1;
                    C21933s.f107870s0 = str2;
                    AbstractC23059e9.m118317F(str2);
                    m108218Pt();
                    return;
                }
                return;
            }
            if (i11 == 1086) {
                if (i12 == -1) {
                    m108218Pt();
                    return;
                }
                return;
            }
            if (i11 == 1100) {
                if (i12 == -1 && intent != null && intent.getExtras() != null) {
                    m108214O4(intent.getIntExtra("EXTRA_OPTION_SELECTED", -1));
                    return;
                }
                return;
            }
            if (i11 == 500) {
                if (i12 == -1 && intent != null) {
                    this.f101966Q.mo86205BA(mo107696Ya());
                    return;
                }
                return;
            }
            if (i11 == 1314) {
                if (i12 == 1303) {
                    this.f101966Q.mo86216Fn(intent.getStringExtra("action_type"), intent.getStringExtra("action_data"));
                    return;
                } else {
                    if (i12 == 1304) {
                        m108341vj(intent.getStringExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_URL));
                        return;
                    }
                    return;
                }
            }
            return;
        } catch (Exception e14) {
            AbstractC23350e.m122776f(f101938L1, e14);
        }
        AbstractC23350e.m122776f(f101938L1, e14);
    }

    @Override // iq.InterfaceC20653a2
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        try {
            if (i11 != 113) {
                if (i11 == 117) {
                    this.f101966Q.mo86270mn(this.f101963N0, iArr);
                    return;
                }
                return;
            }
            this.f101966Q.mo86260gw(this.f101963N0, iArr);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    public void onResume() {
        AbstractC23304d.f113390h0 = mo107696Ya();
        m108305Ur();
        m108297Ot();
        m108288Fr(this.f101963N0);
        if (AbstractC23304d.f113369c1) {
            m108268ot(this.f101968R, this.f102030w0);
            m108302Rt(true);
        }
        if (!m107780gq()) {
            m108321kt();
        }
    }

    /* renamed from: or */
    public void m108327or(ContactProfile contactProfile, boolean z11) {
        if (this.f102003i1) {
            return;
        }
        this.f101966Q.mo46829Y();
        this.f102003i1 = true;
        String str = contactProfile.f42434r;
        this.f101652A.mo112385z(str, new e(str, contactProfile, z11));
    }

    /* renamed from: os */
    public void m108328os() {
        try {
            m107760Aq(true);
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f101968R);
            if (m141809c != null) {
                ContactProfile.C7868d m141161a = C28011a4.m141160b().m141161a(m141809c.f42434r);
                if (m141161a != null) {
                    m141809c.f42366P = m141161a;
                } else {
                    m141809c.f42366P = new ContactProfile.C7868d();
                }
                m108326nt();
            }
            if (C23055e5.m118271f()) {
                if (m141809c == null) {
                    m141809c = new ContactProfile();
                }
                this.f101652A.mo112380t0(this.f101968R, AbstractC20826v0.m108765J(1), 0, this.f101982Y ? 1 : 0, new x(m141809c));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: p9 */
    public void mo107718p9() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108323ms(contactProfile.f42434r);
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: pb */
    public void mo107654pb() {
        C31862c m107777dq = m107777dq();
        if (m107777dq == null || m107777dq.m153154f()) {
            m107778eq(this.f101968R);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: pd */
    public void mo107719pd() {
        try {
            if (!this.f101940A1 && !AbstractC0924m0.m3746da()) {
                return;
            }
            C0824j.m2153b(new p());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: pg */
    public void mo107655pg() {
        m107778eq(this.f101968R);
    }

    /* renamed from: ps */
    public int m108329ps() {
        int i11 = 0;
        try {
            int m118704e0 = AbstractC23136l9.m118704e0(MainApplication.getAppContext());
            if (m118704e0 >= 240) {
                this.f101964O0 = false;
                i11 = AbstractC23136l9.m118742r(215.0f);
            } else if (m118704e0 >= 160) {
                this.f101964O0 = false;
                i11 = AbstractC23136l9.m118742r(130.0f);
            } else {
                this.f101964O0 = true;
                i11 = this.f101966Q.mo86228Ne();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return i11;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: qb */
    public void mo107656qb() {
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null && !contactProfile.m40387S0()) {
            m108318ht(this.f101953H0);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: qj */
    public void mo107720qj(boolean z11) {
        this.f102008l0 = z11;
        this.f101966Q.mo86263js(z11);
    }

    /* renamed from: qr */
    void m108330qr(String str) {
        String str2 = "[" + str + "]";
        if (this.f102025t1) {
            return;
        }
        this.f102025t1 = true;
        this.f101966Q.mo46829Y();
        this.f101652A.mo112357Y(str2, this.f102027u1, new TrackingSource(102));
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: rc */
    public boolean mo107721rc() {
        boolean z11;
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null && contactProfile.m40438z0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f101994e0 && !z11) {
            return false;
        }
        return true;
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: ri */
    public void mo107657ri() {
        m107794zq(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // iq.AbstractC20677f
    /* renamed from: rq */
    public void mo107787rq(List list, boolean z11, boolean z12) {
        m108263js(list);
        super.mo107787rq(list, z11, z12);
    }

    /* renamed from: rr */
    void m108331rr(ContactProfile contactProfile) {
        try {
            this.f101966Q.mo46829Y();
            this.f101652A.mo112384x(contactProfile.f42434r, new a(contactProfile), 9);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rt */
    public void m108332rt(final boolean z11) {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.n2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108254et(z11);
            }
        });
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: s */
    public void mo107722s(C3054x c3054x) {
        try {
            if (c3054x.m14684p() == 1) {
                this.f101966Q.mo83002uI(c3054x.m14669a(), 0, c3054x.m14670b(), this.f101978W);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: s5 */
    public void mo107723s5(String str) {
        if (this.f102016p0) {
            this.f101966Q.mo86240aC();
            String str2 = this.f102020r0;
            if (ZaloListView.m86975fN()) {
                m108286Er(str);
                m108338ur();
                this.f101966Q.mo86274nj(this.f102024t0);
                m108291Lr();
                this.f101966Q.mo86244bi(this.f102022s0);
                this.f101966Q.mo86245cc(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_friend_request_zalo_name, this.f101963N0.f42437s));
            }
            InterfaceC20659b2 interfaceC20659b2 = this.f101966Q;
            if (!ZaloListView.m86975fN()) {
                str2 = m108256ft(str2);
            }
            interfaceC20659b2.mo86234St(str2);
            this.f101966Q.mo86212Ds(true);
            this.f101966Q.mo86226My(true);
            m108302Rt(false);
            m108197Hs(false);
            this.f101966Q.mo86225Mw(true);
        }
    }

    /* renamed from: sr */
    void m108333sr(ContactProfile contactProfile) {
        AbstractC20655a4.m107740a(this, contactProfile, new TrackingSource(102));
    }

    /* renamed from: st */
    public void m108334st(String str) {
        if (this.f102005j1) {
            return;
        }
        this.f101966Q.mo46829Y();
        this.f102005j1 = true;
        this.f101652A.mo112351D(str, TrackingSource.m40665d(5), this.f102007k1);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: t0 */
    public void mo107724t0() {
        m108232Vr(0);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: t3 */
    public String mo107725t3() {
        List m40468d;
        String str = "";
        try {
            C24902e c24902e = this.f101949F0;
            if (c24902e != null) {
                return c24902e.m129490f();
            }
            if (C28011a4.m141160b().m141161a(this.f101968R) != null && C28011a4.m141160b().m141161a(this.f101968R).f42489w != null && (m40468d = C28011a4.m141160b().m141161a(this.f101968R).f42489w.m40468d()) != null && !m40468d.isEmpty()) {
                str = (String) m40468d.get(0);
            }
            C24902e c24902e2 = new C24902e();
            this.f101949F0 = c24902e2;
            c24902e2.m129497m(str);
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: t6 */
    public void mo107726t6() {
        mo107739zf();
        C22021e0.m114963p().m114996y(this.f101968R);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: tc */
    public void mo107727tc() {
        m108268ot(this.f101968R, this.f102030w0);
    }

    /* renamed from: ts */
    public void m108335ts() {
        String mo107725t3 = mo107725t3();
        if (!TextUtils.isEmpty(mo107725t3) && mo107643H6()) {
            new C25453e().m101508a(new C25453e.b(mo107725t3, GlobalScope.f105887p, new b0(mo107725t3)));
            return;
        }
        if (!mo107643H6()) {
            m108270pt(3, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING);
            m108271qt(false);
        } else {
            m108270pt(0, 300);
            m108271qt(false);
            m108290Kt(false);
        }
    }

    /* renamed from: tt */
    void m108336tt(String str) {
        if (this.f102019q1) {
            return;
        }
        this.f102019q1 = true;
        this.f101966Q.mo46829Y();
        this.f102021r1 = str;
        this.f101652A.mo112355O(str, this.f102023s1, new TrackingSource(102));
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: u */
    public void mo107728u() {
        ContactProfile contactProfile;
        if (C23055e5.m118272g(true) && (contactProfile = this.f101963N0) != null) {
            m108311bs(CoreUtility.f89233i, contactProfile.f42434r, this.f101992d0, false);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: u0 */
    public void mo107729u0() {
        m108232Vr(0);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: u1 */
    public void mo107730u1() {
        this.f101966Q.mo86237Xq(this.f102035y1);
        AbstractC23647d.m123906p("8901");
        AbstractC23647d.m123893c();
    }

    /* renamed from: un */
    void m108337un(String str) {
        if (this.f102031w1) {
            return;
        }
        this.f101966Q.mo46829Y();
        m mVar = new m(str);
        this.f102031w1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        this.f101652A.mo112362e(arrayList, mVar);
    }

    /* renamed from: ur */
    void m108338ur() {
        String m118336o = AbstractC23059e9.m118336o(this.f102018q0, true);
        if (m118336o.isEmpty()) {
            this.f101966Q.mo86256f9(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stranger_friend_request));
        } else {
            this.f101966Q.mo86256f9(AbstractC23136l9.m118746s0(AbstractC8020f0.str_stranger_friend_request_from_source, m118336o));
        }
    }

    /* renamed from: us */
    public void m108339us(String str, boolean z11) {
        try {
            if (this.f102001h1) {
                return;
            }
            this.f101966Q.mo46829Y();
            this.f102001h1 = true;
            this.f101652A.mo112354J(str, new d(z11));
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f102001h1 = false;
        }
    }

    /* renamed from: ut */
    void m108340ut(ContactProfile contactProfile) {
        if (contactProfile != null) {
            this.f102021r1 = contactProfile.f42434r;
            AbstractC20655a4.m107741b(this, contactProfile, new TrackingSource(102));
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: v8 */
    public void mo107731v8() {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.g2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108240Xs();
            }
        });
    }

    /* renamed from: vj */
    public void m108341vj(String str) {
        m107794zq(true);
        this.f101966Q.mo82986jh(str);
    }

    /* renamed from: vr */
    void m108342vr() {
        try {
            ContactProfile contactProfile = this.f101963N0;
            if (contactProfile == null || contactProfile.f42434r.equals("") || this.f101963N0.f42434r.equalsIgnoreCase("null") || !this.f101968R.equals(this.f101963N0.f42434r)) {
                return;
            }
            this.f101966Q.mo82943SF(false);
            this.f101966Q.mo82969Yy(false);
            ContactProfile contactProfile2 = this.f101963N0;
            this.f101939A0 = contactProfile2.f42446v;
            this.f101941B0 = contactProfile2.f42324B;
            if (!this.f101968R.equals("")) {
                this.f101945D0 = this.f101963N0.m40383Q(true, false);
            }
            if (this.f101965P0 == null) {
                C3032r2 c3032r2 = new C3032r2();
                this.f101965P0 = c3032r2;
                c3032r2.f12222e = m108329ps();
                if (this.f101964O0) {
                    m108275wt();
                }
            }
            C3032r2 c3032r22 = this.f101965P0;
            c3032r22.f12218a = this.f101939A0;
            c3032r22.f12219b = this.f101941B0;
            if (!TextUtils.isEmpty(this.f101945D0)) {
                this.f101965P0.f12220c = this.f101945D0;
            }
            C3563d c3563d = this.f102035y1;
            if (c3563d != null) {
                this.f101965P0.f12221d = c3563d.f15095f;
            }
            m108350yt();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vt */
    void m108343vt(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str) && arrayList != null && arrayList.size() > 0) {
            try {
                if (this.f101671w != null) {
                    for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                        if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                            ((C3000l0) this.f101671w.get(i11)).m14322a0().m14530v0(arrayList, true);
                            mo107650fc();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: w2 */
    public void mo107732w2() {
        if (m108296Os()) {
            m108349ys();
            AbstractC23647d.m123906p("8902");
            AbstractC23647d.m123893c();
        } else {
            m108322ls(Integer.parseInt(this.f101968R), null);
            AbstractC23647d.m123906p("8900");
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: wr */
    protected void m108344wr(C3001l1 c3001l1) {
        this.f101667P.m117199m(c3001l1);
        m107790vq();
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: x2 */
    public void mo107733x2(C31874cb c31874cb, int i11, int i12) {
        int i13;
        if (c31874cb == null) {
            return;
        }
        try {
            this.f102009l1 = c31874cb.m153177a();
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 == 6) {
                                this.f101966Q.mo86223Kv(c31874cb.m153177a());
                            }
                        } else if (c31874cb.f146399o == 2) {
                            this.f102011m1 = c31874cb.f146385a;
                            m108306Ut(c31874cb.m153177a(), false);
                        }
                    } else if (c31874cb.f146390f > 0) {
                        String str = c31874cb.f146385a;
                        this.f102011m1 = str;
                        this.f101966Q.m107747za(Integer.parseInt(str), null, this.f102009l1);
                    } else {
                        String str2 = c31874cb.f146385a;
                        this.f102011m1 = str2;
                        m108339us(str2, true);
                    }
                } else if (c31874cb.f146390f > 0) {
                    if (C21927m.m114302u().m114357s().m153137g(c31874cb.f146385a)) {
                        this.f101966Q.mo86223Kv(c31874cb.m153177a());
                    } else {
                        this.f101966Q.mo86239Zc(c31874cb);
                    }
                } else {
                    this.f101966Q.mo86239Zc(c31874cb);
                }
            } else {
                m108310as(c31874cb);
            }
            C28905e.m144373n().m144400v(c31874cb.f146385a, 20, 95, i12, "");
            if (i11 != 2) {
                if (i11 != 4 && i11 != 5 && i11 != 6) {
                    i13 = 2;
                } else {
                    i13 = 3;
                }
            } else {
                i13 = 4;
            }
            C0815e1.m2075D().m2099U(3, i13, 5, String.valueOf(1), c31874cb.f146385a, String.valueOf(i12), String.valueOf(c31874cb.f146399o), String.valueOf(c31874cb.f146389e));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: x9 */
    public boolean mo107734x9() {
        if (this.f101966Q.mo86262jC() || this.f101966Q.mo86269mc() || mo107673Kf() == null || !AbstractC0924m0.m3746da()) {
            return false;
        }
        return true;
    }

    /* renamed from: xr */
    void m108345xr(C3032r2 c3032r2, C3041t2 c3041t2, C3037s2 c3037s2, boolean z11) {
        this.f101666O.m123092b();
        if (c3032r2 != null) {
            this.f101666O.m123085m(c3032r2);
            this.f101666O.mo123078a(74);
        }
        if (c3041t2 != null) {
            this.f101666O.m123087o(c3041t2);
            this.f101666O.mo123078a(75);
        }
        if (c3037s2 != null) {
            this.f101666O.m123086n(c3037s2);
            this.f101666O.mo123078a(76);
        }
        if (z11) {
            this.f101666O.mo123078a(70);
        }
        synchronized (this.f101664M) {
            ArrayList arrayList = new ArrayList();
            this.f101663L = arrayList;
            arrayList.addAll(this.f101666O.m123093c());
        }
        mo107650fc();
    }

    /* renamed from: xs */
    void m108346xs() {
        String str;
        AbstractC23647d.m123907q("7802", this.f101966Q.mo86293y());
        String str2 = this.f101968R;
        if (str2 != null && str2.length() > 0 && !this.f101968R.equalsIgnoreCase("null")) {
            ContactProfile contactProfile = new ContactProfile(this.f101968R);
            contactProfile.f42446v = this.f101939A0;
            ContactProfile contactProfile2 = this.f101963N0;
            if (contactProfile2 != null) {
                contactProfile.f42437s = contactProfile2.f42437s;
                contactProfile.f42458z = contactProfile2.f42458z;
            }
            this.f101966Q.mo86289vr(contactProfile);
            C2526d.f10270a.m12720m0(this.f101968R, this.f101970S);
            C0708i c0708i = new C0708i();
            if (AbstractC21935u.m114554u(this.f101968R)) {
                str = "friend";
            } else {
                str = "stranger";
            }
            c0708i.m1075f("profile_type", str);
            C0732w.Companion.m1189a().m1187q("social_profile_tap_chat_button", "", c0708i, null);
        }
        AbstractC23647d.m123893c();
    }

    /* renamed from: xt */
    void m108347xt() {
        C3019p m123079g = this.f101666O.m123079g();
        m123079g.m14452r(!TextUtils.isEmpty(this.f101945D0));
        m123079g.m14446l(this.f101945D0);
        m123079g.m14453s(this.f101957J0);
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m107762Cq(contactProfile, m123079g);
        }
        m107765Op(m123079g);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: ya */
    public void mo107735ya() {
        if (!C23055e5.m118272g(true)) {
            this.f101966Q.mo82218f5();
            return;
        }
        ContactProfile contactProfile = this.f101963N0;
        if (contactProfile != null) {
            m108336tt(contactProfile.f42434r);
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: yg */
    public void mo107736yg(int i11, String str, boolean z11) {
        int i12;
        String str2;
        boolean z12;
        boolean z13;
        this.f101966Q.mo46829Y();
        if (mo107673Kf().m40387S0()) {
            i12 = AbstractC8020f0.profile_vip_reportabusedone;
        } else {
            i12 = AbstractC8020f0.profile_reportabusedone;
        }
        if (mo107673Kf().m40387S0()) {
            str2 = "5";
        } else {
            str2 = "2";
        }
        t tVar = new t(i12, z11, str2);
        C21785g c21785g = this.f101652A;
        String mo107696Ya = mo107696Ya();
        if (!str2.equals("5") && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (str2.equals("5") && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        c21785g.mo112359a0(mo107696Ya, str2, "", "", i11, str, z12, z13, tVar);
    }

    /* renamed from: yr */
    void m108348yr(boolean z11) {
        try {
            m108342vr();
            m108351zr(z11);
            m108350yt();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ys */
    void m108349ys() {
        try {
            String str = this.f101968R;
            if (str != null && str.length() > 0 && !this.f101968R.equalsIgnoreCase("null")) {
                ContactProfile contactProfile = new ContactProfile(this.f101968R);
                contactProfile.f42437s = this.f101945D0;
                contactProfile.f42446v = this.f101939A0;
                ContactProfile contactProfile2 = this.f101963N0;
                if (contactProfile2 != null) {
                    contactProfile.f42458z = contactProfile2.f42458z;
                    contactProfile.f42352K0 = contactProfile2.f42352K0;
                }
                this.f101966Q.mo86289vr(contactProfile);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: yt */
    void m108350yt() {
        boolean z11;
        C3041t2 c3041t2 = this.f101967Q0;
        if (c3041t2 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        m108345xr(this.f101965P0, c3041t2, this.f101969R0, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    @Override // iq.InterfaceC20653a2
    /* renamed from: z0 */
    public void mo107737z0(C31902e9 c31902e9, ContactProfile contactProfile, String str) {
        ?? r22;
        String fVar;
        boolean z11;
        String str2;
        String str3;
        int i11;
        int i12;
        String str4;
        if (c31902e9 != null && contactProfile != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", 12);
                jSONObject.put("keyword", str);
                C26406h c26406h = new C26406h();
                c26406h.m136191o(jSONObject);
                int m153322n = c31902e9.m153322n();
                if (m153322n != 0) {
                    if (m153322n != 1) {
                        if (m153322n != 7) {
                            return;
                        }
                        if (c31902e9.m153316h() != null) {
                            AbstractC23112j7.m118528f0(contactProfile.f42434r, c31902e9.m153316h(), "", null, "chat_send");
                        }
                        fVar = C18953k.f.f94586s.toString();
                        r22 = 0;
                    } else {
                        if (c31902e9.m153311c() != null && c31902e9.m153311c().m145109c() != null) {
                            String str5 = contactProfile.f42434r;
                            if (c31902e9.m153311c().m145109c() == null) {
                                str2 = "";
                            } else {
                                str2 = c31902e9.m153311c().m145109c().f123105a;
                            }
                            if (c31902e9.m153311c().m145111e() == null) {
                                str3 = "";
                            } else {
                                str3 = c31902e9.m153311c().m145111e().f123105a;
                            }
                            if (c31902e9.m153311c().m145109c() != null) {
                                i11 = c31902e9.m153311c().m145109c().f123106b;
                            } else {
                                i11 = 0;
                            }
                            if (c31902e9.m153311c().m145109c() != null) {
                                i12 = c31902e9.m153311c().m145109c().f123107c;
                            } else {
                                i12 = 0;
                            }
                            String m145107a = c31902e9.m153311c().m145107a();
                            if (c31902e9.m153311c().m145110d() == null) {
                                str4 = "";
                            } else {
                                str4 = c31902e9.m153311c().m145110d().f123105a;
                            }
                            z11 = false;
                            AbstractC23112j7.m118511U(str5, str2, str3, "", i11, i12, m145107a, str4, true, c26406h, "chat_send");
                        } else {
                            z11 = false;
                        }
                        fVar = C18953k.f.f94584q.toString();
                        r22 = z11;
                    }
                } else {
                    r22 = 0;
                    AbstractC23112j7.m118530g0(contactProfile.mo2478b(), c31902e9.m153321m(), c26406h, "chat_send");
                    fVar = C18953k.f.f94585r.toString();
                }
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_send_chat_profile_success);
                Object[] objArr = new Object[2];
                objArr[r22] = fVar;
                objArr[1] = contactProfile.m40383Q(true, r22);
                this.f101966Q.mo86286uj(String.format(m118743r0, objArr));
                this.f101966Q.mo86278qE();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: z3 */
    public void mo107738z3() {
        C32017m4.m154326S().m154355c0(this.f101671w.size(), this.f101968R);
    }

    @Override // iq.InterfaceC20653a2
    /* renamed from: zf */
    public void mo107739zf() {
        this.f101966Q.mo70710wy(new Runnable() { // from class: iq.p2
            @Override // java.lang.Runnable
            public final void run() {
                C20765w2.this.m108244Zs();
            }
        });
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: zn */
    public void mo107661zn() {
        m107794zq(false);
        this.f101966Q.mo86287uu(true);
    }

    /* renamed from: zr */
    void m108351zr(boolean z11) {
        boolean z12;
        try {
            if (this.f102035y1 != null) {
                if (this.f101967Q0 == null) {
                    this.f101967Q0 = new C3041t2();
                }
                InterfaceC20659b2 interfaceC20659b2 = this.f101966Q;
                interfaceC20659b2.mo86283tg(AbstractC23136l9.m118641B(interfaceC20659b2.mo82987k().m92689tK(), AbstractC16801x.cPageBg1));
                C3041t2 c3041t2 = this.f101967Q0;
                ContactProfile contactProfile = this.f101963N0;
                boolean z13 = true;
                if (contactProfile != null && contactProfile.m40359B0()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c3041t2.f12250a = z12;
                if (!TextUtils.isEmpty(this.f102035y1.f15090a)) {
                    C3041t2 c3041t22 = this.f101967Q0;
                    c3041t22.f12251b = true;
                    c3041t22.f12252c = this.f102035y1.f15090a;
                } else {
                    this.f101967Q0.f12251b = false;
                }
                this.f101967Q0.f12253d = false;
                List m18100d = this.f102035y1.m18100d();
                C3041t2 c3041t23 = this.f101967Q0;
                c3041t23.f12255f = m18100d;
                c3041t23.f12256g = z11;
                if (m18100d == null || m18100d.size() <= 0) {
                    z13 = false;
                }
                c3041t23.f12254e = z13;
                if (this.f101969R0 == null) {
                    this.f101969R0 = new C3037s2();
                }
                m108301Rr();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
