package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import java.util.List;
import java.util.Map;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: com.zing.zalo.adapters.r */
/* loaded from: classes3.dex */
public class C7189r extends BaseAdapter {

    /* renamed from: p */
    private final List f39398p;

    /* renamed from: q */
    private final LayoutInflater f39399q;

    public C7189r(Context context, List list) {
        this.f39398p = list;
        this.f39399q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    private void m36577a(int i11, View view) {
        TextView textView;
        String obj;
        int intValue;
        Map map = (Map) this.f39398p.get(i11);
        if (map != null && (textView = (TextView) view.findViewById(AbstractC6918a0.tv_active_time_passcode)) != null) {
            Object obj2 = map.get("name");
            String str = "";
            if (obj2 == null) {
                obj = "";
            } else {
                obj = obj2.toString();
            }
            if (obj != null) {
                str = obj;
            }
            Object obj3 = map.get("color");
            if (obj3 == null) {
                intValue = C23212s8.m119607o(textView.getContext(), AbstractC21196a.TextColor1);
            } else {
                intValue = ((Integer) obj3).intValue();
            }
            textView.setText(str);
            textView.setTextColor(intValue);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f39398p.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        return this.f39398p.get(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f39399q.inflate(AbstractC7409c0.active_passcode_time_menu_item, viewGroup, false);
        }
        m36577a(i11, view);
        return view;
    }
}
