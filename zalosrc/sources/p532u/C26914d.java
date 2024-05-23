package p532u;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p532u.InterfaceC26911a;
import p562v.AbstractC27389b;

/* renamed from: u.d */
/* loaded from: classes2.dex */
public class C26914d implements InterfaceC26911a {

    /* renamed from: a */
    private final int[] f127357a = new int[2];

    /* renamed from: c */
    private void m138723c(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC26911a.a aVar) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            aVar.mo138719a(viewGroup.getChildAt(i11), this, jSONObject);
        }
    }

    /* renamed from: d */
    private void m138724d(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC26911a.a aVar) {
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo138719a((View) it2.next(), this, jSONObject);
            }
        }
    }

    @Override // p532u.InterfaceC26911a
    /* renamed from: a */
    public void mo138717a(View view, JSONObject jSONObject, InterfaceC26911a.a aVar, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z11) {
                m138724d(viewGroup, jSONObject, aVar);
            } else {
                m138723c(viewGroup, jSONObject, aVar);
            }
        }
    }

    @Override // p532u.InterfaceC26911a
    /* renamed from: b */
    public JSONObject mo138718b(View view) {
        if (view == null) {
            return AbstractC27389b.m140317b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f127357a);
        int[] iArr = this.f127357a;
        return AbstractC27389b.m140317b(iArr[0], iArr[1], width, height);
    }
}
