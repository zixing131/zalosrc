package p192h;

import java.net.HttpURLConnection;
import p001a.p002a.p003f.p004a.C0002f;

/* renamed from: h.c */
/* loaded from: classes2.dex */
public class C19688c {

    /* renamed from: a */
    int f97681a;

    /* renamed from: b */
    String f97682b;

    /* renamed from: c */
    Object f97683c;

    /* renamed from: d */
    Object f97684d;

    /* renamed from: e */
    HttpURLConnection f97685e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19688c(C19687b c19687b) {
    }

    /* renamed from: a */
    public void m103295a() {
        if (m103299e()) {
            return;
        }
        throw new C0002f("Request failed: " + this.f97681a + " " + this.f97682b, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m103296b(Object obj) {
        this.f97683c = obj;
    }

    /* renamed from: c */
    public Object m103297c() {
        return this.f97683c;
    }

    /* renamed from: d */
    public int m103298d() {
        return this.f97681a;
    }

    /* renamed from: e */
    public boolean m103299e() {
        return this.f97681a / 100 == 2;
    }
}
