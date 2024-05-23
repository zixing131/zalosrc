package com.zing.zalo.zinstant.zom.node;

import androidx.core.util.InterfaceC1479a;
import com.zing.zalo.adapter.AbstractC6921a;
import qk0.InterfaceC25306b;
import qk0.InterfaceC25307c;

/* loaded from: classes7.dex */
public class ZOMAudio extends ZOMMedia {

    /* loaded from: classes7.dex */
    public static class ZOMAudioFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMAudio create() {
            return ZOMAudio.access$000();
        }
    }

    static /* synthetic */ ZOMAudio access$000() {
        return requireNewObject();
    }

    public static ZOMAudio createObject() {
        return requireNewObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$1(InterfaceC25307c interfaceC25307c) {
        if (interfaceC25307c instanceof InterfaceC25306b) {
            ((InterfaceC25306b) interfaceC25307c).mo124580i(this.mSrc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$0(int i11, InterfaceC25307c interfaceC25307c) {
        if (interfaceC25307c instanceof InterfaceC25306b) {
            ((InterfaceC25306b) interfaceC25307c).mo124579h(this.mSrc, i11, this.mStreaming, this.mLoop);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekTo$2(int i11, InterfaceC25307c interfaceC25307c) {
        if (interfaceC25307c instanceof InterfaceC25306b) {
            ((InterfaceC25306b) interfaceC25307c).mo124578d(this.mSrc, i11);
        }
    }

    private static ZOMAudio requireNewObject() {
        return new ZOMAudio();
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOMMedia
    public void pause() {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.g
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZOMAudio.this.lambda$pause$1((InterfaceC25307c) obj);
            }
        });
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOMMedia
    public void play(final int i11) {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.f
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZOMAudio.this.lambda$play$0(i11, (InterfaceC25307c) obj);
            }
        });
    }

    public void requestPlay() {
        play(getCurrentTimeMills());
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOMMedia
    public void seekTo(final int i11) {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.h
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZOMAudio.this.lambda$seekTo$2(i11, (InterfaceC25307c) obj);
            }
        });
    }
}
