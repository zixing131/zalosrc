package com.zing.zalo.adapters;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.f */
/* loaded from: classes3.dex */
public class C7057f extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    ArrayList f38551r;

    /* renamed from: s */
    C23528a f38552s;

    /* renamed from: t */
    a f38553t;

    /* renamed from: com.zing.zalo.adapters.f$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: K9 */
        void mo36036K9(String str);
    }

    /* renamed from: com.zing.zalo.adapters.f$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        AvatarImageView f38554I;

        public b(AvatarImageView avatarImageView) {
            super(avatarImageView);
            this.f38554I = avatarImageView;
        }
    }

    public C7057f(C23528a c23528a) {
        this.f38552s = c23528a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m36031M(String str, View view) {
        a aVar = this.f38553t;
        if (aVar != null) {
            aVar.mo36036K9(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        try {
            final String str = (String) this.f38551r.get(i11);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) bVar.f38554I.getLayoutParams();
            if (i11 == this.f38551r.size() - 1) {
                layoutParams.setMargins(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), 0);
            } else {
                layoutParams.setMargins(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(4.0f), 0);
            }
            ((C23528a) this.f38552s.m123612r(bVar.f38554I)).m123618x(str, C23278z2.m120143n());
            bVar.f38554I.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7057f.this.m36031M(str, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AvatarImageView avatarImageView = new AvatarImageView(viewGroup.getContext());
        avatarImageView.setLayoutParams(new RecyclerView.LayoutParams(AbstractC23136l9.m118742r(70.0f), AbstractC23136l9.m118742r(70.0f)));
        return new b(avatarImageView);
    }

    /* renamed from: P */
    public void m36034P(ArrayList arrayList) {
        if (arrayList != null) {
            this.f38551r = new ArrayList(arrayList);
        }
    }

    /* renamed from: Q */
    public void m36035Q(a aVar) {
        this.f38553t = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f38551r;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
