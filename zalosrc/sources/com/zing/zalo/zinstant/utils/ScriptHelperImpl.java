package com.zing.zalo.zinstant.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import bn0.AbstractC2940i;
import com.zing.zalo.zinstant.zom.model.ExternalScriptData;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import on0.C24321d;
import p667y2.C30268e;
import pj0.C24777c;
import pj0.C24793s;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24778d;
import pj0.InterfaceC24782h;
import pj0.InterfaceC24789o;
import pj0.InterfaceC24790p;
import pj0.InterfaceC24791q;
import pj0.InterfaceC24796v;
import pm0.C24848g0;
import vj0.AbstractC28268b;

/* loaded from: classes.dex */
public final class ScriptHelperImpl {
    private static final String DIRECTORY_JS = "oreo";
    private static final String INVALID_NETWORK_PROVIDER = "NetworkProvider haven't initialized.";
    private static final String INVALID_URL = "Url must not be empty.";
    private static final int NEGATIVE_BUTTON_ID = 2;
    private static final int POSITIVE_BUTTON_ID = 1;
    public static final String TAG = "ScriptHelperImpl";
    private static InterfaceC24791q mPreferences;
    private static InterfaceC24782h mResourceDownloader;
    private static InterfaceC24796v mUtilityProvider;
    private static InterfaceC24789o networkProvider;
    public static final ScriptHelperImpl INSTANCE = new ScriptHelperImpl();
    private static final AtomicBoolean mIsAlertShowing = new AtomicBoolean(false);

    /* renamed from: com.zing.zalo.zinstant.utils.ScriptHelperImpl$a */
    /* loaded from: classes7.dex */
    public static final class C17184a implements InterfaceC24775a {
        C17184a() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            AbstractC17201m.m91823o(ScriptHelperImpl.TAG, "Download script success", null);
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            AbstractC17201m.m91824p(ScriptHelperImpl.TAG, "Download script Error", exc);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.utils.ScriptHelperImpl$b */
    /* loaded from: classes7.dex */
    public static final class C17185b implements InterfaceC24778d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24775a f87743a;

        /* renamed from: b */
        final /* synthetic */ AtomicBoolean[] f87744b;

        /* renamed from: c */
        final /* synthetic */ int f87745c;

        C17185b(InterfaceC24775a interfaceC24775a, AtomicBoolean[] atomicBooleanArr, int i11) {
            this.f87743a = interfaceC24775a;
            this.f87744b = atomicBooleanArr;
            this.f87745c = i11;
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: a */
        public void mo91792a(String str, File file) {
            AbstractC19074t.m100208f(str, "resource");
            AbstractC19074t.m100208f(file, "downloadedFile");
            this.f87744b[this.f87745c].set(true);
            AtomicBoolean[] atomicBooleanArr = this.f87744b;
            if (AbstractC17201m.m91809a((AtomicBoolean[]) Arrays.copyOf(atomicBooleanArr, atomicBooleanArr.length))) {
                this.f87743a.onSuccess(null);
            }
        }

        @Override // pj0.InterfaceC24778d
        /* renamed from: b */
        public void mo91793b(String str, String str2) {
            AbstractC19074t.m100208f(str, "resource");
            AbstractC19074t.m100208f(str2, C30268e.f140632a);
            this.f87743a.mo15338c(new Exception(str2));
        }
    }

    /* renamed from: com.zing.zalo.zinstant.utils.ScriptHelperImpl$c */
    /* loaded from: classes7.dex */
    public static final class C17186c implements InterfaceC24790p {

        /* renamed from: a */
        final /* synthetic */ ZOMDocument f87746a;

        /* renamed from: b */
        final /* synthetic */ int f87747b;

        C17186c(ZOMDocument zOMDocument, int i11) {
            this.f87746a = zOMDocument;
            this.f87747b = i11;
        }

        @Override // pj0.InterfaceC24790p
        /* renamed from: a */
        public void mo91794a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f87746a.onNetworkError(this.f87747b, i11, str);
        }

