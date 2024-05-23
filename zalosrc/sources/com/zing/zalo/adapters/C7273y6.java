package com.zing.zalo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C1761c0;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import fi.C18947e;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p716zh.C31887d9;
import y60.C30800b;

/* renamed from: com.zing.zalo.adapters.y6 */
/* loaded from: classes3.dex */
public class C7273y6 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f39887r = new ArrayList();

    /* renamed from: s */
    private final C23528a f39888s;

    /* renamed from: t */
    private C31887d9 f39889t;

    /* renamed from: u */
    private C1761c0 f39890u;

    /* renamed from: com.zing.zalo.adapters.y6$a */
    /* loaded from: classes3.dex */
    static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public RecyclingImageView f39891I;

        /* renamed from: J */
        public TextView f39892J;

        public a(View view) {
            super(view);
            this.f39891I = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_thumb);
            this.f39892J = (TextView) view.findViewById(AbstractC6918a0.tv_keyword);
        }
    }

    public C7273y6(C23528a c23528a, C1761c0 c1761c0) {
        this.f39888s = c23528a;
        this.f39890u = c1761c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m37039M(View view) {
        try {
            int intValue = ((Integer) view.getTag()).intValue();
            String[] strArr = {"100064101", "100064102", "100064103", "100064104", "100064105", "100064106", "100064107", "100064108", "100064109", "100064110", "100064111", "100064112"};
            if (intValue >= 0 && intValue < 12) {
                AbstractC23647d.m123897g(strArr[intValue]);
            }
            C1761c0 c1761c0 = this.f39890u;
            if (c1761c0 != null) {
                c1761c0.mo9224q(((C18947e) this.f39887r.get(intValue)).m99318c());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if (abstractC1876c0 instanceof a) {
            C18947e c18947e = (C18947e) this.f39887r.get(i11);
            C30800b c30800b = new C30800b(c18947e.m99319d(), c18947e.m99317b(), AbstractC23136l9.m118742r(1.0f), c18947e.m99316a());
            c30800b.setBounds(0, 0, abstractC1876c0.f7784p.getWidth(), abstractC1876c0.f7784p.getHeight());
            AbstractC23136l9.m118696b1(abstractC1876c0.f7784p, c30800b);
            abstractC1876c0.f7784p.setTag(Integer.valueOf(i11));
            a aVar = (a) abstractC1876c0;
            aVar.f39892J.setText(c18947e.m99318c());
            aVar.f39892J.setTextColor(c18947e.m99321f());
            ((C23528a) this.f39888s.m123612r(aVar.f39891I)).m123618x(c18947e.m99320e(), C23278z2.m120079K0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.suggest_sticer_search_item, viewGroup, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7273y6.this.m37039M(view);
            }
        });
        return new a(inflate);
    }

    /* renamed from: N */
    public void m37040N(List list, C31887d9 c31887d9) {
        this.f39887r = list;
        this.f39889t = c31887d9;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39887r.size();
    }
}
