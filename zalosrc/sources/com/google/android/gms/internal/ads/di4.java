package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class di4 implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a */
    final /* synthetic */ si4 f19258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public di4(li4 li4Var, si4 si4Var) {
        this.f19258a = si4Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z11) {
        this.f19258a.m26332t();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z11) {
        this.f19258a.m26332t();
    }
}
