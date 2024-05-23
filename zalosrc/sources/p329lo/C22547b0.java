package p329lo;

import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import ar.C2301c;
import ar.C2310k;
import ar.C2312m;
import ar.C2314o;
import ar.C2321v;
import bo.AbstractC2959d;
import bo.AbstractC3035s0;
import bo.C2954c;
import bo.C2964e;
import bo.C2969f;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3039t0;
import bo.C3042u;
import bo.C3047v0;
import bo.C3054x;
import bo.C3060y1;
import bo.InterfaceC2946a1;
import c30.C3255n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8550b;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.C10872k;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.C10881t;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import gs.C19591a;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import io.C20637a;
import is.AbstractC20789d;
import is.AbstractC20805l;
import is.AbstractC20826v0;
import is.AbstractC20828w0;
import is.AbstractC20833z;
import is.C20785b;
import is.C20791e;
import is.C20834z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23216t1;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mp.C23413a;
import mp.C23415c;
import mp.C23416d;
import no.C23908a;
import no.C23909b;
import no.C23910c;
import no.C23911d;
import no.C23912e;
import no.C23913f;
import no.C23914g;
import no.C23915h;
import org.json.JSONObject;
import p107dq.C18054j;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p217hs.C20120e;
import p302ko.C21785g;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p329lo.C22547b0;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p398oo.C24346a;
import p398oo.C24355e0;
import p398oo.C24371m0;
import p399op.C24390b;
import p425po.C24880b;
import p455qo.C25408f0;
import p455qo.C25418k0;
import p455qo.C25428p0;
import p455qo.C25430q0;
import p458qr.C25470c;
import p471r3.C25630b;
import p510sq.C26365a;
import p583vq.C28594q;
import p588vw.C28644j;
import p691yr.AbstractC31052b;
import p691yr.C31060j;
import p691yr.EnumC31051a;
import p716zh.C31862c;
import p716zh.C31877d;
import p716zh.C31995kc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pr.C24906b;
import tn.C26736a;
import tn.C26744e;
import tn.C26746f;
import tn.C26747f0;
import tn.C26748g;
import tn.C26761p;
import tn.C26767v;
import tr.C26878b;
import tr.C26883g;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: lo.b0 */
/* loaded from: classes4.dex */
public class C22547b0 extends AbstractC19962a implements InterfaceC22544a {

    /* renamed from: A */
    ContactProfile f110320A;

    /* renamed from: B */
    boolean f110321B;

    /* renamed from: C */
    boolean f110322C;

    /* renamed from: D */
    ArrayList f110323D;

    /* renamed from: E */
    List f110324E;

    /* renamed from: F */
    String f110325F;

    /* renamed from: G */
    String f110326G;

    /* renamed from: H */
    int f110327H;

    /* renamed from: I */
    String f110328I;

    /* renamed from: J */
    String f110329J;

    /* renamed from: K */
    String f110330K;

    /* renamed from: L */
    TrackingSource f110331L;

    /* renamed from: M */
    C32002l4 f110332M;

    /* renamed from: N */
    int f110333N;

    /* renamed from: O */
    int f110334O;

    /* renamed from: P */
    public int f110335P;

    /* renamed from: Q */
    public int f110336Q;

    /* renamed from: R */
    public int f110337R;

    /* renamed from: S */
    public boolean f110338S;

    /* renamed from: T */
    public boolean f110339T;

    /* renamed from: U */
    private boolean f110340U;

    /* renamed from: V */
    public boolean f110341V;

    /* renamed from: W */
    public boolean f110342W;

    /* renamed from: X */
    public boolean f110343X;

    /* renamed from: Y */
    public boolean f110344Y;

    /* renamed from: Z */
    private boolean f110345Z;

    /* renamed from: a0 */
    public boolean f110346a0;

    /* renamed from: b0 */
    private int f110347b0;

    /* renamed from: c0 */
    private final C23415c f110348c0;

    /* renamed from: d0 */
    private final C21785g f110349d0;

    /* renamed from: e0 */
    private boolean f110350e0;

    /* renamed from: f0 */
    private boolean f110351f0;

    /* renamed from: g0 */
    private boolean f110352g0;

    /* renamed from: h0 */
    public boolean f110353h0;

    /* renamed from: i0 */
    private int f110354i0;

    /* renamed from: j0 */
    protected InterfaceC2946a1 f110355j0;

    /* renamed from: k0 */
    private C3060y1 f110356k0;

    /* renamed from: l0 */
    private C19591a f110357l0;

    /* renamed from: m0 */
    boolean f110358m0;

    /* renamed from: n0 */
    Handler f110359n0;

    /* renamed from: o0 */
    private final C26746f.b f110360o0;

    /* renamed from: p0 */
    int f110361p0;

    /* renamed from: q0 */
    C24880b f110362q0;

    /* renamed from: t */
    String f110363t;

    /* renamed from: u */
    C3000l0 f110364u;

    /* renamed from: v */
    C3020p0 f110365v;

    /* renamed from: w */
    long f110366w;

    /* renamed from: x */
    int f110367x;

    /* renamed from: y */
    int f110368y;

