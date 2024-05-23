package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes2.dex */
final class cn0 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f18484a;

    /* renamed from: c */
    private final Display f18486c;

    /* renamed from: f */
    private float[] f18489f;

    /* renamed from: g */
    private Handler f18490g;

    /* renamed from: h */
    private bn0 f18491h;

    /* renamed from: d */
    private final float[] f18487d = new float[9];

    /* renamed from: e */
    private final float[] f18488e = new float[9];

    /* renamed from: b */
    private final Object f18485b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn0(Context context) {
        this.f18484a = (SensorManager) context.getSystemService("sensor");
        this.f18486c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m20956a(bn0 bn0Var) {
        this.f18491h = bn0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m20957b() {
        if (this.f18490g != null) {
            return;
        }
        Sensor defaultSensor = this.f18484a.getDefaultSensor(11);
        if (defaultSensor == null) {
            yk0.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        m23 m23Var = new m23(handlerThread.getLooper());
        this.f18490g = m23Var;
        if (!this.f18484a.registerListener(this, defaultSensor, 0, m23Var)) {
            yk0.zzg("SensorManager.registerListener failed.");
            m20958c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m20958c() {
        if (this.f18490g == null) {
            return;
        }
        this.f18484a.unregisterListener(this);
        this.f18490g.post(new an0(this));
        this.f18490g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m20959d(float[] fArr) {
        synchronized (this.f18485b) {
            try {
                float[] fArr2 = this.f18489f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f18485b) {
                try {
                    if (this.f18489f == null) {
                        this.f18489f = new float[9];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f18487d, fArr);
            int rotation = this.f18486c.getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        System.arraycopy(this.f18487d, 0, this.f18488e, 0, 9);
                    } else {
                        SensorManager.remapCoordinateSystem(this.f18487d, 130, 1, this.f18488e);
                    }
                } else {
                    SensorManager.remapCoordinateSystem(this.f18487d, 129, 130, this.f18488e);
                }
            } else {
                SensorManager.remapCoordinateSystem(this.f18487d, 2, 129, this.f18488e);
            }
            float[] fArr2 = this.f18488e;
            float f11 = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f11;
            float f12 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f12;
            float f13 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f13;
            synchronized (this.f18485b) {
                System.arraycopy(this.f18488e, 0, this.f18489f, 0, 9);
            }
            bn0 bn0Var = this.f18491h;
            if (bn0Var != null) {
                bn0Var.zza();
            }
        }
    }
}
