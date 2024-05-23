package com.zing.zalo.zinstant.zom.node;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.utils.ScriptHelperImpl;
import com.zing.zalo.zinstant.zom.meta.MetaFactoryImpl;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetadata;
import com.zing.zalo.zinstant.zom.model.ExternalScriptData;
import com.zing.zalo.zinstant.zom.profiler.ZOMDocumentEventHandler;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import ll0.C22515c;
import ll0.C22518f;
import ll0.C22520h;
import nk0.C23855s0;
import nk0.InterfaceC23809b;
import org.json.JSONException;
import org.json.JSONObject;
import p648xk.C29689e;
import p648xk.InterfaceC29690f;
import pj0.C24784j;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24786l;
import pj0.InterfaceC24787m;
import pj0.InterfaceC24794t;
import tk0.C26730b;
import vj0.AbstractC28268b;
import vj0.C28273g;

/* loaded from: classes7.dex */
public class ZOMDocument implements InterfaceC20578a0 {
    private static final String TAG = "ZOMDocument";
    public ConcurrentHashMap<String, ZOMKeyframes> keyframesData;
    public ZOMExternalScriptDataArray mExternalScript;
    public ZOMFontFace mFontFace;
    public ZOMGlobalConfig mGlobalConfig;
    private String mIdentifyKey;
    public ZOMKeyframes[] mKeyframes;
    public String mLocale;
    public ZOMMeta[] mMetas;
    private transient String mPreferredZinstantDataId;
    public String mZINSDataExtras;
    public int mZINSVersion;
    public int mZINSVersionMinor;
    public ZOM mZOMRoot;
    public String mZinscVersion;
    public String mZinstantDataId;
    public ZinstantMetadata mZinstantMetadata;
    private transient String originalId;
    public float mDensity = 1.0f;
    public float mScaledDensity = 1.0f;

    @Deprecated
    public long mContentTime = 0;

