package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23126l;
import p588vw.C28655u;

/* renamed from: com.zing.zalo.adapters.q */
/* loaded from: classes3.dex */
public class C7178q extends BaseAdapter {

    /* renamed from: p */
    private final String f39286p = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /* renamed from: q */
    ArrayList f39287q;

    /* renamed from: r */
    public Context f39288r;

    /* renamed from: s */
    public LayoutInflater f39289s;

    /* renamed from: com.zing.zalo.adapters.q$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public TextView f39290a;

        /* renamed from: b */
        public TextView f39291b;

        /* renamed from: c */
        public View f39292c;

        /* renamed from: d */
        public TextView f39293d;

        /* renamed from: e */
        public boolean f39294e = false;
    }

    public C7178q(Context context, ArrayList arrayList) {
        this.f39288r = context;
        this.f39287q = new ArrayList(arrayList);
        this.f39289s = (LayoutInflater) this.f39288r.getSystemService("layout_inflater");
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C28655u getItem(int i11) {
        return (C28655u) this.f39287q.get(i11);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public void m36476b(ArrayList arrayList) {
        this.f39287q = new ArrayList(arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f39287q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        return !isEnabled(i11) ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int i12 = 0;
        if (view == null) {
            aVar = new a();
            if (getItemViewType(i11) == 0) {
                view = this.f39289s.inflate(AbstractC7409c0.country_code_row, viewGroup, false);
                aVar.f39290a = (TextView) view.findViewById(AbstractC6918a0.name);
                aVar.f39291b = (TextView) view.findViewById(AbstractC6918a0.phone);
                aVar.f39292c = view.findViewById(AbstractC6918a0.separate_line);
            } else if (getItemViewType(i11) == 1) {
                view = this.f39289s.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false);
                aVar.f39293d = (TextView) view.findViewById(AbstractC6918a0.title_row);
            }
            if (view != null) {
                view.setTag(aVar);
            }
        } else {
            aVar = (a) view.getTag();
        }
        try {
            C28655u item = getItem(i11);
            String str = item.f132863a;
            if (isEnabled(i11)) {
                aVar.f39294e = true;
                aVar.f39291b.setText("+" + item.f132865c);
                aVar.f39291b.setVisibility(0);
                aVar.f39290a.setText(str);
                aVar.f39290a.setVisibility(0);
                View view2 = aVar.f39292c;
                if (item.f132871i) {
                    i12 = 8;
                }
                view2.setVisibility(i12);
            } else {
                aVar.f39294e = false;
                aVar.f39293d.setText(str);
            }
        } catch (Exception e11) {
            AbstractC23126l.m118629c("PhoneListAdapter getView: " + e11.toString());
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        try {
            ArrayList arrayList = this.f39287q;
            if (arrayList != null && arrayList.size() > i11) {
                return ((C28655u) this.f39287q.get(i11)).f132867e;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }
}
