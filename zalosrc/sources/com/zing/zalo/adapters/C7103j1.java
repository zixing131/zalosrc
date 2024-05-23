package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import java.util.ArrayList;
import me0.C23278z2;
import p354n3.C23528a;
import p716zh.C32018m5;

/* renamed from: com.zing.zalo.adapters.j1 */
/* loaded from: classes3.dex */
public class C7103j1 extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    C23528a f38826s;

    /* renamed from: r */
    ArrayList f38825r = new ArrayList();

    /* renamed from: t */
    boolean f38827t = false;

    /* renamed from: com.zing.zalo.adapters.j1$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        public a(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo36195i0(int i11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.j1$b */
    /* loaded from: classes3.dex */
    public class b extends a {

        /* renamed from: I */
        TextView f38828I;

        /* renamed from: J */
        RecyclingImageView f38829J;

        public b(View view) {
            super(view);
            this.f38829J = (RecyclingImageView) view.findViewById(AbstractC6918a0.icon_view);
            this.f38828I = (TextView) view.findViewById(AbstractC6918a0.title_tv);
        }

        @Override // com.zing.zalo.adapters.C7103j1.a
        /* renamed from: i0 */
        public void mo36195i0(int i11) {
            super.mo36195i0(i11);
            C32018m5 c32018m5 = (C32018m5) C7103j1.this.f38825r.get(i11);
            ((C23528a) C7103j1.this.f38826s.m123612r(this.f38829J)).m123618x(c32018m5.f147389c, C23278z2.m120146o0());
            this.f38828I.setText(c32018m5.f147388b);
        }
    }

    /* renamed from: com.zing.zalo.adapters.j1$c */
    /* loaded from: classes3.dex */
    public class c extends a {

        /* renamed from: I */
        TextView f38831I;

        /* renamed from: J */
        TextView f38832J;

        /* renamed from: K */
        RecyclingImageView f38833K;

        public c(View view) {
            super(view);
            this.f38833K = (RecyclingImageView) view.findViewById(AbstractC6918a0.icon_view);
            this.f38831I = (TextView) view.findViewById(AbstractC6918a0.title_tv);
            this.f38832J = (TextView) view.findViewById(AbstractC6918a0.intro_tv);
        }

        @Override // com.zing.zalo.adapters.C7103j1.a
        /* renamed from: i0 */
        public void mo36195i0(int i11) {
            C32018m5 c32018m5 = (C32018m5) C7103j1.this.f38825r.get(i11);
            ((C23528a) C7103j1.this.f38826s.m123612r(this.f38833K)).m123618x(c32018m5.f147389c, C23278z2.m120146o0());
            this.f38831I.setText(c32018m5.f147388b);
            this.f38832J.setText(c32018m5.f147392f);
        }
    }

    public C7103j1(C23528a c23528a) {
        this.f38826s = c23528a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        aVar.mo36195i0(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.group_content_intro_row, viewGroup, false));
        }
        return new b(LayoutInflater.from(context).inflate(AbstractC7409c0.group_content_suggest_row, viewGroup, false));
    }

    /* renamed from: N */
    public void m36194N(ArrayList arrayList) {
        this.f38825r = new ArrayList(arrayList);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38825r.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C32018m5) this.f38825r.get(i11)).f147387a;
    }
}
