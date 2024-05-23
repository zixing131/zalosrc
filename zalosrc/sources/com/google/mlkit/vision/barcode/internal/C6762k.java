package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzad;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import la.C22166a;
import na.C23639c;
import p234ia.AbstractC20469l;
import p294ka.C21631b;
import p385oa.C24141a;
import p670y5.AbstractBinderC30430h;
import p670y5.C30392f;
import p670y5.C30561ng;
import p670y5.EnumC30386ec;
import pa.AbstractC24702b;
import pa.C24704d;

/* renamed from: com.google.mlkit.vision.barcode.internal.k */
/* loaded from: classes3.dex */
final class C6762k implements InterfaceC6760i {

    /* renamed from: a */
    private boolean f37172a;

    /* renamed from: b */
    private final Context f37173b;

    /* renamed from: c */
    private final zzad f37174c;

    /* renamed from: d */
    private final C30561ng f37175d;

    /* renamed from: e */
    private C30392f f37176e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6762k(Context context, C21631b c21631b, C30561ng c30561ng) {
        zzad zzadVar = new zzad();
        this.f37174c = zzadVar;
        this.f37173b = context;
        zzadVar.f32981p = c21631b.m111558a();
        this.f37175d = c30561ng;
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6760i
    /* renamed from: a */
    public final List mo34585a(C24141a c24141a) {
        zzq[] m149501W4;
        if (this.f37176e == null) {
            zzc();
        }
        C30392f c30392f = this.f37176e;
        if (c30392f != null) {
            C30392f c30392f2 = (C30392f) AbstractC4205o.m19722k(c30392f);
            zzaj zzajVar = new zzaj(c24141a.m126127l(), c24141a.m126123h(), 0, 0L, AbstractC24702b.m128272a(c24141a.m126126k()));
            try {
                int m126122g = c24141a.m126122g();
                if (m126122g != -1) {
                    if (m126122g != 17) {
                        if (m126122g != 35) {
                            if (m126122g == 842094169) {
                                m149501W4 = c30392f2.m149500I3(BinderC4273d.m19913I3(C24704d.m128277e().m128284c(c24141a, false)), zzajVar);
                            } else {
                                throw new MlKitException("Unsupported image format: " + c24141a.m126122g(), 3);
                            }
                        } else {
                            Image.Plane[] planeArr = (Image.Plane[]) AbstractC4205o.m19722k(c24141a.m126125j());
                            zzajVar.f32983p = planeArr[0].getRowStride();
                            m149501W4 = c30392f2.m149500I3(BinderC4273d.m19913I3(planeArr[0].getBuffer()), zzajVar);
                        }
                    } else {
                        m149501W4 = c30392f2.m149500I3(BinderC4273d.m19913I3(c24141a.m126120e()), zzajVar);
                    }
                } else {
                    m149501W4 = c30392f2.m149501W4(BinderC4273d.m19913I3(c24141a.m126119d()), zzajVar);
                }
                ArrayList arrayList = new ArrayList();
                for (zzq zzqVar : m149501W4) {
                    arrayList.add(new C22166a(new C23639c(zzqVar), c24141a.m126121f()));
                }
                return arrayList;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to detect with legacy barcode detector", 13, e11);
            }
        }
        throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6760i
    public final void zzb() {
        C30392f c30392f = this.f37176e;
        if (c30392f != null) {
            try {
                c30392f.zzd();
            } catch (RemoteException unused) {
            }
            this.f37176e = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6760i
    public final boolean zzc() {
        if (this.f37176e != null) {
            return false;
        }
        try {
            C30392f mo149504I0 = AbstractBinderC30430h.m149524E(DynamiteModule.m19920e(this.f37173b, DynamiteModule.f16815b, "com.google.android.gms.vision.dynamite").m19929d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo149504I0(BinderC4273d.m19913I3(this.f37173b), this.f37174c);
            this.f37176e = mo149504I0;
            if (mo149504I0 == null && !this.f37172a) {
                AbstractC20469l.m106511c(this.f37173b, "barcode");
                this.f37172a = true;
                AbstractC6753b.m34574e(this.f37175d, EnumC30386ec.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            AbstractC6753b.m34574e(this.f37175d, EnumC30386ec.NO_ERROR);
            return false;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
        }
    }
}
