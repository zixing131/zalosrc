package g50;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import h50.C19880a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p649xl.C30099w6;

/* renamed from: g50.b */
/* loaded from: classes5.dex */
public final class C19229b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f95702r = new ArrayList();

    /* renamed from: s */
    private Set f95703s = new LinkedHashSet();

    /* renamed from: t */
    private b f95704t;

    /* renamed from: g50.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C30099w6 f95705I;

        /* renamed from: J */
        private final RobotoTextView f95706J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            C30099w6 m148648a = C30099w6.m148648a(view);
            AbstractC19074t.m100207e(m148648a, "bind(...)");
            this.f95705I = m148648a;
            RobotoTextView robotoTextView = m148648a.f139789r;
            AbstractC19074t.m100207e(robotoTextView, "name");
            this.f95706J = robotoTextView;
        }

        /* renamed from: i0 */
        public final void m100891i0(C19880a c19880a) {
            AbstractC19074t.m100208f(c19880a, "info");
            this.f95706J.setText(c19880a.m103566a());
        }

        /* renamed from: j0 */
        public final C30099w6 m100892j0() {
            return this.f95705I;
        }
    }

    /* renamed from: g50.b$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo58662a(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m100883P(C19229b c19229b, a aVar, C19880a c19880a, View view) {
        AbstractC19074t.m100208f(c19229b, "this$0");
        AbstractC19074t.m100208f(aVar, "$holder");
        AbstractC19074t.m100208f(c19880a, "$item");
        CheckBox checkBox = aVar.m100892j0().f139788q;
        AbstractC19074t.m100207e(checkBox, "checkbox");
        c19229b.m100884T(checkBox, c19880a);
    }

    /* renamed from: T */
    private final void m100884T(CheckBox checkBox, C19880a c19880a) {
        boolean z11 = !checkBox.isChecked();
        checkBox.setChecked(z11);
        if (z11) {
            this.f95703s.add(c19880a);
        } else {
            this.f95703s.remove(c19880a);
        }
        b bVar = this.f95704t;
        if (bVar != null) {
            bVar.mo58662a(this.f95703s.size());
        }
    }

    /* renamed from: M */
    public final Set m100885M() {
        return this.f95703s;
    }

    /* renamed from: N */
    public final C19880a m100886N(int i11) {
        if (i11 >= 0 && i11 < this.f95702r.size()) {
            return (C19880a) this.f95702r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        try {
            aVar.m100891i0((C19880a) this.f95702r.get(i11));
            final C19880a m100886N = m100886N(i11);
            if (m100886N == null) {
                return;
            }
            aVar.m100892j0().f139788q.setChecked(m100885M().contains(m100886N));
            aVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: g50.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C19229b.m100883P(C19229b.this, aVar, m100886N, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_row_call_log, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        return new a(inflate);
    }

    /* renamed from: R */
    public final void m100889R(List list) {
        AbstractC19074t.m100208f(list, "mData");
        this.f95702r = list;
    }

    /* renamed from: S */
    public final void m100890S(b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        this.f95704t = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f95702r.size();
    }
}
