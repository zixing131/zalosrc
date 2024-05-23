package com.google.android.gms.maps;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4272c;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p123e6.InterfaceC18257g;
import p151f6.AbstractC18744a0;
import p151f6.InterfaceC18753f;

/* renamed from: com.google.android.gms.maps.g */
/* loaded from: classes2.dex */
final class C5899g implements InterfaceC4272c {

    /* renamed from: a */
    private final ViewGroup f33594a;

    /* renamed from: b */
    private final InterfaceC18753f f33595b;

    /* renamed from: c */
    private View f33596c;

    public C5899g(ViewGroup viewGroup, InterfaceC18753f interfaceC18753f) {
        this.f33595b = (InterfaceC18753f) AbstractC4205o.m19722k(interfaceC18753f);
        this.f33594a = (ViewGroup) AbstractC4205o.m19722k(viewGroup);
    }

    /* renamed from: a */
    public final void m30677a(InterfaceC18257g interfaceC18257g) {
        try {
            this.f33595b.mo98765j2(new BinderC5898f(this, interfaceC18257g));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onDestroy() {
        try {
            this.f33595b.onDestroy();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onLowMemory() {
        try {
            this.f33595b.onLowMemory();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onPause() {
        try {
            this.f33595b.onPause();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onResume() {
        try {
            this.f33595b.onResume();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onStart() {
        try {
            this.f33595b.onStart();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    @Override // com.google.android.gms.dynamic.InterfaceC4272c
    public final void onStop() {
        try {
            this.f33595b.onStop();
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
            this.f33595b.mo98766s(bundle2);
            AbstractC18744a0.m98730b(bundle2, bundle);
            this.f33596c = (View) BinderC4273d.m19914Q(this.f33595b.getView());
            this.f33594a.removeAllViews();
            this.f33594a.addView(this.f33596c);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
