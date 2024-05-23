package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.widget.ItemContactView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23262x6;
import me0.C23212s8;

/* renamed from: com.zing.zalo.adapters.h */
/* loaded from: classes3.dex */
public class C7079h extends BaseAdapter {

    /* renamed from: p */
    ArrayList f38698p;

    /* renamed from: q */
    List f38699q;

    /* renamed from: r */
    CharSequence f38700r;

    /* renamed from: v */
    public Context f38704v;

    /* renamed from: w */
    public LayoutInflater f38705w;

    /* renamed from: x */
    b f38706x;

    /* renamed from: z */
    a f38708z;

    /* renamed from: s */
    public boolean f38701s = false;

    /* renamed from: t */
    public long f38702t = 0;

    /* renamed from: u */
    public HashMap f38703u = new HashMap();

    /* renamed from: y */
    final Object f38707y = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.h$a */
    /* loaded from: classes3.dex */
    public class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            C7079h c7079h = C7079h.this;
            if (c7079h.f38699q == null) {
                synchronized (c7079h.f38707y) {
                    C7079h.this.f38699q = new ArrayList(C7079h.this.f38698p);
                }
            }
            if (charSequence != null && charSequence.length() != 0) {
                String m120002o = AbstractC23262x6.m120002o(charSequence.toString().toLowerCase(Locale.getDefault()));
                synchronized (C7079h.this.f38707y) {
                    arrayList2 = new ArrayList(C7079h.this.f38698p);
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
                synchronized (C7079h.this.f38707y) {
                    arrayList = new ArrayList(C7079h.this.f38698p);
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C7079h c7079h = C7079h.this;
            c7079h.f38700r = charSequence;
            c7079h.f38699q = (List) filterResults.values;
            if (filterResults.count > 0) {
                C7079h.super.notifyDataSetChanged();
            } else {
                c7079h.notifyDataSetInvalidated();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.h$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: C0 */
        void mo36129C0(String str, int i11);

        Context getContext();

        /* renamed from: wg */
        boolean mo36130wg();
    }

    public C7079h(b bVar, ArrayList arrayList) {
        this.f38704v = bVar.getContext();
        this.f38698p = new ArrayList(arrayList);
        this.f38703u.clear();
        this.f38705w = (LayoutInflater) this.f38704v.getSystemService("layout_inflater");
        this.f38699q = new ArrayList(arrayList);
        this.f38706x = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m36126d(int i11, ContactProfile contactProfile, View view) {
        b bVar = this.f38706x;
        if (bVar != null && !bVar.mo36130wg() && i11 >= 0 && i11 < this.f38698p.size() && System.currentTimeMillis() - this.f38702t > 300) {
            this.f38706x.mo36129C0(contactProfile.f42434r, i11);
            this.f38702t = System.currentTimeMillis();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: c */
    public Filter m36127c() {
        if (this.f38708z == null) {
            this.f38708z = new a();
        }
        return this.f38708z;
    }

    /* renamed from: e */
    public void m36128e(ArrayList arrayList) {
        this.f38698p = new ArrayList(arrayList);
        this.f38699q = new ArrayList(arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f38699q.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f38699q.get(i11);
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
            itemContactView.setIdTracking("ITEM_BLACK_LIST");
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
            itemContactView.f68292H.setText(MainApplication.getAppContext().getString(AbstractC8020f0.str_tv_unblock));
            itemContactView.f68292H.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C7079h.this.m36126d(i11, contactProfile, view3);
                }
            });
            Avatar avatar = itemContactView.f68291G;
            avatar.setImageDrawable(C23212s8.m119609q(avatar.getContext(), AbstractC16781w.default_avatar));
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
        return ((ContactProfile) this.f38698p.get(i11)).m40366G0();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (this.f38700r != null) {
            m36127c().filter(this.f38700r);
        } else {
            this.f38699q = new ArrayList(this.f38698p);
        }
        super.notifyDataSetChanged();
    }
}
