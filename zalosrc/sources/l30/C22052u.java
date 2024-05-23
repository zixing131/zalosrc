package l30;

import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import ho0.AbstractC20110a;
import is.AbstractC20828w0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.Job;
import l30.C22052u;
import me0.AbstractC23041d2;
import me0.AbstractC23204s0;
import mm0.AbstractC23350e;
import nh0.C23793c;
import p173fz.C19172a;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import p458qr.C25482o;
import p509sp.C26359h;
import p645xh.C29630g;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.C24848g0;
import tn.C26750h;
import tn.C26761p;
import vg.C28023b6;

/* renamed from: l30.u */
/* loaded from: classes5.dex */
public class C22052u {

    /* renamed from: d */
    public static int f108593d = 1800000;

    /* renamed from: e */
    public static boolean f108594e = false;

    /* renamed from: f */
    public static int f108595f;

    /* renamed from: g */
    static final Map f108596g = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: h */
    static final Map f108597h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i */
    static final Map f108598i = new ConcurrentHashMap();

    /* renamed from: j */
    static volatile C22052u f108599j;

    /* renamed from: a */
    final f f108600a = new f();

    /* renamed from: b */
    final Map f108601b = new LinkedHashMap();

    /* renamed from: c */
    final Object f108602c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.u$a */
    /* loaded from: classes5.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C32123ta f108603a;

        a(C32123ta c32123ta) {
            this.f108603a = c32123ta;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42069B3(CoreUtility.f89233i, this.f108603a.f148138h);
        }
    }

    /* renamed from: l30.u$b */
    /* loaded from: classes5.dex */
    public class b implements InterfaceC7761b.c {

        /* renamed from: a */
        final /* synthetic */ long f108605a;

        /* renamed from: b */
        final /* synthetic */ C32123ta f108606b;

        b(long j11, C32123ta c32123ta) {
            this.f108605a = j11;
            this.f108606b = c32123ta;
        }

        /* renamed from: g */
        public static /* synthetic */ String m115108g(C32123ta c32123ta) {
            return "Compress error : " + c32123ta.f148138h;
        }

        /* renamed from: h */
        public static /* synthetic */ String m115109h(C32123ta c32123ta, String str) {
            return "Compress finish : " + c32123ta.f148138h + ", with outputPath: " + str;
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
            Map map = C22052u.f108597h;
            synchronized (map) {
                try {
                    C26750h c26750h = (C26750h) map.get(Long.valueOf(this.f108605a));
                    if (c26750h != null) {
                        c26750h.m137693d(C23793c.m124316k().mo124314i());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_VIDEO", new InterfaceC18494a() { // from class: l30.w
                public /* synthetic */ C22056w() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m115108g;
                    m115108g = C22052u.b.m115108g(C32123ta.this);
                    return m115108g;
                }
            });
            long currentTimeMillis = System.currentTimeMillis();
            this.f108606b.f148128c = 2;
            if (interfaceC7761b != null) {
                AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryAsyncManager] onError: %d, errorCode=%s, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), interfaceC7761b.mo39541e(), Long.valueOf(System.currentTimeMillis()));
                C0815e1.m2075D().m2111i(interfaceC7761b);
                Map map = C22052u.f108597h;
                synchronized (map) {
                    try {
                        C26750h c26750h = (C26750h) map.remove(Long.valueOf(interfaceC7761b.mo39539c()));
                        if (c26750h != null && c26750h.m137690a() != null) {
                            c26750h.m137690a().mo112734a(null);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C25482o.f122075a.m132011s(currentTimeMillis, Integer.valueOf(interfaceC7761b.mo39541e().m126581c()));
            } else {
                C25482o.f122075a.m132011s(currentTimeMillis, null);
            }
            C22052u c22052u = C22052u.this;
            c22052u.m115103w(new C22059z(this.f108606b, c22052u.f108600a));
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryAsyncManager] onStartProcessing: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
            boolean containsKey;
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryAsyncManager] onFinished: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_VIDEO", new InterfaceC18494a() { // from class: l30.v

