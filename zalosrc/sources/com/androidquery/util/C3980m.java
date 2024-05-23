package com.androidquery.util;

import java.util.List;

/* renamed from: com.androidquery.util.m */
/* loaded from: classes2.dex */
public class C3980m extends C3979l {

    /* renamed from: q */
    public List f15763q;

    public C3980m(List list) {
        this.f15763q = list;
    }

    @Override // com.androidquery.util.C3979l
    /* renamed from: q */
    public void mo18853q(boolean z11) {
        List<C3979l> list = this.f15763q;
        if (list != null) {
            for (C3979l c3979l : list) {
                if (c3979l != null) {
                    c3979l.mo18853q(z11);
                }
            }
        }
    }

    /* renamed from: u */
    public C3979l m18857u() {
        List list = this.f15763q;
        if (list != null && list.size() != 0) {
            return (C3979l) this.f15763q.get(r0.size() - 1);
        }
        return null;
    }
}
