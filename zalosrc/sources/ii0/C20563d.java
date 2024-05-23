package ii0;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.AbstractC2065a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mm0.AbstractC23350e;

/* renamed from: ii0.d */
/* loaded from: classes7.dex */
public final class C20563d extends AbstractC2065a {

    /* renamed from: c */
    private ArrayList f101090c = new ArrayList();

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: a */
    public void mo11217a(ViewGroup viewGroup, int i11, Object obj) {
        AbstractC19074t.m100208f(viewGroup, "container");
        AbstractC19074t.m100208f(obj, "object");
        View view = (View) obj;
        viewGroup.removeView(view);
        this.f101090c.remove(view);
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: d */
    public int mo11220d() {
        return this.f101090c.size();
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: h */
    public Object mo11224h(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "container");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("instantiateItem for ");
        sb2.append(i11);
        if (this.f101090c.size() > i11) {
            AbstractC23350e.m122774d("MyViewPagerAdapter", "instantiateItem views.get(position) " + this.f101090c.get(i11));
            Object obj = this.f101090c.get(i11);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) obj;
            viewGroup.addView(viewGroup2);
            return viewGroup2;
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.AbstractC2065a
    /* renamed from: i */
    public boolean mo11225i(View view, Object obj) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(obj, "object");
        return AbstractC19074t.m100204b(view, (View) obj);
    }

    /* renamed from: t */
    public final void m106976t(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listView");
        this.f101090c.clear();
        this.f101090c.addAll(arrayList);
        m11226j();
    }
}
