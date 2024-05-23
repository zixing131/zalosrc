package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class lv1 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f24116a;

    /* renamed from: b */
    private final Sensor f24117b;

    /* renamed from: c */
    private float f24118c = 0.0f;

    /* renamed from: d */
    private Float f24119d = Float.valueOf(0.0f);

    /* renamed from: e */
    private long f24120e = zzt.zzB().mo105913a();

    /* renamed from: f */
    private int f24121f = 0;

    /* renamed from: g */
    private boolean f24122g = false;

    /* renamed from: h */
    private boolean f24123h = false;

    /* renamed from: i */
    private kv1 f24124i = null;

    /* renamed from: j */
    private boolean f24125j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lv1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f24116a = sensorManager;
        if (sensorManager != null) {
            this.f24117b = sensorManager.getDefaultSensor(4);
        } else {
            this.f24117b = null;
        }
    }

    /* renamed from: a */
    public final void m24378a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f24125j && (sensorManager = this.f24116a) != null && (sensor = this.f24117b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f24125j = false;
                    zze.zza("Stopped listening for flick gestures.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m24379b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21069N7)).booleanValue()) {
                    return;
                }
                if (!this.f24125j && (sensorManager = this.f24116a) != null && (sensor = this.f24117b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f24125j = true;
                    zze.zza("Listening for flick gestures.");
                }
                if (this.f24116a != null && this.f24117b != null) {
                    return;
                }
                yk0.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m24380c(kv1 kv1Var) {
        this.f24124i = kv1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21069N7)).booleanValue()) {
            return;
        }
        long mo105913a = zzt.zzB().mo105913a();
        if (this.f24120e + ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21089P7)).intValue() < mo105913a) {
            this.f24121f = 0;
            this.f24120e = mo105913a;
            this.f24122g = false;
            this.f24123h = false;
            this.f24118c = this.f24119d.floatValue();
        }
        Float valueOf = Float.valueOf(this.f24119d.floatValue() + (sensorEvent.values[1] * 4.0f));
        this.f24119d = valueOf;
        float floatValue = valueOf.floatValue();
        float f11 = this.f24118c;
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21079O7;
        if (floatValue > f11 + ((Float) zzay.zzc().m21823b(abstractC5184xw)).floatValue()) {
            this.f24118c = this.f24119d.floatValue();
            this.f24123h = true;
        } else if (this.f24119d.floatValue() < this.f24118c - ((Float) zzay.zzc().m21823b(abstractC5184xw)).floatValue()) {
            this.f24118c = this.f24119d.floatValue();
            this.f24122g = true;
        }
        if (this.f24119d.isInfinite()) {
            this.f24119d = Float.valueOf(0.0f);
            this.f24118c = 0.0f;
        }
        if (this.f24122g && this.f24123h) {
            zze.zza("Flick detected.");
            this.f24120e = mo105913a;
            int i11 = this.f24121f + 1;
            this.f24121f = i11;
            this.f24122g = false;
            this.f24123h = false;
            kv1 kv1Var = this.f24124i;
            if (kv1Var != null) {
                if (i11 == ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21099Q7)).intValue()) {
                    cw1 cw1Var = (cw1) kv1Var;
                    cw1Var.m21177h(new aw1(cw1Var), bw1.GESTURE);
                }
            }
        }
    }
}
