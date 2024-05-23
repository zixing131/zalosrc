package mo;

import ag0.C0815e1;
import android.text.TextUtils;
import android.view.View;
import ar.C2297a;
import ar.C2310k;
import ar.C2321v;
import ar.C2323x;
import bo.C2976g1;
import bo.C2988i3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3042u;
import bo.C3054x;
import bo.InterfaceC2946a1;
import c30.C3255n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8550b;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.C10872k;
import com.zing.zalo.social.controls.C10873l;
import com.zing.zalo.social.controls.C10881t;
import com.zing.zalo.social.controls.FeedLikeStatus;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import gs.C19591a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.AbstractC20789d;
import is.AbstractC20805l;
import is.AbstractC20833z;
import is.C20791e;
import is.C20815q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23216t1;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mo.C23407x;
import mp.C23413a;
import mp.C23415c;
import mp.C23416d;
import no.C23909b;
import no.C23910c;
import no.C23911d;
import no.C23912e;
import no.C23913f;
import no.C23914g;
import no.C23915h;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p217hs.C20120e;
import p302ko.C21785g;
import p304ks.C21927m;
import p329lo.AbstractC22575p0;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p398oo.C24346a;
import p398oo.C24355e0;
import p399op.C24390b;
import p425po.C24880b;
import p455qo.C25424n0;
import p458qr.C25470c;
import p471r3.C25630b;
import p510sq.C26365a;
import p583vq.C28570b;
import p583vq.C28594q;
import p588vw.C28644j;
import p691yr.AbstractC31052b;
import p691yr.C31060j;
import p691yr.EnumC31051a;
import p716zh.C31862c;
import p716zh.C31877d;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pr.C24906b;
import tn.C26736a;
import tn.C26744e;
import tn.C26746f;
import tn.C26748g;
import tr.C26878b;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: mo.x */
/* loaded from: classes4.dex */
public class C23407x extends AbstractC19962a implements InterfaceC23371a {

    /* renamed from: A */
    boolean f113674A;

    /* renamed from: B */
    private final C21785g f113675B;

    /* renamed from: C */
    private final C23415c f113676C;

    /* renamed from: D */
    TrackingSource f113677D;

    /* renamed from: E */
    private boolean f113678E;

    /* renamed from: F */
    private boolean f113679F;

    /* renamed from: G */
    private int f113680G;

    /* renamed from: H */
    private boolean f113681H;

    /* renamed from: I */
    int f113682I;

    /* renamed from: J */
    private long f113683J;

    /* renamed from: K */
    String f113684K;

    /* renamed from: L */
    int f113685L;

    /* renamed from: M */
    boolean f113686M;

    /* renamed from: N */
    int f113687N;

    /* renamed from: O */
    int f113688O;

    /* renamed from: P */
    boolean f113689P;

    /* renamed from: Q */
    String f113690Q;

    /* renamed from: R */
    int f113691R;

    /* renamed from: S */
    boolean f113692S;

    /* renamed from: T */
    boolean f113693T;

    /* renamed from: U */
    private String f113694U;

    /* renamed from: V */
    private String f113695V;

    /* renamed from: W */
    private String f113696W;

    /* renamed from: X */
    boolean f113697X;

    /* renamed from: Y */
    private C32002l4 f113698Y;

    /* renamed from: Z */
    private boolean f113699Z;

    /* renamed from: a0 */
    private boolean f113700a0;

    /* renamed from: b0 */
    private int f113701b0;

    /* renamed from: c0 */
    private boolean f113702c0;

    /* renamed from: d0 */
    private C19591a f113703d0;

    /* renamed from: e0 */
    protected InterfaceC2946a1 f113704e0;

    /* renamed from: f0 */
    boolean f113705f0;

    /* renamed from: g0 */
    C24880b f113706g0;

    /* renamed from: h0 */
    C26746f.b f113707h0;

    /* renamed from: i0 */
    C3000l0 f113708i0;

    /* renamed from: j0 */
    C3020p0 f113709j0;

    /* renamed from: k0 */
    Map f113710k0;

    /* renamed from: t */
    public String f113711t;

    /* renamed from: u */
    public String f113712u;

    /* renamed from: v */
    public String f113713v;

    /* renamed from: w */
    public ContactProfile f113714w;

    /* renamed from: x */
    ItemAlbumMobile f113715x;

    /* renamed from: y */
    List f113716y;

    /* renamed from: z */
    boolean f113717z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f113718a;

        /* renamed from: b */
        final /* synthetic */ boolean f113719b;

