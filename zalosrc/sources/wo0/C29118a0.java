package wo0;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import ap0.C2280b;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import ep0.C18557q;
import ep0.C18558r;
import gp0.C19577z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import jo0.C21334l;
import ko0.C21790e;
import ko0.C21791f;
import lo0.C22592c;
import lo0.C22598f;
import me0.AbstractC23034c6;
import me0.AbstractC23104j;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mo0.EnumC23412c;
import org.json.JSONArray;
import org.json.JSONObject;
import p097db.C17846e;
import p097db.EnumC17859r;
import p142ey.C18635e;
import p142ey.C18644n;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p207he.C20024r;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.C23648e;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import ro0.AbstractRunnableC25943g;
import ro0.C25942f;
import so0.C26350a;
import so0.C26351b;
import to0.InterfaceC26856a;
import to0.InterfaceC26857b;
import uo0.C27352b;
import vg.C28203u6;
import wo0.C29118a0;
import xo0.C30189a;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32252b;
import zm.voip.service.C32257b4;
import zm.voip.service.C32318n3;
import zm.voip.service.C32319o;
import zm.voip.service.C32328p3;
import zm.voip.service.HandlerC32324p;
import zm.voip.service.VoipAudioHelper;

/* renamed from: wo0.a0 */
/* loaded from: classes7.dex */
public class C29118a0 extends AbstractC19962a implements InterfaceC26856a {

    /* renamed from: A */
    private final C19577z f134966A;

    /* renamed from: B */
    private final C20024r f134967B;

    /* renamed from: C */
    private C26351b f134968C;

    /* renamed from: D */
    private C26350a f134969D;

    /* renamed from: E */
    private C22598f f134970E;

    /* renamed from: F */
    private C22592c f134971F;

    /* renamed from: G */
    private Timer f134972G;

    /* renamed from: H */
    private boolean f134973H;

    /* renamed from: I */
    private boolean f134974I;

    /* renamed from: J */
    private volatile boolean f134975J;

    /* renamed from: K */
    private volatile boolean f134976K;

    /* renamed from: L */
    private volatile boolean f134977L;

    /* renamed from: M */
    private int f134978M;

    /* renamed from: N */
    private volatile long f134979N;

    /* renamed from: O */
    private final long f134980O;

    /* renamed from: P */
    private int f134981P;

    /* renamed from: Q */
    private int f134982Q;

    /* renamed from: R */
    private boolean f134983R;

    /* renamed from: S */
    private boolean f134984S;

    /* renamed from: T */
    private boolean f134985T;

    /* renamed from: U */
    private boolean f134986U;

    /* renamed from: V */
    private boolean f134987V;

    /* renamed from: W */
    private boolean f134988W;

    /* renamed from: X */
    private final C18558r f134989X;

    /* renamed from: Y */
    private C21791f f134990Y;

    /* renamed from: Z */
    private HashSet f134991Z;

    /* renamed from: a0 */
    private InterfaceC0765j f134992a0;

    /* renamed from: b0 */
    private InterfaceC0765j f134993b0;

    /* renamed from: c0 */
    private ArrayList f134994c0;

    /* renamed from: d0 */
    private final ArrayList f134995d0;

    /* renamed from: e0 */
    private final C18557q f134996e0;

    /* renamed from: f0 */
    private final ArrayList f134997f0;

    /* renamed from: g0 */
    private final List f134998g0;

    /* renamed from: h0 */
    private String f134999h0;

    /* renamed from: i0 */
    private boolean f135000i0;

    /* renamed from: j0 */
    private boolean f135001j0;

    /* renamed from: k0 */
    private int f135002k0;

    /* renamed from: l0 */
    private boolean f135003l0;

    /* renamed from: m0 */
    private boolean f135004m0;

    /* renamed from: n0 */
    private boolean f135005n0;

    /* renamed from: o0 */
    private final String f135006o0;

    /* renamed from: p0 */
    private final Runnable f135007p0;

    /* renamed from: q0 */
    private final Runnable f135008q0;

    /* renamed from: t */
    private final AbstractC32273e3 f135009t;

    /* renamed from: u */
    private C32319o f135010u;

    /* renamed from: v */
    private final C32257b4 f135011v;

    /* renamed from: w */
    private final C32328p3 f135012w;

    /* renamed from: x */
    private final C32318n3 f135013x;

    /* renamed from: y */
    private final C32252b f135014y;

