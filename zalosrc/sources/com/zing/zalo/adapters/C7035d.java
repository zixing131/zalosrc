package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.adapters.d */
/* loaded from: classes3.dex */
public class C7035d extends BaseAdapter implements Filterable {

    /* renamed from: p */
    protected List f38456p;

    /* renamed from: r */
    protected int f38458r;

    /* renamed from: s */
    protected int f38459s;

    /* renamed from: v */
    protected Context f38462v;

    /* renamed from: w */
    protected ArrayList f38463w;

    /* renamed from: x */
    protected a f38464x;

    /* renamed from: y */
    protected LayoutInflater f38465y;

    /* renamed from: q */
    protected final Object f38457q = new Object();

    /* renamed from: t */
    protected int f38460t = 0;

    /* renamed from: u */
    protected boolean f38461u = true;

    /* renamed from: com.zing.zalo.adapters.d$a */
    /* loaded from: classes3.dex */
    private class a extends Filter {
        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            C7035d c7035d = C7035d.this;
            if (c7035d.f38463w == null) {
                synchronized (c7035d.f38457q) {
                    C7035d.this.f38463w = new ArrayList(C7035d.this.f38456p);
                }
            }
            if (charSequence != null && charSequence.length() != 0) {
                String lowerCase = charSequence.toString().toLowerCase();
                synchronized (C7035d.this.f38457q) {
                    arrayList2 = new ArrayList(C7035d.this.f38463w);
                }
                int size = arrayList2.size();
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = arrayList2.get(i11);
                    String lowerCase2 = obj.toString().toLowerCase();
                    if (lowerCase2.startsWith(lowerCase)) {
                        arrayList3.add(obj);
                    } else {
                        String[] split = lowerCase2.split(" ");
                        int length = split.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                break;
                            }
                            if (split[i12].startsWith(lowerCase)) {
                                arrayList3.add(obj);
                                break;
                            }
                            i12++;
                        }
                    }
                }
                filterResults.values = arrayList3;
                filterResults.count = arrayList3.size();
            } else {
                synchronized (C7035d.this.f38457q) {
                    arrayList = new ArrayList(C7035d.this.f38463w);
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            C7035d c7035d = C7035d.this;
            c7035d.f38456p = (List) filterResults.values;
            if (filterResults.count > 0) {
                c7035d.notifyDataSetChanged();
            } else {
                c7035d.notifyDataSetInvalidated();
            }
        }

        private a() {
        }
    }

    public C7035d(Context context, int i11) {
        m35951f(context, i11, 0, new ArrayList());
    }

    /* renamed from: c */
    public static C7035d m35949c(Context context, int i11, int i12) {
        return new C7035d(context, i12, context.getResources().getTextArray(i11));
    }

    /* renamed from: d */
    private View m35950d(int i11, View view, ViewGroup viewGroup, int i12) {
        TextView textView;
        if (view == null) {
            view = this.f38465y.inflate(i12, viewGroup, false);
        }
        try {
            int i13 = this.f38460t;
            if (i13 == 0) {
                textView = (TextView) view;
            } else {
                textView = (TextView) view.findViewById(i13);
            }
            Object item = getItem(i11);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
            } else {
                textView.setText(item.toString());
            }
            return view;
        } catch (ClassCastException e11) {
            AbstractC23350e.m122774d("ArrayAdapter", "You must supply a resource ID for a TextView");
            throw new IllegalStateException("ArrayAdapter requires the resource ID to be a TextView", e11);
        }
    }

    /* renamed from: f */
    private void m35951f(Context context, int i11, int i12, List list) {
        this.f38462v = context;
        this.f38465y = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38459s = i11;
        this.f38458r = i11;
        this.f38456p = list;
        this.f38460t = i12;
    }

    /* renamed from: a */
    public void m35952a(Collection collection) {
        synchronized (this.f38457q) {
            try {
                ArrayList arrayList = this.f38463w;
                if (arrayList != null) {
                    arrayList.addAll(collection);
                } else {
                    this.f38456p.addAll(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f38461u) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void m35953b() {
        synchronized (this.f38457q) {
            try {
                ArrayList arrayList = this.f38463w;
                if (arrayList != null) {
                    arrayList.clear();
                } else {
                    this.f38456p.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f38461u) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    public Context m35954e() {
        return this.f38462v;
    }

    /* renamed from: g */
    public void m35955g(Object obj) {
        synchronized (this.f38457q) {
            try {
                ArrayList arrayList = this.f38463w;
                if (arrayList != null) {
                    arrayList.remove(obj);
                } else {
                    this.f38456p.remove(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f38461u) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f38456p.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        return m35950d(i11, view, viewGroup, this.f38459s);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f38464x == null) {
            this.f38464x = new a();
        }
        return this.f38464x;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f38456p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        return m35950d(i11, view, viewGroup, this.f38458r);
    }

    /* renamed from: h */
    public void m35956h(int i11) {
        this.f38459s = i11;
    }

    /* renamed from: i */
    public void m35957i(boolean z11) {
        this.f38461u = z11;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f38461u = true;
    }

    public C7035d(Context context, int i11, Object[] objArr) {
        m35951f(context, i11, 0, Arrays.asList(objArr));
    }

    public C7035d(Context context, int i11, List list) {
        m35951f(context, i11, 0, list);
    }
}
