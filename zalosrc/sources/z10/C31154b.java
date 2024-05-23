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
import q10.C25019j;
import s20.AbstractC26112n;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: z10.b */
/* loaded from: classes5.dex */
public final class C31154b extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143599u;

    /* renamed from: v */
    private b f143600v;

    /* renamed from: w */
    private final ArrayList f143601w;

    /* renamed from: z10.b$a */
    /* loaded from: classes5.dex */
    public final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f143602I;

        /* renamed from: J */
        private final C25019j f143603J;

        /* renamed from: K */
        final /* synthetic */ C31154b f143604K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31154b c31154b, View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f143604K = c31154b;
            this.f143602I = view;
            C25019j m129853a = C25019j.m129853a(this.f7784p);
            AbstractC19074t.m100207e(m129853a, "bind(...)");
            this.f143603J = m129853a;
        }

        /* renamed from: i0 */
        public final void m151458i0(User user) {
            AbstractC19074t.m100208f(user, "item");
            this.f7784p.setTag(user);
            this.f143603J.f119984r.setAvatar(user);
            this.f143603J.f119984r.setCornerRadius(Float.MAX_VALUE);
            this.f143603J.f119985s.setText(user.m51235h());
            m151459j0(user);
        }

        /* renamed from: j0 */
        public final void m151459j0(User user) {
            AbstractC19074t.m100208f(user, "item");
            if (!this.f143604K.f143601w.contains(user.m51234g())) {
                this.f143603J.f119983q.setBackgroundResource(AbstractC27408c.zch_bg_button_inactive);
                this.f143603J.f119983q.setTag(Boolean.TRUE);
                this.f143603J.f119983q.setText("Bỏ chặn");
            } else {
                this.f143603J.f119983q.setTag(Boolean.FALSE);
                this.f143603J.f119983q.setText("Chặn");
                this.f143603J.f119983q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_red);
            }
        }
    }

    /* renamed from: z10.b$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo53929a(LoadMoreInfo loadMoreInfo);

        /* renamed from: m */
        void mo53930m(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ a f143606r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f143606r = aVar;
        }

        /* renamed from: a */
        public final void m151460a(View view) {
            AbstractC19074t.m100208f(view, "it");
            b m151449S = C31154b.this.m151449S();
            if (m151449S != null) {
                View view2 = this.f143606r.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                m151449S.mo53930m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151460a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f143608r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(1);
            this.f143608r = view;
        }

        /* renamed from: a */
        public final void m151461a(View view) {
            AbstractC19074t.m100208f(view, "it");
            b m151449S = C31154b.this.m151449S();
            if (m151449S != null) {
                View view2 = this.f143608r;
                AbstractC19074t.m100207e(view2, "$this_apply");
                m151449S.mo53930m(view2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151461a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31154b(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        b bVar = this.f143600v;
        if (bVar == null || (m51171p = this.f143599u.m51171p()) == null) {
            return;
        }
        bVar.mo53929a(m51171p);
    }

    /* renamed from: S */
    public final b m151449S() {
        return this.f143600v;
    }

    /* renamed from: T */
    public final Section m151450T() {
        return this.f143599u;
    }

    /* renamed from: U */
    public final void m151451U(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((User) this.f143599u.m51168m().get(i11)).m51234g(), str)) {
                this.f143601w.remove(str);
                m10010r(i11, Boolean.TRUE);
                return;
            }
        }
    }

    /* renamed from: V */
    public final void m151452V(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            if (AbstractC19074t.m100204b(((User) this.f143599u.m51168m().get(i11)).m51234g(), str)) {
                this.f143601w.add(str);
                m10010r(i11, Boolean.FALSE);
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        super.mo9990A(aVar, i11);
        aVar.m151458i0((User) this.f143599u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo9991B(a aVar, int i11, List list) {
        AbstractC19074t.m100208f(aVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        super.mo9991B(aVar, i11, list);
        aVar.m151459j0((User) this.f143599u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
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
    public final void m151456Z(b bVar) {
        this.f143600v = bVar;
    }

    /* renamed from: a0 */
    public final void m151457a0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143599u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143599u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31154b(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143599u = section;
        this.f143601w = new ArrayList();
    }
}
