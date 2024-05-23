package v20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import java.util.ArrayList;

/* renamed from: v20.a */
/* loaded from: classes5.dex */
public class C27473a extends BaseAdapter {

    /* renamed from: p */
    ArrayList f129217p;

    /* renamed from: q */
    private boolean f129218q = false;

    /* renamed from: r */
    public Context f129219r;

    /* renamed from: s */
    public LayoutInflater f129220s;

    /* renamed from: v20.a$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public final int f129221a;

        /* renamed from: b */
        public final String f129222b;

        public a(int i11, String str) {
            this.f129221a = i11;
            this.f129222b = str;
        }
    }

    /* renamed from: v20.a$b */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a */
        public TextView f129223a;
    }

    public C27473a(Context context) {
        this.f129219r = context;
        this.f129220s = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public int m140529a(int i11) {
        ArrayList arrayList = this.f129217p;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return ((a) this.f129217p.get(i11)).f129221a;
        }
        return -1;
    }

    /* renamed from: b */
    public void m140530b(ArrayList arrayList) {
        this.f129217p = new ArrayList(arrayList);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f129217p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        ArrayList arrayList = this.f129217p;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return this.f129217p.get(i11);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        b bVar;
        try {
            if (view == null) {
                bVar = new b();
                view = this.f129220s.inflate(AbstractC7409c0.feed_popmenu_row, (ViewGroup) null);
                bVar.f129223a = (TextView) view.findViewById(AbstractC6918a0.text);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            ArrayList arrayList = this.f129217p;
            if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
                String str = ((a) this.f129217p.get(i11)).f129222b;
                bVar.f129223a.setVisibility(8);
                if (str.length() > 0) {
                    bVar.f129223a.setVisibility(0);
                    bVar.f129223a.setText(str);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }
}
