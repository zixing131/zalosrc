package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ck.C3564e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.custom.SquareImageView;
import java.util.ArrayList;
import java.util.List;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;

/* renamed from: com.zing.zalo.adapters.x4 */
/* loaded from: classes3.dex */
public class C7260x4 extends BaseAdapter {

    /* renamed from: p */
    private final Context f39836p;

    /* renamed from: q */
    private final C23528a f39837q;

    /* renamed from: r */
    private List f39838r;

    /* renamed from: s */
    private boolean f39839s;

    /* renamed from: com.zing.zalo.adapters.x4$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        SquareImageView f39840a;

        /* renamed from: b */
        TextView f39841b;

        /* renamed from: c */
        TextView f39842c;

        /* renamed from: d */
        TextView f39843d;

        /* renamed from: e */
        TextView f39844e;

        /* renamed from: f */
        View f39845f;

        /* renamed from: g */
        ImageView f39846g;

        private a() {
        }
    }

    public C7260x4(Context context, List list, C23528a c23528a) {
        this.f39836p = context;
        this.f39837q = c23528a;
        this.f39838r = new ArrayList(list);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3564e getItem(int i11) {
        List list = this.f39838r;
        if (list != null && list.size() > i11 && i11 >= 0) {
            return (C3564e) this.f39838r.get(i11);
        }
        return null;
    }

    /* renamed from: b */
    public void m37017b(List list) {
        this.f39838r = new ArrayList(list);
    }

    /* renamed from: c */
    public void m37018c(boolean z11) {
        this.f39839s = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f39838r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int i12;
        int i13 = 0;
        try {
            if (view == null) {
                view = LayoutInflater.from(this.f39836p).inflate(AbstractC7409c0.location_oa_row, viewGroup, false);
                aVar = new a();
                aVar.f39840a = (SquareImageView) view.findViewById(AbstractC6918a0.img_avatar);
                aVar.f39841b = (TextView) view.findViewById(AbstractC6918a0.tv_name);
                aVar.f39842c = (TextView) view.findViewById(AbstractC6918a0.tv_distance);
                aVar.f39843d = (TextView) view.findViewById(AbstractC6918a0.tv_open_time);
                aVar.f39844e = (TextView) view.findViewById(AbstractC6918a0.tv_address);
                aVar.f39845f = view.findViewById(AbstractC6918a0.separate_line);
                aVar.f39846g = (ImageView) view.findViewById(AbstractC6918a0.ic_address);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            C3564e c3564e = (C3564e) this.f39838r.get(i11);
            aVar.f39841b.setText(c3564e.m18109d());
            aVar.f39842c.setVisibility(8);
            if (!TextUtils.isEmpty(c3564e.m18111f())) {
                aVar.f39843d.setText(c3564e.m18111f());
            } else {
                aVar.f39843d.setVisibility(4);
            }
            ImageView imageView = aVar.f39846g;
            if (!TextUtils.isEmpty(c3564e.m18106a())) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            aVar.f39844e.setText(c3564e.m18106a());
            aVar.f39840a.setImageResource(AbstractC16803z.bg_item_chat_o);
            if (!this.f39839s || C23999j.m125696L2(c3564e.m18110e(), C23278z2.m120126f0())) {
                ((C23528a) this.f39837q.m123612r(aVar.f39840a)).m123618x(c3564e.m18110e(), C23278z2.m120126f0());
            }
            View view2 = aVar.f39845f;
            if (i11 == getCount() - 1) {
                i13 = 8;
            }
            view2.setVisibility(i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }
}
