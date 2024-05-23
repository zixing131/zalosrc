package tg;

import java.io.File;

/* renamed from: tg.p */
/* loaded from: classes3.dex */
public final class C26665p extends AbstractC26651b {

    /* renamed from: d */
    private final c f126194d;

    /* renamed from: e */
    private final b f126195e = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.p$a */
    /* loaded from: classes3.dex */
    public class a implements b {
        a() {
        }

        @Override // tg.C26665p.b
        /* renamed from: a */
        public synchronized void mo136847a(String str, int i11, String str2, int i12) {
            try {
                C26665p.this.f126194d.mo136848b(str, i11, str2, i12);
                C26665p.this.f126128a.remove(str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: tg.p$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo136847a(String str, int i11, String str2, int i12);
    }

    /* renamed from: tg.p$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: b */
        void mo136848b(String str, int i11, String str2, int i12);
    }

    public C26665p(c cVar) {
        this.f126194d = cVar;
    }

    /* renamed from: e */
    public synchronized void m136846e(String str, int i11, String str2, C26657h c26657h, File file, int i12, byte b11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m136799b(str)) {
            return;
        }
        RunnableC26652c runnableC26652c = new RunnableC26652c(this.f126129b, i12, str, i11, str2, c26657h, file, this.f126195e, b11);
        this.f126128a.put(str, runnableC26652c);
        AbstractC26651b.f126127c.execute(runnableC26652c);
    }
}
