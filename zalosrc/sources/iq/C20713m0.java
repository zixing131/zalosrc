package iq;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import au.C2343e;
import bi0.AbstractC2810d;
import bo.AbstractC3035s0;
import bo.C2955c0;
import bo.C2961d1;
import bo.C2966e1;
import bo.C2977g2;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3006m1;
import bo.C3010n0;
import bo.C3019p;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3046v;
import bo.C3054x;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.components.ProfileMusicView;
import com.zing.zalo.feed.models.ActionDataImageViewer;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoBioView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.C20275e;
import iq.C20713m0;
import is.AbstractC20805l;
import is.AbstractC20826v0;
import is.C20785b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import l30.C22012a;
import l30.C22013a0;
import l30.C22014b;
import l30.C22033k0;
import l30.C22052u;
import me0.AbstractC23028c0;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p055ce.AbstractC3439h;
import p055ce.C3432a;
import p111du.AbstractC18069a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p303kq.C21909a;
import p329lo.C22579r0;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p368nq.C23927b;
import p398oo.C24346a;
import p398oo.C24355e0;
import p398oo.C24371m0;
import p425po.C24880b;
import p426pp.C24902e;
import p426pp.C24903f;
import p427pq.EnumC24904a;
import p455qo.C25405e;
import p455qo.C25430q0;
import p456qp.C25453e;
import p457qq.EnumC25467a;
import p458qr.C25470c;
import p458qr.C25487t;
import p492rr.C25959b;
import p492rr.C25973p;
import p527tq.AbstractC26875a;
import p527tq.C26876b;
import p555uq.C27357a;
import p716zh.C31862c;
import p716zh.C31965ic;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32065p8;
import pd0.C24730d;
import pd0.C24732f;
import pd0.EnumC24733g;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25742h;
import td0.C26638a;
import tn.C26747f0;
import tn.C26761p;
import tn.C26767v;
import tr.C26878b;
import vg.AbstractC28025b8;
import vg.C28212v6;

/* renamed from: iq.m0 */
/* loaded from: classes4.dex */
public class C20713m0 extends AbstractC20677f implements InterfaceC20707l {

    /* renamed from: F0 */
    static final String f101769F0 = "m0";

    /* renamed from: A0 */
    InterfaceC20094a f101770A0;

    /* renamed from: B0 */
    C24230h f101771B0;

    /* renamed from: C0 */
    InterfaceC24232j f101772C0;

    /* renamed from: D0 */
    int f101773D0;

    /* renamed from: E0 */
    boolean f101774E0;

    /* renamed from: Q */
    boolean f101775Q;

    /* renamed from: R */
    boolean f101776R;

    /* renamed from: S */
    private boolean f101777S;

    /* renamed from: T */
    private boolean f101778T;

    /* renamed from: U */
    public boolean f101779U;

    /* renamed from: V */
    public boolean f101780V;

    /* renamed from: W */
    public String f101781W;

    /* renamed from: X */
    public int f101782X;

    /* renamed from: Y */
    private C32002l4 f101783Y;

    /* renamed from: Z */
    boolean f101784Z;

    /* renamed from: a0 */
    String f101785a0;

    /* renamed from: b0 */
    String f101786b0;

    /* renamed from: c0 */
    Map f101787c0;

    /* renamed from: d0 */
    boolean f101788d0;

    /* renamed from: e0 */
    int f101789e0;

    /* renamed from: f0 */
    int f101790f0;

    /* renamed from: g0 */
    int f101791g0;

    /* renamed from: h0 */
    int f101792h0;

    /* renamed from: i0 */
    boolean f101793i0;

    /* renamed from: j0 */
    public C24902e f101794j0;

    /* renamed from: k0 */
    public C24903f f101795k0;

    /* renamed from: l0 */
    private int f101796l0;

    /* renamed from: m0 */
    public String f101797m0;

    /* renamed from: n0 */
    public String f101798n0;

    /* renamed from: o0 */
    public String f101799o0;

    /* renamed from: p0 */
    private String f101800p0;

    /* renamed from: q0 */
    private TrackingSource f101801q0;

    /* renamed from: r0 */
    private TrackingSource f101802r0;

    /* renamed from: s0 */
    InterfaceC20712m f101803s0;

    /* renamed from: t0 */
    private final int f101804t0;

    /* renamed from: u0 */
    private final int f101805u0;

    /* renamed from: v0 */
    C24880b f101806v0;

    /* renamed from: w0 */
    private C27357a f101807w0;

    /* renamed from: x0 */
    private int f101808x0;

    /* renamed from: y0 */
    private boolean f101809y0;

    /* renamed from: z0 */
    boolean f101810z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile.C7868d f101811a;

        /* renamed from: b */
        final /* synthetic */ List f101812b;