        a(boolean z11, boolean z12) {
            this.f113718a = z11;
            this.f113719b = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m122995e(boolean z11, boolean z12) {
            try {
                C23407x.this.m122937cr();
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo78314Ay(C23407x.this.f113714w.f42352K0);
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo80858lu(C23407x.this.f113714w);
                ((InterfaceC23373b) C23407x.this.m103742Dp()).invalidateOptionsMenu();
                C23407x.this.m122912Mq(z11, z12);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m122996f(C20096c c20096c) {
            try {
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo80842V7(C23407x.this.m122921Rq(false, c20096c));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.v
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.a.this.m122996f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C23407x.this.f113714w = new ContactProfile((JSONObject) obj);
                C23407x.this.f113675B.mo112423x0(C23407x.this.f113714w, false);
                C23407x c23407x = C23407x.this;
                final boolean z11 = this.f113718a;
                final boolean z12 = this.f113719b;
                c23407x.m122891Bq(new Runnable() { // from class: mo.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.a.this.m122995e(z11, z12);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f113721a;

        b(boolean z11) {
            this.f113721a = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m122998d(boolean z11) {
            try {
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo80842V7(C23407x.this.m122921Rq(false, null));
                C23407x.this.m122900Gr(z11);
                C23407x.this.mo112346y2(false);
                C23407x.this.m122992z6();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C23407x.this.m122927Vq(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C3020p0 c3020p0;
            try {
                boolean z11 = true;
                C24355e0.f117560a.m127364t(true);
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C23407x.this.f113715x = ItemAlbumMobile.m40493h0(jSONObject);
                C23407x c23407x = C23407x.this;
                c23407x.f113680G = Integer.parseInt(c23407x.f113715x.f42561L);
                C23407x c23407x2 = C23407x.this;
                c23407x2.f113681H = c23407x2.f113715x.f42554F.equals("1");
                C23407x c23407x3 = C23407x.this;
                ItemAlbumMobile itemAlbumMobile = c23407x3.f113715x;
                c23407x3.f113713v = itemAlbumMobile.f42599t;
                c23407x3.m122907Jr(itemAlbumMobile);
                if (!C23407x.this.f113679F) {
                    C23407x c23407x4 = C23407x.this;
                    c23407x4.m122893Cq(c23407x4.f113715x.f42595r);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("extra_info");
                if (optJSONObject != null) {
                    C23407x c23407x5 = C23407x.this;
                    if (optJSONObject.optInt("is_single_photo", 0) != 1) {
                        z11 = false;
                    }
                    c23407x5.f113702c0 = z11;
                }
                C23407x c23407x6 = C23407x.this;
                final boolean z12 = this.f113721a;
                c23407x6.m122891Bq(new Runnable() { // from class: mo.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.b.this.m122998d(z12);
                    }
                });
                C23407x c23407x7 = C23407x.this;
                ItemAlbumMobile itemAlbumMobile2 = c23407x7.f113715x;
                if (itemAlbumMobile2 != null && (c3020p0 = itemAlbumMobile2.f42594q0) != null) {
                    c23407x7.m122909Kq(c3020p0);
                    ((InterfaceC23373b) C23407x.this.m103742Dp()).mo78344e3(C23407x.this.f113715x.f42594q0);
                    ((InterfaceC23373b) C23407x.this.m103742Dp()).mo80859o1(C23407x.this.f113715x.f42590o0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$c */
    /* loaded from: classes4.dex */
    public class c implements C26746f.b {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m123000c(JSONObject jSONObject) {
            List<C10873l> list;
            try {
                if (((InterfaceC23373b) C23407x.this.m103742Dp()).mo45894h0() && jSONObject != null && (list = C23407x.this.f113716y) != null) {
                    for (C10873l c10873l : list) {
                        c10873l.m56502y0(jSONObject.optJSONObject(c10873l.m56493u()));
                    }
                    ((InterfaceC23373b) C23407x.this.m103742Dp()).mo78349kC(C23407x.this.f113716y);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // tn.C26746f.b
        /* renamed from: a */
        public void mo46704a(final JSONObject jSONObject) {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo70710wy(new Runnable() { // from class: mo.z
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.c.this.m123000c(jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C10873l f113724a;

        d(C10873l c10873l) {
            this.f113724a = c10873l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m123002d() {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delete_comment_fail));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.d.this.m123002d();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23407x.this.m122926Uq(this.f113724a.m56493u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f113726a;

        e(boolean z11) {
            this.f113726a = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m123005e(boolean z11) {
            C23407x c23407x = C23407x.this;
            c23407x.f113715x.f42568S = z11;
            ((InterfaceC23373b) c23407x.m103742Dp()).mo49315c4();
            InterfaceC23373b interfaceC23373b = (InterfaceC23373b) C23407x.this.m103742Dp();
            C23407x c23407x2 = C23407x.this;
            ItemAlbumMobile itemAlbumMobile = c23407x2.f113715x;
            ContactProfile contactProfile = c23407x2.f113714w;
            String str = c23407x2.f113711t;
            boolean m122888Aq = c23407x2.m122888Aq();
            boolean z12 = C23407x.this.f113699Z;
            boolean z13 = C23407x.this.f113700a0;
            C23407x c23407x3 = C23407x.this;
            interfaceC23373b.mo80827Fk(C23375c.m122870a(itemAlbumMobile, contactProfile, str, m122888Aq, z12, z13, c23407x3.m122945gr(c23407x3.f113715x.f42599t), C23407x.this.f113702c0));
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_subcribe_feed_success));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_unsubcribe_feed_success));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m123006f(C20096c c20096c) {
            try {
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
                if (c20096c != null) {
                    if (C23407x.this.m122943fr(c20096c)) {
                        C23407x.this.m122987Yq(c20096c.m104491c());
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
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.e.this.m123006f(c20096c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23407x c23407x = C23407x.this;
            final boolean z11 = this.f113726a;
            c23407x.m122891Bq(new Runnable() { // from class: mo.b0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.e.this.m123005e(z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m123009e() {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(C20815q.m108698l(C23407x.this.f113715x)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m123010f() {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.f.this.m123010f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.f.this.m123009e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$g */
    /* loaded from: classes4.dex */
    public class g implements InterfaceC20094a {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m123013e() {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_report_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m123014f() {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.g.this.m123014f();
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23407x.this.m122891Bq(new Runnable() { // from class: mo.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.g.this.m123013e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mo.x$h */
    /* loaded from: classes4.dex */
    public class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f113730a;

        /* renamed from: b */
        final /* synthetic */ boolean f113731b;

        h(ContactProfile contactProfile, boolean z11) {
            this.f113730a = contactProfile;
            this.f113731b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m123018f() {
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_delfriend_success));
            ((InterfaceC23373b) C23407x.this.m103742Dp()).mo80857l5();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (((InterfaceC23373b) C23407x.this.m103742Dp()).mo45894h0()) {
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
                ToastUtils.m89259g(c20096c.m104491c());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final int parseInt;
            try {
                ((InterfaceC23373b) C23407x.this.m103742Dp()).mo49315c4();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && (parseInt = Integer.parseInt(new JSONObject(jSONObject.getString("data")).getString("code"))) != 0) {
                    C23407x.this.m122891Bq(new Runnable() { // from class: mo.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ToastUtils.m89259g(parseInt);
                        }
                    });
                } else {
                    AbstractC23047d8.m118259k(this.f113730a, this.f113731b, new SensitiveData("phonebook_delete_in_post_detail", "phonebook_delete"));
                    C23407x.this.m122891Bq(new Runnable() { // from class: mo.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23407x.h.this.m123018f();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C23407x(InterfaceC23373b interfaceC23373b, C21785g c21785g) {
        super(interfaceC23373b);
        this.f113684K = "";
        this.f113685L = 0;
        this.f113686M = false;
        this.f113689P = false;
        this.f113691R = -1;
        this.f113692S = true;
        this.f113693T = false;
        this.f113695V = "";
        this.f113696W = "";
        this.f113697X = true;
        this.f113702c0 = true;
        this.f113704e0 = null;
        this.f113705f0 = false;
        this.f113706g0 = null;
        this.f113707h0 = new c();
        this.f113710k0 = new HashMap();
        this.f113676C = C23415c.m123032b();
        this.f113675B = c21785g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Aq */
    public boolean m122888Aq() {
        try {
            if (TextUtils.equals(this.f113711t, CoreUtility.f89233i) || !m122990br(this.f113715x)) {
                return false;
            }
            if (!this.f113715x.f42593q.equals(CoreUtility.f89233i)) {
                if (!this.f113715x.m40502K().m14389b(CoreUtility.f89233i)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: Ar */
    private void m122889Ar() {
        try {
            this.f113716y = C26744e.m137551e().m137555c(this.f113712u, this.f113716y);
            ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B0 */
    private void m122890B0(ContactProfile contactProfile, boolean z11) {
        ((InterfaceC23373b) m103742Dp()).mo46829Y();
        this.f113675B.mo112349B0(contactProfile.f42434r, 32, new h(contactProfile, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bq */
    public void m122891Bq(Runnable runnable) {
        try {
            if (((InterfaceC23373b) m103742Dp()).mo45894h0()) {
                ((InterfaceC23373b) m103742Dp()).mo70710wy(runnable);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Br */
    private void m122892Br() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(this.f113698Y.m154284u(74)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cq */
    public void m122893Cq(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FeedActionZUtils.m47549g(str);
        AbstractC20833z.m108894I();
    }

    /* renamed from: Cr */
    private void m122894Cr() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(this.f113698Y.m154284u(73)), false);
    }

    /* renamed from: Dq */
    private void m122895Dq(C25630b c25630b, boolean z11, String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(this.f113713v)) {
            str3 = this.f113713v;
        } else {
            str3 = "-1";
        }
        C10873l m123037f = C23415c.m123032b().m123037f(C23416d.m123038a().m123073w(1).m123064n(m122939dr(this.f113715x)).m123065o(str3).m123068r(this.f113712u).m123071u(this.f113711t).m123072v(C32017m4.m154326S().m154372r(m122918Pq())).m123066p(str2).m123070t(c25630b).m123069s(str, this.f113694U, this.f113695V).m123063m(), 1, m122914Nq());
        if (z11) {
            C3255n.m16562n().m16578v(c25630b);
        }
        if (this.f113716y == null) {
            this.f113716y = new ArrayList();
        }
        if (m123037f != null) {
            this.f113716y.add(m123037f);
        }
        if (((InterfaceC23373b) m103742Dp()).mo45894h0()) {
            this.f113694U = "";
            this.f113695V = "";
            this.f113696W = "";
            ((InterfaceC23373b) m103742Dp()).mo78338U3(this.f113716y);
        }
    }

    /* renamed from: Eq */
    private C19591a m122896Eq(C25630b c25630b, boolean z11) {
        C19591a c19591a = new C19591a(c25630b);
        c19591a.m102562e(z11);
        return c19591a;
    }

    /* renamed from: Fq */
    private void m122897Fq() {
        if (!TextUtils.isEmpty(this.f113713v) && !this.f113713v.equals("1")) {
            new C8550b().m101508a(new C8550b.a(this.f113713v, false));
        }
    }

    /* renamed from: Fr */
    private void m122898Fr(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                AbstractC23647d.m123897g("18800");
                ((InterfaceC23373b) m103742Dp()).mo80844Z3(C2297a.m12139b().m12147d(false).m12145b(contactProfile).m12148e("7802").m12144a());
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: Gq */
    private void m122899Gq(String str, MediaItem mediaItem, String str2) {
        String str3;
        if (this.f113715x != null && this.f113697X) {
            if (!TextUtils.isEmpty(this.f113713v)) {
                str3 = this.f113713v;
            } else {
                str3 = "-1";
            }
            C10873l m123037f = C23415c.m123032b().m123037f(C23416d.m123038a().m123073w(2).m123064n(m122939dr(this.f113715x)).m123065o(str3).m123068r(this.f113712u).m123071u(this.f113711t).m123072v(C32017m4.m154326S().m154372r(m122918Pq())).m123066p(str).m123067q(mediaItem).m123069s(str2, this.f113694U, this.f113695V).m123063m(), 1, m122914Nq());
            if (this.f113716y == null) {
                this.f113716y = new ArrayList();
            }
            if (m123037f != null) {
                this.f113716y.add(m123037f);
                ((InterfaceC23373b) m103742Dp()).mo78320I2(false, this.f113703d0);
            }
            if (((InterfaceC23373b) m103742Dp()).mo45894h0()) {
                this.f113694U = "";
                this.f113695V = "";
                this.f113696W = "";
                ((InterfaceC23373b) m103742Dp()).mo78338U3(this.f113716y);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Gr */
    public void m122900Gr(boolean z11) {
        if (this.f113715x != null) {
            C23910c m122986Qq = m122986Qq(false);
            m122986Qq.f115557t = z11;
            ((InterfaceC23373b) m103742Dp()).mo80841Ue(m122986Qq);
            ((InterfaceC23373b) m103742Dp()).mo80861se(this.f113715x, this.f113697X);
            ((InterfaceC23373b) m103742Dp()).mo80830Hp(m122959o8(this.f113680G));
            ((InterfaceC23373b) m103742Dp()).invalidateOptionsMenu();
        }
    }

    /* renamed from: Hq */
    private void m122901Hq(C19591a c19591a, String str, String str2) {
        try {
            if (!this.f113697X) {
                return;
            }
            m122895Dq(C28644j.m143233Y().m143282P0(c19591a.m102559b()), c19591a.m102561d(), str, str2);
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Iq */
    private void m122903Iq(String str, String str2) {
        String str3;
        if (this.f113715x == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.f113713v)) {
            str3 = this.f113713v;
        } else {
            str3 = "-1";
        }
        C10873l m123037f = C23415c.m123032b().m123037f(C23416d.m123038a().m123073w(0).m123064n(m122939dr(this.f113715x)).m123065o(str3).m123068r(this.f113712u).m123071u(this.f113711t).m123072v(C32017m4.m154326S().m154372r(m122918Pq())).m123066p(str).m123069s(str2, this.f113694U, this.f113695V).m123063m(), 1, m122914Nq());
        if (this.f113716y == null) {
            this.f113716y = new ArrayList();
        }
        if (m123037f != null) {
            this.f113716y.add(m123037f);
        }
        if (((InterfaceC23373b) m103742Dp()).mo45894h0()) {
            this.f113694U = "";
            this.f113695V = "";
            this.f113696W = "";
            ((InterfaceC23373b) m103742Dp()).mo78338U3(this.f113716y);
        }
    }

    /* renamed from: Ir */
    private void m122904Ir(String str) {
        C28594q.m143005j().m143013m(this.f113712u, str);
    }

    /* renamed from: Jq */
    private void m122906Jq(boolean z11, boolean z12) {
        int i11;
        if (TextUtils.isEmpty(this.f113711t)) {
            return;
        }
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f113711t);
        if (m141809c != null) {
            i11 = m141809c.f42385V0;
        } else {
            i11 = 0;
        }
        a aVar = new a(z11, z12);
        ((InterfaceC23373b) m103742Dp()).mo80842V7(m122921Rq(z11, null));
        this.f113675B.mo112350C(this.f113711t, i11, new TrackingSource((short) 1031), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jr */
    public void m122907Jr(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null) {
            AbstractC20805l.m108554l(this.f113710k0, itemAlbumMobile);
            new C25424n0().m101508a(itemAlbumMobile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Kq */
    public void m122909Kq(final C3020p0 c3020p0) {
        C3025q0 c3025q0;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && c3025q0.f12108Q != null && C20791e.f102159a.m108488d()) {
            this.f113704e0 = C24390b.f117764a.m127571b(c3020p0.f12057p, c3020p0.f12023C.f12108Q, c3020p0.m14493X());
            m122891Bq(new Runnable() { // from class: mo.n
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122955lr(c3020p0);
                }
            });
        } else {
            ((InterfaceC23373b) m103742Dp()).mo78331OB();
        }
    }

    /* renamed from: Lq */
    private void m122910Lq(C10873l c10873l) {
        ContactProfile contactProfile;
        try {
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42599t) && (contactProfile = this.f113714w) != null && contactProfile.m40387S0()) {
                String m56497w = c10873l.m56497w();
                String str = this.f113715x.f42599t;
                String m56493u = c10873l.m56493u();
                if (m56497w != null && str != null && m56493u != null) {
                    ((InterfaceC23373b) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                    this.f113675B.mo112375q0(m56497w, "8", str, m56493u, 0, "", new g());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mq */
    public void m122912Mq(boolean z11, boolean z12) {
        try {
            if (!TextUtils.isEmpty(this.f113711t) && !TextUtils.isEmpty(this.f113712u)) {
                C23911d m122921Rq = m122921Rq(z11, null);
                ((InterfaceC23373b) m103742Dp()).mo80842V7(m122921Rq);
                if (z11 && m122921Rq.f115559b == 0) {
                    ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(true));
                }
                this.f113675B.mo112377s(this.f113712u, this.f113682I, this.f113713v, false, this.f113677D, this.f113683J, new b(z12));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Nq */
    private String m122914Nq() {
        return AbstractC23136l9.m118743r0(C20815q.m108692f(this.f113715x));
    }

    /* renamed from: Oq */
    private C23909b m122916Oq(boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        List list;
        List list2;
        if (this.f113680G == 0 && !AbstractC20789d.m108475i(this.f113716y)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f113680G > 0 && (list2 = this.f113716y) != null && list2.isEmpty()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f113680G != 0 && (((list = this.f113716y) == null || list.size() < this.f113680G - this.f113688O) && !TextUtils.isEmpty(this.f113684K) && !this.f113684K.equals("-1"))) {
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
        List list3 = this.f113716y;
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
        return new C23909b(i12, i13, i14, i15, this.f113692S);
    }

    /* renamed from: Pq */
    private C32002l4 m122918Pq() {
        if (this.f113705f0) {
            return this.f113698Y.m154284u(45);
        }
        return this.f113698Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Rq */
    public C23911d m122921Rq(boolean z11, C20096c c20096c) {
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
            i11 = AbstractC8020f0.str_cant_load_description;
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
        if (this.f113715x == null && ((list = this.f113716y) == null || list.isEmpty())) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (this.f113715x == null) {
            i14 = 1;
        }
        return new C23911d(i12, i13, i14, m118743r0);
    }

    /* renamed from: Sq */
    private void m122923Sq() {
        if (this.f113714w == null) {
            m122906Jq(true, false);
        } else {
            m122912Mq(true, false);
        }
    }

    /* renamed from: Tq */
    private void m122925Tq(String str, String str2) {
        int i11;
        try {
            AbstractC20789d.m108471e(str, this.f113716y);
            this.f113716y = C26744e.m137551e().m137555c(str2, this.f113716y);
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null && ((i11 = itemAlbumMobile.f42590o0) == 2 || i11 == 17)) {
                C28594q.m143005j().m143015o(str2, str);
            }
            m122904Ir(str);
            ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.j
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122961or();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Uq */
    public void m122926Uq(String str) {
        int i11;
        try {
            Iterator it = this.f113716y.iterator();
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
            int i12 = this.f113680G;
            if (i12 > 0) {
                this.f113680G = i12 - 1;
            }
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null) {
                itemAlbumMobile.f42561L = this.f113680G + "";
            }
            ItemAlbumMobile itemAlbumMobile2 = this.f113715x;
            if (itemAlbumMobile2 != null && ((i11 = itemAlbumMobile2.f42590o0) == 2 || i11 == 17)) {
                C28594q.m143005j().m143015o(mo112324I(), str);
            }
            m122904Ir(str);
            m122891Bq(new Runnable() { // from class: mo.o
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122963pr();
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Vq */
    public void m122927Vq(C20096c c20096c) {
        if (c20096c != null) {
            int m104491c = c20096c.m104491c();
            String m104490b = c20096c.m104490b();
            if (!TextUtils.isEmpty(m104490b) && !Objects.equals(m104490b, "null")) {
                C24880b c24880b = new C24880b(m104491c, m104490b);
                this.f113706g0 = c24880b;
                if (c24880b.m129380b() != null) {
                    m122929Wq(this.f113706g0);
                    return;
                } else {
                    m122931Xq(c20096c);
                    return;
                }
            }
            m122931Xq(c20096c);
        }
    }

    /* renamed from: Wq */
    private void m122929Wq(C24880b c24880b) {
        if (c24880b != null && c24880b.m129380b() != null) {
            int m129379a = c24880b.m129379a();
            m122897Fq();
            if (m129379a == 18028) {
                C24355e0.f117560a.m127364t(false);
                AbstractC23392k0.m122875e(this);
                C23744a.m124114c().m124116d(6097, 10007);
            }
            final C3054x m116820k = AbstractC22575p0.m116820k(c24880b);
            ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.h
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122965qr(m116820k);
                }
            });
        }
    }

    /* renamed from: Xq */
    private void m122931Xq(final C20096c c20096c) {
        m122891Bq(new Runnable() { // from class: mo.f
            @Override // java.lang.Runnable
            public final void run() {
                C23407x.this.m122967rr(c20096c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cr */
    public void m122937cr() {
        ContactProfile contactProfile = this.f113714w;
        if (contactProfile != null) {
            if (contactProfile.m40387S0()) {
                AbstractC23059e9.m118318G(20);
            } else {
                AbstractC23059e9.m118318G(10);
            }
        }
    }

    /* renamed from: dr */
    private boolean m122939dr(ItemAlbumMobile itemAlbumMobile) {
        if (!this.f113681H && (itemAlbumMobile == null || !itemAlbumMobile.f42593q.equals(CoreUtility.f89233i))) {
            return false;
        }
        return true;
    }

    /* renamed from: er */
    private boolean m122941er() {
        ContactProfile contactProfile;
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if ((itemAlbumMobile != null && CoreUtility.f89233i.equals(itemAlbumMobile.f42593q)) || (((contactProfile = this.f113714w) != null && contactProfile.m40387S0()) || (this.f113715x != null && C21927m.m114302u().m114318P(this.f113715x.f42593q)))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fr */
    public boolean m122943fr(C20096c c20096c) {
        if (c20096c == null) {
            return false;
        }
        int m104491c = c20096c.m104491c();
        if (m104491c != 500 && m104491c != 1005 && m104491c != 1001 && m104491c != 1002) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gr */
    public boolean m122945gr(String str) {
        if (str != null && str.length() > 0 && !str.equals("0") && !str.equals("1")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hr */
    public /* synthetic */ void m122947hr() {
        ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x001e, B:6:0x0027, B:9:0x0035, B:11:0x0039, B:13:0x0043, B:15:0x004d, B:16:0x0094, B:18:0x0098, B:20:0x009c, B:22:0x00aa, B:23:0x00b6, B:25:0x00ba, B:27:0x00be, B:28:0x00c7, B:30:0x00cd, B:33:0x00d7, B:34:0x00db, B:36:0x00e3, B:37:0x00e5, B:38:0x00ee, B:40:0x00f4, B:42:0x0102, B:48:0x0055, B:49:0x0076), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6 A[Catch: Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x001e, B:6:0x0027, B:9:0x0035, B:11:0x0039, B:13:0x0043, B:15:0x004d, B:16:0x0094, B:18:0x0098, B:20:0x009c, B:22:0x00aa, B:23:0x00b6, B:25:0x00ba, B:27:0x00be, B:28:0x00c7, B:30:0x00cd, B:33:0x00d7, B:34:0x00db, B:36:0x00e3, B:37:0x00e5, B:38:0x00ee, B:40:0x00f4, B:42:0x0102, B:48:0x0055, B:49:0x0076), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:2:0x0000, B:4:0x001e, B:6:0x0027, B:9:0x0035, B:11:0x0039, B:13:0x0043, B:15:0x004d, B:16:0x0094, B:18:0x0098, B:20:0x009c, B:22:0x00aa, B:23:0x00b6, B:25:0x00ba, B:27:0x00be, B:28:0x00c7, B:30:0x00cd, B:33:0x00d7, B:34:0x00db, B:36:0x00e3, B:37:0x00e5, B:38:0x00ee, B:40:0x00f4, B:42:0x0102, B:48:0x0055, B:49:0x0076), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: ir */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m122949ir(boolean z11, List list) {
        String str;
        try {
            ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
            ((InterfaceC23373b) m103742Dp()).mo79605Ax(this.f113711t);
            if (this.f113687N <= 2 && this.f113716y.size() < 5 && this.f113716y.size() < this.f113680G - this.f113688O) {
                String str2 = this.f113684K;
                if (str2 != null && str2.trim().length() > 0 && !this.f113684K.equals("-1")) {
                    mo112346y2(true);
                } else {
                    this.f113686M = false;
                    ((InterfaceC23373b) m103742Dp()).mo78351lj(this.f113716y, this.f113691R, this.f113674A);
                    ((InterfaceC23373b) m103742Dp()).mo80830Hp(m122959o8(this.f113680G));
                }
                if (this.f113679F && this.f113689P) {
                    this.f113689P = false;
                    if (!((InterfaceC23373b) m103742Dp()).mo80837R0()) {
                        ((InterfaceC23373b) m103742Dp()).mo78350lb(300L);
                    } else if (this.f113717z && this.f113693T) {
                        ((InterfaceC23373b) m103742Dp()).mo78346hd();
                    }
                }
                this.f113693T = false;
                this.f113679F = false;
                if (z11) {
                    String str3 = "0";
                    if (TextUtils.isEmpty(this.f113713v)) {
                        str = "0";
                    } else {
                        str = this.f113713v;
                    }
                    if (!TextUtils.isEmpty(this.f113712u)) {
                        str3 = this.f113712u;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C10873l) it.next()).m56493u());
                    }
                    C26746f.m137567g(new C26748g(arrayList, str, str3), this.f113707h0);
                    return;
                }
                return;
            }
            ((InterfaceC23373b) m103742Dp()).mo78351lj(this.f113716y, this.f113691R, this.f113674A);
            ((InterfaceC23373b) m103742Dp()).mo80830Hp(m122959o8(this.f113680G));
            if (this.f113679F) {
                this.f113689P = false;
                if (!((InterfaceC23373b) m103742Dp()).mo80837R0()) {
                }
            }
            this.f113693T = false;
            this.f113679F = false;
            if (z11) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jr */
    public /* synthetic */ void m122951jr() {
        ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
        ((InterfaceC23373b) m103742Dp()).mo79605Ax(this.f113711t);
        ((InterfaceC23373b) m103742Dp()).mo80830Hp(m122959o8(this.f113680G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kr */
    public /* synthetic */ void m122953kr(C23413a c23413a) {
        if (c23413a != null && ((InterfaceC23373b) m103742Dp()).mo45894h0()) {
            ((InterfaceC23373b) m103742Dp()).mo78960q3();
            int i11 = c23413a.f113766a;
            if (i11 == 0) {
                this.f113685L = 0;
                this.f113687N++;
                try {
                    final boolean z11 = c23413a.f113769d;
                    final List list = c23413a.f113767b;
                    if (this.f113692S) {
                        List list2 = this.f113716y;
                        if (list2 == null) {
                            this.f113716y = new ArrayList();
                        } else {
                            list2.clear();
                        }
                    }
                    AbstractC20789d.m108470d(list, this.f113716y);
                    List m137555c = C26744e.m137551e().m137555c(this.f113712u, this.f113716y);
                    this.f113716y = m137555c;
                    AbstractC20789d.m108479m(m137555c);
                    this.f113684K = c23413a.f113768c;
                    this.f113688O += c23413a.f113770e;
                    this.f113680G = c23413a.f113771f;
                    int size = this.f113716y.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int m108473g = AbstractC20789d.m108473g(list, (C10873l) this.f113716y.get(size));
                        if (m108473g == -1) {
                            size--;
                        } else if (m108473g < list.size() - 1) {
                            this.f113693T = true;
                        }
                    }
                    this.f113691R = -1;
                    if (!TextUtils.isEmpty(this.f113690Q)) {
                        for (int i12 = 0; i12 < this.f113716y.size(); i12++) {
                            C10873l c10873l = (C10873l) this.f113716y.get(i12);
                            if (c10873l != null && c10873l.m56493u().equals(this.f113690Q)) {
                                c10873l.m56496v0(true);
                                this.f113691R = i12 + 1;
                                this.f113690Q = "";
                            }
                        }
                    }
                    ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23407x.this.m122949ir(z11, list);
                        }
                    });
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (i11 == 1) {
                int i13 = this.f113685L;
                if (i13 < 1) {
                    this.f113685L = i13 + 1;
                    mo112346y2(false);
                } else {
                    this.f113686M = false;
                    this.f113685L = 0;
                    ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23407x.this.m122951jr();
                        }
                    });
                }
                this.f113679F = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lr */
    public /* synthetic */ void m122955lr(C3020p0 c3020p0) {
        ((InterfaceC23373b) m103742Dp()).mo78328Mg(c3020p0.f12057p, c3020p0.f12023C.f12108Q, c3020p0.f12027G);
        ((InterfaceC23373b) m103742Dp()).mo80841Ue(m122986Qq(false));
        if (!c3020p0.f12027G) {
            ((InterfaceC23373b) m103742Dp()).mo78353ms(mo112324I());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nr */
    public /* synthetic */ void m122958nr(C10873l c10873l) {
        try {
            if (c10873l.m56497w().equals(CoreUtility.f89233i)) {
                return;
            }
            mo122866y(c10873l, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o8 */
    private String m122959o8(int i11) {
        List list;
        int i12;
        if (i11 > 0) {
            try {
                if (!m122941er() && ((list = this.f113716y) == null || list.size() != i11)) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: or */
    public /* synthetic */ void m122961or() {
        ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
        ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pr */
    public /* synthetic */ void m122963pr() {
        try {
            ((InterfaceC23373b) m103742Dp()).mo49315c4();
            ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
            ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
            ((InterfaceC23373b) m103742Dp()).mo80830Hp(m122959o8(this.f113680G));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qr */
    public /* synthetic */ void m122965qr(C3054x c3054x) {
        ((InterfaceC23373b) m103742Dp()).mo80862w0(c3054x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rr */
    public /* synthetic */ void m122967rr(C20096c c20096c) {
        try {
            m122889Ar();
            ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
            if (m122943fr(c20096c)) {
                m122987Yq(c20096c.m104491c());
            } else {
                ((InterfaceC23373b) m103742Dp()).mo80842V7(m122921Rq(false, c20096c));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sr */
    public /* synthetic */ void m122969sr() {
        this.f113679F = true;
        this.f113717z = true;
        this.f113674A = false;
        m122980yq();
        m122923Sq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tr */
    public /* synthetic */ void m122971tr() {
        try {
            ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
            ((InterfaceC23373b) m103742Dp()).mo80830Hp(m122959o8(this.f113680G));
            ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
            ((InterfaceC23373b) m103742Dp()).mo80840TB();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ur */
    public /* synthetic */ void m122973ur() {
        try {
            ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
            ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vr */
    public /* synthetic */ void m122975vr() {
        try {
            ((InterfaceC23373b) m103742Dp()).mo78333Ob(m122916Oq(false));
            ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wr */
    public /* synthetic */ void m122977wr(C2976g1 c2976g1) {
        ((InterfaceC23373b) m103742Dp()).mo78322J1(c2976g1);
        ((InterfaceC23373b) m103742Dp()).mo78345h8(this.f113691R, this.f113674A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xr */
    public /* synthetic */ void m122979xr(C3054x c3054x) {
        ((InterfaceC23373b) m103742Dp()).mo80862w0(c3054x);
    }

    /* renamed from: yq */
    private void m122980yq() {
        TrackingSource trackingSource = this.f113677D;
        if (trackingSource != null) {
            trackingSource.m40677a("isRefresh", 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yr */
    public /* synthetic */ void m122981yr(InterfaceC2946a1 interfaceC2946a1) {
        ((InterfaceC23373b) m103742Dp()).mo78365wt(interfaceC2946a1);
    }

    /* renamed from: zq */
    private boolean m122982zq() {
        return AbstractC20833z.m108917v(this.f113677D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zr */
    public /* synthetic */ void m122983zr() {
        ((InterfaceC23373b) m103742Dp()).mo80834Nh(this.f113694U, this.f113714w, this.f113696W);
        ((InterfaceC23373b) m103742Dp()).mo78343d4();
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: B */
    public void mo122818B(C10881t c10881t) {
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
            if (((InterfaceC23373b) m103742Dp()).mo45894h0() && i11 == 1) {
                int i12 = c10881t.f54979a;
                int i13 = c10881t.f54980b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
                                m122925Tq(c10881t.f54981c, this.f113712u);
                                return;
                            }
                            return;
                        }
                        AbstractC20789d.m108484r(c10881t.f54981c, c10881t.f54982d, this.f113716y);
                        this.f113716y = C26744e.m137551e().m137555c(this.f113712u, this.f113716y);
                        ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23407x.this.m122975vr();
                            }
                        });
                        return;
                    }
                    if (AbstractC20789d.m108484r(c10881t.f54981c, c10881t.f54982d, this.f113716y)) {
                        this.f113680G++;
                    }
                    this.f113715x.f42561L = this.f113680G + "";
                    this.f113716y = C26744e.m137551e().m137555c(this.f113712u, this.f113716y);
                    ItemAlbumMobile itemAlbumMobile = this.f113715x;
                    if (!itemAlbumMobile.f42568S) {
                        itemAlbumMobile.f42568S = true;
                    }
                    ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23407x.this.m122971tr();
                        }
                    });
                    return;
                }
                if (i13 != 1001 && i13 != 1002) {
                    if (i13 == 16001) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_invalid_comment_text));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_comment_failed));
                    }
                    this.f113716y = C26744e.m137551e().m137555c(this.f113712u, this.f113716y);
                    C28023b6.m141250h0().m141394x(this.f113713v);
                    ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23407x.this.m122973ur();
                        }
                    });
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_feednoexist));
                this.f113716y = C26744e.m137551e().m137555c(this.f113712u, this.f113716y);
                C28023b6.m141250h0().m141394x(this.f113713v);
                ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.this.m122973ur();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: B1 */
    public void mo122819B1() {
        ((InterfaceC23373b) m103742Dp()).mo79627aF(this.f113697X);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: C */
    public void mo122820C(C20096c c20096c) {
        if (c20096c != null) {
            try {
                int m104491c = c20096c.m104491c();
                if (m104491c != 18001) {
                    if (m104491c != 18003) {
                        ToastUtils.showMess(c20096c.m104492d());
                    } else {
                        ToastUtils.showMess(C20815q.m108691e(this.f113715x, this.f113711t));
                    }
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_comment_deleted));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: D2 */
    public void mo112323D2() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null) {
            int i11 = itemAlbumMobile.f42590o0;
            if (i11 == 2 || i11 == 17) {
                C28594q.m143005j().m143017q(mo112324I());
            }
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Dk */
    public TrackingSource mo122821Dk() {
        return this.f113677D;
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Dr, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C23394l0 c23394l0, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c23394l0, interfaceC19968g);
        if (c23394l0 != null) {
            String str = c23394l0.f113643a;
            this.f113711t = str;
            if (!TextUtils.isEmpty(str)) {
                if (this.f113711t.equals(CoreUtility.f89233i)) {
                    this.f113714w = AbstractC23304d.f113368c0;
                } else {
                    this.f113714w = C28203u6.f131407a.m141809c(this.f113711t);
                }
            }
            m122937cr();
            this.f113712u = c23394l0.f113644b;
            this.f113713v = c23394l0.f113645c;
            this.f113682I = c23394l0.f113646d;
            this.f113683J = c23394l0.f113647e;
            this.f113686M = c23394l0.f113648f;
            this.f113690Q = c23394l0.f113649g;
            this.f113687N = 0;
            this.f113698Y = c23394l0.f113650h;
            this.f113699Z = c23394l0.f113651i;
            this.f113700a0 = c23394l0.f113652j;
            this.f113677D = C32017m4.m154326S().m154379y(this.f113698Y);
            this.f113697X = this.f113675B.mo112413l0();
            this.f113701b0 = AbstractC23309i.m122496v8();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Ea */
    public void mo122822Ea(String str, boolean z11, boolean z12) {
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
        C32002l4 m154284u = this.f113698Y.m154284u(3);
        if (str.equals(CoreUtility.f89233i)) {
            if (!z11) {
                str2 = "";
            }
            ((InterfaceC23373b) m103742Dp()).mo80832J(new C26365a.b(str, m154284u).m135739F(str2).m135743b());
            return;
        }
        if (z12 && ((InterfaceC23373b) m103742Dp()).mo80848c0(str)) {
            ((InterfaceC23373b) m103742Dp()).mo78356q0();
            return;
        }
        ContactProfile contactProfile = this.f113714w;
        if (contactProfile != null && contactProfile.m40387S0()) {
            i11 = 20;
        } else {
            i11 = 10;
        }
        C21927m.m114302u().m114330e0(str, new TrackingSource(i11));
        ((InterfaceC23373b) m103742Dp()).mo80832J(new C26365a.b(str, m154284u).m135743b());
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: En */
    public C23396m0 mo122823En() {
        return C23396m0.m122887a(this.f113715x, this.f113712u, this.f113678E, null);
    }

    /* renamed from: Er */
    public void m122985Er() {
        try {
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null && itemAlbumMobile.f42594q0 != null) {
                itemAlbumMobile.m40529p0();
                ((InterfaceC23373b) m103742Dp()).mo80828Gu(C2323x.m12275b().m12282d(this.f113715x).m12281c(true).m12280b(this.f113698Y).m12279a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Fd */
    public BottomSheetMenuBundleDataPhotoViewfull mo122824Fd() {
        boolean z11;
        BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull = new BottomSheetMenuBundleDataPhotoViewfull();
        bottomSheetMenuBundleDataPhotoViewfull.m45519H(this.f113715x);
        bottomSheetMenuBundleDataPhotoViewfull.m45526Q(this.f113711t);
        ContactProfile contactProfile = this.f113714w;
        boolean z12 = false;
        if (contactProfile != null && contactProfile.m40387S0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        bottomSheetMenuBundleDataPhotoViewfull.m45527R(z11);
        bottomSheetMenuBundleDataPhotoViewfull.m45529T(this.f113699Z);
        bottomSheetMenuBundleDataPhotoViewfull.m45530U(this.f113700a0);
        bottomSheetMenuBundleDataPhotoViewfull.m45523M(this.f113702c0);
        TrackingSource trackingSource = this.f113677D;
        if (trackingSource != null) {
            if (trackingSource.m40683t() == 15 || this.f113677D.m40683t() == 50) {
                z12 = true;
            }
            bottomSheetMenuBundleDataPhotoViewfull.m45525O(z12);
        }
        return bottomSheetMenuBundleDataPhotoViewfull;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: H */
    public void mo122825H(String str) {
        for (C10873l c10873l : this.f113716y) {
            if (c10873l.m56493u().equals(str)) {
                c10873l.m56494u0(true);
            }
        }
        ((InterfaceC23373b) m103742Dp()).mo78356q0();
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: H2 */
    public void mo122826H2(int i11, C10873l c10873l) {
        ((InterfaceC23373b) m103742Dp()).mo80860s8(i11, this.f113715x, c10873l);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: H7 */
    public void mo122827H7(String str, boolean z11) {
        try {
            this.f113689P = z11;
            if (this.f113692S && !TextUtils.isEmpty(str) && str.equals(this.f113712u)) {
                ((InterfaceC23373b) m103742Dp()).mo78955kl(new Runnable() { // from class: mo.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.this.m122969sr();
                    }
                }, 500L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: I */
    public String mo112324I() {
        return this.f113713v;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Io */
    public String mo122828Io() {
        return AbstractC23136l9.m118743r0(C20815q.m108697k(this.f113715x));
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: J1 */
    public void mo122829J1(int i11) {
        ((InterfaceC23373b) m103742Dp()).mo78355oa(this.f113697X, i11);
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: K2 */
    public void mo112325K2(C23912e c23912e, C19591a c19591a) {
        if (c23912e != null) {
            String str = c23912e.f115562a;
            if (!TextUtils.isEmpty(str) && m122988Zq(c19591a) && str.equals(c19591a.m102558a().mo41081Q())) {
                MediaItem m102558a = c19591a.m102558a();
                m102558a.m41101G0(c23912e.f115563b);
                String str2 = c23912e.f115564c;
                if (!TextUtils.isEmpty(str2) && AbstractC23041d2.m118194A(str2)) {
                    m102558a.m41124T0(str2);
                }
                this.f113703d0 = c19591a;
                ((InterfaceC23373b) m103742Dp()).mo78320I2(true, this.f113703d0);
            }
            AbstractC23647d.m123897g("188012");
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Le */
    public void mo112326Le() {
        if (this.f113704e0 != null) {
            ((InterfaceC23373b) m103742Dp()).mo78334PC();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: M3 */
    public int mo112327M3() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null) {
            return itemAlbumMobile.f42590o0;
        }
        return -1;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Mj */
    public void mo122830Mj() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile == null) {
            return;
        }
        boolean z11 = !itemAlbumMobile.f42568S;
        e eVar = new e(z11);
        ((InterfaceC23373b) m103742Dp()).mo46829Y();
        if (z11) {
            this.f113675B.mo112368i0(this.f113713v, 1, eVar);
            m122892Br();
        } else {
            this.f113675B.mo112379t(this.f113713v, 1, eVar);
            m122894Cr();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: N3 */
    public void mo112328N3() {
        this.f113703d0 = new C19591a();
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Nc */
    public void mo122831Nc() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile == null) {
            return;
        }
        EnumC31051a m150916c = C31060j.m150916c(itemAlbumMobile);
        if (AbstractC31052b.m150889b(m150916c)) {
            ((InterfaceC23373b) m103742Dp()).mo80839T0();
            C31060j.f143193a.m150942h();
        } else if (AbstractC31052b.m150888a(m150916c)) {
            ((InterfaceC23373b) m103742Dp()).mo80856kn();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Nh */
    public void mo112329Nh(final InterfaceC2946a1 interfaceC2946a1) {
        if (interfaceC2946a1.mo13947I().equals(mo112324I())) {
            this.f113704e0 = interfaceC2946a1;
            ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.k
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122981yr(interfaceC2946a1);
                }
            });
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Nn */
    public void mo112330Nn(C16719g c16719g, int i11, int i12) {
        try {
            if (i11 != 1) {
                if (i11 != 17) {
                    if (i11 != 14) {
                        if (i11 == 15) {
                            m122991t0();
                        }
                    } else {
                        mo122837Ue();
                    }
                } else {
                    m122985Er();
                }
            } else {
                mo122838Vo();
                AbstractC23647d.m123897g("1820001");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: O3 */
    public void mo112331O3() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null) {
            int i11 = itemAlbumMobile.f42590o0;
            if (i11 == 2 || i11 == 17) {
                C28594q.m143005j().m143019s(mo112324I(), this.f113716y);
            }
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: On */
    public void mo112332On(View view, int i11, int i12) {
        try {
            if (i11 != 1) {
                if (i11 != 17) {
                    if (i11 != 14) {
                        if (i11 == 15) {
                            m122991t0();
                        }
                    } else {
                        mo122837Ue();
                    }
                } else {
                    m122985Er();
                }
            } else {
                mo122838Vo();
                AbstractC23647d.m123897g("1820001");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Qq */
    public C23910c m122986Qq(boolean z11) {
        C23910c c23910c = new C23910c();
        if (this.f113715x != null) {
            C3000l0 c3000l0 = new C3000l0(this.f113715x.f42594q0, 3, false);
            c23910c.f115538a = c3000l0;
            c3000l0.f11903u = 1;
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            C3020p0 c3020p0 = itemAlbumMobile.f42594q0;
            c23910c.f115539b = c3020p0;
            if (c3020p0 != null) {
                c3020p0.f12056j0 = true;
            }
            c23910c.f115540c = itemAlbumMobile;
            c23910c.f115541d = this.f113697X;
            c23910c.f115542e = z11;
            c23910c.f115543f = false;
            c23910c.f115556s = this.f113704e0;
        }
        return c23910c;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: R */
    public int mo112333R() {
        return this.f113701b0;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: R0 */
    public void mo122832R0() {
        if (!C24346a.f117452a.m127220c(this.f113706g0)) {
            final C3054x m116820k = AbstractC22575p0.m116820k(C24355e0.f117560a.m127355c());
            ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.i
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122979xr(m116820k);
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
            this.f113703d0 = m122896Eq(c25630b, z12);
            ((InterfaceC23373b) m103742Dp()).mo78329N2(this.f113703d0, true);
            return;
        }
        if (i11 == -2) {
            z11 = false;
        }
        m122901Hq(m122896Eq(c25630b, z11), "", "");
        this.f113705f0 = false;
        ((InterfaceC23373b) m103742Dp()).mo78361t1();
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Rf */
    public void mo122833Rf() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile == null) {
            return;
        }
        AbstractC23392k0.m122876f(this, itemAlbumMobile, this.f113698Y);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Sh */
    public void mo122834Sh(C20275e c20275e, AnimationTarget animationTarget) {
        String str;
        try {
            this.f113686M = false;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ItemAlbumMobile(this.f113715x));
            boolean z11 = !C28570b.m142996a().m142998b(1);
            C2310k.a m12233e = C2310k.m12211b().m12240l(arrayList).m12241m(z11).m12237i(z11).m12243o(true).m12236h(true).m12239k(4).m12238j(this.f113715x.m40504N()).m12235g(this.f113715x.f42590o0).m12233e(mo112324I());
            InterfaceC2946a1 interfaceC2946a1 = this.f113704e0;
            if (interfaceC2946a1 != null) {
                str = interfaceC2946a1.mo14159b();
            } else {
                str = "";
            }
            ((InterfaceC23373b) m103742Dp()).mo80845Z9(m12233e.m12244p(str).m12242n(mo112337d1()).m12229a(), c20275e, animationTarget);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: T1 */
    public void mo112335T1(int i11, int i12, int i13) {
        int i14;
        C24906b c24906b = C24906b.f119505a;
        String m154369o = C32017m4.m154326S().m154369o(this.f113698Y);
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null) {
            i14 = itemAlbumMobile.f42590o0;
        } else {
            i14 = 0;
        }
        c24906b.m129546E(m154369o, i11, i12, i14, i13);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: U1 */
    public void mo122835U1(C23914g c23914g) {
        ItemAlbumMobile itemAlbumMobile;
        if (c23914g != null) {
            try {
                if (c23914g.f115573b) {
                    m122987Yq(1005);
                    return;
                }
                if (c23914g.f115574c) {
                    ItemAlbumMobile itemAlbumMobile2 = this.f113715x;
                    if (itemAlbumMobile2 != null) {
                        itemAlbumMobile2.m40525m();
                        ((InterfaceC23373b) m103742Dp()).mo80841Ue(m122986Qq(false));
                    }
                    ((InterfaceC23373b) m103742Dp()).invalidateOptionsMenu();
                    return;
                }
                ArrayList arrayList = c23914g.f115572a;
                if (arrayList != null && arrayList.size() > 0 && (itemAlbumMobile = this.f113715x) != null) {
                    itemAlbumMobile.m40522j0(arrayList, true);
                    ((InterfaceC23373b) m103742Dp()).mo80841Ue(m122986Qq(false));
                }
                ((InterfaceC23373b) m103742Dp()).invalidateOptionsMenu();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: U5 */
    public void mo122836U5() {
        if (m122888Aq()) {
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null && itemAlbumMobile.f42593q.equals(CoreUtility.f89233i)) {
                if (m122990br(this.f113715x)) {
                    ((InterfaceC23373b) m103742Dp()).mo80838R2(C2321v.m12267b().m12274d(this.f113715x).m12273c(true).m12271a());
                    return;
                }
                return;
            }
            ((InterfaceC23373b) m103742Dp()).removeDialog(1);
            ((InterfaceC23373b) m103742Dp()).showDialog(1);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Ue */
    public void mo122837Ue() {
        try {
            ContactProfile contactProfile = this.f113714w;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                mo122822Ea(this.f113714w.f42434r, false, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Vo */
    public void mo122838Vo() {
        ContactProfile contactProfile = this.f113714w;
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            m122898Fr(this.f113714w);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: W */
    public void mo122839W(C25630b c25630b, int i11, int i12, int i13) {
        if (!this.f113697X) {
            return;
        }
        C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
        if (m143290W.m132427f() >= 0) {
            ((InterfaceC23373b) m103742Dp()).mo78316E0(m143290W, i11);
        }
        AbstractC23647d.m123897g("188021");
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: X0 */
    public void mo122840X0(int i11) {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null) {
            AbstractC23392k0.m122877g(this, itemAlbumMobile, C31060j.f143193a.m150930F(i11), this.f113698Y);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Y */
    public void mo122841Y(int i11) {
        C10873l c10873l;
        boolean z11;
        boolean z12;
        ContactProfile contactProfile;
        List list = this.f113716y;
        if (list != null && !list.isEmpty() && i11 < this.f113716y.size() && (c10873l = (C10873l) this.f113716y.get(i11)) != null) {
            boolean z13 = !TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i);
            boolean z14 = !TextUtils.isEmpty(c10873l.m56495v());
            if (!TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i) && ((contactProfile = this.f113714w) == null || !TextUtils.equals(contactProfile.f42434r, CoreUtility.f89233i))) {
                z11 = false;
            } else {
                z11 = true;
            }
            ContactProfile contactProfile2 = this.f113714w;
            if (contactProfile2 != null && contactProfile2.m40387S0() && !TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                z12 = true;
            } else {
                z12 = false;
            }
            ((InterfaceC23373b) m103742Dp()).mo78357q4(c10873l.m56495v(), i11, z13, z14, z11, z12);
        }
    }

    /* renamed from: Yq */
    public void m122987Yq(int i11) {
        try {
            ((InterfaceC23373b) m103742Dp()).mo80854hg(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_feed_not_exist));
            if (i11 == 1001 || i11 == 1002 || i11 == 1005) {
                this.f113678E = true;
                if (i11 == 1005) {
                    m122897Fq();
                }
            }
            this.f113715x = null;
            ((InterfaceC23373b) m103742Dp()).invalidateOptionsMenu();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: Z3 */
    public void mo112336Z3(C2988i3 c2988i3) {
        int m14164c = c2988i3.m14164c();
        if (m14164c != 1) {
            if (m14164c == 2) {
                mo112344l3(c2988i3.m14163b(), 1);
                this.f113705f0 = true;
                return;
            }
            return;
        }
        String m14162a = c2988i3.m14162a();
        this.f113705f0 = true;
        if (!C20120e.f99217a.m104723b(0)) {
            InterfaceC23373b interfaceC23373b = (InterfaceC23373b) m103742Dp();
            if (TextUtils.isEmpty(m14162a)) {
                m14162a = "";
            }
            interfaceC23373b.mo78348k4(m14162a);
            return;
        }
        m122903Iq(m14162a, "");
        this.f113705f0 = false;
        ((InterfaceC23373b) m103742Dp()).mo78361t1();
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Z6 */
    public void mo122842Z6() {
        try {
            boolean m118271f = C23055e5.m118271f();
            ((InterfaceC23373b) m103742Dp()).mo78312A6(!m118271f);
            if (m118271f) {
                this.f113687N = 0;
                this.f113688O = 0;
                this.f113717z = false;
                this.f113674A = false;
                m122980yq();
                ContactProfile contactProfile = this.f113714w;
                if (contactProfile != null && this.f113715x != null) {
                    m122900Gr(false);
                    m122912Mq(false, true);
                } else if (contactProfile == null) {
                    m122906Jq(true, true);
                } else {
                    m122912Mq(true, true);
                }
            } else {
                ((InterfaceC23373b) m103742Dp()).mo80842V7(m122921Rq(false, new C20096c(50001, "")));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: Zk */
    public void mo122843Zk() {
        ((InterfaceC23373b) m103742Dp()).mo80841Ue(m122986Qq(false));
    }

    /* renamed from: Zq */
    public boolean m122988Zq(C19591a c19591a) {
        if (c19591a != null && c19591a.m102560c() == 1 && c19591a.m102558a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ar */
    public boolean m122989ar(C19591a c19591a) {
        if (c19591a != null && c19591a.m102560c() == 2 && c19591a.m102559b() != null) {
            return true;
        }
        return false;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: b */
    public void mo122844b(C25470c c25470c) {
        MediaItem mediaItem = (MediaItem) c25470c.m131941d("imageSelected");
        if (mediaItem != null) {
            this.f113703d0 = new C19591a(mediaItem);
            ((InterfaceC23373b) m103742Dp()).mo78320I2(true, this.f113703d0);
        }
        C25630b c25630b = (C25630b) c25470c.m131943f("stickerSelected");
        if (c25630b != null) {
            this.f113703d0 = new C19591a(c25630b);
            if (!C20120e.f99217a.m104723b(1)) {
                ((InterfaceC23373b) m103742Dp()).mo78329N2(this.f113703d0, false);
            }
        }
        this.f113694U = c25470c.m131944g("currentReplyCommentUid", "");
        this.f113695V = c25470c.m131944g("strReplyCommentId", "");
        this.f113696W = c25470c.m131944g("strReplyCommentDName", "");
        this.f113702c0 = c25470c.m131939b("isImageSingle", true);
        if (!TextUtils.isEmpty(this.f113694U) && !TextUtils.isEmpty(this.f113696W)) {
            ((InterfaceC23373b) m103742Dp()).mo78955kl(new Runnable() { // from class: mo.p
                @Override // java.lang.Runnable
                public final void run() {
                    C23407x.this.m122983zr();
                }
            }, 100L);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: b2 */
    public void mo122845b2(C23915h c23915h) {
        if (c23915h != null) {
            if (c23915h.f115577c) {
                this.f113678E = true;
                ((InterfaceC23373b) m103742Dp()).finish();
                return;
            }
            ItemAlbumMobile itemAlbumMobile = c23915h.f115576b;
            if (itemAlbumMobile != null) {
                AbstractC20805l.m108549g(this.f113715x, itemAlbumMobile);
                ((InterfaceC23373b) m103742Dp()).mo80861se(this.f113715x, this.f113697X);
            }
            if (c23915h.f115579e) {
                mo112346y2(false);
            }
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: b4 */
    public void mo122846b4() {
        ((InterfaceC23373b) m103742Dp()).showDialog(3);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: bl */
    public void mo122847bl() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreUtility.f89233i);
        AbstractC23392k0.m122878h(this, arrayList);
    }

    /* renamed from: br */
    boolean m122990br(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile == null) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(itemAlbumMobile.f42593q) || TextUtils.isEmpty(itemAlbumMobile.f42595r) || TextUtils.isEmpty(itemAlbumMobile.f42599t)) {
                return false;
            }
            if (!itemAlbumMobile.m40506Q()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: c */
    public C25470c mo122848c() {
        C25470c c25470c = new C25470c();
        if (m122988Zq(this.f113703d0)) {
            c25470c.m131947j("imageSelected", this.f113703d0.m102558a());
        }
        if (m122989ar(this.f113703d0)) {
            c25470c.m131949l("stickerSelected", this.f113703d0.m102559b());
        }
        if (!TextUtils.isEmpty(this.f113694U)) {
            c25470c.m131950m("currentReplyCommentUid", this.f113694U);
        }
        if (!TextUtils.isEmpty(this.f113695V)) {
            c25470c.m131950m("strReplyCommentId", this.f113695V);
        }
        if (!TextUtils.isEmpty(this.f113696W)) {
            c25470c.m131950m("strReplyCommentDName", this.f113696W);
        }
        c25470c.m131945h("isImageSingle", this.f113702c0);
        return c25470c;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: c0 */
    public void mo122849c0(String str, String str2) {
        if (!TextUtils.isEmpty(str) || mo112342i2()) {
            if (str == null) {
                str = "";
            }
            if (m122988Zq(this.f113703d0)) {
                m122899Gq(str, this.f113703d0.m102558a(), str2);
            } else if (m122989ar(this.f113703d0)) {
                m122901Hq(this.f113703d0, str2, str);
            } else {
                m122903Iq(str, str2);
            }
            this.f113705f0 = false;
            ((InterfaceC23373b) m103742Dp()).mo78361t1();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: d1 */
    public String mo112337d1() {
        InterfaceC2946a1 interfaceC2946a1 = this.f113704e0;
        if (interfaceC2946a1 != null) {
            return interfaceC2946a1.mo13947I();
        }
        return "";
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: d2 */
    public void mo122850d2(C3054x c3054x) {
        C31877d c31877d = new C31877d();
        c31877d.m153184c(this.f113698Y);
        ((InterfaceC23373b) m103742Dp()).mo11973vq(c3054x.m14669a(), c3054x.m14670b(), c31877d);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: d3 */
    public void mo122851d3(C23913f c23913f) {
        if (c23913f != null) {
            ItemAlbumMobile itemAlbumMobile = c23913f.f115570f;
            if (itemAlbumMobile != null) {
                AbstractC20805l.m108549g(this.f113715x, itemAlbumMobile);
                ((InterfaceC23373b) m103742Dp()).mo80861se(this.f113715x, this.f113697X);
            }
            if (c23913f.f115571g) {
                mo112346y2(false);
            }
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: d4 */
    public boolean mo122852d4() {
        ContactProfile contactProfile = this.f113714w;
        if (contactProfile != null && !TextUtils.equals(contactProfile.f42434r, CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: dm */
    public int mo122853dm() {
        return C20815q.m108700n(this.f113715x);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: e0 */
    public void mo122854e0(C10873l c10873l) {
        String str;
        if (c10873l != null && c10873l.f54891G != null && !c10873l.m56446L()) {
            ContactProfile contactProfile = this.f113714w;
            String str2 = "";
            if (contactProfile == null) {
                str = "";
            } else {
                str = contactProfile.f42434r;
            }
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            C10872k c10872k = c10873l.f54891G;
            String str3 = c10872k.f54883o;
            if (str3 != null) {
                str2 = str3;
            }
            itemAlbumMobile.f42595r = str2;
            itemAlbumMobile.f42607x = c10872k.f54878j;
            itemAlbumMobile.f42548C = c10872k.f54877i;
            itemAlbumMobile.f42558I = c10873l.m56503z();
            ArrayList arrayList = new ArrayList();
            arrayList.add(itemAlbumMobile);
            ((InterfaceC23373b) m103742Dp()).mo80836R(C2310k.m12211b().m12240l(arrayList).m12232d(0).m12231c(2).m12246r(c10873l.m56497w()).m12230b(c10873l.m56441F0().toString()).m12234f(str).m12245q(1).m12239k(12).m12238j(c10873l.f54891G.f54878j).m12229a());
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: f0 */
    public void mo122855f0(List list) {
        if (!list.isEmpty()) {
            this.f113703d0 = new C19591a((MediaItem) list.get(0));
            ((InterfaceC23373b) m103742Dp()).mo78358r2(this.f113703d0);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: f1 */
    public boolean mo122856f1(C31862c c31862c) {
        if (c31862c == null || !c31862c.f146301C) {
            return true;
        }
        List list = this.f113716y;
        if (list != null && list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: f2 */
    public void mo112338f2(int i11, int i12) {
        final C10873l c10873l;
        List list = this.f113716y;
        if (list != null && !list.isEmpty() && i12 >= 0 && i12 < this.f113716y.size()) {
            c10873l = (C10873l) this.f113716y.get(i12);
        } else {
            c10873l = null;
        }
        if (c10873l != null) {
            if (i11 == AbstractC8020f0.str_tv_optionmenu_reply) {
                ((InterfaceC23373b) m103742Dp()).mo78327Ln(new Runnable() { // from class: mo.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.this.m122958nr(c10873l);
                    }
                });
                return;
            }
            if (i11 == AbstractC8020f0.copy) {
                ((InterfaceC23373b) m103742Dp()).mo78342b4(c10873l.m56495v().toString());
                return;
            }
            if (i11 == AbstractC8020f0.delete_comment) {
                AbstractC23647d.m123897g("18702");
                if (c10873l.m56446L()) {
                    C26736a.m137532e().m137537c(c10873l.m56493u());
                    m122925Tq(c10873l.m56493u(), this.f113712u);
                    return;
                }
                ContactProfile contactProfile = this.f113714w;
                if ((contactProfile != null && TextUtils.equals(contactProfile.f42434r, CoreUtility.f89233i)) || TextUtils.equals(c10873l.m56497w(), CoreUtility.f89233i)) {
                    ((InterfaceC23373b) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                    this.f113675B.mo112365f0(this.f113715x.f42595r, c10873l.m56493u(), new d(c10873l));
                    return;
                }
                return;
            }
            if (i11 == AbstractC8020f0.str_reportabuse) {
                m122910Lq(c10873l);
            }
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: g */
    public C32002l4 mo112339g() {
        C32002l4 c32002l4 = this.f113698Y;
        if (c32002l4 == null) {
            return C32002l4.m154264g(10007);
        }
        return c32002l4;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: g3 */
    public void mo112340g3() {
        C19591a c19591a = this.f113703d0;
        if (c19591a != null && m122989ar(c19591a)) {
            ((InterfaceC23373b) m103742Dp()).mo78359s3(this.f113703d0);
        } else {
            ((InterfaceC23373b) m103742Dp()).mo78319H3();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: i1 */
    public String mo112341i1() {
        if (TextUtils.isEmpty(this.f113694U)) {
            return this.f113711t;
        }
        return this.f113694U;
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: i2 */
    public boolean mo112342i2() {
        if (!m122988Zq(this.f113703d0) && !m122989ar(this.f113703d0)) {
            return false;
        }
        return true;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: j0 */
    public void mo122857j0() {
        ((InterfaceC23373b) m103742Dp()).mo78349kC(this.f113716y);
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: k0 */
    public void mo112343k0(C10873l c10873l) {
        if (c10873l != null && c10873l.m56446L()) {
            C10873l m137556d = C26744e.m137551e().m137556d(c10873l.m56493u());
            if (m137556d != null) {
                m137556d.f54914b0 = C32017m4.m154326S().m154372r(m122918Pq());
            }
            C26736a.m137532e().m137541j(c10873l.m56493u());
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: l1 */
    public C3042u mo122858l1() {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f113711t);
        C3042u c3042u = new C3042u();
        if (m141809c != null) {
            c3042u.f12242f = 7;
            c3042u.f12239c = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_delete_contact_dialog), m141809c.m40420o0());
            c3042u.f12241e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_delete_contact_dialog);
            c3042u.f12240d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel);
            c3042u.f12258h = this.f113675B.mo112415n0();
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
            this.f113703d0 = m122896Eq(c25630b, z12);
            ((InterfaceC23373b) m103742Dp()).mo78329N2(this.f113703d0, true);
            return;
        }
        if (i11 != 1 && i11 != 9) {
            z11 = false;
        }
        m122901Hq(m122896Eq(c25630b, z11), "", "");
        this.f113705f0 = false;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: n0 */
    public void mo122859n0(List list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m122926Uq((String) it.next());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: ne */
    public void mo122860ne() {
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.m40499H())) {
            ((InterfaceC23373b) m103742Dp()).mo78342b4(this.f113715x.m40499H().toString());
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: oj */
    public C23396m0 mo122861oj() {
        if (!TextUtils.isEmpty(this.f113712u)) {
            m122893Cq(this.f113712u);
        } else {
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42595r)) {
                m122893Cq(this.f113715x.f42595r);
            }
        }
        if (this.f113715x != null) {
            ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile(this.f113715x);
            itemAlbumMobile2.f42595r = this.f113712u;
            return C23396m0.m122887a(itemAlbumMobile2, this.f113712u, this.f113678E, (FeedLikeStatus) this.f113710k0.get(this.f113715x.f42599t));
        }
        return null;
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: p6 */
    public void mo122862p6(int i11, String str) {
        f fVar = new f();
        String m108699m = C20815q.m108699m(this.f113715x);
        ((InterfaceC23373b) m103742Dp()).mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f113675B.mo112375q0(this.f113711t, m108699m, this.f113712u, "", i11, str, fVar);
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: pp */
    public void mo122863pp() {
        C3020p0 c3020p0;
        C3025q0 c3025q0;
        ((InterfaceC23373b) m103742Dp()).mo80858lu(this.f113714w);
        C26736a.m137532e().m137536b();
        if (!TextUtils.isEmpty(this.f113713v)) {
            C3000l0 mo112410j = this.f113675B.mo112410j(this.f113713v);
            this.f113708i0 = mo112410j;
            if (mo112410j != null) {
                this.f113709j0 = mo112410j.m14322a0();
            }
            C3020p0 c3020p02 = this.f113709j0;
            if (c3020p02 != null && (c3025q0 = c3020p02.f12023C) != null) {
                ItemAlbumMobile m14565b = c3025q0.m14565b(this.f113712u);
                this.f113715x = m14565b;
                if (m14565b != null) {
                    m14565b.m40521j(this.f113709j0);
                }
            } else {
                this.f113715x = C26878b.f127183a.m138452d(this.f113712u);
            }
        } else {
            this.f113715x = C26878b.f127183a.m138452d(this.f113712u);
        }
        m122992z6();
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null && (c3020p0 = itemAlbumMobile.f42594q0) != null) {
            m122909Kq(c3020p0);
        }
        m122900Gr(false);
        if (this.f113714w != null && this.f113715x != null) {
            this.f113717z = false;
            this.f113674A = m122982zq();
            m122912Mq(true, false);
        } else {
            this.f113717z = true;
            this.f113674A = m122982zq();
            m122923Sq();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: q2 */
    public void mo122864q2(boolean z11) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f113711t);
        if (m141809c != null) {
            m122890B0(m141809c, z11);
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: s3 */
    public void mo112345s3(C19591a c19591a) {
        if (m122988Zq(c19591a) && AbstractC23041d2.m118194A(c19591a.m102558a().mo41081Q())) {
            ((InterfaceC23373b) m103742Dp()).mo79636g1(c19591a.m102558a());
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_comment_photo_deleted_msg));
        }
        AbstractC23647d.m123897g("188011");
    }

    /* renamed from: t0 */
    public void m122991t0() {
        try {
            ContactProfile contactProfile = this.f113714w;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                mo122822Ea(this.f113714w.f42434r, false, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: w */
    public void mo122865w() {
        C3020p0 c3020p0;
        String str;
        ItemAlbumMobile itemAlbumMobile = this.f113715x;
        if (itemAlbumMobile != null) {
            c3020p0 = itemAlbumMobile.f42594q0;
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null) {
            str = c3020p0.f12057p;
        } else {
            str = "";
        }
        final C2976g1 m129551v = C24906b.f119505a.m129551v(str);
        if (m129551v != null && m129551v.m14119g() && C20120e.f99217a.m104724c(1)) {
            if (((InterfaceC23373b) m103742Dp()).mo78311A1()) {
                ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.this.m122977wr(m129551v);
                    }
                });
                return;
            }
            return;
        }
        ((InterfaceC23373b) m103742Dp()).mo78343d4();
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: y */
    public void mo122866y(C10873l c10873l, boolean z11) {
        if (c10873l != null) {
            if (z11) {
                AbstractC23647d.m123897g("18600");
            }
            ((InterfaceC23373b) m103742Dp()).mo80834Nh(c10873l.m56497w(), this.f113714w, c10873l.m56485q());
            this.f113694U = c10873l.m56497w();
            this.f113695V = c10873l.m56493u();
            this.f113696W = c10873l.m56485q();
            ((InterfaceC23373b) m103742Dp()).mo78343d4();
        }
    }

    @Override // p302ko.InterfaceC21779a
    /* renamed from: y2 */
    public void mo112346y2(boolean z11) {
        try {
            if (!z11) {
                this.f113684K = "0";
            } else {
                if (this.f113716y.size() == 0) {
                    this.f113684K = "0";
                } else {
                    String str = this.f113684K;
                    if (str != null && str.trim().length() > 0) {
                        this.f113684K = ((C10873l) this.f113716y.get(0)).m56493u();
                    }
                }
                ((InterfaceC23373b) m103742Dp()).mo70710wy(new Runnable() { // from class: mo.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C23407x.this.m122947hr();
                    }
                });
                this.f113717z = false;
                this.f113674A = false;
            }
            this.f113692S = this.f113684K.equals("0");
            this.f113676C.m123036e(this.f113713v, this.f113712u, this.f113684K, 50, C32017m4.m154326S().m154377w(this.f113698Y), new C23415c.a() { // from class: mo.m
                @Override // mp.C23415c.a
                /* renamed from: a */
                public final void mo116833a(C23413a c23413a) {
                    C23407x.this.m122953kr(c23413a);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: y3 */
    public void mo122867y3() {
        if (this.f113715x == null) {
            ((InterfaceC23373b) m103742Dp()).mo80827Fk(null);
        } else {
            ((InterfaceC23373b) m103742Dp()).mo80827Fk(C23375c.m122870a(this.f113715x, this.f113714w, this.f113711t, m122888Aq(), this.f113699Z, this.f113700a0, m122945gr(this.f113715x.f42599t), this.f113702c0));
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: y9 */
    public void mo122868y9() {
        if (!TextUtils.isEmpty(this.f113711t) && !TextUtils.isEmpty(this.f113712u)) {
            ((InterfaceC23373b) m103742Dp()).removeDialog(0);
            ((InterfaceC23373b) m103742Dp()).showDialog(0);
        }
    }

    @Override // mo.InterfaceC23371a
    /* renamed from: yc */
    public void mo122869yc() {
        try {
            ((InterfaceC23373b) m103742Dp()).mo80841Ue(m122986Qq(false));
            ((InterfaceC23373b) m103742Dp()).mo78356q0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z6 */
    public void m122992z6() {
        try {
            C19591a c19591a = this.f113703d0;
            if (c19591a != null && c19591a.m102560c() != 0) {
                return;
            }
            ItemAlbumMobile itemAlbumMobile = this.f113715x;
            if (itemAlbumMobile != null && itemAlbumMobile.f42594q0 != null && C20120e.f99217a.m104724c(1) && C23055e5.m118271f()) {
                C24906b.f119505a.m129544A(this.f113715x.f42594q0, this.f113698Y);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
