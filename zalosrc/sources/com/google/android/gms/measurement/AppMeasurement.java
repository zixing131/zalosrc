package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.C6127s4;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p230i6.AbstractC20324p;
import p230i6.InterfaceC20330v;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f33744b;

    /* renamed from: a */
    private final AbstractC5920d f33745a;

    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            AbstractC4205o.m19722k(bundle);
            this.mAppId = (String) AbstractC20324p.m106022a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC20324p.m106022a(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC20324p.m106022a(bundle, "name", String.class, null);
            this.mValue = AbstractC20324p.m106022a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) AbstractC20324p.m106022a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC20324p.m106022a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC20324p.m106022a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC20324p.m106022a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC20324p.m106022a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC20324p.m106022a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC20324p.m106022a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC20324p.m106022a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC20324p.m106022a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC20324p.m106022a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC20324p.m106022a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC20324p.m106022a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C6127s4 c6127s4) {
        this.f33745a = new C5917a(c6127s4);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f33744b == null) {
            synchronized (AppMeasurement.class) {
                if (f33744b == null) {
                    InterfaceC20330v interfaceC20330v = (InterfaceC20330v) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC20330v != null) {
                        f33744b = new AppMeasurement(interfaceC20330v);
                    } else {
                        f33744b = new AppMeasurement(C6127s4.m31363H(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f33744b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f33745a.mo30786l(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f33745a.mo30785e(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f33745a.mo30787r(str);
    }

    @Keep
    public long generateEventId() {
        return this.f33745a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f33745a.zzh();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List mo30782b = this.f33745a.mo30782b(str, str2);
        if (mo30782b == null) {
            size = 0;
        } else {
            size = mo30782b.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = mo30782b.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f33745a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f33745a.zzj();
    }

    @Keep
    public String getGmpAppId() {
        return this.f33745a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f33745a.zza(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z11) {
        return this.f33745a.mo30783c(str, str2, z11);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f33745a.mo30781a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC4205o.m19722k(conditionalUserProperty);
        AbstractC5920d abstractC5920d = this.f33745a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC20324p.m106023b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC5920d.mo30784d(bundle);
    }

    public AppMeasurement(InterfaceC20330v interfaceC20330v) {
        this.f33745a = new C5918b(interfaceC20330v);
    }
}
