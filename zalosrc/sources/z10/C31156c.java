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
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: z10.c */
/* loaded from: classes5.dex */
public final class C31156c extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143645u;

    /* renamed from: v */
    private c f143646v;

    /* renamed from: z10.c$a */
    /* loaded from: classes5.dex */
    public abstract class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31156c f143647I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31156c c31156c, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143647I = c31156c;
        }

        /* renamed from: i0 */
        public abstract void mo151501i0(Video video);

        /* renamed from: j0 */
        public abstract void mo151502j0(Video video, List list);

        /* renamed from: k0 */
        public abstract void mo151503k0();
    }

    /* renamed from: z10.c$b */
    /* loaded from: classes5.dex */
    public final class b extends a {

        /* renamed from: J */
        private final HashTagVideoItem f143648J;

        /* renamed from: K */
        private CoroutineScope f143649K;

        /* renamed from: L */
        private Video f143650L;

        /* renamed from: M */
        final /* synthetic */ C31156c f143651M;

        /* renamed from: z10.c$b$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f143652t;

            /* renamed from: u */
            private /* synthetic */ Object f143653u;

            /* renamed from: v */
            final /* synthetic */ Video f143654v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Video video, Continuation continuation) {
                super(2, continuation);
                this.f143654v = video;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f143654v, continuation);
                aVar.f143653u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f143652t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f143653u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f143653u;
                    this.f143653u = coroutineScope2;
                    this.f143652t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                while (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f143654v.m52850J0(true);
                    C19205a.m100678X(C19205a.f95429a, this.f143654v, null, null, null, 12, null);
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
        public b(C31156c c31156c, HashTagVideoItem hashTagVideoItem) {
            super(c31156c, hashTagVideoItem);
            AbstractC19074t.m100208f(hashTagVideoItem, "view");
            this.f143651M = c31156c;
            this.f143648J = hashTagVideoItem;
            AbstractC26112n.m134389b0(hashTagVideoItem);
        }

        @Override // z10.C31156c.a
        /* renamed from: i0 */
        public void mo151501i0(Video video) {
            AbstractC19074t.m100208f(video, "data");
            this.f143650L = video;
            this.f143648J.m52168a(video);
        }

        @Override // z10.C31156c.a
        /* renamed from: j0 */
        public void mo151502j0(Video video, List list) {
            AbstractC19074t.m100208f(video, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }

        @Override // z10.C31156c.a
        /* renamed from: k0 */
        public void mo151503k0() {
            CoroutineScope coroutineScope = this.f143649K;
            if (coroutineScope != null) {
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            }
        }

        /* renamed from: l0 */
        public final void m151504l0() {
            Video video = this.f143650L;
            if (video != null && !video.m52907p0()) {
                CoroutineScope coroutineScope = this.f143649K;
                if (coroutineScope == null || !CoroutineScopeKt.m112642f(coroutineScope)) {
                    CoroutineScope coroutineScope2 = this.f143649K;
                    if (coroutineScope2 != null) {
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    }
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
                    this.f143649K = m112637a;
                    if (m112637a != null) {
                        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(video, null), 3, null);
                    }
                }
            }
        }
    }

    /* renamed from: z10.c$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: a */
        void mo53955a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo53956b(Section section, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.c$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z10.c$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f143656q = new a();

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
        public final void m151506a(View view) {
            Video video;
            AbstractC19074t.m100208f(view, "it");
            Object tag = view.getTag();
            if (tag instanceof Video) {
                video = (Video) tag;
            } else {
                video = null;
            }
            Section m51166j = C31156c.this.m151493S().m51166j(a.f143656q);
            if (video != null) {
                C31156c c31156c = C31156c.this;
                int indexOf = m51166j.m51168m().indexOf(video);
                c m151492R = c31156c.m151492R();
                if (m151492R != null) {
                    m151492R.mo53956b(c31156c.m151493S(), indexOf);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151506a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31156c(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: T */
    private final Video m151491T(int i11) {
        return (Video) this.f143645u.m51168m().get(i11);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        c cVar = this.f143646v;
        if (cVar == null || (m51171p = this.f143645u.m51171p()) == null) {
            return;
        }
        cVar.mo53955a(m51171p);
    }

    /* renamed from: R */
    public final c m151492R() {
        return this.f143646v;
    }

    /* renamed from: S */
    public final Section m151493S() {
        return this.f143645u;
    }

    /* renamed from: U */
    public final void m151494U(String str) {
        AbstractC19074t.m100208f(str, "videoId");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((Video) this.f143645u.m51168m().get(i11)).m52911t(), str)) {
                List m51168m = this.f143645u.m51168m();
                AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                ((ArrayList) m51168m).remove(i11);
                m10017y(i11);
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        aVar.mo151501i0(m151491T(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Video m151491T = m151491T(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151502j0(m151491T, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_hash_tag_list, false, 2, null);
        AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem");
        b bVar = new b(this, (HashTagVideoItem) m134372M);
        View view = bVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new d());
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo9996G(a aVar) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9996G(aVar);
        aVar.mo151503k0();
    }

    /* renamed from: Z */
    public final void m151499Z(c cVar) {
        this.f143646v = cVar;
    }

    /* renamed from: a0 */
    public final void m151500a0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143645u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143645u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31156c(Section section) {
        super(4);
        AbstractC19074t.m100208f(section, "data");
        this.f143645u = section;
    }
}
