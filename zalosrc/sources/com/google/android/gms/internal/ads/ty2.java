package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ty2 implements qy2 {

    /* renamed from: a */
    private final int[] f28657a = new int[2];

    @Override // com.google.android.gms.internal.ads.qy2
    /* renamed from: a */
    public final void mo25919a(View view, JSONObject jSONObject, py2 py2Var, boolean z11, boolean z12) {
        int i11;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (z11) {
            HashMap hashMap = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i11 = i13 + 1;
                    if (i14 < size2) {
                        py2Var.mo23481a((View) arrayList3.get(i14), this, jSONObject, z12);
                        i14++;
                    }
                }
                i13 = i11;
            }
            return;
        }
        for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
            py2Var.mo23481a(viewGroup.getChildAt(i15), this, jSONObject, z12);
        }
    }

    @Override // com.google.android.gms.internal.ads.qy2
    public final JSONObject zza(View view) {
        if (view == null) {
            return yy2.m28388a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f28657a);
        int[] iArr = this.f28657a;
        return yy2.m28388a(iArr[0], iArr[1], width, height);
    }
}
