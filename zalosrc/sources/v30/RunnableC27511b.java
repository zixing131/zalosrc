package v30;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import au.AbstractC2378v0;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import su.AbstractC26389c;
import tg.InterfaceC26654e;
import v30.C27519j;

/* renamed from: v30.b */
/* loaded from: classes5.dex */
public class RunnableC27511b implements Runnable, InterfaceC26654e {

    /* renamed from: p */
    private final long f129431p = System.currentTimeMillis();

    /* renamed from: q */
    private final C23528a f129432q;

    /* renamed from: r */
    private final C27519j.b f129433r;

    /* renamed from: s */
    private final String f129434s;

    /* renamed from: t */
    private final C27513d f129435t;

    /* renamed from: u */
    private final File f129436u;

    /* renamed from: v */
    private final String f129437v;

    /* renamed from: w */
    private final int f129438w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v30.b$a */
    /* loaded from: classes5.dex */
    public class a extends C23994e {

        /* renamed from: v0 */
        final /* synthetic */ File f129439v0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v30.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C33008a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ String f129441a;

            /* renamed from: b */
            final /* synthetic */ File f129442b;

            /* renamed from: c */
            final /* synthetic */ C23995f f129443c;

            C33008a(String str, File file, C23995f c23995f) {
                this.f129441a = str;
                this.f129442b = file;
                this.f129443c = c23995f;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                a aVar = a.this;
                RunnableC27511b.this.m140664h(this.f129441a, this.f129442b, this.f129443c, aVar.f129439v0);
            }
        }

        a(File file) {
            this.f129439v0 = file;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, File file, C23995f c23995f) {
            C0824j.m2153b(new C33008a(str, file, c23995f));
        }
    }

    public RunnableC27511b(C23528a c23528a, String str, C27513d c27513d, File file, String str2, C27519j.b bVar, int i11) {
        this.f129432q = c23528a;
        this.f129433r = bVar;
        this.f129434s = str;
        this.f129435t = c27513d;
        this.f129436u = file;
        this.f129437v = str2;
        this.f129438w = i11;
    }

    /* renamed from: c */
    private boolean m140660c(C27513d c27513d, File file) {
        if (file.exists() && file.listFiles() != null && file.listFiles().length != 0) {
            return m140661e(c27513d, file);
        }
        return false;
    }

    /* renamed from: e */
    private boolean m140661e(C27513d c27513d, File file) {
        if (TextUtils.isEmpty(c27513d.f129447c)) {
            return false;
        }
        try {
            String m104881m = AbstractC20130d.m104881m(file);
            if (!TextUtils.isEmpty(m104881m)) {
                if (TextUtils.equals(m104881m, c27513d.f129447c)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: f */
    private boolean m140662f(C27513d c27513d, File file) {
        if (TextUtils.isEmpty(c27513d.f129446b)) {
            return false;
        }
        try {
            String m135987c = AbstractC26389c.m135987c(file);
            if (!TextUtils.isEmpty(m135987c)) {
                if (TextUtils.equals(m135987c, c27513d.f129446b)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: g */
    private void m140663g(File file) {
        a aVar = new a(file);
        File file2 = new File(this.f129436u + "/" + this.f129437v + ".zip");
        AbstractC20130d.m104858T0(file2);
        AbstractC20110a.m104535d("TENSORFLOW start download: " + this.f129435t.f129445a + " save at " + file2.getPath(), new Object[0]);
        this.f129432q.m123600e(this.f129435t.f129445a, file2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m140664h(String str, File file, C23995f c23995f, File file2) {
        if (file != null) {
            try {
                if (file.exists() && c23995f.m125657h() == 200) {
                    if (!m140662f(this.f129435t, file)) {
                        this.f129433r.mo140736a(this.f129434s, 1);
                        return;
                    }
                    if (!AbstractC2378v0.m12421d(file, file2)) {
                        this.f129433r.mo140736a(this.f129434s, 1);
                        return;
                    }
                    AbstractC20130d.m104858T0(file);
                    if (!m140661e(this.f129435t, file2)) {
                        this.f129433r.mo140736a(this.f129434s, 1);
                        return;
                    } else {
                        this.f129433r.mo140737b(this.f129434s, false);
                        return;
                    }
                }
            } catch (Exception unused) {
                this.f129433r.mo140736a(this.f129434s, 1);
                return;
            }
        }
        this.f129433r.mo140736a(this.f129434s, 1);
    }

    @Override // tg.InterfaceC26654e
    /* renamed from: a */
    public long mo136807a() {
        return this.f129431p;
    }

    @Override // tg.InterfaceC26654e
    /* renamed from: d */
    public int mo136808d() {
        return this.f129438w;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f129436u.exists()) {
                this.f129436u.mkdirs();
            }
            if (!this.f129436u.exists()) {
                this.f129433r.mo140736a(this.f129434s, 1);
                return;
            }
            File file = new File(this.f129436u + "/" + this.f129437v);
            if (m140660c(this.f129435t, file)) {
                this.f129433r.mo140737b(this.f129434s, true);
                return;
            }
            if (file.exists()) {
                AbstractC20130d.m104856S0(file);
            }
            m140663g(file);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            this.f129433r.mo140736a(this.f129434s, 1);
        }
    }
}
