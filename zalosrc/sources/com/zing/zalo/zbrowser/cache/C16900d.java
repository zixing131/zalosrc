package com.zing.zalo.zbrowser.cache;

import java.util.Iterator;
import java.util.Map;
import p665y0.C30243e;

/* renamed from: com.zing.zalo.zbrowser.cache.d */
/* loaded from: classes7.dex */
public class C16900d extends C30243e {

    /* renamed from: i */
    private final Map f86120i;

    public C16900d(int i11, Map map) {
        super(i11);
        this.f86120i = map;
    }

    /* renamed from: k */
    public C16897a m90432k(String str, C16897a c16897a) {
        Map map = this.f86120i;
        if (map != null) {
            map.put(Integer.valueOf(str.hashCode()), this);
        }
        return (C16897a) m149140e(str, c16897a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p665y0.C30243e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo90430b(boolean z11, String str, C16897a c16897a, C16897a c16897a2) {
        Map map = this.f86120i;
        if (map != null) {
            map.remove(Integer.valueOf(str.hashCode()));
        }
    }

    /* renamed from: m */
    public long m90434m() {
        byte[] bArr;
        Iterator it = m149142i().entrySet().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            C16897a c16897a = (C16897a) ((Map.Entry) it.next()).getValue();
            if (c16897a != null && (bArr = c16897a.f86043c) != null) {
                j11 += bArr.length;
            }
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p665y0.C30243e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo90431h(String str, C16897a c16897a) {
        return c16897a.f86043c.length;
    }
}
