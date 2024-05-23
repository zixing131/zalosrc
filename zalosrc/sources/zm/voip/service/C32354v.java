package zm.voip.service;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import zm.voip.service.C32354v;

/* renamed from: zm.voip.service.v */
/* loaded from: classes7.dex */
public final class C32354v {

    /* renamed from: a */
    public static final C32354v f149285a = new C32354v();

    /* renamed from: b */
    private static int f149286b = -1;

    /* renamed from: c */
    private static final InterfaceC24854k f149287c;

    /* renamed from: d */
    private static PowerManager f149288d;

    /* renamed from: zm.voip.service.v$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f149289q = new a();

        a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m156390c(int i11) {
            C32354v.f149286b = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PowerManager.OnThermalStatusChangedListener mo12V4() {
            return new PowerManager.OnThermalStatusChangedListener() { // from class: zm.voip.service.u
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public final void onThermalStatusChanged(int i11) {
                    C32354v.a.m156390c(i11);
                }
            };
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f149289q);
        f149287c = m129210a;
    }

    private C32354v() {
    }

    /* renamed from: b */
    public static final int m156385b() {
        PowerManager powerManager;
        int currentThermalStatus;
        if (Build.VERSION.SDK_INT >= 29 && f149286b == -1 && (powerManager = f149288d) != null) {
            currentThermalStatus = powerManager.getCurrentThermalStatus();
            f149286b = currentThermalStatus;
        }
        return f149286b;
    }

    /* renamed from: c */
    private final PowerManager.OnThermalStatusChangedListener m156386c() {
        return AbstractC32344t.m156373a(f149287c.getValue());
    }

    /* renamed from: d */
    public static final void m156387d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            Object systemService = context.getSystemService("power");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) systemService;
            f149288d = powerManager;
            if (powerManager != null) {
                powerManager.addThermalStatusListener(f149285a.m156386c());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public static final void m156388e() {
        try {
            PowerManager powerManager = f149288d;
            if (powerManager != null) {
                powerManager.removeThermalStatusListener(f149285a.m156386c());
            }
            f149288d = null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
