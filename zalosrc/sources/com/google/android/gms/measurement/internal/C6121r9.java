package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5531od;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p229i5.AbstractC20286g;
import p230i6.AbstractC20308b0;
import p230i6.AbstractC20324p;
import p230i6.AbstractC20325q;
import p230i6.AbstractC20326r;
import p230i6.AbstractC20327s;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes.dex */
public final class C6121r9 extends AbstractC6062m5 {

    /* renamed from: g */
    private static final String[] f34405g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f34406h = {"_err"};

    /* renamed from: c */
    private SecureRandom f34407c;

    /* renamed from: d */
    private final AtomicLong f34408d;

    /* renamed from: e */
    private int f34409e;

    /* renamed from: f */
    private Integer f34410f;

    public C6121r9(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34410f = null;
        this.f34408d = new AtomicLong(0L);
    }

    /* renamed from: Y */
    public static boolean m31300Y(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public static boolean m31301Z(String str) {
        AbstractC4205o.m19718g(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public static boolean m31302a0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC4205o.m19722k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: b0 */
    public static boolean m31303b0(Context context, boolean z11) {
        AbstractC4205o.m19722k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m31310k0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m31310k0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: c0 */
    public static boolean m31304c0(String str) {
        if (f34406h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    static final boolean m31305f0(Bundle bundle, int i11) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i11);
        return true;
    }

    /* renamed from: g0 */
    static final boolean m31306g0(String str) {
        AbstractC4205o.m19722k(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: h0 */
    private final int m31307h0(String str) {
        if ("_ldl".equals(str)) {
            this.f34158a.m31401z();
            return ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        }
        if ("_id".equals(str)) {
            this.f34158a.m31401z();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f34158a.m31401z();
            return 100;
        }
        this.f34158a.m31401z();
        return 36;
    }

    /* renamed from: i0 */
    private final Object m31308i0(int i11, Object obj, boolean z11, boolean z12) {
        long j11;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                if (true != ((Boolean) obj).booleanValue()) {
                    j11 = 0;
                } else {
                    j11 = 1;
                }
                return Long.valueOf(j11);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (!z12 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle m31358w0 = m31358w0((Bundle) parcelable);
                        if (!m31358w0.isEmpty()) {
                            arrayList.add(m31358w0);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return m31349q(obj.toString(), i11, z11);
        }
        return obj;
    }

    /* renamed from: j0 */
    private static boolean m31309j0(String str, String[] strArr) {
        AbstractC4205o.m19722k(strArr);
        for (String str2 : strArr) {
            if (AbstractC20308b0.m106017a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    private static boolean m31310k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: s */
    public static MessageDigest m31311s() {
        MessageDigest messageDigest;
        for (int i11 = 0; i11 < 2; i11++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: s0 */
    public static long m31312s0(byte[] bArr) {
        boolean z11;
        AbstractC4205o.m19722k(bArr);
        int length = bArr.length;
        int i11 = 0;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19726o(z11);
        long j11 = 0;
        for (int i12 = length - 1; i12 >= 0 && i12 >= bArr.length - 8; i12--) {
            j11 += (bArr[i12] & 255) << i11;
            i11 += 8;
        }
        return j11;
    }

    /* renamed from: u */
    public static ArrayList m31313u(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.f34664p);
            bundle.putString("origin", zzacVar.f34665q);
            bundle.putLong("creation_timestamp", zzacVar.f34667s);
            bundle.putString("name", zzacVar.f34666r.f34681q);
            AbstractC20324p.m106023b(bundle, AbstractC4205o.m19722k(zzacVar.f34666r.m31514t()));
            bundle.putBoolean("active", zzacVar.f34668t);
            String str = zzacVar.f34669u;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzaw zzawVar = zzacVar.f34670v;
            if (zzawVar != null) {
                bundle.putString("timed_out_event_name", zzawVar.f34676p);
                zzau zzauVar = zzawVar.f34677q;
                if (zzauVar != null) {
                    bundle.putBundle("timed_out_event_params", zzauVar.m31509F());
                }
            }
            bundle.putLong("trigger_timeout", zzacVar.f34671w);
            zzaw zzawVar2 = zzacVar.f34672x;
            if (zzawVar2 != null) {
                bundle.putString("triggered_event_name", zzawVar2.f34676p);
                zzau zzauVar2 = zzawVar2.f34677q;
                if (zzauVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzauVar2.m31509F());
                }
            }
            bundle.putLong("triggered_timestamp", zzacVar.f34666r.f34682r);
            bundle.putLong("time_to_live", zzacVar.f34673y);
            zzaw zzawVar3 = zzacVar.f34674z;
            if (zzawVar3 != null) {
                bundle.putString("expired_event_name", zzawVar3.f34676p);
                zzau zzauVar3 = zzawVar3.f34677q;
                if (zzauVar3 != null) {
                    bundle.putBundle("expired_event_params", zzauVar3.m31509F());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: y */
    public static void m31314y(C6184x6 c6184x6, Bundle bundle, boolean z11) {
        if (bundle != null && c6184x6 != null) {
            if (bundle.containsKey("_sc") && !z11) {
                z11 = false;
            } else {
                String str = c6184x6.f34589a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c6184x6.f34590b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c6184x6.f34591c);
                return;
            }
        }
        if (bundle != null && c6184x6 == null && z11) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void m31315A(Parcelable[] parcelableArr, int i11, boolean z11) {
        AbstractC4205o.m19722k(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i12 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m31301Z(str) && !m31309j0(str, AbstractC20326r.f100302d) && (i12 = i12 + 1) > i11) {
                    if (z11) {
                        this.f34158a.mo31033c().m31198r().m31110c("Param can't contain more than " + i11 + " item-scoped custom parameters", this.f34158a.m31372D().m30965e(str), this.f34158a.m31372D().m30962b(bundle));
                        m31305f0(bundle, 28);
                    } else {
                        this.f34158a.mo31033c().m31198r().m31110c("Param cannot contain item-scoped custom parameters", this.f34158a.m31372D().m30965e(str), this.f34158a.m31372D().m30962b(bundle));
                        m31305f0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* renamed from: B */
    public final void m31316B(C6093p3 c6093p3, int i11) {
        int i12 = 0;
        for (String str : new TreeSet(c6093p3.f34323d.keySet())) {
            if (m31301Z(str) && (i12 = i12 + 1) > i11) {
                this.f34158a.mo31033c().m31198r().m31110c("Event can't contain more than " + i11 + " params", this.f34158a.m31372D().m30964d(c6093p3.f34320a), this.f34158a.m31372D().m30962b(c6093p3.f34323d));
                m31305f0(c6093p3.f34323d, 5);
                c6093p3.f34323d.remove(str);
            }
        }
    }

    /* renamed from: C */
    public final void m31317C(InterfaceC6110q9 interfaceC6110q9, String str, int i11, String str2, String str3, int i12) {
        Bundle bundle = new Bundle();
        m31305f0(bundle, i11);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i11 == 6 || i11 == 7 || i11 == 2) {
            bundle.putLong("_el", i12);
        }
        interfaceC6110q9.mo30946a(str, "_err", bundle);
    }

    /* renamed from: D */
    public final void m31318D(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            this.f34158a.mo31033c().m31203x().m31110c("Not putting event parameter. Invalid value type. name, type", this.f34158a.m31372D().m30965e(str), str2);
        }
    }

    /* renamed from: E */
    public final void m31319E(InterfaceC5434j1 interfaceC5434j1, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z11);
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning boolean value to wrapper", e11);
        }
    }

    /* renamed from: F */
    public final void m31320F(InterfaceC5434j1 interfaceC5434j1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning bundle list to wrapper", e11);
        }
    }

    /* renamed from: G */
    public final void m31321G(InterfaceC5434j1 interfaceC5434j1, Bundle bundle) {
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning bundle value to wrapper", e11);
        }
    }

    /* renamed from: H */
    public final void m31322H(InterfaceC5434j1 interfaceC5434j1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning byte array to wrapper", e11);
        }
    }

    /* renamed from: I */
    public final void m31323I(InterfaceC5434j1 interfaceC5434j1, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i11);
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning int value to wrapper", e11);
        }
    }

    /* renamed from: J */
    public final void m31324J(InterfaceC5434j1 interfaceC5434j1, long j11) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j11);
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning long value to wrapper", e11);
        }
    }

    /* renamed from: K */
    public final void m31325K(InterfaceC5434j1 interfaceC5434j1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error returning string value to wrapper", e11);
        }
    }

    /* renamed from: L */
    final void m31326L(String str, String str2, String str3, Bundle bundle, List list, boolean z11) {
        int i11;
        int i12;
        int i13;
        String str4;
        int i14;
        int m31329O;
        int i15;
        String str5;
        String str6;
        if (bundle == null) {
            return;
        }
        C5990g m31401z = this.f34158a.m31401z();
        C5531od.m29487b();
        String str7 = null;
        if (m31401z.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33875B0) && m31401z.f34158a.m31381N().m31338X(231100000, true)) {
            i11 = 35;
        } else {
            i11 = 0;
        }
        int i16 = 0;
        for (String str8 : new TreeSet(bundle.keySet())) {
            if (list != null && list.contains(str8)) {
                i13 = 0;
            } else {
                if (!z11) {
                    i12 = m31346o0(str8);
                } else {
                    i12 = 0;
                }
                if (i12 == 0) {
                    i12 = m31344n0(str8);
                }
                i13 = i12;
            }
            if (i13 != 0) {
                if (i13 == 3) {
                    str6 = str8;
                } else {
                    str6 = str7;
                }
                m31359x(bundle, i13, str8, str8, str6);
                bundle.remove(str8);
                i15 = i11;
                str5 = str7;
            } else {
                if (m31336V(bundle.get(str8))) {
                    this.f34158a.mo31033c().m31203x().m31111d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str8);
                    str4 = str8;
                    i14 = i11;
                    m31329O = 22;
                } else {
                    str4 = str8;
                    i14 = i11;
                    m31329O = m31329O(str, str2, str8, bundle.get(str8), bundle, list, z11, false);
                }
                if (m31329O != 0 && !"_ev".equals(str4)) {
                    m31359x(bundle, m31329O, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m31301Z(str4) && !m31309j0(str4, AbstractC20326r.f100302d)) {
                    int i17 = i16 + 1;
                    if (!m31338X(231100000, true)) {
                        this.f34158a.mo31033c().m31198r().m31110c("Item array not supported on client's version of Google Play Services (Android Only)", this.f34158a.m31372D().m30964d(str2), this.f34158a.m31372D().m30962b(bundle));
                        m31305f0(bundle, 23);
                        bundle.remove(str4);
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if (i17 > i15) {
                            C5531od.m29487b();
                            str5 = null;
                            if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33875B0)) {
                                this.f34158a.mo31033c().m31198r().m31110c("Item can't contain more than " + i15 + " item-scoped custom params", this.f34158a.m31372D().m30964d(str2), this.f34158a.m31372D().m30962b(bundle));
                                m31305f0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                this.f34158a.mo31033c().m31198r().m31110c("Item cannot contain custom parameters", this.f34158a.m31372D().m30964d(str2), this.f34158a.m31372D().m30962b(bundle));
                                m31305f0(bundle, 23);
                                bundle.remove(str4);
                            }
                            i16 = i17;
                        }
                    }
                    str5 = null;
                    i16 = i17;
                }
                i15 = i14;
                str5 = null;
            }
            i11 = i15;
            str7 = str5;
        }
    }

