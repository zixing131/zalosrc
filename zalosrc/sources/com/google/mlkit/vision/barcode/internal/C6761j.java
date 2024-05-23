package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzso;
import com.google.android.gms.internal.mlkit_vision_barcode.zztf;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import la.C22166a;
import na.C23638b;
import p234ia.AbstractC20469l;
import p294ka.C21631b;
import p385oa.C24141a;
import p670y5.AbstractBinderC30543mh;
import p670y5.AbstractC30375e1;
import p670y5.C30505kh;
import p670y5.C30561ng;
import p670y5.EnumC30386ec;
import pa.AbstractC24702b;
import pa.C24705e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.mlkit.vision.barcode.internal.j */
/* loaded from: classes3.dex */
public final class C6761j implements InterfaceC6760i {

    /* renamed from: h */
    private static final AbstractC30375e1 f37164h = AbstractC30375e1.m149493m("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a */
    private boolean f37165a;

    /* renamed from: b */
    private boolean f37166b;

    /* renamed from: c */
    private boolean f37167c;

    /* renamed from: d */
    private final Context f37168d;

    /* renamed from: e */
    private final C21631b f37169e;

    /* renamed from: f */
    private final C30561ng f37170f;

    /* renamed from: g */
    private C30505kh f37171g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6761j(Context context, C21631b c21631b, C30561ng c30561ng) {
        this.f37168d = context;
        this.f37169e = c21631b;
        this.f37170f = c30561ng;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m34586b(Context context) {
        if (DynamiteModule.m19918a(context, "com.google.mlkit.dynamite.barcode") > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6760i
    /* renamed from: a */
    public final List mo34585a(C24141a c24141a) {
        if (this.f37171g == null) {
            zzc();
        }
        C30505kh c30505kh = (C30505kh) AbstractC4205o.m19722k(this.f37171g);
        if (!this.f37165a) {
            try {
                c30505kh.zze();
                this.f37165a = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e11);
            }
        }
        int m126127l = c24141a.m126127l();
        if (c24141a.m126122g() == 35) {
            m126127l = ((Image.Plane[]) AbstractC4205o.m19722k(c24141a.m126125j()))[0].getRowStride();
        }
        try {
            List m149561I3 = c30505kh.m149561I3(C24705e.m128288b().m128289a(c24141a), new zztf(c24141a.m126122g(), m126127l, c24141a.m126123h(), AbstractC24702b.m128272a(c24141a.m126126k()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = m149561I3.iterator();
            while (it.hasNext()) {
                arrayList.add(new C22166a(new C23638b((zzsm) it.next()), c24141a.m126121f()));
            }
            return arrayList;
        } catch (RemoteException e12) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e12);
        }
    }

    /* renamed from: c */
    final C30505kh m34587c(DynamiteModule.InterfaceC4282a interfaceC4282a, String str, String str2) {
        return AbstractBinderC30543mh.m149565E(DynamiteModule.m19920e(this.f37168d, interfaceC4282a, str).m19929d(str2)).mo149564V4(BinderC4273d.m19913I3(this.f37168d), new zzso(this.f37169e.m111558a(), this.f37169e.m111560c()));
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6760i
    public final void zzb() {
        C30505kh c30505kh = this.f37171g;
        if (c30505kh != null) {
            try {
                c30505kh.zzf();
            } catch (RemoteException unused) {
            }
            this.f37171g = null;
            this.f37165a = false;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.InterfaceC6760i
    public final boolean zzc() {
        if (this.f37171g != null) {
            return this.f37166b;
        }
        if (m34586b(this.f37168d)) {
            this.f37166b = true;
            try {
                this.f37171g = m34587c(DynamiteModule.f16816c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e12);
            }
        } else {
            this.f37166b = false;
            if (!AbstractC20469l.m106509a(this.f37168d, f37164h)) {
                if (!this.f37167c) {
                    AbstractC20469l.m106512d(this.f37168d, AbstractC30375e1.m149493m("barcode", "tflite_dynamite"));
                    this.f37167c = true;
                }
                AbstractC6753b.m34574e(this.f37170f, EnumC30386ec.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f37171g = m34587c(DynamiteModule.f16815b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e13) {
                AbstractC6753b.m34574e(this.f37170f, EnumC30386ec.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e13);
            }
        }
        AbstractC6753b.m34574e(this.f37170f, EnumC30386ec.NO_ERROR);
        return this.f37166b;
    }
}
