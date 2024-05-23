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

/* renamed from: z10.l */
/* loaded from: classes5.dex */
public final class C31174l extends AbstractC31153a0 {

    /* renamed from: u */
    private final String f143851u;

    /* renamed from: v */
    private final String f143852v;

    /* renamed from: w */
    private Section f143853w;

    /* renamed from: x */
    private b f143854x;

    /* renamed from: z10.l$a */
    /* loaded from: classes5.dex */
    public abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31174l f143855I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31174l c31174l, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143855I = c31174l;
        }

        /* renamed from: i0 */
        public abstract void mo151761i0(Video video);

        /* renamed from: j0 */
        public abstract void mo151762j0(Video video, List list);

        /* renamed from: k0 */
        public abstract void mo151763k0();
    }

    /* renamed from: z10.l$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54395a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54396b(Section section, int i11, String str);
    }

    /* renamed from: z10.l$c */
    /* loaded from: classes5.dex */
    public final class c extends a {

        /* renamed from: J */
        private final HashTagVideoItem f143856J;

        /* renamed from: K */
        private CoroutineScope f143857K;

        /* renamed from: L */
        private Video f143858L;

        /* renamed from: M */
        final /* synthetic */ C31174l f143859M;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z10.l$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f143860t;

            /* renamed from: u */
            private /* synthetic */ Object f143861u;

            /* renamed from: v */
            final /* synthetic */ Video f143862v;

            /* renamed from: w */
            final /* synthetic */ boolean f143863w;

            /* renamed from: x */
            final /* synthetic */ C31174l f143864x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Video video, boolean z11, C31174l c31174l, Continuation continuation) {
                super(2, continuation);
                this.f143862v = video;
                this.f143863w = z11;
                this.f143864x = c31174l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f143862v, this.f143863w, this.f143864x, continuation);
                aVar.f143861u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                String m151754U;
                String str;
                Map m131401f;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f143860t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f143861u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f143861u;
                    this.f143861u = coroutineScope2;
                    this.f143860t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                while (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f143862v.m52850J0(true);
                    C19205a c19205a = C19205a.f95429a;
                    Video video = this.f143862v;
                    if (this.f143863w) {
                        m151754U = this.f143864x.m151752S();
                        str = "collection_id";
                    } else {
                        m151754U = this.f143864x.m151754U();
                        str = "hash_tag";
                    }
                    m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a(str, m151754U));
                    C19205a.m100678X(c19205a, video, m131401f, null, null, 12, null);
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C31174l c31174l, HashTagVideoItem hashTagVideoItem) {
            super(c31174l, hashTagVideoItem);
            AbstractC19074t.m100208f(hashTagVideoItem, "view");
            this.f143859M = c31174l;
            this.f143856J = hashTagVideoItem;
        }

        @Override // z10.C31174l.a
        /* renamed from: i0 */
        public void mo151761i0(Video video) {
            AbstractC19074t.m100208f(video, "data");
            this.f143858L = video;
            this.f143856J.m52168a(video);
        }

        @Override // z10.C31174l.a
        /* renamed from: j0 */
        public void mo151762j0(Video video, List list) {
            AbstractC19074t.m100208f(video, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }

        @Override // z10.C31174l.a
        /* renamed from: k0 */
        public void mo151763k0() {
            CoroutineScope coroutineScope = this.f143857K;
            if (coroutineScope != null) {
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            }
        }

        /* renamed from: l0 */
        public final void m151764l0(boolean z11) {
            Video video = this.f143858L;
            if (video != null && !video.m52907p0()) {
                CoroutineScope coroutineScope = this.f143857K;
                if (coroutineScope == null || !CoroutineScopeKt.m112642f(coroutineScope)) {
                    CoroutineScope coroutineScope2 = this.f143857K;
                    if (coroutineScope2 != null) {
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    }
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
                    this.f143857K = m112637a;
                    if (m112637a != null) {
                        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(video, z11, this.f143859M, null), 3, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.l$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z10.l$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f143866q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(Video video) {
                AbstractC19074t.m100208f(video, "it");
                return Boolean.valueOf(video.m52903n0());
            }
        }

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m151766a(View view) {
            Video video;
            AbstractC19074t.m100208f(view, "it");
            Object tag = view.getTag();
            if (tag instanceof Video) {
                video = (Video) tag;
            } else {
                video = null;
            }
            Section m51166j = C31174l.this.m151753T().m51166j(a.f143866q);
            if (video != null) {
                C31174l c31174l = C31174l.this;
                int indexOf = m51166j.m51168m().indexOf(video);
                b m151751R = c31174l.m151751R();
                if (m151751R != null) {
                    m151751R.mo54396b(c31174l.m151753T(), indexOf, c31174l.m151754U());
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151766a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31174l(String str, String str2, Section section, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, (i11 & 4) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: V */
    private final Video m151750V(int i11) {
        return (Video) this.f143853w.m51168m().get(i11);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143854x;
        if (bVar == null || (m51171p = this.f143853w.m51171p()) == null) {
            return;
        }
        bVar.mo54395a(m51171p);
    }

    /* renamed from: R */
    public final b m151751R() {
        return this.f143854x;
    }

    /* renamed from: S */
    public final String m151752S() {
        return this.f143852v;
    }

    /* renamed from: T */
    public final Section m151753T() {
        return this.f143853w;
    }

    /* renamed from: U */
    public final String m151754U() {
        return this.f143851u;
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        aVar.mo151761i0(m151750V(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Video m151750V = m151750V(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151762j0(m151750V, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
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
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo9996G(a aVar) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9996G(aVar);
        aVar.mo151763k0();
    }

    /* renamed from: a0 */
    public final void m151759a0(b bVar) {
        this.f143854x = bVar;
    }

    /* renamed from: b0 */
    public final void m151760b0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143853w = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143853w.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31174l(String str, String str2, Section section) {
        super(6);
        AbstractC19074t.m100208f(str, "hashTag");
        AbstractC19074t.m100208f(str2, "collectionId");
        AbstractC19074t.m100208f(section, "data");
        this.f143851u = str;
        this.f143852v = str2;
        this.f143853w = section;
    }
}
