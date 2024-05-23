package e10;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.player.ZVideoItem;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import z10.C31162f;
import z10.C31179n0;

/* renamed from: e10.e */
/* loaded from: classes5.dex */
public final class C18168e {

    /* renamed from: f */
    private static C18168e f91852f;

    /* renamed from: b */
    private a f91855b;
    public static final c Companion = new c(null);

    /* renamed from: g */
    private static final ReentrantLock f91853g = new ReentrantLock();

    /* renamed from: a */
    private final ArrayList f91854a = new ArrayList();

    /* renamed from: c */
    private ZMediaPlayerSettings.VideoConfig f91856c = ZMediaPlayerSettings.getVideoConfig(6);

    /* renamed from: d */
    private final Handler f91857d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final CoroutineScope f91858e = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));

    /* renamed from: e10.e$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final String f91859a;

        /* renamed from: b */
        private final ArrayList f91860b;

        /* renamed from: c */
        private EnumC32810a f91861c;

        /* renamed from: d */
        private int f91862d;

        /* renamed from: e10.e$a$a */
        /* loaded from: classes5.dex */
        public static final class EnumC32810a extends Enum {

            /* renamed from: p */
            public static final EnumC32810a f91863p = new EnumC32810a("NEW", 0);

            /* renamed from: q */
            public static final EnumC32810a f91864q = new EnumC32810a("ACTIVE", 1);

            /* renamed from: r */
            public static final EnumC32810a f91865r = new EnumC32810a("ON_HOLD", 2);

            /* renamed from: s */
            private static final /* synthetic */ EnumC32810a[] f91866s;

            /* renamed from: t */
            private static final /* synthetic */ InterfaceC30165a f91867t;

            static {
                EnumC32810a[] m96531b = m96531b();
                f91866s = m96531b;
                f91867t = AbstractC30166b.m148796a(m96531b);
            }

            private EnumC32810a(String str, int i11) {
                super(str, i11);
            }

            /* renamed from: b */
            private static final /* synthetic */ EnumC32810a[] m96531b() {
                return new EnumC32810a[]{f91863p, f91864q, f91865r};
            }

            public static EnumC32810a valueOf(String str) {
                return (EnumC32810a) Enum.valueOf(EnumC32810a.class, str);
            }

            public static EnumC32810a[] values() {
                return (EnumC32810a[]) f91866s.clone();
            }
        }

        /* renamed from: e10.e$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f91868q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f91868q = str;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(b bVar) {
                AbstractC19074t.m100208f(bVar, "video");
                return Boolean.valueOf(AbstractC19074t.m100204b(bVar.m96533a(), this.f91868q));
            }
        }

        public a() {
            String uuid = UUID.randomUUID().toString();
            AbstractC19074t.m100207e(uuid, "toString(...)");
            this.f91859a = uuid;
            this.f91860b = new ArrayList();
            this.f91861c = EnumC32810a.f91863p;
            this.f91862d = -1;
        }

        /* renamed from: a */
        public final void m96520a(int i11, List list) {
            int m131511r;
            AbstractC19074t.m100208f(list, "videos");
            ArrayList arrayList = this.f91860b;
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new b((Video) it.next()));
            }
            arrayList.addAll(i11, arrayList2);
        }

        /* renamed from: b */
        public final void m96521b(List list) {
            int m131511r;
            AbstractC19074t.m100208f(list, "videos");
            ArrayList arrayList = this.f91860b;
            List list2 = list;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new b((Video) it.next()));
            }
            arrayList.addAll(arrayList2);
        }

        /* renamed from: c */
        public final void m96522c() {
            this.f91860b.clear();
        }

        /* renamed from: d */
        public final b m96523d(int i11) {
            if (i11 >= 0 && i11 < this.f91860b.size()) {
                return (b) this.f91860b.get(i11);
            }
            return null;
        }

        /* renamed from: e */
        public final int m96524e() {
            return this.f91862d;
        }

        /* renamed from: f */
        public final String m96525f() {
            return this.f91859a;
        }

        /* renamed from: g */
        public final ArrayList m96526g() {
            return this.f91860b;
        }

        /* renamed from: h */
        public final EnumC32810a m96527h() {
            return this.f91861c;
        }

        /* renamed from: i */
        public final void m96528i(String str) {
            AbstractC19074t.m100208f(str, "videoId");
            AbstractC18169f.m96546c(this.f91860b, new b(str));
        }

        /* renamed from: j */
        public final void m96529j(int i11) {
            this.f91862d = i11;
        }

        /* renamed from: k */
        public final void m96530k(EnumC32810a enumC32810a) {
            AbstractC19074t.m100208f(enumC32810a, "<set-?>");
            this.f91861c = enumC32810a;
        }
    }

    /* renamed from: e10.e$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f91869a;

        /* renamed from: b */
        private final String f91870b;

        /* renamed from: c */
        private final String f91871c;

        /* renamed from: d */
        private final String f91872d;

        /* renamed from: e */
        private boolean f91873e;

        /* renamed from: f */
        private final int f91874f;

        public b(String str, String str2, String str3, String str4, boolean z11, int i11) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "subId");
            this.f91869a = str;
            this.f91870b = str2;
            this.f91871c = str3;
            this.f91872d = str4;
            this.f91873e = z11;
            this.f91874f = i11;
        }

        /* renamed from: a */
        public final String m96533a() {
            return this.f91869a;
        }

        /* renamed from: b */
        public final boolean m96534b() {
            return this.f91873e;
        }

        /* renamed from: c */
        public final void m96535c(boolean z11) {
            this.f91873e = z11;
        }

        /* renamed from: d */
        public final ZVideoItem m96536d(int i11) {
            return new ZVideoItem(this.f91871c, this.f91872d, this.f91869a, i11, 6, this.f91874f);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Video video) {
            this(r2, r3, r4, r5, false, r7);
            int m96545b;
            AbstractC19074t.m100208f(video, "video");
            String m52871V = video.m52871V();
            String m52911t = video.m52911t();
            String m52908q = video.m52908q();
            String m52906p = video.m52906p();
            m96545b = AbstractC18169f.m96545b(video);
        }
    }

    /* renamed from: e10.e$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m96537a() {
            a aVar = m96538b().f91855b;
            if (aVar != null) {
                return aVar.m96525f();
            }
            return null;
        }

        /* renamed from: b */
        public final C18168e m96538b() {
            ReentrantLock reentrantLock = C18168e.f91853g;
            reentrantLock.lock();
            try {
                if (C18168e.f91852f == null) {
                    C18168e.f91852f = new C18168e();
                }
                C18168e c18168e = C18168e.f91852f;
                AbstractC19074t.m100205c(c18168e);
                reentrantLock.unlock();
                return c18168e;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* renamed from: e10.e$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ b f91876r;

        /* renamed from: s */
        final /* synthetic */ int f91877s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, int i11) {
            super(0);
            this.f91876r = bVar;
            this.f91877s = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m96539a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m96539a() {
            ZMediaPlayer.precacheVideoItem(C18168e.this.f91856c, this.f91876r.m96536d(this.f91877s));
        }
    }

    /* renamed from: e10.e$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ b f91879r;

        /* renamed from: s */
        final /* synthetic */ int f91880s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, int i11) {
            super(0);
            this.f91879r = bVar;
            this.f91880s = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m96540a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m96540a() {
            ZMediaPlayer.releaseVideoAtIndex(C18168e.this.f91856c, this.f91879r.m96536d(this.f91880s));
        }
    }

    /* renamed from: e10.e$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ b f91882r;

        /* renamed from: s */
        final /* synthetic */ int f91883s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b bVar, int i11) {
            super(0);
            this.f91882r = bVar;
            this.f91883s = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m96541a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m96541a() {
            ZMediaPlayer.setPlayingVideo(C18168e.this.f91856c, this.f91882r.m96536d(this.f91883s));
        }
    }

    /* renamed from: e10.e$g */
    /* loaded from: classes5.dex */
    public static final class g extends RecyclerView.AbstractC1882i {

        /* renamed from: b */
        final /* synthetic */ a f91885b;

        /* renamed from: c */
        final /* synthetic */ C31179n0 f91886c;

        g(a aVar, C31179n0 c31179n0) {
            this.f91885b = aVar;
            this.f91886c = c31179n0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            if (C18168e.this.m96506s(this.f91885b.m96525f())) {
                a aVar = C18168e.this.f91855b;
                if (aVar != null) {
                    aVar.m96529j(-1);
                }
                C18168e.this.m96508u();
            }
            this.f91885b.m96522c();
            C18168e.this.m96514l(this.f91885b.m96525f(), 0, this.f91886c.m151862c0().m51168m());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: d */
        public void mo10029d(int i11, int i12) {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < i12; i13++) {
                Object obj = this.f91886c.f143912B.get(i11 + i13);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                if (video != null) {
                    arrayList.add(video);
                }
            }
            int m96502n = C18168e.this.m96502n(this.f91885b.m96525f(), this.f91886c, i11);
            if (m96502n == -1) {
                C18168e.this.m96515m(this.f91885b.m96525f(), arrayList);
            } else {
                C18168e.this.m96514l(this.f91885b.m96525f(), m96502n, arrayList);
            }
            if (C18168e.this.m96506s(this.f91885b.m96525f())) {
                C18168e.this.m96489D();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.e$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f91887q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.f91887q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(a aVar) {
            AbstractC19074t.m100208f(aVar, "playlist");
            return Boolean.valueOf(AbstractC19074t.m100204b(aVar.m96525f(), this.f91887q));
        }
    }

    /* renamed from: e10.e$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f91888t;

        /* renamed from: u */
        private /* synthetic */ Object f91889u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18494a f91890v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f91890v = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            i iVar = new i(this.f91890v, continuation);
            iVar.f91889u = obj;
            return iVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f91888t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScopeKt.m112641e((CoroutineScope) this.f91889u);
                this.f91890v.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: B */
    public static final void m96487B(C18168e c18168e, String str, String str2) {
        AbstractC19074t.m100208f(c18168e, "this$0");
        AbstractC19074t.m100208f(str, "$playlistId");
        AbstractC19074t.m100208f(str2, "$videoId");
        c18168e.m96505r(str, str2);
    }

    /* renamed from: C */
    private final void m96488C(int i11) {
        b m96523d;
        a aVar = this.f91855b;
        if (aVar != null && (m96523d = aVar.m96523d(i11)) != null && !m96523d.m96534b()) {
            m96507t(m96523d, i11);
            m96523d.m96535c(true);
        }
    }

    /* renamed from: D */
    public final void m96489D() {
        Integer num;
        a aVar = this.f91855b;
        if (aVar != null) {
            num = Integer.valueOf(aVar.m96524e());
        } else {
            num = null;
        }
        if (num != null && num.intValue() != -1) {
            m96488C(num.intValue() - 1);
            int intValue = num.intValue() + 1;
            int intValue2 = num.intValue() + 5;
            if (intValue > intValue2) {
                return;
            }
            while (true) {
                m96488C(intValue);
                if (intValue != intValue2) {
                    intValue++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: G */
    private final void m96490G(InterfaceC18494a interfaceC18494a) {
        BuildersKt__Builders_commonKt.m112540d(this.f91858e, null, null, new i(interfaceC18494a, null), 3, null);
    }

    /* renamed from: k */
    private final void m96501k(String str) {
        if (m96506s(str)) {
            return;
        }
        a aVar = this.f91855b;
        if (aVar != null) {
            aVar.m96530k(a.EnumC32810a.f91865r);
            aVar.m96529j(-1);
            Iterator it = aVar.m96526g().iterator();
            while (it.hasNext()) {
                ((b) it.next()).m96535c(false);
            }
            m96508u();
        }
        this.f91855b = m96503o(str);
    }

    /* renamed from: n */
    public final int m96502n(String str, C31179n0 c31179n0, int i11) {
        String m52871V;
        if (i11 == 0) {
            return 0;
        }
        Object obj = c31179n0.f143912B.get(i11 - 1);
        if (!(obj instanceof Video)) {
            obj = null;
        }
        Video video = (Video) obj;
        if (video != null && (m52871V = video.m52871V()) != null) {
            return m96516q(m52871V, str) + 1;
        }
        return -1;
    }

    /* renamed from: o */
    private final a m96503o(String str) {
        Object obj;
        Iterator it = this.f91854a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((a) obj).m96525f(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (a) obj;
    }

    /* renamed from: p */
    private final int m96504p(String str) {
        ArrayList m96526g;
        a aVar = this.f91855b;
        if (aVar != null && (m96526g = aVar.m96526g()) != null) {
            int size = m96526g.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (AbstractC19074t.m100204b(((b) m96526g.get(i11)).m96533a(), str)) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: r */
    private final void m96505r(String str, String str2) {
        a aVar;
        m96501k(str);
        int m96504p = m96504p(str2);
        if (m96504p == -1 || (aVar = this.f91855b) == null || aVar.m96524e() == m96504p) {
            return;
        }
        aVar.m96529j(m96504p);
        if (aVar.m96527h() == a.EnumC32810a.f91865r) {
            b m96523d = aVar.m96523d(m96504p);
            AbstractC19074t.m100205c(m96523d);
            m96510w(m96523d, m96504p);
        }
        aVar.m96530k(a.EnumC32810a.f91864q);
        b m96523d2 = aVar.m96523d(m96504p);
        if (m96523d2 != null) {
            m96523d2.m96535c(true);
        }
        m96489D();
    }

    /* renamed from: s */
    public final boolean m96506s(String str) {
        String str2;
        a aVar = this.f91855b;
        if (aVar != null && str != null) {
            if (aVar != null) {
                str2 = aVar.m96525f();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    private final void m96507t(b bVar, int i11) {
        m96490G(new d(bVar, i11));
    }

    /* renamed from: u */
    public final void m96508u() {
        JobKt__JobKt.m112768g(this.f91858e.mo9207O(), null, 1, null);
        ZMediaPlayer.releaseUrlBySection(this.f91856c);
    }

    /* renamed from: v */
    private final void m96509v(b bVar, int i11) {
        m96490G(new e(bVar, i11));
    }

    /* renamed from: w */
    private final void m96510w(b bVar, int i11) {
        m96490G(new f(bVar, i11));
    }

    /* renamed from: A */
    public final boolean m96511A(String str, String str2) {
        a.EnumC32810a enumC32810a;
        AbstractC19074t.m100208f(str, "playlistId");
        AbstractC19074t.m100208f(str2, "videoId");
        if (!m96506s(str)) {
            a m96503o = m96503o(str);
            if (m96503o != null) {
                enumC32810a = m96503o.m96527h();
            } else {
                enumC32810a = null;
            }
            if (enumC32810a != a.EnumC32810a.f91863p) {
                this.f91857d.removeCallbacksAndMessages(null);
                this.f91857d.postDelayed(new Runnable() { // from class: e10.d

                    /* renamed from: q */
                    public final /* synthetic */ String f91850q;

                    /* renamed from: r */
                    public final /* synthetic */ String f91851r;

                    public /* synthetic */ RunnableC18167d(String str3, String str22) {
                        r2 = str3;
                        r3 = str22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C18168e.m96487B(C18168e.this, r2, r3);
                    }
                }, 300L);
                return false;
            }
        }
        m96505r(str3, str22);
        return true;
    }

    /* renamed from: E */
    public final void m96512E(String str) {
        if (str == null) {
            return;
        }
        if (m96506s(str)) {
            this.f91855b = null;
            m96508u();
        }
        AbstractC18169f.m96546c(this.f91854a, new h(str));
        if (this.f91854a.isEmpty()) {
            this.f91857d.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: F */
    public final void m96513F(String str) {
        b m96523d;
        AbstractC19074t.m100208f(str, "videoId");
        int m96504p = m96504p(str);
        if (m96504p == -1) {
            return;
        }
        a aVar = this.f91855b;
        if (aVar != null && (m96523d = aVar.m96523d(m96504p)) != null && m96523d.m96534b()) {
            m96509v(m96523d, m96504p);
        }
        a aVar2 = this.f91855b;
        if (aVar2 != null) {
            aVar2.m96528i(str);
        }
    }

    /* renamed from: l */
    public final void m96514l(String str, int i11, List list) {
        AbstractC19074t.m100208f(str, "playlistId");
        AbstractC19074t.m100208f(list, "page");
        a m96503o = m96503o(str);
        if (m96503o != null) {
            m96503o.m96520a(i11, list);
        }
    }

    /* renamed from: m */
    public final void m96515m(String str, List list) {
        AbstractC19074t.m100208f(str, "playlistId");
        AbstractC19074t.m100208f(list, "page");
        a m96503o = m96503o(str);
        if (m96503o != null) {
            m96503o.m96521b(list);
        }
    }

    /* renamed from: q */
    public final int m96516q(String str, String str2) {
        Object obj;
        ArrayList m96526g;
        AbstractC19074t.m100208f(str, "videoId");
        AbstractC19074t.m100208f(str2, "playlistId");
        Iterator it = this.f91854a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((a) obj).m96525f(), str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null && (m96526g = aVar.m96526g()) != null) {
            int i11 = 0;
            for (Object obj2 : m96526g) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                if (AbstractC19074t.m100204b(((b) obj2).m96533a(), str)) {
                    return i11;
                }
                i11 = i12;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: x */
    public final String m96517x(C31162f c31162f) {
        int m131511r;
        AbstractC19074t.m100208f(c31162f, "adapter");
        a aVar = new a();
        this.f91854a.add(aVar);
        try {
            String m96525f = aVar.m96525f();
            ArrayList m151557M = c31162f.m151557M();
            m131511r = AbstractC25370t.m131511r(m151557M, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = m151557M.iterator();
            while (it.hasNext()) {
                Section m50732J = ((Channel) it.next()).m50732J();
                AbstractC19074t.m100205c(m50732J);
                arrayList.add((Video) m50732J.m51168m().get(0));
            }
            m96515m(m96525f, arrayList);
        } catch (Exception unused) {
        }
        return aVar.m96525f();
    }

    /* renamed from: y */
    public final String m96518y(C31179n0 c31179n0) {
        AbstractC19074t.m100208f(c31179n0, "adapter");
        a aVar = new a();
        this.f91854a.add(aVar);
        c31179n0.m9998I(new g(aVar, c31179n0));
        return aVar.m96525f();
    }

    /* renamed from: z */
    public final String m96519z(Video video) {
        List m131496e;
        AbstractC19074t.m100208f(video, "video");
        a aVar = new a();
        this.f91854a.add(aVar);
        String m96525f = aVar.m96525f();
        m131496e = AbstractC25366r.m131496e(video);
        m96515m(m96525f, m131496e);
        return aVar.m96525f();
    }
}
