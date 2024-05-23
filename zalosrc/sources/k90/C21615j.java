package k90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import me0.C23278z2;
import p133ek.C18460c;
import p354n3.C23528a;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;

/* renamed from: k90.j */
/* loaded from: classes6.dex */
public final class C21615j extends BaseAdapter {

    /* renamed from: p */
    private ArrayList f104975p;

    /* renamed from: q */
    private final LayoutInflater f104976q;

    /* renamed from: r */
    private final C23528a f104977r;

    /* renamed from: s */
    private boolean f104978s;

    /* renamed from: k90.j$a */
    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a */
        private TextView f104979a;

        /* renamed from: b */
        private TextView f104980b;

        /* renamed from: c */
        private RecyclingImageView f104981c;

        /* renamed from: a */
        public final RecyclingImageView m111552a() {
            return this.f104981c;
        }

        /* renamed from: b */
        public final TextView m111553b() {
            return this.f104980b;
        }

        /* renamed from: c */
        public final TextView m111554c() {
            return this.f104979a;
        }

        /* renamed from: d */
        public final void m111555d(RecyclingImageView recyclingImageView) {
            this.f104981c = recyclingImageView;
        }

        /* renamed from: e */
        public final void m111556e(TextView textView) {
            this.f104980b = textView;
        }

        /* renamed from: f */
        public final void m111557f(TextView textView) {
            this.f104979a = textView;
        }
    }

    public C21615j(InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC27218a, "ac");
        LayoutInflater from = LayoutInflater.from(interfaceC27218a.getContext());
        AbstractC19074t.m100207e(from, "from(...)");
        this.f104976q = from;
        this.f104977r = new C23528a(interfaceC27218a.getContext());
        this.f104975p = new ArrayList();
    }

    /* renamed from: b */
    private final C18460c m111547b(int i11) {
        Object obj = this.f104975p.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return (C18460c) obj;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C18460c getItem(int i11) {
        if (i11 >= 0 && i11 < this.f104975p.size()) {
            return (C18460c) this.f104975p.get(i11);
        }
        return null;
    }

    /* renamed from: c */
    public final void m111549c(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "locations");
        this.f104975p = new ArrayList(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public final void m111550d(boolean z11) {
        this.f104978s = z11;
    }

    /* renamed from: e */
    public final void m111551e(C18460c c18460c) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f104975p.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        C18460c m111547b = m111547b(i11);
        String m97787a = m111547b.m97787a();
        String m97788b = m111547b.m97788b();
        String m97789c = m111547b.m97789c();
        String m97790d = m111547b.m97790d();
        if (view == null) {
            view = this.f104976q.inflate(AbstractC7409c0.listitem_location_foursquare, viewGroup, false);
            AbstractC19074t.m100207e(view, "inflate(...)");
            aVar = new a();
            aVar.m111555d((RecyclingImageView) view.findViewById(AbstractC6918a0.location_icon));
            aVar.m111556e((TextView) view.findViewById(AbstractC6918a0.location_address));
            aVar.m111557f((TextView) view.findViewById(AbstractC6918a0.location_title));
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            AbstractC19074t.m100206d(tag, "null cannot be cast to non-null type com.zing.zalo.ui.picker.location.LocationFoursquareAdapter.LocationViewHolder");
            aVar = (a) tag;
        }
        if (AbstractC19074t.m100204b(m97787a, "vitrihientai")) {
            TextView m111554c = aVar.m111554c();
            if (m111554c != null) {
                m111554c.setVisibility(0);
            }
            TextView m111554c2 = aVar.m111554c();
            if (m111554c2 != null) {
                m111554c2.setText(AbstractC8020f0.str_location_current_location);
            }
        } else {
            if (m97788b.length() == 0) {
                TextView m111554c3 = aVar.m111554c();
                if (m111554c3 != null) {
                    m111554c3.setVisibility(8);
                }
            } else {
                TextView m111554c4 = aVar.m111554c();
                if (m111554c4 != null) {
                    m111554c4.setVisibility(0);
                }
            }
            TextView m111554c5 = aVar.m111554c();
            if (m111554c5 != null) {
                m111554c5.setText(m97788b);
            }
        }
        if (m97789c.length() == 0) {
            TextView m111553b = aVar.m111553b();
            if (m111553b != null) {
                m111553b.setVisibility(8);
            }
        } else {
            TextView m111553b2 = aVar.m111553b();
            if (m111553b2 != null) {
                m111553b2.setVisibility(0);
            }
        }
        TextView m111553b3 = aVar.m111553b();
        if (m111553b3 != null) {
            m111553b3.setText(m97789c);
        }
        if (m97790d.length() == 0) {
            if (AbstractC19074t.m100204b(m97787a, "vitrihientai")) {
                ((C23528a) this.f104977r.m123612r(aVar.m111552a())).m123613s(AbstractC16803z.ic_fsquare_curentloc);
            } else {
                ((C23528a) this.f104977r.m123612r(aVar.m111552a())).m123613s(AbstractC16803z.icn_livelocation_default);
            }
        } else if (this.f104978s && !C23999j.m125696L2(m97790d, C23278z2.m120155t0())) {
            ((C23528a) this.f104977r.m123612r(aVar.m111552a())).m123613s(AbstractC16803z.icn_livelocation_default);
        } else {
            ((C23528a) this.f104977r.m123612r(aVar.m111552a())).m123618x(m97790d, C23278z2.m120155t0());
        }
        return view;
    }
}
