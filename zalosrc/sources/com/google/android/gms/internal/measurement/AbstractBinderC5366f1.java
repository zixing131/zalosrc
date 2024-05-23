package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5366f1 extends AbstractBinderC5535p0 implements InterfaceC5383g1 {
    public AbstractBinderC5366f1() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC5383g1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof InterfaceC5383g1) {
            return (InterfaceC5383g1) queryLocalInterface;
        }
        return new C5349e1(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5535p0
    /* renamed from: E */
    protected final boolean mo29114E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        InterfaceC5434j1 c5400h1;
        InterfaceC5434j1 interfaceC5434j1 = null;
        InterfaceC5434j1 interfaceC5434j12 = null;
        InterfaceC5434j1 interfaceC5434j13 = null;
        InterfaceC5434j1 interfaceC5434j14 = null;
        InterfaceC5485m1 interfaceC5485m1 = null;
        InterfaceC5485m1 interfaceC5485m12 = null;
        InterfaceC5485m1 interfaceC5485m13 = null;
        InterfaceC5434j1 interfaceC5434j15 = null;
        InterfaceC5434j1 interfaceC5434j16 = null;
        InterfaceC5434j1 interfaceC5434j17 = null;
        InterfaceC5434j1 interfaceC5434j18 = null;
        InterfaceC5434j1 interfaceC5434j19 = null;
        InterfaceC5434j1 interfaceC5434j110 = null;
        InterfaceC5519o1 interfaceC5519o1 = null;
        InterfaceC5434j1 interfaceC5434j111 = null;
        InterfaceC5434j1 interfaceC5434j112 = null;
        InterfaceC5434j1 interfaceC5434j113 = null;
        InterfaceC5434j1 interfaceC5434j114 = null;
        switch (i11) {
            case 1:
                InterfaceC4271b m19911N = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) AbstractC5552q0.m29542a(parcel, zzcl.CREATOR);
                long readLong = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                initialize(m19911N, zzclVar, readLong);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                boolean m29547f = AbstractC5552q0.m29547f(parcel);
                boolean m29547f2 = AbstractC5552q0.m29547f(parcel);
                long readLong2 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                logEvent(readString, readString2, bundle, m29547f, m29547f2, readLong2);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c5400h1 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c5400h1 = queryLocalInterface instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface : new C5400h1(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                logEventAndBundle(readString3, readString4, bundle2, c5400h1, readLong3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC4271b m19911N2 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                boolean m29547f3 = AbstractC5552q0.m29547f(parcel);
                long readLong4 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setUserProperty(readString5, readString6, m19911N2, m29547f3, readLong4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean m29547f4 = AbstractC5552q0.m29547f(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j1 = queryLocalInterface2 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface2 : new C5400h1(readStrongBinder2);
                }
                AbstractC5552q0.m29544c(parcel);
                getUserProperties(readString7, readString8, m29547f4, interfaceC5434j1);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j114 = queryLocalInterface3 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface3 : new C5400h1(readStrongBinder3);
                }
                AbstractC5552q0.m29544c(parcel);
                getMaxUserProperties(readString9, interfaceC5434j114);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setUserId(readString10, readLong5);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j113 = queryLocalInterface4 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface4 : new C5400h1(readStrongBinder4);
                }
                AbstractC5552q0.m29544c(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC5434j113);
                parcel2.writeNoException();
                return true;
            case 11:
                boolean m29547f5 = AbstractC5552q0.m29547f(parcel);
                long readLong7 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setMeasurementEnabled(m29547f5, readLong7);
                parcel2.writeNoException();
                return true;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                resetAnalyticsData(readLong8);
                parcel2.writeNoException();
                return true;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setMinimumSessionDuration(readLong9);
                parcel2.writeNoException();
                return true;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setSessionTimeoutDuration(readLong10);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC4271b m19911N3 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setCurrentScreen(m19911N3, readString15, readString16, readLong11);
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j112 = queryLocalInterface5 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface5 : new C5400h1(readStrongBinder5);
                }
                AbstractC5552q0.m29544c(parcel);
                getCurrentScreenName(interfaceC5434j112);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j111 = queryLocalInterface6 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface6 : new C5400h1(readStrongBinder6);
                }
                AbstractC5552q0.m29544c(parcel);
                getCurrentScreenClass(interfaceC5434j111);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    interfaceC5519o1 = queryLocalInterface7 instanceof InterfaceC5519o1 ? (InterfaceC5519o1) queryLocalInterface7 : new C5502n1(readStrongBinder7);
                }
                AbstractC5552q0.m29544c(parcel);
                setInstanceIdProvider(interfaceC5519o1);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j110 = queryLocalInterface8 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface8 : new C5400h1(readStrongBinder8);
                }
                AbstractC5552q0.m29544c(parcel);
                getCachedAppInstanceId(interfaceC5434j110);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j19 = queryLocalInterface9 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface9 : new C5400h1(readStrongBinder9);
                }
                AbstractC5552q0.m29544c(parcel);
                getAppInstanceId(interfaceC5434j19);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j18 = queryLocalInterface10 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface10 : new C5400h1(readStrongBinder10);
                }
                AbstractC5552q0.m29544c(parcel);
                getGmpAppId(interfaceC5434j18);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j17 = queryLocalInterface11 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface11 : new C5400h1(readStrongBinder11);
                }
                AbstractC5552q0.m29544c(parcel);
                generateEventId(interfaceC5434j17);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                beginAdUnitExposure(readString17, readLong12);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                endAdUnitExposure(readString18, readLong13);
                parcel2.writeNoException();
                return true;
            case 25:
                InterfaceC4271b m19911N4 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivityStarted(m19911N4, readLong14);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC4271b m19911N5 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivityStopped(m19911N5, readLong15);
                parcel2.writeNoException();
                return true;
            case 27:
                InterfaceC4271b m19911N6 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivityCreated(m19911N6, bundle5, readLong16);
                parcel2.writeNoException();
                return true;
            case 28:
                InterfaceC4271b m19911N7 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivityDestroyed(m19911N7, readLong17);
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC4271b m19911N8 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivityPaused(m19911N8, readLong18);
                parcel2.writeNoException();
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                InterfaceC4271b m19911N9 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivityResumed(m19911N9, readLong19);
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC4271b m19911N10 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j16 = queryLocalInterface12 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface12 : new C5400h1(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                onActivitySaveInstanceState(m19911N10, interfaceC5434j16, readLong20);
                parcel2.writeNoException();
                return true;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                Bundle bundle6 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j15 = queryLocalInterface13 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface13 : new C5400h1(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                performAction(bundle6, interfaceC5434j15, readLong21);
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC4271b m19911N11 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N12 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                InterfaceC4271b m19911N13 = InterfaceC4271b.a.m19911N(parcel.readStrongBinder());
                AbstractC5552q0.m29544c(parcel);
                logHealthData(readInt, readString19, m19911N11, m19911N12, m19911N13);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC5485m13 = queryLocalInterface14 instanceof InterfaceC5485m1 ? (InterfaceC5485m1) queryLocalInterface14 : new C5451k1(readStrongBinder14);
                }
                AbstractC5552q0.m29544c(parcel);
                setEventInterceptor(interfaceC5485m13);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC5485m12 = queryLocalInterface15 instanceof InterfaceC5485m1 ? (InterfaceC5485m1) queryLocalInterface15 : new C5451k1(readStrongBinder15);
                }
                AbstractC5552q0.m29544c(parcel);
                registerOnMeasurementEventListener(interfaceC5485m12);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    interfaceC5485m1 = queryLocalInterface16 instanceof InterfaceC5485m1 ? (InterfaceC5485m1) queryLocalInterface16 : new C5451k1(readStrongBinder16);
                }
                AbstractC5552q0.m29544c(parcel);
                unregisterOnMeasurementEventListener(interfaceC5485m1);
                parcel2.writeNoException();
                return true;
            case 37:
                HashMap m29543b = AbstractC5552q0.m29543b(parcel);
                AbstractC5552q0.m29544c(parcel);
                initForTests(m29543b);
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j14 = queryLocalInterface17 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface17 : new C5400h1(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                AbstractC5552q0.m29544c(parcel);
                getTestFlag(interfaceC5434j14, readInt2);
                parcel2.writeNoException();
                return true;
            case 39:
                boolean m29547f6 = AbstractC5552q0.m29547f(parcel);
                AbstractC5552q0.m29544c(parcel);
                setDataCollectionEnabled(m29547f6);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j13 = queryLocalInterface18 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface18 : new C5400h1(readStrongBinder18);
                }
                AbstractC5552q0.m29544c(parcel);
                isDataCollectionEnabled(interfaceC5434j13);
                parcel2.writeNoException();
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                AbstractC5552q0.m29544c(parcel);
                setDefaultEventParameters(bundle7);
                parcel2.writeNoException();
                return true;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                clearMeasurementEnabled(readLong22);
                parcel2.writeNoException();
                return true;
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                Bundle bundle8 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setConsent(bundle8, readLong23);
                parcel2.writeNoException();
                return true;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC5552q0.m29542a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC5552q0.m29544c(parcel);
                setConsentThirdParty(bundle9, readLong24);
                parcel2.writeNoException();
                return true;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC5434j12 = queryLocalInterface19 instanceof InterfaceC5434j1 ? (InterfaceC5434j1) queryLocalInterface19 : new C5400h1(readStrongBinder19);
                }
                AbstractC5552q0.m29544c(parcel);
                getSessionId(interfaceC5434j12);
                parcel2.writeNoException();
                return true;
        }
    }
}
