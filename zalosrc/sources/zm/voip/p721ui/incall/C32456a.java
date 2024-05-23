package zm.voip.p721ui.incall;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import bp0.AbstractC3082b0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.lang.ref.WeakReference;

/* renamed from: zm.voip.ui.incall.a */
/* loaded from: classes7.dex */
public final class C32456a {

    /* renamed from: a */
    SensorManager f149808a;

    /* renamed from: b */
    Sensor f149809b;

    /* renamed from: c */
    int f149810c;

    /* renamed from: d */
    int f149811d;

    /* renamed from: e */
    c f149812e;

    /* renamed from: f */
    SensorEventListener f149813f = new a();

    /* renamed from: g */
    Handler f149814g = new b(this);

    /* renamed from: zm.voip.ui.incall.a$a */
    /* loaded from: classes7.dex */
    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i11) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C32456a c32456a = C32456a.this;
            float[] fArr = sensorEvent.values;
            c32456a.m157193b(fArr[0], fArr[1], fArr[2]);
        }
    }

    /* renamed from: zm.voip.ui.incall.a$b */
    /* loaded from: classes7.dex */
    static class b extends Handler {

        /* renamed from: a */
        WeakReference f149816a;

        b(C32456a c32456a) {
            this.f149816a = new WeakReference(c32456a);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            C32456a c32456a = (C32456a) this.f149816a.get();
            if (c32456a != null && message.what == 1234) {
                synchronized (c32456a) {
                    try {
                        c32456a.f149810c = c32456a.f149811d;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("orientation: ");
                        int i11 = c32456a.f149810c;
                        if (i11 == 2) {
                            str = "horizontal";
                        } else if (i11 == 1) {
                            str = "vertical";
                        } else {
                            str = "unknown";
                        }
                        sb2.append(str);
                        AbstractC3082b0.m15421c("AccelerometerListener", sb2.toString());
                        c32456a.f149812e.mo157195a(c32456a.f149810c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: zm.voip.ui.incall.a$c */
    /* loaded from: classes7.dex */
    public interface c {
        /* renamed from: a */
        void mo157195a(int i11);
    }

    public C32456a(Context context, c cVar) {
        this.f149812e = cVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f149808a = sensorManager;
        this.f149809b = sensorManager.getDefaultSensor(1);
    }

    /* renamed from: a */
    public void m157192a(boolean z11) {
        AbstractC3082b0.m15421c("AccelerometerListener", "enable(" + z11 + ")");
        synchronized (this) {
            try {
                if (z11) {
                    this.f149810c = 0;
                    this.f149811d = 0;
                    this.f149808a.registerListener(this.f149813f, this.f149809b, 3);
                } else {
                    this.f149808a.unregisterListener(this.f149813f);
                    this.f149814g.removeMessages(1234);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    void m157193b(double d11, double d12, double d13) {
        int i11;
        if (d11 != 0.0d && d12 != 0.0d && d13 != 0.0d) {
            if ((Math.atan2(Math.sqrt((d11 * d11) + (d12 * d12)), d13) * 180.0d) / 3.141592653589793d > 50.0d) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            m157194c(i11);
        }
    }

    /* renamed from: c */
    void m157194c(int i11) {
        int i12;
        synchronized (this) {
            try {
                if (this.f149811d == i11) {
                    return;
                }
                this.f149814g.removeMessages(1234);
                if (this.f149810c != i11) {
                    this.f149811d = i11;
                    Message obtainMessage = this.f149814g.obtainMessage(1234);
                    if (i11 == 1) {
                        i12 = 100;
                    } else {
                        i12 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                    }
                    this.f149814g.sendMessageDelayed(obtainMessage, i12);
                } else {
                    this.f149811d = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
