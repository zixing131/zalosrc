package u60;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.chat.widget.trendingkwd.TrendingKwdView;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p611wj.C29059g;

/* renamed from: u60.b */
/* loaded from: classes5.dex */
public class C27043b extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    b f127695s;

    /* renamed from: t */
    int f127696t = -1;

    /* renamed from: r */
    List f127694r = new ArrayList();

    /* renamed from: u60.b$a */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        public a(View view) {
            super(view);
        }
    }

    /* renamed from: u60.b$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo139208a(C29059g c29059g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m139202O(View view) {
        try {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue >= this.f127694r.size() || this.f127696t == intValue) {
                return;
            }
            this.f127696t = intValue;
            m10008p();
            b bVar = this.f127695s;
            if (bVar != null) {
                bVar.mo139208a((C29059g) this.f127694r.get(this.f127696t));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        boolean z11;
        ((TrendingKwdView) abstractC1876c0.f7784p).setData((C29059g) this.f127694r.get(i11));
        abstractC1876c0.f7784p.setTag(Integer.valueOf(i11));
        View view = abstractC1876c0.f7784p;
        if (i11 == this.f127696t) {
            z11 = true;
        } else {
            z11 = false;
        }
        view.setSelected(z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        TrendingKwdView trendingKwdView = new TrendingKwdView(viewGroup.getContext());
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, AbstractC23136l9.m118742r(24.0f));
        layoutParams.setMargins(0, AbstractC23136l9.m118742r(2.0f), 0, AbstractC23136l9.m118742r(6.0f));
        trendingKwdView.setLayoutParams(layoutParams);
        trendingKwdView.setOnClickListener(new View.OnClickListener() { // from class: u60.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27043b.this.m139202O(view);
            }
        });
        return new a(trendingKwdView);
    }

    /* renamed from: M */
    public int m139203M() {
        return this.f127696t;
    }

    /* renamed from: N */
    public boolean m139204N() {
        if (this.f127694r.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public void m139205P(List list) {
        this.f127694r = new ArrayList(list);
        m10008p();
    }

    /* renamed from: Q */
    public void m139206Q(b bVar) {
        this.f127695s = bVar;
    }

    /* renamed from: R */
    public void m139207R(int i11) {
        this.f127696t = i11;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f127694r.size();
    }
}
