package p599w6;

import android.graphics.Typeface;

/* renamed from: w6.a */
/* loaded from: classes3.dex */
public final class C28772a extends AbstractC28777f {

    /* renamed from: a */
    private final Typeface f133359a;

    /* renamed from: b */
    private final a f133360b;

    /* renamed from: c */
    private boolean f133361c;

    /* renamed from: w6.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo32553a(Typeface typeface);
    }

    public C28772a(a aVar, Typeface typeface) {
        this.f133359a = typeface;
        this.f133360b = aVar;
    }

    /* renamed from: d */
    private void m143967d(Typeface typeface) {
        if (!this.f133361c) {
            this.f133360b.mo32553a(typeface);
        }
    }

    @Override // p599w6.AbstractC28777f
    /* renamed from: a */
    public void mo32057a(int i11) {
        m143967d(this.f133359a);
    }

    @Override // p599w6.AbstractC28777f
    /* renamed from: b */
    public void mo32058b(Typeface typeface, boolean z11) {
        m143967d(typeface);
    }

    /* renamed from: c */
    public void m143968c() {
        this.f133361c = true;
    }
}
