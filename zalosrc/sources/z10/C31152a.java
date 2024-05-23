package z10;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p227i3.C20218v;
import pm0.C24848g0;
import q10.C25019j;
import qm0.AbstractC25358n;
import s20.AbstractC26112n;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* renamed from: z10.a */
/* loaded from: classes5.dex */
public final class C31152a extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143586u;

    /* renamed from: v */
    private b f143587v;

    /* renamed from: w */
    private final ArrayList f143588w;

    /* renamed from: z10.a$a */
    /* loaded from: classes5.dex */
    public final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f143589I;

        /* renamed from: J */
        private final C25019j f143590J;

        /* renamed from: K */
        final /* synthetic */ C31152a f143591K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31152a c31152a, View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f143591K = c31152a;
            this.f143589I = view;
            C25019j m129853a = C25019j.m129853a(this.f7784p);
            AbstractC19074t.m100207e(m129853a, "bind(...)");
            this.f143590J = m129853a;
        }

        /* renamed from: i0 */
        public final void m151439i0(Channel channel) {
            AbstractC19074t.m100208f(channel, "item");
            this.f7784p.setTag(channel);
            this.f143590J.f119984r.setAvatar(channel);
            this.f143590J.f119985s.setText(channel.m50775o());
            this.f143590J.f119985s.setVerifiedIcon(channel.m50725F());
            m151440j0(channel);
        }

        /* renamed from: j0 */
        public final void m151440j0(Channel channel) {
            AbstractC19074t.m100208f(channel, "item");
            if (!this.f143591K.f143588w.contains(channel.m50769l())) {
                this.f143590J.f119983q.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
                this.f143590J.f119983q.setTag(Boolean.TRUE);
                RobotoButton robotoButton = this.f143590J.f119983q;
                View view = this.f7784p;
                AbstractC19074t.m100207e(view, "itemView");
                robotoButton.setText(AbstractC26112n.m134366G(view, AbstractC27413h.zch_action_unblock, new Object[0]));
                return;
            }
            this.f143590J.f119983q.setTag(Boolean.FALSE);
            RobotoButton robotoButton2 = this.f143590J.f119983q;
            View view2 = this.f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            robotoButton2.setText(AbstractC26112n.m134366G(view2, AbstractC27413h.zch_action_block, new Object[0]));
            this.f143590J.f119983q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_red);
        }
    }

    /* renamed from: z10.a$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo53913a(LoadMoreInfo loadMoreInfo);

        /* renamed from: m */
        void mo53914m(View view);
    }

    /* renamed from: z10.a$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ a f143593r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f143593r = aVar;
        }

        /* renamed from: a */
        public final void m151441a(View view) {
            AbstractC19074t.m100208f(view, "it");
            b m151430S = C31152a.this.m151430S();
            if (m151430S != null) {
                View view2 = this.f143593r.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                m151430S.mo53914m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151441a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f143595r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(1);
            this.f143595r = view;
        }

        /* renamed from: a */
        public final void m151442a(View view) {
            AbstractC19074t.m100208f(view, "it");
            b m151430S = C31152a.this.m151430S();
            if (m151430S != null) {
                View view2 = this.f143595r;
                AbstractC19074t.m100207e(view2, "$this_apply");
                m151430S.mo53914m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151442a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31152a(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143587v;
        if (bVar == null || (m51171p = this.f143586u.m51171p()) == null) {
            return;
        }
        bVar.mo53913a(m51171p);
    }

    /* renamed from: S */
    public final b m151430S() {
        return this.f143587v;
    }

    /* renamed from: T */
    public final Section m151431T() {
        return this.f143586u;
    }

    /* renamed from: U */
    public final void m151432U(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((Channel) this.f143586u.m51168m().get(i11)).m50769l(), str)) {
                this.f143588w.remove(str);
                m10010r(i11, "true");
                return;
            }
        }
    }

    /* renamed from: V */
    public final void m151433V(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((Channel) this.f143586u.m51168m().get(i11)).m50769l(), str)) {
                this.f143588w.add(str);
                m10010r(i11, "false");
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        aVar.m151439i0((Channel) this.f143586u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X */
    public void mo9991B(a aVar, int i11, List list) {
        boolean m131390w;
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            super.mo9991B(aVar, i11, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m131390w = AbstractC25358n.m131390w(new String[]{"true", "false"}, it.next());
            if (m131390w) {
                aVar.m151440j0((Channel) this.f143586u.m51168m().get(i11));
            } else {
                super.mo9991B(aVar, i11, list);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        a aVar = new a(this, AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_block, false, 2, null));
        View view = aVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new c(aVar));
        View findViewById = aVar.f7784p.findViewById(AbstractC27409d.btnBlock);
        AbstractC19074t.m100205c(findViewById);
        AbstractC26112n.m134407k0(findViewById, new d(findViewById));
        return aVar;
    }

    /* renamed from: Z */
    public final void m151437Z(b bVar) {
        this.f143587v = bVar;
    }

    /* renamed from: a0 */
    public final void m151438a0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143586u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143586u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31152a(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143586u = section;
        this.f143588w = new ArrayList();
    }
}
