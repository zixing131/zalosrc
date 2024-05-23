package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import java.util.List;
import me0.C23278z2;
import p354n3.C23528a;
import p716zh.C31907f;

/* renamed from: com.zing.zalo.adapters.b */
/* loaded from: classes3.dex */
public class C7011b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f38334r;

    /* renamed from: s */
    b f38335s;

    /* renamed from: t */
    C23528a f38336t;

    /* renamed from: com.zing.zalo.adapters.b$a */
    /* loaded from: classes3.dex */
    static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public RecyclingImageView f38337I;

        /* renamed from: J */
        public TextView f38338J;

        public a(View view) {
            super(view);
            this.f38337I = (RecyclingImageView) view.findViewById(AbstractC6918a0.app_thumb);
            this.f38338J = (TextView) view.findViewById(AbstractC6918a0.app_name);
        }
    }

    /* renamed from: com.zing.zalo.adapters.b$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo35850a(C31907f c31907f);
    }

    public C7011b(Context context, List list, b bVar, C23528a c23528a) {
        this.f38334r = list;
        this.f38335s = bVar;
        this.f38336t = c23528a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m35849M(View view) {
        try {
            C31907f c31907f = (C31907f) this.f38334r.get(((Integer) view.getTag()).intValue());
            b bVar = this.f38335s;
            if (bVar != null) {
                bVar.mo35850a(c31907f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        Drawable drawable;
        try {
            if (abstractC1876c0 instanceof a) {
                C31907f c31907f = (C31907f) this.f38334r.get(i11);
                abstractC1876c0.f7784p.setTag(Integer.valueOf(i11));
                ((a) abstractC1876c0).f38338J.setText(c31907f.f146602b);
                try {
                    drawable = MainApplication.getAppContext().getPackageManager().getApplicationIcon(c31907f.f146601a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    drawable = null;
                }
                if (drawable != null) {
                    ((a) abstractC1876c0).f38337I.setImageDrawable(drawable);
                } else if (!TextUtils.isEmpty(c31907f.f146605e)) {
                    ((C23528a) this.f38336t.m123612r(((a) abstractC1876c0).f38337I)).m123618x(c31907f.f146605e, C23278z2.m120071G0());
                } else {
                    ((C23528a) this.f38336t.m123612r(((a) abstractC1876c0).f38337I)).m123613s(AbstractC16803z.default_avatar);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.app_listing_item, viewGroup, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7011b.this.m35849M(view);
            }
        });
        return new a(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38334r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
