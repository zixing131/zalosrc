package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class PassPhraseSetupContainerViewState {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final boolean f55698a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return PassPhraseSetupContainerViewState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PassPhraseSetupContainerViewState(int i11, boolean z11, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f55698a = false;
        } else {
            this.f55698a = z11;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m57595c(PassPhraseSetupContainerViewState passPhraseSetupContainerViewState, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || passPhraseSetupContainerViewState.f55698a) {
            interfaceC21886d.mo114034y(serialDescriptor, 0, passPhraseSetupContainerViewState.f55698a);
        }
    }

    /* renamed from: a */
    public final PassPhraseSetupContainerViewState m57596a(boolean z11) {
        return new PassPhraseSetupContainerViewState(z11);
    }

    /* renamed from: b */
    public final boolean m57597b() {
        return this.f55698a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassPhraseSetupContainerViewState) && this.f55698a == ((PassPhraseSetupContainerViewState) obj).f55698a;
    }

    public int hashCode() {
        return AbstractC2144f.m11520a(this.f55698a);
    }

    public String toString() {
        return "PassPhraseSetupContainerViewState(isLoading=" + this.f55698a + ")";
    }

    public PassPhraseSetupContainerViewState(boolean z11) {
        this.f55698a = z11;
    }

    public /* synthetic */ PassPhraseSetupContainerViewState(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
