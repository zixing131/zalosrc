package p532u;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p467r.C25589l;
import p512t.C26435a;
import p532u.InterfaceC26911a;
import p562v.AbstractC27389b;
import p562v.AbstractC27393f;

/* renamed from: u.c */
/* loaded from: classes2.dex */
public class C26913c implements InterfaceC26911a {

    /* renamed from: a */
    private final InterfaceC26911a f127356a;

    public C26913c(InterfaceC26911a interfaceC26911a) {
        this.f127356a = interfaceC26911a;
    }

    @Override // p532u.InterfaceC26911a
    /* renamed from: a */
    public void mo138717a(View view, JSONObject jSONObject, InterfaceC26911a.a aVar, boolean z11) {
        Iterator it = m138722c().iterator();
        while (it.hasNext()) {
            aVar.mo138719a((View) it.next(), this.f127356a, jSONObject);
        }
    }

    @Override // p532u.InterfaceC26911a
    /* renamed from: b */
    public JSONObject mo138718b(View view) {
        return AbstractC27389b.m140317b(0, 0, 0, 0);
    }

    /* renamed from: c */
    ArrayList m138722c() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C26435a m136271a = C26435a.m136271a();
        if (m136271a != null) {
            Collection m136275e = m136271a.m136275e();
            IdentityHashMap identityHashMap = new IdentityHashMap((m136275e.size() * 2) + 3);
            Iterator it = m136275e.iterator();
            while (it.hasNext()) {
                View m132171p = ((C25589l) it.next()).m132171p();
                if (m132171p != null && AbstractC27393f.m140350c(m132171p) && (rootView = m132171p.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m140348a = AbstractC27393f.m140348a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && AbstractC27393f.m140348a((View) arrayList.get(size - 1)) > m140348a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }
}
