package q20;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.AbstractC2144f;
import com.zing.zalo.shortvideo.data.model.ReplaceEntry;
import com.zing.zalo.shortvideo.data.model.ReplaceResult;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;
import y00.InterfaceC30248b;
import z10.C31179n0;

/* renamed from: q20.p */
/* loaded from: classes5.dex */
public final class C25093p {
    public static final a Companion = new a(null);

    /* renamed from: m */
    private static final ArrayList f120509m = new ArrayList();

    /* renamed from: a */
    private final CoroutineScope f120510a;

    /* renamed from: b */
    private String f120511b;

    /* renamed from: c */
    private final InterfaceC18170g f120512c;

    /* renamed from: d */
    private final InterfaceC30248b f120513d;

    /* renamed from: e */
    private final ArrayList f120514e;

    /* renamed from: f */
    private final ArrayList f120515f;

    /* renamed from: g */
    private int f120516g;

    /* renamed from: h */
    private int f120517h;

    /* renamed from: i */
    private int f120518i;

    /* renamed from: j */
    private InterfaceC18509p f120519j;

    /* renamed from: k */
    private ArrayList f120520k;

    /* renamed from: l */
    private C31179n0 f120521l;

    /* renamed from: q20.p$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final List m130105a(String str) {
            List m131502j;
            boolean m127128x;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C25093p c25093p : C25093p.f120509m) {
                        if (AbstractC19074t.m100204b(str, c25093p.m130103w())) {
                            return c25093p.m130102v();
                        }
                    }
                }
            }
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }

        /* renamed from: b */
        public final List m130106b(String str) {
            List m131502j;
            boolean m127128x;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C25093p c25093p : C25093p.f120509m) {
                        if (AbstractC19074t.m100204b(str, c25093p.m130103w())) {
                            return c25093p.m130104z();
                        }
                    }
                }
            }
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }

        /* renamed from: c */
        public final void m130107c(String str, int i11) {
            boolean m127128x;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C25093p c25093p : C25093p.f120509m) {
                        if (AbstractC19074t.m100204b(str, c25093p.m130103w())) {
                            c25093p.m130070A(i11);
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        public final void m130108d(String str, int i11) {
            boolean m127128x;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C25093p c25093p : C25093p.f120509m) {
                        if (AbstractC19074t.m100204b(str, c25093p.m130103w())) {
                            c25093p.m130071B(i11);
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        public final void m130109e(String str, C25101x c25101x) {
            boolean m127128x;
            AbstractC19074t.m100208f(c25101x, "viewData");
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C25093p c25093p : C25093p.f120509m) {
                        if (AbstractC19074t.m100204b(str, c25093p.m130103w())) {
                            c25093p.m130072C(c25101x);
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final void m130110f(String... strArr) {
            AbstractC19074t.m100208f(strArr, "videoIds");
            Iterator it = C25093p.f120509m.iterator();
            while (it.hasNext()) {
                ((C25093p) it.next()).m130074F((String[]) Arrays.copyOf(strArr, strArr.length));
            }
        }

        /* renamed from: g */
        public final void m130111g() {
            Iterator it = C25093p.f120509m.iterator();
            while (it.hasNext()) {
                ((C25093p) it.next()).m130097E();
            }
            C25093p.f120509m.clear();
        }
    }

    /* renamed from: q20.p$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private int f120522a;

        /* renamed from: b */
        private Object f120523b;

        /* renamed from: c */
        private boolean f120524c;

        /* renamed from: d */
        private C25101x f120525d;

        /* renamed from: e */
        private boolean f120526e;

        public b(int i11, Object obj, boolean z11, C25101x c25101x, boolean z12) {
            this.f120522a = i11;
            this.f120523b = obj;
            this.f120524c = z11;
            this.f120525d = c25101x;
            this.f120526e = z12;
        }

        /* renamed from: a */
        public final Object m130112a() {
            return this.f120523b;
        }

        /* renamed from: b */
        public final boolean m130113b() {
            return this.f120524c;
        }

        /* renamed from: c */
        public final int m130114c() {
            return this.f120522a;
        }

        /* renamed from: d */
        public final C25101x m130115d() {
            return this.f120525d;
        }

        /* renamed from: e */
        public final boolean m130116e() {
            return this.f120526e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f120522a == bVar.f120522a && AbstractC19074t.m100204b(this.f120523b, bVar.f120523b) && this.f120524c == bVar.f120524c && AbstractC19074t.m100204b(this.f120525d, bVar.f120525d) && this.f120526e == bVar.f120526e;
        }

        /* renamed from: f */
        public final void m130117f() {
            this.f120526e = true;
        }

        /* renamed from: g */
        public final void m130118g(boolean z11) {
            this.f120524c = z11;
        }

        /* renamed from: h */
        public final void m130119h(C25101x c25101x) {
            this.f120525d = c25101x;
        }

        public int hashCode() {
            int i11 = this.f120522a * 31;
            Object obj = this.f120523b;
            int hashCode = (((i11 + (obj == null ? 0 : obj.hashCode())) * 31) + AbstractC2144f.m11520a(this.f120524c)) * 31;
            C25101x c25101x = this.f120525d;
            return ((hashCode + (c25101x != null ? c25101x.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f120526e);
        }

        public String toString() {
            return "DisplayItem(type=" + this.f120522a + ", data=" + this.f120523b + ", hasImpression=" + this.f120524c + ", viewData=" + this.f120525d + ", isResolved=" + this.f120526e + ")";
        }

        public /* synthetic */ b(int i11, Object obj, boolean z11, C25101x c25101x, boolean z12, int i12, AbstractC19060k abstractC19060k) {
            this(i11, obj, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? null : c25101x, (i12 & 16) != 0 ? false : z12);
        }
    }

    /* renamed from: q20.p$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final List f120527a;

        /* renamed from: b */
        private final int f120528b;

        /* renamed from: c */
        private final int f120529c;

        /* renamed from: d */
        private final int f120530d;

        /* renamed from: e */
        private final List f120531e;

        public c(List list, int i11, int i12, int i13, List list2) {
            AbstractC19074t.m100208f(list, "playlist");
            AbstractC19074t.m100208f(list2, "lastPage");
            this.f120527a = list;
            this.f120528b = i11;
            this.f120529c = i12;
            this.f120530d = i13;
            this.f120531e = list2;
        }

        /* renamed from: a */
        public final int m130120a() {
            return this.f120528b;
        }

        /* renamed from: b */
        public final int m130121b() {
            return this.f120529c;
        }

        /* renamed from: c */
        public final List m130122c() {
            return this.f120531e;
        }

        /* renamed from: d */
        public final int m130123d() {
            return this.f120530d;
        }

        /* renamed from: e */
        public final List m130124e() {
            return this.f120527a;
        }
    }

    /* renamed from: q20.p$d */
    /* loaded from: classes5.dex */
    public static final class d extends RecyclerView.AbstractC1882i {

        /* renamed from: a */
        final /* synthetic */ C31179n0 f120532a;

        /* renamed from: b */
        final /* synthetic */ C25093p f120533b;

        /* renamed from: q20.p$d$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f120534q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f120534q = str;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(String str) {
                AbstractC19074t.m100208f(str, "it");
                return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f120534q));
            }
        }

        /* renamed from: q20.p$d$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f120535q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f120535q = str;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(String str) {
                AbstractC19074t.m100208f(str, "it");
                return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f120535q));
            }
        }

        d(C31179n0 c31179n0, C25093p c25093p) {
            this.f120532a = c31179n0;
            this.f120533b = c25093p;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            String m52911t;
            this.f120533b.f120514e.clear();
            this.f120533b.f120520k.clear();
            int mo10003k = this.f120532a.mo10003k();
            for (int i11 = 0; i11 < mo10003k; i11++) {
                int mo10005m = this.f120532a.mo10005m(i11);
                Object obj = this.f120532a.f143912B.get(i11);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                this.f120533b.f120514e.add(i11, new b(mo10005m, video, false, null, false, 28, null));
                if (video != null && (m52911t = video.m52911t()) != null) {
                    AbstractC25378x.m131542D(this.f120533b.f120515f, new a(m52911t));
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: b */
        public void mo10027b(int i11, int i12) {
            Video video;
            String str;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i11 + i13;
                int mo10005m = this.f120532a.mo10005m(i14);
                Object obj = this.f120532a.f143912B.get(i14);
                String str2 = null;
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video2 = (Video) obj;
                if (i14 >= 0 && i14 < this.f120533b.f120514e.size()) {
                    Object obj2 = this.f120533b.f120514e.get(i14);
                    AbstractC19074t.m100207e(obj2, "get(...)");
                    b bVar = (b) obj2;
                    Object m130112a = bVar.m130112a();
                    if (m130112a instanceof Video) {
                        video = (Video) m130112a;
                    } else {
                        video = null;
                    }
                    if (mo10005m == bVar.m130114c()) {
                        if (video2 != null) {
                            str = video2.m52911t();
                        } else {
                            str = null;
                        }
                        if (video != null) {
                            str2 = video.m52911t();
                        }
                        if (AbstractC19074t.m100204b(str, str2)) {
                        }
                    }
                    this.f120533b.f120514e.set(i14, new b(mo10005m, video2, false, null, false, 28, null));
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: c */
        public void mo10028c(int i11, int i12, Object obj) {
            if (obj == null) {
                mo10027b(i11, i12);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: d */
        public void mo10029d(int i11, int i12) {
            boolean m131390w;
            String m52911t;
            int i13 = i12;
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i11 + i14;
                int mo10005m = this.f120532a.mo10005m(i15);
                Object obj = this.f120532a.f143912B.get(i15);
                if (!(obj instanceof Video)) {
                    obj = null;
                }
                Video video = (Video) obj;
                this.f120533b.f120514e.add(i15, new b(mo10005m, video, false, null, false, 28, null));
                if (video != null && (m52911t = video.m52911t()) != null) {
                    AbstractC25378x.m131542D(this.f120533b.f120515f, new b(m52911t));
                }
                if (this.f120533b.f120516g == -1 && i15 > this.f120533b.f120518i) {
                    m131390w = AbstractC25358n.m131390w(new Integer[]{0, 4}, Integer.valueOf(mo10005m));
                    if (m131390w) {
                        this.f120533b.f120516g = i11;
                    }
                }
                i14++;
                i13 = i12;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: f */
        public void mo10031f(int i11, int i12) {
            while (true) {
                i12--;
                if (-1 < i12) {
                    this.f120533b.f120514e.remove(i11 + i12);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q20.p$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C31179n0 f120537r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C31179n0 c31179n0) {
            super(2);
            this.f120537r = c31179n0;
        }

        /* renamed from: a */
        public final void m130127a(int i11, Video video) {
            AbstractC19074t.m100208f(video, "video");
            if (!((b) C25093p.this.f120514e.get(i11)).m130113b()) {
                this.f120537r.m151881z0(i11, video);
                this.f120537r.m10009q(i11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m130127a(((Number) obj).intValue(), (Video) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q20.p$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ List f120538A;

        /* renamed from: B */
        final /* synthetic */ List f120539B;

        /* renamed from: t */
        Object f120540t;

        /* renamed from: u */
        Object f120541u;

        /* renamed from: v */
        Object f120542v;

        /* renamed from: w */
        int f120543w;

        /* renamed from: x */
        int f120544x;

        /* renamed from: y */
        int f120545y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q20.p$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C25093p f120547q;

            /* renamed from: r */
            final /* synthetic */ ReplaceEntry f120548r;

            /* renamed from: s */
            final /* synthetic */ Video f120549s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C25093p c25093p, ReplaceEntry replaceEntry, Video video) {
                super(0);
                this.f120547q = c25093p;
                this.f120548r = replaceEntry;
                this.f120549s = video;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m130129a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m130129a() {
                InterfaceC18509p interfaceC18509p;
                int m130094u = this.f120547q.m130094u(this.f120548r.m51124b(), this.f120548r.m51123a());
                this.f120547q.f120515f.add(this.f120548r.m51124b());
                if (m130094u >= 0 && m130094u < this.f120547q.f120514e.size() && (interfaceC18509p = this.f120547q.f120519j) != null) {
                    interfaceC18509p.mo240pC(Integer.valueOf(m130094u), this.f120549s);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, List list2, Continuation continuation) {
            super(2, continuation);
            this.f120538A = list;
            this.f120539B = list2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f120538A, this.f120539B, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0101 A[Catch: Exception -> 0x011a, TRY_LEAVE, TryCatch #0 {Exception -> 0x011a, blocks: (B:7:0x001f, B:9:0x00f8, B:11:0x0101, B:14:0x00b0, B:24:0x0033, B:25:0x0059, B:26:0x0070, B:28:0x0076, B:30:0x0084, B:32:0x003a), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[Catch: Exception -> 0x011a, TryCatch #0 {Exception -> 0x011a, blocks: (B:7:0x001f, B:9:0x00f8, B:11:0x0101, B:14:0x00b0, B:24:0x0033, B:25:0x0059, B:26:0x0070, B:28:0x0076, B:30:0x0084, B:32:0x003a), top: B:2:0x0009 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ef -> B:9:0x00f8). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            ReplaceResult replaceResult;
            int min;
            int i11;
            f fVar;
            ArrayList m131500h;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f120545y;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = this.f120544x;
                        int i14 = this.f120543w;
                        Video video = (Video) this.f120542v;
                        ReplaceEntry replaceEntry = (ReplaceEntry) this.f120541u;
                        ReplaceResult replaceResult2 = (ReplaceResult) this.f120540t;
                        AbstractC24862s.m129228b(obj);
                        ReplaceResult replaceResult3 = replaceResult2;
                        ReplaceEntry replaceEntry2 = replaceEntry;
                        Video video2 = video;
                        int i15 = i14;
                        int i16 = i13;
                        Object obj2 = m142578e;
                        f fVar2 = this;
                        if (!(!((Collection) obj).isEmpty())) {
                            C25093p.this.f120520k.add(new a(C25093p.this, replaceEntry2, video2));
                        }
                        int i17 = i16 + 1;
                        min = i15;
                        replaceResult = replaceResult3;
                        Object obj3 = obj2;
                        i11 = i17;
                        fVar = fVar2;
                        m142578e = obj3;
                        if (i11 < min) {
                            ReplaceEntry replaceEntry3 = (ReplaceEntry) replaceResult.m51127a().get(i11);
                            Video video3 = new Video((VideoData) replaceResult.m51128b().get(i11));
                            InterfaceC30248b interfaceC30248b = C25093p.this.f120513d;
                            m131500h = AbstractC25368s.m131500h(video3.m52911t());
                            fVar.f120540t = replaceResult;
                            fVar.f120541u = replaceEntry3;
                            fVar.f120542v = video3;
                            fVar.f120543w = min;
                            fVar.f120544x = i11;
                            fVar.f120545y = 2;
                            Object mo50552e = interfaceC30248b.mo50552e(m131500h, fVar);
                            if (mo50552e == m142578e) {
                                return m142578e;
                            }
                            Object obj4 = m142578e;
                            fVar2 = fVar;
                            obj = mo50552e;
                            replaceResult3 = replaceResult;
                            replaceEntry2 = replaceEntry3;
                            video2 = video3;
                            i15 = min;
                            i16 = i11;
                            obj2 = obj4;
                            if (!(!((Collection) obj).isEmpty())) {
                            }
                            int i172 = i16 + 1;
                            min = i15;
                            replaceResult = replaceResult3;
                            Object obj32 = obj2;
                            i11 = i172;
                            fVar = fVar2;
                            m142578e = obj32;
                            if (i11 < min) {
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = C25093p.this.f120512c;
                JSONArray m130093s = C25093p.this.m130093s(this.f120538A);
                JSONArray m130092r = C25093p.this.m130092r(this.f120539B);
                this.f120545y = 1;
                obj = interfaceC18170g.mo96554D0(m130093s, m130092r, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            ReplaceResult replaceResult4 = (ReplaceResult) obj;
            C25093p c25093p = C25093p.this;
            List list = this.f120538A;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C25101x) it.next()).m130172d());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c25093p.m130074F((String[]) Arrays.copyOf(strArr, strArr.length));
            replaceResult = replaceResult4;
            min = Math.min(replaceResult4.m51128b().size(), replaceResult4.m51127a().size());
            i11 = 0;
            fVar = this;
            if (i11 < min) {
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q20.p$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C25093p c25093p) {
            AbstractC19074t.m100208f(c25093p, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c25093p.m130103w(), C25093p.this.m130103w()));
        }
    }

    public C25093p(CoroutineScope coroutineScope, c cVar) {
        AbstractC19074t.m100208f(coroutineScope, "scope");
        this.f120510a = coroutineScope;
        AbstractC28684a.h hVar = AbstractC28684a.Companion;
        this.f120512c = hVar.m143667D();
        this.f120513d = hVar.m143685s();
        ArrayList arrayList = new ArrayList();
        this.f120514e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f120515f = arrayList2;
        this.f120516g = -1;
        this.f120517h = -1;
        this.f120518i = -1;
        this.f120520k = new ArrayList();
        f120509m.add(this);
        if (cVar != null) {
            arrayList.addAll(cVar.m130124e());
            this.f120516g = cVar.m130120a();
            this.f120517h = cVar.m130121b();
            this.f120518i = cVar.m130123d();
            arrayList2.addAll(cVar.m130122c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m130070A(int i11) {
        if (i11 >= 0 && i11 < this.f120514e.size()) {
            this.f120517h = i11;
            if (i11 == this.f120516g) {
                m130073D();
            }
            if (!this.f120520k.isEmpty()) {
                Iterator it = this.f120520k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC18494a) it.next()).mo12V4();
                }
                this.f120520k.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m130071B(int i11) {
        if (i11 >= 0 && i11 < this.f120514e.size()) {
            ((b) this.f120514e.get(i11)).m130118g(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m130072C(C25101x c25101x) {
        int m130094u = m130094u(c25101x.m130172d(), c25101x.m130173e());
        if (m130094u >= 0 && m130094u < this.f120514e.size()) {
            ((b) this.f120514e.get(m130094u)).m130119h(c25101x);
            ((b) this.f120514e.get(m130094u)).m130118g(true);
        }
    }

    /* renamed from: D */
    private final void m130073D() {
        this.f120518i = this.f120516g;
        this.f120516g = -1;
        List m130095x = m130095x();
        List m130096y = m130096y();
        if (!m130095x.isEmpty() && !m130096y.isEmpty()) {
            BuildersKt__Builders_commonKt.m112540d(this.f120510a, null, null, new f(m130095x, m130096y, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m130074F(String... strArr) {
        boolean m131390w;
        if (strArr.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.f120514e.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = this.f120514e.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            b bVar = (b) obj;
            C25101x m130115d = bVar.m130115d();
            if (m130115d != null) {
                m131390w = AbstractC25358n.m131390w(strArr, m130115d.m130172d());
                if (m131390w) {
                    bVar.m130117f();
                    arrayList.add(Integer.valueOf(i11));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final JSONArray m130092r(List list) {
        Video video;
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            JSONObject jSONObject = new JSONObject();
            Object m130112a = ((b) list.get(i11)).m130112a();
            if (m130112a instanceof Video) {
                video = (Video) m130112a;
            } else {
                video = null;
            }
            if (video != null) {
                jSONObject.put("video_id", video.m52911t());
                String m52913u = video.m52913u();
                if (m52913u != null) {
                    jSONObject.put("src", m52913u);
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final JSONArray m130093s(List list) {
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("video_id", ((C25101x) list.get(i11)).m130172d());
            String m130173e = ((C25101x) list.get(i11)).m130173e();
            if (m130173e != null) {
                jSONObject.put("src", m130173e);
            }
            jSONObject.put("play_time", ((C25101x) list.get(i11)).m130176h());
            jSONObject.put("do_comment", ((C25101x) list.get(i11)).m130169a());
            jSONObject.put("do_like", ((C25101x) list.get(i11)).m130174f());
            jSONObject.put("do_share", ((C25101x) list.get(i11)).m130175g());
            jSONObject.put("do_follow_channel", ((C25101x) list.get(i11)).m130171c());
            jSONObject.put("do_uninterested", ((C25101x) list.get(i11)).m130170b());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final int m130094u(String str, String str2) {
        int size = this.f120514e.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object m130112a = ((b) this.f120514e.get(i11)).m130112a();
            if (m130112a instanceof Video) {
                Video video = (Video) m130112a;
                if (AbstractC19074t.m100204b(video.m52911t(), str) && AbstractC19074t.m100204b(video.m52913u(), str2)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* renamed from: x */
    private final List m130095x() {
        C25101x m130115d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = this.f120518i; -1 < i11; i11--) {
            arrayList2.add(Integer.valueOf(i11));
            if (!((b) this.f120514e.get(i11)).m130116e() && (m130115d = ((b) this.f120514e.get(i11)).m130115d()) != null) {
                arrayList.add(m130115d);
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    private final List m130096y() {
        ArrayList arrayList = new ArrayList();
        int size = this.f120514e.size();
        for (int i11 = this.f120518i; i11 < size; i11++) {
            arrayList.add(this.f120514e.get(i11));
        }
        return arrayList;
    }

    /* renamed from: E */
    public final void m130097E() {
        AbstractC25378x.m131542D(f120509m, new g());
        this.f120520k.clear();
        this.f120519j = null;
    }

    /* renamed from: G */
    public final void m130098G(List list) {
        AbstractC19074t.m100208f(list, "videoIds");
        this.f120515f.clear();
        this.f120515f.addAll(list);
    }

    /* renamed from: H */
    public final void m130099H(String str) {
        this.f120511b = str;
    }

    /* renamed from: I */
    public final c m130100I() {
        return new c(this.f120514e, this.f120516g, this.f120517h, this.f120518i, this.f120515f);
    }

    /* renamed from: t */
    public final void m130101t(C31179n0 c31179n0) {
        if (c31179n0 == null) {
            return;
        }
        this.f120521l = c31179n0;
        c31179n0.m9998I(new d(c31179n0, this));
        this.f120519j = new e(c31179n0);
    }

    /* renamed from: v */
    public final List m130102v() {
        return this.f120515f;
    }

    /* renamed from: w */
    public final String m130103w() {
        return this.f120511b;
    }

    /* renamed from: z */
    public final List m130104z() {
        List m131502j;
        Video video;
        String m52911t;
        ArrayList arrayList = new ArrayList();
        int size = this.f120514e.size();
        int i11 = this.f120517h;
        if (i11 < 0 || i11 >= size) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        int size2 = this.f120514e.size();
        while (i11 < size2) {
            Object m130112a = ((b) this.f120514e.get(i11)).m130112a();
            if (m130112a instanceof Video) {
                video = (Video) m130112a;
            } else {
                video = null;
            }
            if (video != null && (m52911t = video.m52911t()) != null) {
                arrayList.add(m52911t);
            }
            i11++;
        }
        return arrayList;
    }
}
