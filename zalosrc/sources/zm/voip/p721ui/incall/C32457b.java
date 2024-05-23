package zm.voip.p721ui.incall;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import bp0.AbstractC3082b0;
import bp0.AbstractC3103o;
import p308kx.C21965i;
import zm.voip.p721ui.incall.C32456a;

/* renamed from: zm.voip.ui.incall.b */
/* loaded from: classes7.dex */
public class C32457b implements SensorEventListener, C32456a.c {

    /* renamed from: a */
    private final SensorManager f149817a;

    /* renamed from: b */
    private final PowerManager f149818b;

    /* renamed from: c */
    private Sensor f149819c;

    /* renamed from: d */
    private final a f149820d;

    /* renamed from: e */
    private C21965i f149821e;

    /* renamed from: f */
    private final C32456a f149822f;

    /* renamed from: g */
    private boolean f149823g;

    /* renamed from: k */
    private int f149827k;

    /* renamed from: h */
    private boolean f149824h = false;

    /* renamed from: i */
    private boolean f149825i = true;

    /* renamed from: j */
    private boolean f149826j = false;

    /* renamed from: l */
    private boolean f149828l = false;

    /* renamed from: zm.voip.ui.incall.b$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: L */
        void mo157094L(boolean z11);

        /* renamed from: e */
        boolean mo157124e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:            if ((r9 & r8) != 0) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C32457b(Context context, a aVar) {
        this.f149823g = false;
        this.f149820d = aVar;
        this.f149817a = (SensorManager) context.getSystemService("sensor");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f149818b = powerManager;
        this.f149822f = new C32456a(context, this);
        if (powerManager != null) {
            try {
                int intValue = ((Integer) PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null)).intValue();
                if (AbstractC3103o.m15619h(17)) {
                    boolean booleanValue = ((Boolean) powerManager.getClass().getDeclaredMethod("isWakeLockLevelSupported", Integer.TYPE).invoke(powerManager, Integer.valueOf(intValue))).booleanValue();
                    AbstractC3082b0.m15421c("CallProximityManager", "Use 4.2 detection way for proximity sensor detection. Result is " + booleanValue);
                    if (booleanValue) {
                    }
                } else {
                    int intValue2 = ((Integer) powerManager.getClass().getDeclaredMethod("getSupportedWakeLockFlags", new Class[0]).invoke(powerManager, new Object[0])).intValue();
                    AbstractC3082b0.m15421c("CallProximityManager", "Proximity flags supported : " + intValue2);
                }
                AbstractC3082b0.m15421c("CallProximityManager", "We can use native screen locker !!");
                C21965i c21965i = new C21965i(intValue, "zm.voip.CallProximity");
                this.f149821e = c21965i;
                c21965i.m114699Q(false);
            } catch (Exception unused) {
                AbstractC3082b0.m15421c("CallProximityManager", "Impossible to get power manager supported wake lock flags");
            }
        }
        if (this.f149821e == null) {
            this.f149819c = this.f149817a.getDefaultSensor(8);
            this.f149823g = false;
        }
    }

    @Override // zm.voip.p721ui.incall.C32456a.c
    /* renamed from: a */
    public void mo157195a(int i11) {
        this.f149827k = i11;
        m157200f();
    }

    /* renamed from: b */
    public synchronized void m157196b() {
        try {
            C21965i c21965i = this.f149821e;
            if (c21965i != null && !this.f149828l) {
                c21965i.m114700x();
                this.f149828l = true;
            }
            a aVar = this.f149820d;
            if (aVar != null) {
                aVar.mo157094L(true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public synchronized void m157197c(int i11) {
        try {
            C21965i c21965i = this.f149821e;
            if (c21965i != null && this.f149828l) {
                c21965i.m114698O(i11);
                this.f149828l = false;
            }
            a aVar = this.f149820d;
            if (aVar != null) {
                aVar.mo157094L(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: d */
    public synchronized void m157198d() {
        try {
            if (this.f149819c != null && !this.f149824h) {
                this.f149825i = true;
                AbstractC3082b0.m15421c("CallProximityManager", "Register sensor");
                this.f149817a.registerListener(this, this.f149819c, 3);
                this.f149824h = true;
            }
            if (!this.f149826j) {
                this.f149822f.m157192a(true);
                this.f149826j = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: e */
    public synchronized void m157199e() {
        try {
            if (this.f149819c != null && this.f149824h) {
                this.f149824h = false;
                this.f149817a.unregisterListener(this);
                AbstractC3082b0.m15421c("CallProximityManager", "Unregister to sensor is done !!!");
            }
            if (this.f149826j) {
                this.f149822f.m157192a(false);
                this.f149826j = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public synchronized void m157200f() {
        boolean z11;
        boolean z12;
        try {
            if (this.f149827k == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            a aVar = this.f149820d;
            if (aVar != null) {
                z12 = aVar.mo157124e();
            } else {
                z12 = false;
            }
            AbstractC3082b0.m15421c("CallProximityManager", "Horizontal : " + z11 + " and activate for calls " + z12);
            if (z12) {
                m157196b();
            } else {
                m157197c(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z11;
        if (this.f149824h && !this.f149825i) {
            float f11 = sensorEvent.values[0];
            if (f11 >= 0.0d && f11 < 5.0f && f11 < sensorEvent.sensor.getMaximumRange()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f149823g) {
                z11 = !z11;
            }
            AbstractC3082b0.m15421c("CallProximityManager", "Distance is now " + f11);
            a aVar = this.f149820d;
            if (aVar != null && aVar.mo157124e() && z11) {
                a aVar2 = this.f149820d;
                if (aVar2 != null) {
                    aVar2.mo157094L(true);
                }
            } else {
                a aVar3 = this.f149820d;
                if (aVar3 != null) {
                    aVar3.mo157094L(false);
                }
            }
        }
        if (this.f149825i) {
            this.f149825i = false;
        }
    }
}
