package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;
import p012a6.AbstractBinderC0267g8;
import p012a6.C0227e6;
import p234ia.AbstractC20469l;
import p385oa.C24141a;
import pa.AbstractC24702b;
import pa.C24704d;
import qa.C25202a;

/* renamed from: com.google.mlkit.vision.text.internal.f */
/* loaded from: classes3.dex */
final class C6772f implements InterfaceC6776j {

    /* renamed from: a */
    private final Context f37208a;

    /* renamed from: b */
    private final zzp f37209b = new zzp(null);

    /* renamed from: c */
    private boolean f37210c;

    /* renamed from: d */
    private C0227e6 f37211d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6772f(Context context) {
        this.f37208a = context;
    }

    @Override // com.google.mlkit.vision.text.internal.InterfaceC6776j
    /* renamed from: a */
    public final C25202a mo34602a(C24141a c24141a) {
        Bitmap m128285d;
        int i11;
        if (this.f37211d == null) {
            zzb();
        }
        if (this.f37211d != null) {
            if (c24141a.m126122g() == -1) {
                m128285d = c24141a.m126119d();
                i11 = AbstractC24702b.m128272a(c24141a.m126126k());
            } else {
                m128285d = C24704d.m128277e().m128285d(c24141a);
                i11 = 0;
            }
            try {
                return AbstractC6775i.m34603a(((C0227e6) AbstractC4205o.m19722k(this.f37211d)).m681I3(BinderC4273d.m19913I3(m128285d), new zzd(c24141a.m126127l(), c24141a.m126123h(), 0, 0L, i11)), c24141a.m126121f());
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to run legacy text recognizer.", 13, e11);
            }
        }
        throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
    }

    @Override // com.google.mlkit.vision.text.internal.InterfaceC6776j
    public final void zzb() {
        if (this.f37211d == null) {
            try {
                C0227e6 mo716n3 = AbstractBinderC0267g8.m727E(DynamiteModule.m19920e(this.f37208a, DynamiteModule.f16815b, "com.google.android.gms.vision.dynamite").m19929d("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).mo716n3(BinderC4273d.m19913I3(this.f37208a), this.f37209b);
                this.f37211d = mo716n3;
                if (mo716n3 == null && !this.f37210c) {
                    AbstractC20469l.m106511c(this.f37208a, "ocr");
                    this.f37210c = true;
                }
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create legacy text recognizer.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
            }
        }
    }

    @Override // com.google.mlkit.vision.text.internal.InterfaceC6776j
    public final void zzc() {
        C0227e6 c0227e6 = this.f37211d;
        if (c0227e6 != null) {
            try {
                c0227e6.zzd();
            } catch (RemoteException unused) {
            }
            this.f37211d = null;
        }
    }
}
