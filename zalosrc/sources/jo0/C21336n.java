package jo0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.AbstractC2065a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import jo0.C21326d;
import ko0.C21786a;
import zm.voip.service.AbstractC32273e3;

/* renamed from: jo0.n */
/* loaded from: classes7.dex */
public final class C21336n extends AbstractC2065a {

    /* renamed from: c */
    private Context f103918c;

    /* renamed from: d */
    private C21326d.b f103919d;

    /* renamed from: jo0.n$a */
    /* loaded from: classes7.dex */
    public static final class a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C21326d f103920a;

        a(C21326d c21326d) {
            this.f103920a = c21326d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            try {
                C21326d c21326d = this.f103920a;
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c21326d.m110429T(z11);
                this.f103920a.m10008p();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C21336n(Context context, C21326d.b bVar) {
        AbstractC19074t.m100208f(context, "mContext");
        AbstractC19074t.m100208f(bVar, "onClickStickerLister");
        this.f103918c = context;
        this.f103919d = bVar;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: a */
    public void mo11217a(ViewGroup viewGroup, int i11, Object obj) {
        AbstractC19074t.m100208f(viewGroup, "container");
        AbstractC19074t.m100208f(obj, "object");
        try {
            viewGroup.removeView((View) obj);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: d */
    public int mo11220d() {
        return AbstractC32273e3.m155748Q().mo155845S().size();
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: e */
    public int mo11221e(Object obj) {
        AbstractC19074t.m100208f(obj, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: h */
    public Object mo11224h(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "container");
        View findViewById = LayoutInflater.from(this.f103918c).inflate(AbstractC7409c0.call_sticker_list, viewGroup, false).findViewById(AbstractC6918a0.emoticon_selector_grid);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        C21326d c21326d = new C21326d(this.f103918c);
        c21326d.m110430U(true);
        c21326d.m110428S(this.f103919d);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f103918c, 0, false));
        recyclerView.setAdapter(c21326d);
        recyclerView.setVisibility(0);
        recyclerView.m9826E(new a(c21326d));
        c21326d.m110427R(((C21786a) AbstractC32273e3.m155748Q().mo155845S().get(i11)).m112432a());
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: i */
    public boolean mo11225i(View view, Object obj) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(obj, "object");
        return AbstractC19074t.m100204b(view, obj);
    }
}
