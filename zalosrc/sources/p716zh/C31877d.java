package p716zh;

import android.os.Bundle;
import com.zing.zalo.control.TrackingSource;
import p692ys.C31070a;

/* renamed from: zh.d */
/* loaded from: classes3.dex */
public class C31877d {

    /* renamed from: i */
    public static String f146414i = "ActionListCommonData.EXTRA_REQUEST_CODE";

    /* renamed from: a */
    public TrackingSource f146415a;

    /* renamed from: b */
    public String f146416b;

    /* renamed from: c */
    public Bundle f146417c;

    /* renamed from: d */
    public C31070a f146418d;

    /* renamed from: e */
    public boolean f146419e = true;

    /* renamed from: f */
    public C32002l4 f146420f;

    /* renamed from: g */
    public String f146421g;

    /* renamed from: h */
    public int f146422h;

    public C31877d() {
    }

    /* renamed from: a */
    public C32002l4 m153182a() {
        return this.f146420f;
    }

    /* renamed from: b */
    public void m153183b(String str, String str2) {
        if (this.f146417c == null) {
            this.f146417c = new Bundle();
        }
        this.f146417c.putString(str, str2);
    }

    /* renamed from: c */
    public void m153184c(C32002l4 c32002l4) {
        this.f146420f = c32002l4;
    }

    /* renamed from: d */
    public void m153185d(Bundle bundle) {
        this.f146417c = bundle;
    }

    /* renamed from: e */
    public void m153186e(String str) {
        this.f146416b = str;
    }

    /* renamed from: f */
    public void m153187f(TrackingSource trackingSource) {
        this.f146415a = trackingSource;
    }

    public C31877d(TrackingSource trackingSource) {
        this.f146415a = trackingSource;
    }
}
