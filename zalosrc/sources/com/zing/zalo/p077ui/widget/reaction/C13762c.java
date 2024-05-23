package com.zing.zalo.p077ui.widget.reaction;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView;
import java.util.List;
import ph.C24751d;
import ph.C24753f;

/* renamed from: com.zing.zalo.ui.widget.reaction.c */
/* loaded from: classes6.dex */
public class C13762c extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    Context f71231r;

    /* renamed from: s */
    List f71232s;

    /* renamed from: t */
    ZDSReactionDetailItemView.InterfaceC13749a f71233t;

    /* renamed from: u */
    int f71234u;

    /* renamed from: v */
    boolean f71235v;

    /* renamed from: com.zing.zalo.ui.widget.reaction.c$a */
    /* loaded from: classes6.dex */
    private static class a extends RecyclerView.AbstractC1876c0 {
        a(View view) {
            super(view);
        }
    }

    public C13762c(Context context, C24751d c24751d, int i11, ZDSReactionDetailItemView.InterfaceC13749a interfaceC13749a) {
        C24753f c24753f;
        this.f71231r = context;
        this.f71234u = i11;
        if (i11 == 0) {
            this.f71232s = c24751d.m128563d();
        } else {
            List m128566i = c24751d.m128566i(true);
            if (m128566i.size() > 0) {
                c24753f = (C24753f) m128566i.get(i11 - 1);
            } else {
                c24753f = null;
            }
            if (c24753f != null) {
                this.f71232s = c24751d.m128564f(c24753f.m128597j());
            }
        }
        this.f71233t = interfaceC13749a;
        this.f71235v = i11 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        ((ZDSReactionDetailItemView) abstractC1876c0.f7784p).m76826q((C24753f) this.f71232s.get(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new a(new ZDSReactionDetailItemView(this.f71231r, this.f71234u, this.f71233t));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f71232s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
