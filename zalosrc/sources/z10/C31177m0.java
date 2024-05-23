package z10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.HashTagVideoItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import pm0.C24848g0;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* renamed from: z10.m0 */
/* loaded from: classes5.dex */
public final class C31177m0 extends AbstractC31153a0 {
    public static final c Companion = new c(null);

    /* renamed from: u */
    private Section f143884u;

    /* renamed from: v */
    private b f143885v;

    /* renamed from: w */
    private ArrayList f143886w;

    /* renamed from: x */
    private ArrayList f143887x;

    /* renamed from: z10.m0$a */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31177m0 f143888I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31177m0 c31177m0, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143888I = c31177m0;
        }

        /* renamed from: i0 */
        public abstract void mo151816i0(Object obj);
    }

    /* renamed from: z10.m0$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo55002a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo55003b(Section section, int i11);
    }

    /* renamed from: z10.m0$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.m0$d */
    /* loaded from: classes5.dex */
    public final class d extends a {

        /* renamed from: J */
        private final LoadingLayout f143889J;

        /* renamed from: K */
        final /* synthetic */ C31177m0 f143890K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C31177m0 c31177m0, LoadingLayout loadingLayout) {
            super(c31177m0, loadingLayout);
            AbstractC19074t.m100208f(loadingLayout, "view");
            this.f143890K = c31177m0;
            this.f143889J = loadingLayout;
        }

        @Override // z10.C31177m0.a
        /* renamed from: i0 */
        public void mo151816i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            ((InterfaceC18505l) AbstractC19069o0.m100188e(obj, 1)).mo205i9(this.f143889J);
        }
    }

    /* renamed from: z10.m0$e */
    /* loaded from: classes5.dex */
    public final class e extends a {

        /* renamed from: J */
        private final HashTagVideoItem f143891J;

        /* renamed from: K */
        final /* synthetic */ C31177m0 f143892K;

        /* renamed from: z10.m0$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C31177m0 f143893q;

            /* renamed from: r */
            final /* synthetic */ Object f143894r;

            /* renamed from: z10.m0$e$a$a */
            /* loaded from: classes5.dex */
            public static final class C33059a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                public static final C33059a f143895q = new C33059a();

                C33059a() {
                    super(1);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: a */
                public final Boolean mo205i9(Video video) {
                    AbstractC19074t.m100208f(video, "it");
                    return Boolean.valueOf(video.m52903n0());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C31177m0 c31177m0, Object obj) {
                super(1);
                this.f143893q = c31177m0;
                this.f143894r = obj;
            }

            /* renamed from: a */
            public final void m151817a(View view) {
                AbstractC19074t.m100208f(view, "it");
                Section m51166j = this.f143893q.m151811Z().m51166j(C33059a.f143895q);
                int indexOf = m51166j.m51168m().indexOf(this.f143894r);
                b m151810Y = this.f143893q.m151810Y();
                if (m151810Y != null) {
                    m151810Y.mo55003b(m51166j, indexOf);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m151817a((View) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C31177m0 c31177m0, HashTagVideoItem hashTagVideoItem) {
            super(c31177m0, hashTagVideoItem);
            AbstractC19074t.m100208f(hashTagVideoItem, "view");
            this.f143892K = c31177m0;
            this.f143891J = hashTagVideoItem;
        }

        @Override // z10.C31177m0.a
        /* renamed from: i0 */
        public void mo151816i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143891J.m52168a((Video) obj);
            AbstractC26112n.m134407k0(this.f143891J, new a(this.f143892K, obj));
        }
    }

    /* renamed from: z10.m0$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f143896q = new f();

        f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(Video video) {
            AbstractC19074t.m100208f(video, "video");
            return video.m52911t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.m0$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f143897q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f143897q = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m151820a(LoadingLayout loadingLayout) {
            AbstractC19074t.m100208f(loadingLayout, "layout");
            loadingLayout.m55783f(this.f143897q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151820a((LoadingLayout) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.m0$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f143898q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC18494a interfaceC18494a) {
            super(1);
            this.f143898q = interfaceC18494a;
        }

        /* renamed from: a */
        public final void m151821a(LoadingLayout loadingLayout) {
            AbstractC19074t.m100208f(loadingLayout, "layout");
            loadingLayout.m55784g(this.f143898q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151821a((LoadingLayout) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.m0$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final i f143899q = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m151822a(LoadingLayout loadingLayout) {
            AbstractC19074t.m100208f(loadingLayout, "layout");
            loadingLayout.m55785h(AbstractC27413h.zch_error_no_videos_returned);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151822a((LoadingLayout) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.m0$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final j f143900q = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m151823a(LoadingLayout loadingLayout) {
            AbstractC19074t.m100208f(loadingLayout, "layout");
            loadingLayout.m55786j();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151823a((LoadingLayout) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31177m0(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    /* renamed from: S */
    public static /* synthetic */ void m151803S(C31177m0 c31177m0, Section section, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            section = null;
        }
        c31177m0.m151804R(section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143885v;
        if (bVar == null || (m51171p = this.f143884u.m51171p()) == null) {
            return;
        }
        bVar.mo55002a(m51171p);
    }

    /* renamed from: R */
    public final void m151804R(Section section) {
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.f143884u.m51168m().size();
        if (section != null) {
            arrayList.addAll(this.f143886w);
            arrayList2.addAll(this.f143887x);
            this.f143884u.m51163e(section, f.f143896q);
            i11 = this.f143884u.m51168m().size();
        } else {
            i11 = size;
            size = 0;
        }
        while (size < i11) {
            Video video = (Video) this.f143884u.m51168m().get(size);
            arrayList.add(0);
            arrayList2.add(video);
            size++;
        }
        this.f143886w = arrayList;
        this.f143887x = arrayList2;
    }

    /* renamed from: T */
    public final void m151805T(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "actionOpt");
        m151809X();
        this.f143886w.add(1);
        this.f143887x.add(new g(interfaceC18494a));
    }

    /* renamed from: U */
    public final void m151806U(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "actionOpt");
        m151809X();
        this.f143886w.add(1);
        this.f143887x.add(new h(interfaceC18494a));
    }

    /* renamed from: V */
    public final void m151807V() {
        m151809X();
        this.f143886w.add(1);
        this.f143887x.add(i.f143899q);
    }

    /* renamed from: W */
    public final void m151808W() {
        m151809X();
        this.f143886w.add(1);
        this.f143887x.add(j.f143900q);
    }

    /* renamed from: X */
    public final void m151809X() {
        this.f143884u = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        this.f143886w.clear();
        this.f143887x.clear();
    }

    /* renamed from: Y */
    public final b m151810Y() {
        return this.f143885v;
    }

    /* renamed from: Z */
    public final Section m151811Z() {
        return this.f143884u;
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: a0 */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        Object obj = this.f143887x.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo151816i0(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0 */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 0) {
            View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_hash_tag_list, false, 2, null);
            AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.HashTagVideoItem");
            return new e(this, (HashTagVideoItem) m134372M);
        }
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        return new d(this, new LoadingLayout(context, null, 2, null));
    }

    /* renamed from: c0 */
    public final void m151814c0(b bVar) {
        this.f143885v = bVar;
    }

    /* renamed from: d0 */
    public final void m151815d0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143884u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143887x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f143886w.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31177m0(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "section");
        this.f143884u = section;
        this.f143886w = new ArrayList();
        this.f143887x = new ArrayList();
    }
}