        @Override // pj0.InterfaceC24790p
        public void onSuccess(String str) {
            AbstractC19074t.m100208f(str, "data");
            this.f87746a.onNetworkSuccess(this.f87747b, str);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.utils.ScriptHelperImpl$d */
    /* loaded from: classes7.dex */
    public static final class C17187d implements InterfaceC24790p {

        /* renamed from: a */
        final /* synthetic */ ZOMDocument f87748a;

        /* renamed from: b */
        final /* synthetic */ int f87749b;

        C17187d(ZOMDocument zOMDocument, int i11) {
            this.f87748a = zOMDocument;
            this.f87749b = i11;
        }

        @Override // pj0.InterfaceC24790p
        /* renamed from: a */
        public void mo91794a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f87748a.onNetworkError(this.f87749b, i11, str);
        }

        @Override // pj0.InterfaceC24790p
        public void onSuccess(String str) {
            AbstractC19074t.m100208f(str, "data");
            this.f87748a.onNetworkSuccess(this.f87749b, str);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.utils.ScriptHelperImpl$e */
    /* loaded from: classes7.dex */
    public static final class C17188e implements InterfaceC24790p {

        /* renamed from: a */
        final /* synthetic */ ZOMDocument f87750a;

        /* renamed from: b */
        final /* synthetic */ int f87751b;

        C17188e(ZOMDocument zOMDocument, int i11) {
            this.f87750a = zOMDocument;
            this.f87751b = i11;
        }

        @Override // pj0.InterfaceC24790p
        /* renamed from: a */
        public void mo91794a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            this.f87750a.onNetworkError(this.f87751b, i11, str);
        }

        @Override // pj0.InterfaceC24790p
        public void onSuccess(String str) {
            AbstractC19074t.m100208f(str, "data");
            this.f87750a.onNetworkSuccess(this.f87751b, str);
        }
    }

    private ScriptHelperImpl() {
    }

    public static final void alert(final ZOMDocument zOMDocument, Context context, byte[] bArr, byte[] bArr2, Object obj, final int i11) {
        String str;
        String str2;
        InterfaceC24796v interfaceC24796v;
        String str3;
        AbstractC19074t.m100208f(zOMDocument, "zomDocument");
        AbstractC19074t.m100208f(context, "context");
        Map map = (Map) obj;
        String str4 = null;
        if (map != null) {
            String str5 = null;
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getValue()).intValue();
                if (intValue != 1) {
                    if (intValue == 2 && (str3 = (String) entry.getKey()) != null) {
                        str5 = AbstractC28268b.m142406a(str3);
                    }
                } else {
                    String str6 = (String) entry.getKey();
                    if (str6 != null) {
                        str4 = AbstractC28268b.m142406a(str6);
                    }
                }
            }
            str = str4;
            str2 = str5;
        } else {
            str = null;
            str2 = null;
        }
        if (!mIsAlertShowing.getAndSet(true) && (interfaceC24796v = mUtilityProvider) != null) {
            interfaceC24796v.mo92054a(context, AbstractC28268b.m142407b(bArr), AbstractC28268b.m142407b(bArr2), str, new DialogInterface.OnClickListener() { // from class: com.zing.zalo.zinstant.utils.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    ScriptHelperImpl.m157961alert$lambda7(ZOMDocument.this, i11, dialogInterface, i12);
                }
            }, str2, new DialogInterface.OnClickListener() { // from class: com.zing.zalo.zinstant.utils.i
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    ScriptHelperImpl.m157962alert$lambda8(ZOMDocument.this, i11, dialogInterface, i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alert$lambda-7, reason: not valid java name */
    public static final void m157961alert$lambda7(ZOMDocument zOMDocument, int i11, DialogInterface dialogInterface, int i12) {
        AbstractC19074t.m100208f(zOMDocument, "$zomDocument");
        mIsAlertShowing.set(false);
        zOMDocument.onAlertFinish(i11, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alert$lambda-8, reason: not valid java name */
    public static final void m157962alert$lambda8(ZOMDocument zOMDocument, int i11, DialogInterface dialogInterface, int i12) {
        AbstractC19074t.m100208f(zOMDocument, "$zomDocument");
        mIsAlertShowing.set(false);
        zOMDocument.onAlertFinish(i11, 2);
    }

    private final void deleteCacheFile(String str) {
        File m128779s = C24777c.m128779s(str, DIRECTORY_JS);
        AbstractC19074t.m100207e(m128779s, "getCacheFile(filename, DIRECTORY_JS)");
        if (m128779s.exists()) {
            m128779s.delete();
        }
    }

    public static final synchronized void deleteScriptCacheFile(ExternalScriptData externalScriptData) {
        synchronized (ScriptHelperImpl.class) {
            AbstractC19074t.m100208f(externalScriptData, "script");
            ScriptHelperImpl scriptHelperImpl = INSTANCE;
            String str = externalScriptData.mChecksum;
            AbstractC19074t.m100207e(str, "script.mChecksum");
            scriptHelperImpl.deleteCacheFile(scriptHelperImpl.getScriptFileName(str, externalScriptData.mIsEncrypted));
        }
    }

    public static final void deleteValueForKey(Object obj) {
        C24848g0 c24848g0;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b != null) {
            InterfaceC24791q interfaceC24791q = mPreferences;
            if (interfaceC24791q != null) {
                interfaceC24791q.mo91655f(m142407b);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                warningPreferenceDoNotConfigure();
            }
        }
    }

    private final void downloadScript(ExternalScriptData externalScriptData, InterfaceC24778d interfaceC24778d) {
        String str = externalScriptData.mChecksum;
        AbstractC19074t.m100207e(str, "data.mChecksum");
        File m128779s = C24777c.m128779s(getScriptFileName(str, externalScriptData.mIsEncrypted), DIRECTORY_JS);
        AbstractC19074t.m100207e(m128779s, "getCacheFile(filename, DIRECTORY_JS)");
        InterfaceC24782h interfaceC24782h = mResourceDownloader;
        if (interfaceC24782h != null) {
            C24793s.m128805c().m128808f(interfaceC24782h, externalScriptData.mContent, "", 0, m128779s, interfaceC24778d);
        } else {
            interfaceC24778d.mo91793b(externalScriptData.mContent, "Resource Downloader was null!!!");
        }
    }

    public static final void downloadScripts(Object obj) {
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Array<com.zing.zalo.zinstant.zom.model.ExternalScriptData>");
        downloadScripts((ExternalScriptData[]) obj, new C17184a());
    }

    public static final void get(ZOMDocument zOMDocument, Object obj, Object obj2, Object obj3, int i11) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        Map map = (Map) obj2;
        Map map2 = (Map) obj3;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        InterfaceC24789o interfaceC24789o = networkProvider;
        ScriptHelperImpl scriptHelperImpl = INSTANCE;
        if (!scriptHelperImpl.isUrlRequestValid(m142407b)) {
            zOMDocument.onNetworkError(i11, -1, INVALID_URL);
            return;
        }
        if (!scriptHelperImpl.isNetworkConditionValid(interfaceC24789o)) {
            zOMDocument.onNetworkError(i11, -1, INVALID_NETWORK_PROVIDER);
        } else if (interfaceC24789o != null) {
            AbstractC19074t.m100205c(m142407b);
            interfaceC24789o.mo91706c(m142407b, map, map2, new C17186c(zOMDocument, i11));
        }
    }

    public static final int getAndroidVersionCode() {
        return CoreUtility.f89236l % 1000;
    }

    public static final boolean getBoolean(Object obj, boolean z11) {
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b != null) {
            InterfaceC24791q interfaceC24791q = mPreferences;
            if (interfaceC24791q != null) {
                return interfaceC24791q.mo91653d(m142407b, z11);
            }
            warningPreferenceDoNotConfigure();
            return z11;
        }
        return z11;
    }

    public static final int getDeviceHeight() {
        return AbstractC17201m.m91814f();
    }

    public static final int getDeviceWidth() {
        return AbstractC17201m.m91815g();
    }

    public static final synchronized Object getEncryptedScriptContent(Object obj) {
        byte[] m13916c;
        synchronized (ScriptHelperImpl.class) {
            String m142407b = AbstractC28268b.m142407b((byte[]) obj);
            if (m142407b != null) {
                File m128779s = C24777c.m128779s(INSTANCE.getScriptFileName(m142407b, true), DIRECTORY_JS);
                AbstractC19074t.m100207e(m128779s, "getCacheFile(filenameStr, DIRECTORY_JS)");
                if (m128779s.exists()) {
                    m13916c = AbstractC2940i.m13916c(m128779s);
                    return m13916c;
                }
            }
            return null;
        }
    }

    public static final long getLong(Object obj, long j11) {
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b != null) {
            InterfaceC24791q interfaceC24791q = mPreferences;
            if (interfaceC24791q != null) {
                return interfaceC24791q.mo91650a(m142407b, j11);
            }
            warningPreferenceDoNotConfigure();
            return j11;
        }
        return j11;
    }

    private static /* synthetic */ void getMPreferences$annotations() {
    }

    private static /* synthetic */ void getMResourceDownloader$annotations() {
    }

    private static /* synthetic */ void getMUtilityProvider$annotations() {
    }

    private static /* synthetic */ void getNetworkProvider$annotations() {
    }

    public static final synchronized String getScriptContent(Object obj) {
        String m13918e;
        synchronized (ScriptHelperImpl.class) {
            String m142407b = AbstractC28268b.m142407b((byte[]) obj);
            if (m142407b != null) {
                File m128779s = C24777c.m128779s(INSTANCE.getScriptFileName(m142407b, false), DIRECTORY_JS);
                AbstractC19074t.m100207e(m128779s, "getCacheFile(filenameStr, DIRECTORY_JS)");
                try {
                    if (m128779s.exists()) {
                        m13918e = AbstractC2940i.m13918e(m128779s, null, 1, null);
                        return AbstractC28268b.m142406a(m13918e);
                    }
                } catch (Exception e11) {
                    AbstractC17201m.m91824p(TAG, "getScriptContent Error", e11);
                    return null;
                }
            }
            return null;
        }
    }

    private final String getScriptFileName(String str, boolean z11) {
        if (z11) {
            return '1' + str;
        }
        return '0' + str;
    }

    public static final String getString(Object obj, Object obj2) {
        String str;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        String m142407b2 = AbstractC28268b.m142407b((byte[]) obj2);
        if (m142407b == null) {
            if (m142407b2 == null) {
                return "";
            }
            return m142407b2;
        }
        InterfaceC24791q interfaceC24791q = mPreferences;
        if (interfaceC24791q != null) {
            if (m142407b2 == null) {
                str = "";
            } else {
                str = m142407b2;
            }
            String mo91651b = interfaceC24791q.mo91651b(m142407b, str);
            if (mo91651b != null) {
                return mo91651b;
            }
        }
        warningPreferenceDoNotConfigure();
        if (m142407b2 == null) {
            m142407b2 = "";
        }
        return m142407b2;
    }

    public static final InterfaceC24791q getZinstantPreferencesData() {
        return mPreferences;
    }

    private final boolean isNetworkConditionValid(InterfaceC24789o interfaceC24789o) {
        return interfaceC24789o != null;
    }

    private final boolean isUrlRequestValid(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static final boolean objectExistsForKey(Object obj) {
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b == null) {
            return false;
        }
        InterfaceC24791q interfaceC24791q = mPreferences;
        if (interfaceC24791q != null) {
            return interfaceC24791q.mo91656g(m142407b);
        }
        warningPreferenceDoNotConfigure();
        return false;
    }

    public static final void onScriptError(Object obj) {
        InterfaceC24796v interfaceC24796v;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b != null && (interfaceC24796v = mUtilityProvider) != null) {
            interfaceC24796v.mo92056c(m142407b);
        }
    }

