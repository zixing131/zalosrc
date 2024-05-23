package gp0;

import ag0.AbstractC0826k;
import ag0.C0843s0;
import android.text.TextUtils;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.C3084c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dg0.AbstractC17930e;
import gp0.C19577z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import lo0.C22592c;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p097db.AbstractC17849h;
import p097db.C17843b;
import p097db.C17846e;
import p097db.EnumC17852k;
import p207he.C20012f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import ro0.AbstractRunnableC25943g;
import ro0.C25942f;
import vg.C28203u6;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.C32252b;
import zm.voip.service.C32318n3;
import zm.voip.service.C32319o;
import zm.voip.service.C32328p3;
import zm.voip.service.HandlerC32324p;
import zm.voip.service.VoipAudioHelper;

/* renamed from: gp0.z */
/* loaded from: classes7.dex */
public class C19577z extends AbstractC19573v {

    /* renamed from: A */
    private JSONObject f97214A;

    /* renamed from: E */
    private int f97218E;

    /* renamed from: G */
    private int f97220G;

    /* renamed from: H */
    private int f97221H;

    /* renamed from: f */
    private ScheduledFuture f97229f;

    /* renamed from: g */
    private boolean f97230g;

    /* renamed from: m */
    String f97236m;

    /* renamed from: n */
    private String f97237n;

    /* renamed from: o */
    private int f97238o;

    /* renamed from: p */
    private long f97239p;

    /* renamed from: q */
    private String f97240q;

    /* renamed from: t */
    private boolean f97243t;

    /* renamed from: w */
    private int f97246w;

    /* renamed from: y */
    private int f97248y;

    /* renamed from: z */
    private String f97249z;

    /* renamed from: b */
    private final ArrayList f97225b = new ArrayList();

    /* renamed from: c */
    private final HashMap f97226c = new HashMap();

    /* renamed from: d */
    private List f97227d = new ArrayList();

    /* renamed from: e */
    private Object f97228e = null;

    /* renamed from: h */
    private String f97231h = null;

    /* renamed from: i */
    private String f97232i = null;

    /* renamed from: j */
    private String f97233j = null;

    /* renamed from: k */
    private String f97234k = null;

    /* renamed from: l */
    private int f97235l = 45000;

    /* renamed from: r */
    private final int f97241r = 1;

    /* renamed from: s */
    protected int f97242s = 0;

    /* renamed from: u */
    private int f97244u = 5;

    /* renamed from: v */
    private final int f97245v = 3;

    /* renamed from: x */
    private boolean f97247x = false;

    /* renamed from: B */
    protected int f97215B = (int) System.currentTimeMillis();

    /* renamed from: C */
    private String f97216C = null;

    /* renamed from: D */
    private String f97217D = null;

    /* renamed from: F */
    protected long f97219F = 0;

    /* renamed from: J */
    private int f97223J = 0;

    /* renamed from: K */
    private boolean f97224K = false;

    /* renamed from: I */
    private final Object f97222I = new Object();

    /* renamed from: gp0.z$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C25942f f97250p;

        a(C25942f c25942f) {
            this.f97250p = c25942f;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            int i11;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            int i13;
            int i14;
            try {
                int m133661k = this.f97250p.m133661k();
                C19577z c19577z = C19577z.this;
                if (m133661k == c19577z.f97242s) {
                    return;
                }
                C25942f c25942f = (C25942f) c19577z.f97226c.get(Integer.valueOf(this.f97250p.m133661k()));
                if (c25942f != null) {
                    if (this.f97250p.m133659i() == 4) {
                        if (c25942f.m133659i() < 3) {
                            if (c25942f.m133659i() == 1) {
                                i14 = 1;
                            } else if (c25942f.m133659i() == 2) {
                                i14 = 2;
                            }
                            C19577z.this.m102348k0(Integer.valueOf(this.f97250p.m133661k()), Integer.valueOf(i14));
                            return;
                        }
                        i14 = 0;
                        C19577z.this.m102348k0(Integer.valueOf(this.f97250p.m133661k()), Integer.valueOf(i14));
                        return;
                    }
                    if (c25942f.m133652a() != this.f97250p.m133652a()) {
                        c25942f.m133666p(this.f97250p.m133652a());
                        C17846e m94223f = C17846e.m94223f();
                        int m133661k2 = c25942f.m133661k();
                        if (this.f97250p.m133652a() == 0) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        m94223f.m94244o(m133661k2, i13);
                        i11 = 1;
                        z11 = true;
                    } else {
                        i11 = 0;
                        z11 = false;
                    }
                    if (c25942f.m133662l() != this.f97250p.m133662l()) {
                        c25942f.m133676z(this.f97250p.m133662l());
                        i11 |= 16;
                        C17846e m94223f2 = C17846e.m94223f();
                        int m133661k3 = c25942f.m133661k();
                        if (this.f97250p.m133662l() == 0) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        m94223f2.m94245p(m133661k3, i12);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c25942f.m133659i() != this.f97250p.m133659i()) {
                        c25942f.m133673w(this.f97250p.m133659i());
                        i11 |= 256;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z11 && !z12 && !z13) {
                        return;
                    }
                    if (z13 && C19577z.this.m102372H() == C19577z.this.m102388Q() && C19577z.this.f97223J < 7 && this.f97250p.m133659i() == 3) {
                        C19577z.m102341J().m102363C0(new C19536c(this.f97250p.m133661k(), C19577z.this.m102449x(), 0, 0, C19577z.this.m102372H(), this.f97250p.m133652a(), this.f97250p.m133662l(), this.f97250p.m133655e()));
                    }
                } else {
                    if (this.f97250p.m133659i() != 4 && this.f97250p.m133659i() != 0) {
                        if (this.f97250p.m133661k() == 0) {
                            AbstractC3082b0.m15429k("VoipGroupSession", "update UID == 0 !!");
                            return;
                        } else {
                            C19577z.this.f97226c.put(Integer.valueOf(this.f97250p.m133661k()), this.f97250p);
                            i11 = 273;
                        }
                    }
                    return;
                }
                C22592c m156362c = C32328p3.m156358e().m156362c();
                if (m156362c != null) {
                    if (!m156362c.m116858L()) {
                        C19577z.this.m102342O0(40015, Integer.valueOf(this.f97250p.m133661k()), Integer.valueOf(i11), Integer.valueOf(this.f97250p.m133652a()), Integer.valueOf(this.f97250p.m133662l()), Integer.valueOf(this.f97250p.m133659i()));
                    } else {
                        C23744a.m124114c().m124116d(40015, Integer.valueOf(this.f97250p.m133661k()), Integer.valueOf(i11), Integer.valueOf(this.f97250p.m133652a()), Integer.valueOf(this.f97250p.m133662l()), Integer.valueOf(this.f97250p.m133659i()));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gp0.z$b */
    /* loaded from: classes7.dex */
    public class b extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C19548i f97252p;

