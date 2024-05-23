package com.zing.zalo.adapters;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.group.leavegroup.SelectGroupOwnerRow;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import qm0.AbstractC25332a0;

/* renamed from: com.zing.zalo.adapters.k7 */
/* loaded from: classes3.dex */
public final class C7120k7 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final boolean f38942r;

    /* renamed from: s */
    private final List f38943s = new ArrayList();

    /* renamed from: t */
    private InterfaceC18319c f38944t;

    /* renamed from: com.zing.zalo.adapters.k7$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC1915h.b {

        /* renamed from: a */
        private final List f38945a;

        /* renamed from: b */
        private final List f38946b;

        public a(List list, List list2) {
            AbstractC19074t.m100208f(list, "oldList");
            AbstractC19074t.m100208f(list2, "newList");
            this.f38945a = list;
            this.f38946b = list2;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: a */
        public boolean mo421a(int i11, int i12) {
            return AbstractC19074t.m100204b((GroupFullMemberAdapter.C6938b) this.f38945a.get(i11), (GroupFullMemberAdapter.C6938b) this.f38946b.get(i12));
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: b */
        public boolean mo422b(int i11, int i12) {
            String str;
            ContactProfile contactProfile = ((GroupFullMemberAdapter.C6938b) this.f38945a.get(i11)).f38022b;
            String str2 = null;
            if (contactProfile != null) {
                str = contactProfile.f42434r;
            } else {
                str = null;
            }
            ContactProfile contactProfile2 = ((GroupFullMemberAdapter.C6938b) this.f38946b.get(i12)).f38022b;
            if (contactProfile2 != null) {
                str2 = contactProfile2.f42434r;
            }
            return AbstractC19074t.m100204b(str, str2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: d */
        public int mo424d() {
            return this.f38946b.size();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: e */
        public int mo425e() {
            return this.f38945a.size();
        }
    }

    /* renamed from: com.zing.zalo.adapters.k7$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final SelectGroupOwnerRow f38947I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SelectGroupOwnerRow selectGroupOwnerRow) {
            super(selectGroupOwnerRow);
            AbstractC19074t.m100208f(selectGroupOwnerRow, "view");
            this.f38947I = selectGroupOwnerRow;
        }

        /* renamed from: i0 */
        public final void m36301i0(GroupFullMemberAdapter.C6938b c6938b, boolean z11) {
            AbstractC19074t.m100208f(c6938b, "data");
            this.f38947I.m66280q(c6938b, !z11);
        }
    }

    public C7120k7(boolean z11) {
        this.f38942r = z11;
    }

    /* renamed from: L */
    private final boolean m36298L(int i11) {
        if (i11 == mo10003k() - 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        Object m131207g0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        m131207g0 = AbstractC25332a0.m131207g0(this.f38943s, i11);
        GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) m131207g0;
        if (c6938b != null && (abstractC1876c0 instanceof b)) {
            ((b) abstractC1876c0).m36301i0(c6938b, m36298L(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        SelectGroupOwnerRow selectGroupOwnerRow = new SelectGroupOwnerRow(context, null, 0, 6, null);
        selectGroupOwnerRow.setActionResponder(this.f38944t);
        selectGroupOwnerRow.setCommunity(this.f38942r);
        return new b(selectGroupOwnerRow);
    }

    /* renamed from: M */
    public final void m36299M(InterfaceC18319c interfaceC18319c) {
        this.f38944t = interfaceC18319c;
    }

    /* renamed from: N */
    public final void m36300N(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "members");
        if (z11) {
            AbstractC1915h.c m10492a = AbstractC1915h.m10492a(new a(this.f38943s, list));
            AbstractC19074t.m100207e(m10492a, "calculateDiff(...)");
            this.f38943s.clear();
            this.f38943s.addAll(list);
            m10492a.m10505e(this);
            return;
        }
        this.f38943s.clear();
        this.f38943s.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38943s.size();
    }
}
