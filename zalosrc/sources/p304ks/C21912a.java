package p304ks;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import bo.C3034s;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ls.C22641a;
import me0.AbstractC23161o1;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18635e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;

/* renamed from: ks.a */
/* loaded from: classes4.dex */
public class C21912a {

    /* renamed from: a */
    Map f107700a = new HashMap();

    /* renamed from: b */
    C18635e f107701b = new C18635e();

    /* renamed from: c */
    AtomicBoolean f107702c = new AtomicBoolean(false);

    /* renamed from: d */
    AtomicInteger f107703d = new AtomicInteger(0);

    /* renamed from: e */
    WeakReference f107704e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f107705a;

        a(boolean z11) {
            this.f107705a = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [long] */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v9, types: [ks.a] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    if (this.f107705a) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C21912a.this.f107703d.set(0);
                        currentTimeMillis = currentTimeMillis2;
                    } else if (C21912a.this.f107703d.incrementAndGet() > 3) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        C21912a.this.f107703d.set(0);
                        currentTimeMillis = currentTimeMillis3;
                    } else {
                        currentTimeMillis = System.currentTimeMillis() - 604200000;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC23309i.m122440tq(currentTimeMillis);
                C21912a.this.f107702c.set(false);
                currentTimeMillis = C21912a.this;
                currentTimeMillis.m114166f(false, c20096c);
            } catch (Throwable th2) {
                AbstractC23309i.m122440tq(currentTimeMillis);
                C21912a.this.f107702c.set(false);
                C21912a.this.m114166f(false, c20096c);
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.isNull("data")) {
                        jSONArray = null;
                    } else {
                        jSONArray = jSONObject.getJSONArray("data");
                    }
                    if (jSONArray != null) {
                        C21912a.this.m114165e();
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            arrayList.add(new C22641a(jSONArray.getJSONObject(i11)));
                        }
                        C21912a.this.m114161a(arrayList);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC23309i.m122440tq(System.currentTimeMillis());
                C21912a.this.f107702c.set(false);
                C21912a.this.f107703d.set(0);
                C21912a.this.m114166f(true, null);
            } catch (Throwable th2) {
                AbstractC23309i.m122440tq(System.currentTimeMillis());
                C21912a.this.f107702c.set(false);
                C21912a.this.f107703d.set(0);
                C21912a.this.m114166f(true, null);
                throw th2;
            }
        }
    }

    /* renamed from: ks.a$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42481o0();
        }
    }

    /* renamed from: ks.a$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f107708a;

        c(List list) {
            this.f107708a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42521r7(this.f107708a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f107710a;

        d(ContactProfile contactProfile) {
            this.f107710a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42094D7(new C22641a(this.f107710a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107712a;

        e(String str) {
            this.f107712a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42191Lb(new C22641a(this.f107712a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f107714a;

        f(ContactProfile contactProfile) {
            this.f107714a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42191Lb(new C22641a(this.f107714a));
        }
    }

    /* renamed from: ks.a$g */
    /* loaded from: classes4.dex */
    public interface g {
        /* renamed from: a */
        void mo78527a();

        /* renamed from: b */
        void mo78528b(C20096c c20096c);

        /* renamed from: c */
        void mo78529c();
    }

    /* renamed from: ks.a$h */
    /* loaded from: classes4.dex */
    public static final class h {

        /* renamed from: a */
        static final C21912a f107716a = new C21912a();
    }

    /* renamed from: g */
    public static C21912a m114159g() {
        return h.f107716a;
    }

    /* renamed from: m */
    private void m114160m() {
        C23744a.m124114c().m124116d(6079, new C3034s());
    }

    /* renamed from: a */
    public void m114161a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22641a c22641a = (C22641a) it.next();
            this.f107700a.put(c22641a.f111034a, Boolean.TRUE);
            this.f107701b.add(c22641a.m117215a());
        }
        m114160m();
        C0824j.m2153b(new c(list));
    }

    /* renamed from: b */
    public void m114162b(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            this.f107700a.put(contactProfile.f42434r, Boolean.TRUE);
            this.f107701b.add(contactProfile);
            m114160m();
            C0824j.m2153b(new d(contactProfile));
        }
    }

    /* renamed from: c */
    void m114163c() {
        try {
            WeakReference weakReference = this.f107704e;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((g) this.f107704e.get()).mo78527a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m114164d(boolean z11, g gVar) {
        if (AbstractC23304d.f113427q1.get()) {
            return;
        }
        long m121556W5 = AbstractC23309i.m121556W5();
        if (!z11 && System.currentTimeMillis() - m121556W5 < 604800000) {
            return;
        }
        if (gVar != null) {
            this.f107704e = new WeakReference(gVar);
        }
        if (!C23055e5.m118271f()) {
            m114166f(false, new C20096c(50001, AbstractC23161o1.m119318c(50001, "")));
            return;
        }
        if (this.f107702c.get()) {
            m114163c();
            return;
        }
        this.f107702c.set(true);
        m114163c();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(z11));
        c0766k.mo1675k8("75", "1", "500");
    }

    /* renamed from: e */
    public void m114165e() {
        this.f107700a.clear();
        this.f107701b.clear();
        m114160m();
        C0824j.m2153b(new b());
    }

    /* renamed from: f */
    void m114166f(boolean z11, C20096c c20096c) {
        try {
            WeakReference weakReference = this.f107704e;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if (z11) {
                ((g) this.f107704e.get()).mo78529c();
            } else {
                ((g) this.f107704e.get()).mo78528b(c20096c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public C18635e m114167h() {
        return this.f107701b;
    }

    /* renamed from: i */
    public void m114168i() {
        m114165e();
        AbstractC23309i.m122440tq(0L);
    }

    /* renamed from: j */
    public boolean m114169j(String str) {
        Boolean bool;
        if (!this.f107700a.containsKey(str) || (bool = (Boolean) this.f107700a.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: k */
    public boolean m114170k(String str) {
        return this.f107700a.containsKey(str);
    }

    /* renamed from: l */
    public void m114171l() {
        List<C22641a> m42251R4 = C7960e.m41971c6().m42251R4();
        if (m42251R4 != null) {
            for (C22641a c22641a : m42251R4) {
                this.f107700a.put(c22641a.f111034a, Boolean.TRUE);
                this.f107701b.add(c22641a.m117215a());
            }
        }
        m114160m();
    }

    /* renamed from: n */
    public void m114172n(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            this.f107700a.put(contactProfile.f42434r, Boolean.FALSE);
            this.f107701b.remove(contactProfile);
            m114160m();
            C0824j.m2153b(new f(contactProfile));
        }
    }

    /* renamed from: o */
    public void m114173o(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f107700a.put(str, Boolean.FALSE);
            this.f107701b.m98493m(str);
            m114160m();
            C0824j.m2153b(new e(str));
        }
    }
}