    /* renamed from: M */
    public final boolean m31327M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!m31306g0(str)) {
                if (this.f34158a.m31396p()) {
                    this.f34158a.mo31033c().m31198r().m31109b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C6082o3.m31193z(str));
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!m31306g0(str2)) {
                this.f34158a.mo31033c().m31198r().m31109b("Invalid admob_app_id. Analytics disabled.", C6082o3.m31193z(str2));
                return false;
            }
            return true;
        }
        if (this.f34158a.m31396p()) {
            this.f34158a.mo31033c().m31198r().m31108a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m31328N(String str, int i11, String str2) {
        if (str2 == null) {
            this.f34158a.mo31033c().m31198r().m31109b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) > i11) {
            this.f34158a.mo31033c().m31198r().m31111d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i11), str2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int m31329O(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z11, boolean z12) {
        int i11;
        int i12;
        Object obj2;
        int size;
        mo31036g();
        if (m31336V(obj)) {
            if (z12) {
                if (!m31309j0(str3, AbstractC20326r.f100301c)) {
                    return 20;
                }
                C5977e8 m31379L = this.f34158a.m31379L();
                m31379L.mo31036g();
                m31379L.m31455h();
                if (m31379L.m30870B() && m31379L.f34158a.m31381N().m31350q0() < 200900) {
                    return 25;
                }
                this.f34158a.m31401z();
                boolean z13 = obj instanceof Parcelable[];
                if (z13) {
                    size = ((Parcelable[]) obj).length;
                } else if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                }
                if (size > 200) {
                    this.f34158a.mo31033c().m31203x().m31111d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                    this.f34158a.m31401z();
                    if (z13) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        if (parcelableArr.length > 200) {
                            bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        if (arrayList.size() > 200) {
                            bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                        }
                    }
                    i11 = 17;
                    if (m31300Y(str2) && !m31300Y(str3)) {
                        this.f34158a.m31401z();
                        i12 = 100;
                    } else {
                        this.f34158a.m31401z();
                        i12 = 256;
                    }
                    if (!m31331Q("param", str3, i12, obj)) {
                        return i11;
                    }
                    if (z12) {
                        if (obj instanceof Bundle) {
                            m31326L(str, str2, str3, (Bundle) obj, list, z11);
                        } else if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (!(parcelable instanceof Bundle)) {
                                    this.f34158a.mo31033c().m31203x().m31110c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                                    return 4;
                                }
                                m31326L(str, str2, str3, (Bundle) parcelable, list, z11);
                            }
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size2 = arrayList2.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                Object obj3 = arrayList2.get(i13);
                                if (!(obj3 instanceof Bundle)) {
                                    C6060m3 m31203x = this.f34158a.mo31033c().m31203x();
                                    if (obj3 != null) {
                                        obj2 = obj3.getClass();
                                    } else {
                                        obj2 = "null";
                                    }
                                    m31203x.m31110c("All ArrayList elements must be of type Bundle. Value type, name", obj2, str3);
                                    return 4;
                                }
                                m31326L(str, str2, str3, (Bundle) obj3, list, z11);
                            }
                        } else {
                            return 4;
                        }
                        return i11;
                    }
                    return 4;
                }
            } else {
                return 21;
            }
        }
        i11 = 0;
        if (m31300Y(str2)) {
        }
        this.f34158a.m31401z();
        i12 = 256;
        if (!m31331Q("param", str3, i12, obj)) {
        }
    }

    /* renamed from: P */
    public final boolean m31330P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f34158a.mo31033c().m31198r().m31109b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC4205o.m19722k(str2);
        String[] strArr3 = f34405g;
        for (int i11 = 0; i11 < 3; i11++) {
            if (str2.startsWith(strArr3[i11])) {
                this.f34158a.mo31033c().m31198r().m31110c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr != null && m31309j0(str2, strArr)) {
            if (strArr2 == null || !m31309j0(str2, strArr2)) {
                this.f34158a.mo31033c().m31198r().m31110c("Name is reserved. Type, name", str, str2);
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: Q */
    public final boolean m31331Q(String str, String str2, int i11, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i11) {
                this.f34158a.mo31033c().m31203x().m31111d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public final boolean m31332R(String str, String str2) {
        if (str2 == null) {
            this.f34158a.mo31033c().m31198r().m31109b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f34158a.mo31033c().m31198r().m31109b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt == 95) {
                codePointAt = 95;
            } else {
                this.f34158a.mo31033c().m31198r().m31110c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f34158a.mo31033c().m31198r().m31110c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: S */
    public final boolean m31333S(String str, String str2) {
        if (str2 == null) {
            this.f34158a.mo31033c().m31198r().m31109b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f34158a.mo31033c().m31198r().m31109b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f34158a.mo31033c().m31198r().m31110c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f34158a.mo31033c().m31198r().m31110c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: T */
    public final boolean m31334T(String str) {
        mo31036g();
        if (C21472e.m111067a(this.f34158a.mo31032b()).m111059a(str) == 0) {
            return true;
        }
        this.f34158a.mo31033c().m31196p().m31109b("Permission not granted", str);
        return false;
    }

    /* renamed from: U */
    public final boolean m31335U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m30930t = this.f34158a.m31401z().m30930t();
        this.f34158a.mo31035f();
        return m30930t.equals(str);
    }

    /* renamed from: V */
    public final boolean m31336V(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public final boolean m31337W(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m111064f = C21472e.m111067a(context).m111064f(str, 64);
            if (m111064f != null && (signatureArr = m111064f.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            this.f34158a.mo31033c().m31197q().m31109b("Package name not found", e11);
            return true;
        } catch (CertificateException e12) {
            this.f34158a.mo31033c().m31197q().m31109b("Error obtaining certificate", e12);
            return true;
        }
    }

    /* renamed from: X */
    public final boolean m31338X(int i11, boolean z11) {
        Boolean m30871J = this.f34158a.m31379L().m30871J();
        if (m31350q0() >= i11 / 1000) {
            return true;
        }
        if (m30871J != null && !m30871J.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final boolean m31339d0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC4205o.m19722k(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        }
        if (isEmpty && isEmpty2) {
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                if (!str3.equals(str4)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        }
        if (!isEmpty) {
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            }
            return false;
        }
        if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public final byte[] m31340e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: h */
    protected final void mo30815h() {
        mo31036g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f34158a.mo31033c().m31202w().m31108a("Utils falling back to Random for random id");
            }
        }
        this.f34408d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6062m5
    /* renamed from: i */
    protected final boolean mo30816i() {
        return true;
    }

    /* renamed from: l0 */
    public final int m31341l0(String str, Object obj) {
        boolean m31331Q;
        if ("_ldl".equals(str)) {
            m31331Q = m31331Q("user property referrer", str, m31307h0(str), obj);
        } else {
            m31331Q = m31331Q("user property", str, m31307h0(str), obj);
        }
        if (m31331Q) {
            return 0;
        }
        return 7;
    }

    /* renamed from: m0 */
    public final int m31342m0(String str) {
        if (!m31332R("event", str)) {
            return 2;
        }
        if (!m31330P("event", AbstractC20325q.f100295a, AbstractC20325q.f100296b, str)) {
            return 13;
        }
        this.f34158a.m31401z();
        if (!m31328N("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: n */
    public final Object m31343n(String str, Object obj) {
        int i11 = 256;
        if ("_ev".equals(str)) {
            this.f34158a.m31401z();
            return m31308i0(256, obj, true, true);
        }
        if (m31300Y(str)) {
            this.f34158a.m31401z();
        } else {
            this.f34158a.m31401z();
            i11 = 100;
        }
        return m31308i0(i11, obj, false, true);
    }

    /* renamed from: n0 */
    final int m31344n0(String str) {
        if (!m31332R("event param", str)) {
            return 3;
        }
        if (!m31330P("event param", null, null, str)) {
            return 14;
        }
        this.f34158a.m31401z();
        if (!m31328N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: o */
    public final Object m31345o(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m31308i0(m31307h0(str), obj, true, false);
        }
        return m31308i0(m31307h0(str), obj, false, false);
    }

    /* renamed from: o0 */
    final int m31346o0(String str) {
        if (!m31333S("event param", str)) {
            return 3;
        }
        if (!m31330P("event param", null, null, str)) {
            return 14;
        }
        this.f34158a.m31401z();
        if (!m31328N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: p */
    public final String m31347p() {
        byte[] bArr = new byte[16];
        m31353t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: p0 */
    public final int m31348p0(String str) {
        if (!m31332R("user property", str)) {
            return 6;
        }
        if (!m31330P("user property", AbstractC20327s.f100303a, null, str)) {
            return 15;
        }
        this.f34158a.m31401z();
        if (!m31328N("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: q */
    public final String m31349q(String str, int i11, boolean z11) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i11) {
            if (!z11) {
                return null;
            }
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i11))).concat("...");
        }
        return str;
    }

    /* renamed from: q0 */
    public final int m31350q0() {
        if (this.f34410f == null) {
            this.f34410f = Integer.valueOf(C4148b.m19567h().m19569b(this.f34158a.mo31032b()) / 1000);
        }
        return this.f34410f.intValue();
    }

    /* renamed from: r */
    public final URL m31351r(long j11, String str, String str2, long j12) {
        try {
            AbstractC4205o.m19718g(str2);
            AbstractC4205o.m19718g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 76003L, Integer.valueOf(m31350q0())), str2, str, Long.valueOf(j12));
            if (str.equals(this.f34158a.m31401z().m30931u())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException e11) {
            e = e11;
            this.f34158a.mo31033c().m31197q().m31109b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e12) {
            e = e12;
            this.f34158a.mo31033c().m31197q().m31109b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: r0 */
    public final int m31352r0(int i11) {
        return C4148b.m19567h().mo19201j(this.f34158a.mo31032b(), AbstractC4150d.f16480a);
    }

    /* renamed from: t */
    public final SecureRandom m31353t() {
        mo31036g();
        if (this.f34407c == null) {
            this.f34407c = new SecureRandom();
        }
        return this.f34407c;
    }

    /* renamed from: t0 */
    public final long m31354t0() {
        long andIncrement;
        long j11;
        if (this.f34408d.get() == 0) {
            synchronized (this.f34408d) {
                long nextLong = new Random(System.nanoTime() ^ this.f34158a.mo31031a().mo105913a()).nextLong();
                int i11 = this.f34409e + 1;
                this.f34409e = i11;
                j11 = nextLong + i11;
            }
            return j11;
        }
        synchronized (this.f34408d) {
            this.f34408d.compareAndSet(-1L, 1L);
            andIncrement = this.f34408d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: u0 */
    public final long m31355u0(long j11, long j12) {
        return (j11 + (j12 * 60000)) / 86400000;
    }

    /* renamed from: v0 */
    public final Bundle m31356v0(Uri uri, boolean z11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("utm_id");
                str6 = uri.getQueryParameter("dclid");
                str7 = uri.getQueryParameter("srsltid");
                if (z11) {
                    str8 = uri.getQueryParameter("sfmc_id");
                } else {
                    str8 = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z11 || TextUtils.isEmpty(str8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("campaign_id", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("dclid", str6);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("srsltid", str7);
            }
            if (z11 && !TextUtils.isEmpty(str8)) {
                bundle.putString("sfmc_id", str8);
            }
            return bundle;
        } catch (UnsupportedOperationException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Install referrer url isn't a hierarchical URI", e11);
            return null;
        }
    }

    /* renamed from: w */
    public final void m31357w(Bundle bundle, long j11) {
        long j12 = bundle.getLong("_et");
        if (j12 != 0) {
            this.f34158a.mo31033c().m31202w().m31109b("Params already contained engagement", Long.valueOf(j12));
        } else {
            j12 = 0;
        }
        bundle.putLong("_et", j11 + j12);
    }

    /* renamed from: w0 */
    public final Bundle m31358w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m31343n = m31343n(str, bundle.get(str));
                if (m31343n == null) {
                    this.f34158a.mo31033c().m31203x().m31109b("Param value can't be null", this.f34158a.m31372D().m30965e(str));
                } else {
                    m31318D(bundle2, str, m31343n);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: x */
    final void m31359x(Bundle bundle, int i11, String str, String str2, Object obj) {
        if (m31305f0(bundle, i11)) {
            this.f34158a.m31401z();
            bundle.putString("_ev", m31349q(str, 40, true));
            if (obj != null) {
                AbstractC4205o.m19722k(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106 A[SYNTHETIC] */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m31360x0(String str, String str2, Bundle bundle, List list, boolean z11) {
        int i11;
        int i12;
        int i13;
        String str3;
        String str4;
        String str5;
        boolean m31309j0 = m31309j0(str2, AbstractC20325q.f100298d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int m30922l = this.f34158a.m31401z().m30922l();
            int i14 = 0;
            for (String str6 : new TreeSet(bundle.keySet())) {
                if (list != null && list.contains(str6)) {
                    i12 = 0;
                } else {
                    if (!z11) {
                        i11 = m31346o0(str6);
                    } else {
                        i11 = 0;
                    }
                    if (i11 == 0) {
                        i11 = m31344n0(str6);
                    }
                    i12 = i11;
                }
                if (i12 != 0) {
                    if (i12 == 3) {
                        str5 = str6;
                    } else {
                        str5 = null;
                    }
                    m31359x(bundle2, i12, str6, str6, str5);
                    bundle2.remove(str6);
                    i13 = m30922l;
                } else {
                    i13 = m30922l;
                    int m31329O = m31329O(str, str2, str6, bundle.get(str6), bundle2, list, z11, m31309j0);
                    if (m31329O == 17) {
                        m31359x(bundle2, 17, str6, str6, Boolean.FALSE);
                    } else if (m31329O != 0) {
                        str3 = str6;
                        if (!"_ev".equals(str3)) {
                            if (m31329O == 21) {
                                str4 = str2;
                            } else {
                                str4 = str3;
                            }
                            m31359x(bundle2, m31329O, str4, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                        if (m31301Z(str3)) {
                            int i15 = i14 + 1;
                            if (i15 > i13) {
                                this.f34158a.mo31033c().m31198r().m31110c("Event can't contain more than " + i13 + " params", this.f34158a.m31372D().m30964d(str2), this.f34158a.m31372D().m30962b(bundle));
                                m31305f0(bundle2, 5);
                                bundle2.remove(str3);
                            }
                            i14 = i15;
                        }
                    }
                    str3 = str6;
                    if (m31301Z(str3)) {
                    }
                }
                m30922l = i13;
            }
            return bundle2;
        }
        return null;
    }

    /* renamed from: y0 */
    public final zzaw m31361y0(String str, String str2, Bundle bundle, String str3, long j11, boolean z11, boolean z12) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m31342m0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle m31360x0 = m31360x0(str, str2, bundle3, AbstractC20286g.m105917b("_o"), true);
            if (z11) {
                m31360x0 = m31358w0(m31360x0);
            }
            AbstractC4205o.m19722k(m31360x0);
            return new zzaw(str2, new zzau(m31360x0), str3, j11);
        }
        this.f34158a.mo31033c().m31197q().m31109b("Invalid conditional property event name", this.f34158a.m31372D().m30966f(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public final void m31362z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f34158a.m31381N().m31318D(bundle, str, bundle2.get(str));
            }
        }
    }
}
