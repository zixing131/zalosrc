package zh0;

import android.hardware.Camera;
import android.os.Build;
import com.zing.zalocore.CoreUtility;
import h40.AbstractC19783c;
import ho0.AbstractC20110a;
import p248iy.AbstractC20887g;
import wh0.C29046a;

/* renamed from: zh0.b */
/* loaded from: classes7.dex */
public class C32211b {

    /* renamed from: e */
    static C32211b f148605e;

    /* renamed from: a */
    a f148606a;

    /* renamed from: b */
    Camera f148607b;

    /* renamed from: c */
    int f148608c = -1;

    /* renamed from: d */
    Camera.Parameters f148609d = null;

    /* renamed from: zh0.b$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo147483a(int i11);

        /* renamed from: b */
        void mo147484b(int i11);
    }

    private C32211b() {
    }

    /* renamed from: a */
    public static Camera m155323a() {
        return m155324b().f148607b;
    }

    /* renamed from: b */
    public static C32211b m155324b() {
        if (f148605e == null) {
            f148605e = new C32211b();
        }
        return f148605e;
    }

    /* renamed from: c */
    public static void m155325c(Camera camera, String str) {
        String str2;
        if (camera != null && Build.VERSION.SDK_INT >= 26) {
            String obj = camera.toString();
            String format = String.format("%s,%s,%s", obj.substring(obj.indexOf(64)), str, C29046a.f134547b);
            if (!AbstractC19783c.m103530a()) {
                format = format + ",b";
            }
            if (AbstractC19783c.m103531b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(format + ",ch");
                if (AbstractC19783c.f97932a) {
                    str2 = ",p";
                } else {
                    str2 = ",up";
                }
                sb2.append(str2);
                format = sb2.toString();
            }
            AbstractC20887g.m109231i(CoreUtility.f89233i, 21005, format, 0L, 21000, CoreUtility.f89236l);
        }
    }

    /* renamed from: d */
    public static void m155326d(Camera camera, String str) {
        String str2;
        if (camera != null && Build.VERSION.SDK_INT >= 26) {
            String obj = camera.toString();
            String format = String.format("%s,%s,%s", obj.substring(obj.indexOf(64)), str, C29046a.f134547b);
            if (!AbstractC19783c.m103530a()) {
                format = format + ",b";
            }
            if (AbstractC19783c.m103531b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(format + ",ch");
                if (AbstractC19783c.f97932a) {
                    str2 = ",p";
                } else {
                    str2 = ",up";
                }
                sb2.append(str2);
                format = sb2.toString();
            }
            AbstractC20887g.m109231i(CoreUtility.f89233i, 21006, format, 0L, 21000, CoreUtility.f89236l);
        }
    }

    /* renamed from: e */
    public Camera m155327e(int i11) {
        Camera camera = this.f148607b;
        if (camera == null) {
            a aVar = this.f148606a;
            if (aVar != null) {
                aVar.mo147484b(i11);
            }
            this.f148607b = Camera.open(i11);
            C29046a.f134547b = "Call/Live";
            m155325c(this.f148607b, "CameraHolder");
            this.f148608c = i11;
            if (this.f148609d == null) {
                try {
                    this.f148609d = this.f148607b.getParameters();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            AbstractC20110a.m104535d("Open camera with id: %s", Integer.valueOf(i11));
        } else {
            if (i11 != this.f148608c) {
                AbstractC20110a.m104538g("open: Camera should be opened with the same id, otherwise, it will be take a longer time to open!!", new Object[0]);
                m155328f();
                return m155327e(i11);
            }
            m155329g(camera);
            AbstractC20110a.m104535d("Reuse camera instance with id: %s", Integer.valueOf(i11));
        }
        return this.f148607b;
    }

    /* renamed from: f */
    public void m155328f() {
        if (this.f148607b != null) {
            a aVar = this.f148606a;
            if (aVar != null) {
                aVar.mo147483a(this.f148608c);
            }
            this.f148607b.release();
            m155326d(this.f148607b, "CameraHolder");
            this.f148609d = null;
            AbstractC20110a.m104535d("Released camera with id: %s", Integer.valueOf(this.f148608c));
            this.f148608c = -1;
            this.f148607b = null;
        }
    }

    /* renamed from: g */
    void m155329g(Camera camera) {
        if (camera != null) {
            try {
                camera.setParameters(this.f148609d);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public void m155330h(a aVar) {
        this.f148606a = aVar;
    }
}
