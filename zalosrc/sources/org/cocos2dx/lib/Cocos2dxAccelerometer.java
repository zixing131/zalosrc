package org.cocos2dx.lib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;

/* loaded from: classes7.dex */
public class Cocos2dxAccelerometer implements SensorEventListener {
    static final float ALPHA = 0.25f;
    private static final String TAG = "Cocos2dxAccelerometer";
    private final Sensor mAccelerometer;
    private final Sensor mCompass;
    private final Context mContext;
    private float[] mGeomagnetic;
    private float[] mGravity;
    private final int mNaturalOrientation;
    private final Sensor mOrientation;
    private final Sensor mRotationVector;
    private final SensorManager mSensorManager;
    final float[] accelerometerValues = new float[3];
    final float[] compassFieldValues = new float[3];
    final float[] rotationFieldValues = new float[4];
    private final float[] mRotationMatrix = new float[16];
    private final float[] orientationVals = new float[3];
    private long lastTime = System.currentTimeMillis();

    public Cocos2dxAccelerometer(Context context) {
        this.mContext = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.mSensorManager = sensorManager;
        this.mAccelerometer = sensorManager.getDefaultSensor(1);
        this.mCompass = sensorManager.getDefaultSensor(2);
        this.mRotationVector = sensorManager.getDefaultSensor(15);
        this.mOrientation = sensorManager.getDefaultSensor(3);
        this.mNaturalOrientation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    public static native void onSensorChanged(float f11, float f12, float f13, long j11);

    public static native void onSensorRotationChanged(float f11, float f12, float f13, long j11);

    public void disable() {
        this.mSensorManager.unregisterListener(this);
    }

    public void enableAccel() {
        this.mSensorManager.registerListener(this, this.mAccelerometer, 1);
    }

    public void enableCompass() {
        this.mSensorManager.registerListener(this, this.mCompass, 1);
    }

    public void enableOrientation() {
        Sensor sensor = this.mRotationVector;
        if (sensor != null) {
            this.mSensorManager.registerListener(this, sensor, 1);
            return;
        }
        Sensor sensor2 = this.mOrientation;
        if (sensor2 != null) {
            this.mSensorManager.registerListener(this, sensor2, 1);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent.sensor.getType() == 1) {
            this.mGravity = (float[]) sensorEvent.values.clone();
            float[] fArr2 = sensorEvent.values;
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float[] fArr3 = this.accelerometerValues;
            fArr3[0] = f11;
            fArr3[1] = f12;
            fArr3[2] = f13;
            int i11 = this.mContext.getResources().getConfiguration().orientation;
            if (i11 != 2 || this.mNaturalOrientation == 0) {
                if (i11 == 1 && this.mNaturalOrientation != 0) {
                    f11 = -f11;
                }
                Cocos2dxHelper.queueAccelerometer(f11, f12, f13, sensorEvent.timestamp);
            } else {
                f12 = -f12;
            }
            float f14 = f12;
            f12 = f11;
            f11 = f14;
            Cocos2dxHelper.queueAccelerometer(f11, f12, f13, sensorEvent.timestamp);
        } else if (sensorEvent.sensor.getType() == 2) {
            this.mGeomagnetic = (float[]) sensorEvent.values.clone();
            float[] fArr4 = this.compassFieldValues;
            float[] fArr5 = sensorEvent.values;
            fArr4[0] = fArr5[0];
            fArr4[1] = fArr5[1];
            fArr4[2] = fArr5[2];
        } else if (sensorEvent.sensor.getType() == 15) {
            float[] fArr6 = new float[16];
            SensorManager.getRotationMatrixFromVector(fArr6, sensorEvent.values);
            SensorManager.remapCoordinateSystem(fArr6, 1, 3, this.mRotationMatrix);
            SensorManager.getOrientation(this.mRotationMatrix, this.orientationVals);
            this.orientationVals[0] = (float) Math.toDegrees(r0[0]);
            this.orientationVals[1] = (float) Math.toDegrees(r0[1]);
            this.orientationVals[2] = (float) Math.toDegrees(r0[2]);
            float[] fArr7 = this.rotationFieldValues;
            float[] fArr8 = this.orientationVals;
            fArr7[0] = fArr8[0];
            fArr7[1] = fArr8[1];
            fArr7[2] = fArr8[2];
            Cocos2dxHelper.queueRotationVector(fArr8[0], fArr8[1], fArr8[2], sensorEvent.timestamp);
        } else if (sensorEvent.sensor.getType() == 3) {
            float[] fArr9 = this.orientationVals;
            float[] fArr10 = sensorEvent.values;
            float f15 = fArr10[0];
            fArr9[0] = f15;
            float f16 = fArr10[1];
            fArr9[1] = f16;
            float f17 = fArr10[2];
            fArr9[2] = f17;
            Cocos2dxHelper.queueRotationVector(f15, f16, f17, sensorEvent.timestamp);
        }
        float[] fArr11 = this.mGravity;
        if (fArr11 == null || (fArr = this.mGeomagnetic) == null) {
            return;
        }
        float[] fArr12 = new float[9];
        if (SensorManager.getRotationMatrix(fArr12, new float[9], fArr11, fArr)) {
            float[] fArr13 = new float[9];
            SensorManager.remapCoordinateSystem(fArr12, 1, 3, fArr13);
            SensorManager.getOrientation(fArr13, r1);
            long currentTimeMillis = System.currentTimeMillis();
            long j11 = currentTimeMillis - this.lastTime;
            float degrees = (float) Math.toDegrees(r1[2]);
            float[] fArr14 = {(float) Math.toDegrees(fArr14[0]), (float) Math.toDegrees(fArr14[1]), degrees};
            float[] fArr15 = this.rotationFieldValues;
            float f18 = fArr15[0];
            float f19 = (float) j11;
            float f21 = f18 + (((fArr14[0] - f18) * f19) / 200.0f);
            fArr15[0] = f21;
            float f22 = fArr15[1];
            float f23 = f22 + (((fArr14[1] - f22) * f19) / 200.0f);
            fArr15[1] = f23;
            float f24 = fArr15[2];
            float f25 = f24 + ((f19 * (degrees - f24)) / 200.0f);
            fArr15[2] = f25;
            Cocos2dxHelper.queueRotationVector(f21, f23, f25, sensorEvent.timestamp);
            this.lastTime = currentTimeMillis;
        }
    }

    public void setInterval(float f11) {
        this.mSensorManager.registerListener(this, this.mAccelerometer, (int) (f11 * 100000.0f));
    }
}
