package ko0;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p133ek.AbstractC18458a;

/* renamed from: ko0.c */
/* loaded from: classes7.dex */
public final class C21788c extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final a f105751r;

    /* renamed from: s */
    private List f105752s;

    /* renamed from: t */
    private int f105753t;

    /* renamed from: u */
    private String f105754u;

    /* renamed from: ko0.c$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo112450a(int i11);
    }

    /* renamed from: ko0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final TextView f105755I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.title);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f105755I = (TextView) findViewById;
        }

        /* renamed from: i0 */
        public final TextView m112451i0() {
            return this.f105755I;
        }
    }

    public C21788c(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f105751r = aVar;
        this.f105752s = new ArrayList();
        String str = AbstractC18458a.f93019a;
        AbstractC19074t.m100207e(str, "defaultLanguage");
        this.f105754u = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m112445O(C21788c c21788c, b bVar, View view) {
        AbstractC19074t.m100208f(c21788c, "this$0");
        AbstractC19074t.m100208f(bVar, "$holder");
        view.setSelected(true);
        c21788c.f105751r.mo112450a(bVar.m9929A());
    }

    /* renamed from: M */
    public final void m112446M(int i11) {
        this.f105753t = i11;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final b bVar, int i11) {
        String m112433b;
        boolean z11;
        AbstractC19074t.m100208f(bVar, "holder");
        if (TextUtils.equals(this.f105754u, "vi")) {
            m112433b = ((C21786a) this.f105752s.get(i11)).m112434c();
        } else {
            m112433b = ((C21786a) this.f105752s.get(i11)).m112433b();
        }
        bVar.m112451i0().setText(m112433b);
        bVar.m112451i0().setOnClickListener(new View.OnClickListener() { // from class: ko0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21788c.m112445O(C21788c.this, bVar, view);
            }
        });
        TextView m112451i0 = bVar.m112451i0();
        if (i11 == this.f105753t) {
            z11 = true;
        } else {
            z11 = false;
        }
        m112451i0.setSelected(z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.call_item_sticker_title, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        return new b(inflate);
    }

    /* renamed from: Q */
    public final void m112449Q(List list) {
        AbstractC19074t.m100208f(list, "items");
        this.f105752s = list;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f105752s.size();
    }
}