        a(ContactProfile.C7868d c7868d, List list) {
            this.f101811a = c7868d;
            this.f101812b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108090d(List list) {
            String str;
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
            } else {
                str = "";
            }
            C20713m0.this.f101794j0 = new C24902e();
            C20713m0.this.f101794j0.m129497m(str);
            C20713m0.this.m107794zq(false);
            AbstractC26875a.m138437a(C20713m0.this);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C20713m0 c20713m0 = C20713m0.this;
                c20713m0.f101774E0 = false;
                c20713m0.f101803s0.mo82225k8(AbstractC2810d.zds_ic_warning_circle_solid_24, AbstractC23136l9.m118743r0(AbstractC8020f0.str_general_error));
                C20713m0.this.f101803s0.mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C20713m0.this.f101774E0 = false;
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null) {
                    if (contactProfile.f42366P == null) {
                        contactProfile.f42366P = new ContactProfile.C7868d();
                    }
                    ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
                    contactProfile2.f42366P.f42489w = this.f101811a.f42489w;
                    C20713m0.this.f101652A.mo112406d(contactProfile2.m40373K());
                    C20713m0.this.f101652A.mo112393N(AbstractC23304d.f113368c0.f42366P.m40451f());
                }
                InterfaceC20712m interfaceC20712m = C20713m0.this.f101803s0;
                final List list = this.f101812b;
                interfaceC20712m.mo70710wy(new Runnable() { // from class: iq.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20713m0.a.this.m108090d(list);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20713m0.this.f101793i0 = false;
            if (c20096c.m104491c() == 515) {
                C20713m0.this.f101803s0.mo82249yy();
            } else {
                C20713m0.this.f101803s0.mo82170E6();
            }
            C20713m0.this.f101803s0.mo49315c4();
            C20713m0.this.f101803s0.mo82971a0();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C20713m0.this.f101793i0 = false;
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    if (contactProfile.f42434r.length() > 0 && !contactProfile.f42434r.equalsIgnoreCase("null")) {
                        C20713m0.this.f101652A.mo112406d(contactProfile.m40373K());
                        final int m40367H = AbstractC23304d.f113368c0.m40367H();
                        ContactProfile contactProfile2 = new ContactProfile((JSONObject) obj);
                        AbstractC23304d.f113368c0 = contactProfile2;
                        final int m40367H2 = contactProfile2.m40367H();
                        C20713m0.this.f101652A.mo112423x0(AbstractC23304d.f113368c0, false);
                        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: iq.k0
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC3439h.m17272f(m40367H, m40367H2);
                            }
                        });
                    }
                    try {
                        Calendar calendar = Calendar.getInstance();
                        C20713m0.this.f101792h0 = calendar.get(1);
                        if (!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42452x)) {
                            String[] split = AbstractC23304d.f113368c0.f42452x.split("/");
                            C20713m0.this.f101791g0 = Integer.parseInt(split[0]);
                            C20713m0.this.f101790f0 = Integer.parseInt(split[1]);
                            C20713m0.this.f101789e0 = Integer.parseInt(split[2]);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                C20713m0.this.f101803s0.mo49315c4();
                C20713m0.this.m108036pt();
            } finally {
                C20713m0.this.m108058Pr();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f101815a;

        c(String str) {
            this.f101815a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20713m0.this.f101788d0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (jSONObject.has("photo")) {
                    C20713m0.this.m107761Bq(AbstractC18069a.m96085d(jSONObject.getJSONObject("photo"), "total"));
                    C20713m0 c20713m0 = C20713m0.this;
                    c20713m0.f101652A.mo112394P(c20713m0.m107776bq());
                }
                if (jSONObject.has("vip_follow")) {
                    i11 = AbstractC18069a.m96085d(jSONObject.getJSONObject("vip_follow"), "total");
                } else {
                    i11 = 0;
                }
                AbstractC23304d.f113405l.put(this.f101815a, new C31965ic(i11, C20713m0.this.f101668t));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C20713m0.this.f101788d0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                AbstractC23350e.m122774d(C20713m0.f101769F0, "cannot get extend profile .... " + c20096c.m104492d());
                C20713m0.this.m108070bt();
                C20713m0.this.f101803s0.mo82998pf(false);
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
                        ContactProfile contactProfile = AbstractC23304d.f113368c0;
                        ContactProfile.C7868d c7868d2 = contactProfile.f42366P;
                        if (c7868d2 == null) {
                            contactProfile.f42366P = c7868d;
                        } else {
                            c7868d2.f42479m = c7868d.f42479m;
                            c7868d2.f42489w = c7868d.f42489w;
                        }
                        C20713m0.this.f101652A.mo112393N(contactProfile.f42366P.m40451f());
                        C20713m0.this.m107997Ys();
                        String str = "";
                        ContactProfile.C7872h c7872h = c7868d.f42489w;
                        if (c7872h != null && (m40468d = c7872h.m40468d()) != null && !m40468d.isEmpty()) {
                            str = (String) m40468d.get(0);
                        }
                        C20713m0.this.f101794j0 = new C24902e();
                        C20713m0.this.f101794j0.m129497m(str);
                        C20713m0.this.m107994Xr();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$e */
    /* loaded from: classes4.dex */
    public class e implements C25453e.a {

        /* renamed from: a */
        final /* synthetic */ String f101818a;

        e(String str) {
            this.f101818a = str;
        }

        @Override // p456qp.C25453e.a
        /* renamed from: a */
        public void mo87822a(String str, Exception exc) {
            try {
                if (TextUtils.equals(this.f101818a, str)) {
                    int m44477c = ProfileMusicView.m44477c(exc);
                    C20713m0.this.m108069at(m44477c);
                    if (m44477c == 800) {
                        C20713m0.this.m107772Xp();
                    }
                    C20713m0.this.f101803s0.mo82998pf(false);
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
                    if (TextUtils.equals(this.f101818a, c24902e.m129490f())) {
                        C20713m0 c20713m0 = C20713m0.this;
                        c20713m0.f101794j0 = c24902e;
                        c20713m0.f101795k0 = c24903f;
                        c20713m0.m108071ct(c20713m0.m107783jq(c24902e));
                        C20713m0.this.m107794zq(false);
                        C20713m0.this.m108085wr();
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
    /* renamed from: iq.m0$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC0939u {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m108094d() {
            boolean z11;
            if (C20713m0.this.f101671w.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                C20713m0 c20713m0 = C20713m0.this;
                c20713m0.f101784Z = true;
                c20713m0.m107770Tp(new C2977g2(0));
                C20713m0.this.mo107650fc();
                C20713m0.this.f101796l0 = 1;
                C32017m4.m154326S().m154357d0(C20713m0.this.f101796l0, C20713m0.this.f101671w.size(), CoreUtility.f89233i);
            }
            C20713m0 c20713m02 = C20713m0.this;
            c20713m02.f101786b0 = "0";
            c20713m02.f101669u = true;
            String str = CoreUtility.f89233i;
            c20713m02.m108059Qr(str, str, "0", !z11);
            C20713m0.this.mo107773Yp(CoreUtility.f89233i);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            List mo112416o = C20713m0.this.f101652A.mo112416o(CoreUtility.f89233i);
            C20713m0.this.f101671w.clear();
            C20713m0.this.f101670v = false;
            if (mo112416o != null && mo112416o.size() > 0) {
                C20713m0.this.f101671w.addAll(mo112416o);
            }
            C20713m0.this.m107944Bt();
            C3006m1 m133795h = C25973p.f123927a.m133795h();
            if (m133795h != null && m133795h.m14414e() != -1) {
                C3000l0 c3000l0 = new C3000l0();
                c3000l0.f11898r0 = true;
                c3000l0.f11900s0 = m133795h;
                C20713m0.this.m108031or(c3000l0);
            }
            C20713m0.this.f101803s0.mo70710wy(new Runnable() { // from class: iq.n0
                @Override // java.lang.Runnable
                public final void run() {
                    C20713m0.f.this.m108094d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$g */
    /* loaded from: classes4.dex */
    public class g implements InterfaceC20094a {

        /* renamed from: iq.m0$g$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {
            a() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20713m0.this.f101652A.mo112424y(CoreUtility.f89233i);
            }
        }

        /* renamed from: iq.m0$g$b */
        /* loaded from: classes4.dex */
        class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f101823a;

            /* renamed from: b */
            final /* synthetic */ String f101824b;

            b(String str, String str2) {
                this.f101823a = str;
                this.f101824b = str2;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C20713m0.this.f101652A.mo112400V(CoreUtility.f89233i, this.f101823a, this.f101824b, "");
            }
        }

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m108097e(boolean z11) {
            try {
                C20713m0.this.f101803s0.mo82971a0();
                C20713m0.this.m107769Sp(new C3010n0(0));
                C20713m0.this.m107770Tp(new C2977g2(0));
                ArrayList arrayList = C20713m0.this.f101671w;
                if (arrayList != null && arrayList.isEmpty()) {
                    C20713m0 c20713m0 = C20713m0.this;
                    if (c20713m0.f101669u) {
                        c20713m0.f101670v = false;
                        String str = CoreUtility.f89233i;
                        c20713m0.m108059Qr(str, str, c20713m0.f101786b0, true);
                        return;
                    }
                }
                if (z11) {
                    C20713m0 c20713m02 = C20713m0.this;
                    c20713m02.m107949Er(c20713m02.f101671w);
                }
                C20713m0.this.mo107650fc();
                C32017m4.m154326S().m154357d0(C20713m0.this.f101796l0, C20713m0.this.f101671w.size(), CoreUtility.f89233i);
                if (!C20713m0.this.m107781hq()) {
                    C20713m0.this.f101803s0.mo82993mm(400);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C20713m0 c20713m03 = C20713m0.this;
                c20713m03.f101669u = false;
                c20713m03.f101803s0.mo82971a0();
                C20713m0.this.m107770Tp(new C2977g2(0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m108098f() {
            C20713m0.this.f101803s0.mo82971a0();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C20713m0.this.m108003bs(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            try {
                C20713m0 c20713m0 = C20713m0.this;
                c20713m0.f101784Z = true;
                c20713m0.f101806v0 = null;
                C24355e0.f117560a.m127364t(true);
                final boolean equals = C20713m0.this.f101786b0.equals("0");
                if (equals) {
                    C20713m0.this.f101671w.clear();
                    C0824j.m2153b(new a());
                    C20713m0.this.f101796l0 = 1;
                } else {
                    C20713m0.this.f101796l0++;
                }
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                JSONObject optJSONObject = jSONObject.optJSONObject("banner_year");
                if (optJSONObject != null) {
                    C2955c0.m13997e(optJSONObject);
                }
                C20713m0.this.f101787c0.clear();
                JSONObject optJSONObject2 = jSONObject.optJSONObject("list_tutorial");
                if (optJSONObject2 != null) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = optJSONObject2.optJSONArray("pos");
                    if (optJSONArray != null) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i11)));
                        }
                    }
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("data");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                            try {
                                C3000l0 m108750B0 = AbstractC20826v0.m108750B0(optJSONArray2.getJSONObject(i12));
                                if (i12 < arrayList.size()) {
                                    C20713m0.this.f101787c0.put((Integer) arrayList.get(i12), m108750B0);
                                } else {
                                    C20713m0.this.f101787c0.put(0, m108750B0);
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                }
                if (AbstractC3035s0.f12229a) {
                    C20713m0.this.f101671w.addAll(AbstractC3035s0.m14608r());
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray("list");
                if (jSONArray2.length() > 0) {
                    int i13 = 0;
                    while (i13 < jSONArray2.length()) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i13);
                        String m96089h = AbstractC18069a.m96089h(jSONObject2, "title");
                        String m96089h2 = AbstractC18069a.m96089h(jSONObject2, "color");
                        String m96089h3 = AbstractC18069a.m96089h(jSONObject2, "color_line");
                        String m96089h4 = AbstractC18069a.m96089h(jSONObject2, "icon");
                        String m96089h5 = AbstractC18069a.m96089h(jSONObject2, "color_title");
                        JSONArray optJSONArray3 = jSONObject2.optJSONArray("feeds");
                        if (optJSONArray3 != null) {
                            int i14 = 0;
                            while (i14 < optJSONArray3.length()) {
                                try {
                                    C3000l0 m108750B02 = AbstractC20826v0.m108750B0(optJSONArray3.getJSONObject(i14));
                                    m108750B02.f11869R = m96089h;
                                    m108750B02.f11870S = m96089h2;
                                    m108750B02.f11872U = m96089h4;
                                    m108750B02.f11871T = m96089h3;
                                    m108750B02.f11873V = m96089h5;
                                    String str = m108750B02.f11895q;
                                    String jSONObject3 = AbstractC20826v0.m108827p(m108750B02).toString();
                                    jSONArray = jSONArray2;
                                    try {
                                        if (!m108750B02.m14322a0().f12063v) {
                                            C20713m0.this.f101671w.add(m108750B02);
                                            if (equals) {
                                                C0824j.m2153b(new b(str, jSONObject3));
                                            }
                                        }
                                        C26761p.m137739n(m108750B02);
                                    } catch (Exception e12) {
                                        e = e12;
                                        e.printStackTrace();
                                        i14++;
                                        jSONArray2 = jSONArray;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    jSONArray = jSONArray2;
                                }
                                i14++;
                                jSONArray2 = jSONArray;
                            }
                        }
                        JSONArray jSONArray3 = jSONArray2;
                        if (C20713m0.this.f101787c0.containsKey(Integer.valueOf(i13))) {
                            C20713m0 c20713m02 = C20713m0.this;
                            c20713m02.f101671w.add((C3000l0) c20713m02.f101787c0.get(Integer.valueOf(i13)));
                        }
                        i13++;
                        jSONArray2 = jSONArray3;
                    }
                }
                if (jSONObject.has("limit_visible_feed")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("limit_visible_feed");
                    if (jSONObject4 != null) {
                        C3006m1 c3006m1 = new C3006m1(jSONObject4);
                        C3000l0 c3000l0 = new C3000l0();
                        c3000l0.f11898r0 = true;
                        c3000l0.f11900s0 = c3006m1;
                        C25973p.f123927a.m133796i(c3006m1);
                        C20713m0.this.m108031or(c3000l0);
                    }
                } else {
                    C25973p.f123927a.m133796i(new C3006m1());
                }
                C20713m0.this.f101669u = jSONObject.optBoolean("lmore");
                C20713m0.this.f101786b0 = jSONObject.optString("lfid");
                C20713m0.this.f101803s0.mo70710wy(new Runnable() { // from class: iq.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20713m0.g.this.m108097e(equals);
                    }
                });
                C20713m0.this.f101670v = false;
            } catch (Exception e14) {
                e14.printStackTrace();
                C20713m0.this.m107769Sp(new C3010n0(0));
                C20713m0.this.f101803s0.mo70710wy(new Runnable() { // from class: iq.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20713m0.g.this.m108098f();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$h */
    /* loaded from: classes4.dex */
    public class h extends AbstractC0939u {
        h() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C20713m0.this.f101652A.mo112424y(CoreUtility.f89233i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$i */
    /* loaded from: classes4.dex */
    public class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f101827a;

        i(String str) {
            this.f101827a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C20713m0.this.f101652A.mo112422v0(CoreUtility.f89233i, this.f101827a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: iq.m0$j */
    /* loaded from: classes4.dex */
    public class j implements InterfaceC24232j {
        j() {
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C20713m0.this.m108007ds(bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C20713m0.this.m108005cs(aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    public C20713m0(InterfaceC20656b interfaceC20656b) {
        super(interfaceC20656b);
        this.f101775Q = false;
        this.f101776R = false;
        this.f101779U = false;
        this.f101780V = false;
        this.f101781W = "";
        this.f101782X = -1;
        this.f101783Y = C32002l4.m154264g(10001);
        this.f101784Z = false;
        this.f101785a0 = "";
        this.f101786b0 = "";
        this.f101787c0 = new HashMap();
        this.f101788d0 = false;
        this.f101789e0 = 1980;
        this.f101790f0 = 1;
        this.f101791g0 = 1;
        this.f101793i0 = false;
        this.f101796l0 = 0;
        this.f101797m0 = "";
        this.f101798n0 = "";
        this.f101799o0 = "";
        this.f101800p0 = "";
        this.f101804t0 = 1;
        this.f101805u0 = 2;
        this.f101806v0 = null;
        this.f101770A0 = new g();
        this.f101773D0 = 0;
        this.f101803s0 = (InterfaceC20712m) interfaceC20656b;
        this.f101665N = CoreUtility.f89233i;
    }

    /* renamed from: Ar */
    private void m107940Ar() {
        ArrayList arrayList = this.f101671w;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: As */
    public /* synthetic */ void m107941As() {
        this.f101803s0.mo82925B4();
    }

    /* renamed from: At */
    private void m107942At(C26876b c26876b) {
        C3000l0 m138450a;
        if (c26876b != null) {
            try {
                if (c26876b.f127178a == 3) {
                    for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                        C3000l0 c3000l0 = (C3000l0) this.f101671w.get(i11);
                        if (c3000l0 != null && c3000l0.f11895q.equals(c26876b.f127179b) && (m138450a = C26878b.f127183a.m138450a(c3000l0.f11895q)) != null) {
                            m138450a.m14322a0().f12062u = c3000l0.m14322a0().f12062u;
                            this.f101671w.set(i11, m138450a);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bs */
    public /* synthetic */ void m107943Bs(String str, int i11, int i12) {
        int i13;
        C3019p m108054Gr = m108054Gr();
        if (!TextUtils.isEmpty(str)) {
            if (AbstractC20826v0.m108808f0(i12)) {
                str = str + "…";
            }
            m108054Gr.m14448n(str);
            m108054Gr.m14447m(AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_profile_bio));
            m108054Gr.m14451q(true);
            m108054Gr.m14450p(false);
        } else {
            if (C3432a.f14402a.m17234c() && AbstractC23304d.f113368c0.m40357A0()) {
                i13 = AbstractC8020f0.str_btn_update_business_description;
            } else {
                i13 = AbstractC8020f0.str_profile_update_bio;
            }
            m108054Gr.m14447m(AbstractC23136l9.m118743r0(i13));
            m108054Gr.m14451q(false);
            m108054Gr.m14450p(true);
        }
        m107762Cq(AbstractC23304d.f113368c0, m108054Gr);
        m107765Op(m108054Gr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bt */
    public synchronized void m107944Bt() {
        C3000l0 m138450a;
        try {
            if (!C24355e0.f117560a.m127361o()) {
                return;
            }
            for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                try {
                    C3000l0 c3000l0 = (C3000l0) this.f101671w.get(i11);
                    if (c3000l0 != null && c3000l0.m14285C0() && c3000l0.m14339j0() == 3) {
                        C3000l0 m138450a2 = C26878b.f127183a.m138450a(c3000l0.f11895q);
                        if (m138450a2 != null) {
                            this.f101671w.set(i11, m138450a2);
                        }
                    } else if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14285C0() && c3000l0.m14322a0().f12058q == 23 && (m138450a = C26878b.f127183a.m138450a(c3000l0.f11895q)) != null) {
                        this.f101671w.set(i11, m138450a);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            m107949Er(this.f101671w);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: Cr */
    private void m107945Cr(List list) {
        m107947Dr(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cs */
    public /* synthetic */ void m107946Cs() {
        int i11;
        int i12;
        try {
            if (AbstractC23304d.f113368c0 == null) {
                try {
                    String mo112421v = this.f101652A.mo112421v();
                    if (!TextUtils.isEmpty(mo112421v)) {
                        AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(mo112421v));
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && contactProfile.f42366P == null) {
                String mo112409i = this.f101652A.mo112409i();
                if (!TextUtils.isEmpty(mo112409i)) {
                    try {
                        JSONObject jSONObject = new JSONObject(mo112409i);
                        AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d(jSONObject);
                    } catch (JSONException e12) {
                        e12.printStackTrace();
                    }
                }
            }
            ContactProfile contactProfile2 = AbstractC23304d.f113368c0;
            if (contactProfile2 != null && contactProfile2.f42366P != null) {
                if (C3432a.f14402a.m17234c() && AbstractC23304d.f113368c0.m40357A0()) {
                    i12 = Integer.MAX_VALUE;
                } else {
                    i12 = UpdateUserInfoBioView.f78893c1;
                }
                AbstractC20826v0.m108811h(AbstractC23304d.f113368c0.f42366P.f42479m, -1, i12, 5, new AbstractC20826v0.i() { // from class: iq.o
                    @Override // is.AbstractC20826v0.i
                    /* renamed from: a */
                    public final void mo44661a(String str, int i13, int i14) {
                        C20713m0.this.m107943Bs(str, i13, i14);
                    }
                });
            } else {
                if (C3432a.f14402a.m17234c() && AbstractC23304d.f113368c0.m40357A0()) {
                    i11 = AbstractC8020f0.str_btn_update_business_description;
                } else {
                    i11 = AbstractC8020f0.str_profile_update_bio;
                }
                String m118743r0 = AbstractC23136l9.m118743r0(i11);
                C3019p m108054Gr = m108054Gr();
                m108054Gr.m14447m(m118743r0);
                m108054Gr.m14451q(false);
                m108054Gr.m14450p(true);
                ContactProfile contactProfile3 = AbstractC23304d.f113368c0;
                if (contactProfile3 != null) {
                    m107762Cq(contactProfile3, m108054Gr);
                }
                m107765Op(m108054Gr);
            }
            this.f101803s0.mo82991m7("tip.edit.bio", 200);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: Dr */
    private void m107947Dr(List list) {
        try {
            ArrayList m137786e = C26767v.m137782d().m137786e();
            if (m137786e != null && m137786e.size() > 0) {
                ArrayList<C3000l0> arrayList = new ArrayList();
                ArrayList<C3000l0> arrayList2 = new ArrayList();
                Iterator it = m137786e.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (c3000l0 != null) {
                        if (c3000l0.m14377z0()) {
                            arrayList2.add(c3000l0);
                        } else if (c3000l0.m14290E0()) {
                            arrayList.add(c3000l0);
                        }
                    }
                }
                for (C3000l0 c3000l02 : arrayList2) {
                    if (c3000l02 != null && c3000l02.m14322a0().m14488S()) {
                        AbstractC20826v0.m108819l(c3000l02, list);
                    }
                }
                for (C3000l0 c3000l03 : arrayList) {
                    if (c3000l03 != null && c3000l03.m14322a0().m14488S()) {
                        AbstractC20826v0.m108819l(c3000l03, list);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ds */
    public /* synthetic */ void m107948Ds(int i11, int i12) {
        this.f101803s0.mo82191Re(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Er */
    public void m107949Er(List list) {
        m107953Fr(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Es */
    public /* synthetic */ void m107950Es(boolean z11) {
        boolean z12;
        try {
            if (mo107871T0() != null && !TextUtils.isEmpty(mo107871T0().m129490f())) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                m108039rr();
                this.f101803s0.mo82950Te(true);
            } else {
                this.f101803s0.mo82950Te(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Et */
    private void m107951Et(C22579r0 c22579r0, Bundle bundle) {
        C3003l3 c3003l3;
        int i11;
        JSONObject jSONObject;
        C17244x0 c17244x0;
        for (int i12 = 0; i12 < this.f101671w.size(); i12++) {
            if (((C3000l0) this.f101671w.get(i12)).f11895q.equals(c22579r0.f110490a)) {
                C3020p0 m14322a0 = ((C3000l0) this.f101671w.get(i12)).m14322a0();
                AbstractC20805l.m108547e(bundle, m14322a0);
                m14322a0.f12042V.f45973p = c22579r0.f110498i;
                if (m14322a0.f12058q == 22) {
                    C3025q0 c3025q0 = m14322a0.f12023C;
                    c3025q0.f12101J = c22579r0.f110502m;
                    c3025q0.f12103L = c22579r0.f110503n;
                    String str = c22579r0.f110504o;
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject = new JSONObject(str);
                        } else {
                            jSONObject = null;
                        }
                        C3025q0 c3025q02 = m14322a0.f12023C;
                        if (jSONObject != null) {
                            c17244x0 = new C17244x0(31, jSONObject);
                        } else {
                            c17244x0 = null;
                        }
                        c3025q02.f12104M = c17244x0;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        m14322a0.f12023C.f12104M = null;
                    }
                    m14322a0.f12023C.f12105N = c22579r0.f110505p;
                }
                m14322a0.m14511j(c22579r0.f110492c);
                C3003l3 c3003l32 = m14322a0.f12059r;
                if (c3003l32 != null && (i11 = (c3003l3 = c22579r0.f110500k).f11956a) != c3003l32.f11956a) {
                    if (i11 == 0) {
                        c3003l32.m14388a();
                    } else {
                        LinkedHashMap linkedHashMap = c3003l3.f11957b;
                        if (linkedHashMap != null && linkedHashMap != null) {
                            try {
                                if (linkedHashMap.size() > 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (String str2 : m14322a0.f12059r.f11957b.keySet()) {
                                        if (str2 != null && !linkedHashMap.containsKey(str2)) {
                                            arrayList.add(str2);
                                        }
                                    }
                                    if (arrayList.size() > 0) {
                                        m14322a0.f12059r.m14395h(arrayList, true);
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
        }
    }

    /* renamed from: Fr */
    private void m107953Fr(List list) {
        try {
            m108024kt(list);
            ArrayList m137786e = C26767v.m137782d().m137786e();
            if (m137786e != null && m137786e.size() > 0) {
                ArrayList<C3000l0> arrayList = new ArrayList();
                ArrayList<C3000l0> arrayList2 = new ArrayList();
                Iterator it = m137786e.iterator();
                while (it.hasNext()) {
                    C3000l0 c3000l0 = (C3000l0) it.next();
                    if (c3000l0 != null) {
                        C3000l0 m108788U0 = AbstractC20826v0.m108788U0(c3000l0);
                        if (m108788U0.m14377z0()) {
                            arrayList2.add(m108788U0);
                        } else if (m108788U0.m14290E0()) {
                            arrayList.add(m108788U0);
                        }
                    }
                }
                for (C3000l0 c3000l02 : arrayList2) {
                    if (c3000l02 != null && !c3000l02.m14322a0().m14488S()) {
                        list.add(0, c3000l02);
                    }
                }
                for (C3000l0 c3000l03 : arrayList) {
                    if (c3000l03 != null && !c3000l03.m14322a0().m14488S()) {
                        list.add(0, c3000l03);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fs */
    public /* synthetic */ void m107954Fs() {
        try {
            if (AbstractC23304d.f113368c0 != null) {
                m108033ot();
                this.f101803s0.mo82958Vn(AbstractC23304d.f113368c0.f42437s);
                m108037qr();
                this.f101803s0.mo82979fp(AbstractC23304d.f113368c0.f42324B);
                this.f101803s0.mo82218f5();
                m107997Ys();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ft */
    private void m107955Ft(List list, int i11) {
        ContactProfile.C7868d c7868d;
        ContactProfile.C7872h c7872h;
        try {
            if (C23055e5.m118272g(false) && !this.f101774E0) {
                ContactProfile.C7868d c7868d2 = new ContactProfile.C7868d();
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null && (c7868d = contactProfile.f42366P) != null && (c7872h = c7868d.f42489w) != null) {
                    c7868d2.f42489w = new ContactProfile.C7872h(list, c7872h.m40465a(), c7872h.m40467c(), c7872h.m40466b());
                } else {
                    c7868d2.f42489w = new ContactProfile.C7872h(list, new ContactProfile.C7870f(), new ContactProfile.C7873i(), new ContactProfile.C7871g());
                }
                a aVar = new a(c7868d2, list);
                this.f101774E0 = true;
                this.f101652A.mo112348B(c7868d2.m40449d(i11), aVar);
                this.f101803s0.mo46829Y();
                return;
            }
            this.f101803s0.mo82225k8(AbstractC2810d.zds_ic_wifi_off_solid_24, AbstractC23136l9.m118743r0(AbstractC8020f0.str_check_network_try_again));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gs */
    public /* synthetic */ void m107957Gs() {
        try {
            if (this.f101803s0.mo45894h0()) {
                this.f101781W = "";
                this.f101803s0.mo82243ve();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Gt */
    private void m107958Gt() {
        mo107875Ud();
        mo107857G4();
        this.f101803s0.mo78955kl(new Runnable() { // from class: iq.f0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107960Hs();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Hs */
    public /* synthetic */ void m107960Hs() {
        m107982Rr(CoreUtility.f89233i);
    }

    /* renamed from: Ht */
    private void m107961Ht() {
        try {
            if (C24730d.m128465h().m128473g(CoreUtility.f89233i) != null) {
                m108053Dt(false, true);
                return;
            }
            m108053Dt(false, false);
            if (!TextUtils.isEmpty(this.f101798n0)) {
                AbstractC23304d.f113368c0.f42446v = this.f101798n0;
            }
            this.f101652A.mo112406d(AbstractC23304d.f113368c0.m40373K());
            m108037qr();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Ir */
    private C3046v m107963Ir(int i11) {
        C3046v c3046v = new C3046v();
        if (i11 == 8) {
            try {
                c3046v.f12274a = 8;
                c3046v.f12278e = this.f101800p0;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return c3046v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Is */
    public /* synthetic */ void m107964Is(String str, boolean z11) {
        try {
            this.f101797m0 = str;
            m108037qr();
            if (this.f101803s0.mo45894h0() && !z11) {
                this.f101803s0.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
            }
            m108053Dt(false, false);
            this.f101803s0.mo83001r4();
            m108036pt();
            m108053Dt(false, false);
            this.f101798n0 = "";
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Js */
    public /* synthetic */ void m107966Js(String str, boolean z11) {
        m107961Ht();
        if (!TextUtils.isEmpty(str) && !z11) {
            this.f101803s0.mo82976dj(str, 3000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ks */
    public /* synthetic */ void m107968Ks() {
        this.f101803s0.mo82993mm(400);
    }

    /* renamed from: Lr */
    private void m107970Lr(String str) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f101671w.size()) {
                break;
            }
            if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                this.f101671w.remove(i11);
                m107976Or(str);
                mo107650fc();
                break;
            }
            i11++;
        }
        m108021jt();
    }

    /* renamed from: Mr */
    private void m107972Mr(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            m108068as(arrayList);
            mo107650fc();
        }
    }

    /* renamed from: Ms */
    private void m107973Ms() {
        this.f101803s0.mo78955kl(new Runnable() { // from class: iq.e0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m108035ps();
            }
        }, 500L);
    }

    /* renamed from: Or */
    private void m107976Or(String str) {
        if (str != null && str.length() > 0) {
            C0824j.m2153b(new i(str));
        }
    }

    /* renamed from: Os */
    private void m107977Os() {
        C0815e1.m2075D().m2100V(new C23648e(26, "", 0, "social_visibletime_separator", new String[0]), false);
    }

    /* renamed from: Ps */
    private void m107979Ps() {
        boolean m108014gs = m108014gs();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("showReddot", m108014gs ? 1 : 0);
            C0815e1.m2075D().m2100V(new C23648e(26, "", 0, "social_visibletime_header", jSONObject.toString()), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Rr */
    private void m107982Rr(String str) {
        if (this.f101788d0) {
            return;
        }
        c cVar = new c(str);
        this.f101788d0 = true;
        this.f101652A.mo112382w(str, 160, cVar);
    }

    /* renamed from: Ss */
    private void m107984Ss() {
        m108036pt();
        if (C23055e5.m118271f() && !this.f101670v) {
            m108062Sr();
            m107982Rr(CoreUtility.f89233i);
            mo107875Ud();
            mo107857G4();
            return;
        }
        this.f101803s0.mo82971a0();
    }

    /* renamed from: Ts */
    private void m107986Ts(String str, boolean z11, String str2) {
        this.f101778T = z11;
        if (!TextUtils.isEmpty(str)) {
            m108065Vr(str, str2);
        }
    }

    /* renamed from: Us */
    private void m107988Us(String str, boolean z11, String str2) {
        this.f101797m0 = str;
        this.f101777S = z11;
        if (str2 != null) {
            this.f101799o0 = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            m108088yt(this.f101797m0);
        }
    }

    /* renamed from: Vs */
    private void m107990Vs() {
        ContactProfile.C7868d c7868d;
        ContactProfile.C7872h c7872h;
        List m40468d;
        try {
            String str = "";
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && (c7868d = contactProfile.f42366P) != null && (c7872h = c7868d.f42489w) != null && (m40468d = c7872h.m40468d()) != null && !m40468d.isEmpty()) {
                str = (String) m40468d.get(0);
            }
            if (mo107871T0() != null && !TextUtils.equals(mo107871T0().m129490f(), str)) {
                C24902e c24902e = new C24902e();
                c24902e.m129497m(str);
                m108080st(c24902e);
                m107994Xr();
                return;
            }
            if (this.f101803s0.mo82248y0()) {
                m108078rt();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ws */
    private void m107992Ws(int i11, boolean z11) {
        C24903f c24903f = this.f101795k0;
        if (c24903f != null && !TextUtils.isEmpty(c24903f.m129503f()) && this.f101803s0.mo45894h0()) {
            this.f101803s0.mo82961Wg(i11, z11, this.f101795k0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Xr */
    public void m107994Xr() {
        String mo107929t3 = mo107929t3();
        if (!TextUtils.isEmpty(mo107929t3)) {
            new C25453e().m101508a(new C25453e.b(mo107929t3, GlobalScope.f105887p, new e(mo107929t3)));
        } else if (!mo107643H6()) {
            m108075ht();
        } else {
            m108073ft();
            this.f101803s0.mo82199XA();
        }
    }

    /* renamed from: Xs */
    private void m107995Xs() {
        try {
            C24903f m154689d = C32065p8.m154684c().m154689d();
            if (mo107871T0() != null && m154689d != null && TextUtils.equals(mo107871T0().m129490f(), m154689d.m129502e())) {
                if (C32065p8.m154684c().m154691f()) {
                    this.f101803s0.mo82946Sr(true);
                    this.f101803s0.mo82952Ty(true);
                    this.f101803s0.mo82980ga(false);
                } else if (C32065p8.m154684c().m154692g()) {
                    this.f101803s0.mo82946Sr(false);
                    this.f101803s0.mo82952Ty(true);
                    this.f101803s0.mo82980ga(false);
                } else {
                    this.f101803s0.mo82952Ty(false);
                    this.f101803s0.mo82980ga(true);
                }
            } else {
                this.f101803s0.mo82952Ty(false);
                this.f101803s0.mo82980ga(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ys */
    public void m107997Ys() {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.n
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107946Cs();
            }
        });
    }

    /* renamed from: Zr */
    private ContactProfile.C7873i m107999Zr() {
        ContactProfile.C7868d c7868d;
        ContactProfile.C7872h c7872h;
        ContactProfile.C7873i c7873i = new ContactProfile.C7873i();
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null && (c7868d = contactProfile.f42366P) != null && (c7872h = c7868d.f42489w) != null) {
            return c7872h.m40467c();
        }
        return c7873i;
    }

    /* renamed from: Zs */
    private void m108000Zs(boolean z11, boolean z12) {
        try {
            this.f101803s0.mo49315c4();
            m108064Ur();
            if (z11) {
                AbstractC20826v0.m108770L0(true);
            }
            if (z12) {
                C24371m0.m127468p().mo127472d(0).m127392B();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bs */
    public void m108003bs(C20096c c20096c) {
        final boolean isEmpty = this.f101671w.isEmpty();
        if (isEmpty) {
            this.f101796l0 = 1;
        }
        C32017m4.m154326S().m154357d0(this.f101796l0, this.f101671w.size(), CoreUtility.f89233i);
        this.f101670v = false;
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.s
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m108028ms(isEmpty);
            }
        });
        if (c20096c != null) {
            if (TextUtils.isEmpty(c20096c.m104490b())) {
                this.f101806v0 = null;
                if (isEmpty) {
                    if (AbstractC23216t1.m119640e(c20096c.m104491c())) {
                        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20713m0.this.m108030ns();
                            }
                        });
                        return;
                    } else {
                        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20713m0.this.m108032os();
                            }
                        });
                        return;
                    }
                }
                return;
            }
            this.f101806v0 = new C24880b(c20096c.m104491c(), c20096c.m104490b());
            if (c20096c.m104491c() == 18028) {
                C24355e0.f117560a.m127364t(false);
                this.f101671w.clear();
                AbstractC20697j.m107826c(this);
                C23744a.m124114c().m124116d(6097, 10001);
            } else {
                this.f101671w.clear();
                C0824j.m2153b(new h());
            }
            this.f101803s0.mo70710wy(new Runnable() { // from class: iq.v
                @Override // java.lang.Runnable
                public final void run() {
                    C20713m0.this.m107790vq();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cs */
    public void m108005cs(C20096c c20096c) {
        try {
            this.f101803s0.mo49315c4();
            if (this.f101803s0.mo45894h0()) {
                this.f101803s0.mo82976dj(AbstractC23047d8.m118252d(c20096c), 3000);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        this.f101771B0 = null;
        this.f101772C0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ds */
    public void m108007ds(AbstractC25751q abstractC25751q) {
        try {
            this.f101803s0.mo49315c4();
            this.f101771B0 = null;
            this.f101772C0 = null;
            if (abstractC25751q instanceof C25742h) {
                String m132869b = ((C25742h) abstractC25751q).m132869b();
                if (!"null".equals(m132869b) && !m132869b.trim().equals("") && !"-2".equals(m132869b)) {
                    m108055It(m132869b);
                }
                m108005cs(new C20096c(502, AbstractC23161o1.m119318c(502, m132869b)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m108005cs(C26638a.f126094a.m136734c());
            this.f101771B0 = null;
            this.f101772C0 = null;
        }
    }

    /* renamed from: dt */
    private void m108008dt(final int i11, final int i12) {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.g0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107948Ds(i11, i12);
            }
        });
    }

    /* renamed from: es */
    private boolean m108010es() {
        try {
            Iterator it = this.f101671w.iterator();
            while (it.hasNext()) {
                C3000l0 c3000l0 = (C3000l0) it.next();
                if (c3000l0 != null && c3000l0.m14285C0()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: fs */
    private void m108012fs(C3000l0 c3000l0) {
        if (c3000l0 != null && c3000l0.m14309N0() && this.f101671w != null) {
            int m14414e = c3000l0.f11900s0.m14414e();
            long m14413d = c3000l0.f11900s0.m14413d();
            int m133790b = C25973p.f123927a.m133790b(m14414e, m14413d);
            for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                C3000l0 c3000l02 = (C3000l0) this.f101671w.get(i11);
                if (c3000l02 != null && c3000l02.m14322a0() != null && !c3000l02.m14322a0().m14493X()) {
                    long j11 = c3000l02.m14322a0().f12062u;
                    Iterator it = c3000l02.f11899s.iterator();
                    while (it.hasNext()) {
                        long j12 = ((C3020p0) it.next()).f12062u;
                        if (j12 < j11) {
                            j11 = j12;
                        }
                    }
                    if (m108016hs(j11, m133790b, m14413d)) {
                        this.f101671w.add(i11, c3000l0);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: gs */
    private boolean m108014gs() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AbstractC28025b8.m141459o("tip.profile.limitfeedview"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m108023ks((C28212v6) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hs */
    private boolean m108016hs(long j11, int i11, long j12) {
        if (i11 == 5) {
            if (j11 < j12) {
                return true;
            }
            return false;
        }
        if (i11 != 2 && i11 != 3 && i11 != 4) {
            return false;
        }
        long m119186C0 = AbstractC23160o0.m119186C0();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(m119186C0 - j12);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        if (AbstractC23160o0.m119233a(calendar2, calendar) == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: is */
    private boolean m108018is() {
        boolean z11;
        boolean z12;
        try {
            C24903f m154689d = C32065p8.m154684c().m154689d();
            if (m154689d != null && !TextUtils.isEmpty(m154689d.m129503f())) {
                z11 = true;
            } else {
                z11 = false;
            }
            C24903f c24903f = this.f101795k0;
            if (c24903f != null && !TextUtils.isEmpty(c24903f.m129503f())) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 || !z12) {
                return false;
            }
            if (!TextUtils.equals(m154689d.m129503f(), this.f101795k0.m129503f())) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: js */
    private boolean m108020js() {
        if (!this.f101667P.m117201c().m14646D() && !this.f101666O.m123095e().m14129c()) {
            return false;
        }
        return true;
    }

    /* renamed from: jt */
    private void m108021jt() {
        mo107773Yp(CoreUtility.f89233i);
    }

    /* renamed from: ks */
    private boolean m108023ks(C28212v6 c28212v6) {
        if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131580f) {
            return true;
        }
        return false;
    }

    /* renamed from: kt */
    private void m108024kt(List list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3000l0 c3000l0 = (C3000l0) it.next();
                        if (c3000l0 != null && c3000l0.m14285C0() && c3000l0.m14322a0() != null && !c3000l0.m14322a0().m14488S()) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ls */
    public /* synthetic */ void m108026ls() {
        String str = CoreUtility.f89233i;
        m108059Qr(str, str, this.f101786b0, false);
        mo107773Yp(CoreUtility.f89233i);
    }

    /* renamed from: lt */
    private boolean m108027lt() {
        ArrayList arrayList = this.f101671w;
        if (arrayList != null && arrayList.size() != 0) {
            Iterator it = this.f101671w.iterator();
            while (it.hasNext()) {
                if (((C3000l0) it.next()).m14309N0()) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ms */
    public /* synthetic */ void m108028ms(boolean z11) {
        this.f101803s0.mo82971a0();
        if (z11) {
            m107769Sp(new C3010n0(0));
        } else {
            m107769Sp(new C3010n0(1));
        }
    }

    /* renamed from: nr */
    private void m108029nr(C23927b c23927b) {
        String str;
        if (c23927b.f115598b.equals("action.open.galary")) {
            str = C32017m4.m154326S().m154358e(this.f101783Y.m154284u(26));
        } else if (c23927b.f115598b.equals("action.open.profile.albumdetail")) {
            str = C32017m4.m154326S().m154354c(this.f101783Y.m154284u(27));
        } else {
            str = "";
        }
        AbstractC23647d.m123897g(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ns */
    public /* synthetic */ void m108030ns() {
        m107770Tp(new C2977g2(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: or */
    public void m108031or(C3000l0 c3000l0) {
        m108027lt();
        m108012fs(c3000l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: os */
    public /* synthetic */ void m108032os() {
        m107770Tp(new C2977g2(3));
    }

    /* renamed from: ot */
    private void m108033ot() {
        C3019p m123079g = this.f101666O.m123079g();
        m123079g.m14452r(!TextUtils.isEmpty(AbstractC23304d.f113368c0.f42437s));
        m123079g.m14446l(AbstractC23304d.f113368c0.f42437s);
    }

    /* renamed from: pr */
    private void m108034pr(C32002l4 c32002l4) {
        if (c32002l4 != null) {
            this.f101783Y.m154273c(c32002l4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ps */
    public /* synthetic */ void m108035ps() {
        try {
            C24732f m128473g = C24730d.m128465h().m128473g(CoreUtility.f89233i);
            if (m128473g != null) {
                if (m128473g.f118782d == EnumC24733g.UPLOADING) {
                    m108053Dt(true, false);
                } else {
                    m108053Dt(false, true);
                }
                this.f101797m0 = m128473g.f118779a;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pt */
    public void m108036pt() {
        try {
            this.f101803s0.mo70710wy(new Runnable() { // from class: iq.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C20713m0.this.m107954Fs();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qr */
    private void m108037qr() {
        String mo107858Ha = mo107858Ha();
        String m108066Wr = m108066Wr();
        if (C23302b.f113247a.m120523d(m108066Wr)) {
            m108079sr();
        } else {
            this.f101803s0.mo82965Xu(mo107858Ha, m108066Wr);
        }
    }

    /* renamed from: qt */
    private void m108038qt(long j11) {
        if (!this.f101803s0.mo45894h0()) {
            return;
        }
        this.f101803s0.mo78955kl(new Runnable() { // from class: iq.p
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107957Gs();
            }
        }, j11);
    }

    /* renamed from: rr */
    private void m108039rr() {
        try {
            if (mo107871T0() != null) {
                this.f101803s0.mo82935Oq(mo107871T0().m129492h());
                this.f101803s0.mo82962Wl(mo107871T0().m129494j());
                m107995Xs();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rs */
    public /* synthetic */ void m108040rs() {
        m107769Sp(new C3010n0(0));
        m107766Pp(new C2961d1(false));
        m107790vq();
    }

    /* renamed from: tr */
    private void m108041tr() {
        C23744a.m124114c().m124116d(5100, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ts */
    public /* synthetic */ void m108042ts(String str) {
        try {
            this.f101803s0.mo49315c4();
            int i11 = 0;
            while (true) {
                if (i11 >= this.f101671w.size()) {
                    break;
                }
                if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                    m107976Or(((C3000l0) this.f101671w.get(i11)).f11895q);
                    this.f101671w.remove(i11);
                    break;
                }
                i11++;
            }
            mo107650fc();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: us */
    public /* synthetic */ void m108043us() {
        this.f101803s0.mo82925B4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vs */
    public /* synthetic */ void m108044vs() {
        this.f101803s0.mo82925B4();
    }

    /* renamed from: vt */
    private void m108045vt() {
        this.f101803s0.mo82204aI(new C3046v(9));
    }

    /* renamed from: xr */
    private void m108046xr() {
        if (m108010es()) {
            m107944Bt();
            mo107650fc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xs */
    public /* synthetic */ void m108047xs() {
        this.f101803s0.mo82234oo(0, this.f101783Y);
    }

    /* renamed from: yr */
    private void m108048yr() {
        if (AbstractC23304d.f113354Z0) {
            m107958Gt();
            AbstractC23304d.f113354Z0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ys */
    public /* synthetic */ void m108049ys() {
        this.f101803s0.mo82244vx();
    }

    /* renamed from: zr */
    private void m108050zr() {
        if (!this.f101803s0.mo82168At()) {
            m107973Ms();
        }
    }

    /* renamed from: zt */
    private void m108051zt(boolean z11) {
        this.f101803s0.mo82998pf(z11);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: A6 */
    public void mo107840A6() {
        m108058Pr();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: An */
    public int mo107841An() {
        int i11 = this.f101782X;
        this.f101782X = -1;
        return i11;
    }

    @Override // iq.AbstractC20677f, iq.InterfaceC20650a
    /* renamed from: Bl */
    public void mo107635Bl(long j11) {
        super.mo107635Bl(j11);
        List<C3020p0> m108769L = AbstractC20826v0.m108769L(j11, this.f101671w);
        if (!m108769L.isEmpty()) {
            for (C3020p0 c3020p0 : m108769L) {
                if (c3020p0 != null) {
                    m107976Or(c3020p0.f12057p);
                }
            }
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Bn */
    public void mo107842Bn(ArrayList arrayList, Intent intent, String str, boolean z11, ArrayList arrayList2) {
        m108068as(arrayList);
        AbstractC20805l.m108546d(intent, str, this.f101671w);
        if (!TextUtils.isEmpty(str)) {
            if (z11) {
                m108052Br(str, false);
            } else if (arrayList2 != null && arrayList2.size() > 0) {
                m108077nt(str, arrayList2, false);
            }
        }
        m108021jt();
        m107792xq(250);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Bp */
    public void mo107843Bp(String str, boolean z11, String str2) {
        if (mo107915kp()) {
            m107986Ts(str, z11, str2);
        } else {
            m107988Us(str, z11, str2);
        }
    }

    /* renamed from: Br */
    public void m108052Br(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.f101671w != null) {
                for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                    if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                        ((C3000l0) this.f101671w.get(i11)).m14322a0().f12059r.m14388a();
                        if (z11) {
                            mo107650fc();
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: C0 */
    public void mo107844C0() {
        m107994Xr();
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
        this.f101803s0.mo82998pf(false);
        m107760Aq(false);
        this.f101803s0.mo82950Te(false);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Co */
    public void mo107846Co(ArrayList arrayList) {
        m108068as(arrayList);
        m108021jt();
        m107792xq(250);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: D3 */
    public void mo107847D3() {
        m107995Xs();
        m108074gt(m107783jq(mo107871T0()));
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: D4 */
    public void mo107848D4() {
        m107955Ft(new ArrayList(), 0);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: D7 */
    public void mo107849D7() {
        this.f101803s0.mo82176Ik();
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
                                this.f101803s0.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description));
                            }
                        } else {
                            this.f101803s0.mo82234oo(0, this.f101783Y);
                        }
                    }
                } else {
                    this.f101803s0.mo82236pm(false, mo107929t3(), false, "");
                }
            }
            this.f101803s0.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_load_music_failed));
            m108058Pr();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Do */
    public void mo107850Do() {
        m108063Tr();
    }

    /* renamed from: Dt */
    void m108053Dt(boolean z11, boolean z12) {
        this.f101803s0.mo82213dD(z11);
        this.f101803s0.mo82230nu(z11);
        this.f101803s0.mo82177Io(z12);
        this.f101803s0.mo82172Ff(z12);
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: E */
    public void mo107641E() {
        this.f101786b0 = "0";
        this.f101669u = true;
        String str = CoreUtility.f89233i;
        m108059Qr(str, str, "0", false);
        mo107773Yp(CoreUtility.f89233i);
        m108062Sr();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: E1 */
    public void mo107851E1() {
        if (!C24346a.f117452a.m127220c(this.f101806v0)) {
            this.f101806v0 = C24355e0.f117560a.m127358f();
            this.f101803s0.mo70710wy(new Runnable() { // from class: iq.r
                @Override // java.lang.Runnable
                public final void run() {
                    C20713m0.this.m108040rs();
                }
            });
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Ej */
    public void mo107852Ej() {
        m108063Tr();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Eo */
    public void mo107853Eo(C3000l0 c3000l0) {
        if (c3000l0 != null && !TextUtils.isEmpty(c3000l0.f11895q)) {
            this.f101803s0.m107939X(c3000l0);
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        m107940Ar();
        m108082ur();
        m108084vr();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: F3 */
    public void mo107854F3() {
        try {
            if (C23055e5.m118271f() && !this.f101780V) {
                m108062Sr();
                m107982Rr(CoreUtility.f89233i);
            } else {
                m108036pt();
                m108072et();
                this.f101803s0.mo82998pf(false);
                if (this.f101780V) {
                    this.f101803s0.mo82238sz();
                    this.f101780V = false;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: F8 */
    public void mo107855F8(C22033k0.g gVar) {
        if (gVar == C22033k0.g.ERROR_CODE_NOT_KYC) {
            this.f101803s0.mo78955kl(new Runnable() { // from class: iq.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C20713m0.this.m108049ys();
                }
            }, 200L);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Fc */
    public void mo107856Fc() {
        this.f101803s0.mo82227mD();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: G4 */
    public void mo107857G4() {
        mo107773Yp(CoreUtility.f89233i);
    }

    /* renamed from: Gr */
    C3019p m108054Gr() {
        return this.f101666O.m123079g();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Ha */
    public String mo107858Ha() {
        return AbstractC23304d.f113368c0.f42446v;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Ig */
    public void mo107859Ig() {
        this.f101803s0.mo78955kl(new Runnable() { // from class: iq.d0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m108047xs();
            }
        }, 250L);
    }

    /* renamed from: It */
    public void m108055It(String str) {
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        contactProfile.f42324B = this.f101785a0;
        try {
            this.f101652A.mo112406d(contactProfile.m40373K());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m108036pt();
        if (this.f101803s0.mo45894h0()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateCoverSuccess));
        }
        this.f101803s0.mo83001r4();
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.b0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107968Ks();
            }
        });
    }

    /* renamed from: Jr */
    protected void m108056Jr() {
        this.f101666O.mo123078a(66);
        this.f101666O.mo123078a(67);
        this.f101666O.mo123078a(69);
        this.f101666O.mo123078a(79);
        this.f101666O.mo123078a(70);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: L3 */
    public void mo107860L3() {
        if (this.f101669u && !this.f101670v && mo107653m3() != 1 && !m108020js()) {
            AbstractC23647d.m123907q("6560", this.f101803s0.mo82247y());
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                String str = CoreUtility.f89233i;
                m108059Qr(str, str, this.f101786b0, false);
            }
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: Ls */
    public void m108057Ls() {
        this.f101670v = true;
        C0824j.m2153b(new f());
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: M1 */
    public void mo107861M1() {
        String str;
        if (C32065p8.m154684c().m154691f()) {
            str = "800501";
        } else {
            str = "800502";
        }
        AbstractC23647d.m123897g(str);
        this.f101803s0.mo82236pm(true, mo107929t3(), false, "");
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Mk */
    public void mo107862Mk() {
        if (!TextUtils.isEmpty(CoreUtility.f89233i) && !CoreUtility.f89233i.equalsIgnoreCase("null")) {
            AbstractC23647d.m123897g("6401");
            C20785b.f102138a.m108465o(CoreUtility.f89233i, "social_profile");
            Bundle bundle = new Bundle();
            bundle.putString("avatarPhoto", "1");
            bundle.putString("userId", CoreUtility.f89233i);
            bundle.putString("defaultAvatar", AbstractC23304d.f113368c0.f42446v);
            bundle.putInt("EXTRA_INT_SUB_TITLE_MODE", 1);
            bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 4);
            bundle.putParcelable("extra_action_data", ActionDataImageViewer.m45080a());
            C20275e c20275e = new C20275e();
            c20275e.m105883v(true);
            C32002l4 c32002l4 = this.f101783Y;
            if (c32002l4 != null) {
                bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
            }
            this.f101803s0.mo82182LF(null, null, null, bundle, c20275e, 0, null);
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        C20779z1 c20779z1 = (C20779z1) interfaceC19969h;
        if (c20779z1 != null) {
            this.f101779U = c20779z1.f102128a;
            this.f101780V = c20779z1.f102129b;
            this.f101781W = c20779z1.f102130c;
            this.f101782X = c20779z1.f102131d;
            m108034pr(c20779z1.f102132e);
            if (c20779z1.f102128a) {
                AbstractC23304d.f113383f1 = false;
            }
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: O4 */
    public void mo107863O4(int i11) {
        switch (i11) {
            case 1:
                this.f101803s0.mo82224k2(CoreUtility.f89233i);
                return;
            case 2:
                this.f101803s0.mo82216eC();
                return;
            case 3:
                mo107862Mk();
                return;
            case 4:
                mo107886Zg();
                return;
            case 5:
                this.f101803s0.mo82233oc();
                return;
            case 6:
                mo107935y7();
                return;
            case 7:
                this.f101803s0.mo82242ur();
                return;
            default:
                return;
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Om */
    public void mo107864Om(String str) {
        if (!TextUtils.isEmpty(str)) {
            C26761p.m137741q().m137757K(str);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: P0 */
    public void mo107865P0() {
        boolean z11;
        try {
            boolean m154691f = C32065p8.m154684c().m154691f();
            if (m108018is() && m154691f) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f101809y0 = z11;
            this.f101808x0 = C32065p8.m154684c().m154688b();
            m108051zt(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: P6 */
    public void mo107866P6() {
        if (!this.f101803s0.mo82190R7() && !this.f101803s0.mo82200Yn()) {
            this.f101801q0 = C32017m4.m154326S().m154339K(this.f101783Y.m154284u(18));
            this.f101803s0.mo82229mw(CoreUtility.f89233i, EnumC24904a.f119497s.m129507c());
        }
    }

    /* renamed from: Pr */
    public void m108058Pr() {
        try {
            m107760Aq(true);
            if (AbstractC23304d.f113368c0 == null) {
                try {
                    String mo112421v = this.f101652A.mo112421v();
                    if (!TextUtils.isEmpty(mo112421v)) {
                        AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(mo112421v));
                    }
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                if (contactProfile.f42366P == null) {
                    String mo112409i = this.f101652A.mo112409i();
                    if (!TextUtils.isEmpty(mo112409i)) {
                        try {
                            JSONObject jSONObject = new JSONObject(mo112409i);
                            AbstractC23304d.f113368c0.f42366P = new ContactProfile.C7868d(jSONObject);
                            m107997Ys();
                        } catch (JSONException e12) {
                            e12.printStackTrace();
                        }
                    }
                } else {
                    m107997Ys();
                }
            }
            if (C23055e5.m118271f()) {
                this.f101652A.mo112380t0(CoreUtility.f89233i, AbstractC20826v0.m108765J(1), 0, 0, new d());
            } else {
                m108072et();
                this.f101803s0.mo82998pf(false);
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:            if (r5 != 4) goto L11;     */
    @Override // iq.InterfaceC20707l
    /* renamed from: Qe */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo107867Qe(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                this.f101803s0.mo82221hH(false);
            }
            if (i11 == 2 && (C22052u.m115085y() == null || !C22052u.m115085y().m115105z())) {
                this.f101803s0.mo82178Ip(8);
            } else {
                this.f101803s0.mo82178Ip(0);
            }
            this.f101803s0.mo82194UF();
        }
        this.f101803s0.mo82221hH(true);
        if (i11 == 2) {
        }
        this.f101803s0.mo82178Ip(0);
        this.f101803s0.mo82194UF();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Qm */
    public void mo107868Qm() {
        this.f101803s0.mo82234oo(1, this.f101783Y);
    }

    /* renamed from: Qr */
    public void m108059Qr(String str, String str2, String str3, boolean z11) {
        int i11;
        try {
            if (this.f101670v) {
                return;
            }
            if (z11) {
                this.f101803s0.mo82997pA();
            }
            this.f101670v = true;
            if (this.f101786b0.equals("0")) {
                i11 = 1;
            } else {
                i11 = this.f101796l0 + 1;
            }
            if (i11 > 1) {
                m107769Sp(new C3010n0(2));
            }
            this.f101652A.mo112358Z(str, str2, str3, i11, C32017m4.m154326S().m154380z(this.f101783Y), this.f101770A0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Qs */
    public boolean m108060Qs() {
        return this.f101775Q;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Ri */
    public void mo107869Ri() {
        ItemAlbumMobile itemAlbumMobile;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null) {
            itemAlbumMobile = contactProfile.m40376M();
        } else {
            itemAlbumMobile = null;
        }
        if (itemAlbumMobile != null) {
            AbstractC23647d.m123897g("6301");
            C20785b.f102138a.m108466p(CoreUtility.f89233i, "social_profile");
            this.f101803s0.mo82171E9(itemAlbumMobile, 0, false);
        }
    }

    /* renamed from: Rs */
    public void m108061Rs(final String str) {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.w
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m108042ts(str);
            }
        });
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: S9 */
    public void mo107870S9() {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.j0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m108044vs();
            }
        });
    }

    /* renamed from: Sr */
    public void m108062Sr() {
        int i11;
        if (!CoreUtility.f89233i.equals("") && !this.f101793i0) {
            b bVar = new b();
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                i11 = contactProfile.f42385V0;
            } else {
                i11 = 0;
            }
            this.f101652A.mo112366g(CoreUtility.f89233i, i11, new TrackingSource((short) 1036), true, bVar);
            this.f101793i0 = true;
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: T0 */
    public C24902e mo107871T0() {
        return this.f101794j0;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Tb */
    public void mo107872Tb() {
        m108053Dt(false, false);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Th */
    public void mo107873Th(ArrayList arrayList) {
        if (arrayList != null) {
            m107972Mr(arrayList);
            m107958Gt();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Tj */
    public void mo107874Tj() {
        this.f101776R = true;
        this.f101775Q = false;
    }

    /* renamed from: Tr */
    public void m108063Tr() {
        try {
            if (!m108060Qs()) {
                if (mo107915kp()) {
                }
            }
            if (m108060Qs()) {
                this.f101803s0.mo82233oc();
            } else if (mo107915kp()) {
                this.f101803s0.mo82245wj();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Ud */
    public void mo107875Ud() {
        boolean m107781hq = m107781hq();
        this.f101786b0 = "0";
        this.f101669u = true;
        String str = CoreUtility.f89233i;
        m108059Qr(str, str, "0", m107781hq);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Uo */
    public void mo107876Uo(boolean z11) {
        if (z11) {
            C25487t.f122084a.m132028c(C25487t.a.f122102z);
            m108000Zs(true, true);
        }
        m108036pt();
    }

    /* renamed from: Ur */
    public void m108064Ur() {
        if (!this.f101670v) {
            this.f101803s0.mo83001r4();
            this.f101786b0 = "0";
            this.f101669u = true;
            this.f101803s0.mo78955kl(new Runnable() { // from class: iq.y
                @Override // java.lang.Runnable
                public final void run() {
                    C20713m0.this.m108026ls();
                }
            }, 500L);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: V5 */
    public void mo107877V5() {
        this.f101803s0.mo82186Pi();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: V6 */
    public void mo107878V6(final String str, final boolean z11) {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.q
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107964Is(str, z11);
            }
        });
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: Vf */
    public void mo107648Vf(C23927b c23927b) {
        C32002l4 m154285v;
        if (c23927b == null) {
            return;
        }
        try {
            if (TextUtils.equals(c23927b.f115598b, "action.open.memorylist")) {
                m154285v = mo107651g().m154284u(28);
            } else {
                m154285v = mo107651g().m154285v("pos_qa", Integer.valueOf(this.f101656E.indexOf(c23927b)));
            }
            if (TextUtils.equals(c23927b.f115598b, "action.open.inapp")) {
                c23927b.f115608l = 16;
            }
            m107789uq(c23927b, m154285v);
            m108029nr(c23927b);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Vr */
    public void m108065Vr(String str, String str2) {
        try {
            this.f101803s0.mo46829Y();
            this.f101785a0 = str;
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            this.f101773D0 = nextInt;
            C24230h m126395Q = C24226d.m126395Q(nextInt, EnumC24229g.f116987u, str, 0L, false);
            this.f101771B0 = m126395Q;
            m126395Q.m126524s0(this.f101778T);
            this.f101771B0.m126535z0(this.f101802r0);
            this.f101771B0.m126501d0(str2);
            j jVar = new j();
            this.f101772C0 = jVar;
            this.f101771B0.m126505h(jVar);
            C24226d.m126402Z(this.f101771B0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Wi */
    public void mo107879Wi() {
        this.f101803s0.mo82169Cw();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Wl */
    public void mo107880Wl() {
        m108088yt(this.f101797m0);
    }

    /* renamed from: Wr */
    public String m108066Wr() {
        return AbstractC23304d.f113368c0.f42323A1;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: X */
    public void mo107881X() {
        if (this.f101803s0.mo78963ru()) {
            this.f101802r0 = C32017m4.m154326S().m154340L(this.f101783Y.m154284u(16));
            AbstractC23647d.m123907q("6300", this.f101803s0.mo82247y());
            this.f101803s0.mo82193Th();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: X4 */
    public void mo107882X4() {
        this.f101803s0.mo82238sz();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Xa */
    public void mo107883Xa(final String str, final boolean z11) {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.z
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107966Js(str, z11);
            }
        });
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Xk */
    public void mo107884Xk(boolean z11, Intent intent, String str) {
        if (z11) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f101671w.size()) {
                    break;
                }
                if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                    m107976Or(str);
                    this.f101671w.remove(i11);
                    break;
                }
                i11++;
            }
            m107958Gt();
        }
        boolean m108546d = AbstractC20805l.m108546d(intent, str, this.f101671w);
        if (z11 || m108546d) {
            mo107650fc();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Yj */
    public void mo107885Yj(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC20826v0.m108803d(str);
            C26761p.m137741q().m137764l(str);
            m108041tr();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Yr, reason: merged with bridge method [inline-methods] */
    public ContactProfile.C7870f mo107845Ce() {
        ContactProfile.C7868d c7868d;
        ContactProfile.C7872h c7872h;
        ContactProfile.C7870f c7870f = new ContactProfile.C7870f();
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null && (c7868d = contactProfile.f42366P) != null && (c7872h = c7868d.f42489w) != null) {
            return c7872h.m40465a();
        }
        return c7870f;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Zg */
    public void mo107886Zg() {
        this.f101803s0.mo82227mD();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: Zm */
    public void mo107887Zm(int i11, C3020p0 c3020p0) {
        ArrayList arrayList;
        if (i11 == 1000) {
            arrayList = (ArrayList) c3020p0.f12042V.m45138e();
        } else {
            arrayList = (ArrayList) PrivacyInfo.m45134q(i11).m45138e();
        }
        this.f101803s0.mo82166AG(arrayList);
    }

    @Override // iq.AbstractC20677f
    /* renamed from: Zp */
    protected void mo107774Zp() {
        boolean z11;
        boolean z12;
        boolean z13;
        C22012a c22012a;
        synchronized (this.f101664M) {
            try {
                this.f101663L.clear();
                C24880b c24880b = this.f101806v0;
                if (c24880b != null) {
                    C3054x m107830g = AbstractC20697j.m107830g(c24880b);
                    m107830g.m14656N(1);
                    this.f101667P.m117206h(m107830g);
                    this.f101666O.m123096f(new C2977g2(0));
                    this.f101667P.m117208j(new C3010n0(0));
                    this.f101803s0.mo82231nv();
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = this.f101671w;
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                    boolean z14 = !arrayList.isEmpty();
                    if (C22013a0.m114928g() && !TextUtils.isEmpty(this.f101665N) && C22013a0.m114924c().m114932h(6)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (TextUtils.equals(CoreUtility.f89233i, this.f101665N) && z14) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z14 && !z11) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m107945Cr(arrayList);
                    if (z12) {
                        this.f101663L.add(new C2966e1((C3000l0) null, (C3020p0) null, 62).m14032d(false));
                        this.f101663L.add(new C2966e1((C3000l0) null, (C3020p0) null, 54));
                    }
                    if (z11) {
                        this.f101663L.add(new C22012a(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_add)));
                        this.f101663L.add(new C22014b(this.f101665N));
                    }
                    if (z14) {
                        this.f101663L.addAll(C21909a.m114149b(arrayList, 2));
                    }
                    if (this.f101663L.size() > 0 && (this.f101663L.get(0) instanceof C22012a) && (c22012a = (C22012a) this.f101663L.get(0)) != null) {
                        c22012a.f108382M = true;
                    }
                    if (z13 && this.f101784Z) {
                        C3054x c3054x = new C3054x();
                        c3054x.m14648F(C23212s8.m119606n(AbstractC16781w.ProfilePrimaryBackgroundColor));
                        c3054x.m14666X(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_feed_title), AbstractC23304d.f113368c0.f42437s));
                        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_feed_desc));
                        c3054x.m14661S(AbstractC23136l9.m118742r(16.0f));
                        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_empty_feed_button));
                        c3054x.m14656N(2);
                        if (C23212s8.m119602i()) {
                            c3054x.m14657O(AbstractC23322a.zds_il_profile_empty_dark_spot_5_4);
                        } else {
                            c3054x.m14657O(AbstractC23322a.zds_il_profile_empty_light_spot_5_4);
                        }
                        this.f101667P.m117206h(c3054x);
                        this.f101666O.m123096f(new C2977g2(0));
                        this.f101667P.m117208j(new C3010n0(0));
                        this.f101803s0.mo82231nv();
                    } else {
                        this.f101667P.m117206h(new C3054x(false));
                    }
                }
                this.f101666O.m123092b();
                this.f101667P.m117200b();
                if (!this.f101663L.isEmpty()) {
                    this.f101663L.add(new C2966e1((C3000l0) null, (C3020p0) null, 62));
                }
                m108056Jr();
                this.f101663L.addAll(0, this.f101666O.m123093c());
                m107771Wp();
                this.f101663L.addAll(this.f101667P.m117204f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: al */
    public void mo107888al(C28212v6 c28212v6) {
        this.f101803s0.mo82189Qq(m108023ks(c28212v6));
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ao */
    public void mo107889ao(String str) {
        if (str != null && str.length() > 0) {
            if (!TextUtils.isEmpty(str)) {
                C26747f0.m137582I().m137653A0(str);
            }
            for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                    m107976Or(str);
                    this.f101671w.remove(i11);
                    mo107650fc();
                    return;
                }
            }
        }
    }

    /* renamed from: as */
    public void m108068as(ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    for (int size = this.f101671w.size() - 1; size >= 0; size--) {
                        C3000l0 c3000l0 = (C3000l0) this.f101671w.get(size);
                        c3000l0.m14292F(arrayList);
                        if (c3000l0.m14375y0()) {
                            m107976Or(c3000l0.f11895q);
                            this.f101671w.remove(size);
                        }
                    }
                    new C25405e().m101509a(arrayList);
                    m108021jt();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: at */
    public void m108069at(int i11) {
        m108008dt(3, i11);
        m108074gt(false);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: b */
    public void mo107890b(C25470c c25470c) {
        this.f101775Q = c25470c.m131939b("updateAvatar", false);
        this.f101776R = c25470c.m131939b("updateCover", false);
        this.f101777S = c25470c.m131939b("BOL_EXTRA_PUSH_FEED_AVATAR", this.f101777S);
        this.f101778T = c25470c.m131939b("BOL_EXTRA_PUSH_FEED_COVER", this.f101778T);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: b0 */
    public void mo107891b0(boolean z11) {
        m107973Ms();
        if (z11) {
            m108036pt();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: b1 */
    public void mo107892b1() {
        if (C24355e0.f117560a.m127362p()) {
            m108045vt();
        } else {
            this.f101803s0.mo82175I1(false, false, -100, 14);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: bj */
    public void mo107893bj() {
        if (C24355e0.f117560a.m127362p()) {
            m108045vt();
        } else {
            this.f101803s0.mo82240ts(1);
        }
    }

    /* renamed from: bt */
    public void m108070bt() {
        m108008dt(3, 400);
        m108074gt(false);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: c */
    public C25470c mo107894c() {
        C25470c c25470c = new C25470c();
        try {
            c25470c.m131945h("updateAvatar", m108060Qs());
            c25470c.m131945h("updateCover", mo107915kp());
            c25470c.m131945h("BOL_EXTRA_PUSH_FEED_AVATAR", m108081tt());
            c25470c.m131945h("BOL_EXTRA_PUSH_FEED_COVER", m108083ut());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c25470c;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: c2 */
    public void mo107895c2() {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.i0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m108043us();
            }
        });
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: cg */
    public void mo107896cg(ArrayList arrayList) {
        if (arrayList != null) {
            m107972Mr(arrayList);
            m107958Gt();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ci */
    public void mo107897ci() {
        m108027lt();
        C3006m1 c3006m1 = new C3006m1();
        C25959b c25959b = C25959b.f123885a;
        c3006m1.m14416g(c25959b.m133733b());
        c3006m1.m14415f(c25959b.m133732a());
        C25973p.f123927a.m133796i(c3006m1);
        C3000l0 c3000l0 = new C3000l0();
        c3000l0.f11898r0 = true;
        c3000l0.f11900s0 = c3006m1;
        m108012fs(c3000l0);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ck */
    public void mo107898ck(C26876b c26876b) {
        AbstractC23304d.f113354Z0 = false;
        m107944Bt();
        m107942At(c26876b);
        mo107650fc();
        if (!m107781hq()) {
            m107770Tp(new C2977g2(0));
        }
        this.f101803s0.mo82203Zx(AbstractC23304d.f113304M2);
        boolean mo82165A8 = this.f101803s0.mo82165A8();
        if (c26876b != null && mo82165A8) {
            int i11 = c26876b.f127178a;
            if (i11 == 3) {
                ToastUtils.showMess(true, AbstractC20826v0.m108749B(c26876b.f127180c), true, false, 0, AbstractC7409c0.photo_sent_toast_layout);
                m108021jt();
                if (!TextUtils.isEmpty(c26876b.f127179b) && AbstractC20826v0.m108834s0(c26876b.f127179b, this.f101671w, c26876b.f127181d)) {
                    this.f101803s0.mo82237pu(c26876b.f127179b);
                    return;
                }
                return;
            }
            if (i11 == 4 && !TextUtils.isEmpty(c26876b.f127179b)) {
                this.f101803s0.mo82237pu(c26876b.f127179b);
            }
        }
    }

    /* renamed from: ct */
    public void m108071ct(boolean z11) {
        m108008dt(1, 200);
        m108074gt(z11);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: de */
    public void mo107899de(int i11) {
        this.f101776R = true;
        this.f101775Q = false;
        if (i11 != 7) {
            if (i11 != 8) {
                if (i11 == 9) {
                    mo107850Do();
                    return;
                }
                return;
            }
            mo107856Fc();
            return;
        }
        mo107869Ri();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: e */
    public void mo107900e() {
        try {
            if (!C23055e5.m118271f()) {
                this.f101803s0.mo82971a0();
                mo107918n4();
            } else {
                this.f101803s0.mo82947T();
                AbstractC23647d.m123907q("6100", this.f101803s0.mo82247y());
                m107984Ss();
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: e3 */
    public void mo107901e3() {
        if (this.f101810z0) {
            this.f101810z0 = false;
            if (mo107643H6() && this.f101803s0.mo45894h0()) {
                if (m108018is()) {
                    C32065p8.m154684c().m154696k();
                } else {
                    m107992Ws(this.f101808x0, false);
                }
            }
        }
    }

    /* renamed from: et */
    public void m108072et() {
        m108008dt(3, 600);
        m108074gt(false);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: fd */
    public void mo107902fd(InterfaceC19969h interfaceC19969h) {
        C20779z1 c20779z1 = (C20779z1) interfaceC19969h;
        if (c20779z1 != null) {
            this.f101782X = c20779z1.f102131d;
            C32002l4 c32002l4 = c20779z1.f102132e;
            this.f101783Y = c32002l4;
            m108034pr(c32002l4);
        }
    }

    /* renamed from: ft */
    public void m108073ft() {
        m108008dt(2, 300);
        m108074gt(false);
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: g */
    public C32002l4 mo107651g() {
        return this.f101783Y;
    }

    /* renamed from: gt */
    public void m108074gt(final boolean z11) {
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.c0
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107950Es(z11);
            }
        });
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: hh */
    public void mo107903hh(C3020p0 c3020p0) {
        String str;
        if (c3020p0 != null) {
            str = c3020p0.m14469C();
        } else {
            str = "";
        }
        this.f101800p0 = str;
        this.f101803s0.mo82204aI(m107963Ir(8));
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ho */
    public void mo107904ho(List list, boolean z11) {
        MediaItem mediaItem;
        try {
            this.f101777S = z11;
            if (list != null && list.size() > 0 && (mediaItem = (MediaItem) list.get(0)) != null) {
                this.f101797m0 = "";
                this.f101799o0 = "";
                if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                    this.f101797m0 = mediaItem.m41113N();
                } else if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                    this.f101797m0 = mediaItem.mo41081Q();
                }
                if (!TextUtils.isEmpty(this.f101797m0)) {
                    if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                        this.f101799o0 = mediaItem.m41175w();
                    }
                    m108088yt(this.f101797m0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: ht */
    public void m108075ht() {
        m108008dt(3, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING);
        m108074gt(false);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: i5 */
    public void mo107905i5() {
        this.f101803s0.mo82246xI();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ia */
    public void mo107906ia() {
        this.f101802r0 = C32017m4.m154326S().m154340L(this.f101783Y);
        this.f101803s0.mo82193Th();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ig */
    public void mo107907ig(C22579r0 c22579r0, Bundle bundle) {
        if (c22579r0.f110491b) {
            m107970Lr(c22579r0.f110490a);
        } else {
            m107951Et(c22579r0, bundle);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: j7 */
    public void mo107908j7(String str) {
        try {
            this.f101786b0 = "0";
            this.f101669u = true;
            C3000l0 m137785c = C26767v.m137782d().m137785c(str);
            if (m137785c == null) {
                m137785c = C26878b.f127183a.m138450a(str);
            }
            if (m137785c != null && !this.f101671w.contains(m137785c)) {
                if (!m137785c.m14322a0().m14488S()) {
                    this.f101671w.add(0, m137785c);
                }
                mo107650fc();
                m107770Tp(new C2977g2(0));
                this.f101803s0.mo82237pu(str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: jk */
    public void mo107909jk(List list, boolean z11) {
        MediaItem mediaItem;
        String str;
        try {
            this.f101778T = z11;
            if (list != null && list.size() > 0 && (mediaItem = (MediaItem) list.get(0)) != null) {
                String str2 = "";
                if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                    str = mediaItem.m41113N();
                } else if (TextUtils.isEmpty(mediaItem.mo41081Q())) {
                    str = "";
                } else {
                    str = mediaItem.mo41081Q();
                }
                if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                    str2 = mediaItem.m41175w();
                }
                m108065Vr(str, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: k1 */
    public void mo107910k1() {
        String str;
        if (AbstractC23304d.f113368c0 != null && C3432a.f14402a.m17234c() && AbstractC23304d.f113368c0.m40357A0()) {
            this.f101803s0.mo82181Ke(101);
            return;
        }
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null && contactProfile.m40375L0()) {
            str = "6902";
        } else {
            str = "6901";
        }
        AbstractC23647d.m123897g(str);
        this.f101803s0.mo82207am();
        this.f101803s0.mo82966Y4("tip.edit.bio");
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: k6 */
    public void mo107911k6() {
        this.f101803s0.mo82220h7();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: kd */
    public void mo107912kd() {
        mo107650fc();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ke */
    public void mo107913ke() {
        this.f101802r0 = C32017m4.m154326S().m154340L(this.f101783Y.m154284u(19));
        this.f101803s0.mo82241uf(EnumC25467a.f122044r.m131933c());
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ki */
    public void mo107914ki() {
        this.f101801q0 = C32017m4.m154326S().m154339K(this.f101783Y);
        this.f101803s0.mo82229mw(CoreUtility.f89233i, EnumC24904a.f119496r.m129507c());
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: kp */
    public boolean mo107915kp() {
        return this.f101776R;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: lf */
    public String mo107916lf() {
        return this.f101781W;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: lp */
    public void mo107917lp() {
        this.f101775Q = true;
        this.f101776R = false;
    }

    /* renamed from: mt */
    public void m108076mt() {
        this.f101803s0.mo49315c4();
        this.f101803s0.mo82199XA();
        this.f101803s0.mo82202Zb(AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_remove_music));
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: n4 */
    public void mo107918n4() {
        if (!C23055e5.m118271f()) {
            if (this.f101666O.m123095e().m14128b() != 5) {
                this.f101803s0.mo82995nm(-2);
            } else {
                this.f101803s0.mo82170E6();
            }
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ng */
    public void mo107919ng(int i11, C3020p0 c3020p0) {
        ArrayList arrayList;
        if (i11 == 70) {
            List list = PrivacyInfo.f45971u;
            if (list != null && list.size() == 2) {
                AbstractC23647d.m123906p("13441");
            } else {
                AbstractC23647d.m123906p("13440");
            }
            AbstractC23647d.m123893c();
            this.f101803s0.mo82166AG(new ArrayList());
            return;
        }
        if (i11 == 80) {
            List list2 = PrivacyInfo.f45971u;
            if (list2 != null && list2.size() == 2) {
                AbstractC23647d.m123906p("13451");
            } else {
                AbstractC23647d.m123906p("13450");
            }
            AbstractC23647d.m123893c();
            this.f101803s0.mo82252zh();
            return;
        }
        if (i11 == 90) {
            ArrayList arrayList2 = new ArrayList();
            PrivacyInfo privacyInfo = c3020p0.f12042V;
            if (privacyInfo != null && (arrayList = privacyInfo.f45974q) != null && privacyInfo.f45977t == i11) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    arrayList2.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                }
            }
            this.f101803s0.mo82197Vv(arrayList2);
            return;
        }
        if (c3020p0.f12042V.f45977t != i11) {
            this.f101803s0.mo82188Qj(c3020p0.f12057p, i11);
        }
    }

    /* renamed from: nt */
    public void m108077nt(String str, ArrayList arrayList, boolean z11) {
        if (!TextUtils.isEmpty(str) && arrayList != null && arrayList.size() > 0) {
            try {
                if (this.f101671w != null) {
                    for (int i11 = 0; i11 < this.f101671w.size(); i11++) {
                        if (((C3000l0) this.f101671w.get(i11)).f11895q.equals(str)) {
                            ((C3000l0) this.f101671w.get(i11)).m14322a0().m14530v0(arrayList, true);
                            if (z11) {
                                mo107650fc();
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: o1 */
    public void mo107920o1() {
        boolean z11;
        try {
            boolean m154691f = C32065p8.m154684c().m154691f();
            if (m108018is() && m154691f) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f101810z0 = z11;
            this.f101808x0 = C32065p8.m154684c().m154688b();
            m108051zt(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: o2 */
    public void mo107921o2(String str, PrivacyInfo privacyInfo) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f101671w.size()) {
                break;
            }
            C3000l0 c3000l0 = (C3000l0) this.f101671w.get(i11);
            if (c3000l0.f11895q.equals(str)) {
                c3000l0.m14322a0().f12042V = privacyInfo;
                break;
            }
            i11++;
        }
        this.f101803s0.mo70710wy(new Runnable() { // from class: iq.x
            @Override // java.lang.Runnable
            public final void run() {
                C20713m0.this.m107941As();
            }
        });
        new C25430q0().m101508a(new C25430q0.a(str, privacyInfo, true));
        this.f101803s0.mo49315c4();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: o6 */
    public void mo107922o6() {
        if (AbstractC23304d.f113368c0 != null && C3432a.f14402a.m17234c() && AbstractC23304d.f113368c0.m40357A0()) {
            this.f101803s0.mo82181Ke(102);
        } else {
            this.f101803s0.mo82207am();
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: om */
    public void mo107923om() {
        this.f101803s0.mo82219fm();
    }

    @Override // iq.InterfaceC20707l
    public void onResume() {
        m108050zr();
        m108036pt();
        m108046xr();
        m108048yr();
        if (!m107780gq()) {
            m107990Vs();
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: pb */
    public void mo107654pb() {
        C31862c m107777dq = m107777dq();
        if (m107777dq == null || m107777dq.m153154f()) {
            m107778eq(CoreUtility.f89233i);
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: pg */
    public void mo107655pg() {
        m107778eq(CoreUtility.f89233i);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: pn */
    public void mo107924pn(String str, String str2) {
        this.f101803s0.mo83002uI("action.open.inapp", 0, str2, null);
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: qb */
    public void mo107656qb() {
        mo107650fc();
        m108057Ls();
        m107786qq();
        m108087xt();
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: r7 */
    public void mo107925r7() {
        m107977Os();
        this.f101803s0.mo82250yz(this.f101783Y.m154284u(56));
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ra */
    public void mo107926ra(String str, int i11) {
        if (!TextUtils.isEmpty(str)) {
            m107794zq(true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m107955Ft(arrayList, i11);
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: ri */
    public void mo107657ri() {
        m107794zq(false);
        this.f101803s0.mo82234oo(0, this.f101783Y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // iq.AbstractC20677f
    /* renamed from: rq */
    public void mo107787rq(List list, boolean z11, boolean z12) {
        super.mo107787rq(list, z11, z12);
        if (!z12) {
            m108038qt(2000L);
        }
    }

    /* renamed from: rt */
    public void m108078rt() {
        if (this.f101809y0) {
            this.f101809y0 = false;
            if (mo107643H6() && this.f101803s0.mo45894h0()) {
                if (m108018is()) {
                    C32065p8.m154684c().m154696k();
                } else {
                    m107992Ws(this.f101808x0, false);
                }
            }
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: s */
    public void mo107927s(C3054x c3054x) {
        try {
            if (c3054x.m14684p() == 1) {
                this.f101803s0.mo83002uI(c3054x.m14669a(), 0, c3054x.m14670b(), this.f101783Y);
                return;
            }
            if (c3054x.m14684p() == 2) {
                if (C24355e0.f117560a.m127362p()) {
                    m108045vt();
                    return;
                }
                AbstractC23647d.m123907q("6802", this.f101803s0.mo82247y());
                this.f101803s0.mo82175I1(false, false, -100, 22);
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: s1 */
    public void mo107928s1() {
        if (C24355e0.f117560a.m127362p()) {
            m108045vt();
            return;
        }
        AbstractC23647d.m123907q("6802", this.f101803s0.mo82247y());
        this.f101803s0.mo82175I1(false, false, -100, 16);
        AbstractC23647d.m123893c();
    }

    @Override // iq.AbstractC20677f
    /* renamed from: sq */
    protected void mo107788sq(String str) {
        m108061Rs(str);
    }

    /* renamed from: sr */
    public void m108079sr() {
        this.f101803s0.mo82981h6(C2343e.m12307a(CoreUtility.f89233i, false), AbstractC23028c0.m118087g(AbstractC23304d.f113368c0.f42437s));
    }

    /* renamed from: st */
    public void m108080st(C24902e c24902e) {
        this.f101794j0 = c24902e;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: t3 */
    public String mo107929t3() {
        ContactProfile.C7868d c7868d;
        ContactProfile.C7872h c7872h;
        List m40468d;
        String str = "";
        try {
            C24902e c24902e = this.f101794j0;
            if (c24902e != null) {
                return c24902e.m129490f();
            }
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && (c7868d = contactProfile.f42366P) != null && (c7872h = c7868d.f42489w) != null && (m40468d = c7872h.m40468d()) != null && !m40468d.isEmpty()) {
                str = (String) m40468d.get(0);
            }
            C24902e c24902e2 = new C24902e();
            this.f101794j0 = c24902e2;
            c24902e2.m129497m(str);
            return str;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: t7 */
    public void mo107930t7() {
        m107979Ps();
        this.f101803s0.mo82250yz(this.f101783Y.m154284u(55));
        this.f101803s0.mo82924Aw("tip.profile.limitfeedview", false);
    }

    /* renamed from: tt */
    public boolean m108081tt() {
        return this.f101777S;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: u */
    public void mo107931u() {
        if (C23055e5.m118272g(true)) {
            String str = CoreUtility.f89233i;
            m108059Qr(str, str, this.f101786b0, false);
            mo107773Yp(CoreUtility.f89233i);
        }
    }

    /* renamed from: ur */
    public void m108082ur() {
        this.f101775Q = false;
    }

    /* renamed from: ut */
    public boolean m108083ut() {
        return this.f101778T;
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: vj */
    public void mo107932vj(String str) {
        m107794zq(true);
        this.f101803s0.mo82986jh(str);
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: vp */
    public void mo107933vp() {
        this.f101803s0.mo83002uI("action.open.kyc", 0, "", this.f101783Y.m154284u(91));
    }

    /* renamed from: vr */
    public void m108084vr() {
        this.f101776R = false;
    }

    /* renamed from: wr */
    public void m108085wr() {
        long j11;
        if (mo107643H6() && this.f101652A.mo112398T() && this.f101803s0.mo45894h0()) {
            ContactProfile.C7873i m107999Zr = m107999Zr();
            if (m107999Zr != null) {
                j11 = m107999Zr.m40471a();
            } else {
                j11 = 0;
            }
            m107992Ws((int) j11, true);
        }
    }

    /* renamed from: wt */
    public void m108086wt() {
        if (!TextUtils.isEmpty(this.f101794j0.m129490f())) {
            this.f101803s0.mo82236pm(true, this.f101794j0.m129490f(), true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_music_apply_music));
        }
    }

    /* renamed from: xt */
    public void m108087xt() {
        if (!C23055e5.m118271f()) {
            this.f101803s0.mo82995nm(-2);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: y1 */
    public void mo107934y1() {
        try {
            mo107650fc();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: y7 */
    public void mo107935y7() {
        this.f101803s0.mo82192S6(CoreUtility.f89233i, 0, this.f101783Y);
    }

    /* renamed from: yt */
    void m108088yt(String str) {
        if (this.f101803s0.mo82200Yn()) {
            return;
        }
        m108053Dt(true, false);
        if (this.f101807w0 == null) {
            this.f101807w0 = AbstractC23306f.m120609P1();
        }
        this.f101807w0.m101508a(new C27357a.a(str, this.f101777S, this.f101799o0, this.f101801q0, false));
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: z1 */
    public void mo107936z1(C20096c c20096c) {
        this.f101803s0.mo49315c4();
        if (c20096c != null) {
            this.f101803s0.mo78936E(c20096c.m104492d());
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: zb */
    public void mo107937zb(String str, boolean z11, ArrayList arrayList) {
        if (z11) {
            m108052Br(str, true);
        } else if (arrayList != null && arrayList.size() > 0) {
            m108077nt(str, arrayList, true);
        }
    }

    @Override // iq.InterfaceC20707l
    /* renamed from: ze */
    public void mo107938ze(Intent intent) {
        if (intent != null && intent.hasExtra("is_update_limit_feed_success")) {
            boolean booleanExtra = intent.getBooleanExtra("is_update_limit_feed_success", false);
            this.f101803s0.mo82947T();
            this.f101803s0.mo82222ix(booleanExtra);
            if (booleanExtra) {
                mo107897ci();
            }
        }
    }

    @Override // iq.InterfaceC20650a
    /* renamed from: zn */
    public void mo107661zn() {
        m107794zq(false);
        this.f101803s0.mo82236pm(true, mo107929t3(), false, "");
    }
}
