package bo;

import ae.C0758c;
import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import android.util.Size;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3025q0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.LinkAttachment;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import gq.C19581d;
import gq.C19587j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import im.C20612c;
import im.C20620k;
import is.AbstractC20784a0;
import is.AbstractC20809n;
import is.AbstractC20826v0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import me0.AbstractC23041d2;
import me0.AbstractC23047d8;
import me0.AbstractC23067f6;
import me0.AbstractC23161o1;
import me0.AbstractC23238v2;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.EnumC24233k;
import od0.InterfaceC24232j;
import org.json.JSONArray;
import org.json.JSONObject;
import p107dq.C18045a;
import p107dq.C18047c;
import p107dq.C18049e;
import p107dq.C18054j;
import p107dq.InterfaceC18053i;
import p173fz.C19172a;
import p348mi.AbstractC23304d;
import p348mi.C23307g;
import p361nb.AbstractC23647d;
import p398oo.C24371m0;
import p458qr.C25481n;
import p458qr.C25482o;
import p509sp.C26359h;
import p559uv.C27373c;
import p645xh.C29630g;
import p716zh.C31869c6;
import p716zh.C31890dc;
import p726zr.C32546b;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25736b;
import rd0.C25737c;
import rd0.C25744j;
import rd0.C25753s;
import td0.C26638a;
import tn.C26747f0;
import tn.C26761p;
import tr.C26878b;
import tr.C26881e;
import tv.AbstractC26897a;
import vg.C28157p5;

/* renamed from: bo.l0 */
/* loaded from: classes4.dex */
public class C3000l0 implements Serializable {

    /* renamed from: A */
    public C3003l3.c f11851A;

    /* renamed from: A0 */
    private int f11852A0;

    /* renamed from: B */
    public int f11853B;

    /* renamed from: C */
    boolean f11854C;

    /* renamed from: D */
    boolean f11855D;

    /* renamed from: E */
    Map f11856E;

    /* renamed from: F */
    Map f11857F;

    /* renamed from: G */
    C3018o3 f11858G;

    /* renamed from: H */
    public float f11859H;

    /* renamed from: I */
    public int f11860I;

    /* renamed from: J */
    public int f11861J;

    /* renamed from: K */
    public int f11862K;

    /* renamed from: L */
    public int f11863L;

    /* renamed from: M */
    public int f11864M;

    /* renamed from: N */
    public int f11865N;

    /* renamed from: O */
    public boolean f11866O;

    /* renamed from: P */
    public boolean f11867P;

    /* renamed from: Q */
    public boolean f11868Q;

    /* renamed from: R */
    public String f11869R;

    /* renamed from: S */
    public String f11870S;

    /* renamed from: T */
    public String f11871T;

    /* renamed from: U */
    public String f11872U;

    /* renamed from: V */
    public String f11873V;

    /* renamed from: W */
    public boolean f11874W;

    /* renamed from: X */
    public boolean f11875X;

    /* renamed from: Y */
    public List f11876Y;

    /* renamed from: Z */
    public String f11877Z;

    /* renamed from: a0 */
    public int f11878a0;

    /* renamed from: b0 */
    public C3055x0 f11879b0;

    /* renamed from: c0 */
    public int f11880c0;

    /* renamed from: d0 */
    public C2952b2 f11881d0;

    /* renamed from: e0 */
    public String f11882e0;

    /* renamed from: f0 */
    public String f11883f0;

    /* renamed from: g0 */
    public String f11884g0;

    /* renamed from: h0 */
    public Boolean f11885h0;

    /* renamed from: i0 */
    public int f11886i0;

    /* renamed from: j0 */
    TrackingSource f11887j0;

    /* renamed from: k0 */
    public long f11888k0;

    /* renamed from: l0 */
    public C2949b f11889l0;

    /* renamed from: m0 */
    public ArrayList f11890m0;

    /* renamed from: n0 */
    public SongInfo f11891n0;

    /* renamed from: o0 */
    public int f11892o0;

    /* renamed from: p */
    public int f11893p;

    /* renamed from: p0 */
    public long f11894p0;

    /* renamed from: q */
    public String f11895q;

    /* renamed from: q0 */
    public int f11896q0;

    /* renamed from: r */
    public int f11897r;

    /* renamed from: r0 */
    public boolean f11898r0;

    /* renamed from: s */
    public List f11899s;

    /* renamed from: s0 */
    public C3006m1 f11900s0;

    /* renamed from: t */
    boolean f11901t;

    /* renamed from: t0 */
    public C2986i1 f11902t0;

    /* renamed from: u */
    public int f11903u;

    /* renamed from: u0 */
    public String f11904u0;

    /* renamed from: v */
    int f11905v;

    /* renamed from: v0 */
    boolean f11906v0;

    /* renamed from: w */
    Map f11907w;

    /* renamed from: w0 */
    boolean f11908w0;

    /* renamed from: x */
    Map f11909x;

    /* renamed from: x0 */
    HashMap f11910x0;

    /* renamed from: y */
    public boolean f11911y;

    /* renamed from: y0 */
    long f11912y0;

    /* renamed from: z */
    public boolean f11913z;

    /* renamed from: z0 */
    private boolean f11914z0;

