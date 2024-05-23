package com.zing.zalo.adapters;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.message.NormalMsgModuleView;
import com.zing.zalo.p077ui.moduleview.message.TabMsgItemModulesView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p132ej.C18440b;
import p132ej.C18451m;

/* renamed from: com.zing.zalo.adapters.c4 */
/* loaded from: classes3.dex */
public class C7028c4 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    public boolean f38421r = false;

    /* renamed from: s */
    boolean f38422s = false;

    /* renamed from: t */
    ArrayList f38423t = new ArrayList();

    /* renamed from: u */
    public HashMap f38424u = new HashMap();

    /* renamed from: com.zing.zalo.adapters.c4$a */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        TabMsgItemModulesView f38425I;

        public a(TabMsgItemModulesView tabMsgItemModulesView) {
            super(tabMsgItemModulesView);
            this.f38425I = tabMsgItemModulesView;
        }

        /* renamed from: i0 */
        public void m35935i0(C18451m c18451m, int i11) {
            try {
                this.f38425I.mo69822C(c18451m, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: L */
    public void m35926L() {
        this.f38424u.clear();
        for (int i11 = 0; i11 < this.f38423t.size(); i11++) {
            this.f38424u.put(((C18451m) this.f38423t.get(i11)).mo97719a(), (C18451m) this.f38423t.get(i11));
        }
    }

    /* renamed from: M */
    public void m35927M() {
        this.f38424u.clear();
    }

    /* renamed from: N */
    public ContactProfile m35928N(int i11) {
        C18451m m35931Q = m35931Q(i11);
        if (m35931Q instanceof C18440b) {
            return ((C18440b) m35931Q).m97729o().m40998a();
        }
        return null;
    }

    /* renamed from: O */
    public List m35929O() {
        return new ArrayList(this.f38424u.values());
    }

    /* renamed from: P */
    public List m35930P() {
        return new ArrayList(this.f38424u.keySet());
    }

    /* renamed from: Q */
    public C18451m m35931Q(int i11) {
        if (i11 >= 0 && i11 < this.f38423t.size()) {
            return (C18451m) this.f38423t.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        aVar.m35935i0(m35931Q(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        return new a(new NormalMsgModuleView(viewGroup.getContext(), null, null, 3));
    }

    /* renamed from: T */
    public void m35934T(ArrayList arrayList) {
        if (this.f38421r) {
            this.f38421r = false;
        }
        this.f38423t = arrayList;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38423t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return 0;
    }
}
