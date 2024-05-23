package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7017b5;
import com.zing.zalo.control.InviteContactMask;
import com.zing.zalo.control.InviteContactProfile;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23278z2;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.b5 */
/* loaded from: classes3.dex */
public class C7017b5 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f38358r = new ArrayList();

    /* renamed from: s */
    String f38359s = "";

    /* renamed from: t */
    C23528a f38360t;

    /* renamed from: u */
    a f38361u;

    /* renamed from: v */
    private RecyclerView f38362v;

    /* renamed from: com.zing.zalo.adapters.b5$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo35877a(InviteContactProfile inviteContactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.b5$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        RecyclingImageView f38363I;

        /* renamed from: J */
        AppCompatImageView f38364J;

        /* renamed from: K */
        View f38365K;

        /* renamed from: L */
        InviteContactProfile f38366L;

        public b(View view) {
            super(view);
            this.f38365K = view;
            this.f38363I = (RecyclingImageView) view.findViewById(AbstractC6918a0.imgAvt);
            this.f38364J = (AppCompatImageView) view.findViewById(AbstractC6918a0.imgClose);
            this.f38363I.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.c5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7017b5.b.this.m35879k0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public /* synthetic */ void m35879k0(View view) {
            C7017b5 c7017b5 = C7017b5.this;
            a aVar = c7017b5.f38361u;
            if (aVar != null) {
                c7017b5.f38359s = "";
                aVar.mo35877a(this.f38366L);
            }
        }

        /* renamed from: j0 */
        public void m35880j0(int i11) {
            try {
                InviteContactProfile m35874N = C7017b5.this.m35874N(i11);
                this.f38366L = m35874N;
                InviteContactMask inviteContactMask = m35874N.f42540d2;
                if (inviteContactMask != null && inviteContactMask.f42537s == 3) {
                    RecyclingImageView recyclingImageView = this.f38363I;
                    recyclingImageView.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView.getContext(), AbstractC16803z.default_avatar2));
                } else {
                    AbstractC23268y2.m120028b(C7017b5.this.f38360t, this.f38363I, m35874N, C23278z2.m120143n(), false);
                }
                this.f38365K.setSelected(m35874N.f42434r.equals(C7017b5.this.f38359s));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C7017b5(Context context, a aVar) {
        this.f38360t = new C23528a(context);
        this.f38361u = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if (abstractC1876c0 instanceof b) {
            ((b) abstractC1876c0).m35880j0(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.people_selected_invite_group_item, viewGroup, false));
    }

    /* renamed from: L */
    public void m35872L(String str) {
        if (str != null && this.f38359s.equals(str)) {
            this.f38359s = "";
        }
    }

    /* renamed from: M */
    public void m35873M(int i11) {
        InviteContactProfile m35874N = m35874N(i11);
        if (m35874N != null) {
            if (this.f38359s.equals(m35874N.f42434r)) {
                this.f38359s = "";
            } else {
                this.f38359s = m35874N.f42434r;
            }
            m10008p();
        }
    }

    /* renamed from: N */
    public InviteContactProfile m35874N(int i11) {
        if (i11 >= 0 && i11 < this.f38358r.size()) {
            return (InviteContactProfile) this.f38358r.get(i11);
        }
        return null;
    }

    /* renamed from: O */
    public void m35875O() {
        if (this.f38358r.size() > 0) {
            this.f38362v.mo9854S1(this.f38358r.size() - 1);
        }
    }

    /* renamed from: P */
    public void m35876P(List list) {
        this.f38358r = new ArrayList(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38358r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: z */
    public void mo10018z(RecyclerView recyclerView) {
        super.mo10018z(recyclerView);
        this.f38362v = recyclerView;
    }
}
