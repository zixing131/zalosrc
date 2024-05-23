package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t12 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ boolean f28111a;

    /* renamed from: b */
    final /* synthetic */ u12 f28112b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t12(u12 u12Var, boolean z11) {
        this.f28112b = u12Var;
        this.f28111a = z11;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        yk0.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.gc3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c11;
        EnumC4809nt enumC4809nt;
        Bundle bundle = (Bundle) obj;
        if (this.f28112b.m27122a()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            asList = Arrays.asList((String[]) obj2);
        } else {
            emptyList = Collections.emptyList();
            final ArrayList arrayList = new ArrayList();
            for (String str : emptyList) {
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c11 = 1;
                            break;
                        }
                        break;
                }
                c11 = 65535;
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                enumC4809nt = EnumC4809nt.AD_FORMAT_TYPE_UNSPECIFIED;
                            } else {
                                enumC4809nt = EnumC4809nt.REWARD_BASED_VIDEO_AD;
                            }
                        } else {
                            enumC4809nt = EnumC4809nt.NATIVE_APP_INSTALL;
                        }
                    } else {
                        enumC4809nt = EnumC4809nt.INTERSTITIAL;
                    }
                } else {
                    enumC4809nt = EnumC4809nt.BANNER;
                }
                arrayList.add(enumC4809nt);
            }
            final EnumC4478ev m26816c = u12.m26816c(this.f28112b, bundle);
            final C5070uu m26815b = u12.m26815b(this.f28112b, bundle);
            i12 i12Var = this.f28112b.f29125b;
            final boolean z11 = this.f28111a;
            i12Var.m23109a(new ju2() { // from class: com.google.android.gms.internal.ads.s12
                @Override // com.google.android.gms.internal.ads.ju2
                public final Object zza(Object obj3) {
                    m12 m12Var;
                    t12 t12Var = t12.this;
                    boolean z12 = z11;
                    ArrayList arrayList2 = arrayList;
                    C5070uu c5070uu = m26815b;
                    EnumC4478ev enumC4478ev = m26816c;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (!t12Var.f28112b.m27122a()) {
                        byte[] m26818f = u12.m26818f(t12Var.f28112b, z12, arrayList2, c5070uu, enumC4478ev);
                        x12.m27806g(sQLiteDatabase, z12, true);
                        m12Var = t12Var.f28112b.f28704f;
                        x12.m27803d(sQLiteDatabase, m12Var.m24438d(), m26818f);
                        return null;
                    }
                    return null;
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        final EnumC4478ev m26816c2 = u12.m26816c(this.f28112b, bundle);
        final C5070uu m26815b2 = u12.m26815b(this.f28112b, bundle);
        i12 i12Var2 = this.f28112b.f29125b;
        final boolean z112 = this.f28111a;
        i12Var2.m23109a(new ju2() { // from class: com.google.android.gms.internal.ads.s12
            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj32) {
                m12 m12Var;
                t12 t12Var = t12.this;
                boolean z12 = z112;
                ArrayList arrayList22 = arrayList3;
                C5070uu c5070uu = m26815b2;
                EnumC4478ev enumC4478ev = m26816c2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (!t12Var.f28112b.m27122a()) {
                    byte[] m26818f = u12.m26818f(t12Var.f28112b, z12, arrayList22, c5070uu, enumC4478ev);
                    x12.m27806g(sQLiteDatabase, z12, true);
                    m12Var = t12Var.f28112b.f28704f;
                    x12.m27803d(sQLiteDatabase, m12Var.m24438d(), m26818f);
                    return null;
                }
                return null;
            }
        });
    }
}