    @Deprecated
    public int mVersion = 0;
    public float mFontSizeRatio = 1.0f;
    public int mCurrentFont = 0;
    private transient String mDelegateID = null;
    protected transient JSONObject mDataExtrasJson = null;
    public long mNativePointer = 0;
    private boolean mNewData = true;
    public int theme = 1;
    public boolean mHasScript = false;
    public HashMap<Integer, String> mPermissions = null;
    public int mPermissionVersion = 0;
    public int mTargetWidth = 0;
    public int mTargetHeight = 0;
    public String mChecksum = "";
    public WeakReference<InterfaceC23809b> mOwnerRoot = new WeakReference<>(null);
    private boolean mNeedRequestResources = false;
    private boolean mIsAlready = false;
    public int mAttention = 0;
    private final transient C22518f mExecutor = new C22518f();
    private C26730b mPermissionChecker = null;
    public String mBundleData = null;
    private final transient Runnable runnableSendTriggerScriptNative = new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.k
        public /* synthetic */ RunnableC17265k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ZOMDocument.this.lambda$new$2();
        }
    };

    public static void addPermission(Object obj, int i11, byte[] bArr) {
        ((HashMap) obj).put(Integer.valueOf(i11), AbstractC28268b.m142407b(bArr));
    }

    public static ZOMDocument createFromSerialized(InterfaceC29690f interfaceC29690f) {
        try {
            ZOMDocument zOMDocument = new ZOMDocument();
            ZOMDocument__Zarcel.createFromSerialized(zOMDocument, interfaceC29690f);
            zOMDocument.mDataExtrasJson = parseDataExtras(zOMDocument.mZINSDataExtras);
            zOMDocument.mPermissionChecker = C26730b.m137483d(zOMDocument.mPermissions, zOMDocument.mPermissionVersion);
            zOMDocument.mZinstantMetadata = parseZinstantMeta(zOMDocument);
            return zOMDocument;
        } catch (Exception e11) {
            AbstractC17201m.m91824p(TAG, "Deserialize Error", e11);
            return null;
        }
    }

    public static Object createPermissions() {
        return new HashMap();
    }

    private ConcurrentHashMap<String, ZOMKeyframes> generateKeyframesData() {
        ConcurrentHashMap<String, ZOMKeyframes> concurrentHashMap = new ConcurrentHashMap<>();
        for (ZOMKeyframes zOMKeyframes : this.mKeyframes) {
            concurrentHashMap.put(zOMKeyframes.mName, zOMKeyframes.sortIfNeeded());
        }
        return concurrentHashMap;
    }

    private InterfaceC24786l getAttentionListener() {
        InterfaceC24794t rootTreeHandler = getRootTreeHandler();
        if (rootTreeHandler != null) {
            return rootTreeHandler.mo92018a();
        }
        return null;
    }

    private InterfaceC24787m getExternalScriptListener() {
        InterfaceC24794t rootTreeHandler = getRootTreeHandler();
        if (rootTreeHandler != null) {
            return rootTreeHandler.mo92019b();
        }
        return null;
    }

    private InterfaceC24794t getRootTreeHandler() {
        InterfaceC23809b interfaceC23809b = this.mOwnerRoot.get();
        if (interfaceC23809b != null) {
            return interfaceC23809b.mo124400h();
        }
        return null;
    }

    public /* synthetic */ void lambda$onAlertFinish$13(int i11, int i12) {
        __ZOMDocument_zjni.onAlertFinish(this, i11, i12);
    }

    public /* synthetic */ void lambda$onAttach$3() {
        __ZOMDocument_zjni.onAttach(this);
    }

    public /* synthetic */ void lambda$onDetach$4() {
        __ZOMDocument_zjni.onDetach(this);
    }

    public /* synthetic */ void lambda$onFirstViewDrawn$6() {
        __ZOMDocument_zjni.onFirstViewDrawn(this);
    }

    public /* synthetic */ void lambda$onNetworkError$12(String str, int i11, int i12) {
        __ZOMDocument_zjni.onNetworkError(this, i11, i12, AbstractC28268b.m142406a(str));
    }

    public /* synthetic */ void lambda$onNetworkSuccess$11(String str, int i11) {
        __ZOMDocument_zjni.onNetworkSuccess(this, i11, AbstractC28268b.m142406a(str));
    }

    public /* synthetic */ void lambda$onPlatformReady$9() {
        __ZOMDocument_zjni.onPlatformReady(this);
    }

    public /* synthetic */ void lambda$onProcessActionComplete$14(int i11, String str) {
        __ZOMDocument_zjni.onProcessActionComplete(this, i11, str);
    }

    public /* synthetic */ void lambda$onRequestResourcesCompleted$8(InterfaceC24775a interfaceC24775a) {
        if (onRequestResourcesCompleted()) {
            interfaceC24775a.onSuccess(null);
        } else {
            interfaceC24775a.mo15338c(new Exception("Resolved native resources error."));
        }
    }

    public /* synthetic */ void lambda$onScrollStateChanged$10(int i11) {
        __ZOMDocument_zjni.onScrollStateChanged(this, i11);
    }

    public /* synthetic */ void lambda$onUpdateData$0() {
        this.mZOMRoot.prepareSyncUI();
    }

    public /* synthetic */ void lambda$onUpdateData$1() {
        this.mZOMRoot.syncUI();
    }

    public /* synthetic */ void lambda$performExternalAction$5(String str, String str2) {
        onPerformExternalAction(AbstractC28268b.m142406a(str), AbstractC28268b.m142406a(str2));
    }

    private void onPerformExternalAction(String str, String str2) {
        __ZOMDocument_zjni.onPerformExternalAction(this, str, str2);
    }

    private void onUpdateData() {
        ZOMDocumentEventHandler.prepareLayout(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.r
            public /* synthetic */ RunnableC17272r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onUpdateData$0();
            }
        });
        ZOMDocumentEventHandler.syncLayout(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.s
            public /* synthetic */ RunnableC17273s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onUpdateData$1();
            }
        });
        InterfaceC24794t rootTreeHandler = getRootTreeHandler();
        if (rootTreeHandler != null) {
            rootTreeHandler.mo92020c();
        }
    }

    private static JSONObject parseDataExtras(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static ZinstantMetadata parseZinstantMeta(ZOMDocument zOMDocument) {
        return new ZinstantMetadata(zOMDocument.mMetas, zOMDocument.mHasScript, new MetaFactoryImpl());
    }

    /* renamed from: performScriptAction */
    public void lambda$performScriptActionDelegate$7(long j11, long j12, int i11, long j13) {
        __ZOMDocument_zjni.performScriptAction(this, j11, j12, i11, j13);
    }

    private static void resetNativeObject(long j11) {
        __ZOMDocument_zjni.resetNativeObject(j11);
    }

    /* renamed from: triggerScriptTimer */
    public void lambda$new$2() {
        __ZOMDocument_zjni.triggerScriptTimer(this);
    }

    public boolean allowReuse() {
        return this.mZinstantMetadata.isAllowReuse();
    }

    public boolean cachingState() {
        return this.mNativePointer != 0;
    }

    protected boolean checkBundleData(String str) {
        if (TextUtils.isEmpty(this.mBundleData) && TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.equals(this.mBundleData, str);
    }

    protected boolean checkIntegrity(int i11, int i12, String str, int i13, InterfaceC17139d interfaceC17139d) {
        if (this.mZOMRoot != null && this.mTargetWidth == i11 && this.mTargetHeight == i12 && checkIntegrityFontFace()) {
            return (interfaceC17139d == null || this.mZOMRoot.checkIntegrity(interfaceC17139d, getPermissionChecker())) && checkIntegrityEnvLocal() && TextUtils.equals(this.mLocale, str) && i13 == this.theme;
        }
        return false;
    }

    protected boolean checkIntegrityEnvLocal() {
        float m91813e = AbstractC17201m.m91813e();
        float m91817i = AbstractC17201m.m91817i();
        if (this.mDensity == m91813e && this.mScaledDensity == m91817i && this.mFontSizeRatio == C28273g.m142438h() && this.mCurrentFont == C28273g.m142437g()) {
            return true;
        }
        return false;
    }

    public boolean checkIntegrityFontFace() {
        ZOMFontFace zOMFontFace = this.mFontFace;
        if (zOMFontFace != null && zOMFontFace.needInvalidate()) {
            return false;
        }
        return true;
    }

    @Override // ik0.InterfaceC20578a0
    public String checksum() {
        return this.mChecksum;
    }

    protected void finalize() throws Throwable {
        resetNativeObject();
        super.finalize();
    }

    public String getDelegateID() {
        if (this.mDelegateID == null) {
            String zinstantDataId = getZinstantDataId();
            JSONObject jSONObject = this.mDataExtrasJson;
            try {
                if (jSONObject != null) {
                    try {
                        zinstantDataId = jSONObject.getString("originalZinstantDataId");
                        this.originalId = zinstantDataId;
                    } catch (JSONException unused) {
                        zinstantDataId = getZinstantDataId();
                    }
                }
                if (this.mDelegateID == null) {
                    this.mDelegateID = getZinstantDataId();
                }
            } finally {
                this.mDelegateID = zinstantDataId;
            }
        }
        return this.mDelegateID;
    }

    @Override // ik0.InterfaceC20578a0
    public int getHeight() {
        ZOM zom = this.mZOMRoot;
        if (zom != null) {
            return zom.mHeight;
        }
        return 0;
    }

    public ZOMKeyframes getKeyframes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.keyframesData == null) {
            this.keyframesData = generateKeyframesData();
        }
        return this.keyframesData.get(str);
    }

    public String getOriginalId() {
        if (this.originalId == null) {
            try {
                JSONObject jSONObject = this.mDataExtrasJson;
                if (jSONObject != null && jSONObject.has("originalZinstantDataId")) {
                    this.originalId = this.mDataExtrasJson.getString("originalZinstantDataId");
                }
            } catch (Exception unused) {
            }
            if (this.originalId == null) {
                this.originalId = getZinstantDataId();
            }
        }
        return this.originalId;
    }

    public C26730b getPermissionChecker() {
        return this.mPermissionChecker;
    }

    public int getWidth() {
        ZOM zom = this.mZOMRoot;
        if (zom != null) {
            return zom.mWidth;
        }
        return 0;
    }

    @Override // ik0.InterfaceC20578a0
    public String getZinstantDataId() {
        if (!TextUtils.isEmpty(this.mPreferredZinstantDataId)) {
            return this.mPreferredZinstantDataId;
        }
        return this.mZinstantDataId;
    }

    @Override // ik0.InterfaceC20578a0
    public String identifyKey() {
        return this.mIdentifyKey;
    }

    public boolean isRequireResources() {
        if (this.mNativePointer != 0) {
            return this.mNeedRequestResources;
        }
        ZOMFontFace zOMFontFace = this.mFontFace;
        if (zOMFontFace != null) {
            return zOMFontFace.needPreload();
        }
        return false;
    }

    public boolean isSame(InterfaceC20578a0 interfaceC20578a0) {
        if (interfaceC20578a0 instanceof C23855s0) {
            if (((C23855s0) interfaceC20578a0).f115178b == this) {
                return true;
            }
            return false;
        }
        if ((interfaceC20578a0 instanceof ZOMDocument) && interfaceC20578a0 == this) {
            return true;
        }
        return false;
    }

    public boolean isStrongCache() {
        return this.mZinstantMetadata.isStrongRef();
    }

    public boolean isTrackingLayout() {
        JSONObject jSONObject = this.mDataExtrasJson;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("enableTrackingLayoutSuccess", false);
    }

    public void onAlertFinish(int i11, int i12) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.i

            /* renamed from: q */
            public final /* synthetic */ int f87964q;

            /* renamed from: r */
            public final /* synthetic */ int f87965r;

            public /* synthetic */ RunnableC17263i(int i112, int i122) {
                r2 = i112;
                r3 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onAlertFinish$13(r2, r3);
            }
        });
    }

    public void onAttach() {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.q
            public /* synthetic */ RunnableC17271q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onAttach$3();
            }
        });
    }

    public void onDetach() {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.l
            public /* synthetic */ RunnableC17266l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onDetach$4();
            }
        });
    }

    public void onFirstViewDrawn() {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.p
            public /* synthetic */ RunnableC17270p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onFirstViewDrawn$6();
            }
        });
    }

    public void onHideLoading() {
        InterfaceC24787m externalScriptListener = getExternalScriptListener();
        if (externalScriptListener != null) {
            externalScriptListener.mo87253b();
        }
    }

    public void onNetworkError(int i11, int i12, String str) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.w

            /* renamed from: q */
            public final /* synthetic */ String f87992q;

            /* renamed from: r */
            public final /* synthetic */ int f87993r;

            /* renamed from: s */
            public final /* synthetic */ int f87994s;

            public /* synthetic */ RunnableC17277w(String str2, int i112, int i122) {
                r2 = str2;
                r3 = i112;
                r4 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onNetworkError$12(r2, r3, r4);
            }
        });
    }

    public void onNetworkSuccess(int i11, String str) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.o

            /* renamed from: q */
            public final /* synthetic */ String f87977q;

            /* renamed from: r */
            public final /* synthetic */ int f87978r;

            public /* synthetic */ RunnableC17269o(String str2, int i112) {
                r2 = str2;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onNetworkSuccess$11(r2, r3);
            }
        });
    }

    public void onPlatformReady() {
        if (this.mIsAlready) {
            return;
        }
        this.mIsAlready = true;
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.v
            public /* synthetic */ RunnableC17276v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onPlatformReady$9();
            }
        });
    }

    public void onProcessAction(byte[] bArr, byte[] bArr2, boolean z11, int i11) {
        C24784j c24784j;
        InterfaceC24787m externalScriptListener = getExternalScriptListener();
        if (externalScriptListener != null) {
            String m142407b = AbstractC28268b.m142407b(bArr);
            String m142407b2 = AbstractC28268b.m142407b(bArr2);
            if (i11 < 0) {
                c24784j = null;
            } else {
                c24784j = new C24784j(this, i11);
            }
            externalScriptListener.mo61862a(m142407b, m142407b2, z11, c24784j);
        }
    }

    public void onProcessActionComplete(int i11, String str) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.m

            /* renamed from: q */
            public final /* synthetic */ int f87972q;

            /* renamed from: r */
            public final /* synthetic */ String f87973r;

            public /* synthetic */ RunnableC17267m(int i112, String str2) {
                r2 = i112;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onProcessActionComplete$14(r2, r3);
            }
        });
    }

    public void onRequestResourcesCompleted(InterfaceC24775a interfaceC24775a) {
        if (this.mNativePointer != 0) {
            queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.n

                /* renamed from: q */
                public final /* synthetic */ InterfaceC24775a f87975q;

                public /* synthetic */ RunnableC17268n(InterfaceC24775a interfaceC24775a2) {
                    r2 = interfaceC24775a2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZOMDocument.this.lambda$onRequestResourcesCompleted$8(r2);
                }
            });
            return;
        }
        ZOMFontFace zOMFontFace = this.mFontFace;
        if (zOMFontFace != null) {
            zOMFontFace.preloadFontSuccess();
        }
        interfaceC24775a2.onSuccess(null);
    }

    public void onScrollStateChanged(int i11) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.u

            /* renamed from: q */
            public final /* synthetic */ int f87989q;

            public /* synthetic */ RunnableC17275u(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$onScrollStateChanged$10(r2);
            }
        });
    }

    public void onShowAlert(byte[] bArr, byte[] bArr2, Object obj, int i11) {
        Context mo92016c;
        InterfaceC24787m externalScriptListener = getExternalScriptListener();
        if (externalScriptListener != null && (mo92016c = externalScriptListener.mo92016c()) != null) {
            ScriptHelperImpl.alert(this, mo92016c, bArr, bArr2, obj, i11);
        }
    }

    public void onShowLoading() {
        InterfaceC24787m externalScriptListener = getExternalScriptListener();
        if (externalScriptListener != null) {
            externalScriptListener.mo87252W2();
        }
    }

    public void performExternalAction(String str, String str2) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.j

            /* renamed from: q */
            public final /* synthetic */ String f87967q;

            /* renamed from: r */
            public final /* synthetic */ String f87968r;

            public /* synthetic */ RunnableC17264j(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$performExternalAction$5(r2, r3);
            }
        });
    }

    public void performScriptActionDelegate(long j11, long j12, int i11, long j13) {
        queueNativeTask(new Runnable() { // from class: com.zing.zalo.zinstant.zom.node.t

            /* renamed from: q */
            public final /* synthetic */ long f87984q;

            /* renamed from: r */
            public final /* synthetic */ long f87985r;

            /* renamed from: s */
            public final /* synthetic */ int f87986s;

            /* renamed from: t */
            public final /* synthetic */ long f87987t;

            public /* synthetic */ RunnableC17274t(long j112, long j122, int i112, long j132) {
                r2 = j112;
                r4 = j122;
                r6 = i112;
                r7 = j132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZOMDocument.this.lambda$performScriptActionDelegate$7(r2, r4, r6, r7);
            }
        });
    }

    public void queueNativeTask(Runnable runnable) {
        C22515c.m116418a(this.mExecutor, new C22520h(runnable));
    }

    public void queueNativeTaskDelayedTime(Runnable runnable, long j11, Object obj, boolean z11) {
        C22520h c22520h = new C22520h(runnable);
        c22520h.m116469g(obj);
        c22520h.m116471i(z11);
        c22520h.m116468f(j11);
        C22515c.m116418a(this.mExecutor, c22520h);
    }

    public void sendDelayedTriggerScriptMessage(long j11) {
        queueNativeTaskDelayedTime(this.runnableSendTriggerScriptNative, j11, null, true);
    }

    public void setAttention(int i11) {
        if (this.mAttention == i11) {
            return;
        }
        this.mAttention = i11;
        InterfaceC24786l attentionListener = getAttentionListener();
        if (attentionListener != null) {
            attentionListener.mo92017a(this.mAttention);
        }
    }

    public void setData(byte[] bArr, int i11, ZOM zom, int i12, byte[] bArr2, byte[] bArr3, byte[] bArr4, ZOMGlobalConfig zOMGlobalConfig, Object[] objArr, ZOMFontFace zOMFontFace, boolean z11, Object[] objArr2, Object[] objArr3, boolean z12, int i13, int i14, Object obj, int i15, float f11, float f12, int i16, int i17, float f13, int i18, byte[] bArr5, byte[] bArr6) {
        this.mLocale = AbstractC28268b.m142407b(bArr);
        this.mZINSVersion = i11;
        this.mZOMRoot = zom;
        this.mZINSVersionMinor = i12;
        this.mZinstantDataId = AbstractC28268b.m142407b(bArr2);
        this.mZINSDataExtras = AbstractC28268b.m142407b(bArr3);
        this.mZinscVersion = AbstractC28268b.m142407b(bArr4);
        this.mGlobalConfig = zOMGlobalConfig;
        this.mMetas = (ZOMMeta[]) objArr;
        this.mFontFace = zOMFontFace;
        this.mHasScript = z11;
        this.mKeyframes = (ZOMKeyframes[]) objArr2;
        this.mExternalScript = ZOMExternalScriptDataArray.create((ExternalScriptData[]) objArr3);
        this.mNeedRequestResources = z12;
        this.mAttention = i13;
        this.theme = i14;
        this.mPermissions = (HashMap) obj;
        this.mPermissionVersion = i15;
        this.mDataExtrasJson = parseDataExtras(this.mZINSDataExtras);
        this.mPermissionChecker = C26730b.m137483d(this.mPermissions, this.mPermissionVersion);
        this.mDensity = f11;
        this.mScaledDensity = f12;
        this.mTargetWidth = i16;
        this.mTargetHeight = i17;
        this.mFontSizeRatio = f13;
        this.mCurrentFont = i18;
        this.mBundleData = AbstractC28268b.m142407b(bArr5);
        this.mChecksum = AbstractC28268b.m142407b(bArr6);
        this.mZinstantMetadata = parseZinstantMeta(this);
    }

    public void setIdentifyKey(String str) {
        this.mIdentifyKey = str;
    }

    public void setNativePointer(long j11) {
        this.mNativePointer = j11;
    }

    public void setOwnerRoot(InterfaceC23809b interfaceC23809b) {
        if (this.mOwnerRoot.get() != interfaceC23809b) {
            this.mOwnerRoot = new WeakReference<>(interfaceC23809b);
        }
    }

    public void setPreferredZinstantDataId(String str) {
        this.mPreferredZinstantDataId = str;
    }

    public byte[] toByteArray() {
        C29689e c29689e;
        try {
            c29689e = new C29689e();
            try {
                ZOMDocument__Zarcel.serialize(this, c29689e);
                byte[] m147682j = c29689e.m147682j();
                c29689e.m147681h();
                return m147682j;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                if (c29689e == null) {
                    return null;
                }
                c29689e.m147681h();
                return null;
            }
        } catch (Exception e12) {
            e = e12;
            c29689e = null;
        }
    }

    public String toString() {
        return this.mZINSVersion + this.mZinstantDataId + this.mDensity + this.mScaledDensity + this.mZOMRoot.toString();
    }

    public int type() {
        return this.mZOMRoot.mType;
    }

    public void updateData(byte[] bArr, ZOMGlobalConfig zOMGlobalConfig, int i11, boolean z11, int i12, float f11, float f12, int i13, int i14, float f13, int i15, byte[] bArr2) {
        this.mNewData = true;
        this.mLocale = AbstractC28268b.m142407b(bArr);
        this.theme = i12;
        this.mGlobalConfig = zOMGlobalConfig;
        setAttention(i11);
        this.mNeedRequestResources = z11;
        this.mDensity = f11;
        this.mScaledDensity = f12;
        this.mTargetWidth = i13;
        this.mTargetHeight = i14;
        this.mFontSizeRatio = f13;
        this.mCurrentFont = i15;
        this.mBundleData = AbstractC28268b.m142407b(bArr2);
        onUpdateData();
    }

    public void resetNativeObject() {
        AbstractC20110a.m104535d("Reset ZOMDocument at native with pointer=%d", Long.valueOf(this.mNativePointer));
        if (this.mNativePointer != 0) {
            this.mNativePointer = 0L;
            resetNativeObject(0L);
        }
    }

    public void queueNativeTask(Runnable runnable, Object obj, boolean z11) {
        C22520h c22520h = new C22520h(runnable);
        c22520h.m116469g(obj);
        c22520h.m116471i(z11);
        C22515c.m116418a(this.mExecutor, c22520h);
    }

    private boolean onRequestResourcesCompleted() {
        return __ZOMDocument_zjni.onRequestResourcesCompleted(this);
    }

    @Override // ik0.InterfaceC20578a0
    public boolean checkIntegrity(int i11, int i12, String str, int i13, InterfaceC17139d interfaceC17139d, String str2) {
        return checkBundleData(str2) && checkIntegrity(i11, i12, str, i13, interfaceC17139d);
    }

    public void queueNativeTaskDelayedTime(Runnable runnable, long j11, int i11, Object obj, boolean z11) {
        C22520h c22520h = new C22520h(runnable);
        c22520h.m116469g(obj);
        c22520h.m116471i(z11);
        c22520h.m116468f(j11);
        c22520h.m116470h(i11);
        C22515c.m116418a(this.mExecutor, c22520h);
    }

    public void queueNativeTask(Runnable runnable, int i11, Object obj, boolean z11) {
        C22520h c22520h = new C22520h(runnable);
        c22520h.m116469g(obj);
        c22520h.m116471i(z11);
        c22520h.m116470h(i11);
        C22515c.m116418a(this.mExecutor, c22520h);
    }
}
