package com.zing.zalo.p077ui.backuprestore.encryption.setup.pin;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class PinCodeSetupContainerViewState {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final boolean f55760a;

    /* renamed from: b */
    private final boolean f55761b;

    /* renamed from: c */
    private final boolean f55762c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PinCodeSetupContainerViewState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PinCodeSetupContainerViewState(int i11, boolean z11, boolean z12, boolean z13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f55760a = false;
        } else {
            this.f55760a = z11;
        }
        if ((i11 & 2) == 0) {
            this.f55761b = false;
        } else {
            this.f55761b = z12;
        }
        if ((i11 & 4) == 0) {
            this.f55762c = false;
        } else {
            this.f55762c = z13;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ PinCodeSetupContainerViewState m57696b(PinCodeSetupContainerViewState pinCodeSetupContainerViewState, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = pinCodeSetupContainerViewState.f55760a;
        }
        if ((i11 & 2) != 0) {
            z12 = pinCodeSetupContainerViewState.f55761b;
        }
        if ((i11 & 4) != 0) {
            z13 = pinCodeSetupContainerViewState.f55762c;
        }
        return pinCodeSetupContainerViewState.m57698a(z11, z12, z13);
    }

    /* renamed from: f */
    public static final /* synthetic */ void m57697f(PinCodeSetupContainerViewState pinCodeSetupContainerViewState, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || pinCodeSetupContainerViewState.f55760a) {
            interfaceC21886d.mo114034y(serialDescriptor, 0, pinCodeSetupContainerViewState.f55760a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || pinCodeSetupContainerViewState.f55761b) {
            interfaceC21886d.mo114034y(serialDescriptor, 1, pinCodeSetupContainerViewState.f55761b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || pinCodeSetupContainerViewState.f55762c) {
            interfaceC21886d.mo114034y(serialDescriptor, 2, pinCodeSetupContainerViewState.f55762c);
        }
    }

    /* renamed from: a */
    public final PinCodeSetupContainerViewState m57698a(boolean z11, boolean z12, boolean z13) {
        return new PinCodeSetupContainerViewState(z11, z12, z13);
    }

    /* renamed from: c */
    public final boolean m57699c() {
        return this.f55760a;
    }

    /* renamed from: d */
    public final boolean m57700d() {
        return this.f55761b;
    }

    /* renamed from: e */
    public final boolean m57701e() {
        return this.f55762c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinCodeSetupContainerViewState)) {
            return false;
        }
        PinCodeSetupContainerViewState pinCodeSetupContainerViewState = (PinCodeSetupContainerViewState) obj;
        return this.f55760a == pinCodeSetupContainerViewState.f55760a && this.f55761b == pinCodeSetupContainerViewState.f55761b && this.f55762c == pinCodeSetupContainerViewState.f55762c;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f55760a) * 31) + AbstractC2144f.m11520a(this.f55761b)) * 31) + AbstractC2144f.m11520a(this.f55762c);
    }

    public String toString() {
        return "PinCodeSetupContainerViewState(isLoading=" + this.f55760a + ", isShowError=" + this.f55761b + ", isSmallDevice=" + this.f55762c + ")";
    }

    public PinCodeSetupContainerViewState(boolean z11, boolean z12, boolean z13) {
        this.f55760a = z11;
        this.f55761b = z12;
        this.f55762c = z13;
    }

    public /* synthetic */ PinCodeSetupContainerViewState(boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13);
    }
}
