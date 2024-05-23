package z10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelCtaItem;
import fn0.AbstractC19074t;
import java.util.List;
import p227i3.C20218v;
import qm0.AbstractC25332a0;
import s20.AbstractC26112n;
import v00.AbstractC27410e;
import z10.C31158d;

/* renamed from: z10.d */
/* loaded from: classes5.dex */
public final class C31158d extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f143666r;

    /* renamed from: s */
    private a f143667s;

    /* renamed from: z10.d$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: c */
        void mo54121c(CtaItem ctaItem);
    }

    /* renamed from: z10.d$b */
    /* loaded from: classes5.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final ChannelCtaItem f143668I;

        /* renamed from: J */
        final /* synthetic */ C31158d f143669J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31158d c31158d, ChannelCtaItem channelCtaItem) {
            super(channelCtaItem);
            AbstractC19074t.m100208f(channelCtaItem, C20218v.f100059b);
            this.f143669J = c31158d;
            this.f143668I = channelCtaItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m151530k0(C31158d c31158d, CtaItem ctaItem, View view) {
            AbstractC19074t.m100208f(c31158d, "this$0");
            AbstractC19074t.m100208f(ctaItem, "$item");
            a m151524M = c31158d.m151524M();
            if (m151524M != null) {
                m151524M.mo54121c(ctaItem);
            }
        }

        /* renamed from: j0 */
        public final void m151531j0(final CtaItem ctaItem) {
            AbstractC19074t.m100208f(ctaItem, "item");
            ChannelCtaItem channelCtaItem = this.f143668I;
            final C31158d c31158d = this.f143669J;
            channelCtaItem.m52048a(ctaItem, new View.OnClickListener() { // from class: z10.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31158d.b.m151530k0(C31158d.this, ctaItem, view);
                }
            });
        }
    }

    /* renamed from: L */
    public final List m151523L() {
        return this.f143666r;
    }

    /* renamed from: M */
    public final a m151524M() {
        return this.f143667s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        Object m131207g0;
        AbstractC19074t.m100208f(bVar, "holder");
        List list = this.f143666r;
        if (list != null) {
            m131207g0 = AbstractC25332a0.m131207g0(list, i11);
            CtaItem ctaItem = (CtaItem) m131207g0;
            if (ctaItem != null) {
                bVar.m151531j0(ctaItem);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "p0");
        View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_channel_cta, false, 2, null);
        AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.ChannelCtaItem");
        return new b(this, (ChannelCtaItem) m134372M);
    }

    /* renamed from: P */
    public final void m151527P(a aVar) {
        this.f143667s = aVar;
    }

    /* renamed from: Q */
    public final void m151528Q(List list) {
        this.f143666r = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f143666r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
