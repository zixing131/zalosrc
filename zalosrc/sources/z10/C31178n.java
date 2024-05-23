package z10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionLayout;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import v00.C27417l;

/* renamed from: z10.n */
/* loaded from: classes5.dex */
public final class C31178n extends AbstractC31153a0 {

    /* renamed from: u */
    private final String f143901u;

    /* renamed from: v */
    private Section f143902v;

    /* renamed from: w */
    private b f143903w;

    /* renamed from: z10.n$a */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final /* synthetic */ C31178n f143904I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31178n c31178n, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            this.f143904I = c31178n;
        }

        /* renamed from: i0 */
        public abstract void mo151839i0(Object obj);

        /* renamed from: j0 */
        public abstract void mo151840j0(Object obj, List list);
    }

    /* renamed from: z10.n$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo54501a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54502b();

        /* renamed from: c */
        void mo54503c();

        /* renamed from: d */
        void mo54504d();

        /* renamed from: e */
        void mo54505e();

        /* renamed from: f */
        void mo54506f();

        /* renamed from: g */
        void mo54507g();

        /* renamed from: h */
        void mo54508h();

        /* renamed from: i */
        void mo54509i();

        /* renamed from: j */
        void mo54510j();

        /* renamed from: k */
        void mo54511k();

        /* renamed from: l */
        void mo54512l(boolean z11);

        /* renamed from: m */
        void mo54513m();

        /* renamed from: n */
        void mo54514n(int i11);

        /* renamed from: o */
        void mo54515o(boolean z11);
    }

    /* renamed from: z10.n$c */
    /* loaded from: classes5.dex */
    public final class c extends a {

        /* renamed from: J */
        private final LivestreamItem f143905J;

        /* renamed from: K */
        final /* synthetic */ C31178n f143906K;

        /* renamed from: z10.n$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements ReactionLayout.InterfaceC10806b {

            /* renamed from: a */
            final /* synthetic */ C31178n f143907a;

            a(C31178n c31178n) {
                this.f143907a = c31178n;
            }

            @Override // com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionLayout.InterfaceC10806b
            /* renamed from: a */
            public void mo56104a(String str) {
                b m151825S = this.f143907a.m151825S();
                if (m151825S != null) {
                    m151825S.mo54514n(1);
                }
            }

            @Override // com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionLayout.InterfaceC10806b
            /* renamed from: b */
            public void mo56105b(String str, int i11) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C31178n c31178n, LivestreamItem livestreamItem) {
            super(c31178n, livestreamItem);
            AbstractC19074t.m100208f(livestreamItem, "view");
            this.f143906K = c31178n;
            this.f143905J = livestreamItem;
        }

        @Override // z10.C31178n.a
        /* renamed from: i0 */
        public void mo151839i0(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            this.f143905J.m52261v((LivestreamData) obj, new a(this.f143906K));
        }

        @Override // z10.C31178n.a
        /* renamed from: j0 */
        public void mo151840j0(Object obj, List list) {
            AbstractC19074t.m100208f(obj, "data");
            AbstractC19074t.m100208f(list, "payloads");
            this.f143905J.m52263w((LivestreamData) obj, list);
        }

        /* renamed from: k0 */
        public final LivestreamItem m151841k0() {
            return this.f143905J;
        }
    }

    /* renamed from: z10.n$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f143908q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(LivestreamData livestreamData) {
            AbstractC19074t.m100208f(livestreamData, "video");
            return livestreamData.m51016f();
        }
    }

    /* renamed from: z10.n$e */
    /* loaded from: classes5.dex */
    public static final class e implements LivestreamItem.InterfaceC9612a {

        /* renamed from: a */
        final /* synthetic */ c f143909a;

        /* renamed from: b */
        final /* synthetic */ C31178n f143910b;

        e(c cVar, C31178n c31178n) {
            this.f143909a = cVar;
            this.f143910b = c31178n;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: a */
        public void mo52267a() {
            Integer valueOf = Integer.valueOf(this.f143909a.m9929A());
            String str = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                LivestreamData m151827U = this.f143910b.m151827U(Integer.valueOf(valueOf.intValue()));
                if (m151827U == null) {
                    return;
                }
                String m50769l = m151827U.m51010b().m50769l();
                Channel m140377a = C27417l.f129055a.m140377a();
                if (m140377a != null) {
                    str = m140377a.m50769l();
                }
                boolean m100204b = AbstractC19074t.m100204b(m50769l, str);
                b m151825S = this.f143910b.m151825S();
                if (m151825S != null) {
                    m151825S.mo54515o(m100204b);
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: b */
        public void mo52268b() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54502b();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: c */
        public void mo52269c() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54503c();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: d */
        public void mo52270d() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54504d();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: e */
        public void mo52271e() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54505e();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: f */
        public void mo52272f() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54506f();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: g */
        public void mo52273g() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54507g();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: h */
        public void mo52274h() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54508h();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: i */
        public void mo52275i() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54509i();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: j */
        public void mo52276j() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54510j();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: k */
        public void mo52277k() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54511k();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: l */
        public void mo52278l(boolean z11) {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54512l(z11);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LivestreamItem.InterfaceC9612a
        /* renamed from: m */
        public void mo52279m() {
            b m151825S = this.f143910b.m151825S();
            if (m151825S != null) {
                m151825S.mo54513m();
            }
        }
    }

    public /* synthetic */ C31178n(String str, Section section, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143903w;
        if (bVar == null || (m51171p = this.f143902v.m51171p()) == null) {
            return;
        }
        bVar.mo54501a(m51171p);
    }

    /* renamed from: R */
    public final void m151824R(Section section) {
        if (section != null) {
            this.f143902v.m51163e(section, d.f143908q);
        }
    }

    /* renamed from: S */
    public final b m151825S() {
        return this.f143903w;
    }

    /* renamed from: T */
    public final LivestreamData m151826T(int i11) {
        return (LivestreamData) this.f143902v.m51168m().get(i11);
    }

    /* renamed from: U */
    public final LivestreamData m151827U(Integer num) {
        Object m131207g0;
        if (num != null) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f143902v.m51168m(), num.intValue());
            return (LivestreamData) m131207g0;
        }
        return null;
    }

    /* renamed from: V */
    public final Section m151828V() {
        return this.f143902v;
    }

    /* renamed from: W */
    public final void m151829W(int i11, LivestreamData livestreamData) {
        AbstractC19074t.m100208f(livestreamData, "video");
        if (i11 < mo10003k() && AbstractC19074t.m100204b(m151826T(i11).m51016f(), livestreamData.m51016f())) {
            List m51168m = this.f143902v.m51168m();
            AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.data.model.LivestreamData>");
            ((ArrayList) m51168m).set(i11, livestreamData);
            m10009q(i11);
            return;
        }
        List m51168m2 = this.f143902v.m51168m();
        AbstractC19074t.m100206d(m51168m2, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.data.model.LivestreamData>");
        ((ArrayList) m51168m2).add(i11, livestreamData);
        m10011s(i11);
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        aVar.mo151839i0(m151826T(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(aVar, i11);
            return;
        }
        for (Object obj : list) {
            LivestreamData m151826T = m151826T(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            aVar.mo151840j0(m151826T, (List) obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_livestream, false, 2, null);
        AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.LivestreamItem");
        c cVar = new c(this, (LivestreamItem) m134372M);
        cVar.m151841k0().setCallback(new e(cVar, this));
        return cVar;
    }

    /* renamed from: a0 */
    public final void m151833a0(C31178n c31178n) {
        AbstractC19074t.m100208f(c31178n, "adapter");
        this.f143902v = c31178n.f143902v;
    }

    /* renamed from: b0 */
    public final void m151834b0(b bVar) {
        this.f143903w = bVar;
    }

    /* renamed from: c0 */
    public final void m151835c0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143902v = section;
    }

    /* renamed from: d0 */
    public final void m151836d0(LivestreamData livestreamData) {
        List m131496e;
        AbstractC19074t.m100208f(livestreamData, "video");
        List m51168m = this.f143902v.m51168m();
        AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.data.model.LivestreamData>");
        ((ArrayList) m51168m).set(0, livestreamData);
        m131496e = AbstractC25366r.m131496e("UPDATE");
        m10010r(0, m131496e);
    }

    /* renamed from: e0 */
    public final void m151837e0(String str, int i11, Long l11, Long l12) {
        Object obj;
        AbstractC19074t.m100208f(str, "id");
        Iterator it = this.f143902v.m51168m().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((LivestreamData) obj).m51016f(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LivestreamData livestreamData = (LivestreamData) obj;
        if (livestreamData != null) {
            livestreamData.m51011b0(i11);
            if (l11 != null && l11.longValue() > 0) {
                livestreamData.m51009a0(l11.longValue());
            }
            if (l12 != null && l12.longValue() > 0) {
                livestreamData.m50993J(l12.longValue());
            }
        }
    }

    /* renamed from: f0 */
    public final void m151838f0(String str, String str2) {
        Object obj;
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Iterator it = this.f143902v.m51168m().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC19074t.m100204b(((LivestreamData) obj).m51016f(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LivestreamData livestreamData = (LivestreamData) obj;
        if (livestreamData != null) {
            livestreamData.m51015e0(str2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143902v.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31178n(String str, Section section) {
        super(2);
        AbstractC19074t.m100208f(str, "source");
        AbstractC19074t.m100208f(section, "section");
        this.f143901u = str;
        this.f143902v = section;
    }
}
