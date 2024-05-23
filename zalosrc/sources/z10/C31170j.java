package z10;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import p227i3.C20218v;
import pm0.C24848g0;
import q10.C25047r;
import s20.AbstractC26112n;
import v00.AbstractC27410e;

/* renamed from: z10.j */
/* loaded from: classes5.dex */
public final class C31170j extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143830u;

    /* renamed from: v */
    private a f143831v;

    /* renamed from: z10.j$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo54324a(LoadMoreInfo loadMoreInfo);

        /* renamed from: m */
        void mo54325m(View view);
    }

    /* renamed from: z10.j$b */
    /* loaded from: classes5.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f143832I;

        /* renamed from: J */
        private final C25047r f143833J;

        /* renamed from: K */
        final /* synthetic */ C31170j f143834K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31170j c31170j, View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f143834K = c31170j;
            this.f143832I = view;
            C25047r m129924a = C25047r.m129924a(this.f7784p);
            AbstractC19074t.m100207e(m129924a, "bind(...)");
            this.f143833J = m129924a;
        }

        /* renamed from: i0 */
        public final void m151734i0(User user) {
            AbstractC19074t.m100208f(user, "item");
            this.f7784p.setTag(user);
            this.f143833J.f120205q.setAvatar(user);
            this.f143833J.f120205q.setCornerRadius(Float.MAX_VALUE);
            this.f143833J.f120206r.setText(user.m51235h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.j$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ b f143836r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.f143836r = bVar;
        }

        /* renamed from: a */
        public final void m151735a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151727R = C31170j.this.m151727R();
            if (m151727R != null) {
                View view2 = this.f143836r.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                m151727R.mo54325m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151735a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31170j(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        a aVar = this.f143831v;
        if (aVar == null || (m51171p = this.f143830u.m51171p()) == null) {
            return;
        }
        aVar.mo54324a(m51171p);
    }

    /* renamed from: R */
    public final a m151727R() {
        return this.f143831v;
    }

    /* renamed from: S */
    public final Section m151728S() {
        return this.f143830u;
    }

    /* renamed from: T */
    public final void m151729T(String str) {
        AbstractC19074t.m100208f(str, "userId");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((User) this.f143830u.m51168m().get(i11)).m51234g(), str)) {
                List m51168m = this.f143830u.m51168m();
                AbstractC19074t.m100206d(m51168m, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.shortvideo.data.model.User>");
                ((ArrayList) m51168m).remove(i11);
                m10017y(i11);
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        super.mo9990A(bVar, i11);
        bVar.m151734i0((User) this.f143830u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        b bVar = new b(this, AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_follower, false, 2, null));
        View view = bVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new c(bVar));
        return bVar;
    }

    /* renamed from: W */
    public final void m151732W(a aVar) {
        this.f143831v = aVar;
    }

    /* renamed from: X */
    public final void m151733X(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143830u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143830u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31170j(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143830u = section;
    }
}
