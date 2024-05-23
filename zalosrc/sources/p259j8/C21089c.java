package p259j8;

import java.io.File;
import p359n8.C23620g;

/* renamed from: j8.c */
/* loaded from: classes.dex */
public class C21089c {

    /* renamed from: c */
    private static final b f103087c = new b();

    /* renamed from: a */
    private final C23620g f103088a;

    /* renamed from: b */
    private InterfaceC21087a f103089b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j8.c$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC21087a {
        private b() {
        }

        @Override // p259j8.InterfaceC21087a
        /* renamed from: a */
        public void mo109546a() {
        }

        @Override // p259j8.InterfaceC21087a
        /* renamed from: b */
        public String mo109547b() {
            return null;
        }

        @Override // p259j8.InterfaceC21087a
        /* renamed from: c */
        public byte[] mo109548c() {
            return null;
        }

        @Override // p259j8.InterfaceC21087a
        /* renamed from: d */
        public void mo109549d() {
        }

        @Override // p259j8.InterfaceC21087a
        /* renamed from: e */
        public void mo109550e(long j11, String str) {
        }
    }

    public C21089c(C23620g c23620g) {
        this.f103088a = c23620g;
        this.f103089b = f103087c;
    }

    /* renamed from: d */
    private File m109556d(String str) {
        return this.f103088a.m123834o(str, "userlog");
    }

    /* renamed from: a */
    public void m109557a() {
        this.f103089b.mo109549d();
    }

    /* renamed from: b */
    public byte[] m109558b() {
        return this.f103089b.mo109548c();
    }

    /* renamed from: c */
    public String m109559c() {
        return this.f103089b.mo109547b();
    }

    /* renamed from: e */
    public final void m109560e(String str) {
        this.f103089b.mo109546a();
        this.f103089b = f103087c;
        if (str == null) {
            return;
        }
        m109561f(m109556d(str), 65536);
    }

    /* renamed from: f */
    void m109561f(File file, int i11) {
        this.f103089b = new C21092f(file, i11);
    }

    /* renamed from: g */
    public void m109562g(long j11, String str) {
        this.f103089b.mo109550e(j11, str);
    }

    public C21089c(C23620g c23620g, String str) {
        this(c23620g);
        m109560e(str);
    }
}
