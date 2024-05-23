package p716zh;

import ae.C0764i;
import android.text.TextUtils;
import bo.C3003l3;
import bo.C3013n3;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l30.AbstractC22055v0;
import l30.C22021e0;
import l30.C22037m0;
import l30.C22052u;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23216t1;
import me0.C23278z2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o30.C24009b;
import od0.C24226d;
import od0.C24230h;
import od0.InterfaceC24232j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C24003n;
import p458qr.C25482o;
import p509sp.C26359h;
import p716zh.C32123ta;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import rd0.C25753s;
import rd0.C25755u;
import rd0.C25756v;
import s00.AbstractC26080o;

/* renamed from: zh.ta */
/* loaded from: classes3.dex */
public class C32123ta {

    /* renamed from: l0 */
    public static int f148096l0 = -1000;

    /* renamed from: m0 */
    public static int f148097m0 = -700;

    /* renamed from: A */
    public e f148098A;

    /* renamed from: B */
    public C3063z0 f148099B;

    /* renamed from: C */
    public boolean f148100C;

    /* renamed from: D */
    public C17391z f148101D;

    /* renamed from: E */
    public int f148102E;

    /* renamed from: F */
    public String f148103F;

    /* renamed from: G */
    public List f148104G;

    /* renamed from: H */
    public String f148105H;

    /* renamed from: I */
    public String f148106I;

    /* renamed from: J */
    public String f148107J;

    /* renamed from: K */
    public String f148108K;

    /* renamed from: L */
    public String f148109L;

    /* renamed from: M */
    public String f148110M;

    /* renamed from: N */
    public List f148111N;

    /* renamed from: O */
    private List f148112O;

    /* renamed from: P */
    public int f148113P;

    /* renamed from: Q */
    private TrackingSource f148114Q;

    /* renamed from: R */
    public String f148115R;

    /* renamed from: S */
    public int f148116S;

    /* renamed from: T */
    public C3013n3 f148117T;

    /* renamed from: U */
    public C3003l3 f148118U;

    /* renamed from: V */
    public SongInfo f148119V;

    /* renamed from: W */
    public StoryMusicAttachment f148120W;

    /* renamed from: X */
    public String f148121X;

    /* renamed from: Y */
    public String f148122Y;

    /* renamed from: Z */
    public String f148123Z;

    /* renamed from: a */
    int f148124a;

    /* renamed from: a0 */
    public String f148125a0;

    /* renamed from: b */
    public int f148126b;

    /* renamed from: b0 */
    public String f148127b0;

    /* renamed from: c */
    public int f148128c;

    /* renamed from: c0 */
    public String f148129c0;

    /* renamed from: d */
    private int f148130d;

    /* renamed from: d0 */
    public String f148131d0;

    /* renamed from: e */
    boolean f148132e;

    /* renamed from: e0 */
    public String f148133e0;

    /* renamed from: f */
    private C24230h f148134f;

    /* renamed from: f0 */
    public int f148135f0;

    /* renamed from: g */
    public String f148136g;

    /* renamed from: g0 */
    public int f148137g0;

    /* renamed from: h */
    public String f148138h;

    /* renamed from: h0 */
    public int f148139h0;

    /* renamed from: i */
    public int f148140i;

    /* renamed from: i0 */
    public String f148141i0;

    /* renamed from: j */
    public int f148142j;

    /* renamed from: j0 */
    boolean f148143j0;

    /* renamed from: k */
    public List f148144k;

    /* renamed from: k0 */
    private long f148145k0;

    /* renamed from: l */
    public String f148146l;

    /* renamed from: m */
    public String f148147m;

    /* renamed from: n */
    public String f148148n;

    /* renamed from: o */
    public PrivacyInfo f148149o;

    /* renamed from: p */
    public long f148150p;

    /* renamed from: q */
    public int f148151q;

    /* renamed from: r */
    public boolean f148152r;

    /* renamed from: s */
    public int f148153s;

    /* renamed from: t */
    public int f148154t;

    /* renamed from: u */
    public int f148155u;

    /* renamed from: v */
    public VideoBlendingParam f148156v;

    /* renamed from: w */
    public String f148157w;

    /* renamed from: x */
    public String f148158x;

    /* renamed from: y */
    public int f148159y;

    /* renamed from: z */
    public int f148160z;

    /* renamed from: zh.ta$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f148161a;

        a(String str) {
            this.f148161a = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C32123ta.this.m155032G(this.f148161a, bVar.m132889b());
            if (C32123ta.this.f148114Q != null && C32123ta.this.f148114Q.m40683t() == 7) {
                AbstractC23041d2.m118208g(C32123ta.this.f148156v.f48277q);
            }
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C32123ta.this.m155030E(this.f148161a, aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* renamed from: zh.ta$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f148163a;

        b(String str) {
            this.f148163a = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C32123ta.this.m155031F(this.f148163a, bVar);
            if (C32123ta.this.f148114Q != null && C32123ta.this.f148114Q.m40683t() == 7) {
                AbstractC23041d2.m118208g(this.f148163a);
            }
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C32123ta.this.m155030E(this.f148163a, aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* renamed from: zh.ta$c */
    /* loaded from: classes3.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        /* renamed from: e */
        public /* synthetic */ String m155093e(Object obj) {
            String obj2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Post async success: \ntypoId = ");
            sb2.append(C32123ta.this.f148116S);
            sb2.append("\nresponse = ");
            if (obj == null) {
                obj2 = "NULL";
            } else {
                obj2 = obj.toString();
            }
            sb2.append(obj2);
            return sb2.toString();
        }

