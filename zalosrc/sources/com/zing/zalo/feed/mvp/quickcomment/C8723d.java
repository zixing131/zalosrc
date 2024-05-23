package com.zing.zalo.feed.mvp.quickcomment;

import android.text.TextUtils;
import ar.C2310k;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import c30.C3255n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.mvp.quickcomment.C8723d;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.C10872k;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.C10881t;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import gs.C19591a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import is.AbstractC20826v0;
import is.AbstractC20833z;
import is.C20785b;
import is.C20815q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mp.C23413a;
import mp.C23415c;
import mp.C23416d;
import no.C23909b;
import no.C23912e;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p217hs.C20120e;
import p302ko.C21785g;
import p304ks.C21927m;
import p361nb.AbstractC23647d;
import p455qo.C25418k0;
import p458qr.C25470c;
import p471r3.C25630b;
import p510sq.C26365a;
import p583vq.C28587j0;
import p583vq.C28594q;
import p588vw.C28644j;
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pr.C24906b;
import tn.C26736a;
import tn.C26744e;
import tn.C26746f;
import tn.C26748g;
import tr.C26878b;
import vg.C28023b6;

/* renamed from: com.zing.zalo.feed.mvp.quickcomment.d */
/* loaded from: classes4.dex */
public class C8723d extends AbstractC19962a implements InterfaceC8720a {

    /* renamed from: A */
    private boolean f46873A;

    /* renamed from: B */
    private int f46874B;

    /* renamed from: C */
    private List f46875C;

    /* renamed from: D */
    private String f46876D;

    /* renamed from: E */
    private int f46877E;

    /* renamed from: F */
    private boolean f46878F;

    /* renamed from: G */
    private boolean f46879G;

    /* renamed from: H */
    private boolean f46880H;

    /* renamed from: I */
    private int f46881I;

    /* renamed from: J */
    String f46882J;

    /* renamed from: K */
    String f46883K;

    /* renamed from: L */
    String f46884L;

    /* renamed from: M */
    private boolean f46885M;

    /* renamed from: N */
    private int f46886N;

    /* renamed from: O */
    private boolean f46887O;

    /* renamed from: P */
    private boolean f46888P;

    /* renamed from: Q */
    private final C23415c f46889Q;

    /* renamed from: R */
    private final C21785g f46890R;

    /* renamed from: S */
    private C2988i3 f46891S;

    /* renamed from: T */
    private C19591a f46892T;

    /* renamed from: U */
    boolean f46893U;

    /* renamed from: V */
    private int f46894V;

    /* renamed from: W */
    private boolean f46895W;

    /* renamed from: X */
    private final C26746f.b f46896X;

    /* renamed from: t */
    private String f46897t;

    /* renamed from: u */
    private String f46898u;

    /* renamed from: v */
    private String f46899v;

    /* renamed from: w */
    private C3020p0 f46900w;

    /* renamed from: x */
    private ItemAlbumMobile f46901x;

    /* renamed from: y */
    private C32002l4 f46902y;

