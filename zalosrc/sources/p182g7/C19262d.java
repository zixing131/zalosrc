package p182g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g7.d */
/* loaded from: classes3.dex */
public final class C19262d extends AbstractC19259a implements InterfaceC19264f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C19262d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // p182g7.InterfaceC19264f
    /* renamed from: H0 */
    public final void mo100975H0(String str, Bundle bundle, InterfaceC19266h interfaceC19266h) {
        Parcel m100968E = m100968E();
        m100968E.writeString(str);
        AbstractC19261c.m100973c(m100968E, bundle);
        AbstractC19261c.m100974d(m100968E, interfaceC19266h);
        m100969N(2, m100968E);
    }
}
