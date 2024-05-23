package p672y7;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p014a8.InterfaceC0650a;
import p015a9.InterfaceC0662b;

/* renamed from: y7.b */
/* loaded from: classes3.dex */
public class C30805b {

    /* renamed from: a */
    private final InterfaceC0662b f142263a;

    /* renamed from: b */
    private final String f142264b;

    /* renamed from: c */
    private Integer f142265c = null;

    public C30805b(Context context, InterfaceC0662b interfaceC0662b, String str) {
        this.f142263a = interfaceC0662b;
        this.f142264b = str;
    }

    /* renamed from: a */
    private void m149877a(InterfaceC0650a.c cVar) {
        ((InterfaceC0650a) this.f142263a.get()).mo931b(cVar);
    }

    /* renamed from: b */
    private void m149878b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(m149881f());
        int m149884i = m149884i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30804a c30804a = (C30804a) it.next();
            while (arrayDeque.size() >= m149884i) {
                m149885k(((InterfaceC0650a.c) arrayDeque.pollFirst()).f2184b);
            }
            InterfaceC0650a.c m149876f = c30804a.m149876f(this.f142264b);
            m149877a(m149876f);
            arrayDeque.offer(m149876f);
        }
    }

    /* renamed from: c */
    private static List m149879c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C30804a.m149871b((Map) it.next()));
        }
        return arrayList;
    }

    /* renamed from: d */
    private boolean m149880d(List list, C30804a c30804a) {
        String m149873c = c30804a.m149873c();
        String m149875e = c30804a.m149875e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30804a c30804a2 = (C30804a) it.next();
            if (c30804a2.m149873c().equals(m149873c) && c30804a2.m149875e().equals(m149875e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private List m149881f() {
        return ((InterfaceC0650a) this.f142263a.get()).mo936g(this.f142264b, "");
    }

    /* renamed from: g */
    private ArrayList m149882g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30804a c30804a = (C30804a) it.next();
            if (!m149880d(list2, c30804a)) {
                arrayList.add(c30804a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private ArrayList m149883h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30804a c30804a = (C30804a) it.next();
            if (!m149880d(list2, c30804a)) {
                arrayList.add(c30804a.m149876f(this.f142264b));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private int m149884i() {
        if (this.f142265c == null) {
            this.f142265c = Integer.valueOf(((InterfaceC0650a) this.f142263a.get()).mo935f(this.f142264b));
        }
        return this.f142265c.intValue();
    }

    /* renamed from: k */
    private void m149885k(String str) {
        ((InterfaceC0650a) this.f142263a.get()).clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: l */
    private void m149886l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m149885k(((InterfaceC0650a.c) it.next()).f2184b);
        }
    }

    /* renamed from: n */
    private void m149887n(List list) {
        if (list.isEmpty()) {
            m149890j();
            return;
        }
        List m149889e = m149889e();
        m149886l(m149883h(m149889e, list));
        m149878b(m149882g(list, m149889e));
    }

    /* renamed from: o */
    private void m149888o() {
        if (this.f142263a.get() != null) {
        } else {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    /* renamed from: e */
    public List m149889e() {
        m149888o();
        List m149881f = m149881f();
        ArrayList arrayList = new ArrayList();
        Iterator it = m149881f.iterator();
        while (it.hasNext()) {
            arrayList.add(C30804a.m149870a((InterfaceC0650a.c) it.next()));
        }
        return arrayList;
    }

    /* renamed from: j */
    public void m149890j() {
        m149888o();
        m149886l(m149881f());
    }

    /* renamed from: m */
    public void m149891m(List list) {
        m149888o();
        if (list != null) {
            m149887n(m149879c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
