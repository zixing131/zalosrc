package lk0;

import android.text.TextUtils;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.utils.AbstractC17190b;
import com.zing.zalo.zinstant.utils.AbstractC17198j;
import com.zing.zalo.zinstant.utils.C17205q;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;
import pj0.C24777c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: lk0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC22506d {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final String f110150a = AbstractC22506d.class.getSimpleName();

    /* renamed from: lk0.d$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private int f110151a = -1;

        /* renamed from: b */
        private JSONObject f110152b;

        /* renamed from: a */
        public final C22504b m116363a() {
            try {
                return AbstractC22506d.Companion.m116367d(this.f110151a, this.f110152b);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104549b(e11);
                return null;
            }
        }

        /* renamed from: b */
        public final a m116364b(int i11) {
            this.f110151a = i11;
            return this;
        }

        /* renamed from: c */
        public final a m116365c(JSONObject jSONObject) {
            this.f110152b = jSONObject;
            return this;
        }
    }

    /* renamed from: lk0.d$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: lk0.d$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f110153t;

            /* renamed from: u */
            final /* synthetic */ Object f110154u;

            /* renamed from: v */
            final /* synthetic */ int f110155v;

            /* renamed from: w */
            final /* synthetic */ String f110156w;

            /* renamed from: x */
            final /* synthetic */ int f110157x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, int i11, String str, int i12, Continuation continuation) {
                super(2, continuation);
                this.f110154u = obj;
                this.f110155v = i11;
                this.f110156w = str;
                this.f110157x = i12;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f110154u, this.f110155v, this.f110156w, this.f110157x, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f110153t == 0) {
                    AbstractC24862s.m129228b(obj);
                    AbstractC22506d.Companion.m116370e(this.f110154u, this.f110155v, this.f110156w, this.f110157x);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public final C22504b m116367d(int i11, JSONObject jSONObject) {
            if (jSONObject != null) {
                C22504b c22504b = new C22504b(i11);
                c22504b.f110128b = jSONObject.optString("zinstantdata_id");
                String optString = jSONObject.optString("checksum");
                AbstractC19074t.m100207e(optString, "jsonData.optString(Keys.CHECK_SUM)");
                Locale locale = Locale.US;
                AbstractC19074t.m100207e(locale, "US");
                String lowerCase = optString.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                c22504b.f110129c = lowerCase;
                if (!TextUtils.isEmpty(c22504b.f110128b)) {
                    if (!TextUtils.isEmpty(c22504b.f110129c)) {
                        c22504b.f110135i = jSONObject.optInt("data_type");
                        c22504b.f110140n = jSONObject.optString("bundle_data");
                        int i12 = c22504b.f110135i;
                        if (i12 == 2) {
                            String optString2 = jSONObject.optString("data_url");
                            c22504b.f110130d = optString2;
                            if (TextUtils.isEmpty(optString2)) {
                                throw new ZinstantException(203, "Data url was empty");
                            }
                        } else {
                            b bVar = AbstractC22506d.Companion;
                            if (bVar.m116369c(i12)) {
                                String optString3 = jSONObject.optString("data_base64");
                                c22504b.f110136j = optString3;
                                int i13 = c22504b.f110135i;
                                String str = c22504b.f110129c;
                                AbstractC19074t.m100207e(str, "zinstantData.dataRawChecksum");
                                bVar.m116371f(optString3, i13, str, c22504b.f110131e);
                                c22504b.f110130d = null;
                            } else {
                                throw new ZinstantException(203, "Invalid data_type: " + c22504b.f110135i);
                            }
                        }
                        if (jSONObject.optJSONObject("skeleton") != null) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("skeleton");
                            String optString4 = jSONObject2.optString("cs");
                            AbstractC19074t.m100207e(optString4, "skeleton.optString(Keys.Skeleton.CHECK_SUM)");
                            AbstractC19074t.m100207e(locale, "US");
                            String lowerCase2 = optString4.toLowerCase(locale);
                            AbstractC19074t.m100207e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                            c22504b.f110137k = lowerCase2;
                            String optString5 = jSONObject2.optString("b64");
                            c22504b.f110139m = optString5;
                            c22504b.f110138l = null;
                            if (TextUtils.isEmpty(optString5)) {
                                c22504b.f110138l = jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                            } else {
                                b bVar2 = AbstractC22506d.Companion;
                                String str2 = c22504b.f110139m;
                                String str3 = c22504b.f110137k;
                                AbstractC19074t.m100207e(str3, "zinstantData.skeletonRawChecksum");
                                bVar2.m116371f(str2, 3, str3, c22504b.f110131e);
                            }
                        }
                        return c22504b;
                    }
                    throw new ZinstantException(202, "Checksum was empty");
                }
                throw new ZinstantException(201, "zinstantdata_id was empty");
            }
            throw new ZinstantException(200, "Json data was null");
        }

        /* renamed from: b */
        public final byte[] m116368b(Object obj, int i11, String str) {
            byte[] m101978a;
            AbstractC19074t.m100208f(obj, "raw");
            AbstractC19074t.m100208f(str, "checksum");
            if (i11 != 1) {
                if (i11 == 3 && (obj instanceof String)) {
                    m101978a = AbstractC17190b.m91797a(new ByteArrayInputStream(AbstractC19509c.m101978a((String) obj)));
                }
                m101978a = null;
            } else {
                if (obj instanceof String) {
                    m101978a = AbstractC19509c.m101978a((String) obj);
                }
                m101978a = null;
            }
            if (!AbstractC17198j.m91806a(m101978a, str)) {
                return null;
            }
            return m101978a;
        }

        /* renamed from: c */
        public final boolean m116369c(int i11) {
            return i11 == 1 || i11 == 2 || i11 == 3;
        }

        /* renamed from: e */
        public final boolean m116370e(Object obj, int i11, String str, int i12) {
            AbstractC19074t.m100208f(str, "rawChecksum");
            try {
                File m128777q = C24777c.m128777q(str, i12);
                if (m128777q != null && m128777q.exists()) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                byte[] m116368b = m116368b(obj, i11, str);
                if (m116368b == null) {
                    return false;
                }
                if (m128777q != null) {
                    try {
                        C17205q.f87763a.m91842e(m128777q, m116368b, str);
                    } catch (Exception unused) {
                    }
                }
                return true;
            } catch (Exception e11) {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                String str2 = AbstractC22506d.f110150a;
                AbstractC19074t.m100207e(str2, "TAG");
                aVar.m104564x(str2).mo104549b(e11);
                return false;
            }
        }

        /* renamed from: f */
        public final void m116371f(Object obj, int i11, String str, int i12) {
            AbstractC19074t.m100208f(str, "rawChecksum");
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(obj, i11, str, i12, null), 3, null);
        }
    }

    /* renamed from: b */
    public static final void m116362b(Object obj, int i11, String str, int i12) {
        Companion.m116371f(obj, i11, str, i12);
    }
}
