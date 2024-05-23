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
import p151f6.AbstractC18746b0;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.maps.h */
/* loaded from: classes2.dex */
final class C5900h extends AbstractC4270a {

    /* renamed from: e */
    private final ViewGroup f33597e;

    /* renamed from: f */
    private final Context f33598f;

    /* renamed from: g */
    protected InterfaceC4274e f33599g;

    /* renamed from: h */
    private final StreetViewPanoramaOptions f33600h;

    /* renamed from: i */
    private final List f33601i = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5900h(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f33597e = viewGroup;
        this.f33598f = context;
        this.f33600h = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.AbstractC4270a
    /* renamed from: a */
    protected final void mo19902a(InterfaceC4274e interfaceC4274e) {
        this.f33599g = interfaceC4274e;
        m30678q();
    }

    /* renamed from: q */
    public final void m30678q() {
        if (this.f33599g != null && m19903b() == null) {
            try {
                AbstractC18254d.m97043a(this.f33598f);
                this.f33599g.mo19915a(new C5899g(this.f33597e, AbstractC18746b0.m98753a(this.f33598f, null).mo98764u1(BinderC4273d.m19913I3(this.f33598f), this.f33600h)));
                Iterator it = this.f33601i.iterator();
                while (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                    ((C5899g) m19903b()).m30677a(null);
                }
                this.f33601i.clear();
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
