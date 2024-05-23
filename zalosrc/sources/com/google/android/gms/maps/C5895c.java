package com.google.android.gms.maps;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4272c;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p123e6.InterfaceC18255e;
import p151f6.AbstractC18744a0;
import p151f6.InterfaceC18747c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.maps.c */
/* loaded from: classes2.dex */
public final class C5895c implements InterfaceC4272c {

    /* renamed from: a */
    private final ViewGroup f33586a;

    /* renamed from: b */
    private final InterfaceC18747c f33587b;

    /* renamed from: c */
    private View f33588c;

    public C5895c(ViewGroup viewGroup, InterfaceC18747c interfaceC18747c) {
        this.f33587b = (InterfaceC18747c) AbstractC4205o.m19722k(interfaceC18747c);
        this.f33586a = (ViewGroup) AbstractC4205o.m19722k(viewGroup);
    }

    /* renamed from: a */
    public final void m30673a(InterfaceC18255e interfaceC18255e) {
        try {
            this.f33587b.mo98758U4(new BinderC5894b(this, interfaceC18255e));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onDestroy() {
        try {
            this.f33587b.onDestroy();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onLowMemory() {
        try {
            this.f33587b.onLowMemory();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onPause() {
        try {
            this.f33587b.onPause();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onResume() {
        try {
            this.f33587b.onResume();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onStart() {
        try {
            this.f33587b.onStart();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onStop() {
        try {
            this.f33587b.onStop();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    /* renamed from: s */
    public final void mo19912s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            AbstractC18744a0.m98730b(bundle, bundle2);
            this.f33587b.mo98759s(bundle2);
            AbstractC18744a0.m98730b(bundle2, bundle);
            this.f33588c = (View) BinderC4273d.m19914Q(this.f33587b.getView());
            this.f33586a.removeAllViews();
            this.f33586a.addView(this.f33588c);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
