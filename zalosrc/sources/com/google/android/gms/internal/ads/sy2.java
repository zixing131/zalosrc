package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sy2 implements qy2 {

    /* renamed from: a */
    private final qy2 f28060a;

    public sy2(qy2 qy2Var) {
        this.f28060a = qy2Var;
    }

    @Override // com.google.android.gms.internal.ads.qy2
    /* renamed from: a */
    public final void mo25919a(View view, JSONObject jSONObject, py2 py2Var, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        iy2 m23465a = iy2.m23465a();
        if (m23465a != null) {
            Collection m23466b = m23465a.m23466b();
            int size = m23466b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = m23466b.iterator();
            while (it.hasNext()) {
                View m28059f = ((xx2) it.next()).m28059f();
                if (m28059f != null && m28059f.isAttachedToWindow() && m28059f.isShown()) {
                    View view2 = m28059f;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                Object parent = view2.getParent();
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                } else {
                                    view2 = null;
                                }
                            }
                        } else {
                            View rootView = m28059f.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float m20773a = bz2.m20773a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i11 = size2 - 1;
                                    if (bz2.m20773a((View) arrayList.get(i11)) <= m20773a) {
                                        break;
                                    } else {
                                        size2 = i11;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            py2Var.mo23481a((View) arrayList.get(i12), this.f28060a, jSONObject, z12);
        }
    }

    @Override // com.google.android.gms.internal.ads.qy2
    public final JSONObject zza(View view) {
        throw null;
    }
}