        /* renamed from: f */
        public /* synthetic */ String m155094f(C20096c c20096c) {
            Object valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Post async failed; errorCode=");
            if (c20096c == null) {
                valueOf = "UNKNOWN";
            } else {
                valueOf = Integer.valueOf(c20096c.m104491c());
            }
            sb2.append(valueOf);
            sb2.append("; typoId=");
            sb2.append(C32123ta.this.f148116S);
            return sb2.toString();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new InterfaceC18494a() { // from class: zh.va

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f148260q;

                    public /* synthetic */ C32151va(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m155094f;
                        m155094f = C32123ta.c.this.m155094f(r2);
                        return m155094f;
                    }
                });
                C32123ta c32123ta = C32123ta.this;
                c32123ta.f148102E++;
                if (c20096c2 != null) {
                    int m104491c = c20096c2.m104491c();
                    if (C32123ta.this.m155073M()) {
                        if (!AbstractC23216t1.m119640e(m104491c)) {
                        }
                    }
                    C32123ta.this.m155078e0(m104491c);
                } else {
                    c32123ta.m155078e0(C32123ta.f148096l0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C32123ta.this.m155078e0(C32123ta.f148096l0);
            }
            C32123ta.this.f148132e = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new InterfaceC18494a() { // from class: zh.ua

                    /* renamed from: q */
                    public final /* synthetic */ Object f148225q;

                    public /* synthetic */ C32137ua(Object obj2) {
                        r2 = obj2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m155093e;
                        m155093e = C32123ta.c.this.m155093e(r2);
                        return m155093e;
                    }
                });
                JSONObject jSONObject = (JSONObject) obj2;
                if (jSONObject != null) {
                    C32123ta c32123ta = new C32123ta(C32123ta.this.f148136g, jSONObject.getJSONObject("data"));
                    C22021e0 m114963p = C22021e0.m114963p();
                    C32123ta c32123ta2 = C32123ta.this;
                    m114963p.m114975H(c32123ta2.f148138h, c32123ta, c32123ta2.f148146l);
                    C32123ta c32123ta3 = C32123ta.this;
                    c32123ta3.m155080g0(c32123ta3.f148138h, c32123ta.f148138h);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C32123ta.this.m155078e0(C32123ta.f148096l0);
            }
            C32123ta c32123ta4 = C32123ta.this;
            c32123ta4.f148102E++;
            c32123ta4.f148132e = false;
        }
    }

    /* renamed from: zh.ta$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC20094a {
        d() {
        }

        /* renamed from: e */
        public /* synthetic */ String m155097e(Object obj) {
            String obj2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Post async success: \ntypoId = ");
            sb2.append(C32123ta.this.f148116S);
            sb2.append("\nresponse = ");
            if (obj == null) {
                obj2 = "NULL";
            } else {
                obj2 = obj.toString();
            }
            sb2.append(obj2);
            return sb2.toString();
        }

        /* renamed from: f */
        public /* synthetic */ String m155098f(C20096c c20096c) {
            Object valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Post async failed; errorCode=");
            if (c20096c == null) {
                valueOf = "UNKNOWN";
            } else {
                valueOf = Integer.valueOf(c20096c.m104491c());
            }
            sb2.append(valueOf);
            sb2.append("; typoId=");
            sb2.append(C32123ta.this.f148116S);
            return sb2.toString();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C32123ta.this.f148143j0 = false;
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new InterfaceC18494a() { // from class: zh.wa

                    /* renamed from: q */
                    public final /* synthetic */ C20096c f148301q;

                    public /* synthetic */ C32165wa(C20096c c20096c2) {
                        r2 = c20096c2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m155098f;
                        m155098f = C32123ta.d.this.m155098f(r2);
                        return m155098f;
                    }
                });
                C32123ta c32123ta = C32123ta.this;
                c32123ta.f148102E++;
                if (c20096c2 != null) {
                    int m104491c = c20096c2.m104491c();
                    if (C32123ta.this.m155073M()) {
                        if (!AbstractC23216t1.m119640e(m104491c)) {
                        }
                    }
                    C32123ta.this.m155078e0(m104491c);
                } else {
                    c32123ta.m155078e0(C32123ta.f148096l0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C32123ta.this.m155078e0(C32123ta.f148096l0);
            }
            C32123ta.this.f148132e = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C32123ta.this.f148143j0 = false;
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new InterfaceC18494a() { // from class: zh.xa

                    /* renamed from: q */
                    public final /* synthetic */ Object f148394q;

                    public /* synthetic */ C32179xa(Object obj2) {
                        r2 = obj2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m155097e;
                        m155097e = C32123ta.d.this.m155097e(r2);
                        return m155097e;
                    }
                });
                JSONObject jSONObject = (JSONObject) obj2;
                if (jSONObject != null && jSONObject.length() > 0) {
                    C32123ta c32123ta = new C32123ta(C32123ta.this.f148136g, jSONObject);
                    C22021e0 m114963p = C22021e0.m114963p();
                    C32123ta c32123ta2 = C32123ta.this;
                    m114963p.m114975H(c32123ta2.f148138h, c32123ta, c32123ta2.f148146l);
                    C32123ta c32123ta3 = C32123ta.this;
                    c32123ta3.m155080g0(c32123ta3.f148138h, c32123ta.f148138h);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C32123ta.this.m155078e0(C32123ta.f148096l0);
            }
            C32123ta c32123ta4 = C32123ta.this;
            c32123ta4.f148102E++;
            c32123ta4.f148132e = false;
        }
    }

    /* renamed from: zh.ta$e */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a */
        public String f148167a;

        /* renamed from: b */
        public String f148168b;

        /* renamed from: c */
        public String f148169c;

        /* renamed from: d */
        public String f148170d;

        public e(JSONObject jSONObject) {
            this.f148167a = "";
            this.f148168b = "";
            this.f148169c = "";
            this.f148170d = "";
            if (jSONObject != null) {
                try {
                    this.f148167a = AbstractC18069a.m96089h(jSONObject, "userId");
                    this.f148168b = AbstractC18069a.m96089h(jSONObject, "displayName");
                    this.f148169c = AbstractC18069a.m96089h(jSONObject, "avatar");
                    this.f148170d = AbstractC18069a.m96089h(jSONObject, "storyId");
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        /* renamed from: a */
        public JSONObject m155099a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userId", this.f148167a);
                jSONObject.put("displayName", this.f148168b);
                jSONObject.put("avatar", this.f148169c);
                jSONObject.put("storyId", this.f148170d);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
            return jSONObject;
        }
    }

    public C32123ta() {
        this.f148124a = -1;
        this.f148132e = false;
        this.f148140i = 0;
        this.f148142j = 0;
        this.f148144k = new ArrayList();
        this.f148152r = false;
        this.f148157w = "";
        this.f148158x = "";
        this.f148159y = 0;
        this.f148160z = 0;
        this.f148100C = false;
        this.f148104G = new ArrayList();
        this.f148105H = "";
        this.f148106I = "";
        this.f148107J = "";
        this.f148108K = "";
        this.f148109L = "";
        this.f148110M = "";
        this.f148111N = new ArrayList();
        this.f148112O = new ArrayList();
        this.f148121X = "";
        this.f148122Y = "";
        this.f148123Z = "";
        this.f148125a0 = "";
        this.f148127b0 = "";
        this.f148129c0 = "";
        this.f148131d0 = "";
        this.f148133e0 = "";
        this.f148135f0 = 0;
        this.f148137g0 = -1;
        this.f148139h0 = 0;
        this.f148141i0 = "";
        this.f148143j0 = false;
        this.f148145k0 = 0L;
    }

    /* renamed from: B */
    public static float m155029B() {
        try {
            return (AbstractC23136l9.m118713h0() * 1.0f) / AbstractC23136l9.m118722k0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return 1.0f;
        }
    }

    /* renamed from: E */
    public void m155030E(String str, C20096c c20096c) {
        try {
            this.f148102E++;
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: zh.ra

                /* renamed from: q */
                public final /* synthetic */ String f147934q;

                public /* synthetic */ C32095ra(String str2) {
                    r2 = str2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m155040U;
                    m155040U = C32123ta.m155040U(C20096c.this, r2);
                    return m155040U;
                }
            });
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (m155073M()) {
                    if (!AbstractC23216t1.m119640e(m104491c)) {
                    }
                }
                m155078e0(m104491c);
            } else {
                m155078e0(f148096l0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m155078e0(f148096l0);
        }
        this.f148134f = null;
        this.f148132e = false;
    }

    /* renamed from: F */
    public void m155031F(String str, AbstractC25752r.b bVar) {
        String str2;
        try {
            AbstractC25751q m132889b = bVar.m132889b();
            if (m132889b instanceof C25753s) {
                m155088w(((C25753s) m132889b).m132890a());
            } else if (m132889b instanceof C25755u) {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_PHOTO", new InterfaceC18494a() { // from class: zh.sa

                    /* renamed from: p */
                    public final /* synthetic */ String f148034p;

                    /* renamed from: q */
                    public final /* synthetic */ AbstractC25751q f148035q;

                    public /* synthetic */ C32109sa(String str3, AbstractC25751q m132889b2) {
                        r1 = str3;
                        r2 = m132889b2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m155041V;
                        m155041V = C32123ta.m155041V(r1, r2);
                        return m155041V;
                    }
                });
                C32123ta c32123ta = new C32123ta(this.f148136g, ((C25755u) m132889b2).m132891a());
                c32123ta.f148103F = this.f148147m;
                C22021e0 m114963p = C22021e0.m114963p();
                String str3 = this.f148138h;
                if (!TextUtils.isEmpty(c32123ta.f148146l)) {
                    str2 = c32123ta.f148146l;
                } else {
                    str2 = this.f148146l;
                }
                m114963p.m114975H(str3, c32123ta, str2);
                m155080g0(this.f148138h, c32123ta.f148138h);
                this.f148132e = false;
            } else {
                throw new IllegalArgumentException("onDataProcessed: cannot cast any response type");
            }
        } catch (Exception e11) {
            m155078e0(f148096l0);
            AbstractC23350e.m122778h(e11);
            this.f148132e = false;
        }
        this.f148134f = null;
        this.f148102E++;
    }

    /* renamed from: G */
    public void m155032G(String str, AbstractC25751q abstractC25751q) {
        try {
            if (abstractC25751q instanceof C25756v) {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_VIDEO", new InterfaceC18494a() { // from class: zh.pa

                    /* renamed from: p */
                    public final /* synthetic */ String f147653p;

                    /* renamed from: q */
                    public final /* synthetic */ AbstractC25751q f147654q;

                    public /* synthetic */ C32067pa(String str2, AbstractC25751q abstractC25751q2) {
                        r1 = str2;
                        r2 = abstractC25751q2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m155042W;
                        m155042W = C32123ta.m155042W(r1, r2);
                        return m155042W;
                    }
                });
                C32123ta c32123ta = new C32123ta(this.f148136g, ((C25756v) abstractC25751q2).m132892a());
                c32123ta.f148103F = this.f148147m;
                C22021e0.m114963p().m114975H(this.f148138h, c32123ta, this.f148146l);
                m155080g0(this.f148138h, c32123ta.f148138h);
                this.f148134f = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m155078e0(f148096l0);
        }
        this.f148102E++;
        this.f148132e = false;
    }

    /* renamed from: N */
    public /* synthetic */ String m155033N() {
        return "doPostAsyncPhoto: isPosting=" + this.f148132e;
    }

    /* renamed from: O */
    public /* synthetic */ String m155034O(String str, int i11) {
        return "Post single photo:\npath = " + str + "\nclientFileId = " + i11 + "\nclientFeedId=" + this.f148138h + "\nretry = " + this.f148102E;
    }

    /* renamed from: P */
    public /* synthetic */ String m155035P() {
        return "doPostAsyncStatus: isPosting=" + this.f148132e;
    }

    /* renamed from: Q */
    public /* synthetic */ String m155036Q() {
        return "doPostAsyncVideo: isPosting=" + this.f148132e;
    }

    /* renamed from: R */
    public /* synthetic */ String m155037R(String str, int i11) {
        return "start upload video:\npath = " + str + "\nfileSize=" + new File(str).length() + "\nclientFileId = " + i11 + "\nclientFeedId=" + this.f148138h + "\nretry = " + this.f148102E;
    }

    /* renamed from: S */
    public static /* synthetic */ String m155038S(Exception exc) {
        return "doPostAsyncVideo failed: " + exc.getMessage();
    }

    /* renamed from: T */
    public /* synthetic */ String m155039T() {
        return "doPostAsyncStatus: isPosting=" + this.f148132e;
    }

    /* renamed from: U */
    public static /* synthetic */ String m155040U(C20096c c20096c, String str) {
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
    public static /* synthetic */ String m155041V(String str, AbstractC25751q abstractC25751q) {
        return "Post async photo success: \npath = " + str + "\nresponse = " + abstractC25751q;
    }

    /* renamed from: W */
    public static /* synthetic */ String m155042W(String str, AbstractC25751q abstractC25751q) {
        return "Post async video success: \npath = " + str + "\nresponse = " + abstractC25751q;
    }

    /* renamed from: X */
    public static /* synthetic */ void m155043X(String str, String str2) {
        C23744a.m124114c().m124116d(28, 1, str, str2);
    }

    /* renamed from: Y */
    private void m155044Y(long j11, int i11) {
        try {
            C25482o c25482o = C25482o.f122075a;
            c25482o.m132008p(j11, this.f148140i, i11);
            if (this.f148128c == 4) {
                c25482o.m132009q(j11, Integer.valueOf(i11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    private void m155045Z(long j11, long j12) {
        C25482o c25482o = C25482o.f122075a;
        c25482o.m131982C(j11, j12, this.f148140i);
        if (this.f148128c == 4) {
            c25482o.m131983D(j11);
        }
    }

    /* renamed from: q */
    public static C32123ta m155061q(String str, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i11, String str2, StoryMusicAttachment storyMusicAttachment) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C32123ta c32123ta = new C32123ta();
        c32123ta.f148136g = CoreUtility.f89233i;
        c32123ta.f148126b = 2;
        c32123ta.f148128c = 1;
        c32123ta.f148140i = 1;
        c32123ta.f148142j = 0;
        c32123ta.f148146l = str;
        c32123ta.f148147m = str;
        c32123ta.f148138h = mo124311f + "";
        c32123ta.f148150p = mo124311f;
        c32123ta.f148099B = c3063z0;
        c32123ta.f148149o = privacyInfo;
        c32123ta.f148151q = AbstractC26080o.a.f124275b;
        c32123ta.f148152r = false;
        c32123ta.f148153s = i11;
        c32123ta.f148157w = str2;
        if (storyMusicAttachment != null) {
            c32123ta.f148119V = new SongInfo(storyMusicAttachment.m46923a(), "", true);
        }
        c32123ta.f148120W = storyMusicAttachment;
        return c32123ta;
    }

    /* renamed from: r */
    public static C32123ta m155062r(String str, C31890dc c31890dc, C3063z0 c3063z0, PrivacyInfo privacyInfo, C3003l3 c3003l3) {
        int i11;
        C3013n3 c3013n3;
        long mo124311f = C23793c.m124316k().mo124311f();
        C32123ta c32123ta = new C32123ta();
        c32123ta.f148136g = CoreUtility.f89233i;
        c32123ta.f148126b = 2;
        c32123ta.f148128c = 1;
        c32123ta.f148140i = 3;
        c32123ta.f148142j = 0;
        c32123ta.f148146l = "";
        c32123ta.f148138h = mo124311f + "";
        c32123ta.f148150p = mo124311f;
        c32123ta.f148099B = c3063z0;
        c32123ta.f148149o = privacyInfo;
        c32123ta.f148118U = c3003l3;
        c32123ta.f148151q = AbstractC26080o.a.f124275b;
        c32123ta.f148152r = false;
        c32123ta.f148115R = str;
        if (c31890dc != null) {
            i11 = c31890dc.f146495a;
        } else {
            i11 = -1;
        }
        c32123ta.f148116S = i11;
        if (c31890dc != null) {
            c3013n3 = c31890dc.m153246p();
        } else {
            c3013n3 = null;
        }
        c32123ta.f148117T = c3013n3;
        return c32123ta;
    }

    /* renamed from: s */
    public static C32123ta m155063s(VideoBlendingParam videoBlendingParam, C3063z0 c3063z0, PrivacyInfo privacyInfo, int i11, String str, StoryMusicAttachment storyMusicAttachment) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C32123ta c32123ta = new C32123ta();
        c32123ta.f148136g = CoreUtility.f89233i;
        c32123ta.f148126b = 2;
        c32123ta.f148128c = 1;
        c32123ta.f148140i = 2;
        c32123ta.f148142j = 0;
        c32123ta.f148146l = "";
        c32123ta.f148138h = mo124311f + "";
        c32123ta.f148150p = mo124311f;
        c32123ta.f148099B = c3063z0;
        c32123ta.f148149o = privacyInfo;
        c32123ta.f148151q = AbstractC26080o.a.f124275b;
        c32123ta.f148152r = false;
        c32123ta.f148153s = i11;
        c32123ta.f148154t = videoBlendingParam.f48282v;
        c32123ta.f148155u = videoBlendingParam.f48283w;
        c32123ta.f148156v = videoBlendingParam;
        c32123ta.f148157w = str;
        if (storyMusicAttachment != null) {
            c32123ta.f148119V = new SongInfo(storyMusicAttachment.m46923a(), "", true);
        }
        c32123ta.f148120W = storyMusicAttachment;
        return c32123ta;
    }

    /* renamed from: x */
    private ArrayList m155064x() {
        ArrayList arrayList = null;
        try {
            C3003l3 c3003l3 = this.f148118U;
            if (c3003l3 != null) {
                arrayList = c3003l3.m14392e();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: A */
    public int m155065A() {
        return this.f148130d;
    }

    /* renamed from: C */
    public String m155066C() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f148116S);
            sb2.append("_");
            String str = this.f148115R;
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            return sb2.toString();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: D */
    public String m155067D() {
        if (this.f148140i == 2) {
            ZMediaPlayerSettings.VideoConfig videoConfig = ZMediaPlayerSettings.getVideoConfig(2);
            if (videoConfig != null && videoConfig.getPriorityFormat() == 1 && !TextUtils.isEmpty(this.f148148n)) {
                return this.f148148n;
            }
            return this.f148147m;
        }
        return "";
    }

    /* renamed from: H */
    public boolean m155068H() {
        return this.f148126b == 2;
    }

    /* renamed from: I */
    public boolean m155069I() {
        if (!TextUtils.isEmpty(this.f148136g) && this.f148136g.equals(CoreUtility.f89233i)) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public boolean m155070J() {
        return this.f148140i == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:            if (p379o3.C23999j.m125676A2(r4.f148147m, r0.f116260a, r0.f116266g) != null) goto L36;     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m155071K(C23528a c23528a) {
        int i11;
        boolean z11 = false;
        try {
            i11 = this.f148140i;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (i11 == 1) {
            C24003n m120099U0 = C23278z2.m120099U0();
        } else {
            if (i11 == 2) {
                if (this.f148126b != 1) {
                    VideoBlendingParam videoBlendingParam = this.f148156v;
                    if (videoBlendingParam != null && AbstractC23041d2.m118194A(videoBlendingParam.f48278r)) {
                    }
                }
                z11 = true;
            } else if (i11 == 3) {
                z11 = C31845ac.m152996J().m153050e0(this.f148116S);
            }
            return z11;
        }
        AbstractC23350e.m122778h(e11);
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:            if (r6.m123605k(r5.f148147m, r1.f116260a, r1.f116266g) != null) goto L36;     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m155072L(C23528a c23528a) {
        int i11;
        boolean z11 = false;
        try {
            i11 = this.f148140i;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (i11 == 1) {
            C24003n m120099U0 = C23278z2.m120099U0();
        } else {
            if (i11 == 2) {
                if (this.f148126b != 1) {
                    VideoBlendingParam videoBlendingParam = this.f148156v;
                    if (videoBlendingParam != null && AbstractC23041d2.m118194A(videoBlendingParam.f48278r)) {
                    }
                }
                z11 = true;
            } else if (i11 == 3) {
                z11 = C31845ac.m152996J().m153050e0(this.f148116S);
            }
            return z11;
        }
        AbstractC23350e.m122778h(e11);
        return z11;
    }

    /* renamed from: M */
    public boolean m155073M() {
        if (C23793c.m124316k().mo124311f() - this.f148150p <= C22052u.f108593d) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    void m155074a0(JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject m96091j;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        String str3 = "actionData";
        if (jSONObject != null) {
            try {
                this.f148104G.clear();
                this.f148136g = AbstractC18069a.m96089h(jSONObject, "ownerId");
                this.f148140i = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                this.f148138h = AbstractC18069a.m96089h(jSONObject, "id");
                this.f148154t = AbstractC18069a.m96085d(jSONObject, "width");
                this.f148155u = AbstractC18069a.m96085d(jSONObject, "height");
                this.f148146l = AbstractC18069a.m96089h(jSONObject, "thumb");
                this.f148147m = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f148148n = AbstractC18069a.m96089h(jSONObject, "urlHls");
                this.f148151q = AbstractC18069a.m96085d(jSONObject, "delayTime");
                this.f148142j = AbstractC18069a.m96085d(jSONObject, "viewCount");
                this.f148150p = AbstractC18069a.m96087f(jSONObject, "createTime");
                this.f148152r = AbstractC18069a.m96083b(jSONObject, "seen");
                this.f148158x = AbstractC18069a.m96089h(jSONObject, "urlShare");
                this.f148159y = AbstractC18069a.m96085d(jSONObject, "oaOpt");
                this.f148160z = AbstractC18069a.m96085d(jSONObject, "scaleType");
                if (jSONObject.has("ownerInfo")) {
                    this.f148098A = new e(AbstractC18069a.m96091j(jSONObject, "ownerInfo"));
                }
                if (!jSONObject.has("viewerInfo")) {
                    str = "listViewer";
                    str2 = "actionData";
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("viewerInfo");
                    if (!jSONObject2.has("listViewer")) {
                        str = "listViewer";
                    } else {
                        JSONArray jSONArray = jSONObject2.getJSONArray("listViewer");
                        str = "listViewer";
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                            JSONArray jSONArray2 = jSONArray;
                            C31844ab c31844ab = new C31844ab();
                            c31844ab.f146162a = jSONObject3.optString("uid");
                            c31844ab.f146163b = jSONObject3.optString("avt");
                            c31844ab.f146164c = jSONObject3.optString("dpn");
                            this.f148104G.add(c31844ab);
                            i11++;
                            jSONArray = jSONArray2;
                            str3 = str3;
                        }
                    }
                    str2 = str3;
                    if (jSONObject2.has("totalMoreViewers")) {
                        this.f148105H = jSONObject2.getString("totalMoreViewers");
                    }
                }
                if (jSONObject.has("quickAction") && (optJSONObject2 = jSONObject.optJSONObject("quickAction")) != null) {
                    if (optJSONObject2.has("actionId")) {
                        this.f148106I = optJSONObject2.getString("actionId");
                    }
                    if (optJSONObject2.has("actionName")) {
                        this.f148107J = optJSONObject2.getString("actionName");
                    }
                    if (optJSONObject2.has("actionNameEn")) {
                        this.f148108K = optJSONObject2.getString("actionNameEn");
                    } else {
                        this.f148108K = this.f148107J;
                    }
                    if (optJSONObject2.has("actionIcon")) {
                        this.f148109L = optJSONObject2.getString("actionIcon");
                    }
                    String str4 = str2;
                    if (optJSONObject2.has(str4)) {
                        this.f148110M = optJSONObject2.getString(str4);
                    }
                }
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet(C22037m0.f108553a.m115036j(this.f148138h));
                if (jSONObject.has("reaction") && (optJSONObject = jSONObject.optJSONObject("reaction")) != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("listReaction");
                    if (optJSONArray != null) {
                        this.f148111N.clear();
                        this.f148113P = 0;
                        for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i12);
                            if (optJSONObject3 != null) {
                                C24009b m125883b = C24009b.m125883b(optJSONObject3);
                                this.f148111N.add(m125883b);
                                this.f148113P += m125883b.m125885c();
                            }
                        }
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray(str);
                    if (optJSONArray2 != null) {
                        ArrayList<C31844ab> arrayList = new ArrayList();
                        for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                            JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i13);
                            if (optJSONObject4 != null) {
                                C31844ab c31844ab2 = new C31844ab();
                                c31844ab2.f146162a = optJSONObject4.optString("uid");
                                c31844ab2.f146163b = optJSONObject4.optString("avt");
                                c31844ab2.f146164c = optJSONObject4.optString("dpn");
                                ArrayList arrayList2 = new ArrayList();
                                c31844ab2.f146166e = arrayList2;
                                arrayList2.add(optJSONObject4.optString("reactId"));
                                arrayList.add(c31844ab2);
                            }
                        }
                        this.f148112O.clear();
                        for (C31844ab c31844ab3 : arrayList) {
                            if (c31844ab3 != null && !hashSet2.contains(c31844ab3.f146162a) && !hashSet.contains(c31844ab3.f146162a)) {
                                this.f148112O.add(c31844ab3);
                                hashSet.add(c31844ab3.f146162a);
                                if (this.f148112O.size() >= 2) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (this.f148112O.size() < 2) {
                    for (C31844ab c31844ab4 : this.f148104G) {
                        if (c31844ab4 != null && !hashSet2.contains(c31844ab4.f146162a) && !hashSet.contains(c31844ab4.f146162a)) {
                            this.f148112O.add(c31844ab4);
                            hashSet.add(c31844ab4.f146162a);
                            if (this.f148112O.size() >= 2) {
                                break;
                            }
                        }
                    }
                }
                PrivacyInfo privacyInfo = new PrivacyInfo();
                this.f148149o = privacyInfo;
                privacyInfo.f45973p = AbstractC18069a.m96085d(jSONObject, "privacy");
                JSONArray optJSONArray3 = jSONObject.optJSONArray("privacy_share_list");
                if (optJSONArray3 != null) {
                    for (int i14 = 0; i14 < optJSONArray3.length(); i14++) {
                        JSONObject jSONObject4 = (JSONObject) optJSONArray3.get(i14);
                        this.f148149o.f45974q.add(new LikeContactItem(jSONObject4.optString("uid"), jSONObject4.optString("dpn"), jSONObject4.optString("avt")));
                        this.f148149o.m45139f();
                    }
                }
                if (jSONObject.has(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION) && (m96091j = AbstractC18069a.m96091j(jSONObject, ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) != null) {
                    this.f148099B = new C3063z0(m96091j);
                }
                this.f148156v = VideoBlendingParam.m48165a(AbstractC18069a.m96091j(jSONObject, "videoBlendingParam"));
                this.f148103F = AbstractC18069a.m96089h(jSONObject, "localUrl");
                this.f148115R = AbstractC18069a.m96089h(jSONObject, "status");
                this.f148116S = AbstractC18069a.m96085d(jSONObject, "typoid");
                this.f148117T = new C3013n3(AbstractC18069a.m96091j(jSONObject, "typo_info"));
                this.f148130d = jSONObject.optInt("postErrorCode");
                if (jSONObject.has("song") && jSONObject.optJSONObject("song") != null) {
                    SongInfo songInfo = new SongInfo(jSONObject.getJSONObject("song"));
                    this.f148119V = songInfo;
                    if (!TextUtils.isEmpty(songInfo.m45182d()) && jSONObject.has("song_visual")) {
                        this.f148120W = StoryMusicAttachment.Companion.m46937a(this.f148119V.m45182d(), new JSONObject(jSONObject.getString("song_visual")));
                    }
                    if (this.f148140i == 1) {
                        this.f148151q = 15000;
                    }
                }
                if (jSONObject.has("tracking_source")) {
                    this.f148114Q = new TrackingSource(jSONObject.getString("tracking_source"));
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: b0 */
    public void m155075b0() {
        try {
            int i11 = this.f148128c;
            if ((i11 == 4 || i11 == 1) && !this.f148132e) {
                int i12 = this.f148140i;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            m155086u();
                        }
                    } else {
                        m155087v();
                    }
                } else {
                    m155085t();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c0 */
    public void m155076c0(int i11) {
        this.f148130d = i11;
    }

    /* renamed from: d0 */
    public void m155077d0(long j11) {
        this.f148145k0 = j11;
    }

    /* renamed from: e0 */
    public void m155078e0(int i11) {
        m155044Y(this.f148145k0, i11);
        this.f148128c = 2;
    }

    /* renamed from: f0 */
    public void m155079f0() {
        try {
            this.f148143j0 = false;
            this.f148132e = false;
            this.f148128c = 4;
            this.f148150p = C23793c.m124316k().mo124311f();
            this.f148102E = 0;
            C7960e.m41971c6().m42069B3(CoreUtility.f89233i, this.f148138h);
            C7960e.m41971c6().m42074B8(CoreUtility.f89233i, this.f148138h, m155082i0().toString(), 4, this.f148157w);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g0 */
    void m155080g0(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = this.f148145k0;
        m155045Z(j11, currentTimeMillis - j11);
        this.f148128c = 3;
        if (m155069I()) {
            AbstractC19444a.m101694b(new Runnable() { // from class: zh.qa

                /* renamed from: p */
                public final /* synthetic */ String f147801p;

                /* renamed from: q */
                public final /* synthetic */ String f147802q;

                public /* synthetic */ RunnableC32081qa(String str3, String str22) {
                    r1 = str3;
                    r2 = str22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C32123ta.m155043X(r1, r2);
                }
            }, 2000L);
        } else {
            C23744a.m124114c().m124116d(28, 1, str3, str22);
        }
    }

    /* renamed from: h0 */
    public void m155081h0(TrackingSource trackingSource) {
        this.f148114Q = trackingSource;
    }

    /* renamed from: i0 */
    public JSONObject m155082i0() {
        int i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ownerId", this.f148136g);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f148140i);
            jSONObject.put("id", this.f148138h);
            jSONObject.put("width", this.f148154t);
            jSONObject.put("height", this.f148155u);
            jSONObject.put("thumb", this.f148146l);
            jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f148147m);
            jSONObject.put("urlHls", this.f148148n);
            jSONObject.put("delayTime", this.f148151q);
            jSONObject.put("viewCount", this.f148142j);
            jSONObject.put("createTime", this.f148150p);
            jSONObject.put("seen", this.f148152r);
            jSONObject.put("urlShare", this.f148158x);
            jSONObject.put("oaOpt", this.f148159y);
            jSONObject.put("scaleType", this.f148160z);
            e eVar = this.f148098A;
            if (eVar != null) {
                jSONObject.put("ownerInfo", eVar.m155099a());
            }
            PrivacyInfo privacyInfo = this.f148149o;
            if (privacyInfo != null) {
                i11 = privacyInfo.f45973p;
            } else {
                i11 = 0;
            }
            jSONObject.put("privacy", i11);
            PrivacyInfo privacyInfo2 = this.f148149o;
            if (privacyInfo2 != null && privacyInfo2.f45974q.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f148149o.f45974q.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("uid", likeContactItem.m56333d());
                    jSONObject2.put("dpn", likeContactItem.m56331b());
                    jSONObject2.put("avt", likeContactItem.m56330a());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("privacy_share_list", jSONArray);
            }
            C3063z0 c3063z0 = this.f148099B;
            if (c3063z0 != null) {
                jSONObject.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, c3063z0.m14734m());
            }
            VideoBlendingParam videoBlendingParam = this.f148156v;
            if (videoBlendingParam != null) {
                jSONObject.put("videoBlendingParam", videoBlendingParam.m48166b());
            }
            if (!TextUtils.isEmpty(this.f148103F)) {
                jSONObject.put("localUrl", this.f148103F);
            }
            Object obj = this.f148115R;
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            jSONObject.put("status", obj);
            jSONObject.put("typoid", this.f148116S);
            C3013n3 c3013n3 = this.f148117T;
            if (c3013n3 != null) {
                obj2 = c3013n3.m14431b();
            }
            jSONObject.put("typo_info", obj2);
            jSONObject.put("postErrorCode", this.f148130d);
            if (!TextUtils.isEmpty(this.f148106I)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("actionId", this.f148106I);
                jSONObject3.put("actionName", this.f148107J);
                jSONObject3.put("actionNameEn", this.f148108K);
                jSONObject3.put("actionIcon", this.f148109L);
                jSONObject3.put("actionData", this.f148110M);
                jSONObject.put("quickAction", jSONObject3);
            }
            SongInfo songInfo = this.f148119V;
            if (songInfo != null) {
                jSONObject.put("song", songInfo.m45186h());
            }
            StoryMusicAttachment storyMusicAttachment = this.f148120W;
            if (storyMusicAttachment != null) {
                jSONObject.put("song_visual", storyMusicAttachment.m46936n().toString());
            }
            TrackingSource trackingSource = this.f148114Q;
            if (trackingSource != null) {
                jSONObject.put("tracking_source", trackingSource.m40686z());
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: j0 */
    public boolean m155083j0() {
        List list = this.f148111N;
        boolean z11 = false;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = this.f148111N.iterator();
        while (true) {
            if (it.hasNext()) {
                C24009b c24009b = (C24009b) it.next();
                if (c24009b != null && !TextUtils.isEmpty(AbstractC22055v0.m115155o(c24009b.m125886d()))) {
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        return !z11;
    }

    /* renamed from: p */
    public synchronized void m155084p() {
        try {
            this.f148143j0 = false;
            C24230h c24230h = this.f148134f;
            if (c24230h != null) {
                c24230h.m126509j();
                C24226d.m126388J(this.f148134f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zh.oa.<init>(zh.ta, java.lang.String, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: t */
    void m155085t() {
        /*
            r12 = this;
            java.lang.String r0 = "POST_STORY_PHOTO"
            java.lang.String r1 = "POST_STORY"
            r2 = 0
            sp.h r3 = p509sp.C26359h.f125209a     // Catch: java.lang.Exception -> L2b
            zh.na r4 = new zh.na     // Catch: java.lang.Exception -> L2b
            r4.<init>()     // Catch: java.lang.Exception -> L2b
            r3.mo135685a(r1, r0, r4)     // Catch: java.lang.Exception -> L2b
            boolean r4 = r12.f148132e     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L14
            return
        L14:
            boolean r4 = me0.AbstractC23238v2.m119727l()     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto Lb0
            r4 = 1
            r12.f148132e = r4     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r12.f148147m     // Catch: java.lang.Exception -> L2b
            boolean r4 = me0.AbstractC23041d2.m118194A(r4)     // Catch: java.lang.Exception -> L2b
            if (r4 != 0) goto L2e
            r0 = 5
            r12.f148128c = r0     // Catch: java.lang.Exception -> L2b
            r12.f148132e = r2     // Catch: java.lang.Exception -> L2b
            return
        L2b:
            r0 = move-exception
            goto Lb8
        L2e:
            java.lang.String r10 = r12.f148147m     // Catch: java.lang.Exception -> L2b
            int r11 = r12.m155089y()     // Catch: java.lang.Exception -> L2b
            r12.m155084p()     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = "uploadConfig@functionV2@7@typeUpload"
            int r4 = p173fz.C19172a.m100599j(r4)     // Catch: java.lang.Exception -> L2b
            boolean r4 = me0.AbstractC23047d8.m118257i(r4)     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L47
            od0.g r4 = od0.EnumC24229g.f116977P     // Catch: java.lang.Exception -> L2b
        L45:
            r5 = r4
            goto L4a
        L47:
            od0.g r4 = od0.EnumC24229g.f116992z     // Catch: java.lang.Exception -> L2b
            goto L45
        L4a:
            int r4 = l30.C22052u.f108593d     // Catch: java.lang.Exception -> L2b
            long r7 = (long) r4     // Catch: java.lang.Exception -> L2b
            r9 = 0
            r4 = r11
            r6 = r10
            od0.h r4 = od0.C24226d.m126395Q(r4, r5, r6, r7, r9)     // Catch: java.lang.Exception -> L2b
            r12.f148134f = r4     // Catch: java.lang.Exception -> L2b
            zh.ta$b r4 = new zh.ta$b     // Catch: java.lang.Exception -> L2b
            r4.<init>(r10)     // Catch: java.lang.Exception -> L2b
            zh.oa r5 = new zh.oa     // Catch: java.lang.Exception -> L2b
            r5.<init>()     // Catch: java.lang.Exception -> L2b
            r3.mo135685a(r1, r0, r5)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            r0.m126505h(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = com.zing.zalocore.CoreUtility.f89233i     // Catch: java.lang.Exception -> L2b
            r0.m126482B0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r12.f148138h     // Catch: java.lang.Exception -> L2b
            long r3 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L2b
            r0.m126502e0(r3)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            bo.z0 r1 = r12.f148099B     // Catch: java.lang.Exception -> L2b
            r0.m126517o0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            com.zing.zalo.feed.models.PrivacyInfo r1 = r12.f148149o     // Catch: java.lang.Exception -> L2b
            r0.m126520q0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            int r1 = r12.f148153s     // Catch: java.lang.Exception -> L2b
            r0.m126508i0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r12.f148157w     // Catch: java.lang.Exception -> L2b
            r0.m126501d0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment r1 = r12.f148120W     // Catch: java.lang.Exception -> L2b
            r0.m126529v0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            com.zing.zalo.control.TrackingSource r1 = r12.f148114Q     // Catch: java.lang.Exception -> L2b
            r0.m126535z0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            r1 = 3
            r0.m126526t0(r1)     // Catch: java.lang.Exception -> L2b
            od0.h r0 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            od0.C24226d.m126402Z(r0)     // Catch: java.lang.Exception -> L2b
            goto Lc2
        Lb0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "SD Card not mounted"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2b
            throw r0     // Catch: java.lang.Exception -> L2b
        Lb8:
            int r1 = p716zh.C32123ta.f148096l0
            r12.m155078e0(r1)
            mm0.AbstractC23350e.m122778h(r0)
            r12.f148132e = r2
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p716zh.C32123ta.m155085t():void");
    }

    /* renamed from: u */
    void m155086u() {
        try {
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new InterfaceC18494a() { // from class: zh.ia
                public /* synthetic */ C31963ia() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m155035P;
                    m155035P = C32123ta.this.m155035P();
                    return m155035P;
                }
            });
            if (this.f148132e) {
                return;
            }
            this.f148132e = true;
            C0764i c0764i = new C0764i();
            c0764i.m1341j(new c());
            c0764i.m1381k(this.f148115R, m155064x(), Long.parseLong(this.f148138h), this.f148099B, this.f148149o, this.f148116S, this.f148117T, this.f148102E, this.f148114Q);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f148132e = false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zh.la.<init>(zh.ta, java.lang.String, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: v */
    void m155087v() {
        /*
            r12 = this;
            java.lang.String r0 = "POST_STORY_VIDEO"
            java.lang.String r1 = "POST_STORY"
            r2 = 0
            sp.h r3 = p509sp.C26359h.f125209a     // Catch: java.lang.Exception -> L2b
            zh.ka r4 = new zh.ka     // Catch: java.lang.Exception -> L2b
            r4.<init>()     // Catch: java.lang.Exception -> L2b
            r3.mo135685a(r1, r0, r4)     // Catch: java.lang.Exception -> L2b
            boolean r4 = r12.f148132e     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L14
            return
        L14:
            boolean r4 = me0.AbstractC23238v2.m119727l()     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto La5
            r4 = 1
            r12.f148132e = r4     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r12.f148147m     // Catch: java.lang.Exception -> L2b
            boolean r5 = me0.AbstractC23041d2.m118194A(r4)     // Catch: java.lang.Exception -> L2b
            if (r5 != 0) goto L2e
            r3 = 5
            r12.f148128c = r3     // Catch: java.lang.Exception -> L2b
            r12.f148132e = r2     // Catch: java.lang.Exception -> L2b
            return
        L2b:
            r3 = move-exception
            goto Lad
        L2e:
            r12.m155084p()     // Catch: java.lang.Exception -> L2b
            int r11 = r12.m155089y()     // Catch: java.lang.Exception -> L2b
            od0.g r6 = od0.EnumC24229g.f116964C     // Catch: java.lang.Exception -> L2b
            int r5 = l30.C22052u.f108593d     // Catch: java.lang.Exception -> L2b
            long r8 = (long) r5     // Catch: java.lang.Exception -> L2b
            r10 = 0
            r5 = r11
            r7 = r4
            od0.h r5 = od0.C24226d.m126395Q(r5, r6, r7, r8, r10)     // Catch: java.lang.Exception -> L2b
            r12.f148134f = r5     // Catch: java.lang.Exception -> L2b
            zh.ta$a r5 = new zh.ta$a     // Catch: java.lang.Exception -> L2b
            r5.<init>(r4)     // Catch: java.lang.Exception -> L2b
            zh.la r6 = new zh.la     // Catch: java.lang.Exception -> L2b
            r6.<init>()     // Catch: java.lang.Exception -> L2b
            r3.mo135685a(r1, r0, r6)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = com.zing.zalocore.CoreUtility.f89233i     // Catch: java.lang.Exception -> L2b
            r3.m126482B0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            r3.m126505h(r5)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r12.f148138h     // Catch: java.lang.Exception -> L2b
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Exception -> L2b
            r3.m126502e0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            bo.z0 r4 = r12.f148099B     // Catch: java.lang.Exception -> L2b
            r3.m126517o0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            com.zing.zalo.feed.models.PrivacyInfo r4 = r12.f148149o     // Catch: java.lang.Exception -> L2b
            r3.m126520q0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            int r4 = r12.f148153s     // Catch: java.lang.Exception -> L2b
            r3.m126508i0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            int r4 = r12.f148154t     // Catch: java.lang.Exception -> L2b
            r3.m126486D0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            int r4 = r12.f148155u     // Catch: java.lang.Exception -> L2b
            r3.m126516n0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = r12.f148157w     // Catch: java.lang.Exception -> L2b
            r3.m126501d0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment r4 = r12.f148120W     // Catch: java.lang.Exception -> L2b
            r3.m126529v0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            com.zing.zalo.control.TrackingSource r4 = r12.f148114Q     // Catch: java.lang.Exception -> L2b
            r3.m126535z0(r4)     // Catch: java.lang.Exception -> L2b
            od0.h r3 = r12.f148134f     // Catch: java.lang.Exception -> L2b
            od0.C24226d.m126402Z(r3)     // Catch: java.lang.Exception -> L2b
            goto Lc1
        La5:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = "SD Card not mounted"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L2b
            throw r3     // Catch: java.lang.Exception -> L2b
        Lad:
            int r4 = p716zh.C32123ta.f148096l0
            r12.m155078e0(r4)
            mm0.AbstractC23350e.m122778h(r3)
            r12.f148132e = r2
            sp.h r2 = p509sp.C26359h.f125209a
            zh.ma r4 = new zh.ma
            r4.<init>()
            r2.mo135685a(r1, r0, r4)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p716zh.C32123ta.m155087v():void");
    }

    /* renamed from: w */
    void m155088w(long j11) {
        try {
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_STATUS", new InterfaceC18494a() { // from class: zh.ja
                public /* synthetic */ C31978ja() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m155039T;
                    m155039T = C32123ta.this.m155039T();
                    return m155039T;
                }
            });
            if (this.f148143j0) {
                return;
            }
            this.f148143j0 = true;
            C0764i c0764i = new C0764i();
            c0764i.m1341j(new d());
            c0764i.m1382l(this.f148115R, m155064x(), Long.parseLong(this.f148138h), this.f148099B, this.f148149o, this.f148153s, this.f148120W, this.f148102E, j11, AbstractC23067f6.m118367a(this.f148147m), this.f148114Q);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f148143j0 = false;
            this.f148132e = false;
        }
    }

    /* renamed from: y */
    int m155089y() {
        if (this.f148124a < 0) {
            this.f148124a = new Random().nextInt(Integer.MAX_VALUE);
        }
        return this.f148124a;
    }

    /* renamed from: z */
    public List m155090z() {
        HashSet hashSet = new HashSet(C22037m0.f108553a.m115036j(this.f148138h));
        List list = this.f148112O;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C31844ab c31844ab = (C31844ab) it.next();
                if (c31844ab != null && hashSet.contains(c31844ab.f146162a)) {
                    it.remove();
                    break;
                }
            }
            return this.f148112O;
        }
        return new ArrayList();
    }

    public C32123ta(JSONObject jSONObject) {
        this.f148124a = -1;
        this.f148132e = false;
        this.f148140i = 0;
        this.f148142j = 0;
        this.f148144k = new ArrayList();
        this.f148152r = false;
        this.f148157w = "";
        this.f148158x = "";
        this.f148159y = 0;
        this.f148160z = 0;
        this.f148100C = false;
        this.f148104G = new ArrayList();
        this.f148105H = "";
        this.f148106I = "";
        this.f148107J = "";
        this.f148108K = "";
        this.f148109L = "";
        this.f148110M = "";
        this.f148111N = new ArrayList();
        this.f148112O = new ArrayList();
        this.f148121X = "";
        this.f148122Y = "";
        this.f148123Z = "";
        this.f148125a0 = "";
        this.f148127b0 = "";
        this.f148129c0 = "";
        this.f148131d0 = "";
        this.f148133e0 = "";
        this.f148135f0 = 0;
        this.f148137g0 = -1;
        this.f148139h0 = 0;
        this.f148141i0 = "";
        this.f148143j0 = false;
        this.f148145k0 = 0L;
        this.f148126b = 1;
        m155074a0(jSONObject);
    }

    public C32123ta(String str, JSONObject jSONObject) {
        this(jSONObject);
        this.f148136g = str;
    }
}
