package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26795h0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class DownloadUrlsResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    private static final KSerializer[] f43068b;

    /* renamed from: a */
    private final Map f43069a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return DownloadUrlsResponse$$serializer.INSTANCE;
        }
    }

    static {
        C26814n1 c26814n1 = C26814n1.f127034a;
        f43068b = new KSerializer[]{new C26795h0(c26814n1, c26814n1)};
    }

    public /* synthetic */ DownloadUrlsResponse(int i11, Map map, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, DownloadUrlsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43069a = map;
    }

    /* renamed from: b */
    public final Map m41335b() {
        return this.f43069a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownloadUrlsResponse) && AbstractC19074t.m100204b(this.f43069a, ((DownloadUrlsResponse) obj).f43069a);
    }

    public int hashCode() {
        return this.f43069a.hashCode();
    }

    public String toString() {
        return this.f43069a.keySet().toString();
    }
}
