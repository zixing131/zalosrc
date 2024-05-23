package com.zing.zalo.shortvideo.data.utils;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC25392g
/* loaded from: classes5.dex */
public final class ZInstantPayload {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    private static final KSerializer[] f50354b = {new C26788f(ZInstantPayload$Entry$$serializer.INSTANCE)};

    /* renamed from: a */
    private final List f50355a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ZInstantPayload$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final String f50356a;

        /* renamed from: b */
        private boolean f50357b;

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return ZInstantPayload$Entry$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Entry(int i11, String str, boolean z11, AbstractC26805k1 abstractC26805k1) {
            if (1 != (i11 & 1)) {
                AbstractC26774a1.m137800b(i11, 1, ZInstantPayload$Entry$$serializer.INSTANCE.getDescriptor());
            }
            this.f50356a = str;
            if ((i11 & 2) == 0) {
                this.f50357b = false;
            } else {
                this.f50357b = z11;
            }
        }

        /* renamed from: c */
        public static final /* synthetic */ void m51715c(Entry entry, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, entry.f50356a);
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || entry.f50357b) {
                interfaceC21886d.mo114034y(serialDescriptor, 1, entry.f50357b);
            }
        }

        /* renamed from: a */
        public final String m51716a() {
            return this.f50356a;
        }

        /* renamed from: b */
        public final void m51717b(boolean z11) {
            this.f50357b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return AbstractC19074t.m100204b(this.f50356a, entry.f50356a) && this.f50357b == entry.f50357b;
        }

        public int hashCode() {
            return (this.f50356a.hashCode() * 31) + AbstractC2144f.m11520a(this.f50357b);
        }

        public String toString() {
            return "Entry(videoId=" + this.f50356a + ", isSeen=" + this.f50357b + ")";
        }
    }

    public /* synthetic */ ZInstantPayload(int i11, List list, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, ZInstantPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.f50355a = list;
    }

    /* renamed from: b */
    public final List m51714b() {
        return this.f50355a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZInstantPayload) && AbstractC19074t.m100204b(this.f50355a, ((ZInstantPayload) obj).f50355a);
    }

    public int hashCode() {
        return this.f50355a.hashCode();
    }

    public String toString() {
        return "ZInstantPayload(data=" + this.f50355a + ")";
    }
}
