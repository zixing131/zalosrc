package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class TestData {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50196a;

    /* renamed from: b */
    private final String f50197b;

    /* renamed from: c */
    private final int f50198c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return TestData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TestData(int i11, String str, String str2, int i12, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, TestData$$serializer.INSTANCE.getDescriptor());
        }
        this.f50196a = str;
        this.f50197b = str2;
        this.f50198c = i12;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m51539a(TestData testData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, testData.f50196a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, testData.f50197b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, testData.f50198c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestData)) {
            return false;
        }
        TestData testData = (TestData) obj;
        return AbstractC19074t.m100204b(this.f50196a, testData.f50196a) && AbstractC19074t.m100204b(this.f50197b, testData.f50197b) && this.f50198c == testData.f50198c;
    }

    public int hashCode() {
        return (((this.f50196a.hashCode() * 31) + this.f50197b.hashCode()) * 31) + this.f50198c;
    }

    public String toString() {
        return "TestData(cfgVersion=" + this.f50196a + ", countryCode=" + this.f50197b + ", startTabIndex=" + this.f50198c + ")";
    }
}
