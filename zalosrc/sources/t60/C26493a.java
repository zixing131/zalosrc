package t60;

import java.util.ArrayList;
import java.util.List;
import p056cj.C3538f;

/* renamed from: t60.a */
/* loaded from: classes5.dex */
public class C26493a {

    /* renamed from: a */
    public int f125728a;

    /* renamed from: b */
    public List f125729b;

    public C26493a(int i11, List list) {
        this.f125728a = i11;
        if (list != null) {
            this.f125729b = new ArrayList(list);
        }
    }

    /* renamed from: a */
    public C3538f m136464a() {
        List list = this.f125729b;
        if (list != null && list.size() > 0) {
            return (C3538f) this.f125729b.get(0);
        }
        return null;
    }

    /* renamed from: b */
    public C3538f m136465b() {
        List list = this.f125729b;
        if (list != null && list.size() > 2) {
            return (C3538f) this.f125729b.get(2);
        }
        return null;
    }

    /* renamed from: c */
    public C3538f m136466c() {
        return m136464a();
    }

    /* renamed from: d */
    public C3538f m136467d() {
        List list = this.f125729b;
        if (list != null && list.size() > 1) {
            return (C3538f) this.f125729b.get(1);
        }
        return null;
    }

    /* renamed from: e */
    public C3538f m136468e() {
        List list = this.f125729b;
        if (list != null && list.size() > 4) {
            return (C3538f) this.f125729b.get(4);
        }
        return null;
    }

    /* renamed from: f */
    public C3538f m136469f() {
        List list = this.f125729b;
        if (list != null && list.size() > 3) {
            return (C3538f) this.f125729b.get(3);
        }
        return null;
    }

    /* renamed from: g */
    public void m136470g(int i11) {
        this.f125728a = i11;
    }

    public C26493a() {
    }
}
