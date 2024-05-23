package com.zing.zalo.adapters;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23041d2;
import vg.AbstractC28236y3;

/* renamed from: com.zing.zalo.adapters.j4 */
/* loaded from: classes3.dex */
public class C7106j4 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f38840r;

    /* renamed from: com.zing.zalo.adapters.j4$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        ImageView f38841I;

        /* renamed from: J */
        TextView f38842J;

        /* renamed from: K */
        TextView f38843K;

        public a(View view) {
            super(view);
            this.f38841I = (ImageView) view.findViewById(AbstractC6918a0.imvFileThumb);
            this.f38842J = (TextView) view.findViewById(AbstractC6918a0.tvFileTitle);
            this.f38843K = (TextView) view.findViewById(AbstractC6918a0.tvFileSubTitle);
        }

        /* renamed from: i0 */
        public void m36199i0(String str) {
            Drawable m142197h;
            try {
                File file = new File(str);
                if (file.exists()) {
                    this.f38842J.setText(file.getName());
                    this.f38843K.setText(AbstractC23041d2.m118226y(file.length()));
                    String m118217p = AbstractC23041d2.m118217p(file.getName());
                    if (!TextUtils.isEmpty(m118217p) && (m142197h = AbstractC28236y3.m142197h(this.f38841I.getContext(), m118217p)) != null) {
                        this.f38841I.setImageDrawable(m142197h);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        aVar.m36199i0((String) this.f38840r.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_multi_file, viewGroup, false));
    }

    /* renamed from: N */
    public void m36198N(List list) {
        this.f38840r = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38840r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