    /* renamed from: z */
    private TrackingSource f46903z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.d$a */
    /* loaded from: classes4.dex */
    public class a implements C26746f.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m46703c(JSONObject jSONObject) {
            try {
                if (((InterfaceC8721b) C8723d.this.m103742Dp()).mo45894h0() && jSONObject != null && C8723d.this.f46875C != null) {
                    for (C10873l c10873l : C8723d.this.f46875C) {
                        c10873l.m56502y0(jSONObject.optJSONObject(c10873l.m56493u()));
                    }
                    InterfaceC8721b interfaceC8721b = (InterfaceC8721b) C8723d.this.m103742Dp();
                    List list = C8723d.this.f46875C;
                    C8723d c8723d = C8723d.this;
                    interfaceC8721b.mo46536Us(list, c8723d.m46688o8(c8723d.f46881I));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // tn.C26746f.b
        /* renamed from: a */
        public void mo46704a(final JSONObject jSONObject) {
            ((InterfaceC8721b) C8723d.this.m103742Dp()).mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.c
                @Override // java.lang.Runnable
                public final void run() {
                    C8723d.a.this.m46703c(jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.d$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m46706d() {
            try {
                C8723d c8723d = C8723d.this;
                c8723d.f46881I = c8723d.f46900w.f12025E.f12243a;
                ((InterfaceC8721b) C8723d.this.m103742Dp()).mo46521DE(C8723d.this.f46900w);
                ((InterfaceC8721b) C8723d.this.m103742Dp()).mo46545e3(C8723d.this.f46900w);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C8723d.this.f46903z = null;
                C3000l0 m108750B0 = AbstractC20826v0.m108750B0(((JSONObject) obj).getJSONObject("data").getJSONObject("feed"));
                if (m108750B0 != null) {
                    C3020p0 m14322a0 = m108750B0.m14322a0();
                    if (m14322a0 != null) {
                        C8723d.this.f46900w.f12064w = m14322a0.f12064w;
                        C8723d.this.f46900w.f12028H = m14322a0.f12028H;
                        C8723d.this.f46900w.f12032L = m14322a0.f12032L;
                        C8723d.this.f46900w.f12025E = m14322a0.f12025E;
                        C8723d.this.f46900w.m14476F0();
                        FeedActionZUtils.m47549g(C8723d.this.mo46593I());
                        if (C8723d.this.f46900w.f12058q != 2) {
                            if (C8723d.this.f46900w.f12058q == 17) {
                            }
                            AbstractC20833z.m108894I();
                        }
                        String str = "";
                        if (C8723d.this.f46900w.f12023C != null && C8723d.this.f46900w.f12023C.f12118i != null && !C8723d.this.f46900w.f12023C.f12118i.isEmpty() && C8723d.this.f46900w.f12023C.f12118i.get(0) != null) {
                            str = ((ItemAlbumMobile) C8723d.this.f46900w.f12023C.f12118i.get(0)).f42595r;
                        }
                        FeedActionZUtils.m47549g(str);
                        AbstractC20833z.m108894I();
                    }
                    new C25418k0().m101508a(new C25418k0.a(m14322a0));
                    ((InterfaceC8721b) C8723d.this.m103742Dp()).mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8723d.b.this.m46706d();
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.d$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C10873l f46906a;

        c(C10873l c10873l) {
            this.f46906a = c10873l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m46708d() {
            ((InterfaceC8721b) C8723d.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delete_comment_fail));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (((InterfaceC8721b) C8723d.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC8721b) C8723d.this.m103742Dp()).mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.c.this.m46708d();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C8723d.this.m46697wq(this.f46906a.m56493u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.d$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C10873l f46908a;

        d(C10873l c10873l) {
            this.f46908a = c10873l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m46710d() {
            ((InterfaceC8721b) C8723d.this.m103742Dp()).mo78960q3();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delete_comment_fail));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (((InterfaceC8721b) C8723d.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC8721b) C8723d.this.m103742Dp()).mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.d.this.m46710d();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C8723d.this.m46697wq(this.f46908a.m56493u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.quickcomment.d$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m46713e() {
            ((InterfaceC8721b) C8723d.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m46714f() {
            ((InterfaceC8721b) C8723d.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (((InterfaceC8721b) C8723d.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC8721b) C8723d.this.m103742Dp()).mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.e.this.m46714f();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (((InterfaceC8721b) C8723d.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC8721b) C8723d.this.m103742Dp()).mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.quickcomment.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.e.this.m46713e();
                    }
                });
            }
        }
    }

    public C8723d(InterfaceC8721b interfaceC8721b, C21785g c21785g) {
        super(interfaceC8721b);
        this.f46882J = "";
        this.f46883K = "";
        this.f46884L = "";
        this.f46885M = true;
        this.f46893U = false;
        this.f46894V = -1;
        this.f46895W = false;
        this.f46896X = new a();
        this.f46889Q = C23415c.m123032b();
        this.f46890R = c21785g;
    }

    /* renamed from: Aq */
    private boolean m46638Aq(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile == null) {
            return false;
        }
        if (!this.f46887O && !itemAlbumMobile.f42593q.equals(CoreUtility.f89233i)) {
            return false;
        }
        return true;
    }

    /* renamed from: Bq */
    private boolean m46639Bq() {
        return !TextUtils.isEmpty(this.f46898u);
    }

    /* renamed from: Cq */
    private boolean m46640Cq() {
        int i11;
        C3020p0 c3020p0 = this.f46900w;
        if (c3020p0 != null && ((i11 = c3020p0.f12058q) == 2 || i11 == 17 || c3020p0.m14506g0())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Dq */
    public /* synthetic */ void m46641Dq() {
        ((InterfaceC8721b) m103742Dp()).mo46556vg(this.f46888P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Eq */
    public /* synthetic */ void m46642Eq() {
        ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(true, false), this.f46880H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fq */
    public /* synthetic */ void m46643Fq(boolean z11, List list) {
        String str;
        try {
            ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
            ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
            if (!z11) {
                String str2 = "0";
                if (TextUtils.isEmpty(this.f46897t)) {
                    str = "0";
                } else {
                    str = this.f46897t;
                }
                if (!TextUtils.isEmpty(this.f46898u)) {
                    str2 = this.f46898u;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C10873l) it.next()).m56493u());
                }
                C26746f.m137567g(new C26748g(arrayList, str, str2), this.f46896X);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gq */
    public /* synthetic */ void m46644Gq() {
        ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, true), this.f46880H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Hq */
    public /* synthetic */ void m46645Hq(C23413a c23413a) {
        long j11;
        if (c23413a != null && ((InterfaceC8721b) m103742Dp()).mo45894h0()) {
            int i11 = c23413a.f113766a;
            if (i11 == 0) {
                try {
                    final boolean z11 = c23413a.f113769d;
                    final List list = c23413a.f113767b;
                    if (this.f46879G) {
                        List list2 = this.f46875C;
                        if (list2 == null) {
                            this.f46875C = new ArrayList();
                        } else {
                            list2.clear();
                        }
                    }
                    AbstractC20789d.m108470d(list, this.f46875C);
                    C28594q.m143005j().m143006d(m46691qq(), this.f46875C);
                    List m137555c = C26744e.m137551e().m137555c(m46687nq(), this.f46875C);
                    this.f46875C = m137555c;
                    AbstractC20789d.m108479m(m137555c);
                    this.f46876D = c23413a.f113768c;
                    this.f46877E += c23413a.f113770e;
                    int i12 = c23413a.f113771f;
                    this.f46881I = i12;
                    m46669Vq(i12);
                    int size = this.f46875C.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int m108473g = AbstractC20789d.m108473g(list, (C10873l) this.f46875C.get(size));
                        if (m108473g != -1) {
                            if (m108473g < list.size() - 1) {
                                this.f46878F = true;
                            }
                        } else {
                            size--;
                        }
                    }
                    if (!m46639Bq() || m46640Cq()) {
                        new C25418k0().m101508a(new C25418k0.a(this.f46900w));
                    }
                    m46680gq();
                    InterfaceC8721b interfaceC8721b = (InterfaceC8721b) m103742Dp();
                    Runnable runnable = new Runnable() { // from class: vq.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8723d.this.m46643Fq(z11, list);
                        }
                    };
                    if (this.f46879G) {
                        j11 = 200;
                    } else {
                        j11 = 0;
                    }
                    interfaceC8721b.mo78955kl(runnable, j11);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (i11 == 1) {
                ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.this.m46644Gq();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Iq */
    public /* synthetic */ void m46647Iq() {
        ((InterfaceC8721b) m103742Dp()).mo46543d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jq */
    public /* synthetic */ void m46649Jq() {
        ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
        ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Kq */
    public /* synthetic */ void m46651Kq() {
        try {
            ((InterfaceC8721b) m103742Dp()).mo49315c4();
            ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
            ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
            ((InterfaceC8721b) m103742Dp()).mo46518Az(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Lq */
    public /* synthetic */ void m46652Lq() {
        ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
        ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mq */
    public /* synthetic */ void m46654Mq() {
        ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
        ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
        ((InterfaceC8721b) m103742Dp()).mo46558yh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Nq */
    public /* synthetic */ void m46656Nq() {
        ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
        ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Oq */
    public /* synthetic */ void m46658Oq(String str) {
        m46685lq(str, "");
        ((InterfaceC8721b) m103742Dp()).mo46555t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pq */
    public /* synthetic */ void m46660Pq(C25630b c25630b) {
        m46684kq(m46682iq(c25630b, true), "", "");
        ((InterfaceC8721b) m103742Dp()).mo46555t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Qq */
    public /* synthetic */ void m46662Qq(C10873l c10873l) {
        ((InterfaceC8721b) m103742Dp()).mo46519B0(c10873l.m56497w(), this.f46900w, c10873l.m56485q());
        this.f46882J = c10873l.m56497w();
        this.f46883K = c10873l.m56493u();
        this.f46884L = c10873l.m56485q();
        ((InterfaceC8721b) m103742Dp()).mo46544d4();
    }

    /* renamed from: Rq */
    private void m46664Rq(C3020p0 c3020p0) {
        String str;
        if (c3020p0 != null) {
            if (this.f46895W) {
                str = "viewfull_photodetail";
            } else {
                str = "feed_avt_cover";
            }
            if (c3020p0.m14510i0()) {
                C20785b.f102138a.m108455e(c3020p0.m14465A(), str);
            } else if (c3020p0.m14512j0()) {
                C20785b.f102138a.m108456f(c3020p0.m14465A(), str);
            }
        }
    }

    /* renamed from: Tq */
    private void m46667Tq(String str) {
        C28594q.m143005j().m143013m(m46691qq(), str);
    }

    /* renamed from: Uq */
    private void m46668Uq() {
        this.f46893U = false;
        this.f46902y = this.f46902y.m154274d(10002, 45);
    }

    /* renamed from: Vq */
    private void m46669Vq(int i11) {
        if (m46639Bq()) {
            ItemAlbumMobile itemAlbumMobile = this.f46901x;
            if (itemAlbumMobile != null) {
                itemAlbumMobile.f42561L = i11 + "";
            }
            if (m46640Cq()) {
                C3020p0 c3020p0 = this.f46900w;
                c3020p0.f12025E.f12243a = i11;
                if (i11 <= 0) {
                    c3020p0.f12041U = null;
                }
                new C25418k0().m101508a(new C25418k0.a(this.f46900w));
                return;
            }
            return;
        }
        C3020p0 c3020p02 = this.f46900w;
        if (c3020p02 != null) {
            c3020p02.f12025E.f12243a = i11;
            if (i11 <= 0) {
                c3020p02.f12041U = null;
            }
            new C25418k0().m101508a(new C25418k0.a(this.f46900w));
        }
    }

    /* renamed from: gq */
    private void m46680gq() {
        int i11;
        try {
            if (!TextUtils.isEmpty(this.f46898u)) {
                FeedActionZUtils.m47550h(this.f46898u);
                return;
            }
            if (!TextUtils.isEmpty(this.f46897t)) {
                String str = this.f46897t;
                C3020p0 c3020p0 = this.f46900w;
                if (c3020p0 != null && ((i11 = c3020p0.f12058q) == 2 || i11 == 17)) {
                    str = ((ItemAlbumMobile) c3020p0.f12023C.f12118i.get(0)).f42595r;
                }
                FeedActionZUtils.m47550h(str);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:7:0x0007, B:9:0x000f, B:10:0x0017, B:12:0x0029, B:16:0x0035, B:19:0x007c, B:20:0x0083, B:22:0x0087, B:24:0x0090, B:25:0x0095, B:27:0x00a1), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:7:0x0007, B:9:0x000f, B:10:0x0017, B:12:0x0029, B:16:0x0035, B:19:0x007c, B:20:0x0083, B:22:0x0087, B:24:0x0090, B:25:0x0095, B:27:0x00a1), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[Catch: Exception -> 0x0012, TRY_LEAVE, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:7:0x0007, B:9:0x000f, B:10:0x0017, B:12:0x0029, B:16:0x0035, B:19:0x007c, B:20:0x0083, B:22:0x0087, B:24:0x0090, B:25:0x0095, B:27:0x00a1), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: hq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m46681hq(C25630b c25630b, boolean z11, String str, String str2) {
        String str3;
        boolean z12;
        C10873l m123037f;
        try {
            if (!this.f46885M) {
                return;
            }
            if (!TextUtils.isEmpty(this.f46897t)) {
                str3 = this.f46897t;
            } else {
                str3 = "-1";
            }
            C23416d.a m123073w = C23416d.m123038a().m123073w(1);
            if (!m46698zq(this.f46900w) && !m46638Aq(this.f46901x)) {
                z12 = false;
                C23416d m123063m = m123073w.m123064n(z12).m123065o(str3).m123068r(this.f46898u).m123071u(this.f46899v).m123072v(m46695uq()).m123066p(str2).m123070t(c25630b).m123069s(str, this.f46882J, this.f46883K).m123063m();
                int i11 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
                m123037f = C23415c.m123032b().m123037f(m123063m, i11, m46689oq(i11));
                if (c25630b != null && z11) {
                    C3255n.m16562n().m16578v(c25630b);
                }
                if (this.f46875C == null) {
                    this.f46875C = new ArrayList();
                }
                if (m123037f != null) {
                    this.f46875C.add(m123037f);
                }
                if (!((InterfaceC8721b) m103742Dp()).mo45894h0()) {
                    this.f46882J = "";
                    this.f46883K = "";
                    this.f46884L = "";
                    ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
                    InterfaceC8721b interfaceC8721b = (InterfaceC8721b) m103742Dp();
                    List list = this.f46875C;
                    interfaceC8721b.mo46536Us(list, m46688o8(list.size()));
                    ((InterfaceC8721b) m103742Dp()).mo46535U3(this.f46875C);
                    return;
                }
                return;
            }
            z12 = true;
            C23416d m123063m2 = m123073w.m123064n(z12).m123065o(str3).m123068r(this.f46898u).m123071u(this.f46899v).m123072v(m46695uq()).m123066p(str2).m123070t(c25630b).m123069s(str, this.f46882J, this.f46883K).m123063m();
            int i112 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
            m123037f = C23415c.m123032b().m123037f(m123063m2, i112, m46689oq(i112));
            if (c25630b != null) {
                C3255n.m16562n().m16578v(c25630b);
            }
            if (this.f46875C == null) {
            }
            if (m123037f != null) {
            }
            if (!((InterfaceC8721b) m103742Dp()).mo45894h0()) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iq */
    private C19591a m46682iq(C25630b c25630b, boolean z11) {
        C19591a c19591a = new C19591a(c25630b);
        c19591a.m102562e(z11);
        return c19591a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:7:0x0007, B:9:0x000f, B:10:0x0017, B:12:0x002a, B:16:0x0036, B:18:0x007d, B:20:0x0086, B:21:0x0096, B:23:0x00a2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:7:0x0007, B:9:0x000f, B:10:0x0017, B:12:0x002a, B:16:0x0036, B:18:0x007d, B:20:0x0086, B:21:0x0096, B:23:0x00a2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: Exception -> 0x0012, TRY_LEAVE, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0002, B:7:0x0007, B:9:0x000f, B:10:0x0017, B:12:0x002a, B:16:0x0036, B:18:0x007d, B:20:0x0086, B:21:0x0096, B:23:0x00a2), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: jq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m46683jq(String str, MediaItem mediaItem, String str2) {
        String str3;
        boolean z11;
        C10873l m123037f;
        try {
            if (!this.f46885M) {
                return;
            }
            if (!TextUtils.isEmpty(this.f46897t)) {
                str3 = this.f46897t;
            } else {
                str3 = "-1";
            }
            C23416d.a m123073w = C23416d.m123038a().m123073w(2);
            if (!m46698zq(this.f46900w) && !m46638Aq(this.f46901x)) {
                z11 = false;
                C23416d m123063m = m123073w.m123064n(z11).m123065o(str3).m123068r(this.f46898u).m123071u(this.f46899v).m123072v(m46695uq()).m123066p(str).m123067q(mediaItem).m123069s(str2, this.f46882J, this.f46883K).m123063m();
                int i11 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
                m123037f = C23415c.m123032b().m123037f(m123063m, i11, m46689oq(i11));
                if (this.f46875C == null) {
                    this.f46875C = new ArrayList();
                }
                if (m123037f != null) {
                    this.f46875C.add(m123037f);
                    ((InterfaceC8721b) m103742Dp()).mo46525I2(false, this.f46892T);
                }
                if (!((InterfaceC8721b) m103742Dp()).mo45894h0()) {
                    this.f46882J = "";
                    this.f46883K = "";
                    this.f46884L = "";
                    ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
                    InterfaceC8721b interfaceC8721b = (InterfaceC8721b) m103742Dp();
                    List list = this.f46875C;
                    interfaceC8721b.mo46536Us(list, m46688o8(list.size()));
                    ((InterfaceC8721b) m103742Dp()).mo46535U3(this.f46875C);
                    return;
                }
                return;
            }
            z11 = true;
            C23416d m123063m2 = m123073w.m123064n(z11).m123065o(str3).m123068r(this.f46898u).m123071u(this.f46899v).m123072v(m46695uq()).m123066p(str).m123067q(mediaItem).m123069s(str2, this.f46882J, this.f46883K).m123063m();
            int i112 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
            m123037f = C23415c.m123032b().m123037f(m123063m2, i112, m46689oq(i112));
            if (this.f46875C == null) {
            }
            if (m123037f != null) {
            }
            if (!((InterfaceC8721b) m103742Dp()).mo45894h0()) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kq */
    private void m46684kq(C19591a c19591a, String str, String str2) {
        try {
            if (!this.f46885M) {
                return;
            }
            m46681hq(C28644j.m143233Y().m143282P0(c19591a.m102559b()), c19591a.m102561d(), str, str2);
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0012, B:8:0x0024, B:12:0x0030, B:14:0x0073, B:16:0x007c, B:17:0x0081, B:19:0x008d), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0012, B:8:0x0024, B:12:0x0030, B:14:0x0073, B:16:0x007c, B:17:0x0081, B:19:0x008d), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d A[Catch: Exception -> 0x000d, TRY_LEAVE, TryCatch #0 {Exception -> 0x000d, blocks: (B:3:0x0002, B:5:0x000a, B:6:0x0012, B:8:0x0024, B:12:0x0030, B:14:0x0073, B:16:0x007c, B:17:0x0081, B:19:0x008d), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: lq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m46685lq(String str, String str2) {
        String str3;
        boolean z11;
        C10873l m123037f;
        try {
            if (!TextUtils.isEmpty(this.f46897t)) {
                str3 = this.f46897t;
            } else {
                str3 = "-1";
            }
            C23416d.a m123073w = C23416d.m123038a().m123073w(0);
            if (!m46698zq(this.f46900w) && !m46638Aq(this.f46901x)) {
                z11 = false;
                C23416d m123063m = m123073w.m123064n(z11).m123065o(str3).m123068r(this.f46898u).m123071u(this.f46899v).m123072v(m46695uq()).m123066p(str).m123069s(str2, this.f46882J, this.f46883K).m123063m();
                int i11 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
                m123037f = C23415c.m123032b().m123037f(m123063m, i11, m46689oq(i11));
                if (this.f46875C == null) {
                    this.f46875C = new ArrayList();
                }
                if (m123037f != null) {
                    this.f46875C.add(m123037f);
                }
                if (!((InterfaceC8721b) m103742Dp()).mo45894h0()) {
                    this.f46882J = "";
                    this.f46883K = "";
                    this.f46884L = "";
                    ((InterfaceC8721b) m103742Dp()).mo46520C7(m46690pq(false, false), this.f46880H);
                    InterfaceC8721b interfaceC8721b = (InterfaceC8721b) m103742Dp();
                    List list = this.f46875C;
                    interfaceC8721b.mo46536Us(list, m46688o8(list.size()));
                    ((InterfaceC8721b) m103742Dp()).mo46535U3(this.f46875C);
                    return;
                }
                return;
            }
            z11 = true;
            C23416d m123063m2 = m123073w.m123064n(z11).m123065o(str3).m123068r(this.f46898u).m123071u(this.f46899v).m123072v(m46695uq()).m123066p(str).m123069s(str2, this.f46882J, this.f46883K).m123063m();
            int i112 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
            m123037f = C23415c.m123032b().m123037f(m123063m2, i112, m46689oq(i112));
            if (this.f46875C == null) {
            }
            if (m123037f != null) {
            }
            if (!((InterfaceC8721b) m103742Dp()).mo45894h0()) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:            if (r10.m56493u() == null) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:            r2 = r10.m56497w();        r0 = "";        r1 = r9.f46900w;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:            if (r1 == null) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:            r0 = r1.f12057p;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:            r4 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:            r5 = r10.m56493u();     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:            if (r2 == null) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:            if (r4 == null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:            if (r5 != null) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:            ((com.zing.zalo.feed.mvp.quickcomment.InterfaceC8721b) m103742Dp()).mo46829Y();        r9.f46890R.mo112375q0(r2, "8", r4, r5, 0, "", new com.zing.zalo.feed.mvp.quickcomment.C8723d.e(r9));     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0029, code lost:            r1 = r9.f46901x;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:            if (r1 == null) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002d, code lost:            r0 = r1.f42599t;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:            return;     */
    /* renamed from: mq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m46686mq(C10873l c10873l) {
        ItemAlbumMobile itemAlbumMobile;
        try {
            if (this.f46900w == null && ((itemAlbumMobile = this.f46901x) == null || TextUtils.isEmpty(itemAlbumMobile.f42599t))) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nq */
    private String m46687nq() {
        String mo46593I = mo46593I();
        if (!TextUtils.isEmpty(this.f46898u)) {
            return this.f46898u;
        }
        return mo46593I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o8 */
    public String m46688o8(int i11) {
        int i12;
        if (i11 > 0) {
            try {
                C3020p0 c3020p0 = this.f46900w;
                if (c3020p0 != null) {
                    if (!c3020p0.m14494Y()) {
                    }
                    return "";
                }
                ItemAlbumMobile itemAlbumMobile = this.f46901x;
                if ((itemAlbumMobile == null || !itemAlbumMobile.f42593q.equals(CoreUtility.f89233i)) && i11 != this.f46875C.size()) {
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
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: oq */
    private String m46689oq(int i11) {
        if (i11 == 0) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_blockcomment);
        }
        return AbstractC23136l9.m118743r0(C20815q.m108692f(this.f46901x));
    }

    /* renamed from: pq */
    private C23909b m46690pq(boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        List list;
        List list2;
        if (this.f46881I == 0 && !AbstractC20789d.m108475i(this.f46875C)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f46881I > 0 && (list2 = this.f46875C) != null && list2.isEmpty()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (this.f46881I != 0 && (((list = this.f46875C) == null || list.size() < this.f46881I - this.f46877E) && !TextUtils.isEmpty(this.f46876D) && !this.f46876D.equals("-1"))) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z14) {
            i11 = AbstractC8020f0.str_tv_join_comment;
        } else {
            i11 = AbstractC8020f0.str_no_comments_yet;
        }
        int i15 = i11;
        if (z11) {
            i12 = 0;
        } else if (z12) {
            i12 = 3;
        } else if (!z13 && !z14) {
            i12 = 2;
        } else {
            i12 = 1;
        }
        List list3 = this.f46875C;
        if (list3 != null && !list3.isEmpty()) {
            i13 = 10;
        } else {
            i13 = 11;
        }
        if (!z15 && !z11) {
            i14 = 21;
        } else {
            i14 = 20;
        }
        return new C23909b(i12, i13, i14, i15, this.f46879G);
    }

    /* renamed from: qq */
    private String m46691qq() {
        String mo46593I = mo46593I();
        if (!TextUtils.isEmpty(this.f46898u)) {
            mo46593I = this.f46898u;
        }
        C3020p0 c3020p0 = this.f46900w;
        if (c3020p0 != null) {
            int i11 = c3020p0.f12058q;
            if (i11 == 2 || i11 == 17) {
                return mo46593I();
            }
            return mo46593I;
        }
        return mo46593I;
    }

    /* renamed from: rq */
    private C3020p0 m46692rq() {
        ItemAlbumMobile itemAlbumMobile;
        C3020p0 c3020p0;
        C3020p0 c3020p02 = this.f46900w;
        if (c3020p02 == null && (itemAlbumMobile = this.f46901x) != null && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
            return c3020p0;
        }
        return c3020p02;
    }

    /* renamed from: sq */
    private C32002l4 m46693sq() {
        if (this.f46893U) {
            return this.f46902y.m154284u(45);
        }
        return this.f46902y;
    }

    /* renamed from: tq */
    private void m46694tq() {
        try {
            this.f46890R.mo112347A0(this.f46897t, CoreUtility.f89233i, "1", "2", this.f46903z, 0L, new b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uq */
    private TrackingSource m46695uq() {
        int i11;
        C32002l4 m154275e = m46693sq().m154275e();
        if (this.f46894V == 1) {
            C31987k4 m154279o = m154275e.m154279o(10002);
            if (m154279o != null) {
                i11 = m154279o.m154205e();
            } else {
                i11 = 0;
            }
            m154275e.m154283t(10002, new C31987k4(10031, i11));
        }
        return C32017m4.m154326S().m154372r(m154275e);
    }

    /* renamed from: vq */
    private void m46696vq(String str, String str2) {
        try {
            AbstractC20789d.m108471e(str, this.f46875C);
            this.f46875C = C26744e.m137551e().m137555c(m46687nq(), this.f46875C);
            if (m46639Bq()) {
                if (m46640Cq()) {
                }
                m46667Tq(str);
                ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.this.m46649Jq();
                    }
                });
            }
            C28594q.m143005j().m143015o(str2, str);
            m46667Tq(str);
            ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.f
                @Override // java.lang.Runnable
                public final void run() {
                    C8723d.this.m46649Jq();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wq */
    public void m46697wq(String str) {
        try {
            Iterator it = this.f46875C.iterator();
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
            int i11 = this.f46881I;
            if (i11 > 0) {
                this.f46881I = i11 - 1;
            }
            m46669Vq(this.f46881I);
            ItemAlbumMobile itemAlbumMobile = this.f46901x;
            if (itemAlbumMobile != null) {
                itemAlbumMobile.f42561L = this.f46881I + "";
            }
            if (!m46639Bq() || m46640Cq()) {
                C28594q.m143005j().m143015o(mo46593I(), str);
            }
            m46667Tq(str);
            if (((InterfaceC8721b) m103742Dp()).mo45894h0()) {
                ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.this.m46651Kq();
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zq */
    private boolean m46698zq(C3020p0 c3020p0) {
        if (c3020p0 == null) {
            return false;
        }
        if (!c3020p0.m14525r() && !c3020p0.m14494Y()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: B */
    public void mo46588B(C10881t c10881t) {
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
            int i12 = !TextUtils.isEmpty(this.f46898u) ? 1 : 0;
            if (((InterfaceC8721b) m103742Dp()).mo45894h0() && i11 == i12) {
                int i13 = c10881t.f54979a;
                int i14 = c10881t.f54980b;
                String str = "";
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
                                C3020p0 c3020p0 = this.f46900w;
                                if (c3020p0 != null) {
                                    str = c3020p0.f12057p;
                                }
                                if (this.f46901x != null) {
                                    str = c10881t.f54982d.m56487r();
                                }
                                m46696vq(c10881t.f54981c, str);
                                return;
                            }
                            return;
                        }
                        C3020p0 c3020p02 = this.f46900w;
                        if (c3020p02 != null) {
                            String str2 = c3020p02.f12057p;
                        }
                        if (this.f46901x != null) {
                            c10881t.f54982d.m56487r();
                        }
                        AbstractC20789d.m108484r(c10881t.f54981c, c10881t.f54982d, this.f46875C);
                        this.f46875C = C26744e.m137551e().m137555c(m46687nq(), this.f46875C);
                        ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8723d.this.m46652Lq();
                            }
                        });
                        return;
                    }
                    if (AbstractC20789d.m108484r(c10881t.f54981c, c10881t.f54982d, this.f46875C)) {
                        this.f46881I++;
                    }
                    m46669Vq(this.f46881I);
                    this.f46875C = C26744e.m137551e().m137555c(m46687nq(), this.f46875C);
                    C28594q.m143005j().m143014n(m46691qq());
                    ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8723d.this.m46654Mq();
                        }
                    });
                    return;
                }
                if (i14 == 500) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_blockcomment));
                } else {
                    if (i14 != 1001 && i14 != 1002) {
                        if (i14 == 16001) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_invalid_comment_text));
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_failed));
                        }
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist));
                }
                C3020p0 c3020p03 = this.f46900w;
                if (c3020p03 != null) {
                    str = c3020p03.f12057p;
                }
                if (this.f46901x != null) {
                    str = c10881t.f54982d.m56487r();
                }
                this.f46875C = C26744e.m137551e().m137555c(m46687nq(), this.f46875C);
                C28023b6.m141250h0().m141394x(str);
                ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.this.m46656Nq();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: C */
    public void mo46589C(C20096c c20096c) {
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
                    if (!TextUtils.isEmpty(this.f46899v)) {
                        str = AbstractC20833z.m108910o(this.f46899v);
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

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: D2 */
    public void mo46590D2() {
        C28594q.m143005j().m143017q(mo46593I());
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: H */
    public void mo46591H(String str) {
        for (C10873l c10873l : this.f46875C) {
            if (c10873l.m56493u().equals(str)) {
                c10873l.m56494u0(true);
            }
        }
        ((InterfaceC8721b) m103742Dp()).mo46550q0();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: H3 */
    public void mo46592H3(boolean z11) {
        switch (this.f46874B) {
            case 24:
                if (z11) {
                    ((InterfaceC8721b) m103742Dp()).mo78955kl(new Runnable() { // from class: vq.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8723d.this.m46647Iq();
                        }
                    }, 100L);
                    return;
                }
                return;
            case 25:
                if (z11) {
                    ((InterfaceC8721b) m103742Dp()).mo46534S0();
                    return;
                }
                return;
            case 26:
                if (!z11) {
                    ((InterfaceC8721b) m103742Dp()).mo46547i4(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: I */
    public String mo46593I() {
        C3020p0 c3020p0;
        String str = this.f46897t;
        if (TextUtils.isEmpty(str) && (c3020p0 = this.f46900w) != null) {
            return c3020p0.f12057p;
        }
        return str;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: K2 */
    public void mo46594K2(C23912e c23912e, C19591a c19591a) {
        if (c23912e != null) {
            String str = c23912e.f115562a;
            if (!TextUtils.isEmpty(str) && m46700xq(c19591a) && str.equals(c19591a.m102558a().mo41081Q())) {
                MediaItem m102558a = c19591a.m102558a();
                m102558a.m41101G0(c23912e.f115563b);
                String str2 = c23912e.f115564c;
                if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
                    m102558a.m41124T0(str2);
                }
                this.f46892T = c19591a;
                ((InterfaceC8721b) m103742Dp()).mo46525I2(true, this.f46892T);
            }
            AbstractC23647d.m123897g("188012");
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: M3 */
    public int mo46595M3() {
        C3020p0 c3020p0 = this.f46900w;
        if (c3020p0 != null) {
            return c3020p0.f12058q;
        }
        return 0;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: N3 */
    public void mo46596N3() {
        this.f46892T = new C19591a();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: O3 */
    public void mo46597O3() {
        if (!m46639Bq() || m46640Cq()) {
            C28594q.m143005j().m143019s(mo46593I(), this.f46875C);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: R */
    public int mo46598R() {
        return this.f46886N;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: R1 */
    public void mo46599R1(C25630b c25630b, int i11) {
        boolean z11 = true;
        boolean z12 = false;
        if (!C20120e.f99217a.m104723b(1)) {
            if (i11 != -2) {
                z12 = true;
            }
            this.f46892T = m46682iq(c25630b, z12);
            ((InterfaceC8721b) m103742Dp()).mo46530N2(this.f46892T, true);
            return;
        }
        if (i11 == -2) {
            z11 = false;
        }
        m46684kq(m46682iq(c25630b, z11), "", "");
        m46668Uq();
        ((InterfaceC8721b) m103742Dp()).mo46555t1();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: S0 */
    public void mo46600S0() {
        if (m46700xq(this.f46892T)) {
            ((InterfaceC8721b) m103742Dp()).mo46525I2(true, this.f46892T);
        } else if (m46701yq(this.f46892T)) {
            ((InterfaceC8721b) m103742Dp()).mo46530N2(this.f46892T, false);
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Sq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C28587j0 c28587j0, InterfaceC19968g interfaceC19968g) {
        boolean z11;
        super.mo995Nd(c28587j0, interfaceC19968g);
        if (c28587j0 != null) {
            this.f46897t = c28587j0.f132591a;
            this.f46898u = c28587j0.f132592b;
            this.f46899v = c28587j0.f132593c;
            this.f46873A = c28587j0.f132596f;
            this.f46885M = this.f46890R.mo112413l0();
            this.f46886N = this.f46890R.mo112396R();
            this.f46902y = c28587j0.f132594d;
            if (m46639Bq()) {
                this.f46903z = C32017m4.m154326S().m154379y(this.f46902y);
            } else {
                this.f46903z = C32017m4.m154326S().m154376v(this.f46902y);
            }
            this.f46901x = c28587j0.f132595e;
            int i11 = c28587j0.f132597g;
            this.f46874B = i11;
            this.f46891S = c28587j0.f132598h;
            if (i11 == 24) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f46888P = z11;
            this.f46894V = c28587j0.f132600j;
            this.f46895W = c28587j0.f132601k;
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: T1 */
    public void mo46601T1(int i11, int i12, int i13) {
        int i14;
        C24906b c24906b = C24906b.f119505a;
        String m154369o = C32017m4.m154326S().m154369o(this.f46902y);
        C3020p0 c3020p0 = this.f46900w;
        if (c3020p0 != null) {
            i14 = c3020p0.f12058q;
        } else {
            i14 = 0;
        }
        c24906b.m129546E(m154369o, i11, i12, i14, i13);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: W */
    public void mo46602W(C25630b c25630b, int i11, int i12, int i13) {
        if (!this.f46885M) {
            return;
        }
        ((InterfaceC8721b) m103742Dp()).mo46522E0(C28644j.m143233Y().m143290W(c25630b.m132429g() + ""), i11);
        AbstractC23647d.m123897g("188021");
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: W2 */
    public String mo46603W2() {
        String str = this.f46899v;
        return str != null ? str : "";
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: Xn */
    public void mo46604Xn() {
        String m46691qq = m46691qq();
        String m143010i = C28594q.m143005j().m143010i(m46691qq);
        if (!TextUtils.isEmpty(m46691qq)) {
            ((InterfaceC8721b) m103742Dp()).mo46529MB(m143010i);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: Y */
    public void mo46605Y(int i11) {
        C10873l c10873l;
        boolean z11;
        boolean z12;
        C3020p0 c3020p0;
        try {
            List list = this.f46875C;
            if (list != null && !list.isEmpty() && i11 < this.f46875C.size() && (c10873l = (C10873l) this.f46875C.get(i11)) != null) {
                boolean z13 = !TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i);
                boolean z14 = !TextUtils.isEmpty(c10873l.m56495v());
                if (!TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i) && !TextUtils.equals(this.f46899v, CoreUtility.f89233i)) {
                    z11 = false;
                    if (TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i) && (c3020p0 = this.f46900w) != null && c3020p0.m14518m0()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ((InterfaceC8721b) m103742Dp()).mo46551q4(c10873l.m56495v(), i11, z13, z14, z11, z12);
                }
                z11 = true;
                if (TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                }
                z12 = false;
                ((InterfaceC8721b) m103742Dp()).mo46551q4(c10873l.m56495v(), i11, z13, z14, z11, z12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: Z3 */
    public void mo46606Z3(C2988i3 c2988i3) {
        int m14164c = c2988i3.m14164c();
        if (m14164c != 1) {
            if (m14164c == 2) {
                mo46623l3(c2988i3.m14163b(), 1);
                this.f46893U = true;
                return;
            }
            return;
        }
        String m14162a = c2988i3.m14162a();
        this.f46893U = true;
        if (!C20120e.f99217a.m104723b(0)) {
            InterfaceC8721b interfaceC8721b = (InterfaceC8721b) m103742Dp();
            if (TextUtils.isEmpty(m14162a)) {
                m14162a = "";
            }
            interfaceC8721b.mo46549k4(m14162a);
            return;
        }
        m46685lq(m14162a, "");
        m46668Uq();
        ((InterfaceC8721b) m103742Dp()).mo46555t1();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: ae */
    public void mo46607ae() {
        boolean z11;
        C26736a.m137532e().m137536b();
        this.f46875C = C28594q.m143005j().m143009h(m46691qq());
        List m137555c = C26744e.m137551e().m137555c(m46687nq(), this.f46875C);
        this.f46875C = m137555c;
        if (m137555c != null && m137555c.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46880H = z11;
        if (this.f46875C != null) {
            ((InterfaceC8721b) m103742Dp()).mo46536Us(this.f46875C, m46688o8(this.f46881I));
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: ai */
    public boolean mo46608ai() {
        return !TextUtils.isEmpty(this.f46882J);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: b */
    public void mo46609b(C25470c c25470c) {
        try {
            MediaItem mediaItem = (MediaItem) c25470c.m131941d("imageSelected");
            if (mediaItem != null) {
                this.f46892T = new C19591a(mediaItem);
                ((InterfaceC8721b) m103742Dp()).mo46525I2(true, this.f46892T);
            }
            C25630b c25630b = (C25630b) c25470c.m131943f("stickerSelected");
            if (c25630b != null) {
                this.f46892T = new C19591a(c25630b);
                this.f46891S = null;
                if (!C20120e.f99217a.m104723b(1)) {
                    ((InterfaceC8721b) m103742Dp()).mo46530N2(this.f46892T, false);
                }
            }
            this.f46882J = c25470c.m131944g("currentReplyCommentUid", "");
            this.f46883K = c25470c.m131944g("strReplyCommentId", "");
            this.f46884L = c25470c.m131944g("strReplyCommentDName", "");
            if (!TextUtils.isEmpty(this.f46882J) && !TextUtils.isEmpty(this.f46884L)) {
                ((InterfaceC8721b) m103742Dp()).mo46519B0(this.f46882J, this.f46900w, this.f46884L);
                ((InterfaceC8721b) m103742Dp()).mo46544d4();
            }
            String m131944g = c25470c.m131944g("currentCmt", "");
            if (!TextUtils.isEmpty(m131944g)) {
                ((InterfaceC8721b) m103742Dp()).mo46529MB(m131944g);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: c */
    public C25470c mo46610c() {
        C25470c c25470c = new C25470c();
        try {
            if (m46700xq(this.f46892T)) {
                c25470c.m131947j("imageSelected", this.f46892T.m102558a());
            }
            if (m46701yq(this.f46892T)) {
                c25470c.m131949l("stickerSelected", this.f46892T.m102559b());
            }
            if (!TextUtils.isEmpty(this.f46882J)) {
                c25470c.m131950m("currentReplyCommentUid", this.f46882J);
            }
            if (!TextUtils.isEmpty(this.f46883K)) {
                c25470c.m131950m("strReplyCommentId", this.f46883K);
            }
            if (!TextUtils.isEmpty(this.f46884L)) {
                c25470c.m131950m("strReplyCommentDName", this.f46884L);
            }
            String mo46548im = ((InterfaceC8721b) m103742Dp()).mo46548im();
            if (!TextUtils.isEmpty(mo46548im)) {
                c25470c.m131950m("currentCmt", mo46548im);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return c25470c;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: c0 */
    public void mo46611c0(String str, String str2) {
        if (!TextUtils.isEmpty(str) || mo46621i2()) {
            if (str == null) {
                str = "";
            }
            if (m46700xq(this.f46892T)) {
                m46683jq(str, this.f46892T.m102558a(), str2);
            } else if (m46701yq(this.f46892T)) {
                m46684kq(this.f46892T, str2, str);
            } else {
                m46685lq(str, str2);
            }
            ((InterfaceC8721b) m103742Dp()).mo46555t1();
            m46668Uq();
            m46664Rq(this.f46900w);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: e0 */
    public void mo46612e0(C10873l c10873l) {
        int i11;
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
            C2310k.a m12232d = C2310k.m12211b().m12240l(arrayList).m12232d(0);
            if (m46639Bq()) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            ((InterfaceC8721b) m103742Dp()).mo46533R(m12232d.m12231c(i11).m12246r(c10873l.m56497w()).m12230b(c10873l.m56441F0().toString()).m12234f(this.f46899v).m12245q(1).m12239k(12).m12238j(c10873l.f54891G.f54878j).m12229a());
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: ee */
    public void mo46613ee() {
        ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.p
            @Override // java.lang.Runnable
            public final void run() {
                C8723d.this.m46641Dq();
            }
        });
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: eh */
    public void mo46614eh() {
        C2988i3 c2988i3 = this.f46891S;
        if (c2988i3 != null) {
            int m14164c = c2988i3.m14164c();
            if (m14164c != 1) {
                if (m14164c == 2) {
                    final C25630b m14163b = this.f46891S.m14163b();
                    if (C20120e.f99217a.m104723b(1) && C23055e5.m118271f()) {
                        ((InterfaceC8721b) m103742Dp()).mo78955kl(new Runnable() { // from class: vq.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8723d.this.m46660Pq(m14163b);
                            }
                        }, 1000L);
                        return;
                    }
                    C19591a m46682iq = m46682iq(m14163b, true);
                    this.f46892T = m46682iq;
                    if (m46701yq(m46682iq)) {
                        ((InterfaceC8721b) m103742Dp()).mo46530N2(this.f46892T, true);
                        return;
                    }
                    return;
                }
                return;
            }
            final String m14162a = this.f46891S.m14162a();
            if (C20120e.f99217a.m104723b(0) && C23055e5.m118271f()) {
                ((InterfaceC8721b) m103742Dp()).mo78955kl(new Runnable() { // from class: vq.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8723d.this.m46658Oq(m14162a);
                    }
                }, 1000L);
                return;
            }
            InterfaceC8721b interfaceC8721b = (InterfaceC8721b) m103742Dp();
            if (TextUtils.isEmpty(m14162a)) {
                m14162a = "";
            }
            interfaceC8721b.mo46549k4(m14162a);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: f0 */
    public void mo46615f0(List list) {
        if (!list.isEmpty()) {
            this.f46892T = new C19591a((MediaItem) list.get(0));
            ((InterfaceC8721b) m103742Dp()).mo46553r2(this.f46892T);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: f2 */
    public void mo46616f2(int i11, int i12) {
        C10873l c10873l;
        try {
            List list = this.f46875C;
            if (list != null && !list.isEmpty() && i12 >= 0 && i12 < this.f46875C.size()) {
                c10873l = (C10873l) this.f46875C.get(i12);
            } else {
                c10873l = null;
            }
            if (c10873l != null) {
                if (i11 == AbstractC8020f0.str_tv_optionmenu_reply) {
                    mo46635y(c10873l, false);
                    return;
                }
                if (i11 == AbstractC8020f0.copy) {
                    ((InterfaceC8721b) m103742Dp()).mo46539b4(c10873l.m56495v().toString());
                    return;
                }
                if (i11 == AbstractC8020f0.delete_comment) {
                    AbstractC23647d.m123897g("18702");
                    if (c10873l.m56446L()) {
                        C26736a.m137532e().m137537c(c10873l.m56493u());
                        m46696vq(c10873l.m56493u(), c10873l.m56487r());
                        return;
                    } else {
                        if (TextUtils.equals(this.f46899v, CoreUtility.f89233i) || TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                            ((InterfaceC8721b) m103742Dp()).mo46829Y();
                            if (m46639Bq()) {
                                this.f46890R.mo112365f0(this.f46901x.f42595r, c10873l.m56493u(), new c(c10873l));
                                return;
                            } else {
                                this.f46890R.mo112361d0(c10873l.m56487r(), c10873l.m56497w(), c10873l.m56493u(), c10873l.m56499x(), new d(c10873l));
                                return;
                            }
                        }
                        return;
                    }
                }
                if (i11 == AbstractC8020f0.str_reportabuse) {
                    m46686mq(c10873l);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: g */
    public C32002l4 mo46617g() {
        return this.f46902y;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: g3 */
    public void mo46618g3() {
        C19591a c19591a = this.f46892T;
        if (c19591a != null && m46701yq(c19591a)) {
            ((InterfaceC8721b) m103742Dp()).mo46554s3(this.f46892T);
            return;
        }
        C2988i3 c2988i3 = this.f46891S;
        if (c2988i3 != null && c2988i3.m14165d()) {
            ((InterfaceC8721b) m103742Dp()).mo46524H3();
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: g8 */
    public void mo46619g8() {
        if (!m46639Bq()) {
            m46694tq();
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: i1 */
    public String mo46620i1() {
        if (TextUtils.isEmpty(this.f46882J)) {
            return this.f46899v;
        }
        return this.f46882J;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: i2 */
    public boolean mo46621i2() {
        if (!m46700xq(this.f46892T) && !m46701yq(this.f46892T)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: k0 */
    public void mo46622k0(C10873l c10873l) {
        if (c10873l != null && c10873l.m56446L()) {
            C10873l m137556d = C26744e.m137551e().m137556d(c10873l.m56493u());
            if (m137556d != null) {
                m137556d.f54914b0 = C32017m4.m154326S().m154372r(m46693sq());
            }
            C26736a.m137532e().m137541j(c10873l.m56493u());
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: l3 */
    public void mo46623l3(C25630b c25630b, int i11) {
        boolean z11 = true;
        boolean z12 = false;
        if (!C20120e.f99217a.m104723b(1)) {
            if (i11 == 1 || i11 == 9) {
                z12 = true;
            }
            this.f46892T = m46682iq(c25630b, z12);
            ((InterfaceC8721b) m103742Dp()).mo46530N2(this.f46892T, true);
            return;
        }
        if (i11 != 1 && i11 != 9) {
            z11 = false;
        }
        m46684kq(m46682iq(c25630b, z11), "", "");
        m46668Uq();
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: n */
    public void mo46624n() {
        if (this.f46891S != null) {
            this.f46891S = null;
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: n0 */
    public void mo46625n0(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m46697wq((String) it.next());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: qe */
    public ItemAlbumMobile mo46626qe() {
        if (this.f46901x != null) {
            return new ItemAlbumMobile(this.f46901x);
        }
        return null;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: qk */
    public void mo46627qk() {
        ((InterfaceC8721b) m103742Dp()).mo46531Nn(this.f46885M);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: rk */
    public void mo46628rk() {
        this.f46882J = "";
        this.f46883K = "";
        this.f46884L = "";
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: s3 */
    public void mo46629s3(C19591a c19591a) {
        if (m46700xq(c19591a) && AbstractC23041d2.m118194A(c19591a.m102558a().mo41081Q())) {
            ((InterfaceC8721b) m103742Dp()).mo46546g1(c19591a.m102558a());
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
        }
        AbstractC23647d.m123897g("188011");
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: w */
    public void mo46630w() {
        C3020p0 m46692rq = m46692rq();
        if (m46692rq != null) {
            C2976g1 m129551v = C24906b.f119505a.m129551v(m46692rq.f12057p);
            if (m129551v != null && m129551v.m14119g() && C20120e.f99217a.m104724c(2)) {
                if (((InterfaceC8721b) m103742Dp()).mo46517A1()) {
                    ((InterfaceC8721b) m103742Dp()).mo46527J1(m129551v);
                    return;
                }
                return;
            }
            ((InterfaceC8721b) m103742Dp()).mo46544d4();
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: w4 */
    public String mo46631w4() {
        return this.f46898u;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: w8 */
    public void mo46632w8() {
        boolean z11;
        C3025q0 c3025q0;
        C3000l0 mo112410j;
        if (!TextUtils.isEmpty(this.f46897t) && (mo112410j = this.f46890R.mo112410j(this.f46897t)) != null) {
            this.f46900w = AbstractC20826v0.m108752C0(mo112410j.m14322a0().m14474E0(), mo112410j.f11893p);
        }
        if (m46639Bq()) {
            if (this.f46901x == null) {
                C3020p0 c3020p0 = this.f46900w;
                if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null) {
                    ItemAlbumMobile m14565b = c3025q0.m14565b(this.f46898u);
                    this.f46901x = m14565b;
                    if (m14565b != null) {
                        m14565b.m40521j(this.f46900w);
                    }
                } else {
                    this.f46901x = C26878b.f127183a.m138452d(this.f46898u);
                }
            }
            ((InterfaceC8721b) m103742Dp()).mo46541cb(this.f46901x);
            ItemAlbumMobile itemAlbumMobile = this.f46901x;
            if (itemAlbumMobile != null && !itemAlbumMobile.f42554F.equals("1")) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f46887O = z11;
            return;
        }
        if (this.f46900w != null) {
            ((InterfaceC8721b) m103742Dp()).mo46521DE(this.f46900w);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: we */
    public void mo46633we(String str) {
        C28594q.m143005j().m143016p(m46691qq(), str);
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: x6 */
    public void mo46634x6(String str, boolean z11, boolean z12) {
        String str2 = "18500";
        if (z11) {
            try {
                AbstractC23647d.m123897g("18500");
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (str.equals(CoreUtility.f89233i)) {
            if (!z11) {
                str2 = "";
            }
            ((InterfaceC8721b) m103742Dp()).mo46526J(new C26365a.b(str, this.f46902y).m135739F(str2).m135743b());
            return;
        }
        if (z12 && ((InterfaceC8721b) m103742Dp()).mo46540c0(str)) {
            ((InterfaceC8721b) m103742Dp()).mo46550q0();
            return;
        }
        C21927m.m114302u().m114330e0(str, new TrackingSource(10));
        ((InterfaceC8721b) m103742Dp()).mo46526J(new C26365a.b(str, this.f46902y).m135743b());
    }

    /* renamed from: xq */
    public boolean m46700xq(C19591a c19591a) {
        if (c19591a != null && c19591a.m102560c() == 1 && c19591a.m102558a() != null) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: y */
    public void mo46635y(final C10873l c10873l, boolean z11) {
        try {
            if (c10873l.m56497w().equals(CoreUtility.f89233i)) {
                return;
            }
            if (z11) {
                AbstractC23647d.m123897g("18600");
            }
            ((InterfaceC8721b) m103742Dp()).mo78955kl(new Runnable() { // from class: vq.g
                @Override // java.lang.Runnable
                public final void run() {
                    C8723d.this.m46662Qq(c10873l);
                }
            }, 100L);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: y2 */
    public void mo46636y2(boolean z11) {
        boolean z12;
        if (!z11 && this.f46875C == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f46879G = z12;
        if (!z11) {
            this.f46876D = "0";
        } else if (this.f46875C.size() == 0) {
            this.f46876D = "0";
        } else {
            String str = this.f46876D;
            if (str != null && str.trim().length() > 0) {
                this.f46876D = ((C10873l) this.f46875C.get(0)).m56493u();
            }
        }
        ((InterfaceC8721b) m103742Dp()).mo70710wy(new Runnable() { // from class: vq.k
            @Override // java.lang.Runnable
            public final void run() {
                C8723d.this.m46642Eq();
            }
        });
        this.f46880H = false;
        this.f46879G = this.f46876D.equals("0");
        this.f46889Q.m123036e(this.f46897t, this.f46898u, this.f46876D, 50, C32017m4.m154326S().m154377w(this.f46902y), new C23415c.a() { // from class: vq.l
            @Override // mp.C23415c.a
            /* renamed from: a */
            public final void mo116833a(C23413a c23413a) {
                C8723d.this.m46645Hq(c23413a);
            }
        });
    }

    /* renamed from: yq */
    public boolean m46701yq(C19591a c19591a) {
        if (c19591a != null && c19591a.m102560c() == 2 && c19591a.m102559b() != null) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.feed.mvp.quickcomment.InterfaceC8720a
    /* renamed from: z6 */
    public void mo46637z6() {
        C3020p0 m46692rq;
        C2988i3 c2988i3 = this.f46891S;
        if ((c2988i3 == null || c2988i3.m14164c() == 0) && C20120e.f99217a.m104724c(2) && C23055e5.m118271f() && (m46692rq = m46692rq()) != null) {
            C24906b.f119505a.m129544A(m46692rq, this.f46902y);
        }
    }
}
