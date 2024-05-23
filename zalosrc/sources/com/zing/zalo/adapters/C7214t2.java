package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.widget.ItemContactView;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23262x6;

/* renamed from: com.zing.zalo.adapters.t2 */
/* loaded from: classes3.dex */
public class C7214t2 extends BaseAdapter {

    /* renamed from: p */
    ArrayList f39568p;

    /* renamed from: q */
    List f39569q;

    /* renamed from: r */
    CharSequence f39570r;

    /* renamed from: v */
    public Context f39574v;

    /* renamed from: w */
    b f39575w;

    /* renamed from: x */
    public LayoutInflater f39576x;

    /* renamed from: z */
    a f39578z;

    /* renamed from: s */
    boolean f39571s = false;

    /* renamed from: t */
    long f39572t = 0;

    /* renamed from: u */
    public HashMap f39573u = new HashMap();

    /* renamed from: y */
    final Object f39577y = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.t2$a */
    /* loaded from: classes3.dex */
    public class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            C7214t2 c7214t2 = C7214t2.this;
            if (c7214t2.f39569q == null) {
                synchronized (c7214t2.f39577y) {
                    C7214t2.this.f39569q = new ArrayList(C7214t2.this.f39568p);
                }
            }
            if (charSequence != null && charSequence.length() != 0) {
                String m120002o = AbstractC23262x6.m120002o(charSequence.toString().toLowerCase(Locale.getDefault()));
                synchronized (C7214t2.this.f39577y) {
                    arrayList2 = new ArrayList(C7214t2.this.f39568p);
                }
                int size = arrayList2.size();
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < size; i11++) {
                    ContactProfile contactProfile = (ContactProfile) arrayList2.get(i11);
                    if (AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false)).contains(m120002o)) {
                        arrayList3.add(contactProfile);
                    }
                }
                filterResults.values = arrayList3;
                filterResults.count = arrayList3.size();
            } else {
                synchronized (C7214t2.this.f39577y) {
                    arrayList = new ArrayList(C7214t2.this.f39568p);
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C7214t2 c7214t2 = C7214t2.this;
            c7214t2.f39570r = charSequence;
            c7214t2.f39569q = (List) filterResults.values;
            if (filterResults.count > 0) {
                C7214t2.super.notifyDataSetChanged();
            } else {
                c7214t2.notifyDataSetInvalidated();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.t2$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: C0 */
        void mo36720C0(String str, int i11);

        /* renamed from: Xl */
        boolean mo36721Xl();

        Context getContext();
    }

    public C7214t2(b bVar, List list) {
        this.f39574v = bVar.getContext();
        this.f39568p = new ArrayList(list);
        this.f39573u.clear();
        this.f39576x = (LayoutInflater) this.f39574v.getSystemService("layout_inflater");
        this.f39569q = new ArrayList(list);
        this.f39575w = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m36716d(int i11, ContactProfile contactProfile, View view) {
        b bVar = this.f39575w;
        if (bVar != null && !bVar.mo36721Xl() && i11 >= 0 && i11 < this.f39568p.size() && System.currentTimeMillis() - this.f39572t > 300) {
            this.f39575w.mo36720C0(contactProfile.f42434r, i11);
            this.f39572t = System.currentTimeMillis();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: c */
    public Filter m36717c() {
        if (this.f39578z == null) {
            this.f39578z = new a();
        }
        return this.f39578z;
    }

    /* renamed from: e */
    public void m36718e(List list) {
        this.f39568p = new ArrayList(list);
        this.f39569q = new ArrayList(list);
    }

    /* renamed from: f */
    public void m36719f(boolean z11) {
        this.f39571s = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f39569q.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39569q.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(final int i11, View view, ViewGroup viewGroup) {
        View view2;
        ItemContactView itemContactView;
        if (view == null) {
            itemContactView = new ItemContactView(viewGroup.getContext());
            itemContactView.setIdTracking("ITEM_HIDDEN_LIST");
            itemContactView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            view2 = itemContactView;
        } else {
            view2 = view;
            itemContactView = (ItemContactView) view;
        }
        try {
            final ContactProfile contactProfile = (ContactProfile) getItem(i11);
            boolean z11 = false;
            String m40383Q = contactProfile.m40383Q(true, false);
            itemContactView.setTitle(m40383Q);
            itemContactView.f68292H.setText(MainApplication.getAppContext().getString(AbstractC8020f0.str_btn_show));
            itemContactView.f68292H.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C7214t2.this.m36716d(i11, contactProfile, view3);
                }
            });
            itemContactView.f68291G.setImageResource(AbstractC16803z.default_avatar);
            itemContactView.f68291G.m90478m(new C16948d(1, contactProfile.f42434r, m40383Q, contactProfile.f42446v));
            if (i11 < getCount() - 1) {
                z11 = true;
            }
            itemContactView.m90592m(z11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        return ((ContactProfile) this.f39568p.get(i11)).m40366G0();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (this.f39570r != null) {
            m36717c().filter(this.f39570r);
        } else {
            this.f39569q = new ArrayList(this.f39568p);
        }
        super.notifyDataSetChanged();
    }
}