                /* renamed from: q */
                public final /* synthetic */ String f108615q;

                public /* synthetic */ C22054v(String str2) {
                    r2 = str2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m115109h;
                    m115109h = C22052u.b.m115109h(C32123ta.this, r2);
                    return m115109h;
                }
            });
            Map map = C22052u.f108597h;
            synchronized (map) {
                try {
                    containsKey = map.containsKey(Long.valueOf(interfaceC7761b.mo39539c()));
                    C26750h c26750h = (C26750h) map.remove(Long.valueOf(interfaceC7761b.mo39539c()));
                    if (c26750h != null && c26750h.m137690a() != null) {
                        c26750h.m137690a().mo112734a(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (containsKey) {
                C32123ta c32123ta = this.f108606b;
                VideoBlendingParam videoBlendingParam = c32123ta.f148156v;
                videoBlendingParam.f48278r = str2;
                videoBlendingParam.f48277q = str2;
                videoBlendingParam.f48259K = false;
                videoBlendingParam.f48260L = false;
                c32123ta.f148147m = str2;
                AbstractC22055v0.m115140b0(c32123ta);
                C22052u.this.m115097q(this.f108606b);
                C23744a.m124114c().m124116d(28, 4, this.f108606b.f148138h);
                C0815e1.m2075D().m2111i(interfaceC7761b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l30.u$c */
    /* loaded from: classes5.dex */
    public class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42589y3();
            C7960e.m41971c6().m42125G(C22021e0.f108429m);
        }
    }

    /* renamed from: l30.u$d */
    /* loaded from: classes5.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f108609a;

        d(String str) {
            this.f108609a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42069B3(CoreUtility.f89233i, this.f108609a);
            AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[StoryAsyncManager] removed async story, storyId=%s", this.f108609a);
        }
    }

    /* renamed from: l30.u$e */
    /* loaded from: classes5.dex */
    public interface e {
        /* renamed from: a */
        void mo115110a(C22059z c22059z);
    }

    /* renamed from: l30.u$f */
    /* loaded from: classes5.dex */
    public final class f implements e {
        /* synthetic */ f(C22052u c22052u, AbstractC22057x abstractC22057x) {
            this();
        }

        @Override // l30.C22052u.e
        /* renamed from: a */
        public void mo115110a(C22059z c22059z) {
            C22052u.this.m115103w(c22059z);
            C22052u.this.m115095Z();
        }

        private f() {
        }
    }

    private C22052u() {
    }

    /* renamed from: D */
    public static /* synthetic */ String m115054D(C32123ta c32123ta) {
        return "Add async story:" + c32123ta.f148138h;
    }

    /* renamed from: E */
    public static /* synthetic */ String m115055E(Exception exc) {
        return "Add async story failed:" + exc.getMessage();
    }

    /* renamed from: F */
    public static /* synthetic */ String m115056F(C22059z c22059z) {
        return "Add task: " + c22059z.m115176d();
    }

    /* renamed from: G */
    public static /* synthetic */ String m115057G(C31980jc c31980jc) {
        return "Combine async story to user story  " + c31980jc.f147023p;
    }

    /* renamed from: H */
    public static /* synthetic */ String m115058H() {
        return "Combine async story to global list";
    }

    /* renamed from: I */
    public static /* synthetic */ String m115059I(Exception exc) {
        return "Combine async story to user story failed: " + exc.getMessage();
    }

    /* renamed from: J */
    public static /* synthetic */ String m115060J(C22059z c22059z, int i11) {
        return "Finalize task: " + c22059z.m115176d() + " state: " + i11;
    }

    /* renamed from: K */
    public static /* synthetic */ String m115061K(C32123ta c32123ta) {
        return "pushAsyncStoryTask: id=" + c32123ta.f148138h;
    }

    /* renamed from: L */
    public static /* synthetic */ String m115062L(C32123ta c32123ta) {
        return "pushAsyncTask no compress: " + c32123ta.f148138h;
    }

    /* renamed from: M */
    public static /* synthetic */ String m115063M(C32123ta c32123ta) {
        return "pushAsyncTask file deleted: " + c32123ta.f148138h;
    }

    /* renamed from: N */
    public static /* synthetic */ String m115064N(C32123ta c32123ta) {
        return "pushAsyncTask compress: " + c32123ta.f148138h;
    }

    /* renamed from: O */
    public static /* synthetic */ Boolean m115065O(InterfaceC7761b interfaceC7761b) {
        boolean z11;
        Map map = f108597h;
        synchronized (map) {
            try {
                C26750h c26750h = (C26750h) map.get(Long.valueOf(interfaceC7761b.mo39539c()));
                if (c26750h != null) {
                    if (C23793c.m124316k().mo124314i() - c26750h.m137691b() > C26761p.m137741q().f126946d) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
                return Boolean.FALSE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: P */
    public /* synthetic */ C24848g0 m115066P(long j11, C32123ta c32123ta, InterfaceC7761b interfaceC7761b) {
        try {
            Map map = f108597h;
            synchronized (map) {
                try {
                    if (map.containsKey(Long.valueOf(j11))) {
                        C25482o.f122075a.m132011s(C23793c.m124316k().mo124314i(), Integer.valueOf(C32123ta.f148097m0));
                        c32123ta.f148128c = 2;
                        m115103w(new C22059z(c32123ta, this.f108600a));
                        map.remove(Long.valueOf(j11));
                        C7760a.f41634a.mo39563a(j11);
                        AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[StoryAsyncManager] manual time out task, id=%s, curTime=%s", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(C23793c.m124316k().mo124314i()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ int m115067Q(C32123ta c32123ta, C32123ta c32123ta2) {
        return -Long.compare(c32123ta.f148150p, c32123ta2.f148150p);
    }

    /* renamed from: R */
    public static /* synthetic */ String m115068R(C22059z c22059z) {
        return "Start task: " + c22059z.m115176d();
    }

    /* renamed from: X */
    private void m115069X(C26750h c26750h) {
        if (c26750h != null) {
            C7760a.f41634a.mo39563a(c26750h.m137692c().mo39539c());
            Job m137690a = c26750h.m137690a();
            if (m137690a != null) {
                m137690a.mo112734a(null);
            }
        }
    }

    /* renamed from: y */
    public static synchronized C22052u m115085y() {
        C22052u c22052u;
        synchronized (C22052u.class) {
            try {
                if (f108599j == null) {
                    f108599j = new C22052u();
                }
                c22052u = f108599j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22052u;
    }

    /* renamed from: A */
    public boolean m115086A() {
        for (C32123ta c32123ta : this.f108601b.values()) {
            if (c32123ta != null && c32123ta.f148128c == 4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public boolean m115087B() {
        for (C32123ta c32123ta : this.f108601b.values()) {
            if (c32123ta != null && c32123ta.f148128c == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public boolean m115088C() {
        if (this.f108601b.size() >= m115090T()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m115089S() {
        try {
            m115099s();
            ArrayList<C32123ta> m42105E5 = C7960e.m41971c6().m42105E5(CoreUtility.f89233i);
            if (m42105E5.size() > 0) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                boolean z12 = false;
                for (C32123ta c32123ta : m42105E5) {
                    if (c32123ta != null) {
                        if (c32123ta.f148128c == 3) {
                            C0824j.m2153b(new a(c32123ta));
                        } else {
                            m115096p(c32123ta);
                            int i11 = c32123ta.f148128c;
                            if (i11 == 1 || i11 == 4) {
                                arrayList.add(c32123ta);
                                int i12 = c32123ta.f148140i;
                                if (i12 == 1) {
                                    z11 = true;
                                } else if (i12 == 2) {
                                    z12 = true;
                                }
                            }
                        }
                    }
                }
                if (z11 || z12) {
                    C29630g.m147299E0().m147319V0();
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    m115091U((C32123ta) arrayList.get(i13));
                }
                C23744a.m124114c().m124116d(3007, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: T */
    public int m115090T() {
        int m100600k = C19172a.m100600k("social@post_story@limit_upload_story", 30);
        if (m100600k < 0) {
            m100600k = 30;
        }
        if (m100600k < 5) {
            m100600k = 30;
        }
        if (m100600k > 1000) {
            return 30;
        }
        return m100600k;
    }

    /* renamed from: U */
    public synchronized void m115091U(C32123ta c32123ta) {
        Job job;
        try {
            if (c32123ta != null) {
                try {
                    C26359h c26359h = C26359h.f125209a;
                    c26359h.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.r
                        public /* synthetic */ C22046r() {
                        }

                        @Override // en0.InterfaceC18494a
                        /* renamed from: V4 */
                        public final Object mo12V4() {
                            String m115061K;
                            m115061K = C22052u.m115061K(C32123ta.this);
                            return m115061K;
                        }
                    });
                    if (c32123ta.f148140i == 2) {
                        VideoBlendingParam videoBlendingParam = c32123ta.f148156v;
                        if (videoBlendingParam != null) {
                            if (!videoBlendingParam.f48259K && !videoBlendingParam.f48260L) {
                                String str = videoBlendingParam.f48277q;
                                videoBlendingParam.f48278r = str;
                                c32123ta.f148147m = str;
                                c26359h.mo135685a("POST_STORY", "POST_STORY_VIDEO", new InterfaceC18494a() { // from class: l30.s
                                    public /* synthetic */ C22048s() {
                                    }

                                    @Override // en0.InterfaceC18494a
                                    /* renamed from: V4 */
                                    public final Object mo12V4() {
                                        String m115062L;
                                        m115062L = C22052u.m115062L(C32123ta.this);
                                        return m115062L;
                                    }
                                });
                                AbstractC22055v0.m115140b0(c32123ta);
                                m115097q(c32123ta);
                            } else {
                                long j11 = c32123ta.f148150p;
                                if (!TextUtils.isEmpty(videoBlendingParam.f48277q) && AbstractC23041d2.m118194A(videoBlendingParam.f48277q)) {
                                    c26359h.mo135685a("POST_STORY", "POST_STORY_VIDEO", new InterfaceC18494a() { // from class: l30.f
                                        public /* synthetic */ C22022f() {
                                        }

                                        @Override // en0.InterfaceC18494a
                                        /* renamed from: V4 */
                                        public final Object mo12V4() {
                                            String m115064N;
                                            m115064N = C22052u.m115064N(C32123ta.this);
                                            return m115064N;
                                        }
                                    });
                                    b bVar = new b(j11, c32123ta);
                                    Map map = f108597h;
                                    synchronized (map) {
                                        try {
                                            if (map.containsKey(Long.valueOf(j11))) {
                                                m115069X((C26750h) map.remove(Long.valueOf(j11)));
                                            }
                                        } finally {
                                        }
                                    }
                                    C7760a c7760a = C7760a.f41634a;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(AbstractC23204s0.m119557h().getPath());
                                    String str2 = File.separator;
                                    sb2.append(str2);
                                    sb2.append(c32123ta.f148138h);
                                    sb2.append(str2);
                                    InterfaceC7761b mo39564b = c7760a.mo39564b(j11, sb2.toString(), c32123ta.f148156v, bVar, 1, null);
                                    if (mo39564b != null) {
                                        if (C26761p.m137741q().f126946d >= 0) {
                                            job = AbstractC20828w0.Companion.m108854c(new InterfaceC18494a() { // from class: l30.g
                                                public /* synthetic */ C22024g() {
                                                }

                                                @Override // en0.InterfaceC18494a
                                                /* renamed from: V4 */
                                                public final Object mo12V4() {
                                                    Boolean m115065O;
                                                    m115065O = C22052u.m115065O(InterfaceC7761b.this);
                                                    return m115065O;
                                                }
                                            }, new InterfaceC18494a() { // from class: l30.h

                                                /* renamed from: q */
                                                public final /* synthetic */ long f108483q;

                                                /* renamed from: r */
                                                public final /* synthetic */ C32123ta f108484r;

                                                /* renamed from: s */
                                                public final /* synthetic */ InterfaceC7761b f108485s;

                                                public /* synthetic */ C22026h(long j112, C32123ta c32123ta2, InterfaceC7761b mo39564b2) {
                                                    r2 = j112;
                                                    r4 = c32123ta2;
                                                    r5 = mo39564b2;
                                                }

                                                @Override // en0.InterfaceC18494a
                                                /* renamed from: V4 */
                                                public final Object mo12V4() {
                                                    C24848g0 m115066P;
                                                    m115066P = C22052u.this.m115066P(r2, r4, r5);
                                                    return m115066P;
                                                }
                                            });
                                        } else {
                                            job = null;
                                        }
                                        synchronized (map) {
                                            map.put(Long.valueOf(mo39564b2.mo39539c()), new C26750h(mo39564b2, C23793c.m124316k().mo124314i(), job));
                                        }
                                    }
                                }
                                c26359h.mo135685a("POST_STORY", "POST_STORY_VIDEO", new InterfaceC18494a() { // from class: l30.t
                                    public /* synthetic */ C22050t() {
                                    }

                                    @Override // en0.InterfaceC18494a
                                    /* renamed from: V4 */
                                    public final Object mo12V4() {
                                        String m115063M;
                                        m115063M = C22052u.m115063M(C32123ta.this);
                                        return m115063M;
                                    }
                                });
                                c32123ta2.f148128c = 5;
                                m115103w(new C22059z(c32123ta2, this.f108600a));
                            }
                        } else {
                            throw new IllegalArgumentException("VideoBlendingParam should not be null here");
                        }
                    } else {
                        m115097q(c32123ta2);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: V */
    public void m115092V(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f108602c) {
                    this.f108601b.remove(str);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: W */
    public void m115093W() {
        int m115090T = m115090T();
        ArrayList arrayList = new ArrayList(this.f108601b.values());
        if (arrayList.size() >= m115090T) {
            Collections.sort(arrayList, new Comparator() { // from class: l30.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m115067Q;
                    m115067Q = C22052u.m115067Q((C32123ta) obj, (C32123ta) obj2);
                    return m115067Q;
                }
            });
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i11 >= m115090T - 1) {
                m115102v(((C32123ta) arrayList.get(i11)).f148138h);
            }
        }
    }

    /* renamed from: Y */
    public void m115094Y(String str) {
        try {
            AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[StoryAsyncManager] retry async story, storyId=%s", str);
            if (!TextUtils.isEmpty(str) && !f108596g.containsKey(str)) {
                C28023b6.m141250h0().m141308Q(str);
                C32123ta m115104x = m115104x(str);
                if (m115104x != null) {
                    m115104x.m155079f0();
                    m115091U(m115104x);
                    C23744a.m124114c().m124116d(28, 0, str);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    synchronized void m115095Z() {
        Map map;
        try {
            map = f108596g;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (!map.isEmpty()) {
            Map map2 = f108598i;
            if (map2.size() <= 0) {
                C22059z c22059z = (C22059z) map.values().iterator().next();
                map2.put(c22059z.m115176d(), c22059z.m115176d());
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.k
                    public /* synthetic */ C22032k() {
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m115068R;
                        m115068R = C22052u.m115068R(C22059z.this);
                        return m115068R;
                    }
                });
                c22059z.m115179g();
            }
        }
    }

    /* renamed from: p */
    public void m115096p(C32123ta c32123ta) {
        if (c32123ta != null && c32123ta.f148138h != null) {
            try {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.m
                    public /* synthetic */ C22036m() {
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m115054D;
                        m115054D = C22052u.m115054D(C32123ta.this);
                        return m115054D;
                    }
                });
                synchronized (this.f108602c) {
                    try {
                        if (!this.f108601b.containsKey(c32123ta.f148138h)) {
                            this.f108601b.put(c32123ta.f148138h, c32123ta);
                        } else {
                            throw new IllegalArgumentException("Story already existed: " + c32123ta.f148138h);
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.n

                    /* renamed from: p */
                    public final /* synthetic */ Exception f108568p;

                    public /* synthetic */ C22038n(Exception e112) {
                        r1 = e112;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m115055E;
                        m115055E = C22052u.m115055E(r1);
                        return m115055E;
                    }
                });
                AbstractC20110a.m104539h(e112);
            }
        }
    }

    /* renamed from: q */
    public synchronized void m115097q(C32123ta c32123ta) {
        try {
            C22059z c22059z = new C22059z(c32123ta, this.f108600a);
            Map map = f108596g;
            if (!map.containsKey(c22059z.m115176d())) {
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.i
                    public /* synthetic */ C22028i() {
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m115056F;
                        m115056F = C22052u.m115056F(C22059z.this);
                        return m115056F;
                    }
                });
                map.put(c22059z.m115176d(), c22059z);
            }
            m115095Z();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: r */
    public synchronized void m115098r() {
        C22059z c22059z;
        try {
            try {
                Map map = f108598i;
                if (map.size() > 0) {
                    for (String str : map.values()) {
                        if (!TextUtils.isEmpty(str) && (c22059z = (C22059z) f108596g.get(str)) != null) {
                            c22059z.m115174b();
                        }
                    }
                }
                f108596g.clear();
                Map map2 = f108597h;
                synchronized (map2) {
                    try {
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            m115069X((C26750h) it.next());
                        }
                        f108597h.clear();
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: s */
    public void m115099s() {
        try {
            this.f108601b.clear();
            f108595f = 0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t */
    public void m115100t(C31980jc c31980jc) {
        int i11;
        if (c31980jc == null) {
            return;
        }
        C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.e
            public /* synthetic */ C22020e() {
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                String m115057G;
                m115057G = C22052u.m115057G(C31980jc.this);
                return m115057G;
            }
        });
        ArrayList<C32123ta> arrayList = new ArrayList();
        synchronized (this.f108602c) {
            try {
                for (C32123ta c32123ta : this.f108601b.values()) {
                    if (c32123ta != null && (i11 = c32123ta.f148128c) != 3 && i11 != 5) {
                        arrayList.add(c32123ta);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        StringBuilder sb2 = new StringBuilder("Story item ready:  ");
        for (C32123ta c32123ta2 : arrayList) {
            sb2.append("\n");
            sb2.append(c32123ta2.f148138h);
        }
        C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new C22034l(sb2));
        f108595f = 0;
        if (arrayList.size() > 0) {
            if (c31980jc.f147031x.size() > 0) {
                Iterator it = c31980jc.f147031x.iterator();
                while (it.hasNext()) {
                    C32123ta c32123ta3 = (C32123ta) it.next();
                    if (c32123ta3.f148126b == 2) {
                        it.remove();
                        c31980jc.f147018C.remove(c32123ta3.f148138h);
                    }
                }
            }
            int i12 = -1;
            for (C32123ta c32123ta4 : arrayList) {
                if (!c31980jc.f147018C.containsKey(c32123ta4.f148138h)) {
                    c31980jc.f147031x.add(c32123ta4);
                    if (i12 == -1 && c32123ta4.f148128c == 2) {
                        i12 = c31980jc.f147031x.indexOf(c32123ta4);
                    }
                    c31980jc.f147018C.put(c32123ta4.f148138h, c32123ta4);
                    f108595f++;
                }
            }
            C22021e0.m114958P(c31980jc);
            if (i12 != -1) {
                c31980jc.f147017B = i12;
            }
        }
    }

    /* renamed from: u */
    public void m115101u() {
        int i11;
        try {
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.p
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m115058H;
                    m115058H = C22052u.m115058H();
                    return m115058H;
                }
            });
            ArrayList<C32123ta> arrayList = new ArrayList();
            synchronized (this.f108602c) {
                try {
                    for (C32123ta c32123ta : this.f108601b.values()) {
                        if (c32123ta != null && (i11 = c32123ta.f148128c) != 3 && i11 != 5) {
                            arrayList.add(c32123ta);
                        }
                    }
                } finally {
                }
            }
            StringBuilder sb2 = new StringBuilder("Story item ready:  ");
            for (C32123ta c32123ta2 : arrayList) {
                sb2.append("\n");
                sb2.append(c32123ta2.f148138h);
            }
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new C22034l(sb2));
            if (arrayList.size() > 0) {
                C31980jc c31980jc = null;
                if (C22021e0.f108428l.containsKey(CoreUtility.f89233i)) {
                    synchronized (C22021e0.f108429m) {
                        int i12 = 0;
                        while (true) {
                            try {
                                List list = C22021e0.f108429m;
                                if (i12 >= list.size()) {
                                    break;
                                }
                                if (((C31980jc) list.get(i12)).f147023p.equals(CoreUtility.f89233i)) {
                                    c31980jc = (C31980jc) list.get(i12);
                                    break;
                                }
                                i12++;
                            } finally {
                            }
                        }
                    }
                }
                if (c31980jc == null) {
                    c31980jc = C7960e.m41971c6().m42432j7(CoreUtility.f89233i);
                }
                if (c31980jc == null) {
                    String str = CoreUtility.f89233i;
                    ContactProfile contactProfile = AbstractC23304d.f113368c0;
                    C22021e0.m114963p().m114982e(new C31980jc(str, contactProfile.f42437s, contactProfile.f42446v, "", false, false), true);
                    C0824j.m2153b(new c());
                } else {
                    c31980jc.f147026s = false;
                    C22021e0.f108429m.remove(c31980jc);
                    C22021e0.f108428l.remove(c31980jc.f147023p);
                    C22021e0.m114963p().m114982e(c31980jc, true);
                }
            }
            f108595f = arrayList.size();
        } catch (Exception e11) {
            C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.q

                /* renamed from: p */
                public final /* synthetic */ Exception f108579p;

                public /* synthetic */ C22044q(Exception e112) {
                    r1 = e112;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m115059I;
                    m115059I = C22052u.m115059I(r1);
                    return m115059I;
                }
            });
            AbstractC23350e.m122778h(e112);
        }
    }

    /* renamed from: v */
    public synchronized void m115102v(String str) {
        C22059z c22059z;
        try {
            try {
                Map map = f108596g;
                if (map.containsKey(str) && (c22059z = (C22059z) map.get(str)) != null) {
                    c22059z.m115177e().f148128c = 5;
                }
                m115092V(str);
                C0824j.m2153b(new d(str));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: w */
    synchronized void m115103w(C22059z c22059z) {
        try {
            try {
                int i11 = c22059z.m115177e().f148128c;
                String str = c22059z.m115177e().f148138h;
                C26359h.f125209a.mo135685a("POST_STORY", "POST_STORY_COMMON", new InterfaceC18494a() { // from class: l30.j

                    /* renamed from: q */
                    public final /* synthetic */ int f108493q;

                    public /* synthetic */ C22030j(int i112) {
                        r2 = i112;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m115060J;
                        m115060J = C22052u.m115060J(C22059z.this, r2);
                        return m115060J;
                    }
                });
                if (i112 != 2) {
                    if (i112 != 3) {
                        if (i112 == 5) {
                            C7960e.m41971c6().m42069B3(CoreUtility.f89233i, str);
                            m115092V(str);
                            C23744a.m124114c().m124116d(28, 3, str);
                        }
                    } else {
                        C7960e.m41971c6().m42069B3(CoreUtility.f89233i, str);
                        m115092V(str);
                    }
                } else {
                    AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[StoryAsyncManager] notify story async fail, storyId=%s", str);
                    C7960e.m41971c6().m42469md(str, 2);
                    C23744a.m124114c().m124116d(28, 2, str);
                }
                f108596g.remove(c22059z.m115176d());
                f108598i.remove(c22059z.m115176d());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: x */
    public C32123ta m115104x(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.f108602c) {
                    try {
                        if (this.f108601b.containsKey(str)) {
                            return (C32123ta) this.f108601b.get(str);
                        }
                        return null;
                    } finally {
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: z */
    public boolean m115105z() {
        for (C32123ta c32123ta : this.f108601b.values()) {
            if (c32123ta != null && c32123ta.f148128c == 2) {
                return true;
            }
        }
        return false;
    }
}
