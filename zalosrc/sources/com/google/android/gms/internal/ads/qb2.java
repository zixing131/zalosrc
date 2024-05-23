package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzay;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class qb2 implements sh2 {

    /* renamed from: a */
    private final uc3 f26708a;

    /* renamed from: b */
    private final uc3 f26709b;

    /* renamed from: c */
    private final Context f26710c;

    /* renamed from: d */
    private final dr2 f26711d;

    /* renamed from: e */
    private final View f26712e;

    public qb2(uc3 uc3Var, uc3 uc3Var2, Context context, dr2 dr2Var, ViewGroup viewGroup) {
        this.f26708a = uc3Var;
        this.f26709b = uc3Var2;
        this.f26710c = context;
        this.f26711d = dr2Var;
        this.f26712e = viewGroup;
    }

    /* renamed from: c */
    private final List m25677c() {
        int i11;
        ArrayList arrayList = new ArrayList();
        View view = this.f26712e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i11 = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i11 = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString(ZinstantMetaConstant.IMPRESSION_META_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", i11);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ sb2 m25678a() {
        return new sb2(this.f26710c, this.f26711d.f19399e, m25677c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ sb2 m25679b() {
        return new sb2(this.f26710c, this.f26711d.f19399e, m25677c());
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        AbstractC4554gx.m22622c(this.f26710c);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20990F8)).booleanValue()) {
            return this.f26709b.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ob2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qb2.this.m25678a();
                }
            });
        }
        return this.f26708a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.pb2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qb2.this.m25679b();
            }
        });
    }
}
