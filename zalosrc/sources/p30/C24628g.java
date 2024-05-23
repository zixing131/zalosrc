package p30;

import ae.C0766k;
import ag0.C0815e1;
import android.text.TextUtils;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22035l0;
import l30.C22037m0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p205hc.AbstractC19963b;
import p30.C24628g;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p716zh.C31844ab;
import p716zh.C31853b5;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25368s;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: p30.g */
/* loaded from: classes5.dex */
public final class C24628g extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: C */
    private int f118460C;

    /* renamed from: G */
    private boolean f118464G;

    /* renamed from: J */
    private C31844ab f118467J;

    /* renamed from: L */
    private boolean f118469L;

    /* renamed from: t */
    private final C1761c0 f118470t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f118471u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f118472v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f118473w = new C1761c0();

    /* renamed from: x */
    private final C1761c0 f118474x = new C1761c0();

    /* renamed from: y */
    private final C1761c0 f118475y = new C1761c0();

    /* renamed from: z */
    private final C1761c0 f118476z = new C1761c0();

    /* renamed from: A */
    private final C1761c0 f118458A = new C1761c0();

    /* renamed from: B */
    private final C1761c0 f118459B = new C1761c0();

    /* renamed from: D */
    private String f118461D = "0";

    /* renamed from: E */
    private boolean f118462E = true;

    /* renamed from: F */
    private String f118463F = "";

    /* renamed from: H */
    private boolean f118465H = true;

    /* renamed from: I */
    private final List f118466I = new ArrayList();

    /* renamed from: K */
    private int f118468K = -1;

    /* renamed from: p30.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: p30.g$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f118477p = new b("STATE_LOADING", 0);

        /* renamed from: q */
        public static final b f118478q = new b("STATE_DATA", 1);

        /* renamed from: r */
        public static final b f118479r = new b("STATE_EMPTY", 2);

        /* renamed from: s */
        public static final b f118480s = new b("STATE_ERROR", 3);

        /* renamed from: t */
        private static final /* synthetic */ b[] f118481t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f118482u;

        static {
            b[] m128163b = m128163b();
            f118481t = m128163b;
            f118482u = AbstractC30166b.m148796a(m128163b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m128163b() {
            return new b[]{f118477p, f118478q, f118479r, f118480s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f118481t.clone();
        }
    }

    /* renamed from: p30.g$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final b f118483a;

        /* renamed from: b */
        private final boolean f118484b;

        public c(b bVar, boolean z11) {
            AbstractC19074t.m100208f(bVar, "state");
            this.f118483a = bVar;
            this.f118484b = z11;
        }

        /* renamed from: a */
        public final b m128164a() {
            return this.f118483a;
        }

        /* renamed from: b */
        public final boolean m128165b() {
            return this.f118484b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f118483a == cVar.f118483a && this.f118484b == cVar.f118484b;
        }

        public int hashCode() {
            return (this.f118483a.hashCode() * 31) + AbstractC2144f.m11520a(this.f118484b);
        }

        public String toString() {
            return "StoryViewerReactionDataState(state=" + this.f118483a + ", isShowFooter=" + this.f118484b + ")";
        }
    }

    /* renamed from: p30.g$d */
    /* loaded from: classes5.dex */
    public static final class d extends C22035l0.d {

        /* renamed from: a */
        final /* synthetic */ C31844ab f118485a;

        /* renamed from: b */
        final /* synthetic */ int f118486b;

        /* renamed from: c */
        final /* synthetic */ C24628g f118487c;

        d(C31844ab c31844ab, int i11, C24628g c24628g) {
            this.f118485a = c31844ab;
            this.f118486b = i11;
            this.f118487c = c24628g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m128168f(C31844ab c31844ab, int i11, C24628g c24628g) {
            boolean z11;
            AbstractC19074t.m100208f(c24628g, "this$0");
            c31844ab.f146167f = false;
            if (i11 != -1) {
                c24628g.f118458A.mo9224q(Integer.valueOf(i11));
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("i", i11 + 1);
                List list = c31844ab.f146166e;
                if (list != null && !list.isEmpty()) {
                    z11 = true;
                    jSONObject.put("reaction", z11);
                    C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_block_viewer", jSONObject.toString()), false);
                }
                z11 = false;
                jSONObject.put("reaction", z11);
                C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_block_viewer", jSONObject.toString()), false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m128169g(C31844ab c31844ab, int i11, C24628g c24628g) {
            AbstractC19074t.m100208f(c24628g, "this$0");
            c31844ab.f146167f = false;
            if (i11 != -1) {
                c24628g.f118458A.mo9224q(Integer.valueOf(i11));
            }
        }

        @Override // l30.C22035l0.d
        /* renamed from: a */
        public void mo78820a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            if (i11 != 0) {
                if (!TextUtils.isEmpty(str)) {
                    ToastUtils.showMess(str);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            }
            final C31844ab c31844ab = this.f118485a;
            final int i12 = this.f118486b;
            final C24628g c24628g = this.f118487c;
            AbstractC19444a.m101695c(new Runnable() { // from class: p30.h
                @Override // java.lang.Runnable
                public final void run() {
                    C24628g.d.m128168f(C31844ab.this, i12, c24628g);
                }
            });
        }

        @Override // l30.C22035l0.d
        /* renamed from: c */
        public void mo84527c(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            if (i11 != 0) {
                if (!TextUtils.isEmpty(str)) {
                    ToastUtils.showMess(str);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
            }
            final C31844ab c31844ab = this.f118485a;
            final int i12 = this.f118486b;
            final C24628g c24628g = this.f118487c;
            AbstractC19444a.m101695c(new Runnable() { // from class: p30.i
                @Override // java.lang.Runnable
                public final void run() {
                    C24628g.d.m128169g(C31844ab.this, i12, c24628g);
                }
            });
        }
    }

    /* renamed from: p30.g$e */
    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f118489b;

        /* renamed from: c */
        final /* synthetic */ String f118490c;

        e(int i11, String str) {
            this.f118489b = i11;
            this.f118490c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m128172e(C24628g c24628g, int i11, int i12, int i13, List list, String str) {
            AbstractC19074t.m100208f(c24628g, "this$0");
            AbstractC19074t.m100208f(list, "$storyViewers");
            AbstractC19074t.m100208f(str, "$storyId");
            boolean z11 = false;
            c24628g.f118464G = false;
            c24628g.f118460C++;
            c24628g.f118472v.mo9224q(Integer.valueOf(i11));
            c24628g.f118473w.mo9224q(Integer.valueOf(i12));
            if (i11 > 0) {
                C1761c0 c1761c0 = c24628g.f118471u;
                b bVar = b.f118478q;
                if (i13 != 0) {
                    z11 = true;
                }
                c1761c0.mo9224q(new c(bVar, z11));
            } else {
                C1761c0 c1761c02 = c24628g.f118471u;
                b bVar2 = b.f118479r;
                if (i13 != 0) {
                    z11 = true;
                }
                c1761c02.mo9224q(new c(bVar2, z11));
            }
            List list2 = list;
            if (!list2.isEmpty()) {
                c24628g.f118466I.addAll(list2);
            }
            c24628g.f118470t.mo9224q(c24628g.f118466I);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C31844ab c31844ab = (C31844ab) it.next();
                C22037m0 c22037m0 = C22037m0.f108553a;
                String str2 = c31844ab.f146162a;
                AbstractC19074t.m100207e(str2, "uid");
                c22037m0.m115032f(str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m128173f(C24628g c24628g, int i11) {
            AbstractC19074t.m100208f(c24628g, "this$0");
            boolean z11 = false;
            c24628g.f118464G = false;
            C1761c0 c1761c0 = c24628g.f118471u;
            b bVar = b.f118480s;
            if (i11 != 0) {
                z11 = true;
            }
            c1761c0.mo9224q(new c(bVar, z11));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            final C24628g c24628g = C24628g.this;
            final int i11 = this.f118489b;
            AbstractC19444a.m101695c(new Runnable() { // from class: p30.j
                @Override // java.lang.Runnable
                public final void run() {
                    C24628g.e.m128173f(C24628g.this, i11);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            final int m116580c;
            try {
                JSONObject jSONObject2 = null;
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                if (jSONObject2 != null) {
                    C24628g.this.f118462E = jSONObject2.optBoolean("more");
                    JSONArray optJSONArray = jSONObject2.optJSONArray("list");
                    final ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                            C31844ab c31844ab = new C31844ab();
                            c31844ab.f146162a = jSONObject3.optString("uid", "");
                            c31844ab.f146163b = jSONObject3.optString("avt", "");
                            c31844ab.f146164c = jSONObject3.optString("dispname", "");
                            c31844ab.f146165d = jSONObject3.optInt("total_reaction");
                            JSONArray optJSONArray2 = jSONObject3.optJSONArray("id_reactions");
                            if (optJSONArray2 != null) {
                                c31844ab.f146166e = new ArrayList();
                                int length2 = optJSONArray2.length();
                                for (int i12 = 0; i12 < length2; i12++) {
                                    int optInt = optJSONArray2.optInt(i12);
                                    if (optInt != 0) {
                                        c31844ab.f146166e.add(String.valueOf(optInt));
                                    }
                                }
                            }
                            if (!AbstractC19074t.m100204b(CoreUtility.f89233i, c31844ab.f146162a)) {
                                arrayList.add(c31844ab);
                                C24628g c24628g = C24628g.this;
                                String str = c31844ab.f146162a;
                                AbstractC19074t.m100207e(str, "uid");
                                c24628g.f118461D = str;
                            }
                        }
                    }
                    m116580c = AbstractC22543l.m116580c(jSONObject2.optInt("total") - 1, 0);
                    final int optInt2 = jSONObject2.optInt("total_reaction");
                    final C24628g c24628g2 = C24628g.this;
                    final int i13 = this.f118489b;
                    final String str2 = this.f118490c;
                    AbstractC19444a.m101695c(new Runnable() { // from class: p30.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C24628g.e.m128172e(C24628g.this, m116580c, optInt2, i13, arrayList, str2);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: p30.g$f */
    /* loaded from: classes5.dex */
    public static final class f extends C22035l0.d {
        f() {
        }

        @Override // l30.C22035l0.d
        /* renamed from: b */
        public void mo84526b(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            if (i11 == 0) {
                C24628g.this.f118459B.mo9221n(C24848g0.f119245a);
            }
        }
    }

    /* renamed from: b0 */
    private final void m128141b0(C31844ab c31844ab) {
        if (c31844ab != null && C21927m.m114302u().m114309G() != null) {
            Iterator it = this.f118466I.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((C31844ab) it.next()).f146162a, c31844ab.f146162a)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            c31844ab.f146167f = true;
            if (i11 != -1) {
                this.f118458A.mo9224q(Integer.valueOf(i11));
            }
            C22035l0 c22035l0 = new C22035l0(new d(c31844ab, i11, this));
            if (C21927m.m114302u().m114309G().m153137g(c31844ab.f146162a)) {
                c22035l0.m115025d(c31844ab.f146162a, new TrackingSource(100));
            } else {
                c22035l0.m115022a(c31844ab.f146162a, new TrackingSource(100));
            }
        }
    }

    /* renamed from: k0 */
    private final void m128142k0(String str, int i11, String str2) {
        boolean z11;
        C31853b5 m114309G;
        e eVar = new e(i11, str);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(eVar);
        C1761c0 c1761c0 = this.f118471u;
        b bVar = b.f118477p;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        c1761c0.mo9224q(new c(bVar, z11));
        c0766k.m1827U(str, this.f118460C, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, str2);
        if (this.f118465H && (m114309G = C21927m.m114302u().m114309G()) != null && m114309G.isEmpty()) {
            this.f118465H = false;
            new C22035l0(new f()).m115024c(1, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
    }

    /* renamed from: a0 */
    public final void m128143a0() {
        m128141b0(this.f118467J);
    }

    /* renamed from: c0 */
    public final LiveData m128144c0() {
        return this.f118471u;
    }

    /* renamed from: e0 */
    public final boolean m128145e0() {
        return this.f118469L;
    }

    /* renamed from: f0 */
    public final LiveData m128146f0() {
        return this.f118470t;
    }

    /* renamed from: g0 */
    public final LiveData m128147g0() {
        return this.f118476z;
    }

    /* renamed from: h0 */
    public final LiveData m128148h0() {
        return this.f118475y;
    }

    /* renamed from: i0 */
    public final LiveData m128149i0() {
        return this.f118474x;
    }

    /* renamed from: j0 */
    public final String m128150j0() {
        return this.f118463F;
    }

    /* renamed from: l0 */
    public final LiveData m128151l0() {
        return this.f118473w;
    }

    /* renamed from: m0 */
    public final LiveData m128152m0() {
        return this.f118472v;
    }

    /* renamed from: n0 */
    public final LiveData m128153n0() {
        return this.f118458A;
    }

    /* renamed from: o0 */
    public final LiveData m128154o0() {
        return this.f118459B;
    }

    /* renamed from: p0 */
    public final void m128155p0(C31844ab c31844ab) {
        AbstractC19074t.m100208f(c31844ab, "viewer");
        if (C21927m.m114302u().m114309G() != null) {
            this.f118467J = c31844ab;
            String m114542i = AbstractC21935u.m114542i(c31844ab.f146162a, c31844ab.f146164c);
            boolean m153137g = C21927m.m114302u().m114309G().m153137g(c31844ab.f146162a);
            if (!m153137g) {
                AbstractC23647d.m123897g("4915310");
            }
            this.f118474x.mo9224q(new C24860q(m114542i, Boolean.valueOf(!m153137g)));
        }
    }

    /* renamed from: q0 */
    public final void m128156q0(int i11, String str, AbstractC22055v0.l lVar) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(lVar, "mStoryPopulateListener");
        lVar.mo47172c(AbstractC22055v0.m115161u(str), null, 340);
        this.f118458A.mo9224q(Integer.valueOf(i11));
    }

    /* renamed from: r0 */
    public void m128157r0(C24622a c24622a) {
        super.m103748N(c24622a);
        if (c24622a != null) {
            try {
                this.f118472v.mo9224q(Integer.valueOf(c24622a.m128127d()));
                this.f118473w.mo9224q(Integer.valueOf(c24622a.m128124a()));
                this.f118463F = c24622a.m128126c();
                m128161v0();
                int m128125b = c24622a.m128125b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", m128125b);
                C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_click_list_viewer", jSONObject.toString()), false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: s0 */
    public final void m128158s0(C31844ab c31844ab, int i11) {
        boolean z11;
        if (c31844ab == null) {
            return;
        }
        int m122265p = AbstractC23309i.m122265p();
        if (m122265p != 1) {
            if (m122265p == 2) {
                this.f118476z.mo9224q(c31844ab.f146162a);
            }
        } else {
            this.f118469L = true;
            this.f118475y.mo9224q(c31844ab.f146162a);
        }
        try {
            AbstractC23647d.m123897g("49153053");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i", i11 + 1);
            List list = c31844ab.f146166e;
            if (list != null && !list.isEmpty()) {
                z11 = true;
                jSONObject.put("reaction", z11);
                C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_click_profile", jSONObject.toString()), false);
            }
            z11 = false;
            jSONObject.put("reaction", z11);
            C0815e1.m2075D().m2100V(new C23648e(47, "social_story", 0, "story_reaction_click_profile", jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t0 */
    public final void m128159t0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            Iterator it = this.f118466I.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((C31844ab) it.next()).f146162a, str)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                this.f118458A.mo9224q(Integer.valueOf(i11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: u0 */
    public final void m128160u0() {
        int i11;
        try {
            int size = this.f118466I.size();
            List list = this.f118466I;
            if ((list instanceof Collection) && list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    List list2 = ((C31844ab) it.next()).f146166e;
                    if (list2 == null || list2.isEmpty()) {
                        i11++;
                        if (i11 < 0) {
                            AbstractC25368s.m131508p();
                        }
                    }
                }
            }
            int i12 = size - i11;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tv", size);
            jSONObject.put("tur", i12);
            jSONObject.put("i", this.f118468K + 1);
            C0815e1.m2075D().m2100V(new C23648e(47, "", 1, "story_reaction_scroll_list_viewer", jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: v0 */
    public final void m128161v0() {
        if (!this.f118464G && this.f118462E) {
            this.f118464G = true;
            m128142k0(this.f118463F, this.f118460C, this.f118461D);
        }
    }

    /* renamed from: w0 */
    public final void m128162w0(int i11) {
        this.f118468K = i11;
    }
}
