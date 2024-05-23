package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p468r0.AbstractC25592c;
import p468r0.AbstractServiceConnectionC25594e;

/* loaded from: classes2.dex */
public final class y04 extends AbstractServiceConnectionC25594e {

    /* renamed from: q */
    private final WeakReference f30722q;

    public y04(C4555gy c4555gy, byte[] bArr) {
        this.f30722q = new WeakReference(c4555gy);
    }

    @Override // p468r0.AbstractServiceConnectionC25594e
    /* renamed from: a */
    public final void mo28105a(ComponentName componentName, AbstractC25592c abstractC25592c) {
        C4555gy c4555gy = (C4555gy) this.f30722q.get();
        if (c4555gy != null) {
            c4555gy.m22632c(abstractC25592c);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4555gy c4555gy = (C4555gy) this.f30722q.get();
        if (c4555gy != null) {
            c4555gy.m22633d();
        }
    }
}
