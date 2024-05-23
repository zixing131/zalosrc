package p304ks;

import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7960e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ks.c0 */
/* loaded from: classes4.dex */
public class C21917c0 {

    /* renamed from: a */
    private final Set f107755a = Collections.synchronizedSet(new HashSet());

    /* renamed from: ks.c0$a */
    /* loaded from: classes4.dex */
    class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107756a;

        a(String str) {
            this.f107756a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42554u9(this.f107756a);
        }
    }

    /* renamed from: ks.c0$b */
    /* loaded from: classes4.dex */
    class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42207N0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ks.c0$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        static final C21917c0 f107759a = new C21917c0();
    }

    /* renamed from: c */
    public static C21917c0 m114228c() {
        return c.f107759a;
    }

    /* renamed from: a */
    public void m114229a(String str) {
        this.f107755a.add(str);
        C0824j.m2153b(new a(str));
    }

    /* renamed from: b */
    public void m114230b() {
        this.f107755a.clear();
        C0824j.m2153b(new b());
    }

    /* renamed from: d */
    public boolean m114231d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f107755a.contains(str);
    }

    /* renamed from: e */
    public void m114232e() {
        this.f107755a.addAll(C7960e.m41971c6().m42071B5());
    }
}
