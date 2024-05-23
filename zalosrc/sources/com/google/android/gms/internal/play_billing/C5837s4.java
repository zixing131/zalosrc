package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.zing.zalo.zmedia.player.IMediaPlayer;

/* renamed from: com.google.android.gms.internal.play_billing.s4 */
/* loaded from: classes2.dex */
public final class C5837s4 extends AbstractC5855v4 implements InterfaceC5849u4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5837s4(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: A3 */
    public final Bundle mo30467A3(int i11, String str, String str2, String str3, String str4) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(3);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        m30529E.writeString(str3);
        m30529E.writeString(null);
        Parcel m30530N = m30530N(3, m30529E);
        Bundle bundle = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: C1 */
    public final Bundle mo30468C1(int i11, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(i11);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        m30529E.writeString(str3);
        m30529E.writeString(null);
        AbstractC5867x4.m30564c(m30529E, bundle);
        Parcel m30530N = m30530N(8, m30529E);
        Bundle bundle2 = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: C4 */
    public final int mo30469C4(int i11, String str, String str2, Bundle bundle) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(i11);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        AbstractC5867x4.m30564c(m30529E, bundle);
        Parcel m30530N = m30530N(10, m30529E);
        int readInt = m30530N.readInt();
        m30530N.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: F2 */
    public final Bundle mo30470F2(int i11, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(i11);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        AbstractC5867x4.m30564c(m30529E, bundle);
        AbstractC5867x4.m30564c(m30529E, bundle2);
        Parcel m30530N = m30530N(IMediaPlayer.MEDIA_INFO_UNSUPPORTED_SUBTITLE, m30529E);
        Bundle bundle3 = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: L2 */
    public final Bundle mo30471L2(int i11, String str, String str2, Bundle bundle) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(9);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        AbstractC5867x4.m30564c(m30529E, bundle);
        Parcel m30530N = m30530N(12, m30529E);
        Bundle bundle2 = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: P4 */
    public final Bundle mo30472P4(int i11, String str, String str2, Bundle bundle) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(9);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        AbstractC5867x4.m30564c(m30529E, bundle);
        Parcel m30530N = m30530N(IMediaPlayer.MEDIA_INFO_SUBTITLE_TIMED_OUT, m30529E);
        Bundle bundle2 = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: U0 */
    public final Bundle mo30473U0(int i11, String str, String str2, String str3) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(3);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        m30529E.writeString(str3);
        Parcel m30530N = m30530N(4, m30529E);
        Bundle bundle = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: W2 */
    public final void mo30474W2(int i11, String str, Bundle bundle, InterfaceC5853v2 interfaceC5853v2) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(18);
        m30529E.writeString(str);
        AbstractC5867x4.m30564c(m30529E, bundle);
        m30529E.writeStrongBinder(interfaceC5853v2);
        m30531Q(1301, m30529E);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: Y */
    public final int mo30475Y(int i11, String str, String str2) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(3);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        Parcel m30530N = m30530N(5, m30529E);
        int readInt = m30530N.readInt();
        m30530N.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: o2 */
    public final Bundle mo30476o2(int i11, String str, String str2, String str3, Bundle bundle) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(i11);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        m30529E.writeString(str3);
        AbstractC5867x4.m30564c(m30529E, bundle);
        Parcel m30530N = m30530N(11, m30529E);
        Bundle bundle2 = (Bundle) AbstractC5867x4.m30562a(m30530N, Bundle.CREATOR);
        m30530N.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5849u4
    /* renamed from: w1 */
    public final int mo30477w1(int i11, String str, String str2) {
        Parcel m30529E = m30529E();
        m30529E.writeInt(i11);
        m30529E.writeString(str);
        m30529E.writeString(str2);
        Parcel m30530N = m30530N(1, m30529E);
        int readInt = m30530N.readInt();
        m30530N.recycle();
        return readInt;
    }
}
