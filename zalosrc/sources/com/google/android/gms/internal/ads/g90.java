package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g90 implements qb3 {

    /* renamed from: a */
    private final m80 f20470a;

    /* renamed from: b */
    private final n80 f20471b;

    /* renamed from: c */
    private final String f20472c = "google.afma.activeView.handleUpdate";

    /* renamed from: d */
    private final tc3 f20473d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g90(tc3 tc3Var, String str, n80 n80Var, m80 m80Var) {
        this.f20473d = tc3Var;
        this.f20471b = n80Var;
        this.f20470a = m80Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ tc3 m22306a(Object obj, i80 i80Var) {
        pl0 pl0Var = new pl0();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        b40.f17566o.m25956c(uuid, new f90(this, pl0Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        i80Var.mo23550C0(this.f20472c, jSONObject);
        return pl0Var;
    }

    @Override // com.google.android.gms.internal.ads.qb3
    public final tc3 zza(Object obj) {
        return zzb(obj);
    }

    public final tc3 zzb(final Object obj) {
        return kc3.m23882n(this.f20473d, new qb3() { // from class: com.google.android.gms.internal.ads.e90
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj2) {
                return g90.this.m22306a(obj, (i80) obj2);
            }
        }, kl0.f23368f);
    }
}
