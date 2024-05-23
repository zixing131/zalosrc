package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.s9 */
/* loaded from: classes3.dex */
public class C7210s9 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f39544r;

    /* renamed from: s */
    private final C23528a f39545s;

    /* renamed from: com.zing.zalo.adapters.s9$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        public a(View view) {
            super(view);
        }
    }

    public C7210s9(Context context, List list) {
        this.f39545s = new C23528a(context);
        if (list == null) {
            this.f39544r = new ArrayList();
        } else {
            this.f39544r = new ArrayList(list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if ((abstractC1876c0.f7784p instanceof CircleImage) && !TextUtils.isEmpty(((ContactProfile) this.f39544r.get(i11)).f42446v) && !((ContactProfile) this.f39544r.get(i11)).f42446v.equalsIgnoreCase("null")) {
            if (C23302b.f113247a.m120523d(((ContactProfile) this.f39544r.get(i11)).f42446v)) {
                int m12307a = C2343e.m12307a(((ContactProfile) this.f39544r.get(i11)).f42434r, false);
                ((CircleImage) abstractC1876c0.f7784p).setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(((ContactProfile) this.f39544r.get(i11)).m40383Q(true, false)), m12307a));
            } else {
                ((C23528a) this.f39545s.m123612r((CircleImage) abstractC1876c0.f7784p)).m123618x(((ContactProfile) this.f39544r.get(i11)).f42446v, C23278z2.m120143n());
            }
        }
        abstractC1876c0.f7784p.setTag(Integer.valueOf(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        CircleImage circleImage = new CircleImage(viewGroup.getContext());
        circleImage.setLayoutParams(new RecyclerView.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f)));
        circleImage.m87724k(-1, 128, AbstractC23136l9.m118742r(1.0f));
        return new a(circleImage);
    }

    /* renamed from: L */
    public void m36690L(List list) {
        if (list == null) {
            this.f39544r = new ArrayList();
        } else {
            this.f39544r = new ArrayList(list);
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39544r.size();
    }
}
