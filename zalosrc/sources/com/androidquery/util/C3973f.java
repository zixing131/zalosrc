package com.androidquery.util;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p379o3.C23999j;
import p436q3.EnumC25103a;
import p502s3.C26117c;

/* renamed from: com.androidquery.util.f */
/* loaded from: classes2.dex */
public class C3973f extends LinkedHashMap {
    private static final long serialVersionUID = 1;

    /* renamed from: p */
    private final int f15710p;

    /* renamed from: q */
    private final int f15711q;

    /* renamed from: r */
    private final int f15712r;

    /* renamed from: s */
    private int f15713s;

    public C3973f(int i11, int i12, int i13, EnumC25103a enumC25103a) {
        super(8, 0.75f, true);
        this.f15710p = i11;
        this.f15711q = i12;
        this.f15712r = i13;
    }

    /* renamed from: a */
    private int m18814a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth() * bitmap.getHeight();
    }

    /* renamed from: e */
    private void m18815e() {
        if (this.f15713s > this.f15712r) {
            Iterator it = keySet().iterator();
            while (it.hasNext() && this.f15713s > this.f15712r && size() > 1) {
                it.next();
                it.remove();
            }
        }
        if (size() > this.f15710p) {
            Iterator it2 = keySet().iterator();
            while (it2.hasNext()) {
                it2.next();
                it2.remove();
                if (size() <= this.f15710p) {
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m18816f() {
        if (this.f15713s > this.f15712r) {
            ArrayList arrayList = new ArrayList(keySet());
            for (int i11 = 0; i11 < arrayList.size() && this.f15713s > this.f15712r && size() > 1; i11++) {
                remove(arrayList.get(i11));
            }
        }
        if (size() > this.f15710p) {
            ArrayList arrayList2 = new ArrayList(keySet());
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                remove(arrayList2.get(i12));
                if (size() <= this.f15710p) {
                    return;
                }
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3979l put(String str, C3979l c3979l) {
        if (c3979l == null) {
            return null;
        }
        int m18814a = m18814a(c3979l.m18839c());
        if (m18814a <= this.f15711q) {
            this.f15713s += m18814a;
            c3979l.m18852p(true);
            C3979l c3979l2 = (C3979l) super.put(str, c3979l);
            if (c3979l2 != null) {
                this.f15713s -= m18814a(c3979l2.m18839c());
                c3979l2.m18852p(false);
            }
        }
        if (C23999j.f116214g1) {
            m18816f();
        } else {
            m18815e();
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3979l remove(Object obj) {
        C3979l c3979l = (C3979l) super.remove(obj);
        if (c3979l == null) {
            return null;
        }
        this.f15713s -= m18814a(c3979l.m18839c());
        c3979l.m18852p(false);
        if (c3979l.m18837a()) {
            C26117c.m134454d().m134458e(c3979l.m18839c());
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f15713s = 0;
    }

    /* renamed from: g */
    public synchronized void m18819g(int i11) {
        if (size() > i11) {
            Iterator it = keySet().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
                if (size() <= i11) {
                    break;
                }
            }
        }
    }
}
