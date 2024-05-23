package v30;

import java.io.File;
import java.util.Arrays;
import tg.AbstractC26651b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v30.j */
/* loaded from: classes5.dex */
public final class C27519j extends AbstractC26651b {

    /* renamed from: d */
    private final c f129494d;

    /* renamed from: e */
    private final b f129495e = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v30.j$a */
    /* loaded from: classes5.dex */
    public class a implements b {
        a() {
        }

        @Override // v30.C27519j.b
        /* renamed from: a */
        public void mo140736a(String str, int i11) {
            C27519j.this.f129494d.mo140720b();
            ((AbstractC26651b) C27519j.this).f126128a.remove(str);
        }

        @Override // v30.C27519j.b
        /* renamed from: b */
        public synchronized void mo140737b(String str, boolean z11) {
            C27519j.this.f129494d.mo140719a(z11);
            ((AbstractC26651b) C27519j.this).f126128a.remove(str);
        }
    }

    /* renamed from: v30.j$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo140736a(String str, int i11);

        /* renamed from: b */
        void mo140737b(String str, boolean z11);
    }

    /* renamed from: v30.j$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: a */
        void mo140719a(boolean z11);

        /* renamed from: b */
        void mo140720b();
    }

    public C27519j(c cVar) {
        this.f129494d = cVar;
    }

    /* renamed from: g */
    public synchronized void m140735g(C27513d c27513d, int i11, File file, String str) {
        String str2;
        try {
            str2 = c27513d.f129445a + "_" + i11;
        } catch (Exception e11) {
            C27514e.m140666a("queueModelZipDownload -> exception\n" + Arrays.toString(e11.getStackTrace()));
            e11.printStackTrace();
        }
        if (m136799b(str2)) {
            C27514e.m140666a("queueModelZipDownload -> isDownloading -> skip task");
            return;
        }
        RunnableC27511b runnableC27511b = new RunnableC27511b(this.f126129b, str2, c27513d, file, str, this.f129495e, 1);
        this.f126128a.put(str2, runnableC27511b);
        AbstractC26651b.f126127c.execute(runnableC27511b);
    }
}
