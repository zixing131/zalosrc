package z10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.HashTagVideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import qm0.AbstractC25361o0;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: z10.g0 */
/* loaded from: classes5.dex */
public final class C31165g0 extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143751u;

    /* renamed from: v */
    private b f143752v;

    /* renamed from: z10.g0$a */
    /* loaded from: classes5.dex */
    public abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31165g0 f143753I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31165g0 c31165g0, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143753I = c31165g0;
        }

        /* renamed from: i0 */
        public abstract void mo151633i0(Video video);

        /* renamed from: j0 */
        public abstract void mo151634j0(Video video, List list);

        /* renamed from: k0 */
        public abstract void mo151635k0();
    }

    /* renamed from: z10.g0$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54885a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54886b(Section section, int i11);
    }

    /* renamed from: z10.g0$c */
    /* loaded from: classes5.dex */
    public final class c extends a {

        /* renamed from: J */
        private final HashTagVideoItem f143754J;

        /* renamed from: K */
        private CoroutineScope f143755K;

        /* renamed from: L */
        private Video f143756L;

        /* renamed from: M */
        final /* synthetic */ C31165g0 f143757M;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z10.g0$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f143758t;

            /* renamed from: u */
            private /* synthetic */ Object f143759u;

            /* renamed from: v */
            final /* synthetic */ Video f143760v;

            /* renamed from: w */
            final /* synthetic */ String f143761w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Video video, String str, Continuation continuation) {
                super(2, continuation);
                this.f143760v = video;
                this.f143761w = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f143760v, this.f143761w, continuation);
                aVar.f143759u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                Map m131401f;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f143758t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f143759u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f143759u;
                    this.f143759u = coroutineScope2;
                    this.f143758t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                while (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f143760v.m52850J0(true);
                    C19205a c19205a = C19205a.f95429a;
                    Video video = this.f143760v;
                    m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("search_kw", this.f143761w));
                    C19205a.m100678X(c19205a, video, m131401f, null, null, 12, null);
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
        public c(C31165g0 c31165g0, HashTagVideoItem hashTagVideoItem) {
            super(c31165g0, hashTagVideoItem);
            AbstractC19074t.m100208f(hashTagVideoItem, "view");
            this.f143757M = c31165g0;
            this.f143754J = hashTagVideoItem;
        }

        @Override // z10.C31165g0.a
        /* renamed from: i0 */
        public void mo151633i0(Video video) {
            AbstractC19074t.m100208f(video, "data");
            this.f143756L = video;
            this.f143754J.m52168a(video);
            this.f143756L = video;
        }

        @Override // z10.C31165g0.a
        /* renamed from: j0 */
        public void mo151634j0(Video video, List list) {
            AbstractC19074t.m100208f(video, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }

        @Override // z10.C31165g0.a
        /* renamed from: k0 */
        public void mo151635k0() {
            CoroutineScope coroutineScope = this.f143755K;
            if (coroutineScope != null) {
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            }
        }

        /* renamed from: l0 */
        public final void m151636l0(String str) {
            AbstractC19074t.m100208f(str, "keyword");
            Video video = this.f143756L;
            if (video != null && !video.m52907p0()) {
                CoroutineScope coroutineScope = this.f143755K;
                if (coroutineScope == null || !CoroutineScopeKt.m112642f(coroutineScope)) {
                    CoroutineScope coroutineScope2 = this.f143755K;
                    if (coroutineScope2 != null) {
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    }
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
                    this.f143755K = m112637a;
                    if (m112637a != null) {
                        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(video, str, null), 3, null);
                    }
                }
            }
        }
    }

    /* renamed from: z10.g0$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: z10.g0$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f143763q = new a();

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

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m151638a(View view) {
            Video video;
            AbstractC19074t.m100208f(view, "it");
            Object tag = view.getTag();
            if (tag instanceof Video) {
                video = (Video) tag;
            } else {
                video = null;
            }
            Section m51166j = C31165g0.this.m151626T().m51166j(a.f143763q);
            if (video != null) {
                C31165g0 c31165g0 = C31165g0.this;
                int indexOf = m51166j.m51168m().indexOf(video);
                b m151625S = c31165g0.m151625S();
                if (m151625S != null) {
                    m151625S.mo54886b(c31165g0.m151626T(), indexOf);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151638a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31165g0(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: U */
    private final Video m151623U(int i11) {
        return (Video) this.f143751u.m51168m().get(i11);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143752v;
        if (bVar == null || (m51171p = this.f143751u.m51171p()) == null) {
            return;
        }
        bVar.mo54885a(m51171p);
    }

    /* renamed from: R */
    public final void m151624R() {
        this.f143751u = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        m10008p();
    }

    /* renamed from: S */
    public final b m151625S() {
        return this.f143752v;
    }

    /* renamed from: T */
    public final Section m151626T() {
        return this.f143751u;
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        aVar.mo151633i0(m151623U(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Video m151623U = m151623U(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151634j0(m151623U, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_hash_tag_list, false, 2, null);
        AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem");
        c cVar = new c(this, (HashTagVideoItem) m134372M);
        View view = cVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new d());
        return cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y */
    public void mo9996G(a aVar) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9996G(aVar);
        aVar.mo151635k0();
    }

    /* renamed from: Z */
    public final void m151631Z(b bVar) {
        this.f143752v = bVar;
    }

    /* renamed from: a0 */
    public final void m151632a0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143751u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143751u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31165g0(Section section) {
        super(4);
        AbstractC19074t.m100208f(section, "data");
        this.f143751u = section;
    }
}
