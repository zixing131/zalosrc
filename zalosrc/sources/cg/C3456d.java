package cg;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;

/* renamed from: cg.d */
/* loaded from: classes3.dex */
public class C3456d {

    /* renamed from: e */
    float[] f14527e;

    /* renamed from: f */
    float[] f14528f;

    /* renamed from: g */
    c f14529g;

    /* renamed from: i */
    OrientationEventListener f14531i;

    /* renamed from: a */
    int f14523a = 1;

    /* renamed from: b */
    float f14524b = 0.0f;

    /* renamed from: c */
    float f14525c = 0.0f;

    /* renamed from: d */
    int f14526d = 6;

    /* renamed from: h */
    boolean f14530h = false;

    /* renamed from: j */
    SensorEventListener f14532j = new b();

    /* renamed from: cg.d$a */
    /* loaded from: classes3.dex */
    class a extends OrientationEventListener {
        a(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            int m17400c = C3456d.this.m17400c(i11);
            C3456d c3456d = C3456d.this;
            if (m17400c != c3456d.f14526d || c3456d.f14530h) {
                c3456d.f14530h = false;
                c3456d.f14526d = m17400c;
                c cVar = c3456d.f14529g;
                if (cVar != null) {
                    cVar.mo17407h2(c3456d.m17401d(m17400c));
                }
            }
        }
    }

    /* renamed from: cg.d$b */
    /* loaded from: classes3.dex */
    class b implements SensorEventListener {

        /* renamed from: a */
        float[] f14534a;

        /* renamed from: b */
        float[] f14535b;

        b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i11) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            if (sensorEvent.sensor.getType() == 1) {
                this.f14534a = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f14535b = sensorEvent.values;
            }
            float[] fArr2 = this.f14534a;
            if (fArr2 != null && (fArr = this.f14535b) != null) {
                float[] fArr3 = new float[9];
                if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
                    float[] fArr4 = new float[3];
                    SensorManager.getOrientation(fArr3, fArr4);
                    C3456d c3456d = C3456d.this;
                    c3456d.f14524b = c3456d.m17398a(fArr4[1], c3456d.f14527e);
                    C3456d c3456d2 = C3456d.this;
                    c3456d2.f14525c = c3456d2.m17398a(fArr4[2], c3456d2.f14528f);
                    int m17399b = C3456d.this.m17399b();
                    C3456d c3456d3 = C3456d.this;
                    if (m17399b != c3456d3.f14526d || c3456d3.f14530h) {
                        c3456d3.f14530h = false;
                        c3456d3.f14526d = m17399b;
                        c cVar = c3456d3.f14529g;
                        if (cVar != null) {
                            cVar.mo17407h2(c3456d3.m17401d(m17399b));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: cg.d$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: h2 */
        void mo17407h2(int i11);
    }

    public C3456d() {
        int i11 = this.f14523a;
        this.f14527e = new float[i11];
        this.f14528f = new float[i11];
    }

    /* renamed from: a */
    float m17398a(float f11, float[] fArr) {
        float round = (float) Math.round(Math.toDegrees(f11));
        float f12 = 0.0f;
        int i11 = 1;
        while (true) {
            int i12 = this.f14523a;
            if (i11 < i12) {
                fArr[i11 - 1] = fArr[i11];
                f12 += fArr[i11];
                i11++;
            } else {
                fArr[i12 - 1] = round;
                return (f12 + round) / i12;
            }
        }
    }

    /* renamed from: b */
    int m17399b() {
        int i11;
        int i12;
        if (Math.abs(this.f14524b) < 60.0f && (Math.abs(this.f14524b) < 30.0f || ((i12 = this.f14526d) != 6 && i12 != 8))) {
            if (Math.abs(this.f14524b) <= 30.0f || (Math.abs(this.f14524b) <= 60.0f && ((i11 = this.f14526d) == 1 || i11 == 3))) {
                float f11 = this.f14525c;
                if (f11 > 30.0f) {
                    return 3;
                }
                if (f11 < -30.0f) {
                    return 1;
                }
            }
        } else {
            float f12 = this.f14524b;
            if (f12 > 30.0f) {
                return 8;
            }
            if (f12 < -30.0f) {
                return 6;
            }
        }
        return this.f14526d;
    }

    /* renamed from: c */
    int m17400c(int i11) {
        if (i11 > 315 || i11 < 45) {
            return 6;
        }
        if (i11 < 135) {
            return 3;
        }
        return i11 < 225 ? 8 : 1;
    }

    /* renamed from: d */
    int m17401d(int i11) {
        if (i11 == 1) {
            return 90;
        }
        if (i11 != 3) {
            return i11 != 8 ? 0 : 180;
        }
        return 270;
    }

    /* renamed from: e */
    public int m17402e() {
        return m17401d(this.f14526d);
    }

    /* renamed from: f */
    public void m17403f(Context context) {
        this.f14531i = new a(context, 2);
    }

    /* renamed from: g */
    public void m17404g() {
        try {
            this.f14531i.disable();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m17405h() {
        try {
            this.f14526d = 6;
            this.f14530h = true;
            this.f14531i.enable();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m17406i(c cVar) {
        this.f14529g = cVar;
    }
}
