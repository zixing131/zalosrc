package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class kt1 {

    /* renamed from: c */
    protected final Executor f23474c;

    /* renamed from: d */
    protected final cl0 f23475d;

    /* renamed from: f */
    private final cw2 f23477f;

    /* renamed from: a */
    protected final String f23472a = (String) AbstractC5000sy.f28057b.m24091e();

    /* renamed from: b */
    protected final Map f23473b = new HashMap();

    /* renamed from: e */
    protected final boolean f23476e = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21043L1)).booleanValue();

    /* renamed from: g */
    private final boolean f23478g = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21073O1)).booleanValue();

    /* renamed from: h */
    private final boolean f23479h = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21233e6)).booleanValue();

    public kt1(Executor executor, cl0 cl0Var, cw2 cw2Var) {
        this.f23474c = executor;
        this.f23475d = cl0Var;
        this.f23477f = cw2Var;
    }

    /* renamed from: a */
    private final void m24031a(Map map, boolean z11) {
        if (!map.isEmpty()) {
            String m21185a = this.f23477f.m21185a(map);
            zze.zza(m21185a);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (this.f23476e) {
                if (!z11 || this.f23478g) {
                    if (!parseBoolean || this.f23479h) {
                        this.f23474c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jt1

                            /* renamed from: q */
                            public final /* synthetic */ String f22992q;

                            public /* synthetic */ jt1(String m21185a2) {
                                r2 = m21185a2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                kt1 kt1Var = kt1.this;
                                kt1Var.f23475d.zza(r2);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        yk0.zze("Empty paramMap.");
    }

    /* renamed from: b */
    public final String m24032b(Map map) {
        return this.f23477f.m21185a(map);
    }

    /* renamed from: c */
    public final ConcurrentHashMap m24033c() {
        return new ConcurrentHashMap(this.f23473b);
    }

    /* renamed from: d */
    public final void m24034d(Map map) {
        m24031a(map, true);
    }

    /* renamed from: e */
    public final void m24035e(Map map) {
        m24031a(map, false);
    }
}