    public static final void post(ZOMDocument zOMDocument, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        Map map = (Map) obj2;
        Map map2 = (Map) obj3;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        InterfaceC24789o interfaceC24789o = networkProvider;
        ScriptHelperImpl scriptHelperImpl = INSTANCE;
        if (!scriptHelperImpl.isUrlRequestValid(m142407b)) {
            zOMDocument.onNetworkError(i11, -1, INVALID_URL);
            return;
        }
        if (!scriptHelperImpl.isNetworkConditionValid(interfaceC24789o)) {
            zOMDocument.onNetworkError(i11, -1, INVALID_NETWORK_PROVIDER);
            return;
        }
        String m142407b2 = AbstractC28268b.m142407b((byte[]) obj4);
        if (interfaceC24789o != null) {
            AbstractC19074t.m100205c(m142407b);
            interfaceC24789o.mo91704a(m142407b, map, map2, m142407b2, new C17187d(zOMDocument, i11));
        }
    }

    public static final void requestSocket(ZOMDocument zOMDocument, int i11, int i12, int i13, Object obj, int i14) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        Map map = (Map) obj;
        InterfaceC24789o interfaceC24789o = networkProvider;
        if (!INSTANCE.isNetworkConditionValid(interfaceC24789o)) {
            zOMDocument.onNetworkError(i14, -1, INVALID_NETWORK_PROVIDER);
        } else if (interfaceC24789o != null) {
            interfaceC24789o.mo91705b(i11, i12, i13, map, new C17188e(zOMDocument, i14));
        }
    }

