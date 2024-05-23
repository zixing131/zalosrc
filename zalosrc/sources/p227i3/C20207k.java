package p227i3;

import android.content.Context;
import android.os.Bundle;
import com.adtima.Adtima;
import com.adtima.feedback.ZAdsFeedbackData;
import com.adtima.feedback.ZAdsFeedbackListener;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p178g3.C19206a;
import p313l3.AbstractC22011d;
import p667y2.C30267d;

/* renamed from: i3.k */
/* loaded from: classes2.dex */
public final class C20207k {

    /* renamed from: b */
    private static final String f99895b = "k";

    /* renamed from: c */
    private static C20207k f99896c;

    /* renamed from: a */
    private Context f99897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.k$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ int f99898p;

        /* renamed from: q */
        final /* synthetic */ String f99899q;

        /* renamed from: r */
        final /* synthetic */ ZAdsFeedbackListener f99900r;

        a(int i11, String str, ZAdsFeedbackListener zAdsFeedbackListener) {
            this.f99898p = i11;
            this.f99899q = str;
            this.f99900r = zAdsFeedbackListener;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ZAdsFeedbackData doInBackground() {
            ZAdsFeedbackData zAdsFeedbackData = null;
            try {
                zAdsFeedbackData = C20207k.this.m105396a(this.f99898p, this.f99899q);
                if (zAdsFeedbackData != null) {
                    long currentTimeMillis = System.currentTimeMillis() + (zAdsFeedbackData.getExpiredInSecs() * 1000);
                    C30267d.m149339A().m149355l(zAdsFeedbackData.serialize().toString());
                    C30267d.m149339A().m149350g(currentTimeMillis);
                }
            } catch (Exception e11) {
                Adtima.m18329e(C20207k.f99895b, "doInBackground", e11);
            }
            return zAdsFeedbackData;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ZAdsFeedbackData zAdsFeedbackData) {
            try {
                ZAdsFeedbackListener zAdsFeedbackListener = this.f99900r;
                if (zAdsFeedbackListener != null) {
                    if (zAdsFeedbackData == null) {
                        zAdsFeedbackListener.onFetchFailed();
                    } else {
                        zAdsFeedbackListener.onFetchFinished(zAdsFeedbackData);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(C20207k.f99895b, "onPostExecute", e11);
            }
        }
    }

    private C20207k(Context context) {
        this.f99897a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public ZAdsFeedbackData m105396a(int i11, String str) {
        JSONObject optJSONObject;
        try {
            String packageName = this.f99897a.getPackageName();
            String m105657b = C20220x.m105656c().m105657b();
            String m105380x = C20205i.m105364t().m105380x();
            String m100794a = C19206a.m100793b().m100794a();
            String m105381y = C20205i.m105364t().m105381y();
            Bundle bundle = new Bundle();
            bundle.putString("deviceId", m105380x);
            bundle.putString("sdkVer", String.valueOf(i11));
            bundle.putString("sdkName", Adtima.SDK_VERSION_NAME);
            bundle.putString("sdkBuild", Adtima.SDK_BUILD_NUMBER);
            bundle.putString("appId", packageName);
            bundle.putString("appVer", m100794a);
            bundle.putString("zaloSdkVer", m105381y);
            bundle.putString("udata", m105657b);
            if (str == null || str.trim().length() == 0) {
                str = "0";
            }
            bundle.putString("siteId", str);
            String m105504s = C20214r.m105487b().m105504s(AbstractC20206j.m105391g(), bundle, 2);
            if (m105504s != null && m105504s.length() != 0) {
                if (!AbstractC22011d.m114918s(m105504s)) {
                    m105504s = C20217u.m105538N0().m105605m(m105504s);
                }
                JSONObject jSONObject = new JSONObject(m105504s);
                if (jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1) == 0 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    return ZAdsFeedbackData.deserialize(optJSONObject);
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99895b, "getFeedbackFromApi", e11);
        }
        return null;
    }

    /* renamed from: c */
    public static C20207k m105398c(Context context) {
        if (f99896c == null) {
            f99896c = new C20207k(context);
        }
        return f99896c;
    }

    /* renamed from: f */
    private void m105400f(int i11, String str, ZAdsFeedbackListener zAdsFeedbackListener) {
        try {
            C0009d.m11g(new a(i11, str, zAdsFeedbackListener));
        } catch (Exception e11) {
            Adtima.m18329e(f99895b, "doFetchAdsFeedbackTask", e11);
        }
    }

    /* renamed from: e */
    public void m105401e(int i11, ZAdsFeedbackListener zAdsFeedbackListener) {
        ZAdsFeedbackData zAdsFeedbackData;
        try {
            String m149354k = C30267d.m149339A().m149354k();
            if (m149354k != null) {
                Adtima.m18328e(f99895b, "Get feedback from cache");
                zAdsFeedbackData = ZAdsFeedbackData.deserialize(new JSONObject(m149354k));
            } else {
                zAdsFeedbackData = null;
            }
            boolean z11 = C30267d.m149339A().m149356m() < System.currentTimeMillis();
            String m105577I0 = C20217u.m105538N0().m105577I0();
            if (zAdsFeedbackData == null) {
                Adtima.m18328e(f99895b, "Get feedback from API");
                m105400f(i11, m105577I0, zAdsFeedbackListener);
                return;
            }
            if (zAdsFeedbackListener != null) {
                zAdsFeedbackListener.onFetchFinished(zAdsFeedbackData);
            }
            if (z11) {
                m105400f(i11, m105577I0, null);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99895b, "fetchAdsFeedback", e11);
        }
    }
}
