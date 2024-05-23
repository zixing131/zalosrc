package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23262x6;

/* renamed from: com.zing.zalo.adapters.t4 */
/* loaded from: classes3.dex */
public class C7216t4 extends C7035d {

    /* renamed from: A */
    Filter f39581A;

    /* renamed from: z */
    List f39582z;

    /* renamed from: com.zing.zalo.adapters.t4$a */
    /* loaded from: classes3.dex */
    class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        public CharSequence convertResultToString(Object obj) {
            return obj.toString();
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            try {
                C7216t4 c7216t4 = C7216t4.this;
                if (c7216t4.f38463w == null) {
                    synchronized (c7216t4.f38457q) {
                        C7216t4.this.f38463w = new ArrayList(C7216t4.this.f38456p);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (charSequence != null && charSequence.length() > 0) {
                C7216t4.this.f39582z.clear();
                String m120002o = AbstractC23262x6.m120002o(charSequence.toString().toLowerCase());
                synchronized (C7216t4.this.f38457q) {
                    arrayList = new ArrayList(C7216t4.this.f38463w);
                }
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str = (String) arrayList.get(i11);
                    if (!TextUtils.isEmpty(str)) {
                        String trim = AbstractC23262x6.m120002o(str).toLowerCase().trim();
                        int indexOf = trim.indexOf(m120002o);
                        if (trim.contains(m120002o) && (indexOf == 0 || trim.charAt(indexOf - 1) == ' ')) {
                            C7216t4.this.f39582z.add((String) arrayList.get(i11));
                        }
                    }
                }
                List list = C7216t4.this.f39582z;
                filterResults.values = list;
                filterResults.count = list.size();
                return filterResults;
            }
            ArrayList arrayList2 = new ArrayList();
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C7216t4 c7216t4;
            if (filterResults != null) {
                try {
                    if (filterResults.count >= 0) {
                        synchronized (C7216t4.this.f38457q) {
                            c7216t4 = C7216t4.this;
                            c7216t4.f38456p = (List) filterResults.values;
                        }
                        if (filterResults.count > 0) {
                            c7216t4.notifyDataSetChanged();
                        } else {
                            c7216t4.notifyDataSetInvalidated();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public C7216t4(Context context, int i11, List list) {
        super(context, i11, list);
        this.f39582z = new ArrayList();
        this.f39581A = new a();
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Filterable
    public Filter getFilter() {
        return this.f39581A;
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        return super.getView(i11, view, viewGroup);
    }
}
