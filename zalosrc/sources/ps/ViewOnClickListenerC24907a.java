package ps;

import android.view.View;

/* renamed from: ps.a */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC24907a implements View.OnClickListener {

    /* renamed from: p */
    final a f119526p;

    /* renamed from: q */
    final int f119527q;

    /* renamed from: ps.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: b */
        void mo129555b(int i11, View view);
    }

    public ViewOnClickListenerC24907a(a aVar, int i11) {
        this.f119526p = aVar;
        this.f119527q = i11;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f119526p.mo129555b(this.f119527q, view);
    }
}