    /* renamed from: z */
    String f110369z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m116783e() {
            try {
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
                C22547b0 c22547b0 = C22547b0.this;
                c22547b0.f110321B = true;
                ((InterfaceC22546b) c22547b0.m103742Dp()).mo79607Dm();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m116784f(C20096c c20096c) {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            if (c20096c != null && !TextUtils.isEmpty(c20096c.m104492d())) {
                ToastUtils.showMess(c20096c.m104492d());
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.z
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.a.this.m116784f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                String str = C22547b0.this.f110365v.f12057p;
                if (!C26883g.m138517f(0).m138524b(str)) {
                    if (C26883g.m138517f(1).m138524b(str)) {
                    }
                    C22547b0.this.m116757uq(new Runnable() { // from class: lo.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.a.this.m116783e();
                        }
                    });
                }
                C20834z0.f102412a.m108927f(true);
                C22547b0.this.m116757uq(new Runnable() { // from class: lo.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22547b0.a.this.m116783e();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m116786d() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_hidefeedsuccess));
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo79607Dm();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            try {
                C26747f0 m137582I = C26747f0.m137582I();
                if (C22547b0.this.f110356k0 != null) {
                    str = C22547b0.this.f110356k0.m14709a();
                } else {
                    str = "";
                }
                m137582I.m137617f0(str);
                C22547b0.this.m116757uq(new Runnable() { // from class: lo.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22547b0.b.this.m116786d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f110372a;

        /* renamed from: b */
        final /* synthetic */ boolean f110373b;

        c(ContactProfile contactProfile, boolean z11) {
            this.f110372a = contactProfile;
            this.f110373b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m116790f() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo79607Dm();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (((InterfaceC22546b) C22547b0.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
                ToastUtils.m89259g(c20096c.m104491c());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final int parseInt;
            try {
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && (parseInt = Integer.parseInt(new JSONObject(jSONObject.getString("data")).getString("code"))) != 0) {
                    C22547b0.this.m116757uq(new Runnable() { // from class: lo.d0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ToastUtils.m89259g(parseInt);
                        }
                    });
                } else {
                    AbstractC23047d8.m118259k(this.f110372a, this.f110373b, new SensitiveData("phonebook_delete_in_post_detail", "phonebook_delete"));
                    C22547b0.this.m116757uq(new Runnable() { // from class: lo.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.c.this.m116790f();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: lo.b0$d */
    /* loaded from: classes4.dex */
    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                if (message.what == 1000) {
                    C22547b0.this.m116681Cr();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$e */
    /* loaded from: classes4.dex */
    public class e implements C26746f.b {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m116792c(JSONObject jSONObject) {
            List<C10873l> list;
            try {
                if (((InterfaceC22546b) C22547b0.this.m103742Dp()).mo45894h0() && jSONObject != null && (list = C22547b0.this.f110324E) != null) {
                    for (C10873l c10873l : list) {
                        c10873l.m56502y0(jSONObject.optJSONObject(c10873l.m56493u()));
                    }
                    ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo78349kC(C22547b0.this.f110324E);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // tn.C26746f.b
        /* renamed from: a */
        public void mo46704a(final JSONObject jSONObject) {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo70710wy(new Runnable() { // from class: lo.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.e.this.m116792c(jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C10873l f110377a;

        f(C10873l c10873l) {
            this.f110377a = c10873l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m116794d() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo78960q3();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delete_comment_fail));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.f.this.m116794d();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C22547b0.this.m116708Rq(this.f110377a.m56493u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$g */
    /* loaded from: classes4.dex */
    public class g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f110379a;

        /* renamed from: b */
        final /* synthetic */ boolean f110380b;

        /* renamed from: c */
        final /* synthetic */ boolean f110381c;

        g(boolean z11, boolean z12, boolean z13) {
            this.f110379a = z11;
            this.f110380b = z12;
            this.f110381c = z13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m116796d(boolean z11, boolean z12, boolean z13) {
            try {
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo78314Ay(C22547b0.this.f110365v.f12022B.f12279a);
                C22547b0 c22547b0 = C22547b0.this;
                c22547b0.f110337R = c22547b0.f110365v.f12025E.f12243a;
                ((InterfaceC22546b) c22547b0.m103742Dp()).mo79612Qa(C22547b0.this.m116774Pq(true));
                C23910c m116773Mq = C22547b0.this.m116773Mq(false);
                m116773Mq.f115557t = z11;
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo79654tf(m116773Mq);
                C22547b0 c22547b02 = C22547b0.this;
                c22547b02.f110341V = z12;
                c22547b02.f110342W = z13;
                c22547b02.mo112346y2(false);
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo78344e3(C22547b0.this.f110365v);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22547b0.this.m116713Vq(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String str;
            String m95947a;
            try {
                C3020p0 c3020p0 = C22547b0.this.f110365v;
                if (c3020p0 != null) {
                    jSONObject = c3020p0.m14474E0();
                } else {
                    jSONObject = null;
                }
                C24355e0.f117560a.m127364t(true);
                JSONObject jSONObject2 = ((JSONObject) obj).getJSONObject("data").getJSONObject("feed");
                C22547b0 c22547b0 = C22547b0.this;
                C3000l0 c3000l0 = c22547b0.f110364u;
                if (c3000l0 != null) {
                    str = c3000l0.f11869R;
                } else {
                    str = "";
                }
                c22547b0.f110364u = AbstractC20826v0.m108750B0(jSONObject2);
                if (!TextUtils.isEmpty(str)) {
                    C22547b0.this.f110364u.f11869R = str;
                }
                if (AbstractC3035s0.f12230b) {
                    C22547b0.this.f110364u = AbstractC3035s0.m14607q();
                }
                C22547b0 c22547b02 = C22547b0.this;
                C3000l0 c3000l02 = c22547b02.f110364u;
                if (c3000l02 != null) {
                    c22547b02.f110365v = c3000l02.m14322a0();
                    C22547b0 c22547b03 = C22547b0.this;
                    if (c22547b03.f110365v != null) {
                        if (!c22547b03.f110343X) {
                            c22547b03.m116761wq(c22547b03.mo112324I());
                        }
                        if (C22547b0.this.f110365v.m14504e0()) {
                            new C25408f0().m101508a(new C25408f0.a(C22547b0.this.f110365v.f12023C.f12106O));
                        }
                        new C25418k0().m101508a(new C25418k0.a(C22547b0.this.f110365v));
                        if (C22547b0.this.f110365v.m14465A().equals(CoreUtility.f89233i)) {
                            new C25428p0().m101508a(new C25428p0.a(C22547b0.this.f110364u));
                        }
                        C22547b0 c22547b04 = C22547b0.this;
                        final boolean z11 = this.f110379a;
                        final boolean z12 = this.f110380b;
                        final boolean z13 = this.f110381c;
                        c22547b04.m116757uq(new Runnable() { // from class: lo.h0
                            @Override // java.lang.Runnable
                            public final void run() {
                                C22547b0.g.this.m116796d(z11, z12, z13);
                            }
                        });
                        C22547b0.this.m116780z6();
                        C22547b0 c22547b05 = C22547b0.this;
                        c22547b05.m116686Fq(c22547b05.f110365v);
                        C22547b0 c22547b06 = C22547b0.this;
                        c22547b06.m116688Gq(c22547b06.f110364u);
                        if (C22547b0.this.m116719Zq() && C22547b0.this.f110356k0 != null) {
                            C23744a.m124114c().m124116d(6043, C22547b0.this.f110356k0.f12368b);
                        }
                        C22547b0 c22547b07 = C22547b0.this;
                        if (c22547b07.f110365v != null) {
                            ((InterfaceC22546b) c22547b07.m103742Dp()).mo79645o1(C22547b0.this.f110365v.f12058q);
                        }
                        C3020p0 c3020p02 = C22547b0.this.f110365v;
                        if (c3020p02 != null && c3020p02.f12023C.f12127r.m95928a() != null && jSONObject != null) {
                            C3020p0 m108752C0 = AbstractC20826v0.m108752C0(jSONObject, 0);
                            C18054j m95914b = C22547b0.this.f110365v.f12023C.f12127r.m95928a().m95914b();
                            if (m95914b != null) {
                                if (C23212s8.m119603k()) {
                                    m95947a = m95914b.m95948b();
                                } else {
                                    m95947a = m95914b.m95947a();
                                }
                                if (m95947a != null && AbstractC20828w0.Companion.m108852a(m108752C0, m95947a)) {
                                    ToastUtils.m89266n(AbstractC8020f0.str_warning_theme_lunar_new_year_2024_expired_feed_detail, new Object[0]);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$h */
    /* loaded from: classes4.dex */
    public class h implements InterfaceC20094a {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m116799e() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m116800f() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.j0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.h.this.m116800f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.h.this.m116799e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$i */
    /* loaded from: classes4.dex */
    public class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f110384a;

        i(C3000l0 c3000l0) {
            this.f110384a = c3000l0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C21785g c21785g = C22547b0.this.f110349d0;
                String str = CoreUtility.f89233i;
                C3000l0 c3000l0 = this.f110384a;
                c21785g.mo112389H(str, c3000l0.f11895q, AbstractC20826v0.m108827p(c3000l0).toString());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$j */
    /* loaded from: classes4.dex */
    public class j implements InterfaceC20094a {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m116803e() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m116804f() {
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.j.this.m116804f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.j.this.m116803e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lo.b0$k */
    /* loaded from: classes4.dex */
    public class k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f110387a;

        k(boolean z11) {
            this.f110387a = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m116807e(boolean z11) {
            C3020p0 c3020p0 = C22547b0.this.f110365v;
            if (c3020p0 != null) {
                c3020p0.f12065x = z11;
                new C25418k0().m101508a(new C25418k0.a(C22547b0.this.f110365v));
            }
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
            ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo79612Qa(C22547b0.this.m116774Pq(true));
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_subcribe_feed_success));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_unsubcribe_feed_success));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m116808f(C20096c c20096c) {
            try {
                ((InterfaceC22546b) C22547b0.this.m103742Dp()).mo49315c4();
                if (c20096c != null) {
                    if (c20096c.m104491c() == 1001) {
                        C22547b0.this.m116775Sq(false);
                    } else if (!TextUtils.isEmpty(c20096c.m104492d())) {
                        ToastUtils.showMess(c20096c.m104492d());
                    }
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            C22547b0.this.m116757uq(new Runnable() { // from class: lo.n0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.k.this.m116808f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C22547b0 c22547b0 = C22547b0.this;
            final boolean z11 = this.f110387a;
            c22547b0.m116757uq(new Runnable() { // from class: lo.m0
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.k.this.m116807e(z11);
                }
            });
        }
    }

    public C22547b0(InterfaceC22546b interfaceC22546b, C21785g c21785g) {
        super(interfaceC22546b);
        this.f110328I = "";
        this.f110329J = "";
        this.f110330K = "";
        this.f110345Z = false;
        this.f110353h0 = true;
        this.f110355j0 = null;
        this.f110358m0 = false;
        this.f110359n0 = new d(Looper.getMainLooper());
        this.f110360o0 = new e();
        this.f110361p0 = 0;
        this.f110362q0 = null;
        this.f110348c0 = C23415c.m123032b();
        this.f110349d0 = c21785g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ar */
    public /* synthetic */ void m116677Ar() {
        ((InterfaceC22546b) m103742Dp()).mo49315c4();
        ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
        ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
    }

    /* renamed from: B0 */
    private void m116678B0(ContactProfile contactProfile, boolean z11) {
        ((InterfaceC22546b) m103742Dp()).mo46829Y();
        this.f110349d0.mo112349B0(contactProfile.f42434r, 32, new c(contactProfile, z11));
    }

    /* renamed from: Bq */
    private void m116679Bq(String str, MediaItem mediaItem, String str2) {
        C10873l m123037f = C23415c.m123032b().m123037f(C23416d.m123038a().m123073w(2).m123064n(m116723br(this.f110365v)).m123065o(this.f110365v.f12057p).m123071u(this.f110365v.m14465A()).m123072v(C32017m4.m154326S().m154372r(m116697Lq())).m123066p(str).m123067q(mediaItem).m123069s(str2, this.f110328I, this.f110329J).m123063m(), 0, m116694Jq());
        if (this.f110324E == null) {
            this.f110324E = new ArrayList();
        }
        if (m123037f != null) {
            this.f110324E.add(m123037f);
            ((InterfaceC22546b) m103742Dp()).mo78320I2(false, this.f110357l0);
        }
        if (((InterfaceC22546b) m103742Dp()).mo45894h0()) {
            this.f110328I = "";
            this.f110329J = "";
            this.f110330K = "";
            ((InterfaceC22546b) m103742Dp()).mo78338U3(this.f110324E);
        }
    }

    /* renamed from: Cq */
    private void m116680Cq(C19591a c19591a, String str, String str2) {
        try {
            if (!this.f110353h0) {
                return;
            }
            m116763xq(C28644j.m143233Y().m143282P0(c19591a.m102559b()), c19591a.m102561d(), str, str2);
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cr */
    public void m116681Cr() {
        C3000l0 m137785c = C26767v.m137782d().m137785c(this.f110363t);
        this.f110364u = m137785c;
        C3000l0 m108788U0 = AbstractC20826v0.m108788U0(m137785c);
        this.f110364u = m108788U0;
        if (m108788U0 != null) {
            C3020p0 m14322a0 = m108788U0.m14322a0();
            this.f110365v = m14322a0;
            if (m14322a0 != null) {
                this.f110337R = m14322a0.f12025E.f12243a;
                m116686Fq(m14322a0);
            }
            m116688Gq(this.f110364u);
            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
            ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(true));
            this.f110361p0 = 0;
            return;
        }
        if (this.f110361p0 > 12) {
            m116775Sq(false);
            this.f110361p0 = 0;
        } else {
            this.f110359n0.sendEmptyMessageDelayed(1000, 400L);
            this.f110361p0++;
        }
    }

    /* renamed from: Dq */
    private void m116682Dq(String str, String str2) {
        if (this.f110365v == null) {
            return;
        }
        C10873l m123037f = C23415c.m123032b().m123037f(C23416d.m123038a().m123073w(0).m123064n(m116723br(this.f110365v)).m123065o(this.f110365v.f12057p).m123071u(this.f110365v.m14465A()).m123072v(C32017m4.m154326S().m154372r(m116697Lq())).m123066p(str).m123069s(str2, this.f110328I, this.f110329J).m123063m(), 0, m116694Jq());
        if (this.f110324E == null) {
            this.f110324E = new ArrayList();
        }
        if (m123037f != null) {
            this.f110324E.add(m123037f);
        }
        if (((InterfaceC22546b) m103742Dp()).mo45894h0()) {
            this.f110328I = "";
            this.f110329J = "";
            this.f110330K = "";
            ((InterfaceC22546b) m103742Dp()).mo78338U3(this.f110324E);
        }
    }

    /* renamed from: Dr */
    private void m116683Dr() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(this.f110332M.m154284u(74)), false);
    }

    /* renamed from: Eq */
    private void m116684Eq(boolean z11, boolean z12, boolean z13, boolean z14) {
        int i11;
        try {
            C23911d m116703Oq = m116703Oq(z11, null);
            ((InterfaceC22546b) m103742Dp()).mo79661yi(m116703Oq);
            if (z11 && m116703Oq.f115559b == 0) {
                ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(true));
            }
            g gVar = new g(z14, z12, z13);
            if (this.f110367x == 1 && (i11 = this.f110368y) != -1) {
                this.f110349d0.mo112363e0(this.f110363t, i11, this.f110331L, gVar);
            } else {
                this.f110349d0.mo112347A0(this.f110363t, CoreUtility.f89233i, "1", "2", this.f110331L, this.f110366w, gVar);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Er */
    private void m116685Er() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(this.f110332M.m154284u(73)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fq */
    public void m116686Fq(final C3020p0 c3020p0) {
        C3025q0 c3025q0;
        SongInfo songInfo;
        if (C20791e.f102159a.m108488d() && c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (songInfo = c3025q0.f12108Q) != null) {
            this.f110355j0 = C24390b.f117764a.m127571b(c3020p0.f12057p, songInfo, c3020p0.m14493X());
            m116757uq(new Runnable() { // from class: lo.w
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116735ir(c3020p0);
                }
            });
        } else {
            ((InterfaceC22546b) m103742Dp()).mo78331OB();
        }
    }

    /* renamed from: Fr */
    private void m116687Fr(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108455e(c3020p0.m14465A(), "feed_avt_cover");
            } else if (c3020p0.m14512j0()) {
                C20785b.f102138a.m108456f(c3020p0.m14465A(), "feed_avt_cover");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gq */
    public void m116688Gq(C3000l0 c3000l0) {
        C3020p0 m14322a0;
        C3025q0 c3025q0;
        if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null && (c3025q0 = m14322a0.f12023C) != null && c3025q0.f12100I != null) {
            ((InterfaceC22546b) m103742Dp()).mo79628ae(c3000l0);
        }
    }

    /* renamed from: Gr */
    private void m116689Gr(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108461k(c3020p0.m14465A(), "feed_avt_cover");
            } else if (c3020p0.m14512j0()) {
                C20785b.f102138a.m108462l(c3020p0.m14465A(), "feed_avt_cover");
            }
        }
    }

    /* renamed from: Hq */
    private void m116690Hq(C10873l c10873l) {
        try {
            if (this.f110365v != null && c10873l != null && c10873l.m56493u() != null) {
                String m56497w = c10873l.m56497w();
                String str = this.f110365v.f12057p;
                String m56493u = c10873l.m56493u();
                if (m56497w != null && str != null && m56493u != null) {
                    ((InterfaceC22546b) m103742Dp()).mo46829Y();
                    this.f110349d0.mo112375q0(m56497w, "8", str, m56493u, 0, "", new h());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Ir */
    private void m116692Ir(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108465o(c3020p0.m14465A(), "feed_avt_cover");
            } else if (c3020p0.m14512j0()) {
                C20785b.f102138a.m108466p(c3020p0.m14465A(), "feed_avt_cover");
            }
        }
    }

    /* renamed from: Jq */
    private String m116694Jq() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_blockcomment);
    }

    /* renamed from: Kq */
    private C23909b m116696Kq(boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        List list;
        List list2;
        if (this.f110337R == 0 && !AbstractC20789d.m108475i(this.f110324E)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f110337R > 0 && (list2 = this.f110324E) != null && list2.isEmpty()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f110337R != 0 && (((list = this.f110324E) == null || list.size() < this.f110337R - this.f110336Q) && !TextUtils.isEmpty(this.f110325F) && !this.f110325F.equals("-1"))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z13) {
            i11 = AbstractC8020f0.str_tv_join_comment;
        } else {
            i11 = AbstractC8020f0.str_no_comments_yet;
        }
        int i15 = i11;
        if (z11) {
            i12 = 0;
        } else if (!z12 && !z13) {
            i12 = 2;
        } else {
            i12 = 1;
        }
        List list3 = this.f110324E;
        if (list3 != null && !list3.isEmpty()) {
            i13 = 10;
        } else {
            i13 = 11;
        }
        if (!z14 && !z11) {
            i14 = 21;
        } else {
            i14 = 20;
        }
        return new C23909b(i12, i13, i14, i15, this.f110338S);
    }

    /* renamed from: Lq */
    private C32002l4 m116697Lq() {
        if (this.f110358m0) {
            return this.f110332M.m154284u(45);
        }
        return this.f110332M;
    }

    /* renamed from: Lr */
    private void m116698Lr(String str) {
        C28594q.m143005j().m143013m(mo112324I(), str);
    }

    /* renamed from: Nq */
    private void m116701Nq() {
        if (this.f110333N == 10) {
            m116681Cr();
            return;
        }
        C3000l0 mo112410j = this.f110349d0.mo112410j(this.f110363t);
        this.f110364u = mo112410j;
        if (mo112410j != null) {
            this.f110365v = mo112410j.m14322a0();
        }
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            this.f110337R = c3020p0.f12025E.f12243a;
            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
            ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
            ((InterfaceC22546b) m103742Dp()).mo78314Ay(this.f110365v.f12022B.f12279a);
            ArrayList arrayList = this.f110365v.f12041U;
            if (arrayList != null && arrayList.size() > 0) {
                this.f110324E = new ArrayList(this.f110365v.f12041U);
                ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
                ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
            }
            m116684Eq(false, this.f110341V, this.f110342W, false);
        } else {
            m116684Eq(true, this.f110341V, this.f110342W, false);
        }
        FeedActionZUtils.m47548f(this.f110363t);
    }

    /* renamed from: Oq */
    private C23911d m116703Oq(boolean z11, C20096c c20096c) {
        boolean z12;
        int i11;
        int i12;
        int i13;
        List list;
        int i14 = 0;
        if (c20096c != null && AbstractC23216t1.m119640e(c20096c.m104491c())) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
        } else {
            i11 = AbstractC8020f0.str_tv_detail_fail;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        if (z11) {
            i12 = 0;
        } else if (c20096c != null) {
            if (z12) {
                i12 = 1;
            } else {
                i12 = 2;
            }
        } else {
            i12 = 3;
        }
        if (this.f110365v == null && ((list = this.f110324E) == null || list.isEmpty())) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (this.f110365v == null) {
            i14 = 1;
        }
        return new C23911d(i12, i13, i14, m118743r0);
    }

    /* renamed from: Qq */
    private void m116706Qq(String str) {
        try {
            AbstractC20789d.m108471e(str, this.f110324E);
            this.f110324E = C26744e.m137551e().m137555c(mo112324I(), this.f110324E);
            C28594q.m143005j().m143015o(mo112324I(), str);
            m116698Lr(str);
            ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.n
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116739kr();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rq */
    public void m116708Rq(String str) {
        try {
            Iterator it = this.f110324E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10873l c10873l = (C10873l) it.next();
                if (c10873l != null && c10873l.m56493u().equals(str)) {
                    it.remove();
                    break;
                }
            }
            int i11 = this.f110337R;
            if (i11 > 0) {
                this.f110337R = i11 - 1;
            }
            C3020p0 c3020p0 = this.f110365v;
            C3039t0 c3039t0 = c3020p0.f12025E;
            int i12 = this.f110337R;
            c3039t0.f12243a = i12;
            if (i12 <= 0) {
                c3020p0.f12041U = null;
            }
            new C25418k0().m101508a(new C25418k0.a(this.f110365v));
            C28594q.m143005j().m143015o(mo112324I(), str);
            m116698Lr(str);
            m116757uq(new Runnable() { // from class: lo.t
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116741lr();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Tq */
    private void m116711Tq(C24880b c24880b) {
        if (c24880b != null && c24880b.m129380b() != null) {
            int m129379a = c24880b.m129379a();
            m116767zq();
            if (m129379a == 18028) {
                C24355e0.f117560a.m127364t(false);
                AbstractC22575p0.m116816g(this);
                C23744a.m124114c().m124116d(6097, Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START));
            }
            final C3054x m116820k = AbstractC22575p0.m116820k(c24880b);
            ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.m
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116748pr(m116820k);
                }
            });
        }
    }

    /* renamed from: Uq */
    private void m116712Uq(final C20096c c20096c) {
        ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.h
            @Override // java.lang.Runnable
            public final void run() {
                C22547b0.this.m116750qr(c20096c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Vq */
    public void m116713Vq(C20096c c20096c) {
        if (c20096c != null) {
            int m104491c = c20096c.m104491c();
            String m104490b = c20096c.m104490b();
            if (TextUtils.isEmpty(m104490b)) {
                m116712Uq(c20096c);
                return;
            }
            C24880b c24880b = new C24880b(m104491c, m104490b);
            this.f110362q0 = c24880b;
            if (c24880b.m129380b() != null) {
                m116711Tq(this.f110362q0);
            } else {
                m116712Uq(c20096c);
            }
        }
    }

    /* renamed from: Yq */
    private boolean m116717Yq() {
        if (!m116719Zq() && !m116721ar()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Zq */
    public boolean m116719Zq() {
        return this.f110333N == 12;
    }

    /* renamed from: ar */
    private boolean m116721ar() {
        return this.f110333N == 13;
    }

    /* renamed from: br */
    private boolean m116723br(C3020p0 c3020p0) {
        if (c3020p0 != null && (c3020p0.m14525r() || c3020p0.m14494Y())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: er */
    public /* synthetic */ void m116727er() {
        ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x001e, B:6:0x0027, B:9:0x0035, B:11:0x0039, B:13:0x0043, B:15:0x004d, B:16:0x00a4, B:18:0x00a8, B:20:0x00ac, B:22:0x00ba, B:23:0x00c6, B:25:0x00ca, B:27:0x00ce, B:28:0x00d7, B:30:0x00dd, B:33:0x00e9, B:34:0x00ef, B:35:0x00f8, B:37:0x00fe, B:39:0x010c, B:45:0x0055, B:47:0x007f, B:48:0x0084), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6 A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x001e, B:6:0x0027, B:9:0x0035, B:11:0x0039, B:13:0x0043, B:15:0x004d, B:16:0x00a4, B:18:0x00a8, B:20:0x00ac, B:22:0x00ba, B:23:0x00c6, B:25:0x00ca, B:27:0x00ce, B:28:0x00d7, B:30:0x00dd, B:33:0x00e9, B:34:0x00ef, B:35:0x00f8, B:37:0x00fe, B:39:0x010c, B:45:0x0055, B:47:0x007f, B:48:0x0084), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x001e, B:6:0x0027, B:9:0x0035, B:11:0x0039, B:13:0x0043, B:15:0x004d, B:16:0x00a4, B:18:0x00a8, B:20:0x00ac, B:22:0x00ba, B:23:0x00c6, B:25:0x00ca, B:27:0x00ce, B:28:0x00d7, B:30:0x00dd, B:33:0x00e9, B:34:0x00ef, B:35:0x00f8, B:37:0x00fe, B:39:0x010c, B:45:0x0055, B:47:0x007f, B:48:0x0084), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: fr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m116729fr(boolean z11, List list) {
        String str;
        try {
            ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
            ((InterfaceC22546b) m103742Dp()).mo79605Ax(this.f110369z);
            if (this.f110335P <= 2 && this.f110324E.size() < 5 && this.f110324E.size() < this.f110337R - this.f110336Q) {
                String str2 = this.f110325F;
                if (str2 != null && str2.trim().length() > 0 && !this.f110325F.equals("-1")) {
                    mo112346y2(true);
                } else {
                    this.f110340U = false;
                    ((InterfaceC22546b) m103742Dp()).mo78351lj(this.f110324E, this.f110327H, this.f110342W);
                    ((InterfaceC22546b) m103742Dp()).mo79613Qy(this.f110324E, mo116657o8(this.f110337R), false);
                    if (!TextUtils.isEmpty(this.f110326G)) {
                        this.f110326G = "";
                    }
                }
                if (this.f110343X && this.f110346a0) {
                    this.f110346a0 = false;
                    if (!((InterfaceC22546b) m103742Dp()).mo79615R0()) {
                        ((InterfaceC22546b) m103742Dp()).mo78350lb(300L);
                    } else if (this.f110341V && this.f110339T) {
                        ((InterfaceC22546b) m103742Dp()).mo78346hd();
                    }
                }
                this.f110339T = false;
                this.f110343X = false;
                if (z11) {
                    if (TextUtils.isEmpty(mo112324I())) {
                        str = "0";
                    } else {
                        str = mo112324I();
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C10873l) it.next()).m56493u());
                    }
                    C26746f.m137567g(new C26748g(arrayList, str, "0"), this.f110360o0);
                    return;
                }
                return;
            }
            ((InterfaceC22546b) m103742Dp()).mo78351lj(this.f110324E, this.f110327H, this.f110342W);
            ((InterfaceC22546b) m103742Dp()).mo79613Qy(this.f110324E, mo116657o8(this.f110337R), false);
            if (this.f110343X) {
                this.f110346a0 = false;
                if (!((InterfaceC22546b) m103742Dp()).mo79615R0()) {
                }
            }
            this.f110339T = false;
            this.f110343X = false;
            if (z11) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gr */
    public /* synthetic */ void m116731gr() {
        ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
        ((InterfaceC22546b) m103742Dp()).mo79605Ax(this.f110369z);
        ((InterfaceC22546b) m103742Dp()).mo79613Qy(this.f110324E, mo116657o8(this.f110337R), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hr */
    public /* synthetic */ void m116733hr(C23413a c23413a) {
        if (c23413a != null && ((InterfaceC22546b) m103742Dp()).mo45894h0()) {
            int i11 = c23413a.f113766a;
            if (i11 == 0) {
                try {
                    this.f110347b0 = 0;
                    this.f110335P++;
                    ((InterfaceC22546b) m103742Dp()).mo79626Zu();
                    final boolean z11 = c23413a.f113769d;
                    final List list = c23413a.f113767b;
                    if (this.f110338S) {
                        List list2 = this.f110324E;
                        if (list2 == null) {
                            this.f110324E = new ArrayList();
                        } else {
                            list2.clear();
                        }
                    }
                    AbstractC20789d.m108470d(list, this.f110324E);
                    List m137555c = C26744e.m137551e().m137555c(mo112324I(), this.f110324E);
                    this.f110324E = m137555c;
                    AbstractC20789d.m108479m(m137555c);
                    this.f110325F = c23413a.f113768c;
                    this.f110336Q += c23413a.f113770e;
                    this.f110337R = c23413a.f113771f;
                    int size = this.f110324E.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int m108473g = AbstractC20789d.m108473g(list, (C10873l) this.f110324E.get(size));
                        if (m108473g == -1) {
                            size--;
                        } else if (m108473g < list.size() - 1) {
                            this.f110339T = true;
                        }
                    }
                    this.f110327H = -1;
                    if (!TextUtils.isEmpty(this.f110326G)) {
                        for (int i12 = 0; i12 < this.f110324E.size(); i12++) {
                            C10873l c10873l = (C10873l) this.f110324E.get(i12);
                            if (c10873l != null && c10873l.m56493u().equals(this.f110326G)) {
                                c10873l.m56496v0(true);
                                this.f110327H = i12 + 1;
                                this.f110326G = "";
                            }
                        }
                    }
                    ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.this.m116729fr(z11, list);
                        }
                    });
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (i11 == 1) {
                int i13 = this.f110347b0;
                if (i13 < 1) {
                    this.f110347b0 = i13 + 1;
                    mo112346y2(false);
                } else {
                    this.f110340U = false;
                    this.f110347b0 = 0;
                    ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.this.m116731gr();
                        }
                    });
                }
                this.f110343X = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir */
    public /* synthetic */ void m116735ir(C3020p0 c3020p0) {
        ((InterfaceC22546b) m103742Dp()).mo78328Mg(c3020p0.f12057p, c3020p0.f12023C.f12108Q, c3020p0.f12027G);
        ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
        if (!c3020p0.f12027G) {
            ((InterfaceC22546b) m103742Dp()).mo78353ms(mo112324I());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jr */
    public /* synthetic */ void m116737jr(C10873l c10873l) {
        try {
            if (c10873l.m56497w().equals(CoreUtility.f89233i)) {
                return;
            }
            mo116672y(c10873l, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kr */
    public /* synthetic */ void m116739kr() {
        ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
        ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lr */
    public /* synthetic */ void m116741lr() {
        try {
            ((InterfaceC22546b) m103742Dp()).mo49315c4();
            ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
            ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
            ((InterfaceC22546b) m103742Dp()).mo79613Qy(this.f110324E, mo116657o8(this.f110337R), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nr */
    public /* synthetic */ void m116744nr(boolean z11) {
        if (z11) {
            ((InterfaceC22546b) m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.profile_deletefeedsuccess));
            ((InterfaceC22546b) m103742Dp()).mo79607Dm();
        } else {
            ((InterfaceC22546b) m103742Dp()).mo79643ma();
            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: or */
    public /* synthetic */ void m116746or() {
        ((InterfaceC22546b) m103742Dp()).mo79607Dm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pr */
    public /* synthetic */ void m116748pr(C3054x c3054x) {
        ((InterfaceC22546b) m103742Dp()).mo79657w0(c3054x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qr */
    public /* synthetic */ void m116750qr(C20096c c20096c) {
        try {
            m116770Br();
            ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
            if (c20096c.m104491c() != 1001 && c20096c.m104491c() != 1002) {
                ((InterfaceC22546b) m103742Dp()).mo79661yi(m116703Oq(false, c20096c));
                ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
            }
            m116775Sq(false);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: rq */
    private void m116751rq() {
        TrackingSource trackingSource = this.f110331L;
        if (trackingSource != null) {
            trackingSource.m40677a("isRefresh", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rr */
    public /* synthetic */ void m116752rr() {
        this.f110343X = true;
        this.f110341V = true;
        this.f110342W = false;
        m116751rq();
        m116701Nq();
    }

    /* renamed from: sq */
    private boolean m116753sq() {
        return AbstractC20833z.m108917v(this.f110331L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sr */
    public /* synthetic */ void m116754sr(boolean z11) {
        ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
        if (z11) {
            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
        }
        ((InterfaceC22546b) m103742Dp()).mo79613Qy(this.f110324E, mo116657o8(this.f110337R), true);
    }

    /* renamed from: tq */
    private void m116755tq() {
        try {
            List list = this.f110324E;
            if (list != null && !list.isEmpty()) {
                this.f110365v.f12041U = new ArrayList();
                for (int size = this.f110324E.size() - 1; size >= 0 && this.f110365v.f12041U.size() != 50; size--) {
                    C10873l c10873l = (C10873l) this.f110324E.get(size);
                    if (c10873l.m56435C() == 3) {
                        this.f110365v.f12041U.add(0, c10873l);
                    }
                }
                new C25418k0().m101508a(new C25418k0.a(this.f110365v));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tr */
    public /* synthetic */ void m116756tr() {
        ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
        ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uq */
    public void m116757uq(Runnable runnable) {
        try {
            if (((InterfaceC22546b) m103742Dp()).mo45894h0()) {
                ((InterfaceC22546b) m103742Dp()).mo70710wy(runnable);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ur */
    public /* synthetic */ void m116758ur() {
        ((InterfaceC22546b) m103742Dp()).mo78333Ob(m116696Kq(false));
        ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
    }

    /* renamed from: vq */
    private void m116759vq() {
        List list;
        try {
            String str = this.f110365v.f12057p;
            ArrayList arrayList = new ArrayList();
            List list2 = this.f110324E;
            if (list2 != null && !list2.isEmpty()) {
                for (C10873l c10873l : this.f110324E) {
                    if (c10873l != null) {
                        arrayList.add(c10873l.m56493u());
                    }
                }
            }
            String str2 = "";
            C3000l0 mo127471c = C24371m0.m127468p().mo127471c(str);
            C3020p0 c3020p0 = null;
            if (mo127471c != null && (list = mo127471c.f11899s) != null && list.size() > 0) {
                for (C3020p0 c3020p02 : mo127471c.f11899s) {
                    if (c3020p02 != null && c3020p02.m14533x() != null && str.equals(c3020p02.f12057p)) {
                        str2 = c3020p02.m14533x().f12210h;
                        c3020p0 = c3020p02;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2) && c3020p0 != null && mo127471c != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str2)) {
                        return;
                    }
                }
                c3020p0.m14507h();
                arrayList.clear();
                C0824j.m2153b(new i(mo127471c));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vr */
    public /* synthetic */ void m116760vr(C2976g1 c2976g1) {
        ((InterfaceC22546b) m103742Dp()).mo78322J1(c2976g1);
        int i11 = this.f110337R;
        if (i11 != 0 && i11 != this.f110336Q) {
            ((InterfaceC22546b) m103742Dp()).mo78345h8(this.f110327H, this.f110342W);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wq */
    public void m116761wq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FeedActionZUtils.m47549g(str);
        AbstractC20833z.m108894I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wr */
    public /* synthetic */ void m116762wr(C3054x c3054x) {
        ((InterfaceC22546b) m103742Dp()).mo79657w0(c3054x);
    }

    /* renamed from: xq */
    private void m116763xq(C25630b c25630b, boolean z11, String str, String str2) {
        C10873l m123037f = C23415c.m123032b().m123037f(C23416d.m123038a().m123073w(1).m123064n(m116723br(this.f110365v)).m123065o(this.f110365v.f12057p).m123071u(this.f110365v.m14465A()).m123072v(C32017m4.m154326S().m154372r(m116697Lq())).m123066p(str2).m123070t(c25630b).m123069s(str, this.f110328I, this.f110329J).m123063m(), 0, m116694Jq());
        if (c25630b != null && z11) {
            C3255n.m16562n().m16578v(c25630b);
        }
        if (this.f110324E == null) {
            this.f110324E = new ArrayList();
        }
        if (m123037f != null) {
            this.f110324E.add(m123037f);
        }
        if (((InterfaceC22546b) m103742Dp()).mo45894h0()) {
            this.f110328I = "";
            this.f110329J = "";
            this.f110330K = "";
            ((InterfaceC22546b) m103742Dp()).mo78338U3(this.f110324E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xr */
    public /* synthetic */ void m116764xr() {
        ((InterfaceC22546b) m103742Dp()).mo78365wt(this.f110355j0);
    }

    /* renamed from: yq */
    private C19591a m116765yq(C25630b c25630b, boolean z11) {
        C19591a c19591a = new C19591a(c25630b);
        c19591a.m102562e(z11);
        return c19591a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yr */
    public /* synthetic */ void m116766yr() {
        ((InterfaceC22546b) m103742Dp()).mo79606B0(this.f110328I, this.f110365v, this.f110330K);
        ((InterfaceC22546b) m103742Dp()).mo78343d4();
    }

    /* renamed from: zq */
    private void m116767zq() {
        if (this.f110363t != null) {
            new C8550b().m101508a(new C8550b.a(this.f110363t, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zr */
    public /* synthetic */ void m116768zr(C20096c c20096c) {
        ((InterfaceC22546b) m103742Dp()).mo49315c4();
        ToastUtils.showMess(c20096c.m104492d());
    }

    /* renamed from: Aq */
    public void m116769Aq() {
        try {
            if (!TextUtils.isEmpty(this.f110369z) && !TextUtils.isEmpty(this.f110363t)) {
                AbstractC19646n0.m102896H(this.f110369z, this.f110363t);
            } else {
                C3020p0 c3020p0 = this.f110365v;
                if (c3020p0 != null && !TextUtils.isEmpty(c3020p0.m14465A()) && !TextUtils.isEmpty(this.f110365v.f12057p)) {
                    AbstractC19646n0.m102896H(this.f110365v.m14465A(), this.f110365v.f12057p);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: B */
    public void mo116594B(C10881t c10881t) {
        int i11;
        try {
            C26736a.m137533h("Enter---Handle---Result---Post---Async");
            if (c10881t == null) {
                return;
            }
            C10873l c10873l = c10881t.f54982d;
            if (c10873l != null) {
                i11 = c10873l.f54894J;
            } else {
                i11 = -1;
            }
            if (((InterfaceC22546b) m103742Dp()).mo45894h0() && i11 == 0) {
                C10873l c10873l2 = c10881t.f54982d;
                if (c10873l2 != null && !TextUtils.equals(c10873l2.m56487r(), mo112324I())) {
                    return;
                }
                int i12 = c10881t.f54979a;
                int i13 = c10881t.f54980b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
                                m116706Qq(c10881t.f54981c);
                                return;
                            }
                            return;
                        }
                        AbstractC20789d.m108484r(c10881t.f54981c, c10881t.f54982d, this.f110324E);
                        this.f110324E = C26744e.m137551e().m137555c(mo112324I(), this.f110324E);
                        ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C22547b0.this.m116758ur();
                            }
                        });
                        return;
                    }
                    if (AbstractC20789d.m108484r(c10881t.f54981c, c10881t.f54982d, this.f110324E)) {
                        this.f110337R++;
                    }
                    this.f110324E = C26744e.m137551e().m137555c(mo112324I(), this.f110324E);
                    C3020p0 c3020p0 = this.f110365v;
                    c3020p0.f12025E.f12243a = this.f110337R;
                    boolean z11 = c3020p0.f12065x;
                    final boolean z12 = !z11;
                    if (!z11) {
                        c3020p0.f12065x = true;
                    }
                    new C25418k0().m101508a(new C25418k0.a(this.f110365v));
                    ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.this.m116754sr(z12);
                        }
                    });
                    return;
                }
                if (i13 == 500) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_blockcomment));
                } else {
                    if (i13 != 1001 && i13 != 1002) {
                        if (i13 == 16001) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_invalid_comment_text));
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_failed));
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist));
                }
                this.f110324E = C26744e.m137551e().m137555c(mo112324I(), this.f110324E);
                C28023b6.m141250h0().m141394x(this.f110365v.f12057p);
                ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22547b0.this.m116756tr();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: B1 */
    public void mo116595B1() {
        ((InterfaceC22546b) m103742Dp()).mo79627aF(this.f110353h0);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: B6 */
    public void mo116596B6() {
        try {
            C3020p0 c3020p0 = this.f110365v;
            if (c3020p0 != null) {
                c3020p0.m14503e();
                m116759vq();
                m116755tq();
                m116761wq(mo112324I());
            }
            this.f110365v = null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Bf */
    public void mo116597Bf() {
        boolean z11;
        boolean z12;
        C3020p0 c3020p0;
        try {
            boolean m118271f = C23055e5.m118271f();
            if (!m118271f && (c3020p0 = this.f110365v) != null && !c3020p0.f12027G) {
                z11 = true;
            } else {
                z11 = false;
            }
            ((InterfaceC22546b) m103742Dp()).mo78312A6(z11);
            if (m118271f) {
                C3020p0 c3020p02 = this.f110365v;
                if (c3020p02 != null && c3020p02.f12027G) {
                    return;
                }
                this.f110335P = 0;
                this.f110336Q = 0;
                m116751rq();
                if (this.f110365v == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m116684Eq(z12, false, false, true);
                return;
            }
            ((InterfaceC22546b) m103742Dp()).mo79661yi(m116703Oq(false, new C20096c(50001, "")));
            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(false));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Br */
    public void m116770Br() {
        this.f110324E = C26744e.m137551e().m137555c(mo112324I(), this.f110324E);
        ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: C */
    public void mo116598C(C20096c c20096c) {
        String str;
        String m118743r0;
        if (c20096c != null) {
            try {
                int m104491c = c20096c.m104491c();
                if (m104491c != 18001) {
                    if (m104491c != 18002) {
                        ToastUtils.showMess(c20096c.m104492d());
                        return;
                    }
                    if (!TextUtils.isEmpty(this.f110369z)) {
                        str = AbstractC20833z.m108910o(this.f110369z);
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_tv_feednoexist_new, str);
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist);
                    }
                    ToastUtils.showMess(m118743r0);
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_comment_deleted));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: D2 */
    public void mo112323D2() {
        C28594q.m143005j().m143017q(mo112324I());
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Ef */
    public C20637a mo116599Ef() {
        C20637a c20637a = new C20637a();
        c20637a.m107549m(this.f110365v);
        c20637a.m107551o(this.f110352g0);
        c20637a.m107552p(this.f110351f0);
        c20637a.m107547k(this.f110350e0);
        c20637a.m107546j(this.f110333N);
        return c20637a;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: G7 */
    public void mo116600G7() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 == null) {
            return;
        }
        boolean z11 = !c3020p0.f12065x;
        k kVar = new k(z11);
        ((InterfaceC22546b) m103742Dp()).mo46829Y();
        if (z11) {
            this.f110349d0.mo112368i0(this.f110365v.f12057p, 1, kVar);
            m116683Dr();
        } else {
            this.f110349d0.mo112379t(this.f110365v.f12057p, 1, kVar);
            m116685Er();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: H */
    public void mo116601H(String str) {
        for (C10873l c10873l : this.f110324E) {
            if (c10873l.m56493u().equals(str)) {
                c10873l.m56494u0(true);
            }
        }
        ((InterfaceC22546b) m103742Dp()).mo78356q0();
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: H2 */
    public void mo116602H2(int i11, C10873l c10873l) {
        ((InterfaceC22546b) m103742Dp()).mo79618Sk(i11, this.f110365v, c10873l);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: H3 */
    public void mo116603H3(boolean z11) {
        switch (this.f110334O) {
            case 24:
                if (z11) {
                    ((InterfaceC22546b) m103742Dp()).mo79633d2();
                    return;
                }
                return;
            case 25:
                if (!z11) {
                    ((InterfaceC22546b) m103742Dp()).mo79617S0();
                    return;
                }
                return;
            case 26:
                if (!z11) {
                    ((InterfaceC22546b) m103742Dp()).mo79637i4(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: I */
    public String mo112324I() {
        if (!TextUtils.isEmpty(this.f110363t)) {
            return this.f110363t;
        }
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && !TextUtils.isEmpty(c3020p0.f12057p)) {
            return this.f110365v.f12057p;
        }
        return "";
    }

    /* renamed from: Iq */
    boolean m116771Iq() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && c3020p0.m14494Y() && this.f110365v.m14485P() && this.f110365v.f12058q != 23) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: J1 */
    public void mo116604J1(int i11) {
        ((InterfaceC22546b) m103742Dp()).mo78355oa(this.f110353h0, i11);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: J6 */
    public void mo116605J6(int i11, String str) {
        String str2;
        try {
            C3020p0 c3020p0 = this.f110365v;
            if (c3020p0 != null && !c3020p0.m14494Y()) {
                C3020p0 c3020p02 = this.f110365v;
                String str3 = c3020p02.f12022B.f12280b;
                String str4 = c3020p02.f12057p;
                if (c3020p02.m14518m0()) {
                    str2 = "6";
                } else {
                    str2 = "7";
                }
                String str5 = str2;
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    j jVar = new j();
                    ((InterfaceC22546b) m103742Dp()).mo46829Y();
                    this.f110349d0.mo112375q0(str3, str5, str4, "", i11, str, jVar);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Jj */
    public void mo116606Jj(PrivacyInfo privacyInfo) {
        try {
            C3020p0 c3020p0 = this.f110365v;
            if (c3020p0 == null) {
                return;
            }
            c3020p0.f12042V = privacyInfo;
            new C25430q0().m101508a(new C25430q0.a(this.f110363t, privacyInfo, true));
            m116757uq(new Runnable() { // from class: lo.s
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116677Ar();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Jr, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C22577q0 c22577q0, InterfaceC19968g interfaceC19968g) {
        C3020p0 c3020p0;
        super.mo995Nd(c22577q0, interfaceC19968g);
        if (c22577q0 != null) {
            String str = c22577q0.f110475a;
            this.f110363t = str;
            C3000l0 mo112410j = this.f110349d0.mo112410j(str);
            this.f110364u = mo112410j;
            if (mo112410j != null) {
                c3020p0 = mo112410j.m14322a0();
            } else {
                c3020p0 = null;
            }
            this.f110365v = c3020p0;
            String str2 = c22577q0.f110476b;
            this.f110369z = str2;
            this.f110366w = c22577q0.f110477c;
            this.f110367x = c22577q0.f110478d;
            this.f110368y = c22577q0.f110479e;
            if (!TextUtils.isEmpty(str2)) {
                this.f110320A = C28203u6.f131407a.m141809c(this.f110369z);
            }
            this.f110325F = "";
            this.f110340U = c22577q0.f110480f;
            this.f110326G = c22577q0.f110481g;
            this.f110332M = c22577q0.f110482h;
            this.f110333N = c22577q0.f110483i;
            this.f110344Y = c22577q0.f110484j;
            this.f110334O = c22577q0.f110485k;
            this.f110331L = C32017m4.m154326S().m154376v(this.f110332M);
            this.f110351f0 = c22577q0.f110486l;
            this.f110352g0 = c22577q0.f110487m;
            this.f110350e0 = this.f110349d0.mo112402a();
            this.f110353h0 = this.f110349d0.mo112413l0();
            this.f110354i0 = this.f110349d0.mo112396R();
            String str3 = c22577q0.f110488n;
            if (!TextUtils.isEmpty(str3)) {
                try {
                    this.f110356k0 = new C3060y1(new JSONObject(str3));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        this.f110335P = 0;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: K0 */
    public void mo116607K0(Bundle bundle) {
        boolean z11;
        if (bundle != null) {
            if (!TextUtils.isEmpty(this.f110369z) && CoreUtility.f89233i.equals(this.f110369z)) {
                z11 = true;
            } else {
                z11 = false;
            }
            bundle.putBoolean("fromMyProfile", z11);
            bundle.putString("EXTRA_SCREEN_MUSIC_IDENTIFIER", mo112337d1());
        }
        m116692Ir(this.f110365v);
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: K2 */
    public void mo112325K2(C23912e c23912e, C19591a c19591a) {
        if (c23912e != null) {
            String str = c23912e.f115562a;
            if (!TextUtils.isEmpty(str) && m116776Wq(c19591a) && str.equals(c19591a.m102558a().mo41081Q())) {
                MediaItem m102558a = c19591a.m102558a();
                m102558a.m41101G0(c23912e.f115563b);
                String str2 = c23912e.f115564c;
                if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
                    m102558a.m41124T0(str2);
                }
                this.f110357l0 = c19591a;
                ((InterfaceC22546b) m103742Dp()).mo78320I2(true, this.f110357l0);
            }
            AbstractC23647d.m123897g("188012");
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Kj */
    public void mo116608Kj() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && c3020p0.f12027G) {
            ((InterfaceC22546b) m103742Dp()).mo79611NC();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Kk */
    public void mo116609Kk() {
        m116689Gr(this.f110365v);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: L6 */
    public CharSequence mo116610L6() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.cancel);
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Le */
    public void mo112326Le() {
        if (this.f110355j0 != null) {
            ((InterfaceC22546b) m103742Dp()).mo78334PC();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: M3 */
    public int mo112327M3() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            return c3020p0.f12058q;
        }
        return -1;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Mb */
    public void mo116611Mb() {
        if (m116771Iq()) {
            mo116626Yn(true);
        }
    }

    /* renamed from: Mq */
    public C23910c m116773Mq(boolean z11) {
        C23910c c23910c = new C23910c();
        c23910c.f115538a = this.f110364u;
        c23910c.f115539b = this.f110365v;
        c23910c.f115541d = this.f110353h0;
        c23910c.f115542e = z11;
        c23910c.f115543f = this.f110351f0;
        c23910c.f115556s = this.f110355j0;
        return c23910c;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: N3 */
    public void mo112328N3() {
        this.f110357l0 = new C19591a();
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Nh */
    public void mo112329Nh(InterfaceC2946a1 interfaceC2946a1) {
        if (interfaceC2946a1.mo13947I().equals(mo112324I())) {
            this.f110355j0 = interfaceC2946a1;
            ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.p
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116764xr();
                }
            });
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Nn */
    public void mo112330Nn(C16719g c16719g, int i11, int i12) {
        switch (i11) {
            case 1:
                mo116669tg(true);
                return;
            case 2:
            case 4:
                ((InterfaceC22546b) m103742Dp()).mo11974wp(this.f110365v);
                FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                return;
            case 3:
                ((InterfaceC22546b) m103742Dp()).mo79647pa(c16719g, this.f110364u);
                return;
            case 5:
                ((InterfaceC22546b) m103742Dp()).mo11954fz(c16719g, this.f110364u, 0);
                FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                return;
            case 6:
            case 7:
            case 9:
            case 12:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            default:
                return;
            case 8:
                ((InterfaceC22546b) m103742Dp()).mo11945af(c16719g, this.f110364u, 0);
                FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                return;
            case 10:
                ((InterfaceC22546b) m103742Dp()).mo79610L7(this.f110365v);
                return;
            case 11:
                ((InterfaceC22546b) m103742Dp()).mo11974wp(this.f110364u.m14322a0());
                FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                return;
            case 13:
                ((InterfaceC22546b) m103742Dp()).mo11943Yx(this.f110365v);
                return;
            case 14:
                ((InterfaceC22546b) m103742Dp()).mo11968s5(c16719g, this.f110364u, i12, 27);
                return;
            case 15:
                ((InterfaceC22546b) m103742Dp()).mo79608Eq(c16719g, this.f110364u, i12);
                return;
            case 17:
                ((InterfaceC22546b) m103742Dp()).mo79656vc(this.f110364u);
                return;
            case 18:
                ((InterfaceC22546b) m103742Dp()).mo79648pb(this.f110364u);
                return;
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: O3 */
    public void mo112331O3() {
        C28594q.m143005j().m143019s(mo112324I(), this.f110324E);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Od */
    public void mo116612Od() {
        if (!C23055e5.m118272g(true)) {
            return;
        }
        AbstractC22575p0.m116818i(this, this.f110365v);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0003. Please report as an issue. */
    @Override // p302ko.InterfaceC21779a
    /* renamed from: On */
    public void mo112332On(View view, int i11, int i12) {
        try {
            switch (i11) {
                case 1:
                    mo116669tg(true);
                    return;
                case 2:
                case 4:
                    ((InterfaceC22546b) m103742Dp()).mo11974wp(this.f110365v);
                    FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                    return;
                case 3:
                    ((InterfaceC22546b) m103742Dp()).mo79641lq(view, this.f110364u);
                    return;
                case 5:
                    ((InterfaceC22546b) m103742Dp()).mo11951dx(view, this.f110364u, 0);
                    FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                    return;
                case 6:
                case 7:
                case 9:
                case 12:
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                default:
                    return;
                case 8:
                    ((InterfaceC22546b) m103742Dp()).mo11939We(view, this.f110364u, 0);
                    FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                    return;
                case 10:
                    ((InterfaceC22546b) m103742Dp()).mo79610L7(this.f110365v);
                    return;
                case 11:
                    ((InterfaceC22546b) m103742Dp()).mo11974wp(this.f110364u.m14322a0());
                    FeedActionZUtils.m47520H(this.f110364u.m14322a0(), 20);
                    return;
                case 13:
                    ((InterfaceC22546b) m103742Dp()).mo11943Yx(this.f110365v);
                    return;
                case 14:
                    ((InterfaceC22546b) m103742Dp()).mo11939We(view, this.f110364u, i12);
                    return;
                case 15:
                    ((InterfaceC22546b) m103742Dp()).mo79658wc(view, this.f110364u, i12);
                    return;
                case 17:
                    ((InterfaceC22546b) m103742Dp()).mo79656vc(this.f110364u);
                    return;
                case 18:
                    ((InterfaceC22546b) m103742Dp()).mo79648pb(this.f110364u);
                    return;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: P4 */
    public CharSequence mo116613P4() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.delete);
    }

    /* renamed from: Pq */
    public C22548c m116774Pq(boolean z11) {
        return C22548c.m116809a(z11, this.f110365v, this.f110352g0, this.f110351f0, this.f110350e0, this.f110333N);
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: R */
    public int mo112333R() {
        return this.f110354i0;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: R0 */
    public void mo116614R0() {
        if (!C24346a.f117452a.m127220c(this.f110362q0)) {
            final C3054x m116820k = AbstractC22575p0.m116820k(C24355e0.f117560a.m127355c());
            ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.g
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116762wr(m116820k);
                }
            });
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: R1 */
    public void mo112334R1(C25630b c25630b, int i11) {
        boolean z11 = true;
        boolean z12 = false;
        if (!C20120e.f99217a.m104723b(1)) {
            if (i11 != -2) {
                z12 = true;
            }
            this.f110357l0 = m116765yq(c25630b, z12);
            ((InterfaceC22546b) m103742Dp()).mo78329N2(this.f110357l0, true);
            return;
        }
        if (i11 == -2) {
            z11 = false;
        }
        m116680Cq(m116765yq(c25630b, z11), "", "");
        this.f110358m0 = false;
        ((InterfaceC22546b) m103742Dp()).mo78361t1();
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: R8 */
    public void mo116615R8() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            LinkedHashMap linkedHashMap = c3020p0.f12059r.f11957b;
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                String str = (String) ((Map.Entry) it.next()).getKey();
                if (C18644n.m98531l().m98558u(str) && !CoreUtility.f89233i.equals(str)) {
                    arrayList.add(str);
                }
            }
            if (!TextUtils.isEmpty(this.f110365v.f12022B.f12280b) && !this.f110365v.m14494Y() && C18644n.m98531l().m98558u(this.f110365v.f12022B.f12280b)) {
                arrayList.add(this.f110365v.f12022B.f12280b);
            }
            if (arrayList.size() > 0) {
                ((InterfaceC22546b) m103742Dp()).mo79635f8(C2312m.m12247b().m12250b(arrayList).m12249a());
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_createGroup_fromTag));
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Rg */
    public void mo116616Rg() {
        String str;
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 == null || (str = c3020p0.f12022B.f12280b) == null || str.equals(CoreUtility.f89233i)) {
            return;
        }
        C3047v0 c3047v0 = this.f110365v.f12022B;
        if (c3047v0.f12279a > 0) {
            return;
        }
        AbstractC22575p0.m116815f(this, c3047v0.f12280b, this.f110363t);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Sf */
    public void mo116617Sf(int i11) {
        String str;
        if (this.f110356k0 != null) {
            C32002l4 m154284u = this.f110332M.m154284u(i11);
            if (m154284u != null) {
                str = m154284u.m154277l();
            } else {
                str = "";
            }
            ((InterfaceC22546b) m103742Dp()).mo79652rl(C2314o.m12251b().m12256c(this.f110356k0.m14711c().toString()).m12255b(str).m12254a());
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: So */
    public void mo116618So() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreUtility.f89233i);
        AbstractC22575p0.m116812c(this, arrayList);
    }

    /* renamed from: Sq */
    public void m116775Sq(final boolean z11) {
        this.f110321B = true;
        this.f110365v = null;
        m116767zq();
        if (this.f110333N == 11) {
            m116769Aq();
        }
        if (!TextUtils.isEmpty(this.f110363t)) {
            C26747f0.m137582I().m137653A0(this.f110363t);
        }
        C26747f0.m137582I().m137655C(this.f110363t);
        m116757uq(new Runnable() { // from class: lo.u
            @Override // java.lang.Runnable
            public final void run() {
                C22547b0.this.m116744nr(z11);
            }
        });
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: T1 */
    public void mo112335T1(int i11, int i12, int i13) {
        int i14;
        C24906b c24906b = C24906b.f119505a;
        String m154369o = C32017m4.m154326S().m154369o(this.f110332M);
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            i14 = c3020p0.f12058q;
        } else {
            i14 = 0;
        }
        c24906b.m129546E(m154369o, i11, i12, i14, i13);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: U1 */
    public void mo116619U1(C23914g c23914g) {
        C3020p0 c3020p0;
        if (c23914g != null) {
            try {
                if (c23914g.f115573b) {
                    m116775Sq(false);
                    return;
                }
                if (c23914g.f115574c) {
                    C3020p0 c3020p02 = this.f110365v;
                    if (c3020p02 != null) {
                        c3020p02.f12059r.m14388a();
                        ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                        ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                        return;
                    }
                    return;
                }
                ArrayList arrayList = c23914g.f115572a;
                if (arrayList != null && arrayList.size() > 0 && (c3020p0 = this.f110365v) != null) {
                    c3020p0.m14530v0(arrayList, true);
                    ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                }
                ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Ug */
    public int mo116620Ug() {
        ContactProfile contactProfile = this.f110320A;
        if (contactProfile != null && contactProfile.m40387S0()) {
            return 20;
        }
        return 10;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: W */
    public void mo116621W(C25630b c25630b, int i11, int i12, int i13) {
        if (!this.f110353h0) {
            return;
        }
        C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
        if (m143290W.m132427f() >= 0) {
            ((InterfaceC22546b) m103742Dp()).mo78316E0(m143290W, i11);
        }
        AbstractC23647d.m123897g("188021");
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: W5 */
    public void mo116622W5() {
        if (m116717Yq()) {
            ((InterfaceC22546b) m103742Dp()).mo79660yD(this.f110356k0);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: W7 */
    public void mo116623W7() {
        try {
            C3020p0 c3020p0 = this.f110365v;
            if (c3020p0 != null && c3020p0.f12027G) {
                AbstractC20826v0.m108803d(c3020p0.f12057p);
                C26761p.m137741q().m137764l(this.f110365v.f12057p);
                if (!this.f110365v.m14488S()) {
                    m116775Sq(true);
                } else {
                    ((InterfaceC22546b) m103742Dp()).mo79607Dm();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Wq */
    public boolean m116776Wq(C19591a c19591a) {
        if (c19591a != null && c19591a.m102560c() == 1 && c19591a.m102558a() != null) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: X0 */
    public void mo116624X0(int i11) {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            AbstractC22575p0.m116819j(this, c3020p0, C31060j.f143193a.m150930F(i11), this.f110332M);
        }
    }

    /* renamed from: Xq */
    public boolean m116777Xq(C19591a c19591a) {
        if (c19591a != null && c19591a.m102560c() == 2 && c19591a.m102559b() != null) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Y */
    public void mo116625Y(int i11) {
        C10873l c10873l;
        boolean z11;
        boolean z12;
        C3020p0 c3020p0;
        try {
            List list = this.f110324E;
            if (list != null && !list.isEmpty() && i11 < this.f110324E.size() && (c10873l = (C10873l) this.f110324E.get(i11)) != null) {
                boolean z13 = !TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i);
                boolean z14 = !TextUtils.isEmpty(c10873l.m56495v());
                if (!TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i) && !TextUtils.equals(this.f110369z, CoreUtility.f89233i)) {
                    z11 = false;
                    if (TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i) && (c3020p0 = this.f110365v) != null && c3020p0.m14518m0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ((InterfaceC22546b) m103742Dp()).mo78357q4(c10873l.m56495v(), i11, z13, z14, z11, z12);
                }
                z11 = true;
                if (TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                }
                z12 = false;
                ((InterfaceC22546b) m103742Dp()).mo78357q4(c10873l.m56495v(), i11, z13, z14, z11, z12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Yn */
    public void mo116626Yn(boolean z11) {
        C3020p0 c3020p0;
        C32002l4 c32002l4;
        if (this.f110350e0 && this.f110364u != null && (c3020p0 = this.f110365v) != null && c3020p0.m14494Y()) {
            AbstractC23647d.m123897g("18803");
            C26878b.f127183a.m138453e(this.f110364u, this.f110365v);
            if (z11) {
                c32002l4 = C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_HAVE_SUBTITLE_STREAM);
            } else {
                c32002l4 = this.f110332M;
            }
            ((InterfaceC22546b) m103742Dp()).mo79640kv(C2301c.m12158b().m12165d(this.f110365v.f12057p).m12164c(this.f110364u).m12166e(this.f110365v).m12163b(c32002l4).m12162a());
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Z3 */
    public void mo112336Z3(C2988i3 c2988i3) {
        int m14164c = c2988i3.m14164c();
        if (m14164c != 1) {
            if (m14164c == 2) {
                mo112344l3(c2988i3.m14163b(), 1);
                this.f110358m0 = true;
                return;
            }
            return;
        }
        String m14162a = c2988i3.m14162a();
        this.f110358m0 = true;
        if (!C20120e.f99217a.m104723b(0)) {
            InterfaceC22546b interfaceC22546b = (InterfaceC22546b) m103742Dp();
            if (TextUtils.isEmpty(m14162a)) {
                m14162a = "";
            }
            interfaceC22546b.mo78348k4(m14162a);
            return;
        }
        m116682Dq(m14162a, "");
        this.f110358m0 = false;
        ((InterfaceC22546b) m103742Dp()).mo78361t1();
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Z8 */
    public int mo116627Z8() {
        return this.f110331L.m40683t();
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: Za */
    public void mo116628Za() {
        try {
            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
            ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
            ((InterfaceC22546b) m103742Dp()).mo78356q0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: b */
    public void mo116629b(C25470c c25470c) {
        MediaItem mediaItem = (MediaItem) c25470c.m131941d("imageSelected");
        if (mediaItem != null) {
            this.f110357l0 = new C19591a(mediaItem);
            ((InterfaceC22546b) m103742Dp()).mo78320I2(true, this.f110357l0);
        }
        C25630b c25630b = (C25630b) c25470c.m131943f("stickerSelected");
        if (c25630b != null) {
            this.f110357l0 = new C19591a(c25630b);
            if (!C20120e.f99217a.m104723b(1)) {
                ((InterfaceC22546b) m103742Dp()).mo78329N2(this.f110357l0, false);
            }
        }
        this.f110328I = c25470c.m131944g("currentReplyCommentUid", "");
        this.f110329J = c25470c.m131944g("strReplyCommentId", "");
        this.f110330K = c25470c.m131944g("strReplyCommentDName", "");
        if (!TextUtils.isEmpty(this.f110328I) && !TextUtils.isEmpty(this.f110330K)) {
            ((InterfaceC22546b) m103742Dp()).mo78955kl(new Runnable() { // from class: lo.i
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116766yr();
                }
            }, 100L);
        }
        if (c25470c.m131938a("extra_feed_memory_info")) {
            try {
                this.f110356k0 = new C3060y1(new JSONObject(c25470c.m131944g("extra_feed_memory_info", "")));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        if (c25470c.m131938a("fromSrc")) {
            this.f110333N = c25470c.m131940c("fromSrc", 0);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: b2 */
    public void mo116630b2(C23915h c23915h) {
        C3020p0 c3020p0;
        if (c23915h != null) {
            try {
                if (c23915h.f115577c) {
                    this.f110321B = true;
                    ((InterfaceC22546b) m103742Dp()).mo79607Dm();
                    return;
                }
                C3000l0 mo127471c = C24371m0.m127468p().mo127471c(this.f110365v.f12057p);
                if (mo127471c != null) {
                    c3020p0 = mo127471c.m14325c0(this.f110365v.f12057p);
                } else {
                    c3020p0 = null;
                }
                if (c3020p0 != null && c3020p0.f12025E.f12244b >= 0) {
                    AbstractC20805l.m108553k(this.f110365v, c3020p0);
                    ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                    ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                } else if (c23915h.f115578d) {
                    AbstractC20805l.m108545c(c23915h.f115575a, this.f110365v);
                    ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                    ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: b4 */
    public void mo116631b4() {
        if (!TextUtils.isEmpty(this.f110369z) && !CoreUtility.f89233i.equals(this.f110369z)) {
            ((InterfaceC22546b) m103742Dp()).showDialog(8);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: bg */
    public CharSequence mo116632bg() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && c3020p0.f12058q == 23) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_item_option_item_delete_title);
            if (!TextUtils.isEmpty(m118743r0)) {
                return m118743r0 + "?";
            }
            return m118743r0;
        }
        return "";
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: bp */
    public void mo116633bp() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && c3020p0.f12027G) {
            C26761p.m137741q().m137757K(this.f110365v.f12057p);
            this.f110321B = true;
            ((InterfaceC22546b) m103742Dp()).mo79607Dm();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: c */
    public C25470c mo116634c() {
        C25470c c25470c = new C25470c();
        if (m116776Wq(this.f110357l0)) {
            c25470c.m131947j("imageSelected", this.f110357l0.m102558a());
        }
        if (m116777Xq(this.f110357l0)) {
            c25470c.m131949l("stickerSelected", this.f110357l0.m102559b());
        }
        if (!TextUtils.isEmpty(this.f110328I)) {
            c25470c.m131950m("currentReplyCommentUid", this.f110328I);
        }
        if (!TextUtils.isEmpty(this.f110329J)) {
            c25470c.m131950m("strReplyCommentId", this.f110329J);
        }
        if (!TextUtils.isEmpty(this.f110330K)) {
            c25470c.m131950m("strReplyCommentDName", this.f110330K);
        }
        c25470c.m131946i("fromSrc", this.f110333N);
        C3060y1 c3060y1 = this.f110356k0;
        if (c3060y1 != null) {
            c25470c.m131950m("extra_feed_memory_info", c3060y1.m14711c().toString());
        }
        return c25470c;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: c0 */
    public void mo116635c0(String str, String str2) {
        if (!TextUtils.isEmpty(str) || mo112342i2()) {
            if (str == null) {
                str = "";
            }
            if (m116776Wq(this.f110357l0)) {
                m116679Bq(str, this.f110357l0.m102558a(), str2);
            } else if (m116777Xq(this.f110357l0)) {
                m116680Cq(this.f110357l0, str2, str);
            } else {
                m116682Dq(str, str2);
            }
            this.f110358m0 = false;
            ((InterfaceC22546b) m103742Dp()).mo78361t1();
            m116687Fr(this.f110365v);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: ce */
    public void mo116636ce(String str, boolean z11) {
        try {
            this.f110346a0 = z11;
            if (this.f110338S && !TextUtils.isEmpty(str) && str.equals(this.f110363t)) {
                ((InterfaceC22546b) m103742Dp()).mo78955kl(new Runnable() { // from class: lo.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22547b0.this.m116752rr();
                    }
                }, 500L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cr */
    public boolean m116778cr() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && c3020p0.m14493X() && this.f110333N == 10) {
            return true;
        }
        return false;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: d1 */
    public String mo112337d1() {
        InterfaceC2946a1 interfaceC2946a1 = this.f110355j0;
        if (interfaceC2946a1 != null) {
            return interfaceC2946a1.mo13947I();
        }
        return "";
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: d2 */
    public void mo116637d2(C3054x c3054x) {
        C31877d c31877d = new C31877d();
        c31877d.m153184c(this.f110332M);
        ((InterfaceC22546b) m103742Dp()).mo11973vq(c3054x.m14669a(), c3054x.m14670b(), c31877d);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000e, B:9:0x0017, B:11:0x001d, B:18:0x002d, B:22:0x003b, B:24:0x0041, B:26:0x0048, B:28:0x0052, B:29:0x005b, B:31:0x005f, B:32:0x0078, B:34:0x007e, B:36:0x0086, B:38:0x0089, B:41:0x006a, B:43:0x006e, B:47:0x008e, B:49:0x0094, B:51:0x00ec, B:53:0x00fa, B:55:0x0104, B:58:0x010d, B:60:0x0111, B:63:0x012b, B:68:0x0115, B:69:0x011d, B:71:0x0121, B:72:0x00a9, B:73:0x0034, B:74:0x00ad, B:76:0x00b8, B:78:0x00c8, B:80:0x00cb, B:83:0x00ce, B:85:0x00d4, B:86:0x00e8), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000e, B:9:0x0017, B:11:0x001d, B:18:0x002d, B:22:0x003b, B:24:0x0041, B:26:0x0048, B:28:0x0052, B:29:0x005b, B:31:0x005f, B:32:0x0078, B:34:0x007e, B:36:0x0086, B:38:0x0089, B:41:0x006a, B:43:0x006e, B:47:0x008e, B:49:0x0094, B:51:0x00ec, B:53:0x00fa, B:55:0x0104, B:58:0x010d, B:60:0x0111, B:63:0x012b, B:68:0x0115, B:69:0x011d, B:71:0x0121, B:72:0x00a9, B:73:0x0034, B:74:0x00ad, B:76:0x00b8, B:78:0x00c8, B:80:0x00cb, B:83:0x00ce, B:85:0x00d4, B:86:0x00e8), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000e, B:9:0x0017, B:11:0x001d, B:18:0x002d, B:22:0x003b, B:24:0x0041, B:26:0x0048, B:28:0x0052, B:29:0x005b, B:31:0x005f, B:32:0x0078, B:34:0x007e, B:36:0x0086, B:38:0x0089, B:41:0x006a, B:43:0x006e, B:47:0x008e, B:49:0x0094, B:51:0x00ec, B:53:0x00fa, B:55:0x0104, B:58:0x010d, B:60:0x0111, B:63:0x012b, B:68:0x0115, B:69:0x011d, B:71:0x0121, B:72:0x00a9, B:73:0x0034, B:74:0x00ad, B:76:0x00b8, B:78:0x00c8, B:80:0x00cb, B:83:0x00ce, B:85:0x00d4, B:86:0x00e8), top: B:2:0x0002 }] */
    @Override // p329lo.InterfaceC22544a
    /* renamed from: d3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo116638d3(C23913f c23913f) {
        boolean z11;
        C3000l0 mo127471c;
        AbstractC2959d abstractC2959d;
        if (c23913f != null) {
            try {
                C3020p0 c3020p0 = this.f110365v;
                if (c3020p0 != null && !TextUtils.isEmpty(c3020p0.f12057p)) {
                    ArrayList arrayList = c23913f.f115566b;
                    this.f110323D = arrayList;
                    C3020p0 c3020p02 = null;
                    if (arrayList != null && arrayList.size() > 0) {
                        C3020p0 c3020p03 = this.f110365v;
                        int i11 = c3020p03.f12058q;
                        if (i11 != 2 && i11 != 3) {
                            if (i11 == 23) {
                                ArrayList arrayList2 = c3020p03.f12023C.f12107P;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                        String str = "";
                                        C2954c c2954c = (C2954c) arrayList2.get(size);
                                        if (c2954c != null) {
                                            abstractC2959d = c2954c.m13986a();
                                        } else {
                                            abstractC2959d = null;
                                        }
                                        if (abstractC2959d instanceof C2964e) {
                                            str = String.valueOf(((C2964e) abstractC2959d).m14027j());
                                        } else if (abstractC2959d instanceof C2969f) {
                                            str = String.valueOf(((C2969f) abstractC2959d).m14049m());
                                        }
                                        if (!TextUtils.isEmpty(str) && this.f110323D.contains(str)) {
                                            arrayList2.remove(size);
                                        }
                                    }
                                }
                                if (arrayList2 != null && arrayList2.size() > 0) {
                                    C3025q0 c3025q0 = this.f110365v.f12023C;
                                    c3025q0.f12107P = arrayList2;
                                    c3025q0.f12125p = true;
                                    C31995kc.m154255c().m154257b(this.f110365v.f12057p);
                                    z11 = true;
                                    mo127471c = C24371m0.m127468p().mo127471c(this.f110365v.f12057p);
                                    if (mo127471c != null) {
                                        c3020p02 = mo127471c.m14325c0(this.f110365v.f12057p);
                                    }
                                    if (c3020p02 != null) {
                                        if (AbstractC20805l.m108553k(this.f110365v, c3020p02)) {
                                            z11 = true;
                                        }
                                        if (c23913f.f115567c || c23913f.f115568d) {
                                            this.f110365v.m14478G0(c3020p02.f12059r);
                                            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                                            ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                                        }
                                    } else if (c23913f.f115569e) {
                                        z11 = AbstractC20805l.m108545c(c23913f.f115565a, this.f110365v);
                                    }
                                    if (!z11) {
                                        return;
                                    }
                                    ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                                    ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                                }
                                m116775Sq(true);
                            }
                        }
                        ArrayList arrayList3 = c3020p03.f12023C.f12118i;
                        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                            if (this.f110323D.contains(((ItemAlbumMobile) arrayList3.get(size2)).f42595r)) {
                                arrayList3.remove(size2);
                            }
                        }
                        if (arrayList3.size() > 0) {
                            C3025q0 c3025q02 = this.f110365v.f12023C;
                            c3025q02.f12118i = arrayList3;
                            c3025q02.f12125p = true;
                            C31995kc.m154255c().m154257b(this.f110365v.f12057p);
                            z11 = true;
                            mo127471c = C24371m0.m127468p().mo127471c(this.f110365v.f12057p);
                            if (mo127471c != null) {
                            }
                            if (c3020p02 != null) {
                            }
                            if (!z11) {
                            }
                            ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                            ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                        }
                        m116775Sq(true);
                    }
                    z11 = false;
                    mo127471c = C24371m0.m127468p().mo127471c(this.f110365v.f12057p);
                    if (mo127471c != null) {
                    }
                    if (c3020p02 != null) {
                    }
                    if (!z11) {
                    }
                    ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                    ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: d4 */
    public boolean mo116639d4() {
        if (!TextUtils.equals(this.f110369z, CoreUtility.f89233i) && !C21927m.m114302u().m114318P(this.f110365v.f12022B.f12280b)) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: dn */
    public void mo116640dn() {
        int i11;
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            if (c3020p0.m14518m0()) {
                i11 = 20;
            } else {
                i11 = 10;
            }
            AbstractC23059e9.m118318G(i11);
        }
    }

    /* renamed from: dr */
    public boolean m116779dr() {
        ContactProfile contactProfile;
        if (!this.f110365v.m14494Y() && ((contactProfile = this.f110320A) == null || !contactProfile.m40387S0())) {
            return false;
        }
        return true;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: e0 */
    public void mo116641e0(C10873l c10873l) {
        if (c10873l != null && c10873l.f54891G != null && !c10873l.m56446L()) {
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            C10872k c10872k = c10873l.f54891G;
            String str = c10872k.f54883o;
            if (str == null) {
                str = "";
            }
            itemAlbumMobile.f42595r = str;
            itemAlbumMobile.f42607x = c10872k.f54878j;
            itemAlbumMobile.f42548C = c10872k.f54877i;
            itemAlbumMobile.f42558I = c10873l.m56503z();
            ArrayList arrayList = new ArrayList();
            arrayList.add(itemAlbumMobile);
            ((InterfaceC22546b) m103742Dp()).mo79614R(C2310k.m12211b().m12240l(arrayList).m12232d(0).m12231c(1).m12246r(c10873l.m56497w()).m12230b(c10873l.m56441F0().toString()).m12234f(this.f110369z).m12245q(1).m12239k(12).m12238j(c10873l.f54891G.f54878j).m12229a());
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: el */
    public void mo116642el(boolean z11) {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 == null) {
            return;
        }
        int m14515l = c3020p0.m14515l();
        long m14517m = this.f110365v.m14517m();
        a aVar = new a();
        ((InterfaceC22546b) m103742Dp()).mo46829Y();
        this.f110349d0.mo112370l(m14515l, m14517m, z11, aVar);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: f0 */
    public void mo116643f0(List list) {
        if (!list.isEmpty()) {
            this.f110357l0 = new C19591a((MediaItem) list.get(0));
            ((InterfaceC22546b) m103742Dp()).mo78358r2(this.f110357l0);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: f1 */
    public boolean mo116644f1(C31862c c31862c) {
        if (c31862c == null || !c31862c.f146301C) {
            return true;
        }
        List list = this.f110324E;
        if (list != null && list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: f2 */
    public void mo112338f2(int i11, int i12) {
        final C10873l c10873l;
        try {
            List list = this.f110324E;
            if (list != null && !list.isEmpty() && i12 >= 0 && i12 < this.f110324E.size()) {
                c10873l = (C10873l) this.f110324E.get(i12);
            } else {
                c10873l = null;
            }
            if (c10873l != null) {
                if (i11 == AbstractC8020f0.str_tv_optionmenu_reply) {
                    ((InterfaceC22546b) m103742Dp()).mo78327Ln(new Runnable() { // from class: lo.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.this.m116737jr(c10873l);
                        }
                    });
                    return;
                }
                if (i11 == AbstractC8020f0.copy) {
                    ((InterfaceC22546b) m103742Dp()).mo78342b4(c10873l.m56495v().toString());
                    return;
                }
                if (i11 == AbstractC8020f0.delete_comment) {
                    AbstractC23647d.m123897g("18702");
                    if (c10873l.m56446L()) {
                        C26736a.m137532e().m137537c(c10873l.m56493u());
                        m116706Qq(c10873l.m56493u());
                        return;
                    } else {
                        if (TextUtils.equals(this.f110369z, CoreUtility.f89233i) || TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                            ((InterfaceC22546b) m103742Dp()).mo46829Y();
                            this.f110349d0.mo112361d0(c10873l.m56487r(), c10873l.m56497w(), c10873l.m56493u(), c10873l.m56499x(), new f(c10873l));
                            return;
                        }
                        return;
                    }
                }
                if (i11 == AbstractC8020f0.str_reportabuse) {
                    m116690Hq(c10873l);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: fe */
    public void mo116645fe(int i11) {
        if (m116717Yq()) {
            ((InterfaceC22546b) m103742Dp()).mo79625ZB(i11, true);
        } else {
            ((InterfaceC22546b) m103742Dp()).mo79625ZB(8, false);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: ff */
    public CharSequence mo116646ff() {
        if (m116771Iq()) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_edit);
        }
        return "";
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: g */
    public C32002l4 mo112339g() {
        C32002l4 c32002l4 = this.f110332M;
        if (c32002l4 == null) {
            return C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
        }
        return c32002l4;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: g3 */
    public void mo112340g3() {
        C19591a c19591a = this.f110357l0;
        if (c19591a != null && m116777Xq(c19591a)) {
            ((InterfaceC22546b) m103742Dp()).mo78359s3(this.f110357l0);
        } else {
            ((InterfaceC22546b) m103742Dp()).mo78319H3();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: i1 */
    public String mo112341i1() {
        if (TextUtils.isEmpty(this.f110328I)) {
            return this.f110369z;
        }
        return this.f110328I;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: i2 */
    public boolean mo112342i2() {
        if (!m116776Wq(this.f110357l0) && !m116777Xq(this.f110357l0)) {
            return false;
        }
        return true;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: ij */
    public void mo116647ij() {
        C3003l3 c3003l3;
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && (c3003l3 = c3020p0.f12059r) != null && c3003l3.f11956a > 0) {
            if (c3020p0.m14494Y()) {
                ((InterfaceC22546b) m103742Dp()).mo79616R2(C2321v.m12267b().m12272b(this.f110365v).m12273c(false).m12271a());
            } else {
                ((InterfaceC22546b) m103742Dp()).showDialog(2);
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: j0 */
    public void mo116648j0() {
        ((InterfaceC22546b) m103742Dp()).mo78349kC(this.f110324E);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: jh */
    public int mo116649jh() {
        if (m116771Iq()) {
            return 9;
        }
        return 7;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: k0 */
    public void mo112343k0(C10873l c10873l) {
        if (c10873l != null && c10873l.m56446L()) {
            C10873l m137556d = C26744e.m137551e().m137556d(c10873l.m56493u());
            if (m137556d != null) {
                m137556d.f54914b0 = C32017m4.m154326S().m154372r(m116697Lq());
            }
            C26736a.m137532e().m137541j(c10873l.m56493u());
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: k4 */
    public boolean mo116650k4() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null && c3020p0.m14493X() && this.f110365v.m14488S()) {
            return true;
        }
        return false;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: l1 */
    public C3042u mo116651l1() {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f110369z);
        C3042u c3042u = new C3042u();
        if (m141809c != null) {
            c3042u.f12242f = 7;
            c3042u.f12239c = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog), m141809c.m40420o0());
            c3042u.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog);
            c3042u.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
            c3042u.f12258h = this.f110349d0.mo112415n0();
            c3042u.f12257g = m141809c;
        }
        return c3042u;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: l3 */
    public void mo112344l3(C25630b c25630b, int i11) {
        boolean z11 = true;
        boolean z12 = false;
        if (!C20120e.f99217a.m104723b(1)) {
            if (i11 == 1 || i11 == 9) {
                z12 = true;
            }
            this.f110357l0 = m116765yq(c25630b, z12);
            ((InterfaceC22546b) m103742Dp()).mo78329N2(this.f110357l0, true);
            return;
        }
        if (i11 != 1 && i11 != 9) {
            z11 = false;
        }
        m116680Cq(m116765yq(c25630b, z11), "", "");
        this.f110358m0 = false;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: l7 */
    public void mo116652l7() {
        String str;
        if (!C23055e5.m118272g(true)) {
            return;
        }
        C3060y1 c3060y1 = this.f110356k0;
        if (c3060y1 != null) {
            str = c3060y1.f12368b;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((InterfaceC22546b) m103742Dp()).mo46829Y();
        b bVar = new b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.f110349d0.mo112373o0(arrayList, 0, bVar);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: mj */
    public void mo116653mj(String str, boolean z11, boolean z12) {
        int i11;
        String str2 = "18500";
        if (z11) {
            try {
                AbstractC23647d.m123897g("18500");
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        C32002l4 m154284u = this.f110332M.m154284u(3);
        if (str.equals(CoreUtility.f89233i)) {
            if (!z11) {
                str2 = "";
            }
            ((InterfaceC22546b) m103742Dp()).mo79609J(new C26365a.b(str, m154284u).m135739F(str2).m135743b());
            return;
        }
        if (z12 && ((InterfaceC22546b) m103742Dp()).mo79631c0(str)) {
            ((InterfaceC22546b) m103742Dp()).mo78356q0();
            return;
        }
        ContactProfile contactProfile = this.f110320A;
        if (contactProfile != null && contactProfile.m40387S0()) {
            i11 = 20;
        } else {
            i11 = 10;
        }
        C21927m.m114302u().m114330e0(str, new TrackingSource(i11));
        ((InterfaceC22546b) m103742Dp()).mo79609J(new C26365a.b(str, m154284u).m135743b());
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: n0 */
    public void mo116654n0(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m116708Rq((String) it.next());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: n6 */
    public void mo116655n6() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            AbstractC22575p0.m116817h(this, c3020p0, this.f110332M);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: nl */
    public void mo116656nl() {
        try {
            if (this.f110365v != null) {
                ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: o8 */
    public String mo116657o8(int i11) {
        int i12;
        if (i11 > 0) {
            try {
                if (!m116779dr()) {
                    if (C21927m.m114302u().m114357s() != null) {
                        if (!C21927m.m114302u().m114357s().m153137g(this.f110365v.f12022B.f12280b)) {
                        }
                    }
                    List list = this.f110324E;
                    if (list == null || list.size() != i11) {
                        StringBuilder sb2 = new StringBuilder();
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_notice_numberOfCommnet_noPrivacy);
                        Object[] objArr = new Object[2];
                        objArr[0] = Integer.valueOf(i11);
                        if (i11 > 1) {
                            i12 = AbstractC8020f0.str_more_s;
                        } else {
                            i12 = AbstractC8020f0.str_single_form;
                        }
                        objArr[1] = AbstractC23136l9.m118743r0(i12);
                        sb2.append(String.format(m118743r0, objArr));
                        sb2.append(" ");
                        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_privacy_comment));
                        return sb2.toString();
                    }
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return "";
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: oc */
    public void mo116658oc() {
        AbstractC23647d.m123897g("4444");
        ((InterfaceC22546b) m103742Dp()).mo11948c1(this.f110365v);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: od */
    public void mo116659od() {
        ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: oh */
    public void mo116660oh() {
        String str;
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            if (!TextUtils.isEmpty(c3020p0.f12023C.f12110a)) {
                str = this.f110365v.f12023C.f12110a.toString();
            } else {
                str = "";
            }
            ((InterfaceC22546b) m103742Dp()).mo78342b4(str);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: op */
    public void mo116661op(C23908a c23908a) {
        AbstractC2959d abstractC2959d;
        if (c23908a != null) {
            try {
                C3020p0 c3020p0 = this.f110365v;
                if (c3020p0 != null && !TextUtils.isEmpty(c3020p0.f12057p)) {
                    if (c23908a.f115531c) {
                        this.f110321B = true;
                        ((InterfaceC22546b) m103742Dp()).mo79607Dm();
                        return;
                    }
                    ArrayList arrayList = c23908a.f115530b;
                    this.f110323D = arrayList;
                    if (arrayList != null && arrayList.size() > 0) {
                        C3020p0 c3020p02 = this.f110365v;
                        if (c3020p02.f12058q == 23) {
                            ArrayList arrayList2 = c3020p02.f12023C.f12107P;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                    String str = "";
                                    C2954c c2954c = (C2954c) arrayList2.get(size);
                                    if (c2954c != null) {
                                        abstractC2959d = c2954c.m13986a();
                                    } else {
                                        abstractC2959d = null;
                                    }
                                    if (abstractC2959d instanceof C2964e) {
                                        str = String.valueOf(((C2964e) abstractC2959d).m14027j());
                                    } else if (abstractC2959d instanceof C2969f) {
                                        str = String.valueOf(((C2969f) abstractC2959d).m14049m());
                                    }
                                    if (!TextUtils.isEmpty(str) && this.f110323D.contains(str)) {
                                        arrayList2.remove(size);
                                    }
                                }
                            }
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                C3025q0 c3025q0 = this.f110365v.f12023C;
                                c3025q0.f12107P = arrayList2;
                                c3025q0.f12125p = true;
                                C31995kc.m154255c().m154257b(this.f110365v.f12057p);
                                ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                                ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
                                return;
                            }
                            m116775Sq(true);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: p4 */
    public String mo116662p4() {
        try {
            C3047v0 c3047v0 = this.f110365v.f12022B;
            return AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: q2 */
    public void mo116663q2(boolean z11) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f110369z);
        if (m141809c != null) {
            m116678B0(m141809c, z11);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: qi */
    public void mo116664qi() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 == null) {
            return;
        }
        try {
            m116761wq(((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(0)).f42595r);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: rd */
    public C22579r0 mo116665rd() {
        return C22579r0.m116834a(this.f110365v, this.f110321B, mo112324I(), this.f110323D, this.f110322C);
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: s3 */
    public void mo112345s3(C19591a c19591a) {
        if (m116776Wq(c19591a) && AbstractC23041d2.m118194A(c19591a.m102558a().mo41081Q())) {
            ((InterfaceC22546b) m103742Dp()).mo79636g1(c19591a.m102558a());
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
        }
        AbstractC23647d.m123897g("188011");
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: s9 */
    public void mo116666s9(C3000l0 c3000l0) {
        if (c3000l0 != null) {
            try {
                this.f110364u = c3000l0;
                this.f110365v = c3000l0.m14322a0();
                new C25418k0().m101508a(new C25418k0.a(c3000l0.m14322a0()));
                ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22547b0.this.m116746or();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: si */
    public void mo116667si() {
        if (this.f110365v != null && !m116778cr()) {
            EnumC31051a m150915b = C31060j.m150915b(this.f110365v);
            if (AbstractC31052b.m150889b(m150915b)) {
                ((InterfaceC22546b) m103742Dp()).mo79619T0();
                C31060j.f143193a.m150942h();
            } else if (AbstractC31052b.m150888a(m150915b)) {
                ((InterfaceC22546b) m103742Dp()).mo79622X1();
            }
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: sj */
    public CharSequence mo116668sj() {
        return AbstractC20826v0.m108759G(this.f110365v);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: tg */
    public void mo116669tg(boolean z11) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f110369z);
        if (m141809c != null) {
            AbstractC23647d.m123897g("4914003");
            ((InterfaceC22546b) m103742Dp()).mo11959k0(m141809c);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: vn */
    public TrackingSource mo116670vn() {
        return this.f110331L;
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: w */
    public void mo116671w() {
        C3020p0 c3020p0 = this.f110365v;
        if (c3020p0 != null) {
            final C2976g1 m129551v = C24906b.f119505a.m129551v(c3020p0.f12057p);
            if (m129551v != null && m129551v.m14119g() && C20120e.f99217a.m104724c(1)) {
                if (((InterfaceC22546b) m103742Dp()).mo78311A1()) {
                    ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22547b0.this.m116760vr(m129551v);
                        }
                    });
                    return;
                }
                return;
            }
            ((InterfaceC22546b) m103742Dp()).mo78343d4();
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: y */
    public void mo116672y(C10873l c10873l, boolean z11) {
        if (z11) {
            AbstractC23647d.m123897g("18600");
        }
        ((InterfaceC22546b) m103742Dp()).mo79606B0(c10873l.m56497w(), this.f110365v, c10873l.m56485q());
        ((InterfaceC22546b) m103742Dp()).mo78343d4();
        this.f110328I = c10873l.m56497w();
        this.f110329J = c10873l.m56493u();
        this.f110330K = c10873l.m56485q();
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: y1 */
    public void mo116673y1() {
        String str;
        try {
            if (!TextUtils.isEmpty(this.f110363t)) {
                str = this.f110363t;
            } else {
                C3020p0 c3020p0 = this.f110365v;
                if (c3020p0 != null) {
                    str = c3020p0.f12057p;
                } else {
                    str = "";
                }
            }
            if (!TextUtils.isEmpty(str) && this.f110364u != null) {
                ((InterfaceC22546b) m103742Dp()).mo79612Qa(m116774Pq(true));
                ((InterfaceC22546b) m103742Dp()).mo79654tf(m116773Mq(false));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: y2 */
    public void mo112346y2(boolean z11) {
        if (!z11) {
            this.f110325F = "0";
        } else {
            if (this.f110324E.size() == 0) {
                this.f110325F = "0";
            } else {
                String str = this.f110325F;
                if (str != null && str.trim().length() > 0) {
                    this.f110325F = ((C10873l) this.f110324E.get(0)).m56493u();
                }
            }
            ((InterfaceC22546b) m103742Dp()).mo70710wy(new Runnable() { // from class: lo.o
                @Override // java.lang.Runnable
                public final void run() {
                    C22547b0.this.m116727er();
                }
            });
            this.f110341V = false;
            this.f110342W = false;
        }
        this.f110338S = this.f110325F.equals("0");
        this.f110348c0.m123036e(mo112324I(), "", this.f110325F, 50, C32017m4.m154326S().m154377w(this.f110332M), new C23415c.a() { // from class: lo.r
            @Override // mp.C23415c.a
            /* renamed from: a */
            public final void mo116833a(C23413a c23413a) {
                C22547b0.this.m116733hr(c23413a);
            }
        });
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: yi */
    public void mo116674yi(final C20096c c20096c) {
        m116757uq(new Runnable() { // from class: lo.v
            @Override // java.lang.Runnable
            public final void run() {
                C22547b0.this.m116768zr(c20096c);
            }
        });
    }

    /* renamed from: z6 */
    public void m116780z6() {
        C19591a c19591a = this.f110357l0;
        if ((c19591a == null || c19591a.m102560c() == 0) && this.f110365v != null && C20120e.f99217a.m104724c(1) && C23055e5.m118271f()) {
            C24906b.f119505a.m129544A(this.f110365v, this.f110332M);
        }
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: zc */
    public void mo116675zc() {
        boolean z11 = false;
        this.f110341V = false;
        if ((this.f110344Y && this.f110334O == -1) || m116753sq()) {
            z11 = true;
        }
        this.f110342W = z11;
        C26736a.m137532e().m137536b();
        m116701Nq();
        m116780z6();
        m116686Fq(this.f110365v);
        m116688Gq(this.f110364u);
    }

    @Override // p329lo.InterfaceC22544a
    /* renamed from: zi */
    public void mo116676zi() {
        if (ZMediaPlayerSettings.isVideoAutoplay()) {
            ((InterfaceC22546b) m103742Dp()).mo79620WF(this.f110352g0);
        }
    }
}
