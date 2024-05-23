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
public final class zw1 implements SensorEventListener {

    /* renamed from: a */
    private final Context f31705a;

    /* renamed from: b */
    private SensorManager f31706b;

    /* renamed from: c */
    private Sensor f31707c;

    /* renamed from: d */
    private long f31708d;

    /* renamed from: e */
    private int f31709e;

    /* renamed from: f */
    private yw1 f31710f;

    /* renamed from: g */
    private boolean f31711g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zw1(Context context) {
        this.f31705a = context;
    }

    /* renamed from: a */
    public final void m28647a() {
        synchronized (this) {
            try {
                if (this.f31711g) {
                    SensorManager sensorManager = this.f31706b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f31707c);
                        zze.zza("Stopped listening for shake gestures.");
                    }
                    this.f31711g = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m28648b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21019I7)).booleanValue()) {
                    return;
                }
                if (this.f31706b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f31705a.getSystemService("sensor");
                    this.f31706b = sensorManager2;
                    if (sensorManager2 == null) {
                        yk0.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f31707c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f31711g && (sensorManager = this.f31706b) != null && (sensor = this.f31707c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f31708d = zzt.zzB().mo105913a() - ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21039K7)).intValue();
                    this.f31711g = true;
                    zze.zza("Listening for shake gestures.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m28649c(yw1 yw1Var) {
        this.f31710f = yw1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21019I7)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f11 = fArr[0] / 9.80665f;
            float f12 = fArr[1] / 9.80665f;
            float f13 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f11 * f11) + (f12 * f12) + (f13 * f13))) < ((Float) zzay.zzc().m21823b(AbstractC4554gx.f21029J7)).floatValue()) {
                return;
            }
            long mo105913a = zzt.zzB().mo105913a();
            if (this.f31708d + ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21039K7)).intValue() > mo105913a) {
                return;
            }
            if (this.f31708d + ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21049L7)).intValue() < mo105913a) {
                this.f31709e = 0;
            }
            zze.zza("Shake detected.");
            this.f31708d = mo105913a;
            int i11 = this.f31709e + 1;
            this.f31709e = i11;
            yw1 yw1Var = this.f31710f;
            if (yw1Var != null) {
                if (i11 == ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21059M7)).intValue()) {
                    cw1 cw1Var = (cw1) yw1Var;
                    cw1Var.m21177h(new zv1(cw1Var), bw1.GESTURE);
                }
            }
        }
    }
}
