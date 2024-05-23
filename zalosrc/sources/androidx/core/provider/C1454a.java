package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.AbstractC1459f;
import androidx.core.provider.AbstractC1460g;

/* renamed from: androidx.core.provider.a */
/* loaded from: classes2.dex */
public class C1454a {

    /* renamed from: a */
    private final AbstractC1460g.c f6286a;

    /* renamed from: b */
    private final Handler f6287b;

    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ AbstractC1460g.c f6288p;

        /* renamed from: q */
        final /* synthetic */ Typeface f6289q;

        a(AbstractC1460g.c cVar, Typeface typeface) {
            this.f6288p = cVar;
            this.f6289q = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6288p.mo7263b(this.f6289q);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ AbstractC1460g.c f6291p;

        /* renamed from: q */
        final /* synthetic */ int f6292q;

        b(AbstractC1460g.c cVar, int i11) {
            this.f6291p = cVar;
            this.f6292q = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6291p.mo7262a(this.f6292q);
        }
    }

    public C1454a(AbstractC1460g.c cVar, Handler handler) {
        this.f6286a = cVar;
        this.f6287b = handler;
    }

    /* renamed from: a */
    private void m7372a(int i11) {
        this.f6287b.post(new b(this.f6286a, i11));
    }

    /* renamed from: c */
    private void m7373c(Typeface typeface) {
        this.f6287b.post(new a(this.f6286a, typeface));
    }

    /* renamed from: b */
    public void m7374b(AbstractC1459f.e eVar) {
        if (eVar.m7401a()) {
            m7373c(eVar.f6315a);
        } else {
            m7372a(eVar.f6316b);
        }
    }
}
