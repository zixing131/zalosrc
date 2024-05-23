package p049c5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
import p504s5.AbstractC26133a;
import p504s5.AbstractC26135c;

/* renamed from: c5.a */
/* loaded from: classes2.dex */
public final class C3285a extends AbstractC26133a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3285a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: W4 */
    public final void m16704W4(TelemetryData telemetryData) {
        Parcel m134497E = m134497E();
        AbstractC26135c.m134504d(m134497E, telemetryData);
        m134498I3(1, m134497E);
    }
}
