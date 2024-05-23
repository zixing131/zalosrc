package com.google.firebase.remoteconfig.internal;

import p541u9.InterfaceC27202j;

/* renamed from: com.google.firebase.remoteconfig.internal.v */
/* loaded from: classes3.dex */
public class C6738v implements InterfaceC27202j {

    /* renamed from: a */
    private final String f37090a;

    /* renamed from: b */
    private final int f37091b;

    public C6738v(String str, int i11) {
        this.f37090a = str;
        this.f37091b = i11;
    }

    /* renamed from: e */
    private String m34505e() {
        return mo34507a().trim();
    }

    /* renamed from: f */
    private void m34506f() {
        if (this.f37090a != null) {
        } else {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // p541u9.InterfaceC27202j
    /* renamed from: a */
    public String mo34507a() {
        if (this.f37091b == 0) {
            return "";
        }
        m34506f();
        return this.f37090a;
    }

    @Override // p541u9.InterfaceC27202j
    /* renamed from: b */
    public long mo34508b() {
        if (this.f37091b == 0) {
            return 0L;
        }
        String m34505e = m34505e();
        try {
            return Long.valueOf(m34505e).longValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m34505e, "long"), e11);
        }
    }

    @Override // p541u9.InterfaceC27202j
    /* renamed from: c */
    public double mo34509c() {
        if (this.f37091b == 0) {
            return 0.0d;
        }
        String m34505e = m34505e();
        try {
            return Double.valueOf(m34505e).doubleValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m34505e, "double"), e11);
        }
    }

    @Override // p541u9.InterfaceC27202j
    /* renamed from: d */
    public boolean mo34510d() {
        if (this.f37091b == 0) {
            return false;
        }
        String m34505e = m34505e();
        if (C6731o.f37034f.matcher(m34505e).matches()) {
            return true;
        }
        if (C6731o.f37035g.matcher(m34505e).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m34505e, "boolean"));
    }

    @Override // p541u9.InterfaceC27202j
    /* renamed from: h */
    public int mo34511h() {
        return this.f37091b;
    }
}
