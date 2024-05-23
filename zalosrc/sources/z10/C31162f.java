package z10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelFollowSuggestionItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import qm0.AbstractC25332a0;
import s20.AbstractC26112n;
import v00.AbstractC27410e;

/* renamed from: z10.f */
/* loaded from: classes5.dex */
public final class C31162f extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private ArrayList f143688r;

    /* renamed from: s */
    private a f143689s;

    /* renamed from: z10.f$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo52133a(Channel channel, boolean z11);

        /* renamed from: b */
        void mo52134b(Channel channel, int i11, String str);
    }

    /* renamed from: z10.f$b */
    /* loaded from: classes5.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final ChannelFollowSuggestionItem f143690I;

        /* renamed from: J */
        final /* synthetic */ C31162f f143691J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31162f c31162f, ChannelFollowSuggestionItem channelFollowSuggestionItem) {
            super(channelFollowSuggestionItem);
            AbstractC19074t.m100208f(channelFollowSuggestionItem, "view");
            this.f143691J = c31162f;
            this.f143690I = channelFollowSuggestionItem;
        }

        /* renamed from: i0 */
        public final void m151563i0(Channel channel) {
            AbstractC19074t.m100208f(channel, "channel");
            this.f143690I.m52050b(channel);
        }

        /* renamed from: j0 */
        public final void m151564j0(Channel channel, Object obj) {
            AbstractC19074t.m100208f(channel, "channel");
            AbstractC19074t.m100208f(obj, "payloads");
            this.f143690I.m52051c(channel);
        }

        /* renamed from: k0 */
        public final ChannelFollowSuggestionItem m151565k0() {
            return this.f143690I;
        }
    }

    /* renamed from: z10.f$c */
    /* loaded from: classes5.dex */
    public static final class c implements ChannelFollowSuggestionItem.InterfaceC9563a {

        /* renamed from: a */
        final /* synthetic */ b f143692a;

        /* renamed from: b */
        final /* synthetic */ C31162f f143693b;

        c(b bVar, C31162f c31162f) {
            this.f143692a = bVar;
            this.f143693b = c31162f;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelFollowSuggestionItem.InterfaceC9563a
        /* renamed from: c */
        public void mo52053c() {
            Integer valueOf = Integer.valueOf(this.f143692a.m9929A());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                a m151556L = this.f143693b.m151556L();
                if (m151556L != null) {
                    Object obj = this.f143693b.m151557M().get(intValue);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    m151556L.mo52133a((Channel) obj, !((Channel) this.f143693b.m151557M().get(intValue)).m50741Q());
                }
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelFollowSuggestionItem.InterfaceC9563a
        /* renamed from: d */
        public void mo52054d() {
            List m51168m;
            Object m131205e0;
            Integer valueOf = Integer.valueOf(this.f143692a.m9929A());
            String str = null;
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                a m151556L = this.f143693b.m151556L();
                if (m151556L != null) {
                    Object obj = this.f143693b.m151557M().get(intValue);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    Channel channel = (Channel) obj;
                    Section m50732J = ((Channel) this.f143693b.m151557M().get(intValue)).m50732J();
                    if (m50732J != null && (m51168m = m50732J.m51168m()) != null) {
                        m131205e0 = AbstractC25332a0.m131205e0(m51168m);
                        Video video = (Video) m131205e0;
                        if (video != null) {
                            str = video.m52911t();
                        }
                    }
                    m151556L.mo52134b(channel, intValue, str);
                }
            }
        }
    }

    public /* synthetic */ C31162f(ArrayList arrayList, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new ArrayList() : arrayList);
    }

    /* renamed from: L */
    public final a m151556L() {
        return this.f143689s;
    }

    /* renamed from: M */
    public final ArrayList m151557M() {
        return this.f143688r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        Object obj = this.f143688r.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        bVar.m151563i0((Channel) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public void mo9991B(b bVar, int i11, List list) {
        AbstractC19074t.m100208f(bVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            mo9990A(bVar, i11);
            return;
        }
        for (Object obj : list) {
            Object obj2 = this.f143688r.get(i11);
            AbstractC19074t.m100207e(obj2, "get(...)");
            bVar.m151564j0((Channel) obj2, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View m134372M = AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_follow_suggestion_channel, false, 2, null);
        AbstractC19074t.m100206d(m134372M, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.component.rv.item.ChannelFollowSuggestionItem");
        b bVar = new b(this, (ChannelFollowSuggestionItem) m134372M);
        bVar.m151565k0().setCallback(new c(bVar, this));
        return bVar;
    }

    /* renamed from: Q */
    public final void m151561Q(a aVar) {
        this.f143689s = aVar;
    }

    /* renamed from: R */
    public final void m151562R(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f143688r = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143688r.size();
    }

    public C31162f(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "channels");
        this.f143688r = arrayList;
    }
}