    /* renamed from: z */
    private final C17846e f135015z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.a0$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractRunnableC25943g {
        a() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if (C29118a0.this.f135014y.m155709b() || C29118a0.this.f135014y.m155708a()) {
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "Restart Capture");
                C29118a0.this.f135015z.m94253x();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.a0$b */
    /* loaded from: classes7.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ int m145502e(C21790e c21790e, C21790e c21790e2) {
            String str;
            int i11 = c21790e.f105765b;
            int i12 = c21790e2.f105765b;
            if (i11 > i12) {
                return -1;
            }
            if (i11 < i12) {
                return 1;
            }
            ContactProfile contactProfile = c21790e.f105764a;
            String str2 = "";
            if (contactProfile == null) {
                str = "";
            } else {
                str = contactProfile.f42440t;
            }
            ContactProfile contactProfile2 = c21790e2.f105764a;
            if (contactProfile2 != null) {
                str2 = contactProfile2.f42440t;
            }
            return str.compareToIgnoreCase(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m145503f(C20096c c20096c) {
            ((InterfaceC26857b) C29118a0.this.m103742Dp()).mo138174kw(c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            if (c20096c != null) {
                ((InterfaceC26857b) C29118a0.this.m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29118a0.b.this.m145503f(c20096c);
                    }
                });
            }
            C29118a0.this.f135003l0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString());
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                        if (C29118a0.this.f135002k0 == 0) {
                            C29118a0.this.f134995d0.clear();
                        }
                        C29118a0 c29118a0 = C29118a0.this;
                        if (jSONObject2.optInt("hasMore") == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c29118a0.f135004m0 = z11;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("admins");
                        if (optJSONArray != null) {
                            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                try {
                                    JSONObject jSONObject3 = (JSONObject) optJSONArray.get(i11);
                                    String optString = jSONObject3.optString("id");
                                    String optString2 = jSONObject3.optString("dName");
                                    String optString3 = jSONObject3.optString("avatar");
                                    if (!optString.equals(CoreUtility.f89233i) && !TextUtils.isEmpty(optString)) {
                                        C21790e c21790e = new C21790e(optString, 0);
                                        c21790e.f105764a = C29118a0.this.m145413Vq(optString, optString2, optString3);
                                        C29118a0.this.f134995d0.add(c21790e);
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("currentMems");
                        if (optJSONArray2 != null) {
                            for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                                JSONObject jSONObject4 = (JSONObject) optJSONArray2.get(i12);
                                String optString4 = jSONObject4.optString("id");
                                String optString5 = jSONObject4.optString("dName");
                                String optString6 = jSONObject4.optString("avatar");
                                if (!optString4.equals(CoreUtility.f89233i) && !TextUtils.isEmpty(optString4)) {
                                    C21790e c21790e2 = new C21790e(optString4, 0);
                                    c21790e2.f105764a = C29118a0.this.m145413Vq(optString4, optString5, optString6);
                                    C29118a0.this.f134995d0.add(c21790e2);
                                }
                            }
                        }
                        Iterator it = C29118a0.this.f134995d0.iterator();
                        while (it.hasNext()) {
                            C21790e c21790e3 = (C21790e) it.next();
                            if (c21790e3.f105765b == 0) {
                                if (CoreUtility.f89233i.equals(c21790e3.f105764a.f42434r)) {
                                    c21790e3.f105764a.f42440t = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you)).trim();
                                } else {
                                    ContactProfile contactProfile = c21790e3.f105764a;
                                    contactProfile.f42440t = AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false)).trim();
                                }
                            }
                        }
                        if (C29118a0.this.f135002k0 == 0) {
                            C29118a0.this.f134995d0.add(new C21790e(1, false, AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_add_partner_select_list_title) + " (" + C29118a0.this.f134995d0.size() + ")"));
                            Collections.sort(C29118a0.this.f134995d0, new Comparator() { // from class: wo0.b0
                                @Override // java.util.Comparator
                                public final int compare(Object obj2, Object obj3) {
                                    int m145502e;
                                    m145502e = C29118a0.b.m145502e((C21790e) obj2, (C21790e) obj3);
                                    return m145502e;
                                }
                            });
                        }
                        if (C29118a0.this.f135004m0) {
                            C29118a0.this.f135002k0++;
                        }
                        C29118a0.this.f135003l0 = false;
                        C29118a0.this.m145462ms();
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                C29118a0.this.f135003l0 = false;
            } catch (Throwable th2) {
                C29118a0.this.f135003l0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.a0$c */
    /* loaded from: classes7.dex */
    public class c implements C30189a.a {

        /* renamed from: a */
        final /* synthetic */ String f135018a;

        c(String str) {
            this.f135018a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m145506e() {
            C29118a0.this.m145495Pr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m145507f(ArrayList arrayList, String str) {
            C29118a0.this.f134994c0 = arrayList;
            ((InterfaceC26857b) C29118a0.this.m103742Dp()).mo138141Sa(C29118a0.this.m145498Xq(), str);
        }

        @Override // xo0.C30189a.a
        /* renamed from: a */
        public void mo145508a() {
            ((InterfaceC26857b) C29118a0.this.m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.c.this.m145506e();
                }
            });
        }

        @Override // xo0.C30189a.a
        /* renamed from: b */
        public void mo145509b(final ArrayList arrayList) {
            InterfaceC26857b interfaceC26857b = (InterfaceC26857b) C29118a0.this.m103742Dp();
            final String str = this.f135018a;
            interfaceC26857b.mo70710wy(new Runnable() { // from class: wo0.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.c.this.m145507f(arrayList, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.a0$d */
    /* loaded from: classes7.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C29118a0.this.f135005n0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            JSONArray optJSONArray;
            try {
                try {
                    jSONObject = new JSONObject(obj.toString());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (jSONObject.isNull("data")) {
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (!jSONObject2.isNull("onlines") && (optJSONArray = jSONObject2.optJSONArray("onlines")) != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        try {
                            String optString = optJSONArray.getJSONObject(i11).optString("userId");
                            if (!CoreUtility.f89233i.equals(optString) && !C21927m.m114302u().m114312J().m153137g(optString)) {
                                C29118a0.this.f134997f0.add(optString);
                            }
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            } finally {
                C29118a0.this.f135005n0 = false;
                C29118a0.this.m145462ms();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wo0.a0$e */
    /* loaded from: classes7.dex */
    public class e extends TimerTask {
        e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (C29118a0.this.f134977L && AbstractC3096i0.f13165i) {
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "Work-around restart state when cannot destroy activity");
                AbstractC3096i0.f13159c = false;
                AbstractC3096i0.f13165i = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wo0.a0$f */
    /* loaded from: classes7.dex */
    public class f extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3082b0.m15421c("VOIP_CallPresenter", "Run quit timer");
            C29118a0.this.m145406Sq();
        }

        private f() {
        }
    }

    public C29118a0(InterfaceC26857b interfaceC26857b, AbstractC32273e3 abstractC32273e3, C32319o c32319o, C32257b4 c32257b4, C32328p3 c32328p3, C32318n3 c32318n3, C32252b c32252b, C17846e c17846e, C19577z c19577z, C20024r c20024r) {
        super(interfaceC26857b);
        this.f134973H = false;
        this.f134974I = false;
        this.f134975J = false;
        this.f134976K = false;
        this.f134977L = false;
        this.f134978M = 0;
        this.f134979N = 0L;
        this.f134980O = System.currentTimeMillis();
        this.f134981P = 7;
        this.f134982Q = 1000;
        this.f134983R = false;
        this.f134984S = false;
        this.f134985T = false;
        this.f134986U = true;
        this.f134987V = false;
        this.f134988W = false;
        this.f134989X = new C18558r();
        this.f134990Y = new C21791f(2);
        this.f134991Z = new HashSet();
        this.f134994c0 = new ArrayList();
        this.f134995d0 = new ArrayList();
        this.f134996e0 = new C18557q();
        this.f134997f0 = new ArrayList();
        this.f134998g0 = new ArrayList();
        this.f134999h0 = "";
        this.f135000i0 = false;
        this.f135001j0 = false;
        this.f135002k0 = 0;
        this.f135003l0 = false;
        this.f135004m0 = false;
        this.f135005n0 = false;
        this.f135006o0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alphabe);
        this.f135007p0 = new Runnable() { // from class: wo0.v
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145455kr();
            }
        };
        this.f135008q0 = new Runnable() { // from class: wo0.w
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145459lr();
            }
        };
        this.f135009t = abstractC32273e3;
        this.f135010u = c32319o;
        this.f135011v = c32257b4;
        this.f135012w = c32328p3;
        this.f135013x = c32318n3;
        this.f135014y = c32252b;
        this.f135015z = c17846e;
        this.f134966A = c19577z;
        this.f134967B = c20024r;
    }

    /* renamed from: Aq */
    private void m145368Aq() {
        int i11;
        C18558r c18558r = this.f134989X;
        C21334l.a aVar = C21334l.f103899A;
        if (!c18558r.m97972c(aVar.m110500a())) {
            C21791f c21791f = new C21791f(1);
            c21791f.m112463F(aVar.m110500a());
            if (this.f134971F.m116854J()) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            c21791f.m112461D(i11);
            c21791f.m112458A("");
            c21791f.m112487v(this.f134971F.m116860M());
            c21791f.m112485t(C28203u6.f131407a.m141808b(CoreUtility.f89233i));
            c21791f.m112486u(this.f134971F.m116850H());
            c21791f.m112491z(!this.f134971F.m116848G());
            this.f134989X.m97970a(c21791f);
            ((InterfaceC26857b) m103742Dp()).mo138193xH(c21791f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Ar */
    public /* synthetic */ void m145369Ar(int i11) {
        boolean z11 = false;
        if (i11 != EnumC17859r.START_CAPTURE.ordinal() && i11 != EnumC17859r.STOP_CAPTURE.ordinal()) {
            this.f134984S = false;
            if (this.f134971F.m116854J() || this.f134971F.m116838B()) {
                ((InterfaceC26857b) m103742Dp()).mo138164eq(this.f134971F.m116850H(), this.f134971F.m116854J());
                ((InterfaceC26857b) m103742Dp()).mo138161dt(!this.f134971F.m116848G());
                m145447hs(!this.f134971F.m116848G());
                return;
            }
            return;
        }
        this.f134983R = false;
        if (this.f134971F.m116854J()) {
            ((InterfaceC26857b) m103742Dp()).mo138177mt(this.f134971F.m116850H(), this.f134971F.m116854J());
            boolean m116850H = this.f134971F.m116850H();
            if (this.f134966A.m102445v() == 1) {
                z11 = true;
            }
            m145410Tr(m116850H, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Br */
    public /* synthetic */ void m145370Br() {
        ((InterfaceC26857b) m103742Dp()).mo138190ux(m145498Xq());
    }

    /* renamed from: Cq */
    private void m145371Cq() {
        C22592c c22592c = this.f134971F;
        if (c22592c != null) {
            c22592c.m116876Z(6);
        }
        m145465ns();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cr */
    public /* synthetic */ void m145372Cr(List list) {
        if (!this.f134971F.m116869S()) {
            ((InterfaceC26857b) m103742Dp()).mo138128Lr(list);
            if ((!this.f135000i0 || this.f134971F.m116864O()) && list.size() > 0) {
                this.f134998g0.clear();
                this.f134998g0.addAll(list);
            }
        } else {
            ((InterfaceC26857b) m103742Dp()).mo138128Lr(list);
            if (!this.f135000i0 || this.f134971F.m116864O() || list.size() > 0) {
                this.f134998g0.clear();
                this.f134998g0.addAll(list);
            }
        }
        m145465ns();
    }

    /* renamed from: Dq */
    private int m145373Dq(boolean z11, boolean z12, boolean z13) {
        if (z11) {
            return EnumC23412c.f113760p.ordinal();
        }
        if (z13) {
            return EnumC23412c.f113761q.ordinal();
        }
        if (z12) {
            return EnumC23412c.f113762r.ordinal();
        }
        return EnumC23412c.f113763s.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Dr */
    public /* synthetic */ void m145374Dr(C27352b c27352b, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int mo138139Rj = ((InterfaceC26857b) m103742Dp()).mo138139Rj();
        if (((InterfaceC26857b) m103742Dp()).mo138118F2()) {
            ((InterfaceC26857b) m103742Dp()).mo138162e9(c27352b.f128642c, c27352b.f128641b, z11, false);
            return;
        }
        if (this.f134974I) {
            ((InterfaceC26857b) m103742Dp()).mo138143U9(false);
            if (mo138139Rj != 0 && mo138139Rj != 1) {
                if (mo138139Rj == 2 || mo138139Rj == 3) {
                    InterfaceC26857b interfaceC26857b = (InterfaceC26857b) m103742Dp();
                    if (mo138139Rj == 2) {
                        i14 = c27352b.f128640a;
                    } else {
                        i14 = c27352b.f128642c;
                    }
                    interfaceC26857b.mo138162e9(i14, c27352b.f128643d, z11, false);
                    return;
                }
                return;
            }
            InterfaceC26857b interfaceC26857b2 = (InterfaceC26857b) m103742Dp();
            if (mo138139Rj == 0) {
                i13 = c27352b.f128640a;
            } else {
                i13 = c27352b.f128642c;
            }
            interfaceC26857b2.mo138162e9(i13, c27352b.f128641b, z11, false);
            return;
        }
        ((InterfaceC26857b) m103742Dp()).mo138143U9(true);
        if (mo138139Rj != 0 && mo138139Rj != 1) {
            if (mo138139Rj == 2 || mo138139Rj == 3) {
                InterfaceC26857b interfaceC26857b3 = (InterfaceC26857b) m103742Dp();
                if (mo138139Rj == 2) {
                    i12 = c27352b.f128640a;
                } else {
                    i12 = c27352b.f128642c;
                }
                interfaceC26857b3.mo138162e9(i12, c27352b.f128645f, z11, false);
                return;
            }
            return;
        }
        InterfaceC26857b interfaceC26857b4 = (InterfaceC26857b) m103742Dp();
        if (mo138139Rj == 0) {
            i11 = c27352b.f128640a;
        } else {
            i11 = c27352b.f128642c;
        }
        interfaceC26857b4.mo138162e9(i11, c27352b.f128644e, z11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Er */
    public /* synthetic */ void m145375Er() {
        if (this.f134971F == null) {
            m145393Nq();
        } else {
            m145492Gr();
        }
    }

    /* renamed from: Fq */
    private void m145376Fq() {
        if (this.f134971F.m116854J() && !((InterfaceC26857b) m103742Dp()).mo138122ID(6)) {
            int i11 = this.f134981P;
            if (i11 > 0) {
                this.f134981P = i11 - 1;
            } else {
                mo138084ap(true);
            }
        }
    }

    /* renamed from: Fr */
    private void m145377Fr() {
        if (this.f134971F.m116905o() != null && !this.f134971F.m116905o().isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            for (C25942f c25942f : new ArrayList(this.f134971F.m116905o())) {
                ContactProfile contactProfile = new ContactProfile(String.valueOf(c25942f.m133661k()));
                contactProfile.f42437s = c25942f.m133656f();
                contactProfile.f42446v = c25942f.m133653b();
                arrayList.add(contactProfile);
            }
            m145396Or(0);
            final int m116897k = this.f134971F.m116897k();
            final int i11 = 10;
            HandlerC32324p.m156352e(new Runnable() { // from class: wo0.l
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.this.m145452jr(arrayList, m116897k, i11);
                }
            }, IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
            try {
                C0815e1.m2075D().m2100V(new C23648e(24, "call_drop", 0, "gr_call_start", String.valueOf(this.f134971F.m116897k())), false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Gq */
    private boolean m145378Gq(int i11) {
        return this.f134989X.m97972c(i11);
    }

    /* renamed from: Hq */
    private void m145379Hq() {
        if (!this.f134971F.m116842D() && !this.f134971F.m116865O0() && this.f134971F.m116854J()) {
            if (AbstractC23304d.f113327S1) {
                ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29118a0.this.m145437er();
                    }
                });
            } else {
                AbstractC32273e3.m155748Q().mo155838P0(!this.f134971F.m116850H());
            }
            this.f134971F.m116847F0(true);
        }
    }

    /* renamed from: Iq */
    private void m145381Iq() {
        if (!((InterfaceC26857b) m103742Dp()).mo138144Uf() && this.f134986U && this.f134971F.m116919v() < AbstractC23304d.f113331T1 && this.f134989X.m97980k() > this.f134971F.m116893i()) {
            ((InterfaceC26857b) m103742Dp()).mo138173km();
            this.f134971F.m116843D0();
        }
    }

    /* renamed from: Jq */
    private void m145383Jq() {
        if (m145434dr()) {
            ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.s
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.this.m145440fr();
                }
            });
        }
    }

    /* renamed from: Jr */
    private void m145384Jr() {
        try {
            Iterator it = this.f134989X.m97975f().iterator();
            while (it.hasNext()) {
                ((InterfaceC26857b) m103742Dp()).mo138137R6(((C21791f) it.next()).m112477l());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Kq */
    private void m145386Kq() {
        Message message = new Message();
        message.what = 5;
        ((InterfaceC26857b) m103742Dp()).mo138125Jv(message, 0L);
    }

    /* renamed from: L4 */
    private void m145387L4(String str, int i11) {
        if (this.f134971F.m116850H()) {
            this.f135009t.mo155785B2(str, i11);
        }
    }

    /* renamed from: Lq */
    private void m145388Lq() {
        C21790e c21790e;
        C18557q c18557q = this.f134996e0;
        if (c18557q != null && !c18557q.m97966f()) {
            this.f134995d0.clear();
            Iterator it = this.f134996e0.m97964d().iterator();
            while (it.hasNext()) {
                ContactProfile contactProfile = (ContactProfile) it.next();
                if (contactProfile != null) {
                    if (contactProfile.m40366G0()) {
                        c21790e = new C21790e(contactProfile.f42434r, 0);
                        c21790e.f105764a = contactProfile;
                    } else {
                        c21790e = new C21790e(4, contactProfile.f42407e1, contactProfile.f42437s);
                    }
                    this.f134995d0.add(c21790e);
                }
            }
            this.f134995d0.add(0, new C21790e(1, false, AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_add_partner_select_list_title) + " (" + this.f134995d0.size() + ")"));
            m145462ms();
        }
    }

    /* renamed from: Lr */
    private void m145389Lr() {
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.h
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145489zr();
            }
        });
    }

    /* renamed from: Mq */
    private synchronized void m145391Mq() {
        try {
            ((InterfaceC26857b) m103742Dp()).mo138150XH(false);
            if (this.f134972G != null) {
                this.f134977L = true;
                AbstractC3096i0.f13168l = true;
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "Start quit timer");
                if (AbstractC3096i0.f13172p) {
                    this.f134982Q = 0;
                    AbstractC3096i0.f13172p = false;
                }
                this.f134972G.schedule(new f(), this.f134982Q);
                this.f134972G.schedule(new e(), this.f134982Q + 1000);
            } else {
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "Finish call screen");
                AbstractC3096i0.f13159c = false;
                m145406Sq();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: Nq */
    private synchronized void m145393Nq() {
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "Calling delayedQuit");
        m145391Mq();
    }

    /* renamed from: Oq */
    private void m145395Oq(List list) {
        m145368Aq();
        m145398Pq(list, 3);
        m145398Pq(list, -1);
    }

    /* renamed from: Or */
    private void m145396Or(int i11) {
        ((InterfaceC26857b) m103742Dp()).removeCallbacks(this.f135008q0);
        if (i11 > 0) {
            ((InterfaceC26857b) m103742Dp()).mo78955kl(this.f135008q0, i11);
        } else {
            ((InterfaceC26857b) m103742Dp()).mo138194yg(this.f135008q0);
        }
    }

    /* renamed from: Pq */
    private void m145398Pq(List list, int i11) {
        C21791f c21791f;
        if (!this.f134986U && (c21791f = this.f134990Y) != null && c21791f.m112477l() != -1) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25942f c25942f = (C25942f) it.next();
            int m133661k = c25942f.m133661k();
            C21791f c21791f2 = new C21791f(c25942f);
            c21791f2.m112459B(m145373Dq(c25942f.m133663m(), this.f134986U, ((InterfaceC26857b) m103742Dp()).mo138118F2()));
            if (!this.f134991Z.contains(Integer.valueOf(m133661k)) && !this.f134989X.m97972c(m133661k) && (i11 == -1 || i11 == c21791f2.m112473h())) {
                if (m133661k == Integer.parseInt(CoreUtility.f89233i)) {
                    c21791f2.m112491z(!this.f134971F.m116848G());
                }
                C21791f c21791f3 = this.f134990Y;
                if (c21791f3 == null || (c21791f3.m112477l() == -1 && c21791f2.m112477l() != C21334l.f103899A.m110500a())) {
                    this.f134990Y = c21791f2;
                }
                this.f134991Z.add(Integer.valueOf(m133661k));
                this.f134989X.m97970a(c21791f2);
                ((InterfaceC26857b) m103742Dp()).mo138193xH(c21791f2);
            }
        }
        m145381Iq();
    }

    /* renamed from: Qq */
    private C25942f m145400Qq(List list) {
        Iterator it = list.iterator();
        C25942f c25942f = null;
        while (it.hasNext()) {
            C25942f c25942f2 = (C25942f) it.next();
            int m133661k = c25942f2.m133661k();
            if (!this.f134991Z.contains(Integer.valueOf(m133661k)) && m133661k != Integer.parseInt(CoreUtility.f89233i)) {
                if (c25942f2.m133659i() == 3) {
                    return c25942f2;
                }
                c25942f = c25942f2;
            }
        }
        return c25942f;
    }

    /* renamed from: Qr */
    private void m145401Qr() {
        for (int i11 = 0; i11 < this.f134989X.m97980k(); i11++) {
            C21791f m97974e = this.f134989X.m97974e(i11);
            if (m97974e.m112477l() != Integer.parseInt(CoreUtility.f89233i)) {
                C25942f c25942f = (C25942f) this.f134966A.m102392S().get(Integer.valueOf(m97974e.m112477l()));
                if (c25942f != null) {
                    this.f134989X.m97979j(m97974e, new C21791f(c25942f));
                } else {
                    C25942f m145400Qq = m145400Qq(this.f134966A.m102407a0());
                    if (m145400Qq != null) {
                        C21791f c21791f = new C21791f(m145400Qq);
                        this.f134989X.m97979j(m97974e, c21791f);
                        ((InterfaceC26857b) m103742Dp()).mo138152Yb(m97974e, c21791f);
                    } else {
                        ((InterfaceC26857b) m103742Dp()).mo138159dG(m97974e);
                    }
                }
            }
        }
        m145395Oq(this.f134966A.m102401X());
    }

    /* renamed from: Rq */
    private C21791f m145403Rq(int i11) {
        C25942f c25942f = (C25942f) this.f134966A.m102392S().get(Integer.valueOf(i11));
        if (c25942f != null) {
            return new C21791f(c25942f);
        }
        return null;
    }

    /* renamed from: Rr */
    private void m145404Rr() {
        if (this.f134986U) {
            this.f134991Z.clear();
            this.f134991Z = new HashSet(this.f134989X.m97977h());
        } else {
            this.f134991Z.clear();
            this.f134991Z.add(Integer.valueOf(this.f134990Y.m112477l()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sq */
    public void m145406Sq() {
        this.f134976K = true;
        ((InterfaceC26857b) m103742Dp()).mo138166g3();
        AbstractC3096i0.f13173q = true;
    }

    /* renamed from: Sr */
    private void m145407Sr() {
        String str;
        boolean z11;
        m145438es();
        if ((AbstractC3096i0.f13170n || AbstractC3096i0.f13171o) && (this.f135014y.m155709b() || this.f135014y.m155708a())) {
            HandlerC32324p.m156352e(new a(), ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
        ContactProfile m141809c = C28203u6.f131407a.m141809c(CoreUtility.f89233i);
        InterfaceC26857b interfaceC26857b = (InterfaceC26857b) m103742Dp();
        if (m141809c == null) {
            str = C23302b.f113247a.m120521a();
        } else {
            str = m141809c.f42446v;
        }
        boolean z12 = false;
        if (this.f134966A.m102409b0() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f134966A.m102445v() == 1) {
            z12 = true;
        }
        interfaceC26857b.mo138145Ul(str, z11, z12, this.f134971F.m116885e());
    }

    /* renamed from: Tq */
    private void m145409Tq() {
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "Force to quit UI Incoming");
        m145391Mq();
        m145371Cq();
    }

    /* renamed from: Tr */
    private void m145410Tr(boolean z11, boolean z12) {
        m145414Vr(C21334l.f103899A.m110500a(), z11, z12);
    }

    /* renamed from: Ul */
    private boolean m145411Ul() {
        return this.f134971F.m116877a();
    }

    /* renamed from: Ur */
    private void m145412Ur(int i11, boolean z11) {
        C21791f m97976g = this.f134989X.m97976g(i11);
        if (m97976g != null) {
            m97976g.m112486u(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Vq */
    public ContactProfile m145413Vq(String str, String str2, String str3) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c == null || TextUtils.isEmpty(m141809c.f42437s) || TextUtils.isEmpty(m141809c.f42446v)) {
            m141809c = new ContactProfile(str);
            m141809c.f42437s = str2;
            m141809c.f42446v = str3;
            m141809c.f42330D = System.currentTimeMillis();
            C7960e.m41971c6().m42221O7(m141809c, false);
        }
        if (CoreUtility.f89233i.equals(str)) {
            ContactProfile contactProfile = new ContactProfile(str);
            contactProfile.f42437s = str2;
            contactProfile.f42446v = str3;
            contactProfile.f42330D = System.currentTimeMillis();
            return contactProfile;
        }
        return m141809c;
    }

    /* renamed from: Vr */
    private void m145414Vr(int i11, boolean z11, boolean z12) {
        C21791f m97976g = this.f134989X.m97976g(i11);
        if (m97976g != null) {
            m97976g.m112486u(z11);
            m97976g.m112490y(z12);
        }
    }

    /* renamed from: Wr */
    private void m145416Wr(int i11, boolean z11) {
        C21791f m97976g = this.f134989X.m97976g(i11);
        if (m97976g != null) {
            m97976g.m112490y(z11);
        }
    }

    /* renamed from: Xr */
    private void m145418Xr(int i11, int i12) {
        C21791f m97976g = this.f134989X.m97976g(i11);
        if (m97976g != null) {
            m97976g.m112461D(i12);
        }
    }

    /* renamed from: Yr */
    private C21791f m145420Yr() {
        if (this.f134989X.m97980k() >= 2) {
            return this.f134989X.m97974e(1);
        }
        if (this.f134989X.m97980k() == 1) {
            return this.f134989X.m97974e(0);
        }
        return new C21791f(2);
    }

    /* renamed from: Zq */
    private void m145422Zq() {
        m145395Oq(this.f134966A.m102401X());
        m145381Iq();
    }

    /* renamed from: Zr */
    private void m145423Zr(C26350a c26350a) {
        C22592c m156362c = this.f135012w.m156362c();
        this.f134971F = m156362c;
        if (m156362c == null) {
            m145406Sq();
        }
        if (!this.f134971F.m116925y()) {
            this.f134971F.m116876Z(6);
        }
        this.f134970E = this.f135010u.m156334u();
        this.f134969D = c26350a;
        this.f134968C = C26351b.m135671a();
        ((InterfaceC26857b) m103742Dp()).mo138130Mq(this.f134968C);
    }

    /* renamed from: ar */
    private boolean m145425ar(int i11) {
        if (!this.f134986U && this.f134990Y.m112477l() == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: as */
    private void m145426as(String str, String str2) {
        try {
            this.f135010u.m156319h0();
            this.f135010u.m156316e0();
            this.f135010u.m156307V();
            this.f134982Q = 2147473647;
            this.f134971F.m116845E0(true);
            m145435ds();
            m145391Mq();
            mo138110v0(200L);
            ((InterfaceC26857b) m103742Dp()).mo138146V6(str, str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: br */
    private boolean m145428br(int i11) {
        C25942f m102360B = this.f134966A.m102360B(i11);
        if (m102360B != null && m102360B.m133659i() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: bs */
    private void m145429bs() {
        this.f134988W = true;
        ((InterfaceC26857b) m103742Dp()).mo138169gf();
    }

    /* renamed from: cr */
    private boolean m145431cr(int i11) {
        return i11 == 6 || i11 == 21;
    }

    /* renamed from: cs */
    private void m145432cs(int i11) {
        ((InterfaceC26857b) m103742Dp()).mo78955kl(this.f135007p0, i11);
    }

    /* renamed from: dr */
    private boolean m145434dr() {
        return VoipAudioHelper.m155575V();
    }

    /* renamed from: ds */
    private void m145435ds() {
        this.f135010u.m156316e0();
        ((InterfaceC26857b) m103742Dp()).removeCallbacks(this.f135007p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: er */
    public /* synthetic */ void m145437er() {
        Bundle bundle = new Bundle();
        bundle.putString("group_id", String.valueOf(this.f134971F.m116897k()));
        boolean z11 = false;
        bundle.putInt("preview_cam_dialog_source", 0);
        ((InterfaceC26857b) m103742Dp()).mo138179oE(4, bundle);
        ((InterfaceC26857b) m103742Dp()).mo138177mt(true, this.f134971F.m116854J());
        if (this.f134966A.m102445v() == 1) {
            z11 = true;
        }
        m145410Tr(true, z11);
    }

    /* renamed from: es */
    private void m145438es() {
        if (AbstractC3096i0.m15509Q()) {
            this.f135009t.mo155914r2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fr */
    public /* synthetic */ void m145440fr() {
        ((InterfaceC26857b) m103742Dp()).mo138138RD(true);
    }

    /* renamed from: fs */
    private void m145441fs(String str, int i11) {
        if (!this.f134971F.m116850H()) {
            this.f135009t.mo155781A2(str, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gr */
    public /* synthetic */ void m145443gr(List list) {
        ((InterfaceC26857b) m103742Dp()).mo138178nr(list, this.f134991Z);
    }

    /* renamed from: gs */
    private boolean m145444gs(C21791f c21791f, C21791f c21791f2) {
        if (this.f134990Y.m112477l() == c21791f.m112477l()) {
            this.f134990Y = c21791f2;
        }
        if (!this.f134989X.m97972c(c21791f.m112477l())) {
            return false;
        }
        if (this.f134989X.m97973d(c21791f2)) {
            this.f134989X.m97981l(c21791f, c21791f2);
            return true;
        }
        this.f134989X.m97979j(c21791f, c21791f2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hr */
    public /* synthetic */ void m145446hr() {
        ((InterfaceC26857b) m103742Dp()).mo138153Z2();
        m145391Mq();
    }

    /* renamed from: hs */
    private void m145447hs(boolean z11) {
        C21791f m97976g = this.f134989X.m97976g(C21334l.f103899A.m110500a());
        if (m97976g != null) {
            m97976g.m112491z(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ir */
    public /* synthetic */ void m145449ir() {
        if (this.f134971F.m116869S()) {
            m145497Wq(this.f135002k0);
        } else {
            m145496Uq();
        }
        m145499Yq();
    }

    /* renamed from: is */
    private void m145450is() {
        boolean z11;
        if (!this.f134971F.m116838B() && !this.f134971F.m116854J()) {
            z11 = false;
        } else {
            z11 = true;
        }
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "Speaker setSelected: " + z11);
        ((InterfaceC26857b) m103742Dp()).mo138168gd(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jr */
    public /* synthetic */ void m145452jr(ArrayList arrayList, int i11, int i12) {
        AbstractC23306f.m120725x0().m101508a(new C2280b.a(arrayList, i11, this.f134971F.m116899l(), this.f134971F.m116895j(), i12, null));
    }

    /* renamed from: js */
    private void m145453js(final boolean z11) {
        final C27352b mo138167g5 = ((InterfaceC26857b) m103742Dp()).mo138167g5();
        if (mo138167g5 == null || this.f134971F.m116838B()) {
            return;
        }
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.t
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145374Dr(mo138167g5, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kr */
    public /* synthetic */ void m145455kr() {
        if (this.f134971F.m116844E() && !this.f135010u.m156303P()) {
            this.f135010u.m156313b0();
        }
    }

    /* renamed from: ks */
    private void m145456ks() {
        String m15477A = AbstractC3096i0.m15477A(this.f134971F.m116869S(), this.f134971F.m116899l());
        ((InterfaceC26857b) m103742Dp()).mo138127Ll(m15477A);
        if (!this.f135000i0) {
            this.f134999h0 = m15477A;
        }
    }

    /* renamed from: lp */
    private void m145457lp() {
        List<C25942f> m102407a0 = this.f134966A.m102407a0();
        if (m102407a0 == null || m102407a0.size() == 0) {
            m102407a0 = this.f134971F.m116905o();
        }
        final ArrayList arrayList = new ArrayList();
        for (C25942f c25942f : m102407a0) {
            if (c25942f.m133661k() != this.f134966A.m102388Q()) {
                arrayList.add(C28203u6.f131407a.m141809c(String.valueOf(c25942f.m133661k())));
            }
        }
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.a
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145372Cr(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lr */
    public /* synthetic */ void m145459lr() {
        this.f135010u.m156330r0();
        this.f134982Q = 0;
        m145391Mq();
    }

    /* renamed from: ls */
    private void m145460ls(String str) {
        ((InterfaceC26857b) m103742Dp()).mo138127Ll(str);
        if (!this.f135000i0 && !TextUtils.isEmpty(str)) {
            this.f134999h0 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ms */
    public void m145462ms() {
        ContactProfile contactProfile;
        if (!this.f135005n0 && !this.f135003l0) {
            try {
                ArrayList arrayList = new ArrayList(this.f134997f0);
                Iterator it = new ArrayList(this.f134995d0).iterator();
                while (it.hasNext()) {
                    C21790e c21790e = (C21790e) it.next();
                    if (c21790e != null && (contactProfile = c21790e.f105764a) != null && arrayList.contains(contactProfile.f42434r)) {
                        c21790e.f105764a.f42430p1 = true;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            m145495Pr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nr */
    public /* synthetic */ void m145464nr() {
        ((InterfaceC26857b) m103742Dp()).mo138160dq(this.f134971F.m116850H());
        ((InterfaceC26857b) m103742Dp()).mo138135Qc(this.f134971F.m116836A(), !this.f134971F.m116848G(), this.f134971F.m116842D());
        if (this.f134971F.m116842D()) {
            m145368Aq();
        }
    }

    /* renamed from: ns */
    private void m145465ns() {
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.u
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145375Er();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: or */
    public /* synthetic */ void m145467or() {
        ((InterfaceC26857b) m103742Dp()).mo138135Qc(this.f134971F.m116836A(), !this.f134971F.m116848G(), this.f134971F.m116842D());
        if (this.f134971F.m116842D()) {
            m145368Aq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pr */
    public /* synthetic */ void m145469pr() {
        ((InterfaceC26857b) m103742Dp()).mo138151Xw(this.f134971F.m116885e(), this.f134971F.m116842D(), this.f134971F.m116864O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qr */
    public /* synthetic */ void m145471qr(boolean z11) {
        ((InterfaceC26857b) m103742Dp()).mo138120Gi();
        m145491Eq(z11);
        try {
            C0815e1.m2075D().m2100V(new C23648e(24, "in_call", 1, "gr_call_speaker_view", String.valueOf(!z11 ? 1 : 0)), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rr */
    public /* synthetic */ void m145473rr(C25942f c25942f) {
        ((InterfaceC26857b) m103742Dp()).mo138140SG(c25942f.m133661k());
        ((InterfaceC26857b) m103742Dp()).mo138190ux(m145498Xq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sr */
    public /* synthetic */ void m145475sr() {
        ((InterfaceC26857b) m103742Dp()).mo138190ux(m145498Xq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tr */
    public /* synthetic */ void m145477tr() {
        ((InterfaceC26857b) m103742Dp()).mo138190ux(m145498Xq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ur */
    public /* synthetic */ void m145479ur(boolean z11) {
        ((InterfaceC26857b) m103742Dp()).mo138116Bs(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vr */
    public /* synthetic */ void m145481vr() {
        ((InterfaceC26857b) m103742Dp()).mo138190ux(m145498Xq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wr */
    public /* synthetic */ void m145483wr(C25942f c25942f) {
        ((InterfaceC26857b) m103742Dp()).mo138187tp(new C21791f(c25942f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xr */
    public /* synthetic */ void m145485xr(boolean z11) {
        if (z11) {
            ((InterfaceC26857b) m103742Dp()).mo138155bn();
        } else {
            ((InterfaceC26857b) m103742Dp()).mo138171hq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yr */
    public /* synthetic */ void m145487yr(C25942f c25942f) {
        ((InterfaceC26857b) m103742Dp()).mo138140SG(c25942f.m133661k());
        ((InterfaceC26857b) m103742Dp()).mo138190ux(m145498Xq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zr */
    public /* synthetic */ void m145489zr() {
        ((InterfaceC26857b) m103742Dp()).mo138183qb(this.f134971F.m116842D());
        ((InterfaceC26857b) m103742Dp()).mo138161dt(!this.f134971F.m116848G());
        ((InterfaceC26857b) m103742Dp()).mo138185rv(this.f134971F.m116889g());
        mo138055Ad(((InterfaceC26857b) m103742Dp()).mo138167g5());
        if (!this.f134985T) {
            this.f134985T = true;
            m145422Zq();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: A0 */
    public void mo138054A0(final int i11) {
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "onUpdateCameraButtonState: state - " + i11 + " isOffCam - " + this.f134971F.m116850H());
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.k
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145369Ar(i11);
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ad */
    public void mo138055Ad(C27352b c27352b) {
        if (!((InterfaceC26857b) m103742Dp()).mo138118F2()) {
            RectF m15651a0 = AbstractC3104p.m15651a0();
            c27352b.f128640a = (int) m15651a0.left;
            c27352b.f128641b = (int) m15651a0.top;
            c27352b.f128642c = (int) m15651a0.right;
            c27352b.f128643d = (int) m15651a0.bottom;
            c27352b.f128644e = AbstractC3104p.m15673l0();
            c27352b.f128645f = AbstractC3104p.m15669j0(((InterfaceC26857b) m103742Dp()).mo138149Wm());
            ((InterfaceC26857b) m103742Dp()).mo138189ud(c27352b, this.f134971F.m116911r());
        }
        m145453js(true);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ao */
    public void mo138056Ao() {
        this.f135009t.mo116930b(-15);
    }

    /* renamed from: Bq */
    public void m145490Bq(int i11) {
        int i12;
        if (((InterfaceC26857b) m103742Dp()).mo138182pj()) {
            this.f135009t.m155905o2(Integer.toString(40001));
            AbstractC32273e3 abstractC32273e3 = this.f135009t;
            if (i11 == 3) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            abstractC32273e3.mo116931c(i12);
            ((InterfaceC26857b) m103742Dp()).mo138121Gv();
            return;
        }
        ((InterfaceC26857b) m103742Dp()).mo138154Zr();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Cg */
    public boolean mo138057Cg() {
        if (this.f134971F != null && this.f135009t.m155818K0()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Dd */
    public ArrayList mo138058Dd() {
        return this.f134994c0;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Dh */
    public boolean mo138059Dh(boolean z11) {
        return !z11;
    }

    /* renamed from: Eq */
    public void m145491Eq(boolean z11) {
        EnumC23412c enumC23412c;
        try {
            this.f134986U = z11;
            if (z11) {
                m145395Oq(this.f134966A.m102401X());
                ((InterfaceC26857b) m103742Dp()).mo138133Pc();
            } else {
                ((InterfaceC26857b) m103742Dp()).mo138181pe();
            }
            if (this.f134990Y.m112477l() == -1) {
                this.f134990Y = m145420Yr();
            }
            for (int i11 = 0; i11 < this.f134989X.m97980k(); i11++) {
                C21791f m97974e = this.f134989X.m97974e(i11);
                if (this.f134986U) {
                    ((InterfaceC26857b) m103742Dp()).mo138186tF(true, m97974e, EnumC23412c.f113762r.ordinal());
                } else if (this.f134990Y.m112477l() == m97974e.m112477l()) {
                    InterfaceC26857b interfaceC26857b = (InterfaceC26857b) m103742Dp();
                    if (((InterfaceC26857b) m103742Dp()).mo138118F2()) {
                        enumC23412c = EnumC23412c.f113761q;
                    } else {
                        enumC23412c = EnumC23412c.f113763s;
                    }
                    interfaceC26857b.mo138186tF(true, m97974e, enumC23412c.ordinal());
                } else {
                    ((InterfaceC26857b) m103742Dp()).mo138186tF(false, m97974e, EnumC23412c.f113760p.ordinal());
                }
            }
            m145404Rr();
            ((InterfaceC26857b) m103742Dp()).mo138114B9(this.f134991Z);
            if (!this.f134986U) {
                ((InterfaceC26857b) m103742Dp()).mo138156bv();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: F2 */
    public void mo994F2() {
        super.mo994F2();
        m145384Jr();
        Timer timer = this.f134972G;
        if (timer != null) {
            timer.cancel();
            this.f134972G.purge();
            this.f134972G = null;
        }
        if (!AbstractC3096i0.m15513S()) {
            this.f134966A.m102432n1();
        }
        this.f134977L = false;
        this.f134985T = false;
        this.f134989X.m97971b();
        this.f134991Z.clear();
        if (!AbstractC3096i0.f13165i && this.f134971F.m116927z()) {
            C23744a.m124114c().m124116d(41, new Object[0]);
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Gc */
    public void mo138060Gc() {
        if (mo138089e8()) {
            mo138056Ao();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* renamed from: Gr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m145492Gr() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String str;
        String str2;
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "notifyCallStateChange " + this.f134971F.m116885e());
        ((InterfaceC26857b) m103742Dp()).mo138170hm(this.f134971F.m116909q());
        m145456ks();
        ((InterfaceC26857b) m103742Dp()).mo138150XH(this.f134971F.m116927z() ^ true);
        InterfaceC26857b interfaceC26857b = (InterfaceC26857b) m103742Dp();
        if (this.f134966A.m102445v() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        interfaceC26857b.mo138124Jl(z11);
        InterfaceC26857b interfaceC26857b2 = (InterfaceC26857b) m103742Dp();
        if (this.f134966A.m102409b0() == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        interfaceC26857b2.mo138177mt(z12, this.f134971F.m116854J());
        if (this.f134966A.m102409b0() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f134966A.m102445v() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        m145410Tr(z13, z14);
        m145450is();
        int m116885e = this.f134971F.m116885e();
        int m116891h = this.f134971F.m116891h();
        switch (m116885e) {
            case 1:
            case 2:
                if (this.f134971F.m116846F()) {
                    m145435ds();
                    this.f135010u.m156315d0();
                }
                ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29118a0.this.m145464nr();
                    }
                });
                break;
            case 3:
                if (this.f134971F.m116864O()) {
                    this.f134971F.m116876Z(7);
                    break;
                } else {
                    ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29118a0.this.m145467or();
                        }
                    });
                    break;
                }
            case 4:
                if (this.f134971F.m116864O()) {
                    this.f134971F.m116876Z(7);
                    break;
                }
                break;
            case 5:
                if (!this.f134975J) {
                    m145389Lr();
                    m145368Aq();
                    this.f134982Q = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                    this.f134975J = true;
                    this.f134971F.m116898k0(true);
                }
                m145379Hq();
                break;
            case 6:
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "Update disconnected state!");
                mo138110v0(0L);
                ((InterfaceC26857b) m103742Dp()).mo138157cC(false);
                ((InterfaceC26857b) m103742Dp()).mo138181pe();
                if (m116891h != 1) {
                    if (m116891h != 2) {
                        if (m116891h != 3) {
                            if (m116891h != 4) {
                                if (m116891h != 5) {
                                    if (m116891h == 90) {
                                        str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_groupcall_ended_call_status);
                                        this.f135001j0 = true;
                                        str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_join_ended_popup_btn);
                                    }
                                }
                            } else {
                                AbstractC3096i0.m15520V0(AbstractC8020f0.str_call_host_connect_failed_noti_text);
                            }
                        } else {
                            this.f135001j0 = true;
                            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_no_partner_call_status);
                            str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_groupcall_no_partner_callback_button);
                        }
                        if (!this.f135001j0) {
                            this.f135000i0 = true;
                            m145426as(str, str2);
                            ((InterfaceC26857b) m103742Dp()).mo138128Lr(this.f134998g0);
                            m145460ls(this.f134999h0);
                            return;
                        }
                        AbstractC3082b0.m15421c("VOIP_CallPresenter", "Active call session is disconnected or null wait for quit...");
                        m145393Nq();
                        break;
                    }
                    AbstractC3096i0.m15520V0(AbstractC8020f0.str_call_disconnect_noti_text);
                } else {
                    AbstractC3096i0.m15520V0(AbstractC8020f0.str_call_host_initzrtp_failed_noti_text);
                }
                str = "";
                str2 = "";
                if (!this.f135001j0) {
                }
        }
        this.f134966A.m102443u();
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.z
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145469pr();
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: I4 */
    public void mo138061I4(int i11, final C25942f c25942f, C25942f c25942f2) {
        if (c25942f != null && this.f134971F.m116854J()) {
            this.f134985T = true;
            C21791f c21791f = new C21791f(c25942f);
            if (m145378Gq(c25942f.m133661k())) {
                ((InterfaceC26857b) m103742Dp()).mo138126KD(c21791f);
            } else if (this.f134986U) {
                this.f134991Z.add(Integer.valueOf(c21791f.m112477l()));
                this.f134989X.m97970a(c21791f);
                m145381Iq();
                ((InterfaceC26857b) m103742Dp()).mo138193xH(c21791f);
                m145395Oq(this.f134966A.m102401X());
            }
            mo138065Jc();
            ContactProfile contactProfile = new ContactProfile(String.valueOf(c25942f.m133661k()));
            contactProfile.f42437s = c25942f.m133656f();
            contactProfile.f42446v = c25942f.m133653b();
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_groupcall_share_screen_start_other), c25942f2.m133657g(10)));
                        if (this.f134986U || !m145425ar(c25942f.m133661k())) {
                            if (!((InterfaceC26857b) m103742Dp()).mo138118F2()) {
                                m145491Eq(false);
                            }
                            mo138074Pn(c25942f.m133661k());
                        }
                    }
                } else {
                    ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_join_incall_toast), c25942f.m133657g(10)));
                }
            } else if (c25942f2.m133661k() == Integer.parseInt(CoreUtility.f89233i)) {
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_add_partner_noti_text), c25942f.m133657g(10)));
            } else {
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_inform_add_partner_noti_text), c25942f.m133657g(10), c25942f2.m133657g(10)));
            }
            ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.this.m145473rr(c25942f);
                }
            });
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: I5 */
    public void mo138062I5(int i11) {
        C27352b mo138167g5 = ((InterfaceC26857b) m103742Dp()).mo138167g5();
        if (mo138167g5 == null) {
            return;
        }
        mo138055Ad(mo138167g5);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ib */
    public void mo138063Ib() {
        mo138096ie(1, new Object[0]);
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Ir, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C26350a c26350a, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(c26350a, interfaceC19968g);
        this.f134985T = false;
        m145438es();
        this.f134972G = new Timer("Quit-timer");
        m145423Zr(c26350a);
        ((InterfaceC26857b) m103742Dp()).mo138158cd(1000);
        if (mo138087c1()) {
            C32318n3.m156214E().m156256Q();
        } else {
            AbstractC3096i0.m15548l(false);
        }
        AbstractC3096i0.f13173q = false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: J7 */
    public void mo138064J7(Object... objArr) {
        if (objArr != null) {
            try {
                AbstractC3082b0.m15424f("VOIP_CallPresenter", "ACTION_FORCE_QUIT_ACTIVITY");
                ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29118a0.this.m145446hr();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Jc */
    public void mo138065Jc() {
        final ArrayList arrayList = new ArrayList();
        for (C25942f c25942f : this.f134966A.m102401X()) {
            if (c25942f.m133661k() != Integer.parseInt(CoreUtility.f89233i)) {
                arrayList.add(new C21791f(c25942f));
            }
        }
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.o
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145443gr(arrayList);
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ki */
    public void mo138066Ki() {
        AbstractC3096i0.m15552n();
        if (AbstractC3103o.m15619h(29)) {
            C32318n3.m156214E().m156262u();
        } else {
            C32318n3.m156214E().m156254M(false);
        }
        if (this.f134971F.m116838B() && !mo138087c1()) {
            m145490Bq(3);
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ld */
    public void mo138067Ld(final boolean z11) {
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.p
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145485xr(z11);
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Mn */
    public void mo138068Mn(Boolean bool) {
        if (bool.booleanValue()) {
            this.f134987V = mo138085be();
            m145491Eq(false);
            ((InterfaceC26857b) m103742Dp()).mo138181pe();
        } else {
            boolean mo138085be = mo138085be();
            boolean z11 = this.f134987V;
            if (mo138085be == z11) {
                z11 = mo138085be();
            }
            m145491Eq(z11);
        }
    }

    /* renamed from: Mr */
    public boolean m145494Mr(int i11, int i12) {
        if (i11 == i12) {
            return false;
        }
        try {
            C21791f m145403Rq = m145403Rq(i11);
            if (m145403Rq == null) {
                m145403Rq = this.f134989X.m97976g(i11);
            }
            C21791f m145403Rq2 = m145403Rq(i12);
            if (m145403Rq != null && m145403Rq2 != null) {
                m145444gs(m145403Rq, m145403Rq2);
                m145404Rr();
                ((InterfaceC26857b) m103742Dp()).mo138136Qd(this.f134991Z);
                ((InterfaceC26857b) m103742Dp()).mo138188uc(m145403Rq, m145403Rq2);
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: N7 */
    public void mo138069N7(boolean z11) {
        int i11;
        if (z11) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        try {
            this.f135009t.mo155915s(this.f134971F, i11, 1);
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VOIP_CallPresenter", "Can't adjust volume", e11);
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ok */
    public void mo138070Ok(int i11, Object... objArr) {
        if (!this.f134977L && this.f134971F != null) {
            if (i11 != 1003) {
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "callStateReceiver: action = " + i11 + ", isQuitting = " + this.f134977L);
            }
            if (i11 != 1001) {
                if (i11 == 1003 && objArr != null && objArr.length >= 1) {
                    String str = (String) objArr[0];
                    if (this.f135009t.m155815J0()) {
                        ((InterfaceC26857b) m103742Dp()).mo138131Nk(str, this.f134971F);
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC3082b0.m15421c("VOIP_CallPresenter", "Update UI from call state: " + this.f134971F.m116885e());
            m145465ns();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ol */
    public boolean mo138071Ol(boolean z11) {
        if (!z11 && (this.f134966A.m102409b0() == 1 || this.f134966A.m102445v() == 1)) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: P8 */
    public void mo138072P8() {
        m145376Fq();
        ((InterfaceC26857b) m103742Dp()).mo138158cd(1000);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Pk */
    public void mo138073Pk(boolean z11, boolean z12) {
        long j11;
        if ((((InterfaceC26857b) m103742Dp()).mo138176m1() && z11) || z11 == this.f134974I) {
            return;
        }
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "hideShowVideoView " + z11);
        this.f134974I = z11;
        if (!this.f134986U) {
            m145453js(z12);
        }
        if (z11 && ((InterfaceC26857b) m103742Dp()).mo138192xF()) {
            if (z12) {
                j11 = 0;
            } else {
                j11 = 200;
            }
            mo138110v0(j11);
        }
        if (z11) {
            ((InterfaceC26857b) m103742Dp()).mo138180ok();
        } else {
            ((InterfaceC26857b) m103742Dp()).mo138175ly();
            this.f134981P = 7;
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Pn */
    public void mo138074Pn(int i11) {
        if (i11 != -1) {
            try {
                if (this.f134990Y.m112477l() != -1 && m145494Mr(this.f134990Y.m112477l(), i11)) {
                    ((InterfaceC26857b) m103742Dp()).mo138186tF(true, this.f134989X.m97976g(i11), EnumC23412c.f113763s.ordinal());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: Pr */
    public void m145495Pr() {
        try {
            this.f134994c0.clear();
            int size = this.f134995d0.size();
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    ContactProfile contactProfile = ((C21790e) this.f134995d0.get(i11)).f105764a;
                    if (contactProfile != null) {
                        contactProfile.f42399a1.clear();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            this.f134994c0.addAll(this.f134995d0);
            if (this.f135004m0 && this.f134995d0.size() > 10) {
                this.f134994c0.add(new C21790e(3));
            }
            ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.this.m145370Br();
                }
            });
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Ta */
    public void mo138075Ta(final C25942f c25942f) {
        if (c25942f == null) {
            return;
        }
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.m
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145483wr(c25942f);
            }
        });
        mo138065Jc();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Td */
    public void mo138076Td(final boolean z11) {
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.q
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145471qr(z11);
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: U4 */
    public void mo138077U4(String str) {
        new C30189a(str, this.f134995d0, new c(str)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Uq */
    public void m145496Uq() {
        this.f134996e0.m97962b();
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
        int m122127lb = AbstractC23309i.m122127lb();
        int size = mo98465a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                ContactProfile contactProfile = (ContactProfile) mo98465a.get(i11);
                if (!contactProfile.f42434r.equals(CoreUtility.f89233i) && !AbstractC25495a.m132086k(contactProfile.f42434r) && !AbstractC25495a.m132078c(contactProfile.f42434r) && !C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r) && (m122127lb != 1 || contactProfile.f42382U0 != 0)) {
                    contactProfile.f42399a1.clear();
                    this.f134996e0.m97961a(contactProfile);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        m145388Lq();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Va */
    public void mo138078Va() {
        Message message = new Message();
        message.what = 5;
        ((InterfaceC26857b) m103742Dp()).mo138125Jv(message, 30000L);
        ((InterfaceC26857b) m103742Dp()).mo138191v0(200L);
        ((InterfaceC26857b) m103742Dp()).mo138115BC();
        try {
            C0815e1.m2075D().m2100V(new C23648e(24, "in_call", 0, "gr_call_add_member", new String[0]), false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Vi */
    public void mo138079Vi() {
        if (mo138089e8()) {
            this.f135009t.mo155909q0(true);
            return;
        }
        C22592c c22592c = this.f134971F;
        if (c22592c != null && !c22592c.m116842D() && this.f134969D.f125189a == 7) {
            mo138096ie(3, new Object[0]);
            return;
        }
        C22592c c22592c2 = this.f134971F;
        if (c22592c2 != null && !c22592c2.m116842D()) {
            mo138096ie(3, new Object[0]);
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: W1 */
    public void mo138080W1(int i11) {
        if (this.f134971F == null) {
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                AbstractC3082b0.m15421c("VOIP_CallPresenter", "SpeakerChooserDialog.BLUETOOTH");
                VoipAudioHelper.m155538B0(2);
                ((InterfaceC26857b) m103742Dp()).mo138147W1(i11);
                return;
            }
            return;
        }
        AbstractC3082b0.m15421c("VOIP_CallPresenter", "SpeakerChooserDialog.EXTERNAL");
        VoipAudioHelper.m155538B0(1);
        ((InterfaceC26857b) m103742Dp()).mo138147W1(i11);
    }

    /* renamed from: Wq */
    public void m145497Wq(int i11) {
        if (TextUtils.isEmpty(this.f134971F.m116897k() + "") || this.f135003l0) {
            return;
        }
        this.f135002k0 = i11;
        this.f135003l0 = true;
        if (this.f134992a0 == null) {
            C0766k c0766k = new C0766k();
            this.f134992a0 = c0766k;
            c0766k.mo1704o8(new b());
        }
        this.f134992a0.mo1680l6(this.f134971F.m116897k() + "", this.f135002k0);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Xc */
    public void mo138081Xc() {
        mo138110v0(200L);
    }

    /* renamed from: Xq */
    public ArrayList m145498Xq() {
        ContactProfile contactProfile;
        HashMap m102392S = this.f134966A.m102392S();
        Iterator it = new ArrayList(this.f134994c0).iterator();
        while (it.hasNext()) {
            C21790e c21790e = (C21790e) it.next();
            if (c21790e != null && (contactProfile = c21790e.f105764a) != null) {
                int parseInt = Integer.parseInt(contactProfile.f42434r);
                C25942f c25942f = (C25942f) m102392S.get(Integer.valueOf(parseInt));
                if (c25942f == null) {
                    c21790e.m112457e(-1);
                    c21790e.m112456d(false);
                } else if (m102392S.containsKey(Integer.valueOf(parseInt))) {
                    c21790e.m112456d(true);
                    c21790e.m112457e(c25942f.m133659i());
                } else {
                    c21790e.m112456d(false);
                    c21790e.m112457e(-1);
                }
            }
        }
        return this.f134994c0;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Yb */
    public boolean mo138082Yb() {
        if (this.f134971F.m116885e() != 3 && !this.f135001j0) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: Yg */
    public boolean mo138083Yg(boolean z11) {
        return (z11 || this.f134986U || this.f134974I) ? false : true;
    }

    /* renamed from: Yq */
    public void m145499Yq() {
        if (this.f135005n0) {
            return;
        }
        this.f135005n0 = true;
        if (this.f134993b0 == null) {
            C0766k c0766k = new C0766k();
            this.f134993b0 = c0766k;
            c0766k.mo1704o8(new d());
        }
        this.f134993b0.mo1598a9();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: ap */
    public void mo138084ap(boolean z11) {
        mo138073Pk(z11, false);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: be */
    public boolean mo138085be() {
        return this.f134986U;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: bf */
    public void mo138086bf() {
        mo138110v0(200L);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: c1 */
    public boolean mo138087c1() {
        C22592c c22592c = this.f134971F;
        if (c22592c != null && c22592c.m116842D()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: c4 */
    public void mo138088c4(Object... objArr) {
        if (objArr != null && objArr.length >= 3) {
            String str = (String) objArr[0];
            if (this.f134971F.m116869S()) {
                if (TextUtils.equals(this.f134971F.m116897k() + "", str)) {
                    int intValue = ((Integer) objArr[1]).intValue();
                    if (!new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";"))).isEmpty()) {
                        if ((intValue == 3 || intValue == 4) && !this.f135003l0) {
                            m145497Wq(this.f135002k0);
                        }
                    }
                }
            }
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: e8 */
    public boolean mo138089e8() {
        C22592c c22592c = this.f134971F;
        if (c22592c != null && c22592c.m116836A()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: f5 */
    public void mo138090f5(Object... objArr) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = false;
        try {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            if ((intValue2 & 256) == 256) {
                int intValue3 = ((Integer) objArr[4]).intValue();
                C21791f m97976g = this.f134989X.m97976g(intValue);
                if (m97976g != null && m97976g.m112473h() == 3 && intValue3 > 3) {
                    ((InterfaceC26857b) m103742Dp()).mo138134Pd(intValue, intValue3);
                }
                ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29118a0.this.m145481vr();
                    }
                });
            }
            if (intValue2 != 1) {
                if (intValue2 != 16) {
                    if (intValue2 == 17) {
                        int intValue4 = ((Integer) objArr[2]).intValue();
                        int intValue5 = ((Integer) objArr[3]).intValue();
                        InterfaceC26857b interfaceC26857b = (InterfaceC26857b) m103742Dp();
                        if (intValue4 != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (intValue5 != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        interfaceC26857b.mo138117Cf(intValue, z13, z14);
                        if (intValue4 != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (intValue5 != 0) {
                            z16 = true;
                        }
                        m145414Vr(intValue, z15, z16);
                        return;
                    }
                    return;
                }
                int intValue6 = ((Integer) objArr[3]).intValue();
                InterfaceC26857b interfaceC26857b2 = (InterfaceC26857b) m103742Dp();
                if (intValue6 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                interfaceC26857b2.mo138172k7(intValue, z12);
                if (intValue6 != 0) {
                    z16 = true;
                }
                m145412Ur(intValue, z16);
                return;
            }
            int intValue7 = ((Integer) objArr[2]).intValue();
            InterfaceC26857b interfaceC26857b3 = (InterfaceC26857b) m103742Dp();
            if (intValue7 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC26857b3.mo138148W4(intValue, z11);
            if (intValue7 != 0) {
                z16 = true;
            }
            m145416Wr(intValue, z16);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: ga */
    public void mo138091ga(Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 1) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    final C25942f c25942f = (C25942f) objArr[1];
                    ContactProfile contactProfile = new ContactProfile(String.valueOf(c25942f.m133661k()));
                    contactProfile.f42446v = c25942f.m133653b();
                    contactProfile.f42437s = c25942f.m133656f();
                    if (!this.f134971F.m116854J()) {
                        if (this.f134971F.m116838B()) {
                        }
                        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                C29118a0.this.m145487yr(c25942f);
                            }
                        });
                    }
                    if (intValue == -102) {
                        ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_unsupported_incall_noti_text), c25942f.m133657g(10)));
                    } else if (intValue == -101) {
                        ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_blocked_incall_noti_text), c25942f.m133657g(10)));
                    } else if (intValue == -1000) {
                        ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_not_ring_incall_noti_text), c25942f.m133657g(10)));
                    }
                    ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29118a0.this.m145487yr(c25942f);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // to0.InterfaceC26856a
    public int getGroupId() {
        return this.f134971F.m116897k();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: gg */
    public void mo138092gg(Object obj, boolean z11) {
        this.f135009t.mo155883g2(obj, z11, 0);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: gk */
    public void mo138093gk() {
        try {
            this.f134971F.m116857K0();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: hg */
    public void mo138094hg() {
        m145465ns();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: i8 */
    public void mo138095i8(boolean z11) {
        if (z11) {
            mo138056Ao();
        }
        this.f134973H = true;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: ie */
    public void mo138096ie(int i11, Object... objArr) {
        this.f134981P = 7;
        if (!m145431cr(i11)) {
            ((InterfaceC26857b) m103742Dp()).mo138191v0(200L);
        }
        if (i11 == 1) {
            if (this.f134971F.m116854J()) {
                ((InterfaceC26857b) m103742Dp()).mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_leave_noti_text));
            }
            this.f134979N = System.currentTimeMillis();
            this.f134978M++;
            this.f135010u.m156319h0();
            m145435ds();
            this.f135009t.mo116930b(100);
            if (this.f134978M >= 2) {
                this.f134982Q = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                m145409Tq();
            }
            ((InterfaceC26857b) m103742Dp()).mo138170hm(this.f134971F.m116909q());
            ((InterfaceC26857b) m103742Dp()).mo138163en();
            return;
        }
        if (i11 == 12) {
            if (objArr == null || objArr.length != 1 || this.f134984S) {
                return;
            }
            ((InterfaceC26857b) m103742Dp()).mo138132Oz();
            this.f134983R = true;
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            AbstractC3082b0.m15424f("VOIP_CallPresenter", "onTrigger#isOffCamera = " + booleanValue);
            if (booleanValue) {
                this.f135009t.mo155781A2("Manual", 0);
                return;
            } else if (m145411Ul()) {
                this.f135009t.mo155785B2("Manual", 7);
                return;
            } else {
                ((InterfaceC26857b) m103742Dp()).mo138165fq(true);
                ((InterfaceC26857b) m103742Dp()).mo59032jx(AbstractC8020f0.str_call_sensitive_camera_blocked_warning);
                return;
            }
        }
        if (i11 == 16) {
            if (this.f135009t.m155815J0()) {
                ((InterfaceC26857b) m103742Dp()).mo138184qo();
                return;
            }
            return;
        }
        if (i11 == 21) {
            if (this.f134974I) {
                return;
            }
            if (!((InterfaceC26857b) m103742Dp()).mo138122ID(6)) {
                m145429bs();
                return;
            } else {
                mo138110v0(200L);
                return;
            }
        }
        if (i11 == 3 || i11 == 4) {
            m145490Bq(i11);
            return;
        }
        if (i11 == 5) {
            if (objArr == null || objArr.length != 1) {
                return;
            }
            boolean booleanValue2 = ((Boolean) objArr[0]).booleanValue();
            AbstractC3082b0.m15424f("VOIP_CallPresenter", "onTrigger#isMute = " + booleanValue2);
            this.f135010u.m156321j0(booleanValue2);
            m145410Tr(this.f134966A.m102409b0() == 1, booleanValue2);
            ((InterfaceC26857b) m103742Dp()).mo138124Jl(booleanValue2);
            return;
        }
        if (i11 == 6) {
            C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_speaker", new String[0]).m123926s(String.valueOf(2)), false);
            ((InterfaceC26857b) m103742Dp()).mo138120Gi();
            AbstractC3082b0.m15421c("VOIP_CallPresenter", "Bluetooth Headset Available");
            ((InterfaceC26857b) m103742Dp()).mo138179oE(3, null);
            return;
        }
        if (i11 == 9) {
            if (this.f134983R || this.f134971F.m116850H()) {
                return;
            }
            ((InterfaceC26857b) m103742Dp()).mo138129Mp();
            this.f135009t.m155937x2();
            return;
        }
        if (i11 == 10) {
            if (this.f134988W) {
                mo138110v0(200L);
                return;
            } else {
                if (System.currentTimeMillis() - this.f134980O <= 1000 || ((InterfaceC26857b) m103742Dp()).mo138192xF() || !this.f134971F.m116854J()) {
                    return;
                }
                mo138084ap(!this.f134974I);
                return;
            }
        }
        if (i11 != 24) {
            if (i11 != 25) {
                switch (i11) {
                    case 27:
                        m145396Or(0);
                        break;
                    case 28:
                        if (this.f134971F.m116927z()) {
                            this.f134982Q = 0;
                            m145409Tq();
                            return;
                        }
                        return;
                    case 29:
                        this.f134982Q = 0;
                        m145377Fr();
                        return;
                    default:
                        return;
                }
            } else {
                m145396Or(0);
                return;
            }
        }
        C0815e1.m2075D().m2100V(new C23648e(33, "in_call", 0, "call_minimize", new String[0]).m123926s(String.valueOf(2)), false);
        this.f135009t.m155905o2(Integer.toString(40014));
        this.f134973H = true;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: j5 */
    public void mo138097j5(C25942f c25942f, int i11) {
        if (c25942f == null) {
            return;
        }
        try {
            C21791f c21791f = new C21791f(c25942f);
            if (this.f134971F.m116854J() && !m145428br(c25942f.m133661k())) {
                C25942f m145400Qq = m145400Qq(this.f134966A.m102407a0());
                if (!((InterfaceC26857b) m103742Dp()).mo138118F2() && !this.f134986U && m145425ar(c21791f.m112477l()) && i11 == 7) {
                    ((InterfaceC26857b) m103742Dp()).mo138159dG(c21791f);
                    this.f134989X.m97978i(c21791f);
                    this.f134990Y = m145420Yr();
                    m145491Eq(true);
                } else if (m145400Qq != null && (this.f134986U || m145425ar(c21791f.m112477l()))) {
                    C21791f c21791f2 = new C21791f(m145400Qq);
                    if (this.f134990Y.m112477l() == c21791f.m112477l()) {
                        this.f134990Y = c21791f2;
                    }
                    if (this.f134989X.m97972c(c21791f.m112477l())) {
                        this.f134989X.m97979j(c21791f, c21791f2);
                    }
                    ((InterfaceC26857b) m103742Dp()).mo138188uc(c21791f, c21791f2);
                } else {
                    ((InterfaceC26857b) m103742Dp()).mo138159dG(c21791f);
                    this.f134989X.m97978i(c21791f);
                    if (this.f134990Y.m112477l() == c21791f.m112477l()) {
                        this.f134990Y = m145420Yr();
                    }
                }
                m145404Rr();
                ((InterfaceC26857b) m103742Dp()).mo138136Qd(this.f134991Z);
                m145381Iq();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: kf */
    public int mo138098kf() {
        C22592c c22592c = this.f134971F;
        if (c22592c != null && (c22592c.m116842D() || this.f134971F.m116864O())) {
            return AbstractC8020f0.str_call_hangup_button_text;
        }
        return AbstractC8020f0.str_call_decline_button_text;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: lg */
    public boolean mo138099lg(boolean z11, boolean z12) {
        if (!z12 && (this.f134966A.m102409b0() == 1 || z11)) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: ob */
    public int mo138100ob() {
        return this.f134971F.m116883d();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: on */
    public void mo138101on() {
        m145465ns();
    }

    @Override // to0.InterfaceC26856a
    public void onPause() {
        m145386Kq();
        if (this.f134988W) {
            mo138110v0(0L);
        }
        this.f135009t.mo155855W().f123737b = !this.f134971F.m116850H();
        if (!AbstractC3096i0.m15538g() && !AbstractC3103o.m15623l() && this.f134971F.m116854J()) {
            if (this.f134973H) {
                m145441fs("Minimize", 1);
            } else {
                m145441fs("HomeApp", 2);
            }
        }
    }

    @Override // to0.InterfaceC26856a
    public void onResume() {
        m145438es();
        m145456ks();
        m145457lp();
    }

    @Override // to0.InterfaceC26856a
    public void onStart() {
        C22592c c22592c = this.f134971F;
        if (c22592c != null && !c22592c.m116842D()) {
            this.f135011v.m155737l().m117180z1(158);
        }
        if (this.f135009t.mo155855W().f123737b) {
            m145387L4("onResume", 8);
        }
        this.f135009t.mo155855W().f123737b = false;
        this.f135013x.m156254M(false);
        m145465ns();
        m145407Sr();
        m145432cs(ZAbstractBase.ZVU_PROCESS_FLUSH);
        m145383Jq();
        if (AbstractC3096i0.f13167k == 5 && this.f134971F.m116854J()) {
            m145401Qr();
            Iterator it = this.f134989X.m97975f().iterator();
            while (it.hasNext()) {
                ((InterfaceC26857b) m103742Dp()).mo138126KD((C21791f) it.next());
            }
        }
        mo138113zp();
    }

    @Override // to0.InterfaceC26856a
    public void onStop() {
        if (AbstractC3096i0.f13167k == 4 && this.f134978M == 0 && !this.f134976K) {
            if (this.f134971F.m116927z() && (this.f134971F.m116867Q() || this.f134971F.m116868R())) {
                this.f134982Q = 0;
                m145409Tq();
            }
            if (this.f134971F.m116854J() || this.f134971F.m116927z()) {
                for (int i11 = 0; i11 < this.f134989X.m97980k(); i11++) {
                    ((InterfaceC26857b) m103742Dp()).mo138142Si(this.f134989X.m97974e(i11));
                }
            }
            this.f135009t.mo155855W().f123737b = !this.f134971F.m116850H();
            if (AbstractC3096i0.m15538g()) {
                C21791f c21791f = this.f134990Y;
                if (c21791f != null && c21791f.m112477l() != -1) {
                    this.f134971F.m116853I0(this.f134990Y.m112477l());
                }
                this.f135009t.mo155899m2();
            } else if (AbstractC3103o.m15623l()) {
                if (this.f134971F.m116854J()) {
                    if (this.f134973H) {
                        m145441fs("Minimize", 1);
                    } else {
                        m145441fs("HomeApp", 2);
                    }
                } else if (mo138087c1() && this.f134971F.m116838B()) {
                    m145441fs("HomeApp", 14);
                }
            }
            if ((AbstractC23309i.m121776c2() != 1 || !AbstractC23034c6.m118126L(AbstractC3096i0.m15574y())) && !AbstractC3096i0.m15536f() && AbstractC3096i0.m15513S() && (this.f134971F.m116854J() || (mo138087c1() && this.f134971F.m116838B() && !AbstractC23104j.m118480b(31)))) {
                ((InterfaceC26857b) m103742Dp()).mo59032jx(AbstractC8020f0.str_call_no_miniview_toast);
            }
            if (!AbstractC3096i0.m15538g() || !this.f134971F.m116854J()) {
                this.f135013x.m156254M(true);
            }
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: r8 */
    public int mo138102r8() {
        return this.f134971F.m116893i();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: s8 */
    public void mo138103s8(final boolean z11) {
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.r
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145479ur(z11);
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: sb */
    public boolean mo138104sb() {
        return this.f134971F.m116854J();
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: t1 */
    public void mo138105t1() {
        if (!this.f134971F.m116869S()) {
            mo138106td();
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: td */
    public void mo138106td() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: wo0.g
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145449ir();
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: ti */
    public boolean mo138107ti(boolean z11) {
        if (!z11 && this.f134966A.m102409b0() == 1) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: to */
    public void mo138108to(int i11) {
        if (this.f134971F.m116854J()) {
            this.f134971F.m116922w0(i11);
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: u2 */
    public void mo138109u2(Integer num) {
        C25942f c25942f = (C25942f) this.f134966A.m102392S().get(num);
        if (c25942f != null && this.f134971F.m116854J()) {
            this.f134985T = true;
            C21791f c21791f = new C21791f(c25942f);
            this.f135015z.m94251v(c21791f.m112477l(), 0);
            if (m145378Gq(num.intValue())) {
                m145418Xr(num.intValue(), 3);
                m145414Vr(num.intValue(), c21791f.m112479n(), c21791f.m112481p());
                ((InterfaceC26857b) m103742Dp()).mo138187tp(this.f134989X.m97976g(num.intValue()));
            } else if (this.f134986U) {
                this.f134991Z.add(num);
                this.f134989X.m97970a(c21791f);
                m145381Iq();
                ((InterfaceC26857b) m103742Dp()).mo138193xH(c21791f);
                m145395Oq(this.f134966A.m102401X());
            }
            mo138065Jc();
            ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C29118a0.this.m145475sr();
                }
            });
        }
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: v0 */
    public void mo138110v0(long j11) {
        this.f134988W = false;
        ((InterfaceC26857b) m103742Dp()).mo138191v0(j11);
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: xe */
    public void mo138111xe(C25942f c25942f, Integer num) {
        C21791f c21791f;
        if (c25942f == null) {
            return;
        }
        if (!this.f134971F.m116860M() && !this.f134971F.m116854J()) {
            return;
        }
        this.f135015z.m94251v(c25942f.m133661k(), 0);
        if (this.f134991Z.contains(Integer.valueOf(c25942f.m133661k())) || this.f134989X.m97972c(c25942f.m133661k())) {
            if (!this.f134971F.m116854J()) {
                return;
            }
            if (this.f134991Z.contains(Integer.valueOf(c25942f.m133661k()))) {
                Message message = new Message();
                message.obj = c25942f;
                message.what = 4;
                message.arg1 = num.intValue();
                ((InterfaceC26857b) m103742Dp()).mo138125Jv(message, 3000L);
            } else if (this.f134989X.m97972c(c25942f.m133661k())) {
                mo138097j5(c25942f, num.intValue());
            }
            C21791f c21791f2 = new C21791f(c25942f);
            c21791f2.m112461D(4);
            ((InterfaceC26857b) m103742Dp()).mo138123J9(c21791f2);
            if (this.f134991Z.contains(Integer.valueOf(c25942f.m133661k()))) {
                c21791f = m145403Rq(c25942f.m133661k());
            } else {
                c21791f = null;
            }
            if (c21791f != null) {
                c21791f.m112461D(4);
            }
            ((InterfaceC26857b) m103742Dp()).mo138136Qd(this.f134991Z);
        }
        ContactProfile contactProfile = new ContactProfile(String.valueOf(c25942f.m133661k()));
        contactProfile.f42437s = c25942f.m133656f();
        contactProfile.f42446v = c25942f.m133653b();
        switch (num.intValue()) {
            case 0:
            case 6:
                if (this.f134971F.m116854J()) {
                    ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_partner_disconnect_noti_text), c25942f.m133657g(10)));
                    break;
                }
                break;
            case 1:
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_not_ring_incall_noti_text), c25942f.m133657g(10)));
                break;
            case 2:
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_have_ring_incall_noti_text), c25942f.m133657g(10)));
                break;
            case 3:
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_reject_incall_noti_text), c25942f.m133657g(10)));
                break;
            case 4:
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_busy_incall_noti_text), c25942f.m133657g(10)));
                break;
            case 5:
                ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_partner_initzrtp_failed_noti_text), c25942f.m133657g(10)));
                break;
            case 7:
                if (this.f134971F.m116854J()) {
                    ((InterfaceC26857b) m103742Dp()).mo138119GF(contactProfile, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_groupcall_share_screen_stop_other), c25942f.m133657g(10)));
                    break;
                }
                break;
        }
        mo138065Jc();
        ((InterfaceC26857b) m103742Dp()).mo70710wy(new Runnable() { // from class: wo0.b
            @Override // java.lang.Runnable
            public final void run() {
                C29118a0.this.m145477tr();
            }
        });
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: zm */
    public boolean mo138112zm() {
        C22592c c22592c = this.f134971F;
        if (c22592c != null && c22592c.m116854J()) {
            return true;
        }
        return false;
    }

    @Override // to0.InterfaceC26856a
    /* renamed from: zp */
    public void mo138113zp() {
        if (this.f134968C.f125191a == 0) {
            return;
        }
        ((InterfaceC26857b) m103742Dp()).mo138138RD(VoipAudioHelper.m155575V());
    }
}
