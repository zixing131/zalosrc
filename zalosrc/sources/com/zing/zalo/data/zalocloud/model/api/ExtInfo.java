package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class ExtInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    private static final KSerializer[] f43075b = {new C26788f(Msg$$serializer.INSTANCE)};

    /* renamed from: a */
    private final List f43076a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ExtInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExtInfo(int i11, List list, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, ExtInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43076a = list;
    }

    /* renamed from: b */
    public final List m41345b() {
        return this.f43076a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtInfo) && AbstractC19074t.m100204b(this.f43076a, ((ExtInfo) obj).f43076a);
    }

    public int hashCode() {
        return this.f43076a.hashCode();
    }

    public String toString() {
        return "ExtInfo(orgMsgs=" + this.f43076a + ")";
    }
}
