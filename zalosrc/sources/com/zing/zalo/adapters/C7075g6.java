package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.p077ui.widget.textview.RobotoTextModulesView;
import dj.C17970i1;
import java.util.ArrayList;
import me0.C23278z2;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.g6 */
/* loaded from: classes3.dex */
public class C7075g6 extends BaseAdapter {

    /* renamed from: p */
    ArrayList f38676p;

    /* renamed from: q */
    public LayoutInflater f38677q;

    /* renamed from: r */
    private C23528a f38678r;

    /* renamed from: com.zing.zalo.adapters.g6$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public RoundedImageView f38679a;

        /* renamed from: b */
        public RobotoTextModulesView f38680b;
    }

    public C7075g6(Context context, ArrayList arrayList) {
        this.f38676p = new ArrayList(arrayList);
        this.f38677q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public void m36110a(ArrayList arrayList) {
        this.f38676p = new ArrayList(arrayList);
    }

    /* renamed from: b */
    public void m36111b(C23528a c23528a) {
        this.f38678r = c23528a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.f38676p;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        ArrayList arrayList = this.f38676p;
        if (arrayList != null) {
            return arrayList.get(i11);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int i12;
        try {
            if (view == null) {
                aVar = new a();
                view = this.f38677q.inflate(AbstractC7409c0.richmessage_item_list_row, viewGroup, false);
                aVar.f38679a = (RoundedImageView) view.findViewById(AbstractC6918a0.img_item);
                aVar.f38680b = (RobotoTextModulesView) view.findViewById(AbstractC6918a0.description_item);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            if (i11 == getCount() - 1) {
                i12 = AbstractC16803z.last_item_bg;
            } else {
                i12 = AbstractC16803z.stencils_contact_bg;
            }
            view.setBackgroundResource(i12);
            ((C23528a) this.f38678r.m123612r(aVar.f38679a)).m123613s(AbstractC16803z.attach_gallery_96);
            C17970i1 c17970i1 = (C17970i1) this.f38676p.get(i11);
            if (c17970i1 != null) {
                if (c17970i1.m95607i().equals("l.a.child.full") && c17970i1.m95605g().length() > 0) {
                    aVar.f38679a.setVisibility(0);
                    ((C23528a) this.f38678r.m123612r(aVar.f38679a)).m123618x(c17970i1.m95605g(), C23278z2.m120136k0());
                } else {
                    aVar.f38679a.setVisibility(8);
                }
                if (c17970i1.m95606h().length() > 0) {
                    aVar.f38680b.setVisibility(0);
                    aVar.f38680b.setText(c17970i1.m95606h());
                } else {
                    aVar.f38680b.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }
}
