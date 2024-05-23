package oj0;

import com.zing.zalo.zinstant.InterfaceC17169n0;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20599v;
import java.util.concurrent.atomic.AtomicBoolean;
import lk0.C22504b;
import pj0.InterfaceC24782h;

/* renamed from: oj0.a */
/* loaded from: classes.dex */
public class C24281a {

    /* renamed from: a */
    C20599v f117265a;

    /* renamed from: b */
    InterfaceC24782h f117266b;

    /* renamed from: c */
    InterfaceC17169n0 f117267c;

    /* renamed from: d */
    private final AtomicBoolean f117268d = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oj0.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C24281a f117269a = new C24281a();
    }

    /* renamed from: a */
    private void m126785a() {
        if (this.f117268d.get()) {
        } else {
            throw new IllegalStateException("This instance isn't initialized. Call init() before using it.");
        }
    }

    /* renamed from: b */
    public static C24281a m126786b() {
        return a.f117269a;
    }

    /* renamed from: c */
    public void m126787c(C20599v c20599v, InterfaceC24782h interfaceC24782h, InterfaceC17169n0 interfaceC17169n0) {
        this.f117265a = c20599v;
        this.f117266b = interfaceC24782h;
        this.f117267c = interfaceC17169n0;
        this.f117268d.set(true);
    }

    /* renamed from: d */
    public void m126788d(String str, String str2, String str3, C22504b c22504b, AbstractC20601x.b bVar, C20588k c20588k) {
        m126785a();
        try {
            this.f117265a.m107219m(AbstractC20601x.m107226d(AbstractC20597t.m107199b(c22504b, str2, str3).mo107081a()).mo107112l(bVar).mo107107g(2).mo107105e(str2).mo107103c(), new C20588k(c20588k));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
