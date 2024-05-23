package p410p;

import android.content.Context;
import p512t.C26436b;
import p512t.C26438d;
import p512t.C26440f;
import p562v.AbstractC27389b;
import p562v.AbstractC27392e;

/* renamed from: p.d */
/* loaded from: classes2.dex */
public class C24590d {

    /* renamed from: a */
    private boolean f118341a;

    /* renamed from: d */
    private void m128058d(Context context) {
        AbstractC27392e.m140336b(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m128059a(Context context) {
        m128058d(context);
        if (m128061c()) {
            return;
        }
        m128060b(true);
        C26440f.m136313b().m136315d(context);
        C26436b.m136278a().m136284b(context);
        AbstractC27389b.m140318c(context);
        C26438d.m136294a().m136295b(context);
    }

    /* renamed from: b */
    void m128060b(boolean z11) {
        this.f118341a = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m128061c() {
        return this.f118341a;
    }
}
