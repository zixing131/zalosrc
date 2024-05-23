package p304ks;

import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import p142ey.C18635e;
import p142ey.C18641k;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p716zh.C31901e8;
import p716zh.C31934gb;
import vg.C28203u6;

/* renamed from: ks.a0 */
/* loaded from: classes4.dex */
public class C21913a0 {

    /* renamed from: c */
    AtomicBoolean f107719c = new AtomicBoolean(false);

    /* renamed from: a */
    C21915b0 f107717a = new C21915b0();

    /* renamed from: b */
    Executor f107718b = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("NoneFriendByDiscover"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a0$a */
    /* loaded from: classes4.dex */
    public class a extends C18641k.a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f107720a;

        /* renamed from: b */
        final /* synthetic */ Map f107721b;

        /* renamed from: c */
        final /* synthetic */ List f107722c;

        a(ArrayList arrayList, Map map, List list) {
            this.f107720a = arrayList;
            this.f107721b = map;
            this.f107722c = list;
        }

        @Override // p142ey.C18641k.a
        /* renamed from: a */
        public void mo98521a(int i11) {
            if (i11 == 1) {
                C21913a0.this.m114183f(true);
            }
        }

        @Override // p142ey.C18641k.a
        /* renamed from: b */
        public void mo98522b(int i11) {
            if (i11 == 1) {
                Iterator<E> it = C28203u6.f131407a.m141813j(this.f107720a).iterator();
                while (it.hasNext()) {
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    if (contactProfile.f42394Y0 == 0) {
                        C31934gb c31934gb = new C31934gb(contactProfile);
                        c31934gb.f146730b = (String) this.f107721b.get(contactProfile.f42434r);
                        this.f107722c.add(c31934gb);
                    }
                }
                C21913a0.this.m114188o(this.f107722c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a0$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f107724a;

        b(List list) {
            this.f107724a = list;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42477nb();
            for (C31934gb c31934gb : this.f107724a) {
                if (!c31934gb.f146729a.equals(CoreUtility.f89233i)) {
                    C7960e.m41971c6().m42274T7(c31934gb);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a0$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f107726a;

        c(String str) {
            this.f107726a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42257Rb(this.f107726a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ks.a0$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31934gb f107728a;

        d(C31934gb c31934gb) {
            this.f107728a = c31934gb;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42274T7(this.f107728a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ks.a0$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a */
        static final C21913a0 f107730a = new C21913a0();
    }

    C21913a0() {
    }

    /* renamed from: i */
    public static C21913a0 m114177i() {
        return e.f107730a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m114178k(String str, boolean z11) {
        C31934gb c31934gb;
        try {
            C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), str);
            if (m2801g != null) {
                if (z11) {
                    this.f107717a.m114209m(str);
                    C0824j.m2153b(new c(str));
                } else {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m141809c != null) {
                        c31934gb = new C31934gb(m141809c);
                    } else {
                        c31934gb = new C31934gb(str, m2801g.m153298m(), 0);
                    }
                    this.f107717a.add(c31934gb);
                    C0824j.m2153b(new d(c31934gb));
                }
                C23744a.m124114c().m124116d(6088, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m114179l(List list) {
        try {
            try {
                this.f107717a.clear();
                this.f107717a.addAll(list);
                C0824j.m2153b(new b(list));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            m114183f(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m114180m(Map map) {
        try {
            this.f107719c.set(true);
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                if (!AbstractC21935u.m114558y(str) && !TextUtils.equals(str, CoreUtility.f89233i)) {
                    arrayList.add(str);
                }
            }
            if (!m114186j(arrayList)) {
                m114183f(false);
                return;
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            List<C31934gb> m42560v5 = C7960e.m41971c6().m42560v5();
            if (m42560v5 != null) {
                for (C31934gb c31934gb : m42560v5) {
                    if (!TextUtils.isEmpty(c31934gb.f146729a) && !TextUtils.isEmpty(c31934gb.f146730b)) {
                        if (!hashMap.containsKey(c31934gb.f146730b)) {
                            hashMap.put(c31934gb.f146730b, c31934gb);
                        }
                        if (!TextUtils.isEmpty(c31934gb.f146729a) && !hashMap2.containsKey(c31934gb.f146729a)) {
                            hashMap2.put(c31934gb.f146729a, c31934gb);
                        }
                    }
                }
            }
            List<C31934gb> m42570w5 = C7960e.m41971c6().m42570w5();
            if (m42570w5 != null) {
                for (C31934gb c31934gb2 : m42570w5) {
                    if (!TextUtils.isEmpty(c31934gb2.f146729a) && !TextUtils.isEmpty(c31934gb2.f146730b)) {
                        if (!hashMap.containsKey(c31934gb2.f146730b)) {
                            hashMap.put(c31934gb2.f146730b, c31934gb2);
                        }
                        if (!TextUtils.isEmpty(c31934gb2.f146729a) && !hashMap2.containsKey(c31934gb2.f146729a)) {
                            hashMap2.put(c31934gb2.f146729a, c31934gb2);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C31934gb c31934gb3 = (C31934gb) hashMap.get(str2);
                if (c31934gb3 != null && !TextUtils.isEmpty(c31934gb3.f146732d) && !TextUtils.isEmpty(c31934gb3.f146733e)) {
                    arrayList3.add(c31934gb3);
                }
                arrayList2.add(str2);
            }
            ArrayList arrayList4 = new ArrayList();
            C18635e m141813j = C28203u6.f131407a.m141813j(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!TextUtils.isEmpty(str3)) {
                    if (!m141813j.mo98490g(str3)) {
                        arrayList4.add(str3);
                    } else {
                        ContactProfile mo98491j = m141813j.mo98491j(str3);
                        C31934gb c31934gb4 = new C31934gb(mo98491j);
                        c31934gb4.f146730b = (String) map.get(mo98491j.f42434r);
                        arrayList3.add(c31934gb4);
                    }
                }
            }
            if (arrayList4.size() > 0) {
                C18641k.m98517c().m98520e(1, arrayList4, new a(arrayList4, map, arrayList3));
            } else {
                m114188o(arrayList3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m114181d(final String str, final boolean z11) {
        this.f107718b.execute(new Runnable() { // from class: ks.y
            @Override // java.lang.Runnable
            public final void run() {
                C21913a0.this.m114178k(str, z11);
            }
        });
    }

    /* renamed from: e */
    public C21915b0 m114182e() {
        return new C21915b0(this.f107717a);
    }

    /* renamed from: f */
    public void m114183f(boolean z11) {
        this.f107719c.set(false);
        if (AbstractC23309i.m121259O4() != 1) {
            AbstractC23309i.m121914fp(!z11 ? 1 : 0);
        }
        if (!z11) {
            C23744a.m124114c().m124116d(6088, new Object[0]);
        } else {
            C23744a.m124114c().m124116d(6089, new Object[0]);
        }
    }

    /* renamed from: g */
    public List m114184g() {
        return new ArrayList(this.f107717a);
    }

    /* renamed from: h */
    public Executor m114185h() {
        return this.f107718b;
    }

    /* renamed from: j */
    public boolean m114186j(List list) {
        if (this.f107717a.size() == 0 || list.size() != this.f107717a.size()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f107717a.m114206g((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void m114187n() {
        this.f107717a = C7960e.m41971c6().m42317Y4();
    }

    /* renamed from: o */
    public void m114188o(final List list) {
        this.f107718b.execute(new Runnable() { // from class: ks.z
            @Override // java.lang.Runnable
            public final void run() {
                C21913a0.this.m114179l(list);
            }
        });
    }

    /* renamed from: p */
    public void m114189p(final Map map) {
        this.f107718b.execute(new Runnable() { // from class: ks.x
            @Override // java.lang.Runnable
            public final void run() {
                C21913a0.this.m114180m(map);
            }
        });
    }
}
