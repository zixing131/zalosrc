package z10;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mj0.AbstractC23322a;
import p227i3.C20218v;
import pm0.C24848g0;
import q10.C25050s;
import qm0.AbstractC25358n;
import s20.AbstractC26112n;
import u20.C26980a;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* renamed from: z10.k */
/* loaded from: classes5.dex */
public final class C31172k extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143839u;

    /* renamed from: v */
    private a f143840v;

    /* renamed from: w */
    private final HashSet f143841w;

    /* renamed from: z10.k$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo54355a(LoadMoreInfo loadMoreInfo);

        /* renamed from: m */
        void mo54356m(View view);
    }

    /* renamed from: z10.k$b */
    /* loaded from: classes5.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f143842I;

        /* renamed from: J */
        private final C25050s f143843J;

        /* renamed from: K */
        final /* synthetic */ C31172k f143844K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31172k c31172k, View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f143844K = c31172k;
            this.f143842I = view;
            C25050s m129931a = C25050s.m129931a(this.f7784p);
            AbstractC19074t.m100207e(m129931a, "bind(...)");
            this.f143843J = m129931a;
        }

        /* renamed from: i0 */
        public final void m151746i0(Channel channel) {
            AbstractC19074t.m100208f(channel, "item");
            this.f7784p.setTag(channel);
            this.f143843J.f120233r.setAvatar(channel);
            this.f143843J.f120234s.setText(channel.m50775o());
            this.f143843J.f120234s.setVerifiedIcon(channel.m50725F());
            m151747j0(channel);
        }

        /* renamed from: j0 */
        public final void m151747j0(Channel channel) {
            AbstractC19074t.m100208f(channel, "item");
            if (!this.f143844K.f143841w.contains(channel.m50769l())) {
                RobotoButton robotoButton = this.f143843J.f120232q;
                SpannableString spannableString = new SpannableString(" ");
                Context context = this.f7784p.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
                robotoButton.setText(spannableString);
                this.f143843J.f120232q.setBackgroundResource(AbstractC27408c.zch_bg_button_outline);
                this.f143843J.f120232q.setTag(Boolean.TRUE);
                return;
            }
            this.f143843J.f120232q.setTag(Boolean.FALSE);
            RobotoButton robotoButton2 = this.f143843J.f120232q;
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            robotoButton2.setText(AbstractC26112n.m134366G(view, AbstractC27413h.zch_item_video_follow, new Object[0]));
            this.f143843J.f120232q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.k$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ b f143846r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.f143846r = bVar;
        }

        /* renamed from: a */
        public final void m151748a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151737S = C31172k.this.m151737S();
            if (m151737S != null) {
                View view2 = this.f143846r.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                m151737S.mo54356m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151748a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.k$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f143848r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(1);
            this.f143848r = view;
        }

        /* renamed from: a */
        public final void m151749a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151737S = C31172k.this.m151737S();
            if (m151737S != null) {
                View view2 = this.f143848r;
                AbstractC19074t.m100207e(view2, "$this_apply");
                m151737S.mo54356m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151749a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31172k(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        a aVar = this.f143840v;
        if (aVar == null || (m51171p = this.f143839u.m51171p()) == null) {
            return;
        }
        aVar.mo54355a(m51171p);
    }

    /* renamed from: S */
    public final a m151737S() {
        return this.f143840v;
    }

    /* renamed from: T */
    public final Section m151738T() {
        return this.f143839u;
    }

    /* renamed from: U */
    public final void m151739U(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((Channel) this.f143839u.m51168m().get(i11)).m50769l(), str)) {
                this.f143841w.remove(str);
                m10010r(i11, "true");
                return;
            }
        }
    }

    /* renamed from: V */
    public final void m151740V(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((Channel) this.f143839u.m51168m().get(i11)).m50769l(), str)) {
                this.f143841w.add(str);
                m10010r(i11, "false");
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        super.mo9990A(bVar, i11);
        bVar.m151746i0((Channel) this.f143839u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo9991B(b bVar, int i11, List list) {
        boolean m131390w;
        AbstractC19074t.m100208f(bVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            super.mo9991B(bVar, i11, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m131390w = AbstractC25358n.m131390w(new String[]{"true", "false"}, it.next());
            if (m131390w) {
                bVar.m151747j0((Channel) this.f143839u.m51168m().get(i11));
            } else {
                super.mo9991B(bVar, i11, list);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        b bVar = new b(this, AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_following_channel, false, 2, null));
        View view = bVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new c(bVar));
        View findViewById = bVar.f7784p.findViewById(AbstractC27409d.btnFollow);
        AbstractC19074t.m100205c(findViewById);
        AbstractC26112n.m134407k0(findViewById, new d(findViewById));
        return bVar;
    }

    /* renamed from: Z */
    public final void m151744Z(a aVar) {
        this.f143840v = aVar;
    }

    /* renamed from: a0 */
    public final void m151745a0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143839u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143839u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31172k(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143839u = section;
        this.f143841w = new HashSet();
    }
}
