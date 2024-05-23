package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.AbstractC4270a;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4274e;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p123e6.AbstractC18254d;
import p123e6.InterfaceC18255e;
import p151f6.AbstractC18746b0;
import p151f6.InterfaceC18747c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.maps.d */
/* loaded from: classes2.dex */
public final class C5896d extends AbstractC4270a {

    /* renamed from: e */
    private final ViewGroup f33589e;

    /* renamed from: f */
    private final Context f33590f;

    /* renamed from: g */
    protected InterfaceC4274e f33591g;

    /* renamed from: h */
    private final GoogleMapOptions f33592h;

    /* renamed from: i */
    private final List f33593i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5896d(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f33589e = viewGroup;
        this.f33590f = context;
        this.f33592h = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.AbstractC4270a
    /* renamed from: a */
    protected final void mo19902a(InterfaceC4274e interfaceC4274e) {
        this.f33591g = interfaceC4274e;
        m30675r();
    }

    /* renamed from: q */
    public final void m30674q(InterfaceC18255e interfaceC18255e) {
        if (m19903b() != null) {
            ((C5895c) m19903b()).m30673a(interfaceC18255e);
        } else {
            this.f33593i.add(interfaceC18255e);
        }
    }

    /* renamed from: r */
    public final void m30675r() {
        if (this.f33591g != null && m19903b() == null) {
            try {
                AbstractC18254d.m97043a(this.f33590f);
                InterfaceC18747c mo98763i4 = AbstractC18746b0.m98753a(this.f33590f, null).mo98763i4(BinderC4273d.m19913I3(this.f33590f), this.f33592h);
                if (mo98763i4 == null) {
                    return;
                }
                this.f33591g.mo19915a(new C5895c(this.f33589e, mo98763i4));
                Iterator it = this.f33593i.iterator();
                while (it.hasNext()) {
                    ((C5895c) m19903b()).m30673a((InterfaceC18255e) it.next());
                }
                this.f33593i.clear();
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
