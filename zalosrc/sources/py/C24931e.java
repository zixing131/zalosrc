package py;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.AbstractC1925r;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.MainApplication;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p354n3.C23528a;
import p374ny.AbstractC23957a;

/* renamed from: py.e */
/* loaded from: classes4.dex */
public final class C24931e extends AbstractC1925r implements InterfaceC18319c {
    public static final b Companion = new b(null);

    /* renamed from: v */
    private static final AbstractC1915h.d f119572v = new a();

    /* renamed from: t */
    private final C23528a f119573t;

    /* renamed from: u */
    private InterfaceC18319c f119574u;

    /* renamed from: py.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC1915h.d {
        a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo10506a(AbstractC23957a abstractC23957a, AbstractC23957a abstractC23957a2) {
            AbstractC19074t.m100208f(abstractC23957a, "oldItem");
            AbstractC19074t.m100208f(abstractC23957a2, "newItem");
            if (abstractC23957a instanceof AbstractC23957a.b) {
                if (abstractC23957a2 instanceof AbstractC23957a.b) {
                    AbstractC23957a.b bVar = (AbstractC23957a.b) abstractC23957a;
                    AbstractC23957a.b bVar2 = (AbstractC23957a.b) abstractC23957a2;
                    if (AbstractC19074t.m100204b(bVar.m125369g(), bVar2.m125369g()) && AbstractC19074t.m100204b(bVar.m125368f(), bVar2.m125368f()) && AbstractC19074t.m100204b(bVar.m125367e(), bVar2.m125367e()) && bVar.m125370h() == bVar2.m125370h() && bVar.m125371i() == bVar2.m125371i() && bVar2.m125363a() == null) {
                        return true;
                    }
                }
                return false;
            }
            if (AbstractC19074t.m100204b(abstractC23957a, AbstractC23957a.a.f115946a)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo10507b(AbstractC23957a abstractC23957a, AbstractC23957a abstractC23957a2) {
            AbstractC19074t.m100208f(abstractC23957a, "oldItem");
            AbstractC19074t.m100208f(abstractC23957a2, "newItem");
            if (abstractC23957a instanceof AbstractC23957a.b) {
                if ((abstractC23957a2 instanceof AbstractC23957a.b) && ((AbstractC23957a.b) abstractC23957a).m125365c() == ((AbstractC23957a.b) abstractC23957a2).m125365c()) {
                    return true;
                }
                return false;
            }
            if (AbstractC19074t.m100204b(abstractC23957a, AbstractC23957a.a.f115946a)) {
                return abstractC23957a2 instanceof AbstractC23957a.a;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object mo10508c(AbstractC23957a abstractC23957a, AbstractC23957a abstractC23957a2) {
            AbstractC19074t.m100208f(abstractC23957a, "oldItem");
            AbstractC19074t.m100208f(abstractC23957a2, "newItem");
            if (abstractC23957a instanceof AbstractC23957a.b) {
                AbstractC23957a.b bVar = (AbstractC23957a.b) abstractC23957a;
                String m125363a = bVar.m125363a();
                bVar.m125372j(null);
                return m125363a;
            }
            if (AbstractC19074t.m100204b(abstractC23957a, AbstractC23957a.a.f115946a)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: py.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24931e() {
        super(f119572v);
        this.f119573t = new C23528a(MainApplication.Companion.m35500c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (abstractC1876c0 instanceof C24929d) {
            Object m10633M = m10633M(i11);
            AbstractC19074t.m100206d(m10633M, "null cannot be cast to non-null type com.zing.zalo.qrcode.model.recent.DataItem.MainItem");
            ((C24929d) abstractC1876c0).m129606p0((AbstractC23957a.b) m10633M, null);
        } else if (abstractC1876c0 instanceof C24923a) {
            Object m10633M2 = m10633M(i11);
            AbstractC19074t.m100206d(m10633M2, "null cannot be cast to non-null type com.zing.zalo.qrcode.model.recent.DataItem.EmptyState");
            ((C24923a) abstractC1876c0).m129593j0((AbstractC23957a.a) m10633M2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: B */
    public void mo9991B(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, List list) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (!list.isEmpty()) {
            for (Object obj : list) {
                if (AbstractC19074t.m100204b(obj, "OnSelectStateChanged") && (abstractC1876c0 instanceof C24929d)) {
                    Object m10633M = m10633M(i11);
                    AbstractC19074t.m100206d(m10633M, "null cannot be cast to non-null type com.zing.zalo.qrcode.model.recent.DataItem.MainItem");
                    ((C24929d) abstractC1876c0).m129606p0((AbstractC23957a.b) m10633M, obj);
                }
            }
            return;
        }
        super.mo9991B(abstractC1876c0, i11, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 1) {
            if (i11 == 2) {
                return new C24923a(viewGroup);
            }
            throw new IllegalArgumentException("Could not create ViewHolder that represents viewType " + i11);
        }
        return new C24929d(viewGroup, this.f119573t, this);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c interfaceC18319c = this.f119574u;
        if (interfaceC18319c != null) {
            return (C18316b) interfaceC18319c.mo205i9(c18316b);
        }
        return null;
    }

    /* renamed from: R */
    public final void m129613R(InterfaceC18319c interfaceC18319c) {
        this.f119574u = interfaceC18319c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC23957a abstractC23957a = (AbstractC23957a) m10633M(i11);
        if (abstractC23957a instanceof AbstractC23957a.b) {
            return 1;
        }
        if (AbstractC19074t.m100204b(abstractC23957a, AbstractC23957a.a.f115946a)) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
