package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y80 implements k80 {

    /* renamed from: a */
    private final m80 f30831a;

    /* renamed from: b */
    private final n80 f30832b;

    /* renamed from: c */
    private final h80 f30833c;

    /* renamed from: d */
    private final String f30834d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y80(h80 h80Var, String str, n80 n80Var, m80 m80Var) {
        this.f30833c = h80Var;
        this.f30834d = str;
        this.f30832b = n80Var;
        this.f30831a = m80Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m28140b(y80 y80Var, b80 b80Var, i80 i80Var, Object obj, pl0 pl0Var) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            b40.f17566o.m25956c(uuid, new x80(y80Var, b80Var, pl0Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", y80Var.f30832b.zzb(obj));
            i80Var.mo23550C0(y80Var.f30834d, jSONObject);
        } catch (Exception e11) {
            try {
                pl0Var.zze(e11);
                yk0.zzh("Unable to invokeJavascript", e11);
            } finally {
                b80Var.m20433g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qb3
    public final tc3 zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final tc3 zzb(Object obj) {
        pl0 pl0Var = new pl0();
        b80 m22725b = this.f30833c.m22725b(null);
        m22725b.m27653e(new v80(this, m22725b, obj, pl0Var), new w80(this, pl0Var, m22725b));
        return pl0Var;
    }
}
