package p123e6;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import p123e6.C18253c;
import p151f6.AbstractBinderC18778u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e6.p */
/* loaded from: classes2.dex */
public final class BinderC18266p extends AbstractBinderC18778u {

    /* renamed from: p */
    final /* synthetic */ C18253c.i f92475p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC18266p(C18253c c18253c, C18253c.i iVar) {
        this.f92475p = iVar;
    }

    @Override // p151f6.InterfaceC18779v
    /* renamed from: o3 */
    public final void mo97051o3(Bitmap bitmap) {
        this.f92475p.mo47980a(bitmap);
    }

    @Override // p151f6.InterfaceC18779v
    public final void zzc(InterfaceC4271b interfaceC4271b) {
        this.f92475p.mo47980a((Bitmap) BinderC4273d.m19914Q(interfaceC4271b));
    }
}