    /* renamed from: bo.l0$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C3000l0.this.f11853B++;
            int m104491c = c20096c.m104491c();
            if (m104491c == 18014) {
                try {
                    JSONObject jSONObject = new JSONObject(c20096c.m104492d());
                    if (jSONObject.has("data")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            C3000l0.this.m14326c1(jSONArray.getLong(i11));
                        }
                        C3000l0.this.m14363t1();
                    }
                } catch (Exception e11) {
                    C3000l0.this.m14286C1(m104491c);
                    e11.printStackTrace();
                }
            }
            if (!C3000l0.this.m14307M0()) {
                C3000l0.this.m14286C1(m104491c);
            }
            C3000l0.this.f11854C = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            C3000l0 m108750B0;
            try {
                jSONObject = (JSONObject) obj;
                m108750B0 = AbstractC20826v0.m108750B0(jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
                C3000l0.this.m14286C1(-1000);
            }
            if (m108750B0 != null) {
                C3000l0.this.m14374x1(m108750B0, jSONObject, null);
                C3000l0 c3000l0 = C3000l0.this;
                c3000l0.f11853B++;
                c3000l0.f11854C = false;
                return;
            }
            throw new IllegalArgumentException("onDataProcessed: cannot parse feed item");
        }
    }

    /* renamed from: bo.l0$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                AbstractC20110a.m104539h(e11);
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C3000l0.this.m14343l0(((JSONObject) obj).optJSONObject("data"));
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                AbstractC20110a.m104539h(e11);
            }
            C3000l0 c3000l0 = C3000l0.this;
            c3000l0.f11853B++;
            c3000l0.f11854C = false;
        }
    }

    /* renamed from: bo.l0$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C3000l0.this.f11853B++;
            int m104491c = c20096c.m104491c();
            if (m104491c == 18014) {
                try {
                    JSONObject jSONObject = new JSONObject(c20096c.m104492d());
                    if (jSONObject.has("data")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            C3000l0.this.m14326c1(jSONArray.getLong(i11));
                        }
                        C3000l0.this.m14363t1();
                    }
                } catch (Exception e11) {
                    C3000l0.this.m14286C1(m104491c);
                    AbstractC20110a.m104539h(e11);
                }
            }
            if (!C3000l0.this.m14307M0()) {
                C3000l0.this.m14286C1(m104491c);
            }
            C3000l0.this.f11854C = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C3000l0.this.m14343l0(obj);
            C3000l0 c3000l0 = C3000l0.this;
            c3000l0.f11853B++;
            c3000l0.f11854C = false;
        }
    }

    /* renamed from: bo.l0$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C3000l0 c3000l0 = C3000l0.this;
                c3000l0.f11853B++;
                if (c20096c != null) {
                    int m104491c = c20096c.m104491c();
                    if (!C3000l0.this.m14307M0() || m104491c == 19001 || m104491c == 19002 || m104491c == 19003 || m104491c == 18002 || m104491c == -17 || m104491c == -18 || m104491c == -19 || m104491c == -20 || m104491c == -69) {
                        C3000l0.this.m14286C1(m104491c);
                    }
                } else if (!c3000l0.m14307M0()) {
                    C3000l0.this.m14286C1(-1000);
                }
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                AbstractC20110a.m104539h(e11);
            }
            C3000l0 c3000l02 = C3000l0.this;
            c3000l02.f11906v0 = false;
            c3000l02.f11854C = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C3000l0.this.m14343l0(obj);
            C3000l0 c3000l0 = C3000l0.this;
            c3000l0.f11853B++;
            c3000l0.f11906v0 = false;
            c3000l0.f11854C = false;
        }
    }

    /* renamed from: bo.l0$e */
    /* loaded from: classes4.dex */
    public class e implements InterfaceC20094a {
        e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                AbstractC20110a.m104539h(e11);
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C3000l0.this.m14343l0(((JSONObject) obj).optJSONObject("data"));
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                AbstractC20110a.m104539h(e11);
            }
            C3000l0 c3000l0 = C3000l0.this;
            c3000l0.f11853B++;
            c3000l0.f11854C = false;
        }
    }

    /* renamed from: bo.l0$f */
    /* loaded from: classes4.dex */
    public class f implements InterfaceC20094a {
        f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                AbstractC20110a.m104539h(e11);
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C3000l0.this.m14343l0(((JSONObject) obj).optJSONObject("data"));
                C3000l0 c3000l0 = C3000l0.this;
                c3000l0.f11853B++;
                c3000l0.f11854C = false;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: bo.l0$g */
    /* loaded from: classes4.dex */
    public class g implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ int f11921a;

        /* renamed from: b */
        final /* synthetic */ C24230h f11922b;

        /* renamed from: c */
        final /* synthetic */ String f11923c;

        g(int i11, C24230h c24230h, String str) {
            this.f11921a = i11;
            this.f11922b = c24230h;
            this.f11923c = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            ArrayList m14335h0 = C3000l0.this.m14335h0();
            if (m14335h0 != null && this.f11921a < m14335h0.size()) {
                ((ItemAlbumMobile) m14335h0.get(this.f11921a)).f42611z = this.f11922b.m126532x();
                ((ItemAlbumMobile) m14335h0.get(this.f11921a)).f42550D = this.f11922b.m126532x();
            }
            C3000l0.this.m14332f1(this.f11923c, bVar);
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C3000l0.this.m14330e1(this.f11923c, aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
            if (C3000l0.this.f11857F.size() > 0 && j11 == 100) {
                long size = 100 / C3000l0.this.f11857F.size();
                C26881e.m138493d().m138512u(C3000l0.this.f11895q, (int) ((C3000l0.this.m14337i0().size() * size) + size));
            }
        }
    }

    /* renamed from: bo.l0$h */
    /* loaded from: classes4.dex */
    public class h implements InterfaceC20094a {
        h() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            try {
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (obj != null) {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                JSONObject jSONObject2 = jSONObject.getJSONObject("list");
                if (jSONObject.has("status")) {
                    str = jSONObject.getString("status");
                } else {
                    str = null;
                }
                C3000l0 m108750B0 = AbstractC20826v0.m108750B0(jSONObject2);
                if (m108750B0 != null) {
                    C3000l0.this.m14374x1(m108750B0, jSONObject2, str);
                    C3000l0 c3000l0 = C3000l0.this;
                    c3000l0.f11853B++;
                    c3000l0.f11854C = false;
                    return;
                }
                throw new IllegalArgumentException("onDataProcessed: cannot parse feed item");
            }
            throw new IllegalArgumentException("Invalid data");
        }
    }

    /* renamed from: bo.l0$i */
    /* loaded from: classes4.dex */
    public class i extends AbstractC0939u {
        i() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42058A3(CoreUtility.f89233i, C3000l0.this.f11895q);
        }
    }

    /* renamed from: bo.l0$j */
    /* loaded from: classes4.dex */
    public class j extends AbstractC0939u {
        j() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e m41971c6 = C7960e.m41971c6();
            C3000l0 c3000l0 = C3000l0.this;
            m41971c6.m42448kd(c3000l0.f11895q, AbstractC20826v0.m108827p(c3000l0).toString(), 2);
        }
    }

    /* renamed from: bo.l0$k */
    /* loaded from: classes4.dex */
    public class k implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f11928a;

        k(String str) {
            this.f11928a = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C25481n.f122071a.m131972b("POST_FEED", C3000l0.this.m14254V("UPLOAD_MEDIA"), null);
            C3000l0.this.m14277q0(this.f11928a, bVar);
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C25481n.f122071a.m131972b("POST_FEED", C3000l0.this.m14254V("UPLOAD_MEDIA"), null);
            C3000l0.this.m14276p0(this.f11928a, aVar.m132886a(), aVar.m132887b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
            C26881e.m138493d().m138512u(C3000l0.this.f11895q, j11);
        }
    }

    /* renamed from: bo.l0$l */
    /* loaded from: classes4.dex */
    public class l extends AbstractC0939u {
        l() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42058A3(CoreUtility.f89233i, C3000l0.this.f11895q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bo.l0$m */
    /* loaded from: classes4.dex */
    public class m extends AbstractC0939u {
        m() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42058A3(CoreUtility.f89233i, C3000l0.this.f11895q);
            C7960e m41971c6 = C7960e.m41971c6();
            String str = CoreUtility.f89233i;
            C3000l0 c3000l0 = C3000l0.this;
            m41971c6.m42073B7(str, c3000l0.f11895q, AbstractC20826v0.m108827p(c3000l0).toString(), 4, C3000l0.this.m14341k0());
        }
    }

    /* renamed from: bo.l0$n */
    /* loaded from: classes4.dex */
    public class n extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f11932a;

        n(String str) {
            this.f11932a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e m41971c6 = C7960e.m41971c6();
            String str = C3000l0.this.f11895q;
            String str2 = this.f11932a;
            if (str2 == null) {
                str2 = "";
            }
            m41971c6.m42458ld(str, str2);
        }
    }

    /* renamed from: bo.l0$o */
    /* loaded from: classes4.dex */
    public class o implements InterfaceC20094a {
        o() {
        }

        /* renamed from: d */
        public static /* synthetic */ String m14383d(Object obj) {
            return "doPushFeedVideo#onDataProcessed: entity= " + obj;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C3000l0 c3000l0 = C3000l0.this;
                c3000l0.f11853B++;
                if (c20096c != null) {
                    int m104491c = c20096c.m104491c();
                    if (!C3000l0.this.m14307M0() || m104491c == 19001 || m104491c == 19002 || m104491c == 19003 || m104491c == 18002 || m104491c == -17 || m104491c == -18 || m104491c == -19 || m104491c == -20 || m104491c == -69) {
                        C3000l0.this.m14286C1(m104491c);
                    }
                } else if (!c3000l0.m14307M0()) {
                    C3000l0.this.m14286C1(-1000);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C3000l0.this.m14286C1(-1000);
            }
            C3000l0 c3000l02 = C3000l0.this;
            c3000l02.f11906v0 = false;
            c3000l02.f11854C = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.m0

                    /* renamed from: p */
                    public final /* synthetic */ Object f11971p;

                    public /* synthetic */ C3005m0(Object obj2) {
                        r1 = obj2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m14383d;
                        m14383d = C3000l0.o.m14383d(r1);
                        return m14383d;
                    }
                });
                JSONObject jSONObject2 = (JSONObject) obj2;
                if (jSONObject2.isNull("data")) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C3000l0.this.m14286C1(-1000);
            }
            if (jSONObject != null) {
                C3000l0 m108750B0 = AbstractC20826v0.m108750B0(jSONObject);
                C3000l0.this.m14340j1(m108750B0);
                JSONObject m108827p = AbstractC20826v0.m108827p(m108750B0);
                if (m108750B0 != null) {
                    C3000l0.this.m14374x1(m108750B0, m108827p, "");
                    C3000l0 c3000l0 = C3000l0.this;
                    c3000l0.f11853B++;
                    c3000l0.f11906v0 = false;
                    c3000l0.f11854C = false;
                    return;
                }
                throw new IllegalArgumentException("onDataProcessed: cannot parse feed item video");
            }
            throw new IllegalArgumentException("onDataProcessed: feed item video return null");
        }
    }

    /* renamed from: bo.l0$p */
    /* loaded from: classes4.dex */
    public class p implements InterfaceC20094a {
        p() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            String str;
            try {
                jSONObject = (JSONObject) obj;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (jSONObject != null) {
                int i11 = jSONObject.getInt("error_code");
                if (i11 == 0) {
                    JSONObject jSONObject2 = ((JSONObject) obj).getJSONObject("data");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("list");
                    C3000l0 m108750B0 = AbstractC20826v0.m108750B0(jSONObject3);
                    if (jSONObject2.has("status")) {
                        str = jSONObject2.getString("status");
                    } else {
                        str = null;
                    }
                    if (m108750B0 != null) {
                        C3000l0.this.m14374x1(m108750B0, jSONObject3, str);
                    } else {
                        throw new IllegalArgumentException("onDataProcessed: cannot parse feed item");
                    }
                } else {
                    C3000l0.this.m14286C1(i11);
                }
                C3000l0 c3000l0 = C3000l0.this;
                c3000l0.f11853B++;
                c3000l0.f11854C = false;
                return;
            }
            throw new IllegalArgumentException("Invalid data");
        }
    }

    /* renamed from: bo.l0$q */
    /* loaded from: classes4.dex */
    public class q implements InterfaceC20094a {
        q() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            try {
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (obj != null) {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                JSONObject jSONObject2 = jSONObject.getJSONObject("list");
                C3000l0 m108750B0 = AbstractC20826v0.m108750B0(jSONObject2);
                if (jSONObject.has("status")) {
                    str = jSONObject.getString("status");
                } else {
                    str = null;
                }
                if (m108750B0 != null) {
                    C3000l0.this.m14374x1(m108750B0, jSONObject2, str);
                    C3000l0 c3000l0 = C3000l0.this;
                    c3000l0.f11853B++;
                    c3000l0.f11854C = false;
                    return;
                }
                throw new IllegalArgumentException("onDataProcessed: cannot parse feed item");
            }
            throw new IllegalArgumentException("Invalid data");
        }
    }

    /* renamed from: bo.l0$r */
    /* loaded from: classes4.dex */
    public class r implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f11937a;

        /* renamed from: b */
        final /* synthetic */ String f11938b;

        r(String str, String str2) {
            this.f11937a = str;
            this.f11938b = str2;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C3000l0.this.m14274m0(this.f11937a, c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C3000l0.this.m14347n0(this.f11937a, this.f11938b, obj);
        }
    }

    /* renamed from: bo.l0$s */
    /* loaded from: classes4.dex */
    public class s implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ C24230h f11940a;

        /* renamed from: b */
        final /* synthetic */ String f11941b;

        /* renamed from: c */
        final /* synthetic */ String f11942c;

        s(C24230h c24230h, String str, String str2) {
            this.f11940a = c24230h;
            this.f11941b = str;
            this.f11942c = str2;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C25481n.f122071a.m131972b("POST_FEED", C3000l0.this.m14254V("UPLOAD_MEDIA"), null);
            C3000l0.this.m14275o0(this.f11940a.m126532x(), this.f11941b, this.f11942c, bVar);
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C25481n.f122071a.m131972b("POST_FEED", C3000l0.this.m14254V("UPLOAD_MEDIA"), null);
            C3000l0.this.m14274m0(this.f11941b, aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
            C26881e.m138493d().m138512u(C3000l0.this.f11895q, j11);
        }
    }

    /* renamed from: bo.l0$t */
    /* loaded from: classes4.dex */
    public class t implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f11944a;

        /* renamed from: b */
        final /* synthetic */ String f11945b;

        t(String str, String str2) {
            this.f11944a = str;
            this.f11945b = str2;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C3000l0.this.m14274m0(this.f11944a, c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C3000l0.this.m14347n0(this.f11944a, this.f11945b, obj);
        }
    }

    /* renamed from: bo.l0$u */
    /* loaded from: classes4.dex */
    public class u implements InterfaceC20094a {
        u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:            if (bo.C3000l0.this.m14307M0() == false) goto L35;     */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int i11;
            try {
                C3000l0.this.f11853B++;
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                if (c20096c.m104491c() != 204) {
                }
                C3000l0 c3000l0 = C3000l0.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -1000;
                }
                c3000l0.m14286C1(i11);
                C3000l0.this.f11854C = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            try {
                JSONObject jSONObject = (JSONObject) obj;
                int i11 = jSONObject.getInt("error_code");
                if (i11 == 0) {
                    JSONObject jSONObject2 = ((JSONObject) obj).getJSONObject("data");
                    C3000l0 m108750B0 = AbstractC20826v0.m108750B0(jSONObject2);
                    if (jSONObject.has("status")) {
                        str = jSONObject.getString("status");
                    } else {
                        str = null;
                    }
                    if (m108750B0 != null) {
                        C3000l0.this.m14374x1(m108750B0, jSONObject2, str);
                    } else {
                        throw new IllegalArgumentException("onDataProcessed: cannot parse feed item");
                    }
                } else {
                    C3000l0.this.m14286C1(i11);
                }
            } catch (Exception e11) {
                C3000l0.this.m14286C1(-1000);
                e11.printStackTrace();
            }
            C3000l0 c3000l0 = C3000l0.this;
            c3000l0.f11853B++;
            c3000l0.f11854C = false;
        }
    }

    /* renamed from: bo.l0$v */
    /* loaded from: classes4.dex */
    public class v implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f11948a;

        v(InterfaceC20094a interfaceC20094a) {
            this.f11948a = interfaceC20094a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C3000l0.this.f11908w0 = false;
            InterfaceC20094a interfaceC20094a = this.f11948a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo926a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C3000l0.this.f11908w0 = false;
            InterfaceC20094a interfaceC20094a = this.f11948a;
            if (interfaceC20094a != null) {
                interfaceC20094a.mo927b(obj);
            }
        }
    }

    /* renamed from: bo.l0$w */
    /* loaded from: classes4.dex */
    public static class w {

        /* renamed from: a */
        public int f11950a = 0;

        /* renamed from: b */
        public String f11951b = "";

        /* renamed from: c */
        public String f11952c = "";

        /* renamed from: d */
        public boolean f11953d = false;

        public String toString() {
            return "Error code: " + this.f11950a + "\nError message: " + this.f11951b + "\nDescription: " + this.f11952c + "\nCan retry: " + this.f11953d;
        }
    }

    public C3000l0() {
        this.f11897r = -1;
        this.f11901t = false;
        this.f11907w = new ConcurrentHashMap();
        this.f11909x = new ConcurrentHashMap();
        this.f11911y = false;
        this.f11913z = false;
        this.f11853B = 0;
        this.f11854C = false;
        this.f11855D = false;
        this.f11856E = Collections.synchronizedMap(new LinkedHashMap());
        this.f11857F = Collections.synchronizedMap(new LinkedHashMap());
        this.f11858G = null;
        this.f11859H = 0.0f;
        this.f11865N = 1;
        this.f11866O = false;
        this.f11867P = true;
        this.f11868Q = false;
        this.f11874W = false;
        this.f11875X = false;
        this.f11878a0 = 1;
        this.f11880c0 = -1;
        this.f11882e0 = "";
        this.f11883f0 = "";
        this.f11884g0 = "";
        this.f11885h0 = Boolean.FALSE;
        this.f11888k0 = 0L;
        this.f11891n0 = null;
        this.f11892o0 = -1000;
        this.f11894p0 = C26761p.m137741q().f126944b;
        this.f11896q0 = 0;
        this.f11898r0 = false;
        this.f11900s0 = new C3006m1();
        this.f11904u0 = "";
        this.f11906v0 = false;
        this.f11908w0 = false;
        this.f11910x0 = new HashMap();
        this.f11912y0 = 0L;
        this.f11914z0 = false;
        this.f11852A0 = Integer.MIN_VALUE;
        this.f11903u = 1;
        this.f11905v = -1;
        this.f11893p = 0;
        this.f11895q = "";
        this.f11899s = new ArrayList();
        this.f11913z = false;
    }

    /* renamed from: A */
    public static C3000l0 m14241A(String str, MediaItem mediaItem, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, String str2) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        c3020p0.f12027G = true;
        c3020p0.f12058q = 2;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        int i11 = 0;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        c3020p0.f12023C.f12111b = c3063z0;
        c3020p0.f12042V = privacyInfo;
        String m41146h0 = mediaItem.m41146h0();
        ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
        itemAlbumMobile.f42593q = CoreUtility.f89233i;
        if (mediaItem.m41174v0()) {
            itemAlbumMobile.f42595r = mediaItem.m41119R();
        } else {
            itemAlbumMobile.f42595r = new Random().nextInt(Integer.MAX_VALUE) + "";
        }
        itemAlbumMobile.f42607x = m41146h0;
        itemAlbumMobile.f42611z = mediaItem.mo41081Q();
        itemAlbumMobile.f42548C = m41146h0;
        itemAlbumMobile.f42556G = str;
        c3020p0.f12023C.f12118i.add(itemAlbumMobile);
        if (!mediaItem.m41174v0()) {
            C23307g m118367a = AbstractC23067f6.m118367a(m41146h0);
            c3020p0.f12023C.f12119j = m118367a;
            if (TextUtils.isEmpty(mediaItem.m41175w())) {
                C20612c c20612c = new C20612c(4, 0, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(m41146h0).m107359j(mediaItem.m41121S()).m107361l(mediaItem.m41125U().m110229c()).m107351b(mediaItem.m41172u()).m107350a());
                C28157p5.m141667d().m141678m(c20612c);
                mediaItem.m41099E0(c20612c.m107293q());
            }
        }
        C3025q0 c3025q0 = c3020p0.f12023C;
        if (c31890dc != null) {
            i11 = c31890dc.f146495a;
        }
        c3025q0.f12096E = i11;
        c3025q0.f12108Q = songInfo;
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        if (!mediaItem.m41174v0()) {
            c3000l0.f11857F.put(m41146h0, new C3053w2(-1L, null));
            c3000l0.f11856E.put(m41146h0, mediaItem.m41175w());
        } else {
            c3000l0.f11857F.put(m41146h0, new C3053w2(Long.parseLong(mediaItem.m41119R()), null));
        }
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11888k0 = j11;
        c3000l0.f11889l0 = c2949b;
        c3000l0.f11891n0 = songInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaItem);
        c3000l0.f11890m0 = AbstractC20826v0.m108829q(c3020p0.f12023C.f12118i, AbstractC20784a0.m108447k(arrayList));
        c3000l0.f11904u0 = str2;
        return c3000l0;
    }

    /* renamed from: B */
    public static C3000l0 m14242B(String str, int i11, int i12, String str2, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, String str3) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        c3020p0.f12027G = true;
        c3020p0.f12058q = 6;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        int i13 = 0;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        c3020p0.f12042V = privacyInfo;
        C3025q0 c3025q0 = c3020p0.f12023C;
        c3025q0.f12131v = str2;
        c3025q0.f12130u = str2;
        c3025q0.f12132w = i11;
        c3025q0.f12133x = i12;
        c3025q0.f12111b = c3063z0;
        if (c31890dc != null) {
            i13 = c31890dc.f146495a;
        }
        c3025q0.f12096E = i13;
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11904u0 = str3;
        return c3000l0;
    }

    /* renamed from: C */
    public static C3000l0 m14243C(String str, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, String str2) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        c3020p0.f12027G = true;
        c3020p0.f12058q = 1;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        int i11 = 0;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        c3020p0.f12042V = privacyInfo;
        C3025q0 c3025q0 = c3020p0.f12023C;
        c3025q0.f12111b = c3063z0;
        if (c31890dc != null) {
            i11 = c31890dc.f146495a;
        }
        c3025q0.f12096E = i11;
        if (c31890dc != null && !c31890dc.m153248s()) {
            c3020p0.f12023C.f12097F = new C3013n3(c31890dc.f146514t, c31890dc.m153237b(), c31890dc.f146516v, c31890dc.f146515u, 0);
        }
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11904u0 = str2;
        return c3000l0;
    }

    /* renamed from: D */
    public static C3000l0 m14244D(String str, C27373c c27373c, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, String str2, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, String str3) {
        int m140272z;
        int m140221F;
        float f11;
        boolean z11;
        int i11;
        String str4;
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        c3020p0.f12027G = true;
        c3020p0.f12058q = 17;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        c3020p0.f12023C.f12111b = c3063z0;
        c3020p0.f12042V = privacyInfo;
        if (c27373c.m140265s() != 90 && c27373c.m140265s() != 270) {
            m140272z = c27373c.m140221F();
            m140221F = c27373c.m140272z();
        } else {
            m140272z = c27373c.m140272z();
            m140221F = c27373c.m140221F();
        }
        c3020p0.f12023C.f12119j = new C23307g(m140272z, m140221F);
        if (m140272z > 0 && m140221F > 0) {
            f11 = m140272z / m140221F;
        } else {
            f11 = 1.0f;
        }
        String m140220E = c27373c.m140220E();
        c3020p0.f12023C.f12093B = new C17391z(c3020p0.f12057p, "", m140220E, "", c27373c.m140268v(), C23278z2.m120136k0().f116260a, false, 9, f11, 1, null, c3020p0.m14465A(), 0);
        if (!c27373c.f128943P && !c27373c.f128942O) {
            z11 = true;
        } else {
            C3025q0 c3025q0 = c3020p0.f12023C;
            c3025q0.f12092A = c27373c.f128947T;
            c3025q0.f12095D = true;
            z11 = false;
        }
        C17391z c17391z = c3020p0.f12023C.f12093B;
        c17391z.f88630m = z11;
        c17391z.f88632o = c27373c.m140254h();
        C3025q0 c3025q02 = c3020p0.f12023C;
        if (c31890dc != null) {
            i11 = c31890dc.f146495a;
        } else {
            i11 = 0;
        }
        c3025q02.f12096E = i11;
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        if (!TextUtils.isEmpty(m140220E) && (m140220E.startsWith("http") || m140220E.startsWith("https"))) {
            c3020p0.f12023C.f12093B.f88634q = c27373c.m140260n();
        } else {
            if (TextUtils.isEmpty(str2)) {
                AbstractC26897a.m138621g(c27373c, false);
                str4 = new C20612c(4, 2, C20620k.m107330a().m107370u(c27373c.m140221F()).m107356g(c27373c.m140272z()).m107357h(c27373c.m140258l()).m107358i(c27373c.m140259m()).m107352c(c27373c.m140251f()).m107363n(c27373c.m140220E()).m107353d("mp4").m107366q(c27373c.m140270x()).m107365p(c27373c.m140269w()).m107367r(c27373c.m140271y()).m107369t(c27373c.m140219D()).m107368s(c27373c.m140216A()).m107350a()).m107293q();
            } else {
                str4 = str2;
            }
            c3000l0.f11856E.put(m140220E, str4);
            c3000l0.f11858G = new C3018o3(0);
        }
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11888k0 = j11;
        c3000l0.f11889l0 = c2949b;
        C3025q0 c3025q03 = c3020p0.f12023C;
        c3000l0.f11890m0 = AbstractC20826v0.m108831r(c3025q03.f12093B, c3025q03.f12119j);
        c3000l0.f11904u0 = str3;
        return c3000l0;
    }

    /* renamed from: F1 */
    private void m14245F1(w wVar) {
        InterfaceC18053i m137767r;
        if (!TextUtils.isEmpty(this.f11904u0) && (m137767r = C26761p.m137741q().m137767r(this.f11904u0)) != null) {
            m137767r.mo95946c(wVar);
        }
    }

    /* renamed from: G1 */
    private void m14246G1(C3000l0 c3000l0) {
        InterfaceC18053i m137767r;
        if (!TextUtils.isEmpty(this.f11904u0) && (m137767r = C26761p.m137741q().m137767r(this.f11904u0)) != null) {
            m137767r.mo95945b(c3000l0);
        }
    }

    /* renamed from: M */
    private void m14247M() {
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            C3020p0 m14322a0 = m14322a0();
            String charSequence = m14322a0.f12023C.f12110a.toString();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new u());
            C26881e.m138493d().m138511o(2, this.f11895q);
            String str = this.f11895q;
            C3025q0 c3025q0 = m14322a0.f12023C;
            String str2 = c3025q0.f12101J;
            int i11 = c3025q0.f12102K;
            C17244x0 c17244x0 = c3025q0.f12104M;
            ArrayList m14318W = m14318W();
            C3025q0 c3025q02 = m14322a0.f12023C;
            c0766k.mo1638f9(str, charSequence, str2, i11, c17244x0, m14318W, c3025q02.f12111b, m14322a0.f12042V, c3025q02.f12096E, c3025q02.f12103L, 0, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: P0 */
    public /* synthetic */ String m14248P0() {
        return "start post async: isPosting=" + this.f11854C;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ String m14249Q0(String str, int i11, EnumC24229g enumC24229g) {
        return "upload item: videoFilePath: " + str + " fileId: " + i11 + " uploadFeature: " + enumC24229g;
    }

    /* renamed from: R0 */
    public static /* synthetic */ String m14250R0() {
        return "start push feed";
    }

    /* renamed from: S0 */
    public static /* synthetic */ String m14251S0(String str, JSONObject jSONObject) {
        return "doPushFeedVideo: mediaId= " + str + "\ndata= " + jSONObject;
    }

    /* renamed from: T0 */
    public static /* synthetic */ String m14252T0(Exception exc) {
        return "doPushFeedVideo: failed " + exc.getMessage();
    }

    /* renamed from: U0 */
    public static /* synthetic */ String m14253U0(C20096c c20096c, String str) {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Upload failed; errorCode=");
        if (c20096c == null) {
            valueOf = "UNKNOWN";
        } else {
            valueOf = Integer.valueOf(c20096c.m104491c());
        }
        sb2.append(valueOf);
        sb2.append("; path=");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: V */
    public String m14254V(String str) {
        if (this.f11895q != null) {
            return str + "_" + this.f11895q;
        }
        return str;
    }

    /* renamed from: V0 */
    public static /* synthetic */ String m14255V0(String str, AbstractC25751q abstractC25751q) {
        return "Post async video success: \npath = " + str + "\nresponse = " + abstractC25751q;
    }

    /* renamed from: W0 */
    public static /* synthetic */ String m14256W0(Exception exc) {
        return "handleUploadFeedVideoSuccess: failed " + exc.getMessage();
    }

    /* renamed from: X0 */
    private void m14257X0(int i11, int i12) {
        if (i11 != 0) {
            if (i11 == 1) {
                m14258Y0(this.f11912y0, i12);
            }
        } else {
            m14259Z0(this.f11912y0);
        }
        m14378z1(0L);
    }

    /* renamed from: Y0 */
    private void m14258Y0(long j11, int i11) {
        int i12;
        ArrayList arrayList;
        try {
            C3020p0 m14322a0 = m14322a0();
            int i13 = m14322a0.f12058q;
            if (i13 == 3) {
                C3025q0 c3025q0 = m14322a0.f12023C;
                if (c3025q0 != null && (arrayList = c3025q0.f12118i) != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                C25482o.f122075a.m132017y(j11, i12);
            }
            if (this.f11914z0) {
                C25482o c25482o = C25482o.f122075a;
                c25482o.m132003k(j11, i13, this.f11852A0);
                c25482o.m132007o(j11, Integer.valueOf(this.f11852A0));
            } else {
                C25482o.f122075a.m132003k(j11, i13, i11);
            }
            if (m14339j0() == 4) {
                C25482o.f122075a.m132004l(j11, Integer.valueOf(i11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z0 */
    private void m14259Z0(long j11) {
        int i11;
        ArrayList arrayList;
        try {
            C3020p0 m14322a0 = m14322a0();
            int i12 = m14322a0.f12058q;
            if (i12 == 3) {
                C3025q0 c3025q0 = m14322a0.f12023C;
                if (c3025q0 != null && (arrayList = c3025q0.f12118i) != null) {
                    i11 = arrayList.size();
                } else {
                    i11 = 0;
                }
                C25482o.f122075a.m132018z(j11, i11);
            }
            C25482o c25482o = C25482o.f122075a;
            c25482o.m131980A(j11, System.currentTimeMillis() - this.f11912y0, i12);
            if (m14339j0() == 4) {
                c25482o.m131981B(j11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b1 */
    private void m14262b1(int i11) {
        C3020p0 m14322a0 = m14322a0();
        if (m14322a0 != null && m14322a0.f12058q == 22 && m14322a0.f12023C != null) {
            if (i11 == 3) {
                C26747f0.m137582I().m137627j0(m14322a0.f12023C.f12101J);
            } else if (i11 == 2) {
                C26747f0.m137582I().m137625i0(m14322a0.f12023C.f12101J);
            } else if (i11 == 5) {
                C26747f0.m137582I().m137623h0(m14322a0.f12023C.f12101J);
            }
        }
    }

    /* renamed from: m0 */
    public void m14274m0(String str, C20096c c20096c) {
        try {
            m14352p1(str);
            this.f11853B++;
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (!m14307M0() || m104491c == 18002 || m104491c == -17 || m104491c == -18 || m104491c == -19 || m104491c == -20 || m104491c == -69 || m104491c == 18001 || m104491c == 18002 || m104491c == 18005 || m104491c == 18019 || m104491c == 18020 || m104491c == 18099 || m104491c == 18004 || m104491c == 18003) {
                    m14286C1(m104491c);
                }
            } else if (!m14307M0()) {
                m14286C1(-1000);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m14286C1(-1000);
        }
        this.f11854C = false;
    }

    /* renamed from: o0 */
    public void m14275o0(String str, String str2, String str3, AbstractC25752r.b bVar) {
        try {
            ArrayList m14335h0 = m14335h0();
            if (m14335h0 != null) {
                ((ItemAlbumMobile) m14335h0.get(0)).f42611z = str;
                ((ItemAlbumMobile) m14335h0.get(0)).f42550D = str;
            }
            AbstractC25751q m132889b = bVar.m132889b();
            if (m132889b instanceof C25737c) {
                JSONObject m132853a = ((C25737c) m132889b).m132853a();
                if (m132853a != null) {
                    m14347n0(str2, str3, m132853a);
                    return;
                }
                throw new IllegalArgumentException("onDataProcessed: cannot get feed data");
            }
            if (m132889b instanceof C25753s) {
                long m132890a = ((C25753s) m132889b).m132890a();
                C23307g m118367a = AbstractC23067f6.m118367a(str2);
                m14352p1(str2);
                this.f11857F.put(str2, new C3053w2(m132890a, m118367a));
                C26881e.m138493d().m138511o(2, this.f11895q);
                m14315S(false, new t(str2, str3), this.f11887j0);
                return;
            }
            throw new IllegalArgumentException("onDataProcessed: cannot cast any response type");
        } catch (Exception e11) {
            e11.printStackTrace();
            m14274m0(str2, C26638a.f126094a.m136734c());
        }
    }

    /* renamed from: p0 */
    public void m14276p0(String str, C20096c c20096c, EnumC24233k enumC24233k) {
        try {
            this.f11853B++;
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.i0

                /* renamed from: q */
                public final /* synthetic */ String f11798q;

                public /* synthetic */ C2985i0(String str2) {
                    r2 = str2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m14253U0;
                    m14253U0 = C3000l0.m14253U0(C20096c.this, r2);
                    return m14253U0;
                }
            });
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (!m14307M0() || m104491c == 19001 || m104491c == 19002 || m104491c == 19003 || m104491c == 18002 || m104491c == -17 || m104491c == -18 || m104491c == -19 || m104491c == -20 || m104491c == -69) {
                    m14286C1(m104491c);
                }
            } else if (!m14307M0()) {
                m14286C1(-1000);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            m14286C1(-1000);
        }
        C3018o3 c3018o3 = this.f11858G;
        if (c3018o3 != null) {
            c3018o3.f12008b = 3;
        } else {
            this.f11858G = new C3018o3(enumC24233k, 3, "");
        }
        this.f11854C = false;
    }

    /* renamed from: q0 */
    public void m14277q0(String str, AbstractC25752r.b bVar) {
        try {
            AbstractC25751q m132889b = bVar.m132889b();
            EnumC24233k m132888a = bVar.m132888a();
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.j0

                /* renamed from: p */
                public final /* synthetic */ String f11814p;

                /* renamed from: q */
                public final /* synthetic */ AbstractC25751q f11815q;

                public /* synthetic */ C2990j0(String str2, AbstractC25751q m132889b2) {
                    r1 = str2;
                    r2 = m132889b2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m14255V0;
                    m14255V0 = C3000l0.m14255V0(r1, r2);
                    return m14255V0;
                }
            });
            if (m132889b2 instanceof C25744j) {
                String m132870a = ((C25744j) m132889b2).m132870a();
                C3018o3 c3018o3 = this.f11858G;
                if (c3018o3 != null) {
                    c3018o3.f12008b = 2;
                    c3018o3.f12009c = m132870a;
                    c3018o3.f12007a = m132888a;
                } else {
                    this.f11858G = new C3018o3(m132888a, 2, m132870a);
                }
                C26881e.m138493d().m138511o(2, this.f11895q);
                m14317U();
                return;
            }
            throw new IllegalArgumentException("onDataProcessed: Unknown uploadResponse type");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            m14286C1(-1000);
            this.f11854C = false;
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.k0

                /* renamed from: p */
                public final /* synthetic */ Exception f11830p;

                public /* synthetic */ C2995k0(Exception e112) {
                    r1 = e112;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m14256W0;
                    m14256W0 = C3000l0.m14256W0(r1);
                    return m14256W0;
                }
            });
        }
    }

    /* renamed from: x */
    public static C3000l0 m14278x(String str, LinkAttachment linkAttachment, C3023p3 c3023p3, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, String str2) {
        C23307g c23307g;
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        if (c3023p3 != null && !TextUtils.isEmpty(c3023p3.m14552i())) {
            c3020p0.f12058q = 24;
        } else {
            c3020p0.f12058q = 7;
        }
        c3020p0.f12027G = true;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        int i11 = 0;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        c3020p0.f12042V = privacyInfo;
        c3020p0.f12023C.f12134y = new C3025q0.b();
        C3025q0 c3025q0 = c3020p0.f12023C;
        C3025q0.b bVar = c3025q0.f12134y;
        String str3 = linkAttachment.f42626r;
        bVar.f12139b = str3;
        bVar.f12140c = str3;
        bVar.f12141d = linkAttachment.f42624p;
        bVar.f12138a = linkAttachment.f42625q;
        bVar.f12142e = linkAttachment.f42628t;
        C31869c6 c31869c6 = linkAttachment.f42630v;
        bVar.f12149l = c31869c6;
        bVar.f12143f = linkAttachment.f42627s;
        bVar.f12144g = linkAttachment.f42631w;
        bVar.f12145h = linkAttachment.f42632x;
        bVar.f12146i = linkAttachment.f42633y;
        if (c31869c6 != null) {
            c23307g = c31869c6.f146362h;
        } else {
            c23307g = null;
        }
        c3025q0.f12119j = c23307g;
        if (c31890dc != null) {
            i11 = c31890dc.f146495a;
        }
        c3025q0.f12096E = i11;
        c3025q0.f12111b = c3063z0;
        c3025q0.f12100I = c3023p3;
        c3020p0.f12024D = linkAttachment.f42629u;
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11904u0 = str2;
        return c3000l0;
    }

    /* renamed from: y */
    public static C3000l0 m14279y(String str, String str2, int i11, C17244x0 c17244x0, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i12, double d11, TrackingSource trackingSource, String str3) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        c3020p0.f12027G = true;
        c3020p0.f12058q = 22;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        c3020p0.f12042V = privacyInfo;
        C3025q0 c3025q0 = c3020p0.f12023C;
        c3025q0.f12111b = c3063z0;
        c3025q0.f12096E = i12;
        c3025q0.f12101J = str2;
        c3025q0.f12102K = i11;
        c3025q0.f12103L = d11;
        c3025q0.f12104M = c17244x0;
        c3025q0.f12105N = true;
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11904u0 = str3;
        return c3000l0;
    }

    /* renamed from: z */
    public static C3000l0 m14280z(String str, ArrayList arrayList, boolean z11, C3003l3 c3003l3, C3063z0 c3063z0, PrivacyInfo privacyInfo, C31890dc c31890dc, TrackingSource trackingSource, long j11, C2949b c2949b, SongInfo songInfo, C18049e c18049e, String str2) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C3020p0 c3020p0 = new C3020p0();
        c3020p0.f12027G = true;
        c3020p0.f12058q = 3;
        c3020p0.f12057p = mo124311f + "";
        C3047v0 c3047v0 = c3020p0.f12022B;
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        c3047v0.f12283e = contactProfile.f42446v;
        c3047v0.f12282d = contactProfile.f42437s;
        c3047v0.f12280b = CoreUtility.f89233i;
        c3047v0.f12279a = 0;
        c3020p0.m14538z0(str);
        c3020p0.f12062u = mo124311f;
        c3020p0.f12059r = c3003l3;
        C3025q0 c3025q0 = c3020p0.f12023C;
        c3025q0.f12111b = c3063z0;
        c3020p0.f12042V = privacyInfo;
        c3025q0.f12096E = c31890dc != null ? c31890dc.f146495a : 0;
        c3025q0.f12108Q = songInfo;
        c3025q0.f12127r = c18049e;
        List mo102461d = C19587j.f97307a.m102530f(c18049e == null ? 0 : c18049e.m95929b()).mo102461d(arrayList);
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            MediaItem mediaItem = (MediaItem) it.next();
            String m41146h0 = mediaItem.m41146h0();
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.f42593q = CoreUtility.f89233i;
            if (!TextUtils.isEmpty(mediaItem.m41119R())) {
                itemAlbumMobile.f42595r = mediaItem.m41119R();
            } else {
                itemAlbumMobile.f42595r = new Random().nextInt(Integer.MAX_VALUE) + "";
            }
            itemAlbumMobile.f42607x = m41146h0;
            itemAlbumMobile.f42611z = mediaItem.mo41081Q();
            itemAlbumMobile.f42548C = m41146h0;
            itemAlbumMobile.f42556G = str;
            if (z11 && i11 < mo102461d.size()) {
                itemAlbumMobile.f42596r0 = (ItemAlbumMobile.C7883c) mo102461d.get(i11);
            }
            c3020p0.f12023C.f12118i.add(itemAlbumMobile);
            i11++;
        }
        C3000l0 c3000l0 = new C3000l0(c3020p0, 1, true);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaItem mediaItem2 = (MediaItem) it2.next();
            String m41146h02 = mediaItem2.m41146h0();
            if (!mediaItem2.m41174v0()) {
                c3000l0.f11857F.put(m41146h02, new C3053w2(-1L, null));
                if (TextUtils.isEmpty(mediaItem2.m41175w())) {
                    C23307g m118367a = AbstractC23067f6.m118367a(m41146h02);
                    mediaItem2.m41099E0(new C20612c(0, 20, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(m41146h02).m107359j(mediaItem2.m41121S()).m107361l(mediaItem2.m41125U().m110229c()).m107351b(mediaItem2.m41172u()).m107350a()).m107293q());
                }
                c3000l0.f11856E.put(m41146h02, mediaItem2.m41175w());
            } else {
                c3000l0.f11857F.put(m41146h02, new C3053w2(Long.parseLong(mediaItem2.m41119R()), null));
            }
        }
        c3000l0.f11887j0 = trackingSource;
        c3000l0.f11888k0 = j11;
        c3000l0.f11889l0 = c2949b;
        c3000l0.f11891n0 = songInfo;
        c3000l0.f11890m0 = AbstractC20826v0.m108829q(c3020p0.f12023C.f12118i, AbstractC20784a0.m108447k(arrayList));
        c3000l0.f11904u0 = str2;
        return c3000l0;
    }

    /* renamed from: A0 */
    public boolean m14281A0() {
        int i11 = this.f11893p;
        return i11 == 2 || i11 == 1 || i11 == 8 || i11 == 9 || i11 == 10 || i11 == 12 || i11 == 7;
    }

    /* renamed from: A1 */
    public synchronized void m14282A1(int i11) {
        this.f11905v = i11;
    }

    /* renamed from: B0 */
    public boolean m14283B0() {
        return this.f11893p == 7;
    }

    /* renamed from: B1 */
    public void m14284B1() {
        m14372w1(-1000);
        C26881e.m138493d().m138510m(this.f11895q, 5);
        m14262b1(5);
        C0824j.m2153b(new l());
        m14282A1(5);
    }

    /* renamed from: C0 */
    public boolean m14285C0() {
        return this.f11903u == 2;
    }

    /* renamed from: C1 */
    public void m14286C1(int i11) {
        String str;
        m14372w1(i11);
        C26881e.m138493d().m138510m(this.f11895q, 2);
        m14262b1(2);
        C0824j.m2153b(new j());
        m14257X0(1, i11);
        m14282A1(2);
        w m108845y = AbstractC20826v0.m108845y(i11, this.f11895q);
        m14245F1(m108845y);
        if (m108845y.f11953d) {
            str = "4915501";
        } else {
            str = "4915504";
        }
        AbstractC23647d.m123897g(str);
        C25481n.f122071a.m131972b("POST_FEED", m14254V("UPLOAD_FEED"), null);
    }

    /* renamed from: D0 */
    public boolean m14287D0() {
        return this.f11896q0 == 0;
    }

    /* renamed from: D1 */
    public void m14288D1() {
        try {
            this.f11855D = false;
            this.f11854C = false;
            this.f11908w0 = false;
            m14372w1(-1000);
            C26881e.m138493d().m138510m(this.f11895q, 4);
            m14282A1(4);
            m14322a0().f12062u = C23793c.m124316k().mo124311f();
            this.f11853B = 0;
            C0824j.m2153b(new m());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    C24230h m14289E(String str, int i11) {
        C24230h m126395Q = C24226d.m126395Q(m14319X(str), EnumC24229g.f116986t, str, 0L, false);
        m126395Q.m126505h(new g(i11, m126395Q, str));
        return m126395Q;
    }

    /* renamed from: E0 */
    public boolean m14290E0() {
        int i11 = this.f11905v;
        return i11 == 1 || i11 == 4;
    }

    /* renamed from: E1 */
    void m14291E1(C3000l0 c3000l0, JSONObject jSONObject, String str) {
        if (c3000l0 == null) {
            return;
        }
        if (c3000l0.m14322a0() == null || !c3000l0.m14322a0().m14488S()) {
            c3000l0.f11869R = MainApplication.getAppContext().getString(AbstractC8020f0.profile_today);
        }
        if (m14322a0().f12058q != 17 && !m14322a0().m14508h0()) {
            if (m14322a0().f12058q == 2 || m14322a0().f12058q == 3) {
                m14338i1(m14322a0(), c3000l0.m14322a0());
            }
        } else {
            AbstractC20826v0.m108794X0(m14322a0(), c3000l0.m14322a0());
        }
        C24371m0.m127468p().mo127472d(0).m127393C(c3000l0);
        C0824j.m2153b(new i());
        C26878b.f127183a.m138456h(this.f11895q, c3000l0);
        AbstractC23304d.f113304M2 = AbstractC20826v0.m108757F(c3000l0);
        m14372w1(0);
        m14246G1(c3000l0);
        m14257X0(0, Integer.MIN_VALUE);
        m14282A1(3);
        C25481n.f122071a.m131972b("POST_FEED", m14254V("UPLOAD_FEED"), null);
    }

    /* renamed from: F */
    public boolean m14292F(ArrayList arrayList) {
        boolean z11 = false;
        try {
            Iterator it = this.f11899s.iterator();
            while (it.hasNext()) {
                C3020p0 c3020p0 = (C3020p0) it.next();
                if (c3020p0.m14511j(arrayList)) {
                    z11 = true;
                    if (c3020p0.f12023C.f12118i.size() == 0 && c3020p0.f12023C.f12107P.size() == 0) {
                        it.remove();
                    }
                }
            }
            if (z11 && this.f11893p == 2) {
                m14298H1();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return z11;
    }

    /* renamed from: F0 */
    public boolean m14293F0() {
        int i11 = this.f11893p;
        return i11 == 0 || i11 == 3 || i11 == 16;
    }

    /* renamed from: G */
    void m14294G() {
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            C3020p0 m14322a0 = m14322a0();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f());
            C26881e.m138493d().m138511o(2, this.f11895q);
            long parseLong = Long.parseLong(this.f11895q);
            String charSequence = m14322a0.f12023C.f12110a.toString();
            PrivacyInfo privacyInfo = m14322a0.f12042V;
            ArrayList m14318W = m14318W();
            C3025q0 c3025q0 = m14322a0.f12023C;
            c0766k.mo1549U7(parseLong, charSequence, privacyInfo, m14318W, c3025q0.f12111b, c3025q0.f12096E, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: G0 */
    public boolean m14295G0() {
        int i11 = this.f11893p;
        return i11 == 3 || i11 == 16;
    }

    /* renamed from: H */
    void m14296H() {
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            C3020p0 m14322a0 = m14322a0();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new e());
            C26881e.m138493d().m138511o(2, this.f11895q);
            long parseLong = Long.parseLong(this.f11895q);
            String charSequence = m14322a0.f12023C.f12110a.toString();
            PrivacyInfo privacyInfo = m14322a0.f12042V;
            ArrayList m14318W = m14318W();
            C3025q0 c3025q0 = m14322a0.f12023C;
            c0766k.mo1706oa(parseLong, charSequence, privacyInfo, m14318W, c3025q0.f12111b, c3025q0.f12096E, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: H0 */
    public boolean m14297H0() {
        int i11 = this.f11893p;
        return i11 == 3 || i11 == 16 || i11 == 7;
    }

    /* renamed from: H1 */
    public void m14298H1() {
        float m108580n = AbstractC20809n.m108580n(this);
        if (m108580n > 0.0f) {
            this.f11859H = m108580n;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m14299I() {
        int i11;
        C18054j c18054j;
        try {
            c cVar = new c();
            C3020p0 m14322a0 = m14322a0();
            ArrayList m14337i0 = m14337i0();
            ArrayList m14320Y = m14320Y();
            if (m14337i0.size() != 0) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(cVar);
                C3025q0 c3025q0 = m14322a0.f12023C;
                C18049e c18049e = c3025q0.f12127r;
                int m14566c = c3025q0.m14566c();
                if (m14566c == 3) {
                    if (c18049e.m95928a() != null) {
                        c18054j = c18049e.m95928a().m95914b();
                    } else {
                        c18054j = null;
                    }
                    if (c18054j != null) {
                        i11 = C19581d.f97279a.m102500w(c18054j.m95948b());
                        if (m14566c != 0) {
                            if (m14566c != 1) {
                                if (m14566c != 2 && m14566c != 3) {
                                    return;
                                }
                            } else {
                                C18045a m95928a = c18049e.m95928a();
                                Objects.requireNonNull(m95928a);
                                C18047c m95913a = m95928a.m95913a();
                                if (m95913a != null) {
                                    int m95923b = m95913a.m95923b();
                                    if (m95913a.m95922a() != null && m95913a.m95922a().m95926b() != null && m95913a.m95922a().m95925a() != null) {
                                        int m95920b = m95913a.m95922a().m95926b().m95920b();
                                        int m95919a = m95913a.m95922a().m95926b().m95919a();
                                        int m95920b2 = m95913a.m95922a().m95925a().m95920b();
                                        int m95919a2 = m95913a.m95922a().m95925a().m95919a();
                                        long parseLong = Long.parseLong(this.f11895q);
                                        long j11 = m14322a0.f12062u;
                                        String charSequence = m14322a0.f12023C.f12110a.toString();
                                        ArrayList m14318W = m14318W();
                                        C3025q0 c3025q02 = m14322a0.f12023C;
                                        c0766k.mo1724r4(parseLong, j11, m14337i0, charSequence, m14318W, c3025q02.f12111b, m14322a0.f12042V, m14320Y, this.f11868Q, c3025q02.f12096E, this.f11887j0, this.f11891n0, m14566c, i11, m95923b, m95920b, m95919a, m95920b2, m95919a2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        long parseLong2 = Long.parseLong(this.f11895q);
                        long j12 = m14322a0.f12062u;
                        String charSequence2 = m14322a0.f12023C.f12110a.toString();
                        ArrayList m14318W2 = m14318W();
                        C3025q0 c3025q03 = m14322a0.f12023C;
                        c0766k.mo1724r4(parseLong2, j12, m14337i0, charSequence2, m14318W2, c3025q03.f12111b, m14322a0.f12042V, m14320Y, this.f11868Q, c3025q03.f12096E, this.f11887j0, this.f11891n0, m14566c, i11, 0, 0, 0, 0, 0);
                        return;
                    }
                }
                i11 = 1;
                if (m14566c != 0) {
                }
                long parseLong22 = Long.parseLong(this.f11895q);
                long j122 = m14322a0.f12062u;
                String charSequence22 = m14322a0.f12023C.f12110a.toString();
                ArrayList m14318W22 = m14318W();
                C3025q0 c3025q032 = m14322a0.f12023C;
                c0766k.mo1724r4(parseLong22, j122, m14337i0, charSequence22, m14318W22, c3025q032.f12111b, m14322a0.f12042V, m14320Y, this.f11868Q, c3025q032.f12096E, this.f11887j0, this.f11891n0, m14566c, i11, 0, 0, 0, 0, 0);
                return;
            }
            throw new IllegalArgumentException("Call doPushFeedPhoto when no photo has been uploaded");
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: I0 */
    public boolean m14300I0() {
        return this.f11893p == 16;
    }

    /* renamed from: J */
    void m14301J() {
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            C3020p0 m14322a0 = m14322a0();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            C26881e.m138493d().m138511o(2, this.f11895q);
            long parseLong = Long.parseLong(this.f11895q);
            String charSequence = m14322a0.f12023C.f12110a.toString();
            int i11 = m14322a0.f12023C.f12132w;
            PrivacyInfo privacyInfo = m14322a0.f12042V;
            ArrayList m14318W = m14318W();
            C3025q0 c3025q0 = m14322a0.f12023C;
            c0766k.mo1628e7(parseLong, charSequence, i11, privacyInfo, m14318W, c3025q0.f12111b, c3025q0.f12096E, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: J0 */
    public boolean m14302J0() {
        return this.f11893p == 16;
    }

    /* renamed from: K */
    void m14303K() {
        String str;
        String str2;
        String str3;
        VideoBlendingParam videoBlendingParam;
        try {
            if (this.f11906v0) {
                return;
            }
            this.f11906v0 = true;
            m14334g1();
            C3020p0 m14322a0 = m14322a0();
            JSONObject jSONObject = new JSONObject(this.f11858G.f12009c).getJSONObject("data");
            if (this.f11858G.f12007a == EnumC24233k.f117064r) {
                str = "media_id";
            } else {
                str = "videoId";
            }
            String string = jSONObject.getString(str);
            String str4 = m14322a0.f12023C.f12093B.f88620c;
            String str5 = "";
            if (!this.f11856E.containsKey(str4)) {
                str2 = "";
            } else {
                str2 = (String) this.f11856E.get(str4);
            }
            if (TextUtils.isEmpty(str2) && (videoBlendingParam = m14322a0.f12023C.f12092A) != null) {
                String str6 = videoBlendingParam.f48277q;
                if (!TextUtils.isEmpty(str6)) {
                    if (this.f11856E.containsKey(str6)) {
                        str5 = (String) this.f11856E.get(str6);
                    }
                    str3 = str5;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new d());
                    long parseLong = Long.parseLong(this.f11895q);
                    long j11 = m14322a0.f12062u;
                    C3025q0 c3025q0 = m14322a0.f12023C;
                    C23307g c23307g = c3025q0.f12119j;
                    String charSequence = c3025q0.f12110a.toString();
                    ArrayList m14318W = m14318W();
                    C3025q0 c3025q02 = m14322a0.f12023C;
                    c0766k.mo1713p9(parseLong, j11, string, c23307g, charSequence, m14318W, c3025q02.f12111b, m14322a0.f12042V, str3, c3025q02.f12096E, this.f11887j0);
                }
            }
            str3 = str2;
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new d());
            long parseLong2 = Long.parseLong(this.f11895q);
            long j112 = m14322a0.f12062u;
            C3025q0 c3025q03 = m14322a0.f12023C;
            C23307g c23307g2 = c3025q03.f12119j;
            String charSequence2 = c3025q03.f12110a.toString();
            ArrayList m14318W2 = m14318W();
            C3025q0 c3025q022 = m14322a0.f12023C;
            c0766k2.mo1713p9(parseLong2, j112, string, c23307g2, charSequence2, m14318W2, c3025q022.f12111b, m14322a0.f12042V, str3, c3025q022.f12096E, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            this.f11906v0 = false;
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: K0 */
    public boolean m14304K0() {
        int i11 = this.f11893p;
        return i11 == 3 || i11 == 7;
    }

    /* renamed from: L */
    void m14305L() {
        if (this.f11854C) {
            return;
        }
        this.f11854C = true;
        C3020p0 m14322a0 = m14322a0();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new h());
        C26881e.m138493d().m138511o(2, this.f11895q);
        long parseLong = Long.parseLong(this.f11895q);
        C3025q0 c3025q0 = m14322a0.f12023C;
        C3025q0.b bVar = c3025q0.f12134y;
        String charSequence = c3025q0.f12110a.toString();
        ArrayList m14318W = m14318W();
        C3025q0 c3025q02 = m14322a0.f12023C;
        c0766k.mo1688m7(parseLong, bVar, charSequence, m14318W, c3025q02.f12111b, m14322a0.f12042V, this.f11868Q, c3025q02.f12096E, this.f11887j0);
    }

    /* renamed from: L0 */
    public boolean m14306L0() {
        return this.f11893p == 1004;
    }

    /* renamed from: M0 */
    public boolean m14307M0() {
        if (m14322a0() != null && C23793c.m124316k().mo124311f() - m14322a0().f12062u <= this.f11894p0 && this.f11853B <= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    void m14308N() {
        String str;
        boolean z11;
        C24230h m14289E;
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            if (m14368v0()) {
                C26881e.m138493d().m138511o(2, this.f11895q);
                m14361t();
                return;
            }
            Iterator it = this.f11857F.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (TextUtils.isEmpty(str2) || (!str2.startsWith("http") && !str2.startsWith("https"))) {
                    if (TextUtils.isEmpty(str2) || !AbstractC23041d2.m118194A(str2)) {
                        it.remove();
                        this.f11909x.remove(str2);
                    }
                }
            }
            if (this.f11857F.size() == 0) {
                m14284B1();
                this.f11854C = false;
                return;
            }
            m14334g1();
            ArrayList<String> arrayList = new ArrayList();
            int i11 = 0;
            for (Map.Entry entry : this.f11857F.entrySet()) {
                String str3 = (String) entry.getKey();
                if (((C3053w2) entry.getValue()).f12306a > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean containsKey = this.f11907w.containsKey(str3);
                if (!z11 && !containsKey && (m14289E = m14289E(str3, i11)) != null) {
                    arrayList.add(str3);
                    this.f11907w.put(str3, m14289E);
                }
                i11++;
            }
            C25481n.f122071a.m131973e("POST_FEED", m14254V("UPLOAD_MEDIA"), null);
            for (String str4 : arrayList) {
                C24230h c24230h = (C24230h) this.f11907w.get(str4);
                if (c24230h != null) {
                    if (this.f11856E.containsKey(str4)) {
                        str = (String) this.f11856E.get(str4);
                    } else {
                        str = "";
                    }
                    c24230h.m126482B0(CoreUtility.f89233i);
                    c24230h.m126504g0(m14322a0().f12023C.f12110a.toString());
                    c24230h.m126518p0(this.f11868Q);
                    c24230h.m126501d0(str);
                    c24230h.m126526t0(1);
                    C24226d.m126402Z(c24230h);
                }
            }
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: N0 */
    public boolean m14309N0() {
        C3006m1 c3006m1;
        if (this.f11898r0 && (c3006m1 = this.f11900s0) != null && c3006m1.m14414e() != -1 && this.f11900s0.m14414e() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    void m14310O() {
        String str;
        EnumC24229g enumC24229g;
        String str2;
        C3020p0 m14322a0 = m14322a0();
        ItemAlbumMobile itemAlbumMobile = null;
        try {
            if (m14322a0.m14488S()) {
                m14308N();
            } else {
                ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) m14322a0.f12023C.f12118i.get(0);
                try {
                    if (!this.f11854C && C23055e5.m118271f()) {
                        if (AbstractC23238v2.m119727l()) {
                            this.f11854C = true;
                            if (itemAlbumMobile2 != null && AbstractC23041d2.m118194A(itemAlbumMobile2.f42607x)) {
                                m14334g1();
                                String str3 = itemAlbumMobile2.f42607x;
                                String str4 = itemAlbumMobile2.f42556G;
                                if (m14368v0()) {
                                    C26881e.m138493d().m138511o(2, this.f11895q);
                                    m14315S(false, new r(str3, str4), this.f11887j0);
                                    return;
                                }
                                m14352p1(str3);
                                int m14319X = m14319X(str3);
                                if (AbstractC23047d8.m118257i(C19172a.m100599j("uploadConfig@functionV2@1@typeUpload"))) {
                                    enumC24229g = EnumC24229g.f116986t;
                                } else {
                                    enumC24229g = EnumC24229g.f116985s;
                                }
                                C24230h m126395Q = C24226d.m126395Q(m14319X, enumC24229g, str3, 0L, false);
                                s sVar = new s(m126395Q, str3, str4);
                                C26881e.m138493d().m138511o(1, this.f11895q);
                                m126395Q.m126505h(sVar);
                                if (this.f11856E.containsKey(str3)) {
                                    str2 = (String) this.f11856E.get(str3);
                                } else {
                                    str2 = "";
                                }
                                m126395Q.m126482B0(CoreUtility.f89233i);
                                m126395Q.m126504g0(str4);
                                m126395Q.m126531w0(m14318W());
                                m126395Q.m126502e0(Long.parseLong(this.f11895q));
                                m126395Q.m126517o0(m14322a0.f12023C.f12111b);
                                m126395Q.m126520q0(m14322a0.f12042V);
                                m126395Q.m126518p0(this.f11868Q);
                                m126395Q.m126501d0(str2);
                                m126395Q.m126480A0(m14322a0.f12023C.f12096E);
                                m126395Q.m126535z0(this.f11887j0);
                                m126395Q.m126500c0(this.f11888k0);
                                m126395Q.m126527u0(this.f11891n0);
                                m126395Q.m126526t0(0);
                                m14346n(str3, m126395Q);
                                C24226d.m126402Z(m126395Q);
                                C25481n.f122071a.m131973e("POST_FEED", m14254V("UPLOAD_MEDIA"), null);
                            } else {
                                m14284B1();
                                this.f11854C = false;
                            }
                        } else {
                            throw new IllegalArgumentException("SD Card not mounted");
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    itemAlbumMobile = itemAlbumMobile2;
                    m14286C1(-1000);
                    if (itemAlbumMobile != null && (str = itemAlbumMobile.f42607x) != null) {
                        m14352p1(str);
                    }
                    e.printStackTrace();
                    this.f11854C = false;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: O0 */
    boolean m14311O0() {
        C3018o3 c3018o3 = this.f11858G;
        if (c3018o3 != null && c3018o3.f12008b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    void m14312P() {
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            C3020p0 m14322a0 = m14322a0();
            String charSequence = m14322a0.f12023C.f12110a.toString();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new p());
            C26881e.m138493d().m138511o(2, this.f11895q);
            long parseLong = Long.parseLong(this.f11895q);
            ArrayList m14318W = m14318W();
            C3025q0 c3025q0 = m14322a0.f12023C;
            c0766k.mo1475L5(parseLong, charSequence, "0", m14318W, c3025q0.f12111b, m14322a0.f12042V, this.f11868Q, c3025q0.f12096E, c3025q0.f12097F, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    void m14313Q() {
        try {
            if (this.f11854C) {
                return;
            }
            this.f11854C = true;
            C3020p0 m14322a0 = m14322a0();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new q());
            C26881e.m138493d().m138511o(2, this.f11895q);
            long parseLong = Long.parseLong(this.f11895q);
            String charSequence = m14322a0.f12023C.f12110a.toString();
            String str = m14322a0.f12023C.f12132w + "";
            ArrayList m14318W = m14318W();
            C3025q0 c3025q0 = m14322a0.f12023C;
            c0766k.mo1475L5(parseLong, charSequence, str, m14318W, c3025q0.f12111b, m14322a0.f12042V, this.f11868Q, c3025q0.f12096E, null, this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e A[Catch: Exception -> 0x0065, TryCatch #1 {Exception -> 0x0065, blocks: (B:3:0x000d, B:5:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x003d, B:15:0x0068, B:17:0x006e, B:19:0x007b, B:21:0x0087, B:23:0x008d, B:43:0x0106, B:45:0x010e, B:46:0x0119, B:52:0x00f4, B:60:0x0190, B:61:0x0197), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m14314R() {
        int i11;
        int i12;
        int i13;
        String str;
        Map m138617c;
        try {
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.d0
                public /* synthetic */ C2960d0() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m14248P0;
                    m14248P0 = C3000l0.this.m14248P0();
                    return m14248P0;
                }
            });
            if (!this.f11854C && C23055e5.m118271f()) {
                if (AbstractC23238v2.m119727l()) {
                    this.f11854C = true;
                    C3020p0 m14322a0 = m14322a0();
                    if (!TextUtils.isEmpty(m14322a0.f12023C.f12093B.f88634q)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("videoId", m14322a0.f12023C.f12093B.f88634q);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", jSONObject);
                        this.f11858G = new C3018o3(EnumC24233k.f117063q, 2, jSONObject2.toString());
                    }
                    if (m14311O0()) {
                        C26881e.m138493d().m138511o(2, this.f11895q);
                        m14317U();
                        return;
                    }
                    String str2 = m14322a0.f12023C.f12093B.f88620c;
                    if (!AbstractC23041d2.m118194A(str2)) {
                        this.f11905v = 5;
                        this.f11854C = false;
                        return;
                    }
                    int m14319X = m14319X(str2);
                    EnumC24229g enumC24229g = EnumC24229g.f116972K;
                    C24230h m126395Q = C24226d.m126395Q(m14319X, enumC24229g, str2, 0L, false);
                    k kVar = new k(str2);
                    try {
                        m138617c = AbstractC26897a.m138617c(str2);
                        if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH)) {
                            String str3 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
                            Objects.requireNonNull(str3);
                            i12 = Integer.parseInt(str3);
                        } else {
                            i12 = 0;
                        }
                        try {
                            if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT)) {
                                String str4 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
                                Objects.requireNonNull(str4);
                                i11 = Integer.parseInt(str4);
                            } else {
                                i11 = 0;
                            }
                            try {
                            } catch (Exception e11) {
                                e = e11;
                                AbstractC20110a.m104539h(e);
                                i13 = 0;
                                if (i13 != 90) {
                                }
                                if (this.f11856E.containsKey(str2)) {
                                }
                                m126395Q.m126482B0(CoreUtility.f89233i);
                                m126395Q.m126505h(kVar);
                                m126395Q.m126502e0(Long.parseLong(m14322a0.f12057p));
                                m126395Q.m126504g0(m14322a0.f12023C.f12110a.toString());
                                m126395Q.m126531w0(m14318W());
                                m126395Q.m126517o0(m14322a0.f12023C.f12111b);
                                m126395Q.m126520q0(m14322a0.f12042V);
                                m126395Q.m126518p0(this.f11868Q);
                                m126395Q.m126486D0(i11);
                                m126395Q.m126516n0(i12);
                                m126395Q.m126480A0(m14322a0.f12023C.f12096E);
                                m126395Q.m126508i0(0);
                                m126395Q.m126501d0(str);
                                m126395Q.m126535z0(this.f11887j0);
                                m126395Q.m126500c0(this.f11888k0);
                                C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.e0

                                    /* renamed from: p */
                                    public final /* synthetic */ String f11689p;

                                    /* renamed from: q */
                                    public final /* synthetic */ int f11690q;

                                    /* renamed from: r */
                                    public final /* synthetic */ EnumC24229g f11691r;

                                    public /* synthetic */ C2965e0(String str22, int m14319X2, EnumC24229g enumC24229g2) {
                                        r1 = str22;
                                        r2 = m14319X2;
                                        r3 = enumC24229g2;
                                    }

                                    @Override // en0.InterfaceC18494a
                                    /* renamed from: V4 */
                                    public final Object mo12V4() {
                                        String m14249Q0;
                                        m14249Q0 = C3000l0.m14249Q0(r1, r2, r3);
                                        return m14249Q0;
                                    }
                                });
                                C26881e.m138493d().m138511o(1, this.f11895q);
                                C24226d.m126402Z(m126395Q);
                                C25481n.f122071a.m131973e("POST_FEED", m14254V("UPLOAD_MEDIA"), null);
                                return;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i11 = 0;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        i11 = 0;
                        i12 = 0;
                    }
                    if (m138617c.containsKey(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION)) {
                        String str5 = (String) m138617c.get(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
                        Objects.requireNonNull(str5);
                        i13 = Integer.parseInt(str5);
                        if (i13 != 90 && i13 != 270) {
                            int i14 = i12;
                            i12 = i11;
                            i11 = i14;
                        }
                        if (this.f11856E.containsKey(str22)) {
                            str = (String) this.f11856E.get(str22);
                        } else {
                            str = "";
                        }
                        m126395Q.m126482B0(CoreUtility.f89233i);
                        m126395Q.m126505h(kVar);
                        m126395Q.m126502e0(Long.parseLong(m14322a0.f12057p));
                        m126395Q.m126504g0(m14322a0.f12023C.f12110a.toString());
                        m126395Q.m126531w0(m14318W());
                        m126395Q.m126517o0(m14322a0.f12023C.f12111b);
                        m126395Q.m126520q0(m14322a0.f12042V);
                        m126395Q.m126518p0(this.f11868Q);
                        m126395Q.m126486D0(i11);
                        m126395Q.m126516n0(i12);
                        m126395Q.m126480A0(m14322a0.f12023C.f12096E);
                        m126395Q.m126508i0(0);
                        m126395Q.m126501d0(str);
                        m126395Q.m126535z0(this.f11887j0);
                        m126395Q.m126500c0(this.f11888k0);
                        C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.e0

                            /* renamed from: p */
                            public final /* synthetic */ String f11689p;

                            /* renamed from: q */
                            public final /* synthetic */ int f11690q;

                            /* renamed from: r */
                            public final /* synthetic */ EnumC24229g f11691r;

                            public /* synthetic */ C2965e0(String str22, int m14319X2, EnumC24229g enumC24229g2) {
                                r1 = str22;
                                r2 = m14319X2;
                                r3 = enumC24229g2;
                            }

                            @Override // en0.InterfaceC18494a
                            /* renamed from: V4 */
                            public final Object mo12V4() {
                                String m14249Q0;
                                m14249Q0 = C3000l0.m14249Q0(r1, r2, r3);
                                return m14249Q0;
                            }
                        });
                        C26881e.m138493d().m138511o(1, this.f11895q);
                        C24226d.m126402Z(m126395Q);
                        C25481n.f122071a.m131973e("POST_FEED", m14254V("UPLOAD_MEDIA"), null);
                        return;
                    }
                    i13 = 0;
                    if (i13 != 90) {
                        int i142 = i12;
                        i12 = i11;
                        i11 = i142;
                    }
                    if (this.f11856E.containsKey(str22)) {
                    }
                    m126395Q.m126482B0(CoreUtility.f89233i);
                    m126395Q.m126505h(kVar);
                    m126395Q.m126502e0(Long.parseLong(m14322a0.f12057p));
                    m126395Q.m126504g0(m14322a0.f12023C.f12110a.toString());
                    m126395Q.m126531w0(m14318W());
                    m126395Q.m126517o0(m14322a0.f12023C.f12111b);
                    m126395Q.m126520q0(m14322a0.f12042V);
                    m126395Q.m126518p0(this.f11868Q);
                    m126395Q.m126486D0(i11);
                    m126395Q.m126516n0(i12);
                    m126395Q.m126480A0(m14322a0.f12023C.f12096E);
                    m126395Q.m126508i0(0);
                    m126395Q.m126501d0(str);
                    m126395Q.m126535z0(this.f11887j0);
                    m126395Q.m126500c0(this.f11888k0);
                    C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.e0

                        /* renamed from: p */
                        public final /* synthetic */ String f11689p;

                        /* renamed from: q */
                        public final /* synthetic */ int f11690q;

                        /* renamed from: r */
                        public final /* synthetic */ EnumC24229g f11691r;

                        public /* synthetic */ C2965e0(String str22, int m14319X2, EnumC24229g enumC24229g2) {
                            r1 = str22;
                            r2 = m14319X2;
                            r3 = enumC24229g2;
                        }

                        @Override // en0.InterfaceC18494a
                        /* renamed from: V4 */
                        public final Object mo12V4() {
                            String m14249Q0;
                            m14249Q0 = C3000l0.m14249Q0(r1, r2, r3);
                            return m14249Q0;
                        }
                    });
                    C26881e.m138493d().m138511o(1, this.f11895q);
                    C24226d.m126402Z(m126395Q);
                    C25481n.f122071a.m131973e("POST_FEED", m14254V("UPLOAD_MEDIA"), null);
                    return;
                }
                throw new IllegalArgumentException("SD Card not mounted");
            }
        } catch (Exception e14) {
            m14286C1(-1000);
            e14.printStackTrace();
            this.f11854C = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    synchronized void m14315S(boolean z11, InterfaceC20094a interfaceC20094a, TrackingSource trackingSource) {
        int i11;
        C18054j c18054j;
        try {
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11908w0 = false;
            this.f11854C = false;
            e11.printStackTrace();
        } finally {
        }
        if (this.f11908w0) {
            return;
        }
        this.f11908w0 = true;
        m14334g1();
        C3020p0 m14322a0 = m14322a0();
        C0758c c0758c = new C0758c();
        c0758c.m1341j(new v(interfaceC20094a));
        ArrayList m14337i0 = m14337i0();
        ArrayList m14320Y = m14320Y();
        if (m14337i0.size() != 0) {
            if (!z11) {
                c0758c.m1355m(((C3053w2) this.f11857F.get(((ItemAlbumMobile) m14322a0().f12023C.f12118i.get(0)).f42607x)).f12306a, Long.parseLong(this.f11895q), m14322a0.f12023C.f12110a.toString(), m14318W(), m14322a0.f12023C.f12111b, m14322a0.f12042V, m14320Y(), this.f11868Q, m14322a0.f12023C.f12096E, trackingSource, this.f11888k0, this.f11891n0);
            } else {
                C3025q0 c3025q0 = m14322a0.f12023C;
                C18049e c18049e = c3025q0.f12127r;
                int m14566c = c3025q0.m14566c();
                if (m14566c == 3) {
                    if (c18049e.m95928a() != null) {
                        c18054j = c18049e.m95928a().m95914b();
                    } else {
                        c18054j = null;
                    }
                    if (c18054j != null) {
                        i11 = C19581d.f97279a.m102500w(c18054j.m95948b());
                        if (m14566c != 0) {
                            if (m14566c != 1) {
                                if (m14566c != 2 && m14566c != 3) {
                                }
                            } else {
                                C18045a m95928a = c18049e.m95928a();
                                Objects.requireNonNull(m95928a);
                                C18047c m95913a = m95928a.m95913a();
                                if (m95913a != null) {
                                    int m95923b = m95913a.m95923b();
                                    if (m95913a.m95922a() != null && m95913a.m95922a().m95926b() != null && m95913a.m95922a().m95925a() != null) {
                                        int m95920b = m95913a.m95922a().m95926b().m95920b();
                                        int m95919a = m95913a.m95922a().m95926b().m95919a();
                                        int m95920b2 = m95913a.m95922a().m95925a().m95920b();
                                        int m95919a2 = m95913a.m95922a().m95925a().m95919a();
                                        long parseLong = Long.parseLong(this.f11895q);
                                        String charSequence = m14322a0.f12023C.f12110a.toString();
                                        ArrayList m14318W = m14318W();
                                        C3025q0 c3025q02 = m14322a0.f12023C;
                                        c0758c.m1354l(parseLong, m14337i0, charSequence, m14318W, c3025q02.f12111b, m14322a0.f12042V, m14320Y, this.f11868Q, c3025q02.f12096E, trackingSource, this.f11888k0, this.f11891n0, m14566c, i11, m95923b, m95920b, m95919a, m95920b2, m95919a2);
                                    }
                                }
                            }
                        }
                        long parseLong2 = Long.parseLong(this.f11895q);
                        String charSequence2 = m14322a0.f12023C.f12110a.toString();
                        ArrayList m14318W2 = m14318W();
                        C3025q0 c3025q03 = m14322a0.f12023C;
                        c0758c.m1354l(parseLong2, m14337i0, charSequence2, m14318W2, c3025q03.f12111b, m14322a0.f12042V, m14320Y, this.f11868Q, c3025q03.f12096E, trackingSource, this.f11888k0, this.f11891n0, m14566c, i11, 0, 0, 0, 0, 0);
                    }
                }
                i11 = 1;
                if (m14566c != 0) {
                }
                long parseLong22 = Long.parseLong(this.f11895q);
                String charSequence22 = m14322a0.f12023C.f12110a.toString();
                ArrayList m14318W22 = m14318W();
                C3025q0 c3025q032 = m14322a0.f12023C;
                c0758c.m1354l(parseLong22, m14337i0, charSequence22, m14318W22, c3025q032.f12111b, m14322a0.f12042V, m14320Y, this.f11868Q, c3025q032.f12096E, trackingSource, this.f11888k0, this.f11891n0, m14566c, i11, 0, 0, 0, 0, 0);
            }
            return;
        }
        throw new IllegalArgumentException("Call doPushFeedPhoto when no photo has been uploaded");
    }

    /* renamed from: T */
    synchronized void m14316T() {
        try {
            m14315S(true, new a(), this.f11887j0);
        } catch (Exception e11) {
            m14286C1(-1000);
            this.f11854C = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    void m14317U() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VideoBlendingParam videoBlendingParam;
        try {
            C26359h c26359h = C26359h.f125209a;
            c26359h.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.f0
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m14250R0;
                    m14250R0 = C3000l0.m14250R0();
                    return m14250R0;
                }
            });
            if (m14322a0() != null && m14322a0().m14488S()) {
                m14303K();
                return;
            }
            if (this.f11906v0) {
                return;
            }
            this.f11906v0 = true;
            m14334g1();
            C3020p0 m14322a0 = m14322a0();
            String str6 = m14322a0.f12023C.f12093B.f88620c;
            JSONObject jSONObject = new JSONObject(this.f11858G.f12009c).getJSONObject("data");
            if (this.f11858G.f12007a == EnumC24233k.f117064r) {
                str3 = "media_id";
            } else {
                str3 = "videoId";
            }
            String string = jSONObject.getString(str3);
            c26359h.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: bo.g0

                /* renamed from: p */
                public final /* synthetic */ String f11771p;

                /* renamed from: q */
                public final /* synthetic */ JSONObject f11772q;

                public /* synthetic */ C2975g0(String string2, JSONObject jSONObject2) {
                    r1 = string2;
                    r2 = jSONObject2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m14251S0;
                    m14251S0 = C3000l0.m14251S0(r1, r2);
                    return m14251S0;
                }
            });
            String str7 = "";
            if (!this.f11856E.containsKey(str6)) {
                str4 = "";
            } else {
                str4 = (String) this.f11856E.get(str6);
            }
            try {
                if (TextUtils.isEmpty(str4) && (videoBlendingParam = m14322a0.f12023C.f12092A) != null) {
                    String str8 = videoBlendingParam.f48277q;
                    if (!TextUtils.isEmpty(str8)) {
                        if (this.f11856E.containsKey(str8)) {
                            str7 = (String) this.f11856E.get(str8);
                        }
                        str5 = str7;
                        String charSequence = m14322a0.f12023C.f12110a.toString();
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new o());
                        long parseLong = Long.parseLong(m14322a0.f12057p);
                        C23307g c23307g = m14322a0.f12023C.f12119j;
                        ArrayList m14318W = m14318W();
                        C3025q0 c3025q0 = m14322a0.f12023C;
                        str = "POST_FEED_VIDEO";
                        str2 = "POST_FEED";
                        c0766k.mo1425F4(parseLong, string2, c23307g, charSequence, m14318W, c3025q0.f12111b, m14322a0.f12042V, this.f11868Q, 0, str5, c3025q0.f12096E, this.f11887j0, this.f11888k0);
                        return;
                    }
                }
                c0766k.mo1425F4(parseLong, string2, c23307g, charSequence, m14318W, c3025q0.f12111b, m14322a0.f12042V, this.f11868Q, 0, str5, c3025q0.f12096E, this.f11887j0, this.f11888k0);
                return;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                m14286C1(-1000);
                this.f11854C = false;
                this.f11906v0 = false;
                C26359h.f125209a.mo135685a(str2, str, new InterfaceC18494a() { // from class: bo.h0

                    /* renamed from: p */
                    public final /* synthetic */ Exception f11784p;

                    public /* synthetic */ C2980h0(Exception e12) {
                        r1 = e12;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m14252T0;
                        m14252T0 = C3000l0.m14252T0(r1);
                        return m14252T0;
                    }
                });
                return;
            }
            str5 = str4;
            String charSequence2 = m14322a0.f12023C.f12110a.toString();
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new o());
            long parseLong2 = Long.parseLong(m14322a0.f12057p);
            C23307g c23307g2 = m14322a0.f12023C.f12119j;
            ArrayList m14318W2 = m14318W();
            C3025q0 c3025q02 = m14322a0.f12023C;
            str = "POST_FEED_VIDEO";
            str2 = "POST_FEED";
        } catch (Exception e12) {
            e12 = e12;
            str = "POST_FEED_VIDEO";
            str2 = "POST_FEED";
        }
    }

    /* renamed from: W */
    ArrayList m14318W() {
        ArrayList arrayList;
        try {
            arrayList = m14322a0().f12059r.m14392e();
        } catch (Exception e11) {
            e11.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: X */
    int m14319X(String str) {
        int i11;
        if (this.f11909x.containsKey(str)) {
            i11 = ((Integer) this.f11909x.get(str)).intValue();
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            i11 = new Random().nextInt(Integer.MAX_VALUE);
        }
        this.f11909x.put(str, Integer.valueOf(i11));
        return i11;
    }

    /* renamed from: Y */
    ArrayList m14320Y() {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = this.f11857F.entrySet().iterator();
            while (it.hasNext()) {
                C3053w2 c3053w2 = (C3053w2) ((Map.Entry) it.next()).getValue();
                if (c3053w2.f12307b == null) {
                    c3053w2.f12307b = new C23307g(0, 0);
                }
                arrayList.add(c3053w2.f12307b);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: Z */
    public int m14321Z() {
        boolean z11;
        if (m14322a0() != null && C23793c.m124316k().mo124311f() - m14322a0().f12062u > this.f11894p0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!C23055e5.m118271f() && z11) {
            return -900;
        }
        return -1000;
    }

    /* renamed from: a0 */
    public C3020p0 m14322a0() {
        List list = this.f11899s;
        if (list != null && list.size() > 0) {
            return m14324b0(0);
        }
        return null;
    }

    /* renamed from: a1 */
    void m14323a1() {
        ArrayList m14335h0 = m14335h0();
        if (m14335h0 != null) {
            for (int i11 = 0; i11 < m14335h0.size(); i11++) {
                String str = ((ItemAlbumMobile) m14335h0.get(i11)).f42607x;
                if (this.f11910x0.containsKey(str)) {
                    ((ItemAlbumMobile) m14335h0.get(i11)).f42595r = (String) this.f11910x0.get(str);
                }
            }
        }
    }

    /* renamed from: b0 */
    public C3020p0 m14324b0(int i11) {
        List list = this.f11899s;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (C3020p0) this.f11899s.get(i11);
        }
        return null;
    }

    /* renamed from: c0 */
    public C3020p0 m14325c0(String str) {
        for (C3020p0 c3020p0 : this.f11899s) {
            if (c3020p0.f12057p.equals(str)) {
                return c3020p0;
            }
        }
        return null;
    }

    /* renamed from: c1 */
    void m14326c1(long j11) {
        try {
            Iterator it = this.f11857F.entrySet().iterator();
            String str = "";
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C3053w2) entry.getValue()).f12306a == j11) {
                    str = (String) entry.getKey();
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.f11857F.put(str, new C3053w2(-1L, null));
                this.f11909x.remove(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d0 */
    public int m14327d0(String str) {
        Iterator it = this.f11899s.iterator();
        int i11 = -1;
        while (it.hasNext()) {
            i11++;
            if (((C3020p0) it.next()).f12057p.equals(str)) {
                break;
            }
        }
        return i11;
    }

    /* renamed from: d1 */
    synchronized void m14328d1(long j11, String str, C23307g c23307g) {
        try {
            try {
                m14352p1(str);
                this.f11857F.put(str, new C3053w2(j11, c23307g));
                m14363t1();
                if (!m14362t0()) {
                    if (m14368v0()) {
                        C26881e.m138493d().m138511o(2, this.f11895q);
                        m14361t();
                        C25481n.f122071a.m131972b("POST_FEED", m14254V("UPLOAD_MEDIA"), null);
                    } else {
                        if (!m14307M0()) {
                            m14286C1(-1000);
                        }
                        this.f11854C = false;
                    }
                }
            } catch (Exception e11) {
                m14286C1(-1000);
                this.f11854C = false;
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e0 */
    public int m14329e0(String str) {
        if (this.f11899s != null && str != null) {
            for (int i11 = 0; i11 < this.f11899s.size(); i11++) {
                C3020p0 c3020p0 = (C3020p0) this.f11899s.get(i11);
                if (c3020p0 != null && c3020p0.f12057p.equals(str)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x005a, Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:5:0x0002, B:7:0x000d, B:9:0x0015, B:11:0x001d, B:13:0x0025, B:15:0x002b, B:17:0x0033, B:19:0x003b, B:21:0x0043, B:23:0x004b, B:25:0x0053, B:28:0x006a, B:30:0x0070, B:32:0x0078, B:36:0x0081, B:38:0x0087, B:39:0x008b, B:41:0x0093, B:43:0x009b, B:45:0x00a3, B:47:0x00ab, B:50:0x00b4, B:52:0x00c0, B:53:0x00c7, B:54:0x00ca, B:57:0x0060), top: B:4:0x0002, outer: #1 }] */
    /* renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    synchronized void m14330e1(String str, C20096c c20096c) {
        try {
            try {
                m14352p1(str);
            } catch (Exception e11) {
                m14286C1(-1000);
                this.f11854C = false;
                e11.printStackTrace();
            }
            if (c20096c.m104491c() != 18002) {
                if (c20096c.m104491c() != 18004) {
                    if (c20096c.m104491c() != 19004) {
                        if (c20096c.m104491c() != 18001) {
                            if (c20096c.m104491c() != 18002) {
                                if (c20096c.m104491c() != 18003) {
                                    if (c20096c.m104491c() != 18005) {
                                        if (c20096c.m104491c() != 18019) {
                                            if (c20096c.m104491c() != 18020) {
                                                if (c20096c.m104491c() != 18099) {
                                                    if (c20096c.m104491c() == 18004) {
                                                    }
                                                    if (!m14362t0()) {
                                                        if (this.f11857F.size() == 0) {
                                                            m14286C1(-800);
                                                            this.f11854C = false;
                                                            return;
                                                        }
                                                        if (m14368v0()) {
                                                            m14361t();
                                                        } else {
                                                            if (c20096c.m104491c() != -17 && c20096c.m104491c() != -18 && c20096c.m104491c() != -19 && c20096c.m104491c() != -20 && c20096c.m104491c() != -69) {
                                                                this.f11853B++;
                                                                if (!m14307M0()) {
                                                                    m14286C1(c20096c.m104491c());
                                                                }
                                                                this.f11854C = false;
                                                            }
                                                            m14286C1(c20096c.m104491c());
                                                            this.f11854C = false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f11857F.remove(str);
            this.f11909x.remove(str);
            if (!m14362t0()) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f0 */
    public String m14331f0() {
        if (this.f11899s.size() > 0) {
            return ((C3020p0) this.f11899s.get(r0.size() - 1)).f12057p;
        }
        return null;
    }

    /* renamed from: f1 */
    synchronized void m14332f1(String str, AbstractC25752r.b bVar) {
        try {
            try {
                AbstractC25751q m132889b = bVar.m132889b();
                if (bVar.m132888a() == EnumC24233k.f117063q && (m132889b instanceof C25736b)) {
                    C25736b c25736b = (C25736b) m132889b;
                    long m132851a = c25736b.m132851a();
                    C23307g c23307g = new C23307g(c25736b.m132852b());
                    this.f11910x0.put(str, String.valueOf(m132851a));
                    if (m132851a == 0) {
                        m14330e1(str, new C20096c(502, AbstractC23161o1.m119318c(502, "")));
                    } else {
                        m14328d1(m132851a, str, c23307g);
                    }
                } else if (m132889b instanceof C25753s) {
                    long m132890a = ((C25753s) m132889b).m132890a();
                    C23307g m118367a = AbstractC23067f6.m118367a(str);
                    if (m132890a == 0) {
                        m14330e1(str, new C20096c(502, AbstractC23161o1.m119318c(502, "")));
                    } else {
                        m14328d1(m132890a, str, m118367a);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                m14330e1(str, new C20096c(502, AbstractC23161o1.m119318c(502, "")));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g0 */
    public List m14333g0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11899s.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3020p0) it.next()).f12057p);
        }
        return arrayList;
    }

    /* renamed from: g1 */
    void m14334g1() {
        try {
            if (!C29630g.m147299E0().m93432x()) {
                C29630g.m147299E0().m147319V0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h0 */
    public ArrayList m14335h0() {
        if (m14322a0() != null && m14322a0().f12023C != null && m14322a0().f12023C.f12118i != null) {
            return m14322a0().f12023C.f12118i;
        }
        return null;
    }

    /* renamed from: h1 */
    public void m14336h1() {
        try {
            int i11 = this.f11905v;
            if ((i11 == 4 || i11 == 1) && !this.f11854C && !this.f11855D) {
                int i12 = m14322a0().f12058q;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 6) {
                                if (i12 != 7) {
                                    if (i12 != 17) {
                                        if (i12 != 22) {
                                            if (i12 != 24) {
                                            }
                                        } else {
                                            m14358s();
                                        }
                                    } else {
                                        m14314R();
                                    }
                                }
                                m14355r();
                            } else {
                                m14364u();
                            }
                        } else {
                            m14308N();
                        }
                    } else {
                        m14310O();
                    }
                } else {
                    m14367v();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i0 */
    ArrayList m14337i0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11857F.values().iterator();
        while (it.hasNext()) {
            long j11 = ((C3053w2) it.next()).f12306a;
            if (j11 > 0) {
                arrayList.add(Long.valueOf(j11));
            }
        }
        return arrayList;
    }

    /* renamed from: i1 */
    void m14338i1(C3020p0 c3020p0, C3020p0 c3020p02) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        if (c3020p0 != null) {
            arrayList = c3020p0.m14537z();
        } else {
            arrayList = null;
        }
        if (c3020p02 != null) {
            arrayList2 = c3020p02.m14537z();
        } else {
            arrayList2 = null;
        }
        if (c3020p02 != null) {
            arrayList3 = c3020p02.m14535y();
        }
        if (arrayList == null) {
            return;
        }
        int i11 = 0;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            while (i11 < arrayList.size() && i11 < arrayList3.size()) {
                AbstractC2959d m13986a = ((C2954c) arrayList3.get(i11)).m13986a();
                if (m13986a != null) {
                    m13986a.m14017h(((ItemAlbumMobile) arrayList.get(i11)).f42611z);
                }
                i11++;
            }
            return;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            while (i11 < arrayList.size() && i11 < arrayList2.size()) {
                ((ItemAlbumMobile) arrayList2.get(i11)).f42609y = ((ItemAlbumMobile) arrayList.get(i11)).f42611z;
                ((ItemAlbumMobile) arrayList2.get(i11)).f42611z = ((ItemAlbumMobile) arrayList.get(i11)).f42611z;
                ((ItemAlbumMobile) arrayList2.get(i11)).f42550D = ((ItemAlbumMobile) arrayList.get(i11)).f42550D;
                i11++;
            }
        }
    }

    /* renamed from: j0 */
    public synchronized int m14339j0() {
        return this.f11905v;
    }

    /* renamed from: j1 */
    void m14340j1(C3000l0 c3000l0) {
        C17391z m108789V;
        if (c3000l0.m14322a0().f12058q == 23) {
            m108789V = AbstractC20826v0.m108787U(c3000l0.m14322a0(), 0);
        } else {
            m108789V = AbstractC20826v0.m108789V(c3000l0.m14322a0());
        }
        C17391z c17391z = m14322a0().f12023C.f12093B;
        if (m108789V != null && TextUtils.isEmpty(m108789V.f88622e)) {
            m108789V.f88622e = c17391z.f88622e;
        }
        if (m108789V != null) {
            long j11 = c17391z.f88632o;
            if (j11 > 0) {
                m108789V.f88632o = j11;
            }
        }
    }

    /* renamed from: k0 */
    public String m14341k0() {
        int i11;
        Object obj;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f11857F.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("file_path", str);
                    Integer num = (Integer) this.f11909x.get(str);
                    if (this.f11909x.containsKey(str) && num != null) {
                        i11 = num.intValue();
                    } else {
                        i11 = -1;
                    }
                    jSONObject.put("client_file_id", i11);
                    C3053w2 c3053w2 = (C3053w2) this.f11857F.get(str);
                    jSONObject.put("server_file_id", c3053w2.f12306a);
                    C23307g c23307g = c3053w2.f12307b;
                    if (c23307g != null) {
                        jSONObject.put("width", c23307g.f113474a);
                        jSONObject.put("height", c3053w2.f12307b.f113475b);
                    }
                    if (!this.f11856E.containsKey(str)) {
                        obj = "";
                    } else {
                        obj = this.f11856E.get(str);
                    }
                    jSONObject.put("log_camera", obj);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: k1 */
    public void m14342k1() {
        this.f11857F.clear();
        ArrayList arrayList = m14322a0().f12023C.f12118i;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f11857F.put(((ItemAlbumMobile) arrayList.get(i11)).f42607x, new C3053w2(-1L, null));
        }
    }

    /* renamed from: l0 */
    void m14343l0(Object obj) {
        try {
            try {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    C3020p0 m108752C0 = AbstractC20826v0.m108752C0(jSONObject, this.f11893p);
                    if (!jSONObject.has("tags")) {
                        m108752C0.f12059r = null;
                    }
                    if (m108752C0.f12058q == 17) {
                        C17391z c17391z = m108752C0.f12023C.f12093B;
                        C17391z c17391z2 = m14322a0().f12023C.f12093B;
                        if (c17391z != null) {
                            if (TextUtils.isEmpty(c17391z.f88622e)) {
                                c17391z.f88622e = c17391z2.f88622e;
                            }
                            if (c17391z.f88632o > 0) {
                                c17391z.f88632o = c17391z2.f88632o;
                            }
                        }
                    }
                    m14323a1();
                    C3020p0 m108821m = AbstractC20826v0.m108821m(m14322a0(), m108752C0);
                    this.f11903u = 1;
                    List list = this.f11899s;
                    if (list != null && !list.isEmpty()) {
                        list.set(0, m108821m);
                    }
                    m14374x1(this, AbstractC20826v0.m108827p(this), null);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                m14286C1(-1000);
            }
            C26747f0.m137582I().m137670V0(m14322a0().f12057p);
        } catch (Throwable th2) {
            C26747f0.m137582I().m137670V0(m14322a0().f12057p);
            throw th2;
        }
    }

    /* renamed from: l1 */
    synchronized void m14344l1() {
        try {
            Iterator it = this.f11907w.values().iterator();
            while (it.hasNext()) {
                C24230h c24230h = (C24230h) it.next();
                if (c24230h != null) {
                    c24230h.m126509j();
                    C24226d.m126388J(c24230h);
                    it.remove();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m1 */
    public void m14345m1(String str) {
        Iterator it = this.f11899s.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3020p0 c3020p0 = (C3020p0) it.next();
            if (c3020p0.f12057p.equals(str)) {
                this.f11899s.remove(c3020p0);
                break;
            }
        }
        if (this.f11899s.size() == 1) {
            if (m14283B0() || this.f11893p == 2) {
                m14298H1();
            }
        }
    }

    /* renamed from: n */
    synchronized void m14346n(String str, C24230h c24230h) {
        try {
            this.f11907w.put(str, c24230h);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:            r7 = r1.f42607x;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:            if (r7 != null) goto L69;     */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m14347n0(String str, String str2, Object obj) {
        JSONObject jSONObject;
        C3000l0 m108750B0;
        ItemAlbumMobile itemAlbumMobile;
        try {
            m14352p1(str);
            jSONObject = (JSONObject) obj;
            m108750B0 = AbstractC20826v0.m108750B0(jSONObject);
            if (m108750B0 == null || m108750B0.m14322a0() == null || (m108750B0.m14322a0().f12023C.f12118i.isEmpty() && m108750B0.m14322a0().f12023C.f12107P.isEmpty())) {
                throw new IllegalArgumentException("handlePostSinglePhotoSuccess: cannot parse feed item");
            }
            if (m108750B0.m14322a0().f12058q == 23) {
                itemAlbumMobile = new ItemAlbumMobile();
                itemAlbumMobile.m40519e0((C2954c) m108750B0.m14322a0().f12023C.f12107P.get(0));
            } else {
                itemAlbumMobile = (ItemAlbumMobile) m108750B0.m14322a0().f12023C.f12118i.get(0);
            }
        } catch (Exception e11) {
            m14286C1(-1000);
            e11.printStackTrace();
        }
        if (itemAlbumMobile != null && !itemAlbumMobile.f42607x.equals("null") && !itemAlbumMobile.f42607x.trim().equals("") && !itemAlbumMobile.f42607x.equals("-2")) {
            m14374x1(m108750B0, jSONObject, null);
            this.f11853B++;
            this.f11854C = false;
        }
        String str3 = "NULL";
        m14274m0(str, new C20096c(502, AbstractC23161o1.m119318c(502, str3)));
        this.f11853B++;
        this.f11854C = false;
    }

    /* renamed from: n1 */
    public void m14348n1(String str) {
        C3003l3.c cVar;
        try {
            Iterator it = this.f11899s.iterator();
            while (it.hasNext()) {
                if (((C3020p0) it.next()).f12022B.f12280b.equals(str)) {
                    it.remove();
                }
            }
            if (this.f11893p == 1 && (cVar = this.f11851A) != null) {
                cVar.m14394g(str, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o */
    public boolean m14349o() {
        for (int i11 = 0; i11 < this.f11899s.size(); i11++) {
            C3020p0 c3020p0 = (C3020p0) this.f11899s.get(i11);
            if (c3020p0 != null && c3020p0.m14501d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    public int m14350o1() {
        int i11 = 0;
        try {
            Iterator it = this.f11899s.iterator();
            while (it.hasNext()) {
                C3020p0 c3020p0 = (C3020p0) it.next();
                if (c3020p0 != null && !c3020p0.m14501d()) {
                    it.remove();
                    i11++;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return i11;
    }

    /* renamed from: p */
    public synchronized void m14351p() {
        try {
            this.f11855D = true;
            m14344l1();
            this.f11854C = false;
            this.f11908w0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    synchronized void m14352p1(String str) {
        try {
            C24230h c24230h = (C24230h) this.f11907w.get(str);
            if (c24230h != null) {
                c24230h.m126509j();
                C24226d.m126388J(c24230h);
                this.f11907w.remove(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public boolean m14353q(String str) {
        Iterator it = this.f11899s.iterator();
        while (it.hasNext()) {
            if (((C3020p0) it.next()).m14465A().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q1 */
    public void m14354q1(C3020p0 c3020p0) {
        int i11;
        int i12;
        int i13;
        ItemAlbumMobile itemAlbumMobile;
        C3051w0 c3051w0;
        int i14 = 0;
        while (true) {
            if (i14 >= this.f11899s.size()) {
                break;
            }
            if (((C3020p0) this.f11899s.get(i14)).f12057p.equals(c3020p0.f12057p)) {
                C3020p0 c3020p02 = (C3020p0) this.f11899s.get(i14);
                int i15 = c3020p02.f12058q;
                C32546b c32546b = null;
                if (i15 != 2 && i15 != 3) {
                    if (i15 == 17) {
                        c3020p02.f12023C.f12118i = new ArrayList(c3020p0.f12023C.f12118i);
                        c3020p02.f12023C.f12093B = c3020p0.f12023C.f12093B;
                    } else if (i15 == 22) {
                        C3025q0 c3025q0 = c3020p02.f12023C;
                        C3025q0 c3025q02 = c3020p0.f12023C;
                        c3025q0.f12101J = c3025q02.f12101J;
                        c3025q0.f12103L = c3025q02.f12103L;
                        c3025q0.f12105N = c3025q02.f12105N;
                        c3025q0.f12104M = AbstractC20826v0.m108817k(c3025q02.f12104M);
                    } else if (i15 == 23) {
                        c3020p02.f12023C.f12106O.m13967j(c3020p0.f12023C.f12106O.m13962e());
                        c3020p02.f12023C.f12106O.m13965h(c3020p0.f12023C.f12106O.m13960c());
                        c3020p02.f12023C.f12106O.m13966i(c3020p0.f12023C.f12106O.m13961d());
                        c3020p02.f12023C.f12107P = new ArrayList(c3020p0.f12023C.f12107P);
                    }
                } else {
                    C18049e c18049e = c3020p0.f12023C.f12127r;
                    if (c18049e != null) {
                        i11 = c18049e.m95929b();
                    } else {
                        i11 = 0;
                    }
                    ArrayList arrayList = c3020p0.f12023C.f12118i;
                    if (arrayList != null) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    ArrayList arrayList2 = c3020p02.f12023C.f12118i;
                    if (arrayList2 != null) {
                        i13 = arrayList2.size();
                    } else {
                        i13 = 0;
                    }
                    if (i11 != 0 && i12 > C19587j.f97307a.m102530f(i11).mo102465h()) {
                        for (int i16 = 0; i16 < i12; i16++) {
                            ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i16);
                            if (i16 < c3020p0.f12023C.f12128s.size()) {
                                C3049v2 c3049v2 = (C3049v2) c3020p0.f12023C.f12128s.get(i16);
                                if (itemAlbumMobile2 != null && c3049v2 != null) {
                                    itemAlbumMobile2.f42582g0 = new Size(c3049v2.m14636c(), c3049v2.m14634a());
                                }
                            }
                        }
                        List mo102461d = C19587j.f97307a.m102530f(i11).mo102461d(c3020p0.f12023C.f12118i);
                        ArrayList arrayList3 = new ArrayList();
                        for (int i17 = 0; i17 < i12; i17++) {
                            ItemAlbumMobile itemAlbumMobile3 = (ItemAlbumMobile) c3020p0.f12023C.f12118i.get(i17);
                            ItemAlbumMobile itemAlbumMobile4 = new ItemAlbumMobile(itemAlbumMobile3);
                            if (i17 < mo102461d.size()) {
                                itemAlbumMobile4.f42596r0 = (ItemAlbumMobile.C7883c) mo102461d.get(i17);
                            } else {
                                itemAlbumMobile4.f42596r0 = null;
                            }
                            if (i17 < i13 && (itemAlbumMobile = (ItemAlbumMobile) c3020p02.f12023C.f12118i.get(i17)) != null && itemAlbumMobile3 != null && itemAlbumMobile3.f42595r.equals(itemAlbumMobile.f42595r)) {
                                itemAlbumMobile4.f42548C = itemAlbumMobile.f42548C;
                            }
                            arrayList3.add(itemAlbumMobile4);
                        }
                        c3020p02.f12023C.f12118i = arrayList3;
                    } else if (c3020p0.f12023C.f12118i != null) {
                        c3020p02.f12023C.f12118i = new ArrayList(c3020p0.f12023C.f12118i);
                    }
                    if (i12 > 1) {
                        c3020p02.f12058q = 3;
                    } else {
                        c3020p02.f12058q = 2;
                    }
                    c3020p02.f12023C.f12122m = new ArrayList(c3020p0.f12023C.f12122m);
                    C3025q0 c3025q03 = c3020p02.f12023C;
                    C3025q0 c3025q04 = c3020p0.f12023C;
                    c3025q03.f12120k = c3025q04.f12120k;
                    c3025q03.f12121l = c3025q04.f12121l;
                    c3025q03.f12119j = c3025q04.f12119j;
                    c3025q03.f12108Q = c3025q04.f12108Q;
                    c3025q03.f12127r = c3025q04.f12127r;
                }
                C3039t0 c3039t0 = c3020p02.f12025E;
                C3039t0 c3039t02 = c3020p0.f12025E;
                c3039t0.f12243a = c3039t02.f12243a;
                c3039t0.f12244b = c3039t02.f12244b;
                C3051w0 c3051w02 = c3039t02.f12246d;
                if (c3051w02 != null) {
                    c3051w0 = new C3051w0(c3051w02);
                } else {
                    c3051w0 = null;
                }
                c3039t0.f12246d = c3051w0;
                c3020p02.f12064w = c3020p0.f12064w;
                c3020p02.f12041U = null;
                c3020p02.m14538z0(c3020p0.m14527t().toString());
                ArrayList arrayList4 = c3020p0.f12041U;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    c3020p02.f12041U = new ArrayList(c3020p0.f12041U);
                }
                c3020p02.m14478G0(c3020p0.f12059r);
                C3025q0 c3025q05 = c3020p02.f12023C;
                C3025q0 c3025q06 = c3020p0.f12023C;
                c3025q05.f12096E = c3025q06.f12096E;
                c3025q05.f12097F = c3025q06.f12097F;
                c3020p02.f12042V = c3020p0.f12042V;
                c3020p02.f12051e0 = c3020p0.f12051e0;
                c3020p02.f12022B.f12282d = c3020p0.f12022B.f12282d;
                c3025q05.f12111b = c3025q06.f12111b;
                c3020p02.f12052f0 = c3020p0.f12052f0;
                C3039t0 c3039t03 = c3020p02.f12025E;
                if (c3020p0.f12025E.f12247e != null) {
                    c32546b = new C32546b(c3020p0.f12025E.f12247e.m157605a(), c3020p0.f12025E.f12247e.m157607c());
                }
                c3039t03.f12247e = c32546b;
                c3020p02.m14534x0(c3020p0.m14488S());
            } else {
                i14++;
            }
        }
        AbstractC20826v0.m108847z(this);
    }

    /* renamed from: r */
    void m14355r() {
        C3020p0 m14322a0 = m14322a0();
        if (m14322a0 != null && m14322a0.m14488S()) {
            m14294G();
        } else {
            m14305L();
        }
    }

    /* renamed from: r0 */
    public boolean m14356r0(String str) {
        for (C3020p0 c3020p0 : this.f11899s) {
            if (c3020p0 != null && c3020p0.m14465A().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r1 */
    public void m14357r1() {
        this.f11894p0 = C26761p.m137741q().f126944b;
    }

    /* renamed from: s */
    void m14358s() {
        C3020p0 m14322a0 = m14322a0();
        if (m14322a0 != null && m14322a0.m14488S()) {
            m14296H();
        } else {
            m14247M();
        }
    }

    /* renamed from: s0 */
    public boolean m14359s0() {
        C3039t0 c3039t0;
        for (C3020p0 c3020p0 : this.f11899s) {
            if (c3020p0 != null && (c3039t0 = c3020p0.f12025E) != null && (c3039t0.f12244b > 0 || c3039t0.f12243a > 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s1 */
    public void m14360s1(String str) {
        C23307g c23307g;
        try {
            if (this.f11857F.size() > 0) {
                this.f11909x.clear();
                JSONArray jSONArray = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("file_path");
                        int i12 = jSONObject.getInt("client_file_id");
                        long j11 = jSONObject.getLong("server_file_id");
                        if (jSONObject.has("width") && jSONObject.has("height")) {
                            c23307g = new C23307g(jSONObject.getInt("width"), jSONObject.getInt("height"));
                        } else {
                            c23307g = null;
                        }
                        if (!TextUtils.isEmpty(string) && this.f11857F.containsKey(string)) {
                            this.f11857F.put(string, new C3053w2(j11, c23307g));
                            this.f11909x.put(string, Integer.valueOf(i12));
                        }
                        if (jSONObject.has("log_camera")) {
                            this.f11856E.put(string, jSONObject.getString("log_camera"));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    void m14361t() {
        C3020p0 m14322a0 = m14322a0();
        if (m14322a0 != null && m14322a0.m14488S()) {
            m14299I();
        } else {
            m14316T();
        }
    }

    /* renamed from: t0 */
    public boolean m14362t0() {
        if (this.f11907w.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t1 */
    synchronized void m14363t1() {
        try {
            C0824j.m2153b(new n(m14341k0()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        return "FeedContent{, id='" + this.f11895q + "', tab=" + this.f11896q0 + '}';
    }

    /* renamed from: u */
    void m14364u() {
        C3020p0 m14322a0 = m14322a0();
        if (m14322a0 != null && m14322a0.m14488S()) {
            m14301J();
        } else {
            m14313Q();
        }
    }

    /* renamed from: u0 */
    public void m14365u0(C3020p0 c3020p0, int i11) {
        this.f11899s.add(i11, c3020p0);
    }

    /* renamed from: u1 */
    public void m14366u1(boolean z11) {
        this.f11901t = z11;
    }

    /* renamed from: v */
    void m14367v() {
        C3020p0 m14322a0 = m14322a0();
        if (m14322a0 != null && m14322a0.m14488S()) {
            m14301J();
        } else {
            m14312P();
        }
    }

    /* renamed from: v0 */
    boolean m14368v0() {
        int size = m14337i0().size();
        if (size > 0 && size == this.f11857F.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: v1 */
    public void m14369v1(int i11) {
        this.f11914z0 = true;
        this.f11852A0 = i11;
    }

    /* renamed from: w */
    public void m14370w() {
        Iterator it = this.f11899s.iterator();
        while (it.hasNext()) {
            ((C3020p0) it.next()).m14503e();
        }
    }

    /* renamed from: w0 */
    public boolean m14371w0() {
        return this.f11901t;
    }

    /* renamed from: w1 */
    public void m14372w1(int i11) {
        this.f11892o0 = i11;
    }

    /* renamed from: x0 */
    public boolean m14373x0() {
        ArrayList arrayList;
        if (this.f11888k0 != 0 && this.f11889l0 != null && (arrayList = this.f11890m0) != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: x1 */
    void m14374x1(C3000l0 c3000l0, JSONObject jSONObject, String str) {
        try {
            C26881e.m138493d().m138510m(this.f11895q, 3);
            m14262b1(3);
            Thread.sleep(500L);
        } catch (InterruptedException e11) {
            e11.printStackTrace();
            Thread.currentThread().interrupt();
        }
        m14291E1(c3000l0, jSONObject, str);
    }

    /* renamed from: y0 */
    public boolean m14375y0() {
        List list = this.f11899s;
        if (list != null && list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: y1 */
    public void m14376y1(long j11) {
        if (j11 < 0) {
            j11 = 0;
        }
        this.f11894p0 = j11;
    }

    /* renamed from: z0 */
    public boolean m14377z0() {
        return this.f11905v == 2;
    }

    /* renamed from: z1 */
    public void m14378z1(long j11) {
        this.f11912y0 = j11;
    }

    public C3000l0(C3020p0 c3020p0, int i11, boolean z11) {
        this.f11897r = -1;
        this.f11901t = false;
        this.f11907w = new ConcurrentHashMap();
        this.f11909x = new ConcurrentHashMap();
        this.f11911y = false;
        this.f11913z = false;
        this.f11853B = 0;
        this.f11854C = false;
        this.f11855D = false;
        this.f11856E = Collections.synchronizedMap(new LinkedHashMap());
        this.f11857F = Collections.synchronizedMap(new LinkedHashMap());
        this.f11858G = null;
        this.f11859H = 0.0f;
        this.f11865N = 1;
        this.f11866O = false;
        this.f11867P = true;
        this.f11868Q = false;
        this.f11874W = false;
        this.f11875X = false;
        this.f11878a0 = 1;
        this.f11880c0 = -1;
        this.f11882e0 = "";
        this.f11883f0 = "";
        this.f11884g0 = "";
        this.f11885h0 = Boolean.FALSE;
        this.f11888k0 = 0L;
        this.f11891n0 = null;
        this.f11892o0 = -1000;
        this.f11894p0 = C26761p.m137741q().f126944b;
        this.f11896q0 = 0;
        this.f11898r0 = false;
        this.f11900s0 = new C3006m1();
        this.f11904u0 = "";
        this.f11906v0 = false;
        this.f11908w0 = false;
        this.f11910x0 = new HashMap();
        this.f11912y0 = 0L;
        this.f11914z0 = false;
        this.f11852A0 = Integer.MIN_VALUE;
        try {
            this.f11903u = 2;
            this.f11905v = i11;
            this.f11893p = 0;
            this.f11895q = c3020p0.f12057p;
            ArrayList arrayList = new ArrayList();
            this.f11899s = arrayList;
            arrayList.add(c3020p0);
            this.f11913z = false;
            this.f11901t = z11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C3000l0(C3020p0 c3020p0, int i11) {
        this.f11897r = -1;
        this.f11901t = false;
        this.f11907w = new ConcurrentHashMap();
        this.f11909x = new ConcurrentHashMap();
        this.f11911y = false;
        this.f11913z = false;
        this.f11853B = 0;
        this.f11854C = false;
        this.f11855D = false;
        this.f11856E = Collections.synchronizedMap(new LinkedHashMap());
        this.f11857F = Collections.synchronizedMap(new LinkedHashMap());
        this.f11858G = null;
        this.f11859H = 0.0f;
        this.f11865N = 1;
        this.f11866O = false;
        this.f11867P = true;
        this.f11868Q = false;
        this.f11874W = false;
        this.f11875X = false;
        this.f11878a0 = 1;
        this.f11880c0 = -1;
        this.f11882e0 = "";
        this.f11883f0 = "";
        this.f11884g0 = "";
        this.f11885h0 = Boolean.FALSE;
        this.f11888k0 = 0L;
        this.f11891n0 = null;
        this.f11892o0 = -1000;
        this.f11894p0 = C26761p.m137741q().f126944b;
        this.f11896q0 = 0;
        this.f11898r0 = false;
        this.f11900s0 = new C3006m1();
        this.f11904u0 = "";
        this.f11906v0 = false;
        this.f11908w0 = false;
        this.f11910x0 = new HashMap();
        this.f11912y0 = 0L;
        this.f11914z0 = false;
        this.f11852A0 = Integer.MIN_VALUE;
        try {
            this.f11903u = 1;
            this.f11893p = i11;
            this.f11895q = c3020p0.f12057p;
            ArrayList arrayList = new ArrayList();
            this.f11899s = arrayList;
            arrayList.add(c3020p0);
            this.f11901t = false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
