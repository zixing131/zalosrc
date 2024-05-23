package gq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p107dq.C18051g;
import p649xl.C29941n5;
import ui0.C27280g;

/* renamed from: gq.i */
/* loaded from: classes4.dex */
public final class C19586i extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f97301r;

    /* renamed from: s */
    private List f97302s;

    /* renamed from: t */
    private a f97303t;

    /* renamed from: u */
    private int f97304u;

    /* renamed from: gq.i$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo45953a(C18051g c18051g);

        /* renamed from: b */
        void mo45954b(C18051g c18051g);
    }

    /* renamed from: gq.i$b */
    /* loaded from: classes4.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C29941n5 f97305I;

        /* renamed from: J */
        final /* synthetic */ C19586i f97306J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C19586i c19586i, C29941n5 c29941n5) {
            super(c29941n5.getRoot());
            AbstractC19074t.m100208f(c29941n5, "binding");
            this.f97306J = c19586i;
            this.f97305I = c29941n5;
        }

        /* renamed from: i0 */
        public final C29941n5 m102524i0() {
            return this.f97305I;
        }
    }

    public C19586i(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f97301r = context;
        this.f97302s = new ArrayList();
    }

    /* renamed from: M */
    private final C18051g m102515M(int i11) {
        for (C18051g c18051g : this.f97302s) {
            if (c18051g.m95939e() == i11) {
                return c18051g;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m102516O(C19586i c19586i, C18051g c18051g, b bVar, View view) {
        AbstractC19074t.m100208f(c19586i, "this$0");
        AbstractC19074t.m100208f(c18051g, "$this_with");
        AbstractC19074t.m100208f(bVar, "$this_with$1");
        a aVar = c19586i.f97303t;
        if (aVar != null) {
            aVar.mo45953a(c18051g);
        }
        ((C18051g) c19586i.f97302s.get(c19586i.f97304u)).m95942h(false);
        c18051g.m95942h(true);
        c19586i.m10009q(c19586i.f97304u);
        c19586i.m10009q(bVar.m9929A());
        c19586i.f97304u = bVar.m9929A();
    }

    /* renamed from: U */
    private final void m102517U(int i11) {
        for (C18051g c18051g : this.f97302s) {
            if (c18051g.m95939e() == i11) {
                c18051g.m95942h(true);
                int indexOf = this.f97302s.indexOf(c18051g);
                m10009q(indexOf);
                this.f97304u = indexOf;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final b bVar, int i11) {
        int i12;
        AbstractC19074t.m100208f(bVar, "holder");
        final C18051g c18051g = (C18051g) this.f97302s.get(i11);
        bVar.m102524i0().f138759r.setText(c18051g.m95940f());
        ImageView imageView = bVar.m102524i0().f138761t;
        if (c18051g.m95941g()) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        imageView.setVisibility(i12);
        RecyclingImageView recyclingImageView = bVar.m102524i0().f138760s;
        AbstractC19074t.m100207e(recyclingImageView, "layoutThumb");
        int m95937c = c18051g.m95937c();
        recyclingImageView.setPadding(m95937c, m95937c, m95937c, m95937c);
        bVar.m102524i0().f138760s.setBackgroundResource(c18051g.m95935a());
        bVar.m102524i0().f138760s.setImageDrawable(C27280g.m139660c(this.f97301r, c18051g.m95936b(), c18051g.m95938d()));
        bVar.m102524i0().getRoot().setOnClickListener(new View.OnClickListener() { // from class: gq.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19586i.m102516O(C19586i.this, c18051g, bVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        C29941n5 m148273c = C29941n5.m148273c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148273c, "inflate(...)");
        return new b(this, m148273c);
    }

    /* renamed from: Q */
    public final void m102520Q(int i11) {
        a aVar;
        m102517U(i11);
        C18051g m102515M = m102515M(i11);
        if (m102515M != null && (aVar = this.f97303t) != null) {
            aVar.mo45954b(m102515M);
        }
    }

    /* renamed from: R */
    public final void m102521R(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f97302s = list;
        m10008p();
    }

    /* renamed from: S */
    public final void m102522S(int i11) {
        m102517U(i11);
    }

    /* renamed from: T */
    public final void m102523T(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f97303t = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f97302s.size();
    }
}
