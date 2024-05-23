package com.google.protobuf;

import com.google.protobuf.C6788b0;
import java.util.Map;

/* renamed from: com.google.protobuf.e0 */
/* loaded from: classes3.dex */
class C6797e0 implements InterfaceC6794d0 {
    /* renamed from: f */
    private static int m34781f(int i11, Object obj, Object obj2) {
        C6791c0 c6791c0 = (C6791c0) obj;
        C6788b0 c6788b0 = (C6788b0) obj2;
        int i12 = 0;
        if (c6791c0.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c6791c0.entrySet()) {
            i12 += c6788b0.m34732a(i11, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    /* renamed from: g */
    private static C6791c0 m34782g(Object obj, Object obj2) {
        C6791c0 c6791c0 = (C6791c0) obj;
        C6791c0 c6791c02 = (C6791c0) obj2;
        if (!c6791c02.isEmpty()) {
            if (!c6791c0.m34748i()) {
                c6791c0 = c6791c0.m34751n();
            }
            c6791c0.m34750l(c6791c02);
        }
        return c6791c0;
    }

    @Override // com.google.protobuf.InterfaceC6794d0
    /* renamed from: a */
    public Object mo34763a(Object obj, Object obj2) {
        return m34782g(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC6794d0
    /* renamed from: b */
    public C6788b0.a mo34764b(Object obj) {
        return ((C6788b0) obj).m34733c();
    }

    @Override // com.google.protobuf.InterfaceC6794d0
    /* renamed from: c */
    public Map mo34765c(Object obj) {
        return (C6791c0) obj;
    }

    @Override // com.google.protobuf.InterfaceC6794d0
    /* renamed from: d */
    public Object mo34766d(Object obj) {
        ((C6791c0) obj).m34749k();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC6794d0
    /* renamed from: e */
    public int mo34767e(int i11, Object obj, Object obj2) {
        return m34781f(i11, obj, obj2);
    }
}
