package z10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelVideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.UploadVideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import e10.C18174k;
import e10.EnumC18172i;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.ArrayList;
import java.util.Iterator;
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
import qm0.AbstractC25366r;
import qm0.AbstractC25378x;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: z10.g */
/* loaded from: classes5.dex */
public final class C31164g extends AbstractC31153a0 {
    public static final c Companion = new c(null);

    /* renamed from: A */
    private ArrayList f143724A;

    /* renamed from: B */
    private final ArrayList f143725B;

    /* renamed from: u */
    private String f143726u;

    /* renamed from: v */
    private ArrayList f143727v;

    /* renamed from: w */
    private Section f143728w;

    /* renamed from: x */
    private b f143729x;

    /* renamed from: y */
    private int f143730y;

    /* renamed from: z */
    private ArrayList f143731z;

    /* renamed from: z10.g$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
        }

        /* renamed from: i0 */
        public abstract void mo151612i0(Object obj);

        /* renamed from: j0 */
        public void mo151613j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
        }
    }

    /* renamed from: z10.g$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54123a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54124b(C18174k c18174k);

        /* renamed from: c */
        void mo54125c(Section section, int i11);
    }

    /* renamed from: z10.g$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.g$d */
    /* loaded from: classes5.dex */
    public final class d extends a {

        /* renamed from: I */
        private final UploadVideoItem f143732I;

        /* renamed from: J */
        final /* synthetic */ C31164g f143733J;

        /* renamed from: z10.g$d$a */
        /* loaded from: classes5.dex */
        public static final class a implements UploadVideoItem.InterfaceC9670a {

            /* renamed from: a */
            final /* synthetic */ C31164g f143734a;

            /* renamed from: b */
            final /* synthetic */ Object f143735b;

            a(C31164g c31164g, Object obj) {
                this.f143734a = c31164g;
                this.f143735b = obj;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.UploadVideoItem.InterfaceC9670a
            /* renamed from: d */
            public void mo52391d() {
                b m151594U = this.f143734a.m151594U();
                if (m151594U != null) {
                    m151594U.mo54124b(((e) this.f143735b).m151615b());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C31164g c31164g, UploadVideoItem uploadVideoItem) {
            super(uploadVideoItem);
            AbstractC19074t.m100208f(uploadVideoItem, "view");
            this.f143733J = c31164g;
            this.f143732I = uploadVideoItem;
        }

        @Override // z10.C31164g.a
        /* renamed from: i0 */
        public void mo151612i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143732I.m52388a((e) obj);
            this.f143732I.setCallback(new a(this.f143733J, obj));
        }

        @Override // z10.C31164g.a
        /* renamed from: j0 */
        public void mo151613j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143732I.m52389b((e) obj, list);
        }
    }

    /* renamed from: z10.g$e */
    /* loaded from: classes5.dex */
    public static final class e {

        /* renamed from: a */
        private final C18174k f143736a;

        /* renamed from: b */
        private final String f143737b;

        /* renamed from: c */
        private int f143738c;

        public e(C18174k c18174k) {
            int i11;
            AbstractC19074t.m100208f(c18174k, "task");
            this.f143736a = c18174k;
            this.f143737b = c18174k.m96906f().m140268v();
            if (c18174k.m96905e() == EnumC18172i.f92270t) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            this.f143738c = i11;
        }

        /* renamed from: a */
        public final int m151614a() {
            return this.f143738c;
        }

        /* renamed from: b */
        public final C18174k m151615b() {
            return this.f143736a;
        }

        /* renamed from: c */
        public final String m151616c() {
            return this.f143737b;
        }

        /* renamed from: d */
        public final void m151617d(int i11) {
            this.f143738c = i11;
        }
    }

    /* renamed from: z10.g$f */
    /* loaded from: classes5.dex */
    public final class f extends a {

        /* renamed from: I */
        private final ChannelVideoItem f143739I;

        /* renamed from: J */
        private CoroutineScope f143740J;

        /* renamed from: K */
        private Video f143741K;

        /* renamed from: L */
        final /* synthetic */ C31164g f143742L;

        /* renamed from: z10.g$f$a */
        /* loaded from: classes5.dex */
        public static final class a implements ChannelVideoItem.InterfaceC9567a {

            /* renamed from: a */
            final /* synthetic */ C31164g f143743a;

            /* renamed from: b */
            final /* synthetic */ Object f143744b;

            /* renamed from: z10.g$f$a$a */
            /* loaded from: classes5.dex */
            static final class C33056a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                public static final C33056a f143745q = new C33056a();

                C33056a() {
                    super(1);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: a */
                public final Boolean mo205i9(Video video) {
                    boolean z11;
                    AbstractC19074t.m100208f(video, "it");
                    if (video.m52877Y() && video.m52879Z()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
            }

            a(C31164g c31164g, Object obj) {
                this.f143743a = c31164g;
                this.f143744b = obj;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelVideoItem.InterfaceC9567a
            /* renamed from: d */
            public void mo52058d() {
                Section m51166j = this.f143743a.m151596W().m51166j(C33056a.f143745q);
                int indexOf = m51166j.m51168m().indexOf(this.f143744b);
                b m151594U = this.f143743a.m151594U();
                if (m151594U != null) {
                    m151594U.mo54125c(m51166j, indexOf);
                }
            }
        }

        /* renamed from: z10.g$f$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f143746t;

            /* renamed from: u */
            private /* synthetic */ Object f143747u;

            /* renamed from: v */
            final /* synthetic */ Video f143748v;

            /* renamed from: w */
            final /* synthetic */ String f143749w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Video video, String str, Continuation continuation) {
                super(2, continuation);
                this.f143748v = video;
                this.f143749w = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                b bVar = new b(this.f143748v, this.f143749w, continuation);
                bVar.f143747u = obj;
                return bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                Map m131401f;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f143746t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f143747u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f143747u;
                    this.f143747u = coroutineScope2;
                    this.f143746t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                while (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f143748v.m52850J0(true);
                    C19205a c19205a = C19205a.f95429a;
                    Video video = this.f143748v;
                    m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_id", this.f143749w));
                    C19205a.m100678X(c19205a, video, m131401f, null, null, 12, null);
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C31164g c31164g, ChannelVideoItem channelVideoItem) {
            super(channelVideoItem);
            AbstractC19074t.m100208f(channelVideoItem, "view");
            this.f143742L = c31164g;
            this.f143739I = channelVideoItem;
        }

        @Override // z10.C31164g.a
        /* renamed from: i0 */
        public void mo151612i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            Video video = (Video) obj;
            this.f143741K = video;
            this.f143739I.m52057a(video, this.f143742L.m151595V());
            this.f143739I.setCallback(new a(this.f143742L, obj));
        }

        /* renamed from: k0 */
        public final void m151618k0() {
            CoroutineScope coroutineScope = this.f143740J;
            if (coroutineScope != null) {
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            }
        }

        /* renamed from: l0 */
        public final void m151619l0(String str) {
            AbstractC19074t.m100208f(str, "channelId");
            Video video = this.f143741K;
            if (video != null && !video.m52907p0()) {
                CoroutineScope coroutineScope = this.f143740J;
                if (coroutineScope == null || !CoroutineScopeKt.m112642f(coroutineScope)) {
                    CoroutineScope coroutineScope2 = this.f143740J;
                    if (coroutineScope2 != null) {
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    }
                    CoroutineScope m112637a = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
                    this.f143740J = m112637a;
                    if (m112637a != null) {
                        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new b(video, str, null), 3, null);
                    }
                }
            }
        }
    }

    /* renamed from: z10.g$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f143750q = new g();

        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "video");
            return video.m52911t();
        }
    }

    public /* synthetic */ C31164g(String str, ArrayList arrayList, Section section, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? new ArrayList() : arrayList, (i11 & 4) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: R */
    public static final /* synthetic */ ArrayList m151590R(C31164g c31164g) {
        return c31164g.f143724A;
    }

    /* renamed from: T */
    public static /* synthetic */ void m151591T(C31164g c31164g, Section section, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            section = null;
        }
        c31164g.m151593S(section);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m151592Z(C31164g c31164g, long j11, Video video, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            video = null;
        }
        c31164g.m151598Y(j11, video);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143729x;
        if (bVar == null || (m51171p = this.f143728w.m51171p()) == null) {
            return;
        }
        bVar.mo54123a(m51171p);
    }

    /* renamed from: S */
    public final void m151593S(Section section) {
        int size;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = this.f143728w.m51168m().size();
        if (section == null) {
            int i11 = 0;
            while (i11 < size2 && ((Video) this.f143728w.m51168m().get(i11)).m52912t0()) {
                arrayList.add(1);
                arrayList2.add(this.f143728w.m51168m().get(i11));
                i11++;
            }
            Iterator it = this.f143727v.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                arrayList.add(0);
                arrayList2.add(eVar);
            }
            this.f143730y = i11;
            size = size2;
            size2 = i11;
        } else {
            arrayList.addAll(this.f143731z);
            arrayList2.addAll(this.f143724A);
            this.f143728w.m51163e(section, g.f143750q);
            size = this.f143728w.m51168m().size();
        }
        while (size2 < size) {
            arrayList.add(1);
            arrayList2.add(this.f143728w.m51168m().get(size2));
            size2++;
        }
        this.f143731z = arrayList;
        this.f143724A = arrayList2;
    }

    /* renamed from: U */
    public final b m151594U() {
        return this.f143729x;
    }

    /* renamed from: V */
    public final String m151595V() {
        return this.f143726u;
    }

    /* renamed from: W */
    public final Section m151596W() {
        return this.f143728w;
    }

    /* renamed from: X */
    public final int m151597X(String str) {
        Video video;
        AbstractC19074t.m100208f(str, "id");
        int i11 = 0;
        for (Object obj : this.f143724A) {
            String str2 = null;
            if (obj instanceof Video) {
                video = (Video) obj;
            } else {
                video = null;
            }
            if (video != null) {
                str2 = video.m52911t();
            }
            if (!AbstractC19074t.m100204b(str2, str)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: Y */
    public final void m151598Y(long j11, Video video) {
        e eVar;
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            Object obj = this.f143724A.get(i11);
            if (obj instanceof e) {
                eVar = (e) obj;
            } else {
                eVar = null;
            }
            if (eVar != null && eVar.m151615b().m96902b() == j11) {
                if (video != null) {
                    if (video.m52863R() == 5) {
                        video.m52876X0(eVar.m151616c());
                    }
                    List m51168m = this.f143728w.m51168m();
                    AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                    ((ArrayList) m51168m).add(this.f143730y, video);
                    this.f143727v.remove(eVar);
                    this.f143731z.set(i11, 1);
                    this.f143724A.set(i11, video);
                    m10009q(i11);
                    return;
                }
                this.f143727v.remove(eVar);
                this.f143731z.remove(i11);
                this.f143724A.remove(i11);
                m10017y(i11);
                return;
            }
        }
    }

    /* renamed from: a0 */
    public final void m151599a0(e eVar) {
        AbstractC19074t.m100208f(eVar, "upload");
        this.f143727v.add(0, eVar);
        this.f143731z.add(this.f143730y, 0);
        this.f143724A.add(this.f143730y, eVar);
        m10011s(this.f143730y);
    }

    /* renamed from: b0 */
    public final void m151600b0(long j11, int i11) {
        e eVar;
        List m131496e;
        if (mo10003k() == 0) {
            Iterator it = this.f143727v.iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next();
                if (eVar2.m151615b().m96902b() == j11) {
                    eVar2.m151617d(i11);
                    return;
                }
            }
            return;
        }
        int mo10003k = mo10003k();
        for (int i12 = 0; i12 < mo10003k; i12++) {
            Object obj = this.f143724A.get(i12);
            if (obj instanceof e) {
                eVar = (e) obj;
            } else {
                eVar = null;
            }
            if (eVar != null && eVar.m151615b().m96902b() == j11) {
                if (eVar.m151614a() != i11) {
                    eVar.m151617d(i11);
                    m131496e = AbstractC25366r.m131496e("PROGRESS");
                    m10010r(i12, m131496e);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: c0 */
    public final void m151601c0(String str) {
        Video video;
        AbstractC19074t.m100208f(str, "videoId");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            Object obj = this.f143724A.get(i11);
            if (obj instanceof Video) {
                video = (Video) obj;
            } else {
                video = null;
            }
            if (video != null && AbstractC19074t.m100204b(video.m52911t(), str)) {
                if (video.m52912t0()) {
                    this.f143730y--;
                }
                List m51168m = this.f143728w.m51168m();
                AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                ((ArrayList) m51168m).remove(video);
                this.f143731z.remove(i11);
                this.f143724A.remove(i11);
                m10017y(i11);
                return;
            }
        }
    }

    /* renamed from: d0 */
    public final void m151602d0(Video video) {
        Video video2;
        AbstractC19074t.m100208f(video, "processed");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            Object obj = this.f143724A.get(i11);
            if (obj instanceof Video) {
                video2 = (Video) obj;
            } else {
                video2 = null;
            }
            if (video2 != null && AbstractC19074t.m100204b(video2.m52911t(), video.m52911t())) {
                List m51168m = this.f143728w.m51168m();
                AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.ui.model.Video>");
                ArrayList arrayList = (ArrayList) m51168m;
                this.f143724A.set(i11, video);
                m10009q(i11);
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: e0 */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        Object obj = this.f143724A.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo151612i0(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: f0 */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            Object obj2 = this.f143724A.get(i11);
            AbstractC19074t.m100207e(obj2, "get(...)");
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151613j0(obj2, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: g0 */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        Object m131546H;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            m131546H = AbstractC25378x.m131546H(this.f143725B);
            View view = (View) m131546H;
            if (view == null) {
                view = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_channel, false, 2, null);
            }
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.ChannelVideoItem");
            return new f(this, (ChannelVideoItem) view);
        }
        View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_upload, false, 2, null);
        AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.UploadVideoItem");
        return new d(this, (UploadVideoItem) m134372M);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: h0 */
    public void mo9996G(a aVar) {
        f fVar;
        AbstractC19074t.m100208f(aVar, "holder");
        if (aVar instanceof f) {
            fVar = (f) aVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.m151618k0();
        }
    }

    /* renamed from: i0 */
    public final void m151607i0(ViewGroup viewGroup) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        while (this.f143725B.size() < 30) {
            this.f143725B.add(AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_video_channel, false, 2, null));
        }
    }

    /* renamed from: j0 */
    public final void m151608j0(b bVar) {
        this.f143729x = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143724A.size();
    }

    /* renamed from: k0 */
    public final void m151609k0(String str) {
        this.f143726u = str;
    }

    /* renamed from: l0 */
    public final void m151610l0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143728w = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f143731z.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* renamed from: m0 */
    public final void m151611m0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f143727v = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31164g(String str, ArrayList arrayList, Section section) {
        super(10);
        AbstractC19074t.m100208f(arrayList, "uploads");
        AbstractC19074t.m100208f(section, "section");
        this.f143726u = str;
        this.f143727v = arrayList;
        this.f143728w = section;
        this.f143731z = new ArrayList();
        this.f143724A = new ArrayList();
        this.f143725B = new ArrayList();
    }
}
