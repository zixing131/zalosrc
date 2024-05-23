package z10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.HashTagVideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoLocationHeader;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import g20.C19205a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import p338m2.InterfaceC22715a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q10.C25068y;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: z10.o0 */
/* loaded from: classes5.dex */
public final class C31181o0 extends AbstractC31153a0 {
    public static final c Companion = new c(null);

    /* renamed from: u */
    private VideoLocationHeader f143955u;

    /* renamed from: v */
    private Section f143956v;

    /* renamed from: w */
    private b f143957w;

    /* renamed from: x */
    private ArrayList f143958x;

    /* renamed from: y */
    private ArrayList f143959y;

    /* renamed from: z */
    private int f143960z;

    /* renamed from: z10.o0$a */
    /* loaded from: classes5.dex */
    public abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31181o0 f143961I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31181o0 c31181o0, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143961I = c31181o0;
        }

        /* renamed from: i0 */
        public abstract void mo151913i0(Object obj);

        /* renamed from: j0 */
        public abstract void mo151914j0(Object obj, List list);

        /* renamed from: k0 */
        public abstract void mo151915k0();
    }

    /* renamed from: z10.o0$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo55146a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo55147b(Section section, int i11);
    }

    /* renamed from: z10.o0$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.o0$d */
    /* loaded from: classes5.dex */
    public final class d extends a {

        /* renamed from: J */
        private final C25068y f143962J;

        /* renamed from: K */
        final /* synthetic */ C31181o0 f143963K;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(C31181o0 c31181o0, C25068y c25068y) {
            super(c31181o0, r0);
            AbstractC19074t.m100208f(c25068y, "binding");
            this.f143963K = c31181o0;
            LinearLayout root = c25068y.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143962J = c25068y;
        }

        @Override // z10.C31181o0.a
        /* renamed from: i0 */
        public void mo151913i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            VideoLocationHeader videoLocationHeader = (VideoLocationHeader) obj;
            C25068y c25068y = this.f143962J;
            String m52954b = videoLocationHeader.m52954b();
            if (m52954b != null && m52954b.length() != 0) {
                c25068y.f120426r.setText(videoLocationHeader.m52954b());
            } else {
                EllipsizedTextView ellipsizedTextView = c25068y.f120426r;
                AbstractC19074t.m100207e(ellipsizedTextView, "tvTitle");
                AbstractC26112n.m134367H(ellipsizedTextView);
            }
            String m52953a = videoLocationHeader.m52953a();
            if (m52953a != null && m52953a.length() != 0) {
                c25068y.f120425q.setText(videoLocationHeader.m52953a());
                return;
            }
            EllipsizedTextView ellipsizedTextView2 = c25068y.f120425q;
            AbstractC19074t.m100207e(ellipsizedTextView2, "tvDesc");
            AbstractC26112n.m134367H(ellipsizedTextView2);
        }

        @Override // z10.C31181o0.a
        /* renamed from: j0 */
        public void mo151914j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }

        @Override // z10.C31181o0.a
        /* renamed from: k0 */
        public void mo151915k0() {
        }
    }

    /* renamed from: z10.o0$e */
    /* loaded from: classes5.dex */
    public final class e extends a {

        /* renamed from: J */
        private final HashTagVideoItem f143964J;

        /* renamed from: K */
        private CoroutineScope f143965K;

        /* renamed from: L */
        private Video f143966L;

        /* renamed from: M */
        final /* synthetic */ C31181o0 f143967M;

        /* renamed from: z10.o0$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f143968t;

            /* renamed from: u */
            private /* synthetic */ Object f143969u;

            /* renamed from: v */
            final /* synthetic */ Video f143970v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Video video, Continuation continuation) {
                super(2, continuation);
                this.f143970v = video;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f143970v, continuation);
                aVar.f143969u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f143968t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f143969u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f143969u;
                    this.f143969u = coroutineScope2;
                    this.f143968t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                while (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f143970v.m52850J0(true);
                    C19205a.m100678X(C19205a.f95429a, this.f143970v, null, null, null, 12, null);
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C31181o0 c31181o0, HashTagVideoItem hashTagVideoItem) {
            super(c31181o0, hashTagVideoItem);
            AbstractC19074t.m100208f(hashTagVideoItem, "view");
            this.f143967M = c31181o0;
            this.f143964J = hashTagVideoItem;
        }

        @Override // z10.C31181o0.a
        /* renamed from: i0 */
        public void mo151913i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            Video video = (Video) obj;
            this.f143966L = video;
            this.f143964J.m52168a(video);
        }

        @Override // z10.C31181o0.a
        /* renamed from: j0 */
        public void mo151914j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }

        @Override // z10.C31181o0.a
        /* renamed from: k0 */
        public void mo151915k0() {
            CoroutineScope coroutineScope = this.f143965K;
            if (coroutineScope != null) {
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            }
        }

        /* renamed from: l0 */
        public final void m151916l0() {
            Video video = this.f143966L;
            if (video != null && !video.m52907p0()) {
                CoroutineScope coroutineScope = this.f143965K;
                if (coroutineScope == null || !CoroutineScopeKt.m112642f(coroutineScope)) {
                    CoroutineScope coroutineScope2 = this.f143965K;
                    if (coroutineScope2 != null) {
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    }
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
                    this.f143965K = m112637a;
                    if (m112637a != null) {
                        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(video, null), 3, null);
                    }
                }
            }
        }
    }

    /* renamed from: z10.o0$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f143971q = new f();

        f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "i");
            return video.m52911t();
        }
    }

    /* renamed from: z10.o0$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: z10.o0$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f143973q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final Boolean mo205i9(Video video) {
                AbstractC19074t.m100208f(video, "it");
                return Boolean.valueOf(video.m52903n0());
            }
        }

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m151919a(View view) {
            Video video;
            AbstractC19074t.m100208f(view, "it");
            Object tag = view.getTag();
            if (tag instanceof Video) {
                video = (Video) tag;
            } else {
                video = null;
            }
            Section m51166j = C31181o0.this.m151904V().m51166j(a.f143973q);
            if (video != null) {
                C31181o0 c31181o0 = C31181o0.this;
                int indexOf = m51166j.m51168m().indexOf(video);
                b m151903U = c31181o0.m151903U();
                if (m151903U != null) {
                    m151903U.mo55147b(c31181o0.m151904V(), indexOf);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151919a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.o0$h */
    /* loaded from: classes5.dex */
    public /* synthetic */ class h extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final h f143974y = new h();

        h() {
            super(3, C25068y.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemLocationHeaderBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151921h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C25068y m151921h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C25068y.m129976c(layoutInflater, viewGroup, z11);
        }
    }

    public /* synthetic */ C31181o0(VideoLocationHeader videoLocationHeader, Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : videoLocationHeader, (i11 & 2) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: S */
    public static /* synthetic */ void m151899S(C31181o0 c31181o0, Section section, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            section = null;
        }
        c31181o0.m151901R(section);
    }

    /* renamed from: W */
    private final Object m151900W(int i11) {
        Object obj = this.f143959y.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return obj;
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143957w;
        if (bVar == null || (m51171p = this.f143956v.m51171p()) == null) {
            return;
        }
        bVar.mo55146a(m51171p);
    }

    /* renamed from: R */
    public final void m151901R(Section section) {
        String m52954b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        if (section != null) {
            arrayList.addAll(this.f143958x);
            arrayList2.addAll(this.f143959y);
            this.f143956v.m51163e(section, f.f143971q);
            int size = this.f143956v.m51168m().size();
            for (int size2 = this.f143956v.m51168m().size(); size2 < size; size2++) {
                this.f143960z++;
                Video video = (Video) this.f143956v.m51168m().get(size2);
                arrayList.add(0);
                arrayList2.add(video);
                if (video.m52919y() == null) {
                    video.m52853L0(Integer.valueOf(this.f143960z));
                }
            }
        } else {
            this.f143960z = 0;
            VideoLocationHeader videoLocationHeader = this.f143955u;
            if (videoLocationHeader != null && (m52954b = videoLocationHeader.m52954b()) != null && m52954b.length() != 0) {
                arrayList.add(1);
                arrayList2.add(videoLocationHeader);
            }
            for (Object obj : this.f143956v.m51168m()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                Video video2 = (Video) obj;
                arrayList.add(0);
                arrayList2.add(video2);
                if (video2.m52919y() == null) {
                    video2.m52853L0(Integer.valueOf(i11));
                }
                this.f143960z++;
                i11 = i12;
            }
        }
        this.f143958x = arrayList;
        this.f143959y = arrayList2;
    }

    /* renamed from: T */
    public final int m151902T(String str) {
        AbstractC19074t.m100208f(str, "id");
        int i11 = 0;
        for (Object obj : this.f143959y) {
            if (!(obj instanceof Video) || !AbstractC19074t.m100204b(((Video) obj).m52911t(), str)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: U */
    public final b m151903U() {
        return this.f143957w;
    }

    /* renamed from: V */
    public final Section m151904V() {
        return this.f143956v;
    }

    /* renamed from: X */
    public final boolean m151905X(int i11) {
        if (mo10005m(i11) == 1) {
            return true;
        }
        return false;
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        aVar.mo151913i0(m151900W(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Z */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Object m151900W = m151900W(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151914j0(m151900W, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: a0 */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 0) {
            View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_hash_tag_list, false, 2, null);
            AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem");
            e eVar = new e(this, (HashTagVideoItem) m134372M);
            View view = eVar.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            AbstractC26112n.m134407k0(view, new g());
            View view2 = eVar.f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            AbstractC26112n.m134389b0(view2);
            return eVar;
        }
        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, h.f143974y, false, 2, null);
        AbstractC19074t.m100205c(m134373N);
        return new d(this, (C25068y) m134373N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0 */
    public void mo9996G(a aVar) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9996G(aVar);
        aVar.mo151915k0();
    }

    /* renamed from: c0 */
    public final void m151910c0(b bVar) {
        this.f143957w = bVar;
    }

    /* renamed from: d0 */
    public final void m151911d0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143956v = section;
    }

    /* renamed from: e0 */
    public final void m151912e0(VideoLocationHeader videoLocationHeader) {
        this.f143955u = videoLocationHeader;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143959y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f143958x.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31181o0(VideoLocationHeader videoLocationHeader, Section section) {
        super(4);
        AbstractC19074t.m100208f(section, "data");
        this.f143955u = videoLocationHeader;
        this.f143956v = section;
        this.f143958x = new ArrayList();
        this.f143959y = new ArrayList();
    }
}