        b(C19548i c19548i) {
            this.f97252p = c19548i;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C19577z.this.m102359A0(this.f97252p);
        }
    }

    /* renamed from: gp0.z$c */
    /* loaded from: classes7.dex */
    public class c extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C19568s f97254p;

        c(C19568s c19568s) {
            this.f97254p = c19568s;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            if (C19577z.this.m102448w0(this.f97254p)) {
                C19577z.this.m102359A0(this.f97254p);
            }
        }
    }

    /* renamed from: gp0.z$d */
    /* loaded from: classes7.dex */
    public class d extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ int f97256p;

        d(int i11) {
            this.f97256p = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            C17843b.m94137o().m94150M(EnumC17852k.CANCEL_TIMEOUT.ordinal());
            if (C19577z.this.m102438r0()) {
                C19577z.m102341J().m102361B0(new C19548i(453));
                return;
            }
            if (AbstractC3096i0.f13163g) {
                C19577z.m102341J().m102363C0(C19558n.m102143g(C19577z.this.f97215B, 6, AbstractC23136l9.m118743r0(AbstractC8020f0.str_gc_join_fail_general)));
            } else if (this.f97256p == -4 && !C19577z.this.m102440s0()) {
                C19577z.m102341J().m102361B0(new C19548i(454, 6));
            } else {
                C19577z.this.mo102242b(false);
            }
        }
    }

    /* renamed from: gp0.z$e */
    /* loaded from: classes7.dex */
    public class e extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ JSONObject f97258p;

        e(JSONObject jSONObject) {
            this.f97258p = jSONObject;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            try {
                Iterator<String> keys = this.f97258p.keys();
                C22592c m156362c = C32328p3.m156358e().m156362c();
                while (keys.hasNext()) {
                    String next = keys.next();
                    int i11 = this.f97258p.getInt(next);
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(next);
                    String m118085e = AbstractC23028c0.m118085e(m141809c, false, AbstractC8020f0.str_me);
                    C25942f c25942f = new C25942f();
                    C25942f c25942f2 = (C25942f) C19577z.this.f97226c.remove(Integer.valueOf(Integer.parseInt(next)));
                    c25942f.m133675y(Integer.parseInt(next));
                    if (c25942f2 != null && !TextUtils.isEmpty(c25942f2.m133656f())) {
                        m118085e = c25942f2.m133656f();
                    }
                    c25942f.m133670t(m118085e);
                    c25942f.m133667q(m141809c.f42446v);
                    if (AbstractC3096i0.f13167k != 3 && !m156362c.m116858L()) {
                        C19577z.this.m102342O0(IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM, Integer.valueOf(i11), c25942f);
                    }
                    C23744a.m124114c().m124116d(IMediaPlayer.MEDIA_INFO_HAVE_AUDIO_STREAM, Integer.valueOf(i11), c25942f);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.z$f */
    /* loaded from: classes7.dex */
    public class f extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ C25942f[] f97260p;

        /* renamed from: q */
        final /* synthetic */ C25942f f97261q;

        /* renamed from: r */
        final /* synthetic */ int f97262r;

        f(C25942f[] c25942fArr, C25942f c25942f, int i11) {
            this.f97260p = c25942fArr;
            this.f97261q = c25942f;
            this.f97262r = i11;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            boolean z11;
            try {
                for (C25942f c25942f : this.f97260p) {
                    C25942f c25942f2 = (C25942f) C19577z.this.f97226c.get(Integer.valueOf(c25942f.m133661k()));
                    if (c25942f2 != null) {
                        if (TextUtils.isEmpty(c25942f2.m133656f())) {
                            AbstractC3082b0.m15421c("VoipGroupSession", c25942f.m133661k() + " update name: " + c25942f.m133656f());
                            c25942f2.m133670t(c25942f.m133656f());
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (TextUtils.isEmpty(c25942f2.m133653b())) {
                            AbstractC3082b0.m15421c("VoipGroupSession", c25942f.m133661k() + " update avatar: " + c25942f.m133653b());
                            c25942f2.m133667q(c25942f.m133653b());
                        } else if (!z11) {
                        }
                        if (c25942f2.m133659i() == 2) {
                            AbstractC32273e3.m155748Q().m155879f1(c25942f, this.f97261q, this.f97262r);
                        }
                    } else {
                        int m133661k = c25942f.m133661k();
                        if (m133661k != C19577z.this.f97242s && m133661k != 0) {
                            c25942f.m133673w(2);
                            C19577z.this.f97226c.put(Integer.valueOf(m133661k), c25942f);
                            AbstractC32273e3.m155748Q().m155879f1(c25942f, this.f97261q, this.f97262r);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gp0.z$g */
    /* loaded from: classes7.dex */
    public class g extends AbstractC0826k.c {

        /* renamed from: d */
        final /* synthetic */ Integer f97264d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, TrackingSource trackingSource, Integer num) {
            super(str, trackingSource);
            this.f97264d = num;
        }

        /* renamed from: c */
        public /* synthetic */ void m102453c(Integer num, Object obj) {
            ContactProfile contactProfile;
            if (!C19577z.this.f97226c.containsKey(num)) {
                return;
            }
            C25942f c25942f = (C25942f) C19577z.this.f97226c.get(num);
            if (obj != null) {
                contactProfile = new ContactProfile((JSONObject) obj);
            } else {
                contactProfile = null;
            }
            if (contactProfile != null && c25942f != null) {
                if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                    c25942f.m133667q(contactProfile.f42446v);
                }
                String m118085e = AbstractC23028c0.m118085e(contactProfile, true, AbstractC8020f0.str_me);
                if (!TextUtils.isEmpty(m118085e)) {
                    c25942f.m133670t(m118085e);
                }
                C19577z.this.f97226c.put(Integer.valueOf(c25942f.m133661k()), c25942f);
                C23744a.m124114c().m124116d(40017, c25942f);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0826k.c, ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            super.mo2158a(obj);
            HandlerC32324p.m156351d(new Runnable() { // from class: gp0.a0

                /* renamed from: q */
                public final /* synthetic */ Integer f97013q;

                /* renamed from: r */
                public final /* synthetic */ Object f97014r;

                public /* synthetic */ RunnableC19533a0(Integer num, Object obj2) {
                    r2 = num;
                    r3 = obj2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19577z.g.this.m102453c(r2, r3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.z$h */
    /* loaded from: classes7.dex */
    public class h extends AbstractRunnableC25943g {
        h() {
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            boolean z11;
            if (C19577z.this.f97225b != null) {
                Iterator it = C19577z.this.f97225b.iterator();
                C22592c m156362c = C32328p3.m156358e().m156362c();
                while (it.hasNext()) {
                    try {
                        l lVar = (l) it.next();
                        if (lVar != null) {
                            int i11 = lVar.f97273a;
                            if ((i11 == 40011 || i11 == 40015) && !m156362c.m116858L()) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            int i12 = lVar.f97273a;
                            if ((i12 != 40012 && i12 != 10022) || AbstractC3096i0.f13167k == 3) {
                                if (z11) {
                                    C23744a.m124114c().m124116d(lVar.f97273a, lVar.f97274b);
                                    it.remove();
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: gp0.z$i */
    /* loaded from: classes7.dex */
    public class i extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ int f97267p;

        /* renamed from: q */
        final /* synthetic */ C25942f f97268q;

        i(int i11, C25942f c25942f) {
            this.f97267p = i11;
            this.f97268q = c25942f;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            try {
                int i11 = this.f97267p;
                if (i11 != C19577z.this.f97242s && i11 != 0) {
                    C22592c m156362c = C32328p3.m156358e().m156362c();
                    if (m156362c != null) {
                        if (!m156362c.m116858L()) {
                            C19577z.this.m102342O0(40011, Integer.valueOf(this.f97267p), this.f97268q);
                        } else {
                            AbstractC32273e3.m155748Q().m155887i1(this.f97267p, this.f97268q);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gp0.z$j */
    /* loaded from: classes7.dex */
    public class j extends AbstractRunnableC25943g {

        /* renamed from: p */
        final /* synthetic */ Object[] f97270p;

        j(Object[] objArr) {
            this.f97270p = objArr;
        }

        @Override // ro0.AbstractRunnableC25943g
        /* renamed from: a */
        protected void mo66462a() {
            int i11;
            try {
                int intValue = ((Integer) this.f97270p[0]).intValue();
                if (intValue == 0) {
                    AbstractC3082b0.m15429k("VoipGroupSession", "remove UID == 0 !!");
                    return;
                }
                C19577z c19577z = C19577z.this;
                if (intValue == c19577z.f97242s) {
                    c19577z.mo102242b(false);
                    return;
                }
                C22592c m156362c = C32328p3.m156358e().m156362c();
                C25942f c25942f = (C25942f) C19577z.this.f97226c.remove(Integer.valueOf(intValue));
                if (c25942f != null && !C32328p3.m156358e().m156362c().m116862N()) {
                    Object[] objArr = this.f97270p;
                    if (objArr.length > 1) {
                        i11 = ((Integer) objArr[1]).intValue();
                    } else {
                        i11 = 0;
                    }
                    if (c25942f.m133665o()) {
                        C25942f c25942f2 = (C25942f) C19577z.this.f97226c.get(Integer.valueOf(c25942f.m133658h()));
                        if (c25942f2 != null) {
                            c25942f.m133670t(c25942f2.m133656f());
                        }
                        i11 = 7;
                    }
                    if (AbstractC3096i0.f13167k < 3 && !m156362c.m116858L()) {
                        C19577z.this.m102342O0(40012, c25942f, Integer.valueOf(i11));
                    }
                    AbstractC32273e3.m155748Q().m155889j1(c25942f, i11);
                }
                if (C19577z.this.f97226c.isEmpty()) {
                    m156362c.m116896j0(6);
                    C19577z.this.mo102242b(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: gp0.z$k */
    /* loaded from: classes7.dex */
    public static class k {

        /* renamed from: a */
        public static final C19577z f97272a = new C19577z();
    }

    /* renamed from: gp0.z$l */
    /* loaded from: classes7.dex */
    public static class l {

        /* renamed from: a */
        int f97273a;

        /* renamed from: b */
        Object[] f97274b;

        l() {
        }
    }

    /* renamed from: gp0.z$m */
    /* loaded from: classes7.dex */
    public static class m {
        /* renamed from: a */
        public static String m102454a(int i11) {
            switch (i11) {
                case 0:
                    return "READY_TO_CALL";
                case 1:
                    return "INIT_CALL";
                case 2:
                    return "CALLING";
                case 3:
                    return "PRE_CONFIRMED_CALLER";
                case 4:
                    return "RINGRING_CALL";
                case 5:
                    return "ANSWERING_CALL";
                case 6:
                    return "PRE_CONFIRMED_CALL";
                case 7:
                    return "CONFIRMED_CALL";
                default:
                    return "NOT_DEFINED";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gp0.z$n */
    /* loaded from: classes7.dex */
    public static class n implements Comparator {

        /* renamed from: p */
        Map f97275p;

        public n(Map map) {
            this.f97275p = map;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            C25942f c25942f = (C25942f) this.f97275p.get(num);
            C25942f c25942f2 = (C25942f) this.f97275p.get(num2);
            if (c25942f != null && c25942f2 != null) {
                if (c25942f.m133655e() >= c25942f2.m133655e()) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    }

    C19577z() {
    }

    /* renamed from: J */
    public static C19577z m102341J() {
        return k.f97272a;
    }

    /* renamed from: O0 */
    public void m102342O0(int i11, Object... objArr) {
        AbstractC3082b0.m15421c("DUNGNNTEST", "savePendingMessages " + i11);
        l lVar = new l();
        lVar.f97273a = i11;
        lVar.f97274b = objArr;
        this.f97225b.add(lVar);
    }

    /* renamed from: V */
    private void m102343V(Integer num) {
        C0843s0.m2286r().m2294e(new g(String.valueOf(num), new TrackingSource((short) 1059), num));
    }

    /* renamed from: c0 */
    private void m102344c0(int i11, C25942f c25942f) {
        HandlerC32324p.m156351d(new i(i11, c25942f));
    }

    /* renamed from: k0 */
    public void m102348k0(Object... objArr) {
        HandlerC32324p.m156351d(new j(objArr));
    }

    /* renamed from: r */
    private void m102354r(int i11, C25942f c25942f) {
        if (i11 != this.f97242s && i11 != 0) {
            c25942f.m133675y(i11);
            if (i11 == this.f97238o) {
                c25942f.m133668r(true);
            }
            C25942f c25942f2 = (C25942f) this.f97226c.get(Integer.valueOf(i11));
            if (c25942f2 == null) {
                AbstractC3082b0.m15421c("VoipGroupSession", "ADD_PARTNER");
                ContactProfile m141809c = C28203u6.f131407a.m141809c("" + i11);
                if (m141809c != null) {
                    if (TextUtils.isEmpty(c25942f.m133653b())) {
                        c25942f.m133667q(m141809c.f42446v);
                    }
                    String m118085e = AbstractC23028c0.m118085e(m141809c, true, AbstractC8020f0.str_me);
                    if (!TextUtils.isEmpty(m118085e)) {
                        c25942f.m133670t(m118085e);
                    }
                } else {
                    m102343V(Integer.valueOf(i11));
                }
            } else {
                AbstractC3082b0.m15421c("VoipGroupSession", "UPDATE_PARTNER");
                if (TextUtils.isEmpty(c25942f2.m133656f()) && TextUtils.isEmpty(c25942f2.m133653b())) {
                    ContactProfile m141809c2 = C28203u6.f131407a.m141809c("" + i11);
                    if (m141809c2 != null) {
                        if (!TextUtils.isEmpty(m141809c2.f42446v)) {
                            c25942f.m133667q(m141809c2.f42446v);
                        }
                        String m118085e2 = AbstractC23028c0.m118085e(m141809c2, true, AbstractC8020f0.str_me);
                        if (!TextUtils.isEmpty(m118085e2)) {
                            c25942f.m133670t(m118085e2);
                        }
                    } else {
                        m102343V(Integer.valueOf(i11));
                    }
                } else {
                    if (!TextUtils.isEmpty(c25942f2.m133656f())) {
                        c25942f.m133670t(c25942f2.m133656f());
                    }
                    if (!TextUtils.isEmpty(c25942f2.m133653b())) {
                        c25942f.m133667q(c25942f2.m133653b());
                    }
                }
                c25942f.m133671u(c25942f2.m133665o());
                c25942f.m133672v(c25942f2.m133658h());
            }
            c25942f.m133673w(3);
            this.f97226c.put(Integer.valueOf(i11), c25942f);
            m102344c0(i11, c25942f);
            return;
        }
        AbstractC3082b0.m15429k("VoipGroupSession", "add UID == 0 !!");
    }

    /* renamed from: x0 */
    public /* synthetic */ void m102355x0() {
        try {
            try {
                AbstractC32273e3.m155748Q().m155913r1();
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VoipGroupSession", "dismissCallScreenWithoutVoiceFinishCall: " + e11.getMessage(), e11);
            }
        } finally {
            AbstractC3096i0.m15510Q0(false);
            m102341J().m102421h1(false);
            m102432n1();
            AbstractC3096i0.f13160d = false;
            C32328p3.m156358e().m156362c().m116873W(false);
        }
    }

    /* renamed from: y0 */
    public /* synthetic */ void m102356y0(JSONObject jSONObject, C19558n c19558n) {
        C17846e.m94223f().m94237h(this.f97242s, jSONObject.toString(), c19558n.m102152p());
        C17846e.m94223f().m94232b("");
        if (!C32328p3.m156358e().m156362c().m116877a()) {
            AbstractC32273e3.m155748Q().mo155781A2("Blocked", 15);
        }
    }

    /* renamed from: z0 */
    public /* synthetic */ void m102357z0() {
        AbstractC3082b0.m15421c("VoipGroupSession", "Session timer timeout!!!");
        this.f97230g = true;
        if (!m102438r0() && !m102440s0()) {
            mo102340h(-4, "Session timed out!");
            return;
        }
        if (m102383N().isEmpty()) {
            if (m102438r0() && this.f97223J < 7) {
                C32328p3.m156358e().m156362c().m116924x0(false);
                m102378K0();
            }
            mo102340h(-4, "Session timed out!");
        }
    }

    /* renamed from: A */
    public int m102358A() {
        return 1;
    }

    /* renamed from: A0 */
    boolean m102359A0(AbstractC19542f abstractC19542f) {
        boolean z11;
        AbstractC3082b0.m15421c("VoipGroupSession", m.m102454a(this.f97223J) + ": processing " + AbstractC19573v.m102339g(abstractC19542f) + ", Zalo id = " + this.f97242s + ", Call id = " + this.f97215B + ", Session id = " + this.f97231h);
        synchronized (this.f97222I) {
            z11 = false;
            try {
                try {
                    switch (this.f97223J) {
                        case 0:
                            boolean m102367E0 = m102367E0(abstractC19542f);
                            if (!m102367E0) {
                                try {
                                    mo102242b(false);
                                } catch (Exception e11) {
                                    z11 = m102367E0;
                                    e = e11;
                                    break;
                                }
                            }
                            z11 = m102367E0;
                            break;
                        case 1:
                            z11 = m102373H0(abstractC19542f);
                            break;
                        case 2:
                            z11 = m102376J0(abstractC19542f);
                            break;
                        case 3:
                            z11 = m102371G0(abstractC19542f);
                            break;
                        case 4:
                            z11 = m102365D0(abstractC19542f);
                            break;
                        case 5:
                            z11 = m102375I0(abstractC19542f);
                            break;
                        case 6:
                            z11 = m102369F0(abstractC19542f);
                            break;
                        case 7:
                            z11 = m102435p0(abstractC19542f);
                            break;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
                AbstractC3082b0.m15423e("VoipGroupSession", "process BaseEvent : " + e.getMessage(), e);
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: B */
    public C25942f m102360B(int i11) {
        return (C25942f) this.f97226c.get(Integer.valueOf(i11));
    }

    /* renamed from: B0 */
    public void m102361B0(C19548i c19548i) {
        HandlerC32324p.m156351d(new b(c19548i));
    }

    /* renamed from: C */
    public String m102362C() {
        return this.f97240q;
    }

    /* renamed from: C0 */
    public void m102363C0(C19568s c19568s) {
        if (m102448w0(c19568s)) {
            HandlerC32324p.m156351d(new c(c19568s));
        }
    }

    /* renamed from: D */
    public String m102364D() {
        return this.f97249z;
    }

    /* renamed from: D0 */
    boolean m102365D0(AbstractC19542f abstractC19542f) {
        if (AbstractC19573v.m102336d(4542, abstractC19542f)) {
            this.f97223J = 5;
            AbstractC3082b0.m15424f("VoipGroupSession", "Calling pressAnswer with CallID=" + this.f97215B + " ZaloID=" + this.f97242s);
            try {
                C32319o.m156293t().m156328q0();
                C32328p3.m156358e().m156362c().m116876Z(4);
                C32328p3.m156358e().m156362c().m116880b0(true);
                AbstractC32273e3.m155748Q().m155882g1();
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VoipGroupSession", "readyForCall IncomingCallCommand: " + e11.getMessage(), e11);
                m102432n1();
                m102380L0();
            }
            if (C17846e.m94223f().m94232b("") != 0) {
                AbstractC3082b0.m15422d("VoipGroupSession", "Cannot answerMeeting call");
                mo102242b(false);
                return false;
            }
            AbstractC17849h.m94303l(true);
            C17846e.m94223f().m94249t(102);
            AbstractC3082b0.m15424f("VoipGroupSession", "Call IncomingCall finish");
            return true;
        }
        if (AbstractC19573v.m102336d(452, abstractC19542f)) {
            m102421h1(false);
            AbstractC3082b0.m15424f("VoipGroupSession", "Send Ring Ring");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", 1);
                jSONObject.put("maxUsers", this.f97244u);
                jSONObject.put("callType", 1);
                AbstractC32273e3.m155748Q().mo155881g0(this.f97215B, this.f97242s, this.f97238o, 0, jSONObject.toString());
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
            return true;
        }
        if (AbstractC19573v.m102337e(452, 4070, abstractC19542f)) {
            AbstractC3082b0.m15424f("VoipGroupSession", "Send Ring Ring OK");
            m102423i1(true);
            return true;
        }
        if (AbstractC19573v.m102337e(452, -4070, abstractC19542f)) {
            AbstractC3082b0.m15424f("VoipGroupSession", "Send Ring Ring FAILED");
            C32328p3.m156358e().m156362c().m116916t0(151);
            mo102242b(false);
            return true;
        }
        if (AbstractC19573v.m102338f(452, abstractC19542f)) {
            return m102424j0(abstractC19542f);
        }
        if (abstractC19542f instanceof C19536c) {
            return m102420h0(abstractC19542f);
        }
        if (AbstractC19573v.m102335c(454, 6, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (AbstractC19573v.m102338f(453, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (AbstractC19573v.m102338f(455, abstractC19542f)) {
            return m102422i0(abstractC19542f);
        }
        if (AbstractC19573v.m102336d(455, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (!AbstractC19573v.m102338f(471, abstractC19542f)) {
            return false;
        }
        return m102414e0(abstractC19542f);
    }

    /* renamed from: E */
    public String m102366E() {
        return this.f97233j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01dc A[Catch: Exception -> 0x0215, TryCatch #4 {Exception -> 0x0215, blocks: (B:9:0x010a, B:17:0x01cb, B:19:0x01dc, B:21:0x020d, B:24:0x0217, B:27:0x01c8), top: B:8:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0217 A[Catch: Exception -> 0x0215, TRY_LEAVE, TryCatch #4 {Exception -> 0x0215, blocks: (B:9:0x010a, B:17:0x01cb, B:19:0x01dc, B:21:0x020d, B:24:0x0217, B:27:0x01c8), top: B:8:0x010a }] */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m102367E0(AbstractC19542f abstractC19542f) {
        int m94238i;
        String str;
        String str2 = "";
        if (AbstractC19573v.m102336d(450, abstractC19542f)) {
            try {
                this.f97223J = 1;
                this.f97230g = false;
                C32252b.m155705e().m155712g();
                AbstractC32273e3.m155748Q().mo155854V1();
                C17846e.m94223f().m94255z(AbstractC32273e3.m155748Q().m155829N().getEglBaseContext());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("maxWidth", 480);
                    jSONObject.put("maxHeight", 0);
                    jSONObject.put("muteAudio", 0);
                    jSONObject.put("startCamera", 1);
                    jSONObject.put("hasPermissionStartCamera", C32328p3.m156358e().m156362c().m116877a() ? 1 : 0);
                    str2 = jSONObject.toString();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC3082b0.m15421c("VoipGroupSession", "InitMeeting");
                m94238i = C17846e.m94223f().m94238i(str2);
                if (!C32328p3.m156358e().m156362c().m116877a()) {
                    AbstractC32273e3.m155748Q().mo155781A2("Blocked", 15);
                }
            } catch (Exception e12) {
                AbstractC3082b0.m15423e("VoipGroupSession", "InitMeeting fail", e12);
            }
            if (m94238i == 0) {
                return true;
            }
            return false;
        }
        if (abstractC19542f instanceof C19560o) {
            try {
                C19560o c19560o = (C19560o) abstractC19542f;
                this.f97223J = 5;
                this.f97230g = false;
                m102391R0(c19560o.m102154c());
                m102406Z0(c19560o.m102156e());
                m102425j1(c19560o.m102157f());
                C32328p3.m156358e().m156362c().m116876Z(7);
                C17846e.m94223f().m94255z(AbstractC32273e3.m155748Q().m155829N().getEglBaseContext());
                AbstractC32273e3.m155748Q().mo155841Q1(c19560o.m102154c(), c19560o.m102156e(), c19560o.m102157f(), c19560o.m102158g(), c19560o.m102155d());
            } catch (Exception e13) {
                e13.printStackTrace();
                AbstractC3082b0.m15423e("VoipGroupSession", "JoinMeeting fail", e13);
            }
        } else if (abstractC19542f instanceof C19554l) {
            try {
                this.f97223J = 4;
                this.f97230g = false;
                C19554l c19554l = (C19554l) abstractC19542f;
                this.f97231h = c19554l.m102141i();
                m102415e1(c19554l.m102139g());
                m102406Z0(c19554l.m102136d());
                m102410b1(c19554l.m102142j());
                C32328p3.m156358e().m156362c().m116910q0(c19554l.m102136d());
                C32252b.m155705e().m155712g();
                C17846e.m94223f().m94255z(AbstractC32273e3.m155748Q().m155829N().getEglBaseContext());
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("callId", this.f97215B);
                    jSONObject2.put("muteAudio", 0);
                    jSONObject2.put("startCamera", 1);
                    jSONObject2.put("syncUser", 0);
                    if (c19554l.m102138f()) {
                        String m15483D = AbstractC3096i0.m15483D(AbstractC3096i0.m15574y(), String.valueOf(this.f97215B), String.valueOf(this.f97242s), String.valueOf(System.currentTimeMillis()));
                        this.f97236m = m15483D;
                        jSONObject2.put("logFilename", m15483D);
                    }
                    jSONObject2.put("clientVersion", AbstractC32273e3.m155748Q().m155821L());
                    jSONObject2.put("osInfo", AbstractC3103o.m15614c());
                    jSONObject2.put("hasPermissionStartCamera", C32328p3.m156358e().m156362c().m116877a() ? 1 : 0);
                    str = jSONObject2.toString();
                } catch (Exception e14) {
                    e = e14;
                    str = "";
                }
                try {
                    str2 = c19554l.m102135c();
                } catch (Exception e15) {
                    e = e15;
                    e.printStackTrace();
                    AbstractC3082b0.m15421c("VoipGroupSession", "incomingMeeting");
                    if (C17846e.m94223f().m94237h(this.f97242s, str, str2) != 0) {
                    }
                    return true;
                }
                AbstractC3082b0.m15421c("VoipGroupSession", "incomingMeeting");
                if (C17846e.m94223f().m94237h(this.f97242s, str, str2) != 0) {
                    m102341J().m102417f1(c19554l.m102140h());
                    AbstractC32273e3.m155748Q().mo155823L1(c19554l.m102137e());
                    C32328p3.m156358e().m156362c().m116916t0(154);
                    if (!C32328p3.m156358e().m156362c().m116877a()) {
                        AbstractC32273e3.m155748Q().mo155781A2("Blocked", 15);
                    }
                } else {
                    AbstractC3082b0.m15422d("VoipGroupSession", "Cannot negotiate call");
                    m102432n1();
                    m102380L0();
                }
                return true;
            } catch (Exception e16) {
                AbstractC3082b0.m15423e("VoipGroupSession", "incomingMeeting fail", e16);
            }
        } else {
            if (AbstractC19573v.m102336d(455, abstractC19542f)) {
                mo102242b(false);
                return true;
            }
            if (AbstractC19573v.m102336d(453, abstractC19542f)) {
                return m102412d0(abstractC19542f);
            }
        }
        return true;
    }

    /* renamed from: F */
    public int m102368F() {
        return this.f97246w;
    }

    /* renamed from: F0 */
    boolean m102369F0(AbstractC19542f abstractC19542f) {
        if (AbstractC19573v.m102338f(452, abstractC19542f)) {
            return m102424j0(abstractC19542f);
        }
        if (abstractC19542f instanceof C19536c) {
            return m102420h0(abstractC19542f);
        }
        if (AbstractC19573v.m102337e(454, 4540, abstractC19542f)) {
            for (C25942f c25942f : ((C19538d) abstractC19542f).m102112g()) {
                if (c25942f.m133661k() != this.f97242s && c25942f.m133659i() == 3) {
                    m102354r(c25942f.m133661k(), c25942f);
                }
            }
            m102441t(false);
            return true;
        }
        if (AbstractC19573v.m102337e(454, -4540, abstractC19542f)) {
            C19568s c19568s = (C19568s) abstractC19542f;
            if (!this.f97230g && c19568s.mo102120f() == 0) {
                int m102329d = c19568s.m102329d();
                C32328p3.m156358e().m156362c().m116924x0(false);
                AbstractC32273e3.m155748Q().mo155869c0(m102329d);
            } else {
                C32328p3.m156358e().m156362c().m116924x0(true);
                mo102242b(false);
            }
            return true;
        }
        if (AbstractC19573v.m102337e(454, -3, abstractC19542f)) {
            C32328p3.m156358e().m156362c().m116916t0(157);
            mo102242b(false);
            AbstractC3096i0.m15518U0(String.format(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_groupcall_join_reach_limit_toast), String.valueOf(AbstractC23309i.m121262O7())));
        } else {
            if (abstractC19542f instanceof C19532a) {
                return true;
            }
            if (AbstractC19573v.m102338f(453, abstractC19542f)) {
                return m102433o0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(455, abstractC19542f)) {
                return m102422i0(abstractC19542f);
            }
            if (AbstractC19573v.m102336d(455, abstractC19542f)) {
                return m102433o0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(471, abstractC19542f)) {
                return m102414e0(abstractC19542f);
            }
        }
        return false;
    }

    /* renamed from: G */
    public String m102370G() {
        return this.f97232i;
    }

    /* renamed from: G0 */
    boolean m102371G0(AbstractC19542f abstractC19542f) {
        if (AbstractC19573v.m102338f(452, abstractC19542f)) {
            return m102424j0(abstractC19542f);
        }
        if (abstractC19542f instanceof C19536c) {
            return m102420h0(abstractC19542f);
        }
        if (AbstractC19573v.m102336d(455, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (AbstractC19573v.m102336d(453, abstractC19542f)) {
            return m102412d0(abstractC19542f);
        }
        if (AbstractC19573v.m102337e(4510, -4510, abstractC19542f)) {
            C32328p3.m156358e().m156362c().m116912r0(true);
            if (!this.f97230g) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("hostCall", this.f97238o);
                    jSONObject.put("maxUsers", this.f97244u);
                    jSONObject.put("groupId", this.f97246w);
                    jSONObject.put("groupName", this.f97232i);
                    String str = this.f97233j;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("groupAvatar", str);
                    jSONObject2.put("data", jSONObject.toString());
                    jSONObject2.put("rtpAddress", this.f97216C);
                    jSONObject2.put("rtcpAddress", this.f97217D);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                AbstractC32273e3.m155748Q().mo155878f0(this.f97238o, this.f97231h, this.f97215B, 1, jSONObject2.toString(), m102394T(), this.f97246w);
            } else {
                C32328p3.m156358e().m156362c().m116916t0(((C19569s0) abstractC19542f).m102331c());
                C32328p3.m156358e().m156362c().m116896j0(1);
                C32319o.m156293t().m156305T(3);
                AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.init_zrtp_caller_failed);
                mo102242b(false);
            }
        } else if (AbstractC19573v.m102338f(471, abstractC19542f)) {
            return m102414e0(abstractC19542f);
        }
        return false;
    }

    /* renamed from: H */
    public int m102372H() {
        return this.f97238o;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[Catch: Exception -> 0x00c6, TryCatch #2 {Exception -> 0x00c6, blocks: (B:11:0x00b1, B:13:0x00bd, B:16:0x00c8, B:18:0x00ea, B:23:0x00ae), top: B:22:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8 A[Catch: Exception -> 0x00c6, TryCatch #2 {Exception -> 0x00c6, blocks: (B:11:0x00b1, B:13:0x00bd, B:16:0x00c8, B:18:0x00ea, B:23:0x00ae), top: B:22:0x00ae }] */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m102373H0(AbstractC19542f abstractC19542f) {
        String str;
        String str2 = "";
        if (abstractC19542f instanceof C19562p) {
            C19562p c19562p = (C19562p) abstractC19542f;
            this.f97231h = c19562p.m102292l();
            this.f97223J = 2;
            this.f97214A = c19562p.m102287g();
            m102415e1(c19562p.m102291k());
            m102406Z0(c19562p.m102289i());
            m102410b1(c19562p.m102294n());
            C22592c m156362c = C32328p3.m156358e().m156362c();
            m156362c.m116910q0(c19562p.m102289i());
            m156362c.m116902m0(c19562p.m102288h());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("callId", this.f97215B);
                jSONObject.put("muteAudio", 0);
                jSONObject.put("startCamera", 1);
                jSONObject.put("syncUser", 0);
                if (c19562p.m102290j()) {
                    String m15483D = AbstractC3096i0.m15483D(AbstractC3096i0.m15574y(), String.valueOf(this.f97215B), String.valueOf(this.f97242s), String.valueOf(System.currentTimeMillis()));
                    this.f97236m = m15483D;
                    jSONObject.put("logFilename", m15483D);
                }
                jSONObject.put("clientVersion", AbstractC32273e3.m155748Q().m155821L());
                jSONObject.put("osInfo", AbstractC3103o.m15614c());
                str = jSONObject.toString();
            } catch (Exception e11) {
                e = e11;
                str = "";
            }
            try {
                str2 = c19562p.m102293m();
            } catch (Exception e12) {
                e = e12;
                try {
                    e.printStackTrace();
                    if (C17846e.m94223f().m94242m(this.f97242s, str, str2) == 0) {
                    }
                } catch (Exception e13) {
                    AbstractC3082b0.m15423e("VoipGroupSession", "readyForCall: " + e13.getMessage(), e13);
                }
            }
            if (C17846e.m94223f().m94242m(this.f97242s, str, str2) == 0) {
                AbstractC3082b0.m15422d("VoipGroupSession", "Cannot joinMeeting call");
                mo102242b(false);
                return false;
            }
            AbstractC17849h.m94303l(true);
            C17846e.m94223f().m94249t(102);
            C32328p3.m156358e().m156362c().m116876Z(2);
            AbstractC32273e3.m155748Q().m155882g1();
            if (this.f97228e != null) {
                C17846e.m94223f().m94224A(this.f97228e);
            }
            return true;
        }
        if (AbstractC19573v.m102336d(455, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (!AbstractC19573v.m102336d(453, abstractC19542f)) {
            return false;
        }
        return m102412d0(abstractC19542f);
    }

    /* renamed from: I */
    public List m102374I() {
        return this.f97227d;
    }

    /* renamed from: I0 */
    boolean m102375I0(AbstractC19542f abstractC19542f) {
        if (AbstractC19573v.m102336d(454, abstractC19542f)) {
            this.f97223J = 6;
            AbstractC32273e3.m155748Q().mo155869c0(0);
        } else {
            if (abstractC19542f instanceof C19569s0) {
                C19569s0 c19569s0 = (C19569s0) abstractC19542f;
                if (c19569s0.m102119b() != 5) {
                    return true;
                }
                C32328p3.m156358e().m156362c().m116912r0(true);
                AbstractC3096i0.f13163g = false;
                C32328p3.m156358e().m156362c().m116916t0(c19569s0.m102331c());
                C32328p3.m156358e().m156362c().m116896j0(1);
                C32319o.m156293t().m156305T(3);
                AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.init_zrtp_caller_failed);
                return m102433o0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(452, abstractC19542f)) {
                return m102424j0(abstractC19542f);
            }
            if (abstractC19542f instanceof C19536c) {
                return m102420h0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(453, abstractC19542f)) {
                return m102433o0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(455, abstractC19542f)) {
                return m102422i0(abstractC19542f);
            }
            if (AbstractC19573v.m102336d(455, abstractC19542f)) {
                return m102433o0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(471, abstractC19542f)) {
                return m102414e0(abstractC19542f);
            }
            if (abstractC19542f instanceof C19558n) {
                return m102416f0(abstractC19542f);
            }
        }
        return false;
    }

    /* renamed from: J0 */
    boolean m102376J0(AbstractC19542f abstractC19542f) {
        if (abstractC19542f instanceof C19567r0) {
            this.f97223J = 3;
            C19567r0 c19567r0 = (C19567r0) abstractC19542f;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("hostCall", this.f97238o);
                jSONObject.put("maxUsers", this.f97244u);
                jSONObject.put("groupName", this.f97232i);
                jSONObject.put("groupId", this.f97246w);
                String str = this.f97233j;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("groupAvatar", str);
                jSONObject2.put("data", jSONObject.toString());
                jSONObject2.put("rtpAddress", c19567r0.m102326d());
                jSONObject2.put("rtcpAddress", c19567r0.m102325c());
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            if (m102438r0() && this.f97214A != null) {
                m102341J().m102418g0(this.f97214A);
            }
            AbstractC32273e3.m155748Q().mo155878f0(this.f97238o, this.f97231h, this.f97215B, 1, jSONObject2.toString(), m102394T(), this.f97246w);
            return true;
        }
        if (abstractC19542f instanceof C19569s0) {
            C19569s0 c19569s0 = (C19569s0) abstractC19542f;
            if (c19569s0.m102119b() == 5) {
                C32328p3.m156358e().m156362c().m116912r0(true);
                AbstractC3096i0.f13163g = false;
                C32328p3.m156358e().m156362c().m116916t0(c19569s0.m102331c());
                C32328p3.m156358e().m156362c().m116896j0(1);
                C32319o.m156293t().m156305T(3);
                AbstractC32273e3.m155748Q().m155895l1(1, AbstractC8020f0.init_zrtp_caller_failed);
                mo102242b(false);
            }
            return true;
        }
        if (AbstractC19573v.m102336d(455, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (AbstractC19573v.m102336d(453, abstractC19542f)) {
            return m102412d0(abstractC19542f);
        }
        if (!AbstractC19573v.m102338f(471, abstractC19542f)) {
            return false;
        }
        return m102414e0(abstractC19542f);
    }

    /* renamed from: K */
    public long m102377K() {
        return this.f97239p;
    }

    /* renamed from: K0 */
    public void m102378K0() {
        int i11;
        for (C25942f c25942f : new ArrayList(this.f97226c.values())) {
            if (c25942f.m133659i() == 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            m102348k0(Integer.valueOf(c25942f.m133661k()), Integer.valueOf(i11));
        }
    }

    /* renamed from: L */
    public HashSet m102379L(C25942f[] c25942fArr) {
        HashSet hashSet = new HashSet();
        for (C25942f c25942f : c25942fArr) {
            if (!this.f97226c.containsKey(Integer.valueOf(c25942f.m133661k())) && c25942f.m133661k() != this.f97242s && c25942f.m133659i() == 3) {
                hashSet.add(c25942f);
            }
        }
        return hashSet;
    }

    /* renamed from: L0 */
    public void m102380L0() {
        mo102239a();
        this.f97228e = null;
        this.f97223J = 0;
        this.f97248y = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        this.f97220G = 0;
        this.f97221H = 0;
        this.f97239p = 0L;
        this.f97231h = null;
        this.f97216C = null;
        this.f97217D = null;
        this.f97224K = false;
        this.f97214A = null;
        this.f97226c.clear();
        m102421h1(false);
        List list = this.f97227d;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: M */
    public HashSet m102381M(C25942f[] c25942fArr, HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        for (C25942f c25942f : c25942fArr) {
            C25942f c25942f2 = (C25942f) this.f97226c.get(Integer.valueOf(c25942f.m133661k()));
            if (c25942f.m133659i() == 4) {
                hashSet.add(c25942f);
            } else if (c25942f2 == null && c25942f.m133659i() != 3) {
                hashSet2.add(c25942f);
            } else if (c25942f2 != null && !c25942f2.equals(c25942f)) {
                hashSet2.add(c25942f);
            }
        }
        return hashSet2;
    }

    /* renamed from: M0 */
    public void m102382M0() {
        this.f97237n = "";
    }

    /* renamed from: N */
    public List m102383N() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = this.f97226c.entrySet().iterator();
            while (it.hasNext()) {
                C25942f c25942f = (C25942f) ((Map.Entry) it.next()).getValue();
                if (c25942f.m133659i() == 3) {
                    arrayList.add(c25942f);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: N0 */
    public void m102384N0() {
        this.f97228e = null;
        this.f97225b.clear();
    }

    /* renamed from: O */
    String m102385O() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f97226c.entrySet().iterator();
            while (it.hasNext()) {
                C25942f c25942f = (C25942f) ((Map.Entry) it.next()).getValue();
                if (c25942f.m133659i() != 3 && c25942f.m133659i() != 4) {
                    jSONArray.put(c25942f.m133661k());
                }
            }
            if (jSONArray.length() > 0) {
                return jSONArray.toString();
            }
            return "";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: P */
    public HashSet m102386P(C25942f[] c25942fArr) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f97226c.entrySet().iterator();
        while (it.hasNext()) {
            C25942f c25942f = (C25942f) ((Map.Entry) it.next()).getValue();
            int length = c25942fArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (c25942fArr[i11].m133661k() == c25942f.m133661k()) {
                        break;
                    }
                    i11++;
                } else {
                    hashSet.add(c25942f);
                    break;
                }
            }
        }
        return hashSet;
    }

    /* renamed from: P0 */
    public void m102387P0(int i11) {
        this.f97220G = i11;
    }

    /* renamed from: Q */
    public int m102388Q() {
        return this.f97242s;
    }

    /* renamed from: Q0 */
    public void m102389Q0(long j11) {
        this.f97219F = j11;
    }

    /* renamed from: R */
    public int m102390R() {
        return this.f97244u;
    }

    /* renamed from: R0 */
    public void m102391R0(int i11) {
        this.f97215B = i11;
    }

    /* renamed from: S */
    public HashMap m102392S() {
        return this.f97226c;
    }

    /* renamed from: S0 */
    public void m102393S0(String str) {
        this.f97237n = str;
    }

    /* renamed from: T */
    public String m102394T() {
        return this.f97234k;
    }

    /* renamed from: T0 */
    public void m102395T0(String str) {
        this.f97236m = str;
    }

    /* renamed from: U */
    public int m102396U() {
        return this.f97235l;
    }

    /* renamed from: U0 */
    public void m102397U0(String str) {
        this.f97240q = str;
    }

    /* renamed from: V0 */
    public void m102398V0(String str) {
        this.f97249z = str;
    }

    /* renamed from: W */
    public String m102399W() {
        return this.f97231h;
    }

    /* renamed from: W0 */
    public void m102400W0(String str) {
        this.f97233j = str;
    }

    /* renamed from: X */
    public ArrayList m102401X() {
        HashMap hashMap = new HashMap(m102392S());
        TreeMap treeMap = new TreeMap(new n(hashMap));
        treeMap.putAll(hashMap);
        return new ArrayList(treeMap.values());
    }

    /* renamed from: X0 */
    public void m102402X0(int i11) {
        this.f97246w = i11;
    }

    /* renamed from: Y */
    public int m102403Y() {
        return this.f97248y;
    }

    /* renamed from: Y0 */
    public void m102404Y0(String str) {
        this.f97232i = str;
    }

    /* renamed from: Z */
    public int m102405Z() {
        return this.f97223J;
    }

    /* renamed from: Z0 */
    public void m102406Z0(int i11) {
        this.f97238o = i11;
    }

    @Override // gp0.AbstractC19573v
    /* renamed from: a */
    void mo102239a() {
        try {
            if (this.f97229f != null) {
                AbstractC3082b0.m15421c("VoipGroupSession", "Cancel session timer");
                this.f97229f.cancel(true);
                this.f97229f = null;
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoipGroupSession", "cancelSessionTimer: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: a0 */
    public List m102407a0() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = this.f97226c.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((C25942f) ((Map.Entry) it.next()).getValue());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a1 */
    public void m102408a1(boolean z11) {
        this.f97243t = z11;
    }

    @Override // gp0.AbstractC19573v
    /* renamed from: b */
    public void mo102242b(boolean z11) {
        C22592c m156362c = C32328p3.m156358e().m156362c();
        if (m102438r0() && m156362c.m116921w() < 1) {
            if (m156362c.m116903n() != -2 && !m156362c.m116856K()) {
                m156362c.m116896j0(4);
            }
        } else if (m102383N().isEmpty() && m102438r0() && !m156362c.m116852I() && !m156362c.m116856K() && m156362c.m116891h() != 5) {
            m156362c.m116896j0(3);
            m156362c.m116926y0(true);
        }
        AbstractC3082b0.m15424f("VoipGroupSession", "endCallNormally");
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("groupId", m102368F());
                m102393S0(C17846e.m94223f().m94236g(jSONObject.toString()));
                m156362c.m116928z0(C17846e.m94223f().m94235e());
                m102432n1();
                C32252b.m155705e().m155710c();
                if (C17846e.m94223f().m94239j()) {
                    C17846e.m94223f().m94241l(false);
                }
                m102439s();
                C3084c0.m15434b();
            } catch (Exception e11) {
                AbstractC3082b0.m15422d("VoipGroupSession", "endCallNormally failed: " + e11.toString());
            }
            AbstractC32273e3.m155748Q().m155800F1();
            m102380L0();
            AbstractC3096i0.m15510Q0(false);
            m102341J().m102421h1(false);
            m102432n1();
            AbstractC3096i0.f13160d = false;
            AbstractC3096i0.f13163g = false;
            AbstractC3082b0.m15421c("VoipGroupSession", "End call");
        } catch (Throwable th2) {
            AbstractC32273e3.m155748Q().m155800F1();
            m102380L0();
            AbstractC3096i0.m15510Q0(false);
            m102341J().m102421h1(false);
            m102432n1();
            AbstractC3096i0.f13160d = false;
            AbstractC3096i0.f13163g = false;
            AbstractC3082b0.m15421c("VoipGroupSession", "End call");
            throw th2;
        }
    }

    /* renamed from: b0 */
    public int m102409b0() {
        return this.f97221H;
    }

    /* renamed from: b1 */
    public void m102410b1(long j11) {
        this.f97239p = j11;
    }

    /* renamed from: c1 */
    public void m102411c1(int i11) {
        this.f97242s = i11;
    }

    /* renamed from: d0 */
    boolean m102412d0(AbstractC19542f abstractC19542f) {
        boolean m116842D = C32328p3.m156358e().m156362c().m116842D();
        if (!m102440s0() && m116842D && m102383N().isEmpty()) {
            C32328p3.m156358e().m156362c().m116924x0(false);
            m102436q(m102385O());
        }
        mo102242b(false);
        return true;
    }

    /* renamed from: d1 */
    public void m102413d1(int i11) {
        this.f97244u = i11;
    }

    /* renamed from: e0 */
    boolean m102414e0(AbstractC19542f abstractC19542f) {
        try {
            if (abstractC19542f instanceof C19544g) {
                C19544g c19544g = (C19544g) abstractC19542f;
                if (!TextUtils.isEmpty(c19544g.f97034v)) {
                    AbstractC3082b0.m15421c("VoipGroupSession", "handleGetExtraConfig " + c19544g.f97034v + " result: " + C17846e.m94223f().m94230G(c19544g.f97034v));
                    return true;
                }
                return true;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: e1 */
    public void m102415e1(String str) {
        this.f97234k = str;
    }

    /* renamed from: f0 */
    boolean m102416f0(AbstractC19542f abstractC19542f) {
        if (!AbstractC3096i0.f13163g) {
            return false;
        }
        C19558n c19558n = (C19558n) abstractC19542f;
        if (c19558n.mo102120f() != 0) {
            AbstractC32273e3.m155748Q().mo155934x();
            AbstractC3082b0.m15422d("VoipGroupSession", "Send joinGroupCall complete with status " + c19558n.mo102120f() + " error " + c19558n.m102330e());
            C22592c m156362c = C32328p3.m156358e().m156362c();
            if (c19558n.mo102120f() != 3) {
                AbstractC3096i0.m15518U0(c19558n.f97080C);
            } else {
                m156362c.m116896j0(90);
                C20012f.f98380a.m103863q(this.f97215B);
            }
            m156362c.m116876Z(6);
            AbstractC32273e3.m155748Q().m155882g1();
            mo102242b(false);
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callId", this.f97215B);
            jSONObject.put("muteAudio", 0);
            jSONObject.put("startCamera", 1);
            jSONObject.put("syncUser", 0);
            jSONObject.put("clientVersion", AbstractC32273e3.m155748Q().m155821L());
            jSONObject.put("osInfo", AbstractC3103o.m15614c());
            if (c19558n.m102146j()) {
                String m15483D = AbstractC3096i0.m15483D(AbstractC3096i0.m15574y(), String.valueOf(this.f97215B), String.valueOf(this.f97242s), String.valueOf(System.currentTimeMillis()));
                m102341J().m102395T0(m15483D);
                jSONObject.put("logFilename", m15483D);
            }
            jSONObject.put("hasPermissionStartCamera", C32328p3.m156358e().m156362c().m116877a() ? 1 : 0);
            C32328p3.m156358e().m156362c().m116902m0(c19558n.m102144h());
            C32328p3.m156358e().m156362c().m116910q0(c19558n.m102145i());
            m102417f1(c19558n.m102150n());
            m102437q0(c19558n.m102148l());
            m102415e1(c19558n.m102147k());
            this.f97231h = c19558n.m102151o();
            m102410b1(c19558n.m102153q());
            AbstractC32273e3.m155748Q().mo155823L1(c19558n.m102149m());
            AbstractC32273e3.m155748Q().m155871c2(c19558n.f97085H);
            HandlerC32324p.m156351d(new Runnable() { // from class: gp0.x

                /* renamed from: q */
                public final /* synthetic */ JSONObject f97211q;

                /* renamed from: r */
                public final /* synthetic */ C19558n f97212r;

                public /* synthetic */ RunnableC19575x(JSONObject jSONObject2, C19558n c19558n2) {
                    r2 = jSONObject2;
                    r3 = c19558n2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19577z.this.m102356y0(r2, r3);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    /* renamed from: f1 */
    public void m102417f1(int i11) {
        this.f97235l = i11;
    }

    /* renamed from: g0 */
    public void m102418g0(JSONObject jSONObject) {
        HandlerC32324p.m156351d(new e(jSONObject));
    }

    /* renamed from: g1 */
    public void m102419g1(int i11) {
        this.f97218E = i11;
    }

    @Override // gp0.AbstractC19573v
    /* renamed from: h */
    public void mo102340h(int i11, String str) {
        mo102239a();
        AbstractC3082b0.m15422d("VoipGroupSession", "OnError " + str);
        HandlerC32324p.m156351d(new d(i11));
    }

    /* renamed from: h0 */
    boolean m102420h0(AbstractC19542f abstractC19542f) {
        C19536c c19536c = (C19536c) abstractC19542f;
        int m102330e = c19536c.m102330e();
        int mo102113b = (int) c19536c.mo102113b();
        AbstractC3082b0.m15421c("VoipGroupSession", "Recevice answer from " + mo102113b + " resCode = " + m102330e);
        if (m102330e != 0) {
            int i11 = 5;
            if (m102330e == 1 || m102330e == 3 || m102330e == 5) {
                if (m102330e == 1) {
                    i11 = 4;
                } else if (m102330e == 3) {
                    i11 = 3;
                }
                m102348k0(Integer.valueOf(mo102113b), Integer.valueOf(i11));
            }
        } else {
            C25942f c25942f = new C25942f();
            c25942f.m133675y(mo102113b);
            c25942f.m133666p(c19536c.f97020y);
            c25942f.m133676z(c19536c.f97021z);
            m102354r(mo102113b, c25942f);
            if (C32328p3.m156358e().m156362c().m116842D()) {
                m102441t(true);
            }
        }
        if (C32328p3.m156358e().m156362c().m116851H0(3)) {
            AbstractC32273e3.m155748Q().m155882g1();
        }
        return true;
    }

    /* renamed from: h1 */
    public void m102421h1(boolean z11) {
        this.f97247x = z11;
    }

    /* renamed from: i0 */
    boolean m102422i0(AbstractC19542f abstractC19542f) {
        C19568s c19568s = (C19568s) abstractC19542f;
        int mo102113b = (int) c19568s.mo102113b();
        int m102330e = c19568s.m102330e();
        int i11 = 5;
        if (m102330e == 5) {
            i11 = 6;
        } else if (m102330e != 1) {
            i11 = 0;
        }
        m102348k0(Integer.valueOf(mo102113b), Integer.valueOf(i11));
        return true;
    }

    /* renamed from: i1 */
    public void m102423i1(boolean z11) {
        this.f97224K = z11;
    }

    /* renamed from: j0 */
    boolean m102424j0(AbstractC19542f abstractC19542f) {
        C19568s c19568s = (C19568s) abstractC19542f;
        C25942f m102360B = m102360B((int) c19568s.f97197p);
        if (m102360B == null) {
            m102360B = new C25942f();
            m102360B.m133675y((int) c19568s.f97197p);
        }
        m102360B.m133673w(2);
        m102427l0(m102360B);
        if (C32328p3.m156358e().m156362c().m116851H0(2)) {
            AbstractC32273e3.m155748Q().m155882g1();
            return true;
        }
        return true;
    }

    /* renamed from: j1 */
    public void m102425j1(int i11) {
        this.f97248y = i11;
    }

    /* renamed from: k1 */
    public void m102426k1(int i11) {
        this.f97221H = i11;
    }

    /* renamed from: l0 */
    public void m102427l0(C25942f c25942f) {
        HandlerC32324p.m156351d(new a(c25942f));
    }

    /* renamed from: l1 */
    public void m102428l1(Object obj, boolean z11, int i11) {
        if (z11) {
            this.f97228e = obj;
            C17846e.m94223f().m94224A(obj);
        } else {
            C17846e.m94223f().m94231a(i11, obj);
        }
    }

    /* renamed from: m0 */
    public void m102429m0(C25942f[] c25942fArr) {
        int i11;
        if (c25942fArr == null) {
            return;
        }
        try {
            HashSet m102379L = m102379L(c25942fArr);
            HashSet m102386P = m102386P(c25942fArr);
            HashSet m102381M = m102381M(c25942fArr, m102386P);
            Iterator it = m102379L.iterator();
            while (it.hasNext()) {
                C25942f c25942f = (C25942f) it.next();
                m102354r(c25942f.m133661k(), c25942f);
            }
            Iterator it2 = m102386P.iterator();
            while (it2.hasNext()) {
                C25942f c25942f2 = (C25942f) it2.next();
                C25942f c25942f3 = (C25942f) this.f97226c.get(Integer.valueOf(c25942f2.m133661k()));
                if (c25942f3 != null && c25942f3.m133659i() < 3) {
                    if (c25942f3.m133659i() == 1) {
                        i11 = 1;
                    } else if (c25942f3.m133659i() == 2) {
                        i11 = 2;
                    }
                    m102348k0(Integer.valueOf(c25942f2.m133661k()), Integer.valueOf(i11));
                }
                i11 = 0;
                m102348k0(Integer.valueOf(c25942f2.m133661k()), Integer.valueOf(i11));
            }
            Iterator it3 = m102381M.iterator();
            while (it3.hasNext()) {
                m102427l0((C25942f) it3.next());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m1 */
    public void m102430m1(int i11) {
        if (i11 > 0) {
            AbstractC3082b0.m15421c("VoipGroupSession", "Calling timer start with timeout = " + i11);
            if (this.f97229f == null) {
                AbstractC3082b0.m15421c("VoipGroupSession", "Session timer start with timeout = " + i11);
                this.f97229f = AbstractC17930e.m94544c().mo94531e(new Runnable() { // from class: gp0.y
                    public /* synthetic */ RunnableC19576y() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19577z.this.m102357z0();
                    }
                }, (long) i11);
            }
        }
    }

    /* renamed from: n0 */
    public void m102431n0(int i11, C25942f[] c25942fArr, C25942f c25942f) {
        HandlerC32324p.m156351d(new f(c25942fArr, c25942f, i11));
    }

    /* renamed from: n1 */
    public void m102432n1() {
        C32318n3.m156214E().m156261t();
        C32319o.m156293t().m156326o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m102433o0(AbstractC19542f abstractC19542f) {
        int i11;
        C22592c m156362c = C32328p3.m156358e().m156362c();
        boolean m102338f = AbstractC19573v.m102338f(453, abstractC19542f);
        boolean m116842D = m156362c.m116842D();
        boolean m102440s0 = m102440s0();
        if (m102338f && m116842D) {
            return true;
        }
        this.f97223J = 8;
        if (m102338f) {
            if (((C19568s) abstractC19542f).f97198q != this.f97215B) {
                return false;
            }
        } else if (!m102440s0) {
            if (m116842D) {
                if (m156362c.m116871U()) {
                    m156362c.m116924x0(false);
                    m102436q(m102385O());
                }
            } else if (AbstractC3096i0.f13163g) {
                m156362c.m116876Z(6);
                AbstractC32273e3.m155748Q().m155882g1();
                if (!m156362c.m116871U()) {
                    m156362c.m116916t0(160);
                    m156362c.m116924x0(false);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("groupId", this.f97246w);
                        jSONObject.put("duration", C32328p3.m156358e().m156363d());
                        jSONObject.put("status", 9);
                        AbstractC32273e3.m155748Q().mo155875e0(this.f97215B, this.f97238o, this.f97242s, 1, this.f97244u, jSONObject.toString());
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
            } else {
                try {
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                if (AbstractC19573v.m102336d(455, abstractC19542f)) {
                    i11 = ((C19548i) abstractC19542f).f97037q;
                    if (!m156362c.m116862N()) {
                        m156362c.m116924x0(false);
                        AbstractC32273e3.m155748Q().mo155869c0(5);
                    } else if (m102446v0() && AbstractC19573v.m102336d(454, abstractC19542f)) {
                        m156362c.m116924x0(false);
                        m156362c.m116916t0(154);
                        AbstractC32273e3.m155748Q().mo155869c0(6);
                    } else if (!m156362c.m116856K() && i11 != -15) {
                        if (this.f97223J == 6) {
                            m156362c.m116916t0(155);
                        }
                    } else {
                        m156362c.m116924x0(false);
                        if (m156362c.m116840C()) {
                            m156362c.m116916t0(160);
                            m156362c.m116896j0(9);
                        } else {
                            m156362c.m116916t0(152);
                            AbstractC32273e3.m155748Q().mo155869c0(3);
                        }
                    }
                }
                i11 = 0;
                if (!m156362c.m116862N()) {
                }
            }
        }
        mo102242b(false);
        return true;
    }

    /* renamed from: o1 */
    public void m102434o1(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            this.f97231h = str3;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f97216C = str;
            this.f97217D = str2;
        }
    }

    /* renamed from: p0 */
    boolean m102435p0(AbstractC19542f abstractC19542f) {
        if (AbstractC19573v.m102338f(452, abstractC19542f)) {
            return m102424j0(abstractC19542f);
        }
        if (abstractC19542f instanceof C19536c) {
            return m102420h0(abstractC19542f);
        }
        if (AbstractC19573v.m102336d(455, abstractC19542f)) {
            return m102433o0(abstractC19542f);
        }
        if (abstractC19542f instanceof C19532a) {
            C19532a c19532a = (C19532a) abstractC19542f;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rtpAddress", C32328p3.m156358e().m156362c().m116917u());
                jSONObject.put("rtcpAddress", C32328p3.m156358e().m156362c().m116915t());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("hostCall", m102372H());
                jSONObject2.put("maxUsers", m102390R());
                jSONObject2.put("groupName", m102370G());
                jSONObject2.put("groupAvatar", m102366E());
                jSONObject2.put("groupId", m102368F());
                jSONObject.put("data", jSONObject2.toString());
                AbstractC32273e3.m155748Q().mo155866b0(this.f97242s, m102399W(), m102449x(), m102372H(), m102358A(), jSONObject.toString(), c19532a.f97011s);
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return true;
            }
        }
        if (!AbstractC19573v.m102338f(453, abstractC19542f) && !AbstractC19573v.m102336d(455, abstractC19542f)) {
            if (AbstractC19573v.m102338f(455, abstractC19542f)) {
                return m102422i0(abstractC19542f);
            }
            if (AbstractC19573v.m102338f(471, abstractC19542f)) {
                return m102414e0(abstractC19542f);
            }
            return false;
        }
        return m102433o0(abstractC19542f);
    }

    /* renamed from: q */
    void m102436q(String str) {
        AbstractC3082b0.m15421c("VoipGroupSession", "cancelRequest " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callType", 1);
            jSONObject.put("maxUsers", this.f97244u);
            jSONObject.put("groupId", this.f97246w);
            jSONObject.put("duration", C32328p3.m156358e().m156362c().m116881c());
            jSONObject.put("platform", 1);
            AbstractC32273e3.m155748Q().mo155872d0(this.f97238o, this.f97215B, this.f97242s, str, jSONObject.toString());
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q0 */
    public void m102437q0(C25942f[] c25942fArr) {
        if (this.f97226c.size() > 0) {
            this.f97226c.clear();
        }
        if (c25942fArr != null && c25942fArr.length > 0) {
            this.f97227d = new ArrayList(Arrays.asList(c25942fArr));
            for (C25942f c25942f : c25942fArr) {
                if (c25942f.m133661k() != this.f97242s) {
                    this.f97226c.put(Integer.valueOf(c25942f.m133661k()), c25942f);
                }
            }
        }
    }

    /* renamed from: r0 */
    public boolean m102438r0() {
        return this.f97243t;
    }

    /* renamed from: s */
    public void m102439s() {
        AbstractC32273e3.m155748Q().m155827M1(new Runnable() { // from class: gp0.w
            public /* synthetic */ RunnableC19574w() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19577z.this.m102355x0();
            }
        });
    }

    /* renamed from: s0 */
    public boolean m102440s0() {
        return this.f97223J == 7;
    }

    /* renamed from: t */
    void m102441t(boolean z11) {
        if (this.f97223J == 7) {
            AbstractC3082b0.m15421c("VoipGroupSession", "Was In confirmed Call, not to do");
            return;
        }
        this.f97223J = 7;
        AbstractC3082b0.m15424f("VoipGroupSession", "Change to CONFIRMED to establish call");
        try {
            AbstractC3096i0.f13163g = false;
            C17846e.m94223f().m94233c();
            C32328p3.m156358e().m156362c().m116878a0(System.currentTimeMillis());
            C32328p3.m156358e().m156362c().m116890g0(true);
            C32328p3.m156358e().m156362c().m116914s0(false);
            C32328p3.m156358e().m156362c().m116876Z(5);
            C32318n3.m156214E().m156260Y();
            C32319o.m156293t().m156319h0();
            C32319o.m156293t().m156316e0();
            C32319o.m156293t().m156333t0();
            C32319o.m156293t().m156331s();
            VoipAudioHelper.f148751a.m155635F(AbstractC3096i0.m15574y());
            C3084c0.m15437e("UPDATE_CAMERA_TASK_KEY");
            AbstractC32273e3.m155748Q().mo155927v();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoipGroupSession", "establishCall: " + e11.getMessage(), e11);
        }
    }

    /* renamed from: t0 */
    public boolean m102442t0() {
        return this.f97247x;
    }

    /* renamed from: u */
    public void m102443u() {
        HandlerC32324p.m156351d(new h());
    }

    /* renamed from: u0 */
    public boolean m102444u0() {
        return this.f97224K;
    }

    /* renamed from: v */
    public int m102445v() {
        return this.f97220G;
    }

    /* renamed from: v0 */
    public boolean m102446v0() {
        return this.f97230g;
    }

    /* renamed from: w */
    public long m102447w() {
        return this.f97219F;
    }

    /* renamed from: w0 */
    public boolean m102448w0(C19568s c19568s) {
        if (this.f97215B != c19568s.m102327a()) {
            AbstractC3082b0.m15422d("VoipGroupSession", "mCallId is different than in response event");
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public int m102449x() {
        return this.f97215B;
    }

    /* renamed from: y */
    public String m102450y() {
        return this.f97237n;
    }

    /* renamed from: z */
    public String m102451z() {
        return this.f97236m;
    }
}
