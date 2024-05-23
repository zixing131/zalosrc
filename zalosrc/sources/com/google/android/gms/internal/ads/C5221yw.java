package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yw */
/* loaded from: classes2.dex */
public final class C5221yw {

    /* renamed from: a */
    private final Collection f31236a = new ArrayList();

    /* renamed from: b */
    private final Collection f31237b = new ArrayList();

    /* renamed from: c */
    private final Collection f31238c = new ArrayList();

    /* renamed from: a */
    public final List m28364a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f31237b.iterator();
        while (it.hasNext()) {
            String str = (String) zzay.zzc().m21823b((AbstractC5184xw) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(AbstractC4591hx.m23058a());
        return arrayList;
    }

    /* renamed from: b */
    public final List m28365b() {
        List m28364a = m28364a();
        Iterator it = this.f31238c.iterator();
        while (it.hasNext()) {
            String str = (String) zzay.zzc().m21823b((AbstractC5184xw) it.next());
            if (!TextUtils.isEmpty(str)) {
                m28364a.add(str);
            }
        }
        m28364a.addAll(AbstractC4591hx.m23059b());
        return m28364a;
    }

    /* renamed from: c */
    public final void m28366c(AbstractC5184xw abstractC5184xw) {
        this.f31237b.add(abstractC5184xw);
    }

    /* renamed from: d */
    public final void m28367d(AbstractC5184xw abstractC5184xw) {
        this.f31236a.add(abstractC5184xw);
    }

    /* renamed from: e */
    public final void m28368e(SharedPreferences.Editor editor, int i11, JSONObject jSONObject) {
        for (AbstractC5184xw abstractC5184xw : this.f31236a) {
            if (abstractC5184xw.m28037e() == 1) {
                abstractC5184xw.mo26199d(editor, abstractC5184xw.mo26196a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            yk0.zzg("Flag Json is null.");
        }
    }
}