    public static final void setBoolean(Object obj, boolean z11) {
        C24848g0 c24848g0;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b != null) {
            InterfaceC24791q interfaceC24791q = mPreferences;
            if (interfaceC24791q != null) {
                interfaceC24791q.mo91657h(m142407b, z11);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                warningPreferenceDoNotConfigure();
            }
        }
    }

    public static final void setLong(Object obj, long j11) {
        C24848g0 c24848g0;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        if (m142407b != null) {
            InterfaceC24791q interfaceC24791q = mPreferences;
            if (interfaceC24791q != null) {
                interfaceC24791q.mo91652c(m142407b, j11);
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                warningPreferenceDoNotConfigure();
            }
        }
    }

    public static final void setNetworkProvider(InterfaceC24789o interfaceC24789o) {
        networkProvider = interfaceC24789o;
    }

    public static final void setResourceDownloader(InterfaceC24782h interfaceC24782h) {
        mResourceDownloader = interfaceC24782h;
    }

    public static final void setString(Object obj, Object obj2) {
        C24848g0 c24848g0;
        String m142407b = AbstractC28268b.m142407b((byte[]) obj);
        String m142407b2 = AbstractC28268b.m142407b((byte[]) obj2);
        if (m142407b == null) {
            return;
        }
        InterfaceC24791q interfaceC24791q = mPreferences;
        if (interfaceC24791q != null) {
            if (m142407b2 == null) {
                m142407b2 = "";
            }
            interfaceC24791q.mo91654e(m142407b, m142407b2);
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            warningPreferenceDoNotConfigure();
        }
    }

    public static final void setZinstantPreferencesData(InterfaceC24791q interfaceC24791q) {
        mPreferences = interfaceC24791q;
    }

    public static final void setZinstantUtilityProvider(InterfaceC24796v interfaceC24796v) {
        mUtilityProvider = interfaceC24796v;
    }

    public static final void showToast(Object obj) {
        InterfaceC24796v interfaceC24796v = mUtilityProvider;
        if (interfaceC24796v != null) {
            interfaceC24796v.mo92055b(AbstractC28268b.m142407b((byte[]) obj));
        }
    }

    private static final void warningPreferenceDoNotConfigure() {
        byte[] bytes = "Zinstant Preferences is null. This will cause state to be corrupted.".getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "this as java.lang.String).getBytes(charset)");
        onScriptError(bytes);
    }

    public static final void downloadScripts(ExternalScriptData[] externalScriptDataArr, InterfaceC24775a interfaceC24775a) {
        AbstractC19074t.m100208f(externalScriptDataArr, "script");
        AbstractC19074t.m100208f(interfaceC24775a, "callback");
        int length = externalScriptDataArr.length;
        AtomicBoolean[] atomicBooleanArr = new AtomicBoolean[length];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            atomicBooleanArr[i12] = new AtomicBoolean(false);
        }
        int length2 = externalScriptDataArr.length;
        int i13 = 0;
        while (i11 < length2) {
            ExternalScriptData externalScriptData = externalScriptDataArr[i11];
            int i14 = i13 + 1;
            if (externalScriptData != null) {
                INSTANCE.downloadScript(externalScriptData, new C17185b(interfaceC24775a, atomicBooleanArr, i13));
            }
            i11++;
            i13 = i14;
        }
    }
}
