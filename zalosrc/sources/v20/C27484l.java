package v20;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.social.components.NotificationItemViewDefault;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import p716zh.C32078q7;

/* renamed from: v20.l */
/* loaded from: classes5.dex */
public class C27484l extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f129276r;

    /* renamed from: s */
    a f129277s;

    /* renamed from: t */
    Context f129278t;

    /* renamed from: u */
    protected boolean f129279u = false;

    /* renamed from: v20.l$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo45895a(int i11, C32078q7 c32078q7, View view);

        /* renamed from: b */
        void mo45896b(C32078q7 c32078q7);
    }

    /* renamed from: v20.l$b */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        NotificationItemViewDefault f129280I;

        public b(View view) {
            super(view);
            this.f129280I = (NotificationItemViewDefault) view;
        }
    }

    public C27484l(Context context) {
        this.f129278t = context;
    }

    /* renamed from: M */
    public /* synthetic */ void m140571M(int i11, C32078q7 c32078q7, View view) {
        a aVar = this.f129277s;
        if (aVar != null) {
            aVar.mo45895a(i11, c32078q7, view);
        }
    }

    /* renamed from: Q */
    private void m140572Q(int i11, C32078q7 c32078q7, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: v20.k

            /* renamed from: q */
            public final /* synthetic */ int f129274q;

            /* renamed from: r */
            public final /* synthetic */ C32078q7 f129275r;

            public /* synthetic */ ViewOnClickListenerC27483k(int i112, C32078q7 c32078q72) {
                r2 = i112;
                r3 = c32078q72;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C27484l.this.m140571M(r2, r3, view2);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(b bVar, int i11) {
        NotificationItemViewDefault notificationItemViewDefault;
        try {
            C32078q7 c32078q7 = (C32078q7) this.f129276r.get(i11);
            if (bVar != null && (notificationItemViewDefault = bVar.f129280I) != null) {
                notificationItemViewDefault.setNotiEventListener(this.f129277s);
                bVar.f129280I.m56302r(c32078q7);
                m140572Q(i11, c32078q7, bVar.f129280I);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        NotificationItemViewDefault notificationItemViewDefault = new NotificationItemViewDefault(this.f129278t);
        notificationItemViewDefault.mo56288c();
        return new b(notificationItemViewDefault);
    }

    /* renamed from: P */
    public void m140575P(List list) {
        this.f129276r = new ArrayList(list);
    }

    /* renamed from: R */
    public void m140576R(a aVar) {
        this.f129277s = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f129276r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }
}
