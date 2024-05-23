package zc0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;

/* renamed from: zc0.b */
/* loaded from: classes.dex */
public class C31784b {

    /* renamed from: a */
    final RecyclerView f145921a;

    /* renamed from: b */
    d f145922b;

    /* renamed from: c */
    e f145923c;

    /* renamed from: d */
    View.OnClickListener f145924d = new a();

    /* renamed from: e */
    View.OnLongClickListener f145925e = new b();

    /* renamed from: f */
    RecyclerView.InterfaceC1889p f145926f = new c();

    /* renamed from: zc0.b$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C31784b c31784b = C31784b.this;
            if (c31784b.f145922b != null) {
                RecyclerView.AbstractC1876c0 m9823C0 = c31784b.f145921a.m9823C0(view);
                C31784b.this.f145921a.cancelPendingInputEvents();
                C31784b c31784b2 = C31784b.this;
                c31784b2.f145922b.mo17458i0(c31784b2.f145921a, m9823C0.m9929A(), view);
            }
        }
    }

    /* renamed from: zc0.b$b */
    /* loaded from: classes.dex */
    class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C31784b c31784b = C31784b.this;
            if (c31784b.f145923c != null) {
                RecyclerView.AbstractC1876c0 m9823C0 = c31784b.f145921a.m9823C0(view);
                C31784b.this.f145921a.cancelPendingInputEvents();
                C31784b c31784b2 = C31784b.this;
                return c31784b2.f145923c.mo81113T3(c31784b2.f145921a, m9823C0.m9929A(), view);
            }
            return false;
        }
    }

    /* renamed from: zc0.b$c */
    /* loaded from: classes.dex */
    class c implements RecyclerView.InterfaceC1889p {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: b */
        public void mo10173b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
        /* renamed from: d */
        public void mo10174d(View view) {
            C31784b c31784b = C31784b.this;
            if (c31784b.f145922b != null) {
                view.setOnClickListener(c31784b.f145924d);
            }
            C31784b c31784b2 = C31784b.this;
            if (c31784b2.f145923c != null) {
                view.setOnLongClickListener(c31784b2.f145925e);
            }
        }
    }

    /* renamed from: zc0.b$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: i0 */
        void mo17458i0(RecyclerView recyclerView, int i11, View view);
    }

    /* renamed from: zc0.b$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: T3 */
        boolean mo81113T3(RecyclerView recyclerView, int i11, View view);
    }

    C31784b(RecyclerView recyclerView) {
        this.f145921a = recyclerView;
        recyclerView.setTag(AbstractC6918a0.item_click_support, this);
        recyclerView.m9822C(this.f145926f);
    }

    /* renamed from: a */
    public static C31784b m152808a(RecyclerView recyclerView) {
        C31784b c31784b = (C31784b) recyclerView.getTag(AbstractC6918a0.item_click_support);
        if (c31784b == null) {
            return new C31784b(recyclerView);
        }
        return c31784b;
    }

    /* renamed from: b */
    public C31784b m152809b(d dVar) {
        this.f145922b = dVar;
        return this;
    }

    /* renamed from: c */
    public C31784b m152810c(e eVar) {
        this.f145923c = eVar;
        return this;
    }
}
