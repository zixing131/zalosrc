package com.zing.zalo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.moduleview.message.GroupConfirmInviteItemModuleView;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.i1 */
/* loaded from: classes3.dex */
public class C7092i1 extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    private final Context f38772s;

    /* renamed from: t */
    private final C23528a f38773t;

    /* renamed from: r */
    private List f38771r = new ArrayList();

    /* renamed from: u */
    public boolean f38774u = false;

    /* renamed from: com.zing.zalo.adapters.i1$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        public a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo36166i0(InviteContactProfile inviteContactProfile) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.i1$b */
    /* loaded from: classes3.dex */
    public static class b extends a {

        /* renamed from: I */
        GroupConfirmInviteItemModuleView f38775I;

        public b(GroupConfirmInviteItemModuleView groupConfirmInviteItemModuleView) {
            super(groupConfirmInviteItemModuleView);
            this.f38775I = groupConfirmInviteItemModuleView;
        }

        @Override // com.zing.zalo.adapters.C7092i1.a
        /* renamed from: i0 */
        public void mo36166i0(InviteContactProfile inviteContactProfile) {
            this.f38775I.m69780V(inviteContactProfile);
        }
    }

    public C7092i1(Context context, C23528a c23528a) {
        this.f38772s = context;
        this.f38773t = c23528a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        try {
            aVar.mo36166i0((InviteContactProfile) this.f38771r.get(i11));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 == 0) {
            try {
                return new b(new GroupConfirmInviteItemModuleView(this.f38772s, this.f38773t));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return new a(new View(viewGroup.getContext()));
    }

    /* renamed from: N */
    public void m36165N(List list) {
        this.f38771r = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38771r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((InviteContactProfile) this.f38771r.get(i11)).f42428p;
    }
}
